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
import com.metronome.api.services.async.v1.customers.CreditServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

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
class V1CustomerCreditListPageAsync
private constructor(
    private val creditsService: CreditServiceAsync,
    private val params: V1CustomerCreditListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun nextPage(): Optional<String> = response().nextPage()

    fun data(): List<Credit> = response().data()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1CustomerCreditListPageAsync && creditsService == other.creditsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditsService, params, response) /* spotless:on */

    override fun toString() =
        "V1CustomerCreditListPageAsync{creditsService=$creditsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextPage().isPresent
    }

    fun getNextPageParams(): Optional<V1CustomerCreditListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            V1CustomerCreditListParams.builder()
                .from(params)
                .apply { nextPage().ifPresent { this.nextPage(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<V1CustomerCreditListPageAsync>> {
        return getNextPageParams()
            .map { creditsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            creditsService: CreditServiceAsync,
            params: V1CustomerCreditListParams,
            response: Response,
        ) = V1CustomerCreditListPageAsync(creditsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("next_page") private val nextPage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") private val data: JsonField<List<Credit>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

        fun data(): List<Credit> = data.getNullable("data") ?: listOf()

        @JsonProperty("next_page")
        fun _nextPage(): Optional<JsonField<String>> = Optional.ofNullable(nextPage)

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<Credit>>> = Optional.ofNullable(data)

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
            private var data: JsonField<List<Credit>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.nextPage = page.nextPage
                this.data = page.data
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            fun data(data: List<Credit>) = data(JsonField.of(data))

            fun data(data: JsonField<List<Credit>>) = apply { this.data = data }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(nextPage, data, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: V1CustomerCreditListPageAsync) {

        fun forEach(action: Predicate<Credit>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<V1CustomerCreditListPageAsync>>.forEach(
                action: (Credit) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Credit>> {
            val values = mutableListOf<Credit>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
