// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.AlertArchiveParams
import com.metronome.api.models.AlertArchiveResponse
import com.metronome.api.models.AlertCreateParams
import com.metronome.api.models.AlertCreateResponse
import com.metronome.api.services.errorHandler
import com.metronome.api.services.json
import com.metronome.api.services.jsonHandler
import com.metronome.api.services.withErrorHandler

class AlertServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AlertService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AlertCreateResponse> =
        jsonHandler<AlertCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new alert */
    override fun create(
        params: AlertCreateParams,
        requestOptions: RequestOptions
    ): AlertCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("alerts", "create")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val archiveHandler: Handler<AlertArchiveResponse> =
        jsonHandler<AlertArchiveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Archive an existing alert */
    override fun archive(
        params: AlertArchiveParams,
        requestOptions: RequestOptions
    ): AlertArchiveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("alerts", "archive")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
