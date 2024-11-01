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

class ContractRateCardProductOrderSetParams
constructor(
    private val productOrder: List<String>,
    private val rateCardId: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun productOrder(): List<String> = productOrder

    fun rateCardId(): String = rateCardId

    @JvmSynthetic
    internal fun getBody(): ContractRateCardProductOrderSetBody {
        return ContractRateCardProductOrderSetBody(
            productOrder,
            rateCardId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ContractRateCardProductOrderSetBody.Builder::class)
    @NoAutoDetect
    class ContractRateCardProductOrderSetBody
    internal constructor(
        private val productOrder: List<String>?,
        private val rateCardId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("product_order") fun productOrder(): List<String>? = productOrder

        /** ID of the rate card to update */
        @JsonProperty("rate_card_id") fun rateCardId(): String? = rateCardId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var productOrder: List<String>? = null
            private var rateCardId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                contractRateCardProductOrderSetBody: ContractRateCardProductOrderSetBody
            ) = apply {
                this.productOrder = contractRateCardProductOrderSetBody.productOrder
                this.rateCardId = contractRateCardProductOrderSetBody.rateCardId
                additionalProperties(contractRateCardProductOrderSetBody.additionalProperties)
            }

            @JsonProperty("product_order")
            fun productOrder(productOrder: List<String>) = apply {
                this.productOrder = productOrder
            }

            /** ID of the rate card to update */
            @JsonProperty("rate_card_id")
            fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

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

            fun build(): ContractRateCardProductOrderSetBody =
                ContractRateCardProductOrderSetBody(
                    checkNotNull(productOrder) { "`productOrder` is required but was not set" }
                        .toImmutable(),
                    checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRateCardProductOrderSetBody && this.productOrder == other.productOrder && this.rateCardId == other.rateCardId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(productOrder, rateCardId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractRateCardProductOrderSetBody{productOrder=$productOrder, rateCardId=$rateCardId, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardProductOrderSetParams && this.productOrder == other.productOrder && this.rateCardId == other.rateCardId && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(productOrder, rateCardId, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractRateCardProductOrderSetParams{productOrder=$productOrder, rateCardId=$rateCardId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var productOrder: MutableList<String> = mutableListOf()
        private var rateCardId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractRateCardProductOrderSetParams: ContractRateCardProductOrderSetParams
        ) = apply {
            this.productOrder(contractRateCardProductOrderSetParams.productOrder)
            this.rateCardId = contractRateCardProductOrderSetParams.rateCardId
            additionalQueryParams(contractRateCardProductOrderSetParams.additionalQueryParams)
            additionalHeaders(contractRateCardProductOrderSetParams.additionalHeaders)
            additionalBodyProperties(contractRateCardProductOrderSetParams.additionalBodyProperties)
        }

        fun productOrder(productOrder: List<String>) = apply {
            this.productOrder.clear()
            this.productOrder.addAll(productOrder)
        }

        fun addProductOrder(productOrder: String) = apply { this.productOrder.add(productOrder) }

        /** ID of the rate card to update */
        fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

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

        fun build(): ContractRateCardProductOrderSetParams =
            ContractRateCardProductOrderSetParams(
                checkNotNull(productOrder) { "`productOrder` is required but was not set" }
                    .toImmutable(),
                checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
