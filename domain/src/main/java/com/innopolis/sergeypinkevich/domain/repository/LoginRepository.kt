package com.innopolis.sergeypinkevich.domain.repository

import com.innopolis.sergeypinkevich.domain.model.LoginResponse
import io.reactivex.Single

/**
 * @author Sergey Pinkevich
 */
interface LoginRepository {

    fun login(loginData: String): Single<LoginResponse>
}