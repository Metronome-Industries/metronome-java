// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.billablemetrics

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.BillableMetricService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see BillableMetricService.list */
class BillableMetricListPage
private constructor(
    private val service: BillableMetricService,
    private val params: BillableMetricListParams,
    private val response: BillableMetricListPageResponse,
) : Page<BillableMetricListResponse> {

    /**
     * Delegates to [BillableMetricListPageResponse], but gracefully handles missing data.
     *
     * @see BillableMetricListPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [BillableMetricListPageResponse], but gracefully handles missing data.
     *
     * @see BillableMetricListPageResponse.data
     */
    fun data(): List<BillableMetricListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<BillableMetricListResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): BillableMetricListParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): BillableMetricListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BillableMetricListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BillableMetricListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillableMetricListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillableMetricListPage].
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

    /** A builder for [BillableMetricListPage]. */
    class Builder internal constructor() {

        private var service: BillableMetricService? = null
        private var params: BillableMetricListParams? = null
        private var response: BillableMetricListPageResponse? = null

        @JvmSynthetic
        internal fun from(billableMetricListPage: BillableMetricListPage) = apply {
            service = billableMetricListPage.service
            params = billableMetricListPage.params
            response = billableMetricListPage.response
        }

        fun service(service: BillableMetricService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BillableMetricListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillableMetricListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BillableMetricListPage].
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
        fun build(): BillableMetricListPage =
            BillableMetricListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillableMetricListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BillableMetricListPage{service=$service, params=$params, response=$response}"
}
