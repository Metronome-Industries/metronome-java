// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.CreditGrantService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CreditGrantService.list */
class CreditGrantListPage
private constructor(
    private val service: CreditGrantService,
    private val params: CreditGrantListParams,
    private val response: CreditGrantListPageResponse,
) : Page<CreditGrantListResponse> {

    /**
     * Delegates to [CreditGrantListPageResponse], but gracefully handles missing data.
     *
     * @see CreditGrantListPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [CreditGrantListPageResponse], but gracefully handles missing data.
     *
     * @see CreditGrantListPageResponse.data
     */
    fun data(): List<CreditGrantListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<CreditGrantListResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): CreditGrantListParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CreditGrantListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CreditGrantListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CreditGrantListParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditGrantListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditGrantListPage].
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

    /** A builder for [CreditGrantListPage]. */
    class Builder internal constructor() {

        private var service: CreditGrantService? = null
        private var params: CreditGrantListParams? = null
        private var response: CreditGrantListPageResponse? = null

        @JvmSynthetic
        internal fun from(creditGrantListPage: CreditGrantListPage) = apply {
            service = creditGrantListPage.service
            params = creditGrantListPage.params
            response = creditGrantListPage.response
        }

        fun service(service: CreditGrantService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CreditGrantListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditGrantListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CreditGrantListPage].
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
        fun build(): CreditGrantListPage =
            CreditGrantListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditGrantListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CreditGrantListPage{service=$service, params=$params, response=$response}"
}
