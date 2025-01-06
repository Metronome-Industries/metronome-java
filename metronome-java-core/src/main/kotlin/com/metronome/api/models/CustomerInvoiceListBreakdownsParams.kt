// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.metronome.api.core.Enum
import com.metronome.api.core.JsonField
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

class CustomerInvoiceListBreakdownsParams
constructor(
    private val customerId: String,
    private val endingBefore: OffsetDateTime,
    private val startingOn: OffsetDateTime,
    private val creditTypeId: String?,
    private val limit: Long?,
    private val nextPage: String?,
    private val skipZeroQtyLineItems: Boolean?,
    private val sort: Sort?,
    private val status: String?,
    private val windowSize: WindowSize?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = customerId

    /**
     * RFC 3339 timestamp. Breakdowns will only be returned for time windows that end on or before
     * this time.
     */
    fun endingBefore(): OffsetDateTime = endingBefore

    /**
     * RFC 3339 timestamp. Breakdowns will only be returned for time windows that start on or after
     * this time.
     */
    fun startingOn(): OffsetDateTime = startingOn

    /** Only return invoices for the specified credit type */
    fun creditTypeId(): Optional<String> = Optional.ofNullable(creditTypeId)

    /**
     * Max number of results that should be returned. For daily breakdowns, the response can return
     * up to 35 days worth of breakdowns. For hourly breakdowns, the response can return up to 24
     * hours. If there are more results, a cursor to the next page is returned.
     */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /** If set, all zero quantity line items will be filtered out of the response */
    fun skipZeroQtyLineItems(): Optional<Boolean> = Optional.ofNullable(skipZeroQtyLineItems)

    /** Invoice sort order by issued_at, e.g. date_asc or date_desc. Defaults to date_asc. */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Invoice status, e.g. DRAFT or FINALIZED */
    fun status(): Optional<String> = Optional.ofNullable(status)

    /** The granularity of the breakdowns to return. Defaults to day. */
    fun windowSize(): Optional<WindowSize> = Optional.ofNullable(windowSize)

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
        this.creditTypeId?.let { queryParams.put("credit_type_id", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        this.skipZeroQtyLineItems?.let {
            queryParams.put("skip_zero_qty_line_items", listOf(it.toString()))
        }
        this.sort?.let { queryParams.put("sort", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        this.windowSize?.let { queryParams.put("window_size", listOf(it.toString())) }
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
    class Builder {

        private var customerId: String? = null
        private var endingBefore: OffsetDateTime? = null
        private var startingOn: OffsetDateTime? = null
        private var creditTypeId: String? = null
        private var limit: Long? = null
        private var nextPage: String? = null
        private var skipZeroQtyLineItems: Boolean? = null
        private var sort: Sort? = null
        private var status: String? = null
        private var windowSize: WindowSize? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            customerInvoiceListBreakdownsParams: CustomerInvoiceListBreakdownsParams
        ) = apply {
            customerId = customerInvoiceListBreakdownsParams.customerId
            endingBefore = customerInvoiceListBreakdownsParams.endingBefore
            startingOn = customerInvoiceListBreakdownsParams.startingOn
            creditTypeId = customerInvoiceListBreakdownsParams.creditTypeId
            limit = customerInvoiceListBreakdownsParams.limit
            nextPage = customerInvoiceListBreakdownsParams.nextPage
            skipZeroQtyLineItems = customerInvoiceListBreakdownsParams.skipZeroQtyLineItems
            sort = customerInvoiceListBreakdownsParams.sort
            status = customerInvoiceListBreakdownsParams.status
            windowSize = customerInvoiceListBreakdownsParams.windowSize
            additionalHeaders = customerInvoiceListBreakdownsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                customerInvoiceListBreakdownsParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * RFC 3339 timestamp. Breakdowns will only be returned for time windows that end on or
         * before this time.
         */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { this.endingBefore = endingBefore }

        /**
         * RFC 3339 timestamp. Breakdowns will only be returned for time windows that start on or
         * after this time.
         */
        fun startingOn(startingOn: OffsetDateTime) = apply { this.startingOn = startingOn }

        /** Only return invoices for the specified credit type */
        fun creditTypeId(creditTypeId: String?) = apply { this.creditTypeId = creditTypeId }

        /** Only return invoices for the specified credit type */
        fun creditTypeId(creditTypeId: Optional<String>) = creditTypeId(creditTypeId.orElse(null))

        /**
         * Max number of results that should be returned. For daily breakdowns, the response can
         * return up to 35 days worth of breakdowns. For hourly breakdowns, the response can return
         * up to 24 hours. If there are more results, a cursor to the next page is returned.
         */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Max number of results that should be returned. For daily breakdowns, the response can
         * return up to 35 days worth of breakdowns. For hourly breakdowns, the response can return
         * up to 24 hours. If there are more results, a cursor to the next page is returned.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /**
         * Max number of results that should be returned. For daily breakdowns, the response can
         * return up to 35 days worth of breakdowns. For hourly breakdowns, the response can return
         * up to 24 hours. If there are more results, a cursor to the next page is returned.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun limit(limit: Optional<Long>) = limit(limit.orElse(null) as Long?)

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String?) = apply { this.nextPage = nextPage }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.orElse(null))

        /** If set, all zero quantity line items will be filtered out of the response */
        fun skipZeroQtyLineItems(skipZeroQtyLineItems: Boolean?) = apply {
            this.skipZeroQtyLineItems = skipZeroQtyLineItems
        }

        /** If set, all zero quantity line items will be filtered out of the response */
        fun skipZeroQtyLineItems(skipZeroQtyLineItems: Boolean) =
            skipZeroQtyLineItems(skipZeroQtyLineItems as Boolean?)

        /** If set, all zero quantity line items will be filtered out of the response */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun skipZeroQtyLineItems(skipZeroQtyLineItems: Optional<Boolean>) =
            skipZeroQtyLineItems(skipZeroQtyLineItems.orElse(null) as Boolean?)

        /** Invoice sort order by issued_at, e.g. date_asc or date_desc. Defaults to date_asc. */
        fun sort(sort: Sort?) = apply { this.sort = sort }

        /** Invoice sort order by issued_at, e.g. date_asc or date_desc. Defaults to date_asc. */
        fun sort(sort: Optional<Sort>) = sort(sort.orElse(null))

        /** Invoice status, e.g. DRAFT or FINALIZED */
        fun status(status: String?) = apply { this.status = status }

        /** Invoice status, e.g. DRAFT or FINALIZED */
        fun status(status: Optional<String>) = status(status.orElse(null))

        /** The granularity of the breakdowns to return. Defaults to day. */
        fun windowSize(windowSize: WindowSize?) = apply { this.windowSize = windowSize }

        /** The granularity of the breakdowns to return. Defaults to day. */
        fun windowSize(windowSize: Optional<WindowSize>) = windowSize(windowSize.orElse(null))

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

        fun build(): CustomerInvoiceListBreakdownsParams =
            CustomerInvoiceListBreakdownsParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(endingBefore) { "`endingBefore` is required but was not set" },
                checkNotNull(startingOn) { "`startingOn` is required but was not set" },
                creditTypeId,
                limit,
                nextPage,
                skipZeroQtyLineItems,
                sort,
                status,
                windowSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Sort
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DATE_ASC = of("date_asc")

            @JvmField val DATE_DESC = of("date_desc")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        enum class Known {
            DATE_ASC,
            DATE_DESC,
        }

        enum class Value {
            DATE_ASC,
            DATE_DESC,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DATE_ASC -> Value.DATE_ASC
                DATE_DESC -> Value.DATE_DESC
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DATE_ASC -> Known.DATE_ASC
                DATE_DESC -> Known.DATE_DESC
                else -> throw MetronomeInvalidDataException("Unknown Sort: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Sort && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class WindowSize
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val HOUR = of("HOUR")

            @JvmField val DAY = of("DAY")

            @JvmStatic fun of(value: String) = WindowSize(JsonField.of(value))
        }

        enum class Known {
            HOUR,
            DAY,
        }

        enum class Value {
            HOUR,
            DAY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                HOUR -> Value.HOUR
                DAY -> Value.DAY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                HOUR -> Known.HOUR
                DAY -> Known.DAY
                else -> throw MetronomeInvalidDataException("Unknown WindowSize: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is WindowSize && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerInvoiceListBreakdownsParams && customerId == other.customerId && endingBefore == other.endingBefore && startingOn == other.startingOn && creditTypeId == other.creditTypeId && limit == other.limit && nextPage == other.nextPage && skipZeroQtyLineItems == other.skipZeroQtyLineItems && sort == other.sort && status == other.status && windowSize == other.windowSize && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, endingBefore, startingOn, creditTypeId, limit, nextPage, skipZeroQtyLineItems, sort, status, windowSize, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerInvoiceListBreakdownsParams{customerId=$customerId, endingBefore=$endingBefore, startingOn=$startingOn, creditTypeId=$creditTypeId, limit=$limit, nextPage=$nextPage, skipZeroQtyLineItems=$skipZeroQtyLineItems, sort=$sort, status=$status, windowSize=$windowSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
