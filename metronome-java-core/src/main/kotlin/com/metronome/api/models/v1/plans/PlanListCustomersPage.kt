// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.plans

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.PlanService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PlanService.listCustomers */
class PlanListCustomersPage
private constructor(
    private val service: PlanService,
    private val params: PlanListCustomersParams,
    private val response: PlanListCustomersPageResponse,
) : Page<PlanListCustomersResponse> {

    /**
     * Delegates to [PlanListCustomersPageResponse], but gracefully handles missing data.
     *
     * @see PlanListCustomersPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [PlanListCustomersPageResponse], but gracefully handles missing data.
     *
     * @see PlanListCustomersPageResponse.data
     */
    fun data(): List<PlanListCustomersResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<PlanListCustomersResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): PlanListCustomersParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): PlanListCustomersPage = service.listCustomers(nextPageParams())

    fun autoPager(): AutoPager<PlanListCustomersResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanListCustomersParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanListCustomersPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanListCustomersPage].
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

    /** A builder for [PlanListCustomersPage]. */
    class Builder internal constructor() {

        private var service: PlanService? = null
        private var params: PlanListCustomersParams? = null
        private var response: PlanListCustomersPageResponse? = null

        @JvmSynthetic
        internal fun from(planListCustomersPage: PlanListCustomersPage) = apply {
            service = planListCustomersPage.service
            params = planListCustomersPage.params
            response = planListCustomersPage.response
        }

        fun service(service: PlanService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanListCustomersParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanListCustomersPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanListCustomersPage].
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
        fun build(): PlanListCustomersPage =
            PlanListCustomersPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanListCustomersPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PlanListCustomersPage{service=$service, params=$params, response=$response}"
}
