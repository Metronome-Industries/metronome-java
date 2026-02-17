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

/** @see CustomerServiceAsync.listCosts */
class CustomerListCostsPageAsync
private constructor(
    private val service: CustomerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CustomerListCostsParams,
    private val response: CustomerListCostsPageResponse,
) : PageAsync<CustomerListCostsResponse> {

    /**
     * Delegates to [CustomerListCostsPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListCostsPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [CustomerListCostsPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListCostsPageResponse.data
     */
    fun data(): List<CustomerListCostsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<CustomerListCostsResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): CustomerListCostsParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CustomerListCostsPageAsync> =
        service.listCosts(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerListCostsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListCostsParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerListCostsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerListCostsPageAsync].
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

    /** A builder for [CustomerListCostsPageAsync]. */
    class Builder internal constructor() {

        private var service: CustomerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CustomerListCostsParams? = null
        private var response: CustomerListCostsPageResponse? = null

        @JvmSynthetic
        internal fun from(customerListCostsPageAsync: CustomerListCostsPageAsync) = apply {
            service = customerListCostsPageAsync.service
            streamHandlerExecutor = customerListCostsPageAsync.streamHandlerExecutor
            params = customerListCostsPageAsync.params
            response = customerListCostsPageAsync.response
        }

        fun service(service: CustomerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListCostsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerListCostsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CustomerListCostsPageAsync].
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
        fun build(): CustomerListCostsPageAsync =
            CustomerListCostsPageAsync(
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

        return other is CustomerListCostsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CustomerListCostsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
