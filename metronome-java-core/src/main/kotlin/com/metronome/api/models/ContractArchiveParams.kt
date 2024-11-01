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
import java.util.Objects

class ContractArchiveParams
constructor(
    private val contractId: String,
    private val customerId: String,
    private val voidInvoices: Boolean,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun contractId(): String = contractId

    fun customerId(): String = customerId

    fun voidInvoices(): Boolean = voidInvoices

    @JvmSynthetic
    internal fun getBody(): ContractArchiveBody {
        return ContractArchiveBody(
            contractId,
            customerId,
            voidInvoices,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ContractArchiveBody.Builder::class)
    @NoAutoDetect
    class ContractArchiveBody
    internal constructor(
        private val contractId: String?,
        private val customerId: String?,
        private val voidInvoices: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** ID of the contract to archive */
        @JsonProperty("contract_id") fun contractId(): String? = contractId

        /** ID of the customer whose contract is to be archived */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** If false, the existing finalized invoices will remain after the contract is archived. */
        @JsonProperty("void_invoices") fun voidInvoices(): Boolean? = voidInvoices

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
            private var voidInvoices: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractArchiveBody: ContractArchiveBody) = apply {
                this.contractId = contractArchiveBody.contractId
                this.customerId = contractArchiveBody.customerId
                this.voidInvoices = contractArchiveBody.voidInvoices
                additionalProperties(contractArchiveBody.additionalProperties)
            }

            /** ID of the contract to archive */
            @JsonProperty("contract_id")
            fun contractId(contractId: String) = apply { this.contractId = contractId }

            /** ID of the customer whose contract is to be archived */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * If false, the existing finalized invoices will remain after the contract is archived.
             */
            @JsonProperty("void_invoices")
            fun voidInvoices(voidInvoices: Boolean) = apply { this.voidInvoices = voidInvoices }

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

            fun build(): ContractArchiveBody =
                ContractArchiveBody(
                    checkNotNull(contractId) { "`contractId` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(voidInvoices) { "`voidInvoices` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractArchiveBody && this.contractId == other.contractId && this.customerId == other.customerId && this.voidInvoices == other.voidInvoices && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(contractId, customerId, voidInvoices, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractArchiveBody{contractId=$contractId, customerId=$customerId, voidInvoices=$voidInvoices, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractArchiveParams && this.contractId == other.contractId && this.customerId == other.customerId && this.voidInvoices == other.voidInvoices && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(contractId, customerId, voidInvoices, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractArchiveParams{contractId=$contractId, customerId=$customerId, voidInvoices=$voidInvoices, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var contractId: String? = null
        private var customerId: String? = null
        private var voidInvoices: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractArchiveParams: ContractArchiveParams) = apply {
            this.contractId = contractArchiveParams.contractId
            this.customerId = contractArchiveParams.customerId
            this.voidInvoices = contractArchiveParams.voidInvoices
            additionalQueryParams(contractArchiveParams.additionalQueryParams)
            additionalHeaders(contractArchiveParams.additionalHeaders)
            additionalBodyProperties(contractArchiveParams.additionalBodyProperties)
        }

        /** ID of the contract to archive */
        fun contractId(contractId: String) = apply { this.contractId = contractId }

        /** ID of the customer whose contract is to be archived */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** If false, the existing finalized invoices will remain after the contract is archived. */
        fun voidInvoices(voidInvoices: Boolean) = apply { this.voidInvoices = voidInvoices }

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

        fun build(): ContractArchiveParams =
            ContractArchiveParams(
                checkNotNull(contractId) { "`contractId` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(voidInvoices) { "`voidInvoices` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
