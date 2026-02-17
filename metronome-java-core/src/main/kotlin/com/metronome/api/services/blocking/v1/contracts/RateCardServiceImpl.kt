// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts

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
import com.metronome.api.core.prepare
import com.metronome.api.models.v1.contracts.ratecards.RateCardArchiveParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardArchiveResponse
import com.metronome.api.models.v1.contracts.ratecards.RateCardCreateParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardCreateResponse
import com.metronome.api.models.v1.contracts.ratecards.RateCardListPage
import com.metronome.api.models.v1.contracts.ratecards.RateCardListPageResponse
import com.metronome.api.models.v1.contracts.ratecards.RateCardListParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardRetrieveParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardRetrieveRateScheduleParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardRetrieveRateScheduleResponse
import com.metronome.api.models.v1.contracts.ratecards.RateCardRetrieveResponse
import com.metronome.api.models.v1.contracts.ratecards.RateCardUpdateParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardUpdateResponse
import com.metronome.api.services.blocking.v1.contracts.ratecards.NamedScheduleService
import com.metronome.api.services.blocking.v1.contracts.ratecards.NamedScheduleServiceImpl
import com.metronome.api.services.blocking.v1.contracts.ratecards.ProductOrderService
import com.metronome.api.services.blocking.v1.contracts.ratecards.ProductOrderServiceImpl
import com.metronome.api.services.blocking.v1.contracts.ratecards.RateService
import com.metronome.api.services.blocking.v1.contracts.ratecards.RateServiceImpl
import java.util.function.Consumer

class RateCardServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RateCardService {

    private val withRawResponse: RateCardService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val productOrders: ProductOrderService by lazy {
        ProductOrderServiceImpl(clientOptions)
    }

    private val rates: RateService by lazy { RateServiceImpl(clientOptions) }

    private val namedSchedules: NamedScheduleService by lazy {
        NamedScheduleServiceImpl(clientOptions)
    }

    override fun withRawResponse(): RateCardService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RateCardService =
        RateCardServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun productOrders(): ProductOrderService = productOrders

    override fun rates(): RateService = rates

    override fun namedSchedules(): NamedScheduleService = namedSchedules

    override fun create(
        params: RateCardCreateParams,
        requestOptions: RequestOptions,
    ): RateCardCreateResponse =
        // post /v1/contract-pricing/rate-cards/create
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RateCardRetrieveParams,
        requestOptions: RequestOptions,
    ): RateCardRetrieveResponse =
        // post /v1/contract-pricing/rate-cards/get
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: RateCardUpdateParams,
        requestOptions: RequestOptions,
    ): RateCardUpdateResponse =
        // post /v1/contract-pricing/rate-cards/update
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: RateCardListParams,
        requestOptions: RequestOptions,
    ): RateCardListPage =
        // post /v1/contract-pricing/rate-cards/list
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(
        params: RateCardArchiveParams,
        requestOptions: RequestOptions,
    ): RateCardArchiveResponse =
        // post /v1/contract-pricing/rate-cards/archive
        withRawResponse().archive(params, requestOptions).parse()

    override fun retrieveRateSchedule(
        params: RateCardRetrieveRateScheduleParams,
        requestOptions: RequestOptions,
    ): RateCardRetrieveRateScheduleResponse =
        // post /v1/contract-pricing/rate-cards/getRateSchedule
        withRawResponse().retrieveRateSchedule(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RateCardService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val productOrders: ProductOrderService.WithRawResponse by lazy {
            ProductOrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val rates: RateService.WithRawResponse by lazy {
            RateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val namedSchedules: NamedScheduleService.WithRawResponse by lazy {
            NamedScheduleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RateCardService.WithRawResponse =
            RateCardServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun productOrders(): ProductOrderService.WithRawResponse = productOrders

        override fun rates(): RateService.WithRawResponse = rates

        override fun namedSchedules(): NamedScheduleService.WithRawResponse = namedSchedules

        private val createHandler: Handler<RateCardCreateResponse> =
            jsonHandler<RateCardCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RateCardCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RateCardCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<RateCardRetrieveResponse> =
            jsonHandler<RateCardRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RateCardRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RateCardRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "get")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<RateCardUpdateResponse> =
            jsonHandler<RateCardUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: RateCardUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RateCardUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<RateCardListPageResponse> =
            jsonHandler<RateCardListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RateCardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RateCardListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "list")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        RateCardListPage.builder()
                            .service(RateCardServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<RateCardArchiveResponse> =
            jsonHandler<RateCardArchiveResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: RateCardArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RateCardArchiveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveRateScheduleHandler: Handler<RateCardRetrieveRateScheduleResponse> =
            jsonHandler<RateCardRetrieveRateScheduleResponse>(clientOptions.jsonMapper)

        override fun retrieveRateSchedule(
            params: RateCardRetrieveRateScheduleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RateCardRetrieveRateScheduleResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "getRateSchedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
