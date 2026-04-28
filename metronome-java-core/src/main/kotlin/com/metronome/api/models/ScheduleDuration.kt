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

class ScheduleDuration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val scheduleItems: JsonField<List<ScheduleItem>>,
    private val creditType: JsonField<CreditTypeData>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("schedule_items")
        @ExcludeMissing
        scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
        @JsonProperty("credit_type")
        @ExcludeMissing
        creditType: JsonField<CreditTypeData> = JsonMissing.of(),
    ) : this(scheduleItems, creditType, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scheduleItems(): List<ScheduleItem> = scheduleItems.getRequired("schedule_items")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditType(): Optional<CreditTypeData> = creditType.getOptional("credit_type")

    /**
     * Returns the raw JSON value of [scheduleItems].
     *
     * Unlike [scheduleItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("schedule_items")
    @ExcludeMissing
    fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

    /**
     * Returns the raw JSON value of [creditType].
     *
     * Unlike [creditType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_type")
    @ExcludeMissing
    fun _creditType(): JsonField<CreditTypeData> = creditType

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
         * Returns a mutable builder for constructing an instance of [ScheduleDuration].
         *
         * The following fields are required:
         * ```java
         * .scheduleItems()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScheduleDuration]. */
    class Builder internal constructor() {

        private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
        private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scheduleDuration: ScheduleDuration) = apply {
            scheduleItems = scheduleDuration.scheduleItems.map { it.toMutableList() }
            creditType = scheduleDuration.creditType
            additionalProperties = scheduleDuration.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ScheduleDuration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .scheduleItems()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScheduleDuration =
            ScheduleDuration(
                checkRequired("scheduleItems", scheduleItems).map { it.toImmutable() },
                creditType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ScheduleDuration = apply {
        if (validated) {
            return@apply
        }

        scheduleItems().forEach { it.validate() }
        creditType().ifPresent { it.validate() }
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
        (scheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (creditType.asKnown().getOrNull()?.validity() ?: 0)

    class ScheduleItem
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Double>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(id, amount, endingBefore, startingAt, mutableMapOf())

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
        fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

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
         * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
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
             * Returns a mutable builder for constructing an instance of [ScheduleItem].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .endingBefore()
             * .startingAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ScheduleItem]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Double>? = null
            private var endingBefore: JsonField<OffsetDateTime>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scheduleItem: ScheduleItem) = apply {
                id = scheduleItem.id
                amount = scheduleItem.amount
                endingBefore = scheduleItem.endingBefore
                startingAt = scheduleItem.startingAt
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
             * .endingBefore()
             * .startingAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ScheduleItem =
                ScheduleItem(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("endingBefore", endingBefore),
                    checkRequired("startingAt", startingAt),
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (if (startingAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ScheduleItem &&
                id == other.id &&
                amount == other.amount &&
                endingBefore == other.endingBefore &&
                startingAt == other.startingAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, amount, endingBefore, startingAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ScheduleItem{id=$id, amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScheduleDuration &&
            scheduleItems == other.scheduleItems &&
            creditType == other.creditType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(scheduleItems, creditType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScheduleDuration{scheduleItems=$scheduleItems, creditType=$creditType, additionalProperties=$additionalProperties}"
}
