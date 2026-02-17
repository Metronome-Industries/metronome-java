// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.credits

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.models.Credit
import com.metronome.api.services.async.v1.customers.CreditServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CreditServiceAsync.list */
class CreditListPageAsync
private constructor(
    private val service: CreditServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CreditListParams,
    private val response: CreditListPageResponse,
) : PageAsync<Credit> {

    /**
     * Delegates to [CreditListPageResponse], but gracefully handles missing data.
     *
     * @see CreditListPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [CreditListPageResponse], but gracefully handles missing data.
     *
     * @see CreditListPageResponse.data
     */
    fun data(): List<Credit> = response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<Credit> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): CreditListParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CreditListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Credit> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CreditListParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditListPageAsync].
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

    /** A builder for [CreditListPageAsync]. */
    class Builder internal constructor() {

        private var service: CreditServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CreditListParams? = null
        private var response: CreditListPageResponse? = null

        @JvmSynthetic
        internal fun from(creditListPageAsync: CreditListPageAsync) = apply {
            service = creditListPageAsync.service
            streamHandlerExecutor = creditListPageAsync.streamHandlerExecutor
            params = creditListPageAsync.params
            response = creditListPageAsync.response
        }

        fun service(service: CreditServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CreditListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CreditListPageAsync].
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
        fun build(): CreditListPageAsync =
            CreditListPageAsync(
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

        return other is CreditListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CreditListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
