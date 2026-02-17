// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

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
import com.metronome.api.models.v1.customers.credits.CreditCreateParams
import com.metronome.api.models.v1.customers.credits.CreditCreateResponse
import com.metronome.api.models.v1.customers.credits.CreditListPage
import com.metronome.api.models.v1.customers.credits.CreditListPageResponse
import com.metronome.api.models.v1.customers.credits.CreditListParams
import com.metronome.api.models.v1.customers.credits.CreditUpdateEndDateParams
import com.metronome.api.models.v1.customers.credits.CreditUpdateEndDateResponse
import java.util.function.Consumer

class CreditServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditService {

    private val withRawResponse: CreditService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CreditService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditService =
        CreditServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CreditCreateParams,
        requestOptions: RequestOptions,
    ): CreditCreateResponse =
        // post /v1/contracts/customerCredits/create
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: CreditListParams, requestOptions: RequestOptions): CreditListPage =
        // post /v1/contracts/customerCredits/list
        withRawResponse().list(params, requestOptions).parse()

    override fun updateEndDate(
        params: CreditUpdateEndDateParams,
        requestOptions: RequestOptions,
    ): CreditUpdateEndDateResponse =
        // post /v1/contracts/customerCredits/updateEndDate
        withRawResponse().updateEndDate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditService.WithRawResponse =
            CreditServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CreditCreateResponse> =
            jsonHandler<CreditCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CreditCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "customerCredits", "create")
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

        private val listHandler: Handler<CreditListPageResponse> =
            jsonHandler<CreditListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CreditListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "customerCredits", "list")
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
                        CreditListPage.builder()
                            .service(CreditServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val updateEndDateHandler: Handler<CreditUpdateEndDateResponse> =
            jsonHandler<CreditUpdateEndDateResponse>(clientOptions.jsonMapper)

        override fun updateEndDate(
            params: CreditUpdateEndDateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditUpdateEndDateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contracts", "customerCredits", "updateEndDate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateEndDateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
