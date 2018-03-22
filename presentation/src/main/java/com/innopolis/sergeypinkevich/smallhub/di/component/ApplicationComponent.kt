package com.innopolis.sergeypinkevich.domain.di.component

import android.content.Context
import com.innopolis.sergeypinkevich.smallhub.di.component.LoginComponent
import com.innopolis.sergeypinkevich.smallhub.di.scope.ApplicationScope
import dagger.BindsInstance
import dagger.Component

/**
 * @author Sergey Pinkevich
 */
@ApplicationScope
@Component
interface ApplicationComponent {

    fun gitHubComponentHolder(): GitHubComponent.Builder

    fun loginComponentHolder(): LoginComponent.Builder

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(@ApplicationScope context: Context): Builder

        fun build(): ApplicationComponent
    }
}