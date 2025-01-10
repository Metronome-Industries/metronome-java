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

/**
 * Fetches a list of credit ledger entries. Returns lists of ledgers per customer. Ledger entries
 * are returned in chronological order. Ledger entries associated with voided credit grants are not
 * included.
 */
class CreditGrantListEntriesParams
constructor(
    private val nextPage: String?,
    private val body: CreditGrantListEntriesBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /**
     * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger entries
     * for all credit types will be returned.
     */
    fun creditTypeIds(): Optional<List<String>> = body.creditTypeIds()

    /**
     * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger entries for
     * all customers will be returned.
     */
    fun customerIds(): Optional<List<String>> = body.customerIds()

    /**
     * If supplied, ledger entries will only be returned with an effective_at before this time. This
     * timestamp must not be in the future. If no timestamp is supplied, all entries up to the start
     * of the customer's next billing period will be returned.
     */
    fun endingBefore(): Optional<OffsetDateTime> = body.endingBefore()

    /** If supplied, only ledger entries effective at or after this time will be returned. */
    fun startingOn(): Optional<OffsetDateTime> = body.startingOn()

    /**
     * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger entries
     * for all credit types will be returned.
     */
    fun _creditTypeIds(): JsonField<List<String>> = body._creditTypeIds()

    /**
     * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger entries for
     * all customers will be returned.
     */
    fun _customerIds(): JsonField<List<String>> = body._customerIds()

    /**
     * If supplied, ledger entries will only be returned with an effective_at before this time. This
     * timestamp must not be in the future. If no timestamp is supplied, all entries up to the start
     * of the customer's next billing period will be returned.
     */
    fun _endingBefore(): JsonField<OffsetDateTime> = body._endingBefore()

    /** If supplied, only ledger entries effective at or after this time will be returned. */
    fun _startingOn(): JsonField<OffsetDateTime> = body._startingOn()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): CreditGrantListEntriesBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    @NoAutoDetect
    class CreditGrantListEntriesBody
    @JsonCreator
    internal constructor(
        @JsonProperty("credit_type_ids")
        @ExcludeMissing
        private val creditTypeIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("customer_ids")
        @ExcludeMissing
        private val customerIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("starting_on")
        @ExcludeMissing
        private val startingOn: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger
         * entries for all credit types will be returned.
         */
        fun creditTypeIds(): Optional<List<String>> =
            Optional.ofNullable(creditTypeIds.getNullable("credit_type_ids"))

        /**
         * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger entries
         * for all customers will be returned.
         */
        fun customerIds(): Optional<List<String>> =
            Optional.ofNullable(customerIds.getNullable("customer_ids"))

        /**
         * If supplied, ledger entries will only be returned with an effective_at before this time.
         * This timestamp must not be in the future. If no timestamp is supplied, all entries up to
         * the start of the customer's next billing period will be returned.
         */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        /** If supplied, only ledger entries effective at or after this time will be returned. */
        fun startingOn(): Optional<OffsetDateTime> =
            Optional.ofNullable(startingOn.getNullable("starting_on"))

        /**
         * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger
         * entries for all credit types will be returned.
         */
        @JsonProperty("credit_type_ids")
        @ExcludeMissing
        fun _creditTypeIds(): JsonField<List<String>> = creditTypeIds

        /**
         * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger entries
         * for all customers will be returned.
         */
        @JsonProperty("customer_ids")
        @ExcludeMissing
        fun _customerIds(): JsonField<List<String>> = customerIds

        /**
         * If supplied, ledger entries will only be returned with an effective_at before this time.
         * This timestamp must not be in the future. If no timestamp is supplied, all entries up to
         * the start of the customer's next billing period will be returned.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /** If supplied, only ledger entries effective at or after this time will be returned. */
        @JsonProperty("starting_on")
        @ExcludeMissing
        fun _startingOn(): JsonField<OffsetDateTime> = startingOn

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreditGrantListEntriesBody = apply {
            if (validated) {
                return@apply
            }

            creditTypeIds()
            customerIds()
            endingBefore()
            startingOn()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var creditTypeIds: JsonField<MutableList<String>>? = null
            private var customerIds: JsonField<MutableList<String>>? = null
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var startingOn: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditGrantListEntriesBody: CreditGrantListEntriesBody) = apply {
                creditTypeIds = creditGrantListEntriesBody.creditTypeIds.map { it.toMutableList() }
                customerIds = creditGrantListEntriesBody.customerIds.map { it.toMutableList() }
                endingBefore = creditGrantListEntriesBody.endingBefore
                startingOn = creditGrantListEntriesBody.startingOn
                additionalProperties =
                    creditGrantListEntriesBody.additionalProperties.toMutableMap()
            }

            /**
             * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger
             * entries for all credit types will be returned.
             */
            fun creditTypeIds(creditTypeIds: List<String>) =
                creditTypeIds(JsonField.of(creditTypeIds))

            /**
             * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger
             * entries for all credit types will be returned.
             */
            fun creditTypeIds(creditTypeIds: JsonField<List<String>>) = apply {
                this.creditTypeIds = creditTypeIds.map { it.toMutableList() }
            }

            /**
             * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger
             * entries for all credit types will be returned.
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
             * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger
             * entries for all customers will be returned.
             */
            fun customerIds(customerIds: List<String>) = customerIds(JsonField.of(customerIds))

            /**
             * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger
             * entries for all customers will be returned.
             */
            fun customerIds(customerIds: JsonField<List<String>>) = apply {
                this.customerIds = customerIds.map { it.toMutableList() }
            }

            /**
             * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger
             * entries for all customers will be returned.
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

            /**
             * If supplied, ledger entries will only be returned with an effective_at before this
             * time. This timestamp must not be in the future. If no timestamp is supplied, all
             * entries up to the start of the customer's next billing period will be returned.
             */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /**
             * If supplied, ledger entries will only be returned with an effective_at before this
             * time. This timestamp must not be in the future. If no timestamp is supplied, all
             * entries up to the start of the customer's next billing period will be returned.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            /**
             * If supplied, only ledger entries effective at or after this time will be returned.
             */
            fun startingOn(startingOn: OffsetDateTime) = startingOn(JsonField.of(startingOn))

            /**
             * If supplied, only ledger entries effective at or after this time will be returned.
             */
            fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
                this.startingOn = startingOn
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

            fun build(): CreditGrantListEntriesBody =
                CreditGrantListEntriesBody(
                    (creditTypeIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (customerIds ?: JsonMissing.of()).map { it.toImmutable() },
                    endingBefore,
                    startingOn,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditGrantListEntriesBody && creditTypeIds == other.creditTypeIds && customerIds == other.customerIds && endingBefore == other.endingBefore && startingOn == other.startingOn && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(creditTypeIds, customerIds, endingBefore, startingOn, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditGrantListEntriesBody{creditTypeIds=$creditTypeIds, customerIds=$customerIds, endingBefore=$endingBefore, startingOn=$startingOn, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var nextPage: String? = null
        private var body: CreditGrantListEntriesBody.Builder = CreditGrantListEntriesBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(creditGrantListEntriesParams: CreditGrantListEntriesParams) = apply {
            nextPage = creditGrantListEntriesParams.nextPage
            body = creditGrantListEntriesParams.body.toBuilder()
            additionalHeaders = creditGrantListEntriesParams.additionalHeaders.toBuilder()
            additionalQueryParams = creditGrantListEntriesParams.additionalQueryParams.toBuilder()
        }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String?) = apply { this.nextPage = nextPage }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.orElse(null))

        /**
         * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger
         * entries for all credit types will be returned.
         */
        fun creditTypeIds(creditTypeIds: List<String>) = apply { body.creditTypeIds(creditTypeIds) }

        /**
         * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger
         * entries for all credit types will be returned.
         */
        fun creditTypeIds(creditTypeIds: JsonField<List<String>>) = apply {
            body.creditTypeIds(creditTypeIds)
        }

        /**
         * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger
         * entries for all credit types will be returned.
         */
        fun addCreditTypeId(creditTypeId: String) = apply { body.addCreditTypeId(creditTypeId) }

        /**
         * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger entries
         * for all customers will be returned.
         */
        fun customerIds(customerIds: List<String>) = apply { body.customerIds(customerIds) }

        /**
         * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger entries
         * for all customers will be returned.
         */
        fun customerIds(customerIds: JsonField<List<String>>) = apply {
            body.customerIds(customerIds)
        }

        /**
         * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger entries
         * for all customers will be returned.
         */
        fun addCustomerId(customerId: String) = apply { body.addCustomerId(customerId) }

        /**
         * If supplied, ledger entries will only be returned with an effective_at before this time.
         * This timestamp must not be in the future. If no timestamp is supplied, all entries up to
         * the start of the customer's next billing period will be returned.
         */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { body.endingBefore(endingBefore) }

        /**
         * If supplied, ledger entries will only be returned with an effective_at before this time.
         * This timestamp must not be in the future. If no timestamp is supplied, all entries up to
         * the start of the customer's next billing period will be returned.
         */
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            body.endingBefore(endingBefore)
        }

        /** If supplied, only ledger entries effective at or after this time will be returned. */
        fun startingOn(startingOn: OffsetDateTime) = apply { body.startingOn(startingOn) }

        /** If supplied, only ledger entries effective at or after this time will be returned. */
        fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
            body.startingOn(startingOn)
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

        fun build(): CreditGrantListEntriesParams =
            CreditGrantListEntriesParams(
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

        return /* spotless:off */ other is CreditGrantListEntriesParams && nextPage == other.nextPage && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(nextPage, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CreditGrantListEntriesParams{nextPage=$nextPage, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
