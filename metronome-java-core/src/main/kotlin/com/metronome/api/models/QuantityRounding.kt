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

/**
 * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using the
 * provided rounding method and decimal places. For example, if the method is "round up" and the
 * decimal places is 0, then the quantity will be rounded up to the nearest integer.
 */
@JsonDeserialize(builder = QuantityRounding.Builder::class)
@NoAutoDetect
class QuantityRounding
private constructor(
    private val roundingMethod: JsonField<RoundingMethod>,
    private val decimalPlaces: JsonField<Double>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun roundingMethod(): RoundingMethod = roundingMethod.getRequired("rounding_method")

    fun decimalPlaces(): Double = decimalPlaces.getRequired("decimal_places")

    @JsonProperty("rounding_method") @ExcludeMissing fun _roundingMethod() = roundingMethod

    @JsonProperty("decimal_places") @ExcludeMissing fun _decimalPlaces() = decimalPlaces

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): QuantityRounding = apply {
        if (!validated) {
            roundingMethod()
            decimalPlaces()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var roundingMethod: JsonField<RoundingMethod> = JsonMissing.of()
        private var decimalPlaces: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(quantityRounding: QuantityRounding) = apply {
            this.roundingMethod = quantityRounding.roundingMethod
            this.decimalPlaces = quantityRounding.decimalPlaces
            additionalProperties(quantityRounding.additionalProperties)
        }

        fun roundingMethod(roundingMethod: RoundingMethod) =
            roundingMethod(JsonField.of(roundingMethod))

        @JsonProperty("rounding_method")
        @ExcludeMissing
        fun roundingMethod(roundingMethod: JsonField<RoundingMethod>) = apply {
            this.roundingMethod = roundingMethod
        }

        fun decimalPlaces(decimalPlaces: Double) = decimalPlaces(JsonField.of(decimalPlaces))

        @JsonProperty("decimal_places")
        @ExcludeMissing
        fun decimalPlaces(decimalPlaces: JsonField<Double>) = apply {
            this.decimalPlaces = decimalPlaces
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

        fun build(): QuantityRounding =
            QuantityRounding(
                roundingMethod,
                decimalPlaces,
                additionalProperties.toImmutable(),
            )
    }

    class RoundingMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RoundingMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ROUND_UP = of("ROUND_UP")

            @JvmField val ROUND_DOWN = of("ROUND_DOWN")

            @JvmField val ROUND_HALF_UP = of("ROUND_HALF_UP")

            @JvmStatic fun of(value: String) = RoundingMethod(JsonField.of(value))
        }

        enum class Known {
            ROUND_UP,
            ROUND_DOWN,
            ROUND_HALF_UP,
        }

        enum class Value {
            ROUND_UP,
            ROUND_DOWN,
            ROUND_HALF_UP,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ROUND_UP -> Value.ROUND_UP
                ROUND_DOWN -> Value.ROUND_DOWN
                ROUND_HALF_UP -> Value.ROUND_HALF_UP
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ROUND_UP -> Known.ROUND_UP
                ROUND_DOWN -> Known.ROUND_DOWN
                ROUND_HALF_UP -> Known.ROUND_HALF_UP
                else -> throw MetronomeInvalidDataException("Unknown RoundingMethod: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is QuantityRounding && roundingMethod == other.roundingMethod && decimalPlaces == other.decimalPlaces && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(roundingMethod, decimalPlaces, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QuantityRounding{roundingMethod=$roundingMethod, decimalPlaces=$decimalPlaces, additionalProperties=$additionalProperties}"
}
