package com.metronome.api.errors

import com.google.common.collect.ListMultimap

class BadRequestException(
    headers: ListMultimap<String, String>,
    body: String,
    error: MetronomeError,
) : MetronomeServiceException(400, headers, body, error)
