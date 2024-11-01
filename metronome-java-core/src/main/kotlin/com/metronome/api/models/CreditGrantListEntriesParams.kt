// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
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

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.nextPage?.let { params.put("next_page", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditGrantListEntriesParams && this.creditTypeIds == other.creditTypeIds && this.customerIds == other.customerIds && this.endingBefore == other.endingBefore && this.startingOn == other.startingOn && this.nextPage == other.nextPage && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(creditTypeIds, customerIds, endingBefore, startingOn, nextPage, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CreditGrantListEntriesParams{creditTypeIds=$creditTypeIds, customerIds=$customerIds, endingBefore=$endingBefore, startingOn=$startingOn, nextPage=$nextPage, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditGrantListEntriesParams: CreditGrantListEntriesParams) = apply {
            this.nextPage = creditGrantListEntriesParams.nextPage
            this.creditTypeIds(creditGrantListEntriesParams.creditTypeIds ?: listOf())
            this.customerIds(creditGrantListEntriesParams.customerIds ?: listOf())
            this.endingBefore = creditGrantListEntriesParams.endingBefore
            this.startingOn = creditGrantListEntriesParams.startingOn
            additionalQueryParams(creditGrantListEntriesParams.additionalQueryParams)
            additionalHeaders(creditGrantListEntriesParams.additionalHeaders)
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
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
