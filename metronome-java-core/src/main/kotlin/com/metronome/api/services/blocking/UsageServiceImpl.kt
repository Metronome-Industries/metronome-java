// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

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
import com.metronome.api.models.UsageIngestParams
import com.metronome.api.models.UsageListParams
import com.metronome.api.models.UsageListResponse
import com.metronome.api.models.UsageListWithGroupsPage
import com.metronome.api.models.UsageListWithGroupsParams

class UsageServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : UsageService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<UsageListResponse> =
        jsonHandler<UsageListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Fetch aggregated usage data for multiple customers and billable-metrics, broken into
     * intervals of the specified length.
     */
    override fun list(params: UsageListParams, requestOptions: RequestOptions): UsageListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("usage")
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

    private val ingestHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Send usage events to Metronome. The body of this request is expected to be a JSON array of
     * between 1 and 100 usage events. Compressed request bodies are supported with a
     * `Content-Encoding: gzip` header. See
     * [Getting usage into Metronome](https://docs.metronome.com/connect-metronome/) to learn more
     * about usage events.
     */
    override fun ingest(params: UsageIngestParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("ingest")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { ingestHandler.handle(it) }
        }
    }

    private val listWithGroupsHandler: Handler<UsageListWithGroupsPage.Response> =
        jsonHandler<UsageListWithGroupsPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch aggregated usage data for the specified customer, billable-metric, and optional group,
     * broken into intervals of the specified length.
     */
    override fun listWithGroups(
        params: UsageListWithGroupsParams,
        requestOptions: RequestOptions
    ): UsageListWithGroupsPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("usage", "groups")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listWithGroupsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { UsageListWithGroupsPage.of(this, params, it) }
        }
    }
}
