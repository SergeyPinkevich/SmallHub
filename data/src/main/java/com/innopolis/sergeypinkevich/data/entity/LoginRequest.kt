package com.innopolis.sergeypinkevich.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * @author Sergey Pinkevich
 */
class LoginRequest(@SerializedName("scopes")
                   @Expose val scopes: Array<String>,
                   @SerializedName("note")
                   @Expose val note: String)