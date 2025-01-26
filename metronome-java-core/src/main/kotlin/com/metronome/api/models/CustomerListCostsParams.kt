// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

/**
 * Fetch daily pending costs for the specified customer, broken down by credit type and line items.
 * Note: this is not supported for customers whose plan includes a UNIQUE-type billable metric.
 */
class CustomerListCostsParams
private constructor(
    private val customerId: String,
    private val endingBefore: OffsetDateTime,
    private val startingOn: OffsetDateTime,
    private val limit: Long?,
    private val nextPage: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = customerId

    /** RFC 3339 timestamp (exclusive) */
    fun endingBefore(): OffsetDateTime = endingBefore

    /** RFC 3339 timestamp (inclusive) */
    fun startingOn(): OffsetDateTime = startingOn

    /** Max number of results that should be returned */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.endingBefore.let {
            queryParams.put(
                "ending_before",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.startingOn.let {
            queryParams.put(
                "starting_on",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var customerId: String? = null
        private var endingBefore: OffsetDateTime? = null
        private var startingOn: OffsetDateTime? = null
        private var limit: Long? = null
        private var nextPage: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerListCostsParams: CustomerListCostsParams) = apply {
            customerId = customerListCostsParams.customerId
            endingBefore = customerListCostsParams.endingBefore
            startingOn = customerListCostsParams.startingOn
            limit = customerListCostsParams.limit
            nextPage = customerListCostsParams.nextPage
            additionalHeaders = customerListCostsParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerListCostsParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** RFC 3339 timestamp (exclusive) */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { this.endingBefore = endingBefore }

        /** RFC 3339 timestamp (inclusive) */
        fun startingOn(startingOn: OffsetDateTime) = apply { this.startingOn = startingOn }

        /** Max number of results that should be returned */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /** Max number of results that should be returned */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Max number of results that should be returned */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun limit(limit: Optional<Long>) = limit(limit.orElse(null) as Long?)

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String?) = apply { this.nextPage = nextPage }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.orElse(null))

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): CustomerListCostsParams =
            CustomerListCostsParams(
                checkRequired("customerId", customerId),
                checkRequired("endingBefore", endingBefore),
                checkRequired("startingOn", startingOn),
                limit,
                nextPage,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerListCostsParams && customerId == other.customerId && endingBefore == other.endingBefore && startingOn == other.startingOn && limit == other.limit && nextPage == other.nextPage && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, endingBefore, startingOn, limit, nextPage, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerListCostsParams{customerId=$customerId, endingBefore=$endingBefore, startingOn=$startingOn, limit=$limit, nextPage=$nextPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
