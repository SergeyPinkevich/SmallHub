package com.innopolis.sergeypinkevich.smallhub.feature.login

import com.arellomobile.mvp.InjectViewState
import com.innopolis.sergeypinkevich.domain.di.DI
import com.innopolis.sergeypinkevich.domain.model.LoginResponse
import com.innopolis.sergeypinkevich.domain.usecase.LoginUseCase
import com.innopolis.sergeypinkevich.domain.utils.BasePresenter
import timber.log.Timber
import javax.inject.Inject

/**
 * @author Sergey Pinkevich
 */
@InjectViewState
class LoginPresenter @Inject constructor(private val loginUseCase: LoginUseCase) : BasePresenter<LoginView>() {

    companion object {
        private const val TAG = "LoginPresenter"
    }

    fun login(email: String, password: String) {
        viewState.showProgress()
        safeSubscribe {
        loginUseCase.login(email, password)
                .doAfterTerminate { viewState.hideProgress() }
                .subscribe(this::handleLoginResponse, this::logError)
        }

    }

    private fun handleLoginResponse(response: LoginResponse) {

    }

    override fun onDestroy() {
        DI.app.loginComponent.onDependencyReleased()
        super.onDestroy()
    }

    private fun logError(throwable: Throwable) {
        Timber.tag(TAG).e(throwable)
    }
}