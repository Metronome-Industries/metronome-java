// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.contracts.RateCardService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see RateCardService.list */
class RateCardListPage
private constructor(
    private val service: RateCardService,
    private val params: RateCardListParams,
    private val response: RateCardListPageResponse,
) : Page<RateCardListResponse> {

    /**
     * Delegates to [RateCardListPageResponse], but gracefully handles missing data.
     *
     * @see RateCardListPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [RateCardListPageResponse], but gracefully handles missing data.
     *
     * @see RateCardListPageResponse.data
     */
    fun data(): List<RateCardListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<RateCardListResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): RateCardListParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): RateCardListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RateCardListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RateCardListParams = params

    /** The response that this page was parsed from. */
    fun response(): RateCardListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RateCardListPage].
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

    /** A builder for [RateCardListPage]. */
    class Builder internal constructor() {

        private var service: RateCardService? = null
        private var params: RateCardListParams? = null
        private var response: RateCardListPageResponse? = null

        @JvmSynthetic
        internal fun from(rateCardListPage: RateCardListPage) = apply {
            service = rateCardListPage.service
            params = rateCardListPage.params
            response = rateCardListPage.response
        }

        fun service(service: RateCardService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RateCardListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RateCardListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RateCardListPage].
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
        fun build(): RateCardListPage =
            RateCardListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RateCardListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RateCardListPage{service=$service, params=$params, response=$response}"
}
