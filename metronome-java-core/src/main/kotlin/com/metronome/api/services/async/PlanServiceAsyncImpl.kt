// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

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
import com.metronome.api.models.PlanGetDetailsParams
import com.metronome.api.models.PlanGetDetailsResponse
import com.metronome.api.models.PlanListChargesPageAsync
import com.metronome.api.models.PlanListChargesParams
import com.metronome.api.models.PlanListCustomersPageAsync
import com.metronome.api.models.PlanListCustomersParams
import com.metronome.api.models.PlanListPageAsync
import com.metronome.api.models.PlanListParams
import java.util.concurrent.CompletableFuture

class PlanServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : PlanServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<PlanListPageAsync.Response> =
        jsonHandler<PlanListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all available plans. */
    override fun list(
        params: PlanListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PlanListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("plans")
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
                    .let { PlanListPageAsync.of(this, params, it) }
            }
    }

    private val getDetailsHandler: Handler<PlanGetDetailsResponse> =
        jsonHandler<PlanGetDetailsResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Fetch high level details of a specific plan. */
    override fun getDetails(
        params: PlanGetDetailsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PlanGetDetailsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("planDetails", params.getPathParam(0))
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

    private val listChargesHandler: Handler<PlanListChargesPageAsync.Response> =
        jsonHandler<PlanListChargesPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Fetches a list of charges of a specific plan. */
    override fun listCharges(
        params: PlanListChargesParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PlanListChargesPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("planDetails", params.getPathParam(0), "charges")
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
                    .let { PlanListChargesPageAsync.of(this, params, it) }
            }
    }

    private val listCustomersHandler: Handler<PlanListCustomersPageAsync.Response> =
        jsonHandler<PlanListCustomersPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetches a list of customers on a specific plan (by default, only currently active plans are
     * included)
     */
    override fun listCustomers(
        params: PlanListCustomersParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PlanListCustomersPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("planDetails", params.getPathParam(0), "customers")
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
                    .let { PlanListCustomersPageAsync.of(this, params, it) }
            }
    }
}
