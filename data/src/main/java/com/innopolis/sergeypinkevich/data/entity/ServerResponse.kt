package com.innopolis.sergeypinkevich.data.entity

import com.innopolis.sergeypinkevich.data.utils.ResponseStatusCode

/**
 * @author Sergey Pinkevich
 */
data class ServerResponse<out ServerEntity>(val code: ResponseStatusCode, val data: ServerEntity)