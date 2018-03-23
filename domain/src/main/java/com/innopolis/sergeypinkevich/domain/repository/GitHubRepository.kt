package com.innopolis.sergeypinkevich.domain.repository

import com.innopolis.sergeypinkevich.domain.model.UserInfo
import io.reactivex.Single

/**
 * @author Sergey Pinkevich
 */
interface GitHubRepository {

    fun getUserInfo(): Single<UserInfo>
}