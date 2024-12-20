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
class Override
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("product")
    @ExcludeMissing
    private val product: JsonField<Product> = JsonMissing.of(),
    @JsonProperty("applicable_product_tags")
    @ExcludeMissing
    private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("override_specifiers")
    @ExcludeMissing
    private val overrideSpecifiers: JsonField<List<OverrideSpecifier>> = JsonMissing.of(),
    @JsonProperty("starting_at")
    @ExcludeMissing
    private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("ending_before")
    @ExcludeMissing
    private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("entitled")
    @ExcludeMissing
    private val entitled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("priority")
    @ExcludeMissing
    private val priority: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("multiplier")
    @ExcludeMissing
    private val multiplier: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("overwrite_rate")
    @ExcludeMissing
    private val overwriteRate: JsonField<OverwriteRate> = JsonMissing.of(),
    @JsonProperty("override_tiers")
    @ExcludeMissing
    private val overrideTiers: JsonField<List<OverrideTier>> = JsonMissing.of(),
    @JsonProperty("is_commit_specific")
    @ExcludeMissing
    private val isCommitSpecific: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("target")
    @ExcludeMissing
    private val target: JsonField<Target> = JsonMissing.of(),
    @JsonProperty("rate_type")
    @ExcludeMissing
    private val rateType: JsonField<RateType> = JsonMissing.of(),
    @JsonProperty("price") @ExcludeMissing private val price: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("is_prorated")
    @ExcludeMissing
    private val isProrated: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("tiers")
    @ExcludeMissing
    private val tiers: JsonField<List<Tier>> = JsonMissing.of(),
    @JsonProperty("value") @ExcludeMissing private val value: JsonField<Value> = JsonMissing.of(),
    @JsonProperty("credit_type")
    @ExcludeMissing
    private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    /**
     * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to true.
     */
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

    /**
     * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to true.
     */
    @JsonProperty("is_prorated") @ExcludeMissing fun _isProrated() = isProrated

    /** Only set for TIERED rate_type. */
    @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

    /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
    @JsonProperty("value") @ExcludeMissing fun _value() = value

    @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

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
            id = override.id
            product = override.product
            applicableProductTags = override.applicableProductTags
            overrideSpecifiers = override.overrideSpecifiers
            startingAt = override.startingAt
            endingBefore = override.endingBefore
            entitled = override.entitled
            type = override.type
            priority = override.priority
            multiplier = override.multiplier
            overwriteRate = override.overwriteRate
            overrideTiers = override.overrideTiers
            isCommitSpecific = override.isCommitSpecific
            target = override.target
            rateType = override.rateType
            price = override.price
            quantity = override.quantity
            isProrated = override.isProrated
            tiers = override.tiers
            value = override.value
            creditType = override.creditType
            additionalProperties = override.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun product(product: Product) = product(JsonField.of(product))

        fun product(product: JsonField<Product>) = apply { this.product = product }

        fun applicableProductTags(applicableProductTags: List<String>) =
            applicableProductTags(JsonField.of(applicableProductTags))

        fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
            this.applicableProductTags = applicableProductTags
        }

        fun overrideSpecifiers(overrideSpecifiers: List<OverrideSpecifier>) =
            overrideSpecifiers(JsonField.of(overrideSpecifiers))

        fun overrideSpecifiers(overrideSpecifiers: JsonField<List<OverrideSpecifier>>) = apply {
            this.overrideSpecifiers = overrideSpecifiers
        }

        fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            this.startingAt = startingAt
        }

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
        }

        fun entitled(entitled: Boolean) = entitled(JsonField.of(entitled))

        fun entitled(entitled: JsonField<Boolean>) = apply { this.entitled = entitled }

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun priority(priority: Double) = priority(JsonField.of(priority))

        fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

        fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

        fun multiplier(multiplier: JsonField<Double>) = apply { this.multiplier = multiplier }

        fun overwriteRate(overwriteRate: OverwriteRate) = overwriteRate(JsonField.of(overwriteRate))

        fun overwriteRate(overwriteRate: JsonField<OverwriteRate>) = apply {
            this.overwriteRate = overwriteRate
        }

        fun overrideTiers(overrideTiers: List<OverrideTier>) =
            overrideTiers(JsonField.of(overrideTiers))

        fun overrideTiers(overrideTiers: JsonField<List<OverrideTier>>) = apply {
            this.overrideTiers = overrideTiers
        }

        fun isCommitSpecific(isCommitSpecific: Boolean) =
            isCommitSpecific(JsonField.of(isCommitSpecific))

        fun isCommitSpecific(isCommitSpecific: JsonField<Boolean>) = apply {
            this.isCommitSpecific = isCommitSpecific
        }

        fun target(target: Target) = target(JsonField.of(target))

        fun target(target: JsonField<Target>) = apply { this.target = target }

        fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

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
        fun price(price: JsonField<Double>) = apply { this.price = price }

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
        fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
        fun isProrated(isProrated: JsonField<Boolean>) = apply { this.isProrated = isProrated }

        /** Only set for TIERED rate_type. */
        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

        /** Only set for TIERED rate_type. */
        fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        fun value(value: Value) = value(JsonField.of(value))

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        fun value(value: JsonField<Value>) = apply { this.value = value }

        fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

        fun creditType(creditType: JsonField<CreditTypeData>) = apply {
            this.creditType = creditType
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

    @NoAutoDetect
    class OverrideSpecifier
    @JsonCreator
    private constructor(
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_tags")
        @ExcludeMissing
        private val productTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        private val pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
        @JsonProperty("presentation_group_values")
        @ExcludeMissing
        private val presentationGroupValues: JsonField<PresentationGroupValues> = JsonMissing.of(),
        @JsonProperty("commit_ids")
        @ExcludeMissing
        private val commitIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        private var validated: Boolean = false

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
                productId = overrideSpecifier.productId
                productTags = overrideSpecifier.productTags
                pricingGroupValues = overrideSpecifier.pricingGroupValues
                presentationGroupValues = overrideSpecifier.presentationGroupValues
                commitIds = overrideSpecifier.commitIds
                additionalProperties = overrideSpecifier.additionalProperties.toMutableMap()
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun productTags(productTags: List<String>) = productTags(JsonField.of(productTags))

            fun productTags(productTags: JsonField<List<String>>) = apply {
                this.productTags = productTags
            }

            fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                pricingGroupValues(JsonField.of(pricingGroupValues))

            fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                this.pricingGroupValues = pricingGroupValues
            }

            fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
                presentationGroupValues(JsonField.of(presentationGroupValues))

            fun presentationGroupValues(
                presentationGroupValues: JsonField<PresentationGroupValues>
            ) = apply { this.presentationGroupValues = presentationGroupValues }

            fun commitIds(commitIds: List<String>) = commitIds(JsonField.of(commitIds))

            fun commitIds(commitIds: JsonField<List<String>>) = apply { this.commitIds = commitIds }

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

        @NoAutoDetect
        class PresentationGroupValues
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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
                    additionalProperties =
                        presentationGroupValues.additionalProperties.toMutableMap()
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

                fun build(): PresentationGroupValues =
                    PresentationGroupValues(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PresentationGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PresentationGroupValues{additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is OverrideSpecifier && productId == other.productId && productTags == other.productTags && pricingGroupValues == other.pricingGroupValues && presentationGroupValues == other.presentationGroupValues && commitIds == other.commitIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, productTags, pricingGroupValues, presentationGroupValues, commitIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OverrideSpecifier{productId=$productId, productTags=$productTags, pricingGroupValues=$pricingGroupValues, presentationGroupValues=$presentationGroupValues, commitIds=$commitIds, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class OverrideTier
    @JsonCreator
    private constructor(
        @JsonProperty("size")
        @ExcludeMissing
        private val size: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("multiplier")
        @ExcludeMissing
        private val multiplier: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun size(): Optional<Double> = Optional.ofNullable(size.getNullable("size"))

        fun multiplier(): Double = multiplier.getRequired("multiplier")

        @JsonProperty("size") @ExcludeMissing fun _size() = size

        @JsonProperty("multiplier") @ExcludeMissing fun _multiplier() = multiplier

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
                size = overrideTier.size
                multiplier = overrideTier.multiplier
                additionalProperties = overrideTier.additionalProperties.toMutableMap()
            }

            fun size(size: Double) = size(JsonField.of(size))

            fun size(size: JsonField<Double>) = apply { this.size = size }

            fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

            fun multiplier(multiplier: JsonField<Double>) = apply { this.multiplier = multiplier }

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

            return /* spotless:off */ other is OverrideTier && size == other.size && multiplier == other.multiplier && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(size, multiplier, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OverrideTier{size=$size, multiplier=$multiplier, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class OverwriteRate
    @JsonCreator
    private constructor(
        @JsonProperty("rate_type")
        @ExcludeMissing
        private val rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("price")
        @ExcludeMissing
        private val price: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("is_prorated")
        @ExcludeMissing
        private val isProrated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tiers")
        @ExcludeMissing
        private val tiers: JsonField<List<Tier>> = JsonMissing.of(),
        @JsonProperty("custom_rate")
        @ExcludeMissing
        private val customRate: JsonField<CustomRate> = JsonMissing.of(),
        @JsonProperty("credit_type")
        @ExcludeMissing
        private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun rateType(): RateType = rateType.getRequired("rate_type")

        /**
         * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
         * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        fun price(): Optional<Double> = Optional.ofNullable(price.getNullable("price"))

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
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

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
        @JsonProperty("is_prorated") @ExcludeMissing fun _isProrated() = isProrated

        /** Only set for TIERED rate_type. */
        @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        @JsonProperty("custom_rate") @ExcludeMissing fun _customRate() = customRate

        @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
                rateType = overwriteRate.rateType
                price = overwriteRate.price
                quantity = overwriteRate.quantity
                isProrated = overwriteRate.isProrated
                tiers = overwriteRate.tiers
                customRate = overwriteRate.customRate
                creditType = overwriteRate.creditType
                additionalProperties = overwriteRate.additionalProperties.toMutableMap()
            }

            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

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
            fun price(price: JsonField<Double>) = apply { this.price = price }

            /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

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

            /** Only set for TIERED rate_type. */
            fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

            /** Only set for TIERED rate_type. */
            fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

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

            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OverwriteRate && rateType == other.rateType && price == other.price && quantity == other.quantity && isProrated == other.isProrated && tiers == other.tiers && customRate == other.customRate && creditType == other.creditType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(rateType, price, quantity, isProrated, tiers, customRate, creditType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OverwriteRate{rateType=$rateType, price=$price, quantity=$quantity, isProrated=$isProrated, tiers=$tiers, customRate=$customRate, creditType=$creditType, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Product
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
                id = product.id
                name = product.name
                additionalProperties = product.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

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

            return /* spotless:off */ other is Product && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
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

    class Target
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val COMMIT_RATE = of("COMMIT_RATE")

            @JvmField val LIST_RATE = of("LIST_RATE")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Target && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val OVERWRITE = of("OVERWRITE")

            @JvmField val MULTIPLIER = of("MULTIPLIER")

            @JvmField val TIERED = of("TIERED")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
    @NoAutoDetect
    class Value
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
                additionalProperties = value.additionalProperties.toMutableMap()
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

            fun build(): Value = Value(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Value{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Override && id == other.id && product == other.product && applicableProductTags == other.applicableProductTags && overrideSpecifiers == other.overrideSpecifiers && startingAt == other.startingAt && endingBefore == other.endingBefore && entitled == other.entitled && type == other.type && priority == other.priority && multiplier == other.multiplier && overwriteRate == other.overwriteRate && overrideTiers == other.overrideTiers && isCommitSpecific == other.isCommitSpecific && target == other.target && rateType == other.rateType && price == other.price && quantity == other.quantity && isProrated == other.isProrated && tiers == other.tiers && value == other.value && creditType == other.creditType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, product, applicableProductTags, overrideSpecifiers, startingAt, endingBefore, entitled, type, priority, multiplier, overwriteRate, overrideTiers, isCommitSpecific, target, rateType, price, quantity, isProrated, tiers, value, creditType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Override{id=$id, product=$product, applicableProductTags=$applicableProductTags, overrideSpecifiers=$overrideSpecifiers, startingAt=$startingAt, endingBefore=$endingBefore, entitled=$entitled, type=$type, priority=$priority, multiplier=$multiplier, overwriteRate=$overwriteRate, overrideTiers=$overrideTiers, isCommitSpecific=$isCommitSpecific, target=$target, rateType=$rateType, price=$price, quantity=$quantity, isProrated=$isProrated, tiers=$tiers, value=$value, creditType=$creditType, additionalProperties=$additionalProperties}"
}
