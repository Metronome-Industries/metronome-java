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
import com.metronome.api.services.blocking.v1.ContractService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

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
 *
 * An array of balance objects (all credits and commits) containing:
 * - Balance details: Current available amount for each commit or credit
 * - Metadata: Product associations, priorities, applicable date ranges
 * - Optional ledger entries: Detailed transaction history (if `include_ledgers=true`)
 * - Balance calculations: Including pending transactions and future-dated entries
 * - Custom fields: Any additional metadata attached to balances
 *
 * ### Usage guidelines:
 * - Date filtering: Use `effective_before` to include only balances with access before a specific
 *   date (exclusive)
 * - Set `include_balance=true` for calculated balance amounts on each commit or credit
 * - Set `include_ledgers=true` for full transaction history
 * - Set `include_contract_balances = true` to see contract level balances
 * - Balance logic: Reflects currently accessible amounts, excluding expired/future segments
 * - Manual adjustments: Includes all manual ledger entries, even future-dated ones
 */
class V1ContractListBalancesPage
private constructor(
    private val contractsService: ContractService,
    private val params: V1ContractListBalancesParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun nextPage(): Optional<String> = response().nextPage()

    fun data(): List<V1ContractListBalancesResponse> = response().data()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1ContractListBalancesPage && contractsService == other.contractsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(contractsService, params, response) /* spotless:on */

    override fun toString() =
        "V1ContractListBalancesPage{contractsService=$contractsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextPage().isPresent
    }

    fun getNextPageParams(): Optional<V1ContractListBalancesParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            V1ContractListBalancesParams.builder()
                .from(params)
                .apply { nextPage().ifPresent { this.nextPage(it) } }
                .build()
        )
    }

    fun getNextPage(): Optional<V1ContractListBalancesPage> {
        return getNextPageParams().map { contractsService.listBalances(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            contractsService: ContractService,
            params: V1ContractListBalancesParams,
            response: Response,
        ) = V1ContractListBalancesPage(contractsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("next_page") private val nextPage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data")
        private val data: JsonField<List<V1ContractListBalancesResponse>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

        fun data(): List<V1ContractListBalancesResponse> = data.getNullable("data") ?: listOf()

        @JsonProperty("next_page")
        fun _nextPage(): Optional<JsonField<String>> = Optional.ofNullable(nextPage)

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<V1ContractListBalancesResponse>>> =
            Optional.ofNullable(data)

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
            private var data: JsonField<List<V1ContractListBalancesResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.nextPage = page.nextPage
                this.data = page.data
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            fun data(data: List<V1ContractListBalancesResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<V1ContractListBalancesResponse>>) = apply {
                this.data = data
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(nextPage, data, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: V1ContractListBalancesPage) :
        Iterable<V1ContractListBalancesResponse> {

        override fun iterator(): Iterator<V1ContractListBalancesResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().orElse(null) ?: break
                index = 0
            }
        }

        fun stream(): Stream<V1ContractListBalancesResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
