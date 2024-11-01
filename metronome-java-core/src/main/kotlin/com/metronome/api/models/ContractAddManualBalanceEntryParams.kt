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

class ContractAddManualBalanceEntryParams
constructor(
    private val id: String,
    private val amount: Double,
    private val customerId: String,
    private val reason: String,
    private val segmentId: String,
    private val contractId: String?,
    private val timestamp: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun amount(): Double = amount

    fun customerId(): String = customerId

    fun reason(): String = reason

    fun segmentId(): String = segmentId

    fun contractId(): Optional<String> = Optional.ofNullable(contractId)

    fun timestamp(): Optional<OffsetDateTime> = Optional.ofNullable(timestamp)

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

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ContractAddManualBalanceEntryBody.Builder::class)
    @NoAutoDetect
    class ContractAddManualBalanceEntryBody
    internal constructor(
        private val id: String?,
        private val amount: Double?,
        private val customerId: String?,
        private val reason: String?,
        private val segmentId: String?,
        private val contractId: String?,
        private val timestamp: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** ID of the balance (commit or credit) to update. */
        @JsonProperty("id") fun id(): String? = id

        /** Amount to add to the segment. A negative number will draw down from the balance. */
        @JsonProperty("amount") fun amount(): Double? = amount

        /** ID of the customer whose balance is to be updated. */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** Reason for the manual adjustment. This will be displayed in the ledger. */
        @JsonProperty("reason") fun reason(): String? = reason

        /** ID of the segment to update. */
        @JsonProperty("segment_id") fun segmentId(): String? = segmentId

        /** ID of the contract to update. Leave blank to update a customer level balance. */
        @JsonProperty("contract_id") fun contractId(): String? = contractId

        /**
         * RFC 3339 timestamp indicating when the manual adjustment takes place. If not provided, it
         * will default to the start of the segment.
         */
        @JsonProperty("timestamp") fun timestamp(): OffsetDateTime? = timestamp

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
                this.id = contractAddManualBalanceEntryBody.id
                this.amount = contractAddManualBalanceEntryBody.amount
                this.customerId = contractAddManualBalanceEntryBody.customerId
                this.reason = contractAddManualBalanceEntryBody.reason
                this.segmentId = contractAddManualBalanceEntryBody.segmentId
                this.contractId = contractAddManualBalanceEntryBody.contractId
                this.timestamp = contractAddManualBalanceEntryBody.timestamp
                additionalProperties(contractAddManualBalanceEntryBody.additionalProperties)
            }

            /** ID of the balance (commit or credit) to update. */
            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            /** Amount to add to the segment. A negative number will draw down from the balance. */
            @JsonProperty("amount") fun amount(amount: Double) = apply { this.amount = amount }

            /** ID of the customer whose balance is to be updated. */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** Reason for the manual adjustment. This will be displayed in the ledger. */
            @JsonProperty("reason") fun reason(reason: String) = apply { this.reason = reason }

            /** ID of the segment to update. */
            @JsonProperty("segment_id")
            fun segmentId(segmentId: String) = apply { this.segmentId = segmentId }

            /** ID of the contract to update. Leave blank to update a customer level balance. */
            @JsonProperty("contract_id")
            fun contractId(contractId: String) = apply { this.contractId = contractId }

            /**
             * RFC 3339 timestamp indicating when the manual adjustment takes place. If not
             * provided, it will default to the start of the segment.
             */
            @JsonProperty("timestamp")
            fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

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

            return /* spotless:off */ other is ContractAddManualBalanceEntryBody && this.id == other.id && this.amount == other.amount && this.customerId == other.customerId && this.reason == other.reason && this.segmentId == other.segmentId && this.contractId == other.contractId && this.timestamp == other.timestamp && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(id, amount, customerId, reason, segmentId, contractId, timestamp, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractAddManualBalanceEntryBody{id=$id, amount=$amount, customerId=$customerId, reason=$reason, segmentId=$segmentId, contractId=$contractId, timestamp=$timestamp, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractAddManualBalanceEntryParams && this.id == other.id && this.amount == other.amount && this.customerId == other.customerId && this.reason == other.reason && this.segmentId == other.segmentId && this.contractId == other.contractId && this.timestamp == other.timestamp && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(id, amount, customerId, reason, segmentId, contractId, timestamp, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractAddManualBalanceEntryParams{id=$id, amount=$amount, customerId=$customerId, reason=$reason, segmentId=$segmentId, contractId=$contractId, timestamp=$timestamp, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractAddManualBalanceEntryParams: ContractAddManualBalanceEntryParams
        ) = apply {
            this.id = contractAddManualBalanceEntryParams.id
            this.amount = contractAddManualBalanceEntryParams.amount
            this.customerId = contractAddManualBalanceEntryParams.customerId
            this.reason = contractAddManualBalanceEntryParams.reason
            this.segmentId = contractAddManualBalanceEntryParams.segmentId
            this.contractId = contractAddManualBalanceEntryParams.contractId
            this.timestamp = contractAddManualBalanceEntryParams.timestamp
            additionalQueryParams(contractAddManualBalanceEntryParams.additionalQueryParams)
            additionalHeaders(contractAddManualBalanceEntryParams.additionalHeaders)
            additionalBodyProperties(contractAddManualBalanceEntryParams.additionalBodyProperties)
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

        fun build(): ContractAddManualBalanceEntryParams =
            ContractAddManualBalanceEntryParams(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(reason) { "`reason` is required but was not set" },
                checkNotNull(segmentId) { "`segmentId` is required but was not set" },
                contractId,
                timestamp,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
