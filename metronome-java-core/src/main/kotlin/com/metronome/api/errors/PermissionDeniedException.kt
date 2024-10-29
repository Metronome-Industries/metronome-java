package com.metronome.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: MetronomeError,
) : MetronomeServiceException(403, headers, body, error)
