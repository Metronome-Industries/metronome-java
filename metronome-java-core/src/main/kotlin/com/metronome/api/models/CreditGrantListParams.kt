// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** List credit grants. This list does not included voided grants. */
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

    /**
     * An array of credit grant IDs. If this is specified, neither credit_type_ids nor customer_ids
     * may be specified.
     */
    fun _creditGrantIds(): JsonField<List<String>> = body._creditGrantIds()

    /** An array of credit type IDs. This must not be specified if credit_grant_ids is specified. */
    fun _creditTypeIds(): JsonField<List<String>> = body._creditTypeIds()

    /**
     * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
     * specified.
     */
    fun _customerIds(): JsonField<List<String>> = body._customerIds()

    /** Only return credit grants that are effective before this timestamp (exclusive). */
    fun _effectiveBefore(): JsonField<OffsetDateTime> = body._effectiveBefore()

    /** Only return credit grants that expire at or after this timestamp. */
    fun _notExpiringBefore(): JsonField<OffsetDateTime> = body._notExpiringBefore()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

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
        @JsonProperty("credit_grant_ids")
        @ExcludeMissing
        private val creditGrantIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("credit_type_ids")
        @ExcludeMissing
        private val creditTypeIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("customer_ids")
        @ExcludeMissing
        private val customerIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("effective_before")
        @ExcludeMissing
        private val effectiveBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("not_expiring_before")
        @ExcludeMissing
        private val notExpiringBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
         * customer_ids may be specified.
         */
        fun creditGrantIds(): Optional<List<String>> =
            Optional.ofNullable(creditGrantIds.getNullable("credit_grant_ids"))

        /**
         * An array of credit type IDs. This must not be specified if credit_grant_ids is specified.
         */
        fun creditTypeIds(): Optional<List<String>> =
            Optional.ofNullable(creditTypeIds.getNullable("credit_type_ids"))

        /**
         * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
         * specified.
         */
        fun customerIds(): Optional<List<String>> =
            Optional.ofNullable(customerIds.getNullable("customer_ids"))

        /** Only return credit grants that are effective before this timestamp (exclusive). */
        fun effectiveBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(effectiveBefore.getNullable("effective_before"))

        /** Only return credit grants that expire at or after this timestamp. */
        fun notExpiringBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(notExpiringBefore.getNullable("not_expiring_before"))

        /**
         * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
         * customer_ids may be specified.
         */
        @JsonProperty("credit_grant_ids")
        @ExcludeMissing
        fun _creditGrantIds(): JsonField<List<String>> = creditGrantIds

        /**
         * An array of credit type IDs. This must not be specified if credit_grant_ids is specified.
         */
        @JsonProperty("credit_type_ids")
        @ExcludeMissing
        fun _creditTypeIds(): JsonField<List<String>> = creditTypeIds

        /**
         * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
         * specified.
         */
        @JsonProperty("customer_ids")
        @ExcludeMissing
        fun _customerIds(): JsonField<List<String>> = customerIds

        /** Only return credit grants that are effective before this timestamp (exclusive). */
        @JsonProperty("effective_before")
        @ExcludeMissing
        fun _effectiveBefore(): JsonField<OffsetDateTime> = effectiveBefore

        /** Only return credit grants that expire at or after this timestamp. */
        @JsonProperty("not_expiring_before")
        @ExcludeMissing
        fun _notExpiringBefore(): JsonField<OffsetDateTime> = notExpiringBefore

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreditGrantListBody = apply {
            if (!validated) {
                creditGrantIds()
                creditTypeIds()
                customerIds()
                effectiveBefore()
                notExpiringBefore()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var creditGrantIds: JsonField<MutableList<String>>? = null
            private var creditTypeIds: JsonField<MutableList<String>>? = null
            private var customerIds: JsonField<MutableList<String>>? = null
            private var effectiveBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var notExpiringBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditGrantListBody: CreditGrantListBody) = apply {
                creditGrantIds = creditGrantListBody.creditGrantIds.map { it.toMutableList() }
                creditTypeIds = creditGrantListBody.creditTypeIds.map { it.toMutableList() }
                customerIds = creditGrantListBody.customerIds.map { it.toMutableList() }
                effectiveBefore = creditGrantListBody.effectiveBefore
                notExpiringBefore = creditGrantListBody.notExpiringBefore
                additionalProperties = creditGrantListBody.additionalProperties.toMutableMap()
            }

            /**
             * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
             * customer_ids may be specified.
             */
            fun creditGrantIds(creditGrantIds: List<String>) =
                creditGrantIds(JsonField.of(creditGrantIds))

            /**
             * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
             * customer_ids may be specified.
             */
            fun creditGrantIds(creditGrantIds: JsonField<List<String>>) = apply {
                this.creditGrantIds = creditGrantIds.map { it.toMutableList() }
            }

            /**
             * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
             * customer_ids may be specified.
             */
            fun addCreditGrantId(creditGrantId: String) = apply {
                creditGrantIds =
                    (creditGrantIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(creditGrantId)
                    }
            }

            /**
             * An array of credit type IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            fun creditTypeIds(creditTypeIds: List<String>) =
                creditTypeIds(JsonField.of(creditTypeIds))

            /**
             * An array of credit type IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            fun creditTypeIds(creditTypeIds: JsonField<List<String>>) = apply {
                this.creditTypeIds = creditTypeIds.map { it.toMutableList() }
            }

            /**
             * An array of credit type IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            fun addCreditTypeId(creditTypeId: String) = apply {
                creditTypeIds =
                    (creditTypeIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(creditTypeId)
                    }
            }

            /**
             * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            fun customerIds(customerIds: List<String>) = customerIds(JsonField.of(customerIds))

            /**
             * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            fun customerIds(customerIds: JsonField<List<String>>) = apply {
                this.customerIds = customerIds.map { it.toMutableList() }
            }

            /**
             * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
             * specified.
             */
            fun addCustomerId(customerId: String) = apply {
                customerIds =
                    (customerIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(customerId)
                    }
            }

            /** Only return credit grants that are effective before this timestamp (exclusive). */
            fun effectiveBefore(effectiveBefore: OffsetDateTime) =
                effectiveBefore(JsonField.of(effectiveBefore))

            /** Only return credit grants that are effective before this timestamp (exclusive). */
            fun effectiveBefore(effectiveBefore: JsonField<OffsetDateTime>) = apply {
                this.effectiveBefore = effectiveBefore
            }

            /** Only return credit grants that expire at or after this timestamp. */
            fun notExpiringBefore(notExpiringBefore: OffsetDateTime) =
                notExpiringBefore(JsonField.of(notExpiringBefore))

            /** Only return credit grants that expire at or after this timestamp. */
            fun notExpiringBefore(notExpiringBefore: JsonField<OffsetDateTime>) = apply {
                this.notExpiringBefore = notExpiringBefore
            }

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
                    (creditGrantIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (creditTypeIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (customerIds ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun creditGrantIds(creditGrantIds: List<String>) = apply {
            body.creditGrantIds(creditGrantIds)
        }

        /**
         * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
         * customer_ids may be specified.
         */
        fun creditGrantIds(creditGrantIds: JsonField<List<String>>) = apply {
            body.creditGrantIds(creditGrantIds)
        }

        /**
         * An array of credit grant IDs. If this is specified, neither credit_type_ids nor
         * customer_ids may be specified.
         */
        fun addCreditGrantId(creditGrantId: String) = apply { body.addCreditGrantId(creditGrantId) }

        /**
         * An array of credit type IDs. This must not be specified if credit_grant_ids is specified.
         */
        fun creditTypeIds(creditTypeIds: List<String>) = apply { body.creditTypeIds(creditTypeIds) }

        /**
         * An array of credit type IDs. This must not be specified if credit_grant_ids is specified.
         */
        fun creditTypeIds(creditTypeIds: JsonField<List<String>>) = apply {
            body.creditTypeIds(creditTypeIds)
        }

        /**
         * An array of credit type IDs. This must not be specified if credit_grant_ids is specified.
         */
        fun addCreditTypeId(creditTypeId: String) = apply { body.addCreditTypeId(creditTypeId) }

        /**
         * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
         * specified.
         */
        fun customerIds(customerIds: List<String>) = apply { body.customerIds(customerIds) }

        /**
         * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
         * specified.
         */
        fun customerIds(customerIds: JsonField<List<String>>) = apply {
            body.customerIds(customerIds)
        }

        /**
         * An array of Metronome customer IDs. This must not be specified if credit_grant_ids is
         * specified.
         */
        fun addCustomerId(customerId: String) = apply { body.addCustomerId(customerId) }

        /** Only return credit grants that are effective before this timestamp (exclusive). */
        fun effectiveBefore(effectiveBefore: OffsetDateTime) = apply {
            body.effectiveBefore(effectiveBefore)
        }

        /** Only return credit grants that are effective before this timestamp (exclusive). */
        fun effectiveBefore(effectiveBefore: JsonField<OffsetDateTime>) = apply {
            body.effectiveBefore(effectiveBefore)
        }

        /** Only return credit grants that expire at or after this timestamp. */
        fun notExpiringBefore(notExpiringBefore: OffsetDateTime) = apply {
            body.notExpiringBefore(notExpiringBefore)
        }

        /** Only return credit grants that expire at or after this timestamp. */
        fun notExpiringBefore(notExpiringBefore: JsonField<OffsetDateTime>) = apply {
            body.notExpiringBefore(notExpiringBefore)
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
