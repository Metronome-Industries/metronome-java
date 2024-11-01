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
import java.util.Optional

class ContractRateCardRateListParams
constructor(
    private val at: OffsetDateTime,
    private val rateCardId: String,
    private val limit: Long?,
    private val nextPage: String?,
    private val selectors: List<Selector>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun at(): OffsetDateTime = at

    fun rateCardId(): String = rateCardId

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun selectors(): Optional<List<Selector>> = Optional.ofNullable(selectors)

    @JvmSynthetic
    internal fun getBody(): ContractRateCardRateListBody {
        return ContractRateCardRateListBody(
            at,
            rateCardId,
            selectors,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.nextPage?.let { params.put("next_page", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ContractRateCardRateListBody.Builder::class)
    @NoAutoDetect
    class ContractRateCardRateListBody
    internal constructor(
        private val at: OffsetDateTime?,
        private val rateCardId: String?,
        private val selectors: List<Selector>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** inclusive starting point for the rates schedule */
        @JsonProperty("at") fun at(): OffsetDateTime? = at

        /** ID of the rate card to get the schedule for */
        @JsonProperty("rate_card_id") fun rateCardId(): String? = rateCardId

        /**
         * List of rate selectors, rates matching ANY of the selector will be included in the
         * response Passing no selectors will result in all rates being returned.
         */
        @JsonProperty("selectors") fun selectors(): List<Selector>? = selectors

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
            private var selectors: List<Selector>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractRateCardRateListBody: ContractRateCardRateListBody) = apply {
                this.at = contractRateCardRateListBody.at
                this.rateCardId = contractRateCardRateListBody.rateCardId
                this.selectors = contractRateCardRateListBody.selectors
                additionalProperties(contractRateCardRateListBody.additionalProperties)
            }

            /** inclusive starting point for the rates schedule */
            @JsonProperty("at") fun at(at: OffsetDateTime) = apply { this.at = at }

            /** ID of the rate card to get the schedule for */
            @JsonProperty("rate_card_id")
            fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

            /**
             * List of rate selectors, rates matching ANY of the selector will be included in the
             * response Passing no selectors will result in all rates being returned.
             */
            @JsonProperty("selectors")
            fun selectors(selectors: List<Selector>) = apply { this.selectors = selectors }

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

            return /* spotless:off */ other is ContractRateCardRateListBody && this.at == other.at && this.rateCardId == other.rateCardId && this.selectors == other.selectors && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(at, rateCardId, selectors, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractRateCardRateListBody{at=$at, rateCardId=$rateCardId, selectors=$selectors, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardRateListParams && this.at == other.at && this.rateCardId == other.rateCardId && this.selectors == other.selectors && this.limit == other.limit && this.nextPage == other.nextPage && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(at, rateCardId, selectors, limit, nextPage, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractRateCardRateListParams{at=$at, rateCardId=$rateCardId, selectors=$selectors, limit=$limit, nextPage=$nextPage, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var at: OffsetDateTime? = null
        private var rateCardId: String? = null
        private var limit: Long? = null
        private var nextPage: String? = null
        private var selectors: MutableList<Selector> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractRateCardRateListParams: ContractRateCardRateListParams) = apply {
            this.at = contractRateCardRateListParams.at
            this.rateCardId = contractRateCardRateListParams.rateCardId
            this.limit = contractRateCardRateListParams.limit
            this.nextPage = contractRateCardRateListParams.nextPage
            this.selectors(contractRateCardRateListParams.selectors ?: listOf())
            additionalQueryParams(contractRateCardRateListParams.additionalQueryParams)
            additionalHeaders(contractRateCardRateListParams.additionalHeaders)
            additionalBodyProperties(contractRateCardRateListParams.additionalBodyProperties)
        }

        /** inclusive starting point for the rates schedule */
        fun at(at: OffsetDateTime) = apply { this.at = at }

        /** ID of the rate card to get the schedule for */
        fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

        /** Max number of results that should be returned */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /**
         * List of rate selectors, rates matching ANY of the selector will be included in the
         * response Passing no selectors will result in all rates being returned.
         */
        fun selectors(selectors: List<Selector>) = apply {
            this.selectors.clear()
            this.selectors.addAll(selectors)
        }

        /**
         * List of rate selectors, rates matching ANY of the selector will be included in the
         * response Passing no selectors will result in all rates being returned.
         */
        fun addSelector(selector: Selector) = apply { this.selectors.add(selector) }

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

        fun build(): ContractRateCardRateListParams =
            ContractRateCardRateListParams(
                checkNotNull(at) { "`at` is required but was not set" },
                checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                limit,
                nextPage,
                if (selectors.size == 0) null else selectors.toImmutable(),
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Selector.Builder::class)
    @NoAutoDetect
    class Selector
    private constructor(
        private val productId: String?,
        private val productTags: List<String>?,
        private val pricingGroupValues: PricingGroupValues?,
        private val partialPricingGroupValues: PartialPricingGroupValues?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Rates matching the product id will be included in the response. */
        @JsonProperty("product_id") fun productId(): String? = productId

        /**
         * List of product tags, rates matching any of the tags will be included in the response.
         */
        @JsonProperty("product_tags") fun productTags(): List<String>? = productTags

        /**
         * List of pricing group key value pairs, rates matching all of the key / value pairs will
         * be included in the response.
         */
        @JsonProperty("pricing_group_values")
        fun pricingGroupValues(): PricingGroupValues? = pricingGroupValues

        /**
         * List of pricing group key value pairs, rates containing the matching key / value pairs
         * will be included in the response.
         */
        @JsonProperty("partial_pricing_group_values")
        fun partialPricingGroupValues(): PartialPricingGroupValues? = partialPricingGroupValues

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var productId: String? = null
            private var productTags: List<String>? = null
            private var pricingGroupValues: PricingGroupValues? = null
            private var partialPricingGroupValues: PartialPricingGroupValues? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(selector: Selector) = apply {
                this.productId = selector.productId
                this.productTags = selector.productTags
                this.pricingGroupValues = selector.pricingGroupValues
                this.partialPricingGroupValues = selector.partialPricingGroupValues
                additionalProperties(selector.additionalProperties)
            }

            /** Rates matching the product id will be included in the response. */
            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

            /**
             * List of product tags, rates matching any of the tags will be included in the
             * response.
             */
            @JsonProperty("product_tags")
            fun productTags(productTags: List<String>) = apply { this.productTags = productTags }

            /**
             * List of pricing group key value pairs, rates matching all of the key / value pairs
             * will be included in the response.
             */
            @JsonProperty("pricing_group_values")
            fun pricingGroupValues(pricingGroupValues: PricingGroupValues) = apply {
                this.pricingGroupValues = pricingGroupValues
            }

            /**
             * List of pricing group key value pairs, rates containing the matching key / value
             * pairs will be included in the response.
             */
            @JsonProperty("partial_pricing_group_values")
            fun partialPricingGroupValues(partialPricingGroupValues: PartialPricingGroupValues) =
                apply {
                    this.partialPricingGroupValues = partialPricingGroupValues
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

            fun build(): Selector =
                Selector(
                    productId,
                    productTags?.toImmutable(),
                    pricingGroupValues,
                    partialPricingGroupValues,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * List of pricing group key value pairs, rates containing the matching key / value pairs
         * will be included in the response.
         */
        @JsonDeserialize(builder = PartialPricingGroupValues.Builder::class)
        @NoAutoDetect
        class PartialPricingGroupValues
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(partialPricingGroupValues.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PartialPricingGroupValues =
                    PartialPricingGroupValues(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PartialPricingGroupValues && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "PartialPricingGroupValues{additionalProperties=$additionalProperties}"
        }

        /**
         * List of pricing group key value pairs, rates matching all of the key / value pairs will
         * be included in the response.
         */
        @JsonDeserialize(builder = PricingGroupValues.Builder::class)
        @NoAutoDetect
        class PricingGroupValues
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(pricingGroupValues.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PricingGroupValues =
                    PricingGroupValues(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PricingGroupValues && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "PricingGroupValues{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Selector && this.productId == other.productId && this.productTags == other.productTags && this.pricingGroupValues == other.pricingGroupValues && this.partialPricingGroupValues == other.partialPricingGroupValues && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(productId, productTags, pricingGroupValues, partialPricingGroupValues, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Selector{productId=$productId, productTags=$productTags, pricingGroupValues=$pricingGroupValues, partialPricingGroupValues=$partialPricingGroupValues, additionalProperties=$additionalProperties}"
    }
}
