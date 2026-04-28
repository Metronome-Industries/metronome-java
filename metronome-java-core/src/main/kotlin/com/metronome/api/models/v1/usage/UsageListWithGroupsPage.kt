// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.usage

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.UsageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see UsageService.listWithGroups */
class UsageListWithGroupsPage
private constructor(
    private val service: UsageService,
    private val params: UsageListWithGroupsParams,
    private val response: UsageListWithGroupsPageResponse,
) : Page<UsageListWithGroupsResponse> {

    /**
     * Delegates to [UsageListWithGroupsPageResponse], but gracefully handles missing data.
     *
     * @see UsageListWithGroupsPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [UsageListWithGroupsPageResponse], but gracefully handles missing data.
     *
     * @see UsageListWithGroupsPageResponse.data
     */
    fun data(): List<UsageListWithGroupsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<UsageListWithGroupsResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): UsageListWithGroupsParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): UsageListWithGroupsPage = service.listWithGroups(nextPageParams())

    fun autoPager(): AutoPager<UsageListWithGroupsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): UsageListWithGroupsParams = params

    /** The response that this page was parsed from. */
    fun response(): UsageListWithGroupsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageListWithGroupsPage].
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

    /** A builder for [UsageListWithGroupsPage]. */
    class Builder internal constructor() {

        private var service: UsageService? = null
        private var params: UsageListWithGroupsParams? = null
        private var response: UsageListWithGroupsPageResponse? = null

        @JvmSynthetic
        internal fun from(usageListWithGroupsPage: UsageListWithGroupsPage) = apply {
            service = usageListWithGroupsPage.service
            params = usageListWithGroupsPage.params
            response = usageListWithGroupsPage.response
        }

        fun service(service: UsageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: UsageListWithGroupsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UsageListWithGroupsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UsageListWithGroupsPage].
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
        fun build(): UsageListWithGroupsPage =
            UsageListWithGroupsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageListWithGroupsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "UsageListWithGroupsPage{service=$service, params=$params, response=$response}"
}
