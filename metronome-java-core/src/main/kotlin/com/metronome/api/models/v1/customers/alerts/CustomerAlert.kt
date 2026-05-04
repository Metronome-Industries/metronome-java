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
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.CreditTypeData
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomerAlert
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val alert: JsonField<Alert>,
    private val customerStatus: JsonField<CustomerStatus>,
    private val triggeredBy: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("alert") @ExcludeMissing alert: JsonField<Alert> = JsonMissing.of(),
        @JsonProperty("customer_status")
        @ExcludeMissing
        customerStatus: JsonField<CustomerStatus> = JsonMissing.of(),
        @JsonProperty("triggered_by")
        @ExcludeMissing
        triggeredBy: JsonField<String> = JsonMissing.of(),
    ) : this(alert, customerStatus, triggeredBy, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun alert(): Alert = alert.getRequired("alert")

    /**
     * The status of the threshold notification. If the notification is archived, null will be
     * returned.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerStatus(): Optional<CustomerStatus> = customerStatus.getOptional("customer_status")

    /**
     * If present, indicates the reason the threshold notification was triggered.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun triggeredBy(): Optional<String> = triggeredBy.getOptional("triggered_by")

    /**
     * Returns the raw JSON value of [alert].
     *
     * Unlike [alert], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alert") @ExcludeMissing fun _alert(): JsonField<Alert> = alert

    /**
     * Returns the raw JSON value of [customerStatus].
     *
     * Unlike [customerStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_status")
    @ExcludeMissing
    fun _customerStatus(): JsonField<CustomerStatus> = customerStatus

    /**
     * Returns the raw JSON value of [triggeredBy].
     *
     * Unlike [triggeredBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("triggered_by")
    @ExcludeMissing
    fun _triggeredBy(): JsonField<String> = triggeredBy

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
         * Returns a mutable builder for constructing an instance of [CustomerAlert].
         *
         * The following fields are required:
         * ```java
         * .alert()
         * .customerStatus()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerAlert]. */
    class Builder internal constructor() {

        private var alert: JsonField<Alert>? = null
        private var customerStatus: JsonField<CustomerStatus>? = null
        private var triggeredBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerAlert: CustomerAlert) = apply {
            alert = customerAlert.alert
            customerStatus = customerAlert.customerStatus
            triggeredBy = customerAlert.triggeredBy
            additionalProperties = customerAlert.additionalProperties.toMutableMap()
        }

        fun alert(alert: Alert) = alert(JsonField.of(alert))

        /**
         * Sets [Builder.alert] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alert] with a well-typed [Alert] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alert(alert: JsonField<Alert>) = apply { this.alert = alert }

        /**
         * The status of the threshold notification. If the notification is archived, null will be
         * returned.
         */
        fun customerStatus(customerStatus: CustomerStatus?) =
            customerStatus(JsonField.ofNullable(customerStatus))

        /** Alias for calling [Builder.customerStatus] with `customerStatus.orElse(null)`. */
        fun customerStatus(customerStatus: Optional<CustomerStatus>) =
            customerStatus(customerStatus.getOrNull())

        /**
         * Sets [Builder.customerStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerStatus] with a well-typed [CustomerStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerStatus(customerStatus: JsonField<CustomerStatus>) = apply {
            this.customerStatus = customerStatus
        }

        /** If present, indicates the reason the threshold notification was triggered. */
        fun triggeredBy(triggeredBy: String?) = triggeredBy(JsonField.ofNullable(triggeredBy))

        /** Alias for calling [Builder.triggeredBy] with `triggeredBy.orElse(null)`. */
        fun triggeredBy(triggeredBy: Optional<String>) = triggeredBy(triggeredBy.getOrNull())

        /**
         * Sets [Builder.triggeredBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggeredBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun triggeredBy(triggeredBy: JsonField<String>) = apply { this.triggeredBy = triggeredBy }

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
         * Returns an immutable instance of [CustomerAlert].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .alert()
         * .customerStatus()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerAlert =
            CustomerAlert(
                checkRequired("alert", alert),
                checkRequired("customerStatus", customerStatus),
                triggeredBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): CustomerAlert = apply {
        if (validated) {
            return@apply
        }

        alert().validate()
        customerStatus().ifPresent { it.validate() }
        triggeredBy()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (alert.asKnown().getOrNull()?.validity() ?: 0) +
            (customerStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (triggeredBy.asKnown().isPresent) 1 else 0)

    class Alert
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val status: JsonField<Status>,
        private val threshold: JsonField<Double>,
        private val type: JsonField<Type>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val creditGrantTypeFilters: JsonField<List<String>>,
        private val creditType: JsonField<CreditTypeData>,
        private val customFieldFilters: JsonField<List<CustomFieldFilter>>,
        private val groupKeyFilter: JsonField<GroupKeyFilter>,
        private val groupValues: JsonField<List<GroupValue>>,
        private val invoiceTypesFilter: JsonField<List<String>>,
        private val seatFilter: JsonField<SeatFilter>,
        private val uniquenessKey: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("threshold")
            @ExcludeMissing
            threshold: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("credit_grant_type_filters")
            @ExcludeMissing
            creditGrantTypeFilters: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("credit_type")
            @ExcludeMissing
            creditType: JsonField<CreditTypeData> = JsonMissing.of(),
            @JsonProperty("custom_field_filters")
            @ExcludeMissing
            customFieldFilters: JsonField<List<CustomFieldFilter>> = JsonMissing.of(),
            @JsonProperty("group_key_filter")
            @ExcludeMissing
            groupKeyFilter: JsonField<GroupKeyFilter> = JsonMissing.of(),
            @JsonProperty("group_values")
            @ExcludeMissing
            groupValues: JsonField<List<GroupValue>> = JsonMissing.of(),
            @JsonProperty("invoice_types_filter")
            @ExcludeMissing
            invoiceTypesFilter: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("seat_filter")
            @ExcludeMissing
            seatFilter: JsonField<SeatFilter> = JsonMissing.of(),
            @JsonProperty("uniqueness_key")
            @ExcludeMissing
            uniquenessKey: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            name,
            status,
            threshold,
            type,
            updatedAt,
            creditGrantTypeFilters,
            creditType,
            customFieldFilters,
            groupKeyFilter,
            groupValues,
            invoiceTypesFilter,
            seatFilter,
            uniquenessKey,
            mutableMapOf(),
        )

        /**
         * the Metronome ID of the threshold notification
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Name of the threshold notification
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Status of the threshold notification
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Threshold value of the notification policy
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun threshold(): Double = threshold.getRequired("threshold")

        /**
         * Type of the threshold notification
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Timestamp for when the threshold notification was last updated
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

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
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditType(): Optional<CreditTypeData> = creditType.getOptional("credit_type")

        /**
         * A list of custom field filters for notification types that support advanced filtering
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFieldFilters(): Optional<List<CustomFieldFilter>> =
            customFieldFilters.getOptional("custom_field_filters")

        /**
         * Scopes threshold notification evaluation to a specific presentation group key on
         * individual line items. Only present for spend notifications.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupKeyFilter(): Optional<GroupKeyFilter> =
            groupKeyFilter.getOptional("group_key_filter")

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
         * Only present for low_remaining_seat_balance_reached notifications. The seat group key or
         * seat group key-value pair the alert is scoped to.
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
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [threshold].
         *
         * Unlike [threshold], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("threshold") @ExcludeMissing fun _threshold(): JsonField<Double> = threshold

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns the raw JSON value of [creditType].
         *
         * Unlike [creditType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

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
         * Returns the raw JSON value of [groupKeyFilter].
         *
         * Unlike [groupKeyFilter], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("group_key_filter")
        @ExcludeMissing
        fun _groupKeyFilter(): JsonField<GroupKeyFilter> = groupKeyFilter

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
             * Returns a mutable builder for constructing an instance of [Alert].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * .status()
             * .threshold()
             * .type()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Alert]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var threshold: JsonField<Double>? = null
            private var type: JsonField<Type>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var creditGrantTypeFilters: JsonField<MutableList<String>>? = null
            private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var customFieldFilters: JsonField<MutableList<CustomFieldFilter>>? = null
            private var groupKeyFilter: JsonField<GroupKeyFilter> = JsonMissing.of()
            private var groupValues: JsonField<MutableList<GroupValue>>? = null
            private var invoiceTypesFilter: JsonField<MutableList<String>>? = null
            private var seatFilter: JsonField<SeatFilter> = JsonMissing.of()
            private var uniquenessKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(alert: Alert) = apply {
                id = alert.id
                name = alert.name
                status = alert.status
                threshold = alert.threshold
                type = alert.type
                updatedAt = alert.updatedAt
                creditGrantTypeFilters = alert.creditGrantTypeFilters.map { it.toMutableList() }
                creditType = alert.creditType
                customFieldFilters = alert.customFieldFilters.map { it.toMutableList() }
                groupKeyFilter = alert.groupKeyFilter
                groupValues = alert.groupValues.map { it.toMutableList() }
                invoiceTypesFilter = alert.invoiceTypesFilter.map { it.toMutableList() }
                seatFilter = alert.seatFilter
                uniquenessKey = alert.uniquenessKey
                additionalProperties = alert.additionalProperties.toMutableMap()
            }

            /** the Metronome ID of the threshold notification */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            /** Status of the threshold notification */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Threshold value of the notification policy */
            fun threshold(threshold: Double) = threshold(JsonField.of(threshold))

            /**
             * Sets [Builder.threshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.threshold] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun threshold(threshold: JsonField<Double>) = apply { this.threshold = threshold }

            /** Type of the threshold notification */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Timestamp for when the threshold notification was last updated */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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

            fun creditType(creditType: CreditTypeData?) =
                creditType(JsonField.ofNullable(creditType))

            /** Alias for calling [Builder.creditType] with `creditType.orElse(null)`. */
            fun creditType(creditType: Optional<CreditTypeData>) =
                creditType(creditType.getOrNull())

            /**
             * Sets [Builder.creditType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditType] with a well-typed [CreditTypeData] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
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
             * Scopes threshold notification evaluation to a specific presentation group key on
             * individual line items. Only present for spend notifications.
             */
            fun groupKeyFilter(groupKeyFilter: GroupKeyFilter) =
                groupKeyFilter(JsonField.of(groupKeyFilter))

            /**
             * Sets [Builder.groupKeyFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupKeyFilter] with a well-typed [GroupKeyFilter]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun groupKeyFilter(groupKeyFilter: JsonField<GroupKeyFilter>) = apply {
                this.groupKeyFilter = groupKeyFilter
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
             * Only present for low_remaining_seat_balance_reached notifications. The seat group key
             * or seat group key-value pair the alert is scoped to.
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
             * Returns an immutable instance of [Alert].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * .status()
             * .threshold()
             * .type()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Alert =
                Alert(
                    checkRequired("id", id),
                    checkRequired("name", name),
                    checkRequired("status", status),
                    checkRequired("threshold", threshold),
                    checkRequired("type", type),
                    checkRequired("updatedAt", updatedAt),
                    (creditGrantTypeFilters ?: JsonMissing.of()).map { it.toImmutable() },
                    creditType,
                    (customFieldFilters ?: JsonMissing.of()).map { it.toImmutable() },
                    groupKeyFilter,
                    (groupValues ?: JsonMissing.of()).map { it.toImmutable() },
                    (invoiceTypesFilter ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Alert = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
            status().validate()
            threshold()
            type().validate()
            updatedAt()
            creditGrantTypeFilters()
            creditType().ifPresent { it.validate() }
            customFieldFilters().ifPresent { it.forEach { it.validate() } }
            groupKeyFilter().ifPresent { it.validate() }
            groupValues().ifPresent { it.forEach { it.validate() } }
            invoiceTypesFilter()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (threshold.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (creditGrantTypeFilters.asKnown().getOrNull()?.size ?: 0) +
                (creditType.asKnown().getOrNull()?.validity() ?: 0) +
                (customFieldFilters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (groupKeyFilter.asKnown().getOrNull()?.validity() ?: 0) +
                (groupValues.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (invoiceTypesFilter.asKnown().getOrNull()?.size ?: 0) +
                (seatFilter.asKnown().getOrNull()?.validity() ?: 0) +
                (if (uniquenessKey.asKnown().isPresent) 1 else 0)

        /** Status of the threshold notification */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ENABLED = of("enabled")

                @JvmField val ARCHIVED = of("archived")

                @JvmField val DISABLED = of("disabled")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                ENABLED,
                ARCHIVED,
                DISABLED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ENABLED,
                ARCHIVED,
                DISABLED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    ENABLED -> Value.ENABLED
                    ARCHIVED -> Value.ARCHIVED
                    DISABLED -> Value.DISABLED
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
                    ENABLED -> Known.ENABLED
                    ARCHIVED -> Known.ARCHIVED
                    DISABLED -> Known.DISABLED
                    else -> throw MetronomeInvalidDataException("Unknown Status: $value")
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
            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Type of the threshold notification */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
                val LOW_REMAINING_COMMIT_BALANCE_REACHED =
                    of("low_remaining_commit_balance_reached")

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

                @JvmField
                val LOW_REMAINING_SEAT_BALANCE_REACHED = of("low_remaining_seat_balance_reached")

                @JvmField val INVOICE_TOTAL_REACHED = of("invoice_total_reached")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
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
                LOW_REMAINING_SEAT_BALANCE_REACHED,
                INVOICE_TOTAL_REACHED,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
                LOW_REMAINING_SEAT_BALANCE_REACHED,
                INVOICE_TOTAL_REACHED,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    LOW_REMAINING_COMMIT_BALANCE_REACHED ->
                        Value.LOW_REMAINING_COMMIT_BALANCE_REACHED
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
                    LOW_REMAINING_SEAT_BALANCE_REACHED -> Value.LOW_REMAINING_SEAT_BALANCE_REACHED
                    INVOICE_TOTAL_REACHED -> Value.INVOICE_TOTAL_REACHED
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
                    LOW_REMAINING_COMMIT_BALANCE_REACHED ->
                        Known.LOW_REMAINING_COMMIT_BALANCE_REACHED
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
                    LOW_REMAINING_SEAT_BALANCE_REACHED -> Known.LOW_REMAINING_SEAT_BALANCE_REACHED
                    INVOICE_TOTAL_REACHED -> Known.INVOICE_TOTAL_REACHED
                    else -> throw MetronomeInvalidDataException("Unknown Type: $value")
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
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONTRACT,
                    COMMIT,
                    CONTRACT_CREDIT,
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

        /**
         * Scopes threshold notification evaluation to a specific presentation group key on
         * individual line items. Only present for spend notifications.
         */
        class GroupKeyFilter
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
                 * Returns a mutable builder for constructing an instance of [GroupKeyFilter].
                 *
                 * The following fields are required:
                 * ```java
                 * .key()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [GroupKeyFilter]. */
            class Builder internal constructor() {

                private var key: JsonField<String>? = null
                private var value: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(groupKeyFilter: GroupKeyFilter) = apply {
                    key = groupKeyFilter.key
                    value = groupKeyFilter.value
                    additionalProperties = groupKeyFilter.additionalProperties.toMutableMap()
                }

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
                 * Returns an immutable instance of [GroupKeyFilter].
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
                fun build(): GroupKeyFilter =
                    GroupKeyFilter(
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
            fun validate(): GroupKeyFilter = apply {
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

                return other is GroupKeyFilter &&
                    key == other.key &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GroupKeyFilter{key=$key, value=$value, additionalProperties=$additionalProperties}"
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
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun key(): String = key.getRequired("key")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
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
                    GroupValue(
                        checkRequired("key", key),
                        value,
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
         * Only present for low_remaining_seat_balance_reached notifications. The seat group key or
         * seat group key-value pair the alert is scoped to.
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
             * The seat group key (e.g., "seat_id", "user_id") that the alert is scoped to.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun seatGroupKey(): String = seatGroupKey.getRequired("seat_group_key")

            /**
             * The seat group value that the alert is scoped to.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
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
             * Unlike [seatGroupValue], this method doesn't throw if the JSON field has an
             * unexpected type.
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

                /** The seat group key (e.g., "seat_id", "user_id") that the alert is scoped to. */
                fun seatGroupKey(seatGroupKey: String) = seatGroupKey(JsonField.of(seatGroupKey))

                /**
                 * Sets [Builder.seatGroupKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.seatGroupKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun seatGroupKey(seatGroupKey: JsonField<String>) = apply {
                    this.seatGroupKey = seatGroupKey
                }

                /** The seat group value that the alert is scoped to. */
                fun seatGroupValue(seatGroupValue: String) =
                    seatGroupValue(JsonField.of(seatGroupValue))

                /**
                 * Sets [Builder.seatGroupValue] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.seatGroupValue] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

            return other is Alert &&
                id == other.id &&
                name == other.name &&
                status == other.status &&
                threshold == other.threshold &&
                type == other.type &&
                updatedAt == other.updatedAt &&
                creditGrantTypeFilters == other.creditGrantTypeFilters &&
                creditType == other.creditType &&
                customFieldFilters == other.customFieldFilters &&
                groupKeyFilter == other.groupKeyFilter &&
                groupValues == other.groupValues &&
                invoiceTypesFilter == other.invoiceTypesFilter &&
                seatFilter == other.seatFilter &&
                uniquenessKey == other.uniquenessKey &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                name,
                status,
                threshold,
                type,
                updatedAt,
                creditGrantTypeFilters,
                creditType,
                customFieldFilters,
                groupKeyFilter,
                groupValues,
                invoiceTypesFilter,
                seatFilter,
                uniquenessKey,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Alert{id=$id, name=$name, status=$status, threshold=$threshold, type=$type, updatedAt=$updatedAt, creditGrantTypeFilters=$creditGrantTypeFilters, creditType=$creditType, customFieldFilters=$customFieldFilters, groupKeyFilter=$groupKeyFilter, groupValues=$groupValues, invoiceTypesFilter=$invoiceTypesFilter, seatFilter=$seatFilter, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
    }

    /**
     * The status of the threshold notification. If the notification is archived, null will be
     * returned.
     */
    class CustomerStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val OK = of("ok")

            @JvmField val IN_ALARM = of("in_alarm")

            @JvmField val EVALUATING = of("evaluating")

            @JvmStatic fun of(value: String) = CustomerStatus(JsonField.of(value))
        }

        /** An enum containing [CustomerStatus]'s known values. */
        enum class Known {
            OK,
            IN_ALARM,
            EVALUATING,
        }

        /**
         * An enum containing [CustomerStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CustomerStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OK,
            IN_ALARM,
            EVALUATING,
            /**
             * An enum member indicating that [CustomerStatus] was instantiated with an unknown
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
                OK -> Value.OK
                IN_ALARM -> Value.IN_ALARM
                EVALUATING -> Value.EVALUATING
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
                OK -> Known.OK
                IN_ALARM -> Known.IN_ALARM
                EVALUATING -> Known.EVALUATING
                else -> throw MetronomeInvalidDataException("Unknown CustomerStatus: $value")
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
        fun validate(): CustomerStatus = apply {
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

            return other is CustomerStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerAlert &&
            alert == other.alert &&
            customerStatus == other.customerStatus &&
            triggeredBy == other.triggeredBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(alert, customerStatus, triggeredBy, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerAlert{alert=$alert, customerStatus=$customerStatus, triggeredBy=$triggeredBy, additionalProperties=$additionalProperties}"
}
