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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = CustomerCreditListBody.Builder::class)
    @NoAutoDetect
    class CustomerCreditListBody
    internal constructor(
        private val customerId: String,
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

        @JsonProperty("customer_id") fun customerId(): String = customerId

        /** Return only credits that have access schedules that "cover" the provided date */
        @JsonProperty("covering_date")
        fun coveringDate(): Optional<OffsetDateTime> = Optional.ofNullable(coveringDate)

        @JsonProperty("credit_id") fun creditId(): Optional<String> = Optional.ofNullable(creditId)

        /** Include only credits that have any access before the provided date (exclusive) */
        @JsonProperty("effective_before")
        fun effectiveBefore(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveBefore)

        /** Include credits from archived contracts. */
        @JsonProperty("include_archived")
        fun includeArchived(): Optional<Boolean> = Optional.ofNullable(includeArchived)

        /** Include credits on the contract level. */
        @JsonProperty("include_contract_credits")
        fun includeContractCredits(): Optional<Boolean> =
            Optional.ofNullable(includeContractCredits)

        /**
         * Include credit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        @JsonProperty("include_ledgers")
        fun includeLedgers(): Optional<Boolean> = Optional.ofNullable(includeLedgers)

        /** The next page token from a previous response. */
        @JsonProperty("next_page") fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

        /** Include only credits that have any access on or after the provided date */
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
                customerId = customerCreditListBody.customerId
                coveringDate = customerCreditListBody.coveringDate
                creditId = customerCreditListBody.creditId
                effectiveBefore = customerCreditListBody.effectiveBefore
                includeArchived = customerCreditListBody.includeArchived
                includeContractCredits = customerCreditListBody.includeContractCredits
                includeLedgers = customerCreditListBody.includeLedgers
                nextPage = customerCreditListBody.nextPage
                startingAt = customerCreditListBody.startingAt
                additionalProperties = customerCreditListBody.additionalProperties.toMutableMap()
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
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            return /* spotless:off */ other is CustomerCreditListBody && customerId == other.customerId && coveringDate == other.coveringDate && creditId == other.creditId && effectiveBefore == other.effectiveBefore && includeArchived == other.includeArchived && includeContractCredits == other.includeContractCredits && includeLedgers == other.includeLedgers && nextPage == other.nextPage && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, coveringDate, creditId, effectiveBefore, includeArchived, includeContractCredits, includeLedgers, nextPage, startingAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerCreditListBody{customerId=$customerId, coveringDate=$coveringDate, creditId=$creditId, effectiveBefore=$effectiveBefore, includeArchived=$includeArchived, includeContractCredits=$includeContractCredits, includeLedgers=$includeLedgers, nextPage=$nextPage, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerCreditListParams: CustomerCreditListParams) = apply {
            customerId = customerCreditListParams.customerId
            coveringDate = customerCreditListParams.coveringDate
            creditId = customerCreditListParams.creditId
            effectiveBefore = customerCreditListParams.effectiveBefore
            includeArchived = customerCreditListParams.includeArchived
            includeContractCredits = customerCreditListParams.includeContractCredits
            includeLedgers = customerCreditListParams.includeLedgers
            nextPage = customerCreditListParams.nextPage
            startingAt = customerCreditListParams.startingAt
            additionalHeaders = customerCreditListParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCreditListParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                customerCreditListParams.additionalBodyProperties.toMutableMap()
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
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditListParams && customerId == other.customerId && coveringDate == other.coveringDate && creditId == other.creditId && effectiveBefore == other.effectiveBefore && includeArchived == other.includeArchived && includeContractCredits == other.includeContractCredits && includeLedgers == other.includeLedgers && nextPage == other.nextPage && startingAt == other.startingAt && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, coveringDate, creditId, effectiveBefore, includeArchived, includeContractCredits, includeLedgers, nextPage, startingAt, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CustomerCreditListParams{customerId=$customerId, coveringDate=$coveringDate, creditId=$creditId, effectiveBefore=$effectiveBefore, includeArchived=$includeArchived, includeContractCredits=$includeContractCredits, includeLedgers=$includeLedgers, nextPage=$nextPage, startingAt=$startingAt, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
