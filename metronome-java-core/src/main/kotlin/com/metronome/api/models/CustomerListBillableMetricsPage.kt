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
import com.metronome.api.services.blocking.CustomerService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

class CustomerListBillableMetricsPage
private constructor(
    private val customersService: CustomerService,
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

        return /* spotless:off */ other is CustomerListBillableMetricsPage && this.customersService == other.customersService && this.params == other.params && this.response == other.response /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customersService, params, response) /* spotless:on */
    }

    override fun toString() =
        "CustomerListBillableMetricsPage{customersService=$customersService, params=$params, response=$response}"

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

    fun getNextPage(): Optional<CustomerListBillableMetricsPage> {
        return getNextPageParams().map { customersService.listBillableMetrics(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            customersService: CustomerService,
            params: CustomerListBillableMetricsParams,
            response: Response
        ) =
            CustomerListBillableMetricsPage(
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
            "CustomerListBillableMetricsPage.Response{nextPage=$nextPage, data=$data, additionalProperties=$additionalProperties}"

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
        private val firstPage: CustomerListBillableMetricsPage,
    ) : Iterable<CustomerListBillableMetricsResponse> {

        override fun iterator(): Iterator<CustomerListBillableMetricsResponse> = iterator {
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

        fun stream(): Stream<CustomerListBillableMetricsResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
