// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.AlertArchiveParams
import com.metronome.api.models.AlertArchiveResponse
import com.metronome.api.models.AlertCreateParams
import com.metronome.api.models.AlertCreateResponse

class AlertServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AlertService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AlertCreateResponse> =
        jsonHandler<AlertCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new alert */
    override fun create(
        params: AlertCreateParams,
        requestOptions: RequestOptions,
    ): AlertCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("alerts", "create")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val archiveHandler: Handler<AlertArchiveResponse> =
        jsonHandler<AlertArchiveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Archive an existing alert */
    override fun archive(
        params: AlertArchiveParams,
        requestOptions: RequestOptions,
    ): AlertArchiveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("alerts", "archive")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { archiveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
