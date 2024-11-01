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

@JsonDeserialize(builder = Override.Builder::class)
@NoAutoDetect
class Override
private constructor(
    private val id: JsonField<String>,
    private val product: JsonField<Product>,
    private val applicableProductTags: JsonField<List<String>>,
    private val overrideSpecifiers: JsonField<List<OverrideSpecifier>>,
    private val startingAt: JsonField<OffsetDateTime>,
    private val endingBefore: JsonField<OffsetDateTime>,
    private val entitled: JsonField<Boolean>,
    private val type: JsonField<Type>,
    private val priority: JsonField<Double>,
    private val multiplier: JsonField<Double>,
    private val overwriteRate: JsonField<OverwriteRate>,
    private val overrideTiers: JsonField<List<OverrideTier>>,
    private val isCommitSpecific: JsonField<Boolean>,
    private val target: JsonField<Target>,
    private val rateType: JsonField<RateType>,
    private val price: JsonField<Double>,
    private val quantity: JsonField<Double>,
    private val isProrated: JsonField<Boolean>,
    private val tiers: JsonField<List<Tier>>,
    private val value: JsonField<Value>,
    private val creditType: JsonField<CreditTypeData>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): String = id.getRequired("id")

    fun product(): Optional<Product> = Optional.ofNullable(product.getNullable("product"))

    fun applicableProductTags(): Optional<List<String>> =
        Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

    fun overrideSpecifiers(): Optional<List<OverrideSpecifier>> =
        Optional.ofNullable(overrideSpecifiers.getNullable("override_specifiers"))

    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

    fun endingBefore(): Optional<OffsetDateTime> =
        Optional.ofNullable(endingBefore.getNullable("ending_before"))

    fun entitled(): Optional<Boolean> = Optional.ofNullable(entitled.getNullable("entitled"))

    fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

    fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

    fun multiplier(): Optional<Double> = Optional.ofNullable(multiplier.getNullable("multiplier"))

    fun overwriteRate(): Optional<OverwriteRate> =
        Optional.ofNullable(overwriteRate.getNullable("overwrite_rate"))

    fun overrideTiers(): Optional<List<OverrideTier>> =
        Optional.ofNullable(overrideTiers.getNullable("override_tiers"))

    fun isCommitSpecific(): Optional<Boolean> =
        Optional.ofNullable(isCommitSpecific.getNullable("is_commit_specific"))

    fun target(): Optional<Target> = Optional.ofNullable(target.getNullable("target"))

    fun rateType(): Optional<RateType> = Optional.ofNullable(rateType.getNullable("rate_type"))

    /**
     * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
     * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
     */
    fun price(): Optional<Double> = Optional.ofNullable(price.getNullable("price"))

    /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
    fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

    /** Default proration configuration. Only valid for SUBSCRIPTION rate_type. */
    fun isProrated(): Optional<Boolean> = Optional.ofNullable(isProrated.getNullable("is_prorated"))

    /** Only set for TIERED rate_type. */
    fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers.getNullable("tiers"))

    /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
    fun value(): Optional<Value> = Optional.ofNullable(value.getNullable("value"))

    fun creditType(): Optional<CreditTypeData> =
        Optional.ofNullable(creditType.getNullable("credit_type"))

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("product") @ExcludeMissing fun _product() = product

    @JsonProperty("applicable_product_tags")
    @ExcludeMissing
    fun _applicableProductTags() = applicableProductTags

    @JsonProperty("override_specifiers")
    @ExcludeMissing
    fun _overrideSpecifiers() = overrideSpecifiers

    @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

    @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

    @JsonProperty("entitled") @ExcludeMissing fun _entitled() = entitled

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("priority") @ExcludeMissing fun _priority() = priority

    @JsonProperty("multiplier") @ExcludeMissing fun _multiplier() = multiplier

    @JsonProperty("overwrite_rate") @ExcludeMissing fun _overwriteRate() = overwriteRate

    @JsonProperty("override_tiers") @ExcludeMissing fun _overrideTiers() = overrideTiers

    @JsonProperty("is_commit_specific") @ExcludeMissing fun _isCommitSpecific() = isCommitSpecific

    @JsonProperty("target") @ExcludeMissing fun _target() = target

    @JsonProperty("rate_type") @ExcludeMissing fun _rateType() = rateType

    /**
     * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
     * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
     */
    @JsonProperty("price") @ExcludeMissing fun _price() = price

    /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

    /** Default proration configuration. Only valid for SUBSCRIPTION rate_type. */
    @JsonProperty("is_prorated") @ExcludeMissing fun _isProrated() = isProrated

    /** Only set for TIERED rate_type. */
    @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

    /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
    @JsonProperty("value") @ExcludeMissing fun _value() = value

    @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Override = apply {
        if (!validated) {
            id()
            product().map { it.validate() }
            applicableProductTags()
            overrideSpecifiers().map { it.forEach { it.validate() } }
            startingAt()
            endingBefore()
            entitled()
            type()
            priority()
            multiplier()
            overwriteRate().map { it.validate() }
            overrideTiers().map { it.forEach { it.validate() } }
            isCommitSpecific()
            target()
            rateType()
            price()
            quantity()
            isProrated()
            tiers().map { it.forEach { it.validate() } }
            value().map { it.validate() }
            creditType().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var product: JsonField<Product> = JsonMissing.of()
        private var applicableProductTags: JsonField<List<String>> = JsonMissing.of()
        private var overrideSpecifiers: JsonField<List<OverrideSpecifier>> = JsonMissing.of()
        private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
        private var entitled: JsonField<Boolean> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var priority: JsonField<Double> = JsonMissing.of()
        private var multiplier: JsonField<Double> = JsonMissing.of()
        private var overwriteRate: JsonField<OverwriteRate> = JsonMissing.of()
        private var overrideTiers: JsonField<List<OverrideTier>> = JsonMissing.of()
        private var isCommitSpecific: JsonField<Boolean> = JsonMissing.of()
        private var target: JsonField<Target> = JsonMissing.of()
        private var rateType: JsonField<RateType> = JsonMissing.of()
        private var price: JsonField<Double> = JsonMissing.of()
        private var quantity: JsonField<Double> = JsonMissing.of()
        private var isProrated: JsonField<Boolean> = JsonMissing.of()
        private var tiers: JsonField<List<Tier>> = JsonMissing.of()
        private var value: JsonField<Value> = JsonMissing.of()
        private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(override: Override) = apply {
            this.id = override.id
            this.product = override.product
            this.applicableProductTags = override.applicableProductTags
            this.overrideSpecifiers = override.overrideSpecifiers
            this.startingAt = override.startingAt
            this.endingBefore = override.endingBefore
            this.entitled = override.entitled
            this.type = override.type
            this.priority = override.priority
            this.multiplier = override.multiplier
            this.overwriteRate = override.overwriteRate
            this.overrideTiers = override.overrideTiers
            this.isCommitSpecific = override.isCommitSpecific
            this.target = override.target
            this.rateType = override.rateType
            this.price = override.price
            this.quantity = override.quantity
            this.isProrated = override.isProrated
            this.tiers = override.tiers
            this.value = override.value
            this.creditType = override.creditType
            additionalProperties(override.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun product(product: Product) = product(JsonField.of(product))

        @JsonProperty("product")
        @ExcludeMissing
        fun product(product: JsonField<Product>) = apply { this.product = product }

        fun applicableProductTags(applicableProductTags: List<String>) =
            applicableProductTags(JsonField.of(applicableProductTags))

        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
            this.applicableProductTags = applicableProductTags
        }

        fun overrideSpecifiers(overrideSpecifiers: List<OverrideSpecifier>) =
            overrideSpecifiers(JsonField.of(overrideSpecifiers))

        @JsonProperty("override_specifiers")
        @ExcludeMissing
        fun overrideSpecifiers(overrideSpecifiers: JsonField<List<OverrideSpecifier>>) = apply {
            this.overrideSpecifiers = overrideSpecifiers
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

        fun type(type: Type) = type(JsonField.of(type))

        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun priority(priority: Double) = priority(JsonField.of(priority))

        @JsonProperty("priority")
        @ExcludeMissing
        fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

        fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

        @JsonProperty("multiplier")
        @ExcludeMissing
        fun multiplier(multiplier: JsonField<Double>) = apply { this.multiplier = multiplier }

        fun overwriteRate(overwriteRate: OverwriteRate) = overwriteRate(JsonField.of(overwriteRate))

        @JsonProperty("overwrite_rate")
        @ExcludeMissing
        fun overwriteRate(overwriteRate: JsonField<OverwriteRate>) = apply {
            this.overwriteRate = overwriteRate
        }

        fun overrideTiers(overrideTiers: List<OverrideTier>) =
            overrideTiers(JsonField.of(overrideTiers))

        @JsonProperty("override_tiers")
        @ExcludeMissing
        fun overrideTiers(overrideTiers: JsonField<List<OverrideTier>>) = apply {
            this.overrideTiers = overrideTiers
        }

        fun isCommitSpecific(isCommitSpecific: Boolean) =
            isCommitSpecific(JsonField.of(isCommitSpecific))

        @JsonProperty("is_commit_specific")
        @ExcludeMissing
        fun isCommitSpecific(isCommitSpecific: JsonField<Boolean>) = apply {
            this.isCommitSpecific = isCommitSpecific
        }

        fun target(target: Target) = target(JsonField.of(target))

        @JsonProperty("target")
        @ExcludeMissing
        fun target(target: JsonField<Target>) = apply { this.target = target }

        fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

        @JsonProperty("rate_type")
        @ExcludeMissing
        fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

        /**
         * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
         * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        fun price(price: Double) = price(JsonField.of(price))

        /**
         * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
         * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        @JsonProperty("price")
        @ExcludeMissing
        fun price(price: JsonField<Double>) = apply { this.price = price }

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        @JsonProperty("quantity")
        @ExcludeMissing
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        /** Default proration configuration. Only valid for SUBSCRIPTION rate_type. */
        fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

        /** Default proration configuration. Only valid for SUBSCRIPTION rate_type. */
        @JsonProperty("is_prorated")
        @ExcludeMissing
        fun isProrated(isProrated: JsonField<Boolean>) = apply { this.isProrated = isProrated }

        /** Only set for TIERED rate_type. */
        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

        /** Only set for TIERED rate_type. */
        @JsonProperty("tiers")
        @ExcludeMissing
        fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        fun value(value: Value) = value(JsonField.of(value))

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        @JsonProperty("value")
        @ExcludeMissing
        fun value(value: JsonField<Value>) = apply { this.value = value }

        fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

        @JsonProperty("credit_type")
        @ExcludeMissing
        fun creditType(creditType: JsonField<CreditTypeData>) = apply {
            this.creditType = creditType
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

        fun build(): Override =
            Override(
                id,
                product,
                applicableProductTags.map { it.toImmutable() },
                overrideSpecifiers.map { it.toImmutable() },
                startingAt,
                endingBefore,
                entitled,
                type,
                priority,
                multiplier,
                overwriteRate,
                overrideTiers.map { it.toImmutable() },
                isCommitSpecific,
                target,
                rateType,
                price,
                quantity,
                isProrated,
                tiers.map { it.toImmutable() },
                value,
                creditType,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = OverrideSpecifier.Builder::class)
    @NoAutoDetect
    class OverrideSpecifier
    private constructor(
        private val productId: JsonField<String>,
        private val productTags: JsonField<List<String>>,
        private val pricingGroupValues: JsonField<PricingGroupValues>,
        private val presentationGroupValues: JsonField<PresentationGroupValues>,
        private val commitIds: JsonField<List<String>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("product_id"))

        fun productTags(): Optional<List<String>> =
            Optional.ofNullable(productTags.getNullable("product_tags"))

        fun pricingGroupValues(): Optional<PricingGroupValues> =
            Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

        fun presentationGroupValues(): Optional<PresentationGroupValues> =
            Optional.ofNullable(presentationGroupValues.getNullable("presentation_group_values"))

        fun commitIds(): Optional<List<String>> =
            Optional.ofNullable(commitIds.getNullable("commit_ids"))

        @JsonProperty("product_id") @ExcludeMissing fun _productId() = productId

        @JsonProperty("product_tags") @ExcludeMissing fun _productTags() = productTags

        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        fun _pricingGroupValues() = pricingGroupValues

        @JsonProperty("presentation_group_values")
        @ExcludeMissing
        fun _presentationGroupValues() = presentationGroupValues

        @JsonProperty("commit_ids") @ExcludeMissing fun _commitIds() = commitIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): OverrideSpecifier = apply {
            if (!validated) {
                productId()
                productTags()
                pricingGroupValues().map { it.validate() }
                presentationGroupValues().map { it.validate() }
                commitIds()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var productId: JsonField<String> = JsonMissing.of()
            private var productTags: JsonField<List<String>> = JsonMissing.of()
            private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
            private var presentationGroupValues: JsonField<PresentationGroupValues> =
                JsonMissing.of()
            private var commitIds: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(overrideSpecifier: OverrideSpecifier) = apply {
                this.productId = overrideSpecifier.productId
                this.productTags = overrideSpecifier.productTags
                this.pricingGroupValues = overrideSpecifier.pricingGroupValues
                this.presentationGroupValues = overrideSpecifier.presentationGroupValues
                this.commitIds = overrideSpecifier.commitIds
                additionalProperties(overrideSpecifier.additionalProperties)
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            @JsonProperty("product_id")
            @ExcludeMissing
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

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

            fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
                presentationGroupValues(JsonField.of(presentationGroupValues))

            @JsonProperty("presentation_group_values")
            @ExcludeMissing
            fun presentationGroupValues(
                presentationGroupValues: JsonField<PresentationGroupValues>
            ) = apply { this.presentationGroupValues = presentationGroupValues }

            fun commitIds(commitIds: List<String>) = commitIds(JsonField.of(commitIds))

            @JsonProperty("commit_ids")
            @ExcludeMissing
            fun commitIds(commitIds: JsonField<List<String>>) = apply { this.commitIds = commitIds }

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

            fun build(): OverrideSpecifier =
                OverrideSpecifier(
                    productId,
                    productTags.map { it.toImmutable() },
                    pricingGroupValues,
                    presentationGroupValues,
                    commitIds.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = PresentationGroupValues.Builder::class)
        @NoAutoDetect
        class PresentationGroupValues
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PresentationGroupValues = apply {
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
                internal fun from(presentationGroupValues: PresentationGroupValues) = apply {
                    additionalProperties(presentationGroupValues.additionalProperties)
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

                fun build(): PresentationGroupValues =
                    PresentationGroupValues(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PresentationGroupValues && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "PresentationGroupValues{additionalProperties=$additionalProperties}"
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

                return /* spotless:off */ other is PricingGroupValues && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "PricingGroupValues{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OverrideSpecifier && this.productId == other.productId && this.productTags == other.productTags && this.pricingGroupValues == other.pricingGroupValues && this.presentationGroupValues == other.presentationGroupValues && this.commitIds == other.commitIds && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(productId, productTags, pricingGroupValues, presentationGroupValues, commitIds, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "OverrideSpecifier{productId=$productId, productTags=$productTags, pricingGroupValues=$pricingGroupValues, presentationGroupValues=$presentationGroupValues, commitIds=$commitIds, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = OverrideTier.Builder::class)
    @NoAutoDetect
    class OverrideTier
    private constructor(
        private val size: JsonField<Double>,
        private val multiplier: JsonField<Double>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun size(): Optional<Double> = Optional.ofNullable(size.getNullable("size"))

        fun multiplier(): Double = multiplier.getRequired("multiplier")

        @JsonProperty("size") @ExcludeMissing fun _size() = size

        @JsonProperty("multiplier") @ExcludeMissing fun _multiplier() = multiplier

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): OverrideTier = apply {
            if (!validated) {
                size()
                multiplier()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var size: JsonField<Double> = JsonMissing.of()
            private var multiplier: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(overrideTier: OverrideTier) = apply {
                this.size = overrideTier.size
                this.multiplier = overrideTier.multiplier
                additionalProperties(overrideTier.additionalProperties)
            }

            fun size(size: Double) = size(JsonField.of(size))

            @JsonProperty("size")
            @ExcludeMissing
            fun size(size: JsonField<Double>) = apply { this.size = size }

            fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

            @JsonProperty("multiplier")
            @ExcludeMissing
            fun multiplier(multiplier: JsonField<Double>) = apply { this.multiplier = multiplier }

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

            fun build(): OverrideTier =
                OverrideTier(
                    size,
                    multiplier,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OverrideTier && this.size == other.size && this.multiplier == other.multiplier && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(size, multiplier, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "OverrideTier{size=$size, multiplier=$multiplier, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = OverwriteRate.Builder::class)
    @NoAutoDetect
    class OverwriteRate
    private constructor(
        private val rateType: JsonField<RateType>,
        private val price: JsonField<Double>,
        private val quantity: JsonField<Double>,
        private val isProrated: JsonField<Boolean>,
        private val tiers: JsonField<List<Tier>>,
        private val customRate: JsonField<CustomRate>,
        private val creditType: JsonField<CreditTypeData>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun rateType(): RateType = rateType.getRequired("rate_type")

        /**
         * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
         * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        fun price(): Optional<Double> = Optional.ofNullable(price.getNullable("price"))

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

        /** Default proration configuration. Only valid for SUBSCRIPTION rate_type. */
        fun isProrated(): Optional<Boolean> =
            Optional.ofNullable(isProrated.getNullable("is_prorated"))

        /** Only set for TIERED rate_type. */
        fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers.getNullable("tiers"))

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        fun customRate(): Optional<CustomRate> =
            Optional.ofNullable(customRate.getNullable("custom_rate"))

        fun creditType(): Optional<CreditTypeData> =
            Optional.ofNullable(creditType.getNullable("credit_type"))

        @JsonProperty("rate_type") @ExcludeMissing fun _rateType() = rateType

        /**
         * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
         * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        @JsonProperty("price") @ExcludeMissing fun _price() = price

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

        /** Default proration configuration. Only valid for SUBSCRIPTION rate_type. */
        @JsonProperty("is_prorated") @ExcludeMissing fun _isProrated() = isProrated

        /** Only set for TIERED rate_type. */
        @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        @JsonProperty("custom_rate") @ExcludeMissing fun _customRate() = customRate

        @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): OverwriteRate = apply {
            if (!validated) {
                rateType()
                price()
                quantity()
                isProrated()
                tiers().map { it.forEach { it.validate() } }
                customRate().map { it.validate() }
                creditType().map { it.validate() }
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
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var isProrated: JsonField<Boolean> = JsonMissing.of()
            private var tiers: JsonField<List<Tier>> = JsonMissing.of()
            private var customRate: JsonField<CustomRate> = JsonMissing.of()
            private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(overwriteRate: OverwriteRate) = apply {
                this.rateType = overwriteRate.rateType
                this.price = overwriteRate.price
                this.quantity = overwriteRate.quantity
                this.isProrated = overwriteRate.isProrated
                this.tiers = overwriteRate.tiers
                this.customRate = overwriteRate.customRate
                this.creditType = overwriteRate.creditType
                additionalProperties(overwriteRate.additionalProperties)
            }

            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            @JsonProperty("rate_type")
            @ExcludeMissing
            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /**
             * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this
             * is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
             */
            fun price(price: Double) = price(JsonField.of(price))

            /**
             * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this
             * is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
             */
            @JsonProperty("price")
            @ExcludeMissing
            fun price(price: JsonField<Double>) = apply { this.price = price }

            /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
            @JsonProperty("quantity")
            @ExcludeMissing
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** Default proration configuration. Only valid for SUBSCRIPTION rate_type. */
            fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

            /** Default proration configuration. Only valid for SUBSCRIPTION rate_type. */
            @JsonProperty("is_prorated")
            @ExcludeMissing
            fun isProrated(isProrated: JsonField<Boolean>) = apply { this.isProrated = isProrated }

            /** Only set for TIERED rate_type. */
            fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

            /** Only set for TIERED rate_type. */
            @JsonProperty("tiers")
            @ExcludeMissing
            fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            fun customRate(customRate: CustomRate) = customRate(JsonField.of(customRate))

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            @JsonProperty("custom_rate")
            @ExcludeMissing
            fun customRate(customRate: JsonField<CustomRate>) = apply {
                this.customRate = customRate
            }

            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            @JsonProperty("credit_type")
            @ExcludeMissing
            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
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

            fun build(): OverwriteRate =
                OverwriteRate(
                    rateType,
                    price,
                    quantity,
                    isProrated,
                    tiers.map { it.toImmutable() },
                    customRate,
                    creditType,
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

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CustomRate = apply {
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OverwriteRate && this.rateType == other.rateType && this.price == other.price && this.quantity == other.quantity && this.isProrated == other.isProrated && this.tiers == other.tiers && this.customRate == other.customRate && this.creditType == other.creditType && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(rateType, price, quantity, isProrated, tiers, customRate, creditType, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "OverwriteRate{rateType=$rateType, price=$price, quantity=$quantity, isProrated=$isProrated, tiers=$tiers, customRate=$customRate, creditType=$creditType, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Product.Builder::class)
    @NoAutoDetect
    class Product
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Product = apply {
            if (!validated) {
                id()
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(product: Product) = apply {
                this.id = product.id
                this.name = product.name
                additionalProperties(product.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun build(): Product =
                Product(
                    id,
                    name,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Product && this.id == other.id && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(id, name, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
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

    class Target
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Target && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val COMMIT_RATE = Target(JsonField.of("COMMIT_RATE"))

            @JvmField val LIST_RATE = Target(JsonField.of("LIST_RATE"))

            @JvmStatic fun of(value: String) = Target(JsonField.of(value))
        }

        enum class Known {
            COMMIT_RATE,
            LIST_RATE,
        }

        enum class Value {
            COMMIT_RATE,
            LIST_RATE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMMIT_RATE -> Value.COMMIT_RATE
                LIST_RATE -> Value.LIST_RATE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMMIT_RATE -> Known.COMMIT_RATE
                LIST_RATE -> Known.LIST_RATE
                else -> throw MetronomeInvalidDataException("Unknown Target: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val OVERWRITE = Type(JsonField.of("OVERWRITE"))

            @JvmField val MULTIPLIER = Type(JsonField.of("MULTIPLIER"))

            @JvmField val TIERED = Type(JsonField.of("TIERED"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            OVERWRITE,
            MULTIPLIER,
            TIERED,
        }

        enum class Value {
            OVERWRITE,
            MULTIPLIER,
            TIERED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OVERWRITE -> Value.OVERWRITE
                MULTIPLIER -> Value.MULTIPLIER
                TIERED -> Value.TIERED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OVERWRITE -> Known.OVERWRITE
                MULTIPLIER -> Known.MULTIPLIER
                TIERED -> Known.TIERED
                else -> throw MetronomeInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
    @JsonDeserialize(builder = Value.Builder::class)
    @NoAutoDetect
    class Value
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Value = apply {
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
            internal fun from(value: Value) = apply {
                additionalProperties(value.additionalProperties)
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

            fun build(): Value = Value(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Value && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Value{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Override && this.id == other.id && this.product == other.product && this.applicableProductTags == other.applicableProductTags && this.overrideSpecifiers == other.overrideSpecifiers && this.startingAt == other.startingAt && this.endingBefore == other.endingBefore && this.entitled == other.entitled && this.type == other.type && this.priority == other.priority && this.multiplier == other.multiplier && this.overwriteRate == other.overwriteRate && this.overrideTiers == other.overrideTiers && this.isCommitSpecific == other.isCommitSpecific && this.target == other.target && this.rateType == other.rateType && this.price == other.price && this.quantity == other.quantity && this.isProrated == other.isProrated && this.tiers == other.tiers && this.value == other.value && this.creditType == other.creditType && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, product, applicableProductTags, overrideSpecifiers, startingAt, endingBefore, entitled, type, priority, multiplier, overwriteRate, overrideTiers, isCommitSpecific, target, rateType, price, quantity, isProrated, tiers, value, creditType, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "Override{id=$id, product=$product, applicableProductTags=$applicableProductTags, overrideSpecifiers=$overrideSpecifiers, startingAt=$startingAt, endingBefore=$endingBefore, entitled=$entitled, type=$type, priority=$priority, multiplier=$multiplier, overwriteRate=$overwriteRate, overrideTiers=$overrideTiers, isCommitSpecific=$isCommitSpecific, target=$target, rateType=$rateType, price=$price, quantity=$quantity, isProrated=$isProrated, tiers=$tiers, value=$value, creditType=$creditType, additionalProperties=$additionalProperties}"
}
