// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.CreditGrantService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CreditGrantService.listEntries */
class CreditGrantListEntriesPage
private constructor(
    private val service: CreditGrantService,
    private val params: CreditGrantListEntriesParams,
    private val response: CreditGrantListEntriesPageResponse,
) : Page<CreditGrantListEntriesResponse> {

    /**
     * Delegates to [CreditGrantListEntriesPageResponse], but gracefully handles missing data.
     *
     * @see CreditGrantListEntriesPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [CreditGrantListEntriesPageResponse], but gracefully handles missing data.
     *
     * @see CreditGrantListEntriesPageResponse.data
     */
    fun data(): List<CreditGrantListEntriesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<CreditGrantListEntriesResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): CreditGrantListEntriesParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CreditGrantListEntriesPage = service.listEntries(nextPageParams())

    fun autoPager(): AutoPager<CreditGrantListEntriesResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CreditGrantListEntriesParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditGrantListEntriesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditGrantListEntriesPage].
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

    /** A builder for [CreditGrantListEntriesPage]. */
    class Builder internal constructor() {

        private var service: CreditGrantService? = null
        private var params: CreditGrantListEntriesParams? = null
        private var response: CreditGrantListEntriesPageResponse? = null

        @JvmSynthetic
        internal fun from(creditGrantListEntriesPage: CreditGrantListEntriesPage) = apply {
            service = creditGrantListEntriesPage.service
            params = creditGrantListEntriesPage.params
            response = creditGrantListEntriesPage.response
        }

        fun service(service: CreditGrantService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CreditGrantListEntriesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditGrantListEntriesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CreditGrantListEntriesPage].
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
        fun build(): CreditGrantListEntriesPage =
            CreditGrantListEntriesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditGrantListEntriesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CreditGrantListEntriesPage{service=$service, params=$params, response=$response}"
}
