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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CustomerAlert
@JsonCreator
private constructor(
    @JsonProperty("alert") @ExcludeMissing private val alert: JsonField<Alert> = JsonMissing.of(),
    @JsonProperty("customer_status")
    @ExcludeMissing
    private val customerStatus: JsonField<CustomerStatus> = JsonMissing.of(),
    @JsonProperty("triggered_by")
    @ExcludeMissing
    private val triggeredBy: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun alert(): Alert = alert.getRequired("alert")

    /** The status of the customer alert. If the alert is archived, null will be returned. */
    fun customerStatus(): Optional<CustomerStatus> =
        Optional.ofNullable(customerStatus.getNullable("customer_status"))

    /** If present, indicates the reason the alert was triggered. */
    fun triggeredBy(): Optional<String> =
        Optional.ofNullable(triggeredBy.getNullable("triggered_by"))

    @JsonProperty("alert") @ExcludeMissing fun _alert(): JsonField<Alert> = alert

    /** The status of the customer alert. If the alert is archived, null will be returned. */
    @JsonProperty("customer_status")
    @ExcludeMissing
    fun _customerStatus(): JsonField<CustomerStatus> = customerStatus

    /** If present, indicates the reason the alert was triggered. */
    @JsonProperty("triggered_by")
    @ExcludeMissing
    fun _triggeredBy(): JsonField<String> = triggeredBy

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomerAlert = apply {
        if (validated) {
            return@apply
        }

        alert().validate()
        customerStatus()
        triggeredBy()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

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

        fun alert(alert: JsonField<Alert>) = apply { this.alert = alert }

        /** The status of the customer alert. If the alert is archived, null will be returned. */
        fun customerStatus(customerStatus: CustomerStatus?) =
            customerStatus(JsonField.ofNullable(customerStatus))

        /** The status of the customer alert. If the alert is archived, null will be returned. */
        fun customerStatus(customerStatus: Optional<CustomerStatus>) =
            customerStatus(customerStatus.orElse(null))

        /** The status of the customer alert. If the alert is archived, null will be returned. */
        fun customerStatus(customerStatus: JsonField<CustomerStatus>) = apply {
            this.customerStatus = customerStatus
        }

        /** If present, indicates the reason the alert was triggered. */
        fun triggeredBy(triggeredBy: String?) = triggeredBy(JsonField.ofNullable(triggeredBy))

        /** If present, indicates the reason the alert was triggered. */
        fun triggeredBy(triggeredBy: Optional<String>) = triggeredBy(triggeredBy.orElse(null))

        /** If present, indicates the reason the alert was triggered. */
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

        fun build(): CustomerAlert =
            CustomerAlert(
                checkRequired("alert", alert),
                checkRequired("customerStatus", customerStatus),
                triggeredBy,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Alert
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("threshold")
        @ExcludeMissing
        private val threshold: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_grant_type_filters")
        @ExcludeMissing
        private val creditGrantTypeFilters: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("credit_type")
        @ExcludeMissing
        private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("custom_field_filters")
        @ExcludeMissing
        private val customFieldFilters: JsonField<List<CustomFieldFilter>> = JsonMissing.of(),
        @JsonProperty("group_key_filter")
        @ExcludeMissing
        private val groupKeyFilter: JsonField<GroupKeyFilter> = JsonMissing.of(),
        @JsonProperty("invoice_types_filter")
        @ExcludeMissing
        private val invoiceTypesFilter: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        private val uniquenessKey: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** the Metronome ID of the alert */
        fun id(): String = id.getRequired("id")

        /** Name of the alert */
        fun name(): String = name.getRequired("name")

        /** Status of the alert */
        fun status(): Status = status.getRequired("status")

        /** Threshold value of the alert policy */
        fun threshold(): Double = threshold.getRequired("threshold")

        /** Type of the alert */
        fun type(): Type = type.getRequired("type")

        /** Timestamp for when the alert was last updated */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * An array of strings, representing a way to filter the credit grant this alert applies to,
         * by looking at the credit_grant_type field on the credit grant. This field is only defined
         * for CreditPercentage and CreditBalance alerts
         */
        fun creditGrantTypeFilters(): Optional<List<String>> =
            Optional.ofNullable(creditGrantTypeFilters.getNullable("credit_grant_type_filters"))

        fun creditType(): Optional<CreditTypeData> =
            Optional.ofNullable(creditType.getNullable("credit_type"))

        /** A list of custom field filters for alert types that support advanced filtering */
        fun customFieldFilters(): Optional<List<CustomFieldFilter>> =
            Optional.ofNullable(customFieldFilters.getNullable("custom_field_filters"))

        /**
         * Scopes alert evaluation to a specific presentation group key on individual line items.
         * Only present for spend alerts.
         */
        fun groupKeyFilter(): Optional<GroupKeyFilter> =
            Optional.ofNullable(groupKeyFilter.getNullable("group_key_filter"))

        /** Only supported for invoice_total_reached alerts. A list of invoice types to evaluate. */
        fun invoiceTypesFilter(): Optional<List<String>> =
            Optional.ofNullable(invoiceTypesFilter.getNullable("invoice_types_filter"))

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(): Optional<String> =
            Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

        /** the Metronome ID of the alert */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** Name of the alert */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Status of the alert */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /** Threshold value of the alert policy */
        @JsonProperty("threshold") @ExcludeMissing fun _threshold(): JsonField<Double> = threshold

        /** Type of the alert */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /** Timestamp for when the alert was last updated */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * An array of strings, representing a way to filter the credit grant this alert applies to,
         * by looking at the credit_grant_type field on the credit grant. This field is only defined
         * for CreditPercentage and CreditBalance alerts
         */
        @JsonProperty("credit_grant_type_filters")
        @ExcludeMissing
        fun _creditGrantTypeFilters(): JsonField<List<String>> = creditGrantTypeFilters

        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

        /** A list of custom field filters for alert types that support advanced filtering */
        @JsonProperty("custom_field_filters")
        @ExcludeMissing
        fun _customFieldFilters(): JsonField<List<CustomFieldFilter>> = customFieldFilters

        /**
         * Scopes alert evaluation to a specific presentation group key on individual line items.
         * Only present for spend alerts.
         */
        @JsonProperty("group_key_filter")
        @ExcludeMissing
        fun _groupKeyFilter(): JsonField<GroupKeyFilter> = groupKeyFilter

        /** Only supported for invoice_total_reached alerts. A list of invoice types to evaluate. */
        @JsonProperty("invoice_types_filter")
        @ExcludeMissing
        fun _invoiceTypesFilter(): JsonField<List<String>> = invoiceTypesFilter

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

        fun validate(): Alert = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
            status()
            threshold()
            type()
            updatedAt()
            creditGrantTypeFilters()
            creditType().ifPresent { it.validate() }
            customFieldFilters().ifPresent { it.forEach { it.validate() } }
            groupKeyFilter().ifPresent { it.validate() }
            invoiceTypesFilter()
            uniquenessKey()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
            private var invoiceTypesFilter: JsonField<MutableList<String>>? = null
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
                invoiceTypesFilter = alert.invoiceTypesFilter.map { it.toMutableList() }
                uniquenessKey = alert.uniquenessKey
                additionalProperties = alert.additionalProperties.toMutableMap()
            }

            /** the Metronome ID of the alert */
            fun id(id: String) = id(JsonField.of(id))

            /** the Metronome ID of the alert */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Name of the alert */
            fun name(name: String) = name(JsonField.of(name))

            /** Name of the alert */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Status of the alert */
            fun status(status: Status) = status(JsonField.of(status))

            /** Status of the alert */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Threshold value of the alert policy */
            fun threshold(threshold: Double) = threshold(JsonField.of(threshold))

            /** Threshold value of the alert policy */
            fun threshold(threshold: JsonField<Double>) = apply { this.threshold = threshold }

            /** Type of the alert */
            fun type(type: Type) = type(JsonField.of(type))

            /** Type of the alert */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Timestamp for when the alert was last updated */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /** Timestamp for when the alert was last updated */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * An array of strings, representing a way to filter the credit grant this alert applies
             * to, by looking at the credit_grant_type field on the credit grant. This field is only
             * defined for CreditPercentage and CreditBalance alerts
             */
            fun creditGrantTypeFilters(creditGrantTypeFilters: List<String>) =
                creditGrantTypeFilters(JsonField.of(creditGrantTypeFilters))

            /**
             * An array of strings, representing a way to filter the credit grant this alert applies
             * to, by looking at the credit_grant_type field on the credit grant. This field is only
             * defined for CreditPercentage and CreditBalance alerts
             */
            fun creditGrantTypeFilters(creditGrantTypeFilters: JsonField<List<String>>) = apply {
                this.creditGrantTypeFilters = creditGrantTypeFilters.map { it.toMutableList() }
            }

            /**
             * An array of strings, representing a way to filter the credit grant this alert applies
             * to, by looking at the credit_grant_type field on the credit grant. This field is only
             * defined for CreditPercentage and CreditBalance alerts
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

            fun creditType(creditType: CreditTypeData?) =
                creditType(JsonField.ofNullable(creditType))

            fun creditType(creditType: Optional<CreditTypeData>) =
                creditType(creditType.orElse(null))

            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
            }

            /** A list of custom field filters for alert types that support advanced filtering */
            fun customFieldFilters(customFieldFilters: List<CustomFieldFilter>) =
                customFieldFilters(JsonField.of(customFieldFilters))

            /** A list of custom field filters for alert types that support advanced filtering */
            fun customFieldFilters(customFieldFilters: JsonField<List<CustomFieldFilter>>) = apply {
                this.customFieldFilters = customFieldFilters.map { it.toMutableList() }
            }

            /** A list of custom field filters for alert types that support advanced filtering */
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
             * Scopes alert evaluation to a specific presentation group key on individual line
             * items. Only present for spend alerts.
             */
            fun groupKeyFilter(groupKeyFilter: GroupKeyFilter) =
                groupKeyFilter(JsonField.of(groupKeyFilter))

            /**
             * Scopes alert evaluation to a specific presentation group key on individual line
             * items. Only present for spend alerts.
             */
            fun groupKeyFilter(groupKeyFilter: JsonField<GroupKeyFilter>) = apply {
                this.groupKeyFilter = groupKeyFilter
            }

            /**
             * Only supported for invoice_total_reached alerts. A list of invoice types to evaluate.
             */
            fun invoiceTypesFilter(invoiceTypesFilter: List<String>) =
                invoiceTypesFilter(JsonField.of(invoiceTypesFilter))

            /**
             * Only supported for invoice_total_reached alerts. A list of invoice types to evaluate.
             */
            fun invoiceTypesFilter(invoiceTypesFilter: JsonField<List<String>>) = apply {
                this.invoiceTypesFilter = invoiceTypesFilter.map { it.toMutableList() }
            }

            /**
             * Only supported for invoice_total_reached alerts. A list of invoice types to evaluate.
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
                    (invoiceTypesFilter ?: JsonMissing.of()).map { it.toImmutable() },
                    uniquenessKey,
                    additionalProperties.toImmutable(),
                )
        }

        /** Status of the alert */
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Type of the alert */
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
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
            @JsonProperty("key")
            @ExcludeMissing
            private val key: JsonField<String> = JsonMissing.of(),
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

                fun build(): CustomFieldFilter =
                    CustomFieldFilter(
                        checkRequired("entity", entity),
                        checkRequired("key", key),
                        checkRequired("value", value),
                        additionalProperties.toImmutable(),
                    )
            }

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

        /**
         * Scopes alert evaluation to a specific presentation group key on individual line items.
         * Only present for spend alerts.
         */
        @NoAutoDetect
        class GroupKeyFilter
        @JsonCreator
        private constructor(
            @JsonProperty("key")
            @ExcludeMissing
            private val key: JsonField<String> = JsonMissing.of(),
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

            fun validate(): GroupKeyFilter = apply {
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

                fun build(): GroupKeyFilter =
                    GroupKeyFilter(
                        checkRequired("key", key),
                        checkRequired("value", value),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GroupKeyFilter && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GroupKeyFilter{key=$key, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Alert && id == other.id && name == other.name && status == other.status && threshold == other.threshold && type == other.type && updatedAt == other.updatedAt && creditGrantTypeFilters == other.creditGrantTypeFilters && creditType == other.creditType && customFieldFilters == other.customFieldFilters && groupKeyFilter == other.groupKeyFilter && invoiceTypesFilter == other.invoiceTypesFilter && uniquenessKey == other.uniquenessKey && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, name, status, threshold, type, updatedAt, creditGrantTypeFilters, creditType, customFieldFilters, groupKeyFilter, invoiceTypesFilter, uniquenessKey, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Alert{id=$id, name=$name, status=$status, threshold=$threshold, type=$type, updatedAt=$updatedAt, creditGrantTypeFilters=$creditGrantTypeFilters, creditType=$creditType, customFieldFilters=$customFieldFilters, groupKeyFilter=$groupKeyFilter, invoiceTypesFilter=$invoiceTypesFilter, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
    }

    /** The status of the customer alert. If the alert is archived, null will be returned. */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerAlert && alert == other.alert && customerStatus == other.customerStatus && triggeredBy == other.triggeredBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(alert, customerStatus, triggeredBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerAlert{alert=$alert, customerStatus=$customerStatus, triggeredBy=$triggeredBy, additionalProperties=$additionalProperties}"
}
