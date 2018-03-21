package com.innopolis.sergeypinkevich.domain.di.component

import com.innopolis.sergeypinkevich.domain.feature.profile.ProfilePresenter
import dagger.Component

/**
 * @author Sergey Pinkevich
 */
@Component
interface GitHubComponent {

    fun inject(presenter: ProfilePresenter)
}