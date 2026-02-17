// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customfields

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.CustomFieldServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CustomFieldServiceAsync.listKeys */
class CustomFieldListKeysPageAsync
private constructor(
    private val service: CustomFieldServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CustomFieldListKeysParams,
    private val response: CustomFieldListKeysPageResponse,
) : PageAsync<CustomFieldListKeysResponse> {

    /**
     * Delegates to [CustomFieldListKeysPageResponse], but gracefully handles missing data.
     *
     * @see CustomFieldListKeysPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [CustomFieldListKeysPageResponse], but gracefully handles missing data.
     *
     * @see CustomFieldListKeysPageResponse.data
     */
    fun data(): List<CustomFieldListKeysResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<CustomFieldListKeysResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): CustomFieldListKeysParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CustomFieldListKeysPageAsync> =
        service.listKeys(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomFieldListKeysResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CustomFieldListKeysParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomFieldListKeysPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomFieldListKeysPageAsync].
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

    /** A builder for [CustomFieldListKeysPageAsync]. */
    class Builder internal constructor() {

        private var service: CustomFieldServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CustomFieldListKeysParams? = null
        private var response: CustomFieldListKeysPageResponse? = null

        @JvmSynthetic
        internal fun from(customFieldListKeysPageAsync: CustomFieldListKeysPageAsync) = apply {
            service = customFieldListKeysPageAsync.service
            streamHandlerExecutor = customFieldListKeysPageAsync.streamHandlerExecutor
            params = customFieldListKeysPageAsync.params
            response = customFieldListKeysPageAsync.response
        }

        fun service(service: CustomFieldServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CustomFieldListKeysParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomFieldListKeysPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CustomFieldListKeysPageAsync].
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
        fun build(): CustomFieldListKeysPageAsync =
            CustomFieldListKeysPageAsync(
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

        return other is CustomFieldListKeysPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CustomFieldListKeysPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
