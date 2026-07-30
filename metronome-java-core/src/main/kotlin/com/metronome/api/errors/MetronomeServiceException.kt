// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.errors

import com.metronome.api.core.JsonValue
import com.metronome.api.core.http.Headers
import com.metronome.api.errors.MetronomeException

abstract class MetronomeServiceException protected constructor(
    message: String,
    cause: Throwable? = null,

) : MetronomeException(
  message, cause
) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
