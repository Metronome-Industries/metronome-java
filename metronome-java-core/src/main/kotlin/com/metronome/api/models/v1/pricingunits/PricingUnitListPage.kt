// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.pricingunits

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.PricingUnitService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PricingUnitService.list */
class PricingUnitListPage
private constructor(
    private val service: PricingUnitService,
    private val params: PricingUnitListParams,
    private val response: PricingUnitListPageResponse,
) : Page<PricingUnitListResponse> {

    /**
     * Delegates to [PricingUnitListPageResponse], but gracefully handles missing data.
     *
     * @see PricingUnitListPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [PricingUnitListPageResponse], but gracefully handles missing data.
     *
     * @see PricingUnitListPageResponse.data
     */
    fun data(): List<PricingUnitListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<PricingUnitListResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): PricingUnitListParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): PricingUnitListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PricingUnitListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PricingUnitListParams = params

    /** The response that this page was parsed from. */
    fun response(): PricingUnitListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PricingUnitListPage].
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

    /** A builder for [PricingUnitListPage]. */
    class Builder internal constructor() {

        private var service: PricingUnitService? = null
        private var params: PricingUnitListParams? = null
        private var response: PricingUnitListPageResponse? = null

        @JvmSynthetic
        internal fun from(pricingUnitListPage: PricingUnitListPage) = apply {
            service = pricingUnitListPage.service
            params = pricingUnitListPage.params
            response = pricingUnitListPage.response
        }

        fun service(service: PricingUnitService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PricingUnitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PricingUnitListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PricingUnitListPage].
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
        fun build(): PricingUnitListPage =
            PricingUnitListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PricingUnitListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PricingUnitListPage{service=$service, params=$params, response=$response}"
}
