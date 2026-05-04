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
 * Retrieves a paginated list of invoices for a specific customer, with flexible filtering options
 * to narrow results by status, date range, credit type, and more. This endpoint provides a
 * comprehensive view of a customer's billing history and current charges, supporting both real-time
 * billing dashboards and historical reporting needs.
 *
 * ### Use this endpoint to:
 * - Display historical invoice details in customer-facing dashboards or billing portals.
 * - Retrieve current month draft invoices to show customers their month-to-date spend.
 * - Access finalized invoices for historical billing records and payment reconciliation.
 * - Validate customer pricing and credit applications for customer support queries.
 * - Generate financial reports by filtering invoices within specific date ranges
 *
 * ### Key response fields:
 * Array of invoice objects containing:
 * - Invoice ID and status (DRAFT, FINALIZED, VOID)
 * - Invoice type (USAGE, SCHEDULED)
 * - Billing period start and end dates
 * - Issue date and due date
 * - Total amount, subtotal, and amount due
 * - Applied credits summary
 * - Contract ID reference
 * - External billing provider status (if integrated with Stripe, etc.)
 * - Pagination metadata `next_page` cursor
 *
 * ### Usage guidelines:
 * - The endpoint returns invoice summaries; use the Get Invoice endpoint for detailed line items
 * - Draft invoices are continuously updated as new usage is reported and will show real-time spend
 * - Results are ordered by creation date descending by default (newest first)
 * - When filtering by date range, the filter applies to the billing period, not the issue date
 * - For customers with many invoices, implement pagination to ensure all results are retrieved
 *   External billing provider statuses (like Stripe payment status) are included when applicable
 * - Voided invoices are included in results by default unless filtered out by status
 */
