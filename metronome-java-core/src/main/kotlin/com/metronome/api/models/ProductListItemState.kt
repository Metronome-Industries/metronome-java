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
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ProductListItemState
@JsonCreator
private constructor(
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created_by")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("starting_at")
    @ExcludeMissing
    private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("tags")
    @ExcludeMissing
    private val tags: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun createdBy(): String = createdBy.getRequired("created_by")

    fun name(): String = name.getRequired("name")

    fun billableMetricId(): Optional<String> =
        Optional.ofNullable(billableMetricId.getNullable("billable_metric_id"))

    fun compositeProductIds(): Optional<List<String>> =
        Optional.ofNullable(compositeProductIds.getNullable("composite_product_ids"))

    fun compositeTags(): Optional<List<String>> =
        Optional.ofNullable(compositeTags.getNullable("composite_tags"))

    fun excludeFreeUsage(): Optional<Boolean> =
        Optional.ofNullable(excludeFreeUsage.getNullable("exclude_free_usage"))

    /** This field's availability is dependent on your client's configuration. */
    fun isRefundable(): Optional<Boolean> =
        Optional.ofNullable(isRefundable.getNullable("is_refundable"))

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteInternalItemId(): Optional<String> =
        Optional.ofNullable(netsuiteInternalItemId.getNullable("netsuite_internal_item_id"))

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteOverageItemId(): Optional<String> =
        Optional.ofNullable(netsuiteOverageItemId.getNullable("netsuite_overage_item_id"))

    /**
     * For USAGE products only. Groups usage line items on invoices. The superset of values in the
     * pricing group key and presentation group key must be set as one compound group key on the
     * billable metric.
     */
    fun presentationGroupKey(): Optional<List<String>> =
        Optional.ofNullable(presentationGroupKey.getNullable("presentation_group_key"))

    /**
     * For USAGE products only. If set, pricing for this product will be determined for each
     * pricing_group_key value, as opposed to the product as a whole. The superset of values in the
     * pricing group key and presentation group key must be set as one compound group key on the
     * billable metric.
     */
    fun pricingGroupKey(): Optional<List<String>> =
        Optional.ofNullable(pricingGroupKey.getNullable("pricing_group_key"))

    /**
     * Optional. Only valid for USAGE products. If provided, the quantity will be converted using
     * the provided conversion factor and operation. For example, if the operation is "multiply" and
     * the conversion factor is 100, then the quantity will be multiplied by 100. This can be used
     * in cases where data is sent in one unit and priced in another. For example, data could be
     * sent in MB and priced in GB. In this case, the conversion factor would be 1024 and the
     * operation would be "divide".
     */
    fun quantityConversion(): Optional<QuantityConversion> =
        Optional.ofNullable(quantityConversion.getNullable("quantity_conversion"))

    /**
     * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using the
     * provided rounding method and decimal places. For example, if the method is "round up" and the
     * decimal places is 0, then the quantity will be rounded up to the nearest integer.
     */
    fun quantityRounding(): Optional<QuantityRounding> =
        Optional.ofNullable(quantityRounding.getNullable("quantity_rounding"))

    fun startingAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(startingAt.getNullable("starting_at"))

    fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("created_by") @ExcludeMissing fun _createdBy() = createdBy

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("billable_metric_id") @ExcludeMissing fun _billableMetricId() = billableMetricId

    @JsonProperty("composite_product_ids")
    @ExcludeMissing
    fun _compositeProductIds() = compositeProductIds

    @JsonProperty("composite_tags") @ExcludeMissing fun _compositeTags() = compositeTags

    @JsonProperty("exclude_free_usage") @ExcludeMissing fun _excludeFreeUsage() = excludeFreeUsage

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("is_refundable") @ExcludeMissing fun _isRefundable() = isRefundable

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("netsuite_internal_item_id")
    @ExcludeMissing
    fun _netsuiteInternalItemId() = netsuiteInternalItemId

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("netsuite_overage_item_id")
    @ExcludeMissing
    fun _netsuiteOverageItemId() = netsuiteOverageItemId

    /**
     * For USAGE products only. Groups usage line items on invoices. The superset of values in the
     * pricing group key and presentation group key must be set as one compound group key on the
     * billable metric.
     */
    @JsonProperty("presentation_group_key")
    @ExcludeMissing
    fun _presentationGroupKey() = presentationGroupKey

    /**
     * For USAGE products only. If set, pricing for this product will be determined for each
     * pricing_group_key value, as opposed to the product as a whole. The superset of values in the
     * pricing group key and presentation group key must be set as one compound group key on the
     * billable metric.
     */
    @JsonProperty("pricing_group_key") @ExcludeMissing fun _pricingGroupKey() = pricingGroupKey

    /**
     * Optional. Only valid for USAGE products. If provided, the quantity will be converted using
     * the provided conversion factor and operation. For example, if the operation is "multiply" and
     * the conversion factor is 100, then the quantity will be multiplied by 100. This can be used
     * in cases where data is sent in one unit and priced in another. For example, data could be
     * sent in MB and priced in GB. In this case, the conversion factor would be 1024 and the
     * operation would be "divide".
     */
    @JsonProperty("quantity_conversion")
    @ExcludeMissing
    fun _quantityConversion() = quantityConversion

    /**
     * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using the
     * provided rounding method and decimal places. For example, if the method is "round up" and the
     * decimal places is 0, then the quantity will be rounded up to the nearest integer.
     */
    @JsonProperty("quantity_rounding") @ExcludeMissing fun _quantityRounding() = quantityRounding

    @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

    @JsonProperty("tags") @ExcludeMissing fun _tags() = tags

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ProductListItemState = apply {
        if (!validated) {
            createdAt()
            createdBy()
            name()
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
            startingAt()
            tags()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var billableMetricId: JsonField<String> = JsonMissing.of()
        private var compositeProductIds: JsonField<List<String>> = JsonMissing.of()
        private var compositeTags: JsonField<List<String>> = JsonMissing.of()
        private var excludeFreeUsage: JsonField<Boolean> = JsonMissing.of()
        private var isRefundable: JsonField<Boolean> = JsonMissing.of()
        private var netsuiteInternalItemId: JsonField<String> = JsonMissing.of()
        private var netsuiteOverageItemId: JsonField<String> = JsonMissing.of()
        private var presentationGroupKey: JsonField<List<String>> = JsonMissing.of()
        private var pricingGroupKey: JsonField<List<String>> = JsonMissing.of()
        private var quantityConversion: JsonField<QuantityConversion> = JsonMissing.of()
        private var quantityRounding: JsonField<QuantityRounding> = JsonMissing.of()
        private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var tags: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(productListItemState: ProductListItemState) = apply {
            createdAt = productListItemState.createdAt
            createdBy = productListItemState.createdBy
            name = productListItemState.name
            billableMetricId = productListItemState.billableMetricId
            compositeProductIds = productListItemState.compositeProductIds
            compositeTags = productListItemState.compositeTags
            excludeFreeUsage = productListItemState.excludeFreeUsage
            isRefundable = productListItemState.isRefundable
            netsuiteInternalItemId = productListItemState.netsuiteInternalItemId
            netsuiteOverageItemId = productListItemState.netsuiteOverageItemId
            presentationGroupKey = productListItemState.presentationGroupKey
            pricingGroupKey = productListItemState.pricingGroupKey
            quantityConversion = productListItemState.quantityConversion
            quantityRounding = productListItemState.quantityRounding
            startingAt = productListItemState.startingAt
            tags = productListItemState.tags
            additionalProperties = productListItemState.additionalProperties.toMutableMap()
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun billableMetricId(billableMetricId: String) =
            billableMetricId(JsonField.of(billableMetricId))

        fun billableMetricId(billableMetricId: JsonField<String>) = apply {
            this.billableMetricId = billableMetricId
        }

        fun compositeProductIds(compositeProductIds: List<String>) =
            compositeProductIds(JsonField.of(compositeProductIds))

        fun compositeProductIds(compositeProductIds: JsonField<List<String>>) = apply {
            this.compositeProductIds = compositeProductIds
        }

        fun compositeTags(compositeTags: List<String>) = compositeTags(JsonField.of(compositeTags))

        fun compositeTags(compositeTags: JsonField<List<String>>) = apply {
            this.compositeTags = compositeTags
        }

        fun excludeFreeUsage(excludeFreeUsage: Boolean) =
            excludeFreeUsage(JsonField.of(excludeFreeUsage))

        fun excludeFreeUsage(excludeFreeUsage: JsonField<Boolean>) = apply {
            this.excludeFreeUsage = excludeFreeUsage
        }

        /** This field's availability is dependent on your client's configuration. */
        fun isRefundable(isRefundable: Boolean) = isRefundable(JsonField.of(isRefundable))

        /** This field's availability is dependent on your client's configuration. */
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
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun presentationGroupKey(presentationGroupKey: List<String>) =
            presentationGroupKey(JsonField.of(presentationGroupKey))

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun presentationGroupKey(presentationGroupKey: JsonField<List<String>>) = apply {
            this.presentationGroupKey = presentationGroupKey
        }

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun pricingGroupKey(pricingGroupKey: List<String>) =
            pricingGroupKey(JsonField.of(pricingGroupKey))

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun pricingGroupKey(pricingGroupKey: JsonField<List<String>>) = apply {
            this.pricingGroupKey = pricingGroupKey
        }

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be converted
         * using the provided conversion factor and operation. For example, if the operation is
         * "multiply" and the conversion factor is 100, then the quantity will be multiplied by 100.
         * This can be used in cases where data is sent in one unit and priced in another. For
         * example, data could be sent in MB and priced in GB. In this case, the conversion factor
         * would be 1024 and the operation would be "divide".
         */
        fun quantityConversion(quantityConversion: QuantityConversion) =
            quantityConversion(JsonField.of(quantityConversion))

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be converted
         * using the provided conversion factor and operation. For example, if the operation is
         * "multiply" and the conversion factor is 100, then the quantity will be multiplied by 100.
         * This can be used in cases where data is sent in one unit and priced in another. For
         * example, data could be sent in MB and priced in GB. In this case, the conversion factor
         * would be 1024 and the operation would be "divide".
         */
        fun quantityConversion(quantityConversion: JsonField<QuantityConversion>) = apply {
            this.quantityConversion = quantityConversion
        }

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using
         * the provided rounding method and decimal places. For example, if the method is "round up"
         * and the decimal places is 0, then the quantity will be rounded up to the nearest integer.
         */
        fun quantityRounding(quantityRounding: QuantityRounding) =
            quantityRounding(JsonField.of(quantityRounding))

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using
         * the provided rounding method and decimal places. For example, if the method is "round up"
         * and the decimal places is 0, then the quantity will be rounded up to the nearest integer.
         */
        fun quantityRounding(quantityRounding: JsonField<QuantityRounding>) = apply {
            this.quantityRounding = quantityRounding
        }

        fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            this.startingAt = startingAt
        }

        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        fun tags(tags: JsonField<List<String>>) = apply { this.tags = tags }

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

        fun build(): ProductListItemState =
            ProductListItemState(
                createdAt,
                createdBy,
                name,
                billableMetricId,
                compositeProductIds.map { it.toImmutable() },
                compositeTags.map { it.toImmutable() },
                excludeFreeUsage,
                isRefundable,
                netsuiteInternalItemId,
                netsuiteOverageItemId,
                presentationGroupKey.map { it.toImmutable() },
                pricingGroupKey.map { it.toImmutable() },
                quantityConversion,
                quantityRounding,
                startingAt,
                tags.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProductListItemState && createdAt == other.createdAt && createdBy == other.createdBy && name == other.name && billableMetricId == other.billableMetricId && compositeProductIds == other.compositeProductIds && compositeTags == other.compositeTags && excludeFreeUsage == other.excludeFreeUsage && isRefundable == other.isRefundable && netsuiteInternalItemId == other.netsuiteInternalItemId && netsuiteOverageItemId == other.netsuiteOverageItemId && presentationGroupKey == other.presentationGroupKey && pricingGroupKey == other.pricingGroupKey && quantityConversion == other.quantityConversion && quantityRounding == other.quantityRounding && startingAt == other.startingAt && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(createdAt, createdBy, name, billableMetricId, compositeProductIds, compositeTags, excludeFreeUsage, isRefundable, netsuiteInternalItemId, netsuiteOverageItemId, presentationGroupKey, pricingGroupKey, quantityConversion, quantityRounding, startingAt, tags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductListItemState{createdAt=$createdAt, createdBy=$createdBy, name=$name, billableMetricId=$billableMetricId, compositeProductIds=$compositeProductIds, compositeTags=$compositeTags, excludeFreeUsage=$excludeFreeUsage, isRefundable=$isRefundable, netsuiteInternalItemId=$netsuiteInternalItemId, netsuiteOverageItemId=$netsuiteOverageItemId, presentationGroupKey=$presentationGroupKey, pricingGroupKey=$pricingGroupKey, quantityConversion=$quantityConversion, quantityRounding=$quantityRounding, startingAt=$startingAt, tags=$tags, additionalProperties=$additionalProperties}"
}
