package com.metronome.api.errors

import com.google.common.collect.ListMultimap

class NotFoundException
constructor(
        headers: ListMultimap<String, String>,
        private val error: MetronomeError,
) : MetronomeServiceException(headers, "${error}") {
    override fun statusCode(): Int = 404
    fun error(): MetronomeError = error
}
