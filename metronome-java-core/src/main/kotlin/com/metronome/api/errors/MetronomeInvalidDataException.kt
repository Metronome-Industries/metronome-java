package com.metronome.api.errors

class MetronomeInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : MetronomeException(message, cause)
