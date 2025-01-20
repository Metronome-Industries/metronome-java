// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.contracts.rateCards

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
import com.metronome.api.models.ContractRateCardRateAddManyParams
import com.metronome.api.models.ContractRateCardRateAddManyResponse
import com.metronome.api.models.ContractRateCardRateAddParams
import com.metronome.api.models.ContractRateCardRateAddResponse
import com.metronome.api.models.ContractRateCardRateListPageAsync
import com.metronome.api.models.ContractRateCardRateListParams
import java.util.concurrent.CompletableFuture

class RateServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : RateServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<ContractRateCardRateListPageAsync.Response> =
        jsonHandler<ContractRateCardRateListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get all rates for a rate card at a point in time */
    override fun list(
        params: ContractRateCardRateListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractRateCardRateListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "getRates")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { ContractRateCardRateListPageAsync.of(this, params, it) }
        }
    }

    private val addHandler: Handler<ContractRateCardRateAddResponse> =
        jsonHandler<ContractRateCardRateAddResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Add a new rate */
    override fun add(
        params: ContractRateCardRateAddParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ContractRateCardRateAddResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "addRate")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
    ): CompletableFuture<ContractRateCardRateAddManyResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("contract-pricing", "rate-cards", "addRates")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
