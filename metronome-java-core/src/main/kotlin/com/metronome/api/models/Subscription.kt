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

class Subscription
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val billingPeriods: JsonField<BillingPeriods>,
    private val collectionSchedule: JsonField<CollectionSchedule>,
    private val proration: JsonField<Proration>,
    private val quantityManagementMode: JsonField<QuantityManagementMode>,
    private val quantitySchedule: JsonField<List<QuantitySchedule>>,
    private val startingAt: JsonField<OffsetDateTime>,
    private val subscriptionRate: JsonField<SubscriptionRate>,
    private val id: JsonField<String>,
    private val customFields: JsonField<CustomFields>,
    private val description: JsonField<String>,
    private val endingBefore: JsonField<OffsetDateTime>,
    private val fiatCreditTypeId: JsonField<String>,
    private val name: JsonField<String>,
    private val seatConfig: JsonField<SeatConfig>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("billing_periods")
        @ExcludeMissing
        billingPeriods: JsonField<BillingPeriods> = JsonMissing.of(),
        @JsonProperty("collection_schedule")
        @ExcludeMissing
        collectionSchedule: JsonField<CollectionSchedule> = JsonMissing.of(),
        @JsonProperty("proration")
        @ExcludeMissing
        proration: JsonField<Proration> = JsonMissing.of(),
        @JsonProperty("quantity_management_mode")
        @ExcludeMissing
        quantityManagementMode: JsonField<QuantityManagementMode> = JsonMissing.of(),
        @JsonProperty("quantity_schedule")
        @ExcludeMissing
        quantitySchedule: JsonField<List<QuantitySchedule>> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("subscription_rate")
        @ExcludeMissing
        subscriptionRate: JsonField<SubscriptionRate> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fiat_credit_type_id")
        @ExcludeMissing
        fiatCreditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("seat_config")
        @ExcludeMissing
        seatConfig: JsonField<SeatConfig> = JsonMissing.of(),
    ) : this(
        billingPeriods,
        collectionSchedule,
        proration,
        quantityManagementMode,
        quantitySchedule,
        startingAt,
        subscriptionRate,
        id,
        customFields,
        description,
        endingBefore,
        fiatCreditTypeId,
        name,
        seatConfig,
        mutableMapOf(),
    )

    /**
     * Previous, current, and next billing periods for the subscription.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingPeriods(): BillingPeriods = billingPeriods.getRequired("billing_periods")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun collectionSchedule(): CollectionSchedule =
        collectionSchedule.getRequired("collection_schedule")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun proration(): Proration = proration.getRequired("proration")

    /**
     * Determines how the subscription's quantity is controlled. Defaults to QUANTITY_ONLY.
     * **QUANTITY_ONLY**: The subscription quantity is specified directly on the subscription.
     * `initial_quantity` must be provided with this option. Compatible with recurring
     * commits/credits that use POOLED allocation. **SEAT_BASED**: Use when you want to pass
     * specific seat identifiers (e.g. add user_123) to increment and decrement a subscription
     * quantity, rather than directly providing the quantity. You must use a **SEAT_BASED**
     * subscription to use a linked recurring credit with an allocation per seat. `seat_config` must
     * be provided with this option.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantityManagementMode(): QuantityManagementMode =
        quantityManagementMode.getRequired("quantity_management_mode")

    /**
     * List of quantity schedule items for the subscription. Only includes the current quantity and
     * future quantity changes.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantitySchedule(): List<QuantitySchedule> =
        quantitySchedule.getRequired("quantity_schedule")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionRate(): SubscriptionRate = subscriptionRate.getRequired("subscription_rate")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fiatCreditTypeId(): Optional<String> = fiatCreditTypeId.getOptional("fiat_credit_type_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun seatConfig(): Optional<SeatConfig> = seatConfig.getOptional("seat_config")

    /**
     * Returns the raw JSON value of [billingPeriods].
     *
     * Unlike [billingPeriods], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_periods")
    @ExcludeMissing
    fun _billingPeriods(): JsonField<BillingPeriods> = billingPeriods

    /**
     * Returns the raw JSON value of [collectionSchedule].
     *
     * Unlike [collectionSchedule], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("collection_schedule")
    @ExcludeMissing
    fun _collectionSchedule(): JsonField<CollectionSchedule> = collectionSchedule

    /**
     * Returns the raw JSON value of [proration].
     *
     * Unlike [proration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("proration") @ExcludeMissing fun _proration(): JsonField<Proration> = proration

    /**
     * Returns the raw JSON value of [quantityManagementMode].
     *
     * Unlike [quantityManagementMode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("quantity_management_mode")
    @ExcludeMissing
    fun _quantityManagementMode(): JsonField<QuantityManagementMode> = quantityManagementMode

    /**
     * Returns the raw JSON value of [quantitySchedule].
     *
     * Unlike [quantitySchedule], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("quantity_schedule")
    @ExcludeMissing
    fun _quantitySchedule(): JsonField<List<QuantitySchedule>> = quantitySchedule

    /**
     * Returns the raw JSON value of [startingAt].
     *
     * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starting_at")
    @ExcludeMissing
    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

    /**
     * Returns the raw JSON value of [subscriptionRate].
     *
     * Unlike [subscriptionRate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscription_rate")
    @ExcludeMissing
    fun _subscriptionRate(): JsonField<SubscriptionRate> = subscriptionRate

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [endingBefore].
     *
     * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ending_before")
    @ExcludeMissing
    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

    /**
     * Returns the raw JSON value of [fiatCreditTypeId].
     *
     * Unlike [fiatCreditTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fiat_credit_type_id")
    @ExcludeMissing
    fun _fiatCreditTypeId(): JsonField<String> = fiatCreditTypeId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [seatConfig].
     *
     * Unlike [seatConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seat_config")
    @ExcludeMissing
    fun _seatConfig(): JsonField<SeatConfig> = seatConfig

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
         * Returns a mutable builder for constructing an instance of [Subscription].
         *
         * The following fields are required:
         * ```java
         * .billingPeriods()
         * .collectionSchedule()
         * .proration()
         * .quantityManagementMode()
         * .quantitySchedule()
         * .startingAt()
         * .subscriptionRate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Subscription]. */
    class Builder internal constructor() {

        private var billingPeriods: JsonField<BillingPeriods>? = null
        private var collectionSchedule: JsonField<CollectionSchedule>? = null
        private var proration: JsonField<Proration>? = null
        private var quantityManagementMode: JsonField<QuantityManagementMode>? = null
        private var quantitySchedule: JsonField<MutableList<QuantitySchedule>>? = null
        private var startingAt: JsonField<OffsetDateTime>? = null
        private var subscriptionRate: JsonField<SubscriptionRate>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
        private var fiatCreditTypeId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var seatConfig: JsonField<SeatConfig> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscription: Subscription) = apply {
            billingPeriods = subscription.billingPeriods
            collectionSchedule = subscription.collectionSchedule
            proration = subscription.proration
            quantityManagementMode = subscription.quantityManagementMode
            quantitySchedule = subscription.quantitySchedule.map { it.toMutableList() }
            startingAt = subscription.startingAt
            subscriptionRate = subscription.subscriptionRate
            id = subscription.id
            customFields = subscription.customFields
            description = subscription.description
            endingBefore = subscription.endingBefore
            fiatCreditTypeId = subscription.fiatCreditTypeId
            name = subscription.name
            seatConfig = subscription.seatConfig
            additionalProperties = subscription.additionalProperties.toMutableMap()
        }

        /** Previous, current, and next billing periods for the subscription. */
        fun billingPeriods(billingPeriods: BillingPeriods) =
            billingPeriods(JsonField.of(billingPeriods))

        /**
         * Sets [Builder.billingPeriods] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingPeriods] with a well-typed [BillingPeriods] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingPeriods(billingPeriods: JsonField<BillingPeriods>) = apply {
            this.billingPeriods = billingPeriods
        }

        fun collectionSchedule(collectionSchedule: CollectionSchedule) =
            collectionSchedule(JsonField.of(collectionSchedule))

        /**
         * Sets [Builder.collectionSchedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionSchedule] with a well-typed
         * [CollectionSchedule] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun collectionSchedule(collectionSchedule: JsonField<CollectionSchedule>) = apply {
            this.collectionSchedule = collectionSchedule
        }

        fun proration(proration: Proration) = proration(JsonField.of(proration))

        /**
         * Sets [Builder.proration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proration] with a well-typed [Proration] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun proration(proration: JsonField<Proration>) = apply { this.proration = proration }

        /**
         * Determines how the subscription's quantity is controlled. Defaults to QUANTITY_ONLY.
         * **QUANTITY_ONLY**: The subscription quantity is specified directly on the subscription.
         * `initial_quantity` must be provided with this option. Compatible with recurring
         * commits/credits that use POOLED allocation. **SEAT_BASED**: Use when you want to pass
         * specific seat identifiers (e.g. add user_123) to increment and decrement a subscription
         * quantity, rather than directly providing the quantity. You must use a **SEAT_BASED**
         * subscription to use a linked recurring credit with an allocation per seat. `seat_config`
         * must be provided with this option.
         */
        fun quantityManagementMode(quantityManagementMode: QuantityManagementMode) =
            quantityManagementMode(JsonField.of(quantityManagementMode))

        /**
         * Sets [Builder.quantityManagementMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantityManagementMode] with a well-typed
         * [QuantityManagementMode] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun quantityManagementMode(quantityManagementMode: JsonField<QuantityManagementMode>) =
            apply {
                this.quantityManagementMode = quantityManagementMode
            }

        /**
         * List of quantity schedule items for the subscription. Only includes the current quantity
         * and future quantity changes.
         */
        fun quantitySchedule(quantitySchedule: List<QuantitySchedule>) =
            quantitySchedule(JsonField.of(quantitySchedule))

        /**
         * Sets [Builder.quantitySchedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantitySchedule] with a well-typed
         * `List<QuantitySchedule>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun quantitySchedule(quantitySchedule: JsonField<List<QuantitySchedule>>) = apply {
            this.quantitySchedule = quantitySchedule.map { it.toMutableList() }
        }

        /**
         * Adds a single [QuantitySchedule] to [Builder.quantitySchedule].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addQuantitySchedule(quantitySchedule: QuantitySchedule) = apply {
            this.quantitySchedule =
                (this.quantitySchedule ?: JsonField.of(mutableListOf())).also {
                    checkKnown("quantitySchedule", it).add(quantitySchedule)
                }
        }

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

        fun subscriptionRate(subscriptionRate: SubscriptionRate) =
            subscriptionRate(JsonField.of(subscriptionRate))

        /**
         * Sets [Builder.subscriptionRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionRate] with a well-typed [SubscriptionRate]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun subscriptionRate(subscriptionRate: JsonField<SubscriptionRate>) = apply {
            this.subscriptionRate = subscriptionRate
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

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

        fun fiatCreditTypeId(fiatCreditTypeId: String) =
            fiatCreditTypeId(JsonField.of(fiatCreditTypeId))

        /**
         * Sets [Builder.fiatCreditTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fiatCreditTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fiatCreditTypeId(fiatCreditTypeId: JsonField<String>) = apply {
            this.fiatCreditTypeId = fiatCreditTypeId
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun seatConfig(seatConfig: SeatConfig) = seatConfig(JsonField.of(seatConfig))

        /**
         * Sets [Builder.seatConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seatConfig] with a well-typed [SeatConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun seatConfig(seatConfig: JsonField<SeatConfig>) = apply { this.seatConfig = seatConfig }

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
         * Returns an immutable instance of [Subscription].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .billingPeriods()
         * .collectionSchedule()
         * .proration()
         * .quantityManagementMode()
         * .quantitySchedule()
         * .startingAt()
         * .subscriptionRate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Subscription =
            Subscription(
                checkRequired("billingPeriods", billingPeriods),
                checkRequired("collectionSchedule", collectionSchedule),
                checkRequired("proration", proration),
                checkRequired("quantityManagementMode", quantityManagementMode),
                checkRequired("quantitySchedule", quantitySchedule).map { it.toImmutable() },
                checkRequired("startingAt", startingAt),
                checkRequired("subscriptionRate", subscriptionRate),
                id,
                customFields,
                description,
                endingBefore,
                fiatCreditTypeId,
                name,
                seatConfig,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Subscription = apply {
        if (validated) {
            return@apply
        }

        billingPeriods().validate()
        collectionSchedule().validate()
        proration().validate()
        quantityManagementMode().validate()
        quantitySchedule().forEach { it.validate() }
        startingAt()
        subscriptionRate().validate()
        id()
        customFields().ifPresent { it.validate() }
        description()
        endingBefore()
        fiatCreditTypeId()
        name()
        seatConfig().ifPresent { it.validate() }
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
        (billingPeriods.asKnown().getOrNull()?.validity() ?: 0) +
            (collectionSchedule.asKnown().getOrNull()?.validity() ?: 0) +
            (proration.asKnown().getOrNull()?.validity() ?: 0) +
            (quantityManagementMode.asKnown().getOrNull()?.validity() ?: 0) +
            (quantitySchedule.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (startingAt.asKnown().isPresent) 1 else 0) +
            (subscriptionRate.asKnown().getOrNull()?.validity() ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (endingBefore.asKnown().isPresent) 1 else 0) +
            (if (fiatCreditTypeId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (seatConfig.asKnown().getOrNull()?.validity() ?: 0)

    /** Previous, current, and next billing periods for the subscription. */
    class BillingPeriods
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val current: JsonField<Current>,
        private val next: JsonField<Next>,
        private val previous: JsonField<Previous>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("current") @ExcludeMissing current: JsonField<Current> = JsonMissing.of(),
            @JsonProperty("next") @ExcludeMissing next: JsonField<Next> = JsonMissing.of(),
            @JsonProperty("previous")
            @ExcludeMissing
            previous: JsonField<Previous> = JsonMissing.of(),
        ) : this(current, next, previous, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun current(): Optional<Current> = current.getOptional("current")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun next(): Optional<Next> = next.getOptional("next")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun previous(): Optional<Previous> = previous.getOptional("previous")

        /**
         * Returns the raw JSON value of [current].
         *
         * Unlike [current], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("current") @ExcludeMissing fun _current(): JsonField<Current> = current

        /**
         * Returns the raw JSON value of [next].
         *
         * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<Next> = next

        /**
         * Returns the raw JSON value of [previous].
         *
         * Unlike [previous], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("previous") @ExcludeMissing fun _previous(): JsonField<Previous> = previous

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

            /** Returns a mutable builder for constructing an instance of [BillingPeriods]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BillingPeriods]. */
        class Builder internal constructor() {

            private var current: JsonField<Current> = JsonMissing.of()
            private var next: JsonField<Next> = JsonMissing.of()
            private var previous: JsonField<Previous> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingPeriods: BillingPeriods) = apply {
                current = billingPeriods.current
                next = billingPeriods.next
                previous = billingPeriods.previous
                additionalProperties = billingPeriods.additionalProperties.toMutableMap()
            }

            fun current(current: Current) = current(JsonField.of(current))

            /**
             * Sets [Builder.current] to an arbitrary JSON value.
             *
             * You should usually call [Builder.current] with a well-typed [Current] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun current(current: JsonField<Current>) = apply { this.current = current }

            fun next(next: Next) = next(JsonField.of(next))

            /**
             * Sets [Builder.next] to an arbitrary JSON value.
             *
             * You should usually call [Builder.next] with a well-typed [Next] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun next(next: JsonField<Next>) = apply { this.next = next }

            fun previous(previous: Previous) = previous(JsonField.of(previous))

            /**
             * Sets [Builder.previous] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previous] with a well-typed [Previous] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun previous(previous: JsonField<Previous>) = apply { this.previous = previous }

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
             * Returns an immutable instance of [BillingPeriods].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BillingPeriods =
                BillingPeriods(current, next, previous, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): BillingPeriods = apply {
            if (validated) {
                return@apply
            }

            current().ifPresent { it.validate() }
            next().ifPresent { it.validate() }
            previous().ifPresent { it.validate() }
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
            (current.asKnown().getOrNull()?.validity() ?: 0) +
                (next.asKnown().getOrNull()?.validity() ?: 0) +
                (previous.asKnown().getOrNull()?.validity() ?: 0)

        class Current
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val endingBefore: JsonField<OffsetDateTime>,
            private val startingAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("ending_before")
                @ExcludeMissing
                endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(endingBefore, startingAt, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            /**
             * Returns the raw JSON value of [endingBefore].
             *
             * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            /**
             * Returns the raw JSON value of [startingAt].
             *
             * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

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
                 * Returns a mutable builder for constructing an instance of [Current].
                 *
                 * The following fields are required:
                 * ```java
                 * .endingBefore()
                 * .startingAt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Current]. */
            class Builder internal constructor() {

                private var endingBefore: JsonField<OffsetDateTime>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(current: Current) = apply {
                    endingBefore = current.endingBefore
                    startingAt = current.startingAt
                    additionalProperties = current.additionalProperties.toMutableMap()
                }

                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                /**
                 * Sets [Builder.endingBefore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                /**
                 * Sets [Builder.startingAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
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
                 * Returns an immutable instance of [Current].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .endingBefore()
                 * .startingAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Current =
                    Current(
                        checkRequired("endingBefore", endingBefore),
                        checkRequired("startingAt", startingAt),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Current = apply {
                if (validated) {
                    return@apply
                }

                endingBefore()
                startingAt()
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
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                    (if (startingAt.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Current &&
                    endingBefore == other.endingBefore &&
                    startingAt == other.startingAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(endingBefore, startingAt, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Current{endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        class Next
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val endingBefore: JsonField<OffsetDateTime>,
            private val startingAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("ending_before")
                @ExcludeMissing
                endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(endingBefore, startingAt, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            /**
             * Returns the raw JSON value of [endingBefore].
             *
             * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            /**
             * Returns the raw JSON value of [startingAt].
             *
             * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

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
                 * Returns a mutable builder for constructing an instance of [Next].
                 *
                 * The following fields are required:
                 * ```java
                 * .endingBefore()
                 * .startingAt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Next]. */
            class Builder internal constructor() {

                private var endingBefore: JsonField<OffsetDateTime>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(next: Next) = apply {
                    endingBefore = next.endingBefore
                    startingAt = next.startingAt
                    additionalProperties = next.additionalProperties.toMutableMap()
                }

                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                /**
                 * Sets [Builder.endingBefore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                /**
                 * Sets [Builder.startingAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
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
                 * Returns an immutable instance of [Next].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .endingBefore()
                 * .startingAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Next =
                    Next(
                        checkRequired("endingBefore", endingBefore),
                        checkRequired("startingAt", startingAt),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Next = apply {
                if (validated) {
                    return@apply
                }

                endingBefore()
                startingAt()
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
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                    (if (startingAt.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Next &&
                    endingBefore == other.endingBefore &&
                    startingAt == other.startingAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(endingBefore, startingAt, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Next{endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        class Previous
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val endingBefore: JsonField<OffsetDateTime>,
            private val startingAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("ending_before")
                @ExcludeMissing
                endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(endingBefore, startingAt, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            /**
             * Returns the raw JSON value of [endingBefore].
             *
             * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            /**
             * Returns the raw JSON value of [startingAt].
             *
             * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

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
                 * Returns a mutable builder for constructing an instance of [Previous].
                 *
                 * The following fields are required:
                 * ```java
                 * .endingBefore()
                 * .startingAt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Previous]. */
            class Builder internal constructor() {

                private var endingBefore: JsonField<OffsetDateTime>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(previous: Previous) = apply {
                    endingBefore = previous.endingBefore
                    startingAt = previous.startingAt
                    additionalProperties = previous.additionalProperties.toMutableMap()
                }

                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                /**
                 * Sets [Builder.endingBefore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                /**
                 * Sets [Builder.startingAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
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
                 * Returns an immutable instance of [Previous].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .endingBefore()
                 * .startingAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Previous =
                    Previous(
                        checkRequired("endingBefore", endingBefore),
                        checkRequired("startingAt", startingAt),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Previous = apply {
                if (validated) {
                    return@apply
                }

                endingBefore()
                startingAt()
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
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                    (if (startingAt.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Previous &&
                    endingBefore == other.endingBefore &&
                    startingAt == other.startingAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(endingBefore, startingAt, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Previous{endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillingPeriods &&
                current == other.current &&
                next == other.next &&
                previous == other.previous &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(current, next, previous, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingPeriods{current=$current, next=$next, previous=$previous, additionalProperties=$additionalProperties}"
    }

    class CollectionSchedule
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ADVANCE = of("ADVANCE")

            @JvmField val ARREARS = of("ARREARS")

            @JvmStatic fun of(value: String) = CollectionSchedule(JsonField.of(value))
        }

        /** An enum containing [CollectionSchedule]'s known values. */
        enum class Known {
            ADVANCE,
            ARREARS,
        }

        /**
         * An enum containing [CollectionSchedule]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CollectionSchedule] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ADVANCE,
            ARREARS,
            /**
             * An enum member indicating that [CollectionSchedule] was instantiated with an unknown
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
                ADVANCE -> Value.ADVANCE
                ARREARS -> Value.ARREARS
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
                ADVANCE -> Known.ADVANCE
                ARREARS -> Known.ARREARS
                else -> throw MetronomeInvalidDataException("Unknown CollectionSchedule: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CollectionSchedule = apply {
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

            return other is CollectionSchedule && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Proration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val invoiceBehavior: JsonField<InvoiceBehavior>,
        private val isProrated: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("invoice_behavior")
            @ExcludeMissing
            invoiceBehavior: JsonField<InvoiceBehavior> = JsonMissing.of(),
            @JsonProperty("is_prorated")
            @ExcludeMissing
            isProrated: JsonField<Boolean> = JsonMissing.of(),
        ) : this(invoiceBehavior, isProrated, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun invoiceBehavior(): InvoiceBehavior = invoiceBehavior.getRequired("invoice_behavior")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isProrated(): Boolean = isProrated.getRequired("is_prorated")

        /**
         * Returns the raw JSON value of [invoiceBehavior].
         *
         * Unlike [invoiceBehavior], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoice_behavior")
        @ExcludeMissing
        fun _invoiceBehavior(): JsonField<InvoiceBehavior> = invoiceBehavior

        /**
         * Returns the raw JSON value of [isProrated].
         *
         * Unlike [isProrated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_prorated")
        @ExcludeMissing
        fun _isProrated(): JsonField<Boolean> = isProrated

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
             * Returns a mutable builder for constructing an instance of [Proration].
             *
             * The following fields are required:
             * ```java
             * .invoiceBehavior()
             * .isProrated()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Proration]. */
        class Builder internal constructor() {

            private var invoiceBehavior: JsonField<InvoiceBehavior>? = null
            private var isProrated: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(proration: Proration) = apply {
                invoiceBehavior = proration.invoiceBehavior
                isProrated = proration.isProrated
                additionalProperties = proration.additionalProperties.toMutableMap()
            }

            fun invoiceBehavior(invoiceBehavior: InvoiceBehavior) =
                invoiceBehavior(JsonField.of(invoiceBehavior))

            /**
             * Sets [Builder.invoiceBehavior] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceBehavior] with a well-typed [InvoiceBehavior]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invoiceBehavior(invoiceBehavior: JsonField<InvoiceBehavior>) = apply {
                this.invoiceBehavior = invoiceBehavior
            }

            fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

            /**
             * Sets [Builder.isProrated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isProrated] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isProrated(isProrated: JsonField<Boolean>) = apply { this.isProrated = isProrated }

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
             * Returns an immutable instance of [Proration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .invoiceBehavior()
             * .isProrated()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Proration =
                Proration(
                    checkRequired("invoiceBehavior", invoiceBehavior),
                    checkRequired("isProrated", isProrated),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Proration = apply {
            if (validated) {
                return@apply
            }

            invoiceBehavior().validate()
            isProrated()
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
            (invoiceBehavior.asKnown().getOrNull()?.validity() ?: 0) +
                (if (isProrated.asKnown().isPresent) 1 else 0)

        class InvoiceBehavior
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

                @JvmField val BILL_IMMEDIATELY = of("BILL_IMMEDIATELY")

                @JvmField val BILL_ON_NEXT_COLLECTION_DATE = of("BILL_ON_NEXT_COLLECTION_DATE")

                @JvmStatic fun of(value: String) = InvoiceBehavior(JsonField.of(value))
            }

            /** An enum containing [InvoiceBehavior]'s known values. */
            enum class Known {
                BILL_IMMEDIATELY,
                BILL_ON_NEXT_COLLECTION_DATE,
            }

            /**
             * An enum containing [InvoiceBehavior]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [InvoiceBehavior] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BILL_IMMEDIATELY,
                BILL_ON_NEXT_COLLECTION_DATE,
                /**
                 * An enum member indicating that [InvoiceBehavior] was instantiated with an unknown
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
                    BILL_IMMEDIATELY -> Value.BILL_IMMEDIATELY
                    BILL_ON_NEXT_COLLECTION_DATE -> Value.BILL_ON_NEXT_COLLECTION_DATE
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
                    BILL_IMMEDIATELY -> Known.BILL_IMMEDIATELY
                    BILL_ON_NEXT_COLLECTION_DATE -> Known.BILL_ON_NEXT_COLLECTION_DATE
                    else -> throw MetronomeInvalidDataException("Unknown InvoiceBehavior: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): InvoiceBehavior = apply {
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

                return other is InvoiceBehavior && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Proration &&
                invoiceBehavior == other.invoiceBehavior &&
                isProrated == other.isProrated &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(invoiceBehavior, isProrated, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Proration{invoiceBehavior=$invoiceBehavior, isProrated=$isProrated, additionalProperties=$additionalProperties}"
    }

    /**
     * Determines how the subscription's quantity is controlled. Defaults to QUANTITY_ONLY.
     * **QUANTITY_ONLY**: The subscription quantity is specified directly on the subscription.
     * `initial_quantity` must be provided with this option. Compatible with recurring
     * commits/credits that use POOLED allocation. **SEAT_BASED**: Use when you want to pass
     * specific seat identifiers (e.g. add user_123) to increment and decrement a subscription
     * quantity, rather than directly providing the quantity. You must use a **SEAT_BASED**
     * subscription to use a linked recurring credit with an allocation per seat. `seat_config` must
     * be provided with this option.
     */
    class QuantityManagementMode
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SEAT_BASED = of("SEAT_BASED")

            @JvmField val QUANTITY_ONLY = of("QUANTITY_ONLY")

            @JvmStatic fun of(value: String) = QuantityManagementMode(JsonField.of(value))
        }

        /** An enum containing [QuantityManagementMode]'s known values. */
        enum class Known {
            SEAT_BASED,
            QUANTITY_ONLY,
        }

        /**
         * An enum containing [QuantityManagementMode]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [QuantityManagementMode] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SEAT_BASED,
            QUANTITY_ONLY,
            /**
             * An enum member indicating that [QuantityManagementMode] was instantiated with an
             * unknown value.
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
                SEAT_BASED -> Value.SEAT_BASED
                QUANTITY_ONLY -> Value.QUANTITY_ONLY
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
                SEAT_BASED -> Known.SEAT_BASED
                QUANTITY_ONLY -> Known.QUANTITY_ONLY
                else ->
                    throw MetronomeInvalidDataException("Unknown QuantityManagementMode: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): QuantityManagementMode = apply {
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

            return other is QuantityManagementMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class QuantitySchedule
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val quantity: JsonField<Double>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(quantity, startingAt, endingBefore, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Double = quantity.getRequired("quantity")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * Returns the raw JSON value of [startingAt].
         *
         * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /**
         * Returns the raw JSON value of [endingBefore].
         *
         * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

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
             * Returns a mutable builder for constructing an instance of [QuantitySchedule].
             *
             * The following fields are required:
             * ```java
             * .quantity()
             * .startingAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [QuantitySchedule]. */
        class Builder internal constructor() {

            private var quantity: JsonField<Double>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(quantitySchedule: QuantitySchedule) = apply {
                quantity = quantitySchedule.quantity
                startingAt = quantitySchedule.startingAt
                endingBefore = quantitySchedule.endingBefore
                additionalProperties = quantitySchedule.additionalProperties.toMutableMap()
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

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /**
             * Sets [Builder.endingBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
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
             * Returns an immutable instance of [QuantitySchedule].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .quantity()
             * .startingAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): QuantitySchedule =
                QuantitySchedule(
                    checkRequired("quantity", quantity),
                    checkRequired("startingAt", startingAt),
                    endingBefore,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): QuantitySchedule = apply {
            if (validated) {
                return@apply
            }

            quantity()
            startingAt()
            endingBefore()
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
            (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (startingAt.asKnown().isPresent) 1 else 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is QuantitySchedule &&
                quantity == other.quantity &&
                startingAt == other.startingAt &&
                endingBefore == other.endingBefore &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(quantity, startingAt, endingBefore, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "QuantitySchedule{quantity=$quantity, startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
    }

    class SubscriptionRate
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingFrequency: JsonField<BillingFrequency>,
        private val product: JsonField<Product>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing_frequency")
            @ExcludeMissing
            billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
            @JsonProperty("product") @ExcludeMissing product: JsonField<Product> = JsonMissing.of(),
        ) : this(billingFrequency, product, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingFrequency(): BillingFrequency = billingFrequency.getRequired("billing_frequency")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun product(): Product = product.getRequired("product")

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
         * Returns the raw JSON value of [product].
         *
         * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

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
             * Returns a mutable builder for constructing an instance of [SubscriptionRate].
             *
             * The following fields are required:
             * ```java
             * .billingFrequency()
             * .product()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SubscriptionRate]. */
        class Builder internal constructor() {

            private var billingFrequency: JsonField<BillingFrequency>? = null
            private var product: JsonField<Product>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscriptionRate: SubscriptionRate) = apply {
                billingFrequency = subscriptionRate.billingFrequency
                product = subscriptionRate.product
                additionalProperties = subscriptionRate.additionalProperties.toMutableMap()
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

            fun product(product: Product) = product(JsonField.of(product))

            /**
             * Sets [Builder.product] to an arbitrary JSON value.
             *
             * You should usually call [Builder.product] with a well-typed [Product] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun product(product: JsonField<Product>) = apply { this.product = product }

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
             * Returns an immutable instance of [SubscriptionRate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .billingFrequency()
             * .product()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SubscriptionRate =
                SubscriptionRate(
                    checkRequired("billingFrequency", billingFrequency),
                    checkRequired("product", product),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): SubscriptionRate = apply {
            if (validated) {
                return@apply
            }

            billingFrequency().validate()
            product().validate()
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
                (product.asKnown().getOrNull()?.validity() ?: 0)

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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SubscriptionRate &&
                billingFrequency == other.billingFrequency &&
                product == other.product &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(billingFrequency, product, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SubscriptionRate{billingFrequency=$billingFrequency, product=$product, additionalProperties=$additionalProperties}"
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    class SeatConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val seatGroupKey: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("seat_group_key")
            @ExcludeMissing
            seatGroupKey: JsonField<String> = JsonMissing.of()
        ) : this(seatGroupKey, mutableMapOf())

        /**
         * The property name, sent on usage events, that identifies the seat ID associated with the
         * usage event. For example, the property name might be seat_id or user_id. The property
         * must be set as a group key on billable metrics and a presentation/pricing group key on
         * contract products. This allows linked recurring credits with an allocation per seat to be
         * consumed by only one seat's usage.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun seatGroupKey(): String = seatGroupKey.getRequired("seat_group_key")

        /**
         * Returns the raw JSON value of [seatGroupKey].
         *
         * Unlike [seatGroupKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("seat_group_key")
        @ExcludeMissing
        fun _seatGroupKey(): JsonField<String> = seatGroupKey

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
             * Returns a mutable builder for constructing an instance of [SeatConfig].
             *
             * The following fields are required:
             * ```java
             * .seatGroupKey()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SeatConfig]. */
        class Builder internal constructor() {

            private var seatGroupKey: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(seatConfig: SeatConfig) = apply {
                seatGroupKey = seatConfig.seatGroupKey
                additionalProperties = seatConfig.additionalProperties.toMutableMap()
            }

            /**
             * The property name, sent on usage events, that identifies the seat ID associated with
             * the usage event. For example, the property name might be seat_id or user_id. The
             * property must be set as a group key on billable metrics and a presentation/pricing
             * group key on contract products. This allows linked recurring credits with an
             * allocation per seat to be consumed by only one seat's usage.
             */
            fun seatGroupKey(seatGroupKey: String) = seatGroupKey(JsonField.of(seatGroupKey))

            /**
             * Sets [Builder.seatGroupKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seatGroupKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun seatGroupKey(seatGroupKey: JsonField<String>) = apply {
                this.seatGroupKey = seatGroupKey
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
             * Returns an immutable instance of [SeatConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .seatGroupKey()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SeatConfig =
                SeatConfig(
                    checkRequired("seatGroupKey", seatGroupKey),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): SeatConfig = apply {
            if (validated) {
                return@apply
            }

            seatGroupKey()
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
        internal fun validity(): Int = (if (seatGroupKey.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SeatConfig &&
                seatGroupKey == other.seatGroupKey &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(seatGroupKey, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SeatConfig{seatGroupKey=$seatGroupKey, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Subscription &&
            billingPeriods == other.billingPeriods &&
            collectionSchedule == other.collectionSchedule &&
            proration == other.proration &&
            quantityManagementMode == other.quantityManagementMode &&
            quantitySchedule == other.quantitySchedule &&
            startingAt == other.startingAt &&
            subscriptionRate == other.subscriptionRate &&
            id == other.id &&
            customFields == other.customFields &&
            description == other.description &&
            endingBefore == other.endingBefore &&
            fiatCreditTypeId == other.fiatCreditTypeId &&
            name == other.name &&
            seatConfig == other.seatConfig &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            billingPeriods,
            collectionSchedule,
            proration,
            quantityManagementMode,
            quantitySchedule,
            startingAt,
            subscriptionRate,
            id,
            customFields,
            description,
            endingBefore,
            fiatCreditTypeId,
            name,
            seatConfig,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Subscription{billingPeriods=$billingPeriods, collectionSchedule=$collectionSchedule, proration=$proration, quantityManagementMode=$quantityManagementMode, quantitySchedule=$quantitySchedule, startingAt=$startingAt, subscriptionRate=$subscriptionRate, id=$id, customFields=$customFields, description=$description, endingBefore=$endingBefore, fiatCreditTypeId=$fiatCreditTypeId, name=$name, seatConfig=$seatConfig, additionalProperties=$additionalProperties}"
}
