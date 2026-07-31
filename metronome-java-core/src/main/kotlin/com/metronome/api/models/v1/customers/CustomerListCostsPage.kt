// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.CustomerService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CustomerService.listCosts */
class CustomerListCostsPage
private constructor(
    private val service: CustomerService,
    private val params: CustomerListCostsParams,
    private val response: CustomerListCostsPageResponse,
) : Page<CustomerListCostsResponse> {

    /**
     * Delegates to [CustomerListCostsPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListCostsPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [CustomerListCostsPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListCostsPageResponse.data
     */
    fun data(): List<CustomerListCostsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<CustomerListCostsResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): CustomerListCostsParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CustomerListCostsPage = service.listCosts(nextPageParams())

    fun autoPager(): AutoPager<CustomerListCostsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListCostsParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerListCostsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerListCostsPage].
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

    /** A builder for [CustomerListCostsPage]. */
    class Builder internal constructor() {

        private var service: CustomerService? = null
        private var params: CustomerListCostsParams? = null
        private var response: CustomerListCostsPageResponse? = null

        @JvmSynthetic
        internal fun from(customerListCostsPage: CustomerListCostsPage) = apply {
            service = customerListCostsPage.service
            params = customerListCostsPage.params
            response = customerListCostsPage.response
        }

        fun service(service: CustomerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListCostsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerListCostsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CustomerListCostsPage].
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
        fun build(): CustomerListCostsPage =
            CustomerListCostsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListCostsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CustomerListCostsPage{service=$service, params=$params, response=$response}"
}
