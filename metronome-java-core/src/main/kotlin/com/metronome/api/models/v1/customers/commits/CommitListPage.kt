// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.commits

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.models.Commit
import com.metronome.api.services.blocking.v1.customers.CommitService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CommitService.list */
class CommitListPage
private constructor(
    private val service: CommitService,
    private val params: CommitListParams,
    private val response: CommitListPageResponse,
) : Page<Commit> {

    /**
     * Delegates to [CommitListPageResponse], but gracefully handles missing data.
     *
     * @see CommitListPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [CommitListPageResponse], but gracefully handles missing data.
     *
     * @see CommitListPageResponse.data
     */
    fun data(): List<Commit> = response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<Commit> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): CommitListParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CommitListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Commit> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CommitListParams = params

    /** The response that this page was parsed from. */
    fun response(): CommitListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommitListPage].
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

    /** A builder for [CommitListPage]. */
    class Builder internal constructor() {

        private var service: CommitService? = null
        private var params: CommitListParams? = null
        private var response: CommitListPageResponse? = null

        @JvmSynthetic
        internal fun from(commitListPage: CommitListPage) = apply {
            service = commitListPage.service
            params = commitListPage.params
            response = commitListPage.response
        }

        fun service(service: CommitService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CommitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CommitListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CommitListPage].
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
        fun build(): CommitListPage =
            CommitListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "CommitListPage{service=$service, params=$params, response=$response}"
}
