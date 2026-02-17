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
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Retrieve a detailed list of all credits available to a customer, including promotional credits
 * and contract-specific credits. This endpoint provides comprehensive visibility into credit
 * balances, access schedules, and usage rules, enabling you to build credit management interfaces
 * and track available funding.
 *
 * ### Use this endpoint to:
 * - Display all available credits in customer billing dashboards
 * - Show credit balances and expiration dates
 * - Track credit usage history with optional ledger details
 * - Build credit management and reporting tools
 * - Monitor promotional credit utilization • Support customer inquiries about available credits
 *
 * ### Key response fields:
 *
 * An array of Credit objects containing:
 * - Credit details: Name, priority, and which applicable products/tags it applies to
 * - Product ID: The `product_id` of the credit. This is for external mapping into your
 *   quote-to-cash stack, not the product it applies to.
 * - Access schedule: When credits become available and expire
 * - Optional ledger entries: Transaction history (if `include_ledgers=true`)
 * - Balance information: Current available amount (if `include_balance=true`)
 * - Metadata: Custom fields and usage specifiers
 *
 * ### Usage guidelines:
 * - Pagination: Results limited to 25 commits per page; use next_page for more
 * - Date filtering options:
 *     - `covering_date`: Credits active on a specific date
 *     - `starting_at`: Credits with access on/after a date
 *     - `effective_before`: Credits with access before a date (exclusive)
 * - Scope options:
 *     - `include_contract_credits`: Include contract-level credits (not just customer-level)
 *     - `include_archived`: Include archived credits and credits from archived contracts
 * - Performance considerations:
 *     - `include_ledgers`: Adds detailed transaction history (slower)
 *     - `include_balance`: Adds current balance calculation (slower)
 * - Optional filtering: Use credit_id to retrieve a specific commit
 */
