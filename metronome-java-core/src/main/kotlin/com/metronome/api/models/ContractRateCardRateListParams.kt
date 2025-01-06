// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ContractRateCardRateListParams
constructor(
    private val limit: Long?,
    private val nextPage: String?,
    private val body: ContractRateCardRateListBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Max number of results that should be returned */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /** inclusive starting point for the rates schedule */
    fun at(): OffsetDateTime = body.at()

    /** ID of the rate card to get the schedule for */
    fun rateCardId(): String = body.rateCardId()

    /**
     * List of rate selectors, rates matching ANY of the selector will be included in the response
     * Passing no selectors will result in all rates being returned.
     */
    fun selectors(): Optional<List<Selector>> = body.selectors()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): ContractRateCardRateListBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    @NoAutoDetect
    class ContractRateCardRateListBody
    @JsonCreator
    internal constructor(
        @JsonProperty("at") private val at: OffsetDateTime,
        @JsonProperty("rate_card_id") private val rateCardId: String,
        @JsonProperty("selectors") private val selectors: List<Selector>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** inclusive starting point for the rates schedule */
        @JsonProperty("at") fun at(): OffsetDateTime = at

        /** ID of the rate card to get the schedule for */
        @JsonProperty("rate_card_id") fun rateCardId(): String = rateCardId

        /**
         * List of rate selectors, rates matching ANY of the selector will be included in the
         * response Passing no selectors will result in all rates being returned.
         */
        @JsonProperty("selectors")
        fun selectors(): Optional<List<Selector>> = Optional.ofNullable(selectors)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var at: OffsetDateTime? = null
            private var rateCardId: String? = null
            private var selectors: MutableList<Selector>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractRateCardRateListBody: ContractRateCardRateListBody) = apply {
                at = contractRateCardRateListBody.at
                rateCardId = contractRateCardRateListBody.rateCardId
                selectors = contractRateCardRateListBody.selectors?.toMutableList()
                additionalProperties =
                    contractRateCardRateListBody.additionalProperties.toMutableMap()
            }

            /** inclusive starting point for the rates schedule */
            fun at(at: OffsetDateTime) = apply { this.at = at }

            /** ID of the rate card to get the schedule for */
            fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

            /**
             * List of rate selectors, rates matching ANY of the selector will be included in the
             * response Passing no selectors will result in all rates being returned.
             */
            fun selectors(selectors: List<Selector>) = apply {
                this.selectors = selectors.toMutableList()
            }

            /**
             * List of rate selectors, rates matching ANY of the selector will be included in the
             * response Passing no selectors will result in all rates being returned.
             */
            fun addSelector(selector: Selector) = apply {
                selectors = (selectors ?: mutableListOf()).apply { add(selector) }
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

            fun build(): ContractRateCardRateListBody =
                ContractRateCardRateListBody(
                    checkNotNull(at) { "`at` is required but was not set" },
                    checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                    selectors?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRateCardRateListBody && at == other.at && rateCardId == other.rateCardId && selectors == other.selectors && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(at, rateCardId, selectors, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractRateCardRateListBody{at=$at, rateCardId=$rateCardId, selectors=$selectors, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var limit: Long? = null
        private var nextPage: String? = null
        private var body: ContractRateCardRateListBody.Builder =
            ContractRateCardRateListBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractRateCardRateListParams: ContractRateCardRateListParams) = apply {
            limit = contractRateCardRateListParams.limit
            nextPage = contractRateCardRateListParams.nextPage
            body = contractRateCardRateListParams.body.toBuilder()
            additionalHeaders = contractRateCardRateListParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractRateCardRateListParams.additionalQueryParams.toBuilder()
        }

        /** Max number of results that should be returned */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /** inclusive starting point for the rates schedule */
        fun at(at: OffsetDateTime) = apply { body.at(at) }

        /** ID of the rate card to get the schedule for */
        fun rateCardId(rateCardId: String) = apply { body.rateCardId(rateCardId) }

        /**
         * List of rate selectors, rates matching ANY of the selector will be included in the
         * response Passing no selectors will result in all rates being returned.
         */
        fun selectors(selectors: List<Selector>) = apply { body.selectors(selectors) }

        /**
         * List of rate selectors, rates matching ANY of the selector will be included in the
         * response Passing no selectors will result in all rates being returned.
         */
        fun addSelector(selector: Selector) = apply { body.addSelector(selector) }

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

        fun build(): ContractRateCardRateListParams =
            ContractRateCardRateListParams(
                limit,
                nextPage,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Selector
    @JsonCreator
    private constructor(
        @JsonProperty("partial_pricing_group_values")
        private val partialPricingGroupValues: PartialPricingGroupValues?,
        @JsonProperty("pricing_group_values") private val pricingGroupValues: PricingGroupValues?,
        @JsonProperty("product_id") private val productId: String?,
        @JsonProperty("product_tags") private val productTags: List<String>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * List of pricing group key value pairs, rates containing the matching key / value pairs
         * will be included in the response.
         */
        @JsonProperty("partial_pricing_group_values")
        fun partialPricingGroupValues(): Optional<PartialPricingGroupValues> =
            Optional.ofNullable(partialPricingGroupValues)

        /**
         * List of pricing group key value pairs, rates matching all of the key / value pairs will
         * be included in the response.
         */
        @JsonProperty("pricing_group_values")
        fun pricingGroupValues(): Optional<PricingGroupValues> =
            Optional.ofNullable(pricingGroupValues)

        /** Rates matching the product id will be included in the response. */
        @JsonProperty("product_id")
        fun productId(): Optional<String> = Optional.ofNullable(productId)

        /**
         * List of product tags, rates matching any of the tags will be included in the response.
         */
        @JsonProperty("product_tags")
        fun productTags(): Optional<List<String>> = Optional.ofNullable(productTags)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var partialPricingGroupValues: PartialPricingGroupValues? = null
            private var pricingGroupValues: PricingGroupValues? = null
            private var productId: String? = null
            private var productTags: MutableList<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(selector: Selector) = apply {
                partialPricingGroupValues = selector.partialPricingGroupValues
                pricingGroupValues = selector.pricingGroupValues
                productId = selector.productId
                productTags = selector.productTags?.toMutableList()
                additionalProperties = selector.additionalProperties.toMutableMap()
            }

            /**
             * List of pricing group key value pairs, rates containing the matching key / value
             * pairs will be included in the response.
             */
            fun partialPricingGroupValues(partialPricingGroupValues: PartialPricingGroupValues) =
                apply {
                    this.partialPricingGroupValues = partialPricingGroupValues
                }

            /**
             * List of pricing group key value pairs, rates matching all of the key / value pairs
             * will be included in the response.
             */
            fun pricingGroupValues(pricingGroupValues: PricingGroupValues) = apply {
                this.pricingGroupValues = pricingGroupValues
            }

            /** Rates matching the product id will be included in the response. */
            fun productId(productId: String) = apply { this.productId = productId }

            /**
             * List of product tags, rates matching any of the tags will be included in the
             * response.
             */
            fun productTags(productTags: List<String>) = apply {
                this.productTags = productTags.toMutableList()
            }

            /**
             * List of product tags, rates matching any of the tags will be included in the
             * response.
             */
            fun addProductTag(productTag: String) = apply {
                productTags = (productTags ?: mutableListOf()).apply { add(productTag) }
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

            fun build(): Selector =
                Selector(
                    partialPricingGroupValues,
                    pricingGroupValues,
                    productId,
                    productTags?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * List of pricing group key value pairs, rates containing the matching key / value pairs
         * will be included in the response.
         */
        @NoAutoDetect
        class PartialPricingGroupValues
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(partialPricingGroupValues: PartialPricingGroupValues) = apply {
                    additionalProperties =
                        partialPricingGroupValues.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): PartialPricingGroupValues =
                    PartialPricingGroupValues(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PartialPricingGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PartialPricingGroupValues{additionalProperties=$additionalProperties}"
        }

        /**
         * List of pricing group key value pairs, rates matching all of the key / value pairs will
         * be included in the response.
         */
        @NoAutoDetect
        class PricingGroupValues
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pricingGroupValues: PricingGroupValues) = apply {
                    additionalProperties = pricingGroupValues.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): PricingGroupValues =
                    PricingGroupValues(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PricingGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PricingGroupValues{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Selector && partialPricingGroupValues == other.partialPricingGroupValues && pricingGroupValues == other.pricingGroupValues && productId == other.productId && productTags == other.productTags && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(partialPricingGroupValues, pricingGroupValues, productId, productTags, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Selector{partialPricingGroupValues=$partialPricingGroupValues, pricingGroupValues=$pricingGroupValues, productId=$productId, productTags=$productTags, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardRateListParams && limit == other.limit && nextPage == other.nextPage && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(limit, nextPage, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractRateCardRateListParams{limit=$limit, nextPage=$nextPage, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
