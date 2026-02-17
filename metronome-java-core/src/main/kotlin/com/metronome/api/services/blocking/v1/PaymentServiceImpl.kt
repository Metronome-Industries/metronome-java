// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1PaymentAttemptParams
import com.metronome.api.models.V1PaymentAttemptResponse
import com.metronome.api.models.V1PaymentCancelParams
import com.metronome.api.models.V1PaymentCancelResponse
import com.metronome.api.models.V1PaymentListPage
import com.metronome.api.models.V1PaymentListParams

class PaymentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<V1PaymentListPage.Response> =
        jsonHandler<V1PaymentListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Fetch all payment attempts for the given invoice. */
    override fun list(
        params: V1PaymentListParams,
        requestOptions: RequestOptions,
    ): V1PaymentListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "payments", "list")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { V1PaymentListPage.of(this, params, it) }
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
    ): V1PaymentAttemptResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "payments", "attempt")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { attemptHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
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
    ): V1PaymentCancelResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "payments", "cancel")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { cancelHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
