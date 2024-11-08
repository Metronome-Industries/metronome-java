// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.util.Objects
import java.util.Optional

class ContractProductCreateParams
constructor(
    private val name: String,
    private val type: Type,
    private val billableMetricId: String?,
    private val compositeProductIds: List<String>?,
    private val compositeTags: List<String>?,
    private val excludeFreeUsage: Boolean?,
    private val isRefundable: Boolean?,
    private val netsuiteInternalItemId: String?,
    private val netsuiteOverageItemId: String?,
    private val presentationGroupKey: List<String>?,
    private val pricingGroupKey: List<String>?,
    private val quantityConversion: QuantityConversion?,
    private val quantityRounding: QuantityRounding?,
    private val tags: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun type(): Type = type

    fun billableMetricId(): Optional<String> = Optional.ofNullable(billableMetricId)

    fun compositeProductIds(): Optional<List<String>> = Optional.ofNullable(compositeProductIds)

    fun compositeTags(): Optional<List<String>> = Optional.ofNullable(compositeTags)

    fun excludeFreeUsage(): Optional<Boolean> = Optional.ofNullable(excludeFreeUsage)

    fun isRefundable(): Optional<Boolean> = Optional.ofNullable(isRefundable)

    fun netsuiteInternalItemId(): Optional<String> = Optional.ofNullable(netsuiteInternalItemId)

    fun netsuiteOverageItemId(): Optional<String> = Optional.ofNullable(netsuiteOverageItemId)

    fun presentationGroupKey(): Optional<List<String>> = Optional.ofNullable(presentationGroupKey)

    fun pricingGroupKey(): Optional<List<String>> = Optional.ofNullable(pricingGroupKey)

    fun quantityConversion(): Optional<QuantityConversion> = Optional.ofNullable(quantityConversion)

    fun quantityRounding(): Optional<QuantityRounding> = Optional.ofNullable(quantityRounding)

    fun tags(): Optional<List<String>> = Optional.ofNullable(tags)

    @JvmSynthetic
    internal fun getBody(): ContractProductCreateBody {
        return ContractProductCreateBody(
            name,
            type,
            billableMetricId,
            compositeProductIds,
            compositeTags,
            excludeFreeUsage,
            isRefundable,
            netsuiteInternalItemId,
            netsuiteOverageItemId,
            presentationGroupKey,
            pricingGroupKey,
            quantityConversion,
            quantityRounding,
            tags,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = ContractProductCreateBody.Builder::class)
    @NoAutoDetect
    class ContractProductCreateBody
    internal constructor(
        private val name: String?,
        private val type: Type?,
        private val billableMetricId: String?,
        private val compositeProductIds: List<String>?,
        private val compositeTags: List<String>?,
        private val excludeFreeUsage: Boolean?,
        private val isRefundable: Boolean?,
        private val netsuiteInternalItemId: String?,
        private val netsuiteOverageItemId: String?,
        private val presentationGroupKey: List<String>?,
        private val pricingGroupKey: List<String>?,
        private val quantityConversion: QuantityConversion?,
        private val quantityRounding: QuantityRounding?,
        private val tags: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** displayed on invoices */
        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("type") fun type(): Type? = type

        /** Required for USAGE products */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** Required for COMPOSITE products */
        @JsonProperty("composite_product_ids")
        fun compositeProductIds(): List<String>? = compositeProductIds

        /** Required for COMPOSITE products */
        @JsonProperty("composite_tags") fun compositeTags(): List<String>? = compositeTags

        /**
         * Beta feature only available for composite products. If true, products with $0 will not be
         * included when computing composite usage. Defaults to false
         */
        @JsonProperty("exclude_free_usage") fun excludeFreeUsage(): Boolean? = excludeFreeUsage

        /**
         * This field's availability is dependent on your client's configuration. Defaults to true.
         */
        @JsonProperty("is_refundable") fun isRefundable(): Boolean? = isRefundable

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_internal_item_id")
        fun netsuiteInternalItemId(): String? = netsuiteInternalItemId

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_overage_item_id")
        fun netsuiteOverageItemId(): String? = netsuiteOverageItemId

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        @JsonProperty("presentation_group_key")
        fun presentationGroupKey(): List<String>? = presentationGroupKey

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        @JsonProperty("pricing_group_key") fun pricingGroupKey(): List<String>? = pricingGroupKey

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be converted
         * using the provided conversion factor and operation. For example, if the operation is
         * "multiply" and the conversion factor is 100, then the quantity will be multiplied by 100.
         * This can be used in cases where data is sent in one unit and priced in another. For
         * example, data could be sent in MB and priced in GB. In this case, the conversion factor
         * would be 1024 and the operation would be "divide".
         */
        @JsonProperty("quantity_conversion")
        fun quantityConversion(): QuantityConversion? = quantityConversion

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using
         * the provided rounding method and decimal places. For example, if the method is "round up"
         * and the decimal places is 0, then the quantity will be rounded up to the nearest integer.
         */
        @JsonProperty("quantity_rounding")
        fun quantityRounding(): QuantityRounding? = quantityRounding

        @JsonProperty("tags") fun tags(): List<String>? = tags

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var type: Type? = null
            private var billableMetricId: String? = null
            private var compositeProductIds: List<String>? = null
            private var compositeTags: List<String>? = null
            private var excludeFreeUsage: Boolean? = null
            private var isRefundable: Boolean? = null
            private var netsuiteInternalItemId: String? = null
            private var netsuiteOverageItemId: String? = null
            private var presentationGroupKey: List<String>? = null
            private var pricingGroupKey: List<String>? = null
            private var quantityConversion: QuantityConversion? = null
            private var quantityRounding: QuantityRounding? = null
            private var tags: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractProductCreateBody: ContractProductCreateBody) = apply {
                this.name = contractProductCreateBody.name
                this.type = contractProductCreateBody.type
                this.billableMetricId = contractProductCreateBody.billableMetricId
                this.compositeProductIds = contractProductCreateBody.compositeProductIds
                this.compositeTags = contractProductCreateBody.compositeTags
                this.excludeFreeUsage = contractProductCreateBody.excludeFreeUsage
                this.isRefundable = contractProductCreateBody.isRefundable
                this.netsuiteInternalItemId = contractProductCreateBody.netsuiteInternalItemId
                this.netsuiteOverageItemId = contractProductCreateBody.netsuiteOverageItemId
                this.presentationGroupKey = contractProductCreateBody.presentationGroupKey
                this.pricingGroupKey = contractProductCreateBody.pricingGroupKey
                this.quantityConversion = contractProductCreateBody.quantityConversion
                this.quantityRounding = contractProductCreateBody.quantityRounding
                this.tags = contractProductCreateBody.tags
                additionalProperties(contractProductCreateBody.additionalProperties)
            }

            /** displayed on invoices */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /** Required for USAGE products */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** Required for COMPOSITE products */
            @JsonProperty("composite_product_ids")
            fun compositeProductIds(compositeProductIds: List<String>) = apply {
                this.compositeProductIds = compositeProductIds
            }

            /** Required for COMPOSITE products */
            @JsonProperty("composite_tags")
            fun compositeTags(compositeTags: List<String>) = apply {
                this.compositeTags = compositeTags
            }

            /**
             * Beta feature only available for composite products. If true, products with $0 will
             * not be included when computing composite usage. Defaults to false
             */
            @JsonProperty("exclude_free_usage")
            fun excludeFreeUsage(excludeFreeUsage: Boolean) = apply {
                this.excludeFreeUsage = excludeFreeUsage
            }

            /**
             * This field's availability is dependent on your client's configuration. Defaults to
             * true.
             */
            @JsonProperty("is_refundable")
            fun isRefundable(isRefundable: Boolean) = apply { this.isRefundable = isRefundable }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_internal_item_id")
            fun netsuiteInternalItemId(netsuiteInternalItemId: String) = apply {
                this.netsuiteInternalItemId = netsuiteInternalItemId
            }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_overage_item_id")
            fun netsuiteOverageItemId(netsuiteOverageItemId: String) = apply {
                this.netsuiteOverageItemId = netsuiteOverageItemId
            }

            /**
             * For USAGE products only. Groups usage line items on invoices. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            @JsonProperty("presentation_group_key")
            fun presentationGroupKey(presentationGroupKey: List<String>) = apply {
                this.presentationGroupKey = presentationGroupKey
            }

            /**
             * For USAGE products only. If set, pricing for this product will be determined for each
             * pricing_group_key value, as opposed to the product as a whole. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            @JsonProperty("pricing_group_key")
            fun pricingGroupKey(pricingGroupKey: List<String>) = apply {
                this.pricingGroupKey = pricingGroupKey
            }

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be converted
             * using the provided conversion factor and operation. For example, if the operation is
             * "multiply" and the conversion factor is 100, then the quantity will be multiplied
             * by 100. This can be used in cases where data is sent in one unit and priced in
             * another. For example, data could be sent in MB and priced in GB. In this case, the
             * conversion factor would be 1024 and the operation would be "divide".
             */
            @JsonProperty("quantity_conversion")
            fun quantityConversion(quantityConversion: QuantityConversion) = apply {
                this.quantityConversion = quantityConversion
            }

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be rounded
             * using the provided rounding method and decimal places. For example, if the method is
             * "round up" and the decimal places is 0, then the quantity will be rounded up to the
             * nearest integer.
             */
            @JsonProperty("quantity_rounding")
            fun quantityRounding(quantityRounding: QuantityRounding) = apply {
                this.quantityRounding = quantityRounding
            }

            @JsonProperty("tags") fun tags(tags: List<String>) = apply { this.tags = tags }

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

            fun build(): ContractProductCreateBody =
                ContractProductCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(type) { "`type` is required but was not set" },
                    billableMetricId,
                    compositeProductIds?.toImmutable(),
                    compositeTags?.toImmutable(),
                    excludeFreeUsage,
                    isRefundable,
                    netsuiteInternalItemId,
                    netsuiteOverageItemId,
                    presentationGroupKey?.toImmutable(),
                    pricingGroupKey?.toImmutable(),
                    quantityConversion,
                    quantityRounding,
                    tags?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractProductCreateBody && this.name == other.name && this.type == other.type && this.billableMetricId == other.billableMetricId && this.compositeProductIds == other.compositeProductIds && this.compositeTags == other.compositeTags && this.excludeFreeUsage == other.excludeFreeUsage && this.isRefundable == other.isRefundable && this.netsuiteInternalItemId == other.netsuiteInternalItemId && this.netsuiteOverageItemId == other.netsuiteOverageItemId && this.presentationGroupKey == other.presentationGroupKey && this.pricingGroupKey == other.pricingGroupKey && this.quantityConversion == other.quantityConversion && this.quantityRounding == other.quantityRounding && this.tags == other.tags && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, type, billableMetricId, compositeProductIds, compositeTags, excludeFreeUsage, isRefundable, netsuiteInternalItemId, netsuiteOverageItemId, presentationGroupKey, pricingGroupKey, quantityConversion, quantityRounding, tags, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractProductCreateBody{name=$name, type=$type, billableMetricId=$billableMetricId, compositeProductIds=$compositeProductIds, compositeTags=$compositeTags, excludeFreeUsage=$excludeFreeUsage, isRefundable=$isRefundable, netsuiteInternalItemId=$netsuiteInternalItemId, netsuiteOverageItemId=$netsuiteOverageItemId, presentationGroupKey=$presentationGroupKey, pricingGroupKey=$pricingGroupKey, quantityConversion=$quantityConversion, quantityRounding=$quantityRounding, tags=$tags, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractProductCreateParams && this.name == other.name && this.type == other.type && this.billableMetricId == other.billableMetricId && this.compositeProductIds == other.compositeProductIds && this.compositeTags == other.compositeTags && this.excludeFreeUsage == other.excludeFreeUsage && this.isRefundable == other.isRefundable && this.netsuiteInternalItemId == other.netsuiteInternalItemId && this.netsuiteOverageItemId == other.netsuiteOverageItemId && this.presentationGroupKey == other.presentationGroupKey && this.pricingGroupKey == other.pricingGroupKey && this.quantityConversion == other.quantityConversion && this.quantityRounding == other.quantityRounding && this.tags == other.tags && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(name, type, billableMetricId, compositeProductIds, compositeTags, excludeFreeUsage, isRefundable, netsuiteInternalItemId, netsuiteOverageItemId, presentationGroupKey, pricingGroupKey, quantityConversion, quantityRounding, tags, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractProductCreateParams{name=$name, type=$type, billableMetricId=$billableMetricId, compositeProductIds=$compositeProductIds, compositeTags=$compositeTags, excludeFreeUsage=$excludeFreeUsage, isRefundable=$isRefundable, netsuiteInternalItemId=$netsuiteInternalItemId, netsuiteOverageItemId=$netsuiteOverageItemId, presentationGroupKey=$presentationGroupKey, pricingGroupKey=$pricingGroupKey, quantityConversion=$quantityConversion, quantityRounding=$quantityRounding, tags=$tags, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var type: Type? = null
        private var billableMetricId: String? = null
        private var compositeProductIds: MutableList<String> = mutableListOf()
        private var compositeTags: MutableList<String> = mutableListOf()
        private var excludeFreeUsage: Boolean? = null
        private var isRefundable: Boolean? = null
        private var netsuiteInternalItemId: String? = null
        private var netsuiteOverageItemId: String? = null
        private var presentationGroupKey: MutableList<String> = mutableListOf()
        private var pricingGroupKey: MutableList<String> = mutableListOf()
        private var quantityConversion: QuantityConversion? = null
        private var quantityRounding: QuantityRounding? = null
        private var tags: MutableList<String> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractProductCreateParams: ContractProductCreateParams) = apply {
            this.name = contractProductCreateParams.name
            this.type = contractProductCreateParams.type
            this.billableMetricId = contractProductCreateParams.billableMetricId
            this.compositeProductIds(contractProductCreateParams.compositeProductIds ?: listOf())
            this.compositeTags(contractProductCreateParams.compositeTags ?: listOf())
            this.excludeFreeUsage = contractProductCreateParams.excludeFreeUsage
            this.isRefundable = contractProductCreateParams.isRefundable
            this.netsuiteInternalItemId = contractProductCreateParams.netsuiteInternalItemId
            this.netsuiteOverageItemId = contractProductCreateParams.netsuiteOverageItemId
            this.presentationGroupKey(contractProductCreateParams.presentationGroupKey ?: listOf())
            this.pricingGroupKey(contractProductCreateParams.pricingGroupKey ?: listOf())
            this.quantityConversion = contractProductCreateParams.quantityConversion
            this.quantityRounding = contractProductCreateParams.quantityRounding
            this.tags(contractProductCreateParams.tags ?: listOf())
            additionalHeaders(contractProductCreateParams.additionalHeaders)
            additionalQueryParams(contractProductCreateParams.additionalQueryParams)
            additionalBodyProperties(contractProductCreateParams.additionalBodyProperties)
        }

        /** displayed on invoices */
        fun name(name: String) = apply { this.name = name }

        fun type(type: Type) = apply { this.type = type }

        /** Required for USAGE products */
        fun billableMetricId(billableMetricId: String) = apply {
            this.billableMetricId = billableMetricId
        }

        /** Required for COMPOSITE products */
        fun compositeProductIds(compositeProductIds: List<String>) = apply {
            this.compositeProductIds.clear()
            this.compositeProductIds.addAll(compositeProductIds)
        }

        /** Required for COMPOSITE products */
        fun addCompositeProductId(compositeProductId: String) = apply {
            this.compositeProductIds.add(compositeProductId)
        }

        /** Required for COMPOSITE products */
        fun compositeTags(compositeTags: List<String>) = apply {
            this.compositeTags.clear()
            this.compositeTags.addAll(compositeTags)
        }

        /** Required for COMPOSITE products */
        fun addCompositeTag(compositeTag: String) = apply { this.compositeTags.add(compositeTag) }

        /**
         * Beta feature only available for composite products. If true, products with $0 will not be
         * included when computing composite usage. Defaults to false
         */
        fun excludeFreeUsage(excludeFreeUsage: Boolean) = apply {
            this.excludeFreeUsage = excludeFreeUsage
        }

        /**
         * This field's availability is dependent on your client's configuration. Defaults to true.
         */
        fun isRefundable(isRefundable: Boolean) = apply { this.isRefundable = isRefundable }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteInternalItemId(netsuiteInternalItemId: String) = apply {
            this.netsuiteInternalItemId = netsuiteInternalItemId
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteOverageItemId(netsuiteOverageItemId: String) = apply {
            this.netsuiteOverageItemId = netsuiteOverageItemId
        }

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun presentationGroupKey(presentationGroupKey: List<String>) = apply {
            this.presentationGroupKey.clear()
            this.presentationGroupKey.addAll(presentationGroupKey)
        }

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun addPresentationGroupKey(presentationGroupKey: String) = apply {
            this.presentationGroupKey.add(presentationGroupKey)
        }

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun pricingGroupKey(pricingGroupKey: List<String>) = apply {
            this.pricingGroupKey.clear()
            this.pricingGroupKey.addAll(pricingGroupKey)
        }

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun addPricingGroupKey(pricingGroupKey: String) = apply {
            this.pricingGroupKey.add(pricingGroupKey)
        }

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be converted
         * using the provided conversion factor and operation. For example, if the operation is
         * "multiply" and the conversion factor is 100, then the quantity will be multiplied by 100.
         * This can be used in cases where data is sent in one unit and priced in another. For
         * example, data could be sent in MB and priced in GB. In this case, the conversion factor
         * would be 1024 and the operation would be "divide".
         */
        fun quantityConversion(quantityConversion: QuantityConversion) = apply {
            this.quantityConversion = quantityConversion
        }

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using
         * the provided rounding method and decimal places. For example, if the method is "round up"
         * and the decimal places is 0, then the quantity will be rounded up to the nearest integer.
         */
        fun quantityRounding(quantityRounding: QuantityRounding) = apply {
            this.quantityRounding = quantityRounding
        }

        fun tags(tags: List<String>) = apply {
            this.tags.clear()
            this.tags.addAll(tags)
        }

        fun addTag(tag: String) = apply { this.tags.add(tag) }

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

        fun build(): ContractProductCreateParams =
            ContractProductCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                billableMetricId,
                if (compositeProductIds.size == 0) null else compositeProductIds.toImmutable(),
                if (compositeTags.size == 0) null else compositeTags.toImmutable(),
                excludeFreeUsage,
                isRefundable,
                netsuiteInternalItemId,
                netsuiteOverageItemId,
                if (presentationGroupKey.size == 0) null else presentationGroupKey.toImmutable(),
                if (pricingGroupKey.size == 0) null else pricingGroupKey.toImmutable(),
                quantityConversion,
                quantityRounding,
                if (tags.size == 0) null else tags.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val FIXED = Type(JsonField.of("FIXED"))

            @JvmField val USAGE = Type(JsonField.of("USAGE"))

            @JvmField val COMPOSITE = Type(JsonField.of("COMPOSITE"))

            @JvmField val SUBSCRIPTION = Type(JsonField.of("SUBSCRIPTION"))

            @JvmField val PROFESSIONAL_SERVICE = Type(JsonField.of("PROFESSIONAL_SERVICE"))

            @JvmField val PRO_SERVICE = Type(JsonField.of("PRO_SERVICE"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            FIXED,
            USAGE,
            COMPOSITE,
            SUBSCRIPTION,
            PROFESSIONAL_SERVICE,
            PRO_SERVICE,
        }

        enum class Value {
            FIXED,
            USAGE,
            COMPOSITE,
            SUBSCRIPTION,
            PROFESSIONAL_SERVICE,
            PRO_SERVICE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FIXED -> Value.FIXED
                USAGE -> Value.USAGE
                COMPOSITE -> Value.COMPOSITE
                SUBSCRIPTION -> Value.SUBSCRIPTION
                PROFESSIONAL_SERVICE -> Value.PROFESSIONAL_SERVICE
                PRO_SERVICE -> Value.PRO_SERVICE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FIXED -> Known.FIXED
                USAGE -> Known.USAGE
                COMPOSITE -> Known.COMPOSITE
                SUBSCRIPTION -> Known.SUBSCRIPTION
                PROFESSIONAL_SERVICE -> Known.PROFESSIONAL_SERVICE
                PRO_SERVICE -> Known.PRO_SERVICE
                else -> throw MetronomeInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
