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

/** @see UsageServiceAsync.listWithGroups */
class UsageListWithGroupsPageAsync
private constructor(
    private val service: UsageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: UsageListWithGroupsParams,
    private val response: UsageListWithGroupsPageResponse,
) : PageAsync<UsageListWithGroupsResponse> {

    /**
     * Delegates to [UsageListWithGroupsPageResponse], but gracefully handles missing data.
     *
     * @see UsageListWithGroupsPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [UsageListWithGroupsPageResponse], but gracefully handles missing data.
     *
     * @see UsageListWithGroupsPageResponse.data
     */
    fun data(): List<UsageListWithGroupsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<UsageListWithGroupsResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): UsageListWithGroupsParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<UsageListWithGroupsPageAsync> =
        service.listWithGroups(nextPageParams())

    fun autoPager(): AutoPagerAsync<UsageListWithGroupsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): UsageListWithGroupsParams = params

    /** The response that this page was parsed from. */
    fun response(): UsageListWithGroupsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageListWithGroupsPageAsync].
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

    /** A builder for [UsageListWithGroupsPageAsync]. */
    class Builder internal constructor() {

        private var service: UsageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: UsageListWithGroupsParams? = null
        private var response: UsageListWithGroupsPageResponse? = null

        @JvmSynthetic
        internal fun from(usageListWithGroupsPageAsync: UsageListWithGroupsPageAsync) = apply {
            service = usageListWithGroupsPageAsync.service
            streamHandlerExecutor = usageListWithGroupsPageAsync.streamHandlerExecutor
            params = usageListWithGroupsPageAsync.params
            response = usageListWithGroupsPageAsync.response
        }

        fun service(service: UsageServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: UsageListWithGroupsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UsageListWithGroupsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UsageListWithGroupsPageAsync].
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
        fun build(): UsageListWithGroupsPageAsync =
            UsageListWithGroupsPageAsync(
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

        return other is UsageListWithGroupsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "UsageListWithGroupsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
