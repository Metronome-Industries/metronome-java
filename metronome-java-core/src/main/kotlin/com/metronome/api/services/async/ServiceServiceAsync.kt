// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.ServiceListParams
import com.metronome.api.models.ServiceListResponse
import java.util.concurrent.CompletableFuture

interface ServiceServiceAsync {

    /**
     * Fetches a list of services used by Metronome and the associated IP addresses. IP addresses
     * are not necessarily unique between services. In most cases, IP addresses will appear in the
     * list at least 30 days before they are used for the first time.
     */
    @JvmOverloads
    fun list(
        params: ServiceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ServiceListResponse>
}
