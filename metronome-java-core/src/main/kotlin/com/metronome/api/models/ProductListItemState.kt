// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ProductListItemState.Builder::class)
@NoAutoDetect
class ProductListItemState
private constructor(
    private val name: JsonField<String>,
    private val startingAt: JsonField<OffsetDateTime>,
    private val netsuiteInternalItemId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val netsuiteOverageItemId: JsonField<String>,
    private val billableMetricId: JsonField<String>,
    private val compositeProductIds: JsonField<List<String>>,
    private val quantityConversion: JsonField<QuantityConversion>,
    private val quantityRounding: JsonField<QuantityRounding>,
    private val compositeTags: JsonField<List<String>>,
    private val isRefundable: JsonField<Boolean>,
    private val tags: JsonField<List<String>>,
    private val excludeFreeUsage: JsonField<Boolean>,
    private val pricingGroupKey: JsonField<List<String>>,
    private val presentationGroupKey: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun name(): String = name.getRequired("name")

    fun startingAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(startingAt.getNullable("starting_at"))

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteInternalItemId(): Optional<String> =
        Optional.ofNullable(netsuiteInternalItemId.getNullable("netsuite_internal_item_id"))

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun createdBy(): String = createdBy.getRequired("created_by")

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteOverageItemId(): Optional<String> =
        Optional.ofNullable(netsuiteOverageItemId.getNullable("netsuite_overage_item_id"))

    fun billableMetricId(): Optional<String> =
        Optional.ofNullable(billableMetricId.getNullable("billable_metric_id"))

    fun compositeProductIds(): Optional<List<String>> =
        Optional.ofNullable(compositeProductIds.getNullable("composite_product_ids"))

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

    fun compositeTags(): Optional<List<String>> =
        Optional.ofNullable(compositeTags.getNullable("composite_tags"))

    /** This field's availability is dependent on your client's configuration. */
    fun isRefundable(): Optional<Boolean> =
        Optional.ofNullable(isRefundable.getNullable("is_refundable"))

    fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

    fun excludeFreeUsage(): Optional<Boolean> =
        Optional.ofNullable(excludeFreeUsage.getNullable("exclude_free_usage"))

    /**
     * For USAGE products only. If set, pricing for this product will be determined for each
     * pricing_group_key value, as opposed to the product as a whole.
     */
    fun pricingGroupKey(): Optional<List<String>> =
        Optional.ofNullable(pricingGroupKey.getNullable("pricing_group_key"))

    /** For USAGE products only. Groups usage line items on invoices. */
    fun presentationGroupKey(): Optional<List<String>> =
        Optional.ofNullable(presentationGroupKey.getNullable("presentation_group_key"))

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("netsuite_internal_item_id")
    @ExcludeMissing
    fun _netsuiteInternalItemId() = netsuiteInternalItemId

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("created_by") @ExcludeMissing fun _createdBy() = createdBy

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("netsuite_overage_item_id")
    @ExcludeMissing
    fun _netsuiteOverageItemId() = netsuiteOverageItemId

    @JsonProperty("billable_metric_id") @ExcludeMissing fun _billableMetricId() = billableMetricId

    @JsonProperty("composite_product_ids")
    @ExcludeMissing
    fun _compositeProductIds() = compositeProductIds

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

    @JsonProperty("composite_tags") @ExcludeMissing fun _compositeTags() = compositeTags

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("is_refundable") @ExcludeMissing fun _isRefundable() = isRefundable

    @JsonProperty("tags") @ExcludeMissing fun _tags() = tags

    @JsonProperty("exclude_free_usage") @ExcludeMissing fun _excludeFreeUsage() = excludeFreeUsage

    /**
     * For USAGE products only. If set, pricing for this product will be determined for each
     * pricing_group_key value, as opposed to the product as a whole.
     */
    @JsonProperty("pricing_group_key") @ExcludeMissing fun _pricingGroupKey() = pricingGroupKey

    /** For USAGE products only. Groups usage line items on invoices. */
    @JsonProperty("presentation_group_key")
    @ExcludeMissing
    fun _presentationGroupKey() = presentationGroupKey

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProductListItemState = apply {
        if (!validated) {
            name()
            startingAt()
            netsuiteInternalItemId()
            createdAt()
            createdBy()
            netsuiteOverageItemId()
            billableMetricId()
            compositeProductIds()
            quantityConversion().map { it.validate() }
            quantityRounding().map { it.validate() }
            compositeTags()
            isRefundable()
            tags()
            excludeFreeUsage()
            pricingGroupKey()
            presentationGroupKey()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var netsuiteInternalItemId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var netsuiteOverageItemId: JsonField<String> = JsonMissing.of()
        private var billableMetricId: JsonField<String> = JsonMissing.of()
        private var compositeProductIds: JsonField<List<String>> = JsonMissing.of()
        private var quantityConversion: JsonField<QuantityConversion> = JsonMissing.of()
        private var quantityRounding: JsonField<QuantityRounding> = JsonMissing.of()
        private var compositeTags: JsonField<List<String>> = JsonMissing.of()
        private var isRefundable: JsonField<Boolean> = JsonMissing.of()
        private var tags: JsonField<List<String>> = JsonMissing.of()
        private var excludeFreeUsage: JsonField<Boolean> = JsonMissing.of()
        private var pricingGroupKey: JsonField<List<String>> = JsonMissing.of()
        private var presentationGroupKey: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(productListItemState: ProductListItemState) = apply {
            this.name = productListItemState.name
            this.startingAt = productListItemState.startingAt
            this.netsuiteInternalItemId = productListItemState.netsuiteInternalItemId
            this.createdAt = productListItemState.createdAt
            this.createdBy = productListItemState.createdBy
            this.netsuiteOverageItemId = productListItemState.netsuiteOverageItemId
            this.billableMetricId = productListItemState.billableMetricId
            this.compositeProductIds = productListItemState.compositeProductIds
            this.quantityConversion = productListItemState.quantityConversion
            this.quantityRounding = productListItemState.quantityRounding
            this.compositeTags = productListItemState.compositeTags
            this.isRefundable = productListItemState.isRefundable
            this.tags = productListItemState.tags
            this.excludeFreeUsage = productListItemState.excludeFreeUsage
            this.pricingGroupKey = productListItemState.pricingGroupKey
            this.presentationGroupKey = productListItemState.presentationGroupKey
            additionalProperties(productListItemState.additionalProperties)
        }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

        @JsonProperty("starting_at")
        @ExcludeMissing
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            this.startingAt = startingAt
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteInternalItemId(netsuiteInternalItemId: String) =
            netsuiteInternalItemId(JsonField.of(netsuiteInternalItemId))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_internal_item_id")
        @ExcludeMissing
        fun netsuiteInternalItemId(netsuiteInternalItemId: JsonField<String>) = apply {
            this.netsuiteInternalItemId = netsuiteInternalItemId
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        @JsonProperty("created_by")
        @ExcludeMissing
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteOverageItemId(netsuiteOverageItemId: String) =
            netsuiteOverageItemId(JsonField.of(netsuiteOverageItemId))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_overage_item_id")
        @ExcludeMissing
        fun netsuiteOverageItemId(netsuiteOverageItemId: JsonField<String>) = apply {
            this.netsuiteOverageItemId = netsuiteOverageItemId
        }

        fun billableMetricId(billableMetricId: String) =
            billableMetricId(JsonField.of(billableMetricId))

        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        fun billableMetricId(billableMetricId: JsonField<String>) = apply {
            this.billableMetricId = billableMetricId
        }

        fun compositeProductIds(compositeProductIds: List<String>) =
            compositeProductIds(JsonField.of(compositeProductIds))

        @JsonProperty("composite_product_ids")
        @ExcludeMissing
        fun compositeProductIds(compositeProductIds: JsonField<List<String>>) = apply {
            this.compositeProductIds = compositeProductIds
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
        @JsonProperty("quantity_conversion")
        @ExcludeMissing
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
        @JsonProperty("quantity_rounding")
        @ExcludeMissing
        fun quantityRounding(quantityRounding: JsonField<QuantityRounding>) = apply {
            this.quantityRounding = quantityRounding
        }

        fun compositeTags(compositeTags: List<String>) = compositeTags(JsonField.of(compositeTags))

        @JsonProperty("composite_tags")
        @ExcludeMissing
        fun compositeTags(compositeTags: JsonField<List<String>>) = apply {
            this.compositeTags = compositeTags
        }

        /** This field's availability is dependent on your client's configuration. */
        fun isRefundable(isRefundable: Boolean) = isRefundable(JsonField.of(isRefundable))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("is_refundable")
        @ExcludeMissing
        fun isRefundable(isRefundable: JsonField<Boolean>) = apply {
            this.isRefundable = isRefundable
        }

        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        @JsonProperty("tags")
        @ExcludeMissing
        fun tags(tags: JsonField<List<String>>) = apply { this.tags = tags }

        fun excludeFreeUsage(excludeFreeUsage: Boolean) =
            excludeFreeUsage(JsonField.of(excludeFreeUsage))

        @JsonProperty("exclude_free_usage")
        @ExcludeMissing
        fun excludeFreeUsage(excludeFreeUsage: JsonField<Boolean>) = apply {
            this.excludeFreeUsage = excludeFreeUsage
        }

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole.
         */
        fun pricingGroupKey(pricingGroupKey: List<String>) =
            pricingGroupKey(JsonField.of(pricingGroupKey))

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole.
         */
        @JsonProperty("pricing_group_key")
        @ExcludeMissing
        fun pricingGroupKey(pricingGroupKey: JsonField<List<String>>) = apply {
            this.pricingGroupKey = pricingGroupKey
        }

        /** For USAGE products only. Groups usage line items on invoices. */
        fun presentationGroupKey(presentationGroupKey: List<String>) =
            presentationGroupKey(JsonField.of(presentationGroupKey))

        /** For USAGE products only. Groups usage line items on invoices. */
        @JsonProperty("presentation_group_key")
        @ExcludeMissing
        fun presentationGroupKey(presentationGroupKey: JsonField<List<String>>) = apply {
            this.presentationGroupKey = presentationGroupKey
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

        fun build(): ProductListItemState =
            ProductListItemState(
                name,
                startingAt,
                netsuiteInternalItemId,
                createdAt,
                createdBy,
                netsuiteOverageItemId,
                billableMetricId,
                compositeProductIds.map { it.toUnmodifiable() },
                quantityConversion,
                quantityRounding,
                compositeTags.map { it.toUnmodifiable() },
                isRefundable,
                tags.map { it.toUnmodifiable() },
                excludeFreeUsage,
                pricingGroupKey.map { it.toUnmodifiable() },
                presentationGroupKey.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProductListItemState && this.name == other.name && this.startingAt == other.startingAt && this.netsuiteInternalItemId == other.netsuiteInternalItemId && this.createdAt == other.createdAt && this.createdBy == other.createdBy && this.netsuiteOverageItemId == other.netsuiteOverageItemId && this.billableMetricId == other.billableMetricId && this.compositeProductIds == other.compositeProductIds && this.quantityConversion == other.quantityConversion && this.quantityRounding == other.quantityRounding && this.compositeTags == other.compositeTags && this.isRefundable == other.isRefundable && this.tags == other.tags && this.excludeFreeUsage == other.excludeFreeUsage && this.pricingGroupKey == other.pricingGroupKey && this.presentationGroupKey == other.presentationGroupKey && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(name, startingAt, netsuiteInternalItemId, createdAt, createdBy, netsuiteOverageItemId, billableMetricId, compositeProductIds, quantityConversion, quantityRounding, compositeTags, isRefundable, tags, excludeFreeUsage, pricingGroupKey, presentationGroupKey, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ProductListItemState{name=$name, startingAt=$startingAt, netsuiteInternalItemId=$netsuiteInternalItemId, createdAt=$createdAt, createdBy=$createdBy, netsuiteOverageItemId=$netsuiteOverageItemId, billableMetricId=$billableMetricId, compositeProductIds=$compositeProductIds, quantityConversion=$quantityConversion, quantityRounding=$quantityRounding, compositeTags=$compositeTags, isRefundable=$isRefundable, tags=$tags, excludeFreeUsage=$excludeFreeUsage, pricingGroupKey=$pricingGroupKey, presentationGroupKey=$presentationGroupKey, additionalProperties=$additionalProperties}"
}
