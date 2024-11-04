// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class CreditGrantListParams
constructor(
    private val limit: Long?,
    private val nextPage: String?,
    private val creditGrantIds: List<String>?,
    private val creditTypeIds: List<String>?,
    private val customerIds: List<String>?,
    private val effectiveBefore: OffsetDateTime?,
    private val notExpiringBefore: OffsetDateTime?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun creditGrantIds(): Optional<List<String>> = Optional.ofNullable(creditGrantIds)

    fun creditTypeIds(): Optional<List<String>> = Optional.ofNullable(creditTypeIds)

    fun customerIds(): Optional<List<String>> = Optional.ofNullable(customerIds)

    fun effectiveBefore(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveBefore)

    fun notExpiringBefore(): Optional<OffsetDateTime> = Optional.ofNullable(notExpiringBefore)

    @JvmSynthetic
    internal fun getBody(): CreditGrantListBody {
        return CreditGrantListBody(
            creditGrantIds,
            creditTypeIds,
            customerIds,
            effectiveBefore,
            notExpiringBefore,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.nextPage?.let { params.put("next_page", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    @JsonDeserialize(builder = CreditGrantListBody.Builder::class)
    @NoAutoDetect
    class CreditGrantListBody
    internal constructor(
        private val creditGrantIds: List<String>?,
        private val creditTypeIds: List<String>?,
        private val customerIds: List<String>?,
        private val effectiveBefore: OffsetDateTime?,
        private val notExpiringBefore: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
         * customer_ids may be specified.
         */
        @JsonProperty("credit_grant_ids") fun creditGrantIds(): List<String>? = creditGrantIds

        /**
         * An array of credit type IDs. This must not be specified if credit_grant_ids is specified.
         */
        @JsonProperty("credit_type_ids") fun creditTypeIds(): List<String>? = creditTypeIds

        /**
         * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
         * specified.
         */
        @JsonProperty("customer_ids") fun customerIds(): List<String>? = customerIds

        /** Only return credit grants that are effective before this timestamp (exclusive). */
        @JsonProperty("effective_before") fun effectiveBefore(): OffsetDateTime? = effectiveBefore

        /** Only return credit grants that expire at or after this timestamp. */
        @JsonProperty("not_expiring_before")
        fun notExpiringBefore(): OffsetDateTime? = notExpiringBefore

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var creditGrantIds: List<String>? = null
            private var creditTypeIds: List<String>? = null
            private var customerIds: List<String>? = null
            private var effectiveBefore: OffsetDateTime? = null
            private var notExpiringBefore: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditGrantListBody: CreditGrantListBody) = apply {
                this.creditGrantIds = creditGrantListBody.creditGrantIds
                this.creditTypeIds = creditGrantListBody.creditTypeIds
                this.customerIds = creditGrantListBody.customerIds
                this.effectiveBefore = creditGrantListBody.effectiveBefore
                this.notExpiringBefore = creditGrantListBody.notExpiringBefore
                additionalProperties(creditGrantListBody.additionalProperties)
            }

            /**
             * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
             * customer_ids may be specified.
             */
            @JsonProperty("credit_grant_ids")
            fun creditGrantIds(creditGrantIds: List<String>) = apply {
                this.creditGrantIds = creditGrantIds
            }

            /**
             * An array of credit type IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            @JsonProperty("credit_type_ids")
            fun creditTypeIds(creditTypeIds: List<String>) = apply {
                this.creditTypeIds = creditTypeIds
            }

            /**
             * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            @JsonProperty("customer_ids")
            fun customerIds(customerIds: List<String>) = apply { this.customerIds = customerIds }

            /** Only return credit grants that are effective before this timestamp (exclusive). */
            @JsonProperty("effective_before")
            fun effectiveBefore(effectiveBefore: OffsetDateTime) = apply {
                this.effectiveBefore = effectiveBefore
            }

            /** Only return credit grants that expire at or after this timestamp. */
            @JsonProperty("not_expiring_before")
            fun notExpiringBefore(notExpiringBefore: OffsetDateTime) = apply {
                this.notExpiringBefore = notExpiringBefore
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CreditGrantListBody =
                CreditGrantListBody(
                    creditGrantIds?.toImmutable(),
                    creditTypeIds?.toImmutable(),
                    customerIds?.toImmutable(),
                    effectiveBefore,
                    notExpiringBefore,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditGrantListBody && this.creditGrantIds == other.creditGrantIds && this.creditTypeIds == other.creditTypeIds && this.customerIds == other.customerIds && this.effectiveBefore == other.effectiveBefore && this.notExpiringBefore == other.notExpiringBefore && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(creditGrantIds, creditTypeIds, customerIds, effectiveBefore, notExpiringBefore, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CreditGrantListBody{creditGrantIds=$creditGrantIds, creditTypeIds=$creditTypeIds, customerIds=$customerIds, effectiveBefore=$effectiveBefore, notExpiringBefore=$notExpiringBefore, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditGrantListParams && this.creditGrantIds == other.creditGrantIds && this.creditTypeIds == other.creditTypeIds && this.customerIds == other.customerIds && this.effectiveBefore == other.effectiveBefore && this.notExpiringBefore == other.notExpiringBefore && this.limit == other.limit && this.nextPage == other.nextPage && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(creditGrantIds, creditTypeIds, customerIds, effectiveBefore, notExpiringBefore, limit, nextPage, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CreditGrantListParams{creditGrantIds=$creditGrantIds, creditTypeIds=$creditTypeIds, customerIds=$customerIds, effectiveBefore=$effectiveBefore, notExpiringBefore=$notExpiringBefore, limit=$limit, nextPage=$nextPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var limit: Long? = null
        private var nextPage: String? = null
        private var creditGrantIds: MutableList<String> = mutableListOf()
        private var creditTypeIds: MutableList<String> = mutableListOf()
        private var customerIds: MutableList<String> = mutableListOf()
        private var effectiveBefore: OffsetDateTime? = null
        private var notExpiringBefore: OffsetDateTime? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditGrantListParams: CreditGrantListParams) = apply {
            this.limit = creditGrantListParams.limit
            this.nextPage = creditGrantListParams.nextPage
            this.creditGrantIds(creditGrantListParams.creditGrantIds ?: listOf())
            this.creditTypeIds(creditGrantListParams.creditTypeIds ?: listOf())
            this.customerIds(creditGrantListParams.customerIds ?: listOf())
            this.effectiveBefore = creditGrantListParams.effectiveBefore
            this.notExpiringBefore = creditGrantListParams.notExpiringBefore
            additionalHeaders(creditGrantListParams.additionalHeaders)
            additionalQueryParams(creditGrantListParams.additionalQueryParams)
            additionalBodyProperties(creditGrantListParams.additionalBodyProperties)
        }

        /** Max number of results that should be returned */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /**
         * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
         * customer_ids may be specified.
         */
        fun creditGrantIds(creditGrantIds: List<String>) = apply {
            this.creditGrantIds.clear()
            this.creditGrantIds.addAll(creditGrantIds)
        }

        /**
         * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
         * customer_ids may be specified.
         */
        fun addCreditGrantId(creditGrantId: String) = apply {
            this.creditGrantIds.add(creditGrantId)
        }

        /**
         * An array of credit type IDs. This must not be specified if credit_grant_ids is specified.
         */
        fun creditTypeIds(creditTypeIds: List<String>) = apply {
            this.creditTypeIds.clear()
            this.creditTypeIds.addAll(creditTypeIds)
        }

        /**
         * An array of credit type IDs. This must not be specified if credit_grant_ids is specified.
         */
        fun addCreditTypeId(creditTypeId: String) = apply { this.creditTypeIds.add(creditTypeId) }

        /**
         * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
         * specified.
         */
        fun customerIds(customerIds: List<String>) = apply {
            this.customerIds.clear()
            this.customerIds.addAll(customerIds)
        }

        /**
         * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
         * specified.
         */
        fun addCustomerId(customerId: String) = apply { this.customerIds.add(customerId) }

        /** Only return credit grants that are effective before this timestamp (exclusive). */
        fun effectiveBefore(effectiveBefore: OffsetDateTime) = apply {
            this.effectiveBefore = effectiveBefore
        }

        /** Only return credit grants that expire at or after this timestamp. */
        fun notExpiringBefore(notExpiringBefore: OffsetDateTime) = apply {
            this.notExpiringBefore = notExpiringBefore
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CreditGrantListParams =
            CreditGrantListParams(
                limit,
                nextPage,
                if (creditGrantIds.size == 0) null else creditGrantIds.toImmutable(),
                if (creditTypeIds.size == 0) null else creditTypeIds.toImmutable(),
                if (customerIds.size == 0) null else customerIds.toImmutable(),
                effectiveBefore,
                notExpiringBefore,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
