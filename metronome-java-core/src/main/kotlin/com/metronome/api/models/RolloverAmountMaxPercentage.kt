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

@JsonDeserialize(builder = RolloverAmountMaxPercentage.Builder::class)
@NoAutoDetect
class RolloverAmountMaxPercentage
private constructor(
    private val type: JsonField<Type>,
    private val value: JsonField<Double>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    /** Rollover up to a percentage of the original credit grant amount. */
    fun type(): Type = type.getRequired("type")

    /** The maximum percentage (0-1) of the original credit grant to rollover. */
    fun value(): Double = value.getRequired("value")

    /** Rollover up to a percentage of the original credit grant amount. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** The maximum percentage (0-1) of the original credit grant to rollover. */
    @JsonProperty("value") @ExcludeMissing fun _value() = value

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RolloverAmountMaxPercentage = apply {
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
        internal fun from(rolloverAmountMaxPercentage: RolloverAmountMaxPercentage) = apply {
            type = rolloverAmountMaxPercentage.type
            value = rolloverAmountMaxPercentage.value
            additionalProperties = rolloverAmountMaxPercentage.additionalProperties.toMutableMap()
        }

        /** Rollover up to a percentage of the original credit grant amount. */
        fun type(type: Type) = type(JsonField.of(type))

        /** Rollover up to a percentage of the original credit grant amount. */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The maximum percentage (0-1) of the original credit grant to rollover. */
        fun value(value: Double) = value(JsonField.of(value))

        /** The maximum percentage (0-1) of the original credit grant to rollover. */
        @JsonProperty("value")
        @ExcludeMissing
        fun value(value: JsonField<Double>) = apply { this.value = value }

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

        fun build(): RolloverAmountMaxPercentage =
            RolloverAmountMaxPercentage(
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

        companion object {

            @JvmField val MAX_PERCENTAGE = of("MAX_PERCENTAGE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            MAX_PERCENTAGE,
        }

        enum class Value {
            MAX_PERCENTAGE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MAX_PERCENTAGE -> Value.MAX_PERCENTAGE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MAX_PERCENTAGE -> Known.MAX_PERCENTAGE
                else -> throw MetronomeInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RolloverAmountMaxPercentage && type == other.type && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RolloverAmountMaxPercentage{type=$type, value=$value, additionalProperties=$additionalProperties}"
}
