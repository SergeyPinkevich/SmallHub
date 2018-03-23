package com.innopolis.sergeypinkevich.domain.usecase

import com.innopolis.sergeypinkevich.domain.model.UserInfo
import com.innopolis.sergeypinkevich.domain.repository.GitHubRepository
import com.innopolis.sergeypinkevich.domain.utils.schedulersIoToMainThread
import io.reactivex.Single
import javax.inject.Inject

/**
 * @author Sergey Pinkevich
 */
class UserInfoUseCase @Inject constructor(private val repository: GitHubRepository) {

    fun getUserInfo(): Single<UserInfo> {
        return repository.getUserInfo()
                .schedulersIoToMainThread()
    }
}