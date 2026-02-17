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
import com.metronome.api.services.async.v1.customers.InvoiceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/**
 * Retrieve granular time-series breakdowns of invoice data at hourly or daily intervals. This
 * endpoint transforms standard invoices into detailed timelines, enabling you to track usage
 * patterns, identify consumption spikes, and provide customers with transparency into their billing
 * details throughout the billing period.
 *
 * ### Use this endpoint to:
 * - Build usage analytics dashboards showing daily or hourly consumption trends
 * - Identify peak usage periods for capacity planning and cost optimization
 * - Generate detailed billing reports for finance teams and customer success
 * - Troubleshoot billing disputes by examining usage patterns at specific times
 * - Power real-time cost monitoring and alerting systems
 *
 * ### Key response fields:
 *
 * An array of BreakdownInvoice objects, each containing:
 * - All standard invoice fields (ID, customer, commit, line items, totals, status)
 * - Line items with quantities and costs for that specific period
 * - `breakdown_start_timestamp`: Start of the specific time window
 * - `breakdown_end_timestamp`: End of the specific time window
 * - `next_page`: Pagination cursor for large result sets
 *
 * ### Usage guidelines:
 * - Time granularity: Set `window_size` to hour or day based on your analysis needs
 * - Response limits: Daily breakdowns return up to 35 days; hourly breakdowns return up to 24 hours
 *   per request
 * - Date filtering: Use `starting_on` and `ending_before` to focus on specific periods
 * - Performance: For large date ranges, use pagination to retrieve all data efficiently
 * - Backdated usage: If usage events arrive after invoice finalization, breakdowns will reflect the
 *   updated usage
 * - Zero quantity filtering: Use `skip_zero_qty_line_items=true` to exclude periods with no usage
 */
class V1CustomerInvoiceListBreakdownsPageAsync
private constructor(
    private val invoicesService: InvoiceServiceAsync,
    private val params: V1CustomerInvoiceListBreakdownsParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun nextPage(): Optional<String> = response().nextPage()

    fun data(): List<V1CustomerInvoiceListBreakdownsResponse> = response().data()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1CustomerInvoiceListBreakdownsPageAsync && invoicesService == other.invoicesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(invoicesService, params, response) /* spotless:on */

    override fun toString() =
        "V1CustomerInvoiceListBreakdownsPageAsync{invoicesService=$invoicesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextPage().isPresent
    }

    fun getNextPageParams(): Optional<V1CustomerInvoiceListBreakdownsParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            V1CustomerInvoiceListBreakdownsParams.builder()
                .from(params)
                .apply { nextPage().ifPresent { this.nextPage(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<V1CustomerInvoiceListBreakdownsPageAsync>> {
        return getNextPageParams()
            .map { invoicesService.listBreakdowns(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            invoicesService: InvoiceServiceAsync,
            params: V1CustomerInvoiceListBreakdownsParams,
            response: Response,
        ) = V1CustomerInvoiceListBreakdownsPageAsync(invoicesService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("next_page") private val nextPage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data")
        private val data: JsonField<List<V1CustomerInvoiceListBreakdownsResponse>> =
            JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

        fun data(): List<V1CustomerInvoiceListBreakdownsResponse> =
            data.getNullable("data") ?: listOf()

        @JsonProperty("next_page")
        fun _nextPage(): Optional<JsonField<String>> = Optional.ofNullable(nextPage)

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<V1CustomerInvoiceListBreakdownsResponse>>> =
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
            private var data: JsonField<List<V1CustomerInvoiceListBreakdownsResponse>> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.nextPage = page.nextPage
                this.data = page.data
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            fun data(data: List<V1CustomerInvoiceListBreakdownsResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<V1CustomerInvoiceListBreakdownsResponse>>) = apply {
                this.data = data
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(nextPage, data, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: V1CustomerInvoiceListBreakdownsPageAsync) {

        fun forEach(
            action: Predicate<V1CustomerInvoiceListBreakdownsResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<V1CustomerInvoiceListBreakdownsPageAsync>>.forEach(
                action: (V1CustomerInvoiceListBreakdownsResponse) -> Boolean,
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

        fun toList(
            executor: Executor
        ): CompletableFuture<List<V1CustomerInvoiceListBreakdownsResponse>> {
            val values = mutableListOf<V1CustomerInvoiceListBreakdownsResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
