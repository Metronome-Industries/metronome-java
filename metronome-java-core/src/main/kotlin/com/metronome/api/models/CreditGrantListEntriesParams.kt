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

class CreditGrantListEntriesParams
constructor(
    private val nextPage: String?,
    private val creditTypeIds: List<String>?,
    private val customerIds: List<String>?,
    private val endingBefore: OffsetDateTime?,
    private val startingOn: OffsetDateTime?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun creditTypeIds(): Optional<List<String>> = Optional.ofNullable(creditTypeIds)

    fun customerIds(): Optional<List<String>> = Optional.ofNullable(customerIds)

    fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

    fun startingOn(): Optional<OffsetDateTime> = Optional.ofNullable(startingOn)

    @JvmSynthetic
    internal fun getBody(): CreditGrantListEntriesBody {
        return CreditGrantListEntriesBody(
            creditTypeIds,
            customerIds,
            endingBefore,
            startingOn,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.nextPage?.let { params.put("next_page", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    @JsonDeserialize(builder = CreditGrantListEntriesBody.Builder::class)
    @NoAutoDetect
    class CreditGrantListEntriesBody
    internal constructor(
        private val creditTypeIds: List<String>?,
        private val customerIds: List<String>?,
        private val endingBefore: OffsetDateTime?,
        private val startingOn: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger
         * entries for all credit types will be returned.
         */
        @JsonProperty("credit_type_ids") fun creditTypeIds(): List<String>? = creditTypeIds

        /**
         * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger entries
         * for all customers will be returned.
         */
        @JsonProperty("customer_ids") fun customerIds(): List<String>? = customerIds

        /**
         * If supplied, ledger entries will only be returned with an effective_at before this time.
         * This timestamp must not be in the future. If no timestamp is supplied, all entries up to
         * the start of the customer's next billing period will be returned.
         */
        @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

        /** If supplied, only ledger entries effective at or after this time will be returned. */
        @JsonProperty("starting_on") fun startingOn(): OffsetDateTime? = startingOn

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var creditTypeIds: List<String>? = null
            private var customerIds: List<String>? = null
            private var endingBefore: OffsetDateTime? = null
            private var startingOn: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditGrantListEntriesBody: CreditGrantListEntriesBody) = apply {
                this.creditTypeIds = creditGrantListEntriesBody.creditTypeIds
                this.customerIds = creditGrantListEntriesBody.customerIds
                this.endingBefore = creditGrantListEntriesBody.endingBefore
                this.startingOn = creditGrantListEntriesBody.startingOn
                additionalProperties(creditGrantListEntriesBody.additionalProperties)
            }

            /**
             * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger
             * entries for all credit types will be returned.
             */
            @JsonProperty("credit_type_ids")
            fun creditTypeIds(creditTypeIds: List<String>) = apply {
                this.creditTypeIds = creditTypeIds
            }

            /**
             * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger
             * entries for all customers will be returned.
             */
            @JsonProperty("customer_ids")
            fun customerIds(customerIds: List<String>) = apply { this.customerIds = customerIds }

            /**
             * If supplied, ledger entries will only be returned with an effective_at before this
             * time. This timestamp must not be in the future. If no timestamp is supplied, all
             * entries up to the start of the customer's next billing period will be returned.
             */
            @JsonProperty("ending_before")
            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
            }

            /**
             * If supplied, only ledger entries effective at or after this time will be returned.
             */
            @JsonProperty("starting_on")
            fun startingOn(startingOn: OffsetDateTime) = apply { this.startingOn = startingOn }

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

            fun build(): CreditGrantListEntriesBody =
                CreditGrantListEntriesBody(
                    creditTypeIds?.toImmutable(),
                    customerIds?.toImmutable(),
                    endingBefore,
                    startingOn,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditGrantListEntriesBody && this.creditTypeIds == other.creditTypeIds && this.customerIds == other.customerIds && this.endingBefore == other.endingBefore && this.startingOn == other.startingOn && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(creditTypeIds, customerIds, endingBefore, startingOn, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CreditGrantListEntriesBody{creditTypeIds=$creditTypeIds, customerIds=$customerIds, endingBefore=$endingBefore, startingOn=$startingOn, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditGrantListEntriesParams && this.creditTypeIds == other.creditTypeIds && this.customerIds == other.customerIds && this.endingBefore == other.endingBefore && this.startingOn == other.startingOn && this.nextPage == other.nextPage && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(creditTypeIds, customerIds, endingBefore, startingOn, nextPage, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CreditGrantListEntriesParams{creditTypeIds=$creditTypeIds, customerIds=$customerIds, endingBefore=$endingBefore, startingOn=$startingOn, nextPage=$nextPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var nextPage: String? = null
        private var creditTypeIds: MutableList<String> = mutableListOf()
        private var customerIds: MutableList<String> = mutableListOf()
        private var endingBefore: OffsetDateTime? = null
        private var startingOn: OffsetDateTime? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditGrantListEntriesParams: CreditGrantListEntriesParams) = apply {
            this.nextPage = creditGrantListEntriesParams.nextPage
            this.creditTypeIds(creditGrantListEntriesParams.creditTypeIds ?: listOf())
            this.customerIds(creditGrantListEntriesParams.customerIds ?: listOf())
            this.endingBefore = creditGrantListEntriesParams.endingBefore
            this.startingOn = creditGrantListEntriesParams.startingOn
            additionalHeaders(creditGrantListEntriesParams.additionalHeaders)
            additionalQueryParams(creditGrantListEntriesParams.additionalQueryParams)
            additionalBodyProperties(creditGrantListEntriesParams.additionalBodyProperties)
        }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /**
         * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger
         * entries for all credit types will be returned.
         */
        fun creditTypeIds(creditTypeIds: List<String>) = apply {
            this.creditTypeIds.clear()
            this.creditTypeIds.addAll(creditTypeIds)
        }

        /**
         * A list of Metronome credit type IDs to fetch ledger entries for. If absent, ledger
         * entries for all credit types will be returned.
         */
        fun addCreditTypeId(creditTypeId: String) = apply { this.creditTypeIds.add(creditTypeId) }

        /**
         * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger entries
         * for all customers will be returned.
         */
        fun customerIds(customerIds: List<String>) = apply {
            this.customerIds.clear()
            this.customerIds.addAll(customerIds)
        }

        /**
         * A list of Metronome customer IDs to fetch ledger entries for. If absent, ledger entries
         * for all customers will be returned.
         */
        fun addCustomerId(customerId: String) = apply { this.customerIds.add(customerId) }

        /**
         * If supplied, ledger entries will only be returned with an effective_at before this time.
         * This timestamp must not be in the future. If no timestamp is supplied, all entries up to
         * the start of the customer's next billing period will be returned.
         */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { this.endingBefore = endingBefore }

        /** If supplied, only ledger entries effective at or after this time will be returned. */
        fun startingOn(startingOn: OffsetDateTime) = apply { this.startingOn = startingOn }

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

        fun build(): CreditGrantListEntriesParams =
            CreditGrantListEntriesParams(
                nextPage,
                if (creditTypeIds.size == 0) null else creditTypeIds.toImmutable(),
                if (customerIds.size == 0) null else customerIds.toImmutable(),
                endingBefore,
                startingOn,
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
