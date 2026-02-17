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

/** @see CreditGrantServiceAsync.listEntries */
class CreditGrantListEntriesPageAsync
private constructor(
    private val service: CreditGrantServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CreditGrantListEntriesParams,
    private val response: CreditGrantListEntriesPageResponse,
) : PageAsync<CreditGrantListEntriesResponse> {

    /**
     * Delegates to [CreditGrantListEntriesPageResponse], but gracefully handles missing data.
     *
     * @see CreditGrantListEntriesPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [CreditGrantListEntriesPageResponse], but gracefully handles missing data.
     *
     * @see CreditGrantListEntriesPageResponse.data
     */
    fun data(): List<CreditGrantListEntriesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<CreditGrantListEntriesResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): CreditGrantListEntriesParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CreditGrantListEntriesPageAsync> =
        service.listEntries(nextPageParams())

    fun autoPager(): AutoPagerAsync<CreditGrantListEntriesResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CreditGrantListEntriesParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditGrantListEntriesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CreditGrantListEntriesPageAsync].
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

    /** A builder for [CreditGrantListEntriesPageAsync]. */
    class Builder internal constructor() {

        private var service: CreditGrantServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CreditGrantListEntriesParams? = null
        private var response: CreditGrantListEntriesPageResponse? = null

        @JvmSynthetic
        internal fun from(creditGrantListEntriesPageAsync: CreditGrantListEntriesPageAsync) =
            apply {
                service = creditGrantListEntriesPageAsync.service
                streamHandlerExecutor = creditGrantListEntriesPageAsync.streamHandlerExecutor
                params = creditGrantListEntriesPageAsync.params
                response = creditGrantListEntriesPageAsync.response
            }

        fun service(service: CreditGrantServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CreditGrantListEntriesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditGrantListEntriesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CreditGrantListEntriesPageAsync].
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
        fun build(): CreditGrantListEntriesPageAsync =
            CreditGrantListEntriesPageAsync(
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

        return other is CreditGrantListEntriesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CreditGrantListEntriesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
