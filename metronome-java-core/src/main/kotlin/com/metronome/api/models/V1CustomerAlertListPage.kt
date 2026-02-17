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
import com.metronome.api.services.blocking.v1.customers.AlertService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

/**
 * Retrieve all threshold notification configurations and their current statuses for a specific
 * customer in a single API call. This endpoint provides a comprehensive view of all threshold
 * notification monitoring a customer account.
 *
 * ### Use this endpoint to:
 * - Display all active threshold notifications for a customer in dashboards or admin panels
 * - Quickly identify which threshold notifications a customer is currently triggering
 * - Audit threshold notification coverage for specific accounts
 * - Filter threshold notifications by status (enabled, disabled, or archived)
 *
 * ### Key response fields:
 * - data: Array of CustomerAlert objects, each containing:
 *     - Current evaluation status (`ok`, `in_alarm`, `evaluating`, or `null`)
 *     - Complete threshold notification configuration and threshold details
 *     - Threshold notification metadata including type, name, and last update time
 * - next_page: Pagination cursor for retrieving additional results
 *
 * ### Usage guidelines:
 * - Default behavior: Returns only enabled threshold notifications unless `alert_statuses` filter
 *   is specified
 * - Pagination: Use the `next_page` cursor to retrieve all results for customers with many
 *   notifications
 * - Performance: Efficiently retrieves multiple threshold notification statuses in a single request
 *   instead of making individual calls
 * - Filtering: Pass the `alert_statuses` array to include disabled or archived threshold
 *   notifications in results
 */
class V1CustomerAlertListPage
private constructor(
    private val alertsService: AlertService,
    private val params: V1CustomerAlertListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun nextPage(): Optional<String> = response().nextPage()

    fun data(): List<CustomerAlert> = response().data()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1CustomerAlertListPage && alertsService == other.alertsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(alertsService, params, response) /* spotless:on */

    override fun toString() =
        "V1CustomerAlertListPage{alertsService=$alertsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextPage().isPresent
    }

    fun getNextPageParams(): Optional<V1CustomerAlertListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            V1CustomerAlertListParams.builder()
                .from(params)
                .apply { nextPage().ifPresent { this.nextPage(it) } }
                .build()
        )
    }

    fun getNextPage(): Optional<V1CustomerAlertListPage> {
        return getNextPageParams().map { alertsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(alertsService: AlertService, params: V1CustomerAlertListParams, response: Response) =
            V1CustomerAlertListPage(alertsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("next_page") private val nextPage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") private val data: JsonField<List<CustomerAlert>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

        fun data(): List<CustomerAlert> = data.getNullable("data") ?: listOf()

        @JsonProperty("next_page")
        fun _nextPage(): Optional<JsonField<String>> = Optional.ofNullable(nextPage)

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<CustomerAlert>>> = Optional.ofNullable(data)

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
            private var data: JsonField<List<CustomerAlert>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.nextPage = page.nextPage
                this.data = page.data
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            fun data(data: List<CustomerAlert>) = data(JsonField.of(data))

            fun data(data: JsonField<List<CustomerAlert>>) = apply { this.data = data }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(nextPage, data, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: V1CustomerAlertListPage) : Iterable<CustomerAlert> {

        override fun iterator(): Iterator<CustomerAlert> = iterator {
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

        fun stream(): Stream<CustomerAlert> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
