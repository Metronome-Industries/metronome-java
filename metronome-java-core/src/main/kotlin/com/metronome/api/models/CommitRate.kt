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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A distinct rate on the rate card. You can choose to use this rate rather than list rate when
 * consuming a credit or commit.
 */
class CommitRate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val rateType: JsonField<RateType>,
    private val price: JsonField<Double>,
    private val tiers: JsonField<List<Tier>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("rate_type") @ExcludeMissing rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tiers") @ExcludeMissing tiers: JsonField<List<Tier>> = JsonMissing.of(),
    ) : this(rateType, price, tiers, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rateType(): RateType = rateType.getRequired("rate_type")

    /**
     * Commit rate price. For FLAT rate_type, this must be >=0.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun price(): Optional<Double> = price.getOptional("price")

    /**
     * Only set for TIERED rate_type.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tiers(): Optional<List<Tier>> = tiers.getOptional("tiers")

    /**
     * Returns the raw JSON value of [rateType].
     *
     * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

    /**
     * Returns the raw JSON value of [tiers].
     *
     * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

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
         * Returns a mutable builder for constructing an instance of [CommitRate].
         *
         * The following fields are required:
         * ```java
         * .rateType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitRate]. */
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

        /**
         * Sets [Builder.rateType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rateType] with a well-typed [RateType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

        /** Commit rate price. For FLAT rate_type, this must be >=0. */
        fun price(price: Double) = price(JsonField.of(price))

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<Double>) = apply { this.price = price }

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
         * Returns an immutable instance of [CommitRate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .rateType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CommitRate =
            CommitRate(
                checkRequired("rateType", rateType),
                price,
                (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CommitRate = apply {
        if (validated) {
            return@apply
        }

        rateType().validate()
        price()
        tiers().ifPresent { it.forEach { it.validate() } }
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
        (rateType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (price.asKnown().isPresent) 1 else 0) +
            (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitRate &&
            rateType == other.rateType &&
            price == other.price &&
            tiers == other.tiers &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(rateType, price, tiers, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommitRate{rateType=$rateType, price=$price, tiers=$tiers, additionalProperties=$additionalProperties}"
}
