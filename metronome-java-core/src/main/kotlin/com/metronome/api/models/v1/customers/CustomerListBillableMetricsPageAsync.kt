// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.CustomerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CustomerServiceAsync.listBillableMetrics */
class CustomerListBillableMetricsPageAsync
private constructor(
    private val service: CustomerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CustomerListBillableMetricsParams,
    private val response: CustomerListBillableMetricsPageResponse,
) : PageAsync<CustomerListBillableMetricsResponse> {

    /**
     * Delegates to [CustomerListBillableMetricsPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListBillableMetricsPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [CustomerListBillableMetricsPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListBillableMetricsPageResponse.data
     */
    fun data(): List<CustomerListBillableMetricsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<CustomerListBillableMetricsResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): CustomerListBillableMetricsParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CustomerListBillableMetricsPageAsync> =
        service.listBillableMetrics(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerListBillableMetricsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListBillableMetricsParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerListBillableMetricsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerListBillableMetricsPageAsync].
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

    /** A builder for [CustomerListBillableMetricsPageAsync]. */
    class Builder internal constructor() {

        private var service: CustomerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CustomerListBillableMetricsParams? = null
        private var response: CustomerListBillableMetricsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            customerListBillableMetricsPageAsync: CustomerListBillableMetricsPageAsync
        ) = apply {
            service = customerListBillableMetricsPageAsync.service
            streamHandlerExecutor = customerListBillableMetricsPageAsync.streamHandlerExecutor
            params = customerListBillableMetricsPageAsync.params
            response = customerListBillableMetricsPageAsync.response
        }

        fun service(service: CustomerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListBillableMetricsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerListBillableMetricsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerListBillableMetricsPageAsync].
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
        fun build(): CustomerListBillableMetricsPageAsync =
            CustomerListBillableMetricsPageAsync(
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

        return other is CustomerListBillableMetricsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CustomerListBillableMetricsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
