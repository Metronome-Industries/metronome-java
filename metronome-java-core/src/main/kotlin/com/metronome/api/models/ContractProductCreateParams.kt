// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

/** Create a new product */
class ContractProductCreateParams
constructor(
    private val body: ContractProductCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** displayed on invoices */
    fun name(): String = body.name()

    fun type(): Type = body.type()

    /** Required for USAGE products */
    fun billableMetricId(): Optional<String> = body.billableMetricId()

    /** Required for COMPOSITE products */
    fun compositeProductIds(): Optional<List<String>> = body.compositeProductIds()

    /** Required for COMPOSITE products */
    fun compositeTags(): Optional<List<String>> = body.compositeTags()

    /**
     * Beta feature only available for composite products. If true, products with $0 will not be
     * included when computing composite usage. Defaults to false
     */
    fun excludeFreeUsage(): Optional<Boolean> = body.excludeFreeUsage()

    /** This field's availability is dependent on your client's configuration. Defaults to true. */
    fun isRefundable(): Optional<Boolean> = body.isRefundable()

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteInternalItemId(): Optional<String> = body.netsuiteInternalItemId()

    /** This field's availability is dependent on your client's configuration. */
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

    fun tags(): Optional<List<String>> = body.tags()

    /** displayed on invoices */
    fun _name(): JsonField<String> = body._name()

    fun _type(): JsonField<Type> = body._type()

    /** Required for USAGE products */
    fun _billableMetricId(): JsonField<String> = body._billableMetricId()

    /** Required for COMPOSITE products */
    fun _compositeProductIds(): JsonField<List<String>> = body._compositeProductIds()

    /** Required for COMPOSITE products */
    fun _compositeTags(): JsonField<List<String>> = body._compositeTags()

    /**
     * Beta feature only available for composite products. If true, products with $0 will not be
     * included when computing composite usage. Defaults to false
     */
    fun _excludeFreeUsage(): JsonField<Boolean> = body._excludeFreeUsage()

    /** This field's availability is dependent on your client's configuration. Defaults to true. */
    fun _isRefundable(): JsonField<Boolean> = body._isRefundable()

    /** This field's availability is dependent on your client's configuration. */
    fun _netsuiteInternalItemId(): JsonField<String> = body._netsuiteInternalItemId()

    /** This field's availability is dependent on your client's configuration. */
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

    fun _tags(): JsonField<List<String>> = body._tags()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ContractProductCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractProductCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
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

        /** displayed on invoices */
        fun name(): String = name.getRequired("name")

        fun type(): Type = type.getRequired("type")

        /** Required for USAGE products */
        fun billableMetricId(): Optional<String> =
            Optional.ofNullable(billableMetricId.getNullable("billable_metric_id"))

        /** Required for COMPOSITE products */
        fun compositeProductIds(): Optional<List<String>> =
            Optional.ofNullable(compositeProductIds.getNullable("composite_product_ids"))

        /** Required for COMPOSITE products */
        fun compositeTags(): Optional<List<String>> =
            Optional.ofNullable(compositeTags.getNullable("composite_tags"))

        /**
         * Beta feature only available for composite products. If true, products with $0 will not be
         * included when computing composite usage. Defaults to false
         */
        fun excludeFreeUsage(): Optional<Boolean> =
            Optional.ofNullable(excludeFreeUsage.getNullable("exclude_free_usage"))

        /**
         * This field's availability is dependent on your client's configuration. Defaults to true.
         */
        fun isRefundable(): Optional<Boolean> =
            Optional.ofNullable(isRefundable.getNullable("is_refundable"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteInternalItemId(): Optional<String> =
            Optional.ofNullable(netsuiteInternalItemId.getNullable("netsuite_internal_item_id"))

        /** This field's availability is dependent on your client's configuration. */
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

        fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

        /** displayed on invoices */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /** Required for USAGE products */
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        fun _billableMetricId(): JsonField<String> = billableMetricId

        /** Required for COMPOSITE products */
        @JsonProperty("composite_product_ids")
        @ExcludeMissing
        fun _compositeProductIds(): JsonField<List<String>> = compositeProductIds

        /** Required for COMPOSITE products */
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
         * This field's availability is dependent on your client's configuration. Defaults to true.
         */
        @JsonProperty("is_refundable")
        @ExcludeMissing
        fun _isRefundable(): JsonField<Boolean> = isRefundable

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_internal_item_id")
        @ExcludeMissing
        fun _netsuiteInternalItemId(): JsonField<String> = netsuiteInternalItemId

        /** This field's availability is dependent on your client's configuration. */
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

        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractProductCreateBody = apply {
            if (!validated) {
                name()
                type()
                billableMetricId()
                compositeProductIds()
                compositeTags()
                excludeFreeUsage()
                isRefundable()
                netsuiteInternalItemId()
                netsuiteOverageItemId()
                presentationGroupKey()
                pricingGroupKey()
                quantityConversion().map { it.validate() }
                quantityRounding().map { it.validate() }
                tags()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var billableMetricId: JsonField<String> = JsonMissing.of()
            private var compositeProductIds: JsonField<MutableList<String>>? = null
            private var compositeTags: JsonField<MutableList<String>>? = null
            private var excludeFreeUsage: JsonField<Boolean> = JsonMissing.of()
            private var isRefundable: JsonField<Boolean> = JsonMissing.of()
            private var netsuiteInternalItemId: JsonField<String> = JsonMissing.of()
            private var netsuiteOverageItemId: JsonField<String> = JsonMissing.of()
            private var presentationGroupKey: JsonField<MutableList<String>>? = null
            private var pricingGroupKey: JsonField<MutableList<String>>? = null
            private var quantityConversion: JsonField<QuantityConversion> = JsonMissing.of()
            private var quantityRounding: JsonField<QuantityRounding> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractProductCreateBody: ContractProductCreateBody) = apply {
                name = contractProductCreateBody.name
                type = contractProductCreateBody.type
                billableMetricId = contractProductCreateBody.billableMetricId
                compositeProductIds =
                    contractProductCreateBody.compositeProductIds.map { it.toMutableList() }
                compositeTags = contractProductCreateBody.compositeTags.map { it.toMutableList() }
                excludeFreeUsage = contractProductCreateBody.excludeFreeUsage
                isRefundable = contractProductCreateBody.isRefundable
                netsuiteInternalItemId = contractProductCreateBody.netsuiteInternalItemId
                netsuiteOverageItemId = contractProductCreateBody.netsuiteOverageItemId
                presentationGroupKey =
                    contractProductCreateBody.presentationGroupKey.map { it.toMutableList() }
                pricingGroupKey =
                    contractProductCreateBody.pricingGroupKey.map { it.toMutableList() }
                quantityConversion = contractProductCreateBody.quantityConversion
                quantityRounding = contractProductCreateBody.quantityRounding
                tags = contractProductCreateBody.tags.map { it.toMutableList() }
                additionalProperties = contractProductCreateBody.additionalProperties.toMutableMap()
            }

            /** displayed on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /** displayed on invoices */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun type(type: Type) = type(JsonField.of(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Required for USAGE products */
            fun billableMetricId(billableMetricId: String) =
                billableMetricId(JsonField.of(billableMetricId))

            /** Required for USAGE products */
            fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                this.billableMetricId = billableMetricId
            }

            /** Required for COMPOSITE products */
            fun compositeProductIds(compositeProductIds: List<String>) =
                compositeProductIds(JsonField.of(compositeProductIds))

            /** Required for COMPOSITE products */
            fun compositeProductIds(compositeProductIds: JsonField<List<String>>) = apply {
                this.compositeProductIds = compositeProductIds.map { it.toMutableList() }
            }

            /** Required for COMPOSITE products */
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

            /** Required for COMPOSITE products */
            fun compositeTags(compositeTags: List<String>) =
                compositeTags(JsonField.of(compositeTags))

            /** Required for COMPOSITE products */
            fun compositeTags(compositeTags: JsonField<List<String>>) = apply {
                this.compositeTags = compositeTags.map { it.toMutableList() }
            }

            /** Required for COMPOSITE products */
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
             * This field's availability is dependent on your client's configuration. Defaults to
             * true.
             */
            fun isRefundable(isRefundable: Boolean) = isRefundable(JsonField.of(isRefundable))

            /**
             * This field's availability is dependent on your client's configuration. Defaults to
             * true.
             */
            fun isRefundable(isRefundable: JsonField<Boolean>) = apply {
                this.isRefundable = isRefundable
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteInternalItemId(netsuiteInternalItemId: String) =
                netsuiteInternalItemId(JsonField.of(netsuiteInternalItemId))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteInternalItemId(netsuiteInternalItemId: JsonField<String>) = apply {
                this.netsuiteInternalItemId = netsuiteInternalItemId
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteOverageItemId(netsuiteOverageItemId: String) =
                netsuiteOverageItemId(JsonField.of(netsuiteOverageItemId))

            /** This field's availability is dependent on your client's configuration. */
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

            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

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

            fun build(): ContractProductCreateBody =
                ContractProductCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(type) { "`type` is required but was not set" },
                    billableMetricId,
                    (compositeProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (compositeTags ?: JsonMissing.of()).map { it.toImmutable() },
                    excludeFreeUsage,
                    isRefundable,
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

            return /* spotless:off */ other is ContractProductCreateBody && name == other.name && type == other.type && billableMetricId == other.billableMetricId && compositeProductIds == other.compositeProductIds && compositeTags == other.compositeTags && excludeFreeUsage == other.excludeFreeUsage && isRefundable == other.isRefundable && netsuiteInternalItemId == other.netsuiteInternalItemId && netsuiteOverageItemId == other.netsuiteOverageItemId && presentationGroupKey == other.presentationGroupKey && pricingGroupKey == other.pricingGroupKey && quantityConversion == other.quantityConversion && quantityRounding == other.quantityRounding && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, type, billableMetricId, compositeProductIds, compositeTags, excludeFreeUsage, isRefundable, netsuiteInternalItemId, netsuiteOverageItemId, presentationGroupKey, pricingGroupKey, quantityConversion, quantityRounding, tags, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractProductCreateBody{name=$name, type=$type, billableMetricId=$billableMetricId, compositeProductIds=$compositeProductIds, compositeTags=$compositeTags, excludeFreeUsage=$excludeFreeUsage, isRefundable=$isRefundable, netsuiteInternalItemId=$netsuiteInternalItemId, netsuiteOverageItemId=$netsuiteOverageItemId, presentationGroupKey=$presentationGroupKey, pricingGroupKey=$pricingGroupKey, quantityConversion=$quantityConversion, quantityRounding=$quantityRounding, tags=$tags, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ContractProductCreateBody.Builder = ContractProductCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractProductCreateParams: ContractProductCreateParams) = apply {
            body = contractProductCreateParams.body.toBuilder()
            additionalHeaders = contractProductCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractProductCreateParams.additionalQueryParams.toBuilder()
        }

        /** displayed on invoices */
        fun name(name: String) = apply { body.name(name) }

        /** displayed on invoices */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun type(type: Type) = apply { body.type(type) }

        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /** Required for USAGE products */
        fun billableMetricId(billableMetricId: String) = apply {
            body.billableMetricId(billableMetricId)
        }

        /** Required for USAGE products */
        fun billableMetricId(billableMetricId: JsonField<String>) = apply {
            body.billableMetricId(billableMetricId)
        }

        /** Required for COMPOSITE products */
        fun compositeProductIds(compositeProductIds: List<String>) = apply {
            body.compositeProductIds(compositeProductIds)
        }

        /** Required for COMPOSITE products */
        fun compositeProductIds(compositeProductIds: JsonField<List<String>>) = apply {
            body.compositeProductIds(compositeProductIds)
        }

        /** Required for COMPOSITE products */
        fun addCompositeProductId(compositeProductId: String) = apply {
            body.addCompositeProductId(compositeProductId)
        }

        /** Required for COMPOSITE products */
        fun compositeTags(compositeTags: List<String>) = apply { body.compositeTags(compositeTags) }

        /** Required for COMPOSITE products */
        fun compositeTags(compositeTags: JsonField<List<String>>) = apply {
            body.compositeTags(compositeTags)
        }

        /** Required for COMPOSITE products */
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
         * This field's availability is dependent on your client's configuration. Defaults to true.
         */
        fun isRefundable(isRefundable: Boolean) = apply { body.isRefundable(isRefundable) }

        /**
         * This field's availability is dependent on your client's configuration. Defaults to true.
         */
        fun isRefundable(isRefundable: JsonField<Boolean>) = apply {
            body.isRefundable(isRefundable)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteInternalItemId(netsuiteInternalItemId: String) = apply {
            body.netsuiteInternalItemId(netsuiteInternalItemId)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteInternalItemId(netsuiteInternalItemId: JsonField<String>) = apply {
            body.netsuiteInternalItemId(netsuiteInternalItemId)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteOverageItemId(netsuiteOverageItemId: String) = apply {
            body.netsuiteOverageItemId(netsuiteOverageItemId)
        }

        /** This field's availability is dependent on your client's configuration. */
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

        fun tags(tags: List<String>) = apply { body.tags(tags) }

        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

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

        fun build(): ContractProductCreateParams =
            ContractProductCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FIXED = of("FIXED")

            @JvmField val USAGE = of("USAGE")

            @JvmField val COMPOSITE = of("COMPOSITE")

            @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

            @JvmField val PROFESSIONAL_SERVICE = of("PROFESSIONAL_SERVICE")

            @JvmField val PRO_SERVICE = of("PRO_SERVICE")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractProductCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractProductCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
