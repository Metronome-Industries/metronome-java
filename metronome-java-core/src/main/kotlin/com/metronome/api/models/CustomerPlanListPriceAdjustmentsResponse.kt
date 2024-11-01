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

@JsonDeserialize(builder = CustomerPlanListPriceAdjustmentsResponse.Builder::class)
@NoAutoDetect
class CustomerPlanListPriceAdjustmentsResponse
private constructor(
    private val chargeId: JsonField<String>,
    private val chargeType: JsonField<ChargeType>,
    private val startPeriod: JsonField<Double>,
    private val quantity: JsonField<Double>,
    private val prices: JsonField<List<Price>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun chargeId(): String = chargeId.getRequired("charge_id")

    fun chargeType(): ChargeType = chargeType.getRequired("charge_type")

    fun startPeriod(): Double = startPeriod.getRequired("start_period")

    fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

    fun prices(): List<Price> = prices.getRequired("prices")

    @JsonProperty("charge_id") @ExcludeMissing fun _chargeId() = chargeId

    @JsonProperty("charge_type") @ExcludeMissing fun _chargeType() = chargeType

    @JsonProperty("start_period") @ExcludeMissing fun _startPeriod() = startPeriod

    @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

    @JsonProperty("prices") @ExcludeMissing fun _prices() = prices

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CustomerPlanListPriceAdjustmentsResponse = apply {
        if (!validated) {
            chargeId()
            chargeType()
            startPeriod()
            quantity()
            prices().forEach { it.validate() }
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
        private var startPeriod: JsonField<Double> = JsonMissing.of()
        private var quantity: JsonField<Double> = JsonMissing.of()
        private var prices: JsonField<List<Price>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            customerPlanListPriceAdjustmentsResponse: CustomerPlanListPriceAdjustmentsResponse
        ) = apply {
            this.chargeId = customerPlanListPriceAdjustmentsResponse.chargeId
            this.chargeType = customerPlanListPriceAdjustmentsResponse.chargeType
            this.startPeriod = customerPlanListPriceAdjustmentsResponse.startPeriod
            this.quantity = customerPlanListPriceAdjustmentsResponse.quantity
            this.prices = customerPlanListPriceAdjustmentsResponse.prices
            additionalProperties(customerPlanListPriceAdjustmentsResponse.additionalProperties)
        }

        fun chargeId(chargeId: String) = chargeId(JsonField.of(chargeId))

        @JsonProperty("charge_id")
        @ExcludeMissing
        fun chargeId(chargeId: JsonField<String>) = apply { this.chargeId = chargeId }

        fun chargeType(chargeType: ChargeType) = chargeType(JsonField.of(chargeType))

        @JsonProperty("charge_type")
        @ExcludeMissing
        fun chargeType(chargeType: JsonField<ChargeType>) = apply { this.chargeType = chargeType }

        fun startPeriod(startPeriod: Double) = startPeriod(JsonField.of(startPeriod))

        @JsonProperty("start_period")
        @ExcludeMissing
        fun startPeriod(startPeriod: JsonField<Double>) = apply { this.startPeriod = startPeriod }

        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        @JsonProperty("quantity")
        @ExcludeMissing
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        fun prices(prices: List<Price>) = prices(JsonField.of(prices))

        @JsonProperty("prices")
        @ExcludeMissing
        fun prices(prices: JsonField<List<Price>>) = apply { this.prices = prices }

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

        fun build(): CustomerPlanListPriceAdjustmentsResponse =
            CustomerPlanListPriceAdjustmentsResponse(
                chargeId,
                chargeType,
                startPeriod,
                quantity,
                prices.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    class ChargeType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChargeType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val USAGE = ChargeType(JsonField.of("usage"))

            @JvmField val FIXED = ChargeType(JsonField.of("fixed"))

            @JvmField val COMPOSITE = ChargeType(JsonField.of("composite"))

            @JvmField val MINIMUM = ChargeType(JsonField.of("minimum"))

            @JvmField val SEAT = ChargeType(JsonField.of("seat"))

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
    }

    @JsonDeserialize(builder = Price.Builder::class)
    @NoAutoDetect
    class Price
    private constructor(
        private val adjustmentType: JsonField<AdjustmentType>,
        private val value: JsonField<Double>,
        private val tier: JsonField<Double>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Determines how the value will be applied. */
        fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

        fun value(): Optional<Double> = Optional.ofNullable(value.getNullable("value"))

        /** Used in pricing tiers. Indicates at what metric value the price applies. */
        fun tier(): Optional<Double> = Optional.ofNullable(tier.getNullable("tier"))

        /** Determines how the value will be applied. */
        @JsonProperty("adjustment_type") @ExcludeMissing fun _adjustmentType() = adjustmentType

        @JsonProperty("value") @ExcludeMissing fun _value() = value

        /** Used in pricing tiers. Indicates at what metric value the price applies. */
        @JsonProperty("tier") @ExcludeMissing fun _tier() = tier

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Price = apply {
            if (!validated) {
                adjustmentType()
                value()
                tier()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var adjustmentType: JsonField<AdjustmentType> = JsonMissing.of()
            private var value: JsonField<Double> = JsonMissing.of()
            private var tier: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(price: Price) = apply {
                this.adjustmentType = price.adjustmentType
                this.value = price.value
                this.tier = price.tier
                additionalProperties(price.additionalProperties)
            }

            /** Determines how the value will be applied. */
            fun adjustmentType(adjustmentType: AdjustmentType) =
                adjustmentType(JsonField.of(adjustmentType))

            /** Determines how the value will be applied. */
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                this.adjustmentType = adjustmentType
            }

            fun value(value: Double) = value(JsonField.of(value))

            @JsonProperty("value")
            @ExcludeMissing
            fun value(value: JsonField<Double>) = apply { this.value = value }

            /** Used in pricing tiers. Indicates at what metric value the price applies. */
            fun tier(tier: Double) = tier(JsonField.of(tier))

            /** Used in pricing tiers. Indicates at what metric value the price applies. */
            @JsonProperty("tier")
            @ExcludeMissing
            fun tier(tier: JsonField<Double>) = apply { this.tier = tier }

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

            fun build(): Price =
                Price(
                    adjustmentType,
                    value,
                    tier,
                    additionalProperties.toImmutable(),
                )
        }

        class AdjustmentType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AdjustmentType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val FIXED = AdjustmentType(JsonField.of("fixed"))

                @JvmField val QUANTITY = AdjustmentType(JsonField.of("quantity"))

                @JvmField val PERCENTAGE = AdjustmentType(JsonField.of("percentage"))

                @JvmField val OVERRIDE = AdjustmentType(JsonField.of("override"))

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
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Price && this.adjustmentType == other.adjustmentType && this.value == other.value && this.tier == other.tier && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(adjustmentType, value, tier, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Price{adjustmentType=$adjustmentType, value=$value, tier=$tier, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerPlanListPriceAdjustmentsResponse && this.chargeId == other.chargeId && this.chargeType == other.chargeType && this.startPeriod == other.startPeriod && this.quantity == other.quantity && this.prices == other.prices && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(chargeId, chargeType, startPeriod, quantity, prices, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "CustomerPlanListPriceAdjustmentsResponse{chargeId=$chargeId, chargeType=$chargeType, startPeriod=$startPeriod, quantity=$quantity, prices=$prices, additionalProperties=$additionalProperties}"
}
