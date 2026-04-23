// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponse
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.customers.alerts.AlertListPage
import com.metronome.api.models.v1.customers.alerts.AlertListParams
import com.metronome.api.models.v1.customers.alerts.AlertResetParams
import com.metronome.api.models.v1.customers.alerts.AlertRetrieveParams
import com.metronome.api.models.v1.customers.alerts.AlertRetrieveResponse
import java.util.function.Consumer

/**
 * [Alerts](https://docs.metronome.com/connecting-metronome/alerts/) monitor customer spending,
 * balances, and other billing factors. Use these endpoints to create, retrieve, and archive
 * customer alerts. To view sample alert payloads by alert type, navigate
 * [here.](https://docs.metronome.com/manage-product-access/create-manage-alerts/#webhook-notifications)
 */
interface AlertService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertService

    /**
     * Retrieve the real-time evaluation status for a specific threshold notification-customer pair.
     * This endpoint provides instant visibility into whether a customer has triggered a threshold
     * notification condition, enabling you to monitor account health and take proactive action
     * based on current threshold notification states.
     *
     * ### Use this endpoint to:
     * - Check if a specific customer is currently violating an threshold notification (`in_alarm`
     *   status)
     * - Verify threshold notification configuration details and threshold values for a customer
     * - Monitor the evaluation state of newly created or recently modified threshold notification
     * - Build dashboards or automated workflows that respond to specific threshold notification
     *   conditions
     * - Validate threshold notification behavior before deploying to production customers
     * - Integrate threshold notification status checks into customer support tools or admin
     *   interfaces
     *
     * ### Key response fields:
     * A CustomerAlert object containing:
     * - `customer_status`: The current evaluation state
     * - `ok` - Customer is within acceptable thresholds
     * - `in_alarm` - Customer has breached the threshold for the notification
     * - `evaluating` - Notification is currently being evaluated (typically during initial setup)
     * - `null` - Notification has been archived
     * - `triggered_by`: Additional context about what caused the notification to trigger (when
     *   applicable)
     * - alert: Complete threshold notification configuration including:
     *     - Notification ID, name, and type
     *     - Current threshold values and credit type information
     *     - Notification status (enabled, disabled, or archived)
     *     - Last update timestamp
     *     - Any applied filters (credit grant types, custom fields, group values)
     *
     * ### Usage guidelines:
     * - Customer status: Returns the current evaluation state, not historical data. For threshold
     *   notification history, use webhook notifications or event logs
     * - Required parameters: Both customer_id and alert_id must be valid UUIDs that exist in your
     *   organization
     * - Archived notifications: Returns null for customer_status if the notification has been
     *   archived, but still includes the notification configuration details
     * - Performance considerations: This endpoint queries live evaluation state, making it ideal
     *   for real-time monitoring but not for bulk status checks
     * - Integration patterns: Best used for on-demand status checks in response to user actions or
     *   as part of targeted monitoring workflows
     * - Error handling: Returns 404 if either the customer or alert_id doesn't exist or isn't
     *   accessible to your organization
     */
    fun retrieve(params: AlertRetrieveParams): AlertRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AlertRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertRetrieveResponse

    /**
     * Retrieve all threshold notification configurations and their current statuses for a specific
     * customer in a single API call. This endpoint provides a comprehensive view of all threshold
     * notification monitoring a customer account.
     *
     * ### Use this endpoint to:
     * - Display all active threshold notifications for a customer in dashboards or admin panels
     * - Quickly identify which threshold notifications a customer is currently triggering
     * - Audit threshold notification coverage for specific accounts
     * - Filter threshold notifications by status (enabled, disabled, or archived)
     *
     * ### Key response fields:
     * - data: Array of CustomerAlert objects, each containing:
     *     - Current evaluation status (`ok`, `in_alarm`, `evaluating`, or `null`)
     *     - Complete threshold notification configuration and threshold details
     *     - Threshold notification metadata including type, name, and last update time
     * - next_page: Pagination cursor for retrieving additional results
     *
     * ### Usage guidelines:
     * - Default behavior: Returns only enabled threshold notifications unless `alert_statuses`
     *   filter is specified
     * - Pagination: Use the `next_page` cursor to retrieve all results for customers with many
     *   notifications
     * - Performance: Efficiently retrieves multiple threshold notification statuses in a single
     *   request instead of making individual calls
     * - Filtering: Pass the `alert_statuses` array to include disabled or archived threshold
     *   notifications in results
     */
    fun list(params: AlertListParams): AlertListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AlertListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertListPage

    /**
     * Force an immediate re-evaluation of a specific threshold notification for a customer,
     * clearing any previous state and triggering a fresh assessment against current thresholds.
     * This endpoint ensures threshold notification accuracy after configuration changes or data
     * corrections.
     *
     * ### Use this endpoint to:
     * - Clear false positive threshold notifications after fixing data issues
     * - Re-evaluate threshold notifications after adjusting customer balances or credits
     * - Test threshold notification behavior during development and debugging
     * - Resolve stuck threshold notification that may be in an incorrect state
     * - Trigger immediate evaluation after threshold modifications
     *
     * ### Key response fields:
     * - 200 Success: Confirmation that the threshold notification has been reset and re-evaluation
     *   initiated
     * - No response body is returned - the operation completes asynchronously
     *
     * ### Usage guidelines:
     * - Immediate effect: Triggers re-evaluation instantly, which may result in new webhook
     *   notifications if thresholds are breached
     * - State clearing: Removes any cached evaluation state, ensuring a fresh assessment
     * - Use sparingly: Intended for exceptional cases, not routine operations
     * - Asynchronous processing: The reset completes immediately, but re-evaluation happens in the
     *   background
     */
    fun reset(params: AlertResetParams) = reset(params, RequestOptions.none())

    /** @see reset */
    fun reset(params: AlertResetParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [AlertService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/customer-alerts/get`, but is otherwise the same
         * as [AlertService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: AlertRetrieveParams): HttpResponseFor<AlertRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AlertRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post /v1/customer-alerts/list`, but is otherwise the
         * same as [AlertService.list].
         */
        @MustBeClosed
        fun list(params: AlertListParams): HttpResponseFor<AlertListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AlertListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertListPage>

        /**
         * Returns a raw HTTP response for `post /v1/customer-alerts/reset`, but is otherwise the
         * same as [AlertService.reset].
         */
        @MustBeClosed
        fun reset(params: AlertResetParams): HttpResponse = reset(params, RequestOptions.none())

        /** @see reset */
        @MustBeClosed
        fun reset(
            params: AlertResetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
