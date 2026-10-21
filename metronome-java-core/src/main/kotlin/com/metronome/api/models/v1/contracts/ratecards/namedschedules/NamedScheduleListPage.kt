// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards.namedschedules

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.contracts.ratecards.NamedScheduleService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see NamedScheduleService.list */
class NamedScheduleListPage
private constructor(
    private val service: NamedScheduleService,
    private val params: NamedScheduleListParams,
    private val response: NamedScheduleListPageResponse,
) : Page<NamedScheduleListResponse> {

    /**
     * Delegates to [NamedScheduleListPageResponse], but gracefully handles missing data.
     *
     * @see NamedScheduleListPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [NamedScheduleListPageResponse], but gracefully handles missing data.
     *
     * @see NamedScheduleListPageResponse.data
     */
    fun data(): List<NamedScheduleListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<NamedScheduleListResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): NamedScheduleListParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): NamedScheduleListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NamedScheduleListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NamedScheduleListParams = params

    /** The response that this page was parsed from. */
    fun response(): NamedScheduleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NamedScheduleListPage].
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

    /** A builder for [NamedScheduleListPage]. */
    class Builder internal constructor() {

        private var service: NamedScheduleService? = null
        private var params: NamedScheduleListParams? = null
        private var response: NamedScheduleListPageResponse? = null

        @JvmSynthetic
        internal fun from(namedScheduleListPage: NamedScheduleListPage) = apply {
            service = namedScheduleListPage.service
            params = namedScheduleListPage.params
            response = namedScheduleListPage.response
        }

        fun service(service: NamedScheduleService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NamedScheduleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NamedScheduleListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [NamedScheduleListPage].
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
        fun build(): NamedScheduleListPage =
            NamedScheduleListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NamedScheduleListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "NamedScheduleListPage{service=$service, params=$params, response=$response}"
}
