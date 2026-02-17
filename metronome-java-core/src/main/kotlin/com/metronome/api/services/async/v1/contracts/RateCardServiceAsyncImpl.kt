// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.contracts

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
import com.metronome.api.models.v1.contracts.ratecards.RateCardArchiveParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardArchiveResponse
import com.metronome.api.models.v1.contracts.ratecards.RateCardCreateParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardCreateResponse
import com.metronome.api.models.v1.contracts.ratecards.RateCardListPageAsync
import com.metronome.api.models.v1.contracts.ratecards.RateCardListPageResponse
import com.metronome.api.models.v1.contracts.ratecards.RateCardListParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardRetrieveParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardRetrieveRateScheduleParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardRetrieveRateScheduleResponse
import com.metronome.api.models.v1.contracts.ratecards.RateCardRetrieveResponse
import com.metronome.api.models.v1.contracts.ratecards.RateCardUpdateParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardUpdateResponse
import com.metronome.api.services.async.v1.contracts.ratecards.NamedScheduleServiceAsync
import com.metronome.api.services.async.v1.contracts.ratecards.NamedScheduleServiceAsyncImpl
import com.metronome.api.services.async.v1.contracts.ratecards.ProductOrderServiceAsync
import com.metronome.api.services.async.v1.contracts.ratecards.ProductOrderServiceAsyncImpl
import com.metronome.api.services.async.v1.contracts.ratecards.RateServiceAsync
import com.metronome.api.services.async.v1.contracts.ratecards.RateServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class RateCardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RateCardServiceAsync {

    private val withRawResponse: RateCardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val productOrders: ProductOrderServiceAsync by lazy {
        ProductOrderServiceAsyncImpl(clientOptions)
    }

    private val rates: RateServiceAsync by lazy { RateServiceAsyncImpl(clientOptions) }

    private val namedSchedules: NamedScheduleServiceAsync by lazy {
        NamedScheduleServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): RateCardServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RateCardServiceAsync =
        RateCardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun productOrders(): ProductOrderServiceAsync = productOrders

    override fun rates(): RateServiceAsync = rates

    override fun namedSchedules(): NamedScheduleServiceAsync = namedSchedules

    override fun create(
        params: RateCardCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RateCardCreateResponse> =
        // post /v1/contract-pricing/rate-cards/create
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: RateCardRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RateCardRetrieveResponse> =
        // post /v1/contract-pricing/rate-cards/get
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: RateCardUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RateCardUpdateResponse> =
        // post /v1/contract-pricing/rate-cards/update
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: RateCardListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RateCardListPageAsync> =
        // post /v1/contract-pricing/rate-cards/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: RateCardArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RateCardArchiveResponse> =
        // post /v1/contract-pricing/rate-cards/archive
        withRawResponse().archive(params, requestOptions).thenApply { it.parse() }

    override fun retrieveRateSchedule(
        params: RateCardRetrieveRateScheduleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RateCardRetrieveRateScheduleResponse> =
        // post /v1/contract-pricing/rate-cards/getRateSchedule
        withRawResponse().retrieveRateSchedule(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RateCardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val productOrders: ProductOrderServiceAsync.WithRawResponse by lazy {
            ProductOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rates: RateServiceAsync.WithRawResponse by lazy {
            RateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val namedSchedules: NamedScheduleServiceAsync.WithRawResponse by lazy {
            NamedScheduleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RateCardServiceAsync.WithRawResponse =
            RateCardServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun productOrders(): ProductOrderServiceAsync.WithRawResponse = productOrders

        override fun rates(): RateServiceAsync.WithRawResponse = rates

        override fun namedSchedules(): NamedScheduleServiceAsync.WithRawResponse = namedSchedules

        private val createHandler: Handler<RateCardCreateResponse> =
            jsonHandler<RateCardCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RateCardCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RateCardCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<RateCardRetrieveResponse> =
            jsonHandler<RateCardRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RateCardRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RateCardRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "get")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<RateCardUpdateResponse> =
            jsonHandler<RateCardUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: RateCardUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RateCardUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<RateCardListPageResponse> =
            jsonHandler<RateCardListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RateCardListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RateCardListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "list")
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
                                RateCardListPageAsync.builder()
                                    .service(RateCardServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val archiveHandler: Handler<RateCardArchiveResponse> =
            jsonHandler<RateCardArchiveResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: RateCardArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RateCardArchiveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { archiveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveRateScheduleHandler: Handler<RateCardRetrieveRateScheduleResponse> =
            jsonHandler<RateCardRetrieveRateScheduleResponse>(clientOptions.jsonMapper)

        override fun retrieveRateSchedule(
            params: RateCardRetrieveRateScheduleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RateCardRetrieveRateScheduleResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "getRateSchedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveRateScheduleHandler.handle(it) }
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
