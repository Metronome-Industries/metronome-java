// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.customers

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.CustomerAlertListParams
import com.metronome.api.models.CustomerAlertListResponse
import com.metronome.api.models.CustomerAlertResetParams
import com.metronome.api.models.CustomerAlertRetrieveParams
import com.metronome.api.models.CustomerAlertRetrieveResponse
import java.util.concurrent.CompletableFuture

interface AlertServiceAsync {

    /** Get the customer alert status and alert information for the specified customer and alert */
    @JvmOverloads
    fun retrieve(
        params: CustomerAlertRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerAlertRetrieveResponse>

    /** Fetch all customer alert statuses and alert information for a customer */
    @JvmOverloads
    fun list(
        params: CustomerAlertListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerAlertListResponse>

    /** Reset state for an alert by customer id and force re-evaluation */
    @JvmOverloads
    fun reset(
        params: CustomerAlertResetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>
}
