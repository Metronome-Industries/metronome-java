// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.PlanGetDetailsParams
import com.metronome.api.models.PlanGetDetailsResponse
import com.metronome.api.models.PlanListChargesPage
import com.metronome.api.models.PlanListChargesParams
import com.metronome.api.models.PlanListCustomersPage
import com.metronome.api.models.PlanListCustomersParams
import com.metronome.api.models.PlanListPage
import com.metronome.api.models.PlanListParams

class PlanServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : PlanService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<PlanListPage.Response> =
        jsonHandler<PlanListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List all available plans. */
    override fun list(params: PlanListParams, requestOptions: RequestOptions): PlanListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("plans")
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
                .let { PlanListPage.of(this, params, it) }
        }
    }

    private val getDetailsHandler: Handler<PlanGetDetailsResponse> =
        jsonHandler<PlanGetDetailsResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Fetch high level details of a specific plan. */
    override fun getDetails(
        params: PlanGetDetailsParams,
        requestOptions: RequestOptions
    ): PlanGetDetailsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("planDetails", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { getDetailsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listChargesHandler: Handler<PlanListChargesPage.Response> =
        jsonHandler<PlanListChargesPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Fetches a list of charges of a specific plan. */
    override fun listCharges(
        params: PlanListChargesParams,
        requestOptions: RequestOptions
    ): PlanListChargesPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("planDetails", params.getPathParam(0), "charges")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listChargesHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { PlanListChargesPage.of(this, params, it) }
        }
    }

    private val listCustomersHandler: Handler<PlanListCustomersPage.Response> =
        jsonHandler<PlanListCustomersPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetches a list of customers on a specific plan (by default, only currently active plans are
     * included)
     */
    override fun listCustomers(
        params: PlanListCustomersParams,
        requestOptions: RequestOptions
    ): PlanListCustomersPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("planDetails", params.getPathParam(0), "customers")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listCustomersHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { PlanListCustomersPage.of(this, params, it) }
        }
    }
}
