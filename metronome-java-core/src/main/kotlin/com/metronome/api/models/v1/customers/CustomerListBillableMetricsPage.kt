// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.CustomerService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CustomerService.listBillableMetrics */
class CustomerListBillableMetricsPage
private constructor(
    private val service: CustomerService,
    private val params: CustomerListBillableMetricsParams,
    private val response: CustomerListBillableMetricsPageResponse,
) : Page<CustomerListBillableMetricsResponse> {

    /**
     * Delegates to [CustomerListBillableMetricsPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListBillableMetricsPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [CustomerListBillableMetricsPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListBillableMetricsPageResponse.data
     */
    fun data(): List<CustomerListBillableMetricsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<CustomerListBillableMetricsResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): CustomerListBillableMetricsParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CustomerListBillableMetricsPage =
        service.listBillableMetrics(nextPageParams())

    fun autoPager(): AutoPager<CustomerListBillableMetricsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListBillableMetricsParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerListBillableMetricsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerListBillableMetricsPage].
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

    /** A builder for [CustomerListBillableMetricsPage]. */
    class Builder internal constructor() {

        private var service: CustomerService? = null
        private var params: CustomerListBillableMetricsParams? = null
        private var response: CustomerListBillableMetricsPageResponse? = null

        @JvmSynthetic
        internal fun from(customerListBillableMetricsPage: CustomerListBillableMetricsPage) =
            apply {
                service = customerListBillableMetricsPage.service
                params = customerListBillableMetricsPage.params
                response = customerListBillableMetricsPage.response
            }

        fun service(service: CustomerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListBillableMetricsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerListBillableMetricsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerListBillableMetricsPage].
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
        fun build(): CustomerListBillableMetricsPage =
            CustomerListBillableMetricsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListBillableMetricsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CustomerListBillableMetricsPage{service=$service, params=$params, response=$response}"
}
