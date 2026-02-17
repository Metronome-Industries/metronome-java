// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.plans

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

class PlanListPriceAdjustmentsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chargeId: JsonField<String>,
    private val chargeType: JsonField<ChargeType>,
    private val prices: JsonField<List<Price>>,
    private val startPeriod: JsonField<Double>,
    private val quantity: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("charge_id") @ExcludeMissing chargeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("charge_type")
        @ExcludeMissing
        chargeType: JsonField<ChargeType> = JsonMissing.of(),
        @JsonProperty("prices") @ExcludeMissing prices: JsonField<List<Price>> = JsonMissing.of(),
        @JsonProperty("start_period")
        @ExcludeMissing
        startPeriod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Double> = JsonMissing.of(),
    ) : this(chargeId, chargeType, prices, startPeriod, quantity, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chargeId(): String = chargeId.getRequired("charge_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chargeType(): ChargeType = chargeType.getRequired("charge_type")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prices(): List<Price> = prices.getRequired("prices")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startPeriod(): Double = startPeriod.getRequired("start_period")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quantity(): Optional<Double> = quantity.getOptional("quantity")

    /**
     * Returns the raw JSON value of [chargeId].
     *
     * Unlike [chargeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("charge_id") @ExcludeMissing fun _chargeId(): JsonField<String> = chargeId

    /**
     * Returns the raw JSON value of [chargeType].
     *
     * Unlike [chargeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("charge_type")
    @ExcludeMissing
    fun _chargeType(): JsonField<ChargeType> = chargeType

    /**
     * Returns the raw JSON value of [prices].
     *
     * Unlike [prices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prices") @ExcludeMissing fun _prices(): JsonField<List<Price>> = prices

    /**
     * Returns the raw JSON value of [startPeriod].
     *
     * Unlike [startPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_period")
    @ExcludeMissing
    fun _startPeriod(): JsonField<Double> = startPeriod

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

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
         * Returns a mutable builder for constructing an instance of
         * [PlanListPriceAdjustmentsResponse].
         *
         * The following fields are required:
         * ```java
         * .chargeId()
         * .chargeType()
         * .prices()
         * .startPeriod()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanListPriceAdjustmentsResponse]. */
    class Builder internal constructor() {

        private var chargeId: JsonField<String>? = null
        private var chargeType: JsonField<ChargeType>? = null
        private var prices: JsonField<MutableList<Price>>? = null
        private var startPeriod: JsonField<Double>? = null
        private var quantity: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planListPriceAdjustmentsResponse: PlanListPriceAdjustmentsResponse) =
            apply {
                chargeId = planListPriceAdjustmentsResponse.chargeId
                chargeType = planListPriceAdjustmentsResponse.chargeType
                prices = planListPriceAdjustmentsResponse.prices.map { it.toMutableList() }
                startPeriod = planListPriceAdjustmentsResponse.startPeriod
                quantity = planListPriceAdjustmentsResponse.quantity
                additionalProperties =
                    planListPriceAdjustmentsResponse.additionalProperties.toMutableMap()
            }

        fun chargeId(chargeId: String) = chargeId(JsonField.of(chargeId))

        /**
         * Sets [Builder.chargeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chargeId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chargeId(chargeId: JsonField<String>) = apply { this.chargeId = chargeId }

        fun chargeType(chargeType: ChargeType) = chargeType(JsonField.of(chargeType))

        /**
         * Sets [Builder.chargeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chargeType] with a well-typed [ChargeType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun chargeType(chargeType: JsonField<ChargeType>) = apply { this.chargeType = chargeType }

        fun prices(prices: List<Price>) = prices(JsonField.of(prices))

        /**
         * Sets [Builder.prices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prices] with a well-typed `List<Price>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prices(prices: JsonField<List<Price>>) = apply {
            this.prices = prices.map { it.toMutableList() }
        }

        /**
         * Adds a single [Price] to [prices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPrice(price: Price) = apply {
            prices =
                (prices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("prices", it).add(price)
                }
        }

        fun startPeriod(startPeriod: Double) = startPeriod(JsonField.of(startPeriod))

        /**
         * Sets [Builder.startPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startPeriod] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startPeriod(startPeriod: JsonField<Double>) = apply { this.startPeriod = startPeriod }

        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

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
         * Returns an immutable instance of [PlanListPriceAdjustmentsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .chargeId()
         * .chargeType()
         * .prices()
         * .startPeriod()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanListPriceAdjustmentsResponse =
            PlanListPriceAdjustmentsResponse(
                checkRequired("chargeId", chargeId),
                checkRequired("chargeType", chargeType),
                checkRequired("prices", prices).map { it.toImmutable() },
                checkRequired("startPeriod", startPeriod),
                quantity,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PlanListPriceAdjustmentsResponse = apply {
        if (validated) {
            return@apply
        }

        chargeId()
        chargeType().validate()
        prices().forEach { it.validate() }
        startPeriod()
        quantity()
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
        (if (chargeId.asKnown().isPresent) 1 else 0) +
            (chargeType.asKnown().getOrNull()?.validity() ?: 0) +
            (prices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (startPeriod.asKnown().isPresent) 1 else 0) +
            (if (quantity.asKnown().isPresent) 1 else 0)

    class ChargeType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val USAGE = of("usage")

            @JvmField val FIXED = of("fixed")

            @JvmField val COMPOSITE = of("composite")

            @JvmField val MINIMUM = of("minimum")

            @JvmField val SEAT = of("seat")

            @JvmStatic fun of(value: String) = ChargeType(JsonField.of(value))
        }

        /** An enum containing [ChargeType]'s known values. */
        enum class Known {
            USAGE,
            FIXED,
            COMPOSITE,
            MINIMUM,
            SEAT,
        }

        /**
         * An enum containing [ChargeType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ChargeType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USAGE,
            FIXED,
            COMPOSITE,
            MINIMUM,
            SEAT,
            /**
             * An enum member indicating that [ChargeType] was instantiated with an unknown value.
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
                USAGE -> Value.USAGE
                FIXED -> Value.FIXED
                COMPOSITE -> Value.COMPOSITE
                MINIMUM -> Value.MINIMUM
                SEAT -> Value.SEAT
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
                USAGE -> Known.USAGE
                FIXED -> Known.FIXED
                COMPOSITE -> Known.COMPOSITE
                MINIMUM -> Known.MINIMUM
                SEAT -> Known.SEAT
                else -> throw MetronomeInvalidDataException("Unknown ChargeType: $value")
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

        fun validate(): ChargeType = apply {
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

            return other is ChargeType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Price
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val adjustmentType: JsonField<AdjustmentType>,
        private val quantity: JsonField<Double>,
        private val tier: JsonField<Double>,
        private val value: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tier") @ExcludeMissing tier: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
        ) : this(adjustmentType, quantity, tier, value, mutableMapOf())

        /**
         * Determines how the value will be applied.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun quantity(): Optional<Double> = quantity.getOptional("quantity")

        /**
         * Used in pricing tiers. Indicates at what metric value the price applies.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tier(): Optional<Double> = tier.getOptional("tier")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun value(): Optional<Double> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [adjustmentType].
         *
         * Unlike [adjustmentType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * Returns the raw JSON value of [tier].
         *
         * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<Double> = tier

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
             * Returns a mutable builder for constructing an instance of [Price].
             *
             * The following fields are required:
             * ```java
             * .adjustmentType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Price]. */
        class Builder internal constructor() {

            private var adjustmentType: JsonField<AdjustmentType>? = null
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var tier: JsonField<Double> = JsonMissing.of()
            private var value: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(price: Price) = apply {
                adjustmentType = price.adjustmentType
                quantity = price.quantity
                tier = price.tier
                value = price.value
                additionalProperties = price.additionalProperties.toMutableMap()
            }

            /** Determines how the value will be applied. */
            fun adjustmentType(adjustmentType: AdjustmentType) =
                adjustmentType(JsonField.of(adjustmentType))

            /**
             * Sets [Builder.adjustmentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustmentType] with a well-typed [AdjustmentType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                this.adjustmentType = adjustmentType
            }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** Used in pricing tiers. Indicates at what metric value the price applies. */
            fun tier(tier: Double) = tier(JsonField.of(tier))

            /**
             * Sets [Builder.tier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tier] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tier(tier: JsonField<Double>) = apply { this.tier = tier }

            fun value(value: Double) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<Double>) = apply { this.value = value }

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
             * Returns an immutable instance of [Price].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .adjustmentType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Price =
                Price(
                    checkRequired("adjustmentType", adjustmentType),
                    quantity,
                    tier,
                    value,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Price = apply {
            if (validated) {
                return@apply
            }

            adjustmentType().validate()
            quantity()
            tier()
            value()
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
            (adjustmentType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (tier.asKnown().isPresent) 1 else 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        /** Determines how the value will be applied. */
        class AdjustmentType
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

                @JvmField val FIXED = of("fixed")

                @JvmField val QUANTITY = of("quantity")

                @JvmField val PERCENTAGE = of("percentage")

                @JvmField val OVERRIDE = of("override")

                @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
            }

            /** An enum containing [AdjustmentType]'s known values. */
            enum class Known {
                FIXED,
                QUANTITY,
                PERCENTAGE,
                OVERRIDE,
            }

            /**
             * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AdjustmentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FIXED,
                QUANTITY,
                PERCENTAGE,
                OVERRIDE,
                /**
                 * An enum member indicating that [AdjustmentType] was instantiated with an unknown
                 * value.
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
                    FIXED -> Value.FIXED
                    QUANTITY -> Value.QUANTITY
                    PERCENTAGE -> Value.PERCENTAGE
                    OVERRIDE -> Value.OVERRIDE
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
                    FIXED -> Known.FIXED
                    QUANTITY -> Known.QUANTITY
                    PERCENTAGE -> Known.PERCENTAGE
                    OVERRIDE -> Known.OVERRIDE
                    else -> throw MetronomeInvalidDataException("Unknown AdjustmentType: $value")
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

            fun validate(): AdjustmentType = apply {
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

                return other is AdjustmentType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Price &&
                adjustmentType == other.adjustmentType &&
                quantity == other.quantity &&
                tier == other.tier &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(adjustmentType, quantity, tier, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Price{adjustmentType=$adjustmentType, quantity=$quantity, tier=$tier, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanListPriceAdjustmentsResponse &&
            chargeId == other.chargeId &&
            chargeType == other.chargeType &&
            prices == other.prices &&
            startPeriod == other.startPeriod &&
            quantity == other.quantity &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(chargeId, chargeType, prices, startPeriod, quantity, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanListPriceAdjustmentsResponse{chargeId=$chargeId, chargeType=$chargeType, prices=$prices, startPeriod=$startPeriod, quantity=$quantity, additionalProperties=$additionalProperties}"
}
