package com.metronome.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException
constructor(
    headers: ListMultimap<String, String>,
    private val error: MetronomeError,
) : MetronomeServiceException(headers, "${error}") {
    override fun statusCode(): Int = 422

    fun error(): MetronomeError = error
}
