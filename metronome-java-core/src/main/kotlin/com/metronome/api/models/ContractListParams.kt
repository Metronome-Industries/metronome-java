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

class ContractListParams
constructor(
    private val customerId: String,
    private val coveringDate: OffsetDateTime?,
    private val includeArchived: Boolean?,
    private val includeLedgers: Boolean?,
    private val startingAt: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun coveringDate(): Optional<OffsetDateTime> = Optional.ofNullable(coveringDate)

    fun includeArchived(): Optional<Boolean> = Optional.ofNullable(includeArchived)

    fun includeLedgers(): Optional<Boolean> = Optional.ofNullable(includeLedgers)

    fun startingAt(): Optional<OffsetDateTime> = Optional.ofNullable(startingAt)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): ContractListBody {
        return ContractListBody(
            customerId,
            coveringDate,
            includeArchived,
            includeLedgers,
            startingAt,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractListBody
    @JsonCreator
    internal constructor(
        @JsonProperty("customer_id") private val customerId: String,
        @JsonProperty("covering_date") private val coveringDate: OffsetDateTime?,
        @JsonProperty("include_archived") private val includeArchived: Boolean?,
        @JsonProperty("include_ledgers") private val includeLedgers: Boolean?,
        @JsonProperty("starting_at") private val startingAt: OffsetDateTime?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("customer_id") fun customerId(): String = customerId

        /**
         * Optional RFC 3339 timestamp. If provided, the response will include only contracts
         * effective on the provided date. This cannot be provided if the starting_at filter is
         * provided.
         */
        @JsonProperty("covering_date")
        fun coveringDate(): Optional<OffsetDateTime> = Optional.ofNullable(coveringDate)

        /** Include archived contracts in the response */
        @JsonProperty("include_archived")
        fun includeArchived(): Optional<Boolean> = Optional.ofNullable(includeArchived)

        /**
         * Include commit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        @JsonProperty("include_ledgers")
        fun includeLedgers(): Optional<Boolean> = Optional.ofNullable(includeLedgers)

        /**
         * Optional RFC 3339 timestamp. If provided, the response will include only contracts where
         * effective_at is on or after the provided date. This cannot be provided if the
         * covering_date filter is provided.
         */
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
            private var includeArchived: Boolean? = null
            private var includeLedgers: Boolean? = null
            private var startingAt: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractListBody: ContractListBody) = apply {
                customerId = contractListBody.customerId
                coveringDate = contractListBody.coveringDate
                includeArchived = contractListBody.includeArchived
                includeLedgers = contractListBody.includeLedgers
                startingAt = contractListBody.startingAt
                additionalProperties = contractListBody.additionalProperties.toMutableMap()
            }

            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * Optional RFC 3339 timestamp. If provided, the response will include only contracts
             * effective on the provided date. This cannot be provided if the starting_at filter is
             * provided.
             */
            fun coveringDate(coveringDate: OffsetDateTime) = apply {
                this.coveringDate = coveringDate
            }

            /** Include archived contracts in the response */
            fun includeArchived(includeArchived: Boolean) = apply {
                this.includeArchived = includeArchived
            }

            /**
             * Include commit ledgers in the response. Setting this flag may cause the query to be
             * slower.
             */
            fun includeLedgers(includeLedgers: Boolean) = apply {
                this.includeLedgers = includeLedgers
            }

            /**
             * Optional RFC 3339 timestamp. If provided, the response will include only contracts
             * where effective_at is on or after the provided date. This cannot be provided if the
             * covering_date filter is provided.
             */
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

            fun build(): ContractListBody =
                ContractListBody(
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    coveringDate,
                    includeArchived,
                    includeLedgers,
                    startingAt,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractListBody && customerId == other.customerId && coveringDate == other.coveringDate && includeArchived == other.includeArchived && includeLedgers == other.includeLedgers && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, coveringDate, includeArchived, includeLedgers, startingAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractListBody{customerId=$customerId, coveringDate=$coveringDate, includeArchived=$includeArchived, includeLedgers=$includeLedgers, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var coveringDate: OffsetDateTime? = null
        private var includeArchived: Boolean? = null
        private var includeLedgers: Boolean? = null
        private var startingAt: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractListParams: ContractListParams) = apply {
            customerId = contractListParams.customerId
            coveringDate = contractListParams.coveringDate
            includeArchived = contractListParams.includeArchived
            includeLedgers = contractListParams.includeLedgers
            startingAt = contractListParams.startingAt
            additionalHeaders = contractListParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractListParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = contractListParams.additionalBodyProperties.toMutableMap()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * Optional RFC 3339 timestamp. If provided, the response will include only contracts
         * effective on the provided date. This cannot be provided if the starting_at filter is
         * provided.
         */
        fun coveringDate(coveringDate: OffsetDateTime) = apply { this.coveringDate = coveringDate }

        /** Include archived contracts in the response */
        fun includeArchived(includeArchived: Boolean) = apply {
            this.includeArchived = includeArchived
        }

        /**
         * Include commit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        fun includeLedgers(includeLedgers: Boolean) = apply { this.includeLedgers = includeLedgers }

        /**
         * Optional RFC 3339 timestamp. If provided, the response will include only contracts where
         * effective_at is on or after the provided date. This cannot be provided if the
         * covering_date filter is provided.
         */
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

        fun build(): ContractListParams =
            ContractListParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                coveringDate,
                includeArchived,
                includeLedgers,
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

        return /* spotless:off */ other is ContractListParams && customerId == other.customerId && coveringDate == other.coveringDate && includeArchived == other.includeArchived && includeLedgers == other.includeLedgers && startingAt == other.startingAt && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, coveringDate, includeArchived, includeLedgers, startingAt, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ContractListParams{customerId=$customerId, coveringDate=$coveringDate, includeArchived=$includeArchived, includeLedgers=$includeLedgers, startingAt=$startingAt, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
