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
class ContractProductRetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): Data = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ContractProductRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractProductRetrieveResponse: ContractProductRetrieveResponse) =
            apply {
                data = contractProductRetrieveResponse.data
                additionalProperties =
                    contractProductRetrieveResponse.additionalProperties.toMutableMap()
            }

        fun data(data: Data) = data(JsonField.of(data))

        fun data(data: JsonField<Data>) = apply { this.data = data }

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

        fun build(): ContractProductRetrieveResponse =
            ContractProductRetrieveResponse(
                checkNotNull(data) { "`data` is required but was not set" },
                additionalProperties.toImmutable()
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("current")
        @ExcludeMissing
        private val current: JsonField<ProductListItemState> = JsonMissing.of(),
        @JsonProperty("initial")
        @ExcludeMissing
        private val initial: JsonField<ProductListItemState> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updates")
        @ExcludeMissing
        private val updates: JsonField<List<Update>> = JsonMissing.of(),
        @JsonProperty("archived_at")
        @ExcludeMissing
        private val archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun current(): ProductListItemState = current.getRequired("current")

        fun initial(): ProductListItemState = initial.getRequired("initial")

        fun type(): Type = type.getRequired("type")

        fun updates(): List<Update> = updates.getRequired("updates")

        fun archivedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(archivedAt.getNullable("archived_at"))

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("current")
        @ExcludeMissing
        fun _current(): JsonField<ProductListItemState> = current

        @JsonProperty("initial")
        @ExcludeMissing
        fun _initial(): JsonField<ProductListItemState> = initial

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonProperty("updates") @ExcludeMissing fun _updates(): JsonField<List<Update>> = updates

        @JsonProperty("archived_at")
        @ExcludeMissing
        fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            current().validate()
            initial().validate()
            type()
            updates().forEach { it.validate() }
            archivedAt()
            customFields().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var current: JsonField<ProductListItemState>? = null
            private var initial: JsonField<ProductListItemState>? = null
            private var type: JsonField<Type>? = null
            private var updates: JsonField<MutableList<Update>>? = null
            private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                current = data.current
                initial = data.initial
                type = data.type
                updates = data.updates.map { it.toMutableList() }
                archivedAt = data.archivedAt
                customFields = data.customFields
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun current(current: ProductListItemState) = current(JsonField.of(current))

            fun current(current: JsonField<ProductListItemState>) = apply { this.current = current }

            fun initial(initial: ProductListItemState) = initial(JsonField.of(initial))

            fun initial(initial: JsonField<ProductListItemState>) = apply { this.initial = initial }

            fun type(type: Type) = type(JsonField.of(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun updates(updates: List<Update>) = updates(JsonField.of(updates))

            fun updates(updates: JsonField<List<Update>>) = apply {
                this.updates = updates.map { it.toMutableList() }
            }

            fun addUpdate(update: Update) = apply {
                updates =
                    (updates ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(update)
                    }
            }

            fun archivedAt(archivedAt: OffsetDateTime?) =
                archivedAt(JsonField.ofNullable(archivedAt))

            fun archivedAt(archivedAt: Optional<OffsetDateTime>) =
                archivedAt(archivedAt.orElse(null))

            fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
                this.archivedAt = archivedAt
            }

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

            fun build(): Data =
                Data(
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(current) { "`current` is required but was not set" },
                    checkNotNull(initial) { "`initial` is required but was not set" },
                    checkNotNull(type) { "`type` is required but was not set" },
                    checkNotNull(updates) { "`updates` is required but was not set" }
                        .map { it.toImmutable() },
                    archivedAt,
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
            @JsonProperty("created_at")
            @ExcludeMissing
            private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("created_by")
            @ExcludeMissing
            private val createdBy: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("tags")
            @ExcludeMissing
            private val tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            fun createdBy(): String = createdBy.getRequired("created_by")

            fun billableMetricId(): Optional<String> =
                Optional.ofNullable(billableMetricId.getNullable("billable_metric_id"))

            fun compositeProductIds(): Optional<List<String>> =
                Optional.ofNullable(compositeProductIds.getNullable("composite_product_ids"))

            fun compositeTags(): Optional<List<String>> =
                Optional.ofNullable(compositeTags.getNullable("composite_tags"))

            fun excludeFreeUsage(): Optional<Boolean> =
                Optional.ofNullable(excludeFreeUsage.getNullable("exclude_free_usage"))

            fun isRefundable(): Optional<Boolean> =
                Optional.ofNullable(isRefundable.getNullable("is_refundable"))

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteInternalItemId(): Optional<String> =
                Optional.ofNullable(netsuiteInternalItemId.getNullable("netsuite_internal_item_id"))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteOverageItemId(): Optional<String> =
                Optional.ofNullable(netsuiteOverageItemId.getNullable("netsuite_overage_item_id"))

            /**
             * For USAGE products only. Groups usage line items on invoices. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun presentationGroupKey(): Optional<List<String>> =
                Optional.ofNullable(presentationGroupKey.getNullable("presentation_group_key"))

            /**
             * For USAGE products only. If set, pricing for this product will be determined for each
             * pricing_group_key value, as opposed to the product as a whole. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun pricingGroupKey(): Optional<List<String>> =
                Optional.ofNullable(pricingGroupKey.getNullable("pricing_group_key"))

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be converted
             * using the provided conversion factor and operation. For example, if the operation is
             * "multiply" and the conversion factor is 100, then the quantity will be multiplied
             * by 100. This can be used in cases where data is sent in one unit and priced in
             * another. For example, data could be sent in MB and priced in GB. In this case, the
             * conversion factor would be 1024 and the operation would be "divide".
             */
            fun quantityConversion(): Optional<QuantityConversion> =
                Optional.ofNullable(quantityConversion.getNullable("quantity_conversion"))

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be rounded
             * using the provided rounding method and decimal places. For example, if the method is
             * "round up" and the decimal places is 0, then the quantity will be rounded up to the
             * nearest integer.
             */
            fun quantityRounding(): Optional<QuantityRounding> =
                Optional.ofNullable(quantityRounding.getNullable("quantity_rounding"))

            fun startingAt(): Optional<OffsetDateTime> =
                Optional.ofNullable(startingAt.getNullable("starting_at"))

            fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            @JsonProperty("created_by")
            @ExcludeMissing
            fun _createdBy(): JsonField<String> = createdBy

            @JsonProperty("billable_metric_id")
            @ExcludeMissing
            fun _billableMetricId(): JsonField<String> = billableMetricId

            @JsonProperty("composite_product_ids")
            @ExcludeMissing
            fun _compositeProductIds(): JsonField<List<String>> = compositeProductIds

            @JsonProperty("composite_tags")
            @ExcludeMissing
            fun _compositeTags(): JsonField<List<String>> = compositeTags

            @JsonProperty("exclude_free_usage")
            @ExcludeMissing
            fun _excludeFreeUsage(): JsonField<Boolean> = excludeFreeUsage

            @JsonProperty("is_refundable")
            @ExcludeMissing
            fun _isRefundable(): JsonField<Boolean> = isRefundable

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_internal_item_id")
            @ExcludeMissing
            fun _netsuiteInternalItemId(): JsonField<String> = netsuiteInternalItemId

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_overage_item_id")
            @ExcludeMissing
            fun _netsuiteOverageItemId(): JsonField<String> = netsuiteOverageItemId

            /**
             * For USAGE products only. Groups usage line items on invoices. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            @JsonProperty("presentation_group_key")
            @ExcludeMissing
            fun _presentationGroupKey(): JsonField<List<String>> = presentationGroupKey

            /**
             * For USAGE products only. If set, pricing for this product will be determined for each
             * pricing_group_key value, as opposed to the product as a whole. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            @JsonProperty("pricing_group_key")
            @ExcludeMissing
            fun _pricingGroupKey(): JsonField<List<String>> = pricingGroupKey

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be converted
             * using the provided conversion factor and operation. For example, if the operation is
             * "multiply" and the conversion factor is 100, then the quantity will be multiplied
             * by 100. This can be used in cases where data is sent in one unit and priced in
             * another. For example, data could be sent in MB and priced in GB. In this case, the
             * conversion factor would be 1024 and the operation would be "divide".
             */
            @JsonProperty("quantity_conversion")
            @ExcludeMissing
            fun _quantityConversion(): JsonField<QuantityConversion> = quantityConversion

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be rounded
             * using the provided rounding method and decimal places. For example, if the method is
             * "round up" and the decimal places is 0, then the quantity will be rounded up to the
             * nearest integer.
             */
            @JsonProperty("quantity_rounding")
            @ExcludeMissing
            fun _quantityRounding(): JsonField<QuantityRounding> = quantityRounding

            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Update = apply {
                if (validated) {
                    return@apply
                }

                createdAt()
                createdBy()
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
                startingAt()
                tags()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var createdAt: JsonField<OffsetDateTime>? = null
                private var createdBy: JsonField<String>? = null
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
                private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var tags: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(update: Update) = apply {
                    createdAt = update.createdAt
                    createdBy = update.createdBy
                    billableMetricId = update.billableMetricId
                    compositeProductIds = update.compositeProductIds.map { it.toMutableList() }
                    compositeTags = update.compositeTags.map { it.toMutableList() }
                    excludeFreeUsage = update.excludeFreeUsage
                    isRefundable = update.isRefundable
                    name = update.name
                    netsuiteInternalItemId = update.netsuiteInternalItemId
                    netsuiteOverageItemId = update.netsuiteOverageItemId
                    presentationGroupKey = update.presentationGroupKey.map { it.toMutableList() }
                    pricingGroupKey = update.pricingGroupKey.map { it.toMutableList() }
                    quantityConversion = update.quantityConversion
                    quantityRounding = update.quantityRounding
                    startingAt = update.startingAt
                    tags = update.tags.map { it.toMutableList() }
                    additionalProperties = update.additionalProperties.toMutableMap()
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

                fun compositeProductIds(compositeProductIds: List<String>) =
                    compositeProductIds(JsonField.of(compositeProductIds))

                fun compositeProductIds(compositeProductIds: JsonField<List<String>>) = apply {
                    this.compositeProductIds = compositeProductIds.map { it.toMutableList() }
                }

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

                fun compositeTags(compositeTags: List<String>) =
                    compositeTags(JsonField.of(compositeTags))

                fun compositeTags(compositeTags: JsonField<List<String>>) = apply {
                    this.compositeTags = compositeTags.map { it.toMutableList() }
                }

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

                fun excludeFreeUsage(excludeFreeUsage: Boolean) =
                    excludeFreeUsage(JsonField.of(excludeFreeUsage))

                fun excludeFreeUsage(excludeFreeUsage: JsonField<Boolean>) = apply {
                    this.excludeFreeUsage = excludeFreeUsage
                }

                fun isRefundable(isRefundable: Boolean) = isRefundable(JsonField.of(isRefundable))

                fun isRefundable(isRefundable: JsonField<Boolean>) = apply {
                    this.isRefundable = isRefundable
                }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * For USAGE products only. Groups usage line items on invoices. The superset of
                 * values in the pricing group key and presentation group key must be set as one
                 * compound group key on the billable metric.
                 */
                fun presentationGroupKey(presentationGroupKey: List<String>) =
                    presentationGroupKey(JsonField.of(presentationGroupKey))

                /**
                 * For USAGE products only. Groups usage line items on invoices. The superset of
                 * values in the pricing group key and presentation group key must be set as one
                 * compound group key on the billable metric.
                 */
                fun presentationGroupKey(presentationGroupKey: JsonField<List<String>>) = apply {
                    this.presentationGroupKey = presentationGroupKey.map { it.toMutableList() }
                }

                /**
                 * For USAGE products only. Groups usage line items on invoices. The superset of
                 * values in the pricing group key and presentation group key must be set as one
                 * compound group key on the billable metric.
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
                 * For USAGE products only. If set, pricing for this product will be determined for
                 * each pricing_group_key value, as opposed to the product as a whole. The superset
                 * of values in the pricing group key and presentation group key must be set as one
                 * compound group key on the billable metric.
                 */
                fun pricingGroupKey(pricingGroupKey: List<String>) =
                    pricingGroupKey(JsonField.of(pricingGroupKey))

                /**
                 * For USAGE products only. If set, pricing for this product will be determined for
                 * each pricing_group_key value, as opposed to the product as a whole. The superset
                 * of values in the pricing group key and presentation group key must be set as one
                 * compound group key on the billable metric.
                 */
                fun pricingGroupKey(pricingGroupKey: JsonField<List<String>>) = apply {
                    this.pricingGroupKey = pricingGroupKey.map { it.toMutableList() }
                }

                /**
                 * For USAGE products only. If set, pricing for this product will be determined for
                 * each pricing_group_key value, as opposed to the product as a whole. The superset
                 * of values in the pricing group key and presentation group key must be set as one
                 * compound group key on the billable metric.
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
                 * Optional. Only valid for USAGE products. If provided, the quantity will be
                 * converted using the provided conversion factor and operation. For example, if the
                 * operation is "multiply" and the conversion factor is 100, then the quantity will
                 * be multiplied by 100. This can be used in cases where data is sent in one unit
                 * and priced in another. For example, data could be sent in MB and priced in GB. In
                 * this case, the conversion factor would be 1024 and the operation would be
                 * "divide".
                 */
                fun quantityConversion(quantityConversion: QuantityConversion?) =
                    quantityConversion(JsonField.ofNullable(quantityConversion))

                /**
                 * Optional. Only valid for USAGE products. If provided, the quantity will be
                 * converted using the provided conversion factor and operation. For example, if the
                 * operation is "multiply" and the conversion factor is 100, then the quantity will
                 * be multiplied by 100. This can be used in cases where data is sent in one unit
                 * and priced in another. For example, data could be sent in MB and priced in GB. In
                 * this case, the conversion factor would be 1024 and the operation would be
                 * "divide".
                 */
                fun quantityConversion(quantityConversion: Optional<QuantityConversion>) =
                    quantityConversion(quantityConversion.orElse(null))

                /**
                 * Optional. Only valid for USAGE products. If provided, the quantity will be
                 * converted using the provided conversion factor and operation. For example, if the
                 * operation is "multiply" and the conversion factor is 100, then the quantity will
                 * be multiplied by 100. This can be used in cases where data is sent in one unit
                 * and priced in another. For example, data could be sent in MB and priced in GB. In
                 * this case, the conversion factor would be 1024 and the operation would be
                 * "divide".
                 */
                fun quantityConversion(quantityConversion: JsonField<QuantityConversion>) = apply {
                    this.quantityConversion = quantityConversion
                }

                /**
                 * Optional. Only valid for USAGE products. If provided, the quantity will be
                 * rounded using the provided rounding method and decimal places. For example, if
                 * the method is "round up" and the decimal places is 0, then the quantity will be
                 * rounded up to the nearest integer.
                 */
                fun quantityRounding(quantityRounding: QuantityRounding?) =
                    quantityRounding(JsonField.ofNullable(quantityRounding))

                /**
                 * Optional. Only valid for USAGE products. If provided, the quantity will be
                 * rounded using the provided rounding method and decimal places. For example, if
                 * the method is "round up" and the decimal places is 0, then the quantity will be
                 * rounded up to the nearest integer.
                 */
                fun quantityRounding(quantityRounding: Optional<QuantityRounding>) =
                    quantityRounding(quantityRounding.orElse(null))

                /**
                 * Optional. Only valid for USAGE products. If provided, the quantity will be
                 * rounded using the provided rounding method and decimal places. For example, if
                 * the method is "round up" and the decimal places is 0, then the quantity will be
                 * rounded up to the nearest integer.
                 */
                fun quantityRounding(quantityRounding: JsonField<QuantityRounding>) = apply {
                    this.quantityRounding = quantityRounding
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Update =
                    Update(
                        checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                        checkNotNull(createdBy) { "`createdBy` is required but was not set" },
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
                        startingAt,
                        (tags ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Update && createdAt == other.createdAt && createdBy == other.createdBy && billableMetricId == other.billableMetricId && compositeProductIds == other.compositeProductIds && compositeTags == other.compositeTags && excludeFreeUsage == other.excludeFreeUsage && isRefundable == other.isRefundable && name == other.name && netsuiteInternalItemId == other.netsuiteInternalItemId && netsuiteOverageItemId == other.netsuiteOverageItemId && presentationGroupKey == other.presentationGroupKey && pricingGroupKey == other.pricingGroupKey && quantityConversion == other.quantityConversion && quantityRounding == other.quantityRounding && startingAt == other.startingAt && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(createdAt, createdBy, billableMetricId, compositeProductIds, compositeTags, excludeFreeUsage, isRefundable, name, netsuiteInternalItemId, netsuiteOverageItemId, presentationGroupKey, pricingGroupKey, quantityConversion, quantityRounding, startingAt, tags, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Update{createdAt=$createdAt, createdBy=$createdBy, billableMetricId=$billableMetricId, compositeProductIds=$compositeProductIds, compositeTags=$compositeTags, excludeFreeUsage=$excludeFreeUsage, isRefundable=$isRefundable, name=$name, netsuiteInternalItemId=$netsuiteInternalItemId, netsuiteOverageItemId=$netsuiteOverageItemId, presentationGroupKey=$presentationGroupKey, pricingGroupKey=$pricingGroupKey, quantityConversion=$quantityConversion, quantityRounding=$quantityRounding, startingAt=$startingAt, tags=$tags, additionalProperties=$additionalProperties}"
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
                if (validated) {
                    return@apply
                }

                validated = true
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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

            return /* spotless:off */ other is Data && id == other.id && current == other.current && initial == other.initial && type == other.type && updates == other.updates && archivedAt == other.archivedAt && customFields == other.customFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, current, initial, type, updates, archivedAt, customFields, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, current=$current, initial=$initial, type=$type, updates=$updates, archivedAt=$archivedAt, customFields=$customFields, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractProductRetrieveResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractProductRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
