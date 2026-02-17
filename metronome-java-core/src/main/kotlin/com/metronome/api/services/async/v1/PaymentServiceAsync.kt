// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.v1

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1PaymentAttemptParams
import com.metronome.api.models.V1PaymentAttemptResponse
import com.metronome.api.models.V1PaymentCancelParams
import com.metronome.api.models.V1PaymentCancelResponse
import com.metronome.api.models.V1PaymentListPageAsync
import com.metronome.api.models.V1PaymentListParams
import java.util.concurrent.CompletableFuture

interface PaymentServiceAsync {

    /** Fetch all payment attempts for the given invoice. */
    @JvmOverloads
    fun list(
        params: V1PaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1PaymentListPageAsync>

    /**
     * Trigger a new attempt by canceling any existing attempts for this invoice and creating a new
     * Payment. This will trigger another attempt to charge the Customer's configured Payment
     * Gateway. Payment can only be attempted if all of the following are true:
     * - The Metronome Invoice is finalized
     * - PLG Invoicing is configured for the Customer
     * - You cannot attempt payments for invoices that have already been `paid` or `voided`.
     *
     * Attempting to payment on an ineligible Invoice or Customer will result in a `400` response.
     */
    @JvmOverloads
    fun attempt(
        params: V1PaymentAttemptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1PaymentAttemptResponse>

    /** Cancel an existing payment attempt for an invoice. */
    @JvmOverloads
    fun cancel(
        params: V1PaymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1PaymentCancelResponse>
}
