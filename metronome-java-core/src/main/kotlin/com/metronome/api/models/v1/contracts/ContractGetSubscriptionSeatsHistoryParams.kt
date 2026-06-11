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
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get the history of subscription seats schedule over time for a given `subscription_id`. This
 * endpoint provides information about seat assignments and total quantities for different time
 * periods, allowing you to track how seat assignments have changed over time.
 *
 * ### Use this endpoint to:
 * - Track changes to seat assignments over time
 * - Get seat schedule for a specific date using the `covering_date` parameter
 * - Get seat schedule history with optional date range filtering using `starting_at` and
 *   `ending_before`
 *
 * ### Key response fields:
 * - data: array of seat schedule entries with time periods, quantity, and assignments
 * - next_page: cursor for pagination to retrieve additional results
 *
 * ### Usage guidelines:
 * - Use `covering_date` to get the active seats for a specific point in time. `covering_date`
 *   cannot be used with `starting_at` or `ending_before`.
 * - Use `starting_at` and `ending_before` to filter results by time range. `starting_at` and
 *   `ending_before` cannot be used with `covering_date`.
 * - Maximum limit is 10 seat schedule entries per request
 * - Results are ordered by `starting_at` timestamp
 */
class ContractGetSubscriptionSeatsHistoryParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contractId(): String = body.contractId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionId(): String = body.subscriptionId()

    /**
     * Get the seats history segment for the covering date. Cannot be used with `starting_at` or
     * `ending_before`.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun coveringDate(): Optional<OffsetDateTime> = body.coveringDate()

    /**
     * Cursor for pagination. Use the value from the `next_page` field of the previous response to
     * retrieve the next page of results.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cursor(): Optional<String> = body.cursor()

    /**
     * Include seats history segments that are active at or before this timestamp. Use with
     * `starting_at` to get a specific time range. If not set, there's no upper bound.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endingBefore(): Optional<OffsetDateTime> = body.endingBefore()

    /**
     * Maximum number of seat schedule entries to return. Defaults to 10. Required range: 1 <= x
     * <= 10.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Long> = body.limit()

    /**
     * Include seats history segments that are active at or after this timestamp. Use with
     * `ending_before` to get a specific time range. If not set, there's no lower bound.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startingAt(): Optional<OffsetDateTime> = body.startingAt()

    /**
     * Returns the raw JSON value of [contractId].
     *
     * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contractId(): JsonField<String> = body._contractId()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subscriptionId(): JsonField<String> = body._subscriptionId()

    /**
     * Returns the raw JSON value of [coveringDate].
     *
     * Unlike [coveringDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _coveringDate(): JsonField<OffsetDateTime> = body._coveringDate()

    /**
     * Returns the raw JSON value of [cursor].
     *
     * Unlike [cursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cursor(): JsonField<String> = body._cursor()

    /**
     * Returns the raw JSON value of [endingBefore].
     *
     * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endingBefore(): JsonField<OffsetDateTime> = body._endingBefore()

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limit(): JsonField<Long> = body._limit()

    /**
     * Returns the raw JSON value of [startingAt].
     *
     * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startingAt(): JsonField<OffsetDateTime> = body._startingAt()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ContractGetSubscriptionSeatsHistoryParams].
         *
         * The following fields are required:
         * ```java
         * .contractId()
         * .customerId()
         * .subscriptionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractGetSubscriptionSeatsHistoryParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            contractGetSubscriptionSeatsHistoryParams: ContractGetSubscriptionSeatsHistoryParams
        ) = apply {
            body = contractGetSubscriptionSeatsHistoryParams.body.toBuilder()
            additionalHeaders =
                contractGetSubscriptionSeatsHistoryParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                contractGetSubscriptionSeatsHistoryParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [contractId]
         * - [customerId]
         * - [subscriptionId]
         * - [coveringDate]
         * - [cursor]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        fun subscriptionId(subscriptionId: String) = apply { body.subscriptionId(subscriptionId) }

        /**
         * Sets [Builder.subscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionId(subscriptionId: JsonField<String>) = apply {
            body.subscriptionId(subscriptionId)
        }

        /**
         * Get the seats history segment for the covering date. Cannot be used with `starting_at` or
         * `ending_before`.
         */
        fun coveringDate(coveringDate: OffsetDateTime?) = apply { body.coveringDate(coveringDate) }

        /** Alias for calling [Builder.coveringDate] with `coveringDate.orElse(null)`. */
        fun coveringDate(coveringDate: Optional<OffsetDateTime>) =
            coveringDate(coveringDate.getOrNull())

        /**
         * Sets [Builder.coveringDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coveringDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun coveringDate(coveringDate: JsonField<OffsetDateTime>) = apply {
            body.coveringDate(coveringDate)
        }

        /**
         * Cursor for pagination. Use the value from the `next_page` field of the previous response
         * to retrieve the next page of results.
         */
        fun cursor(cursor: String?) = apply { body.cursor(cursor) }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /**
         * Sets [Builder.cursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cursor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cursor(cursor: JsonField<String>) = apply { body.cursor(cursor) }

        /**
         * Include seats history segments that are active at or before this timestamp. Use with
         * `starting_at` to get a specific time range. If not set, there's no upper bound.
         */
        fun endingBefore(endingBefore: OffsetDateTime?) = apply { body.endingBefore(endingBefore) }

        /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
        fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
            endingBefore(endingBefore.getOrNull())

        /**
         * Sets [Builder.endingBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            body.endingBefore(endingBefore)
        }

        /**
         * Maximum number of seat schedule entries to return. Defaults to 10. Required range: 1 <= x
         * <= 10.
         */
        fun limit(limit: Long?) = apply { body.limit(limit) }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { body.limit(limit) }

        /**
         * Include seats history segments that are active at or after this timestamp. Use with
         * `ending_before` to get a specific time range. If not set, there's no lower bound.
         */
        fun startingAt(startingAt: OffsetDateTime?) = apply { body.startingAt(startingAt) }

        /** Alias for calling [Builder.startingAt] with `startingAt.orElse(null)`. */
        fun startingAt(startingAt: Optional<OffsetDateTime>) = startingAt(startingAt.getOrNull())

        /**
         * Sets [Builder.startingAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            body.startingAt(startingAt)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ContractGetSubscriptionSeatsHistoryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contractId()
         * .customerId()
         * .subscriptionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContractGetSubscriptionSeatsHistoryParams =
            ContractGetSubscriptionSeatsHistoryParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contractId: JsonField<String>,
        private val customerId: JsonField<String>,
        private val subscriptionId: JsonField<String>,
        private val coveringDate: JsonField<OffsetDateTime>,
        private val cursor: JsonField<String>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val limit: JsonField<Long>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contract_id")
            @ExcludeMissing
            contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subscription_id")
            @ExcludeMissing
            subscriptionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("covering_date")
            @ExcludeMissing
            coveringDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            contractId,
            customerId,
            subscriptionId,
            coveringDate,
            cursor,
            endingBefore,
            limit,
            startingAt,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contractId(): String = contractId.getRequired("contract_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

        /**
         * Get the seats history segment for the covering date. Cannot be used with `starting_at` or
         * `ending_before`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun coveringDate(): Optional<OffsetDateTime> = coveringDate.getOptional("covering_date")

        /**
         * Cursor for pagination. Use the value from the `next_page` field of the previous response
         * to retrieve the next page of results.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cursor(): Optional<String> = cursor.getOptional("cursor")

        /**
         * Include seats history segments that are active at or before this timestamp. Use with
         * `starting_at` to get a specific time range. If not set, there's no upper bound.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * Maximum number of seat schedule entries to return. Defaults to 10. Required range: 1 <= x
         * <= 10.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
         * Include seats history segments that are active at or after this timestamp. Use with
         * `ending_before` to get a specific time range. If not set, there's no lower bound.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startingAt(): Optional<OffsetDateTime> = startingAt.getOptional("starting_at")

        /**
         * Returns the raw JSON value of [contractId].
         *
         * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [subscriptionId].
         *
         * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription_id")
        @ExcludeMissing
        fun _subscriptionId(): JsonField<String> = subscriptionId

        /**
         * Returns the raw JSON value of [coveringDate].
         *
         * Unlike [coveringDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("covering_date")
        @ExcludeMissing
        fun _coveringDate(): JsonField<OffsetDateTime> = coveringDate

        /**
         * Returns the raw JSON value of [cursor].
         *
         * Unlike [cursor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cursor") @ExcludeMissing fun _cursor(): JsonField<String> = cursor

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
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .contractId()
             * .customerId()
             * .subscriptionId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var contractId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var subscriptionId: JsonField<String>? = null
            private var coveringDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cursor: JsonField<String> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var limit: JsonField<Long> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                contractId = body.contractId
                customerId = body.customerId
                subscriptionId = body.subscriptionId
                coveringDate = body.coveringDate
                cursor = body.cursor
                endingBefore = body.endingBefore
                limit = body.limit
                startingAt = body.startingAt
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * Sets [Builder.contractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun subscriptionId(subscriptionId: String) =
                subscriptionId(JsonField.of(subscriptionId))

            /**
             * Sets [Builder.subscriptionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                this.subscriptionId = subscriptionId
            }

            /**
             * Get the seats history segment for the covering date. Cannot be used with
             * `starting_at` or `ending_before`.
             */
            fun coveringDate(coveringDate: OffsetDateTime?) =
                coveringDate(JsonField.ofNullable(coveringDate))

            /** Alias for calling [Builder.coveringDate] with `coveringDate.orElse(null)`. */
            fun coveringDate(coveringDate: Optional<OffsetDateTime>) =
                coveringDate(coveringDate.getOrNull())

            /**
             * Sets [Builder.coveringDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.coveringDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun coveringDate(coveringDate: JsonField<OffsetDateTime>) = apply {
                this.coveringDate = coveringDate
            }

            /**
             * Cursor for pagination. Use the value from the `next_page` field of the previous
             * response to retrieve the next page of results.
             */
            fun cursor(cursor: String?) = cursor(JsonField.ofNullable(cursor))

            /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
            fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

            /**
             * Sets [Builder.cursor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cursor] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cursor(cursor: JsonField<String>) = apply { this.cursor = cursor }

            /**
             * Include seats history segments that are active at or before this timestamp. Use with
             * `starting_at` to get a specific time range. If not set, there's no upper bound.
             */
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

            /**
             * Maximum number of seat schedule entries to return. Defaults to 10. Required range: 1
             * <= x <= 10.
             */
            fun limit(limit: Long?) = limit(JsonField.ofNullable(limit))

            /**
             * Alias for [Builder.limit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun limit(limit: Long) = limit(limit as Long?)

            /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
            fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            /**
             * Include seats history segments that are active at or after this timestamp. Use with
             * `ending_before` to get a specific time range. If not set, there's no lower bound.
             */
            fun startingAt(startingAt: OffsetDateTime?) =
                startingAt(JsonField.ofNullable(startingAt))

            /** Alias for calling [Builder.startingAt] with `startingAt.orElse(null)`. */
            fun startingAt(startingAt: Optional<OffsetDateTime>) =
                startingAt(startingAt.getOrNull())

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .contractId()
             * .customerId()
             * .subscriptionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("contractId", contractId),
                    checkRequired("customerId", customerId),
                    checkRequired("subscriptionId", subscriptionId),
                    coveringDate,
                    cursor,
                    endingBefore,
                    limit,
                    startingAt,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            contractId()
            customerId()
            subscriptionId()
            coveringDate()
            cursor()
            endingBefore()
            limit()
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
            (if (contractId.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (subscriptionId.asKnown().isPresent) 1 else 0) +
                (if (coveringDate.asKnown().isPresent) 1 else 0) +
                (if (cursor.asKnown().isPresent) 1 else 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (if (limit.asKnown().isPresent) 1 else 0) +
                (if (startingAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                contractId == other.contractId &&
                customerId == other.customerId &&
                subscriptionId == other.subscriptionId &&
                coveringDate == other.coveringDate &&
                cursor == other.cursor &&
                endingBefore == other.endingBefore &&
                limit == other.limit &&
                startingAt == other.startingAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                contractId,
                customerId,
                subscriptionId,
                coveringDate,
                cursor,
                endingBefore,
                limit,
                startingAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{contractId=$contractId, customerId=$customerId, subscriptionId=$subscriptionId, coveringDate=$coveringDate, cursor=$cursor, endingBefore=$endingBefore, limit=$limit, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractGetSubscriptionSeatsHistoryParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ContractGetSubscriptionSeatsHistoryParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
