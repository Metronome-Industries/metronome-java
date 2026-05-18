// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.products

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.checkRequired
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using the
 * provided rounding method and decimal places. For example, if the method is "round up" and the
 * decimal places is 0, then the quantity will be rounded up to the nearest integer.
 */
class QuantityRounding
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val decimalPlaces: JsonField<Double>,
    private val roundingMethod: JsonField<RoundingMethod>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("decimal_places")
        @ExcludeMissing
        decimalPlaces: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rounding_method")
        @ExcludeMissing
        roundingMethod: JsonField<RoundingMethod> = JsonMissing.of(),
    ) : this(decimalPlaces, roundingMethod, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun decimalPlaces(): Double = decimalPlaces.getRequired("decimal_places")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun roundingMethod(): RoundingMethod = roundingMethod.getRequired("rounding_method")

    /**
     * Returns the raw JSON value of [decimalPlaces].
     *
     * Unlike [decimalPlaces], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decimal_places")
    @ExcludeMissing
    fun _decimalPlaces(): JsonField<Double> = decimalPlaces

    /**
     * Returns the raw JSON value of [roundingMethod].
     *
     * Unlike [roundingMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rounding_method")
    @ExcludeMissing
    fun _roundingMethod(): JsonField<RoundingMethod> = roundingMethod

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [QuantityRounding].
         *
         * The following fields are required:
         * ```java
         * .decimalPlaces()
         * .roundingMethod()
         * ```
         */
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

        /**
         * Sets [Builder.decimalPlaces] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decimalPlaces] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun decimalPlaces(decimalPlaces: JsonField<Double>) = apply {
            this.decimalPlaces = decimalPlaces
        }

        fun roundingMethod(roundingMethod: RoundingMethod) =
            roundingMethod(JsonField.of(roundingMethod))

        /**
         * Sets [Builder.roundingMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roundingMethod] with a well-typed [RoundingMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [QuantityRounding].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .decimalPlaces()
         * .roundingMethod()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QuantityRounding =
            QuantityRounding(
                checkRequired("decimalPlaces", decimalPlaces),
                checkRequired("roundingMethod", roundingMethod),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): QuantityRounding = apply {
        if (validated) {
            return@apply
        }

        decimalPlaces()
        roundingMethod().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: MetronomeInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (decimalPlaces.asKnown().isPresent) 1 else 0) +
            (roundingMethod.asKnown().getOrNull()?.validity() ?: 0)

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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): RoundingMethod = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RoundingMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuantityRounding &&
            decimalPlaces == other.decimalPlaces &&
            roundingMethod == other.roundingMethod &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(decimalPlaces, roundingMethod, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QuantityRounding{decimalPlaces=$decimalPlaces, roundingMethod=$roundingMethod, additionalProperties=$additionalProperties}"
}
