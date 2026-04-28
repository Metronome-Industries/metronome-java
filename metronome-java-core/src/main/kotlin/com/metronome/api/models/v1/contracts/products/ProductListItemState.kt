// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.products

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ProductListItemState
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val name: JsonField<String>,
    private val billableMetricId: JsonField<String>,
    private val compositeProductIds: JsonField<List<String>>,
    private val compositeTags: JsonField<List<String>>,
    private val excludeFreeUsage: JsonField<Boolean>,
    private val isRefundable: JsonField<Boolean>,
    private val netsuiteInternalItemId: JsonField<String>,
    private val netsuiteOverageItemId: JsonField<String>,
    private val presentationGroupKey: JsonField<List<String>>,
    private val pricingGroupKey: JsonField<List<String>>,
    private val quantityConversion: JsonField<QuantityConversion>,
    private val quantityRounding: JsonField<QuantityRounding>,
    private val startingAt: JsonField<OffsetDateTime>,
    private val tags: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        billableMetricId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("composite_product_ids")
        @ExcludeMissing
        compositeProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("composite_tags")
        @ExcludeMissing
        compositeTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("exclude_free_usage")
        @ExcludeMissing
        excludeFreeUsage: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_refundable")
        @ExcludeMissing
        isRefundable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("netsuite_internal_item_id")
        @ExcludeMissing
        netsuiteInternalItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_overage_item_id")
        @ExcludeMissing
        netsuiteOverageItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("presentation_group_key")
        @ExcludeMissing
        presentationGroupKey: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("pricing_group_key")
        @ExcludeMissing
        pricingGroupKey: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("quantity_conversion")
        @ExcludeMissing
        quantityConversion: JsonField<QuantityConversion> = JsonMissing.of(),
        @JsonProperty("quantity_rounding")
        @ExcludeMissing
        quantityRounding: JsonField<QuantityRounding> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        createdAt,
        createdBy,
        name,
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
        startingAt,
        tags,
        mutableMapOf(),
    )

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdBy(): String = createdBy.getRequired("created_by")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billableMetricId(): Optional<String> = billableMetricId.getOptional("billable_metric_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun compositeProductIds(): Optional<List<String>> =
        compositeProductIds.getOptional("composite_product_ids")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun compositeTags(): Optional<List<String>> = compositeTags.getOptional("composite_tags")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludeFreeUsage(): Optional<Boolean> = excludeFreeUsage.getOptional("exclude_free_usage")

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isRefundable(): Optional<Boolean> = isRefundable.getOptional("is_refundable")

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netsuiteInternalItemId(): Optional<String> =
        netsuiteInternalItemId.getOptional("netsuite_internal_item_id")

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netsuiteOverageItemId(): Optional<String> =
        netsuiteOverageItemId.getOptional("netsuite_overage_item_id")

    /**
     * For USAGE products only. Groups usage line items on invoices. The superset of values in the
     * pricing group key and presentation group key must be set as one compound group key on the
     * billable metric.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presentationGroupKey(): Optional<List<String>> =
        presentationGroupKey.getOptional("presentation_group_key")

    /**
     * For USAGE products only. If set, pricing for this product will be determined for each
     * pricing_group_key value, as opposed to the product as a whole. The superset of values in the
     * pricing group key and presentation group key must be set as one compound group key on the
     * billable metric.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pricingGroupKey(): Optional<List<String>> = pricingGroupKey.getOptional("pricing_group_key")

    /**
     * Optional. Only valid for USAGE products. If provided, the quantity will be converted using
     * the provided conversion factor and operation. For example, if the operation is "multiply" and
     * the conversion factor is 100, then the quantity will be multiplied by 100. This can be used
     * in cases where data is sent in one unit and priced in another. For example, data could be
     * sent in MB and priced in GB. In this case, the conversion factor would be 1024 and the
     * operation would be "divide".
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quantityConversion(): Optional<QuantityConversion> =
        quantityConversion.getOptional("quantity_conversion")

    /**
     * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using the
     * provided rounding method and decimal places. For example, if the method is "round up" and the
     * decimal places is 0, then the quantity will be rounded up to the nearest integer.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quantityRounding(): Optional<QuantityRounding> =
        quantityRounding.getOptional("quantity_rounding")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startingAt(): Optional<OffsetDateTime> = startingAt.getOptional("starting_at")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [billableMetricId].
     *
     * Unlike [billableMetricId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("billable_metric_id")
    @ExcludeMissing
    fun _billableMetricId(): JsonField<String> = billableMetricId

    /**
     * Returns the raw JSON value of [compositeProductIds].
     *
     * Unlike [compositeProductIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("composite_product_ids")
    @ExcludeMissing
    fun _compositeProductIds(): JsonField<List<String>> = compositeProductIds

    /**
     * Returns the raw JSON value of [compositeTags].
     *
     * Unlike [compositeTags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("composite_tags")
    @ExcludeMissing
    fun _compositeTags(): JsonField<List<String>> = compositeTags

    /**
     * Returns the raw JSON value of [excludeFreeUsage].
     *
     * Unlike [excludeFreeUsage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("exclude_free_usage")
    @ExcludeMissing
    fun _excludeFreeUsage(): JsonField<Boolean> = excludeFreeUsage

    /**
     * Returns the raw JSON value of [isRefundable].
     *
     * Unlike [isRefundable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_refundable")
    @ExcludeMissing
    fun _isRefundable(): JsonField<Boolean> = isRefundable

    /**
     * Returns the raw JSON value of [netsuiteInternalItemId].
     *
     * Unlike [netsuiteInternalItemId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("netsuite_internal_item_id")
    @ExcludeMissing
    fun _netsuiteInternalItemId(): JsonField<String> = netsuiteInternalItemId

    /**
     * Returns the raw JSON value of [netsuiteOverageItemId].
     *
     * Unlike [netsuiteOverageItemId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("netsuite_overage_item_id")
    @ExcludeMissing
    fun _netsuiteOverageItemId(): JsonField<String> = netsuiteOverageItemId

    /**
     * Returns the raw JSON value of [presentationGroupKey].
     *
     * Unlike [presentationGroupKey], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("presentation_group_key")
    @ExcludeMissing
    fun _presentationGroupKey(): JsonField<List<String>> = presentationGroupKey

    /**
     * Returns the raw JSON value of [pricingGroupKey].
     *
     * Unlike [pricingGroupKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pricing_group_key")
    @ExcludeMissing
    fun _pricingGroupKey(): JsonField<List<String>> = pricingGroupKey

    /**
     * Returns the raw JSON value of [quantityConversion].
     *
     * Unlike [quantityConversion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("quantity_conversion")
    @ExcludeMissing
    fun _quantityConversion(): JsonField<QuantityConversion> = quantityConversion

    /**
     * Returns the raw JSON value of [quantityRounding].
     *
     * Unlike [quantityRounding], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("quantity_rounding")
    @ExcludeMissing
    fun _quantityRounding(): JsonField<QuantityRounding> = quantityRounding

    /**
     * Returns the raw JSON value of [startingAt].
     *
     * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starting_at")
    @ExcludeMissing
    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProductListItemState].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .createdBy()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProductListItemState]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var createdBy: JsonField<String>? = null
        private var name: JsonField<String>? = null
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
        private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(productListItemState: ProductListItemState) = apply {
            createdAt = productListItemState.createdAt
            createdBy = productListItemState.createdBy
            name = productListItemState.name
            billableMetricId = productListItemState.billableMetricId
            compositeProductIds =
                productListItemState.compositeProductIds.map { it.toMutableList() }
            compositeTags = productListItemState.compositeTags.map { it.toMutableList() }
            excludeFreeUsage = productListItemState.excludeFreeUsage
            isRefundable = productListItemState.isRefundable
            netsuiteInternalItemId = productListItemState.netsuiteInternalItemId
            netsuiteOverageItemId = productListItemState.netsuiteOverageItemId
            presentationGroupKey =
                productListItemState.presentationGroupKey.map { it.toMutableList() }
            pricingGroupKey = productListItemState.pricingGroupKey.map { it.toMutableList() }
            quantityConversion = productListItemState.quantityConversion
            quantityRounding = productListItemState.quantityRounding
            startingAt = productListItemState.startingAt
            tags = productListItemState.tags.map { it.toMutableList() }
            additionalProperties = productListItemState.additionalProperties.toMutableMap()
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun billableMetricId(billableMetricId: String) =
            billableMetricId(JsonField.of(billableMetricId))

        /**
         * Sets [Builder.billableMetricId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billableMetricId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billableMetricId(billableMetricId: JsonField<String>) = apply {
            this.billableMetricId = billableMetricId
        }

        fun compositeProductIds(compositeProductIds: List<String>) =
            compositeProductIds(JsonField.of(compositeProductIds))

        /**
         * Sets [Builder.compositeProductIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.compositeProductIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun compositeProductIds(compositeProductIds: JsonField<List<String>>) = apply {
            this.compositeProductIds = compositeProductIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [compositeProductIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCompositeProductId(compositeProductId: String) = apply {
            compositeProductIds =
                (compositeProductIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("compositeProductIds", it).add(compositeProductId)
                }
        }

        fun compositeTags(compositeTags: List<String>) = compositeTags(JsonField.of(compositeTags))

        /**
         * Sets [Builder.compositeTags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.compositeTags] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun compositeTags(compositeTags: JsonField<List<String>>) = apply {
            this.compositeTags = compositeTags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [compositeTags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCompositeTag(compositeTag: String) = apply {
            compositeTags =
                (compositeTags ?: JsonField.of(mutableListOf())).also {
                    checkKnown("compositeTags", it).add(compositeTag)
                }
        }

        fun excludeFreeUsage(excludeFreeUsage: Boolean) =
            excludeFreeUsage(JsonField.of(excludeFreeUsage))

        /**
         * Sets [Builder.excludeFreeUsage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludeFreeUsage] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun excludeFreeUsage(excludeFreeUsage: JsonField<Boolean>) = apply {
            this.excludeFreeUsage = excludeFreeUsage
        }

        /** This field's availability is dependent on your client's configuration. */
        fun isRefundable(isRefundable: Boolean) = isRefundable(JsonField.of(isRefundable))

        /**
         * Sets [Builder.isRefundable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRefundable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isRefundable(isRefundable: JsonField<Boolean>) = apply {
            this.isRefundable = isRefundable
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteInternalItemId(netsuiteInternalItemId: String) =
            netsuiteInternalItemId(JsonField.of(netsuiteInternalItemId))

        /**
         * Sets [Builder.netsuiteInternalItemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netsuiteInternalItemId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netsuiteInternalItemId(netsuiteInternalItemId: JsonField<String>) = apply {
            this.netsuiteInternalItemId = netsuiteInternalItemId
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteOverageItemId(netsuiteOverageItemId: String) =
            netsuiteOverageItemId(JsonField.of(netsuiteOverageItemId))

        /**
         * Sets [Builder.netsuiteOverageItemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netsuiteOverageItemId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.presentationGroupKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presentationGroupKey] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun presentationGroupKey(presentationGroupKey: JsonField<List<String>>) = apply {
            this.presentationGroupKey = presentationGroupKey.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.presentationGroupKey].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPresentationGroupKey(presentationGroupKey: String) = apply {
            this.presentationGroupKey =
                (this.presentationGroupKey ?: JsonField.of(mutableListOf())).also {
                    checkKnown("presentationGroupKey", it).add(presentationGroupKey)
                }
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
         * Sets [Builder.pricingGroupKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricingGroupKey] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pricingGroupKey(pricingGroupKey: JsonField<List<String>>) = apply {
            this.pricingGroupKey = pricingGroupKey.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.pricingGroupKey].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPricingGroupKey(pricingGroupKey: String) = apply {
            this.pricingGroupKey =
                (this.pricingGroupKey ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pricingGroupKey", it).add(pricingGroupKey)
                }
        }

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be converted
         * using the provided conversion factor and operation. For example, if the operation is
         * "multiply" and the conversion factor is 100, then the quantity will be multiplied by 100.
         * This can be used in cases where data is sent in one unit and priced in another. For
         * example, data could be sent in MB and priced in GB. In this case, the conversion factor
         * would be 1024 and the operation would be "divide".
         */
        fun quantityConversion(quantityConversion: QuantityConversion?) =
            quantityConversion(JsonField.ofNullable(quantityConversion))

        /**
         * Alias for calling [Builder.quantityConversion] with `quantityConversion.orElse(null)`.
         */
        fun quantityConversion(quantityConversion: Optional<QuantityConversion>) =
            quantityConversion(quantityConversion.getOrNull())

        /**
         * Sets [Builder.quantityConversion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantityConversion] with a well-typed
         * [QuantityConversion] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun quantityConversion(quantityConversion: JsonField<QuantityConversion>) = apply {
            this.quantityConversion = quantityConversion
        }

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using
         * the provided rounding method and decimal places. For example, if the method is "round up"
         * and the decimal places is 0, then the quantity will be rounded up to the nearest integer.
         */
        fun quantityRounding(quantityRounding: QuantityRounding?) =
            quantityRounding(JsonField.ofNullable(quantityRounding))

        /** Alias for calling [Builder.quantityRounding] with `quantityRounding.orElse(null)`. */
        fun quantityRounding(quantityRounding: Optional<QuantityRounding>) =
            quantityRounding(quantityRounding.getOrNull())

        /**
         * Sets [Builder.quantityRounding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantityRounding] with a well-typed [QuantityRounding]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun quantityRounding(quantityRounding: JsonField<QuantityRounding>) = apply {
            this.quantityRounding = quantityRounding
        }

        fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

        /**
         * Sets [Builder.startingAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            this.startingAt = startingAt
        }

        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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

        /**
         * Returns an immutable instance of [ProductListItemState].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .createdBy()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProductListItemState =
            ProductListItemState(
                checkRequired("createdAt", createdAt),
                checkRequired("createdBy", createdBy),
                checkRequired("name", name),
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
                startingAt,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProductListItemState = apply {
        if (validated) {
            return@apply
        }

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
        quantityConversion().ifPresent { it.validate() }
        quantityRounding().ifPresent { it.validate() }
        startingAt()
        tags()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: MetronomeInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (billableMetricId.asKnown().isPresent) 1 else 0) +
            (compositeProductIds.asKnown().getOrNull()?.size ?: 0) +
            (compositeTags.asKnown().getOrNull()?.size ?: 0) +
            (if (excludeFreeUsage.asKnown().isPresent) 1 else 0) +
            (if (isRefundable.asKnown().isPresent) 1 else 0) +
            (if (netsuiteInternalItemId.asKnown().isPresent) 1 else 0) +
            (if (netsuiteOverageItemId.asKnown().isPresent) 1 else 0) +
            (presentationGroupKey.asKnown().getOrNull()?.size ?: 0) +
            (pricingGroupKey.asKnown().getOrNull()?.size ?: 0) +
            (quantityConversion.asKnown().getOrNull()?.validity() ?: 0) +
            (quantityRounding.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startingAt.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductListItemState &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            name == other.name &&
            billableMetricId == other.billableMetricId &&
            compositeProductIds == other.compositeProductIds &&
            compositeTags == other.compositeTags &&
            excludeFreeUsage == other.excludeFreeUsage &&
            isRefundable == other.isRefundable &&
            netsuiteInternalItemId == other.netsuiteInternalItemId &&
            netsuiteOverageItemId == other.netsuiteOverageItemId &&
            presentationGroupKey == other.presentationGroupKey &&
            pricingGroupKey == other.pricingGroupKey &&
            quantityConversion == other.quantityConversion &&
            quantityRounding == other.quantityRounding &&
            startingAt == other.startingAt &&
            tags == other.tags &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            createdBy,
            name,
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
            startingAt,
            tags,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductListItemState{createdAt=$createdAt, createdBy=$createdBy, name=$name, billableMetricId=$billableMetricId, compositeProductIds=$compositeProductIds, compositeTags=$compositeTags, excludeFreeUsage=$excludeFreeUsage, isRefundable=$isRefundable, netsuiteInternalItemId=$netsuiteInternalItemId, netsuiteOverageItemId=$netsuiteOverageItemId, presentationGroupKey=$presentationGroupKey, pricingGroupKey=$pricingGroupKey, quantityConversion=$quantityConversion, quantityRounding=$quantityRounding, startingAt=$startingAt, tags=$tags, additionalProperties=$additionalProperties}"
}
