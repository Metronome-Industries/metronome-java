package com.metronome.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException(
    headers: ListMultimap<String, String>,
    body: String,
    error: MetronomeError,
) : MetronomeServiceException(422, headers, body, error)
