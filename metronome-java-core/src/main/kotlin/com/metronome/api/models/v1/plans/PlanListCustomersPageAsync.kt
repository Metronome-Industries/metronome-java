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

/** @see PlanServiceAsync.listCustomers */
class PlanListCustomersPageAsync
private constructor(
    private val service: PlanServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PlanListCustomersParams,
    private val response: PlanListCustomersPageResponse,
) : PageAsync<PlanListCustomersResponse> {

    /**
     * Delegates to [PlanListCustomersPageResponse], but gracefully handles missing data.
     *
     * @see PlanListCustomersPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [PlanListCustomersPageResponse], but gracefully handles missing data.
     *
     * @see PlanListCustomersPageResponse.data
     */
    fun data(): List<PlanListCustomersResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<PlanListCustomersResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): PlanListCustomersParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PlanListCustomersPageAsync> =
        service.listCustomers(nextPageParams())

    fun autoPager(): AutoPagerAsync<PlanListCustomersResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PlanListCustomersParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanListCustomersPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanListCustomersPageAsync].
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

    /** A builder for [PlanListCustomersPageAsync]. */
    class Builder internal constructor() {

        private var service: PlanServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PlanListCustomersParams? = null
        private var response: PlanListCustomersPageResponse? = null

        @JvmSynthetic
        internal fun from(planListCustomersPageAsync: PlanListCustomersPageAsync) = apply {
            service = planListCustomersPageAsync.service
            streamHandlerExecutor = planListCustomersPageAsync.streamHandlerExecutor
            params = planListCustomersPageAsync.params
            response = planListCustomersPageAsync.response
        }

        fun service(service: PlanServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PlanListCustomersParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanListCustomersPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanListCustomersPageAsync].
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
        fun build(): PlanListCustomersPageAsync =
            PlanListCustomersPageAsync(
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

        return other is PlanListCustomersPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PlanListCustomersPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
