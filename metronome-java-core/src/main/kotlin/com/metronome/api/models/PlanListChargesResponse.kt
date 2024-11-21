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

@JsonDeserialize(builder = PlanListChargesResponse.Builder::class)
@NoAutoDetect
class PlanListChargesResponse
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val chargeType: JsonField<ChargeType>,
    private val productId: JsonField<String>,
    private val productName: JsonField<String>,
    private val quantity: JsonField<Double>,
    private val startPeriod: JsonField<Double>,
    private val tierResetFrequency: JsonField<Double>,
    private val creditType: JsonField<CreditTypeData>,
    private val unitConversion: JsonField<UnitConversion>,
    private val prices: JsonField<List<Price>>,
    private val customFields: JsonField<CustomFields>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): String = id.getRequired("id")

    fun name(): String = name.getRequired("name")

    fun chargeType(): ChargeType = chargeType.getRequired("charge_type")

    fun productId(): String = productId.getRequired("product_id")

    fun productName(): String = productName.getRequired("product_name")

    fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

    /** Used in price ramps. Indicates how many billing periods pass before the charge applies. */
    fun startPeriod(): Optional<Double> =
        Optional.ofNullable(startPeriod.getNullable("start_period"))

    /**
     * Used in pricing tiers. Indicates how often the tier resets. Default is 1 - the tier count
     * resets every billing period.
     */
    fun tierResetFrequency(): Optional<Double> =
        Optional.ofNullable(tierResetFrequency.getNullable("tier_reset_frequency"))

    fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

    /** Specifies how quantities for usage based charges will be converted. */
    fun unitConversion(): Optional<UnitConversion> =
        Optional.ofNullable(unitConversion.getNullable("unit_conversion"))

    fun prices(): List<Price> = prices.getRequired("prices")

    fun customFields(): CustomFields = customFields.getRequired("custom_fields")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("charge_type") @ExcludeMissing fun _chargeType() = chargeType

    @JsonProperty("product_id") @ExcludeMissing fun _productId() = productId

    @JsonProperty("product_name") @ExcludeMissing fun _productName() = productName

    @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

    /** Used in price ramps. Indicates how many billing periods pass before the charge applies. */
    @JsonProperty("start_period") @ExcludeMissing fun _startPeriod() = startPeriod

    /**
     * Used in pricing tiers. Indicates how often the tier resets. Default is 1 - the tier count
     * resets every billing period.
     */
    @JsonProperty("tier_reset_frequency")
    @ExcludeMissing
    fun _tierResetFrequency() = tierResetFrequency

    @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

    /** Specifies how quantities for usage based charges will be converted. */
    @JsonProperty("unit_conversion") @ExcludeMissing fun _unitConversion() = unitConversion

    @JsonProperty("prices") @ExcludeMissing fun _prices() = prices

    @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PlanListChargesResponse = apply {
        if (!validated) {
            id()
            name()
            chargeType()
            productId()
            productName()
            quantity()
            startPeriod()
            tierResetFrequency()
            creditType().validate()
            unitConversion().map { it.validate() }
            prices().forEach { it.validate() }
            customFields().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var chargeType: JsonField<ChargeType> = JsonMissing.of()
        private var productId: JsonField<String> = JsonMissing.of()
        private var productName: JsonField<String> = JsonMissing.of()
        private var quantity: JsonField<Double> = JsonMissing.of()
        private var startPeriod: JsonField<Double> = JsonMissing.of()
        private var tierResetFrequency: JsonField<Double> = JsonMissing.of()
        private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
        private var unitConversion: JsonField<UnitConversion> = JsonMissing.of()
        private var prices: JsonField<List<Price>> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planListChargesResponse: PlanListChargesResponse) = apply {
            this.id = planListChargesResponse.id
            this.name = planListChargesResponse.name
            this.chargeType = planListChargesResponse.chargeType
            this.productId = planListChargesResponse.productId
            this.productName = planListChargesResponse.productName
            this.quantity = planListChargesResponse.quantity
            this.startPeriod = planListChargesResponse.startPeriod
            this.tierResetFrequency = planListChargesResponse.tierResetFrequency
            this.creditType = planListChargesResponse.creditType
            this.unitConversion = planListChargesResponse.unitConversion
            this.prices = planListChargesResponse.prices
            this.customFields = planListChargesResponse.customFields
            additionalProperties(planListChargesResponse.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun chargeType(chargeType: ChargeType) = chargeType(JsonField.of(chargeType))

        @JsonProperty("charge_type")
        @ExcludeMissing
        fun chargeType(chargeType: JsonField<ChargeType>) = apply { this.chargeType = chargeType }

        fun productId(productId: String) = productId(JsonField.of(productId))

        @JsonProperty("product_id")
        @ExcludeMissing
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        fun productName(productName: String) = productName(JsonField.of(productName))

        @JsonProperty("product_name")
        @ExcludeMissing
        fun productName(productName: JsonField<String>) = apply { this.productName = productName }

        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        @JsonProperty("quantity")
        @ExcludeMissing
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        fun startPeriod(startPeriod: Double) = startPeriod(JsonField.of(startPeriod))

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        @JsonProperty("start_period")
        @ExcludeMissing
        fun startPeriod(startPeriod: JsonField<Double>) = apply { this.startPeriod = startPeriod }

        /**
         * Used in pricing tiers. Indicates how often the tier resets. Default is 1 - the tier count
         * resets every billing period.
         */
        fun tierResetFrequency(tierResetFrequency: Double) =
            tierResetFrequency(JsonField.of(tierResetFrequency))

        /**
         * Used in pricing tiers. Indicates how often the tier resets. Default is 1 - the tier count
         * resets every billing period.
         */
        @JsonProperty("tier_reset_frequency")
        @ExcludeMissing
        fun tierResetFrequency(tierResetFrequency: JsonField<Double>) = apply {
            this.tierResetFrequency = tierResetFrequency
        }

        fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

        @JsonProperty("credit_type")
        @ExcludeMissing
        fun creditType(creditType: JsonField<CreditTypeData>) = apply {
            this.creditType = creditType
        }

        /** Specifies how quantities for usage based charges will be converted. */
        fun unitConversion(unitConversion: UnitConversion) =
            unitConversion(JsonField.of(unitConversion))

        /** Specifies how quantities for usage based charges will be converted. */
        @JsonProperty("unit_conversion")
        @ExcludeMissing
        fun unitConversion(unitConversion: JsonField<UnitConversion>) = apply {
            this.unitConversion = unitConversion
        }

        fun prices(prices: List<Price>) = prices(JsonField.of(prices))

        @JsonProperty("prices")
        @ExcludeMissing
        fun prices(prices: JsonField<List<Price>>) = apply { this.prices = prices }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
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

        fun build(): PlanListChargesResponse =
            PlanListChargesResponse(
                id,
                name,
                chargeType,
                productId,
                productName,
                quantity,
                startPeriod,
                tierResetFrequency,
                creditType,
                unitConversion,
                prices.map { it.toImmutable() },
                customFields,
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

            return /* spotless:off */ other is ChargeType && value == other.value /* spotless:on */
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

    @JsonDeserialize(builder = CustomFields.Builder::class)
    @NoAutoDetect
    class CustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CustomFields = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties(customFields.additionalProperties)
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

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Price.Builder::class)
    @NoAutoDetect
    class Price
    private constructor(
        private val value: JsonField<Double>,
        private val tier: JsonField<Double>,
        private val quantity: JsonField<Double>,
        private val collectionSchedule: JsonField<String>,
        private val collectionInterval: JsonField<Double>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun value(): Double = value.getRequired("value")

        /** Used in pricing tiers. Indicates at what metric value the price applies. */
        fun tier(): Double = tier.getRequired("tier")

        fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

        fun collectionSchedule(): Optional<String> =
            Optional.ofNullable(collectionSchedule.getNullable("collection_schedule"))

        fun collectionInterval(): Optional<Double> =
            Optional.ofNullable(collectionInterval.getNullable("collection_interval"))

        @JsonProperty("value") @ExcludeMissing fun _value() = value

        /** Used in pricing tiers. Indicates at what metric value the price applies. */
        @JsonProperty("tier") @ExcludeMissing fun _tier() = tier

        @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

        @JsonProperty("collection_schedule")
        @ExcludeMissing
        fun _collectionSchedule() = collectionSchedule

        @JsonProperty("collection_interval")
        @ExcludeMissing
        fun _collectionInterval() = collectionInterval

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Price = apply {
            if (!validated) {
                value()
                tier()
                quantity()
                collectionSchedule()
                collectionInterval()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var value: JsonField<Double> = JsonMissing.of()
            private var tier: JsonField<Double> = JsonMissing.of()
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var collectionSchedule: JsonField<String> = JsonMissing.of()
            private var collectionInterval: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(price: Price) = apply {
                this.value = price.value
                this.tier = price.tier
                this.quantity = price.quantity
                this.collectionSchedule = price.collectionSchedule
                this.collectionInterval = price.collectionInterval
                additionalProperties(price.additionalProperties)
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

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            @JsonProperty("quantity")
            @ExcludeMissing
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            fun collectionSchedule(collectionSchedule: String) =
                collectionSchedule(JsonField.of(collectionSchedule))

            @JsonProperty("collection_schedule")
            @ExcludeMissing
            fun collectionSchedule(collectionSchedule: JsonField<String>) = apply {
                this.collectionSchedule = collectionSchedule
            }

            fun collectionInterval(collectionInterval: Double) =
                collectionInterval(JsonField.of(collectionInterval))

            @JsonProperty("collection_interval")
            @ExcludeMissing
            fun collectionInterval(collectionInterval: JsonField<Double>) = apply {
                this.collectionInterval = collectionInterval
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

            fun build(): Price =
                Price(
                    value,
                    tier,
                    quantity,
                    collectionSchedule,
                    collectionInterval,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Price && value == other.value && tier == other.tier && quantity == other.quantity && collectionSchedule == other.collectionSchedule && collectionInterval == other.collectionInterval && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(value, tier, quantity, collectionSchedule, collectionInterval, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Price{value=$value, tier=$tier, quantity=$quantity, collectionSchedule=$collectionSchedule, collectionInterval=$collectionInterval, additionalProperties=$additionalProperties}"
    }

    /** Specifies how quantities for usage based charges will be converted. */
    @JsonDeserialize(builder = UnitConversion.Builder::class)
    @NoAutoDetect
    class UnitConversion
    private constructor(
        private val divisionFactor: JsonField<Double>,
        private val roundingBehavior: JsonField<RoundingBehavior>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The conversion factor */
        fun divisionFactor(): Double = divisionFactor.getRequired("division_factor")

        /**
         * Whether usage should be rounded down or up to the nearest whole number. If null, quantity
         * will be rounded to 20 decimal places.
         */
        fun roundingBehavior(): Optional<RoundingBehavior> =
            Optional.ofNullable(roundingBehavior.getNullable("rounding_behavior"))

        /** The conversion factor */
        @JsonProperty("division_factor") @ExcludeMissing fun _divisionFactor() = divisionFactor

        /**
         * Whether usage should be rounded down or up to the nearest whole number. If null, quantity
         * will be rounded to 20 decimal places.
         */
        @JsonProperty("rounding_behavior")
        @ExcludeMissing
        fun _roundingBehavior() = roundingBehavior

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): UnitConversion = apply {
            if (!validated) {
                divisionFactor()
                roundingBehavior()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var divisionFactor: JsonField<Double> = JsonMissing.of()
            private var roundingBehavior: JsonField<RoundingBehavior> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unitConversion: UnitConversion) = apply {
                this.divisionFactor = unitConversion.divisionFactor
                this.roundingBehavior = unitConversion.roundingBehavior
                additionalProperties(unitConversion.additionalProperties)
            }

            /** The conversion factor */
            fun divisionFactor(divisionFactor: Double) =
                divisionFactor(JsonField.of(divisionFactor))

            /** The conversion factor */
            @JsonProperty("division_factor")
            @ExcludeMissing
            fun divisionFactor(divisionFactor: JsonField<Double>) = apply {
                this.divisionFactor = divisionFactor
            }

            /**
             * Whether usage should be rounded down or up to the nearest whole number. If null,
             * quantity will be rounded to 20 decimal places.
             */
            fun roundingBehavior(roundingBehavior: RoundingBehavior) =
                roundingBehavior(JsonField.of(roundingBehavior))

            /**
             * Whether usage should be rounded down or up to the nearest whole number. If null,
             * quantity will be rounded to 20 decimal places.
             */
            @JsonProperty("rounding_behavior")
            @ExcludeMissing
            fun roundingBehavior(roundingBehavior: JsonField<RoundingBehavior>) = apply {
                this.roundingBehavior = roundingBehavior
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

            fun build(): UnitConversion =
                UnitConversion(
                    divisionFactor,
                    roundingBehavior,
                    additionalProperties.toImmutable(),
                )
        }

        class RoundingBehavior
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RoundingBehavior && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val FLOOR = RoundingBehavior(JsonField.of("floor"))

                @JvmField val CEILING = RoundingBehavior(JsonField.of("ceiling"))

                @JvmStatic fun of(value: String) = RoundingBehavior(JsonField.of(value))
            }

            enum class Known {
                FLOOR,
                CEILING,
            }

            enum class Value {
                FLOOR,
                CEILING,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    FLOOR -> Value.FLOOR
                    CEILING -> Value.CEILING
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    FLOOR -> Known.FLOOR
                    CEILING -> Known.CEILING
                    else -> throw MetronomeInvalidDataException("Unknown RoundingBehavior: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UnitConversion && divisionFactor == other.divisionFactor && roundingBehavior == other.roundingBehavior && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(divisionFactor, roundingBehavior, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnitConversion{divisionFactor=$divisionFactor, roundingBehavior=$roundingBehavior, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanListChargesResponse && id == other.id && name == other.name && chargeType == other.chargeType && productId == other.productId && productName == other.productName && quantity == other.quantity && startPeriod == other.startPeriod && tierResetFrequency == other.tierResetFrequency && creditType == other.creditType && unitConversion == other.unitConversion && prices == other.prices && customFields == other.customFields && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, chargeType, productId, productName, quantity, startPeriod, tierResetFrequency, creditType, unitConversion, prices, customFields, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanListChargesResponse{id=$id, name=$name, chargeType=$chargeType, productId=$productId, productName=$productName, quantity=$quantity, startPeriod=$startPeriod, tierResetFrequency=$tierResetFrequency, creditType=$creditType, unitConversion=$unitConversion, prices=$prices, customFields=$customFields, additionalProperties=$additionalProperties}"
}
