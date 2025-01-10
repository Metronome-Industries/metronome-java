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

/** List all contracts for a customer */
class ContractListParams
constructor(
    private val body: ContractListBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = body.customerId()

    /**
     * Optional RFC 3339 timestamp. If provided, the response will include only contracts effective
     * on the provided date. This cannot be provided if the starting_at filter is provided.
     */
    fun coveringDate(): Optional<OffsetDateTime> = body.coveringDate()

    /** Include archived contracts in the response */
    fun includeArchived(): Optional<Boolean> = body.includeArchived()

    /**
     * Include the balance of credits and commits in the response. Setting this flag may cause the
     * query to be slower.
     */
    fun includeBalance(): Optional<Boolean> = body.includeBalance()

    /**
     * Include commit ledgers in the response. Setting this flag may cause the query to be slower.
     */
    fun includeLedgers(): Optional<Boolean> = body.includeLedgers()

    /**
     * Optional RFC 3339 timestamp. If provided, the response will include only contracts where
     * effective_at is on or after the provided date. This cannot be provided if the covering_date
     * filter is provided.
     */
    fun startingAt(): Optional<OffsetDateTime> = body.startingAt()

    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Optional RFC 3339 timestamp. If provided, the response will include only contracts effective
     * on the provided date. This cannot be provided if the starting_at filter is provided.
     */
    fun _coveringDate(): JsonField<OffsetDateTime> = body._coveringDate()

    /** Include archived contracts in the response */
    fun _includeArchived(): JsonField<Boolean> = body._includeArchived()

    /**
     * Include the balance of credits and commits in the response. Setting this flag may cause the
     * query to be slower.
     */
    fun _includeBalance(): JsonField<Boolean> = body._includeBalance()

    /**
     * Include commit ledgers in the response. Setting this flag may cause the query to be slower.
     */
    fun _includeLedgers(): JsonField<Boolean> = body._includeLedgers()

    /**
     * Optional RFC 3339 timestamp. If provided, the response will include only contracts where
     * effective_at is on or after the provided date. This cannot be provided if the covering_date
     * filter is provided.
     */
    fun _startingAt(): JsonField<OffsetDateTime> = body._startingAt()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ContractListBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractListBody
    @JsonCreator
    internal constructor(
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("covering_date")
        @ExcludeMissing
        private val coveringDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("include_archived")
        @ExcludeMissing
        private val includeArchived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("include_balance")
        @ExcludeMissing
        private val includeBalance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("include_ledgers")
        @ExcludeMissing
        private val includeLedgers: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * Optional RFC 3339 timestamp. If provided, the response will include only contracts
         * effective on the provided date. This cannot be provided if the starting_at filter is
         * provided.
         */
        fun coveringDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(coveringDate.getNullable("covering_date"))

        /** Include archived contracts in the response */
        fun includeArchived(): Optional<Boolean> =
            Optional.ofNullable(includeArchived.getNullable("include_archived"))

        /**
         * Include the balance of credits and commits in the response. Setting this flag may cause
         * the query to be slower.
         */
        fun includeBalance(): Optional<Boolean> =
            Optional.ofNullable(includeBalance.getNullable("include_balance"))

        /**
         * Include commit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        fun includeLedgers(): Optional<Boolean> =
            Optional.ofNullable(includeLedgers.getNullable("include_ledgers"))

        /**
         * Optional RFC 3339 timestamp. If provided, the response will include only contracts where
         * effective_at is on or after the provided date. This cannot be provided if the
         * covering_date filter is provided.
         */
        fun startingAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(startingAt.getNullable("starting_at"))

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Optional RFC 3339 timestamp. If provided, the response will include only contracts
         * effective on the provided date. This cannot be provided if the starting_at filter is
         * provided.
         */
        @JsonProperty("covering_date")
        @ExcludeMissing
        fun _coveringDate(): JsonField<OffsetDateTime> = coveringDate

        /** Include archived contracts in the response */
        @JsonProperty("include_archived")
        @ExcludeMissing
        fun _includeArchived(): JsonField<Boolean> = includeArchived

        /**
         * Include the balance of credits and commits in the response. Setting this flag may cause
         * the query to be slower.
         */
        @JsonProperty("include_balance")
        @ExcludeMissing
        fun _includeBalance(): JsonField<Boolean> = includeBalance

        /**
         * Include commit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        @JsonProperty("include_ledgers")
        @ExcludeMissing
        fun _includeLedgers(): JsonField<Boolean> = includeLedgers

        /**
         * Optional RFC 3339 timestamp. If provided, the response will include only contracts where
         * effective_at is on or after the provided date. This cannot be provided if the
         * covering_date filter is provided.
         */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractListBody = apply {
            if (validated) {
                return@apply
            }

            customerId()
            coveringDate()
            includeArchived()
            includeBalance()
            includeLedgers()
            startingAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customerId: JsonField<String>? = null
            private var coveringDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var includeArchived: JsonField<Boolean> = JsonMissing.of()
            private var includeBalance: JsonField<Boolean> = JsonMissing.of()
            private var includeLedgers: JsonField<Boolean> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractListBody: ContractListBody) = apply {
                customerId = contractListBody.customerId
                coveringDate = contractListBody.coveringDate
                includeArchived = contractListBody.includeArchived
                includeBalance = contractListBody.includeBalance
                includeLedgers = contractListBody.includeLedgers
                startingAt = contractListBody.startingAt
                additionalProperties = contractListBody.additionalProperties.toMutableMap()
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * Optional RFC 3339 timestamp. If provided, the response will include only contracts
             * effective on the provided date. This cannot be provided if the starting_at filter is
             * provided.
             */
            fun coveringDate(coveringDate: OffsetDateTime) =
                coveringDate(JsonField.of(coveringDate))

            /**
             * Optional RFC 3339 timestamp. If provided, the response will include only contracts
             * effective on the provided date. This cannot be provided if the starting_at filter is
             * provided.
             */
            fun coveringDate(coveringDate: JsonField<OffsetDateTime>) = apply {
                this.coveringDate = coveringDate
            }

            /** Include archived contracts in the response */
            fun includeArchived(includeArchived: Boolean) =
                includeArchived(JsonField.of(includeArchived))

            /** Include archived contracts in the response */
            fun includeArchived(includeArchived: JsonField<Boolean>) = apply {
                this.includeArchived = includeArchived
            }

            /**
             * Include the balance of credits and commits in the response. Setting this flag may
             * cause the query to be slower.
             */
            fun includeBalance(includeBalance: Boolean) =
                includeBalance(JsonField.of(includeBalance))

            /**
             * Include the balance of credits and commits in the response. Setting this flag may
             * cause the query to be slower.
             */
            fun includeBalance(includeBalance: JsonField<Boolean>) = apply {
                this.includeBalance = includeBalance
            }

            /**
             * Include commit ledgers in the response. Setting this flag may cause the query to be
             * slower.
             */
            fun includeLedgers(includeLedgers: Boolean) =
                includeLedgers(JsonField.of(includeLedgers))

            /**
             * Include commit ledgers in the response. Setting this flag may cause the query to be
             * slower.
             */
            fun includeLedgers(includeLedgers: JsonField<Boolean>) = apply {
                this.includeLedgers = includeLedgers
            }

            /**
             * Optional RFC 3339 timestamp. If provided, the response will include only contracts
             * where effective_at is on or after the provided date. This cannot be provided if the
             * covering_date filter is provided.
             */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /**
             * Optional RFC 3339 timestamp. If provided, the response will include only contracts
             * where effective_at is on or after the provided date. This cannot be provided if the
             * covering_date filter is provided.
             */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
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

            fun build(): ContractListBody =
                ContractListBody(
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    coveringDate,
                    includeArchived,
                    includeBalance,
                    includeLedgers,
                    startingAt,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractListBody && customerId == other.customerId && coveringDate == other.coveringDate && includeArchived == other.includeArchived && includeBalance == other.includeBalance && includeLedgers == other.includeLedgers && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, coveringDate, includeArchived, includeBalance, includeLedgers, startingAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractListBody{customerId=$customerId, coveringDate=$coveringDate, includeArchived=$includeArchived, includeBalance=$includeBalance, includeLedgers=$includeLedgers, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ContractListBody.Builder = ContractListBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractListParams: ContractListParams) = apply {
            body = contractListParams.body.toBuilder()
            additionalHeaders = contractListParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractListParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * Optional RFC 3339 timestamp. If provided, the response will include only contracts
         * effective on the provided date. This cannot be provided if the starting_at filter is
         * provided.
         */
        fun coveringDate(coveringDate: OffsetDateTime) = apply { body.coveringDate(coveringDate) }

        /**
         * Optional RFC 3339 timestamp. If provided, the response will include only contracts
         * effective on the provided date. This cannot be provided if the starting_at filter is
         * provided.
         */
        fun coveringDate(coveringDate: JsonField<OffsetDateTime>) = apply {
            body.coveringDate(coveringDate)
        }

        /** Include archived contracts in the response */
        fun includeArchived(includeArchived: Boolean) = apply {
            body.includeArchived(includeArchived)
        }

        /** Include archived contracts in the response */
        fun includeArchived(includeArchived: JsonField<Boolean>) = apply {
            body.includeArchived(includeArchived)
        }

        /**
         * Include the balance of credits and commits in the response. Setting this flag may cause
         * the query to be slower.
         */
        fun includeBalance(includeBalance: Boolean) = apply { body.includeBalance(includeBalance) }

        /**
         * Include the balance of credits and commits in the response. Setting this flag may cause
         * the query to be slower.
         */
        fun includeBalance(includeBalance: JsonField<Boolean>) = apply {
            body.includeBalance(includeBalance)
        }

        /**
         * Include commit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        fun includeLedgers(includeLedgers: Boolean) = apply { body.includeLedgers(includeLedgers) }

        /**
         * Include commit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        fun includeLedgers(includeLedgers: JsonField<Boolean>) = apply {
            body.includeLedgers(includeLedgers)
        }

        /**
         * Optional RFC 3339 timestamp. If provided, the response will include only contracts where
         * effective_at is on or after the provided date. This cannot be provided if the
         * covering_date filter is provided.
         */
        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

        /**
         * Optional RFC 3339 timestamp. If provided, the response will include only contracts where
         * effective_at is on or after the provided date. This cannot be provided if the
         * covering_date filter is provided.
         */
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            body.startingAt(startingAt)
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

        fun build(): ContractListParams =
            ContractListParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractListParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractListParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
