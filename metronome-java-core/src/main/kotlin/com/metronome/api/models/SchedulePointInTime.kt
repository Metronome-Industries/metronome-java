// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = SchedulePointInTime.Builder::class)
@NoAutoDetect
class SchedulePointInTime
private constructor(
    private val creditType: JsonField<CreditTypeData>,
    private val scheduleItems: JsonField<List<ScheduleItem>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun creditType(): Optional<CreditTypeData> =
        Optional.ofNullable(creditType.getNullable("credit_type"))

    fun scheduleItems(): Optional<List<ScheduleItem>> =
        Optional.ofNullable(scheduleItems.getNullable("schedule_items"))

    @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

    @JsonProperty("schedule_items") @ExcludeMissing fun _scheduleItems() = scheduleItems

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SchedulePointInTime = apply {
        if (!validated) {
            creditType().map { it.validate() }
            scheduleItems().map { it.forEach { it.validate() } }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
        private var scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(schedulePointInTime: SchedulePointInTime) = apply {
            this.creditType = schedulePointInTime.creditType
            this.scheduleItems = schedulePointInTime.scheduleItems
            additionalProperties(schedulePointInTime.additionalProperties)
        }

        fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

        @JsonProperty("credit_type")
        @ExcludeMissing
        fun creditType(creditType: JsonField<CreditTypeData>) = apply {
            this.creditType = creditType
        }

        fun scheduleItems(scheduleItems: List<ScheduleItem>) =
            scheduleItems(JsonField.of(scheduleItems))

        @JsonProperty("schedule_items")
        @ExcludeMissing
        fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
            this.scheduleItems = scheduleItems
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): SchedulePointInTime =
            SchedulePointInTime(
                creditType,
                scheduleItems.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = ScheduleItem.Builder::class)
    @NoAutoDetect
    class ScheduleItem
    private constructor(
        private val id: JsonField<String>,
        private val invoiceId: JsonField<String>,
        private val amount: JsonField<Double>,
        private val unitPrice: JsonField<Double>,
        private val quantity: JsonField<Double>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun id(): String = id.getRequired("id")

        fun invoiceId(): String = invoiceId.getRequired("invoice_id")

        fun amount(): Double = amount.getRequired("amount")

        fun unitPrice(): Double = unitPrice.getRequired("unit_price")

        fun quantity(): Double = quantity.getRequired("quantity")

        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice() = unitPrice

        @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

        @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ScheduleItem = apply {
            if (!validated) {
                id()
                invoiceId()
                amount()
                unitPrice()
                quantity()
                timestamp()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var invoiceId: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Double> = JsonMissing.of()
            private var unitPrice: JsonField<Double> = JsonMissing.of()
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scheduleItem: ScheduleItem) = apply {
                this.id = scheduleItem.id
                this.invoiceId = scheduleItem.invoiceId
                this.amount = scheduleItem.amount
                this.unitPrice = scheduleItem.unitPrice
                this.quantity = scheduleItem.quantity
                this.timestamp = scheduleItem.timestamp
                additionalProperties(scheduleItem.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

            @JsonProperty("unit_price")
            @ExcludeMissing
            fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            @JsonProperty("quantity")
            @ExcludeMissing
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ScheduleItem =
                ScheduleItem(
                    id,
                    invoiceId,
                    amount,
                    unitPrice,
                    quantity,
                    timestamp,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScheduleItem && this.id == other.id && this.invoiceId == other.invoiceId && this.amount == other.amount && this.unitPrice == other.unitPrice && this.quantity == other.quantity && this.timestamp == other.timestamp && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(id, invoiceId, amount, unitPrice, quantity, timestamp, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ScheduleItem{id=$id, invoiceId=$invoiceId, amount=$amount, unitPrice=$unitPrice, quantity=$quantity, timestamp=$timestamp, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SchedulePointInTime && this.creditType == other.creditType && this.scheduleItems == other.scheduleItems && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(creditType, scheduleItems, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "SchedulePointInTime{creditType=$creditType, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
}
