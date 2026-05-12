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
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve detailed balance for seat-based credits and commits from the contract's subscriptions,
 * broken down by individual seats.
 *
 * ### Use this endpoint to:
 * - Display per-seat balance information in customer dashboards
 * - Filter balance data by subscription or specific seats
 *
 * ### Key response fields:
 * An array of seat balance objects containing:
 * - Seat id
 * - Balance: current total balance across all commits and credits
 *
 * ### Usage guidelines:
 * - Date filtering: use `covering_date` OR `starting_at`/`ending_before` to filter balance data by
 *   time range
 * - Set `include_credits_and_commits=true` for detailed commits and credits breakdown per seat
 * - Set `include_ledgers=true` for detailed transaction history per commit/credit per seat
 */
class ContractListSeatBalancesParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The contract ID to retrieve seat balances for
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contractId(): String = body.contractId()

    /**
     * The customer ID to retrieve seat balances for
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * Include only commits or credits with access that cover this specific date (cannot be used
     * with starting_at or ending_before).
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun coveringDate(): Optional<OffsetDateTime> = body.coveringDate()

    /**
     * Page token from a previous response to retrieve the next page
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cursor(): Optional<String> = body.cursor()

    /**
     * Include only commits or credits with access effective on or before this date (cannot be used
     * with covering_date).
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectiveBefore(): Optional<OffsetDateTime> = body.effectiveBefore()

    /**
     * Include credits and commits in the response
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeCreditsAndCommits(): Optional<Boolean> = body.includeCreditsAndCommits()

    /**
     * Include ledger entries for each commit and commit. `include_credits_and_commits` must be set
     * to `true` for `include_ledgers=true` to apply.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeLedgers(): Optional<Boolean> = body.includeLedgers()

    /**
     * Maximum number of seats to return. Range: 1-100. Default: 25. When
     * `include_credits_and_commits = true`, if the total commits/credits across all seats exceeds
     * 100, a limit of 100 applies to the total credits and commits. Seats are included greedily to
     * maximize the number of seats returned. Example: if seat 1 has 98 commits and seat 2 has 10
     * commits, both seats will be returned (total: 108 commits). Each returned seat includes all of
     * its associated credits and commits.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Long> = body.limit()

    /**
     * Optional filter to only include specific seats
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun seatIds(): Optional<List<String>> = body.seatIds()

    /**
     * Include only commits or credits with access effective on or after this date (cannot be used
     * with covering_date).
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startingAt(): Optional<OffsetDateTime> = body.startingAt()

    /**
     * Optional filter to only include seats from specific subscriptions. If subscriptions ids are
     * not mapped to SEAT_BASED subscriptions, error will be returned.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionIds(): Optional<List<String>> = body.subscriptionIds()

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
     * Returns the raw JSON value of [effectiveBefore].
     *
     * Unlike [effectiveBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _effectiveBefore(): JsonField<OffsetDateTime> = body._effectiveBefore()

    /**
     * Returns the raw JSON value of [includeCreditsAndCommits].
     *
     * Unlike [includeCreditsAndCommits], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _includeCreditsAndCommits(): JsonField<Boolean> = body._includeCreditsAndCommits()

    /**
     * Returns the raw JSON value of [includeLedgers].
     *
     * Unlike [includeLedgers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _includeLedgers(): JsonField<Boolean> = body._includeLedgers()

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limit(): JsonField<Long> = body._limit()

    /**
     * Returns the raw JSON value of [seatIds].
     *
     * Unlike [seatIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _seatIds(): JsonField<List<String>> = body._seatIds()

    /**
     * Returns the raw JSON value of [startingAt].
     *
     * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startingAt(): JsonField<OffsetDateTime> = body._startingAt()

    /**
     * Returns the raw JSON value of [subscriptionIds].
     *
     * Unlike [subscriptionIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subscriptionIds(): JsonField<List<String>> = body._subscriptionIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ContractListSeatBalancesParams].
         *
         * The following fields are required:
         * ```java
         * .contractId()
         * .customerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractListSeatBalancesParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractListSeatBalancesParams: ContractListSeatBalancesParams) = apply {
            body = contractListSeatBalancesParams.body.toBuilder()
            additionalHeaders = contractListSeatBalancesParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractListSeatBalancesParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [contractId]
         * - [customerId]
         * - [coveringDate]
         * - [cursor]
         * - [effectiveBefore]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The contract ID to retrieve seat balances for */
        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        /** The customer ID to retrieve seat balances for */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * Include only commits or credits with access that cover this specific date (cannot be used
         * with starting_at or ending_before).
         */
        fun coveringDate(coveringDate: OffsetDateTime) = apply { body.coveringDate(coveringDate) }

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

        /** Page token from a previous response to retrieve the next page */
        fun cursor(cursor: String) = apply { body.cursor(cursor) }

        /**
         * Sets [Builder.cursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cursor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cursor(cursor: JsonField<String>) = apply { body.cursor(cursor) }

        /**
         * Include only commits or credits with access effective on or before this date (cannot be
         * used with covering_date).
         */
        fun effectiveBefore(effectiveBefore: OffsetDateTime) = apply {
            body.effectiveBefore(effectiveBefore)
        }

        /**
         * Sets [Builder.effectiveBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveBefore] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun effectiveBefore(effectiveBefore: JsonField<OffsetDateTime>) = apply {
            body.effectiveBefore(effectiveBefore)
        }

        /** Include credits and commits in the response */
        fun includeCreditsAndCommits(includeCreditsAndCommits: Boolean) = apply {
            body.includeCreditsAndCommits(includeCreditsAndCommits)
        }

        /**
         * Sets [Builder.includeCreditsAndCommits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeCreditsAndCommits] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun includeCreditsAndCommits(includeCreditsAndCommits: JsonField<Boolean>) = apply {
            body.includeCreditsAndCommits(includeCreditsAndCommits)
        }

        /**
         * Include ledger entries for each commit and commit. `include_credits_and_commits` must be
         * set to `true` for `include_ledgers=true` to apply.
         */
        fun includeLedgers(includeLedgers: Boolean) = apply { body.includeLedgers(includeLedgers) }

        /**
         * Sets [Builder.includeLedgers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeLedgers] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeLedgers(includeLedgers: JsonField<Boolean>) = apply {
            body.includeLedgers(includeLedgers)
        }

        /**
         * Maximum number of seats to return. Range: 1-100. Default: 25. When
         * `include_credits_and_commits = true`, if the total commits/credits across all seats
         * exceeds 100, a limit of 100 applies to the total credits and commits. Seats are included
         * greedily to maximize the number of seats returned. Example: if seat 1 has 98 commits and
         * seat 2 has 10 commits, both seats will be returned (total: 108 commits). Each returned
         * seat includes all of its associated credits and commits.
         */
        fun limit(limit: Long) = apply { body.limit(limit) }

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { body.limit(limit) }

        /** Optional filter to only include specific seats */
        fun seatIds(seatIds: List<String>) = apply { body.seatIds(seatIds) }

        /**
         * Sets [Builder.seatIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seatIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun seatIds(seatIds: JsonField<List<String>>) = apply { body.seatIds(seatIds) }

        /**
         * Adds a single [String] to [seatIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeatId(seatId: String) = apply { body.addSeatId(seatId) }

        /**
         * Include only commits or credits with access effective on or after this date (cannot be
         * used with covering_date).
         */
        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

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

        /**
         * Optional filter to only include seats from specific subscriptions. If subscriptions ids
         * are not mapped to SEAT_BASED subscriptions, error will be returned.
         */
        fun subscriptionIds(subscriptionIds: List<String>) = apply {
            body.subscriptionIds(subscriptionIds)
        }

        /**
         * Sets [Builder.subscriptionIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionIds(subscriptionIds: JsonField<List<String>>) = apply {
            body.subscriptionIds(subscriptionIds)
        }

        /**
         * Adds a single [String] to [subscriptionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubscriptionId(subscriptionId: String) = apply {
            body.addSubscriptionId(subscriptionId)
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
         * Returns an immutable instance of [ContractListSeatBalancesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contractId()
         * .customerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContractListSeatBalancesParams =
            ContractListSeatBalancesParams(
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
        private val coveringDate: JsonField<OffsetDateTime>,
        private val cursor: JsonField<String>,
        private val effectiveBefore: JsonField<OffsetDateTime>,
        private val includeCreditsAndCommits: JsonField<Boolean>,
        private val includeLedgers: JsonField<Boolean>,
        private val limit: JsonField<Long>,
        private val seatIds: JsonField<List<String>>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val subscriptionIds: JsonField<List<String>>,
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
            @JsonProperty("covering_date")
            @ExcludeMissing
            coveringDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("effective_before")
            @ExcludeMissing
            effectiveBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("include_credits_and_commits")
            @ExcludeMissing
            includeCreditsAndCommits: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("include_ledgers")
            @ExcludeMissing
            includeLedgers: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("seat_ids")
            @ExcludeMissing
            seatIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("subscription_ids")
            @ExcludeMissing
            subscriptionIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            contractId,
            customerId,
            coveringDate,
            cursor,
            effectiveBefore,
            includeCreditsAndCommits,
            includeLedgers,
            limit,
            seatIds,
            startingAt,
            subscriptionIds,
            mutableMapOf(),
        )

        /**
         * The contract ID to retrieve seat balances for
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contractId(): String = contractId.getRequired("contract_id")

        /**
         * The customer ID to retrieve seat balances for
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * Include only commits or credits with access that cover this specific date (cannot be used
         * with starting_at or ending_before).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun coveringDate(): Optional<OffsetDateTime> = coveringDate.getOptional("covering_date")

        /**
         * Page token from a previous response to retrieve the next page
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cursor(): Optional<String> = cursor.getOptional("cursor")

        /**
         * Include only commits or credits with access effective on or before this date (cannot be
         * used with covering_date).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun effectiveBefore(): Optional<OffsetDateTime> =
            effectiveBefore.getOptional("effective_before")

        /**
         * Include credits and commits in the response
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun includeCreditsAndCommits(): Optional<Boolean> =
            includeCreditsAndCommits.getOptional("include_credits_and_commits")

        /**
         * Include ledger entries for each commit and commit. `include_credits_and_commits` must be
         * set to `true` for `include_ledgers=true` to apply.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun includeLedgers(): Optional<Boolean> = includeLedgers.getOptional("include_ledgers")

        /**
         * Maximum number of seats to return. Range: 1-100. Default: 25. When
         * `include_credits_and_commits = true`, if the total commits/credits across all seats
         * exceeds 100, a limit of 100 applies to the total credits and commits. Seats are included
         * greedily to maximize the number of seats returned. Example: if seat 1 has 98 commits and
         * seat 2 has 10 commits, both seats will be returned (total: 108 commits). Each returned
         * seat includes all of its associated credits and commits.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
         * Optional filter to only include specific seats
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun seatIds(): Optional<List<String>> = seatIds.getOptional("seat_ids")

        /**
         * Include only commits or credits with access effective on or after this date (cannot be
         * used with covering_date).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startingAt(): Optional<OffsetDateTime> = startingAt.getOptional("starting_at")

        /**
         * Optional filter to only include seats from specific subscriptions. If subscriptions ids
         * are not mapped to SEAT_BASED subscriptions, error will be returned.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun subscriptionIds(): Optional<List<String>> =
            subscriptionIds.getOptional("subscription_ids")

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
         * Returns the raw JSON value of [effectiveBefore].
         *
         * Unlike [effectiveBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_before")
        @ExcludeMissing
        fun _effectiveBefore(): JsonField<OffsetDateTime> = effectiveBefore

        /**
         * Returns the raw JSON value of [includeCreditsAndCommits].
         *
         * Unlike [includeCreditsAndCommits], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("include_credits_and_commits")
        @ExcludeMissing
        fun _includeCreditsAndCommits(): JsonField<Boolean> = includeCreditsAndCommits

        /**
         * Returns the raw JSON value of [includeLedgers].
         *
         * Unlike [includeLedgers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("include_ledgers")
        @ExcludeMissing
        fun _includeLedgers(): JsonField<Boolean> = includeLedgers

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

        /**
         * Returns the raw JSON value of [seatIds].
         *
         * Unlike [seatIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("seat_ids") @ExcludeMissing fun _seatIds(): JsonField<List<String>> = seatIds

        /**
         * Returns the raw JSON value of [startingAt].
         *
         * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /**
         * Returns the raw JSON value of [subscriptionIds].
         *
         * Unlike [subscriptionIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription_ids")
        @ExcludeMissing
        fun _subscriptionIds(): JsonField<List<String>> = subscriptionIds

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
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var contractId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var coveringDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cursor: JsonField<String> = JsonMissing.of()
            private var effectiveBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var includeCreditsAndCommits: JsonField<Boolean> = JsonMissing.of()
            private var includeLedgers: JsonField<Boolean> = JsonMissing.of()
            private var limit: JsonField<Long> = JsonMissing.of()
            private var seatIds: JsonField<MutableList<String>>? = null
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var subscriptionIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                contractId = body.contractId
                customerId = body.customerId
                coveringDate = body.coveringDate
                cursor = body.cursor
                effectiveBefore = body.effectiveBefore
                includeCreditsAndCommits = body.includeCreditsAndCommits
                includeLedgers = body.includeLedgers
                limit = body.limit
                seatIds = body.seatIds.map { it.toMutableList() }
                startingAt = body.startingAt
                subscriptionIds = body.subscriptionIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The contract ID to retrieve seat balances for */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * Sets [Builder.contractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            /** The customer ID to retrieve seat balances for */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * Include only commits or credits with access that cover this specific date (cannot be
             * used with starting_at or ending_before).
             */
            fun coveringDate(coveringDate: OffsetDateTime) =
                coveringDate(JsonField.of(coveringDate))

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

            /** Page token from a previous response to retrieve the next page */
            fun cursor(cursor: String) = cursor(JsonField.of(cursor))

            /**
             * Sets [Builder.cursor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cursor] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cursor(cursor: JsonField<String>) = apply { this.cursor = cursor }

            /**
             * Include only commits or credits with access effective on or before this date (cannot
             * be used with covering_date).
             */
            fun effectiveBefore(effectiveBefore: OffsetDateTime) =
                effectiveBefore(JsonField.of(effectiveBefore))

            /**
             * Sets [Builder.effectiveBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveBefore] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun effectiveBefore(effectiveBefore: JsonField<OffsetDateTime>) = apply {
                this.effectiveBefore = effectiveBefore
            }

            /** Include credits and commits in the response */
            fun includeCreditsAndCommits(includeCreditsAndCommits: Boolean) =
                includeCreditsAndCommits(JsonField.of(includeCreditsAndCommits))

            /**
             * Sets [Builder.includeCreditsAndCommits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeCreditsAndCommits] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun includeCreditsAndCommits(includeCreditsAndCommits: JsonField<Boolean>) = apply {
                this.includeCreditsAndCommits = includeCreditsAndCommits
            }

            /**
             * Include ledger entries for each commit and commit. `include_credits_and_commits` must
             * be set to `true` for `include_ledgers=true` to apply.
             */
            fun includeLedgers(includeLedgers: Boolean) =
                includeLedgers(JsonField.of(includeLedgers))

            /**
             * Sets [Builder.includeLedgers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeLedgers] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun includeLedgers(includeLedgers: JsonField<Boolean>) = apply {
                this.includeLedgers = includeLedgers
            }

            /**
             * Maximum number of seats to return. Range: 1-100. Default: 25. When
             * `include_credits_and_commits = true`, if the total commits/credits across all seats
             * exceeds 100, a limit of 100 applies to the total credits and commits. Seats are
             * included greedily to maximize the number of seats returned. Example: if seat 1 has 98
             * commits and seat 2 has 10 commits, both seats will be returned (total: 108 commits).
             * Each returned seat includes all of its associated credits and commits.
             */
            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            /** Optional filter to only include specific seats */
            fun seatIds(seatIds: List<String>) = seatIds(JsonField.of(seatIds))

            /**
             * Sets [Builder.seatIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seatIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun seatIds(seatIds: JsonField<List<String>>) = apply {
                this.seatIds = seatIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [seatIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSeatId(seatId: String) = apply {
                seatIds =
                    (seatIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("seatIds", it).add(seatId)
                    }
            }

            /**
             * Include only commits or credits with access effective on or after this date (cannot
             * be used with covering_date).
             */
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

            /**
             * Optional filter to only include seats from specific subscriptions. If subscriptions
             * ids are not mapped to SEAT_BASED subscriptions, error will be returned.
             */
            fun subscriptionIds(subscriptionIds: List<String>) =
                subscriptionIds(JsonField.of(subscriptionIds))

            /**
             * Sets [Builder.subscriptionIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subscriptionIds(subscriptionIds: JsonField<List<String>>) = apply {
                this.subscriptionIds = subscriptionIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [subscriptionIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSubscriptionId(subscriptionId: String) = apply {
                subscriptionIds =
                    (subscriptionIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("subscriptionIds", it).add(subscriptionId)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .contractId()
             * .customerId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("contractId", contractId),
                    checkRequired("customerId", customerId),
                    coveringDate,
                    cursor,
                    effectiveBefore,
                    includeCreditsAndCommits,
                    includeLedgers,
                    limit,
                    (seatIds ?: JsonMissing.of()).map { it.toImmutable() },
                    startingAt,
                    (subscriptionIds ?: JsonMissing.of()).map { it.toImmutable() },
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
            coveringDate()
            cursor()
            effectiveBefore()
            includeCreditsAndCommits()
            includeLedgers()
            limit()
            seatIds()
            startingAt()
            subscriptionIds()
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
                (if (coveringDate.asKnown().isPresent) 1 else 0) +
                (if (cursor.asKnown().isPresent) 1 else 0) +
                (if (effectiveBefore.asKnown().isPresent) 1 else 0) +
                (if (includeCreditsAndCommits.asKnown().isPresent) 1 else 0) +
                (if (includeLedgers.asKnown().isPresent) 1 else 0) +
                (if (limit.asKnown().isPresent) 1 else 0) +
                (seatIds.asKnown().getOrNull()?.size ?: 0) +
                (if (startingAt.asKnown().isPresent) 1 else 0) +
                (subscriptionIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                contractId == other.contractId &&
                customerId == other.customerId &&
                coveringDate == other.coveringDate &&
                cursor == other.cursor &&
                effectiveBefore == other.effectiveBefore &&
                includeCreditsAndCommits == other.includeCreditsAndCommits &&
                includeLedgers == other.includeLedgers &&
                limit == other.limit &&
                seatIds == other.seatIds &&
                startingAt == other.startingAt &&
                subscriptionIds == other.subscriptionIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                contractId,
                customerId,
                coveringDate,
                cursor,
                effectiveBefore,
                includeCreditsAndCommits,
                includeLedgers,
                limit,
                seatIds,
                startingAt,
                subscriptionIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{contractId=$contractId, customerId=$customerId, coveringDate=$coveringDate, cursor=$cursor, effectiveBefore=$effectiveBefore, includeCreditsAndCommits=$includeCreditsAndCommits, includeLedgers=$includeLedgers, limit=$limit, seatIds=$seatIds, startingAt=$startingAt, subscriptionIds=$subscriptionIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractListSeatBalancesParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ContractListSeatBalancesParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
