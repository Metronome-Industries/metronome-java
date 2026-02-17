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
import com.metronome.api.services.async.v1.UsageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/**
 * Retrieve aggregated usage data across multiple customers and billable metrics in a single query.
 * This batch endpoint enables you to fetch usage patterns at scale, broken down by time windows,
 * making it ideal for building analytics dashboards, generating reports, and monitoring
 * platform-wide usage trends.
 *
 * ### Use this endpoint to:
 * - Generate platform-wide usage reports for internal teams
 * - Monitor aggregate usage trends across your entire customer base
 * - Create comparative usage analyses between customers or time periods
 * - Support capacity planning with historical usage patterns
 *
 * ### Key response fields:
 *
 * An array of `UsageBatchAggregate` objects containing:
 * - `customer_id`: The customer this usage belongs to
 * - `billable_metric_id` and `billable_metric_name`: What was measured
 * - `start_timestamp` and `end_timestamp`: Time window for this data point
 * - `value`: Aggregated usage amount for the period
 * - `groups` (optional): Usage broken down by group keys with values
 * - `next_page`: Pagination cursor for large result sets
 *
 * ### Usage guidelines:
 * - Time windows: Set `window_size` to `hour`, `day`, or `none` (entire period)
 * - Required parameters: Must specify `starting_on`, `ending_before`, and `window_size`
 * - Filtering options:
 *     - `customer_ids`: Limit to specific customers (omit for all customers)
 *     - `billable_metrics`: Limit to specific metrics (omit for all metrics)
 * - Pagination: Use `next_page` cursor to retrieve large datasets
 * - Null values: Group values may be null when no usage matches that group
 */
class V1UsageListPageAsync
private constructor(
    private val usageService: UsageServiceAsync,
    private val params: V1UsageListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun nextPage(): Optional<String> = response().nextPage()

    fun data(): List<V1UsageListResponse> = response().data()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1UsageListPageAsync && usageService == other.usageService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(usageService, params, response) /* spotless:on */

    override fun toString() =
        "V1UsageListPageAsync{usageService=$usageService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextPage().isPresent
    }

    fun getNextPageParams(): Optional<V1UsageListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            V1UsageListParams.builder()
                .from(params)
                .apply { nextPage().ifPresent { this.nextPage(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<V1UsageListPageAsync>> {
        return getNextPageParams()
            .map { usageService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(usageService: UsageServiceAsync, params: V1UsageListParams, response: Response) =
            V1UsageListPageAsync(usageService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("next_page") private val nextPage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data")
        private val data: JsonField<List<V1UsageListResponse>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

        fun data(): List<V1UsageListResponse> = data.getNullable("data") ?: listOf()

        @JsonProperty("next_page")
        fun _nextPage(): Optional<JsonField<String>> = Optional.ofNullable(nextPage)

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<V1UsageListResponse>>> = Optional.ofNullable(data)

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
            private var data: JsonField<List<V1UsageListResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.nextPage = page.nextPage
                this.data = page.data
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            fun data(data: List<V1UsageListResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<V1UsageListResponse>>) = apply { this.data = data }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(nextPage, data, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: V1UsageListPageAsync) {

        fun forEach(
            action: Predicate<V1UsageListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<V1UsageListPageAsync>>.forEach(
                action: (V1UsageListResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<V1UsageListResponse>> {
            val values = mutableListOf<V1UsageListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
