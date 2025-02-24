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
import com.metronome.api.core.json
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.DashboardGetEmbeddableUrlParams
import com.metronome.api.models.DashboardGetEmbeddableUrlResponse

class DashboardServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DashboardService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val getEmbeddableUrlHandler: Handler<DashboardGetEmbeddableUrlResponse> =
        jsonHandler<DashboardGetEmbeddableUrlResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve an embeddable dashboard url for a customer. The dashboard can be embedded using an
     * iframe in a website. This will show information such as usage data and customer invoices.
     */
    override fun getEmbeddableUrl(
        params: DashboardGetEmbeddableUrlParams,
        requestOptions: RequestOptions,
    ): DashboardGetEmbeddableUrlResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("dashboards", "getEmbeddableUrl")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { getEmbeddableUrlHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
