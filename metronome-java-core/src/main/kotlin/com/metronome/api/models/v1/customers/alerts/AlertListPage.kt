// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.alerts

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.customers.AlertService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AlertService.list */
class AlertListPage
private constructor(
    private val service: AlertService,
    private val params: AlertListParams,
    private val response: AlertListPageResponse,
) : Page<CustomerAlert> {

    /**
     * Delegates to [AlertListPageResponse], but gracefully handles missing data.
     *
     * @see AlertListPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [AlertListPageResponse], but gracefully handles missing data.
     *
     * @see AlertListPageResponse.data
     */
    fun data(): List<CustomerAlert> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<CustomerAlert> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): AlertListParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): AlertListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CustomerAlert> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AlertListParams = params

    /** The response that this page was parsed from. */
    fun response(): AlertListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlertListPage].
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

    /** A builder for [AlertListPage]. */
    class Builder internal constructor() {

        private var service: AlertService? = null
        private var params: AlertListParams? = null
        private var response: AlertListPageResponse? = null

        @JvmSynthetic
        internal fun from(alertListPage: AlertListPage) = apply {
            service = alertListPage.service
            params = alertListPage.params
            response = alertListPage.response
        }

        fun service(service: AlertService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AlertListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AlertListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AlertListPage].
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
        fun build(): AlertListPage =
            AlertListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlertListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "AlertListPage{service=$service, params=$params, response=$response}"
}
