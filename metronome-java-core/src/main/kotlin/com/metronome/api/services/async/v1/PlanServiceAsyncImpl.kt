// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

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
import com.metronome.api.core.http.parseable
import com.metronome.api.core.prepareAsync
import com.metronome.api.models.v1.plans.PlanGetDetailsParams
import com.metronome.api.models.v1.plans.PlanGetDetailsResponse
import com.metronome.api.models.v1.plans.PlanListChargesPageAsync
import com.metronome.api.models.v1.plans.PlanListChargesPageResponse
import com.metronome.api.models.v1.plans.PlanListChargesParams
import com.metronome.api.models.v1.plans.PlanListCustomersPageAsync
import com.metronome.api.models.v1.plans.PlanListCustomersPageResponse
import com.metronome.api.models.v1.plans.PlanListCustomersParams
import com.metronome.api.models.v1.plans.PlanListPageAsync
import com.metronome.api.models.v1.plans.PlanListPageResponse
import com.metronome.api.models.v1.plans.PlanListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * [Plans](https://docs.metronome.com/pricing-and-packaging/create-plans/) determine the base
 * pricing for a customer. Use these endpoints to add a plan to a customer, end a customer plan,
 * retrieve plans, and retrieve plan details. Create plans in the
 * [Metronome app](https://app.metronome.com/plans).
 */
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
        // get /v1/plans
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun getDetails(
        params: PlanGetDetailsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanGetDetailsResponse> =
        // get /v1/planDetails/{plan_id}
        withRawResponse().getDetails(params, requestOptions).thenApply { it.parse() }

    override fun listCharges(
        params: PlanListChargesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanListChargesPageAsync> =
        // get /v1/planDetails/{plan_id}/charges
        withRawResponse().listCharges(params, requestOptions).thenApply { it.parse() }

    override fun listCustomers(
        params: PlanListCustomersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanListCustomersPageAsync> =
        // get /v1/planDetails/{plan_id}/customers
        withRawResponse().listCustomers(params, requestOptions).thenApply { it.parse() }

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
                    .addPathSegments("v1", "plans")
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

        private val getDetailsHandler: Handler<PlanGetDetailsResponse> =
            jsonHandler<PlanGetDetailsResponse>(clientOptions.jsonMapper)

        override fun getDetails(
            params: PlanGetDetailsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanGetDetailsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "planDetails", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDetailsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listChargesHandler: Handler<PlanListChargesPageResponse> =
            jsonHandler<PlanListChargesPageResponse>(clientOptions.jsonMapper)

        override fun listCharges(
            params: PlanListChargesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanListChargesPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "planDetails", params._pathParam(0), "charges")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listChargesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PlanListChargesPageAsync.builder()
                                    .service(PlanServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listCustomersHandler: Handler<PlanListCustomersPageResponse> =
            jsonHandler<PlanListCustomersPageResponse>(clientOptions.jsonMapper)

        override fun listCustomers(
            params: PlanListCustomersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanListCustomersPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "planDetails", params._pathParam(0), "customers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listCustomersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PlanListCustomersPageAsync.builder()
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
