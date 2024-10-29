// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.models.*
import java.util.Objects
import java.util.Optional

class CustomerInvoiceRetrieveParams
constructor(
    private val customerId: String,
    private val invoiceId: String,
    private val skipZeroQtyLineItems: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun customerId(): String = customerId

    fun invoiceId(): String = invoiceId

    fun skipZeroQtyLineItems(): Optional<Boolean> = Optional.ofNullable(skipZeroQtyLineItems)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.skipZeroQtyLineItems?.let {
            params.put("skip_zero_qty_line_items", listOf(it.toString()))
        }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            1 -> invoiceId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerInvoiceRetrieveParams && this.customerId == other.customerId && this.invoiceId == other.invoiceId && this.skipZeroQtyLineItems == other.skipZeroQtyLineItems && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, invoiceId, skipZeroQtyLineItems, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "CustomerInvoiceRetrieveParams{customerId=$customerId, invoiceId=$invoiceId, skipZeroQtyLineItems=$skipZeroQtyLineItems, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var invoiceId: String? = null
        private var skipZeroQtyLineItems: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerInvoiceRetrieveParams: CustomerInvoiceRetrieveParams) = apply {
            this.customerId = customerInvoiceRetrieveParams.customerId
            this.invoiceId = customerInvoiceRetrieveParams.invoiceId
            this.skipZeroQtyLineItems = customerInvoiceRetrieveParams.skipZeroQtyLineItems
            additionalQueryParams(customerInvoiceRetrieveParams.additionalQueryParams)
            additionalHeaders(customerInvoiceRetrieveParams.additionalHeaders)
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun invoiceId(invoiceId: String) = apply { this.invoiceId = invoiceId }

        /** If set, all zero quantity line items will be filtered out of the response */
        fun skipZeroQtyLineItems(skipZeroQtyLineItems: Boolean) = apply {
            this.skipZeroQtyLineItems = skipZeroQtyLineItems
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): CustomerInvoiceRetrieveParams =
            CustomerInvoiceRetrieveParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(invoiceId) { "`invoiceId` is required but was not set" },
                skipZeroQtyLineItems,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
