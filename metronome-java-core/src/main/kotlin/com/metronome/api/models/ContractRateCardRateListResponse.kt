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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ContractRateCardRateListResponse.Builder::class)
@NoAutoDetect
class ContractRateCardRateListResponse
private constructor(
    private val productId: JsonField<String>,
    private val productName: JsonField<String>,
    private val productTags: JsonField<List<String>>,
    private val pricingGroupValues: JsonField<PricingGroupValues>,
    private val startingAt: JsonField<OffsetDateTime>,
    private val endingBefore: JsonField<OffsetDateTime>,
    private val entitled: JsonField<Boolean>,
    private val rate: JsonField<Rate>,
    private val commitRate: JsonField<CommitRate>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun productId(): String = productId.getRequired("product_id")

    fun productName(): String = productName.getRequired("product_name")

    fun productTags(): List<String> = productTags.getRequired("product_tags")

    fun pricingGroupValues(): Optional<PricingGroupValues> =
        Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

    fun endingBefore(): Optional<OffsetDateTime> =
        Optional.ofNullable(endingBefore.getNullable("ending_before"))

    fun entitled(): Boolean = entitled.getRequired("entitled")

    fun rate(): Rate = rate.getRequired("rate")

    /**
     * A distinct rate on the rate card. You can choose to use this rate rather than list rate when
     * consuming a credit or commit. This feature requires opt-in before it can be used. Please
     * contact Metronome support to enable this feature.
     */
    fun commitRate(): Optional<CommitRate> =
        Optional.ofNullable(commitRate.getNullable("commit_rate"))

    @JsonProperty("product_id") @ExcludeMissing fun _productId() = productId

    @JsonProperty("product_name") @ExcludeMissing fun _productName() = productName

    @JsonProperty("product_tags") @ExcludeMissing fun _productTags() = productTags

    @JsonProperty("pricing_group_values")
    @ExcludeMissing
    fun _pricingGroupValues() = pricingGroupValues

    @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

    @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

    @JsonProperty("entitled") @ExcludeMissing fun _entitled() = entitled

    @JsonProperty("rate") @ExcludeMissing fun _rate() = rate

    /**
     * A distinct rate on the rate card. You can choose to use this rate rather than list rate when
     * consuming a credit or commit. This feature requires opt-in before it can be used. Please
     * contact Metronome support to enable this feature.
     */
    @JsonProperty("commit_rate") @ExcludeMissing fun _commitRate() = commitRate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ContractRateCardRateListResponse = apply {
        if (!validated) {
            productId()
            productName()
            productTags()
            pricingGroupValues().map { it.validate() }
            startingAt()
            endingBefore()
            entitled()
            rate().validate()
            commitRate().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var productId: JsonField<String> = JsonMissing.of()
        private var productName: JsonField<String> = JsonMissing.of()
        private var productTags: JsonField<List<String>> = JsonMissing.of()
        private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
        private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
        private var entitled: JsonField<Boolean> = JsonMissing.of()
        private var rate: JsonField<Rate> = JsonMissing.of()
        private var commitRate: JsonField<CommitRate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractRateCardRateListResponse: ContractRateCardRateListResponse) =
            apply {
                this.productId = contractRateCardRateListResponse.productId
                this.productName = contractRateCardRateListResponse.productName
                this.productTags = contractRateCardRateListResponse.productTags
                this.pricingGroupValues = contractRateCardRateListResponse.pricingGroupValues
                this.startingAt = contractRateCardRateListResponse.startingAt
                this.endingBefore = contractRateCardRateListResponse.endingBefore
                this.entitled = contractRateCardRateListResponse.entitled
                this.rate = contractRateCardRateListResponse.rate
                this.commitRate = contractRateCardRateListResponse.commitRate
                additionalProperties(contractRateCardRateListResponse.additionalProperties)
            }

        fun productId(productId: String) = productId(JsonField.of(productId))

        @JsonProperty("product_id")
        @ExcludeMissing
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        fun productName(productName: String) = productName(JsonField.of(productName))

        @JsonProperty("product_name")
        @ExcludeMissing
        fun productName(productName: JsonField<String>) = apply { this.productName = productName }

        fun productTags(productTags: List<String>) = productTags(JsonField.of(productTags))

        @JsonProperty("product_tags")
        @ExcludeMissing
        fun productTags(productTags: JsonField<List<String>>) = apply {
            this.productTags = productTags
        }

        fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
            pricingGroupValues(JsonField.of(pricingGroupValues))

        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
            this.pricingGroupValues = pricingGroupValues
        }

        fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

        @JsonProperty("starting_at")
        @ExcludeMissing
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            this.startingAt = startingAt
        }

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        @JsonProperty("ending_before")
        @ExcludeMissing
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
        }

        fun entitled(entitled: Boolean) = entitled(JsonField.of(entitled))

        @JsonProperty("entitled")
        @ExcludeMissing
        fun entitled(entitled: JsonField<Boolean>) = apply { this.entitled = entitled }

        fun rate(rate: Rate) = rate(JsonField.of(rate))

        @JsonProperty("rate")
        @ExcludeMissing
        fun rate(rate: JsonField<Rate>) = apply { this.rate = rate }

        /**
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit. This feature requires opt-in before it can be used.
         * Please contact Metronome support to enable this feature.
         */
        fun commitRate(commitRate: CommitRate) = commitRate(JsonField.of(commitRate))

        /**
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit. This feature requires opt-in before it can be used.
         * Please contact Metronome support to enable this feature.
         */
        @JsonProperty("commit_rate")
        @ExcludeMissing
        fun commitRate(commitRate: JsonField<CommitRate>) = apply { this.commitRate = commitRate }

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

        fun build(): ContractRateCardRateListResponse =
            ContractRateCardRateListResponse(
                productId,
                productName,
                productTags.map { it.toImmutable() },
                pricingGroupValues,
                startingAt,
                endingBefore,
                entitled,
                rate,
                commitRate,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * A distinct rate on the rate card. You can choose to use this rate rather than list rate when
     * consuming a credit or commit. This feature requires opt-in before it can be used. Please
     * contact Metronome support to enable this feature.
     */
    @JsonDeserialize(builder = CommitRate.Builder::class)
    @NoAutoDetect
    class CommitRate
    private constructor(
        private val rateType: JsonField<RateType>,
        private val price: JsonField<Double>,
        private val tiers: JsonField<List<Tier>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun rateType(): RateType = rateType.getRequired("rate_type")

        /** Commit rate price. For FLAT rate_type, this must be >=0. */
        fun price(): Optional<Double> = Optional.ofNullable(price.getNullable("price"))

        /** Only set for TIERED rate_type. */
        fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers.getNullable("tiers"))

        @JsonProperty("rate_type") @ExcludeMissing fun _rateType() = rateType

        /** Commit rate price. For FLAT rate_type, this must be >=0. */
        @JsonProperty("price") @ExcludeMissing fun _price() = price

        /** Only set for TIERED rate_type. */
        @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CommitRate = apply {
            if (!validated) {
                rateType()
                price()
                tiers().map { it.forEach { it.validate() } }
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
            private var tiers: JsonField<List<Tier>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commitRate: CommitRate) = apply {
                this.rateType = commitRate.rateType
                this.price = commitRate.price
                this.tiers = commitRate.tiers
                additionalProperties(commitRate.additionalProperties)
            }

            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            @JsonProperty("rate_type")
            @ExcludeMissing
            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /** Commit rate price. For FLAT rate_type, this must be >=0. */
            fun price(price: Double) = price(JsonField.of(price))

            /** Commit rate price. For FLAT rate_type, this must be >=0. */
            @JsonProperty("price")
            @ExcludeMissing
            fun price(price: JsonField<Double>) = apply { this.price = price }

            /** Only set for TIERED rate_type. */
            fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

            /** Only set for TIERED rate_type. */
            @JsonProperty("tiers")
            @ExcludeMissing
            fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

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
                    rateType,
                    price,
                    tiers.map { it.toImmutable() },
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

        return /* spotless:off */ other is ContractRateCardRateListResponse && productId == other.productId && productName == other.productName && productTags == other.productTags && pricingGroupValues == other.pricingGroupValues && startingAt == other.startingAt && endingBefore == other.endingBefore && entitled == other.entitled && rate == other.rate && commitRate == other.commitRate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(productId, productName, productTags, pricingGroupValues, startingAt, endingBefore, entitled, rate, commitRate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractRateCardRateListResponse{productId=$productId, productName=$productName, productTags=$productTags, pricingGroupValues=$pricingGroupValues, startingAt=$startingAt, endingBefore=$endingBefore, entitled=$entitled, rate=$rate, commitRate=$commitRate, additionalProperties=$additionalProperties}"
}
