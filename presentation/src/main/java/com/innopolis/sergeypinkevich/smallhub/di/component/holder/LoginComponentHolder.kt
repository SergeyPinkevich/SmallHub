package com.innopolis.sergeypinkevich.smallhub.di.component.holder

import com.innopolis.sergeypinkevich.domain.di.component.ApplicationComponent
import com.innopolis.sergeypinkevich.domain.di.component.holder.ApplicationComponentHolder
import com.innopolis.sergeypinkevich.domain.di.component.holder.SingleComponentHolder
import com.innopolis.sergeypinkevich.smallhub.di.component.LoginComponent

/**
 * @author Sergey Pinkevich
 */
class LoginComponentHolder(applicationComponentHolder: ApplicationComponentHolder)
    : SingleComponentHolder<ApplicationComponent, LoginComponent>(applicationComponentHolder) {

    override fun provideInternal(parentComponent: ApplicationComponent): LoginComponent {
        return parentComponent
                .loginComponentHolder()
                .build()
    }
}