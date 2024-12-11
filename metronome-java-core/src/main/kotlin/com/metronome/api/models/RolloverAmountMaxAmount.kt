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

@JsonDeserialize(builder = RolloverAmountMaxAmount.Builder::class)
@NoAutoDetect
class RolloverAmountMaxAmount
private constructor(
    private val type: JsonField<Type>,
    private val value: JsonField<Double>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Rollover up to a fixed amount of the original credit grant amount. */
    fun type(): Type = type.getRequired("type")

    /** The maximum amount to rollover. */
    fun value(): Double = value.getRequired("value")

    /** Rollover up to a fixed amount of the original credit grant amount. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** The maximum amount to rollover. */
    @JsonProperty("value") @ExcludeMissing fun _value() = value

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RolloverAmountMaxAmount = apply {
        if (!validated) {
            type()
            value()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var type: JsonField<Type> = JsonMissing.of()
        private var value: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rolloverAmountMaxAmount: RolloverAmountMaxAmount) = apply {
            this.type = rolloverAmountMaxAmount.type
            this.value = rolloverAmountMaxAmount.value
            additionalProperties(rolloverAmountMaxAmount.additionalProperties)
        }

        /** Rollover up to a fixed amount of the original credit grant amount. */
        fun type(type: Type) = type(JsonField.of(type))

        /** Rollover up to a fixed amount of the original credit grant amount. */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The maximum amount to rollover. */
        fun value(value: Double) = value(JsonField.of(value))

        /** The maximum amount to rollover. */
        @JsonProperty("value")
        @ExcludeMissing
        fun value(value: JsonField<Double>) = apply { this.value = value }

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

        fun build(): RolloverAmountMaxAmount =
            RolloverAmountMaxAmount(
                type,
                value,
                additionalProperties.toImmutable(),
            )
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val MAX_AMOUNT = of("MAX_AMOUNT")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            MAX_AMOUNT,
        }

        enum class Value {
            MAX_AMOUNT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MAX_AMOUNT -> Value.MAX_AMOUNT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MAX_AMOUNT -> Known.MAX_AMOUNT
                else -> throw MetronomeInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RolloverAmountMaxAmount && type == other.type && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RolloverAmountMaxAmount{type=$type, value=$value, additionalProperties=$additionalProperties}"
}
