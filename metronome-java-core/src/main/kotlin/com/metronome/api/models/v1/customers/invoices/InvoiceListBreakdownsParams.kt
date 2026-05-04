// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.invoices

import com.fasterxml.jackson.annotation.JsonCreator
import com.metronome.api.core.Enum
import com.metronome.api.core.JsonField
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve granular time-series breakdowns of invoice data at hourly or daily intervals. This
 * endpoint transforms standard invoices into detailed timelines, enabling you to track usage
 * patterns, identify consumption spikes, and provide customers with transparency into their billing
 * details throughout the billing period.
 *
 * ### Use this endpoint to:
 * - Build usage analytics dashboards showing daily or hourly consumption trends
 * - Identify peak usage periods for capacity planning and cost optimization
 * - Generate detailed billing reports for finance teams and customer success
 * - Troubleshoot billing disputes by examining usage patterns at specific times
 * - Power real-time cost monitoring and alerting systems
 *
 * ### Key response fields:
 * An array of BreakdownInvoice objects, each containing:
 * - All standard invoice fields (ID, customer, commit, line items, totals, status)
 * - Line items with quantities and costs for that specific period
 * - `breakdown_start_timestamp`: Start of the specific time window
 * - `breakdown_end_timestamp`: End of the specific time window
 * - `next_page`: Pagination cursor for large result sets
 *
 * ### Usage guidelines:
 * - Time granularity: Set `window_size` to hour or day based on your analysis needs
 * - Response limits: Daily breakdowns return up to 35 days; hourly breakdowns return up to 24 hours
 *   per request
 * - Date filtering: Use `starting_on` and `ending_before` to focus on specific periods
 * - Performance: For large date ranges, use pagination to retrieve all data efficiently
 * - Backdated usage: If usage events arrive after invoice finalization, breakdowns will reflect the
 *   updated usage
 * - Zero quantity filtering: Use `skip_zero_qty_line_items=true` to exclude periods with no usage
 */
