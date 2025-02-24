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
class Override
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("starting_at")
    @ExcludeMissing
    private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("applicable_product_tags")
    @ExcludeMissing
    private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("credit_type")
    @ExcludeMissing
    private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
    @JsonProperty("ending_before")
    @ExcludeMissing
    private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("entitled")
    @ExcludeMissing
    private val entitled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("is_commit_specific")
    @ExcludeMissing
    private val isCommitSpecific: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("is_prorated")
    @ExcludeMissing
    private val isProrated: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("multiplier")
    @ExcludeMissing
    private val multiplier: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("override_specifiers")
    @ExcludeMissing
    private val overrideSpecifiers: JsonField<List<OverrideSpecifier>> = JsonMissing.of(),
    @JsonProperty("override_tiers")
    @ExcludeMissing
    private val overrideTiers: JsonField<List<OverrideTier>> = JsonMissing.of(),
    @JsonProperty("overwrite_rate")
    @ExcludeMissing
    private val overwriteRate: JsonField<OverwriteRate> = JsonMissing.of(),
    @JsonProperty("price") @ExcludeMissing private val price: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("priority")
    @ExcludeMissing
    private val priority: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("product")
    @ExcludeMissing
    private val product: JsonField<Product> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("rate_type")
    @ExcludeMissing
    private val rateType: JsonField<RateType> = JsonMissing.of(),
    @JsonProperty("target")
    @ExcludeMissing
    private val target: JsonField<Target> = JsonMissing.of(),
    @JsonProperty("tiers")
    @ExcludeMissing
    private val tiers: JsonField<List<Tier>> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("value") @ExcludeMissing private val value: JsonField<Value> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

    fun applicableProductTags(): Optional<List<String>> =
        Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

    fun creditType(): Optional<CreditTypeData> =
        Optional.ofNullable(creditType.getNullable("credit_type"))

    fun endingBefore(): Optional<OffsetDateTime> =
        Optional.ofNullable(endingBefore.getNullable("ending_before"))

    fun entitled(): Optional<Boolean> = Optional.ofNullable(entitled.getNullable("entitled"))

    fun isCommitSpecific(): Optional<Boolean> =
        Optional.ofNullable(isCommitSpecific.getNullable("is_commit_specific"))

    /**
     * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to true.
     */
    fun isProrated(): Optional<Boolean> = Optional.ofNullable(isProrated.getNullable("is_prorated"))

    fun multiplier(): Optional<Double> = Optional.ofNullable(multiplier.getNullable("multiplier"))

    fun overrideSpecifiers(): Optional<List<OverrideSpecifier>> =
        Optional.ofNullable(overrideSpecifiers.getNullable("override_specifiers"))

    fun overrideTiers(): Optional<List<OverrideTier>> =
        Optional.ofNullable(overrideTiers.getNullable("override_tiers"))

    fun overwriteRate(): Optional<OverwriteRate> =
        Optional.ofNullable(overwriteRate.getNullable("overwrite_rate"))

    /**
     * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
     * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
     */
    fun price(): Optional<Double> = Optional.ofNullable(price.getNullable("price"))

    fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

    fun product(): Optional<Product> = Optional.ofNullable(product.getNullable("product"))

    /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
    fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

    fun rateType(): Optional<RateType> = Optional.ofNullable(rateType.getNullable("rate_type"))

    fun target(): Optional<Target> = Optional.ofNullable(target.getNullable("target"))

    /** Only set for TIERED rate_type. */
    fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers.getNullable("tiers"))

    fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

    /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
    fun value(): Optional<Value> = Optional.ofNullable(value.getNullable("value"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("starting_at")
    @ExcludeMissing
    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

    @JsonProperty("applicable_product_tags")
    @ExcludeMissing
    fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

    @JsonProperty("credit_type")
    @ExcludeMissing
    fun _creditType(): JsonField<CreditTypeData> = creditType

    @JsonProperty("ending_before")
    @ExcludeMissing
    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

    @JsonProperty("entitled") @ExcludeMissing fun _entitled(): JsonField<Boolean> = entitled

    @JsonProperty("is_commit_specific")
    @ExcludeMissing
    fun _isCommitSpecific(): JsonField<Boolean> = isCommitSpecific

    /**
     * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to true.
     */
    @JsonProperty("is_prorated") @ExcludeMissing fun _isProrated(): JsonField<Boolean> = isProrated

    @JsonProperty("multiplier") @ExcludeMissing fun _multiplier(): JsonField<Double> = multiplier

    @JsonProperty("override_specifiers")
    @ExcludeMissing
    fun _overrideSpecifiers(): JsonField<List<OverrideSpecifier>> = overrideSpecifiers

    @JsonProperty("override_tiers")
    @ExcludeMissing
    fun _overrideTiers(): JsonField<List<OverrideTier>> = overrideTiers

    @JsonProperty("overwrite_rate")
    @ExcludeMissing
    fun _overwriteRate(): JsonField<OverwriteRate> = overwriteRate

    /**
     * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
     * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

    @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

    /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

    @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

    @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

    /** Only set for TIERED rate_type. */
    @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Override = apply {
        if (validated) {
            return@apply
        }

        id()
        startingAt()
        applicableProductTags()
        creditType().ifPresent { it.validate() }
        endingBefore()
        entitled()
        isCommitSpecific()
        isProrated()
        multiplier()
        overrideSpecifiers().ifPresent { it.forEach { it.validate() } }
        overrideTiers().ifPresent { it.forEach { it.validate() } }
        overwriteRate().ifPresent { it.validate() }
        price()
        priority()
        product().ifPresent { it.validate() }
        quantity()
        rateType()
        target()
        tiers().ifPresent { it.forEach { it.validate() } }
        type()
        value().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Override]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var startingAt: JsonField<OffsetDateTime>? = null
        private var applicableProductTags: JsonField<MutableList<String>>? = null
        private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
        private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
        private var entitled: JsonField<Boolean> = JsonMissing.of()
        private var isCommitSpecific: JsonField<Boolean> = JsonMissing.of()
        private var isProrated: JsonField<Boolean> = JsonMissing.of()
        private var multiplier: JsonField<Double> = JsonMissing.of()
        private var overrideSpecifiers: JsonField<MutableList<OverrideSpecifier>>? = null
        private var overrideTiers: JsonField<MutableList<OverrideTier>>? = null
        private var overwriteRate: JsonField<OverwriteRate> = JsonMissing.of()
        private var price: JsonField<Double> = JsonMissing.of()
        private var priority: JsonField<Double> = JsonMissing.of()
        private var product: JsonField<Product> = JsonMissing.of()
        private var quantity: JsonField<Double> = JsonMissing.of()
        private var rateType: JsonField<RateType> = JsonMissing.of()
        private var target: JsonField<Target> = JsonMissing.of()
        private var tiers: JsonField<MutableList<Tier>>? = null
        private var type: JsonField<Type> = JsonMissing.of()
        private var value: JsonField<Value> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(override: Override) = apply {
            id = override.id
            startingAt = override.startingAt
            applicableProductTags = override.applicableProductTags.map { it.toMutableList() }
            creditType = override.creditType
            endingBefore = override.endingBefore
            entitled = override.entitled
            isCommitSpecific = override.isCommitSpecific
            isProrated = override.isProrated
            multiplier = override.multiplier
            overrideSpecifiers = override.overrideSpecifiers.map { it.toMutableList() }
            overrideTiers = override.overrideTiers.map { it.toMutableList() }
            overwriteRate = override.overwriteRate
            price = override.price
            priority = override.priority
            product = override.product
            quantity = override.quantity
            rateType = override.rateType
            target = override.target
            tiers = override.tiers.map { it.toMutableList() }
            type = override.type
            value = override.value
            additionalProperties = override.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            this.startingAt = startingAt
        }

        fun applicableProductTags(applicableProductTags: List<String>) =
            applicableProductTags(JsonField.of(applicableProductTags))

        fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
            this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
        }

        fun addApplicableProductTag(applicableProductTag: String) = apply {
            applicableProductTags =
                (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(applicableProductTag)
                }
        }

        fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

        fun creditType(creditType: JsonField<CreditTypeData>) = apply {
            this.creditType = creditType
        }

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
        }

        fun entitled(entitled: Boolean) = entitled(JsonField.of(entitled))

        fun entitled(entitled: JsonField<Boolean>) = apply { this.entitled = entitled }

        fun isCommitSpecific(isCommitSpecific: Boolean) =
            isCommitSpecific(JsonField.of(isCommitSpecific))

        fun isCommitSpecific(isCommitSpecific: JsonField<Boolean>) = apply {
            this.isCommitSpecific = isCommitSpecific
        }

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

        fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

        fun multiplier(multiplier: JsonField<Double>) = apply { this.multiplier = multiplier }

        fun overrideSpecifiers(overrideSpecifiers: List<OverrideSpecifier>) =
            overrideSpecifiers(JsonField.of(overrideSpecifiers))

        fun overrideSpecifiers(overrideSpecifiers: JsonField<List<OverrideSpecifier>>) = apply {
            this.overrideSpecifiers = overrideSpecifiers.map { it.toMutableList() }
        }

        fun addOverrideSpecifier(overrideSpecifier: OverrideSpecifier) = apply {
            overrideSpecifiers =
                (overrideSpecifiers ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(overrideSpecifier)
                }
        }

        fun overrideTiers(overrideTiers: List<OverrideTier>) =
            overrideTiers(JsonField.of(overrideTiers))

        fun overrideTiers(overrideTiers: JsonField<List<OverrideTier>>) = apply {
            this.overrideTiers = overrideTiers.map { it.toMutableList() }
        }

        fun addOverrideTier(overrideTier: OverrideTier) = apply {
            overrideTiers =
                (overrideTiers ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(overrideTier)
                }
        }

        fun overwriteRate(overwriteRate: OverwriteRate) = overwriteRate(JsonField.of(overwriteRate))

        fun overwriteRate(overwriteRate: JsonField<OverwriteRate>) = apply {
            this.overwriteRate = overwriteRate
        }

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

        fun priority(priority: Double) = priority(JsonField.of(priority))

        fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

        fun product(product: Product) = product(JsonField.of(product))

        fun product(product: JsonField<Product>) = apply { this.product = product }

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

        fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

        fun target(target: Target) = target(JsonField.of(target))

        fun target(target: JsonField<Target>) = apply { this.target = target }

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

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        fun value(value: Value) = value(JsonField.of(value))

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        fun value(value: JsonField<Value>) = apply { this.value = value }

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
                checkRequired("id", id),
                checkRequired("startingAt", startingAt),
                (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                creditType,
                endingBefore,
                entitled,
                isCommitSpecific,
                isProrated,
                multiplier,
                (overrideSpecifiers ?: JsonMissing.of()).map { it.toImmutable() },
                (overrideTiers ?: JsonMissing.of()).map { it.toImmutable() },
                overwriteRate,
                price,
                priority,
                product,
                quantity,
                rateType,
                target,
                (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                type,
                value,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class OverrideSpecifier
    @JsonCreator
    private constructor(
        @JsonProperty("commit_ids")
        @ExcludeMissing
        private val commitIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("presentation_group_values")
        @ExcludeMissing
        private val presentationGroupValues: JsonField<PresentationGroupValues> = JsonMissing.of(),
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        private val pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_tags")
        @ExcludeMissing
        private val productTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("recurring_commit_ids")
        @ExcludeMissing
        private val recurringCommitIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("recurring_credit_ids")
        @ExcludeMissing
        private val recurringCreditIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun commitIds(): Optional<List<String>> =
            Optional.ofNullable(commitIds.getNullable("commit_ids"))

        fun presentationGroupValues(): Optional<PresentationGroupValues> =
            Optional.ofNullable(presentationGroupValues.getNullable("presentation_group_values"))

        fun pricingGroupValues(): Optional<PricingGroupValues> =
            Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

        fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("product_id"))

        fun productTags(): Optional<List<String>> =
            Optional.ofNullable(productTags.getNullable("product_tags"))

        fun recurringCommitIds(): Optional<List<String>> =
            Optional.ofNullable(recurringCommitIds.getNullable("recurring_commit_ids"))

        fun recurringCreditIds(): Optional<List<String>> =
            Optional.ofNullable(recurringCreditIds.getNullable("recurring_credit_ids"))

        @JsonProperty("commit_ids")
        @ExcludeMissing
        fun _commitIds(): JsonField<List<String>> = commitIds

        @JsonProperty("presentation_group_values")
        @ExcludeMissing
        fun _presentationGroupValues(): JsonField<PresentationGroupValues> = presentationGroupValues

        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        @JsonProperty("product_tags")
        @ExcludeMissing
        fun _productTags(): JsonField<List<String>> = productTags

        @JsonProperty("recurring_commit_ids")
        @ExcludeMissing
        fun _recurringCommitIds(): JsonField<List<String>> = recurringCommitIds

        @JsonProperty("recurring_credit_ids")
        @ExcludeMissing
        fun _recurringCreditIds(): JsonField<List<String>> = recurringCreditIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): OverrideSpecifier = apply {
            if (validated) {
                return@apply
            }

            commitIds()
            presentationGroupValues().ifPresent { it.validate() }
            pricingGroupValues().ifPresent { it.validate() }
            productId()
            productTags()
            recurringCommitIds()
            recurringCreditIds()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OverrideSpecifier]. */
        class Builder internal constructor() {

            private var commitIds: JsonField<MutableList<String>>? = null
            private var presentationGroupValues: JsonField<PresentationGroupValues> =
                JsonMissing.of()
            private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var productTags: JsonField<MutableList<String>>? = null
            private var recurringCommitIds: JsonField<MutableList<String>>? = null
            private var recurringCreditIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(overrideSpecifier: OverrideSpecifier) = apply {
                commitIds = overrideSpecifier.commitIds.map { it.toMutableList() }
                presentationGroupValues = overrideSpecifier.presentationGroupValues
                pricingGroupValues = overrideSpecifier.pricingGroupValues
                productId = overrideSpecifier.productId
                productTags = overrideSpecifier.productTags.map { it.toMutableList() }
                recurringCommitIds = overrideSpecifier.recurringCommitIds.map { it.toMutableList() }
                recurringCreditIds = overrideSpecifier.recurringCreditIds.map { it.toMutableList() }
                additionalProperties = overrideSpecifier.additionalProperties.toMutableMap()
            }

            fun commitIds(commitIds: List<String>) = commitIds(JsonField.of(commitIds))

            fun commitIds(commitIds: JsonField<List<String>>) = apply {
                this.commitIds = commitIds.map { it.toMutableList() }
            }

            fun addCommitId(commitId: String) = apply {
                commitIds =
                    (commitIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(commitId)
                    }
            }

            fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
                presentationGroupValues(JsonField.of(presentationGroupValues))

            fun presentationGroupValues(
                presentationGroupValues: JsonField<PresentationGroupValues>
            ) = apply { this.presentationGroupValues = presentationGroupValues }

            fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                pricingGroupValues(JsonField.of(pricingGroupValues))

            fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                this.pricingGroupValues = pricingGroupValues
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

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

            fun recurringCommitIds(recurringCommitIds: List<String>) =
                recurringCommitIds(JsonField.of(recurringCommitIds))

            fun recurringCommitIds(recurringCommitIds: JsonField<List<String>>) = apply {
                this.recurringCommitIds = recurringCommitIds.map { it.toMutableList() }
            }

            fun addRecurringCommitId(recurringCommitId: String) = apply {
                recurringCommitIds =
                    (recurringCommitIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(recurringCommitId)
                    }
            }

            fun recurringCreditIds(recurringCreditIds: List<String>) =
                recurringCreditIds(JsonField.of(recurringCreditIds))

            fun recurringCreditIds(recurringCreditIds: JsonField<List<String>>) = apply {
                this.recurringCreditIds = recurringCreditIds.map { it.toMutableList() }
            }

            fun addRecurringCreditId(recurringCreditId: String) = apply {
                recurringCreditIds =
                    (recurringCreditIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(recurringCreditId)
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

            fun build(): OverrideSpecifier =
                OverrideSpecifier(
                    (commitIds ?: JsonMissing.of()).map { it.toImmutable() },
                    presentationGroupValues,
                    pricingGroupValues,
                    productId,
                    (productTags ?: JsonMissing.of()).map { it.toImmutable() },
                    (recurringCommitIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (recurringCreditIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class PresentationGroupValues
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PresentationGroupValues = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PresentationGroupValues]. */
            class Builder internal constructor() {

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

            return /* spotless:off */ other is OverrideSpecifier && commitIds == other.commitIds && presentationGroupValues == other.presentationGroupValues && pricingGroupValues == other.pricingGroupValues && productId == other.productId && productTags == other.productTags && recurringCommitIds == other.recurringCommitIds && recurringCreditIds == other.recurringCreditIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(commitIds, presentationGroupValues, pricingGroupValues, productId, productTags, recurringCommitIds, recurringCreditIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OverrideSpecifier{commitIds=$commitIds, presentationGroupValues=$presentationGroupValues, pricingGroupValues=$pricingGroupValues, productId=$productId, productTags=$productTags, recurringCommitIds=$recurringCommitIds, recurringCreditIds=$recurringCreditIds, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class OverrideTier
    @JsonCreator
    private constructor(
        @JsonProperty("multiplier")
        @ExcludeMissing
        private val multiplier: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("size")
        @ExcludeMissing
        private val size: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun multiplier(): Double = multiplier.getRequired("multiplier")

        fun size(): Optional<Double> = Optional.ofNullable(size.getNullable("size"))

        @JsonProperty("multiplier")
        @ExcludeMissing
        fun _multiplier(): JsonField<Double> = multiplier

        @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Double> = size

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): OverrideTier = apply {
            if (validated) {
                return@apply
            }

            multiplier()
            size()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OverrideTier]. */
        class Builder internal constructor() {

            private var multiplier: JsonField<Double>? = null
            private var size: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(overrideTier: OverrideTier) = apply {
                multiplier = overrideTier.multiplier
                size = overrideTier.size
                additionalProperties = overrideTier.additionalProperties.toMutableMap()
            }

            fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

            fun multiplier(multiplier: JsonField<Double>) = apply { this.multiplier = multiplier }

            fun size(size: Double) = size(JsonField.of(size))

            fun size(size: JsonField<Double>) = apply { this.size = size }

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
                    checkRequired("multiplier", multiplier),
                    size,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OverrideTier && multiplier == other.multiplier && size == other.size && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(multiplier, size, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OverrideTier{multiplier=$multiplier, size=$size, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class OverwriteRate
    @JsonCreator
    private constructor(
        @JsonProperty("rate_type")
        @ExcludeMissing
        private val rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("credit_type")
        @ExcludeMissing
        private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("custom_rate")
        @ExcludeMissing
        private val customRate: JsonField<CustomRate> = JsonMissing.of(),
        @JsonProperty("is_prorated")
        @ExcludeMissing
        private val isProrated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("price")
        @ExcludeMissing
        private val price: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tiers")
        @ExcludeMissing
        private val tiers: JsonField<List<Tier>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun rateType(): RateType = rateType.getRequired("rate_type")

        fun creditType(): Optional<CreditTypeData> =
            Optional.ofNullable(creditType.getNullable("credit_type"))

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        fun customRate(): Optional<CustomRate> =
            Optional.ofNullable(customRate.getNullable("custom_rate"))

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
        fun isProrated(): Optional<Boolean> =
            Optional.ofNullable(isProrated.getNullable("is_prorated"))

        /**
         * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
         * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        fun price(): Optional<Double> = Optional.ofNullable(price.getNullable("price"))

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

        /** Only set for TIERED rate_type. */
        fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers.getNullable("tiers"))

        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        @JsonProperty("custom_rate")
        @ExcludeMissing
        fun _customRate(): JsonField<CustomRate> = customRate

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
        @JsonProperty("is_prorated")
        @ExcludeMissing
        fun _isProrated(): JsonField<Boolean> = isProrated

        /**
         * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
         * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /** Only set for TIERED rate_type. */
        @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): OverwriteRate = apply {
            if (validated) {
                return@apply
            }

            rateType()
            creditType().ifPresent { it.validate() }
            customRate().ifPresent { it.validate() }
            isProrated()
            price()
            quantity()
            tiers().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OverwriteRate]. */
        class Builder internal constructor() {

            private var rateType: JsonField<RateType>? = null
            private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var customRate: JsonField<CustomRate> = JsonMissing.of()
            private var isProrated: JsonField<Boolean> = JsonMissing.of()
            private var price: JsonField<Double> = JsonMissing.of()
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var tiers: JsonField<MutableList<Tier>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(overwriteRate: OverwriteRate) = apply {
                rateType = overwriteRate.rateType
                creditType = overwriteRate.creditType
                customRate = overwriteRate.customRate
                isProrated = overwriteRate.isProrated
                price = overwriteRate.price
                quantity = overwriteRate.quantity
                tiers = overwriteRate.tiers.map { it.toMutableList() }
                additionalProperties = overwriteRate.additionalProperties.toMutableMap()
            }

            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): OverwriteRate =
                OverwriteRate(
                    checkRequired("rateType", rateType),
                    creditType,
                    customRate,
                    isProrated,
                    price,
                    quantity,
                    (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class RateType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

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
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OverwriteRate && rateType == other.rateType && creditType == other.creditType && customRate == other.customRate && isProrated == other.isProrated && price == other.price && quantity == other.quantity && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(rateType, creditType, customRate, isProrated, price, quantity, tiers, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OverwriteRate{rateType=$rateType, creditType=$creditType, customRate=$customRate, isProrated=$isProrated, price=$price, quantity=$quantity, tiers=$tiers, additionalProperties=$additionalProperties}"
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

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Product = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Product]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var name: JsonField<String>? = null
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
                    checkRequired("id", id),
                    checkRequired("name", name),
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

    class RateType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FLAT,
            PERCENTAGE,
            SUBSCRIPTION,
            TIERED,
            CUSTOM,
            /** An enum member indicating that [RateType] was instantiated with an unknown value. */
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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

            return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Target @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val COMMIT_RATE = of("COMMIT_RATE")

            @JvmField val LIST_RATE = of("LIST_RATE")

            @JvmStatic fun of(value: String) = Target(JsonField.of(value))
        }

        /** An enum containing [Target]'s known values. */
        enum class Known {
            COMMIT_RATE,
            LIST_RATE,
        }

        /**
         * An enum containing [Target]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Target] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMMIT_RATE,
            LIST_RATE,
            /** An enum member indicating that [Target] was instantiated with an unknown value. */
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
                COMMIT_RATE -> Value.COMMIT_RATE
                LIST_RATE -> Value.LIST_RATE
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
                COMMIT_RATE -> Known.COMMIT_RATE
                LIST_RATE -> Known.LIST_RATE
                else -> throw MetronomeInvalidDataException("Unknown Target: $value")
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

            return /* spotless:off */ other is Target && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OVERWRITE = of("OVERWRITE")

            @JvmField val MULTIPLIER = of("MULTIPLIER")

            @JvmField val TIERED = of("TIERED")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            OVERWRITE,
            MULTIPLIER,
            TIERED,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OVERWRITE,
            MULTIPLIER,
            TIERED,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                OVERWRITE -> Value.OVERWRITE
                MULTIPLIER -> Value.MULTIPLIER
                TIERED -> Value.TIERED
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
                OVERWRITE -> Known.OVERWRITE
                MULTIPLIER -> Known.MULTIPLIER
                TIERED -> Known.TIERED
                else -> throw MetronomeInvalidDataException("Unknown Type: $value")
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
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Value = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Value]. */
        class Builder internal constructor() {

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

        return /* spotless:off */ other is Override && id == other.id && startingAt == other.startingAt && applicableProductTags == other.applicableProductTags && creditType == other.creditType && endingBefore == other.endingBefore && entitled == other.entitled && isCommitSpecific == other.isCommitSpecific && isProrated == other.isProrated && multiplier == other.multiplier && overrideSpecifiers == other.overrideSpecifiers && overrideTiers == other.overrideTiers && overwriteRate == other.overwriteRate && price == other.price && priority == other.priority && product == other.product && quantity == other.quantity && rateType == other.rateType && target == other.target && tiers == other.tiers && type == other.type && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, startingAt, applicableProductTags, creditType, endingBefore, entitled, isCommitSpecific, isProrated, multiplier, overrideSpecifiers, overrideTiers, overwriteRate, price, priority, product, quantity, rateType, target, tiers, type, value, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Override{id=$id, startingAt=$startingAt, applicableProductTags=$applicableProductTags, creditType=$creditType, endingBefore=$endingBefore, entitled=$entitled, isCommitSpecific=$isCommitSpecific, isProrated=$isProrated, multiplier=$multiplier, overrideSpecifiers=$overrideSpecifiers, overrideTiers=$overrideTiers, overwriteRate=$overwriteRate, price=$price, priority=$priority, product=$product, quantity=$quantity, rateType=$rateType, target=$target, tiers=$tiers, type=$type, value=$value, additionalProperties=$additionalProperties}"
}
