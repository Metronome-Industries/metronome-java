package com.metronome.api.errors

class MetronomeIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : MetronomeException(message, cause)
