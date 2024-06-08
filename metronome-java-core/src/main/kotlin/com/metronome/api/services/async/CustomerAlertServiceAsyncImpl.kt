// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.CustomerAlertListParams
import com.metronome.api.models.CustomerAlertListResponse
import com.metronome.api.models.CustomerAlertResetParams
import com.metronome.api.models.CustomerAlertRetrieveParams
import com.metronome.api.models.CustomerAlertRetrieveResponse
import com.metronome.api.services.emptyHandler
import com.metronome.api.services.errorHandler
import com.metronome.api.services.json
import com.metronome.api.services.jsonHandler
import com.metronome.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class CustomerAlertServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CustomerAlertServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<CustomerAlertRetrieveResponse> =
        jsonHandler<CustomerAlertRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get the customer alert status and alert information for the specified customer and alert */
    override fun retrieve(
        params: CustomerAlertRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerAlertRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customer-alerts", "get")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<CustomerAlertListResponse> =
        jsonHandler<CustomerAlertListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Fetch all customer alert statuses and alert information for a customer */
    override fun list(
        params: CustomerAlertListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerAlertListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customer-alerts", "list")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val resetHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Reset state for an alert by customer id and force re-evaluation */
    override fun reset(
        params: CustomerAlertResetParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Void> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customer-alerts", "reset")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { resetHandler.handle(it) }
        }
    }
}
