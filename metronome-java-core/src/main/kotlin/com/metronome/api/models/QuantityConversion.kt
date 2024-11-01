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

/**
 * Optional. Only valid for USAGE products. If provided, the quantity will be converted using the
 * provided conversion factor and operation. For example, if the operation is "multiply" and the
 * conversion factor is 100, then the quantity will be multiplied by 100. This can be used in cases
 * where data is sent in one unit and priced in another. For example, data could be sent in MB and
 * priced in GB. In this case, the conversion factor would be 1024 and the operation would be
 * "divide".
 */
@JsonDeserialize(builder = QuantityConversion.Builder::class)
@NoAutoDetect
class QuantityConversion
private constructor(
    private val name: JsonField<String>,
    private val conversionFactor: JsonField<Double>,
    private val operation: JsonField<Operation>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Optional name for this conversion. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** The factor to multiply or divide the quantity by. */
    fun conversionFactor(): Double = conversionFactor.getRequired("conversion_factor")

    /** The operation to perform on the quantity */
    fun operation(): Operation = operation.getRequired("operation")

    /** Optional name for this conversion. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** The factor to multiply or divide the quantity by. */
    @JsonProperty("conversion_factor") @ExcludeMissing fun _conversionFactor() = conversionFactor

    /** The operation to perform on the quantity */
    @JsonProperty("operation") @ExcludeMissing fun _operation() = operation

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): QuantityConversion = apply {
        if (!validated) {
            name()
            conversionFactor()
            operation()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var conversionFactor: JsonField<Double> = JsonMissing.of()
        private var operation: JsonField<Operation> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(quantityConversion: QuantityConversion) = apply {
            this.name = quantityConversion.name
            this.conversionFactor = quantityConversion.conversionFactor
            this.operation = quantityConversion.operation
            additionalProperties(quantityConversion.additionalProperties)
        }

        /** Optional name for this conversion. */
        fun name(name: String) = name(JsonField.of(name))

        /** Optional name for this conversion. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The factor to multiply or divide the quantity by. */
        fun conversionFactor(conversionFactor: Double) =
            conversionFactor(JsonField.of(conversionFactor))

        /** The factor to multiply or divide the quantity by. */
        @JsonProperty("conversion_factor")
        @ExcludeMissing
        fun conversionFactor(conversionFactor: JsonField<Double>) = apply {
            this.conversionFactor = conversionFactor
        }

        /** The operation to perform on the quantity */
        fun operation(operation: Operation) = operation(JsonField.of(operation))

        /** The operation to perform on the quantity */
        @JsonProperty("operation")
        @ExcludeMissing
        fun operation(operation: JsonField<Operation>) = apply { this.operation = operation }

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

        fun build(): QuantityConversion =
            QuantityConversion(
                name,
                conversionFactor,
                operation,
                additionalProperties.toImmutable(),
            )
    }

    class Operation
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Operation && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val MULTIPLY = Operation(JsonField.of("MULTIPLY"))

            @JvmField val DIVIDE = Operation(JsonField.of("DIVIDE"))

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is QuantityConversion && this.name == other.name && this.conversionFactor == other.conversionFactor && this.operation == other.operation && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(name, conversionFactor, operation, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "QuantityConversion{name=$name, conversionFactor=$conversionFactor, operation=$operation, additionalProperties=$additionalProperties}"
}
