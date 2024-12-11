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
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = CustomFieldListKeysResponse.Builder::class)
@NoAutoDetect
class CustomFieldListKeysResponse
private constructor(
    private val data: JsonField<List<Data>>,
    private val nextPage: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun data(): List<Data> = data.getRequired("data")

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonProperty("next_page") @ExcludeMissing fun _nextPage() = nextPage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CustomFieldListKeysResponse = apply {
        if (!validated) {
            data().forEach { it.validate() }
            nextPage()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var nextPage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customFieldListKeysResponse: CustomFieldListKeysResponse) = apply {
            this.data = customFieldListKeysResponse.data
            this.nextPage = customFieldListKeysResponse.nextPage
            additionalProperties(customFieldListKeysResponse.additionalProperties)
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Data>>) = apply { this.data = data }

        fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

        @JsonProperty("next_page")
        @ExcludeMissing
        fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

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

        fun build(): CustomFieldListKeysResponse =
            CustomFieldListKeysResponse(
                data.map { it.toImmutable() },
                nextPage,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val entity: JsonField<Entity>,
        private val key: JsonField<String>,
        private val enforceUniqueness: JsonField<Boolean>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun entity(): Entity = entity.getRequired("entity")

        fun key(): String = key.getRequired("key")

        fun enforceUniqueness(): Boolean = enforceUniqueness.getRequired("enforce_uniqueness")

        @JsonProperty("entity") @ExcludeMissing fun _entity() = entity

        @JsonProperty("key") @ExcludeMissing fun _key() = key

        @JsonProperty("enforce_uniqueness")
        @ExcludeMissing
        fun _enforceUniqueness() = enforceUniqueness

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                entity()
                key()
                enforceUniqueness()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var entity: JsonField<Entity> = JsonMissing.of()
            private var key: JsonField<String> = JsonMissing.of()
            private var enforceUniqueness: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.entity = data.entity
                this.key = data.key
                this.enforceUniqueness = data.enforceUniqueness
                additionalProperties(data.additionalProperties)
            }

            fun entity(entity: Entity) = entity(JsonField.of(entity))

            @JsonProperty("entity")
            @ExcludeMissing
            fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

            fun key(key: String) = key(JsonField.of(key))

            @JsonProperty("key")
            @ExcludeMissing
            fun key(key: JsonField<String>) = apply { this.key = key }

            fun enforceUniqueness(enforceUniqueness: Boolean) =
                enforceUniqueness(JsonField.of(enforceUniqueness))

            @JsonProperty("enforce_uniqueness")
            @ExcludeMissing
            fun enforceUniqueness(enforceUniqueness: JsonField<Boolean>) = apply {
                this.enforceUniqueness = enforceUniqueness
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

            fun build(): Data =
                Data(
                    entity,
                    key,
                    enforceUniqueness,
                    additionalProperties.toImmutable(),
                )
        }

        class Entity
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ALERT = of("alert")

                @JvmField val BILLABLE_METRIC = of("billable_metric")

                @JvmField val CHARGE = of("charge")

                @JvmField val COMMIT = of("commit")

                @JvmField val CONTRACT_CREDIT = of("contract_credit")

                @JvmField val CONTRACT_PRODUCT = of("contract_product")

                @JvmField val CONTRACT = of("contract")

                @JvmField val CREDIT_GRANT = of("credit_grant")

                @JvmField val CUSTOMER_PLAN = of("customer_plan")

                @JvmField val CUSTOMER = of("customer")

                @JvmField val INVOICE = of("invoice")

                @JvmField val PLAN = of("plan")

                @JvmField val PROFESSIONAL_SERVICE = of("professional_service")

                @JvmField val PRODUCT = of("product")

                @JvmField val RATE_CARD = of("rate_card")

                @JvmField val SCHEDULED_CHARGE = of("scheduled_charge")

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

            return /* spotless:off */ other is Data && entity == other.entity && key == other.key && enforceUniqueness == other.enforceUniqueness && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entity, key, enforceUniqueness, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{entity=$entity, key=$key, enforceUniqueness=$enforceUniqueness, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomFieldListKeysResponse && data == other.data && nextPage == other.nextPage && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, nextPage, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomFieldListKeysResponse{data=$data, nextPage=$nextPage, additionalProperties=$additionalProperties}"
}
