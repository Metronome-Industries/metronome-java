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
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ScheduleDuration
@JsonCreator
private constructor(
    @JsonProperty("credit_type")
    @ExcludeMissing
    private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
    @JsonProperty("schedule_items")
    @ExcludeMissing
    private val scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun creditType(): Optional<CreditTypeData> =
        Optional.ofNullable(creditType.getNullable("credit_type"))

    fun scheduleItems(): List<ScheduleItem> = scheduleItems.getRequired("schedule_items")

    @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

    @JsonProperty("schedule_items") @ExcludeMissing fun _scheduleItems() = scheduleItems

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ScheduleDuration = apply {
        if (!validated) {
            creditType().map { it.validate() }
            scheduleItems().forEach { it.validate() }
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
        internal fun from(scheduleDuration: ScheduleDuration) = apply {
            creditType = scheduleDuration.creditType
            scheduleItems = scheduleDuration.scheduleItems
            additionalProperties = scheduleDuration.additionalProperties.toMutableMap()
        }

        fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

        fun creditType(creditType: JsonField<CreditTypeData>) = apply {
            this.creditType = creditType
        }

        fun scheduleItems(scheduleItems: List<ScheduleItem>) =
            scheduleItems(JsonField.of(scheduleItems))

        fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
            this.scheduleItems = scheduleItems
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

        fun build(): ScheduleDuration =
            ScheduleDuration(
                creditType,
                scheduleItems.map { it.toImmutable() },
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
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun amount(): Double = amount.getRequired("amount")

        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

        @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ScheduleItem = apply {
            if (!validated) {
                id()
                amount()
                startingAt()
                endingBefore()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Double> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scheduleItem: ScheduleItem) = apply {
                id = scheduleItem.id
                amount = scheduleItem.amount
                startingAt = scheduleItem.startingAt
                endingBefore = scheduleItem.endingBefore
                additionalProperties = scheduleItem.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

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

            fun build(): ScheduleItem =
                ScheduleItem(
                    id,
                    amount,
                    startingAt,
                    endingBefore,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScheduleItem && id == other.id && amount == other.amount && startingAt == other.startingAt && endingBefore == other.endingBefore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, startingAt, endingBefore, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ScheduleItem{id=$id, amount=$amount, startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScheduleDuration && creditType == other.creditType && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(creditType, scheduleItems, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScheduleDuration{creditType=$creditType, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
}
