// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

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

class ContractGetSubscriptionSeatsHistoryResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val nextPage: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("next_page") @ExcludeMissing nextPage: JsonField<String> = JsonMissing.of(),
    ) : this(data, nextPage, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * Cursor for the next page of results
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextPage(): Optional<String> = nextPage.getOptional("next_page")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [nextPage].
     *
     * Unlike [nextPage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_page") @ExcludeMissing fun _nextPage(): JsonField<String> = nextPage

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
         * [ContractGetSubscriptionSeatsHistoryResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .nextPage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractGetSubscriptionSeatsHistoryResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var nextPage: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractGetSubscriptionSeatsHistoryResponse: ContractGetSubscriptionSeatsHistoryResponse
        ) = apply {
            data = contractGetSubscriptionSeatsHistoryResponse.data.map { it.toMutableList() }
            nextPage = contractGetSubscriptionSeatsHistoryResponse.nextPage
            additionalProperties =
                contractGetSubscriptionSeatsHistoryResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /** Cursor for the next page of results */
        fun nextPage(nextPage: String?) = nextPage(JsonField.ofNullable(nextPage))

        /** Alias for calling [Builder.nextPage] with `nextPage.orElse(null)`. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.getOrNull())

        /**
         * Sets [Builder.nextPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextPage] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

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
         * Returns an immutable instance of [ContractGetSubscriptionSeatsHistoryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .nextPage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContractGetSubscriptionSeatsHistoryResponse =
            ContractGetSubscriptionSeatsHistoryResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("nextPage", nextPage),
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
    fun validate(): ContractGetSubscriptionSeatsHistoryResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        nextPage()
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextPage.asKnown().isPresent) 1 else 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val assignedSeatIds: JsonField<List<String>>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val totalQuantity: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("assigned_seat_ids")
            @ExcludeMissing
            assignedSeatIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("total_quantity")
            @ExcludeMissing
            totalQuantity: JsonField<Long> = JsonMissing.of(),
        ) : this(assignedSeatIds, endingBefore, startingAt, totalQuantity, mutableMapOf())

        /**
         * Array of seat IDs that are assigned in this period
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun assignedSeatIds(): List<String> = assignedSeatIds.getRequired("assigned_seat_ids")

        /**
         * The end time of this seat schedule period (null if ongoing)
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * The start time of this seat schedule period
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /**
         * Total number of assigned and unassigned seats in this period
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalQuantity(): Long = totalQuantity.getRequired("total_quantity")

        /**
         * Returns the raw JSON value of [assignedSeatIds].
         *
         * Unlike [assignedSeatIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("assigned_seat_ids")
        @ExcludeMissing
        fun _assignedSeatIds(): JsonField<List<String>> = assignedSeatIds

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

        /**
         * Returns the raw JSON value of [totalQuantity].
         *
         * Unlike [totalQuantity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_quantity")
        @ExcludeMissing
        fun _totalQuantity(): JsonField<Long> = totalQuantity

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .assignedSeatIds()
             * .endingBefore()
             * .startingAt()
             * .totalQuantity()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var assignedSeatIds: JsonField<MutableList<String>>? = null
            private var endingBefore: JsonField<OffsetDateTime>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var totalQuantity: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                assignedSeatIds = data.assignedSeatIds.map { it.toMutableList() }
                endingBefore = data.endingBefore
                startingAt = data.startingAt
                totalQuantity = data.totalQuantity
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Array of seat IDs that are assigned in this period */
            fun assignedSeatIds(assignedSeatIds: List<String>) =
                assignedSeatIds(JsonField.of(assignedSeatIds))

            /**
             * Sets [Builder.assignedSeatIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assignedSeatIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun assignedSeatIds(assignedSeatIds: JsonField<List<String>>) = apply {
                this.assignedSeatIds = assignedSeatIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [assignedSeatIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAssignedSeatId(assignedSeatId: String) = apply {
                assignedSeatIds =
                    (assignedSeatIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("assignedSeatIds", it).add(assignedSeatId)
                    }
            }

            /** The end time of this seat schedule period (null if ongoing) */
            fun endingBefore(endingBefore: OffsetDateTime?) =
                endingBefore(JsonField.ofNullable(endingBefore))

            /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
            fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
                endingBefore(endingBefore.getOrNull())

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

            /** The start time of this seat schedule period */
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

            /** Total number of assigned and unassigned seats in this period */
            fun totalQuantity(totalQuantity: Long) = totalQuantity(JsonField.of(totalQuantity))

            /**
             * Sets [Builder.totalQuantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalQuantity] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalQuantity(totalQuantity: JsonField<Long>) = apply {
                this.totalQuantity = totalQuantity
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .assignedSeatIds()
             * .endingBefore()
             * .startingAt()
             * .totalQuantity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("assignedSeatIds", assignedSeatIds).map { it.toImmutable() },
                    checkRequired("endingBefore", endingBefore),
                    checkRequired("startingAt", startingAt),
                    checkRequired("totalQuantity", totalQuantity),
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            assignedSeatIds()
            endingBefore()
            startingAt()
            totalQuantity()
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
            (assignedSeatIds.asKnown().getOrNull()?.size ?: 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (if (startingAt.asKnown().isPresent) 1 else 0) +
                (if (totalQuantity.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                assignedSeatIds == other.assignedSeatIds &&
                endingBefore == other.endingBefore &&
                startingAt == other.startingAt &&
                totalQuantity == other.totalQuantity &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                assignedSeatIds,
                endingBefore,
                startingAt,
                totalQuantity,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{assignedSeatIds=$assignedSeatIds, endingBefore=$endingBefore, startingAt=$startingAt, totalQuantity=$totalQuantity, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractGetSubscriptionSeatsHistoryResponse &&
            data == other.data &&
            nextPage == other.nextPage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, nextPage, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractGetSubscriptionSeatsHistoryResponse{data=$data, nextPage=$nextPage, additionalProperties=$additionalProperties}"
}
