// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.customers

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.CustomerCreditCreateParams
import com.metronome.api.models.CustomerCreditCreateResponse
import com.metronome.api.models.CustomerCreditListParams
import com.metronome.api.models.CustomerCreditListResponse
import com.metronome.api.models.CustomerCreditUpdateEndDateParams
import com.metronome.api.models.CustomerCreditUpdateEndDateResponse
import java.util.concurrent.CompletableFuture

interface CreditServiceAsync {

    /** Create a new credit at the customer level. */
    @JvmOverloads
    fun create(
        params: CustomerCreditCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CustomerCreditCreateResponse>

    /** List credits. */
    @JvmOverloads
    fun list(
        params: CustomerCreditListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CustomerCreditListResponse>

    /** Update the end date of a credit */
    @JvmOverloads
    fun updateEndDate(
        params: CustomerCreditUpdateEndDateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CustomerCreditUpdateEndDateResponse>
}
