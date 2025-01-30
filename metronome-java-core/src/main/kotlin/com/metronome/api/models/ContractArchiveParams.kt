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
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.util.Objects

/** Archive a contract */
class ContractArchiveParams
private constructor(
    private val body: ContractArchiveBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** ID of the contract to archive */
    fun contractId(): String = body.contractId()

    /** ID of the customer whose contract is to be archived */
    fun customerId(): String = body.customerId()

    /** If false, the existing finalized invoices will remain after the contract is archived. */
    fun voidInvoices(): Boolean = body.voidInvoices()

    /** ID of the contract to archive */
    fun _contractId(): JsonField<String> = body._contractId()

    /** ID of the customer whose contract is to be archived */
    fun _customerId(): JsonField<String> = body._customerId()

    /** If false, the existing finalized invoices will remain after the contract is archived. */
    fun _voidInvoices(): JsonField<Boolean> = body._voidInvoices()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): ContractArchiveBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractArchiveBody
    @JsonCreator
    internal constructor(
        @JsonProperty("contract_id")
        @ExcludeMissing
        private val contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("void_invoices")
        @ExcludeMissing
        private val voidInvoices: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the contract to archive */
        fun contractId(): String = contractId.getRequired("contract_id")

        /** ID of the customer whose contract is to be archived */
        fun customerId(): String = customerId.getRequired("customer_id")

        /** If false, the existing finalized invoices will remain after the contract is archived. */
        fun voidInvoices(): Boolean = voidInvoices.getRequired("void_invoices")

        /** ID of the contract to archive */
        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /** ID of the customer whose contract is to be archived */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** If false, the existing finalized invoices will remain after the contract is archived. */
        @JsonProperty("void_invoices")
        @ExcludeMissing
        fun _voidInvoices(): JsonField<Boolean> = voidInvoices

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractArchiveBody = apply {
            if (validated) {
                return@apply
            }

            contractId()
            customerId()
            voidInvoices()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContractArchiveBody]. */
        class Builder internal constructor() {

            private var contractId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var voidInvoices: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractArchiveBody: ContractArchiveBody) = apply {
                contractId = contractArchiveBody.contractId
                customerId = contractArchiveBody.customerId
                voidInvoices = contractArchiveBody.voidInvoices
                additionalProperties = contractArchiveBody.additionalProperties.toMutableMap()
            }

            /** ID of the contract to archive */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /** ID of the contract to archive */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            /** ID of the customer whose contract is to be archived */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /** ID of the customer whose contract is to be archived */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * If false, the existing finalized invoices will remain after the contract is archived.
             */
            fun voidInvoices(voidInvoices: Boolean) = voidInvoices(JsonField.of(voidInvoices))

            /**
             * If false, the existing finalized invoices will remain after the contract is archived.
             */
            fun voidInvoices(voidInvoices: JsonField<Boolean>) = apply {
                this.voidInvoices = voidInvoices
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

            fun build(): ContractArchiveBody =
                ContractArchiveBody(
                    checkRequired("contractId", contractId),
                    checkRequired("customerId", customerId),
                    checkRequired("voidInvoices", voidInvoices),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractArchiveBody && contractId == other.contractId && customerId == other.customerId && voidInvoices == other.voidInvoices && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contractId, customerId, voidInvoices, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractArchiveBody{contractId=$contractId, customerId=$customerId, voidInvoices=$voidInvoices, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractArchiveParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: ContractArchiveBody.Builder = ContractArchiveBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractArchiveParams: ContractArchiveParams) = apply {
            body = contractArchiveParams.body.toBuilder()
            additionalHeaders = contractArchiveParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractArchiveParams.additionalQueryParams.toBuilder()
        }

        /** ID of the contract to archive */
        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /** ID of the contract to archive */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        /** ID of the customer whose contract is to be archived */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** ID of the customer whose contract is to be archived */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** If false, the existing finalized invoices will remain after the contract is archived. */
        fun voidInvoices(voidInvoices: Boolean) = apply { body.voidInvoices(voidInvoices) }

        /** If false, the existing finalized invoices will remain after the contract is archived. */
        fun voidInvoices(voidInvoices: JsonField<Boolean>) = apply {
            body.voidInvoices(voidInvoices)
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

        fun build(): ContractArchiveParams =
            ContractArchiveParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractArchiveParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractArchiveParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
