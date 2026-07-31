// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.alerts

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
 * Retrieve the real-time evaluation status for a specific threshold notification-customer pair.
 * This endpoint provides instant visibility into whether a customer has triggered a threshold
 * notification condition, enabling you to monitor account health and take proactive action based on
 * current threshold notification states.
 *
 * ### Use this endpoint to:
 * - Check if a specific customer is currently violating an threshold notification (`in_alarm`
 *   status)
 * - Verify threshold notification configuration details and threshold values for a customer
 * - Monitor the evaluation state of newly created or recently modified threshold notification
 * - Build dashboards or automated workflows that respond to specific threshold notification
 *   conditions
 * - Validate threshold notification behavior before deploying to production customers
 * - Integrate threshold notification status checks into customer support tools or admin interfaces
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
 * - `updated_at`: Timestamp of when the `customer_status` was last updated
 * - alert: Complete threshold notification configuration including:
 *     - Notification ID, name, and type
 *     - Current threshold values and credit type information
 *     - Notification status (enabled, disabled, or archived)
 *     - Any applied filters (credit grant types, custom fields, group values)
 *
 * ### Usage guidelines:
 * - Customer status: Returns the current evaluation state, not historical data. For threshold
 *   notification history, use webhook notifications or event logs
 * - Required parameters: Both customer_id and alert_id must be valid UUIDs that exist in your
 *   organization
 * - Archived notifications: Returns null for customer_status if the notification has been archived,
 *   but still includes the notification configuration details
 * - Performance considerations: This endpoint queries live evaluation state, making it ideal for
 *   real-time monitoring but not for bulk status checks
 * - Integration patterns: Best used for on-demand status checks in response to user actions or as
 *   part of targeted monitoring workflows
 * - Error handling: Returns 404 if either the customer or alert_id doesn't exist or isn't
 *   accessible to your organization
 */
class AlertRetrieveParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The Metronome ID of the threshold notification
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun alertId(): String = body.alertId()

    /**
     * The Metronome ID of the customer
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * Can be used with only `low_remaining_contract_credit_and_commit_balance_reached`
     * notifications. Used to filter the alert by the custom field key-value pair.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alertSpecifiers(): Optional<List<AlertSpecifier>> = body.alertSpecifiers()

    /**
     * Only present for `spend_threshold_reached` notifications. Retrieve the notification for a
     * specific group key-value pair.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupValues(): Optional<List<GroupValue>> = body.groupValues()

    /**
     * When parallel threshold notifications are enabled during migration, this flag denotes whether
     * to fetch notifications for plans or contracts.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun plansOrContracts(): Optional<PlansOrContracts> = body.plansOrContracts()

    /**
     * Only allowed for `low_remaining_seat_balance_reached` notifications. This filters alerts by
     * the seat group key-value pair.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun seatFilter(): Optional<SeatFilter> = body.seatFilter()

    /**
     * Returns the raw JSON value of [alertId].
     *
     * Unlike [alertId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _alertId(): JsonField<String> = body._alertId()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [alertSpecifiers].
     *
     * Unlike [alertSpecifiers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _alertSpecifiers(): JsonField<List<AlertSpecifier>> = body._alertSpecifiers()

    /**
     * Returns the raw JSON value of [groupValues].
     *
     * Unlike [groupValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groupValues(): JsonField<List<GroupValue>> = body._groupValues()

    /**
     * Returns the raw JSON value of [plansOrContracts].
     *
     * Unlike [plansOrContracts], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _plansOrContracts(): JsonField<PlansOrContracts> = body._plansOrContracts()

    /**
     * Returns the raw JSON value of [seatFilter].
     *
     * Unlike [seatFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _seatFilter(): JsonField<SeatFilter> = body._seatFilter()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlertRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .alertId()
         * .customerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AlertRetrieveParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(alertRetrieveParams: AlertRetrieveParams) = apply {
            body = alertRetrieveParams.body.toBuilder()
            additionalHeaders = alertRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = alertRetrieveParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [alertId]
         * - [customerId]
         * - [alertSpecifiers]
         * - [groupValues]
         * - [plansOrContracts]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The Metronome ID of the threshold notification */
        fun alertId(alertId: String) = apply { body.alertId(alertId) }

        /**
         * Sets [Builder.alertId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alertId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alertId(alertId: JsonField<String>) = apply { body.alertId(alertId) }

        /** The Metronome ID of the customer */
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
         * Can be used with only `low_remaining_contract_credit_and_commit_balance_reached`
         * notifications. Used to filter the alert by the custom field key-value pair.
         */
        fun alertSpecifiers(alertSpecifiers: List<AlertSpecifier>) = apply {
            body.alertSpecifiers(alertSpecifiers)
        }

        /**
         * Sets [Builder.alertSpecifiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alertSpecifiers] with a well-typed
         * `List<AlertSpecifier>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun alertSpecifiers(alertSpecifiers: JsonField<List<AlertSpecifier>>) = apply {
            body.alertSpecifiers(alertSpecifiers)
        }

        /**
         * Adds a single [AlertSpecifier] to [alertSpecifiers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAlertSpecifier(alertSpecifier: AlertSpecifier) = apply {
            body.addAlertSpecifier(alertSpecifier)
        }

        /**
         * Only present for `spend_threshold_reached` notifications. Retrieve the notification for a
         * specific group key-value pair.
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
         * When parallel threshold notifications are enabled during migration, this flag denotes
         * whether to fetch notifications for plans or contracts.
         */
        fun plansOrContracts(plansOrContracts: PlansOrContracts) = apply {
            body.plansOrContracts(plansOrContracts)
        }

        /**
         * Sets [Builder.plansOrContracts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plansOrContracts] with a well-typed [PlansOrContracts]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun plansOrContracts(plansOrContracts: JsonField<PlansOrContracts>) = apply {
            body.plansOrContracts(plansOrContracts)
        }

        /**
         * Only allowed for `low_remaining_seat_balance_reached` notifications. This filters alerts
         * by the seat group key-value pair.
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
         * Returns an immutable instance of [AlertRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .alertId()
         * .customerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AlertRetrieveParams =
            AlertRetrieveParams(
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
        private val alertId: JsonField<String>,
        private val customerId: JsonField<String>,
        private val alertSpecifiers: JsonField<List<AlertSpecifier>>,
        private val groupValues: JsonField<List<GroupValue>>,
        private val plansOrContracts: JsonField<PlansOrContracts>,
        private val seatFilter: JsonField<SeatFilter>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("alert_id") @ExcludeMissing alertId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("alert_specifiers")
            @ExcludeMissing
            alertSpecifiers: JsonField<List<AlertSpecifier>> = JsonMissing.of(),
            @JsonProperty("group_values")
            @ExcludeMissing
            groupValues: JsonField<List<GroupValue>> = JsonMissing.of(),
            @JsonProperty("plans_or_contracts")
            @ExcludeMissing
            plansOrContracts: JsonField<PlansOrContracts> = JsonMissing.of(),
            @JsonProperty("seat_filter")
            @ExcludeMissing
            seatFilter: JsonField<SeatFilter> = JsonMissing.of(),
        ) : this(
            alertId,
            customerId,
            alertSpecifiers,
            groupValues,
            plansOrContracts,
            seatFilter,
            mutableMapOf(),
        )

        /**
         * The Metronome ID of the threshold notification
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun alertId(): String = alertId.getRequired("alert_id")

        /**
         * The Metronome ID of the customer
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * Can be used with only `low_remaining_contract_credit_and_commit_balance_reached`
         * notifications. Used to filter the alert by the custom field key-value pair.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun alertSpecifiers(): Optional<List<AlertSpecifier>> =
            alertSpecifiers.getOptional("alert_specifiers")

        /**
         * Only present for `spend_threshold_reached` notifications. Retrieve the notification for a
         * specific group key-value pair.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupValues(): Optional<List<GroupValue>> = groupValues.getOptional("group_values")

        /**
         * When parallel threshold notifications are enabled during migration, this flag denotes
         * whether to fetch notifications for plans or contracts.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun plansOrContracts(): Optional<PlansOrContracts> =
            plansOrContracts.getOptional("plans_or_contracts")

        /**
         * Only allowed for `low_remaining_seat_balance_reached` notifications. This filters alerts
         * by the seat group key-value pair.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun seatFilter(): Optional<SeatFilter> = seatFilter.getOptional("seat_filter")

        /**
         * Returns the raw JSON value of [alertId].
         *
         * Unlike [alertId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alert_id") @ExcludeMissing fun _alertId(): JsonField<String> = alertId

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [alertSpecifiers].
         *
         * Unlike [alertSpecifiers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("alert_specifiers")
        @ExcludeMissing
        fun _alertSpecifiers(): JsonField<List<AlertSpecifier>> = alertSpecifiers

        /**
         * Returns the raw JSON value of [groupValues].
         *
         * Unlike [groupValues], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_values")
        @ExcludeMissing
        fun _groupValues(): JsonField<List<GroupValue>> = groupValues

        /**
         * Returns the raw JSON value of [plansOrContracts].
         *
         * Unlike [plansOrContracts], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plans_or_contracts")
        @ExcludeMissing
        fun _plansOrContracts(): JsonField<PlansOrContracts> = plansOrContracts

        /**
         * Returns the raw JSON value of [seatFilter].
         *
         * Unlike [seatFilter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("seat_filter")
        @ExcludeMissing
        fun _seatFilter(): JsonField<SeatFilter> = seatFilter

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
             * .alertId()
             * .customerId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var alertId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var alertSpecifiers: JsonField<MutableList<AlertSpecifier>>? = null
            private var groupValues: JsonField<MutableList<GroupValue>>? = null
            private var plansOrContracts: JsonField<PlansOrContracts> = JsonMissing.of()
            private var seatFilter: JsonField<SeatFilter> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                alertId = body.alertId
                customerId = body.customerId
                alertSpecifiers = body.alertSpecifiers.map { it.toMutableList() }
                groupValues = body.groupValues.map { it.toMutableList() }
                plansOrContracts = body.plansOrContracts
                seatFilter = body.seatFilter
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The Metronome ID of the threshold notification */
            fun alertId(alertId: String) = alertId(JsonField.of(alertId))

            /**
             * Sets [Builder.alertId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alertId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alertId(alertId: JsonField<String>) = apply { this.alertId = alertId }

            /** The Metronome ID of the customer */
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
             * Can be used with only `low_remaining_contract_credit_and_commit_balance_reached`
             * notifications. Used to filter the alert by the custom field key-value pair.
             */
            fun alertSpecifiers(alertSpecifiers: List<AlertSpecifier>) =
                alertSpecifiers(JsonField.of(alertSpecifiers))

            /**
             * Sets [Builder.alertSpecifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alertSpecifiers] with a well-typed
             * `List<AlertSpecifier>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun alertSpecifiers(alertSpecifiers: JsonField<List<AlertSpecifier>>) = apply {
                this.alertSpecifiers = alertSpecifiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [AlertSpecifier] to [alertSpecifiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAlertSpecifier(alertSpecifier: AlertSpecifier) = apply {
                alertSpecifiers =
                    (alertSpecifiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("alertSpecifiers", it).add(alertSpecifier)
                    }
            }

            /**
             * Only present for `spend_threshold_reached` notifications. Retrieve the notification
             * for a specific group key-value pair.
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
             * When parallel threshold notifications are enabled during migration, this flag denotes
             * whether to fetch notifications for plans or contracts.
             */
            fun plansOrContracts(plansOrContracts: PlansOrContracts) =
                plansOrContracts(JsonField.of(plansOrContracts))

            /**
             * Sets [Builder.plansOrContracts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.plansOrContracts] with a well-typed
             * [PlansOrContracts] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun plansOrContracts(plansOrContracts: JsonField<PlansOrContracts>) = apply {
                this.plansOrContracts = plansOrContracts
            }

            /**
             * Only allowed for `low_remaining_seat_balance_reached` notifications. This filters
             * alerts by the seat group key-value pair.
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
             * .alertId()
             * .customerId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("alertId", alertId),
                    checkRequired("customerId", customerId),
                    (alertSpecifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    (groupValues ?: JsonMissing.of()).map { it.toImmutable() },
                    plansOrContracts,
                    seatFilter,
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

            alertId()
            customerId()
            alertSpecifiers().ifPresent { it.forEach { it.validate() } }
            groupValues().ifPresent { it.forEach { it.validate() } }
            plansOrContracts().ifPresent { it.validate() }
            seatFilter().ifPresent { it.validate() }
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
            (if (alertId.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (alertSpecifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (groupValues.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (plansOrContracts.asKnown().getOrNull()?.validity() ?: 0) +
                (seatFilter.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                alertId == other.alertId &&
                customerId == other.customerId &&
                alertSpecifiers == other.alertSpecifiers &&
                groupValues == other.groupValues &&
                plansOrContracts == other.plansOrContracts &&
                seatFilter == other.seatFilter &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                alertId,
                customerId,
                alertSpecifiers,
                groupValues,
                plansOrContracts,
                seatFilter,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{alertId=$alertId, customerId=$customerId, alertSpecifiers=$alertSpecifiers, groupValues=$groupValues, plansOrContracts=$plansOrContracts, seatFilter=$seatFilter, additionalProperties=$additionalProperties}"
    }

    class AlertSpecifier
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customFieldFilters: JsonField<List<CustomFieldFilter>>,
        private val exclude: JsonField<List<Exclude>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("custom_field_filters")
            @ExcludeMissing
            customFieldFilters: JsonField<List<CustomFieldFilter>> = JsonMissing.of(),
            @JsonProperty("exclude")
            @ExcludeMissing
            exclude: JsonField<List<Exclude>> = JsonMissing.of(),
        ) : this(customFieldFilters, exclude, mutableMapOf())

        /**
         * A list of custom field filters for notification types that support advanced filtering
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customFieldFilters(): List<CustomFieldFilter> =
            customFieldFilters.getRequired("custom_field_filters")

        /**
         * If provided, the specifier will not apply to balances that matches the inclusion criteria
         * and any of the excluding values.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun exclude(): Optional<List<Exclude>> = exclude.getOptional("exclude")

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
         * Returns the raw JSON value of [exclude].
         *
         * Unlike [exclude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("exclude") @ExcludeMissing fun _exclude(): JsonField<List<Exclude>> = exclude

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
             * Returns a mutable builder for constructing an instance of [AlertSpecifier].
             *
             * The following fields are required:
             * ```java
             * .customFieldFilters()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AlertSpecifier]. */
        class Builder internal constructor() {

            private var customFieldFilters: JsonField<MutableList<CustomFieldFilter>>? = null
            private var exclude: JsonField<MutableList<Exclude>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(alertSpecifier: AlertSpecifier) = apply {
                customFieldFilters = alertSpecifier.customFieldFilters.map { it.toMutableList() }
                exclude = alertSpecifier.exclude.map { it.toMutableList() }
                additionalProperties = alertSpecifier.additionalProperties.toMutableMap()
            }

            /**
             * A list of custom field filters for notification types that support advanced filtering
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
             * If provided, the specifier will not apply to balances that matches the inclusion
             * criteria and any of the excluding values.
             */
            fun exclude(exclude: List<Exclude>) = exclude(JsonField.of(exclude))

            /**
             * Sets [Builder.exclude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exclude] with a well-typed `List<Exclude>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exclude(exclude: JsonField<List<Exclude>>) = apply {
                this.exclude = exclude.map { it.toMutableList() }
            }

            /**
             * Adds a single [Exclude] to [Builder.exclude].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExclude(exclude: Exclude) = apply {
                this.exclude =
                    (this.exclude ?: JsonField.of(mutableListOf())).also {
                        checkKnown("exclude", it).add(exclude)
                    }
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
             * Returns an immutable instance of [AlertSpecifier].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .customFieldFilters()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AlertSpecifier =
                AlertSpecifier(
                    checkRequired("customFieldFilters", customFieldFilters).map {
                        it.toImmutable()
                    },
                    (exclude ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): AlertSpecifier = apply {
            if (validated) {
                return@apply
            }

            customFieldFilters().forEach { it.validate() }
            exclude().ifPresent { it.forEach { it.validate() } }
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
            (customFieldFilters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (exclude.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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
                @JsonProperty("entity")
                @ExcludeMissing
                entity: JsonField<Entity> = JsonMissing.of(),
                @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(entity, key, value, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun entity(): Entity = entity.getRequired("entity")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun key(): String = key.getRequired("key")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
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
                 * You should usually call [Builder.entity] with a well-typed [Entity] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

                fun key(key: String) = key(JsonField.of(key))

                /**
                 * Sets [Builder.key] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.key] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

            class Entity @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CONTRACT = of("Contract")

                    @JvmField val COMMIT = of("Commit")

                    @JvmField val CONTRACT_CREDIT = of("ContractCredit")

                    @JvmField val CONTRACT_CREDIT_OR_COMMIT = of("ContractCreditOrCommit")

                    @JvmStatic fun of(value: String) = Entity(JsonField.of(value))
                }

                /** An enum containing [Entity]'s known values. */
                enum class Known {
                    CONTRACT,
                    COMMIT,
                    CONTRACT_CREDIT,
                    CONTRACT_CREDIT_OR_COMMIT,
                }

                /**
                 * An enum containing [Entity]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Entity] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONTRACT,
                    COMMIT,
                    CONTRACT_CREDIT,
                    CONTRACT_CREDIT_OR_COMMIT,
                    /**
                     * An enum member indicating that [Entity] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CONTRACT -> Value.CONTRACT
                        COMMIT -> Value.COMMIT
                        CONTRACT_CREDIT -> Value.CONTRACT_CREDIT
                        CONTRACT_CREDIT_OR_COMMIT -> Value.CONTRACT_CREDIT_OR_COMMIT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CONTRACT -> Known.CONTRACT
                        COMMIT -> Known.COMMIT
                        CONTRACT_CREDIT -> Known.CONTRACT_CREDIT
                        CONTRACT_CREDIT_OR_COMMIT -> Known.CONTRACT_CREDIT_OR_COMMIT
                        else -> throw MetronomeInvalidDataException("Unknown Entity: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
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
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
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

            private val hashCode: Int by lazy {
                Objects.hash(entity, key, value, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CustomFieldFilter{entity=$entity, key=$key, value=$value, additionalProperties=$additionalProperties}"
        }

        class Exclude
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val customFieldFilters: JsonField<List<CustomFieldFilter>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("custom_field_filters")
                @ExcludeMissing
                customFieldFilters: JsonField<List<CustomFieldFilter>> = JsonMissing.of()
            ) : this(customFieldFilters, mutableMapOf())

            /**
             * A list of custom field filters for notification types that support advanced filtering
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun customFieldFilters(): Optional<List<CustomFieldFilter>> =
                customFieldFilters.getOptional("custom_field_filters")

            /**
             * Returns the raw JSON value of [customFieldFilters].
             *
             * Unlike [customFieldFilters], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("custom_field_filters")
            @ExcludeMissing
            fun _customFieldFilters(): JsonField<List<CustomFieldFilter>> = customFieldFilters

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

                /** Returns a mutable builder for constructing an instance of [Exclude]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Exclude]. */
            class Builder internal constructor() {

                private var customFieldFilters: JsonField<MutableList<CustomFieldFilter>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(exclude: Exclude) = apply {
                    customFieldFilters = exclude.customFieldFilters.map { it.toMutableList() }
                    additionalProperties = exclude.additionalProperties.toMutableMap()
                }

                /**
                 * A list of custom field filters for notification types that support advanced
                 * filtering
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
                fun customFieldFilters(customFieldFilters: JsonField<List<CustomFieldFilter>>) =
                    apply {
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

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Exclude].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Exclude =
                    Exclude(
                        (customFieldFilters ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Exclude = apply {
                if (validated) {
                    return@apply
                }

                customFieldFilters().ifPresent { it.forEach { it.validate() } }
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
                (customFieldFilters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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
                    @JsonProperty("entity")
                    @ExcludeMissing
                    entity: JsonField<Entity> = JsonMissing.of(),
                    @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(entity, key, value, mutableMapOf())

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun entity(): Entity = entity.getRequired("entity")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun key(): String = key.getRequired("key")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun value(): String = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [entity].
                 *
                 * Unlike [entity], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * Returns a mutable builder for constructing an instance of
                     * [CustomFieldFilter].
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
                     * You should usually call [Builder.entity] with a well-typed [Entity] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

                    fun key(key: String) = key(JsonField.of(key))

                    /**
                     * Sets [Builder.key] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.key] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun key(key: JsonField<String>) = apply { this.key = key }

                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
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

                class Entity
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val CONTRACT = of("Contract")

                        @JvmField val COMMIT = of("Commit")

                        @JvmField val CONTRACT_CREDIT = of("ContractCredit")

                        @JvmField val CONTRACT_CREDIT_OR_COMMIT = of("ContractCreditOrCommit")

                        @JvmStatic fun of(value: String) = Entity(JsonField.of(value))
                    }

                    /** An enum containing [Entity]'s known values. */
                    enum class Known {
                        CONTRACT,
                        COMMIT,
                        CONTRACT_CREDIT,
                        CONTRACT_CREDIT_OR_COMMIT,
                    }

                    /**
                     * An enum containing [Entity]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Entity] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        CONTRACT,
                        COMMIT,
                        CONTRACT_CREDIT,
                        CONTRACT_CREDIT_OR_COMMIT,
                        /**
                         * An enum member indicating that [Entity] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            CONTRACT -> Value.CONTRACT
                            COMMIT -> Value.COMMIT
                            CONTRACT_CREDIT -> Value.CONTRACT_CREDIT
                            CONTRACT_CREDIT_OR_COMMIT -> Value.CONTRACT_CREDIT_OR_COMMIT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            CONTRACT -> Known.CONTRACT
                            COMMIT -> Known.COMMIT
                            CONTRACT_CREDIT -> Known.CONTRACT_CREDIT
                            CONTRACT_CREDIT_OR_COMMIT -> Known.CONTRACT_CREDIT_OR_COMMIT
                            else -> throw MetronomeInvalidDataException("Unknown Entity: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                private val hashCode: Int by lazy {
                    Objects.hash(entity, key, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CustomFieldFilter{entity=$entity, key=$key, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Exclude &&
                    customFieldFilters == other.customFieldFilters &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(customFieldFilters, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Exclude{customFieldFilters=$customFieldFilters, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AlertSpecifier &&
                customFieldFilters == other.customFieldFilters &&
                exclude == other.exclude &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(customFieldFilters, exclude, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AlertSpecifier{customFieldFilters=$customFieldFilters, exclude=$exclude, additionalProperties=$additionalProperties}"
    }

    /**
     * Scopes threshold notification evaluation to a specific presentation group key on individual
     * line items. Only present for spend notifications.
     */
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
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

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
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GroupValue]. */
        class Builder internal constructor() {

            private var key: JsonField<String>? = null
            private var value: JsonField<String>? = null
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
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): GroupValue =
                GroupValue(
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
     * When parallel threshold notifications are enabled during migration, this flag denotes whether
     * to fetch notifications for plans or contracts.
     */
    class PlansOrContracts @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val PLANS = of("PLANS")

            @JvmField val CONTRACTS = of("CONTRACTS")

            @JvmStatic fun of(value: String) = PlansOrContracts(JsonField.of(value))
        }

        /** An enum containing [PlansOrContracts]'s known values. */
        enum class Known {
            PLANS,
            CONTRACTS,
        }

        /**
         * An enum containing [PlansOrContracts]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PlansOrContracts] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PLANS,
            CONTRACTS,
            /**
             * An enum member indicating that [PlansOrContracts] was instantiated with an unknown
             * value.
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
                PLANS -> Value.PLANS
                CONTRACTS -> Value.CONTRACTS
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
                PLANS -> Known.PLANS
                CONTRACTS -> Known.CONTRACTS
                else -> throw MetronomeInvalidDataException("Unknown PlansOrContracts: $value")
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
        fun validate(): PlansOrContracts = apply {
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

            return other is PlansOrContracts && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Only allowed for `low_remaining_seat_balance_reached` notifications. This filters alerts by
     * the seat group key-value pair.
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
         * The specific seat identifier to filter by
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun seatGroupValue(): String = seatGroupValue.getRequired("seat_group_value")

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
             * .seatGroupValue()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SeatFilter]. */
        class Builder internal constructor() {

            private var seatGroupKey: JsonField<String>? = null
            private var seatGroupValue: JsonField<String>? = null
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

            /** The specific seat identifier to filter by */
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
             * .seatGroupValue()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SeatFilter =
                SeatFilter(
                    checkRequired("seatGroupKey", seatGroupKey),
                    checkRequired("seatGroupValue", seatGroupValue),
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

        return other is AlertRetrieveParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AlertRetrieveParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
