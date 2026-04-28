// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.plans

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.PlanServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PlanServiceAsync.listCharges */
class PlanListChargesPageAsync
private constructor(
    private val service: PlanServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PlanListChargesParams,
    private val response: PlanListChargesPageResponse,
) : PageAsync<PlanListChargesResponse> {

    /**
     * Delegates to [PlanListChargesPageResponse], but gracefully handles missing data.
     *
     * @see PlanListChargesPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [PlanListChargesPageResponse], but gracefully handles missing data.
     *
     * @see PlanListChargesPageResponse.data
     */
    fun data(): List<PlanListChargesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<PlanListChargesResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): PlanListChargesParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PlanListChargesPageAsync> =
        service.listCharges(nextPageParams())

    fun autoPager(): AutoPagerAsync<PlanListChargesResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PlanListChargesParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanListChargesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanListChargesPageAsync].
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

    /** A builder for [PlanListChargesPageAsync]. */
    class Builder internal constructor() {

        private var service: PlanServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PlanListChargesParams? = null
        private var response: PlanListChargesPageResponse? = null

        @JvmSynthetic
        internal fun from(planListChargesPageAsync: PlanListChargesPageAsync) = apply {
            service = planListChargesPageAsync.service
            streamHandlerExecutor = planListChargesPageAsync.streamHandlerExecutor
            params = planListChargesPageAsync.params
            response = planListChargesPageAsync.response
        }

        fun service(service: PlanServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PlanListChargesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanListChargesPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanListChargesPageAsync].
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
        fun build(): PlanListChargesPageAsync =
            PlanListChargesPageAsync(
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

        return other is PlanListChargesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PlanListChargesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
