package com.innopolis.sergeypinkevich.smallhub.di.component

import com.innopolis.sergeypinkevich.domain.di.component.GitHubComponent
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