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

/** List balances (commits and credits). */
class ContractListBalancesParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = body.customerId()

    fun id(): Optional<String> = body.id()

    /** Return only balances that have access schedules that "cover" the provided date */
    fun coveringDate(): Optional<OffsetDateTime> = body.coveringDate()

    /** Include only balances that have any access before the provided date (exclusive) */
    fun effectiveBefore(): Optional<OffsetDateTime> = body.effectiveBefore()

    /** Include credits from archived contracts. */
    fun includeArchived(): Optional<Boolean> = body.includeArchived()

    /**
     * Include the balance of credits and commits in the response. Setting this flag may cause the
     * query to be slower.
     */
    fun includeBalance(): Optional<Boolean> = body.includeBalance()

    /** Include balances on the contract level. */
    fun includeContractBalances(): Optional<Boolean> = body.includeContractBalances()

    /** Include ledgers in the response. Setting this flag may cause the query to be slower. */
    fun includeLedgers(): Optional<Boolean> = body.includeLedgers()

    /** The next page token from a previous response. */
    fun nextPage(): Optional<String> = body.nextPage()

    /** Include only balances that have any access on or after the provided date */
    fun startingAt(): Optional<OffsetDateTime> = body.startingAt()

    fun _customerId(): JsonField<String> = body._customerId()

    fun _id(): JsonField<String> = body._id()

    /** Return only balances that have access schedules that "cover" the provided date */
    fun _coveringDate(): JsonField<OffsetDateTime> = body._coveringDate()

    /** Include only balances that have any access before the provided date (exclusive) */
    fun _effectiveBefore(): JsonField<OffsetDateTime> = body._effectiveBefore()

    /** Include credits from archived contracts. */
    fun _includeArchived(): JsonField<Boolean> = body._includeArchived()

    /**
     * Include the balance of credits and commits in the response. Setting this flag may cause the
     * query to be slower.
     */
    fun _includeBalance(): JsonField<Boolean> = body._includeBalance()

    /** Include balances on the contract level. */
    fun _includeContractBalances(): JsonField<Boolean> = body._includeContractBalances()

    /** Include ledgers in the response. Setting this flag may cause the query to be slower. */
    fun _includeLedgers(): JsonField<Boolean> = body._includeLedgers()

    /** The next page token from a previous response. */
    fun _nextPage(): JsonField<String> = body._nextPage()

    /** Include only balances that have any access on or after the provided date */
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
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("covering_date")
        @ExcludeMissing
        private val coveringDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("effective_before")
        @ExcludeMissing
        private val effectiveBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("include_archived")
        @ExcludeMissing
        private val includeArchived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("include_balance")
        @ExcludeMissing
        private val includeBalance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("include_contract_balances")
        @ExcludeMissing
        private val includeContractBalances: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("include_ledgers")
        @ExcludeMissing
        private val includeLedgers: JsonField<Boolean> = JsonMissing.of(),
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

        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        /** Return only balances that have access schedules that "cover" the provided date */
        fun coveringDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(coveringDate.getNullable("covering_date"))

        /** Include only balances that have any access before the provided date (exclusive) */
        fun effectiveBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(effectiveBefore.getNullable("effective_before"))

        /** Include credits from archived contracts. */
        fun includeArchived(): Optional<Boolean> =
            Optional.ofNullable(includeArchived.getNullable("include_archived"))

        /**
         * Include the balance of credits and commits in the response. Setting this flag may cause
         * the query to be slower.
         */
        fun includeBalance(): Optional<Boolean> =
            Optional.ofNullable(includeBalance.getNullable("include_balance"))

        /** Include balances on the contract level. */
        fun includeContractBalances(): Optional<Boolean> =
            Optional.ofNullable(includeContractBalances.getNullable("include_contract_balances"))

        /** Include ledgers in the response. Setting this flag may cause the query to be slower. */
        fun includeLedgers(): Optional<Boolean> =
            Optional.ofNullable(includeLedgers.getNullable("include_ledgers"))

        /** The next page token from a previous response. */
        fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

        /** Include only balances that have any access on or after the provided date */
        fun startingAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(startingAt.getNullable("starting_at"))

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** Return only balances that have access schedules that "cover" the provided date */
        @JsonProperty("covering_date")
        @ExcludeMissing
        fun _coveringDate(): JsonField<OffsetDateTime> = coveringDate

        /** Include only balances that have any access before the provided date (exclusive) */
        @JsonProperty("effective_before")
        @ExcludeMissing
        fun _effectiveBefore(): JsonField<OffsetDateTime> = effectiveBefore

        /** Include credits from archived contracts. */
        @JsonProperty("include_archived")
        @ExcludeMissing
        fun _includeArchived(): JsonField<Boolean> = includeArchived

        /**
         * Include the balance of credits and commits in the response. Setting this flag may cause
         * the query to be slower.
         */
        @JsonProperty("include_balance")
        @ExcludeMissing
        fun _includeBalance(): JsonField<Boolean> = includeBalance

        /** Include balances on the contract level. */
        @JsonProperty("include_contract_balances")
        @ExcludeMissing
        fun _includeContractBalances(): JsonField<Boolean> = includeContractBalances

        /** Include ledgers in the response. Setting this flag may cause the query to be slower. */
        @JsonProperty("include_ledgers")
        @ExcludeMissing
        fun _includeLedgers(): JsonField<Boolean> = includeLedgers

        /** The next page token from a previous response. */
        @JsonProperty("next_page") @ExcludeMissing fun _nextPage(): JsonField<String> = nextPage

        /** Include only balances that have any access on or after the provided date */
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
            id()
            coveringDate()
            effectiveBefore()
            includeArchived()
            includeBalance()
            includeContractBalances()
            includeLedgers()
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
            private var id: JsonField<String> = JsonMissing.of()
            private var coveringDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var effectiveBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var includeArchived: JsonField<Boolean> = JsonMissing.of()
            private var includeBalance: JsonField<Boolean> = JsonMissing.of()
            private var includeContractBalances: JsonField<Boolean> = JsonMissing.of()
            private var includeLedgers: JsonField<Boolean> = JsonMissing.of()
            private var nextPage: JsonField<String> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                customerId = body.customerId
                id = body.id
                coveringDate = body.coveringDate
                effectiveBefore = body.effectiveBefore
                includeArchived = body.includeArchived
                includeBalance = body.includeBalance
                includeContractBalances = body.includeContractBalances
                includeLedgers = body.includeLedgers
                nextPage = body.nextPage
                startingAt = body.startingAt
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Return only balances that have access schedules that "cover" the provided date */
            fun coveringDate(coveringDate: OffsetDateTime) =
                coveringDate(JsonField.of(coveringDate))

            /** Return only balances that have access schedules that "cover" the provided date */
            fun coveringDate(coveringDate: JsonField<OffsetDateTime>) = apply {
                this.coveringDate = coveringDate
            }

            /** Include only balances that have any access before the provided date (exclusive) */
            fun effectiveBefore(effectiveBefore: OffsetDateTime) =
                effectiveBefore(JsonField.of(effectiveBefore))

            /** Include only balances that have any access before the provided date (exclusive) */
            fun effectiveBefore(effectiveBefore: JsonField<OffsetDateTime>) = apply {
                this.effectiveBefore = effectiveBefore
            }

            /** Include credits from archived contracts. */
            fun includeArchived(includeArchived: Boolean) =
                includeArchived(JsonField.of(includeArchived))

            /** Include credits from archived contracts. */
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
             * Include the balance of credits and commits in the response. Setting this flag may
             * cause the query to be slower.
             */
            fun includeBalance(includeBalance: JsonField<Boolean>) = apply {
                this.includeBalance = includeBalance
            }

            /** Include balances on the contract level. */
            fun includeContractBalances(includeContractBalances: Boolean) =
                includeContractBalances(JsonField.of(includeContractBalances))

            /** Include balances on the contract level. */
            fun includeContractBalances(includeContractBalances: JsonField<Boolean>) = apply {
                this.includeContractBalances = includeContractBalances
            }

            /**
             * Include ledgers in the response. Setting this flag may cause the query to be slower.
             */
            fun includeLedgers(includeLedgers: Boolean) =
                includeLedgers(JsonField.of(includeLedgers))

            /**
             * Include ledgers in the response. Setting this flag may cause the query to be slower.
             */
            fun includeLedgers(includeLedgers: JsonField<Boolean>) = apply {
                this.includeLedgers = includeLedgers
            }

            /** The next page token from a previous response. */
            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            /** The next page token from a previous response. */
            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            /** Include only balances that have any access on or after the provided date */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /** Include only balances that have any access on or after the provided date */
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
                    id,
                    coveringDate,
                    effectiveBefore,
                    includeArchived,
                    includeBalance,
                    includeContractBalances,
                    includeLedgers,
                    nextPage,
                    startingAt,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && customerId == other.customerId && id == other.id && coveringDate == other.coveringDate && effectiveBefore == other.effectiveBefore && includeArchived == other.includeArchived && includeBalance == other.includeBalance && includeContractBalances == other.includeContractBalances && includeLedgers == other.includeLedgers && nextPage == other.nextPage && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, id, coveringDate, effectiveBefore, includeArchived, includeBalance, includeContractBalances, includeLedgers, nextPage, startingAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customerId=$customerId, id=$id, coveringDate=$coveringDate, effectiveBefore=$effectiveBefore, includeArchived=$includeArchived, includeBalance=$includeBalance, includeContractBalances=$includeContractBalances, includeLedgers=$includeLedgers, nextPage=$nextPage, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractListBalancesParams]. */
    @NoAutoDetect
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

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        fun id(id: String) = apply { body.id(id) }

        fun id(id: JsonField<String>) = apply { body.id(id) }

        /** Return only balances that have access schedules that "cover" the provided date */
        fun coveringDate(coveringDate: OffsetDateTime) = apply { body.coveringDate(coveringDate) }

        /** Return only balances that have access schedules that "cover" the provided date */
        fun coveringDate(coveringDate: JsonField<OffsetDateTime>) = apply {
            body.coveringDate(coveringDate)
        }

        /** Include only balances that have any access before the provided date (exclusive) */
        fun effectiveBefore(effectiveBefore: OffsetDateTime) = apply {
            body.effectiveBefore(effectiveBefore)
        }

        /** Include only balances that have any access before the provided date (exclusive) */
        fun effectiveBefore(effectiveBefore: JsonField<OffsetDateTime>) = apply {
            body.effectiveBefore(effectiveBefore)
        }

        /** Include credits from archived contracts. */
        fun includeArchived(includeArchived: Boolean) = apply {
            body.includeArchived(includeArchived)
        }

        /** Include credits from archived contracts. */
        fun includeArchived(includeArchived: JsonField<Boolean>) = apply {
            body.includeArchived(includeArchived)
        }

        /**
         * Include the balance of credits and commits in the response. Setting this flag may cause
         * the query to be slower.
         */
        fun includeBalance(includeBalance: Boolean) = apply { body.includeBalance(includeBalance) }

        /**
         * Include the balance of credits and commits in the response. Setting this flag may cause
         * the query to be slower.
         */
        fun includeBalance(includeBalance: JsonField<Boolean>) = apply {
            body.includeBalance(includeBalance)
        }

        /** Include balances on the contract level. */
        fun includeContractBalances(includeContractBalances: Boolean) = apply {
            body.includeContractBalances(includeContractBalances)
        }

        /** Include balances on the contract level. */
        fun includeContractBalances(includeContractBalances: JsonField<Boolean>) = apply {
            body.includeContractBalances(includeContractBalances)
        }

        /** Include ledgers in the response. Setting this flag may cause the query to be slower. */
        fun includeLedgers(includeLedgers: Boolean) = apply { body.includeLedgers(includeLedgers) }

        /** Include ledgers in the response. Setting this flag may cause the query to be slower. */
        fun includeLedgers(includeLedgers: JsonField<Boolean>) = apply {
            body.includeLedgers(includeLedgers)
        }

        /** The next page token from a previous response. */
        fun nextPage(nextPage: String) = apply { body.nextPage(nextPage) }

        /** The next page token from a previous response. */
        fun nextPage(nextPage: JsonField<String>) = apply { body.nextPage(nextPage) }

        /** Include only balances that have any access on or after the provided date */
        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

        /** Include only balances that have any access on or after the provided date */
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

        fun build(): ContractListBalancesParams =
            ContractListBalancesParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractListBalancesParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractListBalancesParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
