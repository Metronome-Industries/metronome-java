// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.notifications.offset

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.models.v2.notifications.LifecycleEventOffsetNotificationConfig
import com.metronome.api.models.v2.notifications.offset.OffsetListPageResponse
import com.metronome.api.models.v2.notifications.offset.OffsetListParams
import com.metronome.api.services.blocking.v2.notifications.OffsetService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see OffsetService.list */
class OffsetListPage private constructor(
    private val service: OffsetService,
    private val params: OffsetListParams,
    private val response: OffsetListPageResponse,

) : Page<LifecycleEventOffsetNotificationConfig> {

    /**
     * Delegates to [OffsetListPageResponse], but gracefully handles missing data.
     *
     * @see OffsetListPageResponse.cursor
     */
    fun cursor(): Optional<String> = response._cursor().getOptional("cursor")

    /**
     * Delegates to [OffsetListPageResponse], but gracefully handles missing data.
     *
     * @see OffsetListPageResponse.data
     */
    fun data(): List<LifecycleEventOffsetNotificationConfig> = response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<LifecycleEventOffsetNotificationConfig> = data()

    override fun hasNextPage(): Boolean = cursor().isPresent

    fun nextPageParams(): OffsetListParams {
      val nextCursor = cursor().getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
      return params.toBuilder()
          .cursor(nextCursor)
          .build()
    }

    override fun nextPage(): OffsetListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LifecycleEventOffsetNotificationConfig> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OffsetListParams = params

    /** The response that this page was parsed from. */
    fun response(): OffsetListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OffsetListPage].
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [OffsetListPage]. */
    class Builder internal constructor() {

        private var service: OffsetService? = null
        private var params: OffsetListParams? = null
        private var response: OffsetListPageResponse? = null

        @JvmSynthetic
        internal fun from(offsetListPage: OffsetListPage) =
            apply {
                service = offsetListPage.service
                params = offsetListPage.params
                response = offsetListPage.response
            }

        fun service(service: OffsetService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: OffsetListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun response(response: OffsetListPageResponse) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [OffsetListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OffsetListPage =
            OffsetListPage(
              checkRequired(
                "service", service
              ),
              checkRequired(
                "params", params
              ),
              checkRequired(
                "response", response
              ),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is OffsetListPage && service == other.service && params == other.params && response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "OffsetListPage{service=$service, params=$params, response=$response}"
}
