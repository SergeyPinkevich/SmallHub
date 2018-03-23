package com.innopolis.sergeypinkevich.data.network

import com.innopolis.sergeypinkevich.data.entity.LoginRequest
import com.innopolis.sergeypinkevich.domain.model.LoginResponse
import com.innopolis.sergeypinkevich.data.entity.ServerResponse
import com.innopolis.sergeypinkevich.data.entity.UserInfoResponse
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

/**
 * @author Sergey Pinkevich
 */
interface GitHubApi {

    @POST("/authorizations")
    fun login(@Header("Authorization") loginData: String,
              @Body body: LoginRequest): Single<LoginResponse>

    @GET("/user")
    fun getUserInfo(): Single<ServerResponse<UserInfoResponse>>
}