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
import com.metronome.api.services.blocking.v1.customers.InvoiceService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

/**
 * Retrieves a paginated list of invoices for a specific customer, with flexible filtering options
 * to narrow results by status, date range, credit type, and more. This endpoint provides a
 * comprehensive view of a customer's billing history and current charges, supporting both real-time
 * billing dashboards and historical reporting needs.
 *
 * ### Use this endpoint to:
 * - Display historical invoice details in customer-facing dashboards or billing portals.
 * - Retrieve current month draft invoices to show customers their month-to-date spend.
 * - Access finalized invoices for historical billing records and payment reconciliation.
 * - Validate customer pricing and credit applications for customer support queries.
 * - Generate financial reports by filtering invoices within specific date ranges
 *
 * ### Key response fields:
 *
 * Array of invoice objects containing:
 * - Invoice ID and status (DRAFT, FINALIZED, VOID)
 * - Invoice type (USAGE, SCHEDULED)
 * - Billing period start and end dates
 * - Issue date and due date
 * - Total amount, subtotal, and amount due
 * - Applied credits summary
 * - Contract ID reference
 * - External billing provider status (if integrated with Stripe, etc.)
 * - Pagination metadata `next_page` cursor
 *
 * ### Usage guidelines:
 * - The endpoint returns invoice summaries; use the Get Invoice endpoint for detailed line items
 * - Draft invoices are continuously updated as new usage is reported and will show real-time spend
 * - Results are ordered by creation date descending by default (newest first)
 * - When filtering by date range, the filter applies to the billing period, not the issue date
 * - For customers with many invoices, implement pagination to ensure all results are retrieved
 *   External billing provider statuses (like Stripe payment status) are included when applicable
 * - Voided invoices are included in results by default unless filtered out by status
 */
class V1CustomerInvoiceListPage
private constructor(
    private val invoicesService: InvoiceService,
    private val params: V1CustomerInvoiceListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun nextPage(): Optional<String> = response().nextPage()

    fun data(): List<Invoice> = response().data()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1CustomerInvoiceListPage && invoicesService == other.invoicesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(invoicesService, params, response) /* spotless:on */

    override fun toString() =
        "V1CustomerInvoiceListPage{invoicesService=$invoicesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextPage().isPresent
    }

    fun getNextPageParams(): Optional<V1CustomerInvoiceListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            V1CustomerInvoiceListParams.builder()
                .from(params)
                .apply { nextPage().ifPresent { this.nextPage(it) } }
                .build()
        )
    }

    fun getNextPage(): Optional<V1CustomerInvoiceListPage> {
        return getNextPageParams().map { invoicesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            invoicesService: InvoiceService,
            params: V1CustomerInvoiceListParams,
            response: Response,
        ) = V1CustomerInvoiceListPage(invoicesService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("next_page") private val nextPage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") private val data: JsonField<List<Invoice>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

        fun data(): List<Invoice> = data.getNullable("data") ?: listOf()

        @JsonProperty("next_page")
        fun _nextPage(): Optional<JsonField<String>> = Optional.ofNullable(nextPage)

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<Invoice>>> = Optional.ofNullable(data)

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
            private var data: JsonField<List<Invoice>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.nextPage = page.nextPage
                this.data = page.data
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            fun data(data: List<Invoice>) = data(JsonField.of(data))

            fun data(data: JsonField<List<Invoice>>) = apply { this.data = data }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(nextPage, data, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: V1CustomerInvoiceListPage) : Iterable<Invoice> {

        override fun iterator(): Iterator<Invoice> = iterator {
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

        fun stream(): Stream<Invoice> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
