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
import com.metronome.api.core.prepareAsync
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

class PlanServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlanServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<CustomerPlanListPageAsync.Response> =
        jsonHandler<CustomerPlanListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the given customer's plans in reverse-chronological order. */
    override fun list(
        params: CustomerPlanListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerPlanListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0), "plans")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
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
     * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details on the price adjustments.
     */
    override fun add(
        params: CustomerPlanAddParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerPlanAddResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customers", params.getPathParam(0), "plans", "add")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { addHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
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
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerPlanEndResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "customers",
                    params.getPathParam(0),
                    "plans",
                    params.getPathParam(1),
                    "end",
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { endHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
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
     * [price adjustments documentation](https://plans-docs.metronome.com/pricing/managing-plans/#price-adjustments)
     * for details.
     */
    override fun listPriceAdjustments(
        params: CustomerPlanListPriceAdjustmentsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerPlanListPriceAdjustmentsPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "customers",
                    params.getPathParam(0),
                    "plans",
                    params.getPathParam(1),
                    "priceAdjustments",
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listPriceAdjustmentsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { CustomerPlanListPriceAdjustmentsPageAsync.of(this, params, it) }
            }
    }
}
