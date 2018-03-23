package com.innopolis.sergeypinkevich.domain.usecase

import android.util.Base64
import com.innopolis.sergeypinkevich.domain.model.LoginResponse
import com.innopolis.sergeypinkevich.domain.repository.LoginRepository
import com.innopolis.sergeypinkevich.domain.utils.schedulersIoToMainThread
import io.reactivex.Single
import javax.inject.Inject

/**
 * @author Sergey Pinkevich
 */
class LoginUseCase @Inject constructor(private val repository: LoginRepository) {

    fun login(login: String, password: String): Single<LoginResponse> {
        return repository.login(encodeToBase64(login, password))
                .schedulersIoToMainThread()
    }

    private fun encodeToBase64(login: String, password: String) = "Basic " + Base64.encodeToString("$login:$password".toByteArray(), Base64.DEFAULT).dropLast(1)
}