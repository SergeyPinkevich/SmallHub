package com.innopolis.sergeypinkevich.domain.di

import android.annotation.SuppressLint
import android.content.Context
import com.innopolis.sergeypinkevich.domain.di.component.holder.ApplicationComponentHolder

/**
 * @author Sergey Pinkevich
 */
@SuppressLint("StaticFieldLeak")
object DI {

    val app: ApplicationComponentHolder by lazy { ApplicationComponentHolder(context) }

    private lateinit var context: Context

    fun init(context: Context) {
        this.context = context
    }
}