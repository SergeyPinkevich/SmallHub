package com.innopolis.sergeypinkevich.domain.di.component.holder

import android.content.Context
import com.innopolis.sergeypinkevich.domain.di.component.ApplicationComponent

/**
 * @author Sergey Pinkevich
 */
class ApplicationComponentHolder(
        private val context: Context
) : RootComponentHolder<ApplicationComponent>() {

    val gitHubComponent by lazy { GitHubComponentHolder(this) }

    override fun provideInternal(): ApplicationComponent {
        return DaggerApplicationComponent
                .builder()
                .context(context)
                .build()
    }
}