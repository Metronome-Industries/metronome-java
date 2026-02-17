// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.contracts.RateCardServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see RateCardServiceAsync.list */
class RateCardListPageAsync
private constructor(
    private val service: RateCardServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RateCardListParams,
    private val response: RateCardListPageResponse,
) : PageAsync<RateCardListResponse> {

    /**
     * Delegates to [RateCardListPageResponse], but gracefully handles missing data.
     *
     * @see RateCardListPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [RateCardListPageResponse], but gracefully handles missing data.
     *
     * @see RateCardListPageResponse.data
     */
    fun data(): List<RateCardListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<RateCardListResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): RateCardListParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<RateCardListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RateCardListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RateCardListParams = params

    /** The response that this page was parsed from. */
    fun response(): RateCardListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RateCardListPageAsync].
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

    /** A builder for [RateCardListPageAsync]. */
    class Builder internal constructor() {

        private var service: RateCardServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RateCardListParams? = null
        private var response: RateCardListPageResponse? = null

        @JvmSynthetic
        internal fun from(rateCardListPageAsync: RateCardListPageAsync) = apply {
            service = rateCardListPageAsync.service
            streamHandlerExecutor = rateCardListPageAsync.streamHandlerExecutor
            params = rateCardListPageAsync.params
            response = rateCardListPageAsync.response
        }

        fun service(service: RateCardServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RateCardListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RateCardListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RateCardListPageAsync].
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
        fun build(): RateCardListPageAsync =
            RateCardListPageAsync(
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

        return other is RateCardListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RateCardListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
