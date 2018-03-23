package com.innopolis.sergeypinkevich.domain.model

import com.google.gson.annotations.SerializedName

/**
 * @author Sergey Pinkevich
 */
data class LoginResponse(@SerializedName("token")
                        private val token: String)