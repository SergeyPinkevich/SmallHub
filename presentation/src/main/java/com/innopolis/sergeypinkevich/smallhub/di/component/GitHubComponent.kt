package com.innopolis.sergeypinkevich.domain.di.component

import com.innopolis.sergeypinkevich.domain.feature.profile.ProfilePresenter
import dagger.Subcomponent

/**
 * @author Sergey Pinkevich
 */
@Subcomponent
interface GitHubComponent {

    fun inject(presenter: ProfilePresenter)

    @Subcomponent.Builder
    interface Builder {

        fun build(): GitHubComponent
    }
}