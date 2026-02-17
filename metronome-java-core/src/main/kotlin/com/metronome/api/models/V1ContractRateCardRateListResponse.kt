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
class V1ContractRateCardRateListResponse
@JsonCreator
private constructor(
    @JsonProperty("entitled")
    @ExcludeMissing
    private val entitled: JsonField<Boolean> = JsonMissing.of(),
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
    @JsonProperty("rate") @ExcludeMissing private val rate: JsonField<Rate> = JsonMissing.of(),
    @JsonProperty("starting_at")
    @ExcludeMissing
    private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("billing_frequency")
    @ExcludeMissing
    private val billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
    @JsonProperty("commit_rate")
    @ExcludeMissing
    private val commitRate: JsonField<CommitRate> = JsonMissing.of(),
    @JsonProperty("ending_before")
    @ExcludeMissing
    private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("pricing_group_values")
    @ExcludeMissing
    private val pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun entitled(): Boolean = entitled.getRequired("entitled")

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    fun productCustomFields(): ProductCustomFields =
        productCustomFields.getRequired("product_custom_fields")

    fun productId(): String = productId.getRequired("product_id")

    fun productName(): String = productName.getRequired("product_name")

    fun productTags(): List<String> = productTags.getRequired("product_tags")

    fun rate(): Rate = rate.getRequired("rate")

    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

    fun billingFrequency(): Optional<BillingFrequency> =
        Optional.ofNullable(billingFrequency.getNullable("billing_frequency"))

    /**
     * A distinct rate on the rate card. You can choose to use this rate rather than list rate when
     * consuming a credit or commit.
     */
    fun commitRate(): Optional<CommitRate> =
        Optional.ofNullable(commitRate.getNullable("commit_rate"))

    fun endingBefore(): Optional<OffsetDateTime> =
        Optional.ofNullable(endingBefore.getNullable("ending_before"))

    fun pricingGroupValues(): Optional<PricingGroupValues> =
        Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

    @JsonProperty("entitled") @ExcludeMissing fun _entitled(): JsonField<Boolean> = entitled

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
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

    @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<Rate> = rate

    @JsonProperty("starting_at")
    @ExcludeMissing
    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

    @JsonProperty("billing_frequency")
    @ExcludeMissing
    fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

    /**
     * A distinct rate on the rate card. You can choose to use this rate rather than list rate when
     * consuming a credit or commit.
     */
    @JsonProperty("commit_rate")
    @ExcludeMissing
    fun _commitRate(): JsonField<CommitRate> = commitRate

    @JsonProperty("ending_before")
    @ExcludeMissing
    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

    @JsonProperty("pricing_group_values")
    @ExcludeMissing
    fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): V1ContractRateCardRateListResponse = apply {
        if (validated) {
            return@apply
        }

        entitled()
        productCustomFields().validate()
        productId()
        productName()
        productTags()
        rate().validate()
        startingAt()
        billingFrequency()
        commitRate().ifPresent { it.validate() }
        endingBefore()
        pricingGroupValues().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ContractRateCardRateListResponse]. */
    class Builder internal constructor() {

        private var entitled: JsonField<Boolean>? = null
        private var productCustomFields: JsonField<ProductCustomFields>? = null
        private var productId: JsonField<String>? = null
        private var productName: JsonField<String>? = null
        private var productTags: JsonField<MutableList<String>>? = null
        private var rate: JsonField<Rate>? = null
        private var startingAt: JsonField<OffsetDateTime>? = null
        private var billingFrequency: JsonField<BillingFrequency> = JsonMissing.of()
        private var commitRate: JsonField<CommitRate> = JsonMissing.of()
        private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
        private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1ContractRateCardRateListResponse: V1ContractRateCardRateListResponse) =
            apply {
                entitled = v1ContractRateCardRateListResponse.entitled
                productCustomFields = v1ContractRateCardRateListResponse.productCustomFields
                productId = v1ContractRateCardRateListResponse.productId
                productName = v1ContractRateCardRateListResponse.productName
                productTags =
                    v1ContractRateCardRateListResponse.productTags.map { it.toMutableList() }
                rate = v1ContractRateCardRateListResponse.rate
                startingAt = v1ContractRateCardRateListResponse.startingAt
                billingFrequency = v1ContractRateCardRateListResponse.billingFrequency
                commitRate = v1ContractRateCardRateListResponse.commitRate
                endingBefore = v1ContractRateCardRateListResponse.endingBefore
                pricingGroupValues = v1ContractRateCardRateListResponse.pricingGroupValues
                additionalProperties =
                    v1ContractRateCardRateListResponse.additionalProperties.toMutableMap()
            }

        fun entitled(entitled: Boolean) = entitled(JsonField.of(entitled))

        fun entitled(entitled: JsonField<Boolean>) = apply { this.entitled = entitled }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun productCustomFields(productCustomFields: ProductCustomFields) =
            productCustomFields(JsonField.of(productCustomFields))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun productCustomFields(productCustomFields: JsonField<ProductCustomFields>) = apply {
            this.productCustomFields = productCustomFields
        }

        fun productId(productId: String) = productId(JsonField.of(productId))

        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        fun productName(productName: String) = productName(JsonField.of(productName))

        fun productName(productName: JsonField<String>) = apply { this.productName = productName }

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

        fun rate(rate: Rate) = rate(JsonField.of(rate))

        fun rate(rate: JsonField<Rate>) = apply { this.rate = rate }

        fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            this.startingAt = startingAt
        }

        fun billingFrequency(billingFrequency: BillingFrequency) =
            billingFrequency(JsonField.of(billingFrequency))

        fun billingFrequency(billingFrequency: JsonField<BillingFrequency>) = apply {
            this.billingFrequency = billingFrequency
        }

        /**
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
         */
        fun commitRate(commitRate: CommitRate) = commitRate(JsonField.of(commitRate))

        /**
         * A distinct rate on the rate card. You can choose to use this rate rather than list rate
         * when consuming a credit or commit.
         */
        fun commitRate(commitRate: JsonField<CommitRate>) = apply { this.commitRate = commitRate }

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
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

        fun build(): V1ContractRateCardRateListResponse =
            V1ContractRateCardRateListResponse(
                checkRequired("entitled", entitled),
                checkRequired("productCustomFields", productCustomFields),
                checkRequired("productId", productId),
                checkRequired("productName", productName),
                checkRequired("productTags", productTags).map { it.toImmutable() },
                checkRequired("rate", rate),
                checkRequired("startingAt", startingAt),
                billingFrequency,
                commitRate,
                endingBefore,
                pricingGroupValues,
                additionalProperties.toImmutable(),
            )
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @NoAutoDetect
    class ProductCustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

        /** A builder for [ProductCustomFields]. */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        override fun toString() = "ProductCustomFields{additionalProperties=$additionalProperties}"
    }

    class BillingFrequency @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val MONTHLY = of("MONTHLY")

            @JvmField val QUARTERLY = of("QUARTERLY")

            @JvmField val ANNUAL = of("ANNUAL")

            @JvmField val WEEKLY = of("WEEKLY")

            @JvmStatic fun of(value: String) = BillingFrequency(JsonField.of(value))
        }

        /** An enum containing [BillingFrequency]'s known values. */
        enum class Known {
            MONTHLY,
            QUARTERLY,
            ANNUAL,
            WEEKLY,
        }

        /**
         * An enum containing [BillingFrequency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BillingFrequency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MONTHLY,
            QUARTERLY,
            ANNUAL,
            WEEKLY,
            /**
             * An enum member indicating that [BillingFrequency] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                MONTHLY -> Value.MONTHLY
                QUARTERLY -> Value.QUARTERLY
                ANNUAL -> Value.ANNUAL
                WEEKLY -> Value.WEEKLY
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                MONTHLY -> Known.MONTHLY
                QUARTERLY -> Known.QUARTERLY
                ANNUAL -> Known.ANNUAL
                WEEKLY -> Known.WEEKLY
                else -> throw MetronomeInvalidDataException("Unknown BillingFrequency: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                MetronomeInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingFrequency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class PricingGroupValues
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

        return /* spotless:off */ other is V1ContractRateCardRateListResponse && entitled == other.entitled && productCustomFields == other.productCustomFields && productId == other.productId && productName == other.productName && productTags == other.productTags && rate == other.rate && startingAt == other.startingAt && billingFrequency == other.billingFrequency && commitRate == other.commitRate && endingBefore == other.endingBefore && pricingGroupValues == other.pricingGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(entitled, productCustomFields, productId, productName, productTags, rate, startingAt, billingFrequency, commitRate, endingBefore, pricingGroupValues, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1ContractRateCardRateListResponse{entitled=$entitled, productCustomFields=$productCustomFields, productId=$productId, productName=$productName, productTags=$productTags, rate=$rate, startingAt=$startingAt, billingFrequency=$billingFrequency, commitRate=$commitRate, endingBefore=$endingBefore, pricingGroupValues=$pricingGroupValues, additionalProperties=$additionalProperties}"
}
