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

/** @see PlanServiceAsync.listPriceAdjustments */
class PlanListPriceAdjustmentsPageAsync
private constructor(
    private val service: PlanServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PlanListPriceAdjustmentsParams,
    private val response: PlanListPriceAdjustmentsPageResponse,
) : PageAsync<PlanListPriceAdjustmentsResponse> {

    /**
     * Delegates to [PlanListPriceAdjustmentsPageResponse], but gracefully handles missing data.
     *
     * @see PlanListPriceAdjustmentsPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [PlanListPriceAdjustmentsPageResponse], but gracefully handles missing data.
     *
     * @see PlanListPriceAdjustmentsPageResponse.data
     */
    fun data(): List<PlanListPriceAdjustmentsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<PlanListPriceAdjustmentsResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): PlanListPriceAdjustmentsParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PlanListPriceAdjustmentsPageAsync> =
        service.listPriceAdjustments(nextPageParams())

    fun autoPager(): AutoPagerAsync<PlanListPriceAdjustmentsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PlanListPriceAdjustmentsParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanListPriceAdjustmentsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PlanListPriceAdjustmentsPageAsync].
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

    /** A builder for [PlanListPriceAdjustmentsPageAsync]. */
    class Builder internal constructor() {

        private var service: PlanServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PlanListPriceAdjustmentsParams? = null
        private var response: PlanListPriceAdjustmentsPageResponse? = null

        @JvmSynthetic
        internal fun from(planListPriceAdjustmentsPageAsync: PlanListPriceAdjustmentsPageAsync) =
            apply {
                service = planListPriceAdjustmentsPageAsync.service
                streamHandlerExecutor = planListPriceAdjustmentsPageAsync.streamHandlerExecutor
                params = planListPriceAdjustmentsPageAsync.params
                response = planListPriceAdjustmentsPageAsync.response
            }

        fun service(service: PlanServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PlanListPriceAdjustmentsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanListPriceAdjustmentsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PlanListPriceAdjustmentsPageAsync].
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
        fun build(): PlanListPriceAdjustmentsPageAsync =
            PlanListPriceAdjustmentsPageAsync(
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

        return other is PlanListPriceAdjustmentsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PlanListPriceAdjustmentsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
