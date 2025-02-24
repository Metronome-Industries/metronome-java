// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

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
import com.metronome.api.models.UsageIngestParams
import com.metronome.api.models.UsageListParams
import com.metronome.api.models.UsageListResponse
import com.metronome.api.models.UsageListWithGroupsPageAsync
import com.metronome.api.models.UsageListWithGroupsParams
import java.util.concurrent.CompletableFuture

class UsageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<UsageListResponse> =
        jsonHandler<UsageListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Fetch aggregated usage data for multiple customers and billable-metrics, broken into
     * intervals of the specified length.
     */
    override fun list(
        params: UsageListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("usage")
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
            }
    }

    private val ingestHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Send usage events to Metronome. The body of this request is expected to be a JSON array of
     * between 1 and 100 usage events. Compressed request bodies are supported with a
     * `Content-Encoding: gzip` header. See
     * [Getting usage into Metronome](https://docs.metronome.com/connect-metronome/) to learn more
     * about usage events.
     */
    override fun ingest(
        params: UsageIngestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("ingest")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response -> response.use { ingestHandler.handle(it) } }
    }

    private val listWithGroupsHandler: Handler<UsageListWithGroupsPageAsync.Response> =
        jsonHandler<UsageListWithGroupsPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch aggregated usage data for the specified customer, billable-metric, and optional group,
     * broken into intervals of the specified length.
     */
    override fun listWithGroups(
        params: UsageListWithGroupsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageListWithGroupsPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("usage", "groups")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listWithGroupsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { UsageListWithGroupsPageAsync.of(this, params, it) }
            }
    }
}
