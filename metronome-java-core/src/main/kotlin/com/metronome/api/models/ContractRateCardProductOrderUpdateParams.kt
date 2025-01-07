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
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.util.Objects

/** Updates ordering of specified products */
class ContractRateCardProductOrderUpdateParams
constructor(
    private val body: ContractRateCardProductOrderUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun productMoves(): List<ProductMove> = body.productMoves()

    /** ID of the rate card to update */
    fun rateCardId(): String = body.rateCardId()

    fun _productMoves(): JsonField<List<ProductMove>> = body._productMoves()

    /** ID of the rate card to update */
    fun _rateCardId(): JsonField<String> = body._rateCardId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ContractRateCardProductOrderUpdateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractRateCardProductOrderUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("product_moves")
        @ExcludeMissing
        private val productMoves: JsonField<List<ProductMove>> = JsonMissing.of(),
        @JsonProperty("rate_card_id")
        @ExcludeMissing
        private val rateCardId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun productMoves(): List<ProductMove> = productMoves.getRequired("product_moves")

        /** ID of the rate card to update */
        fun rateCardId(): String = rateCardId.getRequired("rate_card_id")

        @JsonProperty("product_moves")
        @ExcludeMissing
        fun _productMoves(): JsonField<List<ProductMove>> = productMoves

        /** ID of the rate card to update */
        @JsonProperty("rate_card_id")
        @ExcludeMissing
        fun _rateCardId(): JsonField<String> = rateCardId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractRateCardProductOrderUpdateBody = apply {
            if (!validated) {
                productMoves().forEach { it.validate() }
                rateCardId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var productMoves: JsonField<MutableList<ProductMove>>? = null
            private var rateCardId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                contractRateCardProductOrderUpdateBody: ContractRateCardProductOrderUpdateBody
            ) = apply {
                productMoves =
                    contractRateCardProductOrderUpdateBody.productMoves.map { it.toMutableList() }
                rateCardId = contractRateCardProductOrderUpdateBody.rateCardId
                additionalProperties =
                    contractRateCardProductOrderUpdateBody.additionalProperties.toMutableMap()
            }

            fun productMoves(productMoves: List<ProductMove>) =
                productMoves(JsonField.of(productMoves))

            fun productMoves(productMoves: JsonField<List<ProductMove>>) = apply {
                this.productMoves = productMoves.map { it.toMutableList() }
            }

            fun addProductMove(productMove: ProductMove) = apply {
                productMoves =
                    (productMoves ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(productMove)
                    }
            }

            /** ID of the rate card to update */
            fun rateCardId(rateCardId: String) = rateCardId(JsonField.of(rateCardId))

            /** ID of the rate card to update */
            fun rateCardId(rateCardId: JsonField<String>) = apply { this.rateCardId = rateCardId }

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

            fun build(): ContractRateCardProductOrderUpdateBody =
                ContractRateCardProductOrderUpdateBody(
                    checkNotNull(productMoves) { "`productMoves` is required but was not set" }
                        .map { it.toImmutable() },
                    checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRateCardProductOrderUpdateBody && productMoves == other.productMoves && rateCardId == other.rateCardId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productMoves, rateCardId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractRateCardProductOrderUpdateBody{productMoves=$productMoves, rateCardId=$rateCardId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ContractRateCardProductOrderUpdateBody.Builder =
            ContractRateCardProductOrderUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            contractRateCardProductOrderUpdateParams: ContractRateCardProductOrderUpdateParams
        ) = apply {
            body = contractRateCardProductOrderUpdateParams.body.toBuilder()
            additionalHeaders =
                contractRateCardProductOrderUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                contractRateCardProductOrderUpdateParams.additionalQueryParams.toBuilder()
        }

        fun productMoves(productMoves: List<ProductMove>) = apply {
            body.productMoves(productMoves)
        }

        fun productMoves(productMoves: JsonField<List<ProductMove>>) = apply {
            body.productMoves(productMoves)
        }

        fun addProductMove(productMove: ProductMove) = apply { body.addProductMove(productMove) }

        /** ID of the rate card to update */
        fun rateCardId(rateCardId: String) = apply { body.rateCardId(rateCardId) }

        /** ID of the rate card to update */
        fun rateCardId(rateCardId: JsonField<String>) = apply { body.rateCardId(rateCardId) }

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

        fun build(): ContractRateCardProductOrderUpdateParams =
            ContractRateCardProductOrderUpdateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class ProductMove
    @JsonCreator
    private constructor(
        @JsonProperty("position")
        @ExcludeMissing
        private val position: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** 0-based index of the new position of the product */
        fun position(): Double = position.getRequired("position")

        /** ID of the product to move */
        fun productId(): String = productId.getRequired("product_id")

        /** 0-based index of the new position of the product */
        @JsonProperty("position") @ExcludeMissing fun _position(): JsonField<Double> = position

        /** ID of the product to move */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ProductMove = apply {
            if (!validated) {
                position()
                productId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var position: JsonField<Double>? = null
            private var productId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(productMove: ProductMove) = apply {
                position = productMove.position
                productId = productMove.productId
                additionalProperties = productMove.additionalProperties.toMutableMap()
            }

            /** 0-based index of the new position of the product */
            fun position(position: Double) = position(JsonField.of(position))

            /** 0-based index of the new position of the product */
            fun position(position: JsonField<Double>) = apply { this.position = position }

            /** ID of the product to move */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /** ID of the product to move */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

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

            fun build(): ProductMove =
                ProductMove(
                    checkNotNull(position) { "`position` is required but was not set" },
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProductMove && position == other.position && productId == other.productId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(position, productId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProductMove{position=$position, productId=$productId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardProductOrderUpdateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractRateCardProductOrderUpdateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
