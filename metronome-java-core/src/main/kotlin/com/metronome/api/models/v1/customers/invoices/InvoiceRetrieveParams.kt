// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.invoices

import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve detailed information for a specific invoice by its unique identifier. This endpoint
 * returns comprehensive invoice data including line items, applied credits, totals, and billing
 * period details for both finalized and draft invoices.
 *
 * ### Use this endpoint to:
 * - Display historical invoice details in customer-facing dashboards or billing portals.
 * - Retrieve current month draft invoices to show customers their month-to-date spend.
 * - Access finalized invoices for historical billing records and payment reconciliation.
 * - Validate customer pricing and credit applications for customer support queries.
 *
 * ### Key response fields:
 * Invoice status (DRAFT, FINALIZED, VOID) Billing period start and end dates Total amount and
 * amount due after credits Detailed line items broken down by:
 * - Customer and contract information
 * - Invoice line item type
 * - Product/service name and ID
 * - Quantity consumed
 * - Unit and total price
 * - Time period for usage-based charges
 * - Applied credits or prepaid commitments
 *
 * ### Usage guidelines:
 * - Draft invoices update in real-time as usage is reported and may change before finalization
 * - The response includes both usage-based line items (e.g., API calls, data processed) and
 *   scheduled charges (e.g., monthly subscriptions, commitment fees)
 * - Credit and commitment applications are shown as separate line items with negative amounts
 * - For voided invoices, the response will indicate VOID status but retain all original line item
 *   details
 */
class InvoiceRetrieveParams
private constructor(
    private val customerId: String,
    private val invoiceId: String,
    private val skipZeroQtyLineItems: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = customerId

    fun invoiceId(): String = invoiceId

    /** If set, all zero quantity line items will be filtered out of the response */
    fun skipZeroQtyLineItems(): Optional<Boolean> = Optional.ofNullable(skipZeroQtyLineItems)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .invoiceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvoiceRetrieveParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var invoiceId: String? = null
        private var skipZeroQtyLineItems: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(invoiceRetrieveParams: InvoiceRetrieveParams) = apply {
            customerId = invoiceRetrieveParams.customerId
            invoiceId = invoiceRetrieveParams.invoiceId
            skipZeroQtyLineItems = invoiceRetrieveParams.skipZeroQtyLineItems
            additionalHeaders = invoiceRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun invoiceId(invoiceId: String) = apply { this.invoiceId = invoiceId }

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
         * Returns an immutable instance of [InvoiceRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .invoiceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceRetrieveParams =
            InvoiceRetrieveParams(
                checkRequired("customerId", customerId),
                checkRequired("invoiceId", invoiceId),
                skipZeroQtyLineItems,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId
            1 -> invoiceId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                skipZeroQtyLineItems?.let { put("skip_zero_qty_line_items", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceRetrieveParams &&
            customerId == other.customerId &&
            invoiceId == other.invoiceId &&
            skipZeroQtyLineItems == other.skipZeroQtyLineItems &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            customerId,
            invoiceId,
            skipZeroQtyLineItems,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InvoiceRetrieveParams{customerId=$customerId, invoiceId=$invoiceId, skipZeroQtyLineItems=$skipZeroQtyLineItems, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
