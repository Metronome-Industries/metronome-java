// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.contracts

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
import com.metronome.api.models.ContractRateCardCreateParams
import com.metronome.api.models.ContractRateCardCreateResponse
import com.metronome.api.models.ContractRateCardListPage
import com.metronome.api.models.ContractRateCardListParams
import com.metronome.api.models.ContractRateCardRetrieveParams
import com.metronome.api.models.ContractRateCardRetrieveRateScheduleParams
import com.metronome.api.models.ContractRateCardRetrieveRateScheduleResponse
import com.metronome.api.models.ContractRateCardRetrieveResponse
import com.metronome.api.models.ContractRateCardUpdateParams
import com.metronome.api.models.ContractRateCardUpdateResponse
import com.metronome.api.services.blocking.contracts.rateCards.NamedScheduleService
import com.metronome.api.services.blocking.contracts.rateCards.NamedScheduleServiceImpl
import com.metronome.api.services.blocking.contracts.rateCards.ProductOrderService
import com.metronome.api.services.blocking.contracts.rateCards.ProductOrderServiceImpl
import com.metronome.api.services.blocking.contracts.rateCards.RateService
import com.metronome.api.services.blocking.contracts.rateCards.RateServiceImpl

class RateCardServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RateCardService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val productOrders: ProductOrderService by lazy {
        ProductOrderServiceImpl(clientOptions)
    }

    private val rates: RateService by lazy { RateServiceImpl(clientOptions) }

    private val namedSchedules: NamedScheduleService by lazy {
        NamedScheduleServiceImpl(clientOptions)
    }

    override fun productOrders(): ProductOrderService = productOrders

    override fun rates(): RateService = rates

    override fun namedSchedules(): NamedScheduleService = namedSchedules

    private val createHandler: Handler<ContractRateCardCreateResponse> =
        jsonHandler<ContractRateCardCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a new rate card */
    override fun create(
        params: ContractRateCardCreateParams,
        requestOptions: RequestOptions
    ): ContractRateCardCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "create")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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

    private val retrieveHandler: Handler<ContractRateCardRetrieveResponse> =
        jsonHandler<ContractRateCardRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Get a specific rate card NOTE: Use `/contract-pricing/rate-cards/getRates` to retrieve rate
     * card rates.
     */
    override fun retrieve(
        params: ContractRateCardRetrieveParams,
        requestOptions: RequestOptions
    ): ContractRateCardRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "get")
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

    private val updateHandler: Handler<ContractRateCardUpdateResponse> =
        jsonHandler<ContractRateCardUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update a rate card */
    override fun update(
        params: ContractRateCardUpdateParams,
        requestOptions: RequestOptions
    ): ContractRateCardUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "update")
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

    private val listHandler: Handler<ContractRateCardListPage.Response> =
        jsonHandler<ContractRateCardListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List rate cards NOTE: Use `/contract-pricing/rate-cards/getRates` to retrieve rate card
     * rates.
     */
    override fun list(
        params: ContractRateCardListParams,
        requestOptions: RequestOptions
    ): ContractRateCardListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "list")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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
                .let { ContractRateCardListPage.of(this, params, it) }
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
        requestOptions: RequestOptions
    ): ContractRateCardRetrieveRateScheduleResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "getRateSchedule")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveRateScheduleHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
