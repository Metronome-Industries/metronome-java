// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ContractListBalancesParams
constructor(
    private val customerId: String,
    private val id: String?,
    private val coveringDate: OffsetDateTime?,
    private val effectiveBefore: OffsetDateTime?,
    private val includeArchived: Boolean?,
    private val includeContractBalances: Boolean?,
    private val includeLedgers: Boolean?,
    private val nextPage: String?,
    private val startingAt: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun id(): Optional<String> = Optional.ofNullable(id)

    fun coveringDate(): Optional<OffsetDateTime> = Optional.ofNullable(coveringDate)

    fun effectiveBefore(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveBefore)

    fun includeArchived(): Optional<Boolean> = Optional.ofNullable(includeArchived)

    fun includeContractBalances(): Optional<Boolean> = Optional.ofNullable(includeContractBalances)

    fun includeLedgers(): Optional<Boolean> = Optional.ofNullable(includeLedgers)

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun startingAt(): Optional<OffsetDateTime> = Optional.ofNullable(startingAt)

    @JvmSynthetic
    internal fun getBody(): ContractListBalancesBody {
        return ContractListBalancesBody(
            customerId,
            id,
            coveringDate,
            effectiveBefore,
            includeArchived,
            includeContractBalances,
            includeLedgers,
            nextPage,
            startingAt,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ContractListBalancesBody.Builder::class)
    @NoAutoDetect
    class ContractListBalancesBody
    internal constructor(
        private val customerId: String?,
        private val id: String?,
        private val coveringDate: OffsetDateTime?,
        private val effectiveBefore: OffsetDateTime?,
        private val includeArchived: Boolean?,
        private val includeContractBalances: Boolean?,
        private val includeLedgers: Boolean?,
        private val nextPage: String?,
        private val startingAt: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("customer_id") fun customerId(): String? = customerId

        @JsonProperty("id") fun id(): String? = id

        /** Return only balances that have access schedules that "cover" the provided date */
        @JsonProperty("covering_date") fun coveringDate(): OffsetDateTime? = coveringDate

        /** Include only balances that have any access before the provided date (exclusive) */
        @JsonProperty("effective_before") fun effectiveBefore(): OffsetDateTime? = effectiveBefore

        /** Include credits from archived contracts. */
        @JsonProperty("include_archived") fun includeArchived(): Boolean? = includeArchived

        /** Include balances on the contract level. */
        @JsonProperty("include_contract_balances")
        fun includeContractBalances(): Boolean? = includeContractBalances

        /** Include ledgers in the response. Setting this flag may cause the query to be slower. */
        @JsonProperty("include_ledgers") fun includeLedgers(): Boolean? = includeLedgers

        /** The next page token from a previous response. */
        @JsonProperty("next_page") fun nextPage(): String? = nextPage

        /** Include only balances that have any access on or after the provided date */
        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customerId: String? = null
            private var id: String? = null
            private var coveringDate: OffsetDateTime? = null
            private var effectiveBefore: OffsetDateTime? = null
            private var includeArchived: Boolean? = null
            private var includeContractBalances: Boolean? = null
            private var includeLedgers: Boolean? = null
            private var nextPage: String? = null
            private var startingAt: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractListBalancesBody: ContractListBalancesBody) = apply {
                this.customerId = contractListBalancesBody.customerId
                this.id = contractListBalancesBody.id
                this.coveringDate = contractListBalancesBody.coveringDate
                this.effectiveBefore = contractListBalancesBody.effectiveBefore
                this.includeArchived = contractListBalancesBody.includeArchived
                this.includeContractBalances = contractListBalancesBody.includeContractBalances
                this.includeLedgers = contractListBalancesBody.includeLedgers
                this.nextPage = contractListBalancesBody.nextPage
                this.startingAt = contractListBalancesBody.startingAt
                additionalProperties(contractListBalancesBody.additionalProperties)
            }

            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            /** Return only balances that have access schedules that "cover" the provided date */
            @JsonProperty("covering_date")
            fun coveringDate(coveringDate: OffsetDateTime) = apply {
                this.coveringDate = coveringDate
            }

            /** Include only balances that have any access before the provided date (exclusive) */
            @JsonProperty("effective_before")
            fun effectiveBefore(effectiveBefore: OffsetDateTime) = apply {
                this.effectiveBefore = effectiveBefore
            }

            /** Include credits from archived contracts. */
            @JsonProperty("include_archived")
            fun includeArchived(includeArchived: Boolean) = apply {
                this.includeArchived = includeArchived
            }

            /** Include balances on the contract level. */
            @JsonProperty("include_contract_balances")
            fun includeContractBalances(includeContractBalances: Boolean) = apply {
                this.includeContractBalances = includeContractBalances
            }

            /**
             * Include ledgers in the response. Setting this flag may cause the query to be slower.
             */
            @JsonProperty("include_ledgers")
            fun includeLedgers(includeLedgers: Boolean) = apply {
                this.includeLedgers = includeLedgers
            }

            /** The next page token from a previous response. */
            @JsonProperty("next_page")
            fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

            /** Include only balances that have any access on or after the provided date */
            @JsonProperty("starting_at")
            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

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

            fun build(): ContractListBalancesBody =
                ContractListBalancesBody(
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    id,
                    coveringDate,
                    effectiveBefore,
                    includeArchived,
                    includeContractBalances,
                    includeLedgers,
                    nextPage,
                    startingAt,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractListBalancesBody && this.customerId == other.customerId && this.id == other.id && this.coveringDate == other.coveringDate && this.effectiveBefore == other.effectiveBefore && this.includeArchived == other.includeArchived && this.includeContractBalances == other.includeContractBalances && this.includeLedgers == other.includeLedgers && this.nextPage == other.nextPage && this.startingAt == other.startingAt && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(customerId, id, coveringDate, effectiveBefore, includeArchived, includeContractBalances, includeLedgers, nextPage, startingAt, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractListBalancesBody{customerId=$customerId, id=$id, coveringDate=$coveringDate, effectiveBefore=$effectiveBefore, includeArchived=$includeArchived, includeContractBalances=$includeContractBalances, includeLedgers=$includeLedgers, nextPage=$nextPage, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractListBalancesParams && this.customerId == other.customerId && this.id == other.id && this.coveringDate == other.coveringDate && this.effectiveBefore == other.effectiveBefore && this.includeArchived == other.includeArchived && this.includeContractBalances == other.includeContractBalances && this.includeLedgers == other.includeLedgers && this.nextPage == other.nextPage && this.startingAt == other.startingAt && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, id, coveringDate, effectiveBefore, includeArchived, includeContractBalances, includeLedgers, nextPage, startingAt, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractListBalancesParams{customerId=$customerId, id=$id, coveringDate=$coveringDate, effectiveBefore=$effectiveBefore, includeArchived=$includeArchived, includeContractBalances=$includeContractBalances, includeLedgers=$includeLedgers, nextPage=$nextPage, startingAt=$startingAt, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var id: String? = null
        private var coveringDate: OffsetDateTime? = null
        private var effectiveBefore: OffsetDateTime? = null
        private var includeArchived: Boolean? = null
        private var includeContractBalances: Boolean? = null
        private var includeLedgers: Boolean? = null
        private var nextPage: String? = null
        private var startingAt: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractListBalancesParams: ContractListBalancesParams) = apply {
            this.customerId = contractListBalancesParams.customerId
            this.id = contractListBalancesParams.id
            this.coveringDate = contractListBalancesParams.coveringDate
            this.effectiveBefore = contractListBalancesParams.effectiveBefore
            this.includeArchived = contractListBalancesParams.includeArchived
            this.includeContractBalances = contractListBalancesParams.includeContractBalances
            this.includeLedgers = contractListBalancesParams.includeLedgers
            this.nextPage = contractListBalancesParams.nextPage
            this.startingAt = contractListBalancesParams.startingAt
            additionalQueryParams(contractListBalancesParams.additionalQueryParams)
            additionalHeaders(contractListBalancesParams.additionalHeaders)
            additionalBodyProperties(contractListBalancesParams.additionalBodyProperties)
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun id(id: String) = apply { this.id = id }

        /** Return only balances that have access schedules that "cover" the provided date */
        fun coveringDate(coveringDate: OffsetDateTime) = apply { this.coveringDate = coveringDate }

        /** Include only balances that have any access before the provided date (exclusive) */
        fun effectiveBefore(effectiveBefore: OffsetDateTime) = apply {
            this.effectiveBefore = effectiveBefore
        }

        /** Include credits from archived contracts. */
        fun includeArchived(includeArchived: Boolean) = apply {
            this.includeArchived = includeArchived
        }

        /** Include balances on the contract level. */
        fun includeContractBalances(includeContractBalances: Boolean) = apply {
            this.includeContractBalances = includeContractBalances
        }

        /** Include ledgers in the response. Setting this flag may cause the query to be slower. */
        fun includeLedgers(includeLedgers: Boolean) = apply { this.includeLedgers = includeLedgers }

        /** The next page token from a previous response. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /** Include only balances that have any access on or after the provided date */
        fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

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

        fun build(): ContractListBalancesParams =
            ContractListBalancesParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                id,
                coveringDate,
                effectiveBefore,
                includeArchived,
                includeContractBalances,
                includeLedgers,
                nextPage,
                startingAt,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
