package com.metronome.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException
constructor(
        headers: ListMultimap<String, String>,
        private val error: MetronomeError,
) : MetronomeServiceException(headers, "${error}") {
    override fun statusCode(): Int = 401
    fun error(): MetronomeError = error
}
