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

class ContractListBalancesParams
constructor(
    private val body: ContractListBalancesBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = body.customerId()

    fun id(): Optional<String> = body.id()

    /** Return only balances that have access schedules that "cover" the provided date */
    fun coveringDate(): Optional<OffsetDateTime> = body.coveringDate()

    /** Include only balances that have any access before the provided date (exclusive) */
    fun effectiveBefore(): Optional<OffsetDateTime> = body.effectiveBefore()

    /** Include credits from archived contracts. */
    fun includeArchived(): Optional<Boolean> = body.includeArchived()

    /** Include balances on the contract level. */
    fun includeContractBalances(): Optional<Boolean> = body.includeContractBalances()

    /** Include ledgers in the response. Setting this flag may cause the query to be slower. */
    fun includeLedgers(): Optional<Boolean> = body.includeLedgers()

    /** The next page token from a previous response. */
    fun nextPage(): Optional<String> = body.nextPage()

    /** Include only balances that have any access on or after the provided date */
    fun startingAt(): Optional<OffsetDateTime> = body.startingAt()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): ContractListBalancesBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractListBalancesBody
    @JsonCreator
    internal constructor(
        @JsonProperty("customer_id") private val customerId: String,
        @JsonProperty("id") private val id: String?,
        @JsonProperty("covering_date") private val coveringDate: OffsetDateTime?,
        @JsonProperty("effective_before") private val effectiveBefore: OffsetDateTime?,
        @JsonProperty("include_archived") private val includeArchived: Boolean?,
        @JsonProperty("include_contract_balances") private val includeContractBalances: Boolean?,
        @JsonProperty("include_ledgers") private val includeLedgers: Boolean?,
        @JsonProperty("next_page") private val nextPage: String?,
        @JsonProperty("starting_at") private val startingAt: OffsetDateTime?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("customer_id") fun customerId(): String = customerId

        @JsonProperty("id") fun id(): Optional<String> = Optional.ofNullable(id)

        /** Return only balances that have access schedules that "cover" the provided date */
        @JsonProperty("covering_date")
        fun coveringDate(): Optional<OffsetDateTime> = Optional.ofNullable(coveringDate)

        /** Include only balances that have any access before the provided date (exclusive) */
        @JsonProperty("effective_before")
        fun effectiveBefore(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveBefore)

        /** Include credits from archived contracts. */
        @JsonProperty("include_archived")
        fun includeArchived(): Optional<Boolean> = Optional.ofNullable(includeArchived)

        /** Include balances on the contract level. */
        @JsonProperty("include_contract_balances")
        fun includeContractBalances(): Optional<Boolean> =
            Optional.ofNullable(includeContractBalances)

        /** Include ledgers in the response. Setting this flag may cause the query to be slower. */
        @JsonProperty("include_ledgers")
        fun includeLedgers(): Optional<Boolean> = Optional.ofNullable(includeLedgers)

        /** The next page token from a previous response. */
        @JsonProperty("next_page") fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

        /** Include only balances that have any access on or after the provided date */
        @JsonProperty("starting_at")
        fun startingAt(): Optional<OffsetDateTime> = Optional.ofNullable(startingAt)

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
                customerId = contractListBalancesBody.customerId
                id = contractListBalancesBody.id
                coveringDate = contractListBalancesBody.coveringDate
                effectiveBefore = contractListBalancesBody.effectiveBefore
                includeArchived = contractListBalancesBody.includeArchived
                includeContractBalances = contractListBalancesBody.includeContractBalances
                includeLedgers = contractListBalancesBody.includeLedgers
                nextPage = contractListBalancesBody.nextPage
                startingAt = contractListBalancesBody.startingAt
                additionalProperties = contractListBalancesBody.additionalProperties.toMutableMap()
            }

            fun customerId(customerId: String) = apply { this.customerId = customerId }

            fun id(id: String) = apply { this.id = id }

            /** Return only balances that have access schedules that "cover" the provided date */
            fun coveringDate(coveringDate: OffsetDateTime) = apply {
                this.coveringDate = coveringDate
            }

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

            /**
             * Include ledgers in the response. Setting this flag may cause the query to be slower.
             */
            fun includeLedgers(includeLedgers: Boolean) = apply {
                this.includeLedgers = includeLedgers
            }

            /** The next page token from a previous response. */
            fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

            /** Include only balances that have any access on or after the provided date */
            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractListBalancesBody && customerId == other.customerId && id == other.id && coveringDate == other.coveringDate && effectiveBefore == other.effectiveBefore && includeArchived == other.includeArchived && includeContractBalances == other.includeContractBalances && includeLedgers == other.includeLedgers && nextPage == other.nextPage && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, id, coveringDate, effectiveBefore, includeArchived, includeContractBalances, includeLedgers, nextPage, startingAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractListBalancesBody{customerId=$customerId, id=$id, coveringDate=$coveringDate, effectiveBefore=$effectiveBefore, includeArchived=$includeArchived, includeContractBalances=$includeContractBalances, includeLedgers=$includeLedgers, nextPage=$nextPage, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ContractListBalancesBody.Builder = ContractListBalancesBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractListBalancesParams: ContractListBalancesParams) = apply {
            body = contractListBalancesParams.body.toBuilder()
            additionalHeaders = contractListBalancesParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractListBalancesParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        fun id(id: String) = apply { body.id(id) }

        /** Return only balances that have access schedules that "cover" the provided date */
        fun coveringDate(coveringDate: OffsetDateTime) = apply { body.coveringDate(coveringDate) }

        /** Include only balances that have any access before the provided date (exclusive) */
        fun effectiveBefore(effectiveBefore: OffsetDateTime) = apply {
            body.effectiveBefore(effectiveBefore)
        }

        /** Include credits from archived contracts. */
        fun includeArchived(includeArchived: Boolean) = apply {
            body.includeArchived(includeArchived)
        }

        /** Include balances on the contract level. */
        fun includeContractBalances(includeContractBalances: Boolean) = apply {
            body.includeContractBalances(includeContractBalances)
        }

        /** Include ledgers in the response. Setting this flag may cause the query to be slower. */
        fun includeLedgers(includeLedgers: Boolean) = apply { body.includeLedgers(includeLedgers) }

        /** The next page token from a previous response. */
        fun nextPage(nextPage: String) = apply { body.nextPage(nextPage) }

        /** Include only balances that have any access on or after the provided date */
        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

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

        fun build(): ContractListBalancesParams =
            ContractListBalancesParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractListBalancesParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractListBalancesParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
