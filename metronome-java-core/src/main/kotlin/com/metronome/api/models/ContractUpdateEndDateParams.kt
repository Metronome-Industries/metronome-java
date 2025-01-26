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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Update the end date of a contract */
class ContractUpdateEndDateParams
private constructor(
    private val body: ContractUpdateEndDateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** ID of the contract to update */
    fun contractId(): String = body.contractId()

    /** ID of the customer whose contract is to be updated */
    fun customerId(): String = body.customerId()

    /**
     * If true, allows setting the contract end date earlier than the end_timestamp of existing
     * finalized invoices. Finalized invoices will be unchanged; if you want to incorporate the new
     * end date, you can void and regenerate finalized usage invoices. Defaults to true.
     */
    fun allowEndingBeforeFinalizedInvoice(): Optional<Boolean> =
        body.allowEndingBeforeFinalizedInvoice()

    /**
     * RFC 3339 timestamp indicating when the contract will end (exclusive). If not provided, the
     * contract will be updated to be open-ended.
     */
    fun endingBefore(): Optional<OffsetDateTime> = body.endingBefore()

    /** ID of the contract to update */
    fun _contractId(): JsonField<String> = body._contractId()

    /** ID of the customer whose contract is to be updated */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * If true, allows setting the contract end date earlier than the end_timestamp of existing
     * finalized invoices. Finalized invoices will be unchanged; if you want to incorporate the new
     * end date, you can void and regenerate finalized usage invoices. Defaults to true.
     */
    fun _allowEndingBeforeFinalizedInvoice(): JsonField<Boolean> =
        body._allowEndingBeforeFinalizedInvoice()

    /**
     * RFC 3339 timestamp indicating when the contract will end (exclusive). If not provided, the
     * contract will be updated to be open-ended.
     */
    fun _endingBefore(): JsonField<OffsetDateTime> = body._endingBefore()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ContractUpdateEndDateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractUpdateEndDateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("contract_id")
        @ExcludeMissing
        private val contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allow_ending_before_finalized_invoice")
        @ExcludeMissing
        private val allowEndingBeforeFinalizedInvoice: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the contract to update */
        fun contractId(): String = contractId.getRequired("contract_id")

        /** ID of the customer whose contract is to be updated */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * If true, allows setting the contract end date earlier than the end_timestamp of existing
         * finalized invoices. Finalized invoices will be unchanged; if you want to incorporate the
         * new end date, you can void and regenerate finalized usage invoices. Defaults to true.
         */
        fun allowEndingBeforeFinalizedInvoice(): Optional<Boolean> =
            Optional.ofNullable(
                allowEndingBeforeFinalizedInvoice.getNullable(
                    "allow_ending_before_finalized_invoice"
                )
            )

        /**
         * RFC 3339 timestamp indicating when the contract will end (exclusive). If not provided,
         * the contract will be updated to be open-ended.
         */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        /** ID of the contract to update */
        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /** ID of the customer whose contract is to be updated */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * If true, allows setting the contract end date earlier than the end_timestamp of existing
         * finalized invoices. Finalized invoices will be unchanged; if you want to incorporate the
         * new end date, you can void and regenerate finalized usage invoices. Defaults to true.
         */
        @JsonProperty("allow_ending_before_finalized_invoice")
        @ExcludeMissing
        fun _allowEndingBeforeFinalizedInvoice(): JsonField<Boolean> =
            allowEndingBeforeFinalizedInvoice

        /**
         * RFC 3339 timestamp indicating when the contract will end (exclusive). If not provided,
         * the contract will be updated to be open-ended.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractUpdateEndDateBody = apply {
            if (validated) {
                return@apply
            }

            contractId()
            customerId()
            allowEndingBeforeFinalizedInvoice()
            endingBefore()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var contractId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var allowEndingBeforeFinalizedInvoice: JsonField<Boolean> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractUpdateEndDateBody: ContractUpdateEndDateBody) = apply {
                contractId = contractUpdateEndDateBody.contractId
                customerId = contractUpdateEndDateBody.customerId
                allowEndingBeforeFinalizedInvoice =
                    contractUpdateEndDateBody.allowEndingBeforeFinalizedInvoice
                endingBefore = contractUpdateEndDateBody.endingBefore
                additionalProperties = contractUpdateEndDateBody.additionalProperties.toMutableMap()
            }

            /** ID of the contract to update */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /** ID of the contract to update */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            /** ID of the customer whose contract is to be updated */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /** ID of the customer whose contract is to be updated */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * If true, allows setting the contract end date earlier than the end_timestamp of
             * existing finalized invoices. Finalized invoices will be unchanged; if you want to
             * incorporate the new end date, you can void and regenerate finalized usage invoices.
             * Defaults to true.
             */
            fun allowEndingBeforeFinalizedInvoice(allowEndingBeforeFinalizedInvoice: Boolean) =
                allowEndingBeforeFinalizedInvoice(JsonField.of(allowEndingBeforeFinalizedInvoice))

            /**
             * If true, allows setting the contract end date earlier than the end_timestamp of
             * existing finalized invoices. Finalized invoices will be unchanged; if you want to
             * incorporate the new end date, you can void and regenerate finalized usage invoices.
             * Defaults to true.
             */
            fun allowEndingBeforeFinalizedInvoice(
                allowEndingBeforeFinalizedInvoice: JsonField<Boolean>
            ) = apply { this.allowEndingBeforeFinalizedInvoice = allowEndingBeforeFinalizedInvoice }

            /**
             * RFC 3339 timestamp indicating when the contract will end (exclusive). If not
             * provided, the contract will be updated to be open-ended.
             */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /**
             * RFC 3339 timestamp indicating when the contract will end (exclusive). If not
             * provided, the contract will be updated to be open-ended.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
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

            fun build(): ContractUpdateEndDateBody =
                ContractUpdateEndDateBody(
                    checkRequired("contractId", contractId),
                    checkRequired("customerId", customerId),
                    allowEndingBeforeFinalizedInvoice,
                    endingBefore,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractUpdateEndDateBody && contractId == other.contractId && customerId == other.customerId && allowEndingBeforeFinalizedInvoice == other.allowEndingBeforeFinalizedInvoice && endingBefore == other.endingBefore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contractId, customerId, allowEndingBeforeFinalizedInvoice, endingBefore, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractUpdateEndDateBody{contractId=$contractId, customerId=$customerId, allowEndingBeforeFinalizedInvoice=$allowEndingBeforeFinalizedInvoice, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var body: ContractUpdateEndDateBody.Builder = ContractUpdateEndDateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractUpdateEndDateParams: ContractUpdateEndDateParams) = apply {
            body = contractUpdateEndDateParams.body.toBuilder()
            additionalHeaders = contractUpdateEndDateParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractUpdateEndDateParams.additionalQueryParams.toBuilder()
        }

        /** ID of the contract to update */
        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /** ID of the contract to update */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        /** ID of the customer whose contract is to be updated */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** ID of the customer whose contract is to be updated */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * If true, allows setting the contract end date earlier than the end_timestamp of existing
         * finalized invoices. Finalized invoices will be unchanged; if you want to incorporate the
         * new end date, you can void and regenerate finalized usage invoices. Defaults to true.
         */
        fun allowEndingBeforeFinalizedInvoice(allowEndingBeforeFinalizedInvoice: Boolean) = apply {
            body.allowEndingBeforeFinalizedInvoice(allowEndingBeforeFinalizedInvoice)
        }

        /**
         * If true, allows setting the contract end date earlier than the end_timestamp of existing
         * finalized invoices. Finalized invoices will be unchanged; if you want to incorporate the
         * new end date, you can void and regenerate finalized usage invoices. Defaults to true.
         */
        fun allowEndingBeforeFinalizedInvoice(
            allowEndingBeforeFinalizedInvoice: JsonField<Boolean>
        ) = apply { body.allowEndingBeforeFinalizedInvoice(allowEndingBeforeFinalizedInvoice) }

        /**
         * RFC 3339 timestamp indicating when the contract will end (exclusive). If not provided,
         * the contract will be updated to be open-ended.
         */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { body.endingBefore(endingBefore) }

        /**
         * RFC 3339 timestamp indicating when the contract will end (exclusive). If not provided,
         * the contract will be updated to be open-ended.
         */
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            body.endingBefore(endingBefore)
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

        fun build(): ContractUpdateEndDateParams =
            ContractUpdateEndDateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractUpdateEndDateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractUpdateEndDateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
