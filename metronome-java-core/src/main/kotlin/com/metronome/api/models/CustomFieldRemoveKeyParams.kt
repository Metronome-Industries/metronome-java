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
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.util.Objects

class CustomFieldRemoveKeyParams
constructor(
    private val entity: Entity,
    private val key: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun entity(): Entity = entity

    fun key(): String = key

    @JvmSynthetic
    internal fun getBody(): CustomFieldRemoveKeyBody {
        return CustomFieldRemoveKeyBody(
            entity,
            key,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CustomFieldRemoveKeyBody.Builder::class)
    @NoAutoDetect
    class CustomFieldRemoveKeyBody
    internal constructor(
        private val entity: Entity?,
        private val key: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("entity") fun entity(): Entity? = entity

        @JsonProperty("key") fun key(): String? = key

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var entity: Entity? = null
            private var key: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFieldRemoveKeyBody: CustomFieldRemoveKeyBody) = apply {
                this.entity = customFieldRemoveKeyBody.entity
                this.key = customFieldRemoveKeyBody.key
                additionalProperties(customFieldRemoveKeyBody.additionalProperties)
            }

            @JsonProperty("entity") fun entity(entity: Entity) = apply { this.entity = entity }

            @JsonProperty("key") fun key(key: String) = apply { this.key = key }

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

            fun build(): CustomFieldRemoveKeyBody =
                CustomFieldRemoveKeyBody(
                    checkNotNull(entity) { "`entity` is required but was not set" },
                    checkNotNull(key) { "`key` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFieldRemoveKeyBody && this.entity == other.entity && this.key == other.key && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(entity, key, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CustomFieldRemoveKeyBody{entity=$entity, key=$key, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomFieldRemoveKeyParams && this.entity == other.entity && this.key == other.key && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(entity, key, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CustomFieldRemoveKeyParams{entity=$entity, key=$key, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var entity: Entity? = null
        private var key: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customFieldRemoveKeyParams: CustomFieldRemoveKeyParams) = apply {
            this.entity = customFieldRemoveKeyParams.entity
            this.key = customFieldRemoveKeyParams.key
            additionalQueryParams(customFieldRemoveKeyParams.additionalQueryParams)
            additionalHeaders(customFieldRemoveKeyParams.additionalHeaders)
            additionalBodyProperties(customFieldRemoveKeyParams.additionalBodyProperties)
        }

        fun entity(entity: Entity) = apply { this.entity = entity }

        fun key(key: String) = apply { this.key = key }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CustomFieldRemoveKeyParams =
            CustomFieldRemoveKeyParams(
                checkNotNull(entity) { "`entity` is required but was not set" },
                checkNotNull(key) { "`key` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is Entity && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ALERT = Entity(JsonField.of("alert"))

            @JvmField val BILLABLE_METRIC = Entity(JsonField.of("billable_metric"))

            @JvmField val CHARGE = Entity(JsonField.of("charge"))

            @JvmField val COMMIT = Entity(JsonField.of("commit"))

            @JvmField val CONTRACT_CREDIT = Entity(JsonField.of("contract_credit"))

            @JvmField val CONTRACT_PRODUCT = Entity(JsonField.of("contract_product"))

            @JvmField val CONTRACT = Entity(JsonField.of("contract"))

            @JvmField val CREDIT_GRANT = Entity(JsonField.of("credit_grant"))

            @JvmField val CUSTOMER_PLAN = Entity(JsonField.of("customer_plan"))

            @JvmField val CUSTOMER = Entity(JsonField.of("customer"))

            @JvmField val INVOICE = Entity(JsonField.of("invoice"))

            @JvmField val PLAN = Entity(JsonField.of("plan"))

            @JvmField val PROFESSIONAL_SERVICE = Entity(JsonField.of("professional_service"))

            @JvmField val PRODUCT = Entity(JsonField.of("product"))

            @JvmField val RATE_CARD = Entity(JsonField.of("rate_card"))

            @JvmField val SCHEDULED_CHARGE = Entity(JsonField.of("scheduled_charge"))

            @JvmStatic fun of(value: String) = Entity(JsonField.of(value))
        }

        enum class Known {
            ALERT,
            BILLABLE_METRIC,
            CHARGE,
            COMMIT,
            CONTRACT_CREDIT,
            CONTRACT_PRODUCT,
            CONTRACT,
            CREDIT_GRANT,
            CUSTOMER_PLAN,
            CUSTOMER,
            INVOICE,
            PLAN,
            PROFESSIONAL_SERVICE,
            PRODUCT,
            RATE_CARD,
            SCHEDULED_CHARGE,
        }

        enum class Value {
            ALERT,
            BILLABLE_METRIC,
            CHARGE,
            COMMIT,
            CONTRACT_CREDIT,
            CONTRACT_PRODUCT,
            CONTRACT,
            CREDIT_GRANT,
            CUSTOMER_PLAN,
            CUSTOMER,
            INVOICE,
            PLAN,
            PROFESSIONAL_SERVICE,
            PRODUCT,
            RATE_CARD,
            SCHEDULED_CHARGE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ALERT -> Value.ALERT
                BILLABLE_METRIC -> Value.BILLABLE_METRIC
                CHARGE -> Value.CHARGE
                COMMIT -> Value.COMMIT
                CONTRACT_CREDIT -> Value.CONTRACT_CREDIT
                CONTRACT_PRODUCT -> Value.CONTRACT_PRODUCT
                CONTRACT -> Value.CONTRACT
                CREDIT_GRANT -> Value.CREDIT_GRANT
                CUSTOMER_PLAN -> Value.CUSTOMER_PLAN
                CUSTOMER -> Value.CUSTOMER
                INVOICE -> Value.INVOICE
                PLAN -> Value.PLAN
                PROFESSIONAL_SERVICE -> Value.PROFESSIONAL_SERVICE
                PRODUCT -> Value.PRODUCT
                RATE_CARD -> Value.RATE_CARD
                SCHEDULED_CHARGE -> Value.SCHEDULED_CHARGE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ALERT -> Known.ALERT
                BILLABLE_METRIC -> Known.BILLABLE_METRIC
                CHARGE -> Known.CHARGE
                COMMIT -> Known.COMMIT
                CONTRACT_CREDIT -> Known.CONTRACT_CREDIT
                CONTRACT_PRODUCT -> Known.CONTRACT_PRODUCT
                CONTRACT -> Known.CONTRACT
                CREDIT_GRANT -> Known.CREDIT_GRANT
                CUSTOMER_PLAN -> Known.CUSTOMER_PLAN
                CUSTOMER -> Known.CUSTOMER
                INVOICE -> Known.INVOICE
                PLAN -> Known.PLAN
                PROFESSIONAL_SERVICE -> Known.PROFESSIONAL_SERVICE
                PRODUCT -> Known.PRODUCT
                RATE_CARD -> Known.RATE_CARD
                SCHEDULED_CHARGE -> Known.SCHEDULED_CHARGE
                else -> throw MetronomeInvalidDataException("Unknown Entity: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
