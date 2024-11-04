// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.metronome.api.core.Enum
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
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
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
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

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.creditTypeId?.let { params.put("credit_type_id", listOf(it.toString())) }
        this.endingBefore?.let {
            params.put("ending_before", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.nextPage?.let { params.put("next_page", listOf(it.toString())) }
        this.skipZeroQtyLineItems?.let {
            params.put("skip_zero_qty_line_items", listOf(it.toString()))
        }
        this.sort?.let { params.put("sort", listOf(it.toString())) }
        this.startingOn?.let {
            params.put("starting_on", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.status?.let { params.put("status", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerInvoiceListParams && this.customerId == other.customerId && this.creditTypeId == other.creditTypeId && this.endingBefore == other.endingBefore && this.limit == other.limit && this.nextPage == other.nextPage && this.skipZeroQtyLineItems == other.skipZeroQtyLineItems && this.sort == other.sort && this.startingOn == other.startingOn && this.status == other.status && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, creditTypeId, endingBefore, limit, nextPage, skipZeroQtyLineItems, sort, startingOn, status, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "CustomerInvoiceListParams{customerId=$customerId, creditTypeId=$creditTypeId, endingBefore=$endingBefore, limit=$limit, nextPage=$nextPage, skipZeroQtyLineItems=$skipZeroQtyLineItems, sort=$sort, startingOn=$startingOn, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

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
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(customerInvoiceListParams: CustomerInvoiceListParams) = apply {
            this.customerId = customerInvoiceListParams.customerId
            this.creditTypeId = customerInvoiceListParams.creditTypeId
            this.endingBefore = customerInvoiceListParams.endingBefore
            this.limit = customerInvoiceListParams.limit
            this.nextPage = customerInvoiceListParams.nextPage
            this.skipZeroQtyLineItems = customerInvoiceListParams.skipZeroQtyLineItems
            this.sort = customerInvoiceListParams.sort
            this.startingOn = customerInvoiceListParams.startingOn
            this.status = customerInvoiceListParams.status
            additionalHeaders(customerInvoiceListParams.additionalHeaders)
            additionalQueryParams(customerInvoiceListParams.additionalQueryParams)
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

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
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
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
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

            return /* spotless:off */ other is Sort && this.value == other.value /* spotless:on */
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
}
