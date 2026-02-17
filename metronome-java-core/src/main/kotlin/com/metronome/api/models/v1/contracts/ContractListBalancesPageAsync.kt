// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.ContractServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ContractServiceAsync.listBalances */
class ContractListBalancesPageAsync
private constructor(
    private val service: ContractServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ContractListBalancesParams,
    private val response: ContractListBalancesPageResponse,
) : PageAsync<ContractListBalancesResponse> {

    /**
     * Delegates to [ContractListBalancesPageResponse], but gracefully handles missing data.
     *
     * @see ContractListBalancesPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [ContractListBalancesPageResponse], but gracefully handles missing data.
     *
     * @see ContractListBalancesPageResponse.data
     */
    fun data(): List<ContractListBalancesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<ContractListBalancesResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): ContractListBalancesParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ContractListBalancesPageAsync> =
        service.listBalances(nextPageParams())

    fun autoPager(): AutoPagerAsync<ContractListBalancesResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ContractListBalancesParams = params

    /** The response that this page was parsed from. */
    fun response(): ContractListBalancesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ContractListBalancesPageAsync].
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

    /** A builder for [ContractListBalancesPageAsync]. */
    class Builder internal constructor() {

        private var service: ContractServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ContractListBalancesParams? = null
        private var response: ContractListBalancesPageResponse? = null

        @JvmSynthetic
        internal fun from(contractListBalancesPageAsync: ContractListBalancesPageAsync) = apply {
            service = contractListBalancesPageAsync.service
            streamHandlerExecutor = contractListBalancesPageAsync.streamHandlerExecutor
            params = contractListBalancesPageAsync.params
            response = contractListBalancesPageAsync.response
        }

        fun service(service: ContractServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ContractListBalancesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ContractListBalancesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ContractListBalancesPageAsync].
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
        fun build(): ContractListBalancesPageAsync =
            ContractListBalancesPageAsync(
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

        return other is ContractListBalancesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ContractListBalancesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
