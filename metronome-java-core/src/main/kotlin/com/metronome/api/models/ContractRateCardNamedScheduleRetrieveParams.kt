// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ContractRateCardNamedScheduleRetrieveParams
constructor(
    private val contractId: String,
    private val customerId: String,
    private val scheduleName: String,
    private val coveringDate: OffsetDateTime?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun contractId(): String = contractId

    fun customerId(): String = customerId

    fun scheduleName(): String = scheduleName

    fun coveringDate(): Optional<OffsetDateTime> = Optional.ofNullable(coveringDate)

    @JvmSynthetic
    internal fun getBody(): ContractRateCardNamedScheduleRetrieveBody {
        return ContractRateCardNamedScheduleRetrieveBody(
            contractId,
            customerId,
            scheduleName,
            coveringDate,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = ContractRateCardNamedScheduleRetrieveBody.Builder::class)
    @NoAutoDetect
    class ContractRateCardNamedScheduleRetrieveBody
    internal constructor(
        private val contractId: String?,
        private val customerId: String?,
        private val scheduleName: String?,
        private val coveringDate: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** ID of the contract whose named schedule is to be retrieved */
        @JsonProperty("contract_id") fun contractId(): String? = contractId

        /** ID of the customer whose named schedule is to be retrieved */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** The identifier for the schedule to be retrieved */
        @JsonProperty("schedule_name") fun scheduleName(): String? = scheduleName

        /**
         * If provided, at most one schedule segment will be returned (the one that covers this
         * date). If not provided, all segments will be returned.
         */
        @JsonProperty("covering_date") fun coveringDate(): OffsetDateTime? = coveringDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var contractId: String? = null
            private var customerId: String? = null
            private var scheduleName: String? = null
            private var coveringDate: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                contractRateCardNamedScheduleRetrieveBody: ContractRateCardNamedScheduleRetrieveBody
            ) = apply {
                this.contractId = contractRateCardNamedScheduleRetrieveBody.contractId
                this.customerId = contractRateCardNamedScheduleRetrieveBody.customerId
                this.scheduleName = contractRateCardNamedScheduleRetrieveBody.scheduleName
                this.coveringDate = contractRateCardNamedScheduleRetrieveBody.coveringDate
                additionalProperties(contractRateCardNamedScheduleRetrieveBody.additionalProperties)
            }

            /** ID of the contract whose named schedule is to be retrieved */
            @JsonProperty("contract_id")
            fun contractId(contractId: String) = apply { this.contractId = contractId }

            /** ID of the customer whose named schedule is to be retrieved */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** The identifier for the schedule to be retrieved */
            @JsonProperty("schedule_name")
            fun scheduleName(scheduleName: String) = apply { this.scheduleName = scheduleName }

            /**
             * If provided, at most one schedule segment will be returned (the one that covers this
             * date). If not provided, all segments will be returned.
             */
            @JsonProperty("covering_date")
            fun coveringDate(coveringDate: OffsetDateTime) = apply {
                this.coveringDate = coveringDate
            }

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

            fun build(): ContractRateCardNamedScheduleRetrieveBody =
                ContractRateCardNamedScheduleRetrieveBody(
                    checkNotNull(contractId) { "`contractId` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(scheduleName) { "`scheduleName` is required but was not set" },
                    coveringDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRateCardNamedScheduleRetrieveBody && this.contractId == other.contractId && this.customerId == other.customerId && this.scheduleName == other.scheduleName && this.coveringDate == other.coveringDate && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(contractId, customerId, scheduleName, coveringDate, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractRateCardNamedScheduleRetrieveBody{contractId=$contractId, customerId=$customerId, scheduleName=$scheduleName, coveringDate=$coveringDate, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardNamedScheduleRetrieveParams && this.contractId == other.contractId && this.customerId == other.customerId && this.scheduleName == other.scheduleName && this.coveringDate == other.coveringDate && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(contractId, customerId, scheduleName, coveringDate, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractRateCardNamedScheduleRetrieveParams{contractId=$contractId, customerId=$customerId, scheduleName=$scheduleName, coveringDate=$coveringDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var contractId: String? = null
        private var customerId: String? = null
        private var scheduleName: String? = null
        private var coveringDate: OffsetDateTime? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractRateCardNamedScheduleRetrieveParams: ContractRateCardNamedScheduleRetrieveParams
        ) = apply {
            this.contractId = contractRateCardNamedScheduleRetrieveParams.contractId
            this.customerId = contractRateCardNamedScheduleRetrieveParams.customerId
            this.scheduleName = contractRateCardNamedScheduleRetrieveParams.scheduleName
            this.coveringDate = contractRateCardNamedScheduleRetrieveParams.coveringDate
            additionalHeaders(contractRateCardNamedScheduleRetrieveParams.additionalHeaders)
            additionalQueryParams(contractRateCardNamedScheduleRetrieveParams.additionalQueryParams)
            additionalBodyProperties(
                contractRateCardNamedScheduleRetrieveParams.additionalBodyProperties
            )
        }

        /** ID of the contract whose named schedule is to be retrieved */
        fun contractId(contractId: String) = apply { this.contractId = contractId }

        /** ID of the customer whose named schedule is to be retrieved */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** The identifier for the schedule to be retrieved */
        fun scheduleName(scheduleName: String) = apply { this.scheduleName = scheduleName }

        /**
         * If provided, at most one schedule segment will be returned (the one that covers this
         * date). If not provided, all segments will be returned.
         */
        fun coveringDate(coveringDate: OffsetDateTime) = apply { this.coveringDate = coveringDate }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): ContractRateCardNamedScheduleRetrieveParams =
            ContractRateCardNamedScheduleRetrieveParams(
                checkNotNull(contractId) { "`contractId` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(scheduleName) { "`scheduleName` is required but was not set" },
                coveringDate,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
