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

@JsonDeserialize(builder = CustomerDetail.Builder::class)
@NoAutoDetect
class CustomerDetail
private constructor(
    private val id: JsonField<String>,
    private val externalId: JsonField<String>,
    private val ingestAliases: JsonField<List<String>>,
    private val name: JsonField<String>,
    private val customerConfig: JsonField<CustomerConfig>,
    private val customFields: JsonField<CustomFields>,
    private val currentBillableStatus: JsonField<CurrentBillableStatus>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** the Metronome ID of the customer */
    fun id(): String = id.getRequired("id")

    /**
     * (deprecated, use ingest_aliases instead) the first ID (Metronome or ingest alias) that can be
     * used in usage events
     */
    fun externalId(): String = externalId.getRequired("external_id")

    /**
     * aliases for this customer that can be used instead of the Metronome customer ID in usage
     * events
     */
    fun ingestAliases(): List<String> = ingestAliases.getRequired("ingest_aliases")

    fun name(): String = name.getRequired("name")

    fun customerConfig(): CustomerConfig = customerConfig.getRequired("customer_config")

    fun customFields(): CustomFields = customFields.getRequired("custom_fields")

    /** This field's availability is dependent on your client's configuration. */
    fun currentBillableStatus(): Optional<CurrentBillableStatus> =
        Optional.ofNullable(currentBillableStatus.getNullable("current_billable_status"))

    /** the Metronome ID of the customer */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * (deprecated, use ingest_aliases instead) the first ID (Metronome or ingest alias) that can be
     * used in usage events
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId() = externalId

    /**
     * aliases for this customer that can be used instead of the Metronome customer ID in usage
     * events
     */
    @JsonProperty("ingest_aliases") @ExcludeMissing fun _ingestAliases() = ingestAliases

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("customer_config") @ExcludeMissing fun _customerConfig() = customerConfig

    @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("current_billable_status")
    @ExcludeMissing
    fun _currentBillableStatus() = currentBillableStatus

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CustomerDetail = apply {
        if (!validated) {
            id()
            externalId()
            ingestAliases()
            name()
            customerConfig().validate()
            customFields().validate()
            currentBillableStatus().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var ingestAliases: JsonField<List<String>> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var customerConfig: JsonField<CustomerConfig> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var currentBillableStatus: JsonField<CurrentBillableStatus> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerDetail: CustomerDetail) = apply {
            this.id = customerDetail.id
            this.externalId = customerDetail.externalId
            this.ingestAliases = customerDetail.ingestAliases
            this.name = customerDetail.name
            this.customerConfig = customerDetail.customerConfig
            this.customFields = customerDetail.customFields
            this.currentBillableStatus = customerDetail.currentBillableStatus
            additionalProperties(customerDetail.additionalProperties)
        }

        /** the Metronome ID of the customer */
        fun id(id: String) = id(JsonField.of(id))

        /** the Metronome ID of the customer */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * (deprecated, use ingest_aliases instead) the first ID (Metronome or ingest alias) that
         * can be used in usage events
         */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * (deprecated, use ingest_aliases instead) the first ID (Metronome or ingest alias) that
         * can be used in usage events
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /**
         * aliases for this customer that can be used instead of the Metronome customer ID in usage
         * events
         */
        fun ingestAliases(ingestAliases: List<String>) = ingestAliases(JsonField.of(ingestAliases))

        /**
         * aliases for this customer that can be used instead of the Metronome customer ID in usage
         * events
         */
        @JsonProperty("ingest_aliases")
        @ExcludeMissing
        fun ingestAliases(ingestAliases: JsonField<List<String>>) = apply {
            this.ingestAliases = ingestAliases
        }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun customerConfig(customerConfig: CustomerConfig) =
            customerConfig(JsonField.of(customerConfig))

        @JsonProperty("customer_config")
        @ExcludeMissing
        fun customerConfig(customerConfig: JsonField<CustomerConfig>) = apply {
            this.customerConfig = customerConfig
        }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        /** This field's availability is dependent on your client's configuration. */
        fun currentBillableStatus(currentBillableStatus: CurrentBillableStatus) =
            currentBillableStatus(JsonField.of(currentBillableStatus))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("current_billable_status")
        @ExcludeMissing
        fun currentBillableStatus(currentBillableStatus: JsonField<CurrentBillableStatus>) = apply {
            this.currentBillableStatus = currentBillableStatus
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

        fun build(): CustomerDetail =
            CustomerDetail(
                id,
                externalId,
                ingestAliases.map { it.toUnmodifiable() },
                name,
                customerConfig,
                customFields,
                currentBillableStatus,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = CustomFields.Builder::class)
    @NoAutoDetect
    class CustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CustomFields = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties(customFields.additionalProperties)
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

            fun build(): CustomFields = CustomFields(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = CustomerConfig.Builder::class)
    @NoAutoDetect
    class CustomerConfig
    private constructor(
        private val salesforceAccountId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The Salesforce account ID for the customer */
        fun salesforceAccountId(): Optional<String> =
            Optional.ofNullable(salesforceAccountId.getNullable("salesforce_account_id"))

        /** The Salesforce account ID for the customer */
        @JsonProperty("salesforce_account_id")
        @ExcludeMissing
        fun _salesforceAccountId() = salesforceAccountId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CustomerConfig = apply {
            if (!validated) {
                salesforceAccountId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var salesforceAccountId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerConfig: CustomerConfig) = apply {
                this.salesforceAccountId = customerConfig.salesforceAccountId
                additionalProperties(customerConfig.additionalProperties)
            }

            /** The Salesforce account ID for the customer */
            fun salesforceAccountId(salesforceAccountId: String) =
                salesforceAccountId(JsonField.of(salesforceAccountId))

            /** The Salesforce account ID for the customer */
            @JsonProperty("salesforce_account_id")
            @ExcludeMissing
            fun salesforceAccountId(salesforceAccountId: JsonField<String>) = apply {
                this.salesforceAccountId = salesforceAccountId
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

            fun build(): CustomerConfig =
                CustomerConfig(salesforceAccountId, additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerConfig && this.salesforceAccountId == other.salesforceAccountId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(salesforceAccountId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CustomerConfig{salesforceAccountId=$salesforceAccountId, additionalProperties=$additionalProperties}"
    }

    /** This field's availability is dependent on your client's configuration. */
    @JsonDeserialize(builder = CurrentBillableStatus.Builder::class)
    @NoAutoDetect
    class CurrentBillableStatus
    private constructor(
        private val value: JsonField<Value>,
        private val effectiveAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun value(): Value = value.getRequired("value")

        fun effectiveAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(effectiveAt.getNullable("effective_at"))

        @JsonProperty("value") @ExcludeMissing fun _value() = value

        @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CurrentBillableStatus = apply {
            if (!validated) {
                value()
                effectiveAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var value: JsonField<Value> = JsonMissing.of()
            private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(currentBillableStatus: CurrentBillableStatus) = apply {
                this.value = currentBillableStatus.value
                this.effectiveAt = currentBillableStatus.effectiveAt
                additionalProperties(currentBillableStatus.additionalProperties)
            }

            fun value(value: Value) = value(JsonField.of(value))

            @JsonProperty("value")
            @ExcludeMissing
            fun value(value: JsonField<Value>) = apply { this.value = value }

            fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

            @JsonProperty("effective_at")
            @ExcludeMissing
            fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                this.effectiveAt = effectiveAt
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

            fun build(): CurrentBillableStatus =
                CurrentBillableStatus(
                    value,
                    effectiveAt,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Value
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Value && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val BILLABLE = Value(JsonField.of("billable"))

                @JvmField val UNBILLABLE = Value(JsonField.of("unbillable"))

                @JvmStatic fun of(value: String) = Value(JsonField.of(value))
            }

            enum class Known {
                BILLABLE,
                UNBILLABLE,
            }

            enum class Value {
                BILLABLE,
                UNBILLABLE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BILLABLE -> Value.BILLABLE
                    UNBILLABLE -> Value.UNBILLABLE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BILLABLE -> Known.BILLABLE
                    UNBILLABLE -> Known.UNBILLABLE
                    else -> throw MetronomeInvalidDataException("Unknown Value: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CurrentBillableStatus && this.value == other.value && this.effectiveAt == other.effectiveAt && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(value, effectiveAt, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CurrentBillableStatus{value=$value, effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerDetail && this.id == other.id && this.externalId == other.externalId && this.ingestAliases == other.ingestAliases && this.name == other.name && this.customerConfig == other.customerConfig && this.customFields == other.customFields && this.currentBillableStatus == other.currentBillableStatus && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, externalId, ingestAliases, name, customerConfig, customFields, currentBillableStatus, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "CustomerDetail{id=$id, externalId=$externalId, ingestAliases=$ingestAliases, name=$name, customerConfig=$customerConfig, customFields=$customFields, currentBillableStatus=$currentBillableStatus, additionalProperties=$additionalProperties}"
}
