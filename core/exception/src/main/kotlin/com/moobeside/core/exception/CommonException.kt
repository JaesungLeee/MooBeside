package com.moobeside.core.exception

/**
 * MooBeside
 * @author jaesung
 * @created 2024/03/29
 */
class UnknownException(
    override val message: String? = "알 수 없는 에러가 발생했어요.",
    val originMessage: String?,
) : Exception()

class NotFoundException(
    override val message: String? = "찾을 수 없는 요청이에요.",
    val originMessage: String?,
) : Exception()

class ForbiddenException(
    override val message: String? = "처리할 수 없는 요청이에요.",
    val originMessage: String?,
) : Exception()

class InternalServerException(
    override val message: String? = "요청 서버에서 에러가 발생했어요.",
    val originMessage: String?,
) : Exception()

class BadRequestException(
    override val message: String? = "잘못된 요청입니다.",
    val originMessage: String?,
) : Exception()