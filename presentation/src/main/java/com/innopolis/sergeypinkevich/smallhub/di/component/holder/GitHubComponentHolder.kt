package com.innopolis.sergeypinkevich.domain.di.component.holder

import com.innopolis.sergeypinkevich.domain.di.component.ApplicationComponent
import com.innopolis.sergeypinkevich.domain.di.component.GitHubComponent

/**
 * @author Sergey Pinkevich
 */
class GitHubComponentHolder(
        applicationComponentHolder: ApplicationComponentHolder
) : SingleComponentHolder<ApplicationComponent, GitHubComponent>(applicationComponentHolder) {

    override fun provideInternal(parentComponent: ApplicationComponent): GitHubComponent {
        return parentComponent
                .gitHubComponentHolder()
                .build()
    }
}