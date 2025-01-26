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

/** Get the rate schedule for the rate card on a given contract. */
class ContractRetrieveRateScheduleParams
private constructor(
    private val limit: Long?,
    private val nextPage: String?,
    private val body: ContractRetrieveRateScheduleBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Max number of results that should be returned */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /** ID of the contract to get the rate schedule for. */
    fun contractId(): String = body.contractId()

    /** ID of the customer for whose contract to get the rate schedule for. */
    fun customerId(): String = body.customerId()

    /**
     * optional timestamp which overlaps with the returned rate schedule segments. When not
     * specified, the current timestamp will be used.
     */
    fun at(): Optional<OffsetDateTime> = body.at()

    /**
     * List of rate selectors, rates matching ANY of the selectors will be included in the response.
     * Passing no selectors will result in all rates being returned.
     */
    fun selectors(): Optional<List<Selector>> = body.selectors()

    /** ID of the contract to get the rate schedule for. */
    fun _contractId(): JsonField<String> = body._contractId()

    /** ID of the customer for whose contract to get the rate schedule for. */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * optional timestamp which overlaps with the returned rate schedule segments. When not
     * specified, the current timestamp will be used.
     */
    fun _at(): JsonField<OffsetDateTime> = body._at()

    /**
     * List of rate selectors, rates matching ANY of the selectors will be included in the response.
     * Passing no selectors will result in all rates being returned.
     */
    fun _selectors(): JsonField<List<Selector>> = body._selectors()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ContractRetrieveRateScheduleBody = body

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
    class ContractRetrieveRateScheduleBody
    @JsonCreator
    internal constructor(
        @JsonProperty("contract_id")
        @ExcludeMissing
        private val contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("at")
        @ExcludeMissing
        private val at: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("selectors")
        @ExcludeMissing
        private val selectors: JsonField<List<Selector>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the contract to get the rate schedule for. */
        fun contractId(): String = contractId.getRequired("contract_id")

        /** ID of the customer for whose contract to get the rate schedule for. */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * optional timestamp which overlaps with the returned rate schedule segments. When not
         * specified, the current timestamp will be used.
         */
        fun at(): Optional<OffsetDateTime> = Optional.ofNullable(at.getNullable("at"))

        /**
         * List of rate selectors, rates matching ANY of the selectors will be included in the
         * response. Passing no selectors will result in all rates being returned.
         */
        fun selectors(): Optional<List<Selector>> =
            Optional.ofNullable(selectors.getNullable("selectors"))

        /** ID of the contract to get the rate schedule for. */
        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /** ID of the customer for whose contract to get the rate schedule for. */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * optional timestamp which overlaps with the returned rate schedule segments. When not
         * specified, the current timestamp will be used.
         */
        @JsonProperty("at") @ExcludeMissing fun _at(): JsonField<OffsetDateTime> = at

        /**
         * List of rate selectors, rates matching ANY of the selectors will be included in the
         * response. Passing no selectors will result in all rates being returned.
         */
        @JsonProperty("selectors")
        @ExcludeMissing
        fun _selectors(): JsonField<List<Selector>> = selectors

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractRetrieveRateScheduleBody = apply {
            if (validated) {
                return@apply
            }

            contractId()
            customerId()
            at()
            selectors().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var contractId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var at: JsonField<OffsetDateTime> = JsonMissing.of()
            private var selectors: JsonField<MutableList<Selector>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractRetrieveRateScheduleBody: ContractRetrieveRateScheduleBody) =
                apply {
                    contractId = contractRetrieveRateScheduleBody.contractId
                    customerId = contractRetrieveRateScheduleBody.customerId
                    at = contractRetrieveRateScheduleBody.at
                    selectors =
                        contractRetrieveRateScheduleBody.selectors.map { it.toMutableList() }
                    additionalProperties =
                        contractRetrieveRateScheduleBody.additionalProperties.toMutableMap()
                }

            /** ID of the contract to get the rate schedule for. */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /** ID of the contract to get the rate schedule for. */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            /** ID of the customer for whose contract to get the rate schedule for. */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /** ID of the customer for whose contract to get the rate schedule for. */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * optional timestamp which overlaps with the returned rate schedule segments. When not
             * specified, the current timestamp will be used.
             */
            fun at(at: OffsetDateTime) = at(JsonField.of(at))

            /**
             * optional timestamp which overlaps with the returned rate schedule segments. When not
             * specified, the current timestamp will be used.
             */
            fun at(at: JsonField<OffsetDateTime>) = apply { this.at = at }

            /**
             * List of rate selectors, rates matching ANY of the selectors will be included in the
             * response. Passing no selectors will result in all rates being returned.
             */
            fun selectors(selectors: List<Selector>) = selectors(JsonField.of(selectors))

            /**
             * List of rate selectors, rates matching ANY of the selectors will be included in the
             * response. Passing no selectors will result in all rates being returned.
             */
            fun selectors(selectors: JsonField<List<Selector>>) = apply {
                this.selectors = selectors.map { it.toMutableList() }
            }

            /**
             * List of rate selectors, rates matching ANY of the selectors will be included in the
             * response. Passing no selectors will result in all rates being returned.
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

            fun build(): ContractRetrieveRateScheduleBody =
                ContractRetrieveRateScheduleBody(
                    checkRequired("contractId", contractId),
                    checkRequired("customerId", customerId),
                    at,
                    (selectors ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRetrieveRateScheduleBody && contractId == other.contractId && customerId == other.customerId && at == other.at && selectors == other.selectors && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contractId, customerId, at, selectors, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractRetrieveRateScheduleBody{contractId=$contractId, customerId=$customerId, at=$at, selectors=$selectors, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var limit: Long? = null
        private var nextPage: String? = null
        private var body: ContractRetrieveRateScheduleBody.Builder =
            ContractRetrieveRateScheduleBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractRetrieveRateScheduleParams: ContractRetrieveRateScheduleParams) =
            apply {
                limit = contractRetrieveRateScheduleParams.limit
                nextPage = contractRetrieveRateScheduleParams.nextPage
                body = contractRetrieveRateScheduleParams.body.toBuilder()
                additionalHeaders = contractRetrieveRateScheduleParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    contractRetrieveRateScheduleParams.additionalQueryParams.toBuilder()
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

        /** ID of the contract to get the rate schedule for. */
        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /** ID of the contract to get the rate schedule for. */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        /** ID of the customer for whose contract to get the rate schedule for. */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** ID of the customer for whose contract to get the rate schedule for. */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * optional timestamp which overlaps with the returned rate schedule segments. When not
         * specified, the current timestamp will be used.
         */
        fun at(at: OffsetDateTime) = apply { body.at(at) }

        /**
         * optional timestamp which overlaps with the returned rate schedule segments. When not
         * specified, the current timestamp will be used.
         */
        fun at(at: JsonField<OffsetDateTime>) = apply { body.at(at) }

        /**
         * List of rate selectors, rates matching ANY of the selectors will be included in the
         * response. Passing no selectors will result in all rates being returned.
         */
        fun selectors(selectors: List<Selector>) = apply { body.selectors(selectors) }

        /**
         * List of rate selectors, rates matching ANY of the selectors will be included in the
         * response. Passing no selectors will result in all rates being returned.
         */
        fun selectors(selectors: JsonField<List<Selector>>) = apply { body.selectors(selectors) }

        /**
         * List of rate selectors, rates matching ANY of the selectors will be included in the
         * response. Passing no selectors will result in all rates being returned.
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

        fun build(): ContractRetrieveRateScheduleParams =
            ContractRetrieveRateScheduleParams(
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
        @JsonProperty("product_tags")
        @ExcludeMissing
        private val productTags: JsonField<List<String>> = JsonMissing.of(),
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
         * List of product tags, rates matching any of the tags will be included in the response.
         */
        fun productTags(): Optional<List<String>> =
            Optional.ofNullable(productTags.getNullable("product_tags"))

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

        /**
         * List of product tags, rates matching any of the tags will be included in the response.
         */
        @JsonProperty("product_tags")
        @ExcludeMissing
        fun _productTags(): JsonField<List<String>> = productTags

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
            productTags()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var partialPricingGroupValues: JsonField<PartialPricingGroupValues> =
                JsonMissing.of()
            private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var productTags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(selector: Selector) = apply {
                partialPricingGroupValues = selector.partialPricingGroupValues
                pricingGroupValues = selector.pricingGroupValues
                productId = selector.productId
                productTags = selector.productTags.map { it.toMutableList() }
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

            /**
             * List of product tags, rates matching any of the tags will be included in the
             * response.
             */
            fun productTags(productTags: List<String>) = productTags(JsonField.of(productTags))

            /**
             * List of product tags, rates matching any of the tags will be included in the
             * response.
             */
            fun productTags(productTags: JsonField<List<String>>) = apply {
                this.productTags = productTags.map { it.toMutableList() }
            }

            /**
             * List of product tags, rates matching any of the tags will be included in the
             * response.
             */
            fun addProductTag(productTag: String) = apply {
                productTags =
                    (productTags ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(productTag)
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

            fun build(): Selector =
                Selector(
                    partialPricingGroupValues,
                    pricingGroupValues,
                    productId,
                    (productTags ?: JsonMissing.of()).map { it.toImmutable() },
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
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

        return /* spotless:off */ other is ContractRetrieveRateScheduleParams && limit == other.limit && nextPage == other.nextPage && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(limit, nextPage, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractRetrieveRateScheduleParams{limit=$limit, nextPage=$nextPage, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
