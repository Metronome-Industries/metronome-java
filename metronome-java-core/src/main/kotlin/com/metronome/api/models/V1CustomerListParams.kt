// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.Params
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/**
 * Gets a paginated list of all customers in your Metronome account. Use this endpoint to browse
 * your customer base, implement customer search functionality, or sync customer data with external
 * systems. Returns customer details including IDs, names, and configuration settings. Supports
 * filtering and pagination parameters for efficient data retrieval.
 */
class V1CustomerListParams
private constructor(
    private val customerIds: List<String>?,
    private val ingestAlias: String?,
    private val limit: Long?,
    private val nextPage: String?,
    private val onlyArchived: Boolean?,
    private val salesforceAccountIds: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter the customer list by customer_id. Up to 100 ids can be provided. */
    fun customerIds(): Optional<List<String>> = Optional.ofNullable(customerIds)

    /** Filter the customer list by ingest_alias */
    fun ingestAlias(): Optional<String> = Optional.ofNullable(ingestAlias)

    /** Max number of results that should be returned */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /**
     * Filter the customer list to only return archived customers. By default, only active customers
     * are returned.
     */
    fun onlyArchived(): Optional<Boolean> = Optional.ofNullable(onlyArchived)

    /** Filter the customer list by salesforce_account_id. Up to 100 ids can be provided. */
    fun salesforceAccountIds(): Optional<List<String>> = Optional.ofNullable(salesforceAccountIds)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
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

        @JvmStatic fun none(): V1CustomerListParams = builder().build()

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1CustomerListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var customerIds: MutableList<String>? = null
        private var ingestAlias: String? = null
        private var limit: Long? = null
        private var nextPage: String? = null
        private var onlyArchived: Boolean? = null
        private var salesforceAccountIds: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1CustomerListParams: V1CustomerListParams) = apply {
            customerIds = v1CustomerListParams.customerIds?.toMutableList()
            ingestAlias = v1CustomerListParams.ingestAlias
            limit = v1CustomerListParams.limit
            nextPage = v1CustomerListParams.nextPage
            onlyArchived = v1CustomerListParams.onlyArchived
            salesforceAccountIds = v1CustomerListParams.salesforceAccountIds?.toMutableList()
            additionalHeaders = v1CustomerListParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1CustomerListParams.additionalQueryParams.toBuilder()
        }

        /** Filter the customer list by customer_id. Up to 100 ids can be provided. */
        fun customerIds(customerIds: List<String>?) = apply {
            this.customerIds = customerIds?.toMutableList()
        }

        /** Filter the customer list by customer_id. Up to 100 ids can be provided. */
        fun customerIds(customerIds: Optional<List<String>>) = customerIds(customerIds.orElse(null))

        /** Filter the customer list by customer_id. Up to 100 ids can be provided. */
        fun addCustomerId(customerId: String) = apply {
            customerIds = (customerIds ?: mutableListOf()).apply { add(customerId) }
        }

        /** Filter the customer list by ingest_alias */
        fun ingestAlias(ingestAlias: String?) = apply { this.ingestAlias = ingestAlias }

        /** Filter the customer list by ingest_alias */
        fun ingestAlias(ingestAlias: Optional<String>) = ingestAlias(ingestAlias.orElse(null))

        /** Max number of results that should be returned */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /** Max number of results that should be returned */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Max number of results that should be returned */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun limit(limit: Optional<Long>) = limit(limit.orElse(null) as Long?)

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String?) = apply { this.nextPage = nextPage }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.orElse(null))

        /**
         * Filter the customer list to only return archived customers. By default, only active
         * customers are returned.
         */
        fun onlyArchived(onlyArchived: Boolean?) = apply { this.onlyArchived = onlyArchived }

        /**
         * Filter the customer list to only return archived customers. By default, only active
         * customers are returned.
         */
        fun onlyArchived(onlyArchived: Boolean) = onlyArchived(onlyArchived as Boolean?)

        /**
         * Filter the customer list to only return archived customers. By default, only active
         * customers are returned.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun onlyArchived(onlyArchived: Optional<Boolean>) =
            onlyArchived(onlyArchived.orElse(null) as Boolean?)

        /** Filter the customer list by salesforce_account_id. Up to 100 ids can be provided. */
        fun salesforceAccountIds(salesforceAccountIds: List<String>?) = apply {
            this.salesforceAccountIds = salesforceAccountIds?.toMutableList()
        }

        /** Filter the customer list by salesforce_account_id. Up to 100 ids can be provided. */
        fun salesforceAccountIds(salesforceAccountIds: Optional<List<String>>) =
            salesforceAccountIds(salesforceAccountIds.orElse(null))

        /** Filter the customer list by salesforce_account_id. Up to 100 ids can be provided. */
        fun addSalesforceAccountId(salesforceAccountId: String) = apply {
            salesforceAccountIds =
                (salesforceAccountIds ?: mutableListOf()).apply { add(salesforceAccountId) }
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

        fun build(): V1CustomerListParams =
            V1CustomerListParams(
                customerIds?.toImmutable(),
                ingestAlias,
                limit,
                nextPage,
                onlyArchived,
                salesforceAccountIds?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1CustomerListParams && customerIds == other.customerIds && ingestAlias == other.ingestAlias && limit == other.limit && nextPage == other.nextPage && onlyArchived == other.onlyArchived && salesforceAccountIds == other.salesforceAccountIds && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerIds, ingestAlias, limit, nextPage, onlyArchived, salesforceAccountIds, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V1CustomerListParams{customerIds=$customerIds, ingestAlias=$ingestAlias, limit=$limit, nextPage=$nextPage, onlyArchived=$onlyArchived, salesforceAccountIds=$salesforceAccountIds, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
