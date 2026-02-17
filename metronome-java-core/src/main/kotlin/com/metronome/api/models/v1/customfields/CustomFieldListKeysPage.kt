// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customfields

import com.metronome.api.core.AutoPager
import com.metronome.api.core.Page
import com.metronome.api.core.checkRequired
import com.metronome.api.services.blocking.v1.CustomFieldService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CustomFieldService.listKeys */
class CustomFieldListKeysPage
private constructor(
    private val service: CustomFieldService,
    private val params: CustomFieldListKeysParams,
    private val response: CustomFieldListKeysPageResponse,
) : Page<CustomFieldListKeysResponse> {

    /**
     * Delegates to [CustomFieldListKeysPageResponse], but gracefully handles missing data.
     *
     * @see CustomFieldListKeysPageResponse.nextPage
     */
    fun nextPage(): Optional<String> = response._nextPage().getOptional("next_page")

    /**
     * Delegates to [CustomFieldListKeysPageResponse], but gracefully handles missing data.
     *
     * @see CustomFieldListKeysPageResponse.data
     */
    fun data(): List<CustomFieldListKeysResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<CustomFieldListKeysResponse> = data()

    override fun hasNextPage(): Boolean = nextPage().isPresent

    fun nextPageParams(): CustomFieldListKeysParams {
        val nextCursor =
            nextPage().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextPage(nextCursor).build()
    }

    override fun nextPage(): CustomFieldListKeysPage = service.listKeys(nextPageParams())

    fun autoPager(): AutoPager<CustomFieldListKeysResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomFieldListKeysParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomFieldListKeysPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomFieldListKeysPage].
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

    /** A builder for [CustomFieldListKeysPage]. */
    class Builder internal constructor() {

        private var service: CustomFieldService? = null
        private var params: CustomFieldListKeysParams? = null
        private var response: CustomFieldListKeysPageResponse? = null

        @JvmSynthetic
        internal fun from(customFieldListKeysPage: CustomFieldListKeysPage) = apply {
            service = customFieldListKeysPage.service
            params = customFieldListKeysPage.params
            response = customFieldListKeysPage.response
        }

        fun service(service: CustomFieldService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomFieldListKeysParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomFieldListKeysPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CustomFieldListKeysPage].
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
        fun build(): CustomFieldListKeysPage =
            CustomFieldListKeysPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomFieldListKeysPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CustomFieldListKeysPage{service=$service, params=$params, response=$response}"
}
