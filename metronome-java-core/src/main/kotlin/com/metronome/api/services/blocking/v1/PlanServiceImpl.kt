// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1PlanGetDetailsParams
import com.metronome.api.models.V1PlanGetDetailsResponse
import com.metronome.api.models.V1PlanListChargesPage
import com.metronome.api.models.V1PlanListChargesParams
import com.metronome.api.models.V1PlanListCustomersPage
import com.metronome.api.models.V1PlanListCustomersParams
import com.metronome.api.models.V1PlanListPage
import com.metronome.api.models.V1PlanListParams

class PlanServiceImpl internal constructor(private val clientOptions: ClientOptions) : PlanService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<V1PlanListPage.Response> =
        jsonHandler<V1PlanListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List all available plans. This is a Plans (deprecated) endpoint. New clients should implement
     * using Contracts.
     */
    override fun list(params: V1PlanListParams, requestOptions: RequestOptions): V1PlanListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "plans")
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
            .let { V1PlanListPage.of(this, params, it) }
    }

    private val getDetailsHandler: Handler<V1PlanGetDetailsResponse> =
        jsonHandler<V1PlanGetDetailsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch high level details of a specific plan. This is a Plans (deprecated) endpoint. New
     * clients should implement using Contracts.
     */
    override fun getDetails(
        params: V1PlanGetDetailsParams,
        requestOptions: RequestOptions,
    ): V1PlanGetDetailsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "planDetails", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { getDetailsHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listChargesHandler: Handler<V1PlanListChargesPage.Response> =
        jsonHandler<V1PlanListChargesPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetches a list of charges of a specific plan. This is a Plans (deprecated) endpoint. New
     * clients should implement using Contracts.
     */
    override fun listCharges(
        params: V1PlanListChargesParams,
        requestOptions: RequestOptions,
    ): V1PlanListChargesPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "planDetails", params.getPathParam(0), "charges")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listChargesHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { V1PlanListChargesPage.of(this, params, it) }
    }

    private val listCustomersHandler: Handler<V1PlanListCustomersPage.Response> =
        jsonHandler<V1PlanListCustomersPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetches a list of customers on a specific plan (by default, only currently active plans are
     * included). This is a Plans (deprecated) endpoint. New clients should implement using
     * Contracts.
     */
    override fun listCustomers(
        params: V1PlanListCustomersParams,
        requestOptions: RequestOptions,
    ): V1PlanListCustomersPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "planDetails", params.getPathParam(0), "customers")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listCustomersHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { V1PlanListCustomersPage.of(this, params, it) }
    }
}
