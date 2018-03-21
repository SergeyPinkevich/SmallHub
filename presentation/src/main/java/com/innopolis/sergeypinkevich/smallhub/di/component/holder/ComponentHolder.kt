package com.innopolis.sergeypinkevich.domain.di.component.holder

/**
 * @author Sergey Pinkevich
 */
interface ComponentHolder<out Component> {

    fun provideComponent(): Component

    fun onDependencyReleased()
}