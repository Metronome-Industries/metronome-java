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

@JsonDeserialize(builder = Rate.Builder::class)
@NoAutoDetect
class Rate
private constructor(
    private val rateType: JsonField<RateType>,
    private val price: JsonField<Double>,
    private val customRate: JsonField<CustomRate>,
    private val useListPrices: JsonField<Boolean>,
    private val quantity: JsonField<Double>,
    private val isProrated: JsonField<Boolean>,
    private val tiers: JsonField<List<Tier>>,
    private val pricingGroupValues: JsonField<PricingGroupValues>,
    private val creditType: JsonField<CreditTypeData>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun rateType(): RateType = rateType.getRequired("rate_type")

    /**
     * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
     * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
     */
    fun price(): Optional<Double> = Optional.ofNullable(price.getNullable("price"))

    /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
    fun customRate(): Optional<CustomRate> =
        Optional.ofNullable(customRate.getNullable("custom_rate"))

    /**
     * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using list
     * prices rather than the standard rates for this product on the contract.
     */
    fun useListPrices(): Optional<Boolean> =
        Optional.ofNullable(useListPrices.getNullable("use_list_prices"))

    /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
    fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

    /**
     * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to true.
     */
    fun isProrated(): Optional<Boolean> = Optional.ofNullable(isProrated.getNullable("is_prorated"))

    /** Only set for TIERED rate_type. */
    fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers.getNullable("tiers"))

    /** if pricing groups are used, this will contain the values used to calculate the price */
    fun pricingGroupValues(): Optional<PricingGroupValues> =
        Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

    fun creditType(): Optional<CreditTypeData> =
        Optional.ofNullable(creditType.getNullable("credit_type"))

    @JsonProperty("rate_type") @ExcludeMissing fun _rateType() = rateType

    /**
     * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
     * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
     */
    @JsonProperty("price") @ExcludeMissing fun _price() = price

    /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
    @JsonProperty("custom_rate") @ExcludeMissing fun _customRate() = customRate

    /**
     * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using list
     * prices rather than the standard rates for this product on the contract.
     */
    @JsonProperty("use_list_prices") @ExcludeMissing fun _useListPrices() = useListPrices

    /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

    /**
     * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to true.
     */
    @JsonProperty("is_prorated") @ExcludeMissing fun _isProrated() = isProrated

    /** Only set for TIERED rate_type. */
    @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

    /** if pricing groups are used, this will contain the values used to calculate the price */
    @JsonProperty("pricing_group_values")
    @ExcludeMissing
    fun _pricingGroupValues() = pricingGroupValues

    @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Rate = apply {
        if (!validated) {
            rateType()
            price()
            customRate().map { it.validate() }
            useListPrices()
            quantity()
            isProrated()
            tiers().map { it.forEach { it.validate() } }
            pricingGroupValues().map { it.validate() }
            creditType().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var rateType: JsonField<RateType> = JsonMissing.of()
        private var price: JsonField<Double> = JsonMissing.of()
        private var customRate: JsonField<CustomRate> = JsonMissing.of()
        private var useListPrices: JsonField<Boolean> = JsonMissing.of()
        private var quantity: JsonField<Double> = JsonMissing.of()
        private var isProrated: JsonField<Boolean> = JsonMissing.of()
        private var tiers: JsonField<List<Tier>> = JsonMissing.of()
        private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
        private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rate: Rate) = apply {
            this.rateType = rate.rateType
            this.price = rate.price
            this.customRate = rate.customRate
            this.useListPrices = rate.useListPrices
            this.quantity = rate.quantity
            this.isProrated = rate.isProrated
            this.tiers = rate.tiers
            this.pricingGroupValues = rate.pricingGroupValues
            this.creditType = rate.creditType
            additionalProperties(rate.additionalProperties)
        }

        fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

        @JsonProperty("rate_type")
        @ExcludeMissing
        fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

        /**
         * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
         * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        fun price(price: Double) = price(JsonField.of(price))

        /**
         * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
         * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        @JsonProperty("price")
        @ExcludeMissing
        fun price(price: JsonField<Double>) = apply { this.price = price }

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        fun customRate(customRate: CustomRate) = customRate(JsonField.of(customRate))

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        @JsonProperty("custom_rate")
        @ExcludeMissing
        fun customRate(customRate: JsonField<CustomRate>) = apply { this.customRate = customRate }

        /**
         * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using
         * list prices rather than the standard rates for this product on the contract.
         */
        fun useListPrices(useListPrices: Boolean) = useListPrices(JsonField.of(useListPrices))

        /**
         * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using
         * list prices rather than the standard rates for this product on the contract.
         */
        @JsonProperty("use_list_prices")
        @ExcludeMissing
        fun useListPrices(useListPrices: JsonField<Boolean>) = apply {
            this.useListPrices = useListPrices
        }

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        @JsonProperty("quantity")
        @ExcludeMissing
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
        fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
        @JsonProperty("is_prorated")
        @ExcludeMissing
        fun isProrated(isProrated: JsonField<Boolean>) = apply { this.isProrated = isProrated }

        /** Only set for TIERED rate_type. */
        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

        /** Only set for TIERED rate_type. */
        @JsonProperty("tiers")
        @ExcludeMissing
        fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

        /** if pricing groups are used, this will contain the values used to calculate the price */
        fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
            pricingGroupValues(JsonField.of(pricingGroupValues))

        /** if pricing groups are used, this will contain the values used to calculate the price */
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
            this.pricingGroupValues = pricingGroupValues
        }

        fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

        @JsonProperty("credit_type")
        @ExcludeMissing
        fun creditType(creditType: JsonField<CreditTypeData>) = apply {
            this.creditType = creditType
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

        fun build(): Rate =
            Rate(
                rateType,
                price,
                customRate,
                useListPrices,
                quantity,
                isProrated,
                tiers.map { it.toImmutable() },
                pricingGroupValues,
                creditType,
                additionalProperties.toImmutable(),
            )
    }

    class RateType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val FLAT = RateType(JsonField.of("FLAT"))

            @JvmField val PERCENTAGE = RateType(JsonField.of("PERCENTAGE"))

            @JvmField val SUBSCRIPTION = RateType(JsonField.of("SUBSCRIPTION"))

            @JvmField val CUSTOM = RateType(JsonField.of("CUSTOM"))

            @JvmField val TIERED = RateType(JsonField.of("TIERED"))

            @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
        }

        enum class Known {
            FLAT,
            PERCENTAGE,
            SUBSCRIPTION,
            CUSTOM,
            TIERED,
        }

        enum class Value {
            FLAT,
            PERCENTAGE,
            SUBSCRIPTION,
            CUSTOM,
            TIERED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FLAT -> Value.FLAT
                PERCENTAGE -> Value.PERCENTAGE
                SUBSCRIPTION -> Value.SUBSCRIPTION
                CUSTOM -> Value.CUSTOM
                TIERED -> Value.TIERED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FLAT -> Known.FLAT
                PERCENTAGE -> Known.PERCENTAGE
                SUBSCRIPTION -> Known.SUBSCRIPTION
                CUSTOM -> Known.CUSTOM
                TIERED -> Known.TIERED
                else -> throw MetronomeInvalidDataException("Unknown RateType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
    @JsonDeserialize(builder = CustomRate.Builder::class)
    @NoAutoDetect
    class CustomRate
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CustomRate = apply {
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
            internal fun from(customRate: CustomRate) = apply {
                additionalProperties(customRate.additionalProperties)
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

            fun build(): CustomRate = CustomRate(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomRate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomRate{additionalProperties=$additionalProperties}"
    }

    /** if pricing groups are used, this will contain the values used to calculate the price */
    @JsonDeserialize(builder = PricingGroupValues.Builder::class)
    @NoAutoDetect
    class PricingGroupValues
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PricingGroupValues = apply {
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
            internal fun from(pricingGroupValues: PricingGroupValues) = apply {
                additionalProperties(pricingGroupValues.additionalProperties)
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

            fun build(): PricingGroupValues = PricingGroupValues(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PricingGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "PricingGroupValues{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Rate && rateType == other.rateType && price == other.price && customRate == other.customRate && useListPrices == other.useListPrices && quantity == other.quantity && isProrated == other.isProrated && tiers == other.tiers && pricingGroupValues == other.pricingGroupValues && creditType == other.creditType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(rateType, price, customRate, useListPrices, quantity, isProrated, tiers, pricingGroupValues, creditType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Rate{rateType=$rateType, price=$price, customRate=$customRate, useListPrices=$useListPrices, quantity=$quantity, isProrated=$isProrated, tiers=$tiers, pricingGroupValues=$pricingGroupValues, creditType=$creditType, additionalProperties=$additionalProperties}"
}
