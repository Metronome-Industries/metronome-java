// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.AuditLogListParams
import com.metronome.api.models.AuditLogListResponse
import com.metronome.api.services.errorHandler
import com.metronome.api.services.jsonHandler
import com.metronome.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class AuditLogServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : AuditLogServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<AuditLogListResponse> =
        jsonHandler<AuditLogListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieves a range of audit logs. If no further audit logs are currently available, the data
     * array will be empty. As new audit logs are created, subsequent requests using the same
     * next_page value will be in the returned data array, ensuring a continuous and uninterrupted
     * reading of audit logs.
     */
    override fun list(
        params: AuditLogListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AuditLogListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("auditLogs")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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
