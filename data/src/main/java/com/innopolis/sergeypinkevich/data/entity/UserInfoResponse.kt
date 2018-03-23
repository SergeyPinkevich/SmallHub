package com.innopolis.sergeypinkevich.data.entity

import com.google.gson.annotations.SerializedName

/**
 * @author Sergey Pinkevich
 */
data class UserInfoResponse(@SerializedName("avatar_url")
                            val avatar: String,
                            @SerializedName("name")
                            val name: String,
                            @SerializedName("email")
                            val email: String?,
                            @SerializedName("location")
                            val location: String?,
                            @SerializedName("bio")
                            val bio: String?)