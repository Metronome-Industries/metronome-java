// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.models.*
import java.util.Objects
import java.util.Optional

class CustomerListParams
constructor(
    private val customerIds: List<String>?,
    private val ingestAlias: String?,
    private val limit: Long?,
    private val nextPage: String?,
    private val onlyArchived: Boolean?,
    private val salesforceAccountIds: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerIds(): Optional<List<String>> = Optional.ofNullable(customerIds)

    fun ingestAlias(): Optional<String> = Optional.ofNullable(ingestAlias)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun onlyArchived(): Optional<Boolean> = Optional.ofNullable(onlyArchived)

    fun salesforceAccountIds(): Optional<List<String>> = Optional.ofNullable(salesforceAccountIds)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.customerIds?.let {
            queryParams.put("customer_ids", listOf(it.joinToString(separator = ",")))
        }
        this.ingestAlias?.let { queryParams.put("ingest_alias", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        this.onlyArchived?.let { queryParams.put("only_archived", listOf(it.toString())) }
        this.salesforceAccountIds?.let {
            queryParams.put("salesforce_account_ids", listOf(it.joinToString(separator = ",")))
        }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerIds: MutableList<String> = mutableListOf()
        private var ingestAlias: String? = null
        private var limit: Long? = null
        private var nextPage: String? = null
        private var onlyArchived: Boolean? = null
        private var salesforceAccountIds: MutableList<String> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerListParams: CustomerListParams) = apply {
            customerIds = customerListParams.customerIds?.toMutableList() ?: mutableListOf()
            ingestAlias = customerListParams.ingestAlias
            limit = customerListParams.limit
            nextPage = customerListParams.nextPage
            onlyArchived = customerListParams.onlyArchived
            salesforceAccountIds =
                customerListParams.salesforceAccountIds?.toMutableList() ?: mutableListOf()
            additionalHeaders = customerListParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerListParams.additionalQueryParams.toBuilder()
        }

        /** Filter the customer list by customer_id. Up to 100 ids can be provided. */
        fun customerIds(customerIds: List<String>) = apply {
            this.customerIds.clear()
            this.customerIds.addAll(customerIds)
        }

        /** Filter the customer list by customer_id. Up to 100 ids can be provided. */
        fun addCustomerId(customerId: String) = apply { this.customerIds.add(customerId) }

        /** Filter the customer list by ingest_alias */
        fun ingestAlias(ingestAlias: String) = apply { this.ingestAlias = ingestAlias }

        /** Max number of results that should be returned */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /** Filter the customer list by only archived customers. */
        fun onlyArchived(onlyArchived: Boolean) = apply { this.onlyArchived = onlyArchived }

        /** Filter the customer list by salesforce_account_id. Up to 100 ids can be provided. */
        fun salesforceAccountIds(salesforceAccountIds: List<String>) = apply {
            this.salesforceAccountIds.clear()
            this.salesforceAccountIds.addAll(salesforceAccountIds)
        }

        /** Filter the customer list by salesforce_account_id. Up to 100 ids can be provided. */
        fun addSalesforceAccountId(salesforceAccountId: String) = apply {
            this.salesforceAccountIds.add(salesforceAccountId)
        }

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

        fun build(): CustomerListParams =
            CustomerListParams(
                customerIds.toImmutable().ifEmpty { null },
                ingestAlias,
                limit,
                nextPage,
                onlyArchived,
                salesforceAccountIds.toImmutable().ifEmpty { null },
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerListParams && customerIds == other.customerIds && ingestAlias == other.ingestAlias && limit == other.limit && nextPage == other.nextPage && onlyArchived == other.onlyArchived && salesforceAccountIds == other.salesforceAccountIds && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerIds, ingestAlias, limit, nextPage, onlyArchived, salesforceAccountIds, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerListParams{customerIds=$customerIds, ingestAlias=$ingestAlias, limit=$limit, nextPage=$nextPage, onlyArchived=$onlyArchived, salesforceAccountIds=$salesforceAccountIds, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
