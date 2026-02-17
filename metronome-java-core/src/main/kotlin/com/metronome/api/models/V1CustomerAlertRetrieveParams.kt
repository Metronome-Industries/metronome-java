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
 * - Archived notifications: Returns null for customer_status if the notification has been archived,
 *   but still includes the notification configuration details
 * - Performance considerations: This endpoint queries live evaluation state, making it ideal for
 *   real-time monitoring but not for bulk status checks
 * - Integration patterns: Best used for on-demand status checks in response to user actions or as
 *   part of targeted monitoring workflows
 * - Error handling: Returns 404 if either the customer or alert_id doesn't exist or isn't
 *   accessible to your organization
 */
class V1CustomerAlertRetrieveParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The Metronome ID of the threshold notification */
    fun alertId(): String = body.alertId()

    /** The Metronome ID of the customer */
    fun customerId(): String = body.customerId()

    /**
     * Only present for `spend_threshold_reached` notifications. Retrieve the notification for a
     * specific group key-value pair.
     */
    fun groupValues(): Optional<List<GroupValue>> = body.groupValues()

    /**
     * When parallel threshold notifications are enabled during migration, this flag denotes whether
     * to fetch notifications for plans or contracts.
     */
    fun plansOrContracts(): Optional<PlansOrContracts> = body.plansOrContracts()

    /**
     * Only allowed for `low_remaining_seat_balance_reached` notifications. This filters alerts by
     * the seat group key-value pair.
     */
    fun seatFilter(): Optional<SeatFilter> = body.seatFilter()

    /** The Metronome ID of the threshold notification */
    fun _alertId(): JsonField<String> = body._alertId()

    /** The Metronome ID of the customer */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Only present for `spend_threshold_reached` notifications. Retrieve the notification for a
     * specific group key-value pair.
     */
    fun _groupValues(): JsonField<List<GroupValue>> = body._groupValues()

    /**
     * When parallel threshold notifications are enabled during migration, this flag denotes whether
     * to fetch notifications for plans or contracts.
     */
    fun _plansOrContracts(): JsonField<PlansOrContracts> = body._plansOrContracts()

    /**
     * Only allowed for `low_remaining_seat_balance_reached` notifications. This filters alerts by
     * the seat group key-value pair.
     */
    fun _seatFilter(): JsonField<SeatFilter> = body._seatFilter()

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
        @JsonProperty("alert_id")
        @ExcludeMissing
        private val alertId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("group_values")
        @ExcludeMissing
        private val groupValues: JsonField<List<GroupValue>> = JsonMissing.of(),
        @JsonProperty("plans_or_contracts")
        @ExcludeMissing
        private val plansOrContracts: JsonField<PlansOrContracts> = JsonMissing.of(),
        @JsonProperty("seat_filter")
        @ExcludeMissing
        private val seatFilter: JsonField<SeatFilter> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Metronome ID of the threshold notification */
        fun alertId(): String = alertId.getRequired("alert_id")

        /** The Metronome ID of the customer */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * Only present for `spend_threshold_reached` notifications. Retrieve the notification for a
         * specific group key-value pair.
         */
        fun groupValues(): Optional<List<GroupValue>> =
            Optional.ofNullable(groupValues.getNullable("group_values"))

        /**
         * When parallel threshold notifications are enabled during migration, this flag denotes
         * whether to fetch notifications for plans or contracts.
         */
        fun plansOrContracts(): Optional<PlansOrContracts> =
            Optional.ofNullable(plansOrContracts.getNullable("plans_or_contracts"))

        /**
         * Only allowed for `low_remaining_seat_balance_reached` notifications. This filters alerts
         * by the seat group key-value pair.
         */
        fun seatFilter(): Optional<SeatFilter> =
            Optional.ofNullable(seatFilter.getNullable("seat_filter"))

        /** The Metronome ID of the threshold notification */
        @JsonProperty("alert_id") @ExcludeMissing fun _alertId(): JsonField<String> = alertId

        /** The Metronome ID of the customer */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Only present for `spend_threshold_reached` notifications. Retrieve the notification for a
         * specific group key-value pair.
         */
        @JsonProperty("group_values")
        @ExcludeMissing
        fun _groupValues(): JsonField<List<GroupValue>> = groupValues

        /**
         * When parallel threshold notifications are enabled during migration, this flag denotes
         * whether to fetch notifications for plans or contracts.
         */
        @JsonProperty("plans_or_contracts")
        @ExcludeMissing
        fun _plansOrContracts(): JsonField<PlansOrContracts> = plansOrContracts

        /**
         * Only allowed for `low_remaining_seat_balance_reached` notifications. This filters alerts
         * by the seat group key-value pair.
         */
        @JsonProperty("seat_filter")
        @ExcludeMissing
        fun _seatFilter(): JsonField<SeatFilter> = seatFilter

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            alertId()
            customerId()
            groupValues().ifPresent { it.forEach { it.validate() } }
            plansOrContracts()
            seatFilter().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var alertId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var groupValues: JsonField<MutableList<GroupValue>>? = null
            private var plansOrContracts: JsonField<PlansOrContracts> = JsonMissing.of()
            private var seatFilter: JsonField<SeatFilter> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                alertId = body.alertId
                customerId = body.customerId
                groupValues = body.groupValues.map { it.toMutableList() }
                plansOrContracts = body.plansOrContracts
                seatFilter = body.seatFilter
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The Metronome ID of the threshold notification */
            fun alertId(alertId: String) = alertId(JsonField.of(alertId))

            /** The Metronome ID of the threshold notification */
            fun alertId(alertId: JsonField<String>) = apply { this.alertId = alertId }

            /** The Metronome ID of the customer */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /** The Metronome ID of the customer */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * Only present for `spend_threshold_reached` notifications. Retrieve the notification
             * for a specific group key-value pair.
             */
            fun groupValues(groupValues: List<GroupValue>) = groupValues(JsonField.of(groupValues))

            /**
             * Only present for `spend_threshold_reached` notifications. Retrieve the notification
             * for a specific group key-value pair.
             */
            fun groupValues(groupValues: JsonField<List<GroupValue>>) = apply {
                this.groupValues = groupValues.map { it.toMutableList() }
            }

            /**
             * Only present for `spend_threshold_reached` notifications. Retrieve the notification
             * for a specific group key-value pair.
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
             * When parallel threshold notifications are enabled during migration, this flag denotes
             * whether to fetch notifications for plans or contracts.
             */
            fun plansOrContracts(plansOrContracts: PlansOrContracts) =
                plansOrContracts(JsonField.of(plansOrContracts))

            /**
             * When parallel threshold notifications are enabled during migration, this flag denotes
             * whether to fetch notifications for plans or contracts.
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
             * Only allowed for `low_remaining_seat_balance_reached` notifications. This filters
             * alerts by the seat group key-value pair.
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

            fun build(): Body =
                Body(
                    checkRequired("alertId", alertId),
                    checkRequired("customerId", customerId),
                    (groupValues ?: JsonMissing.of()).map { it.toImmutable() },
                    plansOrContracts,
                    seatFilter,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && alertId == other.alertId && customerId == other.customerId && groupValues == other.groupValues && plansOrContracts == other.plansOrContracts && seatFilter == other.seatFilter && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(alertId, customerId, groupValues, plansOrContracts, seatFilter, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{alertId=$alertId, customerId=$customerId, groupValues=$groupValues, plansOrContracts=$plansOrContracts, seatFilter=$seatFilter, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1CustomerAlertRetrieveParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1CustomerAlertRetrieveParams: V1CustomerAlertRetrieveParams) = apply {
            body = v1CustomerAlertRetrieveParams.body.toBuilder()
            additionalHeaders = v1CustomerAlertRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1CustomerAlertRetrieveParams.additionalQueryParams.toBuilder()
        }

        /** The Metronome ID of the threshold notification */
        fun alertId(alertId: String) = apply { body.alertId(alertId) }

        /** The Metronome ID of the threshold notification */
        fun alertId(alertId: JsonField<String>) = apply { body.alertId(alertId) }

        /** The Metronome ID of the customer */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** The Metronome ID of the customer */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * Only present for `spend_threshold_reached` notifications. Retrieve the notification for a
         * specific group key-value pair.
         */
        fun groupValues(groupValues: List<GroupValue>) = apply { body.groupValues(groupValues) }

        /**
         * Only present for `spend_threshold_reached` notifications. Retrieve the notification for a
         * specific group key-value pair.
         */
        fun groupValues(groupValues: JsonField<List<GroupValue>>) = apply {
            body.groupValues(groupValues)
        }

        /**
         * Only present for `spend_threshold_reached` notifications. Retrieve the notification for a
         * specific group key-value pair.
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
         * When parallel threshold notifications are enabled during migration, this flag denotes
         * whether to fetch notifications for plans or contracts.
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
         * Only allowed for `low_remaining_seat_balance_reached` notifications. This filters alerts
         * by the seat group key-value pair.
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

        fun build(): V1CustomerAlertRetrieveParams =
            V1CustomerAlertRetrieveParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Scopes threshold notification evaluation to a specific presentation group key on individual
     * line items. Only present for spend notifications.
     */
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

        fun value(): String = value.getRequired("value")

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
            private var value: JsonField<String>? = null
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
                GroupValue(
                    checkRequired("key", key),
                    checkRequired("value", value),
                    additionalProperties.toImmutable(),
                )
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PlansOrContracts && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Only allowed for `low_remaining_seat_balance_reached` notifications. This filters alerts by
     * the seat group key-value pair.
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

        /** The specific seat identifier to filter by */
        fun seatGroupValue(): String = seatGroupValue.getRequired("seat_group_value")

        /** The seat group key (e.g., "seat_id", "user_id") */
        @JsonProperty("seat_group_key")
        @ExcludeMissing
        fun _seatGroupKey(): JsonField<String> = seatGroupKey

        /** The specific seat identifier to filter by */
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

            /** The seat group key (e.g., "seat_id", "user_id") */
            fun seatGroupKey(seatGroupKey: JsonField<String>) = apply {
                this.seatGroupKey = seatGroupKey
            }

            /** The specific seat identifier to filter by */
            fun seatGroupValue(seatGroupValue: String) =
                seatGroupValue(JsonField.of(seatGroupValue))

            /** The specific seat identifier to filter by */
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
                    checkRequired("seatGroupValue", seatGroupValue),
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

        return /* spotless:off */ other is V1CustomerAlertRetrieveParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V1CustomerAlertRetrieveParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
