// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.plans

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.PlanService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PlanService.listCharges */
class PlanListChargesPage
private constructor(
    private val service: PlanService,
    private val params: PlanListChargesParams,
    private val response: PlanListChargesPageResponse,
) : Page<PlanListChargesResponse> {

    /**
     * Delegates to [PlanListChargesPageResponse], but gracefully handles missing data.
     *
     * @see PlanListChargesPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [PlanListChargesPageResponse], but gracefully handles missing data.
     *
     * @see PlanListChargesPageResponse.data
     */
    fun data(): List<PlanListChargesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<PlanListChargesResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): PlanListChargesParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): PlanListChargesPage = service.listCharges(nextPageParams())

    fun autoPager(): AutoPager<PlanListChargesResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanListChargesParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanListChargesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanListChargesPage].
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

    /** A builder for [PlanListChargesPage]. */
    class Builder internal constructor() {

        private var service: PlanService? = null
        private var params: PlanListChargesParams? = null
        private var response: PlanListChargesPageResponse? = null

        @JvmSynthetic
        internal fun from(planListChargesPage: PlanListChargesPage) = apply {
            service = planListChargesPage.service
            params = planListChargesPage.params
            response = planListChargesPage.response
        }

        fun service(service: PlanService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanListChargesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanListChargesPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanListChargesPage].
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
        fun build(): PlanListChargesPage =
            PlanListChargesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanListChargesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PlanListChargesPage{service=$service, params=$params, response=$response}"
}
