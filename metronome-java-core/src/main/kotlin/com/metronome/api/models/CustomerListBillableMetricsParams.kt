// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional

/** Get all billable metrics for a given customer. */
class CustomerListBillableMetricsParams
private constructor(
    private val customerId: String,
    private val includeArchived: Boolean?,
    private val limit: Long?,
    private val nextPage: String?,
    private val onCurrentPlan: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = customerId

    /** If true, the list of returned metrics will include archived metrics */
    fun includeArchived(): Optional<Boolean> = Optional.ofNullable(includeArchived)

    /** Max number of results that should be returned */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /**
     * If true, the list of metrics will be filtered to just ones that are on the customer's current
     * plan
     */
    fun onCurrentPlan(): Optional<Boolean> = Optional.ofNullable(onCurrentPlan)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.includeArchived?.let { queryParams.put("include_archived", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        this.onCurrentPlan?.let { queryParams.put("on_current_plan", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerListBillableMetricsParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var customerId: String? = null
        private var includeArchived: Boolean? = null
        private var limit: Long? = null
        private var nextPage: String? = null
        private var onCurrentPlan: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerListBillableMetricsParams: CustomerListBillableMetricsParams) =
            apply {
                customerId = customerListBillableMetricsParams.customerId
                includeArchived = customerListBillableMetricsParams.includeArchived
                limit = customerListBillableMetricsParams.limit
                nextPage = customerListBillableMetricsParams.nextPage
                onCurrentPlan = customerListBillableMetricsParams.onCurrentPlan
                additionalHeaders = customerListBillableMetricsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    customerListBillableMetricsParams.additionalQueryParams.toBuilder()
            }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** If true, the list of returned metrics will include archived metrics */
        fun includeArchived(includeArchived: Boolean?) = apply {
            this.includeArchived = includeArchived
        }

        /** If true, the list of returned metrics will include archived metrics */
        fun includeArchived(includeArchived: Boolean) = includeArchived(includeArchived as Boolean?)

        /** If true, the list of returned metrics will include archived metrics */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun includeArchived(includeArchived: Optional<Boolean>) =
            includeArchived(includeArchived.orElse(null) as Boolean?)

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
         * If true, the list of metrics will be filtered to just ones that are on the customer's
         * current plan
         */
        fun onCurrentPlan(onCurrentPlan: Boolean?) = apply { this.onCurrentPlan = onCurrentPlan }

        /**
         * If true, the list of metrics will be filtered to just ones that are on the customer's
         * current plan
         */
        fun onCurrentPlan(onCurrentPlan: Boolean) = onCurrentPlan(onCurrentPlan as Boolean?)

        /**
         * If true, the list of metrics will be filtered to just ones that are on the customer's
         * current plan
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun onCurrentPlan(onCurrentPlan: Optional<Boolean>) =
            onCurrentPlan(onCurrentPlan.orElse(null) as Boolean?)

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

        fun build(): CustomerListBillableMetricsParams =
            CustomerListBillableMetricsParams(
                checkRequired("customerId", customerId),
                includeArchived,
                limit,
                nextPage,
                onCurrentPlan,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerListBillableMetricsParams && customerId == other.customerId && includeArchived == other.includeArchived && limit == other.limit && nextPage == other.nextPage && onCurrentPlan == other.onCurrentPlan && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, includeArchived, limit, nextPage, onCurrentPlan, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerListBillableMetricsParams{customerId=$customerId, includeArchived=$includeArchived, limit=$limit, nextPage=$nextPage, onCurrentPlan=$onCurrentPlan, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
