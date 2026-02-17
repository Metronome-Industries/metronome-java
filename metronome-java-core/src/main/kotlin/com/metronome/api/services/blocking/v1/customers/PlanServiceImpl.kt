// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1CustomerPlanAddParams
import com.metronome.api.models.V1CustomerPlanAddResponse
import com.metronome.api.models.V1CustomerPlanEndParams
import com.metronome.api.models.V1CustomerPlanEndResponse
import com.metronome.api.models.V1CustomerPlanListPage
import com.metronome.api.models.V1CustomerPlanListParams
import com.metronome.api.models.V1CustomerPlanListPriceAdjustmentsPage
import com.metronome.api.models.V1CustomerPlanListPriceAdjustmentsParams

class PlanServiceImpl internal constructor(private val clientOptions: ClientOptions) : PlanService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<V1CustomerPlanListPage.Response> =
        jsonHandler<V1CustomerPlanListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List the given customer's plans in reverse-chronological order. This is a Plans (deprecated)
     * endpoint. New clients should implement using Contracts.
     */
    override fun list(
        params: V1CustomerPlanListParams,
        requestOptions: RequestOptions,
    ): V1CustomerPlanListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "customers", params.getPathParam(0), "plans")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { V1CustomerPlanListPage.of(this, params, it) }
    }

    private val addHandler: Handler<V1CustomerPlanAddResponse> =
        jsonHandler<V1CustomerPlanAddResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Associate an existing customer with a plan for a specified date range. See the
     * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details on the price adjustments. This is a Plans (deprecated) endpoint. New clients
     * should implement using Contracts.
     */
    override fun add(
        params: V1CustomerPlanAddParams,
        requestOptions: RequestOptions,
    ): V1CustomerPlanAddResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "customers", params.getPathParam(0), "plans", "add")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { addHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val endHandler: Handler<V1CustomerPlanEndResponse> =
        jsonHandler<V1CustomerPlanEndResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Change the end date of a customer's plan. This is a Plans (deprecated) endpoint. New clients
     * should implement using Contracts.
     */
    override fun end(
        params: V1CustomerPlanEndParams,
        requestOptions: RequestOptions,
    ): V1CustomerPlanEndResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "v1",
                    "customers",
                    params.getPathParam(0),
                    "plans",
                    params.getPathParam(1),
                    "end",
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { endHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listPriceAdjustmentsHandler:
        Handler<V1CustomerPlanListPriceAdjustmentsPage.Response> =
        jsonHandler<V1CustomerPlanListPriceAdjustmentsPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Lists a customer plans adjustments. See the
     * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details. This is a Plans (deprecated) endpoint. New clients should implement using
     * Contracts.
     */
    override fun listPriceAdjustments(
        params: V1CustomerPlanListPriceAdjustmentsParams,
        requestOptions: RequestOptions,
    ): V1CustomerPlanListPriceAdjustmentsPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v1",
                    "customers",
                    params.getPathParam(0),
                    "plans",
                    params.getPathParam(1),
                    "priceAdjustments",
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listPriceAdjustmentsHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { V1CustomerPlanListPriceAdjustmentsPage.of(this, params, it) }
    }
}
