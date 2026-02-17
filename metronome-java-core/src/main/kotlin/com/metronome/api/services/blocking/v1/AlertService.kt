// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.alerts.AlertArchiveParams
import com.metronome.api.models.v1.alerts.AlertArchiveResponse
import com.metronome.api.models.v1.alerts.AlertCreateParams
import com.metronome.api.models.v1.alerts.AlertCreateResponse
import java.util.function.Consumer

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
     * Create a new threshold notification to monitor customer spending, balances, and billing
     * metrics in real-time. Metronome's notification system provides industry-leading speed with
     * immediate evaluation capabilities, enabling you to proactively manage customer accounts and
     * prevent revenue leakage.
     *
     * This endpoint creates configurable threshold notifications that continuously monitor various
     * billing thresholds including spend limits, credit balances, commitment utilization, and
     * invoice totals. Threshold notifications can be configured globally for all customers or
     * targeted to specific customer accounts.
     *
     * ### Use this endpoint to:
     * - Proactively monitor customer spending patterns to prevent unexpected overages or credit
     *   exhaustion
     * - Automate notifications when customers approach commitment limits or credit thresholds
     * - Enable real-time intervention for accounts at risk of churn or payment issues
     * - Scale billing operations by automating threshold-based workflows and notifications
     *
     * ### Key response fields:
     * A successful response returns a CustomerAlert object containing:
     * - The threshold notification configuration with its unique ID and current status
     * - The customer's evaluation status (ok, in_alarm, or evaluating)
     * - Threshold notification metadata including type, threshold values, and update timestamps
     *
     * ### Usage guidelines:
     * - Immediate evaluation: Set `evaluate_on_create` : `true` (default) for instant evaluation
     *   against existing customers
     * - Uniqueness constraints: Each threshold notification must have a unique `uniqueness_key`
     *   within your organization. Use `release_uniqueness_key` : `true` when archiving to reuse
     *   keys
     * - Notification type requirements: Different threshold notification types require specific
     *   fields (e.g., `billable_metric_id` for usage notifications, `credit_type_id` for
     *   credit-based threshold notifications)
     * - Webhook delivery: Threshold notifications trigger webhook notifications for real-time
     *   integration with your systems. Configure webhook endpoints before creating threshold
     *   notifications
     * - Performance at scale: Metronome's event-driven architecture processes threshold
     *   notification evaluations in real-time as usage events stream in, unlike competitors who
     *   rely on periodic polling or batch evaluation cycles
     */
    fun create(params: AlertCreateParams): AlertCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AlertCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertCreateResponse

    /**
     * Permanently disable a threshold notification and remove it from active monitoring across all
     * customers. Archived threshold notifications stop evaluating immediately and can optionally
     * release their uniqueness key for reuse in future threshold notification configurations.
     *
     * ### Use this endpoint to:
     * - Decommission threshold notifications that are no longer needed
     * - Clean up test or deprecated threshold notification configurations
     * - Free up uniqueness keys for reuse with new threshold notifications
     * - Stop threshold notification evaluations without losing historical configuration data
     * - Disable outdated monitoring rules during pricing model transitions
     *
     * ### Key response fields:
     * - data: Object containing the archived threshold notification's ID
     *
     * ### Usage guidelines:
     * - Irreversible for evaluation: Archived threshold notifications cannot be re-enabled; create
     *   a new threshold notification to resume monitoring
     * - Uniqueness key handling: Set `release_uniqueness_key` : `true` to reuse the key in future
     *   threshold notifications
     * - Immediate effect: Threshold notification evaluation stops instantly across all customers
     * - Historical preservation: Archive operation maintains threshold notification history and
     *   configuration for compliance and auditing
     */
    fun archive(params: AlertArchiveParams): AlertArchiveResponse =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: AlertArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertArchiveResponse

    /** A view of [AlertService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/alerts/create`, but is otherwise the same as
         * [AlertService.create].
         */
        @MustBeClosed
        fun create(params: AlertCreateParams): HttpResponseFor<AlertCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AlertCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertCreateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/alerts/archive`, but is otherwise the same as
         * [AlertService.archive].
         */
        @MustBeClosed
        fun archive(params: AlertArchiveParams): HttpResponseFor<AlertArchiveResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: AlertArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertArchiveResponse>
    }
}
