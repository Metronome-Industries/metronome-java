// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.alerts

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.customers.AlertServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AlertServiceAsync.list */
class AlertListPageAsync
private constructor(
    private val service: AlertServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AlertListParams,
    private val response: AlertListPageResponse,
) : PageAsync<CustomerAlert> {

    /**
     * Delegates to [AlertListPageResponse], but gracefully handles missing data.
     *
     * @see AlertListPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [AlertListPageResponse], but gracefully handles missing data.
     *
     * @see AlertListPageResponse.data
     */
    fun data(): List<CustomerAlert> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<CustomerAlert> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): AlertListParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AlertListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerAlert> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AlertListParams = params

    /** The response that this page was parsed from. */
    fun response(): AlertListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlertListPageAsync].
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

    /** A builder for [AlertListPageAsync]. */
    class Builder internal constructor() {

        private var service: AlertServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AlertListParams? = null
        private var response: AlertListPageResponse? = null

        @JvmSynthetic
        internal fun from(alertListPageAsync: AlertListPageAsync) = apply {
            service = alertListPageAsync.service
            streamHandlerExecutor = alertListPageAsync.streamHandlerExecutor
            params = alertListPageAsync.params
            response = alertListPageAsync.response
        }

        fun service(service: AlertServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AlertListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AlertListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AlertListPageAsync].
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
        fun build(): AlertListPageAsync =
            AlertListPageAsync(
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

        return other is AlertListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AlertListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
