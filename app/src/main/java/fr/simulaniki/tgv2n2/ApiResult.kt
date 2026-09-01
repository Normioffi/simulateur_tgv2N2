package fr.simulaniki.tgv2n2

data class ApiResult<T>(
    val code: Int,
    val data: T? = null,
    val retryAfter: Long? = null
)