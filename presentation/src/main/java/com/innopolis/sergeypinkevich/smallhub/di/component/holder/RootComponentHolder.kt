package com.innopolis.sergeypinkevich.domain.di.component.holder

/**
 * @author Sergey Pinkevich
 */
abstract class RootComponentHolder<out Component> : ComponentHolder<Component> {

    protected abstract fun provideInternal(): Component

    @Volatile
    private var pair: Pair<Component, Int>? = null

    override fun provideComponent(): Component {
        synchronized(this) {
            val localPair = pair
            val component: Component
            if (localPair == null) {
                component = provideInternal()
                pair = Pair(component, 1)
            } else {
                component = localPair.first
                pair = Pair(component, localPair.second + 1)
            }
            return component
        }
    }

    override fun onDependencyReleased() {
        synchronized(this) {
            val localPair = pair
            localPair?.let {
                if (localPair.second == 1) {
                    pair = null
                    onComponentDestroyed()
                } else {
                    pair = Pair(localPair.first, localPair.second - 1)
                }
            }
        }
    }

    fun destroyComponent() {
        synchronized(this) {
            pair = null
            onComponentDestroyed()
        }
    }

    @Suppress("MemberVisibilityCanPrivate")
    protected open fun onComponentDestroyed() {
    }
}