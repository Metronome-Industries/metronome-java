// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class SchedulePointInTime
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val creditType: JsonField<CreditTypeData>,
    private val doNotInvoice: JsonField<Boolean>,
    private val scheduleItems: JsonField<List<ScheduleItem>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("credit_type")
        @ExcludeMissing
        creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("do_not_invoice")
        @ExcludeMissing
        doNotInvoice: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("schedule_items")
        @ExcludeMissing
        scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
    ) : this(creditType, doNotInvoice, scheduleItems, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditType(): Optional<CreditTypeData> = creditType.getOptional("credit_type")

    /**
     * This field is only applicable to commit invoice schedules. If true, this schedule will not
     * generate an invoice.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun doNotInvoice(): Optional<Boolean> = doNotInvoice.getOptional("do_not_invoice")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduleItems(): Optional<List<ScheduleItem>> = scheduleItems.getOptional("schedule_items")

    /**
     * Returns the raw JSON value of [creditType].
     *
     * Unlike [creditType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_type")
    @ExcludeMissing
    fun _creditType(): JsonField<CreditTypeData> = creditType

    /**
     * Returns the raw JSON value of [doNotInvoice].
     *
     * Unlike [doNotInvoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("do_not_invoice")
    @ExcludeMissing
    fun _doNotInvoice(): JsonField<Boolean> = doNotInvoice

    /**
     * Returns the raw JSON value of [scheduleItems].
     *
     * Unlike [scheduleItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("schedule_items")
    @ExcludeMissing
    fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

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

        /** Returns a mutable builder for constructing an instance of [SchedulePointInTime]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SchedulePointInTime]. */
    class Builder internal constructor() {

        private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
        private var doNotInvoice: JsonField<Boolean> = JsonMissing.of()
        private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(schedulePointInTime: SchedulePointInTime) = apply {
            creditType = schedulePointInTime.creditType
            doNotInvoice = schedulePointInTime.doNotInvoice
            scheduleItems = schedulePointInTime.scheduleItems.map { it.toMutableList() }
            additionalProperties = schedulePointInTime.additionalProperties.toMutableMap()
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

        /**
         * This field is only applicable to commit invoice schedules. If true, this schedule will
         * not generate an invoice.
         */
        fun doNotInvoice(doNotInvoice: Boolean) = doNotInvoice(JsonField.of(doNotInvoice))

        /**
         * Sets [Builder.doNotInvoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doNotInvoice] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun doNotInvoice(doNotInvoice: JsonField<Boolean>) = apply {
            this.doNotInvoice = doNotInvoice
        }

        fun scheduleItems(scheduleItems: List<ScheduleItem>) =
            scheduleItems(JsonField.of(scheduleItems))

        /**
         * Sets [Builder.scheduleItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduleItems] with a well-typed `List<ScheduleItem>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
            this.scheduleItems = scheduleItems.map { it.toMutableList() }
        }

        /**
         * Adds a single [ScheduleItem] to [scheduleItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
            scheduleItems =
                (scheduleItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scheduleItems", it).add(scheduleItem)
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
         * Returns an immutable instance of [SchedulePointInTime].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SchedulePointInTime =
            SchedulePointInTime(
                creditType,
                doNotInvoice,
                (scheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SchedulePointInTime = apply {
        if (validated) {
            return@apply
        }

        creditType().ifPresent { it.validate() }
        doNotInvoice()
        scheduleItems().ifPresent { it.forEach { it.validate() } }
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
        (creditType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (doNotInvoice.asKnown().isPresent) 1 else 0) +
            (scheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class ScheduleItem
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Double>,
        private val quantity: JsonField<Double>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val unitPrice: JsonField<Double>,
        private val invoiceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("unit_price")
            @ExcludeMissing
            unitPrice: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            invoiceId: JsonField<String> = JsonMissing.of(),
        ) : this(id, amount, quantity, timestamp, unitPrice, invoiceId, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Double = quantity.getRequired("quantity")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unitPrice(): Double = unitPrice.getRequired("unit_price")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceId(): Optional<String> = invoiceId.getOptional("invoice_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        /**
         * Returns the raw JSON value of [unitPrice].
         *
         * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice(): JsonField<Double> = unitPrice

        /**
         * Returns the raw JSON value of [invoiceId].
         *
         * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

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
             * Returns a mutable builder for constructing an instance of [ScheduleItem].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .quantity()
             * .timestamp()
             * .unitPrice()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ScheduleItem]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Double>? = null
            private var quantity: JsonField<Double>? = null
            private var timestamp: JsonField<OffsetDateTime>? = null
            private var unitPrice: JsonField<Double>? = null
            private var invoiceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scheduleItem: ScheduleItem) = apply {
                id = scheduleItem.id
                amount = scheduleItem.amount
                quantity = scheduleItem.quantity
                timestamp = scheduleItem.timestamp
                unitPrice = scheduleItem.unitPrice
                invoiceId = scheduleItem.invoiceId
                additionalProperties = scheduleItem.additionalProperties.toMutableMap()
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

            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

            /**
             * Sets [Builder.unitPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitPrice] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

            fun invoiceId(invoiceId: String?) = invoiceId(JsonField.ofNullable(invoiceId))

            /** Alias for calling [Builder.invoiceId] with `invoiceId.orElse(null)`. */
            fun invoiceId(invoiceId: Optional<String>) = invoiceId(invoiceId.getOrNull())

            /**
             * Sets [Builder.invoiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

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
             * Returns an immutable instance of [ScheduleItem].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .quantity()
             * .timestamp()
             * .unitPrice()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ScheduleItem =
                ScheduleItem(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("quantity", quantity),
                    checkRequired("timestamp", timestamp),
                    checkRequired("unitPrice", unitPrice),
                    invoiceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ScheduleItem = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            quantity()
            timestamp()
            unitPrice()
            invoiceId()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0) +
                (if (unitPrice.asKnown().isPresent) 1 else 0) +
                (if (invoiceId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ScheduleItem &&
                id == other.id &&
                amount == other.amount &&
                quantity == other.quantity &&
                timestamp == other.timestamp &&
                unitPrice == other.unitPrice &&
                invoiceId == other.invoiceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                amount,
                quantity,
                timestamp,
                unitPrice,
                invoiceId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ScheduleItem{id=$id, amount=$amount, quantity=$quantity, timestamp=$timestamp, unitPrice=$unitPrice, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SchedulePointInTime &&
            creditType == other.creditType &&
            doNotInvoice == other.doNotInvoice &&
            scheduleItems == other.scheduleItems &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(creditType, doNotInvoice, scheduleItems, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SchedulePointInTime{creditType=$creditType, doNotInvoice=$doNotInvoice, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
}
