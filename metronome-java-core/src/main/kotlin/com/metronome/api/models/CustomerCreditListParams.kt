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

class CustomerCreditListParams
constructor(
    private val customerId: String,
    private val coveringDate: OffsetDateTime?,
    private val creditId: String?,
    private val effectiveBefore: OffsetDateTime?,
    private val includeArchived: Boolean?,
    private val includeContractCredits: Boolean?,
    private val includeLedgers: Boolean?,
    private val nextPage: String?,
    private val startingAt: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun coveringDate(): Optional<OffsetDateTime> = Optional.ofNullable(coveringDate)

    fun creditId(): Optional<String> = Optional.ofNullable(creditId)

    fun effectiveBefore(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveBefore)

    fun includeArchived(): Optional<Boolean> = Optional.ofNullable(includeArchived)

    fun includeContractCredits(): Optional<Boolean> = Optional.ofNullable(includeContractCredits)

    fun includeLedgers(): Optional<Boolean> = Optional.ofNullable(includeLedgers)

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun startingAt(): Optional<OffsetDateTime> = Optional.ofNullable(startingAt)

    @JvmSynthetic
    internal fun getBody(): CustomerCreditListBody {
        return CustomerCreditListBody(
            customerId,
            coveringDate,
            creditId,
            effectiveBefore,
            includeArchived,
            includeContractCredits,
            includeLedgers,
            nextPage,
            startingAt,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CustomerCreditListBody.Builder::class)
    @NoAutoDetect
    class CustomerCreditListBody
    internal constructor(
        private val customerId: String?,
        private val coveringDate: OffsetDateTime?,
        private val creditId: String?,
        private val effectiveBefore: OffsetDateTime?,
        private val includeArchived: Boolean?,
        private val includeContractCredits: Boolean?,
        private val includeLedgers: Boolean?,
        private val nextPage: String?,
        private val startingAt: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** Return only credits that have access schedules that "cover" the provided date */
        @JsonProperty("covering_date") fun coveringDate(): OffsetDateTime? = coveringDate

        @JsonProperty("credit_id") fun creditId(): String? = creditId

        /** Include only credits that have any access before the provided date (exclusive) */
        @JsonProperty("effective_before") fun effectiveBefore(): OffsetDateTime? = effectiveBefore

        /** Include credits from archived contracts. */
        @JsonProperty("include_archived") fun includeArchived(): Boolean? = includeArchived

        /** Include credits on the contract level. */
        @JsonProperty("include_contract_credits")
        fun includeContractCredits(): Boolean? = includeContractCredits

        /**
         * Include credit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        @JsonProperty("include_ledgers") fun includeLedgers(): Boolean? = includeLedgers

        /** The next page token from a previous response. */
        @JsonProperty("next_page") fun nextPage(): String? = nextPage

        /** Include only credits that have any access on or after the provided date */
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
            private var coveringDate: OffsetDateTime? = null
            private var creditId: String? = null
            private var effectiveBefore: OffsetDateTime? = null
            private var includeArchived: Boolean? = null
            private var includeContractCredits: Boolean? = null
            private var includeLedgers: Boolean? = null
            private var nextPage: String? = null
            private var startingAt: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerCreditListBody: CustomerCreditListBody) = apply {
                this.customerId = customerCreditListBody.customerId
                this.coveringDate = customerCreditListBody.coveringDate
                this.creditId = customerCreditListBody.creditId
                this.effectiveBefore = customerCreditListBody.effectiveBefore
                this.includeArchived = customerCreditListBody.includeArchived
                this.includeContractCredits = customerCreditListBody.includeContractCredits
                this.includeLedgers = customerCreditListBody.includeLedgers
                this.nextPage = customerCreditListBody.nextPage
                this.startingAt = customerCreditListBody.startingAt
                additionalProperties(customerCreditListBody.additionalProperties)
            }

            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** Return only credits that have access schedules that "cover" the provided date */
            @JsonProperty("covering_date")
            fun coveringDate(coveringDate: OffsetDateTime) = apply {
                this.coveringDate = coveringDate
            }

            @JsonProperty("credit_id")
            fun creditId(creditId: String) = apply { this.creditId = creditId }

            /** Include only credits that have any access before the provided date (exclusive) */
            @JsonProperty("effective_before")
            fun effectiveBefore(effectiveBefore: OffsetDateTime) = apply {
                this.effectiveBefore = effectiveBefore
            }

            /** Include credits from archived contracts. */
            @JsonProperty("include_archived")
            fun includeArchived(includeArchived: Boolean) = apply {
                this.includeArchived = includeArchived
            }

            /** Include credits on the contract level. */
            @JsonProperty("include_contract_credits")
            fun includeContractCredits(includeContractCredits: Boolean) = apply {
                this.includeContractCredits = includeContractCredits
            }

            /**
             * Include credit ledgers in the response. Setting this flag may cause the query to be
             * slower.
             */
            @JsonProperty("include_ledgers")
            fun includeLedgers(includeLedgers: Boolean) = apply {
                this.includeLedgers = includeLedgers
            }

            /** The next page token from a previous response. */
            @JsonProperty("next_page")
            fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

            /** Include only credits that have any access on or after the provided date */
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

            fun build(): CustomerCreditListBody =
                CustomerCreditListBody(
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    coveringDate,
                    creditId,
                    effectiveBefore,
                    includeArchived,
                    includeContractCredits,
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

            return /* spotless:off */ other is CustomerCreditListBody && this.customerId == other.customerId && this.coveringDate == other.coveringDate && this.creditId == other.creditId && this.effectiveBefore == other.effectiveBefore && this.includeArchived == other.includeArchived && this.includeContractCredits == other.includeContractCredits && this.includeLedgers == other.includeLedgers && this.nextPage == other.nextPage && this.startingAt == other.startingAt && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(customerId, coveringDate, creditId, effectiveBefore, includeArchived, includeContractCredits, includeLedgers, nextPage, startingAt, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CustomerCreditListBody{customerId=$customerId, coveringDate=$coveringDate, creditId=$creditId, effectiveBefore=$effectiveBefore, includeArchived=$includeArchived, includeContractCredits=$includeContractCredits, includeLedgers=$includeLedgers, nextPage=$nextPage, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditListParams && this.customerId == other.customerId && this.coveringDate == other.coveringDate && this.creditId == other.creditId && this.effectiveBefore == other.effectiveBefore && this.includeArchived == other.includeArchived && this.includeContractCredits == other.includeContractCredits && this.includeLedgers == other.includeLedgers && this.nextPage == other.nextPage && this.startingAt == other.startingAt && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, coveringDate, creditId, effectiveBefore, includeArchived, includeContractCredits, includeLedgers, nextPage, startingAt, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CustomerCreditListParams{customerId=$customerId, coveringDate=$coveringDate, creditId=$creditId, effectiveBefore=$effectiveBefore, includeArchived=$includeArchived, includeContractCredits=$includeContractCredits, includeLedgers=$includeLedgers, nextPage=$nextPage, startingAt=$startingAt, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var coveringDate: OffsetDateTime? = null
        private var creditId: String? = null
        private var effectiveBefore: OffsetDateTime? = null
        private var includeArchived: Boolean? = null
        private var includeContractCredits: Boolean? = null
        private var includeLedgers: Boolean? = null
        private var nextPage: String? = null
        private var startingAt: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerCreditListParams: CustomerCreditListParams) = apply {
            this.customerId = customerCreditListParams.customerId
            this.coveringDate = customerCreditListParams.coveringDate
            this.creditId = customerCreditListParams.creditId
            this.effectiveBefore = customerCreditListParams.effectiveBefore
            this.includeArchived = customerCreditListParams.includeArchived
            this.includeContractCredits = customerCreditListParams.includeContractCredits
            this.includeLedgers = customerCreditListParams.includeLedgers
            this.nextPage = customerCreditListParams.nextPage
            this.startingAt = customerCreditListParams.startingAt
            additionalQueryParams(customerCreditListParams.additionalQueryParams)
            additionalHeaders(customerCreditListParams.additionalHeaders)
            additionalBodyProperties(customerCreditListParams.additionalBodyProperties)
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** Return only credits that have access schedules that "cover" the provided date */
        fun coveringDate(coveringDate: OffsetDateTime) = apply { this.coveringDate = coveringDate }

        fun creditId(creditId: String) = apply { this.creditId = creditId }

        /** Include only credits that have any access before the provided date (exclusive) */
        fun effectiveBefore(effectiveBefore: OffsetDateTime) = apply {
            this.effectiveBefore = effectiveBefore
        }

        /** Include credits from archived contracts. */
        fun includeArchived(includeArchived: Boolean) = apply {
            this.includeArchived = includeArchived
        }

        /** Include credits on the contract level. */
        fun includeContractCredits(includeContractCredits: Boolean) = apply {
            this.includeContractCredits = includeContractCredits
        }

        /**
         * Include credit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        fun includeLedgers(includeLedgers: Boolean) = apply { this.includeLedgers = includeLedgers }

        /** The next page token from a previous response. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /** Include only credits that have any access on or after the provided date */
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

        fun build(): CustomerCreditListParams =
            CustomerCreditListParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                coveringDate,
                creditId,
                effectiveBefore,
                includeArchived,
                includeContractCredits,
                includeLedgers,
                nextPage,
                startingAt,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
