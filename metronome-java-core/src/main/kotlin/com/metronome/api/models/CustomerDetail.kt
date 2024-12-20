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
import com.metronome.api.core.toImmutable
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

    private var validated: Boolean = false

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
            id = customerDetail.id
            externalId = customerDetail.externalId
            ingestAliases = customerDetail.ingestAliases
            name = customerDetail.name
            customerConfig = customerDetail.customerConfig
            customFields = customerDetail.customFields
            currentBillableStatus = customerDetail.currentBillableStatus
            additionalProperties = customerDetail.additionalProperties.toMutableMap()
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
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): CustomerDetail =
            CustomerDetail(
                id,
                externalId,
                ingestAliases.map { it.toImmutable() },
                name,
                customerConfig,
                customFields,
                currentBillableStatus,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = CustomFields.Builder::class)
    @NoAutoDetect
    class CustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
                additionalProperties = customFields.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = CustomerConfig.Builder::class)
    @NoAutoDetect
    class CustomerConfig
    private constructor(
        private val salesforceAccountId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

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

        private var validated: Boolean = false

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
                salesforceAccountId = customerConfig.salesforceAccountId
                additionalProperties = customerConfig.additionalProperties.toMutableMap()
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
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): CustomerConfig =
                CustomerConfig(salesforceAccountId, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerConfig && salesforceAccountId == other.salesforceAccountId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(salesforceAccountId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

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

        fun value(): Value = value.getRequired("value")

        fun effectiveAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(effectiveAt.getNullable("effective_at"))

        @JsonProperty("value") @ExcludeMissing fun _value() = value

        @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
                value = currentBillableStatus.value
                effectiveAt = currentBillableStatus.effectiveAt
                additionalProperties = currentBillableStatus.additionalProperties.toMutableMap()
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
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): CurrentBillableStatus =
                CurrentBillableStatus(
                    value,
                    effectiveAt,
                    additionalProperties.toImmutable(),
                )
        }

        class Value
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val BILLABLE = of("billable")

                @JvmField val UNBILLABLE = of("unbillable")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Value && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CurrentBillableStatus && value == other.value && effectiveAt == other.effectiveAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(value, effectiveAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CurrentBillableStatus{value=$value, effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerDetail && id == other.id && externalId == other.externalId && ingestAliases == other.ingestAliases && name == other.name && customerConfig == other.customerConfig && customFields == other.customFields && currentBillableStatus == other.currentBillableStatus && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, externalId, ingestAliases, name, customerConfig, customFields, currentBillableStatus, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerDetail{id=$id, externalId=$externalId, ingestAliases=$ingestAliases, name=$name, customerConfig=$customerConfig, customFields=$customFields, currentBillableStatus=$currentBillableStatus, additionalProperties=$additionalProperties}"
}
