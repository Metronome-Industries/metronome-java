// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.alerts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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
class AlertCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Type of the threshold notification
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun alertType(): AlertType = body.alertType()

    /**
     * Name of the threshold notification
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Threshold value of the notification policy. Depending upon the notification type, this number
     * may represent a financial amount, the days remaining, or a percentage reached.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun threshold(): Double = body.threshold()

    /**
     * For threshold notifications of type `usage_threshold_reached`, specifies which billable
     * metric to track the usage for.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billableMetricId(): Optional<String> = body.billableMetricId()

    /**
     * An array of strings, representing a way to filter the credit grant this threshold
     * notification applies to, by looking at the credit_grant_type field on the credit grant. This
     * field is only defined for CreditPercentage and CreditBalance notifications
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditGrantTypeFilters(): Optional<List<String>> = body.creditGrantTypeFilters()

    /**
     * ID of the credit's currency, defaults to USD. If the specific notification type requires a
     * pricing unit/currency, find the ID in the
     * [Metronome app](https://app.metronome.com/offering/pricing-units).
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditTypeId(): Optional<String> = body.creditTypeId()

    /**
     * A list of custom field filters for threshold notification types that support advanced
     * filtering. Only present for contract invoices.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFieldFilters(): Optional<List<CustomFieldFilter>> = body.customFieldFilters()

    /**
     * If provided, will create this threshold notification for this specific customer. To create a
     * notification for all customers, do not specify a `customer_id`.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerId(): Optional<String> = body.customerId()

    /**
     * If true, the threshold notification will evaluate immediately on customers that already meet
     * the notification threshold. If false, it will only evaluate on future customers that trigger
     * the threshold. Defaults to true.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluateOnCreate(): Optional<Boolean> = body.evaluateOnCreate()

    /**
     * Only present for `spend_threshold_reached` notifications. Scope notification to a specific
     * group key on individual line items.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupValues(): Optional<List<GroupValue>> = body.groupValues()

    /**
     * Only supported for invoice_total_reached threshold notifications. A list of invoice types to
     * evaluate.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceTypesFilter(): Optional<List<String>> = body.invoiceTypesFilter()

    /**
     * If provided, will create this threshold notification for this specific plan. To create a
     * notification for all customers, do not specify a `plan_id`.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planId(): Optional<String> = body.planId()

    /**
     * Required for `low_remaining_seat_balance_reached` notifications. The alert is scoped to this
     * seat group key-value pair.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun seatFilter(): Optional<SeatFilter> = body.seatFilter()

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uniquenessKey(): Optional<String> = body.uniquenessKey()

    /**
     * Returns the raw JSON value of [alertType].
     *
     * Unlike [alertType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _alertType(): JsonField<AlertType> = body._alertType()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [threshold].
     *
     * Unlike [threshold], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _threshold(): JsonField<Double> = body._threshold()

    /**
     * Returns the raw JSON value of [billableMetricId].
     *
     * Unlike [billableMetricId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _billableMetricId(): JsonField<String> = body._billableMetricId()

    /**
     * Returns the raw JSON value of [creditGrantTypeFilters].
     *
     * Unlike [creditGrantTypeFilters], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _creditGrantTypeFilters(): JsonField<List<String>> = body._creditGrantTypeFilters()

    /**
     * Returns the raw JSON value of [creditTypeId].
     *
     * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditTypeId(): JsonField<String> = body._creditTypeId()

    /**
     * Returns the raw JSON value of [customFieldFilters].
     *
     * Unlike [customFieldFilters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customFieldFilters(): JsonField<List<CustomFieldFilter>> = body._customFieldFilters()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [evaluateOnCreate].
     *
     * Unlike [evaluateOnCreate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _evaluateOnCreate(): JsonField<Boolean> = body._evaluateOnCreate()

    /**
     * Returns the raw JSON value of [groupValues].
     *
     * Unlike [groupValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groupValues(): JsonField<List<GroupValue>> = body._groupValues()

    /**
     * Returns the raw JSON value of [invoiceTypesFilter].
     *
     * Unlike [invoiceTypesFilter], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _invoiceTypesFilter(): JsonField<List<String>> = body._invoiceTypesFilter()

    /**
     * Returns the raw JSON value of [planId].
     *
     * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _planId(): JsonField<String> = body._planId()

    /**
     * Returns the raw JSON value of [seatFilter].
     *
     * Unlike [seatFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _seatFilter(): JsonField<SeatFilter> = body._seatFilter()

    /**
     * Returns the raw JSON value of [uniquenessKey].
     *
     * Unlike [uniquenessKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _uniquenessKey(): JsonField<String> = body._uniquenessKey()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlertCreateParams].
         *
         * The following fields are required:
         * ```java
         * .alertType()
         * .name()
         * .threshold()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AlertCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(alertCreateParams: AlertCreateParams) = apply {
            body = alertCreateParams.body.toBuilder()
            additionalHeaders = alertCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = alertCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [alertType]
         * - [name]
         * - [threshold]
         * - [billableMetricId]
         * - [creditGrantTypeFilters]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Type of the threshold notification */
        fun alertType(alertType: AlertType) = apply { body.alertType(alertType) }

        /**
         * Sets [Builder.alertType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alertType] with a well-typed [AlertType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun alertType(alertType: JsonField<AlertType>) = apply { body.alertType(alertType) }

        /** Name of the threshold notification */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Threshold value of the notification policy. Depending upon the notification type, this
         * number may represent a financial amount, the days remaining, or a percentage reached.
         */
        fun threshold(threshold: Double) = apply { body.threshold(threshold) }

        /**
         * Sets [Builder.threshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threshold] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Sets [Builder.billableMetricId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billableMetricId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.creditGrantTypeFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditGrantTypeFilters] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun creditGrantTypeFilters(creditGrantTypeFilters: JsonField<List<String>>) = apply {
            body.creditGrantTypeFilters(creditGrantTypeFilters)
        }

        /**
         * Adds a single [String] to [creditGrantTypeFilters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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
         * Sets [Builder.creditTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Sets [Builder.customFieldFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFieldFilters] with a well-typed
         * `List<CustomFieldFilter>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun customFieldFilters(customFieldFilters: JsonField<List<CustomFieldFilter>>) = apply {
            body.customFieldFilters(customFieldFilters)
        }

        /**
         * Adds a single [CustomFieldFilter] to [customFieldFilters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Sets [Builder.evaluateOnCreate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluateOnCreate] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.groupValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupValues] with a well-typed `List<GroupValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun groupValues(groupValues: JsonField<List<GroupValue>>) = apply {
            body.groupValues(groupValues)
        }

        /**
         * Adds a single [GroupValue] to [groupValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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
         * Sets [Builder.invoiceTypesFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceTypesFilter] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun invoiceTypesFilter(invoiceTypesFilter: JsonField<List<String>>) = apply {
            body.invoiceTypesFilter(invoiceTypesFilter)
        }

        /**
         * Adds a single [String] to [Builder.invoiceTypesFilter].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planId(planId: JsonField<String>) = apply { body.planId(planId) }

        /**
         * Required for `low_remaining_seat_balance_reached` notifications. The alert is scoped to
         * this seat group key-value pair.
         */
        fun seatFilter(seatFilter: SeatFilter) = apply { body.seatFilter(seatFilter) }

        /**
         * Sets [Builder.seatFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seatFilter] with a well-typed [SeatFilter] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun seatFilter(seatFilter: JsonField<SeatFilter>) = apply { body.seatFilter(seatFilter) }

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: String) = apply { body.uniquenessKey(uniquenessKey) }

        /**
         * Sets [Builder.uniquenessKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uniquenessKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /**
         * Returns an immutable instance of [AlertCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .alertType()
         * .name()
         * .threshold()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AlertCreateParams =
            AlertCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val alertType: JsonField<AlertType>,
        private val name: JsonField<String>,
        private val threshold: JsonField<Double>,
        private val billableMetricId: JsonField<String>,
        private val creditGrantTypeFilters: JsonField<List<String>>,
        private val creditTypeId: JsonField<String>,
        private val customFieldFilters: JsonField<List<CustomFieldFilter>>,
        private val customerId: JsonField<String>,
        private val evaluateOnCreate: JsonField<Boolean>,
        private val groupValues: JsonField<List<GroupValue>>,
        private val invoiceTypesFilter: JsonField<List<String>>,
        private val planId: JsonField<String>,
        private val seatFilter: JsonField<SeatFilter>,
        private val uniquenessKey: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("alert_type")
            @ExcludeMissing
            alertType: JsonField<AlertType> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("threshold")
            @ExcludeMissing
            threshold: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("billable_metric_id")
            @ExcludeMissing
            billableMetricId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_grant_type_filters")
            @ExcludeMissing
            creditGrantTypeFilters: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_field_filters")
            @ExcludeMissing
            customFieldFilters: JsonField<List<CustomFieldFilter>> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("evaluate_on_create")
            @ExcludeMissing
            evaluateOnCreate: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("group_values")
            @ExcludeMissing
            groupValues: JsonField<List<GroupValue>> = JsonMissing.of(),
            @JsonProperty("invoice_types_filter")
            @ExcludeMissing
            invoiceTypesFilter: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("plan_id") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("seat_filter")
            @ExcludeMissing
            seatFilter: JsonField<SeatFilter> = JsonMissing.of(),
            @JsonProperty("uniqueness_key")
            @ExcludeMissing
            uniquenessKey: JsonField<String> = JsonMissing.of(),
        ) : this(
            alertType,
            name,
            threshold,
            billableMetricId,
            creditGrantTypeFilters,
            creditTypeId,
            customFieldFilters,
            customerId,
            evaluateOnCreate,
            groupValues,
            invoiceTypesFilter,
            planId,
            seatFilter,
            uniquenessKey,
            mutableMapOf(),
        )

        /**
         * Type of the threshold notification
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun alertType(): AlertType = alertType.getRequired("alert_type")

        /**
         * Name of the threshold notification
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Threshold value of the notification policy. Depending upon the notification type, this
         * number may represent a financial amount, the days remaining, or a percentage reached.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun threshold(): Double = threshold.getRequired("threshold")

        /**
         * For threshold notifications of type `usage_threshold_reached`, specifies which billable
         * metric to track the usage for.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun billableMetricId(): Optional<String> =
            billableMetricId.getOptional("billable_metric_id")

        /**
         * An array of strings, representing a way to filter the credit grant this threshold
         * notification applies to, by looking at the credit_grant_type field on the credit grant.
         * This field is only defined for CreditPercentage and CreditBalance notifications
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditGrantTypeFilters(): Optional<List<String>> =
            creditGrantTypeFilters.getOptional("credit_grant_type_filters")

        /**
         * ID of the credit's currency, defaults to USD. If the specific notification type requires
         * a pricing unit/currency, find the ID in the
         * [Metronome app](https://app.metronome.com/offering/pricing-units).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditTypeId(): Optional<String> = creditTypeId.getOptional("credit_type_id")

        /**
         * A list of custom field filters for threshold notification types that support advanced
         * filtering. Only present for contract invoices.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFieldFilters(): Optional<List<CustomFieldFilter>> =
            customFieldFilters.getOptional("custom_field_filters")

        /**
         * If provided, will create this threshold notification for this specific customer. To
         * create a notification for all customers, do not specify a `customer_id`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customerId(): Optional<String> = customerId.getOptional("customer_id")

        /**
         * If true, the threshold notification will evaluate immediately on customers that already
         * meet the notification threshold. If false, it will only evaluate on future customers that
         * trigger the threshold. Defaults to true.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun evaluateOnCreate(): Optional<Boolean> =
            evaluateOnCreate.getOptional("evaluate_on_create")

        /**
         * Only present for `spend_threshold_reached` notifications. Scope notification to a
         * specific group key on individual line items.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupValues(): Optional<List<GroupValue>> = groupValues.getOptional("group_values")

        /**
         * Only supported for invoice_total_reached threshold notifications. A list of invoice types
         * to evaluate.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceTypesFilter(): Optional<List<String>> =
            invoiceTypesFilter.getOptional("invoice_types_filter")

        /**
         * If provided, will create this threshold notification for this specific plan. To create a
         * notification for all customers, do not specify a `plan_id`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun planId(): Optional<String> = planId.getOptional("plan_id")

        /**
         * Required for `low_remaining_seat_balance_reached` notifications. The alert is scoped to
         * this seat group key-value pair.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun seatFilter(): Optional<SeatFilter> = seatFilter.getOptional("seat_filter")

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun uniquenessKey(): Optional<String> = uniquenessKey.getOptional("uniqueness_key")

        /**
         * Returns the raw JSON value of [alertType].
         *
         * Unlike [alertType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alert_type")
        @ExcludeMissing
        fun _alertType(): JsonField<AlertType> = alertType

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [threshold].
         *
         * Unlike [threshold], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("threshold") @ExcludeMissing fun _threshold(): JsonField<Double> = threshold

        /**
         * Returns the raw JSON value of [billableMetricId].
         *
         * Unlike [billableMetricId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        fun _billableMetricId(): JsonField<String> = billableMetricId

        /**
         * Returns the raw JSON value of [creditGrantTypeFilters].
         *
         * Unlike [creditGrantTypeFilters], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credit_grant_type_filters")
        @ExcludeMissing
        fun _creditGrantTypeFilters(): JsonField<List<String>> = creditGrantTypeFilters

        /**
         * Returns the raw JSON value of [creditTypeId].
         *
         * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

        /**
         * Returns the raw JSON value of [customFieldFilters].
         *
         * Unlike [customFieldFilters], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("custom_field_filters")
        @ExcludeMissing
        fun _customFieldFilters(): JsonField<List<CustomFieldFilter>> = customFieldFilters

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [evaluateOnCreate].
         *
         * Unlike [evaluateOnCreate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("evaluate_on_create")
        @ExcludeMissing
        fun _evaluateOnCreate(): JsonField<Boolean> = evaluateOnCreate

        /**
         * Returns the raw JSON value of [groupValues].
         *
         * Unlike [groupValues], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_values")
        @ExcludeMissing
        fun _groupValues(): JsonField<List<GroupValue>> = groupValues

        /**
         * Returns the raw JSON value of [invoiceTypesFilter].
         *
         * Unlike [invoiceTypesFilter], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("invoice_types_filter")
        @ExcludeMissing
        fun _invoiceTypesFilter(): JsonField<List<String>> = invoiceTypesFilter

        /**
         * Returns the raw JSON value of [planId].
         *
         * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

        /**
         * Returns the raw JSON value of [seatFilter].
         *
         * Unlike [seatFilter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("seat_filter")
        @ExcludeMissing
        fun _seatFilter(): JsonField<SeatFilter> = seatFilter

        /**
         * Returns the raw JSON value of [uniquenessKey].
         *
         * Unlike [uniquenessKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        fun _uniquenessKey(): JsonField<String> = uniquenessKey

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .alertType()
             * .name()
             * .threshold()
             * ```
             */
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

            /**
             * Sets [Builder.alertType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alertType] with a well-typed [AlertType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alertType(alertType: JsonField<AlertType>) = apply { this.alertType = alertType }

            /** Name of the threshold notification */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Threshold value of the notification policy. Depending upon the notification type,
             * this number may represent a financial amount, the days remaining, or a percentage
             * reached.
             */
            fun threshold(threshold: Double) = threshold(JsonField.of(threshold))

            /**
             * Sets [Builder.threshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.threshold] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun threshold(threshold: JsonField<Double>) = apply { this.threshold = threshold }

            /**
             * For threshold notifications of type `usage_threshold_reached`, specifies which
             * billable metric to track the usage for.
             */
            fun billableMetricId(billableMetricId: String) =
                billableMetricId(JsonField.of(billableMetricId))

            /**
             * Sets [Builder.billableMetricId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billableMetricId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.creditGrantTypeFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditGrantTypeFilters] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun creditGrantTypeFilters(creditGrantTypeFilters: JsonField<List<String>>) = apply {
                this.creditGrantTypeFilters = creditGrantTypeFilters.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [creditGrantTypeFilters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCreditGrantTypeFilter(creditGrantTypeFilter: String) = apply {
                creditGrantTypeFilters =
                    (creditGrantTypeFilters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("creditGrantTypeFilters", it).add(creditGrantTypeFilter)
                    }
            }

            /**
             * ID of the credit's currency, defaults to USD. If the specific notification type
             * requires a pricing unit/currency, find the ID in the
             * [Metronome app](https://app.metronome.com/offering/pricing-units).
             */
            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            /**
             * Sets [Builder.creditTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.customFieldFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFieldFilters] with a well-typed
             * `List<CustomFieldFilter>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun customFieldFilters(customFieldFilters: JsonField<List<CustomFieldFilter>>) = apply {
                this.customFieldFilters = customFieldFilters.map { it.toMutableList() }
            }

            /**
             * Adds a single [CustomFieldFilter] to [customFieldFilters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCustomFieldFilter(customFieldFilter: CustomFieldFilter) = apply {
                customFieldFilters =
                    (customFieldFilters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customFieldFilters", it).add(customFieldFilter)
                    }
            }

            /**
             * If provided, will create this threshold notification for this specific customer. To
             * create a notification for all customers, do not specify a `customer_id`.
             */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.evaluateOnCreate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evaluateOnCreate] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.groupValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupValues] with a well-typed `List<GroupValue>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun groupValues(groupValues: JsonField<List<GroupValue>>) = apply {
                this.groupValues = groupValues.map { it.toMutableList() }
            }

            /**
             * Adds a single [GroupValue] to [groupValues].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGroupValue(groupValue: GroupValue) = apply {
                groupValues =
                    (groupValues ?: JsonField.of(mutableListOf())).also {
                        checkKnown("groupValues", it).add(groupValue)
                    }
            }

            /**
             * Only supported for invoice_total_reached threshold notifications. A list of invoice
             * types to evaluate.
             */
            fun invoiceTypesFilter(invoiceTypesFilter: List<String>) =
                invoiceTypesFilter(JsonField.of(invoiceTypesFilter))

            /**
             * Sets [Builder.invoiceTypesFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceTypesFilter] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invoiceTypesFilter(invoiceTypesFilter: JsonField<List<String>>) = apply {
                this.invoiceTypesFilter = invoiceTypesFilter.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.invoiceTypesFilter].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInvoiceTypesFilter(invoiceTypesFilter: String) = apply {
                this.invoiceTypesFilter =
                    (this.invoiceTypesFilter ?: JsonField.of(mutableListOf())).also {
                        checkKnown("invoiceTypesFilter", it).add(invoiceTypesFilter)
                    }
            }

            /**
             * If provided, will create this threshold notification for this specific plan. To
             * create a notification for all customers, do not specify a `plan_id`.
             */
            fun planId(planId: String) = planId(JsonField.of(planId))

            /**
             * Sets [Builder.planId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            /**
             * Required for `low_remaining_seat_balance_reached` notifications. The alert is scoped
             * to this seat group key-value pair.
             */
            fun seatFilter(seatFilter: SeatFilter) = seatFilter(JsonField.of(seatFilter))

            /**
             * Sets [Builder.seatFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seatFilter] with a well-typed [SeatFilter] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.uniquenessKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uniquenessKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .alertType()
             * .name()
             * .threshold()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
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
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            alertType().validate()
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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (alertType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (threshold.asKnown().isPresent) 1 else 0) +
                (if (billableMetricId.asKnown().isPresent) 1 else 0) +
                (creditGrantTypeFilters.asKnown().getOrNull()?.size ?: 0) +
                (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                (customFieldFilters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (evaluateOnCreate.asKnown().isPresent) 1 else 0) +
                (groupValues.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (invoiceTypesFilter.asKnown().getOrNull()?.size ?: 0) +
                (if (planId.asKnown().isPresent) 1 else 0) +
                (seatFilter.asKnown().getOrNull()?.validity() ?: 0) +
                (if (uniquenessKey.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                alertType == other.alertType &&
                name == other.name &&
                threshold == other.threshold &&
                billableMetricId == other.billableMetricId &&
                creditGrantTypeFilters == other.creditGrantTypeFilters &&
                creditTypeId == other.creditTypeId &&
                customFieldFilters == other.customFieldFilters &&
                customerId == other.customerId &&
                evaluateOnCreate == other.evaluateOnCreate &&
                groupValues == other.groupValues &&
                invoiceTypesFilter == other.invoiceTypesFilter &&
                planId == other.planId &&
                seatFilter == other.seatFilter &&
                uniquenessKey == other.uniquenessKey &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                alertType,
                name,
                threshold,
                billableMetricId,
                creditGrantTypeFilters,
                creditTypeId,
                customFieldFilters,
                customerId,
                evaluateOnCreate,
                groupValues,
                invoiceTypesFilter,
                planId,
                seatFilter,
                uniquenessKey,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{alertType=$alertType, name=$name, threshold=$threshold, billableMetricId=$billableMetricId, creditGrantTypeFilters=$creditGrantTypeFilters, creditTypeId=$creditTypeId, customFieldFilters=$customFieldFilters, customerId=$customerId, evaluateOnCreate=$evaluateOnCreate, groupValues=$groupValues, invoiceTypesFilter=$invoiceTypesFilter, planId=$planId, seatFilter=$seatFilter, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): AlertType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AlertType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class CustomFieldFilter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val entity: JsonField<Entity>,
        private val key: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("entity") @ExcludeMissing entity: JsonField<Entity> = JsonMissing.of(),
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(entity, key, value, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entity(): Entity = entity.getRequired("entity")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun key(): String = key.getRequired("key")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * Returns the raw JSON value of [entity].
         *
         * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<Entity> = entity

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [CustomFieldFilter].
             *
             * The following fields are required:
             * ```java
             * .entity()
             * .key()
             * .value()
             * ```
             */
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

            /**
             * Sets [Builder.entity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entity] with a well-typed [Entity] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [CustomFieldFilter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .entity()
             * .key()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CustomFieldFilter =
                CustomFieldFilter(
                    checkRequired("entity", entity),
                    checkRequired("key", key),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CustomFieldFilter = apply {
            if (validated) {
                return@apply
            }

            entity().validate()
            key()
            value()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (entity.asKnown().getOrNull()?.validity() ?: 0) +
                (if (key.asKnown().isPresent) 1 else 0) +
                (if (value.asKnown().isPresent) 1 else 0)

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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Entity = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entity && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomFieldFilter &&
                entity == other.entity &&
                key == other.key &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(entity, key, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomFieldFilter{entity=$entity, key=$key, value=$value, additionalProperties=$additionalProperties}"
    }

    class GroupValue
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val key: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(key, value, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun key(): String = key.getRequired("key")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun value(): Optional<String> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [GroupValue].
             *
             * The following fields are required:
             * ```java
             * .key()
             * ```
             */
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

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [GroupValue].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .key()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): GroupValue =
                GroupValue(checkRequired("key", key), value, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): GroupValue = apply {
            if (validated) {
                return@apply
            }

            key()
            value()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (key.asKnown().isPresent) 1 else 0) + (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GroupValue &&
                key == other.key &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GroupValue{key=$key, value=$value, additionalProperties=$additionalProperties}"
    }

    /**
     * Required for `low_remaining_seat_balance_reached` notifications. The alert is scoped to this
     * seat group key-value pair.
     */
    class SeatFilter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val seatGroupKey: JsonField<String>,
        private val seatGroupValue: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("seat_group_key")
            @ExcludeMissing
            seatGroupKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("seat_group_value")
            @ExcludeMissing
            seatGroupValue: JsonField<String> = JsonMissing.of(),
        ) : this(seatGroupKey, seatGroupValue, mutableMapOf())

        /**
         * The seat group key (e.g., "seat_id", "user_id")
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun seatGroupKey(): String = seatGroupKey.getRequired("seat_group_key")

        /**
         * Optional seat identifier the alert is scoped to.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun seatGroupValue(): Optional<String> = seatGroupValue.getOptional("seat_group_value")

        /**
         * Returns the raw JSON value of [seatGroupKey].
         *
         * Unlike [seatGroupKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("seat_group_key")
        @ExcludeMissing
        fun _seatGroupKey(): JsonField<String> = seatGroupKey

        /**
         * Returns the raw JSON value of [seatGroupValue].
         *
         * Unlike [seatGroupValue], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("seat_group_value")
        @ExcludeMissing
        fun _seatGroupValue(): JsonField<String> = seatGroupValue

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [SeatFilter].
             *
             * The following fields are required:
             * ```java
             * .seatGroupKey()
             * ```
             */
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

            /**
             * Sets [Builder.seatGroupKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seatGroupKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun seatGroupKey(seatGroupKey: JsonField<String>) = apply {
                this.seatGroupKey = seatGroupKey
            }

            /** Optional seat identifier the alert is scoped to. */
            fun seatGroupValue(seatGroupValue: String) =
                seatGroupValue(JsonField.of(seatGroupValue))

            /**
             * Sets [Builder.seatGroupValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seatGroupValue] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [SeatFilter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .seatGroupKey()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SeatFilter =
                SeatFilter(
                    checkRequired("seatGroupKey", seatGroupKey),
                    seatGroupValue,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): SeatFilter = apply {
            if (validated) {
                return@apply
            }

            seatGroupKey()
            seatGroupValue()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (seatGroupKey.asKnown().isPresent) 1 else 0) +
                (if (seatGroupValue.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SeatFilter &&
                seatGroupKey == other.seatGroupKey &&
                seatGroupValue == other.seatGroupValue &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(seatGroupKey, seatGroupValue, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SeatFilter{seatGroupKey=$seatGroupKey, seatGroupValue=$seatGroupValue, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlertCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AlertCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
