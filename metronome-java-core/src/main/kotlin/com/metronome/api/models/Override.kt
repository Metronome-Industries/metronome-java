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
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Override
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val startingAt: JsonField<OffsetDateTime>,
    private val applicableProductTags: JsonField<List<String>>,
    private val creditType: JsonField<CreditTypeData>,
    private val endingBefore: JsonField<OffsetDateTime>,
    private val entitled: JsonField<Boolean>,
    private val isCommitSpecific: JsonField<Boolean>,
    private val isProrated: JsonField<Boolean>,
    private val multiplier: JsonField<Double>,
    private val overrideSpecifiers: JsonField<List<OverrideSpecifier>>,
    private val overrideTiers: JsonField<List<OverrideTier>>,
    private val overwriteRate: JsonField<OverwriteRate>,
    private val price: JsonField<Double>,
    private val priority: JsonField<Double>,
    private val product: JsonField<Product>,
    private val quantity: JsonField<Double>,
    private val rateType: JsonField<RateType>,
    private val target: JsonField<Target>,
    private val tiers: JsonField<List<Tier>>,
    private val type: JsonField<Type>,
    private val value: JsonField<Value>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("credit_type")
        @ExcludeMissing
        creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("entitled") @ExcludeMissing entitled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_commit_specific")
        @ExcludeMissing
        isCommitSpecific: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_prorated")
        @ExcludeMissing
        isProrated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("multiplier")
        @ExcludeMissing
        multiplier: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("override_specifiers")
        @ExcludeMissing
        overrideSpecifiers: JsonField<List<OverrideSpecifier>> = JsonMissing.of(),
        @JsonProperty("override_tiers")
        @ExcludeMissing
        overrideTiers: JsonField<List<OverrideTier>> = JsonMissing.of(),
        @JsonProperty("overwrite_rate")
        @ExcludeMissing
        overwriteRate: JsonField<OverwriteRate> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("product") @ExcludeMissing product: JsonField<Product> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rate_type") @ExcludeMissing rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("target") @ExcludeMissing target: JsonField<Target> = JsonMissing.of(),
        @JsonProperty("tiers") @ExcludeMissing tiers: JsonField<List<Tier>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
    ) : this(
        id,
        startingAt,
        applicableProductTags,
        creditType,
        endingBefore,
        entitled,
        isCommitSpecific,
        isProrated,
        multiplier,
        overrideSpecifiers,
        overrideTiers,
        overwriteRate,
        price,
        priority,
        product,
        quantity,
        rateType,
        target,
        tiers,
        type,
        value,
        mutableMapOf(),
    )

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applicableProductTags(): Optional<List<String>> =
        applicableProductTags.getOptional("applicable_product_tags")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditType(): Optional<CreditTypeData> = creditType.getOptional("credit_type")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entitled(): Optional<Boolean> = entitled.getOptional("entitled")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isCommitSpecific(): Optional<Boolean> = isCommitSpecific.getOptional("is_commit_specific")

    /**
     * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to true.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isProrated(): Optional<Boolean> = isProrated.getOptional("is_prorated")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun multiplier(): Optional<Double> = multiplier.getOptional("multiplier")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overrideSpecifiers(): Optional<List<OverrideSpecifier>> =
        overrideSpecifiers.getOptional("override_specifiers")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overrideTiers(): Optional<List<OverrideTier>> = overrideTiers.getOptional("override_tiers")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overwriteRate(): Optional<OverwriteRate> = overwriteRate.getOptional("overwrite_rate")

    /**
     * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
     * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun price(): Optional<Double> = price.getOptional("price")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priority(): Optional<Double> = priority.getOptional("priority")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun product(): Optional<Product> = product.getOptional("product")

    /**
     * Default quantity. For SUBSCRIPTION rate_type, this must be >=0.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quantity(): Optional<Double> = quantity.getOptional("quantity")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rateType(): Optional<RateType> = rateType.getOptional("rate_type")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun target(): Optional<Target> = target.getOptional("target")

    /**
     * Only set for TIERED rate_type.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tiers(): Optional<List<Tier>> = tiers.getOptional("tiers")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<Value> = value.getOptional("value")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [startingAt].
     *
     * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starting_at")
    @ExcludeMissing
    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

    /**
     * Returns the raw JSON value of [applicableProductTags].
     *
     * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("applicable_product_tags")
    @ExcludeMissing
    fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

    /**
     * Returns the raw JSON value of [creditType].
     *
     * Unlike [creditType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_type")
    @ExcludeMissing
    fun _creditType(): JsonField<CreditTypeData> = creditType

    /**
     * Returns the raw JSON value of [endingBefore].
     *
     * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ending_before")
    @ExcludeMissing
    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

    /**
     * Returns the raw JSON value of [entitled].
     *
     * Unlike [entitled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entitled") @ExcludeMissing fun _entitled(): JsonField<Boolean> = entitled

    /**
     * Returns the raw JSON value of [isCommitSpecific].
     *
     * Unlike [isCommitSpecific], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("is_commit_specific")
    @ExcludeMissing
    fun _isCommitSpecific(): JsonField<Boolean> = isCommitSpecific

    /**
     * Returns the raw JSON value of [isProrated].
     *
     * Unlike [isProrated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_prorated") @ExcludeMissing fun _isProrated(): JsonField<Boolean> = isProrated

    /**
     * Returns the raw JSON value of [multiplier].
     *
     * Unlike [multiplier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("multiplier") @ExcludeMissing fun _multiplier(): JsonField<Double> = multiplier

    /**
     * Returns the raw JSON value of [overrideSpecifiers].
     *
     * Unlike [overrideSpecifiers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("override_specifiers")
    @ExcludeMissing
    fun _overrideSpecifiers(): JsonField<List<OverrideSpecifier>> = overrideSpecifiers

    /**
     * Returns the raw JSON value of [overrideTiers].
     *
     * Unlike [overrideTiers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("override_tiers")
    @ExcludeMissing
    fun _overrideTiers(): JsonField<List<OverrideTier>> = overrideTiers

    /**
     * Returns the raw JSON value of [overwriteRate].
     *
     * Unlike [overwriteRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overwrite_rate")
    @ExcludeMissing
    fun _overwriteRate(): JsonField<OverwriteRate> = overwriteRate

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

    /**
     * Returns the raw JSON value of [product].
     *
     * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

    /**
     * Returns the raw JSON value of [rateType].
     *
     * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

    /**
     * Returns the raw JSON value of [target].
     *
     * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

    /**
     * Returns the raw JSON value of [tiers].
     *
     * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Override].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .startingAt()
         * ```
         */
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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

        /**
         * Sets [Builder.startingAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            this.startingAt = startingAt
        }

        fun applicableProductTags(applicableProductTags: List<String>) =
            applicableProductTags(JsonField.of(applicableProductTags))

        /**
         * Sets [Builder.applicableProductTags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicableProductTags] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
            this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [applicableProductTags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addApplicableProductTag(applicableProductTag: String) = apply {
            applicableProductTags =
                (applicableProductTags ?: JsonField.of(mutableListOf())).also {
                    checkKnown("applicableProductTags", it).add(applicableProductTag)
                }
        }

        fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

        /**
         * Sets [Builder.creditType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditType] with a well-typed [CreditTypeData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditType(creditType: JsonField<CreditTypeData>) = apply {
            this.creditType = creditType
        }

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        /**
         * Sets [Builder.endingBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
        }

        fun entitled(entitled: Boolean) = entitled(JsonField.of(entitled))

        /**
         * Sets [Builder.entitled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entitled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entitled(entitled: JsonField<Boolean>) = apply { this.entitled = entitled }

        fun isCommitSpecific(isCommitSpecific: Boolean) =
            isCommitSpecific(JsonField.of(isCommitSpecific))

        /**
         * Sets [Builder.isCommitSpecific] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isCommitSpecific] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isCommitSpecific(isCommitSpecific: JsonField<Boolean>) = apply {
            this.isCommitSpecific = isCommitSpecific
        }

        /**
         * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set to
         * true.
         */
        fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

        /**
         * Sets [Builder.isProrated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isProrated] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isProrated(isProrated: JsonField<Boolean>) = apply { this.isProrated = isProrated }

        fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

        /**
         * Sets [Builder.multiplier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.multiplier] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun multiplier(multiplier: JsonField<Double>) = apply { this.multiplier = multiplier }

        fun overrideSpecifiers(overrideSpecifiers: List<OverrideSpecifier>) =
            overrideSpecifiers(JsonField.of(overrideSpecifiers))

        /**
         * Sets [Builder.overrideSpecifiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overrideSpecifiers] with a well-typed
         * `List<OverrideSpecifier>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun overrideSpecifiers(overrideSpecifiers: JsonField<List<OverrideSpecifier>>) = apply {
            this.overrideSpecifiers = overrideSpecifiers.map { it.toMutableList() }
        }

        /**
         * Adds a single [OverrideSpecifier] to [overrideSpecifiers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOverrideSpecifier(overrideSpecifier: OverrideSpecifier) = apply {
            overrideSpecifiers =
                (overrideSpecifiers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("overrideSpecifiers", it).add(overrideSpecifier)
                }
        }

        fun overrideTiers(overrideTiers: List<OverrideTier>) =
            overrideTiers(JsonField.of(overrideTiers))

        /**
         * Sets [Builder.overrideTiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overrideTiers] with a well-typed `List<OverrideTier>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun overrideTiers(overrideTiers: JsonField<List<OverrideTier>>) = apply {
            this.overrideTiers = overrideTiers.map { it.toMutableList() }
        }

        /**
         * Adds a single [OverrideTier] to [overrideTiers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOverrideTier(overrideTier: OverrideTier) = apply {
            overrideTiers =
                (overrideTiers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("overrideTiers", it).add(overrideTier)
                }
        }

        fun overwriteRate(overwriteRate: OverwriteRate) = overwriteRate(JsonField.of(overwriteRate))

        /**
         * Sets [Builder.overwriteRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overwriteRate] with a well-typed [OverwriteRate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun overwriteRate(overwriteRate: JsonField<OverwriteRate>) = apply {
            this.overwriteRate = overwriteRate
        }

        /**
         * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this is a
         * decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
         */
        fun price(price: Double) = price(JsonField.of(price))

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<Double>) = apply { this.price = price }

        fun priority(priority: Double) = priority(JsonField.of(priority))

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

        fun product(product: Product) = product(JsonField.of(product))

        /**
         * Sets [Builder.product] to an arbitrary JSON value.
         *
         * You should usually call [Builder.product] with a well-typed [Product] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun product(product: JsonField<Product>) = apply { this.product = product }

        /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

        /**
         * Sets [Builder.rateType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rateType] with a well-typed [RateType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

        fun target(target: Target) = target(JsonField.of(target))

        /**
         * Sets [Builder.target] to an arbitrary JSON value.
         *
         * You should usually call [Builder.target] with a well-typed [Target] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun target(target: JsonField<Target>) = apply { this.target = target }

        /** Only set for TIERED rate_type. */
        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

        /**
         * Sets [Builder.tiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tiers(tiers: JsonField<List<Tier>>) = apply {
            this.tiers = tiers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Tier] to [tiers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTier(tier: Tier) = apply {
            tiers =
                (tiers ?: JsonField.of(mutableListOf())).also { checkKnown("tiers", it).add(tier) }
        }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
        fun value(value: Value) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Value] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [Override].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .startingAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

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
        rateType().ifPresent { it.validate() }
        target().ifPresent { it.validate() }
        tiers().ifPresent { it.forEach { it.validate() } }
        type().ifPresent { it.validate() }
        value().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: MetronomeInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (startingAt.asKnown().isPresent) 1 else 0) +
            (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
            (creditType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endingBefore.asKnown().isPresent) 1 else 0) +
            (if (entitled.asKnown().isPresent) 1 else 0) +
            (if (isCommitSpecific.asKnown().isPresent) 1 else 0) +
            (if (isProrated.asKnown().isPresent) 1 else 0) +
            (if (multiplier.asKnown().isPresent) 1 else 0) +
            (overrideSpecifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (overrideTiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (overwriteRate.asKnown().getOrNull()?.validity() ?: 0) +
            (if (price.asKnown().isPresent) 1 else 0) +
            (if (priority.asKnown().isPresent) 1 else 0) +
            (product.asKnown().getOrNull()?.validity() ?: 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (rateType.asKnown().getOrNull()?.validity() ?: 0) +
            (target.asKnown().getOrNull()?.validity() ?: 0) +
            (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (value.asKnown().getOrNull()?.validity() ?: 0)

    class OverrideSpecifier
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingFrequency: JsonField<BillingFrequency>,
        private val commitIds: JsonField<List<String>>,
        private val presentationGroupValues: JsonField<PresentationGroupValues>,
        private val pricingGroupValues: JsonField<PricingGroupValues>,
        private val productId: JsonField<String>,
        private val productTags: JsonField<List<String>>,
        private val recurringCommitIds: JsonField<List<String>>,
        private val recurringCreditIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing_frequency")
            @ExcludeMissing
            billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
            @JsonProperty("commit_ids")
            @ExcludeMissing
            commitIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("presentation_group_values")
            @ExcludeMissing
            presentationGroupValues: JsonField<PresentationGroupValues> = JsonMissing.of(),
            @JsonProperty("pricing_group_values")
            @ExcludeMissing
            pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product_tags")
            @ExcludeMissing
            productTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("recurring_commit_ids")
            @ExcludeMissing
            recurringCommitIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("recurring_credit_ids")
            @ExcludeMissing
            recurringCreditIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            billingFrequency,
            commitIds,
            presentationGroupValues,
            pricingGroupValues,
            productId,
            productTags,
            recurringCommitIds,
            recurringCreditIds,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun billingFrequency(): Optional<BillingFrequency> =
            billingFrequency.getOptional("billing_frequency")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commitIds(): Optional<List<String>> = commitIds.getOptional("commit_ids")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun presentationGroupValues(): Optional<PresentationGroupValues> =
            presentationGroupValues.getOptional("presentation_group_values")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pricingGroupValues(): Optional<PricingGroupValues> =
            pricingGroupValues.getOptional("pricing_group_values")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productId(): Optional<String> = productId.getOptional("product_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productTags(): Optional<List<String>> = productTags.getOptional("product_tags")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun recurringCommitIds(): Optional<List<String>> =
            recurringCommitIds.getOptional("recurring_commit_ids")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun recurringCreditIds(): Optional<List<String>> =
            recurringCreditIds.getOptional("recurring_credit_ids")

        /**
         * Returns the raw JSON value of [billingFrequency].
         *
         * Unlike [billingFrequency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_frequency")
        @ExcludeMissing
        fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

        /**
         * Returns the raw JSON value of [commitIds].
         *
         * Unlike [commitIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commit_ids")
        @ExcludeMissing
        fun _commitIds(): JsonField<List<String>> = commitIds

        /**
         * Returns the raw JSON value of [presentationGroupValues].
         *
         * Unlike [presentationGroupValues], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("presentation_group_values")
        @ExcludeMissing
        fun _presentationGroupValues(): JsonField<PresentationGroupValues> = presentationGroupValues

        /**
         * Returns the raw JSON value of [pricingGroupValues].
         *
         * Unlike [pricingGroupValues], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [productTags].
         *
         * Unlike [productTags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_tags")
        @ExcludeMissing
        fun _productTags(): JsonField<List<String>> = productTags

        /**
         * Returns the raw JSON value of [recurringCommitIds].
         *
         * Unlike [recurringCommitIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recurring_commit_ids")
        @ExcludeMissing
        fun _recurringCommitIds(): JsonField<List<String>> = recurringCommitIds

        /**
         * Returns the raw JSON value of [recurringCreditIds].
         *
         * Unlike [recurringCreditIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recurring_credit_ids")
        @ExcludeMissing
        fun _recurringCreditIds(): JsonField<List<String>> = recurringCreditIds

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [OverrideSpecifier]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OverrideSpecifier]. */
        class Builder internal constructor() {

            private var billingFrequency: JsonField<BillingFrequency> = JsonMissing.of()
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
                billingFrequency = overrideSpecifier.billingFrequency
                commitIds = overrideSpecifier.commitIds.map { it.toMutableList() }
                presentationGroupValues = overrideSpecifier.presentationGroupValues
                pricingGroupValues = overrideSpecifier.pricingGroupValues
                productId = overrideSpecifier.productId
                productTags = overrideSpecifier.productTags.map { it.toMutableList() }
                recurringCommitIds = overrideSpecifier.recurringCommitIds.map { it.toMutableList() }
                recurringCreditIds = overrideSpecifier.recurringCreditIds.map { it.toMutableList() }
                additionalProperties = overrideSpecifier.additionalProperties.toMutableMap()
            }

            fun billingFrequency(billingFrequency: BillingFrequency) =
                billingFrequency(JsonField.of(billingFrequency))

            /**
             * Sets [Builder.billingFrequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingFrequency] with a well-typed
             * [BillingFrequency] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun billingFrequency(billingFrequency: JsonField<BillingFrequency>) = apply {
                this.billingFrequency = billingFrequency
            }

            fun commitIds(commitIds: List<String>) = commitIds(JsonField.of(commitIds))

            /**
             * Sets [Builder.commitIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commitIds(commitIds: JsonField<List<String>>) = apply {
                this.commitIds = commitIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [commitIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCommitId(commitId: String) = apply {
                commitIds =
                    (commitIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("commitIds", it).add(commitId)
                    }
            }

            fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
                presentationGroupValues(JsonField.of(presentationGroupValues))

            /**
             * Sets [Builder.presentationGroupValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.presentationGroupValues] with a well-typed
             * [PresentationGroupValues] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun presentationGroupValues(
                presentationGroupValues: JsonField<PresentationGroupValues>
            ) = apply { this.presentationGroupValues = presentationGroupValues }

            fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                pricingGroupValues(JsonField.of(pricingGroupValues))

            /**
             * Sets [Builder.pricingGroupValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricingGroupValues] with a well-typed
             * [PricingGroupValues] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                this.pricingGroupValues = pricingGroupValues
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun productTags(productTags: List<String>) = productTags(JsonField.of(productTags))

            /**
             * Sets [Builder.productTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productTags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productTags(productTags: JsonField<List<String>>) = apply {
                this.productTags = productTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [productTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProductTag(productTag: String) = apply {
                productTags =
                    (productTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("productTags", it).add(productTag)
                    }
            }

            fun recurringCommitIds(recurringCommitIds: List<String>) =
                recurringCommitIds(JsonField.of(recurringCommitIds))

            /**
             * Sets [Builder.recurringCommitIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recurringCommitIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recurringCommitIds(recurringCommitIds: JsonField<List<String>>) = apply {
                this.recurringCommitIds = recurringCommitIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [recurringCommitIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRecurringCommitId(recurringCommitId: String) = apply {
                recurringCommitIds =
                    (recurringCommitIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("recurringCommitIds", it).add(recurringCommitId)
                    }
            }

            fun recurringCreditIds(recurringCreditIds: List<String>) =
                recurringCreditIds(JsonField.of(recurringCreditIds))

            /**
             * Sets [Builder.recurringCreditIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recurringCreditIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recurringCreditIds(recurringCreditIds: JsonField<List<String>>) = apply {
                this.recurringCreditIds = recurringCreditIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [recurringCreditIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRecurringCreditId(recurringCreditId: String) = apply {
                recurringCreditIds =
                    (recurringCreditIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("recurringCreditIds", it).add(recurringCreditId)
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

            /**
             * Returns an immutable instance of [OverrideSpecifier].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OverrideSpecifier =
                OverrideSpecifier(
                    billingFrequency,
                    (commitIds ?: JsonMissing.of()).map { it.toImmutable() },
                    presentationGroupValues,
                    pricingGroupValues,
                    productId,
                    (productTags ?: JsonMissing.of()).map { it.toImmutable() },
                    (recurringCommitIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (recurringCreditIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): OverrideSpecifier = apply {
            if (validated) {
                return@apply
            }

            billingFrequency().ifPresent { it.validate() }
            commitIds()
            presentationGroupValues().ifPresent { it.validate() }
            pricingGroupValues().ifPresent { it.validate() }
            productId()
            productTags()
            recurringCommitIds()
            recurringCreditIds()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (billingFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                (commitIds.asKnown().getOrNull()?.size ?: 0) +
                (presentationGroupValues.asKnown().getOrNull()?.validity() ?: 0) +
                (pricingGroupValues.asKnown().getOrNull()?.validity() ?: 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (productTags.asKnown().getOrNull()?.size ?: 0) +
                (recurringCommitIds.asKnown().getOrNull()?.size ?: 0) +
                (recurringCreditIds.asKnown().getOrNull()?.size ?: 0)

        class BillingFrequency
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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
             * An enum containing [BillingFrequency]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [BillingFrequency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MONTHLY,
                QUARTERLY,
                ANNUAL,
                WEEKLY,
                /**
                 * An enum member indicating that [BillingFrequency] was instantiated with an
                 * unknown value.
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
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    ANNUAL -> Value.ANNUAL
                    WEEKLY -> Value.WEEKLY
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
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    ANNUAL -> Known.ANNUAL
                    WEEKLY -> Known.WEEKLY
                    else -> throw MetronomeInvalidDataException("Unknown BillingFrequency: $value")
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

            private var validated: Boolean = false

            fun validate(): BillingFrequency = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillingFrequency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class PresentationGroupValues
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PresentationGroupValues].
                 */
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

                /**
                 * Returns an immutable instance of [PresentationGroupValues].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PresentationGroupValues =
                    PresentationGroupValues(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): PresentationGroupValues = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PresentationGroupValues &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PresentationGroupValues{additionalProperties=$additionalProperties}"
        }

        class PricingGroupValues
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [PricingGroupValues].
                 */
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

                /**
                 * Returns an immutable instance of [PricingGroupValues].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PricingGroupValues =
                    PricingGroupValues(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): PricingGroupValues = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PricingGroupValues &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PricingGroupValues{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OverrideSpecifier &&
                billingFrequency == other.billingFrequency &&
                commitIds == other.commitIds &&
                presentationGroupValues == other.presentationGroupValues &&
                pricingGroupValues == other.pricingGroupValues &&
                productId == other.productId &&
                productTags == other.productTags &&
                recurringCommitIds == other.recurringCommitIds &&
                recurringCreditIds == other.recurringCreditIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingFrequency,
                commitIds,
                presentationGroupValues,
                pricingGroupValues,
                productId,
                productTags,
                recurringCommitIds,
                recurringCreditIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OverrideSpecifier{billingFrequency=$billingFrequency, commitIds=$commitIds, presentationGroupValues=$presentationGroupValues, pricingGroupValues=$pricingGroupValues, productId=$productId, productTags=$productTags, recurringCommitIds=$recurringCommitIds, recurringCreditIds=$recurringCreditIds, additionalProperties=$additionalProperties}"
    }

    class Product
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(id, name, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Product].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * ```
             */
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

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [Product].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Product =
                Product(
                    checkRequired("id", id),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Product = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Product &&
                id == other.id &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }

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

            @JvmField val TIERED_PERCENTAGE = of("TIERED_PERCENTAGE")

            @JvmField val CUSTOM = of("CUSTOM")

            @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
        }

        /** An enum containing [RateType]'s known values. */
        enum class Known {
            FLAT,
            PERCENTAGE,
            SUBSCRIPTION,
            TIERED,
            TIERED_PERCENTAGE,
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
            TIERED_PERCENTAGE,
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
                TIERED_PERCENTAGE -> Value.TIERED_PERCENTAGE
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
                TIERED_PERCENTAGE -> Known.TIERED_PERCENTAGE
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

        private var validated: Boolean = false

        fun validate(): RateType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RateType && value == other.value
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

        private var validated: Boolean = false

        fun validate(): Target = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Target && value == other.value
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

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Only set for CUSTOM rate_type. This field is interpreted by custom rate processors. */
    class Value
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Value]. */
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

            /**
             * Returns an immutable instance of [Value].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Value = Value(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Value = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Value && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Value{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Override &&
            id == other.id &&
            startingAt == other.startingAt &&
            applicableProductTags == other.applicableProductTags &&
            creditType == other.creditType &&
            endingBefore == other.endingBefore &&
            entitled == other.entitled &&
            isCommitSpecific == other.isCommitSpecific &&
            isProrated == other.isProrated &&
            multiplier == other.multiplier &&
            overrideSpecifiers == other.overrideSpecifiers &&
            overrideTiers == other.overrideTiers &&
            overwriteRate == other.overwriteRate &&
            price == other.price &&
            priority == other.priority &&
            product == other.product &&
            quantity == other.quantity &&
            rateType == other.rateType &&
            target == other.target &&
            tiers == other.tiers &&
            type == other.type &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            startingAt,
            applicableProductTags,
            creditType,
            endingBefore,
            entitled,
            isCommitSpecific,
            isProrated,
            multiplier,
            overrideSpecifiers,
            overrideTiers,
            overwriteRate,
            price,
            priority,
            product,
            quantity,
            rateType,
            target,
            tiers,
            type,
            value,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Override{id=$id, startingAt=$startingAt, applicableProductTags=$applicableProductTags, creditType=$creditType, endingBefore=$endingBefore, entitled=$entitled, isCommitSpecific=$isCommitSpecific, isProrated=$isProrated, multiplier=$multiplier, overrideSpecifiers=$overrideSpecifiers, overrideTiers=$overrideTiers, overwriteRate=$overwriteRate, price=$price, priority=$priority, product=$product, quantity=$quantity, rateType=$rateType, target=$target, tiers=$tiers, type=$type, value=$value, additionalProperties=$additionalProperties}"
}
