// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.packages

import com.metronome.api.core.AutoPagerAsync
import com.metronome.api.core.PageAsync
import com.metronome.api.core.checkRequired
import com.metronome.api.services.async.v1.PackageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PackageServiceAsync.listContractsOnPackage */
class PackageListContractsOnPackagePageAsync
private constructor(
    private val service: PackageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PackageListContractsOnPackageParams,
    private val response: PackageListContractsOnPackagePageResponse,
) : PageAsync<PackageListContractsOnPackageResponse> {

    /**
     * Delegates to [PackageListContractsOnPackagePageResponse], but gracefully handles missing
     * data.
     *
     * @see PackageListContractsOnPackagePageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [PackageListContractsOnPackagePageResponse], but gracefully handles missing
     * data.
     *
     * @see PackageListContractsOnPackagePageResponse.data
     */
    fun data(): List<PackageListContractsOnPackageResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<PackageListContractsOnPackageResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): PackageListContractsOnPackageParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PackageListContractsOnPackagePageAsync> =
        service.listContractsOnPackage(nextPageParams())

    fun autoPager(): AutoPagerAsync<PackageListContractsOnPackageResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PackageListContractsOnPackageParams = params

    /** The response that this page was parsed from. */
    fun response(): PackageListContractsOnPackagePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PackageListContractsOnPackagePageAsync].
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

    /** A builder for [PackageListContractsOnPackagePageAsync]. */
    class Builder internal constructor() {

        private var service: PackageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PackageListContractsOnPackageParams? = null
        private var response: PackageListContractsOnPackagePageResponse? = null

        @JvmSynthetic
        internal fun from(
            packageListContractsOnPackagePageAsync: PackageListContractsOnPackagePageAsync
        ) = apply {
            service = packageListContractsOnPackagePageAsync.service
            streamHandlerExecutor = packageListContractsOnPackagePageAsync.streamHandlerExecutor
            params = packageListContractsOnPackagePageAsync.params
            response = packageListContractsOnPackagePageAsync.response
        }

        fun service(service: PackageServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PackageListContractsOnPackageParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PackageListContractsOnPackagePageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PackageListContractsOnPackagePageAsync].
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
        fun build(): PackageListContractsOnPackagePageAsync =
            PackageListContractsOnPackagePageAsync(
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

        return other is PackageListContractsOnPackagePageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PackageListContractsOnPackagePageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
