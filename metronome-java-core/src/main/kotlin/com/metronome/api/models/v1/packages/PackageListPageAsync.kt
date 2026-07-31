// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.packages

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.PackageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PackageServiceAsync.list */
class PackageListPageAsync
private constructor(
    private val service: PackageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PackageListParams,
    private val response: PackageListPageResponse,
) : PageAsync<PackageListResponse> {

    /**
     * Delegates to [PackageListPageResponse], but gracefully handles missing data.
     *
     * @see PackageListPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [PackageListPageResponse], but gracefully handles missing data.
     *
     * @see PackageListPageResponse.data
     */
    fun data(): List<PackageListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<PackageListResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): PackageListParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PackageListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PackageListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PackageListParams = params

    /** The response that this page was parsed from. */
    fun response(): PackageListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PackageListPageAsync].
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

    /** A builder for [PackageListPageAsync]. */
    class Builder internal constructor() {

        private var service: PackageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PackageListParams? = null
        private var response: PackageListPageResponse? = null

        @JvmSynthetic
        internal fun from(packageListPageAsync: PackageListPageAsync) = apply {
            service = packageListPageAsync.service
            streamHandlerExecutor = packageListPageAsync.streamHandlerExecutor
            params = packageListPageAsync.params
            response = packageListPageAsync.response
        }

        fun service(service: PackageServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PackageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PackageListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PackageListPageAsync].
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
        fun build(): PackageListPageAsync =
            PackageListPageAsync(
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

        return other is PackageListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PackageListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
