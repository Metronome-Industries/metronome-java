// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.contracts

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
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.ContractNamedScheduleRetrieveParams
import com.metronome.api.models.ContractNamedScheduleRetrieveResponse
import com.metronome.api.models.ContractNamedScheduleUpdateParams

class NamedScheduleServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : NamedScheduleService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ContractNamedScheduleRetrieveResponse> =
        jsonHandler<ContractNamedScheduleRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Get a named schedule for the given rate card. This endpoint's availability is dependent on
     * your client's configuration.
     */
    override fun retrieve(
        params: ContractNamedScheduleRetrieveParams,
        requestOptions: RequestOptions
    ): ContractNamedScheduleRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "getNamedSchedule")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Update a named schedule for the given rate card. This endpoint's availability is dependent on
     * your client's configuration.
     */
    override fun update(params: ContractNamedScheduleUpdateParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "updateNamedSchedule")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { updateHandler.handle(it) }
        }
    }
}
