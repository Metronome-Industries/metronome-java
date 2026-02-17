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
import com.metronome.api.core.prepareAsync
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1PlanGetDetailsParams
import com.metronome.api.models.V1PlanGetDetailsResponse
import com.metronome.api.models.V1PlanListChargesPageAsync
import com.metronome.api.models.V1PlanListChargesParams
import com.metronome.api.models.V1PlanListCustomersPageAsync
import com.metronome.api.models.V1PlanListCustomersParams
import com.metronome.api.models.V1PlanListPageAsync
import com.metronome.api.models.V1PlanListParams
import java.util.concurrent.CompletableFuture

class PlanServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlanServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<V1PlanListPageAsync.Response> =
        jsonHandler<V1PlanListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List all available plans. This is a Plans (deprecated) endpoint. New clients should implement
     * using Contracts.
     */
    override fun list(
        params: V1PlanListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1PlanListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "plans")
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
                    .let { V1PlanListPageAsync.of(this, params, it) }
            }
    }

    private val getDetailsHandler: Handler<V1PlanGetDetailsResponse> =
        jsonHandler<V1PlanGetDetailsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch high level details of a specific plan. This is a Plans (deprecated) endpoint. New
     * clients should implement using Contracts.
     */
    override fun getDetails(
        params: V1PlanGetDetailsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1PlanGetDetailsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "planDetails", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { getDetailsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listChargesHandler: Handler<V1PlanListChargesPageAsync.Response> =
        jsonHandler<V1PlanListChargesPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetches a list of charges of a specific plan. This is a Plans (deprecated) endpoint. New
     * clients should implement using Contracts.
     */
    override fun listCharges(
        params: V1PlanListChargesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1PlanListChargesPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "planDetails", params.getPathParam(0), "charges")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listChargesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { V1PlanListChargesPageAsync.of(this, params, it) }
            }
    }

    private val listCustomersHandler: Handler<V1PlanListCustomersPageAsync.Response> =
        jsonHandler<V1PlanListCustomersPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetches a list of customers on a specific plan (by default, only currently active plans are
     * included). This is a Plans (deprecated) endpoint. New clients should implement using
     * Contracts.
     */
    override fun listCustomers(
        params: V1PlanListCustomersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1PlanListCustomersPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "planDetails", params.getPathParam(0), "customers")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listCustomersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { V1PlanListCustomersPageAsync.of(this, params, it) }
            }
    }
}
