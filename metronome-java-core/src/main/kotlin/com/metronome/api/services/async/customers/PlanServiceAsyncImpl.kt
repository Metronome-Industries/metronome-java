// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.customers

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
import com.metronome.api.models.CustomerPlanListPageAsync
import com.metronome.api.models.CustomerPlanListParams
import com.metronome.api.models.CustomerPlanListPriceAdjustmentsPageAsync
import com.metronome.api.models.CustomerPlanListPriceAdjustmentsParams
import java.util.concurrent.CompletableFuture

class PlanServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : PlanServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<CustomerPlanListPageAsync.Response> =
        jsonHandler<CustomerPlanListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the given customer's plans in reverse-chronological order. */
    override fun list(
        params: CustomerPlanListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerPlanListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0), "plans")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerPlanListPageAsync.of(this, params, it) }
        }
    }

    private val addHandler: Handler<CustomerPlanAddResponse> =
        jsonHandler<CustomerPlanAddResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Associate an existing customer with a plan for a specified date range. See the
     * [price adjustments documentation](https://docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details on the price adjustments.
     */
    override fun add(
        params: CustomerPlanAddParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerPlanAddResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customers", params.getPathParam(0), "plans", "add")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
    ): CompletableFuture<CustomerPlanEndResponse> {
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
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
        Handler<CustomerPlanListPriceAdjustmentsPageAsync.Response> =
        jsonHandler<CustomerPlanListPriceAdjustmentsPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Lists a customer plans adjustments. See the
     * [price adjustments documentation](https://docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details.
     */
    override fun listPriceAdjustments(
        params: CustomerPlanListPriceAdjustmentsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomerPlanListPriceAdjustmentsPageAsync> {
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
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listPriceAdjustmentsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerPlanListPriceAdjustmentsPageAsync.of(this, params, it) }
        }
    }
}
