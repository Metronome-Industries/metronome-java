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

class CustomerCommitListParams
constructor(
    private val customerId: String,
    private val commitId: String?,
    private val coveringDate: OffsetDateTime?,
    private val effectiveBefore: OffsetDateTime?,
    private val includeArchived: Boolean?,
    private val includeContractCommits: Boolean?,
    private val includeLedgers: Boolean?,
    private val nextPage: String?,
    private val startingAt: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun commitId(): Optional<String> = Optional.ofNullable(commitId)

    fun coveringDate(): Optional<OffsetDateTime> = Optional.ofNullable(coveringDate)

    fun effectiveBefore(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveBefore)

    fun includeArchived(): Optional<Boolean> = Optional.ofNullable(includeArchived)

    fun includeContractCommits(): Optional<Boolean> = Optional.ofNullable(includeContractCommits)

    fun includeLedgers(): Optional<Boolean> = Optional.ofNullable(includeLedgers)

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun startingAt(): Optional<OffsetDateTime> = Optional.ofNullable(startingAt)

    @JvmSynthetic
    internal fun getBody(): CustomerCommitListBody {
        return CustomerCommitListBody(
            customerId,
            commitId,
            coveringDate,
            effectiveBefore,
            includeArchived,
            includeContractCommits,
            includeLedgers,
            nextPage,
            startingAt,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CustomerCommitListBody.Builder::class)
    @NoAutoDetect
    class CustomerCommitListBody
    internal constructor(
        private val customerId: String?,
        private val commitId: String?,
        private val coveringDate: OffsetDateTime?,
        private val effectiveBefore: OffsetDateTime?,
        private val includeArchived: Boolean?,
        private val includeContractCommits: Boolean?,
        private val includeLedgers: Boolean?,
        private val nextPage: String?,
        private val startingAt: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("customer_id") fun customerId(): String? = customerId

        @JsonProperty("commit_id") fun commitId(): String? = commitId

        /** Include only commits that have access schedules that "cover" the provided date */
        @JsonProperty("covering_date") fun coveringDate(): OffsetDateTime? = coveringDate

        /** Include only commits that have any access before the provided date (exclusive) */
        @JsonProperty("effective_before") fun effectiveBefore(): OffsetDateTime? = effectiveBefore

        /** Include commits from archived contracts. */
        @JsonProperty("include_archived") fun includeArchived(): Boolean? = includeArchived

        /** Include commits on the contract level. */
        @JsonProperty("include_contract_commits")
        fun includeContractCommits(): Boolean? = includeContractCommits

        /**
         * Include commit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        @JsonProperty("include_ledgers") fun includeLedgers(): Boolean? = includeLedgers

        /** The next page token from a previous response. */
        @JsonProperty("next_page") fun nextPage(): String? = nextPage

        /** Include only commits that have any access on or after the provided date */
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
            private var commitId: String? = null
            private var coveringDate: OffsetDateTime? = null
            private var effectiveBefore: OffsetDateTime? = null
            private var includeArchived: Boolean? = null
            private var includeContractCommits: Boolean? = null
            private var includeLedgers: Boolean? = null
            private var nextPage: String? = null
            private var startingAt: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerCommitListBody: CustomerCommitListBody) = apply {
                this.customerId = customerCommitListBody.customerId
                this.commitId = customerCommitListBody.commitId
                this.coveringDate = customerCommitListBody.coveringDate
                this.effectiveBefore = customerCommitListBody.effectiveBefore
                this.includeArchived = customerCommitListBody.includeArchived
                this.includeContractCommits = customerCommitListBody.includeContractCommits
                this.includeLedgers = customerCommitListBody.includeLedgers
                this.nextPage = customerCommitListBody.nextPage
                this.startingAt = customerCommitListBody.startingAt
                additionalProperties(customerCommitListBody.additionalProperties)
            }

            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            @JsonProperty("commit_id")
            fun commitId(commitId: String) = apply { this.commitId = commitId }

            /** Include only commits that have access schedules that "cover" the provided date */
            @JsonProperty("covering_date")
            fun coveringDate(coveringDate: OffsetDateTime) = apply {
                this.coveringDate = coveringDate
            }

            /** Include only commits that have any access before the provided date (exclusive) */
            @JsonProperty("effective_before")
            fun effectiveBefore(effectiveBefore: OffsetDateTime) = apply {
                this.effectiveBefore = effectiveBefore
            }

            /** Include commits from archived contracts. */
            @JsonProperty("include_archived")
            fun includeArchived(includeArchived: Boolean) = apply {
                this.includeArchived = includeArchived
            }

            /** Include commits on the contract level. */
            @JsonProperty("include_contract_commits")
            fun includeContractCommits(includeContractCommits: Boolean) = apply {
                this.includeContractCommits = includeContractCommits
            }

            /**
             * Include commit ledgers in the response. Setting this flag may cause the query to be
             * slower.
             */
            @JsonProperty("include_ledgers")
            fun includeLedgers(includeLedgers: Boolean) = apply {
                this.includeLedgers = includeLedgers
            }

            /** The next page token from a previous response. */
            @JsonProperty("next_page")
            fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

            /** Include only commits that have any access on or after the provided date */
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

            fun build(): CustomerCommitListBody =
                CustomerCommitListBody(
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    commitId,
                    coveringDate,
                    effectiveBefore,
                    includeArchived,
                    includeContractCommits,
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

            return /* spotless:off */ other is CustomerCommitListBody && this.customerId == other.customerId && this.commitId == other.commitId && this.coveringDate == other.coveringDate && this.effectiveBefore == other.effectiveBefore && this.includeArchived == other.includeArchived && this.includeContractCommits == other.includeContractCommits && this.includeLedgers == other.includeLedgers && this.nextPage == other.nextPage && this.startingAt == other.startingAt && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(customerId, commitId, coveringDate, effectiveBefore, includeArchived, includeContractCommits, includeLedgers, nextPage, startingAt, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CustomerCommitListBody{customerId=$customerId, commitId=$commitId, coveringDate=$coveringDate, effectiveBefore=$effectiveBefore, includeArchived=$includeArchived, includeContractCommits=$includeContractCommits, includeLedgers=$includeLedgers, nextPage=$nextPage, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCommitListParams && this.customerId == other.customerId && this.commitId == other.commitId && this.coveringDate == other.coveringDate && this.effectiveBefore == other.effectiveBefore && this.includeArchived == other.includeArchived && this.includeContractCommits == other.includeContractCommits && this.includeLedgers == other.includeLedgers && this.nextPage == other.nextPage && this.startingAt == other.startingAt && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, commitId, coveringDate, effectiveBefore, includeArchived, includeContractCommits, includeLedgers, nextPage, startingAt, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CustomerCommitListParams{customerId=$customerId, commitId=$commitId, coveringDate=$coveringDate, effectiveBefore=$effectiveBefore, includeArchived=$includeArchived, includeContractCommits=$includeContractCommits, includeLedgers=$includeLedgers, nextPage=$nextPage, startingAt=$startingAt, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var commitId: String? = null
        private var coveringDate: OffsetDateTime? = null
        private var effectiveBefore: OffsetDateTime? = null
        private var includeArchived: Boolean? = null
        private var includeContractCommits: Boolean? = null
        private var includeLedgers: Boolean? = null
        private var nextPage: String? = null
        private var startingAt: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerCommitListParams: CustomerCommitListParams) = apply {
            this.customerId = customerCommitListParams.customerId
            this.commitId = customerCommitListParams.commitId
            this.coveringDate = customerCommitListParams.coveringDate
            this.effectiveBefore = customerCommitListParams.effectiveBefore
            this.includeArchived = customerCommitListParams.includeArchived
            this.includeContractCommits = customerCommitListParams.includeContractCommits
            this.includeLedgers = customerCommitListParams.includeLedgers
            this.nextPage = customerCommitListParams.nextPage
            this.startingAt = customerCommitListParams.startingAt
            additionalQueryParams(customerCommitListParams.additionalQueryParams)
            additionalHeaders(customerCommitListParams.additionalHeaders)
            additionalBodyProperties(customerCommitListParams.additionalBodyProperties)
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun commitId(commitId: String) = apply { this.commitId = commitId }

        /** Include only commits that have access schedules that "cover" the provided date */
        fun coveringDate(coveringDate: OffsetDateTime) = apply { this.coveringDate = coveringDate }

        /** Include only commits that have any access before the provided date (exclusive) */
        fun effectiveBefore(effectiveBefore: OffsetDateTime) = apply {
            this.effectiveBefore = effectiveBefore
        }

        /** Include commits from archived contracts. */
        fun includeArchived(includeArchived: Boolean) = apply {
            this.includeArchived = includeArchived
        }

        /** Include commits on the contract level. */
        fun includeContractCommits(includeContractCommits: Boolean) = apply {
            this.includeContractCommits = includeContractCommits
        }

        /**
         * Include commit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        fun includeLedgers(includeLedgers: Boolean) = apply { this.includeLedgers = includeLedgers }

        /** The next page token from a previous response. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /** Include only commits that have any access on or after the provided date */
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

        fun build(): CustomerCommitListParams =
            CustomerCommitListParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                commitId,
                coveringDate,
                effectiveBefore,
                includeArchived,
                includeContractCommits,
                includeLedgers,
                nextPage,
                startingAt,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
