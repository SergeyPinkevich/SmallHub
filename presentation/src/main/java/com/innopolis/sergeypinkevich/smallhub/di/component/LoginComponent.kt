package com.innopolis.sergeypinkevich.smallhub.di.component

import dagger.Subcomponent

/**
 * @author Sergey Pinkevich
 */
@Subcomponent
interface LoginComponent {

    @Subcomponent.Builder
    interface Builder {

        fun build(): LoginComponent
    }
}