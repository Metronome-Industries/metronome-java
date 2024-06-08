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
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PlanListChargesResponse.Builder::class)
@NoAutoDetect
class PlanListChargesResponse
private constructor(
    private val data: JsonField<List<Data>>,
    private val nextPage: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun data(): List<Data> = data.getRequired("data")

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonProperty("next_page") @ExcludeMissing fun _nextPage() = nextPage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PlanListChargesResponse = apply {
        if (!validated) {
            data().forEach { it.validate() }
            nextPage()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanListChargesResponse &&
            this.data == other.data &&
            this.nextPage == other.nextPage &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    data,
                    nextPage,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PlanListChargesResponse{data=$data, nextPage=$nextPage, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var nextPage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planListChargesResponse: PlanListChargesResponse) = apply {
            this.data = planListChargesResponse.data
            this.nextPage = planListChargesResponse.nextPage
            additionalProperties(planListChargesResponse.additionalProperties)
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Data>>) = apply { this.data = data }

        fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

        @JsonProperty("next_page")
        @ExcludeMissing
        fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

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
                data.map { it.toUnmodifiable() },
                nextPage,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val chargeType: JsonField<ChargeType>,
        private val productId: JsonField<String>,
        private val productName: JsonField<String>,
        private val quantity: JsonField<Double>,
        private val startPeriod: JsonField<Double>,
        private val creditType: JsonField<CreditType>,
        private val unitConversion: JsonField<UnitConversion>,
        private val prices: JsonField<List<Price>>,
        private val customFields: JsonField<CustomFields>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun chargeType(): ChargeType = chargeType.getRequired("charge_type")

        fun productId(): String = productId.getRequired("product_id")

        fun productName(): String = productName.getRequired("product_name")

        fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        fun startPeriod(): Optional<Double> =
            Optional.ofNullable(startPeriod.getNullable("start_period"))

        fun creditType(): CreditType = creditType.getRequired("credit_type")

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

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        @JsonProperty("start_period") @ExcludeMissing fun _startPeriod() = startPeriod

        @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

        /** Specifies how quantities for usage based charges will be converted. */
        @JsonProperty("unit_conversion") @ExcludeMissing fun _unitConversion() = unitConversion

        @JsonProperty("prices") @ExcludeMissing fun _prices() = prices

        @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                id()
                name()
                chargeType()
                productId()
                productName()
                quantity()
                startPeriod()
                creditType().validate()
                unitConversion().map { it.validate() }
                prices().forEach { it.validate() }
                customFields().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.id == other.id &&
                this.name == other.name &&
                this.chargeType == other.chargeType &&
                this.productId == other.productId &&
                this.productName == other.productName &&
                this.quantity == other.quantity &&
                this.startPeriod == other.startPeriod &&
                this.creditType == other.creditType &&
                this.unitConversion == other.unitConversion &&
                this.prices == other.prices &&
                this.customFields == other.customFields &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        chargeType,
                        productId,
                        productName,
                        quantity,
                        startPeriod,
                        creditType,
                        unitConversion,
                        prices,
                        customFields,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Data{id=$id, name=$name, chargeType=$chargeType, productId=$productId, productName=$productName, quantity=$quantity, startPeriod=$startPeriod, creditType=$creditType, unitConversion=$unitConversion, prices=$prices, customFields=$customFields, additionalProperties=$additionalProperties}"

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
            private var creditType: JsonField<CreditType> = JsonMissing.of()
            private var unitConversion: JsonField<UnitConversion> = JsonMissing.of()
            private var prices: JsonField<List<Price>> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.id = data.id
                this.name = data.name
                this.chargeType = data.chargeType
                this.productId = data.productId
                this.productName = data.productName
                this.quantity = data.quantity
                this.startPeriod = data.startPeriod
                this.creditType = data.creditType
                this.unitConversion = data.unitConversion
                this.prices = data.prices
                this.customFields = data.customFields
                additionalProperties(data.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun chargeType(chargeType: ChargeType) = chargeType(JsonField.of(chargeType))

            @JsonProperty("charge_type")
            @ExcludeMissing
            fun chargeType(chargeType: JsonField<ChargeType>) = apply {
                this.chargeType = chargeType
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            @JsonProperty("product_id")
            @ExcludeMissing
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun productName(productName: String) = productName(JsonField.of(productName))

            @JsonProperty("product_name")
            @ExcludeMissing
            fun productName(productName: JsonField<String>) = apply {
                this.productName = productName
            }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            @JsonProperty("quantity")
            @ExcludeMissing
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /**
             * Used in price ramps. Indicates how many billing periods pass before the charge
             * applies.
             */
            fun startPeriod(startPeriod: Double) = startPeriod(JsonField.of(startPeriod))

            /**
             * Used in price ramps. Indicates how many billing periods pass before the charge
             * applies.
             */
            @JsonProperty("start_period")
            @ExcludeMissing
            fun startPeriod(startPeriod: JsonField<Double>) = apply {
                this.startPeriod = startPeriod
            }

            fun creditType(creditType: CreditType) = creditType(JsonField.of(creditType))

            @JsonProperty("credit_type")
            @ExcludeMissing
            fun creditType(creditType: JsonField<CreditType>) = apply {
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

            fun build(): Data =
                Data(
                    id,
                    name,
                    chargeType,
                    productId,
                    productName,
                    quantity,
                    startPeriod,
                    creditType,
                    unitConversion,
                    prices.map { it.toUnmodifiable() },
                    customFields,
                    additionalProperties.toUnmodifiable(),
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

                return other is ChargeType && this.value == other.value
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

        @JsonDeserialize(builder = CreditType.Builder::class)
        @NoAutoDetect
        class CreditType
        private constructor(
            private val name: JsonField<String>,
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun name(): String = name.getRequired("name")

            fun id(): String = id.getRequired("id")

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditType = apply {
                if (!validated) {
                    name()
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditType &&
                    this.name == other.name &&
                    this.id == other.id &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            name,
                            id,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditType{name=$name, id=$id, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditType: CreditType) = apply {
                    this.name = creditType.name
                    this.id = creditType.id
                    additionalProperties(creditType.additionalProperties)
                }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditType =
                    CreditType(
                        name,
                        id,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = CustomFields.Builder::class)
        @NoAutoDetect
        class CustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CustomFields = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFields &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CustomFields = CustomFields(additionalProperties.toUnmodifiable())
            }
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

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Price &&
                    this.value == other.value &&
                    this.tier == other.tier &&
                    this.quantity == other.quantity &&
                    this.collectionSchedule == other.collectionSchedule &&
                    this.collectionInterval == other.collectionInterval &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            value,
                            tier,
                            quantity,
                            collectionSchedule,
                            collectionInterval,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Price{value=$value, tier=$tier, quantity=$quantity, collectionSchedule=$collectionSchedule, collectionInterval=$collectionInterval, additionalProperties=$additionalProperties}"

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Price =
                    Price(
                        value,
                        tier,
                        quantity,
                        collectionSchedule,
                        collectionInterval,
                        additionalProperties.toUnmodifiable(),
                    )
            }
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

            private var hashCode: Int = 0

            /** The conversion factor */
            fun divisionFactor(): Double = divisionFactor.getRequired("division_factor")

            /**
             * Whether usage should be rounded down or up to the nearest whole number. If null,
             * quantity will be rounded to 20 decimal places.
             */
            fun roundingBehavior(): Optional<RoundingBehavior> =
                Optional.ofNullable(roundingBehavior.getNullable("rounding_behavior"))

            /** The conversion factor */
            @JsonProperty("division_factor") @ExcludeMissing fun _divisionFactor() = divisionFactor

            /**
             * Whether usage should be rounded down or up to the nearest whole number. If null,
             * quantity will be rounded to 20 decimal places.
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnitConversion &&
                    this.divisionFactor == other.divisionFactor &&
                    this.roundingBehavior == other.roundingBehavior &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            divisionFactor,
                            roundingBehavior,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "UnitConversion{divisionFactor=$divisionFactor, roundingBehavior=$roundingBehavior, additionalProperties=$additionalProperties}"

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): UnitConversion =
                    UnitConversion(
                        divisionFactor,
                        roundingBehavior,
                        additionalProperties.toUnmodifiable(),
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

                    return other is RoundingBehavior && this.value == other.value
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
                        else ->
                            throw MetronomeInvalidDataException("Unknown RoundingBehavior: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
    }
}
