// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.payments.PaymentAttemptParams
import com.metronome.api.models.v1.payments.PaymentAttemptResponse
import com.metronome.api.models.v1.payments.PaymentCancelParams
import com.metronome.api.models.v1.payments.PaymentCancelResponse
import com.metronome.api.models.v1.payments.PaymentListPageAsync
import com.metronome.api.models.v1.payments.PaymentListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentServiceAsync

    /** Fetch all payment attempts for the given invoice. */
    fun list(params: PaymentListParams): CompletableFuture<PaymentListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentListPageAsync>

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
    fun attempt(params: PaymentAttemptParams): CompletableFuture<PaymentAttemptResponse> =
        attempt(params, RequestOptions.none())

    /** @see attempt */
    fun attempt(
        params: PaymentAttemptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentAttemptResponse>

    /** Cancel an existing payment attempt for an invoice. */
    fun cancel(params: PaymentCancelParams): CompletableFuture<PaymentCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: PaymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentCancelResponse>

    /**
     * A view of [PaymentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/payments/list`, but is otherwise the same as
         * [PaymentServiceAsync.list].
         */
        fun list(
            params: PaymentListParams
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PaymentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>>

        /**
         * Returns a raw HTTP response for `post /v1/payments/attempt`, but is otherwise the same as
         * [PaymentServiceAsync.attempt].
         */
        fun attempt(
            params: PaymentAttemptParams
        ): CompletableFuture<HttpResponseFor<PaymentAttemptResponse>> =
            attempt(params, RequestOptions.none())

        /** @see attempt */
        fun attempt(
            params: PaymentAttemptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentAttemptResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/payments/cancel`, but is otherwise the same as
         * [PaymentServiceAsync.cancel].
         */
        fun cancel(
            params: PaymentCancelParams
        ): CompletableFuture<HttpResponseFor<PaymentCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: PaymentCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentCancelResponse>>
    }
}
