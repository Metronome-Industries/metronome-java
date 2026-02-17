// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

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
import com.metronome.api.models.v1.billablemetrics.BillableMetricArchiveParams
import com.metronome.api.models.v1.billablemetrics.BillableMetricArchiveResponse
import com.metronome.api.models.v1.billablemetrics.BillableMetricCreateParams
import com.metronome.api.models.v1.billablemetrics.BillableMetricCreateResponse
import com.metronome.api.models.v1.billablemetrics.BillableMetricListPage
import com.metronome.api.models.v1.billablemetrics.BillableMetricListPageResponse
import com.metronome.api.models.v1.billablemetrics.BillableMetricListParams
import com.metronome.api.models.v1.billablemetrics.BillableMetricRetrieveParams
import com.metronome.api.models.v1.billablemetrics.BillableMetricRetrieveResponse
import java.util.function.Consumer

class BillableMetricServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BillableMetricService {

    private val withRawResponse: BillableMetricService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BillableMetricService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillableMetricService =
        BillableMetricServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BillableMetricCreateParams,
        requestOptions: RequestOptions,
    ): BillableMetricCreateResponse =
        // post /v1/billable-metrics/create
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BillableMetricRetrieveParams,
        requestOptions: RequestOptions,
    ): BillableMetricRetrieveResponse =
        // get /v1/billable-metrics/{billable_metric_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: BillableMetricListParams,
        requestOptions: RequestOptions,
    ): BillableMetricListPage =
        // get /v1/billable-metrics
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(
        params: BillableMetricArchiveParams,
        requestOptions: RequestOptions,
    ): BillableMetricArchiveResponse =
        // post /v1/billable-metrics/archive
        withRawResponse().archive(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BillableMetricService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BillableMetricService.WithRawResponse =
            BillableMetricServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BillableMetricCreateResponse> =
            jsonHandler<BillableMetricCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BillableMetricCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillableMetricCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "billable-metrics", "create")
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

        private val retrieveHandler: Handler<BillableMetricRetrieveResponse> =
            jsonHandler<BillableMetricRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BillableMetricRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillableMetricRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "billable-metrics", params._pathParam(0))
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

        private val listHandler: Handler<BillableMetricListPageResponse> =
            jsonHandler<BillableMetricListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BillableMetricListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillableMetricListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "billable-metrics")
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
                        BillableMetricListPage.builder()
                            .service(BillableMetricServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<BillableMetricArchiveResponse> =
            jsonHandler<BillableMetricArchiveResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: BillableMetricArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillableMetricArchiveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "billable-metrics", "archive")
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
    }
}
