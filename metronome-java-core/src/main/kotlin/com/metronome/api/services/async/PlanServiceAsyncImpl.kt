// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.PlanGetDetailsParams
import com.metronome.api.models.PlanGetDetailsResponse
import com.metronome.api.models.PlanListChargesParams
import com.metronome.api.models.PlanListChargesResponse
import com.metronome.api.models.PlanListCustomersParams
import com.metronome.api.models.PlanListCustomersResponse
import com.metronome.api.models.PlanListParams
import com.metronome.api.models.PlanListResponse
import com.metronome.api.services.errorHandler
import com.metronome.api.services.jsonHandler
import com.metronome.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class PlanServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : PlanServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<PlanListResponse> =
        jsonHandler<PlanListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List all available plans. */
    override fun list(
        params: PlanListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PlanListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("plans")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { getDetailsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listChargesHandler: Handler<PlanListChargesResponse> =
        jsonHandler<PlanListChargesResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Fetches a list of charges of a specific plan. */
    override fun listCharges(
        params: PlanListChargesParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PlanListChargesResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("planDetails", params.getPathParam(0), "charges")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listChargesHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listCustomersHandler: Handler<PlanListCustomersResponse> =
        jsonHandler<PlanListCustomersResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetches a list of customers on a specific plan (by default, only currently active plans are
     * included)
     */
    override fun listCustomers(
        params: PlanListCustomersParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PlanListCustomersResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("planDetails", params.getPathParam(0), "customers")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listCustomersHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
