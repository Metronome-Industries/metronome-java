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

class ContractRateCardProductOrderUpdateParams
constructor(
    private val productMoves: List<ProductMove>,
    private val rateCardId: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun productMoves(): List<ProductMove> = productMoves

    fun rateCardId(): String = rateCardId

    @JvmSynthetic
    internal fun getBody(): ContractRateCardProductOrderUpdateBody {
        return ContractRateCardProductOrderUpdateBody(
            productMoves,
            rateCardId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ContractRateCardProductOrderUpdateBody.Builder::class)
    @NoAutoDetect
    class ContractRateCardProductOrderUpdateBody
    internal constructor(
        private val productMoves: List<ProductMove>?,
        private val rateCardId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("product_moves") fun productMoves(): List<ProductMove>? = productMoves

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

            private var productMoves: List<ProductMove>? = null
            private var rateCardId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                contractRateCardProductOrderUpdateBody: ContractRateCardProductOrderUpdateBody
            ) = apply {
                this.productMoves = contractRateCardProductOrderUpdateBody.productMoves
                this.rateCardId = contractRateCardProductOrderUpdateBody.rateCardId
                additionalProperties(contractRateCardProductOrderUpdateBody.additionalProperties)
            }

            @JsonProperty("product_moves")
            fun productMoves(productMoves: List<ProductMove>) = apply {
                this.productMoves = productMoves
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

            fun build(): ContractRateCardProductOrderUpdateBody =
                ContractRateCardProductOrderUpdateBody(
                    checkNotNull(productMoves) { "`productMoves` is required but was not set" }
                        .toImmutable(),
                    checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRateCardProductOrderUpdateBody && this.productMoves == other.productMoves && this.rateCardId == other.rateCardId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(productMoves, rateCardId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractRateCardProductOrderUpdateBody{productMoves=$productMoves, rateCardId=$rateCardId, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardProductOrderUpdateParams && this.productMoves == other.productMoves && this.rateCardId == other.rateCardId && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(productMoves, rateCardId, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractRateCardProductOrderUpdateParams{productMoves=$productMoves, rateCardId=$rateCardId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var productMoves: MutableList<ProductMove> = mutableListOf()
        private var rateCardId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractRateCardProductOrderUpdateParams: ContractRateCardProductOrderUpdateParams
        ) = apply {
            this.productMoves(contractRateCardProductOrderUpdateParams.productMoves)
            this.rateCardId = contractRateCardProductOrderUpdateParams.rateCardId
            additionalQueryParams(contractRateCardProductOrderUpdateParams.additionalQueryParams)
            additionalHeaders(contractRateCardProductOrderUpdateParams.additionalHeaders)
            additionalBodyProperties(
                contractRateCardProductOrderUpdateParams.additionalBodyProperties
            )
        }

        fun productMoves(productMoves: List<ProductMove>) = apply {
            this.productMoves.clear()
            this.productMoves.addAll(productMoves)
        }

        fun addProductMove(productMove: ProductMove) = apply { this.productMoves.add(productMove) }

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

        fun build(): ContractRateCardProductOrderUpdateParams =
            ContractRateCardProductOrderUpdateParams(
                checkNotNull(productMoves) { "`productMoves` is required but was not set" }
                    .toImmutable(),
                checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = ProductMove.Builder::class)
    @NoAutoDetect
    class ProductMove
    private constructor(
        private val productId: String?,
        private val position: Double?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** ID of the product to move */
        @JsonProperty("product_id") fun productId(): String? = productId

        /** 0-based index of the new position of the product */
        @JsonProperty("position") fun position(): Double? = position

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var productId: String? = null
            private var position: Double? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(productMove: ProductMove) = apply {
                this.productId = productMove.productId
                this.position = productMove.position
                additionalProperties(productMove.additionalProperties)
            }

            /** ID of the product to move */
            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

            /** 0-based index of the new position of the product */
            @JsonProperty("position")
            fun position(position: Double) = apply { this.position = position }

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

            fun build(): ProductMove =
                ProductMove(
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    checkNotNull(position) { "`position` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProductMove && this.productId == other.productId && this.position == other.position && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(productId, position, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ProductMove{productId=$productId, position=$position, additionalProperties=$additionalProperties}"
    }
}
