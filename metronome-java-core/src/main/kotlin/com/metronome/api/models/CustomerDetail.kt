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
class CustomerDetail
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("customer_config")
    @ExcludeMissing
    private val customerConfig: JsonField<CustomerConfig> = JsonMissing.of(),
    @JsonProperty("external_id")
    @ExcludeMissing
    private val externalId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ingest_aliases")
    @ExcludeMissing
    private val ingestAliases: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("archived_at")
    @ExcludeMissing
    private val archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("current_billable_status")
    @ExcludeMissing
    private val currentBillableStatus: JsonField<CurrentBillableStatus> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** the Metronome ID of the customer */
    fun id(): String = id.getRequired("id")

    /** RFC 3339 timestamp indicating when the customer was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    fun customFields(): CustomFields = customFields.getRequired("custom_fields")

    fun customerConfig(): CustomerConfig = customerConfig.getRequired("customer_config")

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

    /** RFC 3339 timestamp indicating when the customer was last updated. */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * RFC 3339 timestamp indicating when the customer was archived. Null if the customer is active.
     */
    fun archivedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(archivedAt.getNullable("archived_at"))

    /** This field's availability is dependent on your client's configuration. */
    fun currentBillableStatus(): Optional<CurrentBillableStatus> =
        Optional.ofNullable(currentBillableStatus.getNullable("current_billable_status"))

    /** the Metronome ID of the customer */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** RFC 3339 timestamp indicating when the customer was created. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    @JsonProperty("customer_config")
    @ExcludeMissing
    fun _customerConfig(): JsonField<CustomerConfig> = customerConfig

    /**
     * (deprecated, use ingest_aliases instead) the first ID (Metronome or ingest alias) that can be
     * used in usage events
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * aliases for this customer that can be used instead of the Metronome customer ID in usage
     * events
     */
    @JsonProperty("ingest_aliases")
    @ExcludeMissing
    fun _ingestAliases(): JsonField<List<String>> = ingestAliases

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** RFC 3339 timestamp indicating when the customer was last updated. */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * RFC 3339 timestamp indicating when the customer was archived. Null if the customer is active.
     */
    @JsonProperty("archived_at")
    @ExcludeMissing
    fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("current_billable_status")
    @ExcludeMissing
    fun _currentBillableStatus(): JsonField<CurrentBillableStatus> = currentBillableStatus

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomerDetail = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        customFields().validate()
        customerConfig().validate()
        externalId()
        ingestAliases()
        name()
        updatedAt()
        archivedAt()
        currentBillableStatus().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerDetail]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customFields: JsonField<CustomFields>? = null
        private var customerConfig: JsonField<CustomerConfig>? = null
        private var externalId: JsonField<String>? = null
        private var ingestAliases: JsonField<MutableList<String>>? = null
        private var name: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currentBillableStatus: JsonField<CurrentBillableStatus> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerDetail: CustomerDetail) = apply {
            id = customerDetail.id
            createdAt = customerDetail.createdAt
            customFields = customerDetail.customFields
            customerConfig = customerDetail.customerConfig
            externalId = customerDetail.externalId
            ingestAliases = customerDetail.ingestAliases.map { it.toMutableList() }
            name = customerDetail.name
            updatedAt = customerDetail.updatedAt
            archivedAt = customerDetail.archivedAt
            currentBillableStatus = customerDetail.currentBillableStatus
            additionalProperties = customerDetail.additionalProperties.toMutableMap()
        }

        /** the Metronome ID of the customer */
        fun id(id: String) = id(JsonField.of(id))

        /** the Metronome ID of the customer */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** RFC 3339 timestamp indicating when the customer was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** RFC 3339 timestamp indicating when the customer was created. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        fun customerConfig(customerConfig: CustomerConfig) =
            customerConfig(JsonField.of(customerConfig))

        fun customerConfig(customerConfig: JsonField<CustomerConfig>) = apply {
            this.customerConfig = customerConfig
        }

        /**
         * (deprecated, use ingest_aliases instead) the first ID (Metronome or ingest alias) that
         * can be used in usage events
         */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * (deprecated, use ingest_aliases instead) the first ID (Metronome or ingest alias) that
         * can be used in usage events
         */
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
        fun ingestAliases(ingestAliases: JsonField<List<String>>) = apply {
            this.ingestAliases = ingestAliases.map { it.toMutableList() }
        }

        /**
         * aliases for this customer that can be used instead of the Metronome customer ID in usage
         * events
         */
        fun addIngestAlias(ingestAlias: String) = apply {
            ingestAliases =
                (ingestAliases ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(ingestAlias)
                }
        }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        /** RFC 3339 timestamp indicating when the customer was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /** RFC 3339 timestamp indicating when the customer was last updated. */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * RFC 3339 timestamp indicating when the customer was archived. Null if the customer is
         * active.
         */
        fun archivedAt(archivedAt: OffsetDateTime?) = archivedAt(JsonField.ofNullable(archivedAt))

        /**
         * RFC 3339 timestamp indicating when the customer was archived. Null if the customer is
         * active.
         */
        fun archivedAt(archivedAt: Optional<OffsetDateTime>) = archivedAt(archivedAt.orElse(null))

        /**
         * RFC 3339 timestamp indicating when the customer was archived. Null if the customer is
         * active.
         */
        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
        }

        /** This field's availability is dependent on your client's configuration. */
        fun currentBillableStatus(currentBillableStatus: CurrentBillableStatus) =
            currentBillableStatus(JsonField.of(currentBillableStatus))

        /** This field's availability is dependent on your client's configuration. */
        fun currentBillableStatus(currentBillableStatus: JsonField<CurrentBillableStatus>) = apply {
            this.currentBillableStatus = currentBillableStatus
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

        fun build(): CustomerDetail =
            CustomerDetail(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("customFields", customFields),
                checkRequired("customerConfig", customerConfig),
                checkRequired("externalId", externalId),
                checkRequired("ingestAliases", ingestAliases).map { it.toImmutable() },
                checkRequired("name", name),
                checkRequired("updatedAt", updatedAt),
                archivedAt,
                currentBillableStatus,
                additionalProperties.toImmutable(),
            )
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties = customFields.additionalProperties.toMutableMap()
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

    @NoAutoDetect
    class CustomerConfig
    @JsonCreator
    private constructor(
        @JsonProperty("salesforce_account_id")
        @ExcludeMissing
        private val salesforceAccountId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Salesforce account ID for the customer */
        fun salesforceAccountId(): Optional<String> =
            Optional.ofNullable(salesforceAccountId.getNullable("salesforce_account_id"))

        /** The Salesforce account ID for the customer */
        @JsonProperty("salesforce_account_id")
        @ExcludeMissing
        fun _salesforceAccountId(): JsonField<String> = salesforceAccountId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomerConfig = apply {
            if (validated) {
                return@apply
            }

            salesforceAccountId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomerConfig]. */
        class Builder internal constructor() {

            private var salesforceAccountId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerConfig: CustomerConfig) = apply {
                salesforceAccountId = customerConfig.salesforceAccountId
                additionalProperties = customerConfig.additionalProperties.toMutableMap()
            }

            /** The Salesforce account ID for the customer */
            fun salesforceAccountId(salesforceAccountId: String?) =
                salesforceAccountId(JsonField.ofNullable(salesforceAccountId))

            /** The Salesforce account ID for the customer */
            fun salesforceAccountId(salesforceAccountId: Optional<String>) =
                salesforceAccountId(salesforceAccountId.orElse(null))

            /** The Salesforce account ID for the customer */
            fun salesforceAccountId(salesforceAccountId: JsonField<String>) = apply {
                this.salesforceAccountId = salesforceAccountId
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

            fun build(): CustomerConfig =
                CustomerConfig(
                    checkRequired("salesforceAccountId", salesforceAccountId),
                    additionalProperties.toImmutable(),
                )
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
    @NoAutoDetect
    class CurrentBillableStatus
    @JsonCreator
    private constructor(
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<Value> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun value(): Value = value.getRequired("value")

        fun effectiveAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(effectiveAt.getNullable("effective_at"))

        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

        @JsonProperty("effective_at")
        @ExcludeMissing
        fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CurrentBillableStatus = apply {
            if (validated) {
                return@apply
            }

            value()
            effectiveAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CurrentBillableStatus]. */
        class Builder internal constructor() {

            private var value: JsonField<Value>? = null
            private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(currentBillableStatus: CurrentBillableStatus) = apply {
                value = currentBillableStatus.value
                effectiveAt = currentBillableStatus.effectiveAt
                additionalProperties = currentBillableStatus.additionalProperties.toMutableMap()
            }

            fun value(value: Value) = value(JsonField.of(value))

            fun value(value: JsonField<Value>) = apply { this.value = value }

            fun effectiveAt(effectiveAt: OffsetDateTime?) =
                effectiveAt(JsonField.ofNullable(effectiveAt))

            fun effectiveAt(effectiveAt: Optional<OffsetDateTime>) =
                effectiveAt(effectiveAt.orElse(null))

            fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                this.effectiveAt = effectiveAt
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

            fun build(): CurrentBillableStatus =
                CurrentBillableStatus(
                    checkRequired("value", value),
                    effectiveAt,
                    additionalProperties.toImmutable(),
                )
        }

        class Value @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val BILLABLE = of("billable")

                @JvmField val UNBILLABLE = of("unbillable")

                @JvmStatic fun of(value: String) = Value(JsonField.of(value))
            }

            /** An enum containing [Value]'s known values. */
            enum class Known {
                BILLABLE,
                UNBILLABLE,
            }

            /**
             * An enum containing [Value]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Value] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BILLABLE,
                UNBILLABLE,
                /**
                 * An enum member indicating that [Value] was instantiated with an unknown value.
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
                    BILLABLE -> Value.BILLABLE
                    UNBILLABLE -> Value.UNBILLABLE
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
                    BILLABLE -> Known.BILLABLE
                    UNBILLABLE -> Known.UNBILLABLE
                    else -> throw MetronomeInvalidDataException("Unknown Value: $value")
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

        return /* spotless:off */ other is CustomerDetail && id == other.id && createdAt == other.createdAt && customFields == other.customFields && customerConfig == other.customerConfig && externalId == other.externalId && ingestAliases == other.ingestAliases && name == other.name && updatedAt == other.updatedAt && archivedAt == other.archivedAt && currentBillableStatus == other.currentBillableStatus && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, customFields, customerConfig, externalId, ingestAliases, name, updatedAt, archivedAt, currentBillableStatus, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerDetail{id=$id, createdAt=$createdAt, customFields=$customFields, customerConfig=$customerConfig, externalId=$externalId, ingestAliases=$ingestAliases, name=$name, updatedAt=$updatedAt, archivedAt=$archivedAt, currentBillableStatus=$currentBillableStatus, additionalProperties=$additionalProperties}"
}
