// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.payments.PaymentAttemptParams
import com.metronome.api.models.v1.payments.PaymentAttemptResponse
import com.metronome.api.models.v1.payments.PaymentCancelParams
import com.metronome.api.models.v1.payments.PaymentCancelResponse
import com.metronome.api.models.v1.payments.PaymentListPage
import com.metronome.api.models.v1.payments.PaymentListParams
import java.util.function.Consumer

interface PaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentService

    /** Fetch all payment attempts for the given invoice. */
    fun list(params: PaymentListParams): PaymentListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentListPage

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
    fun attempt(params: PaymentAttemptParams): PaymentAttemptResponse =
        attempt(params, RequestOptions.none())

    /** @see attempt */
    fun attempt(
        params: PaymentAttemptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAttemptResponse

    /** Cancel an existing payment attempt for an invoice. */
    fun cancel(params: PaymentCancelParams): PaymentCancelResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: PaymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentCancelResponse

    /** A view of [PaymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/payments/list`, but is otherwise the same as
         * [PaymentService.list].
         */
        @MustBeClosed
        fun list(params: PaymentListParams): HttpResponseFor<PaymentListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PaymentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentListPage>

        /**
         * Returns a raw HTTP response for `post /v1/payments/attempt`, but is otherwise the same as
         * [PaymentService.attempt].
         */
        @MustBeClosed
        fun attempt(params: PaymentAttemptParams): HttpResponseFor<PaymentAttemptResponse> =
            attempt(params, RequestOptions.none())

        /** @see attempt */
        @MustBeClosed
        fun attempt(
            params: PaymentAttemptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAttemptResponse>

        /**
         * Returns a raw HTTP response for `post /v1/payments/cancel`, but is otherwise the same as
         * [PaymentService.cancel].
         */
        @MustBeClosed
        fun cancel(params: PaymentCancelParams): HttpResponseFor<PaymentCancelResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: PaymentCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentCancelResponse>
    }
}
