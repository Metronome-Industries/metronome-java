// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v1

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1AuditLogListPage
import com.metronome.api.models.V1AuditLogListParams

interface AuditLogService {

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
    @JvmOverloads
    fun list(
        params: V1AuditLogListParams = V1AuditLogListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1AuditLogListPage

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
    fun list(requestOptions: RequestOptions): V1AuditLogListPage =
        list(V1AuditLogListParams.none(), requestOptions)
}
