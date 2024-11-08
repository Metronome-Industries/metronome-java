package com.metronome.api.errors

import com.metronome.api.core.http.Headers

class BadRequestException(
    headers: Headers,
    body: String,
    error: MetronomeError,
) : MetronomeServiceException(400, headers, body, error)
