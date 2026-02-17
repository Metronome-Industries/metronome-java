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
 * Retrieve granular usage data for a specific customer and billable metric, with the ability to
 * break down usage by custom grouping dimensions. This endpoint enables deep usage analytics by
 * segmenting data across attributes like region, user, model type, or any custom dimension defined
 * in your billable metrics.
 *
 * ### Use this endpoint to:
 * - Analyze usage patterns broken down by specific attributes (region, user, department, etc.)
 * - Build detailed usage dashboards with dimensional filtering
 * - Identify high-usage segments for optimization opportunities
 *
 * ### Key response fields:
 *
 * An array of `PagedUsageAggregate` objects containing:
 * - `starting_on` and `ending_before`: Time window boundaries
 * - `group_key`: The dimension being grouped by (e.g., "region")
 * - `group_value`: The specific value for this group (e.g., "US-East")
 * - `value`: Aggregated usage for this group and time window
 * - `next_page`: Pagination cursor for large datasets
 *
 * ### Usage guidelines:
 * - Required parameters: Must specify `customer_id`, `billable_metric_id`, and `window_size`
 * - Time windows: Set `window_size` to hour, day, or none for different granularities
 * - Group filtering: Use `group_by` to specify:
 *     - key: The dimension to group by (must be set on the billable metric as a group key)
 *     - values: Optional array to filter to specific values only
 * - Pagination: Use limit and `next_page` for large result sets
 * - Null handling: `group_value` may be null for unmatched data
 */
class V1UsageListWithGroupsPageAsync
private constructor(
    private val usageService: UsageServiceAsync,
    private val params: V1UsageListWithGroupsParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun nextPage(): Optional<String> = response().nextPage()

    fun data(): List<V1UsageListWithGroupsResponse> = response().data()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1UsageListWithGroupsPageAsync && usageService == other.usageService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(usageService, params, response) /* spotless:on */

    override fun toString() =
        "V1UsageListWithGroupsPageAsync{usageService=$usageService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextPage().isPresent
    }

    fun getNextPageParams(): Optional<V1UsageListWithGroupsParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            V1UsageListWithGroupsParams.builder()
                .from(params)
                .apply { nextPage().ifPresent { this.nextPage(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<V1UsageListWithGroupsPageAsync>> {
        return getNextPageParams()
            .map { usageService.listWithGroups(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            usageService: UsageServiceAsync,
            params: V1UsageListWithGroupsParams,
            response: Response,
        ) = V1UsageListWithGroupsPageAsync(usageService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("next_page") private val nextPage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data")
        private val data: JsonField<List<V1UsageListWithGroupsResponse>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

        fun data(): List<V1UsageListWithGroupsResponse> = data.getNullable("data") ?: listOf()

        @JsonProperty("next_page")
        fun _nextPage(): Optional<JsonField<String>> = Optional.ofNullable(nextPage)

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<V1UsageListWithGroupsResponse>>> =
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
            private var data: JsonField<List<V1UsageListWithGroupsResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.nextPage = page.nextPage
                this.data = page.data
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            fun data(data: List<V1UsageListWithGroupsResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<V1UsageListWithGroupsResponse>>) = apply {
                this.data = data
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(nextPage, data, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: V1UsageListWithGroupsPageAsync) {

        fun forEach(
            action: Predicate<V1UsageListWithGroupsResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<V1UsageListWithGroupsPageAsync>>.forEach(
                action: (V1UsageListWithGroupsResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<V1UsageListWithGroupsResponse>> {
            val values = mutableListOf<V1UsageListWithGroupsResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
