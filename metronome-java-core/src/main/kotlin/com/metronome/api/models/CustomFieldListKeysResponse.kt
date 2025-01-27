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
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CustomFieldListKeysResponse
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<Data>> = JsonMissing.of(),
    @JsonProperty("next_page")
    @ExcludeMissing
    private val nextPage: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): List<Data> = data.getRequired("data")

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    @JsonProperty("next_page") @ExcludeMissing fun _nextPage(): JsonField<String> = nextPage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomFieldListKeysResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        nextPage()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomFieldListKeysResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var nextPage: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customFieldListKeysResponse: CustomFieldListKeysResponse) = apply {
            data = customFieldListKeysResponse.data.map { it.toMutableList() }
            nextPage = customFieldListKeysResponse.nextPage
            additionalProperties = customFieldListKeysResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(data)
                }
        }

        fun nextPage(nextPage: String?) = nextPage(JsonField.ofNullable(nextPage))

        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.orElse(null))

        fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

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

        fun build(): CustomFieldListKeysResponse =
            CustomFieldListKeysResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("nextPage", nextPage),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("enforce_uniqueness")
        @ExcludeMissing
        private val enforceUniqueness: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("entity")
        @ExcludeMissing
        private val entity: JsonField<Entity> = JsonMissing.of(),
        @JsonProperty("key") @ExcludeMissing private val key: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun enforceUniqueness(): Boolean = enforceUniqueness.getRequired("enforce_uniqueness")

        fun entity(): Entity = entity.getRequired("entity")

        fun key(): String = key.getRequired("key")

        @JsonProperty("enforce_uniqueness")
        @ExcludeMissing
        fun _enforceUniqueness(): JsonField<Boolean> = enforceUniqueness

        @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<Entity> = entity

        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            enforceUniqueness()
            entity()
            key()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var enforceUniqueness: JsonField<Boolean>? = null
            private var entity: JsonField<Entity>? = null
            private var key: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                enforceUniqueness = data.enforceUniqueness
                entity = data.entity
                key = data.key
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun enforceUniqueness(enforceUniqueness: Boolean) =
                enforceUniqueness(JsonField.of(enforceUniqueness))

            fun enforceUniqueness(enforceUniqueness: JsonField<Boolean>) = apply {
                this.enforceUniqueness = enforceUniqueness
            }

            fun entity(entity: Entity) = entity(JsonField.of(entity))

            fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

            fun key(key: String) = key(JsonField.of(key))

            fun key(key: JsonField<String>) = apply { this.key = key }

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

            fun build(): Data =
                Data(
                    checkRequired("enforceUniqueness", enforceUniqueness),
                    checkRequired("entity", entity),
                    checkRequired("key", key),
                    additionalProperties.toImmutable(),
                )
        }

        class Entity
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val DISCOUNT = of("discount")

                @JvmField val INVOICE = of("invoice")

                @JvmField val PLAN = of("plan")

                @JvmField val PROFESSIONAL_SERVICE = of("professional_service")

                @JvmField val PRODUCT = of("product")

                @JvmField val RATE_CARD = of("rate_card")

                @JvmField val SCHEDULED_CHARGE = of("scheduled_charge")

                @JvmStatic fun of(value: String) = Entity(JsonField.of(value))
            }

            /** An enum containing [Entity]'s known values. */
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
                DISCOUNT,
                INVOICE,
                PLAN,
                PROFESSIONAL_SERVICE,
                PRODUCT,
                RATE_CARD,
                SCHEDULED_CHARGE,
            }

            /**
             * An enum containing [Entity]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Entity] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
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
                DISCOUNT,
                INVOICE,
                PLAN,
                PROFESSIONAL_SERVICE,
                PRODUCT,
                RATE_CARD,
                SCHEDULED_CHARGE,
                /**
                 * An enum member indicating that [Entity] was instantiated with an unknown value.
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
                    DISCOUNT -> Value.DISCOUNT
                    INVOICE -> Value.INVOICE
                    PLAN -> Value.PLAN
                    PROFESSIONAL_SERVICE -> Value.PROFESSIONAL_SERVICE
                    PRODUCT -> Value.PRODUCT
                    RATE_CARD -> Value.RATE_CARD
                    SCHEDULED_CHARGE -> Value.SCHEDULED_CHARGE
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
                    DISCOUNT -> Known.DISCOUNT
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

            return /* spotless:off */ other is Data && enforceUniqueness == other.enforceUniqueness && entity == other.entity && key == other.key && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(enforceUniqueness, entity, key, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{enforceUniqueness=$enforceUniqueness, entity=$entity, key=$key, additionalProperties=$additionalProperties}"
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
