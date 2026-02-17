// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Create a new threshold notification to monitor customer spending, balances, and billing metrics
 * in real-time. Metronome's notification system provides industry-leading speed with immediate
 * evaluation capabilities, enabling you to proactively manage customer accounts and prevent revenue
 * leakage.
 *
 * This endpoint creates configurable threshold notifications that continuously monitor various
 * billing thresholds including spend limits, credit balances, commitment utilization, and invoice
 * totals. Threshold notifications can be configured globally for all customers or targeted to
 * specific customer accounts.
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
 * - Uniqueness constraints: Each threshold notification must have a unique `uniqueness_key` within
 *   your organization. Use `release_uniqueness_key` : `true` when archiving to reuse keys
 * - Notification type requirements: Different threshold notification types require specific fields
 *   (e.g., `billable_metric_id` for usage notifications, `credit_type_id` for credit-based
 *   threshold notifications)
 * - Webhook delivery: Threshold notifications trigger webhook notifications for real-time
 *   integration with your systems. Configure webhook endpoints before creating threshold
 *   notifications
 * - Performance at scale: Metronome's event-driven architecture processes threshold notification
 *   evaluations in real-time as usage events stream in, unlike competitors who rely on periodic
 *   polling or batch evaluation cycles
 */
class V1AlertCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Type of the threshold notification */
    fun alertType(): AlertType = body.alertType()

    /** Name of the threshold notification */
    fun name(): String = body.name()

    /**
     * Threshold value of the notification policy. Depending upon the notification type, this number
     * may represent a financial amount, the days remaining, or a percentage reached.
     */
    fun threshold(): Double = body.threshold()

    /**
     * For threshold notifications of type `usage_threshold_reached`, specifies which billable
     * metric to track the usage for.
     */
    fun billableMetricId(): Optional<String> = body.billableMetricId()

    /**
     * An array of strings, representing a way to filter the credit grant this threshold
     * notification applies to, by looking at the credit_grant_type field on the credit grant. This
     * field is only defined for CreditPercentage and CreditBalance notifications
     */
    fun creditGrantTypeFilters(): Optional<List<String>> = body.creditGrantTypeFilters()

    /**
     * ID of the credit's currency, defaults to USD. If the specific notification type requires a
     * pricing unit/currency, find the ID in the
     * [Metronome app](https://app.metronome.com/offering/pricing-units).
     */
    fun creditTypeId(): Optional<String> = body.creditTypeId()

    /**
     * A list of custom field filters for threshold notification types that support advanced
     * filtering. Only present for contract invoices.
     */
    fun customFieldFilters(): Optional<List<CustomFieldFilter>> = body.customFieldFilters()

    /**
     * If provided, will create this threshold notification for this specific customer. To create a
     * notification for all customers, do not specify a `customer_id`.
     */
    fun customerId(): Optional<String> = body.customerId()

    /**
     * If true, the threshold notification will evaluate immediately on customers that already meet
     * the notification threshold. If false, it will only evaluate on future customers that trigger
     * the threshold. Defaults to true.
     */
    fun evaluateOnCreate(): Optional<Boolean> = body.evaluateOnCreate()

    /**
     * Only present for `spend_threshold_reached` notifications. Scope notification to a specific
     * group key on individual line items.
     */
    fun groupValues(): Optional<List<GroupValue>> = body.groupValues()

    /**
     * Only supported for invoice_total_reached threshold notifications. A list of invoice types to
     * evaluate.
     */
    fun invoiceTypesFilter(): Optional<List<String>> = body.invoiceTypesFilter()

    /**
     * If provided, will create this threshold notification for this specific plan. To create a
     * notification for all customers, do not specify a `plan_id`.
     */
    fun planId(): Optional<String> = body.planId()

    /**
     * Required for `low_remaining_seat_balance_reached` notifications. The alert is scoped to this
     * seat group key-value pair.
     */
    fun seatFilter(): Optional<SeatFilter> = body.seatFilter()

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     */
    fun uniquenessKey(): Optional<String> = body.uniquenessKey()

    /** Type of the threshold notification */
    fun _alertType(): JsonField<AlertType> = body._alertType()

    /** Name of the threshold notification */
    fun _name(): JsonField<String> = body._name()

    /**
     * Threshold value of the notification policy. Depending upon the notification type, this number
     * may represent a financial amount, the days remaining, or a percentage reached.
     */
    fun _threshold(): JsonField<Double> = body._threshold()

    /**
     * For threshold notifications of type `usage_threshold_reached`, specifies which billable
     * metric to track the usage for.
     */
    fun _billableMetricId(): JsonField<String> = body._billableMetricId()

    /**
     * An array of strings, representing a way to filter the credit grant this threshold
     * notification applies to, by looking at the credit_grant_type field on the credit grant. This
     * field is only defined for CreditPercentage and CreditBalance notifications
     */
    fun _creditGrantTypeFilters(): JsonField<List<String>> = body._creditGrantTypeFilters()

    /**
     * ID of the credit's currency, defaults to USD. If the specific notification type requires a
     * pricing unit/currency, find the ID in the
     * [Metronome app](https://app.metronome.com/offering/pricing-units).
     */
    fun _creditTypeId(): JsonField<String> = body._creditTypeId()

    /**
     * A list of custom field filters for threshold notification types that support advanced
     * filtering. Only present for contract invoices.
     */
    fun _customFieldFilters(): JsonField<List<CustomFieldFilter>> = body._customFieldFilters()

    /**
     * If provided, will create this threshold notification for this specific customer. To create a
     * notification for all customers, do not specify a `customer_id`.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * If true, the threshold notification will evaluate immediately on customers that already meet
     * the notification threshold. If false, it will only evaluate on future customers that trigger
     * the threshold. Defaults to true.
     */
    fun _evaluateOnCreate(): JsonField<Boolean> = body._evaluateOnCreate()

    /**
     * Only present for `spend_threshold_reached` notifications. Scope notification to a specific
     * group key on individual line items.
     */
    fun _groupValues(): JsonField<List<GroupValue>> = body._groupValues()

    /**
     * Only supported for invoice_total_reached threshold notifications. A list of invoice types to
     * evaluate.
     */
    fun _invoiceTypesFilter(): JsonField<List<String>> = body._invoiceTypesFilter()

    /**
     * If provided, will create this threshold notification for this specific plan. To create a
     * notification for all customers, do not specify a `plan_id`.
     */
    fun _planId(): JsonField<String> = body._planId()

    /**
     * Required for `low_remaining_seat_balance_reached` notifications. The alert is scoped to this
     * seat group key-value pair.
     */
    fun _seatFilter(): JsonField<SeatFilter> = body._seatFilter()

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     */
    fun _uniquenessKey(): JsonField<String> = body._uniquenessKey()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("alert_type")
        @ExcludeMissing
        private val alertType: JsonField<AlertType> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("threshold")
        @ExcludeMissing
        private val threshold: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        private val billableMetricId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_grant_type_filters")
        @ExcludeMissing
        private val creditGrantTypeFilters: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        private val creditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom_field_filters")
        @ExcludeMissing
        private val customFieldFilters: JsonField<List<CustomFieldFilter>> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluate_on_create")
        @ExcludeMissing
        private val evaluateOnCreate: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("group_values")
        @ExcludeMissing
        private val groupValues: JsonField<List<GroupValue>> = JsonMissing.of(),
        @JsonProperty("invoice_types_filter")
        @ExcludeMissing
        private val invoiceTypesFilter: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("plan_id")
        @ExcludeMissing
        private val planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("seat_filter")
        @ExcludeMissing
        private val seatFilter: JsonField<SeatFilter> = JsonMissing.of(),
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        private val uniquenessKey: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Type of the threshold notification */
        fun alertType(): AlertType = alertType.getRequired("alert_type")

        /** Name of the threshold notification */
        fun name(): String = name.getRequired("name")

        /**
         * Threshold value of the notification policy. Depending upon the notification type, this
         * number may represent a financial amount, the days remaining, or a percentage reached.
         */
        fun threshold(): Double = threshold.getRequired("threshold")

        /**
         * For threshold notifications of type `usage_threshold_reached`, specifies which billable
         * metric to track the usage for.
         */
        fun billableMetricId(): Optional<String> =
            Optional.ofNullable(billableMetricId.getNullable("billable_metric_id"))

        /**
         * An array of strings, representing a way to filter the credit grant this threshold
         * notification applies to, by looking at the credit_grant_type field on the credit grant.
         * This field is only defined for CreditPercentage and CreditBalance notifications
         */
        fun creditGrantTypeFilters(): Optional<List<String>> =
            Optional.ofNullable(creditGrantTypeFilters.getNullable("credit_grant_type_filters"))

        /**
         * ID of the credit's currency, defaults to USD. If the specific notification type requires
         * a pricing unit/currency, find the ID in the
         * [Metronome app](https://app.metronome.com/offering/pricing-units).
         */
        fun creditTypeId(): Optional<String> =
            Optional.ofNullable(creditTypeId.getNullable("credit_type_id"))

        /**
         * A list of custom field filters for threshold notification types that support advanced
         * filtering. Only present for contract invoices.
         */
        fun customFieldFilters(): Optional<List<CustomFieldFilter>> =
            Optional.ofNullable(customFieldFilters.getNullable("custom_field_filters"))

        /**
         * If provided, will create this threshold notification for this specific customer. To
         * create a notification for all customers, do not specify a `customer_id`.
         */
        fun customerId(): Optional<String> =
            Optional.ofNullable(customerId.getNullable("customer_id"))

        /**
         * If true, the threshold notification will evaluate immediately on customers that already
         * meet the notification threshold. If false, it will only evaluate on future customers that
         * trigger the threshold. Defaults to true.
         */
        fun evaluateOnCreate(): Optional<Boolean> =
            Optional.ofNullable(evaluateOnCreate.getNullable("evaluate_on_create"))

        /**
         * Only present for `spend_threshold_reached` notifications. Scope notification to a
         * specific group key on individual line items.
         */
        fun groupValues(): Optional<List<GroupValue>> =
            Optional.ofNullable(groupValues.getNullable("group_values"))

        /**
         * Only supported for invoice_total_reached threshold notifications. A list of invoice types
         * to evaluate.
         */
        fun invoiceTypesFilter(): Optional<List<String>> =
            Optional.ofNullable(invoiceTypesFilter.getNullable("invoice_types_filter"))

        /**
         * If provided, will create this threshold notification for this specific plan. To create a
         * notification for all customers, do not specify a `plan_id`.
         */
        fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("plan_id"))

        /**
         * Required for `low_remaining_seat_balance_reached` notifications. The alert is scoped to
         * this seat group key-value pair.
         */
        fun seatFilter(): Optional<SeatFilter> =
            Optional.ofNullable(seatFilter.getNullable("seat_filter"))

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(): Optional<String> =
            Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

        /** Type of the threshold notification */
        @JsonProperty("alert_type")
        @ExcludeMissing
        fun _alertType(): JsonField<AlertType> = alertType

        /** Name of the threshold notification */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Threshold value of the notification policy. Depending upon the notification type, this
         * number may represent a financial amount, the days remaining, or a percentage reached.
         */
        @JsonProperty("threshold") @ExcludeMissing fun _threshold(): JsonField<Double> = threshold

        /**
         * For threshold notifications of type `usage_threshold_reached`, specifies which billable
         * metric to track the usage for.
         */
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        fun _billableMetricId(): JsonField<String> = billableMetricId

        /**
         * An array of strings, representing a way to filter the credit grant this threshold
         * notification applies to, by looking at the credit_grant_type field on the credit grant.
         * This field is only defined for CreditPercentage and CreditBalance notifications
         */
        @JsonProperty("credit_grant_type_filters")
        @ExcludeMissing
        fun _creditGrantTypeFilters(): JsonField<List<String>> = creditGrantTypeFilters

        /**
         * ID of the credit's currency, defaults to USD. If the specific notification type requires
         * a pricing unit/currency, find the ID in the
         * [Metronome app](https://app.metronome.com/offering/pricing-units).
         */
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

        /**
         * A list of custom field filters for threshold notification types that support advanced
         * filtering. Only present for contract invoices.
         */
        @JsonProperty("custom_field_filters")
        @ExcludeMissing
        fun _customFieldFilters(): JsonField<List<CustomFieldFilter>> = customFieldFilters

        /**
         * If provided, will create this threshold notification for this specific customer. To
         * create a notification for all customers, do not specify a `customer_id`.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * If true, the threshold notification will evaluate immediately on customers that already
         * meet the notification threshold. If false, it will only evaluate on future customers that
         * trigger the threshold. Defaults to true.
         */
        @JsonProperty("evaluate_on_create")
        @ExcludeMissing
        fun _evaluateOnCreate(): JsonField<Boolean> = evaluateOnCreate

        /**
         * Only present for `spend_threshold_reached` notifications. Scope notification to a
         * specific group key on individual line items.
         */
        @JsonProperty("group_values")
        @ExcludeMissing
        fun _groupValues(): JsonField<List<GroupValue>> = groupValues

        /**
         * Only supported for invoice_total_reached threshold notifications. A list of invoice types
         * to evaluate.
         */
        @JsonProperty("invoice_types_filter")
        @ExcludeMissing
        fun _invoiceTypesFilter(): JsonField<List<String>> = invoiceTypesFilter

        /**
         * If provided, will create this threshold notification for this specific plan. To create a
         * notification for all customers, do not specify a `plan_id`.
         */
        @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

        /**
         * Required for `low_remaining_seat_balance_reached` notifications. The alert is scoped to
         * this seat group key-value pair.
         */
        @JsonProperty("seat_filter")
        @ExcludeMissing
        fun _seatFilter(): JsonField<SeatFilter> = seatFilter

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        fun _uniquenessKey(): JsonField<String> = uniquenessKey

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            alertType()
            name()
            threshold()
            billableMetricId()
            creditGrantTypeFilters()
            creditTypeId()
            customFieldFilters().ifPresent { it.forEach { it.validate() } }
            customerId()
            evaluateOnCreate()
            groupValues().ifPresent { it.forEach { it.validate() } }
            invoiceTypesFilter()
            planId()
            seatFilter().ifPresent { it.validate() }
            uniquenessKey()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var alertType: JsonField<AlertType>? = null
            private var name: JsonField<String>? = null
            private var threshold: JsonField<Double>? = null
            private var billableMetricId: JsonField<String> = JsonMissing.of()
            private var creditGrantTypeFilters: JsonField<MutableList<String>>? = null
            private var creditTypeId: JsonField<String> = JsonMissing.of()
            private var customFieldFilters: JsonField<MutableList<CustomFieldFilter>>? = null
            private var customerId: JsonField<String> = JsonMissing.of()
            private var evaluateOnCreate: JsonField<Boolean> = JsonMissing.of()
            private var groupValues: JsonField<MutableList<GroupValue>>? = null
            private var invoiceTypesFilter: JsonField<MutableList<String>>? = null
            private var planId: JsonField<String> = JsonMissing.of()
            private var seatFilter: JsonField<SeatFilter> = JsonMissing.of()
            private var uniquenessKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                alertType = body.alertType
                name = body.name
                threshold = body.threshold
                billableMetricId = body.billableMetricId
                creditGrantTypeFilters = body.creditGrantTypeFilters.map { it.toMutableList() }
                creditTypeId = body.creditTypeId
                customFieldFilters = body.customFieldFilters.map { it.toMutableList() }
                customerId = body.customerId
                evaluateOnCreate = body.evaluateOnCreate
                groupValues = body.groupValues.map { it.toMutableList() }
                invoiceTypesFilter = body.invoiceTypesFilter.map { it.toMutableList() }
                planId = body.planId
                seatFilter = body.seatFilter
                uniquenessKey = body.uniquenessKey
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Type of the threshold notification */
            fun alertType(alertType: AlertType) = alertType(JsonField.of(alertType))

            /** Type of the threshold notification */
            fun alertType(alertType: JsonField<AlertType>) = apply { this.alertType = alertType }

            /** Name of the threshold notification */
            fun name(name: String) = name(JsonField.of(name))

            /** Name of the threshold notification */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Threshold value of the notification policy. Depending upon the notification type,
             * this number may represent a financial amount, the days remaining, or a percentage
             * reached.
             */
            fun threshold(threshold: Double) = threshold(JsonField.of(threshold))

            /**
             * Threshold value of the notification policy. Depending upon the notification type,
             * this number may represent a financial amount, the days remaining, or a percentage
             * reached.
             */
            fun threshold(threshold: JsonField<Double>) = apply { this.threshold = threshold }

            /**
             * For threshold notifications of type `usage_threshold_reached`, specifies which
             * billable metric to track the usage for.
             */
            fun billableMetricId(billableMetricId: String) =
                billableMetricId(JsonField.of(billableMetricId))

            /**
             * For threshold notifications of type `usage_threshold_reached`, specifies which
             * billable metric to track the usage for.
             */
            fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * An array of strings, representing a way to filter the credit grant this threshold
             * notification applies to, by looking at the credit_grant_type field on the credit
             * grant. This field is only defined for CreditPercentage and CreditBalance
             * notifications
             */
            fun creditGrantTypeFilters(creditGrantTypeFilters: List<String>) =
                creditGrantTypeFilters(JsonField.of(creditGrantTypeFilters))

            /**
             * An array of strings, representing a way to filter the credit grant this threshold
             * notification applies to, by looking at the credit_grant_type field on the credit
             * grant. This field is only defined for CreditPercentage and CreditBalance
             * notifications
             */
            fun creditGrantTypeFilters(creditGrantTypeFilters: JsonField<List<String>>) = apply {
                this.creditGrantTypeFilters = creditGrantTypeFilters.map { it.toMutableList() }
            }

            /**
             * An array of strings, representing a way to filter the credit grant this threshold
             * notification applies to, by looking at the credit_grant_type field on the credit
             * grant. This field is only defined for CreditPercentage and CreditBalance
             * notifications
             */
            fun addCreditGrantTypeFilter(creditGrantTypeFilter: String) = apply {
                creditGrantTypeFilters =
                    (creditGrantTypeFilters ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(creditGrantTypeFilter)
                    }
            }

            /**
             * ID of the credit's currency, defaults to USD. If the specific notification type
             * requires a pricing unit/currency, find the ID in the
             * [Metronome app](https://app.metronome.com/offering/pricing-units).
             */
            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            /**
             * ID of the credit's currency, defaults to USD. If the specific notification type
             * requires a pricing unit/currency, find the ID in the
             * [Metronome app](https://app.metronome.com/offering/pricing-units).
             */
            fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                this.creditTypeId = creditTypeId
            }

            /**
             * A list of custom field filters for threshold notification types that support advanced
             * filtering. Only present for contract invoices.
             */
            fun customFieldFilters(customFieldFilters: List<CustomFieldFilter>) =
                customFieldFilters(JsonField.of(customFieldFilters))

            /**
             * A list of custom field filters for threshold notification types that support advanced
             * filtering. Only present for contract invoices.
             */
            fun customFieldFilters(customFieldFilters: JsonField<List<CustomFieldFilter>>) = apply {
                this.customFieldFilters = customFieldFilters.map { it.toMutableList() }
            }

            /**
             * A list of custom field filters for threshold notification types that support advanced
             * filtering. Only present for contract invoices.
             */
            fun addCustomFieldFilter(customFieldFilter: CustomFieldFilter) = apply {
                customFieldFilters =
                    (customFieldFilters ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(customFieldFilter)
                    }
            }

            /**
             * If provided, will create this threshold notification for this specific customer. To
             * create a notification for all customers, do not specify a `customer_id`.
             */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * If provided, will create this threshold notification for this specific customer. To
             * create a notification for all customers, do not specify a `customer_id`.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * If true, the threshold notification will evaluate immediately on customers that
             * already meet the notification threshold. If false, it will only evaluate on future
             * customers that trigger the threshold. Defaults to true.
             */
            fun evaluateOnCreate(evaluateOnCreate: Boolean) =
                evaluateOnCreate(JsonField.of(evaluateOnCreate))

            /**
             * If true, the threshold notification will evaluate immediately on customers that
             * already meet the notification threshold. If false, it will only evaluate on future
             * customers that trigger the threshold. Defaults to true.
             */
            fun evaluateOnCreate(evaluateOnCreate: JsonField<Boolean>) = apply {
                this.evaluateOnCreate = evaluateOnCreate
            }

            /**
             * Only present for `spend_threshold_reached` notifications. Scope notification to a
             * specific group key on individual line items.
             */
            fun groupValues(groupValues: List<GroupValue>) = groupValues(JsonField.of(groupValues))

            /**
             * Only present for `spend_threshold_reached` notifications. Scope notification to a
             * specific group key on individual line items.
             */
            fun groupValues(groupValues: JsonField<List<GroupValue>>) = apply {
                this.groupValues = groupValues.map { it.toMutableList() }
            }

            /**
             * Only present for `spend_threshold_reached` notifications. Scope notification to a
             * specific group key on individual line items.
             */
            fun addGroupValue(groupValue: GroupValue) = apply {
                groupValues =
                    (groupValues ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(groupValue)
                    }
            }

            /**
             * Only supported for invoice_total_reached threshold notifications. A list of invoice
             * types to evaluate.
             */
            fun invoiceTypesFilter(invoiceTypesFilter: List<String>) =
                invoiceTypesFilter(JsonField.of(invoiceTypesFilter))

            /**
             * Only supported for invoice_total_reached threshold notifications. A list of invoice
             * types to evaluate.
             */
            fun invoiceTypesFilter(invoiceTypesFilter: JsonField<List<String>>) = apply {
                this.invoiceTypesFilter = invoiceTypesFilter.map { it.toMutableList() }
            }

            /**
             * Only supported for invoice_total_reached threshold notifications. A list of invoice
             * types to evaluate.
             */
            fun addInvoiceTypesFilter(invoiceTypesFilter: String) = apply {
                this.invoiceTypesFilter =
                    (this.invoiceTypesFilter ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(invoiceTypesFilter)
                    }
            }

            /**
             * If provided, will create this threshold notification for this specific plan. To
             * create a notification for all customers, do not specify a `plan_id`.
             */
            fun planId(planId: String) = planId(JsonField.of(planId))

            /**
             * If provided, will create this threshold notification for this specific plan. To
             * create a notification for all customers, do not specify a `plan_id`.
             */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            /**
             * Required for `low_remaining_seat_balance_reached` notifications. The alert is scoped
             * to this seat group key-value pair.
             */
            fun seatFilter(seatFilter: SeatFilter) = seatFilter(JsonField.of(seatFilter))

            /**
             * Required for `low_remaining_seat_balance_reached` notifications. The alert is scoped
             * to this seat group key-value pair.
             */
            fun seatFilter(seatFilter: JsonField<SeatFilter>) = apply {
                this.seatFilter = seatFilter
            }

            /**
             * Prevents the creation of duplicates. If a request to create a record is made with a
             * previously used uniqueness key, a new record will not be created and the request will
             * fail with a 409 error.
             */
            fun uniquenessKey(uniquenessKey: String) = uniquenessKey(JsonField.of(uniquenessKey))

            /**
             * Prevents the creation of duplicates. If a request to create a record is made with a
             * previously used uniqueness key, a new record will not be created and the request will
             * fail with a 409 error.
             */
            fun uniquenessKey(uniquenessKey: JsonField<String>) = apply {
                this.uniquenessKey = uniquenessKey
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Body =
                Body(
                    checkRequired("alertType", alertType),
                    checkRequired("name", name),
                    checkRequired("threshold", threshold),
                    billableMetricId,
                    (creditGrantTypeFilters ?: JsonMissing.of()).map { it.toImmutable() },
                    creditTypeId,
                    (customFieldFilters ?: JsonMissing.of()).map { it.toImmutable() },
                    customerId,
                    evaluateOnCreate,
                    (groupValues ?: JsonMissing.of()).map { it.toImmutable() },
                    (invoiceTypesFilter ?: JsonMissing.of()).map { it.toImmutable() },
                    planId,
                    seatFilter,
                    uniquenessKey,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && alertType == other.alertType && name == other.name && threshold == other.threshold && billableMetricId == other.billableMetricId && creditGrantTypeFilters == other.creditGrantTypeFilters && creditTypeId == other.creditTypeId && customFieldFilters == other.customFieldFilters && customerId == other.customerId && evaluateOnCreate == other.evaluateOnCreate && groupValues == other.groupValues && invoiceTypesFilter == other.invoiceTypesFilter && planId == other.planId && seatFilter == other.seatFilter && uniquenessKey == other.uniquenessKey && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(alertType, name, threshold, billableMetricId, creditGrantTypeFilters, creditTypeId, customFieldFilters, customerId, evaluateOnCreate, groupValues, invoiceTypesFilter, planId, seatFilter, uniquenessKey, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{alertType=$alertType, name=$name, threshold=$threshold, billableMetricId=$billableMetricId, creditGrantTypeFilters=$creditGrantTypeFilters, creditTypeId=$creditTypeId, customFieldFilters=$customFieldFilters, customerId=$customerId, evaluateOnCreate=$evaluateOnCreate, groupValues=$groupValues, invoiceTypesFilter=$invoiceTypesFilter, planId=$planId, seatFilter=$seatFilter, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1AlertCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1AlertCreateParams: V1AlertCreateParams) = apply {
            body = v1AlertCreateParams.body.toBuilder()
            additionalHeaders = v1AlertCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1AlertCreateParams.additionalQueryParams.toBuilder()
        }

        /** Type of the threshold notification */
        fun alertType(alertType: AlertType) = apply { body.alertType(alertType) }

        /** Type of the threshold notification */
        fun alertType(alertType: JsonField<AlertType>) = apply { body.alertType(alertType) }

        /** Name of the threshold notification */
        fun name(name: String) = apply { body.name(name) }

        /** Name of the threshold notification */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Threshold value of the notification policy. Depending upon the notification type, this
         * number may represent a financial amount, the days remaining, or a percentage reached.
         */
        fun threshold(threshold: Double) = apply { body.threshold(threshold) }

        /**
         * Threshold value of the notification policy. Depending upon the notification type, this
         * number may represent a financial amount, the days remaining, or a percentage reached.
         */
        fun threshold(threshold: JsonField<Double>) = apply { body.threshold(threshold) }

        /**
         * For threshold notifications of type `usage_threshold_reached`, specifies which billable
         * metric to track the usage for.
         */
        fun billableMetricId(billableMetricId: String) = apply {
            body.billableMetricId(billableMetricId)
        }

        /**
         * For threshold notifications of type `usage_threshold_reached`, specifies which billable
         * metric to track the usage for.
         */
        fun billableMetricId(billableMetricId: JsonField<String>) = apply {
            body.billableMetricId(billableMetricId)
        }

        /**
         * An array of strings, representing a way to filter the credit grant this threshold
         * notification applies to, by looking at the credit_grant_type field on the credit grant.
         * This field is only defined for CreditPercentage and CreditBalance notifications
         */
        fun creditGrantTypeFilters(creditGrantTypeFilters: List<String>) = apply {
            body.creditGrantTypeFilters(creditGrantTypeFilters)
        }

        /**
         * An array of strings, representing a way to filter the credit grant this threshold
         * notification applies to, by looking at the credit_grant_type field on the credit grant.
         * This field is only defined for CreditPercentage and CreditBalance notifications
         */
        fun creditGrantTypeFilters(creditGrantTypeFilters: JsonField<List<String>>) = apply {
            body.creditGrantTypeFilters(creditGrantTypeFilters)
        }

        /**
         * An array of strings, representing a way to filter the credit grant this threshold
         * notification applies to, by looking at the credit_grant_type field on the credit grant.
         * This field is only defined for CreditPercentage and CreditBalance notifications
         */
        fun addCreditGrantTypeFilter(creditGrantTypeFilter: String) = apply {
            body.addCreditGrantTypeFilter(creditGrantTypeFilter)
        }

        /**
         * ID of the credit's currency, defaults to USD. If the specific notification type requires
         * a pricing unit/currency, find the ID in the
         * [Metronome app](https://app.metronome.com/offering/pricing-units).
         */
        fun creditTypeId(creditTypeId: String) = apply { body.creditTypeId(creditTypeId) }

        /**
         * ID of the credit's currency, defaults to USD. If the specific notification type requires
         * a pricing unit/currency, find the ID in the
         * [Metronome app](https://app.metronome.com/offering/pricing-units).
         */
        fun creditTypeId(creditTypeId: JsonField<String>) = apply {
            body.creditTypeId(creditTypeId)
        }

        /**
         * A list of custom field filters for threshold notification types that support advanced
         * filtering. Only present for contract invoices.
         */
        fun customFieldFilters(customFieldFilters: List<CustomFieldFilter>) = apply {
            body.customFieldFilters(customFieldFilters)
        }

        /**
         * A list of custom field filters for threshold notification types that support advanced
         * filtering. Only present for contract invoices.
         */
        fun customFieldFilters(customFieldFilters: JsonField<List<CustomFieldFilter>>) = apply {
            body.customFieldFilters(customFieldFilters)
        }

        /**
         * A list of custom field filters for threshold notification types that support advanced
         * filtering. Only present for contract invoices.
         */
        fun addCustomFieldFilter(customFieldFilter: CustomFieldFilter) = apply {
            body.addCustomFieldFilter(customFieldFilter)
        }

        /**
         * If provided, will create this threshold notification for this specific customer. To
         * create a notification for all customers, do not specify a `customer_id`.
         */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * If provided, will create this threshold notification for this specific customer. To
         * create a notification for all customers, do not specify a `customer_id`.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * If true, the threshold notification will evaluate immediately on customers that already
         * meet the notification threshold. If false, it will only evaluate on future customers that
         * trigger the threshold. Defaults to true.
         */
        fun evaluateOnCreate(evaluateOnCreate: Boolean) = apply {
            body.evaluateOnCreate(evaluateOnCreate)
        }

        /**
         * If true, the threshold notification will evaluate immediately on customers that already
         * meet the notification threshold. If false, it will only evaluate on future customers that
         * trigger the threshold. Defaults to true.
         */
        fun evaluateOnCreate(evaluateOnCreate: JsonField<Boolean>) = apply {
            body.evaluateOnCreate(evaluateOnCreate)
        }

        /**
         * Only present for `spend_threshold_reached` notifications. Scope notification to a
         * specific group key on individual line items.
         */
        fun groupValues(groupValues: List<GroupValue>) = apply { body.groupValues(groupValues) }

        /**
         * Only present for `spend_threshold_reached` notifications. Scope notification to a
         * specific group key on individual line items.
         */
        fun groupValues(groupValues: JsonField<List<GroupValue>>) = apply {
            body.groupValues(groupValues)
        }

        /**
         * Only present for `spend_threshold_reached` notifications. Scope notification to a
         * specific group key on individual line items.
         */
        fun addGroupValue(groupValue: GroupValue) = apply { body.addGroupValue(groupValue) }

        /**
         * Only supported for invoice_total_reached threshold notifications. A list of invoice types
         * to evaluate.
         */
        fun invoiceTypesFilter(invoiceTypesFilter: List<String>) = apply {
            body.invoiceTypesFilter(invoiceTypesFilter)
        }

        /**
         * Only supported for invoice_total_reached threshold notifications. A list of invoice types
         * to evaluate.
         */
        fun invoiceTypesFilter(invoiceTypesFilter: JsonField<List<String>>) = apply {
            body.invoiceTypesFilter(invoiceTypesFilter)
        }

        /**
         * Only supported for invoice_total_reached threshold notifications. A list of invoice types
         * to evaluate.
         */
        fun addInvoiceTypesFilter(invoiceTypesFilter: String) = apply {
            body.addInvoiceTypesFilter(invoiceTypesFilter)
        }

        /**
         * If provided, will create this threshold notification for this specific plan. To create a
         * notification for all customers, do not specify a `plan_id`.
         */
        fun planId(planId: String) = apply { body.planId(planId) }

        /**
         * If provided, will create this threshold notification for this specific plan. To create a
         * notification for all customers, do not specify a `plan_id`.
         */
        fun planId(planId: JsonField<String>) = apply { body.planId(planId) }

        /**
         * Required for `low_remaining_seat_balance_reached` notifications. The alert is scoped to
         * this seat group key-value pair.
         */
        fun seatFilter(seatFilter: SeatFilter) = apply { body.seatFilter(seatFilter) }

        /**
         * Required for `low_remaining_seat_balance_reached` notifications. The alert is scoped to
         * this seat group key-value pair.
         */
        fun seatFilter(seatFilter: JsonField<SeatFilter>) = apply { body.seatFilter(seatFilter) }

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: String) = apply { body.uniquenessKey(uniquenessKey) }

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: JsonField<String>) = apply {
            body.uniquenessKey(uniquenessKey)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): V1AlertCreateParams =
            V1AlertCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Type of the threshold notification */
    class AlertType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LOW_CREDIT_BALANCE_REACHED = of("low_credit_balance_reached")

            @JvmField val SPEND_THRESHOLD_REACHED = of("spend_threshold_reached")

            @JvmField
            val MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED =
                of("monthly_invoice_total_spend_threshold_reached")

            @JvmField
            val LOW_REMAINING_DAYS_IN_PLAN_REACHED = of("low_remaining_days_in_plan_reached")

            @JvmField
            val LOW_REMAINING_CREDIT_PERCENTAGE_REACHED =
                of("low_remaining_credit_percentage_reached")

            @JvmField val USAGE_THRESHOLD_REACHED = of("usage_threshold_reached")

            @JvmField
            val LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED =
                of("low_remaining_days_for_commit_segment_reached")

            @JvmField
            val LOW_REMAINING_COMMIT_BALANCE_REACHED = of("low_remaining_commit_balance_reached")

            @JvmField
            val LOW_REMAINING_COMMIT_PERCENTAGE_REACHED =
                of("low_remaining_commit_percentage_reached")

            @JvmField
            val LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED =
                of("low_remaining_days_for_contract_credit_segment_reached")

            @JvmField
            val LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED =
                of("low_remaining_contract_credit_balance_reached")

            @JvmField
            val LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED =
                of("low_remaining_contract_credit_percentage_reached")

            @JvmField
            val LOW_REMAINING_CONTRACT_CREDIT_AND_COMMIT_BALANCE_REACHED =
                of("low_remaining_contract_credit_and_commit_balance_reached")

            @JvmField val INVOICE_TOTAL_REACHED = of("invoice_total_reached")

            @JvmField
            val LOW_REMAINING_SEAT_BALANCE_REACHED = of("low_remaining_seat_balance_reached")

            @JvmStatic fun of(value: String) = AlertType(JsonField.of(value))
        }

        /** An enum containing [AlertType]'s known values. */
        enum class Known {
            LOW_CREDIT_BALANCE_REACHED,
            SPEND_THRESHOLD_REACHED,
            MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED,
            LOW_REMAINING_DAYS_IN_PLAN_REACHED,
            LOW_REMAINING_CREDIT_PERCENTAGE_REACHED,
            USAGE_THRESHOLD_REACHED,
            LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED,
            LOW_REMAINING_COMMIT_BALANCE_REACHED,
            LOW_REMAINING_COMMIT_PERCENTAGE_REACHED,
            LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED,
            LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED,
            LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED,
            LOW_REMAINING_CONTRACT_CREDIT_AND_COMMIT_BALANCE_REACHED,
            INVOICE_TOTAL_REACHED,
            LOW_REMAINING_SEAT_BALANCE_REACHED,
        }

        /**
         * An enum containing [AlertType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AlertType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOW_CREDIT_BALANCE_REACHED,
            SPEND_THRESHOLD_REACHED,
            MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED,
            LOW_REMAINING_DAYS_IN_PLAN_REACHED,
            LOW_REMAINING_CREDIT_PERCENTAGE_REACHED,
            USAGE_THRESHOLD_REACHED,
            LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED,
            LOW_REMAINING_COMMIT_BALANCE_REACHED,
            LOW_REMAINING_COMMIT_PERCENTAGE_REACHED,
            LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED,
            LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED,
            LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED,
            LOW_REMAINING_CONTRACT_CREDIT_AND_COMMIT_BALANCE_REACHED,
            INVOICE_TOTAL_REACHED,
            LOW_REMAINING_SEAT_BALANCE_REACHED,
            /**
             * An enum member indicating that [AlertType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LOW_CREDIT_BALANCE_REACHED -> Value.LOW_CREDIT_BALANCE_REACHED
                SPEND_THRESHOLD_REACHED -> Value.SPEND_THRESHOLD_REACHED
                MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED ->
                    Value.MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED
                LOW_REMAINING_DAYS_IN_PLAN_REACHED -> Value.LOW_REMAINING_DAYS_IN_PLAN_REACHED
                LOW_REMAINING_CREDIT_PERCENTAGE_REACHED ->
                    Value.LOW_REMAINING_CREDIT_PERCENTAGE_REACHED
                USAGE_THRESHOLD_REACHED -> Value.USAGE_THRESHOLD_REACHED
                LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED ->
                    Value.LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED
                LOW_REMAINING_COMMIT_BALANCE_REACHED -> Value.LOW_REMAINING_COMMIT_BALANCE_REACHED
                LOW_REMAINING_COMMIT_PERCENTAGE_REACHED ->
                    Value.LOW_REMAINING_COMMIT_PERCENTAGE_REACHED
                LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED ->
                    Value.LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED
                LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED ->
                    Value.LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED
                LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED ->
                    Value.LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED
                LOW_REMAINING_CONTRACT_CREDIT_AND_COMMIT_BALANCE_REACHED ->
                    Value.LOW_REMAINING_CONTRACT_CREDIT_AND_COMMIT_BALANCE_REACHED
                INVOICE_TOTAL_REACHED -> Value.INVOICE_TOTAL_REACHED
                LOW_REMAINING_SEAT_BALANCE_REACHED -> Value.LOW_REMAINING_SEAT_BALANCE_REACHED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LOW_CREDIT_BALANCE_REACHED -> Known.LOW_CREDIT_BALANCE_REACHED
                SPEND_THRESHOLD_REACHED -> Known.SPEND_THRESHOLD_REACHED
                MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED ->
                    Known.MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED
                LOW_REMAINING_DAYS_IN_PLAN_REACHED -> Known.LOW_REMAINING_DAYS_IN_PLAN_REACHED
                LOW_REMAINING_CREDIT_PERCENTAGE_REACHED ->
                    Known.LOW_REMAINING_CREDIT_PERCENTAGE_REACHED
                USAGE_THRESHOLD_REACHED -> Known.USAGE_THRESHOLD_REACHED
                LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED ->
                    Known.LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED
                LOW_REMAINING_COMMIT_BALANCE_REACHED -> Known.LOW_REMAINING_COMMIT_BALANCE_REACHED
                LOW_REMAINING_COMMIT_PERCENTAGE_REACHED ->
                    Known.LOW_REMAINING_COMMIT_PERCENTAGE_REACHED
                LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED ->
                    Known.LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED
                LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED ->
                    Known.LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED
                LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED ->
                    Known.LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED
                LOW_REMAINING_CONTRACT_CREDIT_AND_COMMIT_BALANCE_REACHED ->
                    Known.LOW_REMAINING_CONTRACT_CREDIT_AND_COMMIT_BALANCE_REACHED
                INVOICE_TOTAL_REACHED -> Known.INVOICE_TOTAL_REACHED
                LOW_REMAINING_SEAT_BALANCE_REACHED -> Known.LOW_REMAINING_SEAT_BALANCE_REACHED
                else -> throw MetronomeInvalidDataException("Unknown AlertType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                MetronomeInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AlertType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class CustomFieldFilter
    @JsonCreator
    private constructor(
        @JsonProperty("entity")
        @ExcludeMissing
        private val entity: JsonField<Entity> = JsonMissing.of(),
        @JsonProperty("key") @ExcludeMissing private val key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun entity(): Entity = entity.getRequired("entity")

        fun key(): String = key.getRequired("key")

        fun value(): String = value.getRequired("value")

        @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<Entity> = entity

        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomFieldFilter = apply {
            if (validated) {
                return@apply
            }

            entity()
            key()
            value()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomFieldFilter]. */
        class Builder internal constructor() {

            private var entity: JsonField<Entity>? = null
            private var key: JsonField<String>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFieldFilter: CustomFieldFilter) = apply {
                entity = customFieldFilter.entity
                key = customFieldFilter.key
                value = customFieldFilter.value
                additionalProperties = customFieldFilter.additionalProperties.toMutableMap()
            }

            fun entity(entity: Entity) = entity(JsonField.of(entity))

            fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

            fun key(key: String) = key(JsonField.of(key))

            fun key(key: JsonField<String>) = apply { this.key = key }

            fun value(value: String) = value(JsonField.of(value))

            fun value(value: JsonField<String>) = apply { this.value = value }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): CustomFieldFilter =
                CustomFieldFilter(
                    checkRequired("entity", entity),
                    checkRequired("key", key),
                    checkRequired("value", value),
                    additionalProperties.toImmutable(),
                )
        }

        class Entity @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CONTRACT = of("Contract")

                @JvmField val COMMIT = of("Commit")

                @JvmField val CONTRACT_CREDIT = of("ContractCredit")

                @JvmStatic fun of(value: String) = Entity(JsonField.of(value))
            }

            /** An enum containing [Entity]'s known values. */
            enum class Known {
                CONTRACT,
                COMMIT,
                CONTRACT_CREDIT,
            }

            /**
             * An enum containing [Entity]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Entity] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CONTRACT,
                COMMIT,
                CONTRACT_CREDIT,
                /**
                 * An enum member indicating that [Entity] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CONTRACT -> Value.CONTRACT
                    COMMIT -> Value.COMMIT
                    CONTRACT_CREDIT -> Value.CONTRACT_CREDIT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CONTRACT -> Known.CONTRACT
                    COMMIT -> Known.COMMIT
                    CONTRACT_CREDIT -> Known.CONTRACT_CREDIT
                    else -> throw MetronomeInvalidDataException("Unknown Entity: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entity && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFieldFilter && entity == other.entity && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entity, key, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomFieldFilter{entity=$entity, key=$key, value=$value, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class GroupValue
    @JsonCreator
    private constructor(
        @JsonProperty("key") @ExcludeMissing private val key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun key(): String = key.getRequired("key")

        fun value(): Optional<String> = Optional.ofNullable(value.getNullable("value"))

        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): GroupValue = apply {
            if (validated) {
                return@apply
            }

            key()
            value()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GroupValue]. */
        class Builder internal constructor() {

            private var key: JsonField<String>? = null
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(groupValue: GroupValue) = apply {
                key = groupValue.key
                value = groupValue.value
                additionalProperties = groupValue.additionalProperties.toMutableMap()
            }

            fun key(key: String) = key(JsonField.of(key))

            fun key(key: JsonField<String>) = apply { this.key = key }

            fun value(value: String) = value(JsonField.of(value))

            fun value(value: JsonField<String>) = apply { this.value = value }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): GroupValue =
                GroupValue(checkRequired("key", key), value, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GroupValue && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GroupValue{key=$key, value=$value, additionalProperties=$additionalProperties}"
    }

    /**
     * Required for `low_remaining_seat_balance_reached` notifications. The alert is scoped to this
     * seat group key-value pair.
     */
    @NoAutoDetect
    class SeatFilter
    @JsonCreator
    private constructor(
        @JsonProperty("seat_group_key")
        @ExcludeMissing
        private val seatGroupKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("seat_group_value")
        @ExcludeMissing
        private val seatGroupValue: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The seat group key (e.g., "seat_id", "user_id") */
        fun seatGroupKey(): String = seatGroupKey.getRequired("seat_group_key")

        /** Optional seat identifier the alert is scoped to. */
        fun seatGroupValue(): Optional<String> =
            Optional.ofNullable(seatGroupValue.getNullable("seat_group_value"))

        /** The seat group key (e.g., "seat_id", "user_id") */
        @JsonProperty("seat_group_key")
        @ExcludeMissing
        fun _seatGroupKey(): JsonField<String> = seatGroupKey

        /** Optional seat identifier the alert is scoped to. */
        @JsonProperty("seat_group_value")
        @ExcludeMissing
        fun _seatGroupValue(): JsonField<String> = seatGroupValue

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SeatFilter = apply {
            if (validated) {
                return@apply
            }

            seatGroupKey()
            seatGroupValue()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SeatFilter]. */
        class Builder internal constructor() {

            private var seatGroupKey: JsonField<String>? = null
            private var seatGroupValue: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(seatFilter: SeatFilter) = apply {
                seatGroupKey = seatFilter.seatGroupKey
                seatGroupValue = seatFilter.seatGroupValue
                additionalProperties = seatFilter.additionalProperties.toMutableMap()
            }

            /** The seat group key (e.g., "seat_id", "user_id") */
            fun seatGroupKey(seatGroupKey: String) = seatGroupKey(JsonField.of(seatGroupKey))

            /** The seat group key (e.g., "seat_id", "user_id") */
            fun seatGroupKey(seatGroupKey: JsonField<String>) = apply {
                this.seatGroupKey = seatGroupKey
            }

            /** Optional seat identifier the alert is scoped to. */
            fun seatGroupValue(seatGroupValue: String) =
                seatGroupValue(JsonField.of(seatGroupValue))

            /** Optional seat identifier the alert is scoped to. */
            fun seatGroupValue(seatGroupValue: JsonField<String>) = apply {
                this.seatGroupValue = seatGroupValue
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): SeatFilter =
                SeatFilter(
                    checkRequired("seatGroupKey", seatGroupKey),
                    seatGroupValue,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SeatFilter && seatGroupKey == other.seatGroupKey && seatGroupValue == other.seatGroupValue && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(seatGroupKey, seatGroupValue, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SeatFilter{seatGroupKey=$seatGroupKey, seatGroupValue=$seatGroupValue, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1AlertCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V1AlertCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
