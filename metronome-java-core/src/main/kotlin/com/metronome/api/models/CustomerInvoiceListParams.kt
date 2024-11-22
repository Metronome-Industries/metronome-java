// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.metronome.api.core.Enum
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

class CustomerInvoiceListParams
constructor(
    private val customerId: String,
    private val creditTypeId: String?,
    private val endingBefore: OffsetDateTime?,
    private val limit: Long?,
    private val nextPage: String?,
    private val skipZeroQtyLineItems: Boolean?,
    private val sort: Sort?,
    private val startingOn: OffsetDateTime?,
    private val status: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = customerId

    fun creditTypeId(): Optional<String> = Optional.ofNullable(creditTypeId)

    fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun skipZeroQtyLineItems(): Optional<Boolean> = Optional.ofNullable(skipZeroQtyLineItems)

    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    fun startingOn(): Optional<OffsetDateTime> = Optional.ofNullable(startingOn)

    fun status(): Optional<String> = Optional.ofNullable(status)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.creditTypeId?.let { queryParams.put("credit_type_id", listOf(it.toString())) }
        this.endingBefore?.let {
            queryParams.put(
                "ending_before",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        this.skipZeroQtyLineItems?.let {
            queryParams.put("skip_zero_qty_line_items", listOf(it.toString()))
        }
        this.sort?.let { queryParams.put("sort", listOf(it.toString())) }
        this.startingOn?.let {
            queryParams.put(
                "starting_on",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
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
        private var creditTypeId: String? = null
        private var endingBefore: OffsetDateTime? = null
        private var limit: Long? = null
        private var nextPage: String? = null
        private var skipZeroQtyLineItems: Boolean? = null
        private var sort: Sort? = null
        private var startingOn: OffsetDateTime? = null
        private var status: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerInvoiceListParams: CustomerInvoiceListParams) = apply {
            customerId = customerInvoiceListParams.customerId
            creditTypeId = customerInvoiceListParams.creditTypeId
            endingBefore = customerInvoiceListParams.endingBefore
            limit = customerInvoiceListParams.limit
            nextPage = customerInvoiceListParams.nextPage
            skipZeroQtyLineItems = customerInvoiceListParams.skipZeroQtyLineItems
            sort = customerInvoiceListParams.sort
            startingOn = customerInvoiceListParams.startingOn
            status = customerInvoiceListParams.status
            additionalHeaders = customerInvoiceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerInvoiceListParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** Only return invoices for the specified credit type */
        fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

        /**
         * RFC 3339 timestamp (exclusive). Invoices will only be returned for billing periods that
         * end before this time.
         */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { this.endingBefore = endingBefore }

        /** Max number of results that should be returned */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /** If set, all zero quantity line items will be filtered out of the response */
        fun skipZeroQtyLineItems(skipZeroQtyLineItems: Boolean) = apply {
            this.skipZeroQtyLineItems = skipZeroQtyLineItems
        }

        /** Invoice sort order by issued_at, e.g. date_asc or date_desc. Defaults to date_asc. */
        fun sort(sort: Sort) = apply { this.sort = sort }

        /**
         * RFC 3339 timestamp (inclusive). Invoices will only be returned for billing periods that
         * start at or after this time.
         */
        fun startingOn(startingOn: OffsetDateTime) = apply { this.startingOn = startingOn }

        /** Invoice status, e.g. DRAFT, FINALIZED, or VOID */
        fun status(status: String) = apply { this.status = status }

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

        fun build(): CustomerInvoiceListParams =
            CustomerInvoiceListParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                creditTypeId,
                endingBefore,
                limit,
                nextPage,
                skipZeroQtyLineItems,
                sort,
                startingOn,
                status,
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Sort && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DATE_ASC = Sort(JsonField.of("date_asc"))

            @JvmField val DATE_DESC = Sort(JsonField.of("date_desc"))

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerInvoiceListParams && customerId == other.customerId && creditTypeId == other.creditTypeId && endingBefore == other.endingBefore && limit == other.limit && nextPage == other.nextPage && skipZeroQtyLineItems == other.skipZeroQtyLineItems && sort == other.sort && startingOn == other.startingOn && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, creditTypeId, endingBefore, limit, nextPage, skipZeroQtyLineItems, sort, startingOn, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerInvoiceListParams{customerId=$customerId, creditTypeId=$creditTypeId, endingBefore=$endingBefore, limit=$limit, nextPage=$nextPage, skipZeroQtyLineItems=$skipZeroQtyLineItems, sort=$sort, startingOn=$startingOn, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
