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
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.ContractRateCardProductOrderSetParams
import com.metronome.api.models.ContractRateCardProductOrderSetResponse
import com.metronome.api.models.ContractRateCardProductOrderUpdateParams
import com.metronome.api.models.ContractRateCardProductOrderUpdateResponse

class ProductOrderServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ProductOrderService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val updateHandler: Handler<ContractRateCardProductOrderUpdateResponse> =
        jsonHandler<ContractRateCardProductOrderUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Updates ordering of specified products */
    override fun update(
        params: ContractRateCardProductOrderUpdateParams,
        requestOptions: RequestOptions
    ): ContractRateCardProductOrderUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "moveRateCardProducts")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val setHandler: Handler<ContractRateCardProductOrderSetResponse> =
        jsonHandler<ContractRateCardProductOrderSetResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Sets the ordering of products within a rate card */
    override fun set(
        params: ContractRateCardProductOrderSetParams,
        requestOptions: RequestOptions
    ): ContractRateCardProductOrderSetResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "setRateCardProductsOrder")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { setHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
