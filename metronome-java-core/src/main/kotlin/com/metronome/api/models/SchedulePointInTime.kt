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
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.checkRequired
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class SchedulePointInTime
@JsonCreator
private constructor(
    @JsonProperty("credit_type")
    @ExcludeMissing
    private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
    @JsonProperty("do_not_invoice")
    @ExcludeMissing
    private val doNotInvoice: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("schedule_items")
    @ExcludeMissing
    private val scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun creditType(): Optional<CreditTypeData> =
        Optional.ofNullable(creditType.getNullable("credit_type"))

    /**
     * This field is only applicable to commit invoice schedules. If true, this schedule will not
     * generate an invoice.
     */
    fun doNotInvoice(): Optional<Boolean> =
        Optional.ofNullable(doNotInvoice.getNullable("do_not_invoice"))

    fun scheduleItems(): Optional<List<ScheduleItem>> =
        Optional.ofNullable(scheduleItems.getNullable("schedule_items"))

    @JsonProperty("credit_type")
    @ExcludeMissing
    fun _creditType(): JsonField<CreditTypeData> = creditType

    /**
     * This field is only applicable to commit invoice schedules. If true, this schedule will not
     * generate an invoice.
     */
    @JsonProperty("do_not_invoice")
    @ExcludeMissing
    fun _doNotInvoice(): JsonField<Boolean> = doNotInvoice

    @JsonProperty("schedule_items")
    @ExcludeMissing
    fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

    fun toBuilder() = Builder().from(this)

    companion object {

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

        fun creditType(creditType: JsonField<CreditTypeData>) = apply {
            this.creditType = creditType
        }

        /**
         * This field is only applicable to commit invoice schedules. If true, this schedule will
         * not generate an invoice.
         */
        fun doNotInvoice(doNotInvoice: Boolean) = doNotInvoice(JsonField.of(doNotInvoice))

        /**
         * This field is only applicable to commit invoice schedules. If true, this schedule will
         * not generate an invoice.
         */
        fun doNotInvoice(doNotInvoice: JsonField<Boolean>) = apply {
            this.doNotInvoice = doNotInvoice
        }

        fun scheduleItems(scheduleItems: List<ScheduleItem>) =
            scheduleItems(JsonField.of(scheduleItems))

        fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
            this.scheduleItems = scheduleItems.map { it.toMutableList() }
        }

        fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
            scheduleItems =
                (scheduleItems ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(scheduleItem)
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

        fun build(): SchedulePointInTime =
            SchedulePointInTime(
                creditType,
                doNotInvoice,
                (scheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class ScheduleItem
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("unit_price")
        @ExcludeMissing
        private val unitPrice: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("invoice_id")
        @ExcludeMissing
        private val invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun amount(): Double = amount.getRequired("amount")

        fun quantity(): Double = quantity.getRequired("quantity")

        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        fun unitPrice(): Double = unitPrice.getRequired("unit_price")

        fun invoiceId(): Optional<String> = Optional.ofNullable(invoiceId.getNullable("invoice_id"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice(): JsonField<Double> = unitPrice

        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

            fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

            fun invoiceId(invoiceId: String?) = invoiceId(JsonField.ofNullable(invoiceId))

            fun invoiceId(invoiceId: Optional<String>) = invoiceId(invoiceId.orElse(null))

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

            fun build(): ScheduleItem =
                ScheduleItem(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("quantity", quantity),
                    checkRequired("timestamp", timestamp),
                    checkRequired("unitPrice", unitPrice),
                    invoiceId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScheduleItem && id == other.id && amount == other.amount && quantity == other.quantity && timestamp == other.timestamp && unitPrice == other.unitPrice && invoiceId == other.invoiceId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, quantity, timestamp, unitPrice, invoiceId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ScheduleItem{id=$id, amount=$amount, quantity=$quantity, timestamp=$timestamp, unitPrice=$unitPrice, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SchedulePointInTime && creditType == other.creditType && doNotInvoice == other.doNotInvoice && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(creditType, doNotInvoice, scheduleItems, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SchedulePointInTime{creditType=$creditType, doNotInvoice=$doNotInvoice, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
}
