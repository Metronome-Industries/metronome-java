// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.plans

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
import com.metronome.api.models.CreditTypeData
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PlanListChargesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val chargeType: JsonField<ChargeType>,
    private val creditType: JsonField<CreditTypeData>,
    private val customFields: JsonField<CustomFields>,
    private val name: JsonField<String>,
    private val prices: JsonField<List<Price>>,
    private val productId: JsonField<String>,
    private val productName: JsonField<String>,
    private val quantity: JsonField<Double>,
    private val startPeriod: JsonField<Double>,
    private val tierResetFrequency: JsonField<Double>,
    private val unitConversion: JsonField<UnitConversion>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("charge_type")
        @ExcludeMissing
        chargeType: JsonField<ChargeType> = JsonMissing.of(),
        @JsonProperty("credit_type")
        @ExcludeMissing
        creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prices") @ExcludeMissing prices: JsonField<List<Price>> = JsonMissing.of(),
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_name")
        @ExcludeMissing
        productName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("start_period")
        @ExcludeMissing
        startPeriod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tier_reset_frequency")
        @ExcludeMissing
        tierResetFrequency: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("unit_conversion")
        @ExcludeMissing
        unitConversion: JsonField<UnitConversion> = JsonMissing.of(),
    ) : this(
        id,
        chargeType,
        creditType,
        customFields,
        name,
        prices,
        productId,
        productName,
        quantity,
        startPeriod,
        tierResetFrequency,
        unitConversion,
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
    fun chargeType(): ChargeType = chargeType.getRequired("charge_type")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customFields(): CustomFields = customFields.getRequired("custom_fields")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prices(): List<Price> = prices.getRequired("prices")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = productId.getRequired("product_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productName(): String = productName.getRequired("product_name")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quantity(): Optional<Double> = quantity.getOptional("quantity")

    /**
     * Used in price ramps. Indicates how many billing periods pass before the charge applies.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startPeriod(): Optional<Double> = startPeriod.getOptional("start_period")

    /**
     * Used in pricing tiers. Indicates how often the tier resets. Default is 1 - the tier count
     * resets every billing period.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tierResetFrequency(): Optional<Double> =
        tierResetFrequency.getOptional("tier_reset_frequency")

    /**
     * Specifies how quantities for usage based charges will be converted.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unitConversion(): Optional<UnitConversion> = unitConversion.getOptional("unit_conversion")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [chargeType].
     *
     * Unlike [chargeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("charge_type")
    @ExcludeMissing
    fun _chargeType(): JsonField<ChargeType> = chargeType

    /**
     * Returns the raw JSON value of [creditType].
     *
     * Unlike [creditType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_type")
    @ExcludeMissing
    fun _creditType(): JsonField<CreditTypeData> = creditType

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [prices].
     *
     * Unlike [prices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prices") @ExcludeMissing fun _prices(): JsonField<List<Price>> = prices

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * Returns the raw JSON value of [productName].
     *
     * Unlike [productName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_name")
    @ExcludeMissing
    fun _productName(): JsonField<String> = productName

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

    /**
     * Returns the raw JSON value of [startPeriod].
     *
     * Unlike [startPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_period")
    @ExcludeMissing
    fun _startPeriod(): JsonField<Double> = startPeriod

    /**
     * Returns the raw JSON value of [tierResetFrequency].
     *
     * Unlike [tierResetFrequency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tier_reset_frequency")
    @ExcludeMissing
    fun _tierResetFrequency(): JsonField<Double> = tierResetFrequency

    /**
     * Returns the raw JSON value of [unitConversion].
     *
     * Unlike [unitConversion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit_conversion")
    @ExcludeMissing
    fun _unitConversion(): JsonField<UnitConversion> = unitConversion

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
         * Returns a mutable builder for constructing an instance of [PlanListChargesResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .chargeType()
         * .creditType()
         * .customFields()
         * .name()
         * .prices()
         * .productId()
         * .productName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanListChargesResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var chargeType: JsonField<ChargeType>? = null
        private var creditType: JsonField<CreditTypeData>? = null
        private var customFields: JsonField<CustomFields>? = null
        private var name: JsonField<String>? = null
        private var prices: JsonField<MutableList<Price>>? = null
        private var productId: JsonField<String>? = null
        private var productName: JsonField<String>? = null
        private var quantity: JsonField<Double> = JsonMissing.of()
        private var startPeriod: JsonField<Double> = JsonMissing.of()
        private var tierResetFrequency: JsonField<Double> = JsonMissing.of()
        private var unitConversion: JsonField<UnitConversion> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planListChargesResponse: PlanListChargesResponse) = apply {
            id = planListChargesResponse.id
            chargeType = planListChargesResponse.chargeType
            creditType = planListChargesResponse.creditType
            customFields = planListChargesResponse.customFields
            name = planListChargesResponse.name
            prices = planListChargesResponse.prices.map { it.toMutableList() }
            productId = planListChargesResponse.productId
            productName = planListChargesResponse.productName
            quantity = planListChargesResponse.quantity
            startPeriod = planListChargesResponse.startPeriod
            tierResetFrequency = planListChargesResponse.tierResetFrequency
            unitConversion = planListChargesResponse.unitConversion
            additionalProperties = planListChargesResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun chargeType(chargeType: ChargeType) = chargeType(JsonField.of(chargeType))

        /**
         * Sets [Builder.chargeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chargeType] with a well-typed [ChargeType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun chargeType(chargeType: JsonField<ChargeType>) = apply { this.chargeType = chargeType }

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

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        fun productName(productName: String) = productName(JsonField.of(productName))

        /**
         * Sets [Builder.productName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productName(productName: JsonField<String>) = apply { this.productName = productName }

        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        fun startPeriod(startPeriod: Double) = startPeriod(JsonField.of(startPeriod))

        /**
         * Sets [Builder.startPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startPeriod] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startPeriod(startPeriod: JsonField<Double>) = apply { this.startPeriod = startPeriod }

        /**
         * Used in pricing tiers. Indicates how often the tier resets. Default is 1 - the tier count
         * resets every billing period.
         */
        fun tierResetFrequency(tierResetFrequency: Double) =
            tierResetFrequency(JsonField.of(tierResetFrequency))

        /**
         * Sets [Builder.tierResetFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tierResetFrequency] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tierResetFrequency(tierResetFrequency: JsonField<Double>) = apply {
            this.tierResetFrequency = tierResetFrequency
        }

        /** Specifies how quantities for usage based charges will be converted. */
        fun unitConversion(unitConversion: UnitConversion) =
            unitConversion(JsonField.of(unitConversion))

        /**
         * Sets [Builder.unitConversion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitConversion] with a well-typed [UnitConversion] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unitConversion(unitConversion: JsonField<UnitConversion>) = apply {
            this.unitConversion = unitConversion
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
         * Returns an immutable instance of [PlanListChargesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .chargeType()
         * .creditType()
         * .customFields()
         * .name()
         * .prices()
         * .productId()
         * .productName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanListChargesResponse =
            PlanListChargesResponse(
                checkRequired("id", id),
                checkRequired("chargeType", chargeType),
                checkRequired("creditType", creditType),
                checkRequired("customFields", customFields),
                checkRequired("name", name),
                checkRequired("prices", prices).map { it.toImmutable() },
                checkRequired("productId", productId),
                checkRequired("productName", productName),
                quantity,
                startPeriod,
                tierResetFrequency,
                unitConversion,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PlanListChargesResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        chargeType().validate()
        creditType().validate()
        customFields().validate()
        name()
        prices().forEach { it.validate() }
        productId()
        productName()
        quantity()
        startPeriod()
        tierResetFrequency()
        unitConversion().ifPresent { it.validate() }
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
            (chargeType.asKnown().getOrNull()?.validity() ?: 0) +
            (creditType.asKnown().getOrNull()?.validity() ?: 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (prices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (productId.asKnown().isPresent) 1 else 0) +
            (if (productName.asKnown().isPresent) 1 else 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (if (startPeriod.asKnown().isPresent) 1 else 0) +
            (if (tierResetFrequency.asKnown().isPresent) 1 else 0) +
            (unitConversion.asKnown().getOrNull()?.validity() ?: 0)

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

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    class CustomFields
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

            /** Returns a mutable builder for constructing an instance of [CustomFields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties = customFields.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CustomFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
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

            return other is CustomFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    class Price
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val tier: JsonField<Double>,
        private val value: JsonField<Double>,
        private val collectionInterval: JsonField<Double>,
        private val collectionSchedule: JsonField<String>,
        private val quantity: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("tier") @ExcludeMissing tier: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("collection_interval")
            @ExcludeMissing
            collectionInterval: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("collection_schedule")
            @ExcludeMissing
            collectionSchedule: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Double> = JsonMissing.of(),
        ) : this(tier, value, collectionInterval, collectionSchedule, quantity, mutableMapOf())

        /**
         * Used in pricing tiers. Indicates at what metric value the price applies.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tier(): Double = tier.getRequired("tier")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Double = value.getRequired("value")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun collectionInterval(): Optional<Double> =
            collectionInterval.getOptional("collection_interval")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun collectionSchedule(): Optional<String> =
            collectionSchedule.getOptional("collection_schedule")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun quantity(): Optional<Double> = quantity.getOptional("quantity")

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

        /**
         * Returns the raw JSON value of [collectionInterval].
         *
         * Unlike [collectionInterval], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("collection_interval")
        @ExcludeMissing
        fun _collectionInterval(): JsonField<Double> = collectionInterval

        /**
         * Returns the raw JSON value of [collectionSchedule].
         *
         * Unlike [collectionSchedule], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("collection_schedule")
        @ExcludeMissing
        fun _collectionSchedule(): JsonField<String> = collectionSchedule

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
             * Returns a mutable builder for constructing an instance of [Price].
             *
             * The following fields are required:
             * ```java
             * .tier()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Price]. */
        class Builder internal constructor() {

            private var tier: JsonField<Double>? = null
            private var value: JsonField<Double>? = null
            private var collectionInterval: JsonField<Double> = JsonMissing.of()
            private var collectionSchedule: JsonField<String> = JsonMissing.of()
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(price: Price) = apply {
                tier = price.tier
                value = price.value
                collectionInterval = price.collectionInterval
                collectionSchedule = price.collectionSchedule
                quantity = price.quantity
                additionalProperties = price.additionalProperties.toMutableMap()
            }

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

            fun collectionInterval(collectionInterval: Double) =
                collectionInterval(JsonField.of(collectionInterval))

            /**
             * Sets [Builder.collectionInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collectionInterval] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun collectionInterval(collectionInterval: JsonField<Double>) = apply {
                this.collectionInterval = collectionInterval
            }

            fun collectionSchedule(collectionSchedule: String) =
                collectionSchedule(JsonField.of(collectionSchedule))

            /**
             * Sets [Builder.collectionSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collectionSchedule] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun collectionSchedule(collectionSchedule: JsonField<String>) = apply {
                this.collectionSchedule = collectionSchedule
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
             * .tier()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Price =
                Price(
                    checkRequired("tier", tier),
                    checkRequired("value", value),
                    collectionInterval,
                    collectionSchedule,
                    quantity,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Price = apply {
            if (validated) {
                return@apply
            }

            tier()
            value()
            collectionInterval()
            collectionSchedule()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (tier.asKnown().isPresent) 1 else 0) +
                (if (value.asKnown().isPresent) 1 else 0) +
                (if (collectionInterval.asKnown().isPresent) 1 else 0) +
                (if (collectionSchedule.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Price &&
                tier == other.tier &&
                value == other.value &&
                collectionInterval == other.collectionInterval &&
                collectionSchedule == other.collectionSchedule &&
                quantity == other.quantity &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                tier,
                value,
                collectionInterval,
                collectionSchedule,
                quantity,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Price{tier=$tier, value=$value, collectionInterval=$collectionInterval, collectionSchedule=$collectionSchedule, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    /** Specifies how quantities for usage based charges will be converted. */
    class UnitConversion
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val divisionFactor: JsonField<Double>,
        private val roundingBehavior: JsonField<RoundingBehavior>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("division_factor")
            @ExcludeMissing
            divisionFactor: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("rounding_behavior")
            @ExcludeMissing
            roundingBehavior: JsonField<RoundingBehavior> = JsonMissing.of(),
        ) : this(divisionFactor, roundingBehavior, mutableMapOf())

        /**
         * The conversion factor
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun divisionFactor(): Double = divisionFactor.getRequired("division_factor")

        /**
         * Whether usage should be rounded down or up to the nearest whole number. If null, quantity
         * will be rounded to 20 decimal places.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun roundingBehavior(): Optional<RoundingBehavior> =
            roundingBehavior.getOptional("rounding_behavior")

        /**
         * Returns the raw JSON value of [divisionFactor].
         *
         * Unlike [divisionFactor], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("division_factor")
        @ExcludeMissing
        fun _divisionFactor(): JsonField<Double> = divisionFactor

        /**
         * Returns the raw JSON value of [roundingBehavior].
         *
         * Unlike [roundingBehavior], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rounding_behavior")
        @ExcludeMissing
        fun _roundingBehavior(): JsonField<RoundingBehavior> = roundingBehavior

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
             * Returns a mutable builder for constructing an instance of [UnitConversion].
             *
             * The following fields are required:
             * ```java
             * .divisionFactor()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnitConversion]. */
        class Builder internal constructor() {

            private var divisionFactor: JsonField<Double>? = null
            private var roundingBehavior: JsonField<RoundingBehavior> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unitConversion: UnitConversion) = apply {
                divisionFactor = unitConversion.divisionFactor
                roundingBehavior = unitConversion.roundingBehavior
                additionalProperties = unitConversion.additionalProperties.toMutableMap()
            }

            /** The conversion factor */
            fun divisionFactor(divisionFactor: Double) =
                divisionFactor(JsonField.of(divisionFactor))

            /**
             * Sets [Builder.divisionFactor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.divisionFactor] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun divisionFactor(divisionFactor: JsonField<Double>) = apply {
                this.divisionFactor = divisionFactor
            }

            /**
             * Whether usage should be rounded down or up to the nearest whole number. If null,
             * quantity will be rounded to 20 decimal places.
             */
            fun roundingBehavior(roundingBehavior: RoundingBehavior) =
                roundingBehavior(JsonField.of(roundingBehavior))

            /**
             * Sets [Builder.roundingBehavior] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roundingBehavior] with a well-typed
             * [RoundingBehavior] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun roundingBehavior(roundingBehavior: JsonField<RoundingBehavior>) = apply {
                this.roundingBehavior = roundingBehavior
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
             * Returns an immutable instance of [UnitConversion].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .divisionFactor()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UnitConversion =
                UnitConversion(
                    checkRequired("divisionFactor", divisionFactor),
                    roundingBehavior,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnitConversion = apply {
            if (validated) {
                return@apply
            }

            divisionFactor()
            roundingBehavior().ifPresent { it.validate() }
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
            (if (divisionFactor.asKnown().isPresent) 1 else 0) +
                (roundingBehavior.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Whether usage should be rounded down or up to the nearest whole number. If null, quantity
         * will be rounded to 20 decimal places.
         */
        class RoundingBehavior
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

                @JvmField val FLOOR = of("floor")

                @JvmField val CEILING = of("ceiling")

                @JvmStatic fun of(value: String) = RoundingBehavior(JsonField.of(value))
            }

            /** An enum containing [RoundingBehavior]'s known values. */
            enum class Known {
                FLOOR,
                CEILING,
            }

            /**
             * An enum containing [RoundingBehavior]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [RoundingBehavior] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FLOOR,
                CEILING,
                /**
                 * An enum member indicating that [RoundingBehavior] was instantiated with an
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
                    FLOOR -> Value.FLOOR
                    CEILING -> Value.CEILING
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
                    FLOOR -> Known.FLOOR
                    CEILING -> Known.CEILING
                    else -> throw MetronomeInvalidDataException("Unknown RoundingBehavior: $value")
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

            fun validate(): RoundingBehavior = apply {
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

                return other is RoundingBehavior && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnitConversion &&
                divisionFactor == other.divisionFactor &&
                roundingBehavior == other.roundingBehavior &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(divisionFactor, roundingBehavior, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnitConversion{divisionFactor=$divisionFactor, roundingBehavior=$roundingBehavior, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanListChargesResponse &&
            id == other.id &&
            chargeType == other.chargeType &&
            creditType == other.creditType &&
            customFields == other.customFields &&
            name == other.name &&
            prices == other.prices &&
            productId == other.productId &&
            productName == other.productName &&
            quantity == other.quantity &&
            startPeriod == other.startPeriod &&
            tierResetFrequency == other.tierResetFrequency &&
            unitConversion == other.unitConversion &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            chargeType,
            creditType,
            customFields,
            name,
            prices,
            productId,
            productName,
            quantity,
            startPeriod,
            tierResetFrequency,
            unitConversion,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanListChargesResponse{id=$id, chargeType=$chargeType, creditType=$creditType, customFields=$customFields, name=$name, prices=$prices, productId=$productId, productName=$productName, quantity=$quantity, startPeriod=$startPeriod, tierResetFrequency=$tierResetFrequency, unitConversion=$unitConversion, additionalProperties=$additionalProperties}"
}
