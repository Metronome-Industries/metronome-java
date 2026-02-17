// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.pricingunits

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.PricingUnitServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PricingUnitServiceAsync.list */
class PricingUnitListPageAsync
private constructor(
    private val service: PricingUnitServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PricingUnitListParams,
    private val response: PricingUnitListPageResponse,
) : PageAsync<PricingUnitListResponse> {

    /**
     * Delegates to [PricingUnitListPageResponse], but gracefully handles missing data.
     *
     * @see PricingUnitListPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [PricingUnitListPageResponse], but gracefully handles missing data.
     *
     * @see PricingUnitListPageResponse.data
     */
    fun data(): List<PricingUnitListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<PricingUnitListResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): PricingUnitListParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PricingUnitListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PricingUnitListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PricingUnitListParams = params

    /** The response that this page was parsed from. */
    fun response(): PricingUnitListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PricingUnitListPageAsync].
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

    /** A builder for [PricingUnitListPageAsync]. */
    class Builder internal constructor() {

        private var service: PricingUnitServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PricingUnitListParams? = null
        private var response: PricingUnitListPageResponse? = null

        @JvmSynthetic
        internal fun from(pricingUnitListPageAsync: PricingUnitListPageAsync) = apply {
            service = pricingUnitListPageAsync.service
            streamHandlerExecutor = pricingUnitListPageAsync.streamHandlerExecutor
            params = pricingUnitListPageAsync.params
            response = pricingUnitListPageAsync.response
        }

        fun service(service: PricingUnitServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PricingUnitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PricingUnitListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PricingUnitListPageAsync].
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
        fun build(): PricingUnitListPageAsync =
            PricingUnitListPageAsync(
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

        return other is PricingUnitListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PricingUnitListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
