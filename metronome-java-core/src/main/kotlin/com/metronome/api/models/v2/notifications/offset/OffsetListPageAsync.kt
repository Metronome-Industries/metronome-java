// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.notifications.offset

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.models.v2.notifications.LifecycleEventOffsetNotificationConfig
import com.metronome.api.services.async.v2.notifications.OffsetServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see OffsetServiceAsync.list */
class OffsetListPageAsync
private constructor(
    private val service: OffsetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OffsetListParams,
    private val response: OffsetListPageResponse,
) : PageAsync<LifecycleEventOffsetNotificationConfig> {

    /**
     * Delegates to [OffsetListPageResponse], but gracefully handles missing data.
     *
     * @see OffsetListPageResponse.cursor
     */
    fun cursor(): Optional<String> = response._cursor().getOptional("cursor")

    /**
     * Delegates to [OffsetListPageResponse], but gracefully handles missing data.
     *
     * @see OffsetListPageResponse.data
     */
    fun data(): List<LifecycleEventOffsetNotificationConfig> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<LifecycleEventOffsetNotificationConfig> = data()

    override fun hasNextPage(): Boolean = cursor().isPresent

    fun nextPageParams(): OffsetListParams {
        val nextCursor =
            cursor().getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<OffsetListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LifecycleEventOffsetNotificationConfig> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OffsetListParams = params

    /** The response that this page was parsed from. */
    fun response(): OffsetListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OffsetListPageAsync].
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

    /** A builder for [OffsetListPageAsync]. */
    class Builder internal constructor() {

        private var service: OffsetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OffsetListParams? = null
        private var response: OffsetListPageResponse? = null

        @JvmSynthetic
        internal fun from(offsetListPageAsync: OffsetListPageAsync) = apply {
            service = offsetListPageAsync.service
            streamHandlerExecutor = offsetListPageAsync.streamHandlerExecutor
            params = offsetListPageAsync.params
            response = offsetListPageAsync.response
        }

        fun service(service: OffsetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OffsetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OffsetListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OffsetListPageAsync].
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
        fun build(): OffsetListPageAsync =
            OffsetListPageAsync(
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

        return other is OffsetListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "OffsetListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
