// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.metronome.api.core.Params
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Gets a paginated list of all customers in your Metronome account. Use this endpoint to browse
 * your customer base, implement customer search functionality, or sync customer data with external
 * systems. Returns customer details including IDs, names, and configuration settings. Supports
 * filtering and pagination parameters for efficient data retrieval.
 */
class CustomerListParams
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

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CustomerListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CustomerListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerListParams]. */
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
        internal fun from(customerListParams: CustomerListParams) = apply {
            customerIds = customerListParams.customerIds?.toMutableList()
            ingestAlias = customerListParams.ingestAlias
            limit = customerListParams.limit
            nextPage = customerListParams.nextPage
            onlyArchived = customerListParams.onlyArchived
            salesforceAccountIds = customerListParams.salesforceAccountIds?.toMutableList()
            additionalHeaders = customerListParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerListParams.additionalQueryParams.toBuilder()
        }

        /** Filter the customer list by customer_id. Up to 100 ids can be provided. */
        fun customerIds(customerIds: List<String>?) = apply {
            this.customerIds = customerIds?.toMutableList()
        }

        /** Alias for calling [Builder.customerIds] with `customerIds.orElse(null)`. */
        fun customerIds(customerIds: Optional<List<String>>) = customerIds(customerIds.getOrNull())

        /**
         * Adds a single [String] to [customerIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomerId(customerId: String) = apply {
            customerIds = (customerIds ?: mutableListOf()).apply { add(customerId) }
        }

        /** Filter the customer list by ingest_alias */
        fun ingestAlias(ingestAlias: String?) = apply { this.ingestAlias = ingestAlias }

        /** Alias for calling [Builder.ingestAlias] with `ingestAlias.orElse(null)`. */
        fun ingestAlias(ingestAlias: Optional<String>) = ingestAlias(ingestAlias.getOrNull())

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

        /**
         * Filter the customer list to only return archived customers. By default, only active
         * customers are returned.
         */
        fun onlyArchived(onlyArchived: Boolean?) = apply { this.onlyArchived = onlyArchived }

        /**
         * Alias for [Builder.onlyArchived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun onlyArchived(onlyArchived: Boolean) = onlyArchived(onlyArchived as Boolean?)

        /** Alias for calling [Builder.onlyArchived] with `onlyArchived.orElse(null)`. */
        fun onlyArchived(onlyArchived: Optional<Boolean>) = onlyArchived(onlyArchived.getOrNull())

        /** Filter the customer list by salesforce_account_id. Up to 100 ids can be provided. */
        fun salesforceAccountIds(salesforceAccountIds: List<String>?) = apply {
            this.salesforceAccountIds = salesforceAccountIds?.toMutableList()
        }

        /**
         * Alias for calling [Builder.salesforceAccountIds] with
         * `salesforceAccountIds.orElse(null)`.
         */
        fun salesforceAccountIds(salesforceAccountIds: Optional<List<String>>) =
            salesforceAccountIds(salesforceAccountIds.getOrNull())

        /**
         * Adds a single [String] to [salesforceAccountIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
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

        /**
         * Returns an immutable instance of [CustomerListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomerListParams =
            CustomerListParams(
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

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                customerIds?.let { put("customer_ids", it.joinToString(",")) }
                ingestAlias?.let { put("ingest_alias", it) }
                limit?.let { put("limit", it.toString()) }
                nextPage?.let { put("next_page", it) }
                onlyArchived?.let { put("only_archived", it.toString()) }
                salesforceAccountIds?.let { put("salesforce_account_ids", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListParams &&
            customerIds == other.customerIds &&
            ingestAlias == other.ingestAlias &&
            limit == other.limit &&
            nextPage == other.nextPage &&
            onlyArchived == other.onlyArchived &&
            salesforceAccountIds == other.salesforceAccountIds &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            customerIds,
            ingestAlias,
            limit,
            nextPage,
            onlyArchived,
            salesforceAccountIds,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CustomerListParams{customerIds=$customerIds, ingestAlias=$ingestAlias, limit=$limit, nextPage=$nextPage, onlyArchived=$onlyArchived, salesforceAccountIds=$salesforceAccountIds, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
