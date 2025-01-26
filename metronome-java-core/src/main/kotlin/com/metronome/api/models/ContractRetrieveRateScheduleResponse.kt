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
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ContractRetrieveRateScheduleResponse
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<Data>> = JsonMissing.of(),
    @JsonProperty("next_page")
    @ExcludeMissing
    private val nextPage: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): List<Data> = data.getRequired("data")

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    @JsonProperty("next_page") @ExcludeMissing fun _nextPage(): JsonField<String> = nextPage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ContractRetrieveRateScheduleResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        nextPage()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var nextPage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractRetrieveRateScheduleResponse: ContractRetrieveRateScheduleResponse
        ) = apply {
            data = contractRetrieveRateScheduleResponse.data.map { it.toMutableList() }
            nextPage = contractRetrieveRateScheduleResponse.nextPage
            additionalProperties =
                contractRetrieveRateScheduleResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(data)
                }
        }

        fun nextPage(nextPage: String?) = nextPage(JsonField.ofNullable(nextPage))

        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.orElse(null))

        fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

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

        fun build(): ContractRetrieveRateScheduleResponse =
            ContractRetrieveRateScheduleResponse(
                checkRequired("data", data).map { it.toImmutable() },
                nextPage,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("entitled")
        @ExcludeMissing
        private val entitled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("list_rate")
        @ExcludeMissing
        private val listRate: JsonField<Rate> = JsonMissing.of(),
        @JsonProperty("product_custom_fields")
        @ExcludeMissing
        private val productCustomFields: JsonField<ProductCustomFields> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_name")
        @ExcludeMissing
        private val productName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_tags")
        @ExcludeMissing
        private val productTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("rate_card_id")
        @ExcludeMissing
        private val rateCardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("commit_rate")
        @ExcludeMissing
        private val commitRate: JsonField<CommitRate> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("override_rate")
        @ExcludeMissing
        private val overrideRate: JsonField<Rate> = JsonMissing.of(),
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        private val pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun entitled(): Boolean = entitled.getRequired("entitled")

        fun listRate(): Rate = listRate.getRequired("list_rate")

        fun productCustomFields(): ProductCustomFields =
            productCustomFields.getRequired("product_custom_fields")

        fun productId(): String = productId.getRequired("product_id")

        fun productName(): String = productName.getRequired("product_name")

        fun productTags(): List<String> = productTags.getRequired("product_tags")

        fun rateCardId(): String = rateCardId.getRequired("rate_card_id")

        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /**
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
         */
        fun commitRate(): Optional<CommitRate> =
            Optional.ofNullable(commitRate.getNullable("commit_rate"))

        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        fun overrideRate(): Optional<Rate> =
            Optional.ofNullable(overrideRate.getNullable("override_rate"))

        fun pricingGroupValues(): Optional<PricingGroupValues> =
            Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

        @JsonProperty("entitled") @ExcludeMissing fun _entitled(): JsonField<Boolean> = entitled

        @JsonProperty("list_rate") @ExcludeMissing fun _listRate(): JsonField<Rate> = listRate

        @JsonProperty("product_custom_fields")
        @ExcludeMissing
        fun _productCustomFields(): JsonField<ProductCustomFields> = productCustomFields

        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        @JsonProperty("product_name")
        @ExcludeMissing
        fun _productName(): JsonField<String> = productName

        @JsonProperty("product_tags")
        @ExcludeMissing
        fun _productTags(): JsonField<List<String>> = productTags

        @JsonProperty("rate_card_id")
        @ExcludeMissing
        fun _rateCardId(): JsonField<String> = rateCardId

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

        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        @JsonProperty("override_rate")
        @ExcludeMissing
        fun _overrideRate(): JsonField<Rate> = overrideRate

        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            entitled()
            listRate().validate()
            productCustomFields().validate()
            productId()
            productName()
            productTags()
            rateCardId()
            startingAt()
            commitRate().ifPresent { it.validate() }
            endingBefore()
            overrideRate().ifPresent { it.validate() }
            pricingGroupValues().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var entitled: JsonField<Boolean>? = null
            private var listRate: JsonField<Rate>? = null
            private var productCustomFields: JsonField<ProductCustomFields>? = null
            private var productId: JsonField<String>? = null
            private var productName: JsonField<String>? = null
            private var productTags: JsonField<MutableList<String>>? = null
            private var rateCardId: JsonField<String>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var commitRate: JsonField<CommitRate> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var overrideRate: JsonField<Rate> = JsonMissing.of()
            private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                entitled = data.entitled
                listRate = data.listRate
                productCustomFields = data.productCustomFields
                productId = data.productId
                productName = data.productName
                productTags = data.productTags.map { it.toMutableList() }
                rateCardId = data.rateCardId
                startingAt = data.startingAt
                commitRate = data.commitRate
                endingBefore = data.endingBefore
                overrideRate = data.overrideRate
                pricingGroupValues = data.pricingGroupValues
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun entitled(entitled: Boolean) = entitled(JsonField.of(entitled))

            fun entitled(entitled: JsonField<Boolean>) = apply { this.entitled = entitled }

            fun listRate(listRate: Rate) = listRate(JsonField.of(listRate))

            fun listRate(listRate: JsonField<Rate>) = apply { this.listRate = listRate }

            fun productCustomFields(productCustomFields: ProductCustomFields) =
                productCustomFields(JsonField.of(productCustomFields))

            fun productCustomFields(productCustomFields: JsonField<ProductCustomFields>) = apply {
                this.productCustomFields = productCustomFields
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun productName(productName: String) = productName(JsonField.of(productName))

            fun productName(productName: JsonField<String>) = apply {
                this.productName = productName
            }

            fun productTags(productTags: List<String>) = productTags(JsonField.of(productTags))

            fun productTags(productTags: JsonField<List<String>>) = apply {
                this.productTags = productTags.map { it.toMutableList() }
            }

            fun addProductTag(productTag: String) = apply {
                productTags =
                    (productTags ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(productTag)
                    }
            }

            fun rateCardId(rateCardId: String) = rateCardId(JsonField.of(rateCardId))

            fun rateCardId(rateCardId: JsonField<String>) = apply { this.rateCardId = rateCardId }

            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

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

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun overrideRate(overrideRate: Rate) = overrideRate(JsonField.of(overrideRate))

            fun overrideRate(overrideRate: JsonField<Rate>) = apply {
                this.overrideRate = overrideRate
            }

            fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                pricingGroupValues(JsonField.of(pricingGroupValues))

            fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                this.pricingGroupValues = pricingGroupValues
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
                    checkRequired("entitled", entitled),
                    checkRequired("listRate", listRate),
                    checkRequired("productCustomFields", productCustomFields),
                    checkRequired("productId", productId),
                    checkRequired("productName", productName),
                    checkRequired("productTags", productTags).map { it.toImmutable() },
                    checkRequired("rateCardId", rateCardId),
                    checkRequired("startingAt", startingAt),
                    commitRate,
                    endingBefore,
                    overrideRate,
                    pricingGroupValues,
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
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

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
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

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

            return /* spotless:off */ other is Data && entitled == other.entitled && listRate == other.listRate && productCustomFields == other.productCustomFields && productId == other.productId && productName == other.productName && productTags == other.productTags && rateCardId == other.rateCardId && startingAt == other.startingAt && commitRate == other.commitRate && endingBefore == other.endingBefore && overrideRate == other.overrideRate && pricingGroupValues == other.pricingGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entitled, listRate, productCustomFields, productId, productName, productTags, rateCardId, startingAt, commitRate, endingBefore, overrideRate, pricingGroupValues, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{entitled=$entitled, listRate=$listRate, productCustomFields=$productCustomFields, productId=$productId, productName=$productName, productTags=$productTags, rateCardId=$rateCardId, startingAt=$startingAt, commitRate=$commitRate, endingBefore=$endingBefore, overrideRate=$overrideRate, pricingGroupValues=$pricingGroupValues, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRetrieveRateScheduleResponse && data == other.data && nextPage == other.nextPage && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, nextPage, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractRetrieveRateScheduleResponse{data=$data, nextPage=$nextPage, additionalProperties=$additionalProperties}"
}
