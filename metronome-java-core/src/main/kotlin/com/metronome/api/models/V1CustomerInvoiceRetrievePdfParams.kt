// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import java.util.Objects

/**
 * Retrieve a PDF version of a specific invoice by its unique identifier. This endpoint generates a
 * professionally formatted invoice document suitable for sharing with customers, accounting teams,
 * or for record-keeping purposes.
 *
 * ### Use this endpoint to:
 * - Provide customers with downloadable or emailable copies of their invoices
 * - Support accounting and finance teams with official billing documents
 * - Maintain accurate records of billing transactions for audits and compliance
 *
 * ### Key response details:
 * - The response is a binary PDF file representing the full invoice
 * - The PDF includes all standard invoice information such as line items, totals, billing period,
 *   and customer details
 * - The document is formatted for clarity and professionalism, suitable for official use
 *
 * ### Usage guidelines:
 * - Ensure the `invoice_id` corresponds to an existing invoice for the specified `customer_id`
 * - The PDF is generated on-demand; frequent requests for the same invoice may impact performance
 * - Use appropriate headers to handle the binary response in your application (e.g., setting
 *   `Content-Type: application/pdf`)
 */
class V1CustomerInvoiceRetrievePdfParams
private constructor(
    private val customerId: String,
    private val invoiceId: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = customerId

    fun invoiceId(): String = invoiceId

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            1 -> invoiceId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1CustomerInvoiceRetrievePdfParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var customerId: String? = null
        private var invoiceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1CustomerInvoiceRetrievePdfParams: V1CustomerInvoiceRetrievePdfParams) =
            apply {
                customerId = v1CustomerInvoiceRetrievePdfParams.customerId
                invoiceId = v1CustomerInvoiceRetrievePdfParams.invoiceId
                additionalHeaders = v1CustomerInvoiceRetrievePdfParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    v1CustomerInvoiceRetrievePdfParams.additionalQueryParams.toBuilder()
            }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun invoiceId(invoiceId: String) = apply { this.invoiceId = invoiceId }

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

        fun build(): V1CustomerInvoiceRetrievePdfParams =
            V1CustomerInvoiceRetrievePdfParams(
                checkRequired("customerId", customerId),
                checkRequired("invoiceId", invoiceId),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1CustomerInvoiceRetrievePdfParams && customerId == other.customerId && invoiceId == other.invoiceId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, invoiceId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V1CustomerInvoiceRetrievePdfParams{customerId=$customerId, invoiceId=$invoiceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
