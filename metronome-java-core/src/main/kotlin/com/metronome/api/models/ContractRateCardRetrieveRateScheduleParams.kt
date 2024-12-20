// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ContractRateCardRetrieveRateScheduleParams
constructor(
    private val rateCardId: String,
    private val startingAt: OffsetDateTime,
    private val limit: Long?,
    private val nextPage: String?,
    private val endingBefore: OffsetDateTime?,
    private val selectors: List<Selector>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun rateCardId(): String = rateCardId

    fun startingAt(): OffsetDateTime = startingAt

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

    fun selectors(): Optional<List<Selector>> = Optional.ofNullable(selectors)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): ContractRateCardRetrieveRateScheduleBody {
        return ContractRateCardRetrieveRateScheduleBody(
            rateCardId,
            startingAt,
            endingBefore,
            selectors,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    @JsonDeserialize(builder = ContractRateCardRetrieveRateScheduleBody.Builder::class)
    @NoAutoDetect
    class ContractRateCardRetrieveRateScheduleBody
    internal constructor(
        private val rateCardId: String,
        private val startingAt: OffsetDateTime,
        private val endingBefore: OffsetDateTime?,
        private val selectors: List<Selector>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** ID of the rate card to get the schedule for */
        @JsonProperty("rate_card_id") fun rateCardId(): String = rateCardId

        /** inclusive starting point for the rates schedule */
        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime = startingAt

        /**
         * optional exclusive end date for the rates schedule. When not specified rates will show
         * all future schedule segments.
         */
        @JsonProperty("ending_before")
        fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

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

            private var rateCardId: String? = null
            private var startingAt: OffsetDateTime? = null
            private var endingBefore: OffsetDateTime? = null
            private var selectors: List<Selector>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                contractRateCardRetrieveRateScheduleBody: ContractRateCardRetrieveRateScheduleBody
            ) = apply {
                rateCardId = contractRateCardRetrieveRateScheduleBody.rateCardId
                startingAt = contractRateCardRetrieveRateScheduleBody.startingAt
                endingBefore = contractRateCardRetrieveRateScheduleBody.endingBefore
                selectors = contractRateCardRetrieveRateScheduleBody.selectors?.toMutableList()
                additionalProperties =
                    contractRateCardRetrieveRateScheduleBody.additionalProperties.toMutableMap()
            }

            /** ID of the rate card to get the schedule for */
            @JsonProperty("rate_card_id")
            fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

            /** inclusive starting point for the rates schedule */
            @JsonProperty("starting_at")
            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

            /**
             * optional exclusive end date for the rates schedule. When not specified rates will
             * show all future schedule segments.
             */
            @JsonProperty("ending_before")
            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
            }

            /**
             * List of rate selectors, rates matching ANY of the selector will be included in the
             * response Passing no selectors will result in all rates being returned.
             */
            @JsonProperty("selectors")
            fun selectors(selectors: List<Selector>) = apply { this.selectors = selectors }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): ContractRateCardRetrieveRateScheduleBody =
                ContractRateCardRetrieveRateScheduleBody(
                    checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                    checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                    endingBefore,
                    selectors?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRateCardRetrieveRateScheduleBody && rateCardId == other.rateCardId && startingAt == other.startingAt && endingBefore == other.endingBefore && selectors == other.selectors && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(rateCardId, startingAt, endingBefore, selectors, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractRateCardRetrieveRateScheduleBody{rateCardId=$rateCardId, startingAt=$startingAt, endingBefore=$endingBefore, selectors=$selectors, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var rateCardId: String? = null
        private var startingAt: OffsetDateTime? = null
        private var limit: Long? = null
        private var nextPage: String? = null
        private var endingBefore: OffsetDateTime? = null
        private var selectors: MutableList<Selector> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractRateCardRetrieveRateScheduleParams: ContractRateCardRetrieveRateScheduleParams
        ) = apply {
            rateCardId = contractRateCardRetrieveRateScheduleParams.rateCardId
            startingAt = contractRateCardRetrieveRateScheduleParams.startingAt
            limit = contractRateCardRetrieveRateScheduleParams.limit
            nextPage = contractRateCardRetrieveRateScheduleParams.nextPage
            endingBefore = contractRateCardRetrieveRateScheduleParams.endingBefore
            selectors =
                contractRateCardRetrieveRateScheduleParams.selectors?.toMutableList()
                    ?: mutableListOf()
            additionalHeaders =
                contractRateCardRetrieveRateScheduleParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                contractRateCardRetrieveRateScheduleParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                contractRateCardRetrieveRateScheduleParams.additionalBodyProperties.toMutableMap()
        }

        /** ID of the rate card to get the schedule for */
        fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

        /** inclusive starting point for the rates schedule */
        fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

        /** Max number of results that should be returned */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /**
         * optional exclusive end date for the rates schedule. When not specified rates will show
         * all future schedule segments.
         */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { this.endingBefore = endingBefore }

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
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): ContractRateCardRetrieveRateScheduleParams =
            ContractRateCardRetrieveRateScheduleParams(
                checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                limit,
                nextPage,
                endingBefore,
                selectors.toImmutable().ifEmpty { null },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Selector.Builder::class)
    @NoAutoDetect
    class Selector
    private constructor(
        private val productId: String?,
        private val pricingGroupValues: PricingGroupValues?,
        private val partialPricingGroupValues: PartialPricingGroupValues?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Rates matching the product id will be included in the response. */
        @JsonProperty("product_id")
        fun productId(): Optional<String> = Optional.ofNullable(productId)

        /**
         * List of pricing group key value pairs, rates matching all of the key / value pairs will
         * be included in the response.
         */
        @JsonProperty("pricing_group_values")
        fun pricingGroupValues(): Optional<PricingGroupValues> =
            Optional.ofNullable(pricingGroupValues)

        /**
         * List of pricing group key value pairs, rates containing the matching key / value pairs
         * will be included in the response.
         */
        @JsonProperty("partial_pricing_group_values")
        fun partialPricingGroupValues(): Optional<PartialPricingGroupValues> =
            Optional.ofNullable(partialPricingGroupValues)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var productId: String? = null
            private var pricingGroupValues: PricingGroupValues? = null
            private var partialPricingGroupValues: PartialPricingGroupValues? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(selector: Selector) = apply {
                productId = selector.productId
                pricingGroupValues = selector.pricingGroupValues
                partialPricingGroupValues = selector.partialPricingGroupValues
                additionalProperties = selector.additionalProperties.toMutableMap()
            }

            /** Rates matching the product id will be included in the response. */
            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

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
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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
                    productId,
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
                    additionalProperties =
                        partialPricingGroupValues.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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
                    additionalProperties = pricingGroupValues.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

            return /* spotless:off */ other is Selector && productId == other.productId && pricingGroupValues == other.pricingGroupValues && partialPricingGroupValues == other.partialPricingGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, pricingGroupValues, partialPricingGroupValues, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Selector{productId=$productId, pricingGroupValues=$pricingGroupValues, partialPricingGroupValues=$partialPricingGroupValues, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardRetrieveRateScheduleParams && rateCardId == other.rateCardId && startingAt == other.startingAt && limit == other.limit && nextPage == other.nextPage && endingBefore == other.endingBefore && selectors == other.selectors && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(rateCardId, startingAt, limit, nextPage, endingBefore, selectors, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ContractRateCardRetrieveRateScheduleParams{rateCardId=$rateCardId, startingAt=$startingAt, limit=$limit, nextPage=$nextPage, endingBefore=$endingBefore, selectors=$selectors, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
