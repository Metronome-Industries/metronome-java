// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.usage

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.UsageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see UsageServiceAsync.list */
class UsageListPageAsync
private constructor(
    private val service: UsageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: UsageListParams,
    private val response: UsageListPageResponse,
) : PageAsync<UsageListResponse> {

    /**
     * Delegates to [UsageListPageResponse], but gracefully handles missing data.
     *
     * @see UsageListPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [UsageListPageResponse], but gracefully handles missing data.
     *
     * @see UsageListPageResponse.data
     */
    fun data(): List<UsageListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<UsageListResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): UsageListParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<UsageListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<UsageListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): UsageListParams = params

    /** The response that this page was parsed from. */
    fun response(): UsageListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageListPageAsync].
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

    /** A builder for [UsageListPageAsync]. */
    class Builder internal constructor() {

        private var service: UsageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: UsageListParams? = null
        private var response: UsageListPageResponse? = null

        @JvmSynthetic
        internal fun from(usageListPageAsync: UsageListPageAsync) = apply {
            service = usageListPageAsync.service
            streamHandlerExecutor = usageListPageAsync.streamHandlerExecutor
            params = usageListPageAsync.params
            response = usageListPageAsync.response
        }

        fun service(service: UsageServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: UsageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UsageListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UsageListPageAsync].
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
        fun build(): UsageListPageAsync =
            UsageListPageAsync(
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

        return other is UsageListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "UsageListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
