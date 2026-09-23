// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.contracts

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.models.ContractV2
import com.metronome.api.services.async.v2.ContractServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ContractServiceAsync.list */
class ContractListPageAsync
private constructor(
    private val service: ContractServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ContractListParams,
    private val response: ContractListPageResponse,
) : PageAsync<ContractV2> {

    /**
     * Delegates to [ContractListPageResponse], but gracefully handles missing data.
     *
     * @see ContractListPageResponse.cursor
     */
    fun cursor(): Optional<String> = response._cursor().getOptional("cursor")

    /**
     * Delegates to [ContractListPageResponse], but gracefully handles missing data.
     *
     * @see ContractListPageResponse.data
     */
    fun data(): List<ContractV2> = response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<ContractV2> = data()

    override fun hasNextPage(): Boolean = cursor().isPresent

    fun nextPageParams(): ContractListParams {
        val nextCursor =
            cursor().getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ContractListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ContractV2> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ContractListParams = params

    /** The response that this page was parsed from. */
    fun response(): ContractListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ContractListPageAsync].
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

    /** A builder for [ContractListPageAsync]. */
    class Builder internal constructor() {

        private var service: ContractServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ContractListParams? = null
        private var response: ContractListPageResponse? = null

        @JvmSynthetic
        internal fun from(contractListPageAsync: ContractListPageAsync) = apply {
            service = contractListPageAsync.service
            streamHandlerExecutor = contractListPageAsync.streamHandlerExecutor
            params = contractListPageAsync.params
            response = contractListPageAsync.response
        }

        fun service(service: ContractServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ContractListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ContractListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ContractListPageAsync].
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
        fun build(): ContractListPageAsync =
            ContractListPageAsync(
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

        return other is ContractListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ContractListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
