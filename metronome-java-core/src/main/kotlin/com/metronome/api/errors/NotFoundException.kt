package com.metronome.api.errors

import com.metronome.api.core.http.Headers

class NotFoundException(headers: Headers, body: String, error: MetronomeError) :
    MetronomeServiceException(404, headers, body, error)
