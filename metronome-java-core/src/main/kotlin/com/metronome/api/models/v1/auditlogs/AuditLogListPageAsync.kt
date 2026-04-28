// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.auditlogs

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.AuditLogServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AuditLogServiceAsync.list */
class AuditLogListPageAsync
private constructor(
    private val service: AuditLogServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AuditLogListParams,
    private val response: AuditLogListPageResponse,
) : PageAsync<AuditLogListResponse> {

    /**
     * Delegates to [AuditLogListPageResponse], but gracefully handles missing data.
     *
     * @see AuditLogListPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [AuditLogListPageResponse], but gracefully handles missing data.
     *
     * @see AuditLogListPageResponse.data
     */
    fun data(): List<AuditLogListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<AuditLogListResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): AuditLogListParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AuditLogListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AuditLogListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AuditLogListParams = params

    /** The response that this page was parsed from. */
    fun response(): AuditLogListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AuditLogListPageAsync].
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

    /** A builder for [AuditLogListPageAsync]. */
    class Builder internal constructor() {

        private var service: AuditLogServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AuditLogListParams? = null
        private var response: AuditLogListPageResponse? = null

        @JvmSynthetic
        internal fun from(auditLogListPageAsync: AuditLogListPageAsync) = apply {
            service = auditLogListPageAsync.service
            streamHandlerExecutor = auditLogListPageAsync.streamHandlerExecutor
            params = auditLogListPageAsync.params
            response = auditLogListPageAsync.response
        }

        fun service(service: AuditLogServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AuditLogListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AuditLogListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AuditLogListPageAsync].
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
        fun build(): AuditLogListPageAsync =
            AuditLogListPageAsync(
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

        return other is AuditLogListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AuditLogListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
