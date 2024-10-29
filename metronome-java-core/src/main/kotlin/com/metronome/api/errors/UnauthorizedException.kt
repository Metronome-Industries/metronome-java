package com.metronome.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: MetronomeError,
) : MetronomeServiceException(401, headers, body, error)
