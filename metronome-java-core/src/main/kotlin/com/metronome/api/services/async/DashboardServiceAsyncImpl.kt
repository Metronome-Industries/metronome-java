// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

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
import com.metronome.api.models.DashboardGetEmbeddableUrlParams
import com.metronome.api.models.DashboardGetEmbeddableUrlResponse
import java.util.concurrent.CompletableFuture

class DashboardServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : DashboardServiceAsync {

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
        requestOptions: RequestOptions
    ): CompletableFuture<DashboardGetEmbeddableUrlResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("dashboards", "getEmbeddableUrl")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { getEmbeddableUrlHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
