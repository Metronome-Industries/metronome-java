package com.metronome.api.errors

import com.google.common.collect.ListMultimap

abstract class MetronomeServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: ListMultimap<String, String>,
    private val body: String,
    private val error: MetronomeError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : MetronomeException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): ListMultimap<String, String> = headers

    fun body(): String = body

    fun error(): MetronomeError = error
}
