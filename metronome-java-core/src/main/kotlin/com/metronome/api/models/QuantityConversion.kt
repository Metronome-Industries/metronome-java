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

/**
 * Optional. Only valid for USAGE products. If provided, the quantity will be converted using the
 * provided conversion factor and operation. For example, if the operation is "multiply" and the
 * conversion factor is 100, then the quantity will be multiplied by 100. This can be used in cases
 * where data is sent in one unit and priced in another. For example, data could be sent in MB and
 * priced in GB. In this case, the conversion factor would be 1024 and the operation would be
 * "divide".
 */
@NoAutoDetect
class QuantityConversion
@JsonCreator
private constructor(
    @JsonProperty("conversion_factor")
    @ExcludeMissing
    private val conversionFactor: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("operation")
    @ExcludeMissing
    private val operation: JsonField<Operation> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The factor to multiply or divide the quantity by. */
    fun conversionFactor(): Double = conversionFactor.getRequired("conversion_factor")

    /** The operation to perform on the quantity */
    fun operation(): Operation = operation.getRequired("operation")

    /** Optional name for this conversion. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** The factor to multiply or divide the quantity by. */
    @JsonProperty("conversion_factor")
    @ExcludeMissing
    fun _conversionFactor(): JsonField<Double> = conversionFactor

    /** The operation to perform on the quantity */
    @JsonProperty("operation") @ExcludeMissing fun _operation(): JsonField<Operation> = operation

    /** Optional name for this conversion. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): QuantityConversion = apply {
        if (validated) {
            return@apply
        }

        conversionFactor()
        operation()
        name()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var conversionFactor: JsonField<Double>? = null
        private var operation: JsonField<Operation>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(quantityConversion: QuantityConversion) = apply {
            conversionFactor = quantityConversion.conversionFactor
            operation = quantityConversion.operation
            name = quantityConversion.name
            additionalProperties = quantityConversion.additionalProperties.toMutableMap()
        }

        /** The factor to multiply or divide the quantity by. */
        fun conversionFactor(conversionFactor: Double) =
            conversionFactor(JsonField.of(conversionFactor))

        /** The factor to multiply or divide the quantity by. */
        fun conversionFactor(conversionFactor: JsonField<Double>) = apply {
            this.conversionFactor = conversionFactor
        }

        /** The operation to perform on the quantity */
        fun operation(operation: Operation) = operation(JsonField.of(operation))

        /** The operation to perform on the quantity */
        fun operation(operation: JsonField<Operation>) = apply { this.operation = operation }

        /** Optional name for this conversion. */
        fun name(name: String) = name(JsonField.of(name))

        /** Optional name for this conversion. */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun build(): QuantityConversion =
            QuantityConversion(
                checkRequired("conversionFactor", conversionFactor),
                checkRequired("operation", operation),
                name,
                additionalProperties.toImmutable(),
            )
    }

    /** The operation to perform on the quantity */
    class Operation
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val MULTIPLY = of("MULTIPLY")

            @JvmField val DIVIDE = of("DIVIDE")

            @JvmStatic fun of(value: String) = Operation(JsonField.of(value))
        }

        enum class Known {
            MULTIPLY,
            DIVIDE,
        }

        enum class Value {
            MULTIPLY,
            DIVIDE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MULTIPLY -> Value.MULTIPLY
                DIVIDE -> Value.DIVIDE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MULTIPLY -> Known.MULTIPLY
                DIVIDE -> Known.DIVIDE
                else -> throw MetronomeInvalidDataException("Unknown Operation: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Operation && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is QuantityConversion && conversionFactor == other.conversionFactor && operation == other.operation && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(conversionFactor, operation, name, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QuantityConversion{conversionFactor=$conversionFactor, operation=$operation, name=$name, additionalProperties=$additionalProperties}"
}
