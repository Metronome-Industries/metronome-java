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

@NoAutoDetect
class PlanListChargesResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("charge_type")
    @ExcludeMissing
    private val chargeType: JsonField<ChargeType> = JsonMissing.of(),
    @JsonProperty("credit_type")
    @ExcludeMissing
    private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("prices")
    @ExcludeMissing
    private val prices: JsonField<List<Price>> = JsonMissing.of(),
    @JsonProperty("product_id")
    @ExcludeMissing
    private val productId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("product_name")
    @ExcludeMissing
    private val productName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("start_period")
    @ExcludeMissing
    private val startPeriod: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("tier_reset_frequency")
    @ExcludeMissing
    private val tierResetFrequency: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("unit_conversion")
    @ExcludeMissing
    private val unitConversion: JsonField<UnitConversion> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun chargeType(): ChargeType = chargeType.getRequired("charge_type")

    fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

    fun customFields(): CustomFields = customFields.getRequired("custom_fields")

    fun name(): String = name.getRequired("name")

    fun prices(): List<Price> = prices.getRequired("prices")

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

    /** Specifies how quantities for usage based charges will be converted. */
    fun unitConversion(): Optional<UnitConversion> =
        Optional.ofNullable(unitConversion.getNullable("unit_conversion"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("charge_type")
    @ExcludeMissing
    fun _chargeType(): JsonField<ChargeType> = chargeType

    @JsonProperty("credit_type")
    @ExcludeMissing
    fun _creditType(): JsonField<CreditTypeData> = creditType

    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("prices") @ExcludeMissing fun _prices(): JsonField<List<Price>> = prices

    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    @JsonProperty("product_name")
    @ExcludeMissing
    fun _productName(): JsonField<String> = productName

    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

    /** Used in price ramps. Indicates how many billing periods pass before the charge applies. */
    @JsonProperty("start_period")
    @ExcludeMissing
    fun _startPeriod(): JsonField<Double> = startPeriod

    /**
     * Used in pricing tiers. Indicates how often the tier resets. Default is 1 - the tier count
     * resets every billing period.
     */
    @JsonProperty("tier_reset_frequency")
    @ExcludeMissing
    fun _tierResetFrequency(): JsonField<Double> = tierResetFrequency

    /** Specifies how quantities for usage based charges will be converted. */
    @JsonProperty("unit_conversion")
    @ExcludeMissing
    fun _unitConversion(): JsonField<UnitConversion> = unitConversion

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PlanListChargesResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        chargeType()
        creditType().validate()
        customFields().validate()
        name()
        prices().forEach { it.validate() }
        productId()
        productName()
        quantity()
        startPeriod()
        tierResetFrequency()
        unitConversion().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var chargeType: JsonField<ChargeType>? = null
        private var creditType: JsonField<CreditTypeData>? = null
        private var customFields: JsonField<CustomFields>? = null
        private var name: JsonField<String>? = null
        private var prices: JsonField<MutableList<Price>>? = null
        private var productId: JsonField<String>? = null
        private var productName: JsonField<String>? = null
        private var quantity: JsonField<Double> = JsonMissing.of()
        private var startPeriod: JsonField<Double> = JsonMissing.of()
        private var tierResetFrequency: JsonField<Double> = JsonMissing.of()
        private var unitConversion: JsonField<UnitConversion> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planListChargesResponse: PlanListChargesResponse) = apply {
            id = planListChargesResponse.id
            chargeType = planListChargesResponse.chargeType
            creditType = planListChargesResponse.creditType
            customFields = planListChargesResponse.customFields
            name = planListChargesResponse.name
            prices = planListChargesResponse.prices.map { it.toMutableList() }
            productId = planListChargesResponse.productId
            productName = planListChargesResponse.productName
            quantity = planListChargesResponse.quantity
            startPeriod = planListChargesResponse.startPeriod
            tierResetFrequency = planListChargesResponse.tierResetFrequency
            unitConversion = planListChargesResponse.unitConversion
            additionalProperties = planListChargesResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun chargeType(chargeType: ChargeType) = chargeType(JsonField.of(chargeType))

        fun chargeType(chargeType: JsonField<ChargeType>) = apply { this.chargeType = chargeType }

        fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

        fun creditType(creditType: JsonField<CreditTypeData>) = apply {
            this.creditType = creditType
        }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun prices(prices: List<Price>) = prices(JsonField.of(prices))

        fun prices(prices: JsonField<List<Price>>) = apply {
            this.prices = prices.map { it.toMutableList() }
        }

        fun addPrice(price: Price) = apply {
            prices =
                (prices ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(price)
                }
        }

        fun productId(productId: String) = productId(JsonField.of(productId))

        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        fun productName(productName: String) = productName(JsonField.of(productName))

        fun productName(productName: JsonField<String>) = apply { this.productName = productName }

        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        fun startPeriod(startPeriod: Double) = startPeriod(JsonField.of(startPeriod))

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
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
        fun tierResetFrequency(tierResetFrequency: JsonField<Double>) = apply {
            this.tierResetFrequency = tierResetFrequency
        }

        /** Specifies how quantities for usage based charges will be converted. */
        fun unitConversion(unitConversion: UnitConversion) =
            unitConversion(JsonField.of(unitConversion))

        /** Specifies how quantities for usage based charges will be converted. */
        fun unitConversion(unitConversion: JsonField<UnitConversion>) = apply {
            this.unitConversion = unitConversion
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

        fun build(): PlanListChargesResponse =
            PlanListChargesResponse(
                checkRequired("id", id),
                checkRequired("chargeType", chargeType),
                checkRequired("creditType", creditType),
                checkRequired("customFields", customFields),
                checkRequired("name", name),
                checkRequired("prices", prices).map { it.toImmutable() },
                checkRequired("productId", productId),
                checkRequired("productName", productName),
                quantity,
                startPeriod,
                tierResetFrequency,
                unitConversion,
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
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties = customFields.additionalProperties.toMutableMap()
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

    @NoAutoDetect
    class Price
    @JsonCreator
    private constructor(
        @JsonProperty("tier")
        @ExcludeMissing
        private val tier: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("collection_interval")
        @ExcludeMissing
        private val collectionInterval: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("collection_schedule")
        @ExcludeMissing
        private val collectionSchedule: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Used in pricing tiers. Indicates at what metric value the price applies. */
        fun tier(): Double = tier.getRequired("tier")

        fun value(): Double = value.getRequired("value")

        fun collectionInterval(): Optional<Double> =
            Optional.ofNullable(collectionInterval.getNullable("collection_interval"))

        fun collectionSchedule(): Optional<String> =
            Optional.ofNullable(collectionSchedule.getNullable("collection_schedule"))

        fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

        /** Used in pricing tiers. Indicates at what metric value the price applies. */
        @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<Double> = tier

        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

        @JsonProperty("collection_interval")
        @ExcludeMissing
        fun _collectionInterval(): JsonField<Double> = collectionInterval

        @JsonProperty("collection_schedule")
        @ExcludeMissing
        fun _collectionSchedule(): JsonField<String> = collectionSchedule

        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Price = apply {
            if (validated) {
                return@apply
            }

            tier()
            value()
            collectionInterval()
            collectionSchedule()
            quantity()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var tier: JsonField<Double>? = null
            private var value: JsonField<Double>? = null
            private var collectionInterval: JsonField<Double> = JsonMissing.of()
            private var collectionSchedule: JsonField<String> = JsonMissing.of()
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(price: Price) = apply {
                tier = price.tier
                value = price.value
                collectionInterval = price.collectionInterval
                collectionSchedule = price.collectionSchedule
                quantity = price.quantity
                additionalProperties = price.additionalProperties.toMutableMap()
            }

            /** Used in pricing tiers. Indicates at what metric value the price applies. */
            fun tier(tier: Double) = tier(JsonField.of(tier))

            /** Used in pricing tiers. Indicates at what metric value the price applies. */
            fun tier(tier: JsonField<Double>) = apply { this.tier = tier }

            fun value(value: Double) = value(JsonField.of(value))

            fun value(value: JsonField<Double>) = apply { this.value = value }

            fun collectionInterval(collectionInterval: Double) =
                collectionInterval(JsonField.of(collectionInterval))

            fun collectionInterval(collectionInterval: JsonField<Double>) = apply {
                this.collectionInterval = collectionInterval
            }

            fun collectionSchedule(collectionSchedule: String) =
                collectionSchedule(JsonField.of(collectionSchedule))

            fun collectionSchedule(collectionSchedule: JsonField<String>) = apply {
                this.collectionSchedule = collectionSchedule
            }

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

            fun build(): Price =
                Price(
                    checkRequired("tier", tier),
                    checkRequired("value", value),
                    collectionInterval,
                    collectionSchedule,
                    quantity,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Price && tier == other.tier && value == other.value && collectionInterval == other.collectionInterval && collectionSchedule == other.collectionSchedule && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(tier, value, collectionInterval, collectionSchedule, quantity, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Price{tier=$tier, value=$value, collectionInterval=$collectionInterval, collectionSchedule=$collectionSchedule, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    /** Specifies how quantities for usage based charges will be converted. */
    @NoAutoDetect
    class UnitConversion
    @JsonCreator
    private constructor(
        @JsonProperty("division_factor")
        @ExcludeMissing
        private val divisionFactor: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rounding_behavior")
        @ExcludeMissing
        private val roundingBehavior: JsonField<RoundingBehavior> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The conversion factor */
        fun divisionFactor(): Double = divisionFactor.getRequired("division_factor")

        /**
         * Whether usage should be rounded down or up to the nearest whole number. If null, quantity
         * will be rounded to 20 decimal places.
         */
        fun roundingBehavior(): Optional<RoundingBehavior> =
            Optional.ofNullable(roundingBehavior.getNullable("rounding_behavior"))

        /** The conversion factor */
        @JsonProperty("division_factor")
        @ExcludeMissing
        fun _divisionFactor(): JsonField<Double> = divisionFactor

        /**
         * Whether usage should be rounded down or up to the nearest whole number. If null, quantity
         * will be rounded to 20 decimal places.
         */
        @JsonProperty("rounding_behavior")
        @ExcludeMissing
        fun _roundingBehavior(): JsonField<RoundingBehavior> = roundingBehavior

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): UnitConversion = apply {
            if (validated) {
                return@apply
            }

            divisionFactor()
            roundingBehavior()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var divisionFactor: JsonField<Double>? = null
            private var roundingBehavior: JsonField<RoundingBehavior> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unitConversion: UnitConversion) = apply {
                divisionFactor = unitConversion.divisionFactor
                roundingBehavior = unitConversion.roundingBehavior
                additionalProperties = unitConversion.additionalProperties.toMutableMap()
            }

            /** The conversion factor */
            fun divisionFactor(divisionFactor: Double) =
                divisionFactor(JsonField.of(divisionFactor))

            /** The conversion factor */
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
            fun roundingBehavior(roundingBehavior: JsonField<RoundingBehavior>) = apply {
                this.roundingBehavior = roundingBehavior
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

            fun build(): UnitConversion =
                UnitConversion(
                    checkRequired("divisionFactor", divisionFactor),
                    roundingBehavior,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Whether usage should be rounded down or up to the nearest whole number. If null, quantity
         * will be rounded to 20 decimal places.
         */
        class RoundingBehavior
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val FLOOR = of("floor")

                @JvmField val CEILING = of("ceiling")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RoundingBehavior && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
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

        return /* spotless:off */ other is PlanListChargesResponse && id == other.id && chargeType == other.chargeType && creditType == other.creditType && customFields == other.customFields && name == other.name && prices == other.prices && productId == other.productId && productName == other.productName && quantity == other.quantity && startPeriod == other.startPeriod && tierResetFrequency == other.tierResetFrequency && unitConversion == other.unitConversion && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, chargeType, creditType, customFields, name, prices, productId, productName, quantity, startPeriod, tierResetFrequency, unitConversion, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanListChargesResponse{id=$id, chargeType=$chargeType, creditType=$creditType, customFields=$customFields, name=$name, prices=$prices, productId=$productId, productName=$productName, quantity=$quantity, startPeriod=$startPeriod, tierResetFrequency=$tierResetFrequency, unitConversion=$unitConversion, additionalProperties=$additionalProperties}"
}
