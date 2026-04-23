// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.auditlogs.AuditLogListPage
import com.metronome.api.models.v1.auditlogs.AuditLogListParams
import java.util.function.Consumer

/**
 * [Security](https://docs.metronome.com/developer-resources/security/) endpoints allow you to
 * retrieve security-related data.
 */
interface AuditLogService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuditLogService

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
    fun list(): AuditLogListPage = list(AuditLogListParams.none())

    /** @see list */
    fun list(
        params: AuditLogListParams = AuditLogListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuditLogListPage

    /** @see list */
    fun list(params: AuditLogListParams = AuditLogListParams.none()): AuditLogListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AuditLogListPage =
        list(AuditLogListParams.none(), requestOptions)

    /** A view of [AuditLogService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuditLogService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/auditLogs`, but is otherwise the same as
         * [AuditLogService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AuditLogListPage> = list(AuditLogListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuditLogListParams = AuditLogListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuditLogListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuditLogListParams = AuditLogListParams.none()
        ): HttpResponseFor<AuditLogListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AuditLogListPage> =
            list(AuditLogListParams.none(), requestOptions)
    }
}
