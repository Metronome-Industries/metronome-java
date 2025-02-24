// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.customers

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.CustomerNamedScheduleRetrieveParams
import com.metronome.api.models.CustomerNamedScheduleRetrieveResponse
import com.metronome.api.models.CustomerNamedScheduleUpdateParams
import java.util.concurrent.CompletableFuture

interface NamedScheduleServiceAsync {

    /**
     * Get a named schedule for the given customer. This endpoint's availability is dependent on
     * your client's configuration.
     */
    @JvmOverloads
    fun retrieve(
        params: CustomerNamedScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerNamedScheduleRetrieveResponse>

    /**
     * Update a named schedule for the given customer. This endpoint's availability is dependent on
     * your client's configuration.
     */
    @JvmOverloads
    fun update(
        params: CustomerNamedScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>
}
