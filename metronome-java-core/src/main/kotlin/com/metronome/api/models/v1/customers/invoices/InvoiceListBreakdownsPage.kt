// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.invoices

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.customers.InvoiceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see InvoiceService.listBreakdowns */
class InvoiceListBreakdownsPage
private constructor(
    private val service: InvoiceService,
    private val params: InvoiceListBreakdownsParams,
    private val response: InvoiceListBreakdownsPageResponse,
) : Page<InvoiceListBreakdownsResponse> {

    /**
     * Delegates to [InvoiceListBreakdownsPageResponse], but gracefully handles missing data.
     *
     * @see InvoiceListBreakdownsPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [InvoiceListBreakdownsPageResponse], but gracefully handles missing data.
     *
     * @see InvoiceListBreakdownsPageResponse.data
     */
    fun data(): List<InvoiceListBreakdownsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<InvoiceListBreakdownsResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): InvoiceListBreakdownsParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): InvoiceListBreakdownsPage = service.listBreakdowns(nextPageParams())

    fun autoPager(): AutoPager<InvoiceListBreakdownsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InvoiceListBreakdownsParams = params

    /** The response that this page was parsed from. */
    fun response(): InvoiceListBreakdownsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceListBreakdownsPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvoiceListBreakdownsPage]. */
    class Builder internal constructor() {

        private var service: InvoiceService? = null
        private var params: InvoiceListBreakdownsParams? = null
        private var response: InvoiceListBreakdownsPageResponse? = null

        @JvmSynthetic
        internal fun from(invoiceListBreakdownsPage: InvoiceListBreakdownsPage) = apply {
            service = invoiceListBreakdownsPage.service
            params = invoiceListBreakdownsPage.params
            response = invoiceListBreakdownsPage.response
        }

        fun service(service: InvoiceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InvoiceListBreakdownsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InvoiceListBreakdownsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InvoiceListBreakdownsPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceListBreakdownsPage =
            InvoiceListBreakdownsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceListBreakdownsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InvoiceListBreakdownsPage{service=$service, params=$params, response=$response}"
}
