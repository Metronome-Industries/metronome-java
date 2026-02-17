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

/** @see CustomerServiceAsync.list */
class CustomerListPageAsync
private constructor(
    private val service: CustomerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CustomerListParams,
    private val response: CustomerListPageResponse,
) : PageAsync<CustomerDetail> {

    /**
     * Delegates to [CustomerListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [CustomerListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListPageResponse.data
     */
    fun data(): List<CustomerDetail> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<CustomerDetail> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): CustomerListParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CustomerListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerDetail> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerListPageAsync].
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

    /** A builder for [CustomerListPageAsync]. */
    class Builder internal constructor() {

        private var service: CustomerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CustomerListParams? = null
        private var response: CustomerListPageResponse? = null

        @JvmSynthetic
        internal fun from(customerListPageAsync: CustomerListPageAsync) = apply {
            service = customerListPageAsync.service
            streamHandlerExecutor = customerListPageAsync.streamHandlerExecutor
            params = customerListPageAsync.params
            response = customerListPageAsync.response
        }

        fun service(service: CustomerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CustomerListPageAsync].
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
        fun build(): CustomerListPageAsync =
            CustomerListPageAsync(
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

        return other is CustomerListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CustomerListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
