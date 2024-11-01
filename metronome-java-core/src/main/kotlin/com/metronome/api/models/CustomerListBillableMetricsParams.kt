// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.models.*
import java.util.Objects
import java.util.Optional

class CustomerListBillableMetricsParams
constructor(
    private val customerId: String,
    private val limit: Long?,
    private val nextPage: String?,
    private val onCurrentPlan: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun customerId(): String = customerId

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun onCurrentPlan(): Optional<Boolean> = Optional.ofNullable(onCurrentPlan)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.nextPage?.let { params.put("next_page", listOf(it.toString())) }
        this.onCurrentPlan?.let { params.put("on_current_plan", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerListBillableMetricsParams && this.customerId == other.customerId && this.limit == other.limit && this.nextPage == other.nextPage && this.onCurrentPlan == other.onCurrentPlan && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, limit, nextPage, onCurrentPlan, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "CustomerListBillableMetricsParams{customerId=$customerId, limit=$limit, nextPage=$nextPage, onCurrentPlan=$onCurrentPlan, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var limit: Long? = null
        private var nextPage: String? = null
        private var onCurrentPlan: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerListBillableMetricsParams: CustomerListBillableMetricsParams) =
            apply {
                this.customerId = customerListBillableMetricsParams.customerId
                this.limit = customerListBillableMetricsParams.limit
                this.nextPage = customerListBillableMetricsParams.nextPage
                this.onCurrentPlan = customerListBillableMetricsParams.onCurrentPlan
                additionalQueryParams(customerListBillableMetricsParams.additionalQueryParams)
                additionalHeaders(customerListBillableMetricsParams.additionalHeaders)
            }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** Max number of results that should be returned */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /**
         * If true, the list of metrics will be filtered to just ones that are on the customer's
         * current plan
         */
        fun onCurrentPlan(onCurrentPlan: Boolean) = apply { this.onCurrentPlan = onCurrentPlan }

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

        fun build(): CustomerListBillableMetricsParams =
            CustomerListBillableMetricsParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                limit,
                nextPage,
                onCurrentPlan,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
            )
    }
}
