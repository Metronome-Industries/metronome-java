// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards.rates

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.contracts.ratecards.RateService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see RateService.list */
class RateListPage
private constructor(
    private val service: RateService,
    private val params: RateListParams,
    private val response: RateListPageResponse,
) : Page<RateListResponse> {

    /**
     * Delegates to [RateListPageResponse], but gracefully handles missing data.
     *
     * @see RateListPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [RateListPageResponse], but gracefully handles missing data.
     *
     * @see RateListPageResponse.data
     */
    fun data(): List<RateListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<RateListResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): RateListParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): RateListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RateListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RateListParams = params

    /** The response that this page was parsed from. */
    fun response(): RateListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RateListPage].
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

    /** A builder for [RateListPage]. */
    class Builder internal constructor() {

        private var service: RateService? = null
        private var params: RateListParams? = null
        private var response: RateListPageResponse? = null

        @JvmSynthetic
        internal fun from(rateListPage: RateListPage) = apply {
            service = rateListPage.service
            params = rateListPage.params
            response = rateListPage.response
        }

        fun service(service: RateService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RateListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RateListPage].
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
        fun build(): RateListPage =
            RateListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RateListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "RateListPage{service=$service, params=$params, response=$response}"
}
