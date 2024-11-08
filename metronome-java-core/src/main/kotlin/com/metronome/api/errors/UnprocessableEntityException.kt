package com.metronome.api.errors

import com.metronome.api.core.http.Headers

class UnprocessableEntityException(
    headers: Headers,
    body: String,
    error: MetronomeError,
) : MetronomeServiceException(422, headers, body, error)
