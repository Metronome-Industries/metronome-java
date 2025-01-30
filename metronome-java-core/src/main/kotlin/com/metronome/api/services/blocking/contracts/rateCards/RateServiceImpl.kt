// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.contracts.rateCards

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
import com.metronome.api.models.ContractRateCardRateAddManyParams
import com.metronome.api.models.ContractRateCardRateAddManyResponse
import com.metronome.api.models.ContractRateCardRateAddParams
import com.metronome.api.models.ContractRateCardRateAddResponse
import com.metronome.api.models.ContractRateCardRateListPage
import com.metronome.api.models.ContractRateCardRateListParams

class RateServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : RateService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<ContractRateCardRateListPage.Response> =
        jsonHandler<ContractRateCardRateListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get all rates for a rate card at a point in time */
    override fun list(
        params: ContractRateCardRateListParams,
        requestOptions: RequestOptions
    ): ContractRateCardRateListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "getRates")
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
                .let { ContractRateCardRateListPage.of(this, params, it) }
        }
    }

    private val addHandler: Handler<ContractRateCardRateAddResponse> =
        jsonHandler<ContractRateCardRateAddResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Add a new rate */
    override fun add(
        params: ContractRateCardRateAddParams,
        requestOptions: RequestOptions
    ): ContractRateCardRateAddResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "addRate")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { addHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val addManyHandler: Handler<ContractRateCardRateAddManyResponse> =
        jsonHandler<ContractRateCardRateAddManyResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Add new rates */
    override fun addMany(
        params: ContractRateCardRateAddManyParams,
        requestOptions: RequestOptions
    ): ContractRateCardRateAddManyResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "addRates")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { addManyHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
