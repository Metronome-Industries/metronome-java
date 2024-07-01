package com.metronome.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException
constructor(
        headers: ListMultimap<String, String>,
        private val error: MetronomeError,
) : MetronomeServiceException(headers, "${error}") {
    override fun statusCode(): Int = 403
    fun error(): MetronomeError = error
}
