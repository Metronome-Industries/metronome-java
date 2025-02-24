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

/**
 * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using the
 * provided rounding method and decimal places. For example, if the method is "round up" and the
 * decimal places is 0, then the quantity will be rounded up to the nearest integer.
 */
@NoAutoDetect
class QuantityRounding
@JsonCreator
private constructor(
    @JsonProperty("decimal_places")
    @ExcludeMissing
    private val decimalPlaces: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("rounding_method")
    @ExcludeMissing
    private val roundingMethod: JsonField<RoundingMethod> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun decimalPlaces(): Double = decimalPlaces.getRequired("decimal_places")

    fun roundingMethod(): RoundingMethod = roundingMethod.getRequired("rounding_method")

    @JsonProperty("decimal_places")
    @ExcludeMissing
    fun _decimalPlaces(): JsonField<Double> = decimalPlaces

    @JsonProperty("rounding_method")
    @ExcludeMissing
    fun _roundingMethod(): JsonField<RoundingMethod> = roundingMethod

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): QuantityRounding = apply {
        if (validated) {
            return@apply
        }

        decimalPlaces()
        roundingMethod()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QuantityRounding]. */
    class Builder internal constructor() {

        private var decimalPlaces: JsonField<Double>? = null
        private var roundingMethod: JsonField<RoundingMethod>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(quantityRounding: QuantityRounding) = apply {
            decimalPlaces = quantityRounding.decimalPlaces
            roundingMethod = quantityRounding.roundingMethod
            additionalProperties = quantityRounding.additionalProperties.toMutableMap()
        }

        fun decimalPlaces(decimalPlaces: Double) = decimalPlaces(JsonField.of(decimalPlaces))

        fun decimalPlaces(decimalPlaces: JsonField<Double>) = apply {
            this.decimalPlaces = decimalPlaces
        }

        fun roundingMethod(roundingMethod: RoundingMethod) =
            roundingMethod(JsonField.of(roundingMethod))

        fun roundingMethod(roundingMethod: JsonField<RoundingMethod>) = apply {
            this.roundingMethod = roundingMethod
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

        fun build(): QuantityRounding =
            QuantityRounding(
                checkRequired("decimalPlaces", decimalPlaces),
                checkRequired("roundingMethod", roundingMethod),
                additionalProperties.toImmutable(),
            )
    }

    class RoundingMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ROUND_UP = of("ROUND_UP")

            @JvmField val ROUND_DOWN = of("ROUND_DOWN")

            @JvmField val ROUND_HALF_UP = of("ROUND_HALF_UP")

            @JvmStatic fun of(value: String) = RoundingMethod(JsonField.of(value))
        }

        /** An enum containing [RoundingMethod]'s known values. */
        enum class Known {
            ROUND_UP,
            ROUND_DOWN,
            ROUND_HALF_UP,
        }

        /**
         * An enum containing [RoundingMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RoundingMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ROUND_UP,
            ROUND_DOWN,
            ROUND_HALF_UP,
            /**
             * An enum member indicating that [RoundingMethod] was instantiated with an unknown
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
                ROUND_UP -> Value.ROUND_UP
                ROUND_DOWN -> Value.ROUND_DOWN
                ROUND_HALF_UP -> Value.ROUND_HALF_UP
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
                ROUND_UP -> Known.ROUND_UP
                ROUND_DOWN -> Known.ROUND_DOWN
                ROUND_HALF_UP -> Known.ROUND_HALF_UP
                else -> throw MetronomeInvalidDataException("Unknown RoundingMethod: $value")
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

            return /* spotless:off */ other is RoundingMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is QuantityRounding && decimalPlaces == other.decimalPlaces && roundingMethod == other.roundingMethod && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(decimalPlaces, roundingMethod, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QuantityRounding{decimalPlaces=$decimalPlaces, roundingMethod=$roundingMethod, additionalProperties=$additionalProperties}"
}
