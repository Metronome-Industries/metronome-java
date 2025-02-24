// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.contracts

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
import com.metronome.api.models.ContractRateCardCreateParams
import com.metronome.api.models.ContractRateCardCreateResponse
import com.metronome.api.models.ContractRateCardListPageAsync
import com.metronome.api.models.ContractRateCardListParams
import com.metronome.api.models.ContractRateCardRetrieveParams
import com.metronome.api.models.ContractRateCardRetrieveRateScheduleParams
import com.metronome.api.models.ContractRateCardRetrieveRateScheduleResponse
import com.metronome.api.models.ContractRateCardRetrieveResponse
import com.metronome.api.models.ContractRateCardUpdateParams
import com.metronome.api.models.ContractRateCardUpdateResponse
import com.metronome.api.services.async.contracts.rateCards.NamedScheduleServiceAsync
import com.metronome.api.services.async.contracts.rateCards.NamedScheduleServiceAsyncImpl
import com.metronome.api.services.async.contracts.rateCards.ProductOrderServiceAsync
import com.metronome.api.services.async.contracts.rateCards.ProductOrderServiceAsyncImpl
import com.metronome.api.services.async.contracts.rateCards.RateServiceAsync
import com.metronome.api.services.async.contracts.rateCards.RateServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class RateCardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RateCardServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val productOrders: ProductOrderServiceAsync by lazy {
        ProductOrderServiceAsyncImpl(clientOptions)
    }

    private val rates: RateServiceAsync by lazy { RateServiceAsyncImpl(clientOptions) }

    private val namedSchedules: NamedScheduleServiceAsync by lazy {
        NamedScheduleServiceAsyncImpl(clientOptions)
    }

    override fun productOrders(): ProductOrderServiceAsync = productOrders

    override fun rates(): RateServiceAsync = rates

    override fun namedSchedules(): NamedScheduleServiceAsync = namedSchedules

    private val createHandler: Handler<ContractRateCardCreateResponse> =
        jsonHandler<ContractRateCardCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a new rate card */
    override fun create(
        params: ContractRateCardCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContractRateCardCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "create")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<ContractRateCardRetrieveResponse> =
        jsonHandler<ContractRateCardRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Get a specific rate card NOTE: Use `/contract-pricing/rate-cards/getRates` to retrieve rate
     * card rates.
     */
    override fun retrieve(
        params: ContractRateCardRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContractRateCardRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "get")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<ContractRateCardUpdateResponse> =
        jsonHandler<ContractRateCardUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update a rate card */
    override fun update(
        params: ContractRateCardUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContractRateCardUpdateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "update")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<ContractRateCardListPageAsync.Response> =
        jsonHandler<ContractRateCardListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List rate cards NOTE: Use `/contract-pricing/rate-cards/getRates` to retrieve rate card
     * rates.
     */
    override fun list(
        params: ContractRateCardListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContractRateCardListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "list")
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
                    .let { ContractRateCardListPageAsync.of(this, params, it) }
            }
    }

    private val retrieveRateScheduleHandler: Handler<ContractRateCardRetrieveRateScheduleResponse> =
        jsonHandler<ContractRateCardRetrieveRateScheduleResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Get all rates for a rate card from starting_at (either in perpetuity or until ending_before,
     * if provided)
     */
    override fun retrieveRateSchedule(
        params: ContractRateCardRetrieveRateScheduleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContractRateCardRetrieveRateScheduleResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "getRateSchedule")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveRateScheduleHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
