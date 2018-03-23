package com.innopolis.sergeypinkevich.data.repository

import com.innopolis.sergeypinkevich.data.converter.UserInfoConverter
import com.innopolis.sergeypinkevich.data.network.GitHubApi
import com.innopolis.sergeypinkevich.domain.model.UserInfo
import com.innopolis.sergeypinkevich.domain.repository.GitHubRepository
import io.reactivex.Single
import javax.inject.Inject

/**
 * @author Sergey Pinkevich
 */
class GitHubRepositoryImpl @Inject constructor(private val api: GitHubApi) : GitHubRepository {

    override fun getUserInfo(): Single<UserInfo> {
        return api.getUserInfo()
                .map { UserInfoConverter.fromNetwork(it.data) }
    }
}