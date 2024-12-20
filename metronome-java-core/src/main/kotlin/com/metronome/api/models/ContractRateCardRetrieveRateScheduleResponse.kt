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
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ContractRateCardRetrieveRateScheduleResponse
@JsonCreator
private constructor(
    @JsonProperty("next_page")
    @ExcludeMissing
    private val nextPage: JsonField<String> = JsonMissing.of(),
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<Data>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

    fun data(): List<Data> = data.getRequired("data")

    @JsonProperty("next_page") @ExcludeMissing fun _nextPage() = nextPage

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ContractRateCardRetrieveRateScheduleResponse = apply {
        if (!validated) {
            nextPage()
            data().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var nextPage: JsonField<String> = JsonMissing.of()
        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractRateCardRetrieveRateScheduleResponse:
                ContractRateCardRetrieveRateScheduleResponse
        ) = apply {
            nextPage = contractRateCardRetrieveRateScheduleResponse.nextPage
            data = contractRateCardRetrieveRateScheduleResponse.data
            additionalProperties =
                contractRateCardRetrieveRateScheduleResponse.additionalProperties.toMutableMap()
        }

        fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

        fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

        fun data(data: List<Data>) = data(JsonField.of(data))

        fun data(data: JsonField<List<Data>>) = apply { this.data = data }

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

        fun build(): ContractRateCardRetrieveRateScheduleResponse =
            ContractRateCardRetrieveRateScheduleResponse(
                nextPage,
                data.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_name")
        @ExcludeMissing
        private val productName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_tags")
        @ExcludeMissing
        private val productTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("product_custom_fields")
        @ExcludeMissing
        private val productCustomFields: JsonField<ProductCustomFields> = JsonMissing.of(),
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        private val pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("entitled")
        @ExcludeMissing
        private val entitled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("rate") @ExcludeMissing private val rate: JsonField<Rate> = JsonMissing.of(),
        @JsonProperty("commit_rate")
        @ExcludeMissing
        private val commitRate: JsonField<CommitRate> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun productId(): String = productId.getRequired("product_id")

        fun productName(): String = productName.getRequired("product_name")

        fun productTags(): List<String> = productTags.getRequired("product_tags")

        fun productCustomFields(): ProductCustomFields =
            productCustomFields.getRequired("product_custom_fields")

        fun pricingGroupValues(): Optional<PricingGroupValues> =
            Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        fun entitled(): Boolean = entitled.getRequired("entitled")

        fun rate(): Rate = rate.getRequired("rate")

        /**
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
         */
        fun commitRate(): Optional<CommitRate> =
            Optional.ofNullable(commitRate.getNullable("commit_rate"))

        @JsonProperty("product_id") @ExcludeMissing fun _productId() = productId

        @JsonProperty("product_name") @ExcludeMissing fun _productName() = productName

        @JsonProperty("product_tags") @ExcludeMissing fun _productTags() = productTags

        @JsonProperty("product_custom_fields")
        @ExcludeMissing
        fun _productCustomFields() = productCustomFields

        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        fun _pricingGroupValues() = pricingGroupValues

        @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

        @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

        @JsonProperty("entitled") @ExcludeMissing fun _entitled() = entitled

        @JsonProperty("rate") @ExcludeMissing fun _rate() = rate

        /**
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
         */
        @JsonProperty("commit_rate") @ExcludeMissing fun _commitRate() = commitRate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (!validated) {
                productId()
                productName()
                productTags()
                productCustomFields().validate()
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
            private var productCustomFields: JsonField<ProductCustomFields> = JsonMissing.of()
            private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var entitled: JsonField<Boolean> = JsonMissing.of()
            private var rate: JsonField<Rate> = JsonMissing.of()
            private var commitRate: JsonField<CommitRate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                productId = data.productId
                productName = data.productName
                productTags = data.productTags
                productCustomFields = data.productCustomFields
                pricingGroupValues = data.pricingGroupValues
                startingAt = data.startingAt
                endingBefore = data.endingBefore
                entitled = data.entitled
                rate = data.rate
                commitRate = data.commitRate
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun productName(productName: String) = productName(JsonField.of(productName))

            fun productName(productName: JsonField<String>) = apply {
                this.productName = productName
            }

            fun productTags(productTags: List<String>) = productTags(JsonField.of(productTags))

            fun productTags(productTags: JsonField<List<String>>) = apply {
                this.productTags = productTags
            }

            fun productCustomFields(productCustomFields: ProductCustomFields) =
                productCustomFields(JsonField.of(productCustomFields))

            fun productCustomFields(productCustomFields: JsonField<ProductCustomFields>) = apply {
                this.productCustomFields = productCustomFields
            }

            fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                pricingGroupValues(JsonField.of(pricingGroupValues))

            fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                this.pricingGroupValues = pricingGroupValues
            }

            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun entitled(entitled: Boolean) = entitled(JsonField.of(entitled))

            fun entitled(entitled: JsonField<Boolean>) = apply { this.entitled = entitled }

            fun rate(rate: Rate) = rate(JsonField.of(rate))

            fun rate(rate: JsonField<Rate>) = apply { this.rate = rate }

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

            fun build(): Data =
                Data(
                    productId,
                    productName,
                    productTags.map { it.toImmutable() },
                    productCustomFields,
                    pricingGroupValues,
                    startingAt,
                    endingBefore,
                    entitled,
                    rate,
                    commitRate,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class ProductCustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ProductCustomFields = apply {
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
                internal fun from(productCustomFields: ProductCustomFields) = apply {
                    additionalProperties = productCustomFields.additionalProperties.toMutableMap()
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

                fun build(): ProductCustomFields =
                    ProductCustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProductCustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProductCustomFields{additionalProperties=$additionalProperties}"
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

            @JsonProperty("rate_type") @ExcludeMissing fun _rateType() = rateType

            /** Commit rate price. For FLAT rate_type, this must be >=0. */
            @JsonProperty("price") @ExcludeMissing fun _price() = price

            /** Only set for TIERED rate_type. */
            @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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
                    rateType = commitRate.rateType
                    price = commitRate.price
                    tiers = commitRate.tiers
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
                fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

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

            return /* spotless:off */ other is Data && productId == other.productId && productName == other.productName && productTags == other.productTags && productCustomFields == other.productCustomFields && pricingGroupValues == other.pricingGroupValues && startingAt == other.startingAt && endingBefore == other.endingBefore && entitled == other.entitled && rate == other.rate && commitRate == other.commitRate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, productName, productTags, productCustomFields, pricingGroupValues, startingAt, endingBefore, entitled, rate, commitRate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{productId=$productId, productName=$productName, productTags=$productTags, productCustomFields=$productCustomFields, pricingGroupValues=$pricingGroupValues, startingAt=$startingAt, endingBefore=$endingBefore, entitled=$entitled, rate=$rate, commitRate=$commitRate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardRetrieveRateScheduleResponse && nextPage == other.nextPage && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(nextPage, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractRateCardRetrieveRateScheduleResponse{nextPage=$nextPage, data=$data, additionalProperties=$additionalProperties}"
}
