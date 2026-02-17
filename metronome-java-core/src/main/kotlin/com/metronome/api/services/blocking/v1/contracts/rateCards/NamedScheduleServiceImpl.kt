// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts.rateCards

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
import com.metronome.api.models.V1ContractRateCardNamedScheduleRetrieveParams
import com.metronome.api.models.V1ContractRateCardNamedScheduleRetrieveResponse
import com.metronome.api.models.V1ContractRateCardNamedScheduleUpdateParams

class NamedScheduleServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NamedScheduleService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<V1ContractRateCardNamedScheduleRetrieveResponse> =
        jsonHandler<V1ContractRateCardNamedScheduleRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Get a named schedule for the given contract. This endpoint's availability is dependent on
     * your client's configuration.
     */
    override fun retrieve(
        params: V1ContractRateCardNamedScheduleRetrieveParams,
        requestOptions: RequestOptions,
    ): V1ContractRateCardNamedScheduleRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contracts", "getNamedSchedule")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Update a named schedule for the given contract. This endpoint's availability is dependent on
     * your client's configuration.
     */
    override fun update(
        params: V1ContractRateCardNamedScheduleUpdateParams,
        requestOptions: RequestOptions,
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contracts", "updateNamedSchedule")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { updateHandler.handle(it) }
    }
}
