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
import com.metronome.api.models.v1.customers.plans.PlanAddParams
import com.metronome.api.models.v1.customers.plans.PlanAddResponse
import com.metronome.api.models.v1.customers.plans.PlanEndParams
import com.metronome.api.models.v1.customers.plans.PlanEndResponse
import com.metronome.api.models.v1.customers.plans.PlanListPage
import com.metronome.api.models.v1.customers.plans.PlanListPageResponse
import com.metronome.api.models.v1.customers.plans.PlanListParams
import com.metronome.api.models.v1.customers.plans.PlanListPriceAdjustmentsPage
import com.metronome.api.models.v1.customers.plans.PlanListPriceAdjustmentsPageResponse
import com.metronome.api.models.v1.customers.plans.PlanListPriceAdjustmentsParams
import java.util.function.Consumer

/**
 * [Plans](https://docs.metronome.com/pricing-and-packaging/create-plans/) determine the base
 * pricing for a customer. Use these endpoints to add a plan to a customer, end a customer plan,
 * retrieve plans, and retrieve plan details. Create plans in the
 * [Metronome app](https://app.metronome.com/plans).
 */
class PlanServiceImpl internal constructor(private val clientOptions: ClientOptions) : PlanService {

    private val withRawResponse: PlanService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlanService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService =
        PlanServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: PlanListParams, requestOptions: RequestOptions): PlanListPage =
        // get /v1/customers/{customer_id}/plans
        withRawResponse().list(params, requestOptions).parse()

    override fun add(params: PlanAddParams, requestOptions: RequestOptions): PlanAddResponse =
        // post /v1/customers/{customer_id}/plans/add
        withRawResponse().add(params, requestOptions).parse()

    override fun end(params: PlanEndParams, requestOptions: RequestOptions): PlanEndResponse =
        // post /v1/customers/{customer_id}/plans/{customer_plan_id}/end
        withRawResponse().end(params, requestOptions).parse()

    override fun listPriceAdjustments(
        params: PlanListPriceAdjustmentsParams,
        requestOptions: RequestOptions,
    ): PlanListPriceAdjustmentsPage =
        // get /v1/customers/{customer_id}/plans/{customer_plan_id}/priceAdjustments
        withRawResponse().listPriceAdjustments(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlanService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlanService.WithRawResponse =
            PlanServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<PlanListPageResponse> =
            jsonHandler<PlanListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PlanListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "plans")
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
                        PlanListPage.builder()
                            .service(PlanServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val addHandler: Handler<PlanAddResponse> =
            jsonHandler<PlanAddResponse>(clientOptions.jsonMapper)

        override fun add(
            params: PlanAddParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanAddResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customers", params._pathParam(0), "plans", "add")
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

        private val endHandler: Handler<PlanEndResponse> =
            jsonHandler<PlanEndResponse>(clientOptions.jsonMapper)

        override fun end(
            params: PlanEndParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanEndResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { endHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listPriceAdjustmentsHandler: Handler<PlanListPriceAdjustmentsPageResponse> =
            jsonHandler<PlanListPriceAdjustmentsPageResponse>(clientOptions.jsonMapper)

        override fun listPriceAdjustments(
            params: PlanListPriceAdjustmentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanListPriceAdjustmentsPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listPriceAdjustmentsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PlanListPriceAdjustmentsPage.builder()
                            .service(PlanServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
