// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.packages

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.PackageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PackageService.list */
class PackageListPage
private constructor(
    private val service: PackageService,
    private val params: PackageListParams,
    private val response: PackageListPageResponse,
) : Page<PackageListResponse> {

    /**
     * Delegates to [PackageListPageResponse], but gracefully handles missing data.
     *
     * @see PackageListPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [PackageListPageResponse], but gracefully handles missing data.
     *
     * @see PackageListPageResponse.data
     */
    fun data(): List<PackageListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<PackageListResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): PackageListParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): PackageListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PackageListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PackageListParams = params

    /** The response that this page was parsed from. */
    fun response(): PackageListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PackageListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PackageListPage]. */
    class Builder internal constructor() {

        private var service: PackageService? = null
        private var params: PackageListParams? = null
        private var response: PackageListPageResponse? = null

        @JvmSynthetic
        internal fun from(packageListPage: PackageListPage) = apply {
            service = packageListPage.service
            params = packageListPage.params
            response = packageListPage.response
        }

        fun service(service: PackageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PackageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PackageListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PackageListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PackageListPage =
            PackageListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PackageListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PackageListPage{service=$service, params=$params, response=$response}"
}
