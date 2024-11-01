// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.NoAutoDetect
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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun customerIds(): Optional<List<String>> = Optional.ofNullable(customerIds)

    fun ingestAlias(): Optional<String> = Optional.ofNullable(ingestAlias)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun onlyArchived(): Optional<Boolean> = Optional.ofNullable(onlyArchived)

    fun salesforceAccountIds(): Optional<List<String>> = Optional.ofNullable(salesforceAccountIds)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.customerIds?.let {
            params.put("customer_ids", listOf(it.joinToString(separator = ",")))
        }
        this.ingestAlias?.let { params.put("ingest_alias", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.nextPage?.let { params.put("next_page", listOf(it.toString())) }
        this.onlyArchived?.let { params.put("only_archived", listOf(it.toString())) }
        this.salesforceAccountIds?.let {
            params.put("salesforce_account_ids", listOf(it.joinToString(separator = ",")))
        }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerListParams && this.customerIds == other.customerIds && this.ingestAlias == other.ingestAlias && this.limit == other.limit && this.nextPage == other.nextPage && this.onlyArchived == other.onlyArchived && this.salesforceAccountIds == other.salesforceAccountIds && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerIds, ingestAlias, limit, nextPage, onlyArchived, salesforceAccountIds, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "CustomerListParams{customerIds=$customerIds, ingestAlias=$ingestAlias, limit=$limit, nextPage=$nextPage, onlyArchived=$onlyArchived, salesforceAccountIds=$salesforceAccountIds, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerListParams: CustomerListParams) = apply {
            this.customerIds(customerListParams.customerIds ?: listOf())
            this.ingestAlias = customerListParams.ingestAlias
            this.limit = customerListParams.limit
            this.nextPage = customerListParams.nextPage
            this.onlyArchived = customerListParams.onlyArchived
            this.salesforceAccountIds(customerListParams.salesforceAccountIds ?: listOf())
            additionalQueryParams(customerListParams.additionalQueryParams)
            additionalHeaders(customerListParams.additionalHeaders)
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

        fun build(): CustomerListParams =
            CustomerListParams(
                if (customerIds.size == 0) null else customerIds.toImmutable(),
                ingestAlias,
                limit,
                nextPage,
                onlyArchived,
                if (salesforceAccountIds.size == 0) null else salesforceAccountIds.toImmutable(),
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
            )
    }
}
