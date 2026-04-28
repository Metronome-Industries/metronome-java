@file:JvmName("EmptyHandler")

package com.metronome.api.core.handlers

import com.metronome.api.core.http.HttpResponse
import com.metronome.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
