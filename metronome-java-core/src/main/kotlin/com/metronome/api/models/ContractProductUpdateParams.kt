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

/** Update a product */
class ContractProductUpdateParams
private constructor(
    private val body: ContractProductUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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

    /** ID of the product to update */
    fun _productId(): JsonField<String> = body._productId()

    /**
     * Timestamp representing when the update should go into effect. It must be on an hour boundary
     * (e.g. 1:00, not 1:30).
     */
    fun _startingAt(): JsonField<OffsetDateTime> = body._startingAt()

    /**
     * Available for USAGE products only. If not provided, defaults to product's current billable
     * metric.
     */
    fun _billableMetricId(): JsonField<String> = body._billableMetricId()

    /**
     * Available for COMPOSITE products only. If not provided, defaults to product's current
     * composite_product_ids.
     */
    fun _compositeProductIds(): JsonField<List<String>> = body._compositeProductIds()

    /**
     * Available for COMPOSITE products only. If not provided, defaults to product's current
     * composite_tags.
     */
    fun _compositeTags(): JsonField<List<String>> = body._compositeTags()

    /**
     * Beta feature only available for composite products. If true, products with $0 will not be
     * included when computing composite usage. Defaults to false
     */
    fun _excludeFreeUsage(): JsonField<Boolean> = body._excludeFreeUsage()

    /**
     * Defaults to product's current refundability status. This field's availability is dependent on
     * your client's configuration.
     */
    fun _isRefundable(): JsonField<Boolean> = body._isRefundable()

    /** displayed on invoices. If not provided, defaults to product's current name. */
    fun _name(): JsonField<String> = body._name()

    /**
     * If not provided, defaults to product's current netsuite_internal_item_id. This field's
     * availability is dependent on your client's configuration.
     */
    fun _netsuiteInternalItemId(): JsonField<String> = body._netsuiteInternalItemId()

    /**
     * Available for USAGE and COMPOSITE products only. If not provided, defaults to product's
     * current netsuite_overage_item_id. This field's availability is dependent on your client's
     * configuration.
     */
    fun _netsuiteOverageItemId(): JsonField<String> = body._netsuiteOverageItemId()

    /**
     * For USAGE products only. Groups usage line items on invoices. The superset of values in the
     * pricing group key and presentation group key must be set as one compound group key on the
     * billable metric.
     */
    fun _presentationGroupKey(): JsonField<List<String>> = body._presentationGroupKey()

    /**
     * For USAGE products only. If set, pricing for this product will be determined for each
     * pricing_group_key value, as opposed to the product as a whole. The superset of values in the
     * pricing group key and presentation group key must be set as one compound group key on the
     * billable metric.
     */
    fun _pricingGroupKey(): JsonField<List<String>> = body._pricingGroupKey()

    /**
     * Optional. Only valid for USAGE products. If provided, the quantity will be converted using
     * the provided conversion factor and operation. For example, if the operation is "multiply" and
     * the conversion factor is 100, then the quantity will be multiplied by 100. This can be used
     * in cases where data is sent in one unit and priced in another. For example, data could be
     * sent in MB and priced in GB. In this case, the conversion factor would be 1024 and the
     * operation would be "divide".
     */
    fun _quantityConversion(): JsonField<QuantityConversion> = body._quantityConversion()

    /**
     * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using the
     * provided rounding method and decimal places. For example, if the method is "round up" and the
     * decimal places is 0, then the quantity will be rounded up to the nearest integer.
     */
    fun _quantityRounding(): JsonField<QuantityRounding> = body._quantityRounding()

    /** If not provided, defaults to product's current tags */
    fun _tags(): JsonField<List<String>> = body._tags()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): ContractProductUpdateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractProductUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        private val billableMetricId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("composite_product_ids")
        @ExcludeMissing
        private val compositeProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("composite_tags")
        @ExcludeMissing
        private val compositeTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("exclude_free_usage")
        @ExcludeMissing
        private val excludeFreeUsage: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_refundable")
        @ExcludeMissing
        private val isRefundable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_internal_item_id")
        @ExcludeMissing
        private val netsuiteInternalItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_overage_item_id")
        @ExcludeMissing
        private val netsuiteOverageItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("presentation_group_key")
        @ExcludeMissing
        private val presentationGroupKey: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("pricing_group_key")
        @ExcludeMissing
        private val pricingGroupKey: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("quantity_conversion")
        @ExcludeMissing
        private val quantityConversion: JsonField<QuantityConversion> = JsonMissing.of(),
        @JsonProperty("quantity_rounding")
        @ExcludeMissing
        private val quantityRounding: JsonField<QuantityRounding> = JsonMissing.of(),
        @JsonProperty("tags")
        @ExcludeMissing
        private val tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the product to update */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * Timestamp representing when the update should go into effect. It must be on an hour
         * boundary (e.g. 1:00, not 1:30).
         */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /**
         * Available for USAGE products only. If not provided, defaults to product's current
         * billable metric.
         */
        fun billableMetricId(): Optional<String> =
            Optional.ofNullable(billableMetricId.getNullable("billable_metric_id"))

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_product_ids.
         */
        fun compositeProductIds(): Optional<List<String>> =
            Optional.ofNullable(compositeProductIds.getNullable("composite_product_ids"))

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_tags.
         */
        fun compositeTags(): Optional<List<String>> =
            Optional.ofNullable(compositeTags.getNullable("composite_tags"))

        /**
         * Beta feature only available for composite products. If true, products with $0 will not be
         * included when computing composite usage. Defaults to false
         */
        fun excludeFreeUsage(): Optional<Boolean> =
            Optional.ofNullable(excludeFreeUsage.getNullable("exclude_free_usage"))

        /**
         * Defaults to product's current refundability status. This field's availability is
         * dependent on your client's configuration.
         */
        fun isRefundable(): Optional<Boolean> =
            Optional.ofNullable(isRefundable.getNullable("is_refundable"))

        /** displayed on invoices. If not provided, defaults to product's current name. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * If not provided, defaults to product's current netsuite_internal_item_id. This field's
         * availability is dependent on your client's configuration.
         */
        fun netsuiteInternalItemId(): Optional<String> =
            Optional.ofNullable(netsuiteInternalItemId.getNullable("netsuite_internal_item_id"))

        /**
         * Available for USAGE and COMPOSITE products only. If not provided, defaults to product's
         * current netsuite_overage_item_id. This field's availability is dependent on your client's
         * configuration.
         */
        fun netsuiteOverageItemId(): Optional<String> =
            Optional.ofNullable(netsuiteOverageItemId.getNullable("netsuite_overage_item_id"))

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun presentationGroupKey(): Optional<List<String>> =
            Optional.ofNullable(presentationGroupKey.getNullable("presentation_group_key"))

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun pricingGroupKey(): Optional<List<String>> =
            Optional.ofNullable(pricingGroupKey.getNullable("pricing_group_key"))

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be converted
         * using the provided conversion factor and operation. For example, if the operation is
         * "multiply" and the conversion factor is 100, then the quantity will be multiplied by 100.
         * This can be used in cases where data is sent in one unit and priced in another. For
         * example, data could be sent in MB and priced in GB. In this case, the conversion factor
         * would be 1024 and the operation would be "divide".
         */
        fun quantityConversion(): Optional<QuantityConversion> =
            Optional.ofNullable(quantityConversion.getNullable("quantity_conversion"))

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using
         * the provided rounding method and decimal places. For example, if the method is "round up"
         * and the decimal places is 0, then the quantity will be rounded up to the nearest integer.
         */
        fun quantityRounding(): Optional<QuantityRounding> =
            Optional.ofNullable(quantityRounding.getNullable("quantity_rounding"))

        /** If not provided, defaults to product's current tags */
        fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

        /** ID of the product to update */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Timestamp representing when the update should go into effect. It must be on an hour
         * boundary (e.g. 1:00, not 1:30).
         */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /**
         * Available for USAGE products only. If not provided, defaults to product's current
         * billable metric.
         */
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        fun _billableMetricId(): JsonField<String> = billableMetricId

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_product_ids.
         */
        @JsonProperty("composite_product_ids")
        @ExcludeMissing
        fun _compositeProductIds(): JsonField<List<String>> = compositeProductIds

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_tags.
         */
        @JsonProperty("composite_tags")
        @ExcludeMissing
        fun _compositeTags(): JsonField<List<String>> = compositeTags

        /**
         * Beta feature only available for composite products. If true, products with $0 will not be
         * included when computing composite usage. Defaults to false
         */
        @JsonProperty("exclude_free_usage")
        @ExcludeMissing
        fun _excludeFreeUsage(): JsonField<Boolean> = excludeFreeUsage

        /**
         * Defaults to product's current refundability status. This field's availability is
         * dependent on your client's configuration.
         */
        @JsonProperty("is_refundable")
        @ExcludeMissing
        fun _isRefundable(): JsonField<Boolean> = isRefundable

        /** displayed on invoices. If not provided, defaults to product's current name. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * If not provided, defaults to product's current netsuite_internal_item_id. This field's
         * availability is dependent on your client's configuration.
         */
        @JsonProperty("netsuite_internal_item_id")
        @ExcludeMissing
        fun _netsuiteInternalItemId(): JsonField<String> = netsuiteInternalItemId

        /**
         * Available for USAGE and COMPOSITE products only. If not provided, defaults to product's
         * current netsuite_overage_item_id. This field's availability is dependent on your client's
         * configuration.
         */
        @JsonProperty("netsuite_overage_item_id")
        @ExcludeMissing
        fun _netsuiteOverageItemId(): JsonField<String> = netsuiteOverageItemId

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        @JsonProperty("presentation_group_key")
        @ExcludeMissing
        fun _presentationGroupKey(): JsonField<List<String>> = presentationGroupKey

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        @JsonProperty("pricing_group_key")
        @ExcludeMissing
        fun _pricingGroupKey(): JsonField<List<String>> = pricingGroupKey

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be converted
         * using the provided conversion factor and operation. For example, if the operation is
         * "multiply" and the conversion factor is 100, then the quantity will be multiplied by 100.
         * This can be used in cases where data is sent in one unit and priced in another. For
         * example, data could be sent in MB and priced in GB. In this case, the conversion factor
         * would be 1024 and the operation would be "divide".
         */
        @JsonProperty("quantity_conversion")
        @ExcludeMissing
        fun _quantityConversion(): JsonField<QuantityConversion> = quantityConversion

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using
         * the provided rounding method and decimal places. For example, if the method is "round up"
         * and the decimal places is 0, then the quantity will be rounded up to the nearest integer.
         */
        @JsonProperty("quantity_rounding")
        @ExcludeMissing
        fun _quantityRounding(): JsonField<QuantityRounding> = quantityRounding

        /** If not provided, defaults to product's current tags */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractProductUpdateBody = apply {
            if (validated) {
                return@apply
            }

            productId()
            startingAt()
            billableMetricId()
            compositeProductIds()
            compositeTags()
            excludeFreeUsage()
            isRefundable()
            name()
            netsuiteInternalItemId()
            netsuiteOverageItemId()
            presentationGroupKey()
            pricingGroupKey()
            quantityConversion().ifPresent { it.validate() }
            quantityRounding().ifPresent { it.validate() }
            tags()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContractProductUpdateBody]. */
        class Builder internal constructor() {

            private var productId: JsonField<String>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var billableMetricId: JsonField<String> = JsonMissing.of()
            private var compositeProductIds: JsonField<MutableList<String>>? = null
            private var compositeTags: JsonField<MutableList<String>>? = null
            private var excludeFreeUsage: JsonField<Boolean> = JsonMissing.of()
            private var isRefundable: JsonField<Boolean> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteInternalItemId: JsonField<String> = JsonMissing.of()
            private var netsuiteOverageItemId: JsonField<String> = JsonMissing.of()
            private var presentationGroupKey: JsonField<MutableList<String>>? = null
            private var pricingGroupKey: JsonField<MutableList<String>>? = null
            private var quantityConversion: JsonField<QuantityConversion> = JsonMissing.of()
            private var quantityRounding: JsonField<QuantityRounding> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractProductUpdateBody: ContractProductUpdateBody) = apply {
                productId = contractProductUpdateBody.productId
                startingAt = contractProductUpdateBody.startingAt
                billableMetricId = contractProductUpdateBody.billableMetricId
                compositeProductIds =
                    contractProductUpdateBody.compositeProductIds.map { it.toMutableList() }
                compositeTags = contractProductUpdateBody.compositeTags.map { it.toMutableList() }
                excludeFreeUsage = contractProductUpdateBody.excludeFreeUsage
                isRefundable = contractProductUpdateBody.isRefundable
                name = contractProductUpdateBody.name
                netsuiteInternalItemId = contractProductUpdateBody.netsuiteInternalItemId
                netsuiteOverageItemId = contractProductUpdateBody.netsuiteOverageItemId
                presentationGroupKey =
                    contractProductUpdateBody.presentationGroupKey.map { it.toMutableList() }
                pricingGroupKey =
                    contractProductUpdateBody.pricingGroupKey.map { it.toMutableList() }
                quantityConversion = contractProductUpdateBody.quantityConversion
                quantityRounding = contractProductUpdateBody.quantityRounding
                tags = contractProductUpdateBody.tags.map { it.toMutableList() }
                additionalProperties = contractProductUpdateBody.additionalProperties.toMutableMap()
            }

            /** ID of the product to update */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /** ID of the product to update */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * Timestamp representing when the update should go into effect. It must be on an hour
             * boundary (e.g. 1:00, not 1:30).
             */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /**
             * Timestamp representing when the update should go into effect. It must be on an hour
             * boundary (e.g. 1:00, not 1:30).
             */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            /**
             * Available for USAGE products only. If not provided, defaults to product's current
             * billable metric.
             */
            fun billableMetricId(billableMetricId: String) =
                billableMetricId(JsonField.of(billableMetricId))

            /**
             * Available for USAGE products only. If not provided, defaults to product's current
             * billable metric.
             */
            fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * Available for COMPOSITE products only. If not provided, defaults to product's current
             * composite_product_ids.
             */
            fun compositeProductIds(compositeProductIds: List<String>) =
                compositeProductIds(JsonField.of(compositeProductIds))

            /**
             * Available for COMPOSITE products only. If not provided, defaults to product's current
             * composite_product_ids.
             */
            fun compositeProductIds(compositeProductIds: JsonField<List<String>>) = apply {
                this.compositeProductIds = compositeProductIds.map { it.toMutableList() }
            }

            /**
             * Available for COMPOSITE products only. If not provided, defaults to product's current
             * composite_product_ids.
             */
            fun addCompositeProductId(compositeProductId: String) = apply {
                compositeProductIds =
                    (compositeProductIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(compositeProductId)
                    }
            }

            /**
             * Available for COMPOSITE products only. If not provided, defaults to product's current
             * composite_tags.
             */
            fun compositeTags(compositeTags: List<String>) =
                compositeTags(JsonField.of(compositeTags))

            /**
             * Available for COMPOSITE products only. If not provided, defaults to product's current
             * composite_tags.
             */
            fun compositeTags(compositeTags: JsonField<List<String>>) = apply {
                this.compositeTags = compositeTags.map { it.toMutableList() }
            }

            /**
             * Available for COMPOSITE products only. If not provided, defaults to product's current
             * composite_tags.
             */
            fun addCompositeTag(compositeTag: String) = apply {
                compositeTags =
                    (compositeTags ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(compositeTag)
                    }
            }

            /**
             * Beta feature only available for composite products. If true, products with $0 will
             * not be included when computing composite usage. Defaults to false
             */
            fun excludeFreeUsage(excludeFreeUsage: Boolean) =
                excludeFreeUsage(JsonField.of(excludeFreeUsage))

            /**
             * Beta feature only available for composite products. If true, products with $0 will
             * not be included when computing composite usage. Defaults to false
             */
            fun excludeFreeUsage(excludeFreeUsage: JsonField<Boolean>) = apply {
                this.excludeFreeUsage = excludeFreeUsage
            }

            /**
             * Defaults to product's current refundability status. This field's availability is
             * dependent on your client's configuration.
             */
            fun isRefundable(isRefundable: Boolean) = isRefundable(JsonField.of(isRefundable))

            /**
             * Defaults to product's current refundability status. This field's availability is
             * dependent on your client's configuration.
             */
            fun isRefundable(isRefundable: JsonField<Boolean>) = apply {
                this.isRefundable = isRefundable
            }

            /** displayed on invoices. If not provided, defaults to product's current name. */
            fun name(name: String) = name(JsonField.of(name))

            /** displayed on invoices. If not provided, defaults to product's current name. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * If not provided, defaults to product's current netsuite_internal_item_id. This
             * field's availability is dependent on your client's configuration.
             */
            fun netsuiteInternalItemId(netsuiteInternalItemId: String) =
                netsuiteInternalItemId(JsonField.of(netsuiteInternalItemId))

            /**
             * If not provided, defaults to product's current netsuite_internal_item_id. This
             * field's availability is dependent on your client's configuration.
             */
            fun netsuiteInternalItemId(netsuiteInternalItemId: JsonField<String>) = apply {
                this.netsuiteInternalItemId = netsuiteInternalItemId
            }

            /**
             * Available for USAGE and COMPOSITE products only. If not provided, defaults to
             * product's current netsuite_overage_item_id. This field's availability is dependent on
             * your client's configuration.
             */
            fun netsuiteOverageItemId(netsuiteOverageItemId: String) =
                netsuiteOverageItemId(JsonField.of(netsuiteOverageItemId))

            /**
             * Available for USAGE and COMPOSITE products only. If not provided, defaults to
             * product's current netsuite_overage_item_id. This field's availability is dependent on
             * your client's configuration.
             */
            fun netsuiteOverageItemId(netsuiteOverageItemId: JsonField<String>) = apply {
                this.netsuiteOverageItemId = netsuiteOverageItemId
            }

            /**
             * For USAGE products only. Groups usage line items on invoices. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun presentationGroupKey(presentationGroupKey: List<String>) =
                presentationGroupKey(JsonField.of(presentationGroupKey))

            /**
             * For USAGE products only. Groups usage line items on invoices. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun presentationGroupKey(presentationGroupKey: JsonField<List<String>>) = apply {
                this.presentationGroupKey = presentationGroupKey.map { it.toMutableList() }
            }

            /**
             * For USAGE products only. Groups usage line items on invoices. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun addPresentationGroupKey(presentationGroupKey: String) = apply {
                this.presentationGroupKey =
                    (this.presentationGroupKey ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(presentationGroupKey)
                    }
            }

            /**
             * For USAGE products only. If set, pricing for this product will be determined for each
             * pricing_group_key value, as opposed to the product as a whole. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun pricingGroupKey(pricingGroupKey: List<String>) =
                pricingGroupKey(JsonField.of(pricingGroupKey))

            /**
             * For USAGE products only. If set, pricing for this product will be determined for each
             * pricing_group_key value, as opposed to the product as a whole. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun pricingGroupKey(pricingGroupKey: JsonField<List<String>>) = apply {
                this.pricingGroupKey = pricingGroupKey.map { it.toMutableList() }
            }

            /**
             * For USAGE products only. If set, pricing for this product will be determined for each
             * pricing_group_key value, as opposed to the product as a whole. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun addPricingGroupKey(pricingGroupKey: String) = apply {
                this.pricingGroupKey =
                    (this.pricingGroupKey ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(pricingGroupKey)
                    }
            }

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be converted
             * using the provided conversion factor and operation. For example, if the operation is
             * "multiply" and the conversion factor is 100, then the quantity will be multiplied
             * by 100. This can be used in cases where data is sent in one unit and priced in
             * another. For example, data could be sent in MB and priced in GB. In this case, the
             * conversion factor would be 1024 and the operation would be "divide".
             */
            fun quantityConversion(quantityConversion: QuantityConversion?) =
                quantityConversion(JsonField.ofNullable(quantityConversion))

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
             * Optional. Only valid for USAGE products. If provided, the quantity will be converted
             * using the provided conversion factor and operation. For example, if the operation is
             * "multiply" and the conversion factor is 100, then the quantity will be multiplied
             * by 100. This can be used in cases where data is sent in one unit and priced in
             * another. For example, data could be sent in MB and priced in GB. In this case, the
             * conversion factor would be 1024 and the operation would be "divide".
             */
            fun quantityConversion(quantityConversion: JsonField<QuantityConversion>) = apply {
                this.quantityConversion = quantityConversion
            }

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be rounded
             * using the provided rounding method and decimal places. For example, if the method is
             * "round up" and the decimal places is 0, then the quantity will be rounded up to the
             * nearest integer.
             */
            fun quantityRounding(quantityRounding: QuantityRounding?) =
                quantityRounding(JsonField.ofNullable(quantityRounding))

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be rounded
             * using the provided rounding method and decimal places. For example, if the method is
             * "round up" and the decimal places is 0, then the quantity will be rounded up to the
             * nearest integer.
             */
            fun quantityRounding(quantityRounding: Optional<QuantityRounding>) =
                quantityRounding(quantityRounding.orElse(null))

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be rounded
             * using the provided rounding method and decimal places. For example, if the method is
             * "round up" and the decimal places is 0, then the quantity will be rounded up to the
             * nearest integer.
             */
            fun quantityRounding(quantityRounding: JsonField<QuantityRounding>) = apply {
                this.quantityRounding = quantityRounding
            }

            /** If not provided, defaults to product's current tags */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /** If not provided, defaults to product's current tags */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /** If not provided, defaults to product's current tags */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(tag)
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

            fun build(): ContractProductUpdateBody =
                ContractProductUpdateBody(
                    checkRequired("productId", productId),
                    checkRequired("startingAt", startingAt),
                    billableMetricId,
                    (compositeProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (compositeTags ?: JsonMissing.of()).map { it.toImmutable() },
                    excludeFreeUsage,
                    isRefundable,
                    name,
                    netsuiteInternalItemId,
                    netsuiteOverageItemId,
                    (presentationGroupKey ?: JsonMissing.of()).map { it.toImmutable() },
                    (pricingGroupKey ?: JsonMissing.of()).map { it.toImmutable() },
                    quantityConversion,
                    quantityRounding,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
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

    /** A builder for [ContractProductUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

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

        /** ID of the product to update */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

        /**
         * Timestamp representing when the update should go into effect. It must be on an hour
         * boundary (e.g. 1:00, not 1:30).
         */
        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

        /**
         * Timestamp representing when the update should go into effect. It must be on an hour
         * boundary (e.g. 1:00, not 1:30).
         */
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            body.startingAt(startingAt)
        }

        /**
         * Available for USAGE products only. If not provided, defaults to product's current
         * billable metric.
         */
        fun billableMetricId(billableMetricId: String) = apply {
            body.billableMetricId(billableMetricId)
        }

        /**
         * Available for USAGE products only. If not provided, defaults to product's current
         * billable metric.
         */
        fun billableMetricId(billableMetricId: JsonField<String>) = apply {
            body.billableMetricId(billableMetricId)
        }

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_product_ids.
         */
        fun compositeProductIds(compositeProductIds: List<String>) = apply {
            body.compositeProductIds(compositeProductIds)
        }

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_product_ids.
         */
        fun compositeProductIds(compositeProductIds: JsonField<List<String>>) = apply {
            body.compositeProductIds(compositeProductIds)
        }

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
        fun compositeTags(compositeTags: List<String>) = apply { body.compositeTags(compositeTags) }

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_tags.
         */
        fun compositeTags(compositeTags: JsonField<List<String>>) = apply {
            body.compositeTags(compositeTags)
        }

        /**
         * Available for COMPOSITE products only. If not provided, defaults to product's current
         * composite_tags.
         */
        fun addCompositeTag(compositeTag: String) = apply { body.addCompositeTag(compositeTag) }

        /**
         * Beta feature only available for composite products. If true, products with $0 will not be
         * included when computing composite usage. Defaults to false
         */
        fun excludeFreeUsage(excludeFreeUsage: Boolean) = apply {
            body.excludeFreeUsage(excludeFreeUsage)
        }

        /**
         * Beta feature only available for composite products. If true, products with $0 will not be
         * included when computing composite usage. Defaults to false
         */
        fun excludeFreeUsage(excludeFreeUsage: JsonField<Boolean>) = apply {
            body.excludeFreeUsage(excludeFreeUsage)
        }

        /**
         * Defaults to product's current refundability status. This field's availability is
         * dependent on your client's configuration.
         */
        fun isRefundable(isRefundable: Boolean) = apply { body.isRefundable(isRefundable) }

        /**
         * Defaults to product's current refundability status. This field's availability is
         * dependent on your client's configuration.
         */
        fun isRefundable(isRefundable: JsonField<Boolean>) = apply {
            body.isRefundable(isRefundable)
        }

        /** displayed on invoices. If not provided, defaults to product's current name. */
        fun name(name: String) = apply { body.name(name) }

        /** displayed on invoices. If not provided, defaults to product's current name. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * If not provided, defaults to product's current netsuite_internal_item_id. This field's
         * availability is dependent on your client's configuration.
         */
        fun netsuiteInternalItemId(netsuiteInternalItemId: String) = apply {
            body.netsuiteInternalItemId(netsuiteInternalItemId)
        }

        /**
         * If not provided, defaults to product's current netsuite_internal_item_id. This field's
         * availability is dependent on your client's configuration.
         */
        fun netsuiteInternalItemId(netsuiteInternalItemId: JsonField<String>) = apply {
            body.netsuiteInternalItemId(netsuiteInternalItemId)
        }

        /**
         * Available for USAGE and COMPOSITE products only. If not provided, defaults to product's
         * current netsuite_overage_item_id. This field's availability is dependent on your client's
         * configuration.
         */
        fun netsuiteOverageItemId(netsuiteOverageItemId: String) = apply {
            body.netsuiteOverageItemId(netsuiteOverageItemId)
        }

        /**
         * Available for USAGE and COMPOSITE products only. If not provided, defaults to product's
         * current netsuite_overage_item_id. This field's availability is dependent on your client's
         * configuration.
         */
        fun netsuiteOverageItemId(netsuiteOverageItemId: JsonField<String>) = apply {
            body.netsuiteOverageItemId(netsuiteOverageItemId)
        }

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun presentationGroupKey(presentationGroupKey: List<String>) = apply {
            body.presentationGroupKey(presentationGroupKey)
        }

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun presentationGroupKey(presentationGroupKey: JsonField<List<String>>) = apply {
            body.presentationGroupKey(presentationGroupKey)
        }

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
        fun pricingGroupKey(pricingGroupKey: List<String>) = apply {
            body.pricingGroupKey(pricingGroupKey)
        }

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun pricingGroupKey(pricingGroupKey: JsonField<List<String>>) = apply {
            body.pricingGroupKey(pricingGroupKey)
        }

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
         * Optional. Only valid for USAGE products. If provided, the quantity will be converted
         * using the provided conversion factor and operation. For example, if the operation is
         * "multiply" and the conversion factor is 100, then the quantity will be multiplied by 100.
         * This can be used in cases where data is sent in one unit and priced in another. For
         * example, data could be sent in MB and priced in GB. In this case, the conversion factor
         * would be 1024 and the operation would be "divide".
         */
        fun quantityConversion(quantityConversion: JsonField<QuantityConversion>) = apply {
            body.quantityConversion(quantityConversion)
        }

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

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using
         * the provided rounding method and decimal places. For example, if the method is "round up"
         * and the decimal places is 0, then the quantity will be rounded up to the nearest integer.
         */
        fun quantityRounding(quantityRounding: JsonField<QuantityRounding>) = apply {
            body.quantityRounding(quantityRounding)
        }

        /** If not provided, defaults to product's current tags */
        fun tags(tags: List<String>) = apply { body.tags(tags) }

        /** If not provided, defaults to product's current tags */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /** If not provided, defaults to product's current tags */
        fun addTag(tag: String) = apply { body.addTag(tag) }

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
