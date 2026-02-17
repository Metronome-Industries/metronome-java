// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.CreditGrantServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CreditGrantServiceAsync.list */
class CreditGrantListPageAsync
private constructor(
    private val service: CreditGrantServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CreditGrantListParams,
    private val response: CreditGrantListPageResponse,
) : PageAsync<CreditGrantListResponse> {

    /**
     * Delegates to [CreditGrantListPageResponse], but gracefully handles missing data.
     *
     * @see CreditGrantListPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [CreditGrantListPageResponse], but gracefully handles missing data.
     *
     * @see CreditGrantListPageResponse.data
     */
    fun data(): List<CreditGrantListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<CreditGrantListResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): CreditGrantListParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CreditGrantListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CreditGrantListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CreditGrantListParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditGrantListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditGrantListPageAsync].
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

    /** A builder for [CreditGrantListPageAsync]. */
    class Builder internal constructor() {

        private var service: CreditGrantServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CreditGrantListParams? = null
        private var response: CreditGrantListPageResponse? = null

        @JvmSynthetic
        internal fun from(creditGrantListPageAsync: CreditGrantListPageAsync) = apply {
            service = creditGrantListPageAsync.service
            streamHandlerExecutor = creditGrantListPageAsync.streamHandlerExecutor
            params = creditGrantListPageAsync.params
            response = creditGrantListPageAsync.response
        }

        fun service(service: CreditGrantServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CreditGrantListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditGrantListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CreditGrantListPageAsync].
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
        fun build(): CreditGrantListPageAsync =
            CreditGrantListPageAsync(
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

        return other is CreditGrantListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CreditGrantListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
