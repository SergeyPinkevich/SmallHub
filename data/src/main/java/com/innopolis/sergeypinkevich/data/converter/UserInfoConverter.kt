package com.innopolis.sergeypinkevich.data.converter

import com.innopolis.sergeypinkevich.data.entity.UserInfoResponse
import com.innopolis.sergeypinkevich.data.utils.ConvertException
import com.innopolis.sergeypinkevich.domain.model.UserInfo

/**
 * @author Sergey Pinkevich
 */
object UserInfoConverter {

    fun fromNetwork(userInfo: UserInfoResponse): UserInfo {
        userInfo?.let {
            with(it) {
                val email = userInfo.email ?: ""
                val bio = userInfo.bio ?: ""
                val location = userInfo.location ?: ""
                return UserInfo(userInfo.avatar, userInfo.name, email, location, bio)
            }
        } ?: ConvertException("User info is null")
    }
}