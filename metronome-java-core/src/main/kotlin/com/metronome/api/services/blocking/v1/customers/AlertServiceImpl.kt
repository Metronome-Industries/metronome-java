// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.emptyHandler
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1CustomerAlertListPage
import com.metronome.api.models.V1CustomerAlertListParams
import com.metronome.api.models.V1CustomerAlertResetParams
import com.metronome.api.models.V1CustomerAlertRetrieveParams
import com.metronome.api.models.V1CustomerAlertRetrieveResponse

class AlertServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AlertService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<V1CustomerAlertRetrieveResponse> =
        jsonHandler<V1CustomerAlertRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
     *
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
    override fun retrieve(
        params: V1CustomerAlertRetrieveParams,
        requestOptions: RequestOptions,
    ): V1CustomerAlertRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "customer-alerts", "get")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<V1CustomerAlertListPage.Response> =
        jsonHandler<V1CustomerAlertListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun list(
        params: V1CustomerAlertListParams,
        requestOptions: RequestOptions,
    ): V1CustomerAlertListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "customer-alerts", "list")
                .body(json(clientOptions.jsonMapper, params._body()))
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
            .let { V1CustomerAlertListPage.of(this, params, it) }
    }

    private val resetHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

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
    override fun reset(params: V1CustomerAlertResetParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "customer-alerts", "reset")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { resetHandler.handle(it) }
    }
}
