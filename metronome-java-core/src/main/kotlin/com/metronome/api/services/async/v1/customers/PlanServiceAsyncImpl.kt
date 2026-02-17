// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.customers

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
import com.metronome.api.models.v1.customers.plans.PlanAddParams
import com.metronome.api.models.v1.customers.plans.PlanAddResponse
import com.metronome.api.models.v1.customers.plans.PlanEndParams
import com.metronome.api.models.v1.customers.plans.PlanEndResponse
import com.metronome.api.models.v1.customers.plans.PlanListPageAsync
import com.metronome.api.models.v1.customers.plans.PlanListPageResponse
import com.metronome.api.models.v1.customers.plans.PlanListParams
import com.metronome.api.models.v1.customers.plans.PlanListPriceAdjustmentsPageAsync
import com.metronome.api.models.v1.customers.plans.PlanListPriceAdjustmentsPageResponse
import com.metronome.api.models.v1.customers.plans.PlanListPriceAdjustmentsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PlanServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlanServiceAsync {

    private val withRawResponse: PlanServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlanServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanServiceAsync =
        PlanServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: PlanListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanListPageAsync> =
        // get /v1/customers/{customer_id}/plans
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun add(
        params: PlanAddParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanAddResponse> =
        // post /v1/customers/{customer_id}/plans/add
        withRawResponse().add(params, requestOptions).thenApply { it.parse() }

    override fun end(
        params: PlanEndParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanEndResponse> =
        // post /v1/customers/{customer_id}/plans/{customer_plan_id}/end
        withRawResponse().end(params, requestOptions).thenApply { it.parse() }

    override fun listPriceAdjustments(
        params: PlanListPriceAdjustmentsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanListPriceAdjustmentsPageAsync> =
        // get /v1/customers/{customer_id}/plans/{customer_plan_id}/priceAdjustments
        withRawResponse().listPriceAdjustments(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlanServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlanServiceAsync.WithRawResponse =
            PlanServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<PlanListPageResponse> =
            jsonHandler<PlanListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PlanListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "plans")
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
                                PlanListPageAsync.builder()
                                    .service(PlanServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val addHandler: Handler<PlanAddResponse> =
            jsonHandler<PlanAddResponse>(clientOptions.jsonMapper)

        override fun add(
            params: PlanAddParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanAddResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "plans", "add")
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

        private val endHandler: Handler<PlanEndResponse> =
            jsonHandler<PlanEndResponse>(clientOptions.jsonMapper)

        override fun end(
            params: PlanEndParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanEndResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "plans",
                        params._pathParam(1),
                        "end",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { endHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listPriceAdjustmentsHandler: Handler<PlanListPriceAdjustmentsPageResponse> =
            jsonHandler<PlanListPriceAdjustmentsPageResponse>(clientOptions.jsonMapper)

        override fun listPriceAdjustments(
            params: PlanListPriceAdjustmentsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanListPriceAdjustmentsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "plans",
                        params._pathParam(1),
                        "priceAdjustments",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listPriceAdjustmentsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PlanListPriceAdjustmentsPageAsync.builder()
                                    .service(PlanServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
