// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.customers

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.emptyHandler
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.CustomerAlertListParams
import com.metronome.api.models.CustomerAlertListResponse
import com.metronome.api.models.CustomerAlertResetParams
import com.metronome.api.models.CustomerAlertRetrieveParams
import com.metronome.api.models.CustomerAlertRetrieveResponse

class AlertServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : AlertService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<CustomerAlertRetrieveResponse> =
        jsonHandler<CustomerAlertRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get the customer alert status and alert information for the specified customer and alert */
    override fun retrieve(
        params: CustomerAlertRetrieveParams,
        requestOptions: RequestOptions
    ): CustomerAlertRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customer-alerts", "get")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    ): CustomerAlertListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customer-alerts", "list")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    override fun reset(params: CustomerAlertResetParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customer-alerts", "reset")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { resetHandler.handle(it) }
        }
    }
}
