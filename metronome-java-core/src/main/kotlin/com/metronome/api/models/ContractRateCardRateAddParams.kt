// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ContractRateCardRateAddParams
constructor(
    private val entitled: Boolean,
    private val productId: String,
    private val rateCardId: String,
    private val rateType: RateType,
    private val startingAt: OffsetDateTime,
    private val creditTypeId: String?,
    private val customRate: CustomRate?,
    private val endingBefore: OffsetDateTime?,
    private val isProrated: Boolean?,
    private val price: Double?,
    private val pricingGroupValues: PricingGroupValues?,
    private val quantity: Double?,
    private val tiers: List<Tier>?,
    private val useListPrices: Boolean?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun entitled(): Boolean = entitled

    fun productId(): String = productId

    fun rateCardId(): String = rateCardId

    fun rateType(): RateType = rateType

    fun startingAt(): OffsetDateTime = startingAt

    fun creditTypeId(): Optional<String> = Optional.ofNullable(creditTypeId)

    fun customRate(): Optional<CustomRate> = Optional.ofNullable(customRate)

    fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

    fun isProrated(): Optional<Boolean> = Optional.ofNullable(isProrated)

    fun price(): Optional<Double> = Optional.ofNullable(price)

    fun pricingGroupValues(): Optional<PricingGroupValues> = Optional.ofNullable(pricingGroupValues)

    fun quantity(): Optional<Double> = Optional.ofNullable(quantity)

    fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers)

    fun useListPrices(): Optional<Boolean> = Optional.ofNullable(useListPrices)

    @JvmSynthetic
    internal fun getBody(): ContractRateCardRateAddBody {
        return ContractRateCardRateAddBody(
            entitled,
            productId,
            rateCardId,
            rateType,
            startingAt,
            creditTypeId,
            customRate,
            endingBefore,
            isProrated,
            price,
            pricingGroupValues,
            quantity,
            tiers,
            useListPrices,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = ContractRateCardRateAddBody.Builder::class)
    @NoAutoDetect
    class ContractRateCardRateAddBody
    internal constructor(
        private val entitled: Boolean?,
        private val productId: String?,
        private val rateCardId: String?,
        private val rateType: RateType?,
        private val startingAt: OffsetDateTime?,
        private val creditTypeId: String?,
        private val customRate: CustomRate?,
        private val endingBefore: OffsetDateTime?,
        private val isProrated: Boolean?,
        private val price: Double?,
        private val pricingGroupValues: PricingGroupValues?,
        private val quantity: Double?,
        private val tiers: List<Tier>?,
        private val useListPrices: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("entitled") fun entitled(): Boolean? = entitled

        /** ID of the product to add a rate for */
        @JsonProperty("product_id") fun productId(): String? = productId

        /** ID of the rate card to update */
        @JsonProperty("rate_card_id") fun rateCardId(): String? = rateCardId

        @JsonProperty("rate_type") fun rateType(): RateType? = rateType

        /** inclusive effective date */
        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

        /**
         * The Metronome ID of the credit type to associate with price, defaults to USD (cents) if
         * not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use the
         * credit type of associated rates.
         */
        @JsonProperty("credit_type_id") fun creditTypeId(): String? = creditTypeId

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        @JsonProperty("custom_rate") fun customRate(): CustomRate? = customRate

        /** exclusive end date */
        @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

        /** Default proration configuration. Only valid for SUBSCRIPTION rate_type. */
        @JsonProperty("is_prorated") fun isProrated(): Boolean? = isProrated

        /**
         * Default price. For FLAT and SUBSCRIPTION rate_type, this must be >=0. For PERCENTAGE
         * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        @JsonProperty("price") fun price(): Double? = price

        /**
         * Optional. List of pricing group key value pairs which will be used to calculate the
         * price.
         */
        @JsonProperty("pricing_group_values")
        fun pricingGroupValues(): PricingGroupValues? = pricingGroupValues

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        @JsonProperty("quantity") fun quantity(): Double? = quantity

        /** Only set for TIERED rate_type. */
        @JsonProperty("tiers") fun tiers(): List<Tier>? = tiers

        /**
         * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using
         * list prices rather than the standard rates for this product on the contract.
         */
        @JsonProperty("use_list_prices") fun useListPrices(): Boolean? = useListPrices

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var entitled: Boolean? = null
            private var productId: String? = null
            private var rateCardId: String? = null
            private var rateType: RateType? = null
            private var startingAt: OffsetDateTime? = null
            private var creditTypeId: String? = null
            private var customRate: CustomRate? = null
            private var endingBefore: OffsetDateTime? = null
            private var isProrated: Boolean? = null
            private var price: Double? = null
            private var pricingGroupValues: PricingGroupValues? = null
            private var quantity: Double? = null
            private var tiers: List<Tier>? = null
            private var useListPrices: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractRateCardRateAddBody: ContractRateCardRateAddBody) = apply {
                this.entitled = contractRateCardRateAddBody.entitled
                this.productId = contractRateCardRateAddBody.productId
                this.rateCardId = contractRateCardRateAddBody.rateCardId
                this.rateType = contractRateCardRateAddBody.rateType
                this.startingAt = contractRateCardRateAddBody.startingAt
                this.creditTypeId = contractRateCardRateAddBody.creditTypeId
                this.customRate = contractRateCardRateAddBody.customRate
                this.endingBefore = contractRateCardRateAddBody.endingBefore
                this.isProrated = contractRateCardRateAddBody.isProrated
                this.price = contractRateCardRateAddBody.price
                this.pricingGroupValues = contractRateCardRateAddBody.pricingGroupValues
                this.quantity = contractRateCardRateAddBody.quantity
                this.tiers = contractRateCardRateAddBody.tiers
                this.useListPrices = contractRateCardRateAddBody.useListPrices
                additionalProperties(contractRateCardRateAddBody.additionalProperties)
            }

            @JsonProperty("entitled")
            fun entitled(entitled: Boolean) = apply { this.entitled = entitled }

            /** ID of the product to add a rate for */
            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

            /** ID of the rate card to update */
            @JsonProperty("rate_card_id")
            fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

            @JsonProperty("rate_type")
            fun rateType(rateType: RateType) = apply { this.rateType = rateType }

            /** inclusive effective date */
            @JsonProperty("starting_at")
            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

            /**
             * The Metronome ID of the credit type to associate with price, defaults to USD (cents)
             * if not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use
             * the credit type of associated rates.
             */
            @JsonProperty("credit_type_id")
            fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            @JsonProperty("custom_rate")
            fun customRate(customRate: CustomRate) = apply { this.customRate = customRate }

            /** exclusive end date */
            @JsonProperty("ending_before")
            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
            }

            /** Default proration configuration. Only valid for SUBSCRIPTION rate_type. */
            @JsonProperty("is_prorated")
            fun isProrated(isProrated: Boolean) = apply { this.isProrated = isProrated }

            /**
             * Default price. For FLAT and SUBSCRIPTION rate_type, this must be >=0. For PERCENTAGE
             * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and
             * <=1.
             */
            @JsonProperty("price") fun price(price: Double) = apply { this.price = price }

            /**
             * Optional. List of pricing group key value pairs which will be used to calculate the
             * price.
             */
            @JsonProperty("pricing_group_values")
            fun pricingGroupValues(pricingGroupValues: PricingGroupValues) = apply {
                this.pricingGroupValues = pricingGroupValues
            }

            /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
            @JsonProperty("quantity")
            fun quantity(quantity: Double) = apply { this.quantity = quantity }

            /** Only set for TIERED rate_type. */
            @JsonProperty("tiers") fun tiers(tiers: List<Tier>) = apply { this.tiers = tiers }

            /**
             * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using
             * list prices rather than the standard rates for this product on the contract.
             */
            @JsonProperty("use_list_prices")
            fun useListPrices(useListPrices: Boolean) = apply { this.useListPrices = useListPrices }

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

            fun build(): ContractRateCardRateAddBody =
                ContractRateCardRateAddBody(
                    checkNotNull(entitled) { "`entitled` is required but was not set" },
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                    checkNotNull(rateType) { "`rateType` is required but was not set" },
                    checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                    creditTypeId,
                    customRate,
                    endingBefore,
                    isProrated,
                    price,
                    pricingGroupValues,
                    quantity,
                    tiers?.toImmutable(),
                    useListPrices,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRateCardRateAddBody && this.entitled == other.entitled && this.productId == other.productId && this.rateCardId == other.rateCardId && this.rateType == other.rateType && this.startingAt == other.startingAt && this.creditTypeId == other.creditTypeId && this.customRate == other.customRate && this.endingBefore == other.endingBefore && this.isProrated == other.isProrated && this.price == other.price && this.pricingGroupValues == other.pricingGroupValues && this.quantity == other.quantity && this.tiers == other.tiers && this.useListPrices == other.useListPrices && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(entitled, productId, rateCardId, rateType, startingAt, creditTypeId, customRate, endingBefore, isProrated, price, pricingGroupValues, quantity, tiers, useListPrices, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractRateCardRateAddBody{entitled=$entitled, productId=$productId, rateCardId=$rateCardId, rateType=$rateType, startingAt=$startingAt, creditTypeId=$creditTypeId, customRate=$customRate, endingBefore=$endingBefore, isProrated=$isProrated, price=$price, pricingGroupValues=$pricingGroupValues, quantity=$quantity, tiers=$tiers, useListPrices=$useListPrices, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardRateAddParams && this.entitled == other.entitled && this.productId == other.productId && this.rateCardId == other.rateCardId && this.rateType == other.rateType && this.startingAt == other.startingAt && this.creditTypeId == other.creditTypeId && this.customRate == other.customRate && this.endingBefore == other.endingBefore && this.isProrated == other.isProrated && this.price == other.price && this.pricingGroupValues == other.pricingGroupValues && this.quantity == other.quantity && this.tiers == other.tiers && this.useListPrices == other.useListPrices && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(entitled, productId, rateCardId, rateType, startingAt, creditTypeId, customRate, endingBefore, isProrated, price, pricingGroupValues, quantity, tiers, useListPrices, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractRateCardRateAddParams{entitled=$entitled, productId=$productId, rateCardId=$rateCardId, rateType=$rateType, startingAt=$startingAt, creditTypeId=$creditTypeId, customRate=$customRate, endingBefore=$endingBefore, isProrated=$isProrated, price=$price, pricingGroupValues=$pricingGroupValues, quantity=$quantity, tiers=$tiers, useListPrices=$useListPrices, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var entitled: Boolean? = null
        private var productId: String? = null
        private var rateCardId: String? = null
        private var rateType: RateType? = null
        private var startingAt: OffsetDateTime? = null
        private var creditTypeId: String? = null
        private var customRate: CustomRate? = null
        private var endingBefore: OffsetDateTime? = null
        private var isProrated: Boolean? = null
        private var price: Double? = null
        private var pricingGroupValues: PricingGroupValues? = null
        private var quantity: Double? = null
        private var tiers: MutableList<Tier> = mutableListOf()
        private var useListPrices: Boolean? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractRateCardRateAddParams: ContractRateCardRateAddParams) = apply {
            this.entitled = contractRateCardRateAddParams.entitled
            this.productId = contractRateCardRateAddParams.productId
            this.rateCardId = contractRateCardRateAddParams.rateCardId
            this.rateType = contractRateCardRateAddParams.rateType
            this.startingAt = contractRateCardRateAddParams.startingAt
            this.creditTypeId = contractRateCardRateAddParams.creditTypeId
            this.customRate = contractRateCardRateAddParams.customRate
            this.endingBefore = contractRateCardRateAddParams.endingBefore
            this.isProrated = contractRateCardRateAddParams.isProrated
            this.price = contractRateCardRateAddParams.price
            this.pricingGroupValues = contractRateCardRateAddParams.pricingGroupValues
            this.quantity = contractRateCardRateAddParams.quantity
            this.tiers(contractRateCardRateAddParams.tiers ?: listOf())
            this.useListPrices = contractRateCardRateAddParams.useListPrices
            additionalHeaders(contractRateCardRateAddParams.additionalHeaders)
            additionalQueryParams(contractRateCardRateAddParams.additionalQueryParams)
            additionalBodyProperties(contractRateCardRateAddParams.additionalBodyProperties)
        }

        fun entitled(entitled: Boolean) = apply { this.entitled = entitled }

        /** ID of the product to add a rate for */
        fun productId(productId: String) = apply { this.productId = productId }

        /** ID of the rate card to update */
        fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

        fun rateType(rateType: RateType) = apply { this.rateType = rateType }

        /** inclusive effective date */
        fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

        /**
         * The Metronome ID of the credit type to associate with price, defaults to USD (cents) if
         * not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use the
         * credit type of associated rates.
         */
        fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        fun customRate(customRate: CustomRate) = apply { this.customRate = customRate }

        /** exclusive end date */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { this.endingBefore = endingBefore }

        /** Default proration configuration. Only valid for SUBSCRIPTION rate_type. */
        fun isProrated(isProrated: Boolean) = apply { this.isProrated = isProrated }

        /**
         * Default price. For FLAT and SUBSCRIPTION rate_type, this must be >=0. For PERCENTAGE
         * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        fun price(price: Double) = apply { this.price = price }

        /**
         * Optional. List of pricing group key value pairs which will be used to calculate the
         * price.
         */
        fun pricingGroupValues(pricingGroupValues: PricingGroupValues) = apply {
            this.pricingGroupValues = pricingGroupValues
        }

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        fun quantity(quantity: Double) = apply { this.quantity = quantity }

        /** Only set for TIERED rate_type. */
        fun tiers(tiers: List<Tier>) = apply {
            this.tiers.clear()
            this.tiers.addAll(tiers)
        }

        /** Only set for TIERED rate_type. */
        fun addTier(tier: Tier) = apply { this.tiers.add(tier) }

        /**
         * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using
         * list prices rather than the standard rates for this product on the contract.
         */
        fun useListPrices(useListPrices: Boolean) = apply { this.useListPrices = useListPrices }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): ContractRateCardRateAddParams =
            ContractRateCardRateAddParams(
                checkNotNull(entitled) { "`entitled` is required but was not set" },
                checkNotNull(productId) { "`productId` is required but was not set" },
                checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                checkNotNull(rateType) { "`rateType` is required but was not set" },
                checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                creditTypeId,
                customRate,
                endingBefore,
                isProrated,
                price,
                pricingGroupValues,
                quantity,
                if (tiers.size == 0) null else tiers.toImmutable(),
                useListPrices,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is RateType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val FLAT = RateType(JsonField.of("FLAT"))

            @JvmField val PERCENTAGE = RateType(JsonField.of("PERCENTAGE"))

            @JvmField val SUBSCRIPTION = RateType(JsonField.of("SUBSCRIPTION"))

            @JvmField val TIERED = RateType(JsonField.of("TIERED"))

            @JvmField val CUSTOM = RateType(JsonField.of("CUSTOM"))

            @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
        }

        enum class Known {
            FLAT,
            PERCENTAGE,
            SUBSCRIPTION,
            TIERED,
            CUSTOM,
        }

        enum class Value {
            FLAT,
            PERCENTAGE,
            SUBSCRIPTION,
            TIERED,
            CUSTOM,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FLAT -> Value.FLAT
                PERCENTAGE -> Value.PERCENTAGE
                SUBSCRIPTION -> Value.SUBSCRIPTION
                TIERED -> Value.TIERED
                CUSTOM -> Value.CUSTOM
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FLAT -> Known.FLAT
                PERCENTAGE -> Known.PERCENTAGE
                SUBSCRIPTION -> Known.SUBSCRIPTION
                TIERED -> Known.TIERED
                CUSTOM -> Known.CUSTOM
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

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            return /* spotless:off */ other is CustomRate && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "CustomRate{additionalProperties=$additionalProperties}"
    }

    /**
     * Optional. List of pricing group key value pairs which will be used to calculate the price.
     */
    @JsonDeserialize(builder = PricingGroupValues.Builder::class)
    @NoAutoDetect
    class PricingGroupValues
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            return /* spotless:off */ other is PricingGroupValues && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "PricingGroupValues{additionalProperties=$additionalProperties}"
    }
}
