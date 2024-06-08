// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.models.*
import java.util.Objects
import java.util.Optional

class CreditVoidGrantParams
constructor(
    private val id: String,
    private val voidCreditPurchaseInvoice: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun voidCreditPurchaseInvoice(): Optional<Boolean> =
        Optional.ofNullable(voidCreditPurchaseInvoice)

    @JvmSynthetic
    internal fun getBody(): CreditVoidGrantBody {
        return CreditVoidGrantBody(
            id,
            voidCreditPurchaseInvoice,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CreditVoidGrantBody.Builder::class)
    @NoAutoDetect
    class CreditVoidGrantBody
    internal constructor(
        private val id: String?,
        private val voidCreditPurchaseInvoice: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("id") fun id(): String? = id

        /** If true, void the purchase invoice associated with the grant */
        @JsonProperty("void_credit_purchase_invoice")
        fun voidCreditPurchaseInvoice(): Boolean? = voidCreditPurchaseInvoice

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreditVoidGrantBody &&
                this.id == other.id &&
                this.voidCreditPurchaseInvoice == other.voidCreditPurchaseInvoice &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        voidCreditPurchaseInvoice,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CreditVoidGrantBody{id=$id, voidCreditPurchaseInvoice=$voidCreditPurchaseInvoice, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var voidCreditPurchaseInvoice: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditVoidGrantBody: CreditVoidGrantBody) = apply {
                this.id = creditVoidGrantBody.id
                this.voidCreditPurchaseInvoice = creditVoidGrantBody.voidCreditPurchaseInvoice
                additionalProperties(creditVoidGrantBody.additionalProperties)
            }

            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            /** If true, void the purchase invoice associated with the grant */
            @JsonProperty("void_credit_purchase_invoice")
            fun voidCreditPurchaseInvoice(voidCreditPurchaseInvoice: Boolean) = apply {
                this.voidCreditPurchaseInvoice = voidCreditPurchaseInvoice
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

            fun build(): CreditVoidGrantBody =
                CreditVoidGrantBody(
                    checkNotNull(id) { "`id` is required but was not set" },
                    voidCreditPurchaseInvoice,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditVoidGrantParams &&
            this.id == other.id &&
            this.voidCreditPurchaseInvoice == other.voidCreditPurchaseInvoice &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            id,
            voidCreditPurchaseInvoice,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CreditVoidGrantParams{id=$id, voidCreditPurchaseInvoice=$voidCreditPurchaseInvoice, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var voidCreditPurchaseInvoice: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditVoidGrantParams: CreditVoidGrantParams) = apply {
            this.id = creditVoidGrantParams.id
            this.voidCreditPurchaseInvoice = creditVoidGrantParams.voidCreditPurchaseInvoice
            additionalQueryParams(creditVoidGrantParams.additionalQueryParams)
            additionalHeaders(creditVoidGrantParams.additionalHeaders)
            additionalBodyProperties(creditVoidGrantParams.additionalBodyProperties)
        }

        fun id(id: String) = apply { this.id = id }

        /** If true, void the purchase invoice associated with the grant */
        fun voidCreditPurchaseInvoice(voidCreditPurchaseInvoice: Boolean) = apply {
            this.voidCreditPurchaseInvoice = voidCreditPurchaseInvoice
        }

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

        fun build(): CreditVoidGrantParams =
            CreditVoidGrantParams(
                checkNotNull(id) { "`id` is required but was not set" },
                voidCreditPurchaseInvoice,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
