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
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ContractProductListResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("archived_at")
    @ExcludeMissing
    private val archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("initial")
    @ExcludeMissing
    private val initial: JsonField<ProductListItemState> = JsonMissing.of(),
    @JsonProperty("current")
    @ExcludeMissing
    private val current: JsonField<ProductListItemState> = JsonMissing.of(),
    @JsonProperty("updates")
    @ExcludeMissing
    private val updates: JsonField<List<Update>> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun type(): Type = type.getRequired("type")

    fun archivedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(archivedAt.getNullable("archived_at"))

    fun initial(): ProductListItemState = initial.getRequired("initial")

    fun current(): ProductListItemState = current.getRequired("current")

    fun updates(): List<Update> = updates.getRequired("updates")

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("archived_at") @ExcludeMissing fun _archivedAt() = archivedAt

    @JsonProperty("initial") @ExcludeMissing fun _initial() = initial

    @JsonProperty("current") @ExcludeMissing fun _current() = current

    @JsonProperty("updates") @ExcludeMissing fun _updates() = updates

    @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ContractProductListResponse = apply {
        if (!validated) {
            id()
            type()
            archivedAt()
            initial().validate()
            current().validate()
            updates().forEach { it.validate() }
            customFields().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var initial: JsonField<ProductListItemState> = JsonMissing.of()
        private var current: JsonField<ProductListItemState> = JsonMissing.of()
        private var updates: JsonField<List<Update>> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractProductListResponse: ContractProductListResponse) = apply {
            id = contractProductListResponse.id
            type = contractProductListResponse.type
            archivedAt = contractProductListResponse.archivedAt
            initial = contractProductListResponse.initial
            current = contractProductListResponse.current
            updates = contractProductListResponse.updates
            customFields = contractProductListResponse.customFields
            additionalProperties = contractProductListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
        }

        fun initial(initial: ProductListItemState) = initial(JsonField.of(initial))

        fun initial(initial: JsonField<ProductListItemState>) = apply { this.initial = initial }

        fun current(current: ProductListItemState) = current(JsonField.of(current))

        fun current(current: JsonField<ProductListItemState>) = apply { this.current = current }

        fun updates(updates: List<Update>) = updates(JsonField.of(updates))

        fun updates(updates: JsonField<List<Update>>) = apply { this.updates = updates }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
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

        fun build(): ContractProductListResponse =
            ContractProductListResponse(
                id,
                type,
                archivedAt,
                initial,
                current,
                updates.map { it.toImmutable() },
                customFields,
                additionalProperties.toImmutable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val USAGE = of("USAGE")

            @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

            @JvmField val COMPOSITE = of("COMPOSITE")

            @JvmField val FIXED = of("FIXED")

            @JvmField val PRO_SERVICE = of("PRO_SERVICE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            USAGE,
            SUBSCRIPTION,
            COMPOSITE,
            FIXED,
            PRO_SERVICE,
        }

        enum class Value {
            USAGE,
            SUBSCRIPTION,
            COMPOSITE,
            FIXED,
            PRO_SERVICE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                USAGE -> Value.USAGE
                SUBSCRIPTION -> Value.SUBSCRIPTION
                COMPOSITE -> Value.COMPOSITE
                FIXED -> Value.FIXED
                PRO_SERVICE -> Value.PRO_SERVICE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                USAGE -> Known.USAGE
                SUBSCRIPTION -> Known.SUBSCRIPTION
                COMPOSITE -> Known.COMPOSITE
                FIXED -> Known.FIXED
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

    @NoAutoDetect
    class Update
    @JsonCreator
    private constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("is_refundable")
        @ExcludeMissing
        private val isRefundable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by")
        @ExcludeMissing
        private val createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        private val billableMetricId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity_conversion")
        @ExcludeMissing
        private val quantityConversion: JsonField<QuantityConversion> = JsonMissing.of(),
        @JsonProperty("quantity_rounding")
        @ExcludeMissing
        private val quantityRounding: JsonField<QuantityRounding> = JsonMissing.of(),
        @JsonProperty("netsuite_internal_item_id")
        @ExcludeMissing
        private val netsuiteInternalItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_overage_item_id")
        @ExcludeMissing
        private val netsuiteOverageItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("composite_product_ids")
        @ExcludeMissing
        private val compositeProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("composite_tags")
        @ExcludeMissing
        private val compositeTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tags")
        @ExcludeMissing
        private val tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("exclude_free_usage")
        @ExcludeMissing
        private val excludeFreeUsage: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("pricing_group_key")
        @ExcludeMissing
        private val pricingGroupKey: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("presentation_group_key")
        @ExcludeMissing
        private val presentationGroupKey: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        fun startingAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(startingAt.getNullable("starting_at"))

        fun isRefundable(): Optional<Boolean> =
            Optional.ofNullable(isRefundable.getNullable("is_refundable"))

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun createdBy(): String = createdBy.getRequired("created_by")

        fun billableMetricId(): Optional<String> =
            Optional.ofNullable(billableMetricId.getNullable("billable_metric_id"))

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

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteInternalItemId(): Optional<String> =
            Optional.ofNullable(netsuiteInternalItemId.getNullable("netsuite_internal_item_id"))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteOverageItemId(): Optional<String> =
            Optional.ofNullable(netsuiteOverageItemId.getNullable("netsuite_overage_item_id"))

        fun compositeProductIds(): Optional<List<String>> =
            Optional.ofNullable(compositeProductIds.getNullable("composite_product_ids"))

        fun compositeTags(): Optional<List<String>> =
            Optional.ofNullable(compositeTags.getNullable("composite_tags"))

        fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

        fun excludeFreeUsage(): Optional<Boolean> =
            Optional.ofNullable(excludeFreeUsage.getNullable("exclude_free_usage"))

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun pricingGroupKey(): Optional<List<String>> =
            Optional.ofNullable(pricingGroupKey.getNullable("pricing_group_key"))

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun presentationGroupKey(): Optional<List<String>> =
            Optional.ofNullable(presentationGroupKey.getNullable("presentation_group_key"))

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

        @JsonProperty("is_refundable") @ExcludeMissing fun _isRefundable() = isRefundable

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("created_by") @ExcludeMissing fun _createdBy() = createdBy

        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        fun _billableMetricId() = billableMetricId

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
        fun _quantityConversion() = quantityConversion

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using
         * the provided rounding method and decimal places. For example, if the method is "round up"
         * and the decimal places is 0, then the quantity will be rounded up to the nearest integer.
         */
        @JsonProperty("quantity_rounding")
        @ExcludeMissing
        fun _quantityRounding() = quantityRounding

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_internal_item_id")
        @ExcludeMissing
        fun _netsuiteInternalItemId() = netsuiteInternalItemId

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_overage_item_id")
        @ExcludeMissing
        fun _netsuiteOverageItemId() = netsuiteOverageItemId

        @JsonProperty("composite_product_ids")
        @ExcludeMissing
        fun _compositeProductIds() = compositeProductIds

        @JsonProperty("composite_tags") @ExcludeMissing fun _compositeTags() = compositeTags

        @JsonProperty("tags") @ExcludeMissing fun _tags() = tags

        @JsonProperty("exclude_free_usage")
        @ExcludeMissing
        fun _excludeFreeUsage() = excludeFreeUsage

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        @JsonProperty("pricing_group_key") @ExcludeMissing fun _pricingGroupKey() = pricingGroupKey

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        @JsonProperty("presentation_group_key")
        @ExcludeMissing
        fun _presentationGroupKey() = presentationGroupKey

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Update = apply {
            if (!validated) {
                name()
                startingAt()
                isRefundable()
                createdAt()
                createdBy()
                billableMetricId()
                quantityConversion().map { it.validate() }
                quantityRounding().map { it.validate() }
                netsuiteInternalItemId()
                netsuiteOverageItemId()
                compositeProductIds()
                compositeTags()
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
            private var isRefundable: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var billableMetricId: JsonField<String> = JsonMissing.of()
            private var quantityConversion: JsonField<QuantityConversion> = JsonMissing.of()
            private var quantityRounding: JsonField<QuantityRounding> = JsonMissing.of()
            private var netsuiteInternalItemId: JsonField<String> = JsonMissing.of()
            private var netsuiteOverageItemId: JsonField<String> = JsonMissing.of()
            private var compositeProductIds: JsonField<List<String>> = JsonMissing.of()
            private var compositeTags: JsonField<List<String>> = JsonMissing.of()
            private var tags: JsonField<List<String>> = JsonMissing.of()
            private var excludeFreeUsage: JsonField<Boolean> = JsonMissing.of()
            private var pricingGroupKey: JsonField<List<String>> = JsonMissing.of()
            private var presentationGroupKey: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(update: Update) = apply {
                name = update.name
                startingAt = update.startingAt
                isRefundable = update.isRefundable
                createdAt = update.createdAt
                createdBy = update.createdBy
                billableMetricId = update.billableMetricId
                quantityConversion = update.quantityConversion
                quantityRounding = update.quantityRounding
                netsuiteInternalItemId = update.netsuiteInternalItemId
                netsuiteOverageItemId = update.netsuiteOverageItemId
                compositeProductIds = update.compositeProductIds
                compositeTags = update.compositeTags
                tags = update.tags
                excludeFreeUsage = update.excludeFreeUsage
                pricingGroupKey = update.pricingGroupKey
                presentationGroupKey = update.presentationGroupKey
                additionalProperties = update.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            fun isRefundable(isRefundable: Boolean) = isRefundable(JsonField.of(isRefundable))

            fun isRefundable(isRefundable: JsonField<Boolean>) = apply {
                this.isRefundable = isRefundable
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            fun billableMetricId(billableMetricId: String) =
                billableMetricId(JsonField.of(billableMetricId))

            fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be converted
             * using the provided conversion factor and operation. For example, if the operation is
             * "multiply" and the conversion factor is 100, then the quantity will be multiplied
             * by 100. This can be used in cases where data is sent in one unit and priced in
             * another. For example, data could be sent in MB and priced in GB. In this case, the
             * conversion factor would be 1024 and the operation would be "divide".
             */
            fun quantityConversion(quantityConversion: QuantityConversion) =
                quantityConversion(JsonField.of(quantityConversion))

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
            fun quantityRounding(quantityRounding: QuantityRounding) =
                quantityRounding(JsonField.of(quantityRounding))

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be rounded
             * using the provided rounding method and decimal places. For example, if the method is
             * "round up" and the decimal places is 0, then the quantity will be rounded up to the
             * nearest integer.
             */
            fun quantityRounding(quantityRounding: JsonField<QuantityRounding>) = apply {
                this.quantityRounding = quantityRounding
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

            fun compositeProductIds(compositeProductIds: List<String>) =
                compositeProductIds(JsonField.of(compositeProductIds))

            fun compositeProductIds(compositeProductIds: JsonField<List<String>>) = apply {
                this.compositeProductIds = compositeProductIds
            }

            fun compositeTags(compositeTags: List<String>) =
                compositeTags(JsonField.of(compositeTags))

            fun compositeTags(compositeTags: JsonField<List<String>>) = apply {
                this.compositeTags = compositeTags
            }

            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            fun tags(tags: JsonField<List<String>>) = apply { this.tags = tags }

            fun excludeFreeUsage(excludeFreeUsage: Boolean) =
                excludeFreeUsage(JsonField.of(excludeFreeUsage))

            fun excludeFreeUsage(excludeFreeUsage: JsonField<Boolean>) = apply {
                this.excludeFreeUsage = excludeFreeUsage
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
                this.pricingGroupKey = pricingGroupKey
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
                this.presentationGroupKey = presentationGroupKey
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

            fun build(): Update =
                Update(
                    name,
                    startingAt,
                    isRefundable,
                    createdAt,
                    createdBy,
                    billableMetricId,
                    quantityConversion,
                    quantityRounding,
                    netsuiteInternalItemId,
                    netsuiteOverageItemId,
                    compositeProductIds.map { it.toImmutable() },
                    compositeTags.map { it.toImmutable() },
                    tags.map { it.toImmutable() },
                    excludeFreeUsage,
                    pricingGroupKey.map { it.toImmutable() },
                    presentationGroupKey.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Update && name == other.name && startingAt == other.startingAt && isRefundable == other.isRefundable && createdAt == other.createdAt && createdBy == other.createdBy && billableMetricId == other.billableMetricId && quantityConversion == other.quantityConversion && quantityRounding == other.quantityRounding && netsuiteInternalItemId == other.netsuiteInternalItemId && netsuiteOverageItemId == other.netsuiteOverageItemId && compositeProductIds == other.compositeProductIds && compositeTags == other.compositeTags && tags == other.tags && excludeFreeUsage == other.excludeFreeUsage && pricingGroupKey == other.pricingGroupKey && presentationGroupKey == other.presentationGroupKey && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, startingAt, isRefundable, createdAt, createdBy, billableMetricId, quantityConversion, quantityRounding, netsuiteInternalItemId, netsuiteOverageItemId, compositeProductIds, compositeTags, tags, excludeFreeUsage, pricingGroupKey, presentationGroupKey, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Update{name=$name, startingAt=$startingAt, isRefundable=$isRefundable, createdAt=$createdAt, createdBy=$createdBy, billableMetricId=$billableMetricId, quantityConversion=$quantityConversion, quantityRounding=$quantityRounding, netsuiteInternalItemId=$netsuiteInternalItemId, netsuiteOverageItemId=$netsuiteOverageItemId, compositeProductIds=$compositeProductIds, compositeTags=$compositeTags, tags=$tags, excludeFreeUsage=$excludeFreeUsage, pricingGroupKey=$pricingGroupKey, presentationGroupKey=$presentationGroupKey, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties = customFields.additionalProperties.toMutableMap()
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

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractProductListResponse && id == other.id && type == other.type && archivedAt == other.archivedAt && initial == other.initial && current == other.current && updates == other.updates && customFields == other.customFields && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, type, archivedAt, initial, current, updates, customFields, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractProductListResponse{id=$id, type=$type, archivedAt=$archivedAt, initial=$initial, current=$current, updates=$updates, customFields=$customFields, additionalProperties=$additionalProperties}"
}
