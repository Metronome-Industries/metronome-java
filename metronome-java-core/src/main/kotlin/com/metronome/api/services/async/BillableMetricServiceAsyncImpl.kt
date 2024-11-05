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
import com.metronome.api.core.json
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.BillableMetricArchiveParams
import com.metronome.api.models.BillableMetricArchiveResponse
import com.metronome.api.models.BillableMetricCreateParams
import com.metronome.api.models.BillableMetricCreateResponse
import com.metronome.api.models.BillableMetricListPageAsync
import com.metronome.api.models.BillableMetricListParams
import com.metronome.api.models.BillableMetricRetrieveParams
import com.metronome.api.models.BillableMetricRetrieveResponse
import java.util.concurrent.CompletableFuture

class BillableMetricServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : BillableMetricServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<BillableMetricCreateResponse> =
        jsonHandler<BillableMetricCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Creates a new Billable Metric. */
    override fun create(
        params: BillableMetricCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<BillableMetricCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("billable-metrics", "create")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<BillableMetricRetrieveResponse> =
        jsonHandler<BillableMetricRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a billable metric. */
    override fun retrieve(
        params: BillableMetricRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<BillableMetricRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("billable-metrics", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
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

    private val listHandler: Handler<BillableMetricListPageAsync.Response> =
        jsonHandler<BillableMetricListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all billable metrics. */
    override fun list(
        params: BillableMetricListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<BillableMetricListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("billable-metrics")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
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
                .let { BillableMetricListPageAsync.of(this, params, it) }
        }
    }

    private val archiveHandler: Handler<BillableMetricArchiveResponse> =
        jsonHandler<BillableMetricArchiveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Archive an existing billable metric. */
    override fun archive(
        params: BillableMetricArchiveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<BillableMetricArchiveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("billable-metrics", "archive")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { archiveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
