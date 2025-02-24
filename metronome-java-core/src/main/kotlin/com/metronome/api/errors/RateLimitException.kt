package com.metronome.api.errors

import com.metronome.api.core.http.Headers

class RateLimitException(headers: Headers, body: String, error: MetronomeError) :
    MetronomeServiceException(429, headers, body, error)
