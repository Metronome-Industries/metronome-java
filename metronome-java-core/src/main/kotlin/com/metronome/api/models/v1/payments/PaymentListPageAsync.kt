// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.payments

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.PaymentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PaymentServiceAsync.list */
class PaymentListPageAsync
private constructor(
    private val service: PaymentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PaymentListParams,
    private val response: PaymentListPageResponse,
) : PageAsync<Payment> {

    /**
     * Delegates to [PaymentListPageResponse], but gracefully handles missing data.
     *
     * @see PaymentListPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [PaymentListPageResponse], but gracefully handles missing data.
     *
     * @see PaymentListPageResponse.data
     */
    fun data(): List<Payment> = response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<Payment> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): PaymentListParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PaymentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Payment> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PaymentListParams = params

    /** The response that this page was parsed from. */
    fun response(): PaymentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentListPageAsync].
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

    /** A builder for [PaymentListPageAsync]. */
    class Builder internal constructor() {

        private var service: PaymentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PaymentListParams? = null
        private var response: PaymentListPageResponse? = null

        @JvmSynthetic
        internal fun from(paymentListPageAsync: PaymentListPageAsync) = apply {
            service = paymentListPageAsync.service
            streamHandlerExecutor = paymentListPageAsync.streamHandlerExecutor
            params = paymentListPageAsync.params
            response = paymentListPageAsync.response
        }

        fun service(service: PaymentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PaymentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PaymentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PaymentListPageAsync].
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
        fun build(): PaymentListPageAsync =
            PaymentListPageAsync(
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

        return other is PaymentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PaymentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
