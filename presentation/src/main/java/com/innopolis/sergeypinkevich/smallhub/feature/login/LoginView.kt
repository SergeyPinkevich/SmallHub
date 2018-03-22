package com.innopolis.sergeypinkevich.smallhub.feature.login

import com.arellomobile.mvp.MvpView

/**
 * @author Sergey Pinkevich
 */
interface LoginView : MvpView {

    fun showProgress()

    fun hideProgress()
}