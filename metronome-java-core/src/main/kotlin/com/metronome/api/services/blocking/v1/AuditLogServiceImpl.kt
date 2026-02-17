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
import com.metronome.api.models.V1AuditLogListPage
import com.metronome.api.models.V1AuditLogListParams

class AuditLogServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AuditLogService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<V1AuditLogListPage.Response> =
        jsonHandler<V1AuditLogListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Get a comprehensive audit trail of all operations performed in your Metronome account,
     * whether initiated through the API, web interface, or automated processes. This endpoint
     * provides detailed logs of who did what and when, enabling compliance reporting, security
     * monitoring, and operational troubleshooting across all interaction channels.
     *
     * ### Use this endpoint to:
     * - Monitor all account activity for security and compliance purposes
     * - Track configuration changes regardless of source (API, UI, or system)
     * - Investigate issues by reviewing historical operations
     *
     * ### Key response fields:
     *
     * An array of AuditLog objects containing:
     * - id: Unique identifier for the audit log entry
     * - timestamp: When the action occurred (RFC 3339 format)
     * - actor: Information about who performed the action
     * - request: Details including request ID, IP address, and user agent
     * - `resource_type`: The type of resource affected (e.g., customer, contract, invoice)
     * - `resource_id`: The specific resource identifier
     * - `action`: The operation performed
     * - `next_page`: Cursor for continuous log retrieval
     *
     * ### Usage guidelines:
     * - Continuous retrieval: The next_page token enables uninterrupted log streaming—save it
     *   between requests to ensure no logs are missed
     * - Empty responses: An empty data array means no new logs yet; continue polling with the same
     *   next_page token
     * - Date filtering:
     *     - `starting_on`: Earliest logs to return (inclusive)
     *     - `ending_before`: Latest logs to return (exclusive)
     *     - Cannot be used with `next_page`
     * - Resource filtering: Must specify both `resource_type` and `resource_id` together
     * - Sort order: Default is `date_asc`; use `date_desc` for newest first
     */
    override fun list(
        params: V1AuditLogListParams,
        requestOptions: RequestOptions,
    ): V1AuditLogListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "auditLogs")
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
            .let { V1AuditLogListPage.of(this, params, it) }
    }
}
