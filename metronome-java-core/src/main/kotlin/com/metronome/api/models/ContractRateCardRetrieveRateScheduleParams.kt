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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Get all rates for a rate card from starting_at (either in perpetuity or until ending_before, if
 * provided)
 */
class ContractRateCardRetrieveRateScheduleParams
private constructor(
    private val limit: Long?,
    private val nextPage: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Max number of results that should be returned */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /** ID of the rate card to get the schedule for */
    fun rateCardId(): String = body.rateCardId()

    /** inclusive starting point for the rates schedule */
    fun startingAt(): OffsetDateTime = body.startingAt()

    /**
     * optional exclusive end date for the rates schedule. When not specified rates will show all
     * future schedule segments.
     */
    fun endingBefore(): Optional<OffsetDateTime> = body.endingBefore()

    /**
     * List of rate selectors, rates matching ANY of the selector will be included in the response
     * Passing no selectors will result in all rates being returned.
     */
    fun selectors(): Optional<List<Selector>> = body.selectors()

    /** ID of the rate card to get the schedule for */
    fun _rateCardId(): JsonField<String> = body._rateCardId()

    /** inclusive starting point for the rates schedule */
    fun _startingAt(): JsonField<OffsetDateTime> = body._startingAt()

    /**
     * optional exclusive end date for the rates schedule. When not specified rates will show all
     * future schedule segments.
     */
    fun _endingBefore(): JsonField<OffsetDateTime> = body._endingBefore()

    /**
     * List of rate selectors, rates matching ANY of the selector will be included in the response
     * Passing no selectors will result in all rates being returned.
     */
    fun _selectors(): JsonField<List<Selector>> = body._selectors()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("rate_card_id")
        @ExcludeMissing
        private val rateCardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("selectors")
        @ExcludeMissing
        private val selectors: JsonField<List<Selector>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the rate card to get the schedule for */
        fun rateCardId(): String = rateCardId.getRequired("rate_card_id")

        /** inclusive starting point for the rates schedule */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /**
         * optional exclusive end date for the rates schedule. When not specified rates will show
         * all future schedule segments.
         */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        /**
         * List of rate selectors, rates matching ANY of the selector will be included in the
         * response Passing no selectors will result in all rates being returned.
         */
        fun selectors(): Optional<List<Selector>> =
            Optional.ofNullable(selectors.getNullable("selectors"))

        /** ID of the rate card to get the schedule for */
        @JsonProperty("rate_card_id")
        @ExcludeMissing
        fun _rateCardId(): JsonField<String> = rateCardId

        /** inclusive starting point for the rates schedule */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /**
         * optional exclusive end date for the rates schedule. When not specified rates will show
         * all future schedule segments.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /**
         * List of rate selectors, rates matching ANY of the selector will be included in the
         * response Passing no selectors will result in all rates being returned.
         */
        @JsonProperty("selectors")
        @ExcludeMissing
        fun _selectors(): JsonField<List<Selector>> = selectors

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            rateCardId()
            startingAt()
            endingBefore()
            selectors().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var rateCardId: JsonField<String>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var selectors: JsonField<MutableList<Selector>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                rateCardId = body.rateCardId
                startingAt = body.startingAt
                endingBefore = body.endingBefore
                selectors = body.selectors.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** ID of the rate card to get the schedule for */
            fun rateCardId(rateCardId: String) = rateCardId(JsonField.of(rateCardId))

            /** ID of the rate card to get the schedule for */
            fun rateCardId(rateCardId: JsonField<String>) = apply { this.rateCardId = rateCardId }

            /** inclusive starting point for the rates schedule */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /** inclusive starting point for the rates schedule */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            /**
             * optional exclusive end date for the rates schedule. When not specified rates will
             * show all future schedule segments.
             */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /**
             * optional exclusive end date for the rates schedule. When not specified rates will
             * show all future schedule segments.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            /**
             * List of rate selectors, rates matching ANY of the selector will be included in the
             * response Passing no selectors will result in all rates being returned.
             */
            fun selectors(selectors: List<Selector>) = selectors(JsonField.of(selectors))

            /**
             * List of rate selectors, rates matching ANY of the selector will be included in the
             * response Passing no selectors will result in all rates being returned.
             */
            fun selectors(selectors: JsonField<List<Selector>>) = apply {
                this.selectors = selectors.map { it.toMutableList() }
            }

            /**
             * List of rate selectors, rates matching ANY of the selector will be included in the
             * response Passing no selectors will result in all rates being returned.
             */
            fun addSelector(selector: Selector) = apply {
                selectors =
                    (selectors ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(selector)
                    }
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

            fun build(): Body =
                Body(
                    checkRequired("rateCardId", rateCardId),
                    checkRequired("startingAt", startingAt),
                    endingBefore,
                    (selectors ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && rateCardId == other.rateCardId && startingAt == other.startingAt && endingBefore == other.endingBefore && selectors == other.selectors && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(rateCardId, startingAt, endingBefore, selectors, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{rateCardId=$rateCardId, startingAt=$startingAt, endingBefore=$endingBefore, selectors=$selectors, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractRateCardRetrieveRateScheduleParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var limit: Long? = null
        private var nextPage: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            contractRateCardRetrieveRateScheduleParams: ContractRateCardRetrieveRateScheduleParams
        ) = apply {
            limit = contractRateCardRetrieveRateScheduleParams.limit
            nextPage = contractRateCardRetrieveRateScheduleParams.nextPage
            body = contractRateCardRetrieveRateScheduleParams.body.toBuilder()
            additionalHeaders =
                contractRateCardRetrieveRateScheduleParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                contractRateCardRetrieveRateScheduleParams.additionalQueryParams.toBuilder()
        }

        /** Max number of results that should be returned */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /** Max number of results that should be returned */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Max number of results that should be returned */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun limit(limit: Optional<Long>) = limit(limit.orElse(null) as Long?)

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String?) = apply { this.nextPage = nextPage }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.orElse(null))

        /** ID of the rate card to get the schedule for */
        fun rateCardId(rateCardId: String) = apply { body.rateCardId(rateCardId) }

        /** ID of the rate card to get the schedule for */
        fun rateCardId(rateCardId: JsonField<String>) = apply { body.rateCardId(rateCardId) }

        /** inclusive starting point for the rates schedule */
        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

        /** inclusive starting point for the rates schedule */
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            body.startingAt(startingAt)
        }

        /**
         * optional exclusive end date for the rates schedule. When not specified rates will show
         * all future schedule segments.
         */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { body.endingBefore(endingBefore) }

        /**
         * optional exclusive end date for the rates schedule. When not specified rates will show
         * all future schedule segments.
         */
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            body.endingBefore(endingBefore)
        }

        /**
         * List of rate selectors, rates matching ANY of the selector will be included in the
         * response Passing no selectors will result in all rates being returned.
         */
        fun selectors(selectors: List<Selector>) = apply { body.selectors(selectors) }

        /**
         * List of rate selectors, rates matching ANY of the selector will be included in the
         * response Passing no selectors will result in all rates being returned.
         */
        fun selectors(selectors: JsonField<List<Selector>>) = apply { body.selectors(selectors) }

        /**
         * List of rate selectors, rates matching ANY of the selector will be included in the
         * response Passing no selectors will result in all rates being returned.
         */
        fun addSelector(selector: Selector) = apply { body.addSelector(selector) }

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

        fun build(): ContractRateCardRetrieveRateScheduleParams =
            ContractRateCardRetrieveRateScheduleParams(
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
        @ExcludeMissing
        private val partialPricingGroupValues: JsonField<PartialPricingGroupValues> =
            JsonMissing.of(),
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        private val pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * List of pricing group key value pairs, rates containing the matching key / value pairs
         * will be included in the response.
         */
        fun partialPricingGroupValues(): Optional<PartialPricingGroupValues> =
            Optional.ofNullable(
                partialPricingGroupValues.getNullable("partial_pricing_group_values")
            )

        /**
         * List of pricing group key value pairs, rates matching all of the key / value pairs will
         * be included in the response.
         */
        fun pricingGroupValues(): Optional<PricingGroupValues> =
            Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

        /** Rates matching the product id will be included in the response. */
        fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("product_id"))

        /**
         * List of pricing group key value pairs, rates containing the matching key / value pairs
         * will be included in the response.
         */
        @JsonProperty("partial_pricing_group_values")
        @ExcludeMissing
        fun _partialPricingGroupValues(): JsonField<PartialPricingGroupValues> =
            partialPricingGroupValues

        /**
         * List of pricing group key value pairs, rates matching all of the key / value pairs will
         * be included in the response.
         */
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

        /** Rates matching the product id will be included in the response. */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Selector = apply {
            if (validated) {
                return@apply
            }

            partialPricingGroupValues().ifPresent { it.validate() }
            pricingGroupValues().ifPresent { it.validate() }
            productId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Selector]. */
        class Builder internal constructor() {

            private var partialPricingGroupValues: JsonField<PartialPricingGroupValues> =
                JsonMissing.of()
            private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(selector: Selector) = apply {
                partialPricingGroupValues = selector.partialPricingGroupValues
                pricingGroupValues = selector.pricingGroupValues
                productId = selector.productId
                additionalProperties = selector.additionalProperties.toMutableMap()
            }

            /**
             * List of pricing group key value pairs, rates containing the matching key / value
             * pairs will be included in the response.
             */
            fun partialPricingGroupValues(partialPricingGroupValues: PartialPricingGroupValues) =
                partialPricingGroupValues(JsonField.of(partialPricingGroupValues))

            /**
             * List of pricing group key value pairs, rates containing the matching key / value
             * pairs will be included in the response.
             */
            fun partialPricingGroupValues(
                partialPricingGroupValues: JsonField<PartialPricingGroupValues>
            ) = apply { this.partialPricingGroupValues = partialPricingGroupValues }

            /**
             * List of pricing group key value pairs, rates matching all of the key / value pairs
             * will be included in the response.
             */
            fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                pricingGroupValues(JsonField.of(pricingGroupValues))

            /**
             * List of pricing group key value pairs, rates matching all of the key / value pairs
             * will be included in the response.
             */
            fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                this.pricingGroupValues = pricingGroupValues
            }

            /** Rates matching the product id will be included in the response. */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /** Rates matching the product id will be included in the response. */
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

            fun build(): Selector =
                Selector(
                    partialPricingGroupValues,
                    pricingGroupValues,
                    productId,
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
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PartialPricingGroupValues = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PartialPricingGroupValues]. */
            class Builder internal constructor() {

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
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PricingGroupValues = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PricingGroupValues]. */
            class Builder internal constructor() {

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

            return /* spotless:off */ other is Selector && partialPricingGroupValues == other.partialPricingGroupValues && pricingGroupValues == other.pricingGroupValues && productId == other.productId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(partialPricingGroupValues, pricingGroupValues, productId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Selector{partialPricingGroupValues=$partialPricingGroupValues, pricingGroupValues=$pricingGroupValues, productId=$productId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardRetrieveRateScheduleParams && limit == other.limit && nextPage == other.nextPage && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(limit, nextPage, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractRateCardRetrieveRateScheduleParams{limit=$limit, nextPage=$nextPage, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
