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
import com.metronome.api.services.async.v1.customers.CommitServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/**
 * Retrieve all commit agreements for a customer, including both prepaid and postpaid commitments.
 * This endpoint provides comprehensive visibility into contractual spending obligations, enabling
 * you to track commitment utilization and manage customer contracts effectively.
 *
 * ### Use this endpoint to:
 * - Display commitment balances and utilization in customer dashboards
 * - Track prepaid commitment drawdown and remaining balances
 * - Monitor postpaid commitment progress toward minimum thresholds
 * - Build commitment tracking and forecasting tools
 * - Show commitment history with optional ledger details
 * - Manage rollover balances between contract periods
 *
 * ### Key response fields:
 *
 * An array of Commit objects containing:
 * - Commit type: PREPAID (pay upfront) or POSTPAID (pay at true-up)
 * - Rate type: COMMIT_RATE (discounted) or LIST_RATE (standard pricing)
 * - Access schedule: When commitment funds become available
 * - Invoice schedule: When the customer is billed
 * - Product targeting: Which product(s) usage is eligible to draw from this commit
 * - Optional ledger entries: Transaction history (if `include_ledgers=true`)
 * - Balance information: Current available amount (if `include_balance=true`)
 * - Rollover settings: Fraction of unused amount that carries forward
 *
 * ### Usage guidelines:
 * - Pagination: Results limited to 25 commits per page; use 'next_page' for more
 * - Date filtering options:
 *     - `covering_date`: Commits active on a specific date
 *     - `starting_at`: Commits with access on/after a date
 *     - `effective_before`: Commits with access before a date (exclusive)
 * - Scope options:
 *     - `include_contract_commits`: Include contract-level commits (not just customer-level)
 *     - `include_archived`: Include archived commits and commits from archived contracts
 * - Performance considerations:
 *     - include_ledgers: Adds detailed transaction history (slower)
 *     - include_balance: Adds current balance calculation (slower)
 * - Optional filtering: Use commit_id to retrieve a specific commit
 */
class V1CustomerCommitListPageAsync
private constructor(
    private val commitsService: CommitServiceAsync,
    private val params: V1CustomerCommitListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun nextPage(): Optional<String> = response().nextPage()

    fun data(): List<Commit> = response().data()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1CustomerCommitListPageAsync && commitsService == other.commitsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(commitsService, params, response) /* spotless:on */

    override fun toString() =
        "V1CustomerCommitListPageAsync{commitsService=$commitsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextPage().isPresent
    }

    fun getNextPageParams(): Optional<V1CustomerCommitListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            V1CustomerCommitListParams.builder()
                .from(params)
                .apply { nextPage().ifPresent { this.nextPage(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<V1CustomerCommitListPageAsync>> {
        return getNextPageParams()
            .map { commitsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            commitsService: CommitServiceAsync,
            params: V1CustomerCommitListParams,
            response: Response,
        ) = V1CustomerCommitListPageAsync(commitsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("next_page") private val nextPage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") private val data: JsonField<List<Commit>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

        fun data(): List<Commit> = data.getNullable("data") ?: listOf()

        @JsonProperty("next_page")
        fun _nextPage(): Optional<JsonField<String>> = Optional.ofNullable(nextPage)

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<Commit>>> = Optional.ofNullable(data)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            nextPage()
            data().map { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && nextPage == other.nextPage && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(nextPage, data, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{nextPage=$nextPage, data=$data, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var nextPage: JsonField<String> = JsonMissing.of()
            private var data: JsonField<List<Commit>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.nextPage = page.nextPage
                this.data = page.data
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            fun data(data: List<Commit>) = data(JsonField.of(data))

            fun data(data: JsonField<List<Commit>>) = apply { this.data = data }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(nextPage, data, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: V1CustomerCommitListPageAsync) {

        fun forEach(action: Predicate<Commit>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<V1CustomerCommitListPageAsync>>.forEach(
                action: (Commit) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<Commit>> {
            val values = mutableListOf<Commit>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