class V1CustomerCreditListParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = body.customerId()

    /** Return only credits that have access schedules that "cover" the provided date */
    fun coveringDate(): Optional<OffsetDateTime> = body.coveringDate()

    fun creditId(): Optional<String> = body.creditId()

    /** Include only credits that have any access before the provided date (exclusive) */
    fun effectiveBefore(): Optional<OffsetDateTime> = body.effectiveBefore()

    /** Include archived credits and credits from archived contracts. */
    fun includeArchived(): Optional<Boolean> = body.includeArchived()

    /** Include the balance in the response. Setting this flag may cause the query to be slower. */
    fun includeBalance(): Optional<Boolean> = body.includeBalance()

    /** Include credits on the contract level. */
    fun includeContractCredits(): Optional<Boolean> = body.includeContractCredits()

    /**
     * Include credit ledgers in the response. Setting this flag may cause the query to be slower.
     */
    fun includeLedgers(): Optional<Boolean> = body.includeLedgers()

    /** The maximum number of commits to return. Defaults to 25. */
    fun limit(): Optional<Long> = body.limit()

    /** The next page token from a previous response. */
    fun nextPage(): Optional<String> = body.nextPage()

    /** Include only credits that have any access on or after the provided date */
    fun startingAt(): Optional<OffsetDateTime> = body.startingAt()

    fun _customerId(): JsonField<String> = body._customerId()

    /** Return only credits that have access schedules that "cover" the provided date */
    fun _coveringDate(): JsonField<OffsetDateTime> = body._coveringDate()

    fun _creditId(): JsonField<String> = body._creditId()

    /** Include only credits that have any access before the provided date (exclusive) */
    fun _effectiveBefore(): JsonField<OffsetDateTime> = body._effectiveBefore()

    /** Include archived credits and credits from archived contracts. */
    fun _includeArchived(): JsonField<Boolean> = body._includeArchived()

    /** Include the balance in the response. Setting this flag may cause the query to be slower. */
    fun _includeBalance(): JsonField<Boolean> = body._includeBalance()

    /** Include credits on the contract level. */
    fun _includeContractCredits(): JsonField<Boolean> = body._includeContractCredits()

    /**
     * Include credit ledgers in the response. Setting this flag may cause the query to be slower.
     */
    fun _includeLedgers(): JsonField<Boolean> = body._includeLedgers()

    /** The maximum number of commits to return. Defaults to 25. */
    fun _limit(): JsonField<Long> = body._limit()

    /** The next page token from a previous response. */
    fun _nextPage(): JsonField<String> = body._nextPage()

    /** Include only credits that have any access on or after the provided date */
    fun _startingAt(): JsonField<OffsetDateTime> = body._startingAt()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("covering_date")
        @ExcludeMissing
        private val coveringDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_id")
        @ExcludeMissing
        private val creditId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_before")
        @ExcludeMissing
        private val effectiveBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("include_archived")
        @ExcludeMissing
        private val includeArchived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("include_balance")
        @ExcludeMissing
        private val includeBalance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("include_contract_credits")
        @ExcludeMissing
        private val includeContractCredits: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("include_ledgers")
        @ExcludeMissing
        private val includeLedgers: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("limit")
        @ExcludeMissing
        private val limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("next_page")
        @ExcludeMissing
        private val nextPage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun customerId(): String = customerId.getRequired("customer_id")

        /** Return only credits that have access schedules that "cover" the provided date */
        fun coveringDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(coveringDate.getNullable("covering_date"))

        fun creditId(): Optional<String> = Optional.ofNullable(creditId.getNullable("credit_id"))

        /** Include only credits that have any access before the provided date (exclusive) */
        fun effectiveBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(effectiveBefore.getNullable("effective_before"))

        /** Include archived credits and credits from archived contracts. */
        fun includeArchived(): Optional<Boolean> =
            Optional.ofNullable(includeArchived.getNullable("include_archived"))

        /**
         * Include the balance in the response. Setting this flag may cause the query to be slower.
         */
        fun includeBalance(): Optional<Boolean> =
            Optional.ofNullable(includeBalance.getNullable("include_balance"))

        /** Include credits on the contract level. */
        fun includeContractCredits(): Optional<Boolean> =
            Optional.ofNullable(includeContractCredits.getNullable("include_contract_credits"))

        /**
         * Include credit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        fun includeLedgers(): Optional<Boolean> =
            Optional.ofNullable(includeLedgers.getNullable("include_ledgers"))

        /** The maximum number of commits to return. Defaults to 25. */
        fun limit(): Optional<Long> = Optional.ofNullable(limit.getNullable("limit"))

        /** The next page token from a previous response. */
        fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

        /** Include only credits that have any access on or after the provided date */
        fun startingAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(startingAt.getNullable("starting_at"))

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** Return only credits that have access schedules that "cover" the provided date */
        @JsonProperty("covering_date")
        @ExcludeMissing
        fun _coveringDate(): JsonField<OffsetDateTime> = coveringDate

        @JsonProperty("credit_id") @ExcludeMissing fun _creditId(): JsonField<String> = creditId

        /** Include only credits that have any access before the provided date (exclusive) */
        @JsonProperty("effective_before")
        @ExcludeMissing
        fun _effectiveBefore(): JsonField<OffsetDateTime> = effectiveBefore

        /** Include archived credits and credits from archived contracts. */
        @JsonProperty("include_archived")
        @ExcludeMissing
        fun _includeArchived(): JsonField<Boolean> = includeArchived

        /**
         * Include the balance in the response. Setting this flag may cause the query to be slower.
         */
        @JsonProperty("include_balance")
        @ExcludeMissing
        fun _includeBalance(): JsonField<Boolean> = includeBalance

        /** Include credits on the contract level. */
        @JsonProperty("include_contract_credits")
        @ExcludeMissing
        fun _includeContractCredits(): JsonField<Boolean> = includeContractCredits

        /**
         * Include credit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        @JsonProperty("include_ledgers")
        @ExcludeMissing
        fun _includeLedgers(): JsonField<Boolean> = includeLedgers

        /** The maximum number of commits to return. Defaults to 25. */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

        /** The next page token from a previous response. */
        @JsonProperty("next_page") @ExcludeMissing fun _nextPage(): JsonField<String> = nextPage

        /** Include only credits that have any access on or after the provided date */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            customerId()
            coveringDate()
            creditId()
            effectiveBefore()
            includeArchived()
            includeBalance()
            includeContractCredits()
            includeLedgers()
            limit()
            nextPage()
            startingAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var coveringDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var creditId: JsonField<String> = JsonMissing.of()
            private var effectiveBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var includeArchived: JsonField<Boolean> = JsonMissing.of()
            private var includeBalance: JsonField<Boolean> = JsonMissing.of()
            private var includeContractCredits: JsonField<Boolean> = JsonMissing.of()
            private var includeLedgers: JsonField<Boolean> = JsonMissing.of()
            private var limit: JsonField<Long> = JsonMissing.of()
            private var nextPage: JsonField<String> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                customerId = body.customerId
                coveringDate = body.coveringDate
                creditId = body.creditId
                effectiveBefore = body.effectiveBefore
                includeArchived = body.includeArchived
                includeBalance = body.includeBalance
                includeContractCredits = body.includeContractCredits
                includeLedgers = body.includeLedgers
                limit = body.limit
                nextPage = body.nextPage
                startingAt = body.startingAt
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** Return only credits that have access schedules that "cover" the provided date */
            fun coveringDate(coveringDate: OffsetDateTime) =
                coveringDate(JsonField.of(coveringDate))

            /** Return only credits that have access schedules that "cover" the provided date */
            fun coveringDate(coveringDate: JsonField<OffsetDateTime>) = apply {
                this.coveringDate = coveringDate
            }

            fun creditId(creditId: String) = creditId(JsonField.of(creditId))

            fun creditId(creditId: JsonField<String>) = apply { this.creditId = creditId }

            /** Include only credits that have any access before the provided date (exclusive) */
            fun effectiveBefore(effectiveBefore: OffsetDateTime) =
                effectiveBefore(JsonField.of(effectiveBefore))

            /** Include only credits that have any access before the provided date (exclusive) */
            fun effectiveBefore(effectiveBefore: JsonField<OffsetDateTime>) = apply {
                this.effectiveBefore = effectiveBefore
            }

            /** Include archived credits and credits from archived contracts. */
            fun includeArchived(includeArchived: Boolean) =
                includeArchived(JsonField.of(includeArchived))

            /** Include archived credits and credits from archived contracts. */
            fun includeArchived(includeArchived: JsonField<Boolean>) = apply {
                this.includeArchived = includeArchived
            }

            /**
             * Include the balance in the response. Setting this flag may cause the query to be
             * slower.
             */
            fun includeBalance(includeBalance: Boolean) =
                includeBalance(JsonField.of(includeBalance))

            /**
             * Include the balance in the response. Setting this flag may cause the query to be
             * slower.
             */
            fun includeBalance(includeBalance: JsonField<Boolean>) = apply {
                this.includeBalance = includeBalance
            }

            /** Include credits on the contract level. */
            fun includeContractCredits(includeContractCredits: Boolean) =
                includeContractCredits(JsonField.of(includeContractCredits))

            /** Include credits on the contract level. */
            fun includeContractCredits(includeContractCredits: JsonField<Boolean>) = apply {
                this.includeContractCredits = includeContractCredits
            }

            /**
             * Include credit ledgers in the response. Setting this flag may cause the query to be
             * slower.
             */
            fun includeLedgers(includeLedgers: Boolean) =
                includeLedgers(JsonField.of(includeLedgers))

            /**
             * Include credit ledgers in the response. Setting this flag may cause the query to be
             * slower.
             */
            fun includeLedgers(includeLedgers: JsonField<Boolean>) = apply {
                this.includeLedgers = includeLedgers
            }

            /** The maximum number of commits to return. Defaults to 25. */
            fun limit(limit: Long) = limit(JsonField.of(limit))

            /** The maximum number of commits to return. Defaults to 25. */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            /** The next page token from a previous response. */
            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            /** The next page token from a previous response. */
            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            /** Include only credits that have any access on or after the provided date */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /** Include only credits that have any access on or after the provided date */
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

            fun build(): Body =
                Body(
                    checkRequired("customerId", customerId),
                    coveringDate,
                    creditId,
                    effectiveBefore,
                    includeArchived,
                    includeBalance,
                    includeContractCredits,
                    includeLedgers,
                    limit,
                    nextPage,
                    startingAt,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && customerId == other.customerId && coveringDate == other.coveringDate && creditId == other.creditId && effectiveBefore == other.effectiveBefore && includeArchived == other.includeArchived && includeBalance == other.includeBalance && includeContractCredits == other.includeContractCredits && includeLedgers == other.includeLedgers && limit == other.limit && nextPage == other.nextPage && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, coveringDate, creditId, effectiveBefore, includeArchived, includeBalance, includeContractCredits, includeLedgers, limit, nextPage, startingAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customerId=$customerId, coveringDate=$coveringDate, creditId=$creditId, effectiveBefore=$effectiveBefore, includeArchived=$includeArchived, includeBalance=$includeBalance, includeContractCredits=$includeContractCredits, includeLedgers=$includeLedgers, limit=$limit, nextPage=$nextPage, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1CustomerCreditListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1CustomerCreditListParams: V1CustomerCreditListParams) = apply {
            body = v1CustomerCreditListParams.body.toBuilder()
            additionalHeaders = v1CustomerCreditListParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1CustomerCreditListParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** Return only credits that have access schedules that "cover" the provided date */
        fun coveringDate(coveringDate: OffsetDateTime) = apply { body.coveringDate(coveringDate) }

        /** Return only credits that have access schedules that "cover" the provided date */
        fun coveringDate(coveringDate: JsonField<OffsetDateTime>) = apply {
            body.coveringDate(coveringDate)
        }

        fun creditId(creditId: String) = apply { body.creditId(creditId) }

        fun creditId(creditId: JsonField<String>) = apply { body.creditId(creditId) }

        /** Include only credits that have any access before the provided date (exclusive) */
        fun effectiveBefore(effectiveBefore: OffsetDateTime) = apply {
            body.effectiveBefore(effectiveBefore)
        }

        /** Include only credits that have any access before the provided date (exclusive) */
        fun effectiveBefore(effectiveBefore: JsonField<OffsetDateTime>) = apply {
            body.effectiveBefore(effectiveBefore)
        }

        /** Include archived credits and credits from archived contracts. */
        fun includeArchived(includeArchived: Boolean) = apply {
            body.includeArchived(includeArchived)
        }

        /** Include archived credits and credits from archived contracts. */
        fun includeArchived(includeArchived: JsonField<Boolean>) = apply {
            body.includeArchived(includeArchived)
        }

        /**
         * Include the balance in the response. Setting this flag may cause the query to be slower.
         */
        fun includeBalance(includeBalance: Boolean) = apply { body.includeBalance(includeBalance) }

        /**
         * Include the balance in the response. Setting this flag may cause the query to be slower.
         */
        fun includeBalance(includeBalance: JsonField<Boolean>) = apply {
            body.includeBalance(includeBalance)
        }

        /** Include credits on the contract level. */
        fun includeContractCredits(includeContractCredits: Boolean) = apply {
            body.includeContractCredits(includeContractCredits)
        }

        /** Include credits on the contract level. */
        fun includeContractCredits(includeContractCredits: JsonField<Boolean>) = apply {
            body.includeContractCredits(includeContractCredits)
        }

        /**
         * Include credit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        fun includeLedgers(includeLedgers: Boolean) = apply { body.includeLedgers(includeLedgers) }

        /**
         * Include credit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        fun includeLedgers(includeLedgers: JsonField<Boolean>) = apply {
            body.includeLedgers(includeLedgers)
        }

        /** The maximum number of commits to return. Defaults to 25. */
        fun limit(limit: Long) = apply { body.limit(limit) }

        /** The maximum number of commits to return. Defaults to 25. */
        fun limit(limit: JsonField<Long>) = apply { body.limit(limit) }

        /** The next page token from a previous response. */
        fun nextPage(nextPage: String) = apply { body.nextPage(nextPage) }

        /** The next page token from a previous response. */
        fun nextPage(nextPage: JsonField<String>) = apply { body.nextPage(nextPage) }

        /** Include only credits that have any access on or after the provided date */
        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

        /** Include only credits that have any access on or after the provided date */
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

        fun build(): V1CustomerCreditListParams =
            V1CustomerCreditListParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1CustomerCreditListParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V1CustomerCreditListParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
