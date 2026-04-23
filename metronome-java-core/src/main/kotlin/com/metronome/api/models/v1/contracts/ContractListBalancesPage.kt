// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.ContractService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ContractService.listBalances */
class ContractListBalancesPage
private constructor(
    private val service: ContractService,
    private val params: ContractListBalancesParams,
    private val response: ContractListBalancesPageResponse,
) : Page<ContractListBalancesResponse> {

    /**
     * Delegates to [ContractListBalancesPageResponse], but gracefully handles missing data.
     *
     * @see ContractListBalancesPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [ContractListBalancesPageResponse], but gracefully handles missing data.
     *
     * @see ContractListBalancesPageResponse.data
     */
    fun data(): List<ContractListBalancesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<ContractListBalancesResponse> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): ContractListBalancesParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): ContractListBalancesPage = service.listBalances(nextPageParams())

    fun autoPager(): AutoPager<ContractListBalancesResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ContractListBalancesParams = params

    /** The response that this page was parsed from. */
    fun response(): ContractListBalancesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ContractListBalancesPage].
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

    /** A builder for [ContractListBalancesPage]. */
    class Builder internal constructor() {

        private var service: ContractService? = null
        private var params: ContractListBalancesParams? = null
        private var response: ContractListBalancesPageResponse? = null

        @JvmSynthetic
        internal fun from(contractListBalancesPage: ContractListBalancesPage) = apply {
            service = contractListBalancesPage.service
            params = contractListBalancesPage.params
            response = contractListBalancesPage.response
        }

        fun service(service: ContractService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ContractListBalancesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ContractListBalancesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ContractListBalancesPage].
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
        fun build(): ContractListBalancesPage =
            ContractListBalancesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractListBalancesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ContractListBalancesPage{service=$service, params=$params, response=$response}"
}
