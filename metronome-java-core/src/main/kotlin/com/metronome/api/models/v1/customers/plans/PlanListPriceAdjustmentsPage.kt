// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.plans

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.customers.PlanService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PlanService.listPriceAdjustments */
class PlanListPriceAdjustmentsPage
private constructor(
    private val service: PlanService,
    private val params: PlanListPriceAdjustmentsParams,
    private val response: PlanListPriceAdjustmentsPageResponse,
) : Page<PlanListPriceAdjustmentsResponse> {

    /**
     * Delegates to [PlanListPriceAdjustmentsPageResponse], but gracefully handles missing data.
     *
     * @see PlanListPriceAdjustmentsPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [PlanListPriceAdjustmentsPageResponse], but gracefully handles missing data.
     *
     * @see PlanListPriceAdjustmentsPageResponse.data
     */
    fun data(): List<PlanListPriceAdjustmentsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<PlanListPriceAdjustmentsResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): PlanListPriceAdjustmentsParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): PlanListPriceAdjustmentsPage =
        service.listPriceAdjustments(nextPageParams())

    fun autoPager(): AutoPager<PlanListPriceAdjustmentsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanListPriceAdjustmentsParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanListPriceAdjustmentsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanListPriceAdjustmentsPage].
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

    /** A builder for [PlanListPriceAdjustmentsPage]. */
    class Builder internal constructor() {

        private var service: PlanService? = null
        private var params: PlanListPriceAdjustmentsParams? = null
        private var response: PlanListPriceAdjustmentsPageResponse? = null

        @JvmSynthetic
        internal fun from(planListPriceAdjustmentsPage: PlanListPriceAdjustmentsPage) = apply {
            service = planListPriceAdjustmentsPage.service
            params = planListPriceAdjustmentsPage.params
            response = planListPriceAdjustmentsPage.response
        }

        fun service(service: PlanService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanListPriceAdjustmentsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanListPriceAdjustmentsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PlanListPriceAdjustmentsPage].
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
        fun build(): PlanListPriceAdjustmentsPage =
            PlanListPriceAdjustmentsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanListPriceAdjustmentsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PlanListPriceAdjustmentsPage{service=$service, params=$params, response=$response}"
}
