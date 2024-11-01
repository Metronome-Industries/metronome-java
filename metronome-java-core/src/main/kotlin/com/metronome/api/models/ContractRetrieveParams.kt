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
import java.util.Optional

class ContractRetrieveParams
constructor(
    private val contractId: String,
    private val customerId: String,
    private val includeLedgers: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun contractId(): String = contractId

    fun customerId(): String = customerId

    fun includeLedgers(): Optional<Boolean> = Optional.ofNullable(includeLedgers)

    @JvmSynthetic
    internal fun getBody(): ContractRetrieveBody {
        return ContractRetrieveBody(
            contractId,
            customerId,
            includeLedgers,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ContractRetrieveBody.Builder::class)
    @NoAutoDetect
    class ContractRetrieveBody
    internal constructor(
        private val contractId: String?,
        private val customerId: String?,
        private val includeLedgers: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("contract_id") fun contractId(): String? = contractId

        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /**
         * Include commit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        @JsonProperty("include_ledgers") fun includeLedgers(): Boolean? = includeLedgers

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
            private var includeLedgers: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractRetrieveBody: ContractRetrieveBody) = apply {
                this.contractId = contractRetrieveBody.contractId
                this.customerId = contractRetrieveBody.customerId
                this.includeLedgers = contractRetrieveBody.includeLedgers
                additionalProperties(contractRetrieveBody.additionalProperties)
            }

            @JsonProperty("contract_id")
            fun contractId(contractId: String) = apply { this.contractId = contractId }

            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * Include commit ledgers in the response. Setting this flag may cause the query to be
             * slower.
             */
            @JsonProperty("include_ledgers")
            fun includeLedgers(includeLedgers: Boolean) = apply {
                this.includeLedgers = includeLedgers
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

            fun build(): ContractRetrieveBody =
                ContractRetrieveBody(
                    checkNotNull(contractId) { "`contractId` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    includeLedgers,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRetrieveBody && this.contractId == other.contractId && this.customerId == other.customerId && this.includeLedgers == other.includeLedgers && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(contractId, customerId, includeLedgers, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractRetrieveBody{contractId=$contractId, customerId=$customerId, includeLedgers=$includeLedgers, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRetrieveParams && this.contractId == other.contractId && this.customerId == other.customerId && this.includeLedgers == other.includeLedgers && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(contractId, customerId, includeLedgers, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractRetrieveParams{contractId=$contractId, customerId=$customerId, includeLedgers=$includeLedgers, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var contractId: String? = null
        private var customerId: String? = null
        private var includeLedgers: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractRetrieveParams: ContractRetrieveParams) = apply {
            this.contractId = contractRetrieveParams.contractId
            this.customerId = contractRetrieveParams.customerId
            this.includeLedgers = contractRetrieveParams.includeLedgers
            additionalQueryParams(contractRetrieveParams.additionalQueryParams)
            additionalHeaders(contractRetrieveParams.additionalHeaders)
            additionalBodyProperties(contractRetrieveParams.additionalBodyProperties)
        }

        fun contractId(contractId: String) = apply { this.contractId = contractId }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * Include commit ledgers in the response. Setting this flag may cause the query to be
         * slower.
         */
        fun includeLedgers(includeLedgers: Boolean) = apply { this.includeLedgers = includeLedgers }

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

        fun build(): ContractRetrieveParams =
            ContractRetrieveParams(
                checkNotNull(contractId) { "`contractId` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                includeLedgers,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