class InvoiceListBreakdownsParams
private constructor(
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
) : Params {

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

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceListBreakdownsParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .endingBefore()
         * .startingOn()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvoiceListBreakdownsParams]. */
    class Builder internal constructor() {

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
        internal fun from(invoiceListBreakdownsParams: InvoiceListBreakdownsParams) = apply {
            customerId = invoiceListBreakdownsParams.customerId
            endingBefore = invoiceListBreakdownsParams.endingBefore
            startingOn = invoiceListBreakdownsParams.startingOn
            creditTypeId = invoiceListBreakdownsParams.creditTypeId
            limit = invoiceListBreakdownsParams.limit
            nextPage = invoiceListBreakdownsParams.nextPage
            skipZeroQtyLineItems = invoiceListBreakdownsParams.skipZeroQtyLineItems
            sort = invoiceListBreakdownsParams.sort
            status = invoiceListBreakdownsParams.status
            windowSize = invoiceListBreakdownsParams.windowSize
            additionalHeaders = invoiceListBreakdownsParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceListBreakdownsParams.additionalQueryParams.toBuilder()
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

        /** Alias for calling [Builder.creditTypeId] with `creditTypeId.orElse(null)`. */
        fun creditTypeId(creditTypeId: Optional<String>) = creditTypeId(creditTypeId.getOrNull())

        /**
         * Max number of results that should be returned. For daily breakdowns, the response can
         * return up to 35 days worth of breakdowns. For hourly breakdowns, the response can return
         * up to 24 hours. If there are more results, a cursor to the next page is returned.
         */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String?) = apply { this.nextPage = nextPage }

        /** Alias for calling [Builder.nextPage] with `nextPage.orElse(null)`. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.getOrNull())

        /** If set, all zero quantity line items will be filtered out of the response */
        fun skipZeroQtyLineItems(skipZeroQtyLineItems: Boolean?) = apply {
            this.skipZeroQtyLineItems = skipZeroQtyLineItems
        }

        /**
         * Alias for [Builder.skipZeroQtyLineItems].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun skipZeroQtyLineItems(skipZeroQtyLineItems: Boolean) =
            skipZeroQtyLineItems(skipZeroQtyLineItems as Boolean?)

        /**
         * Alias for calling [Builder.skipZeroQtyLineItems] with
         * `skipZeroQtyLineItems.orElse(null)`.
         */
        fun skipZeroQtyLineItems(skipZeroQtyLineItems: Optional<Boolean>) =
            skipZeroQtyLineItems(skipZeroQtyLineItems.getOrNull())

        /** Invoice sort order by issued_at, e.g. date_asc or date_desc. Defaults to date_asc. */
        fun sort(sort: Sort?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<Sort>) = sort(sort.getOrNull())

        /** Invoice status, e.g. DRAFT or FINALIZED */
        fun status(status: String?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<String>) = status(status.getOrNull())

        /** The granularity of the breakdowns to return. Defaults to day. */
        fun windowSize(windowSize: WindowSize?) = apply { this.windowSize = windowSize }

        /** Alias for calling [Builder.windowSize] with `windowSize.orElse(null)`. */
        fun windowSize(windowSize: Optional<WindowSize>) = windowSize(windowSize.getOrNull())

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

        /**
         * Returns an immutable instance of [InvoiceListBreakdownsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .endingBefore()
         * .startingOn()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceListBreakdownsParams =
            InvoiceListBreakdownsParams(
                checkRequired("customerId", customerId),
                checkRequired("endingBefore", endingBefore),
                checkRequired("startingOn", startingOn),
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

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("ending_before", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(endingBefore))
                put("starting_on", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(startingOn))
                creditTypeId?.let { put("credit_type_id", it) }
                limit?.let { put("limit", it.toString()) }
                nextPage?.let { put("next_page", it) }
                skipZeroQtyLineItems?.let { put("skip_zero_qty_line_items", it.toString()) }
                sort?.let { put("sort", it.toString()) }
                status?.let { put("status", it) }
                windowSize?.let { put("window_size", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Invoice sort order by issued_at, e.g. date_asc or date_desc. Defaults to date_asc. */
    class Sort @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DATE_ASC = of("date_asc")

            @JvmField val DATE_DESC = of("date_desc")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            DATE_ASC,
            DATE_DESC,
        }

        /**
         * An enum containing [Sort]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Sort] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DATE_ASC,
            DATE_DESC,
            /** An enum member indicating that [Sort] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DATE_ASC -> Value.DATE_ASC
                DATE_DESC -> Value.DATE_DESC
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                DATE_ASC -> Known.DATE_ASC
                DATE_DESC -> Known.DATE_DESC
                else -> throw MetronomeInvalidDataException("Unknown Sort: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                MetronomeInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Sort = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sort && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The granularity of the breakdowns to return. Defaults to day. */
    class WindowSize @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val HOUR = of("HOUR")

            @JvmField val DAY = of("DAY")

            @JvmStatic fun of(value: String) = WindowSize(JsonField.of(value))
        }

        /** An enum containing [WindowSize]'s known values. */
        enum class Known {
            HOUR,
            DAY,
        }

        /**
         * An enum containing [WindowSize]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [WindowSize] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HOUR,
            DAY,
            /**
             * An enum member indicating that [WindowSize] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                HOUR -> Value.HOUR
                DAY -> Value.DAY
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                HOUR -> Known.HOUR
                DAY -> Known.DAY
                else -> throw MetronomeInvalidDataException("Unknown WindowSize: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                MetronomeInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): WindowSize = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WindowSize && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceListBreakdownsParams &&
            customerId == other.customerId &&
            endingBefore == other.endingBefore &&
            startingOn == other.startingOn &&
            creditTypeId == other.creditTypeId &&
            limit == other.limit &&
            nextPage == other.nextPage &&
            skipZeroQtyLineItems == other.skipZeroQtyLineItems &&
            sort == other.sort &&
            status == other.status &&
            windowSize == other.windowSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            customerId,
            endingBefore,
            startingOn,
            creditTypeId,
            limit,
            nextPage,
            skipZeroQtyLineItems,
            sort,
            status,
            windowSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InvoiceListBreakdownsParams{customerId=$customerId, endingBefore=$endingBefore, startingOn=$startingOn, creditTypeId=$creditTypeId, limit=$limit, nextPage=$nextPage, skipZeroQtyLineItems=$skipZeroQtyLineItems, sort=$sort, status=$status, windowSize=$windowSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
