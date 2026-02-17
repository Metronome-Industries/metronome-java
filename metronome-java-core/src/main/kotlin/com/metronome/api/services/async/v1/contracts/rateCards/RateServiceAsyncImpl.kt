// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.contracts.rateCards

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepareAsync
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1ContractRateCardRateAddManyParams
import com.metronome.api.models.V1ContractRateCardRateAddManyResponse
import com.metronome.api.models.V1ContractRateCardRateAddParams
import com.metronome.api.models.V1ContractRateCardRateAddResponse
import com.metronome.api.models.V1ContractRateCardRateListPageAsync
import com.metronome.api.models.V1ContractRateCardRateListParams
import java.util.concurrent.CompletableFuture

class RateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RateServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<V1ContractRateCardRateListPageAsync.Response> =
        jsonHandler<V1ContractRateCardRateListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Understand the rate schedule at a given timestamp, optionally filtering the list of rates
     * returned based on properties such as `product_id` and `pricing_group_values`. For example,
     * you may want to display the current price for a given product in your product experience -
     * use this endpoint to fetch that information from its source of truth in Metronome.
     *
     * If you want to understand the rates for a specific customer's contract, inclusive of
     * contract-level overrides, use the `getContractRateSchedule` endpoint.
     */
    override fun list(
        params: V1ContractRateCardRateListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1ContractRateCardRateListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "rate-cards", "getRates")
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
                    .let { V1ContractRateCardRateListPageAsync.of(this, params, it) }
            }
    }

    private val addHandler: Handler<V1ContractRateCardRateAddResponse> =
        jsonHandler<V1ContractRateCardRateAddResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Add a new rate */
    override fun add(
        params: V1ContractRateCardRateAddParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1ContractRateCardRateAddResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "rate-cards", "addRate")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { addHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val addManyHandler: Handler<V1ContractRateCardRateAddManyResponse> =
        jsonHandler<V1ContractRateCardRateAddManyResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Add new rates */
    override fun addMany(
        params: V1ContractRateCardRateAddManyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1ContractRateCardRateAddManyResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "rate-cards", "addRates")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { addManyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
