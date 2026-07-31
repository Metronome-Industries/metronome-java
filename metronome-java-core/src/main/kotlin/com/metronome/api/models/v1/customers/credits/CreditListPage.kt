// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.credits

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.models.Credit
import com.metronome.api.services.blocking.v1.customers.CreditService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CreditService.list */
class CreditListPage
private constructor(
    private val service: CreditService,
    private val params: CreditListParams,
    private val response: CreditListPageResponse,
) : Page<Credit> {

    /**
     * Delegates to [CreditListPageResponse], but gracefully handles missing data.
     *
     * @see CreditListPageResponse.nextPage
     */
    fun nextPageRaw(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [CreditListPageResponse], but gracefully handles missing data.
     *
     * @see CreditListPageResponse.data
     */
    fun data(): List<Credit> = response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<Credit> = data()

    override fun hasNextPage(): Boolean = nextPageRaw().isPresent

    fun nextPageParams(): CreditListParams {
        val nextCursor =
            nextPageRaw().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CreditListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Credit> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CreditListParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditListPage].
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

    /** A builder for [CreditListPage]. */
    class Builder internal constructor() {

        private var service: CreditService? = null
        private var params: CreditListParams? = null
        private var response: CreditListPageResponse? = null

        @JvmSynthetic
        internal fun from(creditListPage: CreditListPage) = apply {
            service = creditListPage.service
            params = creditListPage.params
            response = creditListPage.response
        }

        fun service(service: CreditService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CreditListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CreditListPage].
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
        fun build(): CreditListPage =
            CreditListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "CreditListPage{service=$service, params=$params, response=$response}"
}
