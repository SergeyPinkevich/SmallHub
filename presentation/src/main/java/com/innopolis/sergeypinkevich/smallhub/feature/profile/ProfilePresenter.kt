package com.innopolis.sergeypinkevich.domain.feature.profile

import com.arellomobile.mvp.InjectViewState
import com.innopolis.sergeypinkevich.domain.di.DI
import com.innopolis.sergeypinkevich.domain.model.UserInfo
import com.innopolis.sergeypinkevich.domain.usecase.UserInfoUseCase
import com.innopolis.sergeypinkevich.domain.utils.BasePresenter
import timber.log.Timber
import javax.inject.Inject

/**
 * @author Sergey Pinkevich
 */
@InjectViewState
class ProfilePresenter @Inject constructor(private val userInfoUseCase: UserInfoUseCase) : BasePresenter<ProfileView>() {

    companion object {
        private const val TAG = "ProfilePresenter"
    }

    init {
        safeSubscribe {
            userInfoUseCase.getUserInfo()
                    .subscribe(this::showUserInfo, this::logError)
        }
    }

    override fun onDestroy() {
        DI.app.gitHubComponent.onDependencyReleased()
        super.onDestroy()
    }

    private fun showUserInfo(userInfo: UserInfo) {
        viewState.showUserImage(userInfo.image)
        viewState.showUserName(userInfo.name)
        viewState.showUserEmail(userInfo.email)
        viewState.showUserLocation(userInfo.location)
        viewState.showUserBio(userInfo.bio)
    }

    private fun logError(throwable: Throwable) {
        Timber.tag(TAG).e(throwable)
    }
}