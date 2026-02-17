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
import com.metronome.api.core.http.parseable
import com.metronome.api.core.prepare
import com.metronome.api.models.v1.plans.PlanGetDetailsParams
import com.metronome.api.models.v1.plans.PlanGetDetailsResponse
import com.metronome.api.models.v1.plans.PlanListChargesPage
import com.metronome.api.models.v1.plans.PlanListChargesPageResponse
import com.metronome.api.models.v1.plans.PlanListChargesParams
import com.metronome.api.models.v1.plans.PlanListCustomersPage
import com.metronome.api.models.v1.plans.PlanListCustomersPageResponse
import com.metronome.api.models.v1.plans.PlanListCustomersParams
import com.metronome.api.models.v1.plans.PlanListPage
import com.metronome.api.models.v1.plans.PlanListPageResponse
import com.metronome.api.models.v1.plans.PlanListParams
import java.util.function.Consumer

class PlanServiceImpl internal constructor(private val clientOptions: ClientOptions) : PlanService {

    private val withRawResponse: PlanService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlanService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService =
        PlanServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: PlanListParams, requestOptions: RequestOptions): PlanListPage =
        // get /v1/plans
        withRawResponse().list(params, requestOptions).parse()

    override fun getDetails(
        params: PlanGetDetailsParams,
        requestOptions: RequestOptions,
    ): PlanGetDetailsResponse =
        // get /v1/planDetails/{plan_id}
        withRawResponse().getDetails(params, requestOptions).parse()

    override fun listCharges(
        params: PlanListChargesParams,
        requestOptions: RequestOptions,
    ): PlanListChargesPage =
        // get /v1/planDetails/{plan_id}/charges
        withRawResponse().listCharges(params, requestOptions).parse()

    override fun listCustomers(
        params: PlanListCustomersParams,
        requestOptions: RequestOptions,
    ): PlanListCustomersPage =
        // get /v1/planDetails/{plan_id}/customers
        withRawResponse().listCustomers(params, requestOptions).parse()

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
                    .addPathSegments("v1", "plans")
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

        private val getDetailsHandler: Handler<PlanGetDetailsResponse> =
            jsonHandler<PlanGetDetailsResponse>(clientOptions.jsonMapper)

        override fun getDetails(
            params: PlanGetDetailsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGetDetailsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "planDetails", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDetailsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listChargesHandler: Handler<PlanListChargesPageResponse> =
            jsonHandler<PlanListChargesPageResponse>(clientOptions.jsonMapper)

        override fun listCharges(
            params: PlanListChargesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanListChargesPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "planDetails", params._pathParam(0), "charges")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listChargesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PlanListChargesPage.builder()
                            .service(PlanServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listCustomersHandler: Handler<PlanListCustomersPageResponse> =
            jsonHandler<PlanListCustomersPageResponse>(clientOptions.jsonMapper)

        override fun listCustomers(
            params: PlanListCustomersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanListCustomersPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "planDetails", params._pathParam(0), "customers")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listCustomersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PlanListCustomersPage.builder()
                            .service(PlanServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
