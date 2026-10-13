// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.contracts

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.models.ContractV2
import com.metronome.api.services.blocking.v2.ContractService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ContractService.list */
class ContractListPage
private constructor(
    private val service: ContractService,
    private val params: ContractListParams,
    private val response: ContractListPageResponse,
) : Page<ContractV2> {

    /**
     * Delegates to [ContractListPageResponse], but gracefully handles missing data.
     *
     * @see ContractListPageResponse.cursor
     */
    fun cursor(): Optional<String> = response._cursor().getOptional("cursor")

    /**
     * Delegates to [ContractListPageResponse], but gracefully handles missing data.
     *
     * @see ContractListPageResponse.data
     */
    fun data(): List<ContractV2> = response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<ContractV2> = data()

    override fun hasNextPage(): Boolean = cursor().isPresent

    fun nextPageParams(): ContractListParams {
        val nextCursor =
            cursor().getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): ContractListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ContractV2> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ContractListParams = params

    /** The response that this page was parsed from. */
    fun response(): ContractListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ContractListPage].
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

    /** A builder for [ContractListPage]. */
    class Builder internal constructor() {

        private var service: ContractService? = null
        private var params: ContractListParams? = null
        private var response: ContractListPageResponse? = null

        @JvmSynthetic
        internal fun from(contractListPage: ContractListPage) = apply {
            service = contractListPage.service
            params = contractListPage.params
            response = contractListPage.response
        }

        fun service(service: ContractService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ContractListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ContractListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ContractListPage].
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
        fun build(): ContractListPage =
            ContractListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ContractListPage{service=$service, params=$params, response=$response}"
}