class InvoiceListParams
private constructor(
    private val customerId: String,
    private val contractId: String?,
    private val creditTypeId: String?,
    private val endingBefore: OffsetDateTime?,
    private val limit: Long?,
    private val nextPage: String?,
    private val skipZeroQtyLineItems: Boolean?,
    private val sort: Sort?,
    private val startingOn: OffsetDateTime?,
    private val status: String?,
    private val type: Type?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = customerId

    /** Only return invoices for the specified contract */
    fun contractId(): Optional<String> = Optional.ofNullable(contractId)

    /** Only return invoices for the specified credit type */
    fun creditTypeId(): Optional<String> = Optional.ofNullable(creditTypeId)

    /**
     * RFC 3339 timestamp (exclusive). Invoices will only be returned for billing periods that end
     * before this time.
     */
    fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

    /** Max number of results that should be returned */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /** If set, all zero quantity line items will be filtered out of the response */
    fun skipZeroQtyLineItems(): Optional<Boolean> = Optional.ofNullable(skipZeroQtyLineItems)

    /** Invoice sort order by issued_at, e.g. date_asc or date_desc. Defaults to date_asc. */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /**
     * RFC 3339 timestamp (inclusive). Invoices will only be returned for billing periods that start
     * at or after this time.
     */
    fun startingOn(): Optional<OffsetDateTime> = Optional.ofNullable(startingOn)

    /** Invoice status, e.g. DRAFT, FINALIZED, or VOID */
    fun status(): Optional<String> = Optional.ofNullable(status)

    /** Filter invoices by type. Defaults to returning all invoice types. */
    fun type(): Optional<Type> = Optional.ofNullable(type)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceListParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvoiceListParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var contractId: String? = null
        private var creditTypeId: String? = null
        private var endingBefore: OffsetDateTime? = null
        private var limit: Long? = null
        private var nextPage: String? = null
        private var skipZeroQtyLineItems: Boolean? = null
        private var sort: Sort? = null
        private var startingOn: OffsetDateTime? = null
        private var status: String? = null
        private var type: Type? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(invoiceListParams: InvoiceListParams) = apply {
            customerId = invoiceListParams.customerId
            contractId = invoiceListParams.contractId
            creditTypeId = invoiceListParams.creditTypeId
            endingBefore = invoiceListParams.endingBefore
            limit = invoiceListParams.limit
            nextPage = invoiceListParams.nextPage
            skipZeroQtyLineItems = invoiceListParams.skipZeroQtyLineItems
            sort = invoiceListParams.sort
            startingOn = invoiceListParams.startingOn
            status = invoiceListParams.status
            type = invoiceListParams.type
            additionalHeaders = invoiceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceListParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** Only return invoices for the specified contract */
        fun contractId(contractId: String?) = apply { this.contractId = contractId }

        /** Alias for calling [Builder.contractId] with `contractId.orElse(null)`. */
        fun contractId(contractId: Optional<String>) = contractId(contractId.getOrNull())

        /** Only return invoices for the specified credit type */
        fun creditTypeId(creditTypeId: String?) = apply { this.creditTypeId = creditTypeId }

        /** Alias for calling [Builder.creditTypeId] with `creditTypeId.orElse(null)`. */
        fun creditTypeId(creditTypeId: Optional<String>) = creditTypeId(creditTypeId.getOrNull())

        /**
         * RFC 3339 timestamp (exclusive). Invoices will only be returned for billing periods that
         * end before this time.
         */
        fun endingBefore(endingBefore: OffsetDateTime?) = apply { this.endingBefore = endingBefore }

        /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
        fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
            endingBefore(endingBefore.getOrNull())

        /** Max number of results that should be returned */
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

        /**
         * RFC 3339 timestamp (inclusive). Invoices will only be returned for billing periods that
         * start at or after this time.
         */
        fun startingOn(startingOn: OffsetDateTime?) = apply { this.startingOn = startingOn }

        /** Alias for calling [Builder.startingOn] with `startingOn.orElse(null)`. */
        fun startingOn(startingOn: Optional<OffsetDateTime>) = startingOn(startingOn.getOrNull())

        /** Invoice status, e.g. DRAFT, FINALIZED, or VOID */
        fun status(status: String?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<String>) = status(status.getOrNull())

        /** Filter invoices by type. Defaults to returning all invoice types. */
        fun type(type: Type?) = apply { this.type = type }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<Type>) = type(type.getOrNull())

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
         * Returns an immutable instance of [InvoiceListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceListParams =
            InvoiceListParams(
                checkRequired("customerId", customerId),
                contractId,
                creditTypeId,
                endingBefore,
                limit,
                nextPage,
                skipZeroQtyLineItems,
                sort,
                startingOn,
                status,
                type,
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
                contractId?.let { put("contract_id", it) }
                creditTypeId?.let { put("credit_type_id", it) }
                endingBefore?.let {
                    put("ending_before", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                limit?.let { put("limit", it.toString()) }
                nextPage?.let { put("next_page", it) }
                skipZeroQtyLineItems?.let { put("skip_zero_qty_line_items", it.toString()) }
                sort?.let { put("sort", it.toString()) }
                startingOn?.let {
                    put("starting_on", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                status?.let { put("status", it) }
                type?.let { put("type", it.toString()) }
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

    /** Filter invoices by type. Defaults to returning all invoice types. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val USAGE = of("USAGE")

            @JvmField val USAGE_CONSOLIDATED = of("USAGE_CONSOLIDATED")

            @JvmField val SCHEDULED = of("SCHEDULED")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            USAGE,
            USAGE_CONSOLIDATED,
            SCHEDULED,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USAGE,
            USAGE_CONSOLIDATED,
            SCHEDULED,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                USAGE -> Value.USAGE
                USAGE_CONSOLIDATED -> Value.USAGE_CONSOLIDATED
                SCHEDULED -> Value.SCHEDULED
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
                USAGE -> Known.USAGE
                USAGE_CONSOLIDATED -> Known.USAGE_CONSOLIDATED
                SCHEDULED -> Known.SCHEDULED
                else -> throw MetronomeInvalidDataException("Unknown Type: $value")
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
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceListParams &&
            customerId == other.customerId &&
            contractId == other.contractId &&
            creditTypeId == other.creditTypeId &&
            endingBefore == other.endingBefore &&
            limit == other.limit &&
            nextPage == other.nextPage &&
            skipZeroQtyLineItems == other.skipZeroQtyLineItems &&
            sort == other.sort &&
            startingOn == other.startingOn &&
            status == other.status &&
            type == other.type &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            customerId,
            contractId,
            creditTypeId,
            endingBefore,
            limit,
            nextPage,
            skipZeroQtyLineItems,
            sort,
            startingOn,
            status,
            type,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InvoiceListParams{customerId=$customerId, contractId=$contractId, creditTypeId=$creditTypeId, endingBefore=$endingBefore, limit=$limit, nextPage=$nextPage, skipZeroQtyLineItems=$skipZeroQtyLineItems, sort=$sort, startingOn=$startingOn, status=$status, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
