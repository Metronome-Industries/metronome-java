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
class Subscription
@JsonCreator
private constructor(
    @JsonProperty("billing_periods")
    @ExcludeMissing
    private val billingPeriods: JsonField<BillingPeriods> = JsonMissing.of(),
    @JsonProperty("collection_schedule")
    @ExcludeMissing
    private val collectionSchedule: JsonField<CollectionSchedule> = JsonMissing.of(),
    @JsonProperty("proration")
    @ExcludeMissing
    private val proration: JsonField<Proration> = JsonMissing.of(),
    @JsonProperty("quantity_management_mode")
    @ExcludeMissing
    private val quantityManagementMode: JsonField<QuantityManagementMode> = JsonMissing.of(),
    @JsonProperty("quantity_schedule")
    @ExcludeMissing
    private val quantitySchedule: JsonField<List<QuantitySchedule>> = JsonMissing.of(),
    @JsonProperty("starting_at")
    @ExcludeMissing
    private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("subscription_rate")
    @ExcludeMissing
    private val subscriptionRate: JsonField<SubscriptionRate> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ending_before")
    @ExcludeMissing
    private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("fiat_credit_type_id")
    @ExcludeMissing
    private val fiatCreditTypeId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("seat_config")
    @ExcludeMissing
    private val seatConfig: JsonField<SeatConfig> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Previous, current, and next billing periods for the subscription. */
    fun billingPeriods(): BillingPeriods = billingPeriods.getRequired("billing_periods")

    fun collectionSchedule(): CollectionSchedule =
        collectionSchedule.getRequired("collection_schedule")

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
     */
    fun quantityManagementMode(): QuantityManagementMode =
        quantityManagementMode.getRequired("quantity_management_mode")

    /**
     * List of quantity schedule items for the subscription. Only includes the current quantity and
     * future quantity changes.
     */
    fun quantitySchedule(): List<QuantitySchedule> =
        quantitySchedule.getRequired("quantity_schedule")

    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

    fun subscriptionRate(): SubscriptionRate = subscriptionRate.getRequired("subscription_rate")

    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun endingBefore(): Optional<OffsetDateTime> =
        Optional.ofNullable(endingBefore.getNullable("ending_before"))

    fun fiatCreditTypeId(): Optional<String> =
        Optional.ofNullable(fiatCreditTypeId.getNullable("fiat_credit_type_id"))

    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    fun seatConfig(): Optional<SeatConfig> =
        Optional.ofNullable(seatConfig.getNullable("seat_config"))

    /** Previous, current, and next billing periods for the subscription. */
    @JsonProperty("billing_periods")
    @ExcludeMissing
    fun _billingPeriods(): JsonField<BillingPeriods> = billingPeriods

    @JsonProperty("collection_schedule")
    @ExcludeMissing
    fun _collectionSchedule(): JsonField<CollectionSchedule> = collectionSchedule

    @JsonProperty("proration") @ExcludeMissing fun _proration(): JsonField<Proration> = proration

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
    @JsonProperty("quantity_management_mode")
    @ExcludeMissing
    fun _quantityManagementMode(): JsonField<QuantityManagementMode> = quantityManagementMode

    /**
     * List of quantity schedule items for the subscription. Only includes the current quantity and
     * future quantity changes.
     */
    @JsonProperty("quantity_schedule")
    @ExcludeMissing
    fun _quantitySchedule(): JsonField<List<QuantitySchedule>> = quantitySchedule

    @JsonProperty("starting_at")
    @ExcludeMissing
    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

    @JsonProperty("subscription_rate")
    @ExcludeMissing
    fun _subscriptionRate(): JsonField<SubscriptionRate> = subscriptionRate

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("ending_before")
    @ExcludeMissing
    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

    @JsonProperty("fiat_credit_type_id")
    @ExcludeMissing
    fun _fiatCreditTypeId(): JsonField<String> = fiatCreditTypeId

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("seat_config")
    @ExcludeMissing
    fun _seatConfig(): JsonField<SeatConfig> = seatConfig

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Subscription = apply {
        if (validated) {
            return@apply
        }

        billingPeriods().validate()
        collectionSchedule()
        proration().validate()
        quantityManagementMode()
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

    fun toBuilder() = Builder().from(this)

    companion object {

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

        /** Previous, current, and next billing periods for the subscription. */
        fun billingPeriods(billingPeriods: JsonField<BillingPeriods>) = apply {
            this.billingPeriods = billingPeriods
        }

        fun collectionSchedule(collectionSchedule: CollectionSchedule) =
            collectionSchedule(JsonField.of(collectionSchedule))

        fun collectionSchedule(collectionSchedule: JsonField<CollectionSchedule>) = apply {
            this.collectionSchedule = collectionSchedule
        }

        fun proration(proration: Proration) = proration(JsonField.of(proration))

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
         * Determines how the subscription's quantity is controlled. Defaults to QUANTITY_ONLY.
         * **QUANTITY_ONLY**: The subscription quantity is specified directly on the subscription.
         * `initial_quantity` must be provided with this option. Compatible with recurring
         * commits/credits that use POOLED allocation. **SEAT_BASED**: Use when you want to pass
         * specific seat identifiers (e.g. add user_123) to increment and decrement a subscription
         * quantity, rather than directly providing the quantity. You must use a **SEAT_BASED**
         * subscription to use a linked recurring credit with an allocation per seat. `seat_config`
         * must be provided with this option.
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
         * List of quantity schedule items for the subscription. Only includes the current quantity
         * and future quantity changes.
         */
        fun quantitySchedule(quantitySchedule: JsonField<List<QuantitySchedule>>) = apply {
            this.quantitySchedule = quantitySchedule.map { it.toMutableList() }
        }

        /**
         * List of quantity schedule items for the subscription. Only includes the current quantity
         * and future quantity changes.
         */
        fun addQuantitySchedule(quantitySchedule: QuantitySchedule) = apply {
            this.quantitySchedule =
                (this.quantitySchedule ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(quantitySchedule)
                }
        }

        fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            this.startingAt = startingAt
        }

        fun subscriptionRate(subscriptionRate: SubscriptionRate) =
            subscriptionRate(JsonField.of(subscriptionRate))

        fun subscriptionRate(subscriptionRate: JsonField<SubscriptionRate>) = apply {
            this.subscriptionRate = subscriptionRate
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
        }

        fun fiatCreditTypeId(fiatCreditTypeId: String) =
            fiatCreditTypeId(JsonField.of(fiatCreditTypeId))

        fun fiatCreditTypeId(fiatCreditTypeId: JsonField<String>) = apply {
            this.fiatCreditTypeId = fiatCreditTypeId
        }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun seatConfig(seatConfig: SeatConfig) = seatConfig(JsonField.of(seatConfig))

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
                additionalProperties.toImmutable(),
            )
    }

    /** Previous, current, and next billing periods for the subscription. */
    @NoAutoDetect
    class BillingPeriods
    @JsonCreator
    private constructor(
        @JsonProperty("current")
        @ExcludeMissing
        private val current: JsonField<Current> = JsonMissing.of(),
        @JsonProperty("next") @ExcludeMissing private val next: JsonField<Next> = JsonMissing.of(),
        @JsonProperty("previous")
        @ExcludeMissing
        private val previous: JsonField<Previous> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun current(): Optional<Current> = Optional.ofNullable(current.getNullable("current"))

        fun next(): Optional<Next> = Optional.ofNullable(next.getNullable("next"))

        fun previous(): Optional<Previous> = Optional.ofNullable(previous.getNullable("previous"))

        @JsonProperty("current") @ExcludeMissing fun _current(): JsonField<Current> = current

        @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<Next> = next

        @JsonProperty("previous") @ExcludeMissing fun _previous(): JsonField<Previous> = previous

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BillingPeriods = apply {
            if (validated) {
                return@apply
            }

            current().ifPresent { it.validate() }
            next().ifPresent { it.validate() }
            previous().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun current(current: JsonField<Current>) = apply { this.current = current }

            fun next(next: Next) = next(JsonField.of(next))

            fun next(next: JsonField<Next>) = apply { this.next = next }

            fun previous(previous: Previous) = previous(JsonField.of(previous))

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

            fun build(): BillingPeriods =
                BillingPeriods(current, next, previous, additionalProperties.toImmutable())
        }

        @NoAutoDetect
        class Current
        @JsonCreator
        private constructor(
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Current = apply {
                if (validated) {
                    return@apply
                }

                endingBefore()
                startingAt()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

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

                fun build(): Current =
                    Current(
                        checkRequired("endingBefore", endingBefore),
                        checkRequired("startingAt", startingAt),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Current && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(endingBefore, startingAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Current{endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Next
        @JsonCreator
        private constructor(
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Next = apply {
                if (validated) {
                    return@apply
                }

                endingBefore()
                startingAt()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

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

                fun build(): Next =
                    Next(
                        checkRequired("endingBefore", endingBefore),
                        checkRequired("startingAt", startingAt),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Next && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(endingBefore, startingAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Next{endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Previous
        @JsonCreator
        private constructor(
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Previous = apply {
                if (validated) {
                    return@apply
                }

                endingBefore()
                startingAt()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

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

                fun build(): Previous =
                    Previous(
                        checkRequired("endingBefore", endingBefore),
                        checkRequired("startingAt", startingAt),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Previous && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(endingBefore, startingAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Previous{endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingPeriods && current == other.current && next == other.next && previous == other.previous && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(current, next, previous, additionalProperties) }
        /* spotless:on */

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CollectionSchedule && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Proration
    @JsonCreator
    private constructor(
        @JsonProperty("invoice_behavior")
        @ExcludeMissing
        private val invoiceBehavior: JsonField<InvoiceBehavior> = JsonMissing.of(),
        @JsonProperty("is_prorated")
        @ExcludeMissing
        private val isProrated: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun invoiceBehavior(): InvoiceBehavior = invoiceBehavior.getRequired("invoice_behavior")

        fun isProrated(): Boolean = isProrated.getRequired("is_prorated")

        @JsonProperty("invoice_behavior")
        @ExcludeMissing
        fun _invoiceBehavior(): JsonField<InvoiceBehavior> = invoiceBehavior

        @JsonProperty("is_prorated")
        @ExcludeMissing
        fun _isProrated(): JsonField<Boolean> = isProrated

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Proration = apply {
            if (validated) {
                return@apply
            }

            invoiceBehavior()
            isProrated()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun invoiceBehavior(invoiceBehavior: JsonField<InvoiceBehavior>) = apply {
                this.invoiceBehavior = invoiceBehavior
            }

            fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

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

            fun build(): Proration =
                Proration(
                    checkRequired("invoiceBehavior", invoiceBehavior),
                    checkRequired("isProrated", isProrated),
                    additionalProperties.toImmutable(),
                )
        }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoiceBehavior && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Proration && invoiceBehavior == other.invoiceBehavior && isProrated == other.isProrated && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(invoiceBehavior, isProrated, additionalProperties) }
        /* spotless:on */

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is QuantityManagementMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class QuantitySchedule
    @JsonCreator
    private constructor(
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun quantity(): Double = quantity.getRequired("quantity")

        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): QuantitySchedule = apply {
            if (validated) {
                return@apply
            }

            quantity()
            startingAt()
            endingBefore()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

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

            fun build(): QuantitySchedule =
                QuantitySchedule(
                    checkRequired("quantity", quantity),
                    checkRequired("startingAt", startingAt),
                    endingBefore,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is QuantitySchedule && quantity == other.quantity && startingAt == other.startingAt && endingBefore == other.endingBefore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(quantity, startingAt, endingBefore, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "QuantitySchedule{quantity=$quantity, startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class SubscriptionRate
    @JsonCreator
    private constructor(
        @JsonProperty("billing_frequency")
        @ExcludeMissing
        private val billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
        @JsonProperty("product")
        @ExcludeMissing
        private val product: JsonField<Product> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun billingFrequency(): BillingFrequency = billingFrequency.getRequired("billing_frequency")

        fun product(): Product = product.getRequired("product")

        @JsonProperty("billing_frequency")
        @ExcludeMissing
        fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SubscriptionRate = apply {
            if (validated) {
                return@apply
            }

            billingFrequency()
            product().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun billingFrequency(billingFrequency: JsonField<BillingFrequency>) = apply {
                this.billingFrequency = billingFrequency
            }

            fun product(product: Product) = product(JsonField.of(product))

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

            fun build(): SubscriptionRate =
                SubscriptionRate(
                    checkRequired("billingFrequency", billingFrequency),
                    checkRequired("product", product),
                    additionalProperties.toImmutable(),
                )
        }

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
        class Product
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SubscriptionRate && billingFrequency == other.billingFrequency && product == other.product && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billingFrequency, product, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SubscriptionRate{billingFrequency=$billingFrequency, product=$product, additionalProperties=$additionalProperties}"
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class SeatConfig
    @JsonCreator
    private constructor(
        @JsonProperty("seat_group_key")
        @ExcludeMissing
        private val seatGroupKey: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The property name, sent on usage events, that identifies the seat ID associated with the
         * usage event. For example, the property name might be seat_id or user_id. The property
         * must be set as a group key on billable metrics and a presentation/pricing group key on
         * contract products. This allows linked recurring credits with an allocation per seat to be
         * consumed by only one seat's usage.
         */
        fun seatGroupKey(): String = seatGroupKey.getRequired("seat_group_key")

        /**
         * The property name, sent on usage events, that identifies the seat ID associated with the
         * usage event. For example, the property name might be seat_id or user_id. The property
         * must be set as a group key on billable metrics and a presentation/pricing group key on
         * contract products. This allows linked recurring credits with an allocation per seat to be
         * consumed by only one seat's usage.
         */
        @JsonProperty("seat_group_key")
        @ExcludeMissing
        fun _seatGroupKey(): JsonField<String> = seatGroupKey

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SeatConfig = apply {
            if (validated) {
                return@apply
            }

            seatGroupKey()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
             * The property name, sent on usage events, that identifies the seat ID associated with
             * the usage event. For example, the property name might be seat_id or user_id. The
             * property must be set as a group key on billable metrics and a presentation/pricing
             * group key on contract products. This allows linked recurring credits with an
             * allocation per seat to be consumed by only one seat's usage.
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

            fun build(): SeatConfig =
                SeatConfig(
                    checkRequired("seatGroupKey", seatGroupKey),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SeatConfig && seatGroupKey == other.seatGroupKey && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(seatGroupKey, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SeatConfig{seatGroupKey=$seatGroupKey, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Subscription && billingPeriods == other.billingPeriods && collectionSchedule == other.collectionSchedule && proration == other.proration && quantityManagementMode == other.quantityManagementMode && quantitySchedule == other.quantitySchedule && startingAt == other.startingAt && subscriptionRate == other.subscriptionRate && id == other.id && customFields == other.customFields && description == other.description && endingBefore == other.endingBefore && fiatCreditTypeId == other.fiatCreditTypeId && name == other.name && seatConfig == other.seatConfig && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(billingPeriods, collectionSchedule, proration, quantityManagementMode, quantitySchedule, startingAt, subscriptionRate, id, customFields, description, endingBefore, fiatCreditTypeId, name, seatConfig, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Subscription{billingPeriods=$billingPeriods, collectionSchedule=$collectionSchedule, proration=$proration, quantityManagementMode=$quantityManagementMode, quantitySchedule=$quantitySchedule, startingAt=$startingAt, subscriptionRate=$subscriptionRate, id=$id, customFields=$customFields, description=$description, endingBefore=$endingBefore, fiatCreditTypeId=$fiatCreditTypeId, name=$name, seatConfig=$seatConfig, additionalProperties=$additionalProperties}"
}
