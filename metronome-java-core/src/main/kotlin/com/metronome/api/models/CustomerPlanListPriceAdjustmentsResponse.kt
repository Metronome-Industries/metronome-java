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
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CustomerPlanListPriceAdjustmentsResponse
@JsonCreator
private constructor(
    @JsonProperty("charge_id")
    @ExcludeMissing
    private val chargeId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("charge_type")
    @ExcludeMissing
    private val chargeType: JsonField<ChargeType> = JsonMissing.of(),
    @JsonProperty("prices")
    @ExcludeMissing
    private val prices: JsonField<List<Price>> = JsonMissing.of(),
    @JsonProperty("start_period")
    @ExcludeMissing
    private val startPeriod: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun chargeId(): String = chargeId.getRequired("charge_id")

    fun chargeType(): ChargeType = chargeType.getRequired("charge_type")

    fun prices(): List<Price> = prices.getRequired("prices")

    fun startPeriod(): Double = startPeriod.getRequired("start_period")

    fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

    @JsonProperty("charge_id") @ExcludeMissing fun _chargeId() = chargeId

    @JsonProperty("charge_type") @ExcludeMissing fun _chargeType() = chargeType

    @JsonProperty("prices") @ExcludeMissing fun _prices() = prices

    @JsonProperty("start_period") @ExcludeMissing fun _startPeriod() = startPeriod

    @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomerPlanListPriceAdjustmentsResponse = apply {
        if (!validated) {
            chargeId()
            chargeType()
            prices().forEach { it.validate() }
            startPeriod()
            quantity()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var chargeId: JsonField<String> = JsonMissing.of()
        private var chargeType: JsonField<ChargeType> = JsonMissing.of()
        private var prices: JsonField<List<Price>> = JsonMissing.of()
        private var startPeriod: JsonField<Double> = JsonMissing.of()
        private var quantity: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            customerPlanListPriceAdjustmentsResponse: CustomerPlanListPriceAdjustmentsResponse
        ) = apply {
            chargeId = customerPlanListPriceAdjustmentsResponse.chargeId
            chargeType = customerPlanListPriceAdjustmentsResponse.chargeType
            prices = customerPlanListPriceAdjustmentsResponse.prices
            startPeriod = customerPlanListPriceAdjustmentsResponse.startPeriod
            quantity = customerPlanListPriceAdjustmentsResponse.quantity
            additionalProperties =
                customerPlanListPriceAdjustmentsResponse.additionalProperties.toMutableMap()
        }

        fun chargeId(chargeId: String) = chargeId(JsonField.of(chargeId))

        fun chargeId(chargeId: JsonField<String>) = apply { this.chargeId = chargeId }

        fun chargeType(chargeType: ChargeType) = chargeType(JsonField.of(chargeType))

        fun chargeType(chargeType: JsonField<ChargeType>) = apply { this.chargeType = chargeType }

        fun prices(prices: List<Price>) = prices(JsonField.of(prices))

        fun prices(prices: JsonField<List<Price>>) = apply { this.prices = prices }

        fun startPeriod(startPeriod: Double) = startPeriod(JsonField.of(startPeriod))

        fun startPeriod(startPeriod: JsonField<Double>) = apply { this.startPeriod = startPeriod }

        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

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

        fun build(): CustomerPlanListPriceAdjustmentsResponse =
            CustomerPlanListPriceAdjustmentsResponse(
                chargeId,
                chargeType,
                prices.map { it.toImmutable() },
                startPeriod,
                quantity,
                additionalProperties.toImmutable(),
            )
    }

    class ChargeType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val USAGE = of("usage")

            @JvmField val FIXED = of("fixed")

            @JvmField val COMPOSITE = of("composite")

            @JvmField val MINIMUM = of("minimum")

            @JvmField val SEAT = of("seat")

            @JvmStatic fun of(value: String) = ChargeType(JsonField.of(value))
        }

        enum class Known {
            USAGE,
            FIXED,
            COMPOSITE,
            MINIMUM,
            SEAT,
        }

        enum class Value {
            USAGE,
            FIXED,
            COMPOSITE,
            MINIMUM,
            SEAT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                USAGE -> Value.USAGE
                FIXED -> Value.FIXED
                COMPOSITE -> Value.COMPOSITE
                MINIMUM -> Value.MINIMUM
                SEAT -> Value.SEAT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                USAGE -> Known.USAGE
                FIXED -> Known.FIXED
                COMPOSITE -> Known.COMPOSITE
                MINIMUM -> Known.MINIMUM
                SEAT -> Known.SEAT
                else -> throw MetronomeInvalidDataException("Unknown ChargeType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChargeType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Price
    @JsonCreator
    private constructor(
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
        @JsonProperty("tier")
        @ExcludeMissing
        private val tier: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Determines how the value will be applied. */
        fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

        /** Used in pricing tiers. Indicates at what metric value the price applies. */
        fun tier(): Optional<Double> = Optional.ofNullable(tier.getNullable("tier"))

        fun value(): Optional<Double> = Optional.ofNullable(value.getNullable("value"))

        /** Determines how the value will be applied. */
        @JsonProperty("adjustment_type") @ExcludeMissing fun _adjustmentType() = adjustmentType

        /** Used in pricing tiers. Indicates at what metric value the price applies. */
        @JsonProperty("tier") @ExcludeMissing fun _tier() = tier

        @JsonProperty("value") @ExcludeMissing fun _value() = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Price = apply {
            if (!validated) {
                adjustmentType()
                tier()
                value()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var adjustmentType: JsonField<AdjustmentType> = JsonMissing.of()
            private var tier: JsonField<Double> = JsonMissing.of()
            private var value: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(price: Price) = apply {
                adjustmentType = price.adjustmentType
                tier = price.tier
                value = price.value
                additionalProperties = price.additionalProperties.toMutableMap()
            }

            /** Determines how the value will be applied. */
            fun adjustmentType(adjustmentType: AdjustmentType) =
                adjustmentType(JsonField.of(adjustmentType))

            /** Determines how the value will be applied. */
            fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                this.adjustmentType = adjustmentType
            }

            /** Used in pricing tiers. Indicates at what metric value the price applies. */
            fun tier(tier: Double) = tier(JsonField.of(tier))

            /** Used in pricing tiers. Indicates at what metric value the price applies. */
            fun tier(tier: JsonField<Double>) = apply { this.tier = tier }

            fun value(value: Double) = value(JsonField.of(value))

            fun value(value: JsonField<Double>) = apply { this.value = value }

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

            fun build(): Price =
                Price(
                    adjustmentType,
                    tier,
                    value,
                    additionalProperties.toImmutable(),
                )
        }

        class AdjustmentType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val FIXED = of("fixed")

                @JvmField val QUANTITY = of("quantity")

                @JvmField val PERCENTAGE = of("percentage")

                @JvmField val OVERRIDE = of("override")

                @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
            }

            enum class Known {
                FIXED,
                QUANTITY,
                PERCENTAGE,
                OVERRIDE,
            }

            enum class Value {
                FIXED,
                QUANTITY,
                PERCENTAGE,
                OVERRIDE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    FIXED -> Value.FIXED
                    QUANTITY -> Value.QUANTITY
                    PERCENTAGE -> Value.PERCENTAGE
                    OVERRIDE -> Value.OVERRIDE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    FIXED -> Known.FIXED
                    QUANTITY -> Known.QUANTITY
                    PERCENTAGE -> Known.PERCENTAGE
                    OVERRIDE -> Known.OVERRIDE
                    else -> throw MetronomeInvalidDataException("Unknown AdjustmentType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Price && adjustmentType == other.adjustmentType && tier == other.tier && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustmentType, tier, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Price{adjustmentType=$adjustmentType, tier=$tier, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerPlanListPriceAdjustmentsResponse && chargeId == other.chargeId && chargeType == other.chargeType && prices == other.prices && startPeriod == other.startPeriod && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(chargeId, chargeType, prices, startPeriod, quantity, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerPlanListPriceAdjustmentsResponse{chargeId=$chargeId, chargeType=$chargeType, prices=$prices, startPeriod=$startPeriod, quantity=$quantity, additionalProperties=$additionalProperties}"
}
