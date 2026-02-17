// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.customers

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
import com.metronome.api.core.prepareAsync
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1CustomerNamedScheduleRetrieveParams
import com.metronome.api.models.V1CustomerNamedScheduleRetrieveResponse
import com.metronome.api.models.V1CustomerNamedScheduleUpdateParams
import java.util.concurrent.CompletableFuture

class NamedScheduleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NamedScheduleServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<V1CustomerNamedScheduleRetrieveResponse> =
        jsonHandler<V1CustomerNamedScheduleRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Get a named schedule for the given customer. This endpoint's availability is dependent on
     * your client's configuration.
     */
    override fun retrieve(
        params: V1CustomerNamedScheduleRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CustomerNamedScheduleRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "customers", "getNamedSchedule")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Update a named schedule for the given customer. This endpoint's availability is dependent on
     * your client's configuration.
     */
    override fun update(
        params: V1CustomerNamedScheduleUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "customers", "updateNamedSchedule")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response -> response.use { updateHandler.handle(it) } }
    }
}
