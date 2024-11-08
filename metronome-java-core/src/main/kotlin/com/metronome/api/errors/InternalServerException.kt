package com.metronome.api.errors

import com.metronome.api.core.http.Headers

class InternalServerException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: MetronomeError,
) : MetronomeServiceException(statusCode, headers, body, error)
