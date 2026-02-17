// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.v1

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1AlertArchiveParams
import com.metronome.api.models.V1AlertArchiveResponse
import com.metronome.api.models.V1AlertCreateParams
import com.metronome.api.models.V1AlertCreateResponse
import java.util.concurrent.CompletableFuture

interface AlertServiceAsync {

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
     *
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
    @JvmOverloads
    fun create(
        params: V1AlertCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1AlertCreateResponse>

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
    @JvmOverloads
    fun archive(
        params: V1AlertArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1AlertArchiveResponse>
}
