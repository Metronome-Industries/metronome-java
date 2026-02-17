// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.plans

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.customers.PlanServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PlanServiceAsync.list */
class PlanListPageAsync
private constructor(
    private val service: PlanServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PlanListParams,
    private val response: PlanListPageResponse,
) : PageAsync<PlanListResponse> {

    /**
     * Delegates to [PlanListPageResponse], but gracefully handles missing data.
     *
     * @see PlanListPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [PlanListPageResponse], but gracefully handles missing data.
     *
     * @see PlanListPageResponse.data
     */
    fun data(): List<PlanListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<PlanListResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): PlanListParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PlanListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PlanListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PlanListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanListPageAsync].
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

    /** A builder for [PlanListPageAsync]. */
    class Builder internal constructor() {

        private var service: PlanServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PlanListParams? = null
        private var response: PlanListPageResponse? = null

        @JvmSynthetic
        internal fun from(planListPageAsync: PlanListPageAsync) = apply {
            service = planListPageAsync.service
            streamHandlerExecutor = planListPageAsync.streamHandlerExecutor
            params = planListPageAsync.params
            response = planListPageAsync.response
        }

        fun service(service: PlanServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PlanListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanListPageAsync].
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
        fun build(): PlanListPageAsync =
            PlanListPageAsync(
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

        return other is PlanListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PlanListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
