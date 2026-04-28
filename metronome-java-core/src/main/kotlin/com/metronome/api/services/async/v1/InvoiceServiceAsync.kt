// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.invoices.InvoiceRegenerateParams
import com.metronome.api.models.v1.invoices.InvoiceRegenerateResponse
import com.metronome.api.models.v1.invoices.InvoiceVoidParams
import com.metronome.api.models.v1.invoices.InvoiceVoidResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * [Invoices](https://docs.metronome.com/invoicing/) reflect how much a customer spent during a
 * period, which is the basis for billing. Metronome automatically generates invoices based upon
 * your pricing, packaging, and usage events. Use these endpoints to retrieve invoices.
 */
interface InvoiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceServiceAsync

    /**
     * This endpoint regenerates a voided invoice and recalculates the invoice based on up-to-date
     * rates, available balances, and other fees regardless of the billing period.
     *
     * ### Use this endpoint to:
     * Recalculate an invoice with updated rate terms, available balance, and fees to correct
     * billing disputes or discrepancies
     *
     * ### Key response fields:
     * The regenerated invoice id, which is distinct from the previously voided invoice.
     *
     * ### Usage guidelines:
     * If an invoice is attached to a contract with a billing provider on it, the regenerated
     * invoice will be distributed based on the configuration.
     */
    fun regenerate(params: InvoiceRegenerateParams): CompletableFuture<InvoiceRegenerateResponse> =
        regenerate(params, RequestOptions.none())

    /** @see regenerate */
    fun regenerate(
        params: InvoiceRegenerateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceRegenerateResponse>

    /**
     * Permanently cancels an invoice by setting its status to voided, preventing collection and
     * removing it from customer billing. Use this to correct billing errors, cancel incorrect
     * charges, or handle disputed invoices that should not be collected. Returns the voided invoice
     * ID with the status change applied immediately to stop any payment processing.
     */
    fun void_(params: InvoiceVoidParams): CompletableFuture<InvoiceVoidResponse> =
        void_(params, RequestOptions.none())

    /** @see void_ */
    fun void_(
        params: InvoiceVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceVoidResponse>

    /**
     * A view of [InvoiceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvoiceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/invoices/regenerate`, but is otherwise the same
         * as [InvoiceServiceAsync.regenerate].
         */
        fun regenerate(
            params: InvoiceRegenerateParams
        ): CompletableFuture<HttpResponseFor<InvoiceRegenerateResponse>> =
            regenerate(params, RequestOptions.none())

        /** @see regenerate */
        fun regenerate(
            params: InvoiceRegenerateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceRegenerateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/invoices/void`, but is otherwise the same as
         * [InvoiceServiceAsync.void_].
         */
        fun void_(
            params: InvoiceVoidParams
        ): CompletableFuture<HttpResponseFor<InvoiceVoidResponse>> =
            void_(params, RequestOptions.none())

        /** @see void_ */
        fun void_(
            params: InvoiceVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceVoidResponse>>
    }
}
