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
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
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
    private val commitRate: CommitRate?,
    private val creditTypeId: String?,
    private val customRate: CustomRate?,
    private val endingBefore: OffsetDateTime?,
    private val isProrated: Boolean?,
    private val price: Double?,
    private val pricingGroupValues: PricingGroupValues?,
    private val quantity: Double?,
    private val tiers: List<Tier>?,
    private val useListPrices: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun entitled(): Boolean = entitled

    fun productId(): String = productId

    fun rateCardId(): String = rateCardId

    fun rateType(): RateType = rateType

    fun startingAt(): OffsetDateTime = startingAt

    fun commitRate(): Optional<CommitRate> = Optional.ofNullable(commitRate)

    fun creditTypeId(): Optional<String> = Optional.ofNullable(creditTypeId)

    fun customRate(): Optional<CustomRate> = Optional.ofNullable(customRate)

    fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

    fun isProrated(): Optional<Boolean> = Optional.ofNullable(isProrated)

    fun price(): Optional<Double> = Optional.ofNullable(price)

    fun pricingGroupValues(): Optional<PricingGroupValues> = Optional.ofNullable(pricingGroupValues)

    fun quantity(): Optional<Double> = Optional.ofNullable(quantity)

    fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers)

    fun useListPrices(): Optional<Boolean> = Optional.ofNullable(useListPrices)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): ContractRateCardRateAddBody {
        return ContractRateCardRateAddBody(
            entitled,
            productId,
            rateCardId,
            rateType,
            startingAt,
            commitRate,
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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = ContractRateCardRateAddBody.Builder::class)
    @NoAutoDetect
    class ContractRateCardRateAddBody
    internal constructor(
        private val entitled: Boolean?,
        private val productId: String?,
        private val rateCardId: String?,
        private val rateType: RateType?,
        private val startingAt: OffsetDateTime?,
        private val commitRate: CommitRate?,
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
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
         */
        @JsonProperty("commit_rate") fun commitRate(): CommitRate? = commitRate

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

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
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
            private var commitRate: CommitRate? = null
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
                this.commitRate = contractRateCardRateAddBody.commitRate
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
             * A distinct rate on the rate card. You can choose to use this rate rather than list
             * rate when consuming a credit or commit.
             */
            @JsonProperty("commit_rate")
            fun commitRate(commitRate: CommitRate) = apply { this.commitRate = commitRate }

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

            /**
             * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set
             * to true.
             */
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
                    commitRate,
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

        private var entitled: Boolean? = null
        private var productId: String? = null
        private var rateCardId: String? = null
        private var rateType: RateType? = null
        private var startingAt: OffsetDateTime? = null
        private var commitRate: CommitRate? = null
        private var creditTypeId: String? = null
        private var customRate: CustomRate? = null
        private var endingBefore: OffsetDateTime? = null
        private var isProrated: Boolean? = null
        private var price: Double? = null
        private var pricingGroupValues: PricingGroupValues? = null
        private var quantity: Double? = null
        private var tiers: MutableList<Tier> = mutableListOf()
        private var useListPrices: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractRateCardRateAddParams: ContractRateCardRateAddParams) = apply {
            entitled = contractRateCardRateAddParams.entitled
            productId = contractRateCardRateAddParams.productId
            rateCardId = contractRateCardRateAddParams.rateCardId
            rateType = contractRateCardRateAddParams.rateType
            startingAt = contractRateCardRateAddParams.startingAt
            commitRate = contractRateCardRateAddParams.commitRate
            creditTypeId = contractRateCardRateAddParams.creditTypeId
            customRate = contractRateCardRateAddParams.customRate
            endingBefore = contractRateCardRateAddParams.endingBefore
            isProrated = contractRateCardRateAddParams.isProrated
            price = contractRateCardRateAddParams.price
            pricingGroupValues = contractRateCardRateAddParams.pricingGroupValues
            quantity = contractRateCardRateAddParams.quantity
            tiers = contractRateCardRateAddParams.tiers?.toMutableList() ?: mutableListOf()
            useListPrices = contractRateCardRateAddParams.useListPrices
            additionalHeaders = contractRateCardRateAddParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractRateCardRateAddParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                contractRateCardRateAddParams.additionalBodyProperties.toMutableMap()
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
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
         */
        fun commitRate(commitRate: CommitRate) = apply { this.commitRate = commitRate }

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

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): ContractRateCardRateAddParams =
            ContractRateCardRateAddParams(
                checkNotNull(entitled) { "`entitled` is required but was not set" },
                checkNotNull(productId) { "`productId` is required but was not set" },
                checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                checkNotNull(rateType) { "`rateType` is required but was not set" },
                checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                commitRate,
                creditTypeId,
                customRate,
                endingBefore,
                isProrated,
                price,
                pricingGroupValues,
                quantity,
                tiers.toImmutable().ifEmpty { null },
                useListPrices,
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

            return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
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

    /**
     * A distinct rate on the rate card. You can choose to use this rate rather than list rate when
     * consuming a credit or commit.
     */
    @JsonDeserialize(builder = CommitRate.Builder::class)
    @NoAutoDetect
    class CommitRate
    private constructor(
        private val rateType: RateType?,
        private val price: Double?,
        private val tiers: List<Tier>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("rate_type") fun rateType(): RateType? = rateType

        /** Commit rate price. For FLAT rate_type, this must be >=0. */
        @JsonProperty("price") fun price(): Double? = price

        /** Only set for TIERED rate_type. */
        @JsonProperty("tiers") fun tiers(): List<Tier>? = tiers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var rateType: RateType? = null
            private var price: Double? = null
            private var tiers: List<Tier>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commitRate: CommitRate) = apply {
                this.rateType = commitRate.rateType
                this.price = commitRate.price
                this.tiers = commitRate.tiers
                additionalProperties(commitRate.additionalProperties)
            }

            @JsonProperty("rate_type")
            fun rateType(rateType: RateType) = apply { this.rateType = rateType }

            /** Commit rate price. For FLAT rate_type, this must be >=0. */
            @JsonProperty("price") fun price(price: Double) = apply { this.price = price }

            /** Only set for TIERED rate_type. */
            @JsonProperty("tiers") fun tiers(tiers: List<Tier>) = apply { this.tiers = tiers }

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

            fun build(): CommitRate =
                CommitRate(
                    checkNotNull(rateType) { "`rateType` is required but was not set" },
                    price,
                    tiers?.toImmutable(),
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

                @JvmField val FLAT = RateType(JsonField.of("flat"))

                @JvmField val PERCENTAGE = RateType(JsonField.of("PERCENTAGE"))

                @JvmField val PERCENTAGE = RateType(JsonField.of("percentage"))

                @JvmField val SUBSCRIPTION = RateType(JsonField.of("SUBSCRIPTION"))

                @JvmField val SUBSCRIPTION = RateType(JsonField.of("subscription"))

                @JvmField val TIERED = RateType(JsonField.of("TIERED"))

                @JvmField val TIERED = RateType(JsonField.of("tiered"))

                @JvmField val CUSTOM = RateType(JsonField.of("CUSTOM"))

                @JvmField val CUSTOM = RateType(JsonField.of("custom"))

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

        return /* spotless:off */ other is ContractRateCardRateAddParams && entitled == other.entitled && productId == other.productId && rateCardId == other.rateCardId && rateType == other.rateType && startingAt == other.startingAt && commitRate == other.commitRate && creditTypeId == other.creditTypeId && customRate == other.customRate && endingBefore == other.endingBefore && isProrated == other.isProrated && price == other.price && pricingGroupValues == other.pricingGroupValues && quantity == other.quantity && tiers == other.tiers && useListPrices == other.useListPrices && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(entitled, productId, rateCardId, rateType, startingAt, commitRate, creditTypeId, customRate, endingBefore, isProrated, price, pricingGroupValues, quantity, tiers, useListPrices, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ContractRateCardRateAddParams{entitled=$entitled, productId=$productId, rateCardId=$rateCardId, rateType=$rateType, startingAt=$startingAt, commitRate=$commitRate, creditTypeId=$creditTypeId, customRate=$customRate, endingBefore=$endingBefore, isProrated=$isProrated, price=$price, pricingGroupValues=$pricingGroupValues, quantity=$quantity, tiers=$tiers, useListPrices=$useListPrices, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
