// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun creditGrantIds(): Optional<List<String>> = Optional.ofNullable(creditGrantIds)

    fun creditTypeIds(): Optional<List<String>> = Optional.ofNullable(creditTypeIds)

    fun customerIds(): Optional<List<String>> = Optional.ofNullable(customerIds)

    fun effectiveBefore(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveBefore)

    fun notExpiringBefore(): Optional<OffsetDateTime> = Optional.ofNullable(notExpiringBefore)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
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

            return /* spotless:off */ other is CreditGrantListBody && creditGrantIds == other.creditGrantIds && creditTypeIds == other.creditTypeIds && customerIds == other.customerIds && effectiveBefore == other.effectiveBefore && notExpiringBefore == other.notExpiringBefore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(creditGrantIds, creditTypeIds, customerIds, effectiveBefore, notExpiringBefore, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditGrantListBody{creditGrantIds=$creditGrantIds, creditTypeIds=$creditTypeIds, customerIds=$customerIds, effectiveBefore=$effectiveBefore, notExpiringBefore=$notExpiringBefore, additionalProperties=$additionalProperties}"
    }

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditGrantListParams: CreditGrantListParams) = apply {
            limit = creditGrantListParams.limit
            nextPage = creditGrantListParams.nextPage
            creditGrantIds =
                creditGrantListParams.creditGrantIds?.toMutableList() ?: mutableListOf()
            creditTypeIds = creditGrantListParams.creditTypeIds?.toMutableList() ?: mutableListOf()
            customerIds = creditGrantListParams.customerIds?.toMutableList() ?: mutableListOf()
            effectiveBefore = creditGrantListParams.effectiveBefore
            notExpiringBefore = creditGrantListParams.notExpiringBefore
            additionalHeaders = creditGrantListParams.additionalHeaders.toBuilder()
            additionalQueryParams = creditGrantListParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = creditGrantListParams.additionalBodyProperties.toMutableMap()
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): CreditGrantListParams =
            CreditGrantListParams(
                limit,
                nextPage,
                creditGrantIds.toImmutable().ifEmpty { null },
                creditTypeIds.toImmutable().ifEmpty { null },
                customerIds.toImmutable().ifEmpty { null },
                effectiveBefore,
                notExpiringBefore,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditGrantListParams && limit == other.limit && nextPage == other.nextPage && creditGrantIds == other.creditGrantIds && creditTypeIds == other.creditTypeIds && customerIds == other.customerIds && effectiveBefore == other.effectiveBefore && notExpiringBefore == other.notExpiringBefore && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(limit, nextPage, creditGrantIds, creditTypeIds, customerIds, effectiveBefore, notExpiringBefore, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CreditGrantListParams{limit=$limit, nextPage=$nextPage, creditGrantIds=$creditGrantIds, creditTypeIds=$creditTypeIds, customerIds=$customerIds, effectiveBefore=$effectiveBefore, notExpiringBefore=$notExpiringBefore, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
