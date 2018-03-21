package com.innopolis.sergeypinkevich.domain.feature.profile

import com.arellomobile.mvp.MvpView

/**
 * @author Sergey Pinkevich
 */
interface ProfileView : MvpView {

    fun showUserImage(imagePath: String)

    fun showUserName(name: String)

    fun showUserEmail(email: String)

    fun showUserLocation(location: String)

    fun showUserBio(bio: String)
}