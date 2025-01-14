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
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Add a new rate */
class ContractRateCardRateAddParams
constructor(
    private val body: ContractRateCardRateAddBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun entitled(): Boolean = body.entitled()

    /** ID of the product to add a rate for */
    fun productId(): String = body.productId()

    /** ID of the rate card to update */
    fun rateCardId(): String = body.rateCardId()

    fun rateType(): RateType = body.rateType()

    /** inclusive effective date */
    fun startingAt(): OffsetDateTime = body.startingAt()

    /**
     * A distinct rate on the rate card. You can choose to use this rate rather than list rate when
     * consuming a credit or commit.
     */
    fun commitRate(): Optional<CommitRate> = body.commitRate()

    /**
     * The Metronome ID of the credit type to associate with price, defaults to USD (cents) if not
     * passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use the credit type
     * of associated rates.
     */
    fun creditTypeId(): Optional<String> = body.creditTypeId()

    /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
    fun customRate(): Optional<CustomRate> = body.customRate()

    /** exclusive end date */
    fun endingBefore(): Optional<OffsetDateTime> = body.endingBefore()

    /**
     * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to true.
     */
    fun isProrated(): Optional<Boolean> = body.isProrated()

    /**
     * Default price. For FLAT and SUBSCRIPTION rate_type, this must be >=0. For PERCENTAGE
     * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
     */
    fun price(): Optional<Double> = body.price()

    /**
     * Optional. List of pricing group key value pairs which will be used to calculate the price.
     */
    fun pricingGroupValues(): Optional<PricingGroupValues> = body.pricingGroupValues()

    /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
    fun quantity(): Optional<Double> = body.quantity()

    /** Only set for TIERED rate_type. */
    fun tiers(): Optional<List<Tier>> = body.tiers()

    /**
     * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using list
     * prices rather than the standard rates for this product on the contract.
     */
    fun useListPrices(): Optional<Boolean> = body.useListPrices()

    fun _entitled(): JsonField<Boolean> = body._entitled()

    /** ID of the product to add a rate for */
    fun _productId(): JsonField<String> = body._productId()

    /** ID of the rate card to update */
    fun _rateCardId(): JsonField<String> = body._rateCardId()

    fun _rateType(): JsonField<RateType> = body._rateType()

    /** inclusive effective date */
    fun _startingAt(): JsonField<OffsetDateTime> = body._startingAt()

    /**
     * A distinct rate on the rate card. You can choose to use this rate rather than list rate when
     * consuming a credit or commit.
     */
    fun _commitRate(): JsonField<CommitRate> = body._commitRate()

    /**
     * The Metronome ID of the credit type to associate with price, defaults to USD (cents) if not
     * passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use the credit type
     * of associated rates.
     */
    fun _creditTypeId(): JsonField<String> = body._creditTypeId()

    /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
    fun _customRate(): JsonField<CustomRate> = body._customRate()

    /** exclusive end date */
    fun _endingBefore(): JsonField<OffsetDateTime> = body._endingBefore()

    /**
     * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to true.
     */
    fun _isProrated(): JsonField<Boolean> = body._isProrated()

    /**
     * Default price. For FLAT and SUBSCRIPTION rate_type, this must be >=0. For PERCENTAGE
     * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
     */
    fun _price(): JsonField<Double> = body._price()

    /**
     * Optional. List of pricing group key value pairs which will be used to calculate the price.
     */
    fun _pricingGroupValues(): JsonField<PricingGroupValues> = body._pricingGroupValues()

    /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
    fun _quantity(): JsonField<Double> = body._quantity()

    /** Only set for TIERED rate_type. */
    fun _tiers(): JsonField<List<Tier>> = body._tiers()

    /**
     * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using list
     * prices rather than the standard rates for this product on the contract.
     */
    fun _useListPrices(): JsonField<Boolean> = body._useListPrices()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ContractRateCardRateAddBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractRateCardRateAddBody
    @JsonCreator
    internal constructor(
        @JsonProperty("entitled")
        @ExcludeMissing
        private val entitled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rate_card_id")
        @ExcludeMissing
        private val rateCardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rate_type")
        @ExcludeMissing
        private val rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("commit_rate")
        @ExcludeMissing
        private val commitRate: JsonField<CommitRate> = JsonMissing.of(),
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        private val creditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom_rate")
        @ExcludeMissing
        private val customRate: JsonField<CustomRate> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("is_prorated")
        @ExcludeMissing
        private val isProrated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("price")
        @ExcludeMissing
        private val price: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        private val pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tiers")
        @ExcludeMissing
        private val tiers: JsonField<List<Tier>> = JsonMissing.of(),
        @JsonProperty("use_list_prices")
        @ExcludeMissing
        private val useListPrices: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun entitled(): Boolean = entitled.getRequired("entitled")

        /** ID of the product to add a rate for */
        fun productId(): String = productId.getRequired("product_id")

        /** ID of the rate card to update */
        fun rateCardId(): String = rateCardId.getRequired("rate_card_id")

        fun rateType(): RateType = rateType.getRequired("rate_type")

        /** inclusive effective date */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /**
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
         */
        fun commitRate(): Optional<CommitRate> =
            Optional.ofNullable(commitRate.getNullable("commit_rate"))

        /**
         * The Metronome ID of the credit type to associate with price, defaults to USD (cents) if
         * not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use the
         * credit type of associated rates.
         */
        fun creditTypeId(): Optional<String> =
            Optional.ofNullable(creditTypeId.getNullable("credit_type_id"))

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        fun customRate(): Optional<CustomRate> =
            Optional.ofNullable(customRate.getNullable("custom_rate"))

        /** exclusive end date */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
        fun isProrated(): Optional<Boolean> =
            Optional.ofNullable(isProrated.getNullable("is_prorated"))

        /**
         * Default price. For FLAT and SUBSCRIPTION rate_type, this must be >=0. For PERCENTAGE
         * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        fun price(): Optional<Double> = Optional.ofNullable(price.getNullable("price"))

        /**
         * Optional. List of pricing group key value pairs which will be used to calculate the
         * price.
         */
        fun pricingGroupValues(): Optional<PricingGroupValues> =
            Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

        /** Only set for TIERED rate_type. */
        fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers.getNullable("tiers"))

        /**
         * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using
         * list prices rather than the standard rates for this product on the contract.
         */
        fun useListPrices(): Optional<Boolean> =
            Optional.ofNullable(useListPrices.getNullable("use_list_prices"))

        @JsonProperty("entitled") @ExcludeMissing fun _entitled(): JsonField<Boolean> = entitled

        /** ID of the product to add a rate for */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /** ID of the rate card to update */
        @JsonProperty("rate_card_id")
        @ExcludeMissing
        fun _rateCardId(): JsonField<String> = rateCardId

        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /** inclusive effective date */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /**
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
         */
        @JsonProperty("commit_rate")
        @ExcludeMissing
        fun _commitRate(): JsonField<CommitRate> = commitRate

        /**
         * The Metronome ID of the credit type to associate with price, defaults to USD (cents) if
         * not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use the
         * credit type of associated rates.
         */
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        @JsonProperty("custom_rate")
        @ExcludeMissing
        fun _customRate(): JsonField<CustomRate> = customRate

        /** exclusive end date */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
        @JsonProperty("is_prorated")
        @ExcludeMissing
        fun _isProrated(): JsonField<Boolean> = isProrated

        /**
         * Default price. For FLAT and SUBSCRIPTION rate_type, this must be >=0. For PERCENTAGE
         * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

        /**
         * Optional. List of pricing group key value pairs which will be used to calculate the
         * price.
         */
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /** Only set for TIERED rate_type. */
        @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

        /**
         * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using
         * list prices rather than the standard rates for this product on the contract.
         */
        @JsonProperty("use_list_prices")
        @ExcludeMissing
        fun _useListPrices(): JsonField<Boolean> = useListPrices

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractRateCardRateAddBody = apply {
            if (validated) {
                return@apply
            }

            entitled()
            productId()
            rateCardId()
            rateType()
            startingAt()
            commitRate().ifPresent { it.validate() }
            creditTypeId()
            customRate().ifPresent { it.validate() }
            endingBefore()
            isProrated()
            price()
            pricingGroupValues().ifPresent { it.validate() }
            quantity()
            tiers().ifPresent { it.forEach { it.validate() } }
            useListPrices()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var entitled: JsonField<Boolean>? = null
            private var productId: JsonField<String>? = null
            private var rateCardId: JsonField<String>? = null
            private var rateType: JsonField<RateType>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var commitRate: JsonField<CommitRate> = JsonMissing.of()
            private var creditTypeId: JsonField<String> = JsonMissing.of()
            private var customRate: JsonField<CustomRate> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var isProrated: JsonField<Boolean> = JsonMissing.of()
            private var price: JsonField<Double> = JsonMissing.of()
            private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var tiers: JsonField<MutableList<Tier>>? = null
            private var useListPrices: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractRateCardRateAddBody: ContractRateCardRateAddBody) = apply {
                entitled = contractRateCardRateAddBody.entitled
                productId = contractRateCardRateAddBody.productId
                rateCardId = contractRateCardRateAddBody.rateCardId
                rateType = contractRateCardRateAddBody.rateType
                startingAt = contractRateCardRateAddBody.startingAt
                commitRate = contractRateCardRateAddBody.commitRate
                creditTypeId = contractRateCardRateAddBody.creditTypeId
                customRate = contractRateCardRateAddBody.customRate
                endingBefore = contractRateCardRateAddBody.endingBefore
                isProrated = contractRateCardRateAddBody.isProrated
                price = contractRateCardRateAddBody.price
                pricingGroupValues = contractRateCardRateAddBody.pricingGroupValues
                quantity = contractRateCardRateAddBody.quantity
                tiers = contractRateCardRateAddBody.tiers.map { it.toMutableList() }
                useListPrices = contractRateCardRateAddBody.useListPrices
                additionalProperties =
                    contractRateCardRateAddBody.additionalProperties.toMutableMap()
            }

            fun entitled(entitled: Boolean) = entitled(JsonField.of(entitled))

            fun entitled(entitled: JsonField<Boolean>) = apply { this.entitled = entitled }

            /** ID of the product to add a rate for */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /** ID of the product to add a rate for */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** ID of the rate card to update */
            fun rateCardId(rateCardId: String) = rateCardId(JsonField.of(rateCardId))

            /** ID of the rate card to update */
            fun rateCardId(rateCardId: JsonField<String>) = apply { this.rateCardId = rateCardId }

            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /** inclusive effective date */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /** inclusive effective date */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            /**
             * A distinct rate on the rate card. You can choose to use this rate rather than list
             * rate when consuming a credit or commit.
             */
            fun commitRate(commitRate: CommitRate) = commitRate(JsonField.of(commitRate))

            /**
             * A distinct rate on the rate card. You can choose to use this rate rather than list
             * rate when consuming a credit or commit.
             */
            fun commitRate(commitRate: JsonField<CommitRate>) = apply {
                this.commitRate = commitRate
            }

            /**
             * The Metronome ID of the credit type to associate with price, defaults to USD (cents)
             * if not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use
             * the credit type of associated rates.
             */
            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            /**
             * The Metronome ID of the credit type to associate with price, defaults to USD (cents)
             * if not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use
             * the credit type of associated rates.
             */
            fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                this.creditTypeId = creditTypeId
            }

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            fun customRate(customRate: CustomRate) = customRate(JsonField.of(customRate))

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            fun customRate(customRate: JsonField<CustomRate>) = apply {
                this.customRate = customRate
            }

            /** exclusive end date */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /** exclusive end date */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            /**
             * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set
             * to true.
             */
            fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

            /**
             * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set
             * to true.
             */
            fun isProrated(isProrated: JsonField<Boolean>) = apply { this.isProrated = isProrated }

            /**
             * Default price. For FLAT and SUBSCRIPTION rate_type, this must be >=0. For PERCENTAGE
             * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and
             * <=1.
             */
            fun price(price: Double) = price(JsonField.of(price))

            /**
             * Default price. For FLAT and SUBSCRIPTION rate_type, this must be >=0. For PERCENTAGE
             * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and
             * <=1.
             */
            fun price(price: JsonField<Double>) = apply { this.price = price }

            /**
             * Optional. List of pricing group key value pairs which will be used to calculate the
             * price.
             */
            fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                pricingGroupValues(JsonField.of(pricingGroupValues))

            /**
             * Optional. List of pricing group key value pairs which will be used to calculate the
             * price.
             */
            fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                this.pricingGroupValues = pricingGroupValues
            }

            /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** Only set for TIERED rate_type. */
            fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

            /** Only set for TIERED rate_type. */
            fun tiers(tiers: JsonField<List<Tier>>) = apply {
                this.tiers = tiers.map { it.toMutableList() }
            }

            /** Only set for TIERED rate_type. */
            fun addTier(tier: Tier) = apply {
                tiers =
                    (tiers ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(tier)
                    }
            }

            /**
             * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using
             * list prices rather than the standard rates for this product on the contract.
             */
            fun useListPrices(useListPrices: Boolean) = useListPrices(JsonField.of(useListPrices))

            /**
             * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using
             * list prices rather than the standard rates for this product on the contract.
             */
            fun useListPrices(useListPrices: JsonField<Boolean>) = apply {
                this.useListPrices = useListPrices
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

            fun build(): ContractRateCardRateAddBody =
                ContractRateCardRateAddBody(
                    checkRequired("entitled", entitled),
                    checkRequired("productId", productId),
                    checkRequired("rateCardId", rateCardId),
                    checkRequired("rateType", rateType),
                    checkRequired("startingAt", startingAt),
                    commitRate,
                    creditTypeId,
                    customRate,
                    endingBefore,
                    isProrated,
                    price,
                    pricingGroupValues,
                    quantity,
                    (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                    useListPrices,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRateCardRateAddBody && entitled == other.entitled && productId == other.productId && rateCardId == other.rateCardId && rateType == other.rateType && startingAt == other.startingAt && commitRate == other.commitRate && creditTypeId == other.creditTypeId && customRate == other.customRate && endingBefore == other.endingBefore && isProrated == other.isProrated && price == other.price && pricingGroupValues == other.pricingGroupValues && quantity == other.quantity && tiers == other.tiers && useListPrices == other.useListPrices && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entitled, productId, rateCardId, rateType, startingAt, commitRate, creditTypeId, customRate, endingBefore, isProrated, price, pricingGroupValues, quantity, tiers, useListPrices, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractRateCardRateAddBody{entitled=$entitled, productId=$productId, rateCardId=$rateCardId, rateType=$rateType, startingAt=$startingAt, commitRate=$commitRate, creditTypeId=$creditTypeId, customRate=$customRate, endingBefore=$endingBefore, isProrated=$isProrated, price=$price, pricingGroupValues=$pricingGroupValues, quantity=$quantity, tiers=$tiers, useListPrices=$useListPrices, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ContractRateCardRateAddBody.Builder =
            ContractRateCardRateAddBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractRateCardRateAddParams: ContractRateCardRateAddParams) = apply {
            body = contractRateCardRateAddParams.body.toBuilder()
            additionalHeaders = contractRateCardRateAddParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractRateCardRateAddParams.additionalQueryParams.toBuilder()
        }

        fun entitled(entitled: Boolean) = apply { body.entitled(entitled) }

        fun entitled(entitled: JsonField<Boolean>) = apply { body.entitled(entitled) }

        /** ID of the product to add a rate for */
        fun productId(productId: String) = apply { body.productId(productId) }

        /** ID of the product to add a rate for */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

        /** ID of the rate card to update */
        fun rateCardId(rateCardId: String) = apply { body.rateCardId(rateCardId) }

        /** ID of the rate card to update */
        fun rateCardId(rateCardId: JsonField<String>) = apply { body.rateCardId(rateCardId) }

        fun rateType(rateType: RateType) = apply { body.rateType(rateType) }

        fun rateType(rateType: JsonField<RateType>) = apply { body.rateType(rateType) }

        /** inclusive effective date */
        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

        /** inclusive effective date */
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            body.startingAt(startingAt)
        }

        /**
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
         */
        fun commitRate(commitRate: CommitRate) = apply { body.commitRate(commitRate) }

        /**
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
         */
        fun commitRate(commitRate: JsonField<CommitRate>) = apply { body.commitRate(commitRate) }

        /**
         * The Metronome ID of the credit type to associate with price, defaults to USD (cents) if
         * not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use the
         * credit type of associated rates.
         */
        fun creditTypeId(creditTypeId: String) = apply { body.creditTypeId(creditTypeId) }

        /**
         * The Metronome ID of the credit type to associate with price, defaults to USD (cents) if
         * not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use the
         * credit type of associated rates.
         */
        fun creditTypeId(creditTypeId: JsonField<String>) = apply {
            body.creditTypeId(creditTypeId)
        }

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        fun customRate(customRate: CustomRate) = apply { body.customRate(customRate) }

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        fun customRate(customRate: JsonField<CustomRate>) = apply { body.customRate(customRate) }

        /** exclusive end date */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { body.endingBefore(endingBefore) }

        /** exclusive end date */
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            body.endingBefore(endingBefore)
        }

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
        fun isProrated(isProrated: Boolean) = apply { body.isProrated(isProrated) }

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
        fun isProrated(isProrated: JsonField<Boolean>) = apply { body.isProrated(isProrated) }

        /**
         * Default price. For FLAT and SUBSCRIPTION rate_type, this must be >=0. For PERCENTAGE
         * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        fun price(price: Double) = apply { body.price(price) }

        /**
         * Default price. For FLAT and SUBSCRIPTION rate_type, this must be >=0. For PERCENTAGE
         * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        fun price(price: JsonField<Double>) = apply { body.price(price) }

        /**
         * Optional. List of pricing group key value pairs which will be used to calculate the
         * price.
         */
        fun pricingGroupValues(pricingGroupValues: PricingGroupValues) = apply {
            body.pricingGroupValues(pricingGroupValues)
        }

        /**
         * Optional. List of pricing group key value pairs which will be used to calculate the
         * price.
         */
        fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
            body.pricingGroupValues(pricingGroupValues)
        }

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        fun quantity(quantity: Double) = apply { body.quantity(quantity) }

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        fun quantity(quantity: JsonField<Double>) = apply { body.quantity(quantity) }

        /** Only set for TIERED rate_type. */
        fun tiers(tiers: List<Tier>) = apply { body.tiers(tiers) }

        /** Only set for TIERED rate_type. */
        fun tiers(tiers: JsonField<List<Tier>>) = apply { body.tiers(tiers) }

        /** Only set for TIERED rate_type. */
        fun addTier(tier: Tier) = apply { body.addTier(tier) }

        /**
         * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using
         * list prices rather than the standard rates for this product on the contract.
         */
        fun useListPrices(useListPrices: Boolean) = apply { body.useListPrices(useListPrices) }

        /**
         * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using
         * list prices rather than the standard rates for this product on the contract.
         */
        fun useListPrices(useListPrices: JsonField<Boolean>) = apply {
            body.useListPrices(useListPrices)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): ContractRateCardRateAddParams =
            ContractRateCardRateAddParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class RateType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FLAT = of("FLAT")

            @JvmField val PERCENTAGE = of("PERCENTAGE")

            @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

            @JvmField val TIERED = of("TIERED")

            @JvmField val CUSTOM = of("CUSTOM")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A distinct rate on the rate card. You can choose to use this rate rather than list rate when
     * consuming a credit or commit.
     */
    @NoAutoDetect
    class CommitRate
    @JsonCreator
    private constructor(
        @JsonProperty("rate_type")
        @ExcludeMissing
        private val rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("price")
        @ExcludeMissing
        private val price: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tiers")
        @ExcludeMissing
        private val tiers: JsonField<List<Tier>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun rateType(): RateType = rateType.getRequired("rate_type")

        /** Commit rate price. For FLAT rate_type, this must be >=0. */
        fun price(): Optional<Double> = Optional.ofNullable(price.getNullable("price"))

        /** Only set for TIERED rate_type. */
        fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers.getNullable("tiers"))

        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /** Commit rate price. For FLAT rate_type, this must be >=0. */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

        /** Only set for TIERED rate_type. */
        @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CommitRate = apply {
            if (validated) {
                return@apply
            }

            rateType()
            price()
            tiers().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var rateType: JsonField<RateType>? = null
            private var price: JsonField<Double> = JsonMissing.of()
            private var tiers: JsonField<MutableList<Tier>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commitRate: CommitRate) = apply {
                rateType = commitRate.rateType
                price = commitRate.price
                tiers = commitRate.tiers.map { it.toMutableList() }
                additionalProperties = commitRate.additionalProperties.toMutableMap()
            }

            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /** Commit rate price. For FLAT rate_type, this must be >=0. */
            fun price(price: Double) = price(JsonField.of(price))

            /** Commit rate price. For FLAT rate_type, this must be >=0. */
            fun price(price: JsonField<Double>) = apply { this.price = price }

            /** Only set for TIERED rate_type. */
            fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

            /** Only set for TIERED rate_type. */
            fun tiers(tiers: JsonField<List<Tier>>) = apply {
                this.tiers = tiers.map { it.toMutableList() }
            }

            /** Only set for TIERED rate_type. */
            fun addTier(tier: Tier) = apply {
                tiers =
                    (tiers ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(tier)
                    }
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

            fun build(): CommitRate =
                CommitRate(
                    checkRequired("rateType", rateType),
                    price,
                    (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class RateType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val FLAT = of("FLAT")

                @JvmField val FLAT = of("flat")

                @JvmField val PERCENTAGE = of("PERCENTAGE")

                @JvmField val PERCENTAGE = of("percentage")

                @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

                @JvmField val SUBSCRIPTION = of("subscription")

                @JvmField val TIERED = of("TIERED")

                @JvmField val TIERED = of("tiered")

                @JvmField val CUSTOM = of("CUSTOM")

                @JvmField val CUSTOM = of("custom")

                @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
            }

            enum class Known {
                FLAT,
                FLAT,
                PERCENTAGE,
                PERCENTAGE,
                SUBSCRIPTION,
                SUBSCRIPTION,
                TIERED,
                TIERED,
                CUSTOM,
                CUSTOM,
            }

            enum class Value {
                FLAT,
                FLAT,
                PERCENTAGE,
                PERCENTAGE,
                SUBSCRIPTION,
                SUBSCRIPTION,
                TIERED,
                TIERED,
                CUSTOM,
                CUSTOM,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    FLAT -> Value.FLAT
                    FLAT -> Value.FLAT
                    PERCENTAGE -> Value.PERCENTAGE
                    PERCENTAGE -> Value.PERCENTAGE
                    SUBSCRIPTION -> Value.SUBSCRIPTION
                    SUBSCRIPTION -> Value.SUBSCRIPTION
                    TIERED -> Value.TIERED
                    TIERED -> Value.TIERED
                    CUSTOM -> Value.CUSTOM
                    CUSTOM -> Value.CUSTOM
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    FLAT -> Known.FLAT
                    FLAT -> Known.FLAT
                    PERCENTAGE -> Known.PERCENTAGE
                    PERCENTAGE -> Known.PERCENTAGE
                    SUBSCRIPTION -> Known.SUBSCRIPTION
                    SUBSCRIPTION -> Known.SUBSCRIPTION
                    TIERED -> Known.TIERED
                    TIERED -> Known.TIERED
                    CUSTOM -> Known.CUSTOM
                    CUSTOM -> Known.CUSTOM
                    else -> throw MetronomeInvalidDataException("Unknown RateType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CommitRate && rateType == other.rateType && price == other.price && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(rateType, price, tiers, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CommitRate{rateType=$rateType, price=$price, tiers=$tiers, additionalProperties=$additionalProperties}"
    }

    /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
    @NoAutoDetect
    class CustomRate
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomRate = apply {
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
            internal fun from(customRate: CustomRate) = apply {
                additionalProperties = customRate.additionalProperties.toMutableMap()
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

    /**
     * Optional. List of pricing group key value pairs which will be used to calculate the price.
     */
    @NoAutoDetect
    class PricingGroupValues
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PricingGroupValues = apply {
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
            internal fun from(pricingGroupValues: PricingGroupValues) = apply {
                additionalProperties = pricingGroupValues.additionalProperties.toMutableMap()
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

        return /* spotless:off */ other is ContractRateCardRateAddParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractRateCardRateAddParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
