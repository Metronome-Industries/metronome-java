// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.customers

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
import com.metronome.api.models.CustomerCreditCreateParams
import com.metronome.api.models.CustomerCreditCreateResponse
import com.metronome.api.models.CustomerCreditListParams
import com.metronome.api.models.CustomerCreditListResponse
import com.metronome.api.models.CustomerCreditUpdateEndDateParams
import com.metronome.api.models.CustomerCreditUpdateEndDateResponse
import java.util.concurrent.CompletableFuture

class CreditServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CreditServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CustomerCreditCreateResponse> =
        jsonHandler<CustomerCreditCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a new credit at the customer level. */
    override fun create(
        params: CustomerCreditCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerCreditCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "customerCredits", "create")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<CustomerCreditListResponse> =
        jsonHandler<CustomerCreditListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List credits. */
    override fun list(
        params: CustomerCreditListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerCreditListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "customerCredits", "list")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
            }
    }

    private val updateEndDateHandler: Handler<CustomerCreditUpdateEndDateResponse> =
        jsonHandler<CustomerCreditUpdateEndDateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update the end date of a credit */
    override fun updateEndDate(
        params: CustomerCreditUpdateEndDateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerCreditUpdateEndDateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contracts", "customerCredits", "updateEndDate")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateEndDateHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
            }
    }
}
