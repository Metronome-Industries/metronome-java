// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts.rateCards

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
import com.metronome.api.models.V1ContractRateCardProductOrderSetParams
import com.metronome.api.models.V1ContractRateCardProductOrderSetResponse
import com.metronome.api.models.V1ContractRateCardProductOrderUpdateParams
import com.metronome.api.models.V1ContractRateCardProductOrderUpdateResponse

class ProductOrderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductOrderService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val updateHandler: Handler<V1ContractRateCardProductOrderUpdateResponse> =
        jsonHandler<V1ContractRateCardProductOrderUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * The ordering of products on a rate card determines the order in which the products will
     * appear on customers' invoices. Use this endpoint to set the order of specific products on the
     * rate card by moving them relative to their current location.
     */
    override fun update(
        params: V1ContractRateCardProductOrderUpdateParams,
        requestOptions: RequestOptions,
    ): V1ContractRateCardProductOrderUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "rate-cards", "moveRateCardProducts")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val setHandler: Handler<V1ContractRateCardProductOrderSetResponse> =
        jsonHandler<V1ContractRateCardProductOrderSetResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * The ordering of products on a rate card determines the order in which the products will
     * appear on customers' invoices. Use this endpoint to set the order of products on the rate
     * card.
     */
    override fun set(
        params: V1ContractRateCardProductOrderSetParams,
        requestOptions: RequestOptions,
    ): V1ContractRateCardProductOrderSetResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "rate-cards", "setRateCardProductsOrder")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { setHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
