// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.commits

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.models.Commit
import com.metronome.api.services.async.v1.customers.CommitServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CommitServiceAsync.list */
class CommitListPageAsync
private constructor(
    private val service: CommitServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CommitListParams,
    private val response: CommitListPageResponse,
) : PageAsync<Commit> {

    /**
     * Delegates to [CommitListPageResponse], but gracefully handles missing data.
     *
     * @see CommitListPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [CommitListPageResponse], but gracefully handles missing data.
     *
     * @see CommitListPageResponse.data
     */
    fun data(): List<Commit> = response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<Commit> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): CommitListParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CommitListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Commit> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CommitListParams = params

    /** The response that this page was parsed from. */
    fun response(): CommitListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommitListPageAsync].
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

    /** A builder for [CommitListPageAsync]. */
    class Builder internal constructor() {

        private var service: CommitServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CommitListParams? = null
        private var response: CommitListPageResponse? = null

        @JvmSynthetic
        internal fun from(commitListPageAsync: CommitListPageAsync) = apply {
            service = commitListPageAsync.service
            streamHandlerExecutor = commitListPageAsync.streamHandlerExecutor
            params = commitListPageAsync.params
            response = commitListPageAsync.response
        }

        fun service(service: CommitServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CommitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CommitListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CommitListPageAsync].
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
        fun build(): CommitListPageAsync =
            CommitListPageAsync(
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

        return other is CommitListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CommitListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
