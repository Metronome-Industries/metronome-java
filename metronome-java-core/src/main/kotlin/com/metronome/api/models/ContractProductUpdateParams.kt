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

/** Update a product */
class ContractProductUpdateParams
constructor(
    private val body: ContractProductUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** ID of the product to update */
    fun productId(): String = body.productId()

    /**
     * Timestamp representing when the update should go into effect. It must be on an hour boundary
     * (e.g. 1:00, not 1:30).
     */
    fun startingAt(): OffsetDateTime = body.startingAt()

    /**
     * Available for USAGE products only. If not provided, defaults to product's current billable
     * metric.
     */
    fun billableMetricId(): Optional<String> = body.billableMetricId()

    /**
     * Available for COMPOSITE products only. If not provided, defaults to product's current
     * composite_product_ids.
     */
    fun compositeProductIds(): Optional<List<String>> = body.compositeProductIds()

    /**
     * Available for COMPOSITE products only. If not provided, defaults to product's current
     * composite_tags.
     */
    fun compositeTags(): Optional<List<String>> = body.compositeTags()

    /**
     * Beta feature only available for composite products. If true, products with $0 will not be
     * included when computing composite usage. Defaults to false
     */
    fun excludeFreeUsage(): Optional<Boolean> = body.excludeFreeUsage()

    /**
     * Defaults to product's current refundability status. This field's availability is dependent on
     * your client's configuration.
     */
    fun isRefundable(): Optional<Boolean> = body.isRefundable()

    /** displayed on invoices. If not provided, defaults to product's current name. */
    fun name(): Optional<String> = body.name()

    /**
     * If not provided, defaults to product's current netsuite_internal_item_id. This field's
     * availability is dependent on your client's configuration.
     */
    fun netsuiteInternalItemId(): Optional<String> = body.netsuiteInternalItemId()

    /**
     * Available for USAGE and COMPOSITE products only. If not provided, defaults to product's
     * current netsuite_overage_item_id. This field's availability is dependent on your client's
     * configuration.
     */
    fun netsuiteOverageItemId(): Optional<String> = body.netsuiteOverageItemId()

    /**
     * For USAGE products only. Groups usage line items on invoices. The superset of values in the
     * pricing group key and presentation group key must be set as one compound group key on the
     * billable metric.
     */
    fun presentationGroupKey(): Optional<List<String>> = body.presentationGroupKey()

    /**
     * For USAGE products only. If set, pricing for this product will be determined for each
     * pricing_group_key value, as opposed to the product as a whole. The superset of values in the
     * pricing group key and presentation group key must be set as one compound group key on the
     * billable metric.
     */
    fun pricingGroupKey(): Optional<List<String>> = body.pricingGroupKey()

    /**
     * Optional. Only valid for USAGE products. If provided, the quantity will be converted using
     * the provided conversion factor and operation. For example, if the operation is "multiply" and
     * the conversion factor is 100, then the quantity will be multiplied by 100. This can be used
     * in cases where data is sent in one unit and priced in another. For example, data could be
     * sent in MB and priced in GB. In this case, the conversion factor would be 1024 and the
     * operation would be "divide".
     */
    fun quantityConversion(): Optional<QuantityConversion> = body.quantityConversion()

    /**
     * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using the
     * provided rounding method and decimal places. For example, if the method is "round up" and the
     * decimal places is 0, then the quantity will be rounded up to the nearest integer.
     */
    fun quantityRounding(): Optional<QuantityRounding> = body.quantityRounding()

    /** If not provided, defaults to product's current tags */
    fun tags(): Optional<List<String>> = body.tags()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): ContractProductUpdateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractProductUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("product_id") private val productId: String,
        @JsonProperty("starting_at") private val startingAt: OffsetDateTime,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("composite_product_ids") private val compositeProductIds: List<String>?,
        @JsonProperty("composite_tags") private val compositeTags: List<String>?,
        @JsonProperty("exclude_free_usage") private val excludeFreeUsage: Boolean?,
        @JsonProperty("is_refundable") private val isRefundable: Boolean?,
        @JsonProperty("name") private val name: String?,
        @JsonProperty("netsuite_internal_item_id") private val netsuiteInternalItemId: String?,
        @JsonProperty("netsuite_overage_item_id") private val netsuiteOverageItemId: String?,
        @JsonProperty("presentation_group_key") private val presentationGroupKey: List<String>?,
        @JsonProperty("pricing_group_key") private val pricingGroupKey: List<String>?,
        @JsonProperty("quantity_conversion") private val quantityConversion: QuantityConversion?,
        @JsonProperty("quantity_rounding") private val quantityRounding: QuantityRounding?,
        @JsonProperty("tags") private val tags: List<String>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the product to update */
        @JsonProperty("product_id") fun productId(): String = productId

        /**
         * Timestamp representing when the update should go into effect. It must be on an hour
         * boundary (e.g. 1:00, not 1:30).
         */
        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime = startingAt

        /**
         * Available for USAGE products only. If not provided, defaults to product's current
         * billable metric.
         */
        @JsonProperty("billable_metric_id")
        fun billableMetricId(): Optional<String> = Optional.ofNullable(billableMetricId)

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_product_ids.
         */
        @JsonProperty("composite_product_ids")
        fun compositeProductIds(): Optional<List<String>> = Optional.ofNullable(compositeProductIds)

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_tags.
         */
        @JsonProperty("composite_tags")
        fun compositeTags(): Optional<List<String>> = Optional.ofNullable(compositeTags)

        /**
         * Beta feature only available for composite products. If true, products with $0 will not be
         * included when computing composite usage. Defaults to false
         */
        @JsonProperty("exclude_free_usage")
        fun excludeFreeUsage(): Optional<Boolean> = Optional.ofNullable(excludeFreeUsage)

        /**
         * Defaults to product's current refundability status. This field's availability is
         * dependent on your client's configuration.
         */
        @JsonProperty("is_refundable")
        fun isRefundable(): Optional<Boolean> = Optional.ofNullable(isRefundable)

        /** displayed on invoices. If not provided, defaults to product's current name. */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        /**
         * If not provided, defaults to product's current netsuite_internal_item_id. This field's
         * availability is dependent on your client's configuration.
         */
        @JsonProperty("netsuite_internal_item_id")
        fun netsuiteInternalItemId(): Optional<String> = Optional.ofNullable(netsuiteInternalItemId)

        /**
         * Available for USAGE and COMPOSITE products only. If not provided, defaults to product's
         * current netsuite_overage_item_id. This field's availability is dependent on your client's
         * configuration.
         */
        @JsonProperty("netsuite_overage_item_id")
        fun netsuiteOverageItemId(): Optional<String> = Optional.ofNullable(netsuiteOverageItemId)

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        @JsonProperty("presentation_group_key")
        fun presentationGroupKey(): Optional<List<String>> =
            Optional.ofNullable(presentationGroupKey)

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        @JsonProperty("pricing_group_key")
        fun pricingGroupKey(): Optional<List<String>> = Optional.ofNullable(pricingGroupKey)

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be converted
         * using the provided conversion factor and operation. For example, if the operation is
         * "multiply" and the conversion factor is 100, then the quantity will be multiplied by 100.
         * This can be used in cases where data is sent in one unit and priced in another. For
         * example, data could be sent in MB and priced in GB. In this case, the conversion factor
         * would be 1024 and the operation would be "divide".
         */
        @JsonProperty("quantity_conversion")
        fun quantityConversion(): Optional<QuantityConversion> =
            Optional.ofNullable(quantityConversion)

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using
         * the provided rounding method and decimal places. For example, if the method is "round up"
         * and the decimal places is 0, then the quantity will be rounded up to the nearest integer.
         */
        @JsonProperty("quantity_rounding")
        fun quantityRounding(): Optional<QuantityRounding> = Optional.ofNullable(quantityRounding)

        /** If not provided, defaults to product's current tags */
        @JsonProperty("tags") fun tags(): Optional<List<String>> = Optional.ofNullable(tags)

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
            private var compositeProductIds: MutableList<String>? = null
            private var compositeTags: MutableList<String>? = null
            private var excludeFreeUsage: Boolean? = null
            private var isRefundable: Boolean? = null
            private var name: String? = null
            private var netsuiteInternalItemId: String? = null
            private var netsuiteOverageItemId: String? = null
            private var presentationGroupKey: MutableList<String>? = null
            private var pricingGroupKey: MutableList<String>? = null
            private var quantityConversion: QuantityConversion? = null
            private var quantityRounding: QuantityRounding? = null
            private var tags: MutableList<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractProductUpdateBody: ContractProductUpdateBody) = apply {
                productId = contractProductUpdateBody.productId
                startingAt = contractProductUpdateBody.startingAt
                billableMetricId = contractProductUpdateBody.billableMetricId
                compositeProductIds = contractProductUpdateBody.compositeProductIds?.toMutableList()
                compositeTags = contractProductUpdateBody.compositeTags?.toMutableList()
                excludeFreeUsage = contractProductUpdateBody.excludeFreeUsage
                isRefundable = contractProductUpdateBody.isRefundable
                name = contractProductUpdateBody.name
                netsuiteInternalItemId = contractProductUpdateBody.netsuiteInternalItemId
                netsuiteOverageItemId = contractProductUpdateBody.netsuiteOverageItemId
                presentationGroupKey =
                    contractProductUpdateBody.presentationGroupKey?.toMutableList()
                pricingGroupKey = contractProductUpdateBody.pricingGroupKey?.toMutableList()
                quantityConversion = contractProductUpdateBody.quantityConversion
                quantityRounding = contractProductUpdateBody.quantityRounding
                tags = contractProductUpdateBody.tags?.toMutableList()
                additionalProperties = contractProductUpdateBody.additionalProperties.toMutableMap()
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
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * Available for USAGE products only. If not provided, defaults to product's current
             * billable metric.
             */
            fun billableMetricId(billableMetricId: Optional<String>) =
                billableMetricId(billableMetricId.orElse(null))

            /**
             * Available for COMPOSITE products only. If not provided, defaults to product's current
             * composite_product_ids.
             */
            fun compositeProductIds(compositeProductIds: List<String>?) = apply {
                this.compositeProductIds = compositeProductIds?.toMutableList()
            }

            /**
             * Available for COMPOSITE products only. If not provided, defaults to product's current
             * composite_product_ids.
             */
            fun compositeProductIds(compositeProductIds: Optional<List<String>>) =
                compositeProductIds(compositeProductIds.orElse(null))

            /**
             * Available for COMPOSITE products only. If not provided, defaults to product's current
             * composite_product_ids.
             */
            fun addCompositeProductId(compositeProductId: String) = apply {
                compositeProductIds =
                    (compositeProductIds ?: mutableListOf()).apply { add(compositeProductId) }
            }

            /**
             * Available for COMPOSITE products only. If not provided, defaults to product's current
             * composite_tags.
             */
            fun compositeTags(compositeTags: List<String>?) = apply {
                this.compositeTags = compositeTags?.toMutableList()
            }

            /**
             * Available for COMPOSITE products only. If not provided, defaults to product's current
             * composite_tags.
             */
            fun compositeTags(compositeTags: Optional<List<String>>) =
                compositeTags(compositeTags.orElse(null))

            /**
             * Available for COMPOSITE products only. If not provided, defaults to product's current
             * composite_tags.
             */
            fun addCompositeTag(compositeTag: String) = apply {
                compositeTags = (compositeTags ?: mutableListOf()).apply { add(compositeTag) }
            }

            /**
             * Beta feature only available for composite products. If true, products with $0 will
             * not be included when computing composite usage. Defaults to false
             */
            fun excludeFreeUsage(excludeFreeUsage: Boolean?) = apply {
                this.excludeFreeUsage = excludeFreeUsage
            }

            /**
             * Beta feature only available for composite products. If true, products with $0 will
             * not be included when computing composite usage. Defaults to false
             */
            fun excludeFreeUsage(excludeFreeUsage: Boolean) =
                excludeFreeUsage(excludeFreeUsage as Boolean?)

            /**
             * Beta feature only available for composite products. If true, products with $0 will
             * not be included when computing composite usage. Defaults to false
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun excludeFreeUsage(excludeFreeUsage: Optional<Boolean>) =
                excludeFreeUsage(excludeFreeUsage.orElse(null) as Boolean?)

            /**
             * Defaults to product's current refundability status. This field's availability is
             * dependent on your client's configuration.
             */
            fun isRefundable(isRefundable: Boolean?) = apply { this.isRefundable = isRefundable }

            /**
             * Defaults to product's current refundability status. This field's availability is
             * dependent on your client's configuration.
             */
            fun isRefundable(isRefundable: Boolean) = isRefundable(isRefundable as Boolean?)

            /**
             * Defaults to product's current refundability status. This field's availability is
             * dependent on your client's configuration.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun isRefundable(isRefundable: Optional<Boolean>) =
                isRefundable(isRefundable.orElse(null) as Boolean?)

            /** displayed on invoices. If not provided, defaults to product's current name. */
            fun name(name: String?) = apply { this.name = name }

            /** displayed on invoices. If not provided, defaults to product's current name. */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /**
             * If not provided, defaults to product's current netsuite_internal_item_id. This
             * field's availability is dependent on your client's configuration.
             */
            fun netsuiteInternalItemId(netsuiteInternalItemId: String?) = apply {
                this.netsuiteInternalItemId = netsuiteInternalItemId
            }

            /**
             * If not provided, defaults to product's current netsuite_internal_item_id. This
             * field's availability is dependent on your client's configuration.
             */
            fun netsuiteInternalItemId(netsuiteInternalItemId: Optional<String>) =
                netsuiteInternalItemId(netsuiteInternalItemId.orElse(null))

            /**
             * Available for USAGE and COMPOSITE products only. If not provided, defaults to
             * product's current netsuite_overage_item_id. This field's availability is dependent on
             * your client's configuration.
             */
            fun netsuiteOverageItemId(netsuiteOverageItemId: String?) = apply {
                this.netsuiteOverageItemId = netsuiteOverageItemId
            }

            /**
             * Available for USAGE and COMPOSITE products only. If not provided, defaults to
             * product's current netsuite_overage_item_id. This field's availability is dependent on
             * your client's configuration.
             */
            fun netsuiteOverageItemId(netsuiteOverageItemId: Optional<String>) =
                netsuiteOverageItemId(netsuiteOverageItemId.orElse(null))

            /**
             * For USAGE products only. Groups usage line items on invoices. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun presentationGroupKey(presentationGroupKey: List<String>?) = apply {
                this.presentationGroupKey = presentationGroupKey?.toMutableList()
            }

            /**
             * For USAGE products only. Groups usage line items on invoices. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun presentationGroupKey(presentationGroupKey: Optional<List<String>>) =
                presentationGroupKey(presentationGroupKey.orElse(null))

            /**
             * For USAGE products only. Groups usage line items on invoices. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun addPresentationGroupKey(presentationGroupKey: String) = apply {
                this.presentationGroupKey =
                    (this.presentationGroupKey ?: mutableListOf()).apply {
                        add(presentationGroupKey)
                    }
            }

            /**
             * For USAGE products only. If set, pricing for this product will be determined for each
             * pricing_group_key value, as opposed to the product as a whole. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun pricingGroupKey(pricingGroupKey: List<String>?) = apply {
                this.pricingGroupKey = pricingGroupKey?.toMutableList()
            }

            /**
             * For USAGE products only. If set, pricing for this product will be determined for each
             * pricing_group_key value, as opposed to the product as a whole. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun pricingGroupKey(pricingGroupKey: Optional<List<String>>) =
                pricingGroupKey(pricingGroupKey.orElse(null))

            /**
             * For USAGE products only. If set, pricing for this product will be determined for each
             * pricing_group_key value, as opposed to the product as a whole. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun addPricingGroupKey(pricingGroupKey: String) = apply {
                this.pricingGroupKey =
                    (this.pricingGroupKey ?: mutableListOf()).apply { add(pricingGroupKey) }
            }

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be converted
             * using the provided conversion factor and operation. For example, if the operation is
             * "multiply" and the conversion factor is 100, then the quantity will be multiplied
             * by 100. This can be used in cases where data is sent in one unit and priced in
             * another. For example, data could be sent in MB and priced in GB. In this case, the
             * conversion factor would be 1024 and the operation would be "divide".
             */
            fun quantityConversion(quantityConversion: QuantityConversion?) = apply {
                this.quantityConversion = quantityConversion
            }

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be converted
             * using the provided conversion factor and operation. For example, if the operation is
             * "multiply" and the conversion factor is 100, then the quantity will be multiplied
             * by 100. This can be used in cases where data is sent in one unit and priced in
             * another. For example, data could be sent in MB and priced in GB. In this case, the
             * conversion factor would be 1024 and the operation would be "divide".
             */
            fun quantityConversion(quantityConversion: Optional<QuantityConversion>) =
                quantityConversion(quantityConversion.orElse(null))

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be rounded
             * using the provided rounding method and decimal places. For example, if the method is
             * "round up" and the decimal places is 0, then the quantity will be rounded up to the
             * nearest integer.
             */
            fun quantityRounding(quantityRounding: QuantityRounding?) = apply {
                this.quantityRounding = quantityRounding
            }

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be rounded
             * using the provided rounding method and decimal places. For example, if the method is
             * "round up" and the decimal places is 0, then the quantity will be rounded up to the
             * nearest integer.
             */
            fun quantityRounding(quantityRounding: Optional<QuantityRounding>) =
                quantityRounding(quantityRounding.orElse(null))

            /** If not provided, defaults to product's current tags */
            fun tags(tags: List<String>?) = apply { this.tags = tags?.toMutableList() }

            /** If not provided, defaults to product's current tags */
            fun tags(tags: Optional<List<String>>) = tags(tags.orElse(null))

            /** If not provided, defaults to product's current tags */
            fun addTag(tag: String) = apply { tags = (tags ?: mutableListOf()).apply { add(tag) } }

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

            return /* spotless:off */ other is ContractProductUpdateBody && productId == other.productId && startingAt == other.startingAt && billableMetricId == other.billableMetricId && compositeProductIds == other.compositeProductIds && compositeTags == other.compositeTags && excludeFreeUsage == other.excludeFreeUsage && isRefundable == other.isRefundable && name == other.name && netsuiteInternalItemId == other.netsuiteInternalItemId && netsuiteOverageItemId == other.netsuiteOverageItemId && presentationGroupKey == other.presentationGroupKey && pricingGroupKey == other.pricingGroupKey && quantityConversion == other.quantityConversion && quantityRounding == other.quantityRounding && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, startingAt, billableMetricId, compositeProductIds, compositeTags, excludeFreeUsage, isRefundable, name, netsuiteInternalItemId, netsuiteOverageItemId, presentationGroupKey, pricingGroupKey, quantityConversion, quantityRounding, tags, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractProductUpdateBody{productId=$productId, startingAt=$startingAt, billableMetricId=$billableMetricId, compositeProductIds=$compositeProductIds, compositeTags=$compositeTags, excludeFreeUsage=$excludeFreeUsage, isRefundable=$isRefundable, name=$name, netsuiteInternalItemId=$netsuiteInternalItemId, netsuiteOverageItemId=$netsuiteOverageItemId, presentationGroupKey=$presentationGroupKey, pricingGroupKey=$pricingGroupKey, quantityConversion=$quantityConversion, quantityRounding=$quantityRounding, tags=$tags, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ContractProductUpdateBody.Builder = ContractProductUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractProductUpdateParams: ContractProductUpdateParams) = apply {
            body = contractProductUpdateParams.body.toBuilder()
            additionalHeaders = contractProductUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractProductUpdateParams.additionalQueryParams.toBuilder()
        }

        /** ID of the product to update */
        fun productId(productId: String) = apply { body.productId(productId) }

        /**
         * Timestamp representing when the update should go into effect. It must be on an hour
         * boundary (e.g. 1:00, not 1:30).
         */
        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

        /**
         * Available for USAGE products only. If not provided, defaults to product's current
         * billable metric.
         */
        fun billableMetricId(billableMetricId: String?) = apply {
            body.billableMetricId(billableMetricId)
        }

        /**
         * Available for USAGE products only. If not provided, defaults to product's current
         * billable metric.
         */
        fun billableMetricId(billableMetricId: Optional<String>) =
            billableMetricId(billableMetricId.orElse(null))

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_product_ids.
         */
        fun compositeProductIds(compositeProductIds: List<String>?) = apply {
            body.compositeProductIds(compositeProductIds)
        }

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_product_ids.
         */
        fun compositeProductIds(compositeProductIds: Optional<List<String>>) =
            compositeProductIds(compositeProductIds.orElse(null))

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_product_ids.
         */
        fun addCompositeProductId(compositeProductId: String) = apply {
            body.addCompositeProductId(compositeProductId)
        }

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_tags.
         */
        fun compositeTags(compositeTags: List<String>?) = apply {
            body.compositeTags(compositeTags)
        }

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_tags.
         */
        fun compositeTags(compositeTags: Optional<List<String>>) =
            compositeTags(compositeTags.orElse(null))

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_tags.
         */
        fun addCompositeTag(compositeTag: String) = apply { body.addCompositeTag(compositeTag) }

        /**
         * Beta feature only available for composite products. If true, products with $0 will not be
         * included when computing composite usage. Defaults to false
         */
        fun excludeFreeUsage(excludeFreeUsage: Boolean?) = apply {
            body.excludeFreeUsage(excludeFreeUsage)
        }

        /**
         * Beta feature only available for composite products. If true, products with $0 will not be
         * included when computing composite usage. Defaults to false
         */
        fun excludeFreeUsage(excludeFreeUsage: Boolean) =
            excludeFreeUsage(excludeFreeUsage as Boolean?)

        /**
         * Beta feature only available for composite products. If true, products with $0 will not be
         * included when computing composite usage. Defaults to false
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun excludeFreeUsage(excludeFreeUsage: Optional<Boolean>) =
            excludeFreeUsage(excludeFreeUsage.orElse(null) as Boolean?)

        /**
         * Defaults to product's current refundability status. This field's availability is
         * dependent on your client's configuration.
         */
        fun isRefundable(isRefundable: Boolean?) = apply { body.isRefundable(isRefundable) }

        /**
         * Defaults to product's current refundability status. This field's availability is
         * dependent on your client's configuration.
         */
        fun isRefundable(isRefundable: Boolean) = isRefundable(isRefundable as Boolean?)

        /**
         * Defaults to product's current refundability status. This field's availability is
         * dependent on your client's configuration.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun isRefundable(isRefundable: Optional<Boolean>) =
            isRefundable(isRefundable.orElse(null) as Boolean?)

        /** displayed on invoices. If not provided, defaults to product's current name. */
        fun name(name: String?) = apply { body.name(name) }

        /** displayed on invoices. If not provided, defaults to product's current name. */
        fun name(name: Optional<String>) = name(name.orElse(null))

        /**
         * If not provided, defaults to product's current netsuite_internal_item_id. This field's
         * availability is dependent on your client's configuration.
         */
        fun netsuiteInternalItemId(netsuiteInternalItemId: String?) = apply {
            body.netsuiteInternalItemId(netsuiteInternalItemId)
        }

        /**
         * If not provided, defaults to product's current netsuite_internal_item_id. This field's
         * availability is dependent on your client's configuration.
         */
        fun netsuiteInternalItemId(netsuiteInternalItemId: Optional<String>) =
            netsuiteInternalItemId(netsuiteInternalItemId.orElse(null))

        /**
         * Available for USAGE and COMPOSITE products only. If not provided, defaults to product's
         * current netsuite_overage_item_id. This field's availability is dependent on your client's
         * configuration.
         */
        fun netsuiteOverageItemId(netsuiteOverageItemId: String?) = apply {
            body.netsuiteOverageItemId(netsuiteOverageItemId)
        }

        /**
         * Available for USAGE and COMPOSITE products only. If not provided, defaults to product's
         * current netsuite_overage_item_id. This field's availability is dependent on your client's
         * configuration.
         */
        fun netsuiteOverageItemId(netsuiteOverageItemId: Optional<String>) =
            netsuiteOverageItemId(netsuiteOverageItemId.orElse(null))

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun presentationGroupKey(presentationGroupKey: List<String>?) = apply {
            body.presentationGroupKey(presentationGroupKey)
        }

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun presentationGroupKey(presentationGroupKey: Optional<List<String>>) =
            presentationGroupKey(presentationGroupKey.orElse(null))

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun addPresentationGroupKey(presentationGroupKey: String) = apply {
            body.addPresentationGroupKey(presentationGroupKey)
        }

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun pricingGroupKey(pricingGroupKey: List<String>?) = apply {
            body.pricingGroupKey(pricingGroupKey)
        }

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun pricingGroupKey(pricingGroupKey: Optional<List<String>>) =
            pricingGroupKey(pricingGroupKey.orElse(null))

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun addPricingGroupKey(pricingGroupKey: String) = apply {
            body.addPricingGroupKey(pricingGroupKey)
        }

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be converted
         * using the provided conversion factor and operation. For example, if the operation is
         * "multiply" and the conversion factor is 100, then the quantity will be multiplied by 100.
         * This can be used in cases where data is sent in one unit and priced in another. For
         * example, data could be sent in MB and priced in GB. In this case, the conversion factor
         * would be 1024 and the operation would be "divide".
         */
        fun quantityConversion(quantityConversion: QuantityConversion?) = apply {
            body.quantityConversion(quantityConversion)
        }

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be converted
         * using the provided conversion factor and operation. For example, if the operation is
         * "multiply" and the conversion factor is 100, then the quantity will be multiplied by 100.
         * This can be used in cases where data is sent in one unit and priced in another. For
         * example, data could be sent in MB and priced in GB. In this case, the conversion factor
         * would be 1024 and the operation would be "divide".
         */
        fun quantityConversion(quantityConversion: Optional<QuantityConversion>) =
            quantityConversion(quantityConversion.orElse(null))

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using
         * the provided rounding method and decimal places. For example, if the method is "round up"
         * and the decimal places is 0, then the quantity will be rounded up to the nearest integer.
         */
        fun quantityRounding(quantityRounding: QuantityRounding?) = apply {
            body.quantityRounding(quantityRounding)
        }

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using
         * the provided rounding method and decimal places. For example, if the method is "round up"
         * and the decimal places is 0, then the quantity will be rounded up to the nearest integer.
         */
        fun quantityRounding(quantityRounding: Optional<QuantityRounding>) =
            quantityRounding(quantityRounding.orElse(null))

        /** If not provided, defaults to product's current tags */
        fun tags(tags: List<String>?) = apply { body.tags(tags) }

        /** If not provided, defaults to product's current tags */
        fun tags(tags: Optional<List<String>>) = tags(tags.orElse(null))

        /** If not provided, defaults to product's current tags */
        fun addTag(tag: String) = apply { body.addTag(tag) }

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

        fun build(): ContractProductUpdateParams =
            ContractProductUpdateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractProductUpdateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractProductUpdateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
