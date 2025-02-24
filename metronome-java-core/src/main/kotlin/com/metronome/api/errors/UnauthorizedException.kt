package com.metronome.api.errors

import com.metronome.api.core.http.Headers

class UnauthorizedException(headers: Headers, body: String, error: MetronomeError) :
    MetronomeServiceException(401, headers, body, error)
