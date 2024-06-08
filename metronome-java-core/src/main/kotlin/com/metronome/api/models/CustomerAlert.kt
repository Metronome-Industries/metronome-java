// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = CustomerAlert.Builder::class)
@NoAutoDetect
class CustomerAlert
private constructor(
    private val customerStatus: JsonField<CustomerStatus>,
    private val triggeredBy: JsonField<String>,
    private val alert: JsonField<Alert>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The status of the customer alert. If the alert is archived, null will be returned. */
    fun customerStatus(): Optional<CustomerStatus> =
        Optional.ofNullable(customerStatus.getNullable("customer_status"))

    /** If present, indicates the reason the alert was triggered. */
    fun triggeredBy(): Optional<String> =
        Optional.ofNullable(triggeredBy.getNullable("triggered_by"))

    fun alert(): Alert = alert.getRequired("alert")

    /** The status of the customer alert. If the alert is archived, null will be returned. */
    @JsonProperty("customer_status") @ExcludeMissing fun _customerStatus() = customerStatus

    /** If present, indicates the reason the alert was triggered. */
    @JsonProperty("triggered_by") @ExcludeMissing fun _triggeredBy() = triggeredBy

    @JsonProperty("alert") @ExcludeMissing fun _alert() = alert

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CustomerAlert = apply {
        if (!validated) {
            customerStatus()
            triggeredBy()
            alert().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerAlert &&
            this.customerStatus == other.customerStatus &&
            this.triggeredBy == other.triggeredBy &&
            this.alert == other.alert &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    customerStatus,
                    triggeredBy,
                    alert,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CustomerAlert{customerStatus=$customerStatus, triggeredBy=$triggeredBy, alert=$alert, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var customerStatus: JsonField<CustomerStatus> = JsonMissing.of()
        private var triggeredBy: JsonField<String> = JsonMissing.of()
        private var alert: JsonField<Alert> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerAlert: CustomerAlert) = apply {
            this.customerStatus = customerAlert.customerStatus
            this.triggeredBy = customerAlert.triggeredBy
            this.alert = customerAlert.alert
            additionalProperties(customerAlert.additionalProperties)
        }

        /** The status of the customer alert. If the alert is archived, null will be returned. */
        fun customerStatus(customerStatus: CustomerStatus) =
            customerStatus(JsonField.of(customerStatus))

        /** The status of the customer alert. If the alert is archived, null will be returned. */
        @JsonProperty("customer_status")
        @ExcludeMissing
        fun customerStatus(customerStatus: JsonField<CustomerStatus>) = apply {
            this.customerStatus = customerStatus
        }

        /** If present, indicates the reason the alert was triggered. */
        fun triggeredBy(triggeredBy: String) = triggeredBy(JsonField.of(triggeredBy))

        /** If present, indicates the reason the alert was triggered. */
        @JsonProperty("triggered_by")
        @ExcludeMissing
        fun triggeredBy(triggeredBy: JsonField<String>) = apply { this.triggeredBy = triggeredBy }

        fun alert(alert: Alert) = alert(JsonField.of(alert))

        @JsonProperty("alert")
        @ExcludeMissing
        fun alert(alert: JsonField<Alert>) = apply { this.alert = alert }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): CustomerAlert =
            CustomerAlert(
                customerStatus,
                triggeredBy,
                alert,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Alert.Builder::class)
    @NoAutoDetect
    class Alert
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val uniquenessKey: JsonField<String>,
        private val type: JsonField<Type>,
        private val status: JsonField<Status>,
        private val creditType: JsonField<CreditType>,
        private val threshold: JsonField<Double>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val customFieldFilters: JsonField<List<CustomFieldFilter>>,
        private val groupKeyFilter: JsonField<GroupKeyFilter>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** the Metronome ID of the alert */
        fun id(): String = id.getRequired("id")

        /** Name of the alert */
        fun name(): String = name.getRequired("name")

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(): Optional<String> =
            Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

        /** Type of the alert */
        fun type(): Type = type.getRequired("type")

        /** Status of the alert */
        fun status(): Status = status.getRequired("status")

        fun creditType(): Optional<CreditType> =
            Optional.ofNullable(creditType.getNullable("credit_type"))

        /** Threshold value of the alert policy */
        fun threshold(): Double = threshold.getRequired("threshold")

        /** Timestamp for when the alert was last updated */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /** A list of custom field filters for alert types that support advanced filtering */
        fun customFieldFilters(): Optional<List<CustomFieldFilter>> =
            Optional.ofNullable(customFieldFilters.getNullable("custom_field_filters"))

        /**
         * Scopes alert evaluation to a specific presentation group key on individual line items.
         * Only present for spend alerts.
         */
        fun groupKeyFilter(): Optional<GroupKeyFilter> =
            Optional.ofNullable(groupKeyFilter.getNullable("group_key_filter"))

        /** the Metronome ID of the alert */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** Name of the alert */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        @JsonProperty("uniqueness_key") @ExcludeMissing fun _uniquenessKey() = uniquenessKey

        /** Type of the alert */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        /** Status of the alert */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

        /** Threshold value of the alert policy */
        @JsonProperty("threshold") @ExcludeMissing fun _threshold() = threshold

        /** Timestamp for when the alert was last updated */
        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        /** A list of custom field filters for alert types that support advanced filtering */
        @JsonProperty("custom_field_filters")
        @ExcludeMissing
        fun _customFieldFilters() = customFieldFilters

        /**
         * Scopes alert evaluation to a specific presentation group key on individual line items.
         * Only present for spend alerts.
         */
        @JsonProperty("group_key_filter") @ExcludeMissing fun _groupKeyFilter() = groupKeyFilter

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Alert = apply {
            if (!validated) {
                id()
                name()
                uniquenessKey()
                type()
                status()
                creditType().map { it.validate() }
                threshold()
                updatedAt()
                customFieldFilters().map { it.forEach { it.validate() } }
                groupKeyFilter().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Alert &&
                this.id == other.id &&
                this.name == other.name &&
                this.uniquenessKey == other.uniquenessKey &&
                this.type == other.type &&
                this.status == other.status &&
                this.creditType == other.creditType &&
                this.threshold == other.threshold &&
                this.updatedAt == other.updatedAt &&
                this.customFieldFilters == other.customFieldFilters &&
                this.groupKeyFilter == other.groupKeyFilter &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        uniquenessKey,
                        type,
                        status,
                        creditType,
                        threshold,
                        updatedAt,
                        customFieldFilters,
                        groupKeyFilter,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Alert{id=$id, name=$name, uniquenessKey=$uniquenessKey, type=$type, status=$status, creditType=$creditType, threshold=$threshold, updatedAt=$updatedAt, customFieldFilters=$customFieldFilters, groupKeyFilter=$groupKeyFilter, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var uniquenessKey: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var creditType: JsonField<CreditType> = JsonMissing.of()
            private var threshold: JsonField<Double> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customFieldFilters: JsonField<List<CustomFieldFilter>> = JsonMissing.of()
            private var groupKeyFilter: JsonField<GroupKeyFilter> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(alert: Alert) = apply {
                this.id = alert.id
                this.name = alert.name
                this.uniquenessKey = alert.uniquenessKey
                this.type = alert.type
                this.status = alert.status
                this.creditType = alert.creditType
                this.threshold = alert.threshold
                this.updatedAt = alert.updatedAt
                this.customFieldFilters = alert.customFieldFilters
                this.groupKeyFilter = alert.groupKeyFilter
                additionalProperties(alert.additionalProperties)
            }

            /** the Metronome ID of the alert */
            fun id(id: String) = id(JsonField.of(id))

            /** the Metronome ID of the alert */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Name of the alert */
            fun name(name: String) = name(JsonField.of(name))

            /** Name of the alert */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

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
            @JsonProperty("uniqueness_key")
            @ExcludeMissing
            fun uniquenessKey(uniquenessKey: JsonField<String>) = apply {
                this.uniquenessKey = uniquenessKey
            }

            /** Type of the alert */
            fun type(type: Type) = type(JsonField.of(type))

            /** Type of the alert */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Status of the alert */
            fun status(status: Status) = status(JsonField.of(status))

            /** Status of the alert */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun creditType(creditType: CreditType) = creditType(JsonField.of(creditType))

            @JsonProperty("credit_type")
            @ExcludeMissing
            fun creditType(creditType: JsonField<CreditType>) = apply {
                this.creditType = creditType
            }

            /** Threshold value of the alert policy */
            fun threshold(threshold: Double) = threshold(JsonField.of(threshold))

            /** Threshold value of the alert policy */
            @JsonProperty("threshold")
            @ExcludeMissing
            fun threshold(threshold: JsonField<Double>) = apply { this.threshold = threshold }

            /** Timestamp for when the alert was last updated */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /** Timestamp for when the alert was last updated */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** A list of custom field filters for alert types that support advanced filtering */
            fun customFieldFilters(customFieldFilters: List<CustomFieldFilter>) =
                customFieldFilters(JsonField.of(customFieldFilters))

            /** A list of custom field filters for alert types that support advanced filtering */
            @JsonProperty("custom_field_filters")
            @ExcludeMissing
            fun customFieldFilters(customFieldFilters: JsonField<List<CustomFieldFilter>>) = apply {
                this.customFieldFilters = customFieldFilters
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
            @JsonProperty("group_key_filter")
            @ExcludeMissing
            fun groupKeyFilter(groupKeyFilter: JsonField<GroupKeyFilter>) = apply {
                this.groupKeyFilter = groupKeyFilter
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Alert =
                Alert(
                    id,
                    name,
                    uniquenessKey,
                    type,
                    status,
                    creditType,
                    threshold,
                    updatedAt,
                    customFieldFilters.map { it.toUnmodifiable() },
                    groupKeyFilter,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ENABLED = Status(JsonField.of("enabled"))

                @JvmField val ARCHIVED = Status(JsonField.of("archived"))

                @JvmField val DISABLED = Status(JsonField.of("disabled"))

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                ENABLED,
                ARCHIVED,
                DISABLED,
            }

            enum class Value {
                ENABLED,
                ARCHIVED,
                DISABLED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ENABLED -> Value.ENABLED
                    ARCHIVED -> Value.ARCHIVED
                    DISABLED -> Value.DISABLED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ENABLED -> Known.ENABLED
                    ARCHIVED -> Known.ARCHIVED
                    DISABLED -> Known.DISABLED
                    else -> throw MetronomeInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val LOW_CREDIT_BALANCE_REACHED = Type(JsonField.of("low_credit_balance_reached"))

                @JvmField
                val SPEND_THRESHOLD_REACHED = Type(JsonField.of("spend_threshold_reached"))

                @JvmField
                val MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED =
                    Type(JsonField.of("monthly_invoice_total_spend_threshold_reached"))

                @JvmField
                val LOW_REMAINING_DAYS_IN_PLAN_REACHED =
                    Type(JsonField.of("low_remaining_days_in_plan_reached"))

                @JvmField
                val LOW_REMAINING_CREDIT_PERCENTAGE_REACHED =
                    Type(JsonField.of("low_remaining_credit_percentage_reached"))

                @JvmField
                val USAGE_THRESHOLD_REACHED = Type(JsonField.of("usage_threshold_reached"))

                @JvmField
                val LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED =
                    Type(JsonField.of("low_remaining_days_for_commit_segment_reached"))

                @JvmField
                val LOW_REMAINING_COMMIT_BALANCE_REACHED =
                    Type(JsonField.of("low_remaining_commit_balance_reached"))

                @JvmField
                val LOW_REMAINING_COMMIT_PERCENTAGE_REACHED =
                    Type(JsonField.of("low_remaining_commit_percentage_reached"))

                @JvmField
                val LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED =
                    Type(JsonField.of("low_remaining_days_for_contract_credit_segment_reached"))

                @JvmField
                val LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED =
                    Type(JsonField.of("low_remaining_contract_credit_balance_reached"))

                @JvmField
                val LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED =
                    Type(JsonField.of("low_remaining_contract_credit_percentage_reached"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

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
            }

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
                _UNKNOWN,
            }

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
                    else -> Value._UNKNOWN
                }

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
                    else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = CreditType.Builder::class)
        @NoAutoDetect
        class CreditType
        private constructor(
            private val name: JsonField<String>,
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun name(): String = name.getRequired("name")

            fun id(): String = id.getRequired("id")

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditType = apply {
                if (!validated) {
                    name()
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditType &&
                    this.name == other.name &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            name,
                            id,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditType{name=$name, id=$id, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditType: CreditType) = apply {
                    this.name = creditType.name
                    this.id = creditType.id
                    additionalProperties(creditType.additionalProperties)
                }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditType =
                    CreditType(
                        name,
                        id,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = CustomFieldFilter.Builder::class)
        @NoAutoDetect
        class CustomFieldFilter
        private constructor(
            private val entity: JsonField<Entity>,
            private val key: JsonField<String>,
            private val value: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun entity(): Entity = entity.getRequired("entity")

            fun key(): String = key.getRequired("key")

            fun value(): String = value.getRequired("value")

            @JsonProperty("entity") @ExcludeMissing fun _entity() = entity

            @JsonProperty("key") @ExcludeMissing fun _key() = key

            @JsonProperty("value") @ExcludeMissing fun _value() = value

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CustomFieldFilter = apply {
                if (!validated) {
                    entity()
                    key()
                    value()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFieldFilter &&
                    this.entity == other.entity &&
                    this.key == other.key &&
                    this.value == other.value &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            entity,
                            key,
                            value,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CustomFieldFilter{entity=$entity, key=$key, value=$value, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var entity: JsonField<Entity> = JsonMissing.of()
                private var key: JsonField<String> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFieldFilter: CustomFieldFilter) = apply {
                    this.entity = customFieldFilter.entity
                    this.key = customFieldFilter.key
                    this.value = customFieldFilter.value
                    additionalProperties(customFieldFilter.additionalProperties)
                }

                fun entity(entity: Entity) = entity(JsonField.of(entity))

                @JsonProperty("entity")
                @ExcludeMissing
                fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

                fun key(key: String) = key(JsonField.of(key))

                @JsonProperty("key")
                @ExcludeMissing
                fun key(key: JsonField<String>) = apply { this.key = key }

                fun value(value: String) = value(JsonField.of(value))

                @JsonProperty("value")
                @ExcludeMissing
                fun value(value: JsonField<String>) = apply { this.value = value }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CustomFieldFilter =
                    CustomFieldFilter(
                        entity,
                        key,
                        value,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Entity
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Entity && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val CONTRACT = Entity(JsonField.of("Contract"))

                    @JvmField val COMMIT = Entity(JsonField.of("Commit"))

                    @JvmField val CONTRACT_CREDIT = Entity(JsonField.of("ContractCredit"))

                    @JvmStatic fun of(value: String) = Entity(JsonField.of(value))
                }

                enum class Known {
                    CONTRACT,
                    COMMIT,
                    CONTRACT_CREDIT,
                }

                enum class Value {
                    CONTRACT,
                    COMMIT,
                    CONTRACT_CREDIT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CONTRACT -> Value.CONTRACT
                        COMMIT -> Value.COMMIT
                        CONTRACT_CREDIT -> Value.CONTRACT_CREDIT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CONTRACT -> Known.CONTRACT
                        COMMIT -> Known.COMMIT
                        CONTRACT_CREDIT -> Known.CONTRACT_CREDIT
                        else -> throw MetronomeInvalidDataException("Unknown Entity: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * Scopes alert evaluation to a specific presentation group key on individual line items.
         * Only present for spend alerts.
         */
        @JsonDeserialize(builder = GroupKeyFilter.Builder::class)
        @NoAutoDetect
        class GroupKeyFilter
        private constructor(
            private val key: JsonField<String>,
            private val value: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun key(): String = key.getRequired("key")

            fun value(): String = value.getRequired("value")

            @JsonProperty("key") @ExcludeMissing fun _key() = key

            @JsonProperty("value") @ExcludeMissing fun _value() = value

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): GroupKeyFilter = apply {
                if (!validated) {
                    key()
                    value()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GroupKeyFilter &&
                    this.key == other.key &&
                    this.value == other.value &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            key,
                            value,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "GroupKeyFilter{key=$key, value=$value, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var key: JsonField<String> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(groupKeyFilter: GroupKeyFilter) = apply {
                    this.key = groupKeyFilter.key
                    this.value = groupKeyFilter.value
                    additionalProperties(groupKeyFilter.additionalProperties)
                }

                fun key(key: String) = key(JsonField.of(key))

                @JsonProperty("key")
                @ExcludeMissing
                fun key(key: JsonField<String>) = apply { this.key = key }

                fun value(value: String) = value(JsonField.of(value))

                @JsonProperty("value")
                @ExcludeMissing
                fun value(value: JsonField<String>) = apply { this.value = value }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): GroupKeyFilter =
                    GroupKeyFilter(
                        key,
                        value,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }

    class CustomerStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomerStatus && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val OK = CustomerStatus(JsonField.of("ok"))

            @JvmField val IN_ALARM = CustomerStatus(JsonField.of("in_alarm"))

            @JvmField val EVALUATING = CustomerStatus(JsonField.of("evaluating"))

            @JvmStatic fun of(value: String) = CustomerStatus(JsonField.of(value))
        }

        enum class Known {
            OK,
            IN_ALARM,
            EVALUATING,
        }

        enum class Value {
            OK,
            IN_ALARM,
            EVALUATING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OK -> Value.OK
                IN_ALARM -> Value.IN_ALARM
                EVALUATING -> Value.EVALUATING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OK -> Known.OK
                IN_ALARM -> Known.IN_ALARM
                EVALUATING -> Known.EVALUATING
                else -> throw MetronomeInvalidDataException("Unknown CustomerStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
