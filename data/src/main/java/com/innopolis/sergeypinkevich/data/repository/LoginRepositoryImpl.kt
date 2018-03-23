package com.innopolis.sergeypinkevich.data.repository

import com.innopolis.sergeypinkevich.data.entity.LoginRequest
import com.innopolis.sergeypinkevich.data.network.GitHubApi
import com.innopolis.sergeypinkevich.domain.model.LoginResponse
import com.innopolis.sergeypinkevich.domain.repository.LoginRepository
import io.reactivex.Single
import javax.inject.Inject

/**
 * @author Sergey Pinkevich
 */
class LoginRepositoryImpl @Inject constructor(private val api: GitHubApi) : LoginRepository {

    override fun login(loginData: String): Single<LoginResponse> {
        return api.login(loginData, getAuthRequest())
    }

    private fun getAuthRequest(): LoginRequest = LoginRequest(arrayOf("read:user"), "SmallHub")
}