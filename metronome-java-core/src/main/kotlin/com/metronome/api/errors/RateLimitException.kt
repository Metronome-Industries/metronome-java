package com.metronome.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException(
    headers: ListMultimap<String, String>,
    body: String,
    error: MetronomeError,
) : MetronomeServiceException(429, headers, body, error)
