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

/**
 * Retrieve a comprehensive view of all available balances (commits and credits) for a customer.
 * This endpoint provides real-time visibility into prepaid funds, postpaid commitments, promotional
 * credits, and other balance types that can offset usage charges, helping you build transparent
 * billing experiences.
 *
 * ### Use this endpoint to:
 * - Display current available balances in customer dashboards
 * - Verify available funds before approving high-usage operations
 * - Generate balance reports for finance teams
 * - Filter balances by contract or date ranges
 *
 * ### Key response fields:
 * An array of balance objects (all credits and commits) containing:
 * - Balance details: Current available amount for each commit or credit
 * - Metadata: Product associations, priorities, applicable date ranges
 * - Optional ledger entries: Detailed transaction history (if `include_ledgers=true`)
 * - Balance calculations: Including pending transactions and future-dated entries
 * - Custom fields: Any additional metadata attached to balances
 *
 * ### Usage guidelines:
 * - Use the
 *   [getNetBalance](https://docs.metronome.com/api-reference/credits-and-commits/get-the-net-balance-of-a-customer)
 *   endpoint to retrieve a single combined current balance
 * - Date filtering: Use `effective_before` to include only balances with access before a specific
 *   date (exclusive)
 * - Set `include_balance=true` for calculated balance amounts on each commit or credit
 * - Set `include_ledgers=true` for full transaction history
 * - Set `include_contract_balances = true` to see contract level balances
 * - Balance logic: Reflects currently accessible amounts, excluding expired/future segments
 * - Manual adjustments: Includes all manual ledger entries, even future-dated ones
 */
class ContractListBalancesParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = body.id()

    /**
     * Return only balances that have access schedules that "cover" the provided date
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun coveringDate(): Optional<OffsetDateTime> = body.coveringDate()

    /**
     * Include only balances that have any access before the provided date (exclusive)
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectiveBefore(): Optional<OffsetDateTime> = body.effectiveBefore()

    /**
     * Exclude balances with zero amounts from the response.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludeZeroBalances(): Optional<Boolean> = body.excludeZeroBalances()

    /**
     * Include archived credits and credits from archived contracts.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeArchived(): Optional<Boolean> = body.includeArchived()

    /**
     * Include the balance of credits and commits in the response. Setting this flag may cause the
     * query to be slower.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeBalance(): Optional<Boolean> = body.includeBalance()

    /**
     * Include balances on the contract level.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeContractBalances(): Optional<Boolean> = body.includeContractBalances()

    /**
     * Include ledgers in the response. Setting this flag may cause the query to be slower.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeLedgers(): Optional<Boolean> = body.includeLedgers()

    /**
     * The maximum number of commits to return. Defaults to 25.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Long> = body.limit()

    /**
     * The next page token from a previous response.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextPage(): Optional<String> = body.nextPage()

    /**
     * Include only balances that have any access on or after the provided date
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startingAt(): Optional<OffsetDateTime> = body.startingAt()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [coveringDate].
     *
     * Unlike [coveringDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _coveringDate(): JsonField<OffsetDateTime> = body._coveringDate()

    /**
     * Returns the raw JSON value of [effectiveBefore].
     *
     * Unlike [effectiveBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _effectiveBefore(): JsonField<OffsetDateTime> = body._effectiveBefore()

    /**
     * Returns the raw JSON value of [excludeZeroBalances].
     *
     * Unlike [excludeZeroBalances], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _excludeZeroBalances(): JsonField<Boolean> = body._excludeZeroBalances()

    /**
     * Returns the raw JSON value of [includeArchived].
     *
     * Unlike [includeArchived], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _includeArchived(): JsonField<Boolean> = body._includeArchived()

    /**
     * Returns the raw JSON value of [includeBalance].
     *
     * Unlike [includeBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _includeBalance(): JsonField<Boolean> = body._includeBalance()

    /**
     * Returns the raw JSON value of [includeContractBalances].
     *
     * Unlike [includeContractBalances], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _includeContractBalances(): JsonField<Boolean> = body._includeContractBalances()

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
     * Returns the raw JSON value of [nextPage].
     *
     * Unlike [nextPage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _nextPage(): JsonField<String> = body._nextPage()

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
         * Returns a mutable builder for constructing an instance of [ContractListBalancesParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractListBalancesParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractListBalancesParams: ContractListBalancesParams) = apply {
            body = contractListBalancesParams.body.toBuilder()
            additionalHeaders = contractListBalancesParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractListBalancesParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [customerId]
         * - [id]
         * - [coveringDate]
         * - [effectiveBefore]
         * - [excludeZeroBalances]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        fun id(id: String) = apply { body.id(id) }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        /** Return only balances that have access schedules that "cover" the provided date */
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

        /** Include only balances that have any access before the provided date (exclusive) */
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

        /** Exclude balances with zero amounts from the response. */
        fun excludeZeroBalances(excludeZeroBalances: Boolean) = apply {
            body.excludeZeroBalances(excludeZeroBalances)
        }

        /**
         * Sets [Builder.excludeZeroBalances] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludeZeroBalances] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun excludeZeroBalances(excludeZeroBalances: JsonField<Boolean>) = apply {
            body.excludeZeroBalances(excludeZeroBalances)
        }

        /** Include archived credits and credits from archived contracts. */
        fun includeArchived(includeArchived: Boolean) = apply {
            body.includeArchived(includeArchived)
        }

        /**
         * Sets [Builder.includeArchived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeArchived] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeArchived(includeArchived: JsonField<Boolean>) = apply {
            body.includeArchived(includeArchived)
        }

        /**
         * Include the balance of credits and commits in the response. Setting this flag may cause
         * the query to be slower.
         */
        fun includeBalance(includeBalance: Boolean) = apply { body.includeBalance(includeBalance) }

        /**
         * Sets [Builder.includeBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeBalance] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeBalance(includeBalance: JsonField<Boolean>) = apply {
            body.includeBalance(includeBalance)
        }

        /** Include balances on the contract level. */
        fun includeContractBalances(includeContractBalances: Boolean) = apply {
            body.includeContractBalances(includeContractBalances)
        }

        /**
         * Sets [Builder.includeContractBalances] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeContractBalances] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun includeContractBalances(includeContractBalances: JsonField<Boolean>) = apply {
            body.includeContractBalances(includeContractBalances)
        }

        /** Include ledgers in the response. Setting this flag may cause the query to be slower. */
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

        /** The maximum number of commits to return. Defaults to 25. */
        fun limit(limit: Long) = apply { body.limit(limit) }

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { body.limit(limit) }

        /** The next page token from a previous response. */
        fun nextPage(nextPage: String) = apply { body.nextPage(nextPage) }

        /**
         * Sets [Builder.nextPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextPage] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nextPage(nextPage: JsonField<String>) = apply { body.nextPage(nextPage) }

        /** Include only balances that have any access on or after the provided date */
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
         * Returns an immutable instance of [ContractListBalancesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContractListBalancesParams =
            ContractListBalancesParams(
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
        private val customerId: JsonField<String>,
        private val id: JsonField<String>,
        private val coveringDate: JsonField<OffsetDateTime>,
        private val effectiveBefore: JsonField<OffsetDateTime>,
        private val excludeZeroBalances: JsonField<Boolean>,
        private val includeArchived: JsonField<Boolean>,
        private val includeBalance: JsonField<Boolean>,
        private val includeContractBalances: JsonField<Boolean>,
        private val includeLedgers: JsonField<Boolean>,
        private val limit: JsonField<Long>,
        private val nextPage: JsonField<String>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("covering_date")
            @ExcludeMissing
            coveringDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("effective_before")
            @ExcludeMissing
            effectiveBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("exclude_zero_balances")
            @ExcludeMissing
            excludeZeroBalances: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("include_archived")
            @ExcludeMissing
            includeArchived: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("include_balance")
            @ExcludeMissing
            includeBalance: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("include_contract_balances")
            @ExcludeMissing
            includeContractBalances: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("include_ledgers")
            @ExcludeMissing
            includeLedgers: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("next_page")
            @ExcludeMissing
            nextPage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            customerId,
            id,
            coveringDate,
            effectiveBefore,
            excludeZeroBalances,
            includeArchived,
            includeBalance,
            includeContractBalances,
            includeLedgers,
            limit,
            nextPage,
            startingAt,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Return only balances that have access schedules that "cover" the provided date
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun coveringDate(): Optional<OffsetDateTime> = coveringDate.getOptional("covering_date")

        /**
         * Include only balances that have any access before the provided date (exclusive)
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun effectiveBefore(): Optional<OffsetDateTime> =
            effectiveBefore.getOptional("effective_before")

        /**
         * Exclude balances with zero amounts from the response.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun excludeZeroBalances(): Optional<Boolean> =
            excludeZeroBalances.getOptional("exclude_zero_balances")

        /**
         * Include archived credits and credits from archived contracts.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun includeArchived(): Optional<Boolean> = includeArchived.getOptional("include_archived")

        /**
         * Include the balance of credits and commits in the response. Setting this flag may cause
         * the query to be slower.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun includeBalance(): Optional<Boolean> = includeBalance.getOptional("include_balance")

        /**
         * Include balances on the contract level.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun includeContractBalances(): Optional<Boolean> =
            includeContractBalances.getOptional("include_contract_balances")

        /**
         * Include ledgers in the response. Setting this flag may cause the query to be slower.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun includeLedgers(): Optional<Boolean> = includeLedgers.getOptional("include_ledgers")

        /**
         * The maximum number of commits to return. Defaults to 25.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
         * The next page token from a previous response.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun nextPage(): Optional<String> = nextPage.getOptional("next_page")

        /**
         * Include only balances that have any access on or after the provided date
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startingAt(): Optional<OffsetDateTime> = startingAt.getOptional("starting_at")

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
         * Returns the raw JSON value of [effectiveBefore].
         *
         * Unlike [effectiveBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_before")
        @ExcludeMissing
        fun _effectiveBefore(): JsonField<OffsetDateTime> = effectiveBefore

        /**
         * Returns the raw JSON value of [excludeZeroBalances].
         *
         * Unlike [excludeZeroBalances], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("exclude_zero_balances")
        @ExcludeMissing
        fun _excludeZeroBalances(): JsonField<Boolean> = excludeZeroBalances

        /**
         * Returns the raw JSON value of [includeArchived].
         *
         * Unlike [includeArchived], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("include_archived")
        @ExcludeMissing
        fun _includeArchived(): JsonField<Boolean> = includeArchived

        /**
         * Returns the raw JSON value of [includeBalance].
         *
         * Unlike [includeBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("include_balance")
        @ExcludeMissing
        fun _includeBalance(): JsonField<Boolean> = includeBalance

        /**
         * Returns the raw JSON value of [includeContractBalances].
         *
         * Unlike [includeContractBalances], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("include_contract_balances")
        @ExcludeMissing
        fun _includeContractBalances(): JsonField<Boolean> = includeContractBalances

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
         * Returns the raw JSON value of [nextPage].
         *
         * Unlike [nextPage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("next_page") @ExcludeMissing fun _nextPage(): JsonField<String> = nextPage

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
             * .customerId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var coveringDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var effectiveBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var excludeZeroBalances: JsonField<Boolean> = JsonMissing.of()
            private var includeArchived: JsonField<Boolean> = JsonMissing.of()
            private var includeBalance: JsonField<Boolean> = JsonMissing.of()
            private var includeContractBalances: JsonField<Boolean> = JsonMissing.of()
            private var includeLedgers: JsonField<Boolean> = JsonMissing.of()
            private var limit: JsonField<Long> = JsonMissing.of()
            private var nextPage: JsonField<String> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                customerId = body.customerId
                id = body.id
                coveringDate = body.coveringDate
                effectiveBefore = body.effectiveBefore
                excludeZeroBalances = body.excludeZeroBalances
                includeArchived = body.includeArchived
                includeBalance = body.includeBalance
                includeContractBalances = body.includeContractBalances
                includeLedgers = body.includeLedgers
                limit = body.limit
                nextPage = body.nextPage
                startingAt = body.startingAt
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Return only balances that have access schedules that "cover" the provided date */
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

            /** Include only balances that have any access before the provided date (exclusive) */
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

            /** Exclude balances with zero amounts from the response. */
            fun excludeZeroBalances(excludeZeroBalances: Boolean) =
                excludeZeroBalances(JsonField.of(excludeZeroBalances))

            /**
             * Sets [Builder.excludeZeroBalances] to an arbitrary JSON value.
             *
             * You should usually call [Builder.excludeZeroBalances] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun excludeZeroBalances(excludeZeroBalances: JsonField<Boolean>) = apply {
                this.excludeZeroBalances = excludeZeroBalances
            }

            /** Include archived credits and credits from archived contracts. */
            fun includeArchived(includeArchived: Boolean) =
                includeArchived(JsonField.of(includeArchived))

            /**
             * Sets [Builder.includeArchived] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeArchived] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun includeArchived(includeArchived: JsonField<Boolean>) = apply {
                this.includeArchived = includeArchived
            }

            /**
             * Include the balance of credits and commits in the response. Setting this flag may
             * cause the query to be slower.
             */
            fun includeBalance(includeBalance: Boolean) =
                includeBalance(JsonField.of(includeBalance))

            /**
             * Sets [Builder.includeBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeBalance] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun includeBalance(includeBalance: JsonField<Boolean>) = apply {
                this.includeBalance = includeBalance
            }

            /** Include balances on the contract level. */
            fun includeContractBalances(includeContractBalances: Boolean) =
                includeContractBalances(JsonField.of(includeContractBalances))

            /**
             * Sets [Builder.includeContractBalances] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeContractBalances] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun includeContractBalances(includeContractBalances: JsonField<Boolean>) = apply {
                this.includeContractBalances = includeContractBalances
            }

            /**
             * Include ledgers in the response. Setting this flag may cause the query to be slower.
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

            /** The maximum number of commits to return. Defaults to 25. */
            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            /** The next page token from a previous response. */
            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            /**
             * Sets [Builder.nextPage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextPage] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            /** Include only balances that have any access on or after the provided date */
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .customerId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("customerId", customerId),
                    id,
                    coveringDate,
                    effectiveBefore,
                    excludeZeroBalances,
                    includeArchived,
                    includeBalance,
                    includeContractBalances,
                    includeLedgers,
                    limit,
                    nextPage,
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

            customerId()
            id()
            coveringDate()
            effectiveBefore()
            excludeZeroBalances()
            includeArchived()
            includeBalance()
            includeContractBalances()
            includeLedgers()
            limit()
            nextPage()
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
            (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (coveringDate.asKnown().isPresent) 1 else 0) +
                (if (effectiveBefore.asKnown().isPresent) 1 else 0) +
                (if (excludeZeroBalances.asKnown().isPresent) 1 else 0) +
                (if (includeArchived.asKnown().isPresent) 1 else 0) +
                (if (includeBalance.asKnown().isPresent) 1 else 0) +
                (if (includeContractBalances.asKnown().isPresent) 1 else 0) +
                (if (includeLedgers.asKnown().isPresent) 1 else 0) +
                (if (limit.asKnown().isPresent) 1 else 0) +
                (if (nextPage.asKnown().isPresent) 1 else 0) +
                (if (startingAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                customerId == other.customerId &&
                id == other.id &&
                coveringDate == other.coveringDate &&
                effectiveBefore == other.effectiveBefore &&
                excludeZeroBalances == other.excludeZeroBalances &&
                includeArchived == other.includeArchived &&
                includeBalance == other.includeBalance &&
                includeContractBalances == other.includeContractBalances &&
                includeLedgers == other.includeLedgers &&
                limit == other.limit &&
                nextPage == other.nextPage &&
                startingAt == other.startingAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                customerId,
                id,
                coveringDate,
                effectiveBefore,
                excludeZeroBalances,
                includeArchived,
                includeBalance,
                includeContractBalances,
                includeLedgers,
                limit,
                nextPage,
                startingAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customerId=$customerId, id=$id, coveringDate=$coveringDate, effectiveBefore=$effectiveBefore, excludeZeroBalances=$excludeZeroBalances, includeArchived=$includeArchived, includeBalance=$includeBalance, includeContractBalances=$includeContractBalances, includeLedgers=$includeLedgers, limit=$limit, nextPage=$nextPage, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractListBalancesParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ContractListBalancesParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
