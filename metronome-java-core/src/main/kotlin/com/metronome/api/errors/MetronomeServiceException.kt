package com.metronome.api.errors

import com.metronome.api.core.http.Headers

abstract class MetronomeServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: MetronomeError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : MetronomeException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): MetronomeError = error
}
