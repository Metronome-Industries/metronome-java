// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.customers

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.CustomerPlanAddParams
import com.metronome.api.models.CustomerPlanAddResponse
import com.metronome.api.models.CustomerPlanEndParams
import com.metronome.api.models.CustomerPlanEndResponse
import com.metronome.api.models.CustomerPlanListPage
import com.metronome.api.models.CustomerPlanListParams
import com.metronome.api.models.CustomerPlanListPriceAdjustmentsPage
import com.metronome.api.models.CustomerPlanListPriceAdjustmentsParams

class PlanServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : PlanService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<CustomerPlanListPage.Response> =
        jsonHandler<CustomerPlanListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the given customer's plans in reverse-chronological order. */
    override fun list(
        params: CustomerPlanListParams,
        requestOptions: RequestOptions
    ): CustomerPlanListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0), "plans")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerPlanListPage.of(this, params, it) }
        }
    }

    private val addHandler: Handler<CustomerPlanAddResponse> =
        jsonHandler<CustomerPlanAddResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Associate an existing customer with a plan for a specified date range. See the
     * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details on the price adjustments.
     */
    override fun add(
        params: CustomerPlanAddParams,
        requestOptions: RequestOptions
    ): CustomerPlanAddResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customers", params.getPathParam(0), "plans", "add")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { addHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val endHandler: Handler<CustomerPlanEndResponse> =
        jsonHandler<CustomerPlanEndResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Change the end date of a customer's plan. */
    override fun end(
        params: CustomerPlanEndParams,
        requestOptions: RequestOptions
    ): CustomerPlanEndResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "customers",
                    params.getPathParam(0),
                    "plans",
                    params.getPathParam(1),
                    "end"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { endHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listPriceAdjustmentsHandler:
        Handler<CustomerPlanListPriceAdjustmentsPage.Response> =
        jsonHandler<CustomerPlanListPriceAdjustmentsPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Lists a customer plans adjustments. See the
     * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details.
     */
    override fun listPriceAdjustments(
        params: CustomerPlanListPriceAdjustmentsParams,
        requestOptions: RequestOptions
    ): CustomerPlanListPriceAdjustmentsPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "customers",
                    params.getPathParam(0),
                    "plans",
                    params.getPathParam(1),
                    "priceAdjustments"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listPriceAdjustmentsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerPlanListPriceAdjustmentsPage.of(this, params, it) }
        }
    }
}
