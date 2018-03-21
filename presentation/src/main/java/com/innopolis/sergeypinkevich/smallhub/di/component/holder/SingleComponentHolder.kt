package com.innopolis.sergeypinkevich.domain.di.component.holder

/**
 * @author Sergey Pinkevich
 */
abstract class SingleComponentHolder<in ParentComponent, out Component>(
        private val parentComponentHolder: ComponentHolder<ParentComponent>
) : ComponentHolder<Component> {

    private var pair: Pair<Component, Int>? = null

    protected abstract fun provideInternal(parentComponent: ParentComponent): Component

    @Synchronized
    override fun provideComponent(): Component {
        val localPair = pair
        val component: Component
        if (localPair == null) {
            component = provideInternal(parentComponentHolder.provideComponent())
            pair = Pair(component, 1)
        } else {
            component = localPair.first
            pair = Pair(component, localPair.second + 1)
        }
        return component
    }

    @Synchronized
    override fun onDependencyReleased() {
        val localPair = pair
        localPair?.let {
            if (localPair.second == 1) {
                destroyComponent()
            } else {
                pair = Pair(localPair.first, localPair.second - 1)
            }
        }
    }

    @Synchronized
    fun destroyComponent() {
        pair = null
        onComponentDestroyed()
        parentComponentHolder.onDependencyReleased()
    }

    @Suppress("MemberVisibilityCanPrivate")
    protected open fun onComponentDestroyed() {
    }
}