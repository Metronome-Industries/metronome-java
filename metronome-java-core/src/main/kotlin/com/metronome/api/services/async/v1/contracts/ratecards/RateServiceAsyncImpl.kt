// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.contracts.ratecards

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorBodyHandler
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.core.http.json
import com.metronome.api.core.http.parseable
import com.metronome.api.core.prepareAsync
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddManyParams
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddManyResponse
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddParams
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddResponse
import com.metronome.api.models.v1.contracts.ratecards.rates.RateListPageAsync
import com.metronome.api.models.v1.contracts.ratecards.rates.RateListPageResponse
import com.metronome.api.models.v1.contracts.ratecards.rates.RateListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class RateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RateServiceAsync {

    private val withRawResponse: RateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RateServiceAsync =
        RateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: RateListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RateListPageAsync> =
        // post /v1/contract-pricing/rate-cards/getRates
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun add(
        params: RateAddParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RateAddResponse> =
        // post /v1/contract-pricing/rate-cards/addRate
        withRawResponse().add(params, requestOptions).thenApply { it.parse() }

    override fun addMany(
        params: RateAddManyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RateAddManyResponse> =
        // post /v1/contract-pricing/rate-cards/addRates
        withRawResponse().addMany(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RateServiceAsync.WithRawResponse =
            RateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<RateListPageResponse> =
            jsonHandler<RateListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RateListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RateListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "getRates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                RateListPageAsync.builder()
                                    .service(RateServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val addHandler: Handler<RateAddResponse> =
            jsonHandler<RateAddResponse>(clientOptions.jsonMapper)

        override fun add(
            params: RateAddParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RateAddResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "addRate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val addManyHandler: Handler<RateAddManyResponse> =
            jsonHandler<RateAddManyResponse>(clientOptions.jsonMapper)

        override fun addMany(
            params: RateAddManyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RateAddManyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "addRates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addManyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
