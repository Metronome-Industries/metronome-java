package com.metronome.api.errors

import com.metronome.api.core.http.Headers

class PermissionDeniedException(
    headers: Headers,
    body: String,
    error: MetronomeError,
) : MetronomeServiceException(403, headers, body, error)
