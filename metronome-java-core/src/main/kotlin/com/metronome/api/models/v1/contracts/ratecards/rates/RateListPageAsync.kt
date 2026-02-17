// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards.rates

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.contracts.ratecards.RateServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see RateServiceAsync.list */
class RateListPageAsync
private constructor(
    private val service: RateServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RateListParams,
    private val response: RateListPageResponse,
) : PageAsync<RateListResponse> {

    /**
     * Delegates to [RateListPageResponse], but gracefully handles missing data.
     *
     * @see RateListPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [RateListPageResponse], but gracefully handles missing data.
     *
     * @see RateListPageResponse.data
     */
    fun data(): List<RateListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<RateListResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): RateListParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<RateListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RateListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RateListParams = params

    /** The response that this page was parsed from. */
    fun response(): RateListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RateListPageAsync].
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

    /** A builder for [RateListPageAsync]. */
    class Builder internal constructor() {

        private var service: RateServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RateListParams? = null
        private var response: RateListPageResponse? = null

        @JvmSynthetic
        internal fun from(rateListPageAsync: RateListPageAsync) = apply {
            service = rateListPageAsync.service
            streamHandlerExecutor = rateListPageAsync.streamHandlerExecutor
            params = rateListPageAsync.params
            response = rateListPageAsync.response
        }

        fun service(service: RateServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RateListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RateListPageAsync].
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
        fun build(): RateListPageAsync =
            RateListPageAsync(
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

        return other is RateListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RateListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
