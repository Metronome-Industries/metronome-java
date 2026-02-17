// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts.ratecards

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
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddManyParams
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddManyResponse
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddParams
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddResponse
import com.metronome.api.models.v1.contracts.ratecards.rates.RateListPage
import com.metronome.api.models.v1.contracts.ratecards.rates.RateListPageResponse
import com.metronome.api.models.v1.contracts.ratecards.rates.RateListParams
import java.util.function.Consumer

class RateServiceImpl internal constructor(private val clientOptions: ClientOptions) : RateService {

    private val withRawResponse: RateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RateService =
        RateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: RateListParams, requestOptions: RequestOptions): RateListPage =
        // post /v1/contract-pricing/rate-cards/getRates
        withRawResponse().list(params, requestOptions).parse()

    override fun add(params: RateAddParams, requestOptions: RequestOptions): RateAddResponse =
        // post /v1/contract-pricing/rate-cards/addRate
        withRawResponse().add(params, requestOptions).parse()

    override fun addMany(
        params: RateAddManyParams,
        requestOptions: RequestOptions,
    ): RateAddManyResponse =
        // post /v1/contract-pricing/rate-cards/addRates
        withRawResponse().addMany(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RateService.WithRawResponse =
            RateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<RateListPageResponse> =
            jsonHandler<RateListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RateListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RateListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "getRates")
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
                        RateListPage.builder()
                            .service(RateServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val addHandler: Handler<RateAddResponse> =
            jsonHandler<RateAddResponse>(clientOptions.jsonMapper)

        override fun add(
            params: RateAddParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RateAddResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "addRate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { addHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val addManyHandler: Handler<RateAddManyResponse> =
            jsonHandler<RateAddManyResponse>(clientOptions.jsonMapper)

        override fun addMany(
            params: RateAddManyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RateAddManyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "addRates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
