// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.UsageListParams
import com.metronome.api.models.UsageListResponse
import com.metronome.api.models.UsageListWithGroupsParams
import com.metronome.api.models.UsageListWithGroupsResponse
import com.metronome.api.services.errorHandler
import com.metronome.api.services.json
import com.metronome.api.services.jsonHandler
import com.metronome.api.services.withErrorHandler

class UsageServiceImpl
constructor(
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
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
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

    private val listWithGroupsHandler: Handler<UsageListWithGroupsResponse> =
        jsonHandler<UsageListWithGroupsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch aggregated usage data for the specified customer, billable-metric, and optional group,
     * broken into intervals of the specified length.
     */
    override fun listWithGroups(
        params: UsageListWithGroupsParams,
        requestOptions: RequestOptions
    ): UsageListWithGroupsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("usage", "groups")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listWithGroupsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
