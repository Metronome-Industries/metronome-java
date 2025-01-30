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
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.AuditLogListPage
import com.metronome.api.models.AuditLogListParams

class AuditLogServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : AuditLogService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<AuditLogListPage.Response> =
        jsonHandler<AuditLogListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieves a range of audit logs. If no further audit logs are currently available, the data
     * array will be empty. As new audit logs are created, subsequent requests using the same
     * next_page value will be in the returned data array, ensuring a continuous and uninterrupted
     * reading of audit logs.
     */
    override fun list(
        params: AuditLogListParams,
        requestOptions: RequestOptions
    ): AuditLogListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("auditLogs")
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { AuditLogListPage.of(this, params, it) }
        }
    }
}
