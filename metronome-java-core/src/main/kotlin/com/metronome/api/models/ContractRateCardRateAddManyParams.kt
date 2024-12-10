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

class ContractRateCardRateAddManyParams
constructor(
    private val rateCardId: String,
    private val rates: List<Rate>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun rateCardId(): String = rateCardId

    fun rates(): List<Rate> = rates

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): ContractRateCardRateAddManyBody {
        return ContractRateCardRateAddManyBody(
            rateCardId,
            rates,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = ContractRateCardRateAddManyBody.Builder::class)
    @NoAutoDetect
    class ContractRateCardRateAddManyBody
    internal constructor(
        private val rateCardId: String?,
        private val rates: List<Rate>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("rate_card_id") fun rateCardId(): String? = rateCardId

        @JsonProperty("rates") fun rates(): List<Rate>? = rates

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var rateCardId: String? = null
            private var rates: List<Rate>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractRateCardRateAddManyBody: ContractRateCardRateAddManyBody) =
                apply {
                    this.rateCardId = contractRateCardRateAddManyBody.rateCardId
                    this.rates = contractRateCardRateAddManyBody.rates
                    additionalProperties(contractRateCardRateAddManyBody.additionalProperties)
                }

            @JsonProperty("rate_card_id")
            fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

            @JsonProperty("rates") fun rates(rates: List<Rate>) = apply { this.rates = rates }

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

        private var rateCardId: String? = null
        private var rates: MutableList<Rate> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractRateCardRateAddManyParams: ContractRateCardRateAddManyParams) =
            apply {
                rateCardId = contractRateCardRateAddManyParams.rateCardId
                rates = contractRateCardRateAddManyParams.rates.toMutableList()
                additionalHeaders = contractRateCardRateAddManyParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    contractRateCardRateAddManyParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    contractRateCardRateAddManyParams.additionalBodyProperties.toMutableMap()
            }

        fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

        fun rates(rates: List<Rate>) = apply {
            this.rates.clear()
            this.rates.addAll(rates)
        }

        fun addRate(rate: Rate) = apply { this.rates.add(rate) }

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

        fun build(): ContractRateCardRateAddManyParams =
            ContractRateCardRateAddManyParams(
                checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                rates.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Rate.Builder::class)
    @NoAutoDetect
    class Rate
    private constructor(
        private val productId: String?,
        private val pricingGroupValues: PricingGroupValues?,
        private val startingAt: OffsetDateTime?,
        private val endingBefore: OffsetDateTime?,
        private val entitled: Boolean?,
        private val rateType: RateType?,
        private val price: Double?,
        private val creditTypeId: String?,
        private val quantity: Double?,
        private val isProrated: Boolean?,
        private val useListPrices: Boolean?,
        private val tiers: List<Tier>?,
        private val customRate: CustomRate?,
        private val commitRate: CommitRate?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** ID of the product to add a rate for */
        @JsonProperty("product_id") fun productId(): String? = productId

        /**
         * Optional. List of pricing group key value pairs which will be used to calculate the
         * price.
         */
        @JsonProperty("pricing_group_values")
        fun pricingGroupValues(): PricingGroupValues? = pricingGroupValues

        /** inclusive effective date */
        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

        /** exclusive end date */
        @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

        @JsonProperty("entitled") fun entitled(): Boolean? = entitled

        @JsonProperty("rate_type") fun rateType(): RateType? = rateType

        /**
         * Default price. For FLAT and SUBSCRIPTION rate_type, this must be >=0. For PERCENTAGE
         * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        @JsonProperty("price") fun price(): Double? = price

        /**
         * "The Metronome ID of the credit type to associate with price, defaults to USD (cents) if
         * not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use the
         * credit type of associated rates."
         */
        @JsonProperty("credit_type_id") fun creditTypeId(): String? = creditTypeId

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        @JsonProperty("quantity") fun quantity(): Double? = quantity

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
        @JsonProperty("is_prorated") fun isProrated(): Boolean? = isProrated

        /**
         * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using
         * list prices rather than the standard rates for this product on the contract.
         */
        @JsonProperty("use_list_prices") fun useListPrices(): Boolean? = useListPrices

        /** Only set for TIERED rate_type. */
        @JsonProperty("tiers") fun tiers(): List<Tier>? = tiers

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        @JsonProperty("custom_rate") fun customRate(): CustomRate? = customRate

        /**
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
         */
        @JsonProperty("commit_rate") fun commitRate(): CommitRate? = commitRate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var productId: String? = null
            private var pricingGroupValues: PricingGroupValues? = null
            private var startingAt: OffsetDateTime? = null
            private var endingBefore: OffsetDateTime? = null
            private var entitled: Boolean? = null
            private var rateType: RateType? = null
            private var price: Double? = null
            private var creditTypeId: String? = null
            private var quantity: Double? = null
            private var isProrated: Boolean? = null
            private var useListPrices: Boolean? = null
            private var tiers: List<Tier>? = null
            private var customRate: CustomRate? = null
            private var commitRate: CommitRate? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rate: Rate) = apply {
                this.productId = rate.productId
                this.pricingGroupValues = rate.pricingGroupValues
                this.startingAt = rate.startingAt
                this.endingBefore = rate.endingBefore
                this.entitled = rate.entitled
                this.rateType = rate.rateType
                this.price = rate.price
                this.creditTypeId = rate.creditTypeId
                this.quantity = rate.quantity
                this.isProrated = rate.isProrated
                this.useListPrices = rate.useListPrices
                this.tiers = rate.tiers
                this.customRate = rate.customRate
                this.commitRate = rate.commitRate
                additionalProperties(rate.additionalProperties)
            }

            /** ID of the product to add a rate for */
            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

            /**
             * Optional. List of pricing group key value pairs which will be used to calculate the
             * price.
             */
            @JsonProperty("pricing_group_values")
            fun pricingGroupValues(pricingGroupValues: PricingGroupValues) = apply {
                this.pricingGroupValues = pricingGroupValues
            }

            /** inclusive effective date */
            @JsonProperty("starting_at")
            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

            /** exclusive end date */
            @JsonProperty("ending_before")
            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
            }

            @JsonProperty("entitled")
            fun entitled(entitled: Boolean) = apply { this.entitled = entitled }

            @JsonProperty("rate_type")
            fun rateType(rateType: RateType) = apply { this.rateType = rateType }

            /**
             * Default price. For FLAT and SUBSCRIPTION rate_type, this must be >=0. For PERCENTAGE
             * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and
             * <=1.
             */
            @JsonProperty("price") fun price(price: Double) = apply { this.price = price }

            /**
             * "The Metronome ID of the credit type to associate with price, defaults to USD (cents)
             * if not passed. Used by all rate_types except type PERCENTAGE. PERCENTAGE rates use
             * the credit type of associated rates."
             */
            @JsonProperty("credit_type_id")
            fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

            /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
            @JsonProperty("quantity")
            fun quantity(quantity: Double) = apply { this.quantity = quantity }

            /**
             * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set
             * to true.
             */
            @JsonProperty("is_prorated")
            fun isProrated(isProrated: Boolean) = apply { this.isProrated = isProrated }

            /**
             * Only set for PERCENTAGE rate_type. Defaults to false. If true, rate is computed using
             * list prices rather than the standard rates for this product on the contract.
             */
            @JsonProperty("use_list_prices")
            fun useListPrices(useListPrices: Boolean) = apply { this.useListPrices = useListPrices }

            /** Only set for TIERED rate_type. */
            @JsonProperty("tiers") fun tiers(tiers: List<Tier>) = apply { this.tiers = tiers }

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            @JsonProperty("custom_rate")
            fun customRate(customRate: CustomRate) = apply { this.customRate = customRate }

            /**
             * A distinct rate on the rate card. You can choose to use this rate rather than list
             * rate when consuming a credit or commit.
             */
            @JsonProperty("commit_rate")
            fun commitRate(commitRate: CommitRate) = apply { this.commitRate = commitRate }

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
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    pricingGroupValues,
                    checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                    endingBefore,
                    checkNotNull(entitled) { "`entitled` is required but was not set" },
                    checkNotNull(rateType) { "`rateType` is required but was not set" },
                    price,
                    creditTypeId,
                    quantity,
                    isProrated,
                    useListPrices,
                    tiers?.toImmutable(),
                    customRate,
                    commitRate,
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
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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
         * Optional. List of pricing group key value pairs which will be used to calculate the
         * price.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
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

            return /* spotless:off */ other is Rate && productId == other.productId && pricingGroupValues == other.pricingGroupValues && startingAt == other.startingAt && endingBefore == other.endingBefore && entitled == other.entitled && rateType == other.rateType && price == other.price && creditTypeId == other.creditTypeId && quantity == other.quantity && isProrated == other.isProrated && useListPrices == other.useListPrices && tiers == other.tiers && customRate == other.customRate && commitRate == other.commitRate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, pricingGroupValues, startingAt, endingBefore, entitled, rateType, price, creditTypeId, quantity, isProrated, useListPrices, tiers, customRate, commitRate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rate{productId=$productId, pricingGroupValues=$pricingGroupValues, startingAt=$startingAt, endingBefore=$endingBefore, entitled=$entitled, rateType=$rateType, price=$price, creditTypeId=$creditTypeId, quantity=$quantity, isProrated=$isProrated, useListPrices=$useListPrices, tiers=$tiers, customRate=$customRate, commitRate=$commitRate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardRateAddManyParams && rateCardId == other.rateCardId && rates == other.rates && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(rateCardId, rates, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ContractRateCardRateAddManyParams{rateCardId=$rateCardId, rates=$rates, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
