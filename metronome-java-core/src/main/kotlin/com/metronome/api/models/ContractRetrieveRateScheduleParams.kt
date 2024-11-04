// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ContractRetrieveRateScheduleParams
constructor(
    private val contractId: String,
    private val customerId: String,
    private val limit: Long?,
    private val nextPage: String?,
    private val at: OffsetDateTime?,
    private val selectors: List<Selector>?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun contractId(): String = contractId

    fun customerId(): String = customerId

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun at(): Optional<OffsetDateTime> = Optional.ofNullable(at)

    fun selectors(): Optional<List<Selector>> = Optional.ofNullable(selectors)

    @JvmSynthetic
    internal fun getBody(): ContractRetrieveRateScheduleBody {
        return ContractRetrieveRateScheduleBody(
            contractId,
            customerId,
            at,
            selectors,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.nextPage?.let { params.put("next_page", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    @JsonDeserialize(builder = ContractRetrieveRateScheduleBody.Builder::class)
    @NoAutoDetect
    class ContractRetrieveRateScheduleBody
    internal constructor(
        private val contractId: String?,
        private val customerId: String?,
        private val at: OffsetDateTime?,
        private val selectors: List<Selector>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** ID of the contract to get the rate schedule for. */
        @JsonProperty("contract_id") fun contractId(): String? = contractId

        /** ID of the customer for whose contract to get the rate schedule for. */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /**
         * optional timestamp which overlaps with the returned rate schedule segments. When not
         * specified, the current timestamp will be used.
         */
        @JsonProperty("at") fun at(): OffsetDateTime? = at

        /**
         * List of rate selectors, rates matching ANY of the selectors will be included in the
         * response. Passing no selectors will result in all rates being returned.
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

            private var contractId: String? = null
            private var customerId: String? = null
            private var at: OffsetDateTime? = null
            private var selectors: List<Selector>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractRetrieveRateScheduleBody: ContractRetrieveRateScheduleBody) =
                apply {
                    this.contractId = contractRetrieveRateScheduleBody.contractId
                    this.customerId = contractRetrieveRateScheduleBody.customerId
                    this.at = contractRetrieveRateScheduleBody.at
                    this.selectors = contractRetrieveRateScheduleBody.selectors
                    additionalProperties(contractRetrieveRateScheduleBody.additionalProperties)
                }

            /** ID of the contract to get the rate schedule for. */
            @JsonProperty("contract_id")
            fun contractId(contractId: String) = apply { this.contractId = contractId }

            /** ID of the customer for whose contract to get the rate schedule for. */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * optional timestamp which overlaps with the returned rate schedule segments. When not
             * specified, the current timestamp will be used.
             */
            @JsonProperty("at") fun at(at: OffsetDateTime) = apply { this.at = at }

            /**
             * List of rate selectors, rates matching ANY of the selectors will be included in the
             * response. Passing no selectors will result in all rates being returned.
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

            fun build(): ContractRetrieveRateScheduleBody =
                ContractRetrieveRateScheduleBody(
                    checkNotNull(contractId) { "`contractId` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    at,
                    selectors?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRetrieveRateScheduleBody && this.contractId == other.contractId && this.customerId == other.customerId && this.at == other.at && this.selectors == other.selectors && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(contractId, customerId, at, selectors, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractRetrieveRateScheduleBody{contractId=$contractId, customerId=$customerId, at=$at, selectors=$selectors, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRetrieveRateScheduleParams && this.contractId == other.contractId && this.customerId == other.customerId && this.at == other.at && this.selectors == other.selectors && this.limit == other.limit && this.nextPage == other.nextPage && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(contractId, customerId, at, selectors, limit, nextPage, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractRetrieveRateScheduleParams{contractId=$contractId, customerId=$customerId, at=$at, selectors=$selectors, limit=$limit, nextPage=$nextPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var contractId: String? = null
        private var customerId: String? = null
        private var limit: Long? = null
        private var nextPage: String? = null
        private var at: OffsetDateTime? = null
        private var selectors: MutableList<Selector> = mutableListOf()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractRetrieveRateScheduleParams: ContractRetrieveRateScheduleParams) =
            apply {
                this.contractId = contractRetrieveRateScheduleParams.contractId
                this.customerId = contractRetrieveRateScheduleParams.customerId
                this.limit = contractRetrieveRateScheduleParams.limit
                this.nextPage = contractRetrieveRateScheduleParams.nextPage
                this.at = contractRetrieveRateScheduleParams.at
                this.selectors(contractRetrieveRateScheduleParams.selectors ?: listOf())
                additionalHeaders(contractRetrieveRateScheduleParams.additionalHeaders)
                additionalQueryParams(contractRetrieveRateScheduleParams.additionalQueryParams)
                additionalBodyProperties(
                    contractRetrieveRateScheduleParams.additionalBodyProperties
                )
            }

        /** ID of the contract to get the rate schedule for. */
        fun contractId(contractId: String) = apply { this.contractId = contractId }

        /** ID of the customer for whose contract to get the rate schedule for. */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** Max number of results that should be returned */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /**
         * optional timestamp which overlaps with the returned rate schedule segments. When not
         * specified, the current timestamp will be used.
         */
        fun at(at: OffsetDateTime) = apply { this.at = at }

        /**
         * List of rate selectors, rates matching ANY of the selectors will be included in the
         * response. Passing no selectors will result in all rates being returned.
         */
        fun selectors(selectors: List<Selector>) = apply {
            this.selectors.clear()
            this.selectors.addAll(selectors)
        }

        /**
         * List of rate selectors, rates matching ANY of the selectors will be included in the
         * response. Passing no selectors will result in all rates being returned.
         */
        fun addSelector(selector: Selector) = apply { this.selectors.add(selector) }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): ContractRetrieveRateScheduleParams =
            ContractRetrieveRateScheduleParams(
                checkNotNull(contractId) { "`contractId` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                limit,
                nextPage,
                at,
                if (selectors.size == 0) null else selectors.toImmutable(),
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
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
