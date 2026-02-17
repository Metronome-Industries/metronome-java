// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepareAsync
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1PaymentAttemptParams
import com.metronome.api.models.V1PaymentAttemptResponse
import com.metronome.api.models.V1PaymentCancelParams
import com.metronome.api.models.V1PaymentCancelResponse
import com.metronome.api.models.V1PaymentListPageAsync
import com.metronome.api.models.V1PaymentListParams
import java.util.concurrent.CompletableFuture

class PaymentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<V1PaymentListPageAsync.Response> =
        jsonHandler<V1PaymentListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Fetch all payment attempts for the given invoice. */
    override fun list(
        params: V1PaymentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1PaymentListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "payments", "list")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { V1PaymentListPageAsync.of(this, params, it) }
            }
    }

    private val attemptHandler: Handler<V1PaymentAttemptResponse> =
        jsonHandler<V1PaymentAttemptResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun attempt(
        params: V1PaymentAttemptParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1PaymentAttemptResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "payments", "attempt")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { attemptHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val cancelHandler: Handler<V1PaymentCancelResponse> =
        jsonHandler<V1PaymentCancelResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Cancel an existing payment attempt for an invoice. */
    override fun cancel(
        params: V1PaymentCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1PaymentCancelResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "payments", "cancel")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
