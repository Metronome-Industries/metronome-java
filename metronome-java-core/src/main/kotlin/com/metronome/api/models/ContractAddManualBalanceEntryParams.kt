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

class ContractAddManualBalanceEntryParams
constructor(
    private val id: String,
    private val amount: Double,
    private val customerId: String,
    private val reason: String,
    private val segmentId: String,
    private val contractId: String?,
    private val timestamp: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun amount(): Double = amount

    fun customerId(): String = customerId

    fun reason(): String = reason

    fun segmentId(): String = segmentId

    fun contractId(): Optional<String> = Optional.ofNullable(contractId)

    fun timestamp(): Optional<OffsetDateTime> = Optional.ofNullable(timestamp)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): ContractAddManualBalanceEntryBody {
        return ContractAddManualBalanceEntryBody(
            id,
            amount,
            customerId,
            reason,
            segmentId,
            contractId,
            timestamp,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractAddManualBalanceEntryBody
    @JsonCreator
    internal constructor(
        @JsonProperty("id") private val id: String,
        @JsonProperty("amount") private val amount: Double,
        @JsonProperty("customer_id") private val customerId: String,
        @JsonProperty("reason") private val reason: String,
        @JsonProperty("segment_id") private val segmentId: String,
        @JsonProperty("contract_id") private val contractId: String?,
        @JsonProperty("timestamp") private val timestamp: OffsetDateTime?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the balance (commit or credit) to update. */
        @JsonProperty("id") fun id(): String = id

        /** Amount to add to the segment. A negative number will draw down from the balance. */
        @JsonProperty("amount") fun amount(): Double = amount

        /** ID of the customer whose balance is to be updated. */
        @JsonProperty("customer_id") fun customerId(): String = customerId

        /** Reason for the manual adjustment. This will be displayed in the ledger. */
        @JsonProperty("reason") fun reason(): String = reason

        /** ID of the segment to update. */
        @JsonProperty("segment_id") fun segmentId(): String = segmentId

        /** ID of the contract to update. Leave blank to update a customer level balance. */
        @JsonProperty("contract_id")
        fun contractId(): Optional<String> = Optional.ofNullable(contractId)

        /**
         * RFC 3339 timestamp indicating when the manual adjustment takes place. If not provided, it
         * will default to the start of the segment.
         */
        @JsonProperty("timestamp")
        fun timestamp(): Optional<OffsetDateTime> = Optional.ofNullable(timestamp)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var amount: Double? = null
            private var customerId: String? = null
            private var reason: String? = null
            private var segmentId: String? = null
            private var contractId: String? = null
            private var timestamp: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                contractAddManualBalanceEntryBody: ContractAddManualBalanceEntryBody
            ) = apply {
                id = contractAddManualBalanceEntryBody.id
                amount = contractAddManualBalanceEntryBody.amount
                customerId = contractAddManualBalanceEntryBody.customerId
                reason = contractAddManualBalanceEntryBody.reason
                segmentId = contractAddManualBalanceEntryBody.segmentId
                contractId = contractAddManualBalanceEntryBody.contractId
                timestamp = contractAddManualBalanceEntryBody.timestamp
                additionalProperties =
                    contractAddManualBalanceEntryBody.additionalProperties.toMutableMap()
            }

            /** ID of the balance (commit or credit) to update. */
            fun id(id: String) = apply { this.id = id }

            /** Amount to add to the segment. A negative number will draw down from the balance. */
            fun amount(amount: Double) = apply { this.amount = amount }

            /** ID of the customer whose balance is to be updated. */
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** Reason for the manual adjustment. This will be displayed in the ledger. */
            fun reason(reason: String) = apply { this.reason = reason }

            /** ID of the segment to update. */
            fun segmentId(segmentId: String) = apply { this.segmentId = segmentId }

            /** ID of the contract to update. Leave blank to update a customer level balance. */
            fun contractId(contractId: String) = apply { this.contractId = contractId }

            /**
             * RFC 3339 timestamp indicating when the manual adjustment takes place. If not
             * provided, it will default to the start of the segment.
             */
            fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

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

            fun build(): ContractAddManualBalanceEntryBody =
                ContractAddManualBalanceEntryBody(
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(reason) { "`reason` is required but was not set" },
                    checkNotNull(segmentId) { "`segmentId` is required but was not set" },
                    contractId,
                    timestamp,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractAddManualBalanceEntryBody && id == other.id && amount == other.amount && customerId == other.customerId && reason == other.reason && segmentId == other.segmentId && contractId == other.contractId && timestamp == other.timestamp && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, customerId, reason, segmentId, contractId, timestamp, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractAddManualBalanceEntryBody{id=$id, amount=$amount, customerId=$customerId, reason=$reason, segmentId=$segmentId, contractId=$contractId, timestamp=$timestamp, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var amount: Double? = null
        private var customerId: String? = null
        private var reason: String? = null
        private var segmentId: String? = null
        private var contractId: String? = null
        private var timestamp: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractAddManualBalanceEntryParams: ContractAddManualBalanceEntryParams
        ) = apply {
            id = contractAddManualBalanceEntryParams.id
            amount = contractAddManualBalanceEntryParams.amount
            customerId = contractAddManualBalanceEntryParams.customerId
            reason = contractAddManualBalanceEntryParams.reason
            segmentId = contractAddManualBalanceEntryParams.segmentId
            contractId = contractAddManualBalanceEntryParams.contractId
            timestamp = contractAddManualBalanceEntryParams.timestamp
            additionalHeaders = contractAddManualBalanceEntryParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                contractAddManualBalanceEntryParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                contractAddManualBalanceEntryParams.additionalBodyProperties.toMutableMap()
        }

        /** ID of the balance (commit or credit) to update. */
        fun id(id: String) = apply { this.id = id }

        /** Amount to add to the segment. A negative number will draw down from the balance. */
        fun amount(amount: Double) = apply { this.amount = amount }

        /** ID of the customer whose balance is to be updated. */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** Reason for the manual adjustment. This will be displayed in the ledger. */
        fun reason(reason: String) = apply { this.reason = reason }

        /** ID of the segment to update. */
        fun segmentId(segmentId: String) = apply { this.segmentId = segmentId }

        /** ID of the contract to update. Leave blank to update a customer level balance. */
        fun contractId(contractId: String) = apply { this.contractId = contractId }

        /**
         * RFC 3339 timestamp indicating when the manual adjustment takes place. If not provided, it
         * will default to the start of the segment.
         */
        fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

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

        fun build(): ContractAddManualBalanceEntryParams =
            ContractAddManualBalanceEntryParams(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(reason) { "`reason` is required but was not set" },
                checkNotNull(segmentId) { "`segmentId` is required but was not set" },
                contractId,
                timestamp,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractAddManualBalanceEntryParams && id == other.id && amount == other.amount && customerId == other.customerId && reason == other.reason && segmentId == other.segmentId && contractId == other.contractId && timestamp == other.timestamp && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, amount, customerId, reason, segmentId, contractId, timestamp, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ContractAddManualBalanceEntryParams{id=$id, amount=$amount, customerId=$customerId, reason=$reason, segmentId=$segmentId, contractId=$contractId, timestamp=$timestamp, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
