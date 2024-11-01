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

class ContractProductUpdateParams
constructor(
    private val productId: String,
    private val startingAt: OffsetDateTime,
    private val billableMetricId: String?,
    private val compositeProductIds: List<String>?,
    private val compositeTags: List<String>?,
    private val excludeFreeUsage: Boolean?,
    private val isRefundable: Boolean?,
    private val name: String?,
    private val netsuiteInternalItemId: String?,
    private val netsuiteOverageItemId: String?,
    private val presentationGroupKey: List<String>?,
    private val pricingGroupKey: List<String>?,
    private val quantityConversion: QuantityConversion?,
    private val quantityRounding: QuantityRounding?,
    private val tags: List<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun productId(): String = productId

    fun startingAt(): OffsetDateTime = startingAt

    fun billableMetricId(): Optional<String> = Optional.ofNullable(billableMetricId)

    fun compositeProductIds(): Optional<List<String>> = Optional.ofNullable(compositeProductIds)

    fun compositeTags(): Optional<List<String>> = Optional.ofNullable(compositeTags)

    fun excludeFreeUsage(): Optional<Boolean> = Optional.ofNullable(excludeFreeUsage)

    fun isRefundable(): Optional<Boolean> = Optional.ofNullable(isRefundable)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun netsuiteInternalItemId(): Optional<String> = Optional.ofNullable(netsuiteInternalItemId)

    fun netsuiteOverageItemId(): Optional<String> = Optional.ofNullable(netsuiteOverageItemId)

    fun presentationGroupKey(): Optional<List<String>> = Optional.ofNullable(presentationGroupKey)

    fun pricingGroupKey(): Optional<List<String>> = Optional.ofNullable(pricingGroupKey)

    fun quantityConversion(): Optional<QuantityConversion> = Optional.ofNullable(quantityConversion)

    fun quantityRounding(): Optional<QuantityRounding> = Optional.ofNullable(quantityRounding)

    fun tags(): Optional<List<String>> = Optional.ofNullable(tags)

    @JvmSynthetic
    internal fun getBody(): ContractProductUpdateBody {
        return ContractProductUpdateBody(
            productId,
            startingAt,
            billableMetricId,
            compositeProductIds,
            compositeTags,
            excludeFreeUsage,
            isRefundable,
            name,
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

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ContractProductUpdateBody.Builder::class)
    @NoAutoDetect
    class ContractProductUpdateBody
    internal constructor(
        private val productId: String?,
        private val startingAt: OffsetDateTime?,
        private val billableMetricId: String?,
        private val compositeProductIds: List<String>?,
        private val compositeTags: List<String>?,
        private val excludeFreeUsage: Boolean?,
        private val isRefundable: Boolean?,
        private val name: String?,
        private val netsuiteInternalItemId: String?,
        private val netsuiteOverageItemId: String?,
        private val presentationGroupKey: List<String>?,
        private val pricingGroupKey: List<String>?,
        private val quantityConversion: QuantityConversion?,
        private val quantityRounding: QuantityRounding?,
        private val tags: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** ID of the product to update */
        @JsonProperty("product_id") fun productId(): String? = productId

        /**
         * Timestamp representing when the update should go into effect. It must be on an hour
         * boundary (e.g. 1:00, not 1:30).
         */
        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

        /**
         * Available for USAGE products only. If not provided, defaults to product's current
         * billable metric.
         */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_product_ids.
         */
        @JsonProperty("composite_product_ids")
        fun compositeProductIds(): List<String>? = compositeProductIds

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_tags.
         */
        @JsonProperty("composite_tags") fun compositeTags(): List<String>? = compositeTags

        /**
         * Beta feature only available for composite products. If true, products with $0 will not be
         * included when computing composite usage. Defaults to false
         */
        @JsonProperty("exclude_free_usage") fun excludeFreeUsage(): Boolean? = excludeFreeUsage

        /**
         * Defaults to product's current refundability status. This field's availability is
         * dependent on your client's configuration.
         */
        @JsonProperty("is_refundable") fun isRefundable(): Boolean? = isRefundable

        /** displayed on invoices. If not provided, defaults to product's current name. */
        @JsonProperty("name") fun name(): String? = name

        /**
         * If not provided, defaults to product's current netsuite_internal_item_id. This field's
         * availability is dependent on your client's configuration.
         */
        @JsonProperty("netsuite_internal_item_id")
        fun netsuiteInternalItemId(): String? = netsuiteInternalItemId

        /**
         * Available for USAGE and COMPOSITE products only. If not provided, defaults to product's
         * current netsuite_overage_item_id. This field's availability is dependent on your client's
         * configuration.
         */
        @JsonProperty("netsuite_overage_item_id")
        fun netsuiteOverageItemId(): String? = netsuiteOverageItemId

        /** For USAGE products only. Groups usage line items on invoices. */
        @JsonProperty("presentation_group_key")
        fun presentationGroupKey(): List<String>? = presentationGroupKey

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole.
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

        /** If not provided, defaults to product's current tags */
        @JsonProperty("tags") fun tags(): List<String>? = tags

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var productId: String? = null
            private var startingAt: OffsetDateTime? = null
            private var billableMetricId: String? = null
            private var compositeProductIds: List<String>? = null
            private var compositeTags: List<String>? = null
            private var excludeFreeUsage: Boolean? = null
            private var isRefundable: Boolean? = null
            private var name: String? = null
            private var netsuiteInternalItemId: String? = null
            private var netsuiteOverageItemId: String? = null
            private var presentationGroupKey: List<String>? = null
            private var pricingGroupKey: List<String>? = null
            private var quantityConversion: QuantityConversion? = null
            private var quantityRounding: QuantityRounding? = null
            private var tags: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractProductUpdateBody: ContractProductUpdateBody) = apply {
                this.productId = contractProductUpdateBody.productId
                this.startingAt = contractProductUpdateBody.startingAt
                this.billableMetricId = contractProductUpdateBody.billableMetricId
                this.compositeProductIds = contractProductUpdateBody.compositeProductIds
                this.compositeTags = contractProductUpdateBody.compositeTags
                this.excludeFreeUsage = contractProductUpdateBody.excludeFreeUsage
                this.isRefundable = contractProductUpdateBody.isRefundable
                this.name = contractProductUpdateBody.name
                this.netsuiteInternalItemId = contractProductUpdateBody.netsuiteInternalItemId
                this.netsuiteOverageItemId = contractProductUpdateBody.netsuiteOverageItemId
                this.presentationGroupKey = contractProductUpdateBody.presentationGroupKey
                this.pricingGroupKey = contractProductUpdateBody.pricingGroupKey
                this.quantityConversion = contractProductUpdateBody.quantityConversion
                this.quantityRounding = contractProductUpdateBody.quantityRounding
                this.tags = contractProductUpdateBody.tags
                additionalProperties(contractProductUpdateBody.additionalProperties)
            }

            /** ID of the product to update */
            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

            /**
             * Timestamp representing when the update should go into effect. It must be on an hour
             * boundary (e.g. 1:00, not 1:30).
             */
            @JsonProperty("starting_at")
            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

            /**
             * Available for USAGE products only. If not provided, defaults to product's current
             * billable metric.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * Available for COMPOSITE products only. If not provided, defaults to product's current
             * composite_product_ids.
             */
            @JsonProperty("composite_product_ids")
            fun compositeProductIds(compositeProductIds: List<String>) = apply {
                this.compositeProductIds = compositeProductIds
            }

            /**
             * Available for COMPOSITE products only. If not provided, defaults to product's current
             * composite_tags.
             */
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
             * Defaults to product's current refundability status. This field's availability is
             * dependent on your client's configuration.
             */
            @JsonProperty("is_refundable")
            fun isRefundable(isRefundable: Boolean) = apply { this.isRefundable = isRefundable }

            /** displayed on invoices. If not provided, defaults to product's current name. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * If not provided, defaults to product's current netsuite_internal_item_id. This
             * field's availability is dependent on your client's configuration.
             */
            @JsonProperty("netsuite_internal_item_id")
            fun netsuiteInternalItemId(netsuiteInternalItemId: String) = apply {
                this.netsuiteInternalItemId = netsuiteInternalItemId
            }

            /**
             * Available for USAGE and COMPOSITE products only. If not provided, defaults to
             * product's current netsuite_overage_item_id. This field's availability is dependent on
             * your client's configuration.
             */
            @JsonProperty("netsuite_overage_item_id")
            fun netsuiteOverageItemId(netsuiteOverageItemId: String) = apply {
                this.netsuiteOverageItemId = netsuiteOverageItemId
            }

            /** For USAGE products only. Groups usage line items on invoices. */
            @JsonProperty("presentation_group_key")
            fun presentationGroupKey(presentationGroupKey: List<String>) = apply {
                this.presentationGroupKey = presentationGroupKey
            }

            /**
             * For USAGE products only. If set, pricing for this product will be determined for each
             * pricing_group_key value, as opposed to the product as a whole.
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

            /** If not provided, defaults to product's current tags */
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

            fun build(): ContractProductUpdateBody =
                ContractProductUpdateBody(
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                    billableMetricId,
                    compositeProductIds?.toImmutable(),
                    compositeTags?.toImmutable(),
                    excludeFreeUsage,
                    isRefundable,
                    name,
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

            return /* spotless:off */ other is ContractProductUpdateBody && this.productId == other.productId && this.startingAt == other.startingAt && this.billableMetricId == other.billableMetricId && this.compositeProductIds == other.compositeProductIds && this.compositeTags == other.compositeTags && this.excludeFreeUsage == other.excludeFreeUsage && this.isRefundable == other.isRefundable && this.name == other.name && this.netsuiteInternalItemId == other.netsuiteInternalItemId && this.netsuiteOverageItemId == other.netsuiteOverageItemId && this.presentationGroupKey == other.presentationGroupKey && this.pricingGroupKey == other.pricingGroupKey && this.quantityConversion == other.quantityConversion && this.quantityRounding == other.quantityRounding && this.tags == other.tags && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(productId, startingAt, billableMetricId, compositeProductIds, compositeTags, excludeFreeUsage, isRefundable, name, netsuiteInternalItemId, netsuiteOverageItemId, presentationGroupKey, pricingGroupKey, quantityConversion, quantityRounding, tags, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractProductUpdateBody{productId=$productId, startingAt=$startingAt, billableMetricId=$billableMetricId, compositeProductIds=$compositeProductIds, compositeTags=$compositeTags, excludeFreeUsage=$excludeFreeUsage, isRefundable=$isRefundable, name=$name, netsuiteInternalItemId=$netsuiteInternalItemId, netsuiteOverageItemId=$netsuiteOverageItemId, presentationGroupKey=$presentationGroupKey, pricingGroupKey=$pricingGroupKey, quantityConversion=$quantityConversion, quantityRounding=$quantityRounding, tags=$tags, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractProductUpdateParams && this.productId == other.productId && this.startingAt == other.startingAt && this.billableMetricId == other.billableMetricId && this.compositeProductIds == other.compositeProductIds && this.compositeTags == other.compositeTags && this.excludeFreeUsage == other.excludeFreeUsage && this.isRefundable == other.isRefundable && this.name == other.name && this.netsuiteInternalItemId == other.netsuiteInternalItemId && this.netsuiteOverageItemId == other.netsuiteOverageItemId && this.presentationGroupKey == other.presentationGroupKey && this.pricingGroupKey == other.pricingGroupKey && this.quantityConversion == other.quantityConversion && this.quantityRounding == other.quantityRounding && this.tags == other.tags && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(productId, startingAt, billableMetricId, compositeProductIds, compositeTags, excludeFreeUsage, isRefundable, name, netsuiteInternalItemId, netsuiteOverageItemId, presentationGroupKey, pricingGroupKey, quantityConversion, quantityRounding, tags, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractProductUpdateParams{productId=$productId, startingAt=$startingAt, billableMetricId=$billableMetricId, compositeProductIds=$compositeProductIds, compositeTags=$compositeTags, excludeFreeUsage=$excludeFreeUsage, isRefundable=$isRefundable, name=$name, netsuiteInternalItemId=$netsuiteInternalItemId, netsuiteOverageItemId=$netsuiteOverageItemId, presentationGroupKey=$presentationGroupKey, pricingGroupKey=$pricingGroupKey, quantityConversion=$quantityConversion, quantityRounding=$quantityRounding, tags=$tags, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var productId: String? = null
        private var startingAt: OffsetDateTime? = null
        private var billableMetricId: String? = null
        private var compositeProductIds: MutableList<String> = mutableListOf()
        private var compositeTags: MutableList<String> = mutableListOf()
        private var excludeFreeUsage: Boolean? = null
        private var isRefundable: Boolean? = null
        private var name: String? = null
        private var netsuiteInternalItemId: String? = null
        private var netsuiteOverageItemId: String? = null
        private var presentationGroupKey: MutableList<String> = mutableListOf()
        private var pricingGroupKey: MutableList<String> = mutableListOf()
        private var quantityConversion: QuantityConversion? = null
        private var quantityRounding: QuantityRounding? = null
        private var tags: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractProductUpdateParams: ContractProductUpdateParams) = apply {
            this.productId = contractProductUpdateParams.productId
            this.startingAt = contractProductUpdateParams.startingAt
            this.billableMetricId = contractProductUpdateParams.billableMetricId
            this.compositeProductIds(contractProductUpdateParams.compositeProductIds ?: listOf())
            this.compositeTags(contractProductUpdateParams.compositeTags ?: listOf())
            this.excludeFreeUsage = contractProductUpdateParams.excludeFreeUsage
            this.isRefundable = contractProductUpdateParams.isRefundable
            this.name = contractProductUpdateParams.name
            this.netsuiteInternalItemId = contractProductUpdateParams.netsuiteInternalItemId
            this.netsuiteOverageItemId = contractProductUpdateParams.netsuiteOverageItemId
            this.presentationGroupKey(contractProductUpdateParams.presentationGroupKey ?: listOf())
            this.pricingGroupKey(contractProductUpdateParams.pricingGroupKey ?: listOf())
            this.quantityConversion = contractProductUpdateParams.quantityConversion
            this.quantityRounding = contractProductUpdateParams.quantityRounding
            this.tags(contractProductUpdateParams.tags ?: listOf())
            additionalQueryParams(contractProductUpdateParams.additionalQueryParams)
            additionalHeaders(contractProductUpdateParams.additionalHeaders)
            additionalBodyProperties(contractProductUpdateParams.additionalBodyProperties)
        }

        /** ID of the product to update */
        fun productId(productId: String) = apply { this.productId = productId }

        /**
         * Timestamp representing when the update should go into effect. It must be on an hour
         * boundary (e.g. 1:00, not 1:30).
         */
        fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

        /**
         * Available for USAGE products only. If not provided, defaults to product's current
         * billable metric.
         */
        fun billableMetricId(billableMetricId: String) = apply {
            this.billableMetricId = billableMetricId
        }

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_product_ids.
         */
        fun compositeProductIds(compositeProductIds: List<String>) = apply {
            this.compositeProductIds.clear()
            this.compositeProductIds.addAll(compositeProductIds)
        }

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_product_ids.
         */
        fun addCompositeProductId(compositeProductId: String) = apply {
            this.compositeProductIds.add(compositeProductId)
        }

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_tags.
         */
        fun compositeTags(compositeTags: List<String>) = apply {
            this.compositeTags.clear()
            this.compositeTags.addAll(compositeTags)
        }

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_tags.
         */
        fun addCompositeTag(compositeTag: String) = apply { this.compositeTags.add(compositeTag) }

        /**
         * Beta feature only available for composite products. If true, products with $0 will not be
         * included when computing composite usage. Defaults to false
         */
        fun excludeFreeUsage(excludeFreeUsage: Boolean) = apply {
            this.excludeFreeUsage = excludeFreeUsage
        }

        /**
         * Defaults to product's current refundability status. This field's availability is
         * dependent on your client's configuration.
         */
        fun isRefundable(isRefundable: Boolean) = apply { this.isRefundable = isRefundable }

        /** displayed on invoices. If not provided, defaults to product's current name. */
        fun name(name: String) = apply { this.name = name }

        /**
         * If not provided, defaults to product's current netsuite_internal_item_id. This field's
         * availability is dependent on your client's configuration.
         */
        fun netsuiteInternalItemId(netsuiteInternalItemId: String) = apply {
            this.netsuiteInternalItemId = netsuiteInternalItemId
        }

        /**
         * Available for USAGE and COMPOSITE products only. If not provided, defaults to product's
         * current netsuite_overage_item_id. This field's availability is dependent on your client's
         * configuration.
         */
        fun netsuiteOverageItemId(netsuiteOverageItemId: String) = apply {
            this.netsuiteOverageItemId = netsuiteOverageItemId
        }

        /** For USAGE products only. Groups usage line items on invoices. */
        fun presentationGroupKey(presentationGroupKey: List<String>) = apply {
            this.presentationGroupKey.clear()
            this.presentationGroupKey.addAll(presentationGroupKey)
        }

        /** For USAGE products only. Groups usage line items on invoices. */
        fun addPresentationGroupKey(presentationGroupKey: String) = apply {
            this.presentationGroupKey.add(presentationGroupKey)
        }

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole.
         */
        fun pricingGroupKey(pricingGroupKey: List<String>) = apply {
            this.pricingGroupKey.clear()
            this.pricingGroupKey.addAll(pricingGroupKey)
        }

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole.
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

        /** If not provided, defaults to product's current tags */
        fun tags(tags: List<String>) = apply {
            this.tags.clear()
            this.tags.addAll(tags)
        }

        /** If not provided, defaults to product's current tags */
        fun addTag(tag: String) = apply { this.tags.add(tag) }

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

        fun build(): ContractProductUpdateParams =
            ContractProductUpdateParams(
                checkNotNull(productId) { "`productId` is required but was not set" },
                checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                billableMetricId,
                if (compositeProductIds.size == 0) null else compositeProductIds.toImmutable(),
                if (compositeTags.size == 0) null else compositeTags.toImmutable(),
                excludeFreeUsage,
                isRefundable,
                name,
                netsuiteInternalItemId,
                netsuiteOverageItemId,
                if (presentationGroupKey.size == 0) null else presentationGroupKey.toImmutable(),
                if (pricingGroupKey.size == 0) null else pricingGroupKey.toImmutable(),
                quantityConversion,
                quantityRounding,
                if (tags.size == 0) null else tags.toImmutable(),
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
