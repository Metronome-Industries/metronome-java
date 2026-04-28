// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.invoices

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.customers.InvoiceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see InvoiceServiceAsync.listBreakdowns */
class InvoiceListBreakdownsPageAsync
private constructor(
    private val service: InvoiceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: InvoiceListBreakdownsParams,
    private val response: InvoiceListBreakdownsPageResponse,
) : PageAsync<InvoiceListBreakdownsResponse> {

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

    override fun nextPage(): CompletableFuture<InvoiceListBreakdownsPageAsync> =
        service.listBreakdowns(nextPageParams())

    fun autoPager(): AutoPagerAsync<InvoiceListBreakdownsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): InvoiceListBreakdownsParams = params

    /** The response that this page was parsed from. */
    fun response(): InvoiceListBreakdownsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InvoiceListBreakdownsPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvoiceListBreakdownsPageAsync]. */
    class Builder internal constructor() {

        private var service: InvoiceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: InvoiceListBreakdownsParams? = null
        private var response: InvoiceListBreakdownsPageResponse? = null

        @JvmSynthetic
        internal fun from(invoiceListBreakdownsPageAsync: InvoiceListBreakdownsPageAsync) = apply {
            service = invoiceListBreakdownsPageAsync.service
            streamHandlerExecutor = invoiceListBreakdownsPageAsync.streamHandlerExecutor
            params = invoiceListBreakdownsPageAsync.params
            response = invoiceListBreakdownsPageAsync.response
        }

        fun service(service: InvoiceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: InvoiceListBreakdownsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InvoiceListBreakdownsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InvoiceListBreakdownsPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceListBreakdownsPageAsync =
            InvoiceListBreakdownsPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceListBreakdownsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "InvoiceListBreakdownsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
