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
import com.metronome.api.services.blocking.customers.InvoiceService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

class CustomerInvoiceListBreakdownsPage
private constructor(
    private val invoicesService: InvoiceService,
    private val params: CustomerInvoiceListBreakdownsParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun nextPage(): Optional<String> = response().nextPage()

    fun data(): List<CustomerInvoiceListBreakdownsResponse> = response().data()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerInvoiceListBreakdownsPage && this.invoicesService == other.invoicesService && this.params == other.params && this.response == other.response /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(invoicesService, params, response) /* spotless:on */
    }

    override fun toString() =
        "CustomerInvoiceListBreakdownsPage{invoicesService=$invoicesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextPage().isPresent
    }

    fun getNextPageParams(): Optional<CustomerInvoiceListBreakdownsParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            CustomerInvoiceListBreakdownsParams.builder()
                .from(params)
                .apply { nextPage().ifPresent { this.nextPage(it) } }
                .build()
        )
    }

    fun getNextPage(): Optional<CustomerInvoiceListBreakdownsPage> {
        return getNextPageParams().map { invoicesService.listBreakdowns(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            invoicesService: InvoiceService,
            params: CustomerInvoiceListBreakdownsParams,
            response: Response
        ) =
            CustomerInvoiceListBreakdownsPage(
                invoicesService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val nextPage: JsonField<String>,
        private val data: JsonField<List<CustomerInvoiceListBreakdownsResponse>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

        fun data(): List<CustomerInvoiceListBreakdownsResponse> =
            data.getNullable("data") ?: listOf()

        @JsonProperty("next_page")
        fun _nextPage(): Optional<JsonField<String>> = Optional.ofNullable(nextPage)

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<CustomerInvoiceListBreakdownsResponse>>> =
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
            "CustomerInvoiceListBreakdownsPage.Response{nextPage=$nextPage, data=$data, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var nextPage: JsonField<String> = JsonMissing.of()
            private var data: JsonField<List<CustomerInvoiceListBreakdownsResponse>> =
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

            fun data(data: List<CustomerInvoiceListBreakdownsResponse>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<CustomerInvoiceListBreakdownsResponse>>) = apply {
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
        private val firstPage: CustomerInvoiceListBreakdownsPage,
    ) : Iterable<CustomerInvoiceListBreakdownsResponse> {

        override fun iterator(): Iterator<CustomerInvoiceListBreakdownsResponse> = iterator {
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

        fun stream(): Stream<CustomerInvoiceListBreakdownsResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
