// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.services.async.CustomerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

class CustomerListBillableMetricsPageAsync
private constructor(
    private val customersService: CustomerServiceAsync,
    private val params: CustomerListBillableMetricsParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun nextPage(): Optional<String> = response().nextPage()

    fun data(): List<CustomerListBillableMetricsResponse> = response().data()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerListBillableMetricsPageAsync && this.customersService == other.customersService && this.params == other.params && this.response == other.response /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customersService, params, response) /* spotless:on */
    }

    override fun toString() =
        "CustomerListBillableMetricsPageAsync{customersService=$customersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextPage().isPresent
    }

    fun getNextPageParams(): Optional<CustomerListBillableMetricsParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            CustomerListBillableMetricsParams.builder()
                .from(params)
                .apply { nextPage().ifPresent { this.nextPage(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CustomerListBillableMetricsPageAsync>> {
        return getNextPageParams()
            .map { customersService.listBillableMetrics(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            customersService: CustomerServiceAsync,
            params: CustomerListBillableMetricsParams,
            response: Response
        ) =
            CustomerListBillableMetricsPageAsync(
                customersService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val nextPage: JsonField<String>,
        private val data: JsonField<List<CustomerListBillableMetricsResponse>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

        fun data(): List<CustomerListBillableMetricsResponse> = data.getNullable("data") ?: listOf()

        @JsonProperty("next_page")
        fun _nextPage(): Optional<JsonField<String>> = Optional.ofNullable(nextPage)

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<CustomerListBillableMetricsResponse>>> =
            Optional.ofNullable(data)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                nextPage()
                data().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && this.nextPage == other.nextPage && this.data == other.data && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(nextPage, data, additionalProperties) /* spotless:on */
        }

        override fun toString() =
            "CustomerListBillableMetricsPageAsync.Response{nextPage=$nextPage, data=$data, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var nextPage: JsonField<String> = JsonMissing.of()
            private var data: JsonField<List<CustomerListBillableMetricsResponse>> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.nextPage = page.nextPage
                this.data = page.data
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            @JsonProperty("next_page")
            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            fun data(data: List<CustomerListBillableMetricsResponse>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<CustomerListBillableMetricsResponse>>) = apply {
                this.data = data
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    nextPage,
                    data,
                    additionalProperties.toImmutable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: CustomerListBillableMetricsPageAsync,
    ) {

        fun forEach(
            action: Predicate<CustomerListBillableMetricsResponse>,
            executor: Executor
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CustomerListBillableMetricsPageAsync>>.forEach(
                action: (CustomerListBillableMetricsResponse) -> Boolean,
                executor: Executor
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(
            executor: Executor
        ): CompletableFuture<List<CustomerListBillableMetricsResponse>> {
            val values = mutableListOf<CustomerListBillableMetricsResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
