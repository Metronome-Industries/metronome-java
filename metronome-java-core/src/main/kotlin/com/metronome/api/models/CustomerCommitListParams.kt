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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CustomerCommitListBody
    @JsonCreator
    internal constructor(
        @JsonProperty("customer_id") private val customerId: String,
        @JsonProperty("commit_id") private val commitId: String?,
        @JsonProperty("covering_date") private val coveringDate: OffsetDateTime?,
        @JsonProperty("effective_before") private val effectiveBefore: OffsetDateTime?,
        @JsonProperty("include_archived") private val includeArchived: Boolean?,
        @JsonProperty("include_contract_commits") private val includeContractCommits: Boolean?,
        @JsonProperty("include_ledgers") private val includeLedgers: Boolean?,
        @JsonProperty("next_page") private val nextPage: String?,
        @JsonProperty("starting_at") private val startingAt: OffsetDateTime?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("customer_id") fun customerId(): String = customerId

        @JsonProperty("commit_id") fun commitId(): Optional<String> = Optional.ofNullable(commitId)

        /** Include only commits that have access schedules that "cover" the provided date */
        @JsonProperty("covering_date")
        fun coveringDate(): Optional<OffsetDateTime> = Optional.ofNullable(coveringDate)

        /** Include only commits that have any access before the provided date (exclusive) */
        @JsonProperty("effective_before")
        fun effectiveBefore(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveBefore)

        /** Include commits from archived contracts. */
        @JsonProperty("include_archived")
        fun includeArchived(): Optional<Boolean> = Optional.ofNullable(includeArchived)

        /** Include commits on the contract level. */
        @JsonProperty("include_contract_commits")
        fun includeContractCommits(): Optional<Boolean> =
            Optional.ofNullable(includeContractCommits)

        /**
         * Include commit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        @JsonProperty("include_ledgers")
        fun includeLedgers(): Optional<Boolean> = Optional.ofNullable(includeLedgers)

        /** The next page token from a previous response. */
        @JsonProperty("next_page") fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

        /** Include only commits that have any access on or after the provided date */
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
                customerId = customerCommitListBody.customerId
                commitId = customerCommitListBody.commitId
                coveringDate = customerCommitListBody.coveringDate
                effectiveBefore = customerCommitListBody.effectiveBefore
                includeArchived = customerCommitListBody.includeArchived
                includeContractCommits = customerCommitListBody.includeContractCommits
                includeLedgers = customerCommitListBody.includeLedgers
                nextPage = customerCommitListBody.nextPage
                startingAt = customerCommitListBody.startingAt
                additionalProperties = customerCommitListBody.additionalProperties.toMutableMap()
            }

            fun customerId(customerId: String) = apply { this.customerId = customerId }

            fun commitId(commitId: String) = apply { this.commitId = commitId }

            /** Include only commits that have access schedules that "cover" the provided date */
            fun coveringDate(coveringDate: OffsetDateTime) = apply {
                this.coveringDate = coveringDate
            }

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
            fun includeLedgers(includeLedgers: Boolean) = apply {
                this.includeLedgers = includeLedgers
            }

            /** The next page token from a previous response. */
            fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

            /** Include only commits that have any access on or after the provided date */
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

            return /* spotless:off */ other is CustomerCommitListBody && customerId == other.customerId && commitId == other.commitId && coveringDate == other.coveringDate && effectiveBefore == other.effectiveBefore && includeArchived == other.includeArchived && includeContractCommits == other.includeContractCommits && includeLedgers == other.includeLedgers && nextPage == other.nextPage && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, commitId, coveringDate, effectiveBefore, includeArchived, includeContractCommits, includeLedgers, nextPage, startingAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerCommitListBody{customerId=$customerId, commitId=$commitId, coveringDate=$coveringDate, effectiveBefore=$effectiveBefore, includeArchived=$includeArchived, includeContractCommits=$includeContractCommits, includeLedgers=$includeLedgers, nextPage=$nextPage, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerCommitListParams: CustomerCommitListParams) = apply {
            customerId = customerCommitListParams.customerId
            commitId = customerCommitListParams.commitId
            coveringDate = customerCommitListParams.coveringDate
            effectiveBefore = customerCommitListParams.effectiveBefore
            includeArchived = customerCommitListParams.includeArchived
            includeContractCommits = customerCommitListParams.includeContractCommits
            includeLedgers = customerCommitListParams.includeLedgers
            nextPage = customerCommitListParams.nextPage
            startingAt = customerCommitListParams.startingAt
            additionalHeaders = customerCommitListParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCommitListParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                customerCommitListParams.additionalBodyProperties.toMutableMap()
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
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCommitListParams && customerId == other.customerId && commitId == other.commitId && coveringDate == other.coveringDate && effectiveBefore == other.effectiveBefore && includeArchived == other.includeArchived && includeContractCommits == other.includeContractCommits && includeLedgers == other.includeLedgers && nextPage == other.nextPage && startingAt == other.startingAt && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, commitId, coveringDate, effectiveBefore, includeArchived, includeContractCommits, includeLedgers, nextPage, startingAt, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CustomerCommitListParams{customerId=$customerId, commitId=$commitId, coveringDate=$coveringDate, effectiveBefore=$effectiveBefore, includeArchived=$includeArchived, includeContractCommits=$includeContractCommits, includeLedgers=$includeLedgers, nextPage=$nextPage, startingAt=$startingAt, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
