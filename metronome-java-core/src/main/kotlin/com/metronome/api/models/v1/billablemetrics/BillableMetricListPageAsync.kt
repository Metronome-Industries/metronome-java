// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.billablemetrics

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.BillableMetricServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see BillableMetricServiceAsync.list */
class BillableMetricListPageAsync
private constructor(
    private val service: BillableMetricServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BillableMetricListParams,
    private val response: BillableMetricListPageResponse,
) : PageAsync<BillableMetricListResponse> {

    /**
     * Delegates to [BillableMetricListPageResponse], but gracefully handles missing data.
     *
     * @see BillableMetricListPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [BillableMetricListPageResponse], but gracefully handles missing data.
     *
     * @see BillableMetricListPageResponse.data
     */
    fun data(): List<BillableMetricListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<BillableMetricListResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): BillableMetricListParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BillableMetricListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BillableMetricListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BillableMetricListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillableMetricListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillableMetricListPageAsync].
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

    /** A builder for [BillableMetricListPageAsync]. */
    class Builder internal constructor() {

        private var service: BillableMetricServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BillableMetricListParams? = null
        private var response: BillableMetricListPageResponse? = null

        @JvmSynthetic
        internal fun from(billableMetricListPageAsync: BillableMetricListPageAsync) = apply {
            service = billableMetricListPageAsync.service
            streamHandlerExecutor = billableMetricListPageAsync.streamHandlerExecutor
            params = billableMetricListPageAsync.params
            response = billableMetricListPageAsync.response
        }

        fun service(service: BillableMetricServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BillableMetricListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillableMetricListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BillableMetricListPageAsync].
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
        fun build(): BillableMetricListPageAsync =
            BillableMetricListPageAsync(
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

        return other is BillableMetricListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BillableMetricListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
