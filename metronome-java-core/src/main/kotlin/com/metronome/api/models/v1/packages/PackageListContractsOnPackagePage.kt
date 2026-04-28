// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.packages

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.PackageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PackageService.listContractsOnPackage */
class PackageListContractsOnPackagePage
private constructor(
    private val service: PackageService,
    private val params: PackageListContractsOnPackageParams,
    private val response: PackageListContractsOnPackagePageResponse,
) : Page<PackageListContractsOnPackageResponse> {

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

    override fun nextPage(): PackageListContractsOnPackagePage =
        service.listContractsOnPackage(nextPageParams())

    fun autoPager(): AutoPager<PackageListContractsOnPackageResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PackageListContractsOnPackageParams = params

    /** The response that this page was parsed from. */
    fun response(): PackageListContractsOnPackagePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PackageListContractsOnPackagePage].
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

    /** A builder for [PackageListContractsOnPackagePage]. */
    class Builder internal constructor() {

        private var service: PackageService? = null
        private var params: PackageListContractsOnPackageParams? = null
        private var response: PackageListContractsOnPackagePageResponse? = null

        @JvmSynthetic
        internal fun from(packageListContractsOnPackagePage: PackageListContractsOnPackagePage) =
            apply {
                service = packageListContractsOnPackagePage.service
                params = packageListContractsOnPackagePage.params
                response = packageListContractsOnPackagePage.response
            }

        fun service(service: PackageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PackageListContractsOnPackageParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PackageListContractsOnPackagePageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PackageListContractsOnPackagePage].
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
        fun build(): PackageListContractsOnPackagePage =
            PackageListContractsOnPackagePage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PackageListContractsOnPackagePage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PackageListContractsOnPackagePage{service=$service, params=$params, response=$response}"
}
