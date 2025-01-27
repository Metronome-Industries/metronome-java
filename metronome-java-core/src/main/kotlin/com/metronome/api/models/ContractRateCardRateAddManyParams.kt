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

/** Add new rates */
class ContractRateCardRateAddManyParams
private constructor(
    private val body: ContractRateCardRateAddManyBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun rateCardId(): String = body.rateCardId()

    fun rates(): List<Rate> = body.rates()

    fun _rateCardId(): JsonField<String> = body._rateCardId()

    fun _rates(): JsonField<List<Rate>> = body._rates()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ContractRateCardRateAddManyBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractRateCardRateAddManyBody
    @JsonCreator
    internal constructor(
        @JsonProperty("rate_card_id")
        @ExcludeMissing
        private val rateCardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rates")
        @ExcludeMissing
        private val rates: JsonField<List<Rate>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun rateCardId(): String = rateCardId.getRequired("rate_card_id")

        fun rates(): List<Rate> = rates.getRequired("rates")

        @JsonProperty("rate_card_id")
        @ExcludeMissing
        fun _rateCardId(): JsonField<String> = rateCardId

        @JsonProperty("rates") @ExcludeMissing fun _rates(): JsonField<List<Rate>> = rates

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractRateCardRateAddManyBody = apply {
            if (validated) {
                return@apply
            }

            rateCardId()
            rates().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContractRateCardRateAddManyBody]. */
        class Builder internal constructor() {

            private var rateCardId: JsonField<String>? = null
            private var rates: JsonField<MutableList<Rate>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractRateCardRateAddManyBody: ContractRateCardRateAddManyBody) =
                apply {
                    rateCardId = contractRateCardRateAddManyBody.rateCardId
                    rates = contractRateCardRateAddManyBody.rates.map { it.toMutableList() }
                    additionalProperties =
                        contractRateCardRateAddManyBody.additionalProperties.toMutableMap()
                }

            fun rateCardId(rateCardId: String) = rateCardId(JsonField.of(rateCardId))

            fun rateCardId(rateCardId: JsonField<String>) = apply { this.rateCardId = rateCardId }

            fun rates(rates: List<Rate>) = rates(JsonField.of(rates))

            fun rates(rates: JsonField<List<Rate>>) = apply {
                this.rates = rates.map { it.toMutableList() }
            }

            fun addRate(rate: Rate) = apply {
                rates =
                    (rates ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(rate)
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

            fun build(): ContractRateCardRateAddManyBody =
                ContractRateCardRateAddManyBody(
                    checkRequired("rateCardId", rateCardId),
                    checkRequired("rates", rates).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRateCardRateAddManyBody && rateCardId == other.rateCardId && rates == other.rates && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(rateCardId, rates, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractRateCardRateAddManyBody{rateCardId=$rateCardId, rates=$rates, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractRateCardRateAddManyParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: ContractRateCardRateAddManyBody.Builder =
            ContractRateCardRateAddManyBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractRateCardRateAddManyParams: ContractRateCardRateAddManyParams) =
            apply {
                body = contractRateCardRateAddManyParams.body.toBuilder()
                additionalHeaders = contractRateCardRateAddManyParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    contractRateCardRateAddManyParams.additionalQueryParams.toBuilder()
            }

        fun rateCardId(rateCardId: String) = apply { body.rateCardId(rateCardId) }

        fun rateCardId(rateCardId: JsonField<String>) = apply { body.rateCardId(rateCardId) }

        fun rates(rates: List<Rate>) = apply { body.rates(rates) }

        fun rates(rates: JsonField<List<Rate>>) = apply { body.rates(rates) }

        fun addRate(rate: Rate) = apply { body.addRate(rate) }

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

        fun build(): ContractRateCardRateAddManyParams =
            ContractRateCardRateAddManyParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Rate
    @JsonCreator
    private constructor(
        @JsonProperty("entitled")
        @ExcludeMissing
        private val entitled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
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
         * "The Metronome ID of the credit type to associate with price, defaults to USD (cents) if
         * not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use the
         * credit type of associated rates."
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
         * "The Metronome ID of the credit type to associate with price, defaults to USD (cents) if
         * not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use the
         * credit type of associated rates."
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

        fun validate(): Rate = apply {
            if (validated) {
                return@apply
            }

            entitled()
            productId()
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

        /** A builder for [Rate]. */
        class Builder internal constructor() {

            private var entitled: JsonField<Boolean>? = null
            private var productId: JsonField<String>? = null
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
            internal fun from(rate: Rate) = apply {
                entitled = rate.entitled
                productId = rate.productId
                rateType = rate.rateType
                startingAt = rate.startingAt
                commitRate = rate.commitRate
                creditTypeId = rate.creditTypeId
                customRate = rate.customRate
                endingBefore = rate.endingBefore
                isProrated = rate.isProrated
                price = rate.price
                pricingGroupValues = rate.pricingGroupValues
                quantity = rate.quantity
                tiers = rate.tiers.map { it.toMutableList() }
                useListPrices = rate.useListPrices
                additionalProperties = rate.additionalProperties.toMutableMap()
            }

            fun entitled(entitled: Boolean) = entitled(JsonField.of(entitled))

            fun entitled(entitled: JsonField<Boolean>) = apply { this.entitled = entitled }

            /** ID of the product to add a rate for */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /** ID of the product to add a rate for */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

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
             * "The Metronome ID of the credit type to associate with price, defaults to USD (cents)
             * if not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use
             * the credit type of associated rates."
             */
            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            /**
             * "The Metronome ID of the credit type to associate with price, defaults to USD (cents)
             * if not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use
             * the credit type of associated rates."
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

            fun build(): Rate =
                Rate(
                    checkRequired("entitled", entitled),
                    checkRequired("productId", productId),
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

        class RateType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val FLAT = of("FLAT")

                @JvmField val PERCENTAGE = of("PERCENTAGE")

                @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

                @JvmField val TIERED = of("TIERED")

                @JvmField val CUSTOM = of("CUSTOM")

                @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
            }

            /** An enum containing [RateType]'s known values. */
            enum class Known {
                FLAT,
                PERCENTAGE,
                SUBSCRIPTION,
                TIERED,
                CUSTOM,
            }

            /**
             * An enum containing [RateType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RateType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FLAT,
                PERCENTAGE,
                SUBSCRIPTION,
                TIERED,
                CUSTOM,
                /**
                 * An enum member indicating that [RateType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    FLAT -> Value.FLAT
                    PERCENTAGE -> Value.PERCENTAGE
                    SUBSCRIPTION -> Value.SUBSCRIPTION
                    TIERED -> Value.TIERED
                    CUSTOM -> Value.CUSTOM
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
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
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
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

            @JsonProperty("rate_type")
            @ExcludeMissing
            fun _rateType(): JsonField<RateType> = rateType

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

            /** A builder for [CommitRate]. */
            class Builder internal constructor() {

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
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

                /** An enum containing [RateType]'s known values. */
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

                /**
                 * An enum containing [RateType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [RateType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
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
                    /**
                     * An enum member indicating that [RateType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
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

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
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

            /** A builder for [CustomRate]. */
            class Builder internal constructor() {

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
         * Optional. List of pricing group key value pairs which will be used to calculate the
         * price.
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

            /** A builder for [PricingGroupValues]. */
            class Builder internal constructor() {

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): PricingGroupValues =
                    PricingGroupValues(additionalProperties.toImmutable())
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

            override fun toString() =
                "PricingGroupValues{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Rate && entitled == other.entitled && productId == other.productId && rateType == other.rateType && startingAt == other.startingAt && commitRate == other.commitRate && creditTypeId == other.creditTypeId && customRate == other.customRate && endingBefore == other.endingBefore && isProrated == other.isProrated && price == other.price && pricingGroupValues == other.pricingGroupValues && quantity == other.quantity && tiers == other.tiers && useListPrices == other.useListPrices && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entitled, productId, rateType, startingAt, commitRate, creditTypeId, customRate, endingBefore, isProrated, price, pricingGroupValues, quantity, tiers, useListPrices, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rate{entitled=$entitled, productId=$productId, rateType=$rateType, startingAt=$startingAt, commitRate=$commitRate, creditTypeId=$creditTypeId, customRate=$customRate, endingBefore=$endingBefore, isProrated=$isProrated, price=$price, pricingGroupValues=$pricingGroupValues, quantity=$quantity, tiers=$tiers, useListPrices=$useListPrices, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardRateAddManyParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractRateCardRateAddManyParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
