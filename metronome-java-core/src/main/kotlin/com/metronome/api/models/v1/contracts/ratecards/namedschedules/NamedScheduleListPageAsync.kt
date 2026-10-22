// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards.namedschedules

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.contracts.ratecards.NamedScheduleServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see NamedScheduleServiceAsync.list */
class NamedScheduleListPageAsync
private constructor(
    private val service: NamedScheduleServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NamedScheduleListParams,
    private val response: NamedScheduleListPageResponse,
) : PageAsync<NamedScheduleListResponse> {

    /**
     * Delegates to [NamedScheduleListPageResponse], but gracefully handles missing data.
     *
     * @see NamedScheduleListPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [NamedScheduleListPageResponse], but gracefully handles missing data.
     *
     * @see NamedScheduleListPageResponse.data
     */
    fun data(): List<NamedScheduleListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<NamedScheduleListResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): NamedScheduleListParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<NamedScheduleListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NamedScheduleListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NamedScheduleListParams = params

    /** The response that this page was parsed from. */
    fun response(): NamedScheduleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NamedScheduleListPageAsync].
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

    /** A builder for [NamedScheduleListPageAsync]. */
    class Builder internal constructor() {

        private var service: NamedScheduleServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NamedScheduleListParams? = null
        private var response: NamedScheduleListPageResponse? = null

        @JvmSynthetic
        internal fun from(namedScheduleListPageAsync: NamedScheduleListPageAsync) = apply {
            service = namedScheduleListPageAsync.service
            streamHandlerExecutor = namedScheduleListPageAsync.streamHandlerExecutor
            params = namedScheduleListPageAsync.params
            response = namedScheduleListPageAsync.response
        }

        fun service(service: NamedScheduleServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NamedScheduleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NamedScheduleListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [NamedScheduleListPageAsync].
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
        fun build(): NamedScheduleListPageAsync =
            NamedScheduleListPageAsync(
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

        return other is NamedScheduleListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NamedScheduleListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
