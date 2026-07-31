// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get all billable metrics available for a specific customer. Supports pagination and filtering by
 * current plan status or archived metrics. Use this endpoint to see which metrics are being tracked
 * for billing calculations for a given customer.
 */
class CustomerListBillableMetricsParams
private constructor(
    private val customerId: String,
    private val includeArchived: Boolean?,
    private val limit: Long?,
    private val nextPage: String?,
    private val onCurrentPlan: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerListBillableMetricsParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerListBillableMetricsParams]. */
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

        /**
         * Alias for [Builder.includeArchived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeArchived(includeArchived: Boolean) = includeArchived(includeArchived as Boolean?)

        /** Alias for calling [Builder.includeArchived] with `includeArchived.orElse(null)`. */
        fun includeArchived(includeArchived: Optional<Boolean>) =
            includeArchived(includeArchived.getOrNull())

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
         * If true, the list of metrics will be filtered to just ones that are on the customer's
         * current plan
         */
        fun onCurrentPlan(onCurrentPlan: Boolean?) = apply { this.onCurrentPlan = onCurrentPlan }

        /**
         * Alias for [Builder.onCurrentPlan].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun onCurrentPlan(onCurrentPlan: Boolean) = onCurrentPlan(onCurrentPlan as Boolean?)

        /** Alias for calling [Builder.onCurrentPlan] with `onCurrentPlan.orElse(null)`. */
        fun onCurrentPlan(onCurrentPlan: Optional<Boolean>) =
            onCurrentPlan(onCurrentPlan.getOrNull())

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
         * Returns an immutable instance of [CustomerListBillableMetricsParams].
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

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeArchived?.let { put("include_archived", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                nextPage?.let { put("next_page", it) }
                onCurrentPlan?.let { put("on_current_plan", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListBillableMetricsParams &&
            customerId == other.customerId &&
            includeArchived == other.includeArchived &&
            limit == other.limit &&
            nextPage == other.nextPage &&
            onCurrentPlan == other.onCurrentPlan &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            customerId,
            includeArchived,
            limit,
            nextPage,
            onCurrentPlan,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CustomerListBillableMetricsParams{customerId=$customerId, includeArchived=$includeArchived, limit=$limit, nextPage=$nextPage, onCurrentPlan=$onCurrentPlan, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
