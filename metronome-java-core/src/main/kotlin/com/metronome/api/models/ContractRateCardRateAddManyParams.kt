// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ContractRateCardRateAddManyParams
constructor(
    private val body: ContractRateCardRateAddManyBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun rateCardId(): String = body.rateCardId()

    fun rates(): List<Rate> = body.rates()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): ContractRateCardRateAddManyBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractRateCardRateAddManyBody
    @JsonCreator
    internal constructor(
        @JsonProperty("rate_card_id") private val rateCardId: String,
        @JsonProperty("rates") private val rates: List<Rate>,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("rate_card_id") fun rateCardId(): String = rateCardId

        @JsonProperty("rates") fun rates(): List<Rate> = rates

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var rateCardId: String? = null
            private var rates: MutableList<Rate>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractRateCardRateAddManyBody: ContractRateCardRateAddManyBody) =
                apply {
                    rateCardId = contractRateCardRateAddManyBody.rateCardId
                    rates = contractRateCardRateAddManyBody.rates.toMutableList()
                    additionalProperties =
                        contractRateCardRateAddManyBody.additionalProperties.toMutableMap()
                }

            fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

            fun rates(rates: List<Rate>) = apply { this.rates = rates.toMutableList() }

            fun addRate(rate: Rate) = apply {
                rates = (rates ?: mutableListOf()).apply { add(rate) }
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
                    checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                    checkNotNull(rates) { "`rates` is required but was not set" }.toImmutable(),
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

    @NoAutoDetect
    class Builder {

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

        fun rates(rates: List<Rate>) = apply { body.rates(rates) }

        fun addRate(rate: Rate) = apply { body.addRate(rate) }

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
        @JsonProperty("entitled") private val entitled: Boolean,
        @JsonProperty("product_id") private val productId: String,
        @JsonProperty("rate_type") private val rateType: RateType,
        @JsonProperty("starting_at") private val startingAt: OffsetDateTime,
        @JsonProperty("commit_rate") private val commitRate: CommitRate?,
        @JsonProperty("credit_type_id") private val creditTypeId: String?,
        @JsonProperty("custom_rate") private val customRate: CustomRate?,
        @JsonProperty("ending_before") private val endingBefore: OffsetDateTime?,
        @JsonProperty("is_prorated") private val isProrated: Boolean?,
        @JsonProperty("price") private val price: Double?,
        @JsonProperty("pricing_group_values") private val pricingGroupValues: PricingGroupValues?,
        @JsonProperty("quantity") private val quantity: Double?,
        @JsonProperty("tiers") private val tiers: List<Tier>?,
        @JsonProperty("use_list_prices") private val useListPrices: Boolean?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("entitled") fun entitled(): Boolean = entitled

        /** ID of the product to add a rate for */
        @JsonProperty("product_id") fun productId(): String = productId

        @JsonProperty("rate_type") fun rateType(): RateType = rateType

        /** inclusive effective date */
        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime = startingAt

        /**
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
         */
        @JsonProperty("commit_rate")
        fun commitRate(): Optional<CommitRate> = Optional.ofNullable(commitRate)

        /**
         * "The Metronome ID of the credit type to associate with price, defaults to USD (cents) if
         * not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use the
         * credit type of associated rates."
         */
        @JsonProperty("credit_type_id")
        fun creditTypeId(): Optional<String> = Optional.ofNullable(creditTypeId)

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        @JsonProperty("custom_rate")
        fun customRate(): Optional<CustomRate> = Optional.ofNullable(customRate)

        /** exclusive end date */
        @JsonProperty("ending_before")
        fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
        @JsonProperty("is_prorated")
        fun isProrated(): Optional<Boolean> = Optional.ofNullable(isProrated)

        /**
         * Default price. For FLAT and SUBSCRIPTION rate_type, this must be >=0. For PERCENTAGE
         * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        @JsonProperty("price") fun price(): Optional<Double> = Optional.ofNullable(price)

        /**
         * Optional. List of pricing group key value pairs which will be used to calculate the
         * price.
         */
        @JsonProperty("pricing_group_values")
        fun pricingGroupValues(): Optional<PricingGroupValues> =
            Optional.ofNullable(pricingGroupValues)

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        @JsonProperty("quantity") fun quantity(): Optional<Double> = Optional.ofNullable(quantity)

        /** Only set for TIERED rate_type. */
        @JsonProperty("tiers") fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers)

        /**
         * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using
         * list prices rather than the standard rates for this product on the contract.
         */
        @JsonProperty("use_list_prices")
        fun useListPrices(): Optional<Boolean> = Optional.ofNullable(useListPrices)

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
            private var tiers: MutableList<Tier>? = null
            private var useListPrices: Boolean? = null
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
                tiers = rate.tiers?.toMutableList()
                useListPrices = rate.useListPrices
                additionalProperties = rate.additionalProperties.toMutableMap()
            }

            fun entitled(entitled: Boolean) = apply { this.entitled = entitled }

            /** ID of the product to add a rate for */
            fun productId(productId: String) = apply { this.productId = productId }

            fun rateType(rateType: RateType) = apply { this.rateType = rateType }

            /** inclusive effective date */
            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

            /**
             * A distinct rate on the rate card. You can choose to use this rate rather than list
             * rate when consuming a credit or commit.
             */
            fun commitRate(commitRate: CommitRate) = apply { this.commitRate = commitRate }

            /**
             * "The Metronome ID of the credit type to associate with price, defaults to USD (cents)
             * if not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use
             * the credit type of associated rates."
             */
            fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            fun customRate(customRate: CustomRate) = apply { this.customRate = customRate }

            /** exclusive end date */
            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
            }

            /**
             * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set
             * to true.
             */
            fun isProrated(isProrated: Boolean) = apply { this.isProrated = isProrated }

            /**
             * Default price. For FLAT and SUBSCRIPTION rate_type, this must be >=0. For PERCENTAGE
             * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and
             * <=1.
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
            fun tiers(tiers: List<Tier>) = apply { this.tiers = tiers.toMutableList() }

            /** Only set for TIERED rate_type. */
            fun addTier(tier: Tier) = apply {
                tiers = (tiers ?: mutableListOf()).apply { add(tier) }
            }

            /**
             * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using
             * list prices rather than the standard rates for this product on the contract.
             */
            fun useListPrices(useListPrices: Boolean) = apply { this.useListPrices = useListPrices }

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
                    checkNotNull(entitled) { "`entitled` is required but was not set" },
                    checkNotNull(productId) { "`productId` is required but was not set" },
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
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
         */
        @NoAutoDetect
        class CommitRate
        @JsonCreator
        private constructor(
            @JsonProperty("rate_type") private val rateType: RateType,
            @JsonProperty("price") private val price: Double?,
            @JsonProperty("tiers") private val tiers: List<Tier>?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("rate_type") fun rateType(): RateType = rateType

            /** Commit rate price. For FLAT rate_type, this must be >=0. */
            @JsonProperty("price") fun price(): Optional<Double> = Optional.ofNullable(price)

            /** Only set for TIERED rate_type. */
            @JsonProperty("tiers") fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers)

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
                private var tiers: MutableList<Tier>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(commitRate: CommitRate) = apply {
                    rateType = commitRate.rateType
                    price = commitRate.price
                    tiers = commitRate.tiers?.toMutableList()
                    additionalProperties = commitRate.additionalProperties.toMutableMap()
                }

                fun rateType(rateType: RateType) = apply { this.rateType = rateType }

                /** Commit rate price. For FLAT rate_type, this must be >=0. */
                fun price(price: Double) = apply { this.price = price }

                /** Only set for TIERED rate_type. */
                fun tiers(tiers: List<Tier>) = apply { this.tiers = tiers.toMutableList() }

                /** Only set for TIERED rate_type. */
                fun addTier(tier: Tier) = apply {
                    tiers = (tiers ?: mutableListOf()).apply { add(tier) }
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
