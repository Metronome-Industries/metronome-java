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
import com.metronome.api.models.V1ServiceListParams
import com.metronome.api.models.V1ServiceListResponse

class ServiceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ServiceService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<V1ServiceListResponse> =
        jsonHandler<V1ServiceListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Gets Metronome's service registry with associated IP addresses for security allowlisting and
     * firewall configuration. Use this endpoint to maintain an up-to-date list of IPs that your
     * systems should trust for Metronome communications. Returns service names and their current IP
     * ranges, with new IPs typically appearing 30+ days before first use to ensure smooth allowlist
     * updates.
     */
    override fun list(
        params: V1ServiceListParams,
        requestOptions: RequestOptions,
    ): V1ServiceListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "services")
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
    }
}
