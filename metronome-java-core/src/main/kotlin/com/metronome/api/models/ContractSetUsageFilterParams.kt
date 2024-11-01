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

class ContractSetUsageFilterParams
constructor(
    private val contractId: String,
    private val customerId: String,
    private val groupKey: String,
    private val groupValues: List<String>,
    private val startingAt: OffsetDateTime,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun contractId(): String = contractId

    fun customerId(): String = customerId

    fun groupKey(): String = groupKey

    fun groupValues(): List<String> = groupValues

    fun startingAt(): OffsetDateTime = startingAt

    @JvmSynthetic
    internal fun getBody(): ContractSetUsageFilterBody {
        return ContractSetUsageFilterBody(
            contractId,
            customerId,
            groupKey,
            groupValues,
            startingAt,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ContractSetUsageFilterBody.Builder::class)
    @NoAutoDetect
    class ContractSetUsageFilterBody
    internal constructor(
        private val contractId: String?,
        private val customerId: String?,
        private val groupKey: String?,
        private val groupValues: List<String>?,
        private val startingAt: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("contract_id") fun contractId(): String? = contractId

        @JsonProperty("customer_id") fun customerId(): String? = customerId

        @JsonProperty("group_key") fun groupKey(): String? = groupKey

        @JsonProperty("group_values") fun groupValues(): List<String>? = groupValues

        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

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
            private var groupKey: String? = null
            private var groupValues: List<String>? = null
            private var startingAt: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractSetUsageFilterBody: ContractSetUsageFilterBody) = apply {
                this.contractId = contractSetUsageFilterBody.contractId
                this.customerId = contractSetUsageFilterBody.customerId
                this.groupKey = contractSetUsageFilterBody.groupKey
                this.groupValues = contractSetUsageFilterBody.groupValues
                this.startingAt = contractSetUsageFilterBody.startingAt
                additionalProperties(contractSetUsageFilterBody.additionalProperties)
            }

            @JsonProperty("contract_id")
            fun contractId(contractId: String) = apply { this.contractId = contractId }

            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            @JsonProperty("group_key")
            fun groupKey(groupKey: String) = apply { this.groupKey = groupKey }

            @JsonProperty("group_values")
            fun groupValues(groupValues: List<String>) = apply { this.groupValues = groupValues }

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

            fun build(): ContractSetUsageFilterBody =
                ContractSetUsageFilterBody(
                    checkNotNull(contractId) { "`contractId` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(groupKey) { "`groupKey` is required but was not set" },
                    checkNotNull(groupValues) { "`groupValues` is required but was not set" }
                        .toImmutable(),
                    checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractSetUsageFilterBody && this.contractId == other.contractId && this.customerId == other.customerId && this.groupKey == other.groupKey && this.groupValues == other.groupValues && this.startingAt == other.startingAt && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(contractId, customerId, groupKey, groupValues, startingAt, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractSetUsageFilterBody{contractId=$contractId, customerId=$customerId, groupKey=$groupKey, groupValues=$groupValues, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractSetUsageFilterParams && this.contractId == other.contractId && this.customerId == other.customerId && this.groupKey == other.groupKey && this.groupValues == other.groupValues && this.startingAt == other.startingAt && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(contractId, customerId, groupKey, groupValues, startingAt, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractSetUsageFilterParams{contractId=$contractId, customerId=$customerId, groupKey=$groupKey, groupValues=$groupValues, startingAt=$startingAt, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var contractId: String? = null
        private var customerId: String? = null
        private var groupKey: String? = null
        private var groupValues: MutableList<String> = mutableListOf()
        private var startingAt: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractSetUsageFilterParams: ContractSetUsageFilterParams) = apply {
            this.contractId = contractSetUsageFilterParams.contractId
            this.customerId = contractSetUsageFilterParams.customerId
            this.groupKey = contractSetUsageFilterParams.groupKey
            this.groupValues(contractSetUsageFilterParams.groupValues)
            this.startingAt = contractSetUsageFilterParams.startingAt
            additionalQueryParams(contractSetUsageFilterParams.additionalQueryParams)
            additionalHeaders(contractSetUsageFilterParams.additionalHeaders)
            additionalBodyProperties(contractSetUsageFilterParams.additionalBodyProperties)
        }

        fun contractId(contractId: String) = apply { this.contractId = contractId }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun groupKey(groupKey: String) = apply { this.groupKey = groupKey }

        fun groupValues(groupValues: List<String>) = apply {
            this.groupValues.clear()
            this.groupValues.addAll(groupValues)
        }

        fun addGroupValue(groupValue: String) = apply { this.groupValues.add(groupValue) }

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

        fun build(): ContractSetUsageFilterParams =
            ContractSetUsageFilterParams(
                checkNotNull(contractId) { "`contractId` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(groupKey) { "`groupKey` is required but was not set" },
                checkNotNull(groupValues) { "`groupValues` is required but was not set" }
                    .toImmutable(),
                checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
