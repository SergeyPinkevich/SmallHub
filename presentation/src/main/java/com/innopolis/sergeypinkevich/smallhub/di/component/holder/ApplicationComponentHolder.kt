package com.innopolis.sergeypinkevich.domain.di.component.holder

import android.content.Context
import com.innopolis.sergeypinkevich.domain.di.component.ApplicationComponent
import com.innopolis.sergeypinkevich.smallhub.di.component.holder.LoginComponentHolder

/**
 * @author Sergey Pinkevich
 */
class ApplicationComponentHolder(private val context: Context)
    : RootComponentHolder<ApplicationComponent>() {

    val gitHubComponent by lazy { GitHubComponentHolder(this) }

    val loginComponent by lazy { LoginComponentHolder(this) }

    override fun provideInternal(): ApplicationComponent {
        return DaggerApplicationComponent
                .builder()
                .context(context)
                .build()
    }
}