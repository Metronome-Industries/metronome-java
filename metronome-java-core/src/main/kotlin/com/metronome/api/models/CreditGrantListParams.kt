// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class CreditGrantListParams
constructor(
    private val limit: Long?,
    private val nextPage: String?,
    private val body: CreditGrantListBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Max number of results that should be returned */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /**
     * An array of credit grant IDs. If this is specified, neither credit_type_ids nor customer_ids
     * may be specified.
     */
    fun creditGrantIds(): Optional<List<String>> = body.creditGrantIds()

    /** An array of credit type IDs. This must not be specified if credit_grant_ids is specified. */
    fun creditTypeIds(): Optional<List<String>> = body.creditTypeIds()

    /**
     * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
     * specified.
     */
    fun customerIds(): Optional<List<String>> = body.customerIds()

    /** Only return credit grants that are effective before this timestamp (exclusive). */
    fun effectiveBefore(): Optional<OffsetDateTime> = body.effectiveBefore()

    /** Only return credit grants that expire at or after this timestamp. */
    fun notExpiringBefore(): Optional<OffsetDateTime> = body.notExpiringBefore()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): CreditGrantListBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    @NoAutoDetect
    class CreditGrantListBody
    @JsonCreator
    internal constructor(
        @JsonProperty("credit_grant_ids") private val creditGrantIds: List<String>?,
        @JsonProperty("credit_type_ids") private val creditTypeIds: List<String>?,
        @JsonProperty("customer_ids") private val customerIds: List<String>?,
        @JsonProperty("effective_before") private val effectiveBefore: OffsetDateTime?,
        @JsonProperty("not_expiring_before") private val notExpiringBefore: OffsetDateTime?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
         * customer_ids may be specified.
         */
        @JsonProperty("credit_grant_ids")
        fun creditGrantIds(): Optional<List<String>> = Optional.ofNullable(creditGrantIds)

        /**
         * An array of credit type IDs. This must not be specified if credit_grant_ids is specified.
         */
        @JsonProperty("credit_type_ids")
        fun creditTypeIds(): Optional<List<String>> = Optional.ofNullable(creditTypeIds)

        /**
         * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
         * specified.
         */
        @JsonProperty("customer_ids")
        fun customerIds(): Optional<List<String>> = Optional.ofNullable(customerIds)

        /** Only return credit grants that are effective before this timestamp (exclusive). */
        @JsonProperty("effective_before")
        fun effectiveBefore(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveBefore)

        /** Only return credit grants that expire at or after this timestamp. */
        @JsonProperty("not_expiring_before")
        fun notExpiringBefore(): Optional<OffsetDateTime> = Optional.ofNullable(notExpiringBefore)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var creditGrantIds: MutableList<String>? = null
            private var creditTypeIds: MutableList<String>? = null
            private var customerIds: MutableList<String>? = null
            private var effectiveBefore: OffsetDateTime? = null
            private var notExpiringBefore: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditGrantListBody: CreditGrantListBody) = apply {
                creditGrantIds = creditGrantListBody.creditGrantIds?.toMutableList()
                creditTypeIds = creditGrantListBody.creditTypeIds?.toMutableList()
                customerIds = creditGrantListBody.customerIds?.toMutableList()
                effectiveBefore = creditGrantListBody.effectiveBefore
                notExpiringBefore = creditGrantListBody.notExpiringBefore
                additionalProperties = creditGrantListBody.additionalProperties.toMutableMap()
            }

            /**
             * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
             * customer_ids may be specified.
             */
            fun creditGrantIds(creditGrantIds: List<String>?) = apply {
                this.creditGrantIds = creditGrantIds?.toMutableList()
            }

            /**
             * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
             * customer_ids may be specified.
             */
            fun creditGrantIds(creditGrantIds: Optional<List<String>>) =
                creditGrantIds(creditGrantIds.orElse(null))

            /**
             * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
             * customer_ids may be specified.
             */
            fun addCreditGrantId(creditGrantId: String) = apply {
                creditGrantIds = (creditGrantIds ?: mutableListOf()).apply { add(creditGrantId) }
            }

            /**
             * An array of credit type IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            fun creditTypeIds(creditTypeIds: List<String>?) = apply {
                this.creditTypeIds = creditTypeIds?.toMutableList()
            }

            /**
             * An array of credit type IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            fun creditTypeIds(creditTypeIds: Optional<List<String>>) =
                creditTypeIds(creditTypeIds.orElse(null))

            /**
             * An array of credit type IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            fun addCreditTypeId(creditTypeId: String) = apply {
                creditTypeIds = (creditTypeIds ?: mutableListOf()).apply { add(creditTypeId) }
            }

            /**
             * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            fun customerIds(customerIds: List<String>?) = apply {
                this.customerIds = customerIds?.toMutableList()
            }

            /**
             * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            fun customerIds(customerIds: Optional<List<String>>) =
                customerIds(customerIds.orElse(null))

            /**
             * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            fun addCustomerId(customerId: String) = apply {
                customerIds = (customerIds ?: mutableListOf()).apply { add(customerId) }
            }

            /** Only return credit grants that are effective before this timestamp (exclusive). */
            fun effectiveBefore(effectiveBefore: OffsetDateTime?) = apply {
                this.effectiveBefore = effectiveBefore
            }

            /** Only return credit grants that are effective before this timestamp (exclusive). */
            fun effectiveBefore(effectiveBefore: Optional<OffsetDateTime>) =
                effectiveBefore(effectiveBefore.orElse(null))

            /** Only return credit grants that expire at or after this timestamp. */
            fun notExpiringBefore(notExpiringBefore: OffsetDateTime?) = apply {
                this.notExpiringBefore = notExpiringBefore
            }

            /** Only return credit grants that expire at or after this timestamp. */
            fun notExpiringBefore(notExpiringBefore: Optional<OffsetDateTime>) =
                notExpiringBefore(notExpiringBefore.orElse(null))

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
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
        private var body: CreditGrantListBody.Builder = CreditGrantListBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(creditGrantListParams: CreditGrantListParams) = apply {
            limit = creditGrantListParams.limit
            nextPage = creditGrantListParams.nextPage
            body = creditGrantListParams.body.toBuilder()
            additionalHeaders = creditGrantListParams.additionalHeaders.toBuilder()
            additionalQueryParams = creditGrantListParams.additionalQueryParams.toBuilder()
        }

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
         * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
         * customer_ids may be specified.
         */
        fun creditGrantIds(creditGrantIds: List<String>?) = apply {
            body.creditGrantIds(creditGrantIds)
        }

        /**
         * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
         * customer_ids may be specified.
         */
        fun creditGrantIds(creditGrantIds: Optional<List<String>>) =
            creditGrantIds(creditGrantIds.orElse(null))

        /**
         * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
         * customer_ids may be specified.
         */
        fun addCreditGrantId(creditGrantId: String) = apply { body.addCreditGrantId(creditGrantId) }

        /**
         * An array of credit type IDs. This must not be specified if credit_grant_ids is specified.
         */
        fun creditTypeIds(creditTypeIds: List<String>?) = apply {
            body.creditTypeIds(creditTypeIds)
        }

        /**
         * An array of credit type IDs. This must not be specified if credit_grant_ids is specified.
         */
        fun creditTypeIds(creditTypeIds: Optional<List<String>>) =
            creditTypeIds(creditTypeIds.orElse(null))

        /**
         * An array of credit type IDs. This must not be specified if credit_grant_ids is specified.
         */
        fun addCreditTypeId(creditTypeId: String) = apply { body.addCreditTypeId(creditTypeId) }

        /**
         * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
         * specified.
         */
        fun customerIds(customerIds: List<String>?) = apply { body.customerIds(customerIds) }

        /**
         * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
         * specified.
         */
        fun customerIds(customerIds: Optional<List<String>>) = customerIds(customerIds.orElse(null))

        /**
         * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
         * specified.
         */
        fun addCustomerId(customerId: String) = apply { body.addCustomerId(customerId) }

        /** Only return credit grants that are effective before this timestamp (exclusive). */
        fun effectiveBefore(effectiveBefore: OffsetDateTime?) = apply {
            body.effectiveBefore(effectiveBefore)
        }

        /** Only return credit grants that are effective before this timestamp (exclusive). */
        fun effectiveBefore(effectiveBefore: Optional<OffsetDateTime>) =
            effectiveBefore(effectiveBefore.orElse(null))

        /** Only return credit grants that expire at or after this timestamp. */
        fun notExpiringBefore(notExpiringBefore: OffsetDateTime?) = apply {
            body.notExpiringBefore(notExpiringBefore)
        }

        /** Only return credit grants that expire at or after this timestamp. */
        fun notExpiringBefore(notExpiringBefore: Optional<OffsetDateTime>) =
            notExpiringBefore(notExpiringBefore.orElse(null))

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
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): CreditGrantListParams =
            CreditGrantListParams(
                limit,
                nextPage,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditGrantListParams && limit == other.limit && nextPage == other.nextPage && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(limit, nextPage, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CreditGrantListParams{limit=$limit, nextPage=$nextPage, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
