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
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.ServiceListParams
import com.metronome.api.models.ServiceListResponse
import java.util.concurrent.CompletableFuture

class ServiceServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ServiceServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<ServiceListResponse> =
        jsonHandler<ServiceListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Fetches a list of services used by Metronome and the associated IP addresses. IP addresses
     * are not necessarily unique between services. In most cases, IP addresses will appear in the
     * list at least 30 days before they are used for the first time.
     */
    override fun list(
        params: ServiceListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ServiceListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("services")
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
        }
    }
}
