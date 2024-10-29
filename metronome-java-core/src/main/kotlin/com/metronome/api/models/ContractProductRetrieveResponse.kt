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
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ContractProductRetrieveResponse.Builder::class)
@NoAutoDetect
class ContractProductRetrieveResponse
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun data(): Data = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ContractProductRetrieveResponse = apply {
        if (!validated) {
            data().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractProductRetrieveResponse: ContractProductRetrieveResponse) =
            apply {
                this.data = contractProductRetrieveResponse.data
                additionalProperties(contractProductRetrieveResponse.additionalProperties)
            }

        fun data(data: Data) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<Data>) = apply { this.data = data }

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

        fun build(): ContractProductRetrieveResponse =
            ContractProductRetrieveResponse(data, additionalProperties.toUnmodifiable())
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val id: JsonField<String>,
        private val type: JsonField<Type>,
        private val archivedAt: JsonField<OffsetDateTime>,
        private val initial: JsonField<ProductListItemState>,
        private val current: JsonField<ProductListItemState>,
        private val updates: JsonField<List<Update>>,
        private val customFields: JsonField<CustomFields>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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

        fun validate(): Data = apply {
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
            internal fun from(data: Data) = apply {
                this.id = data.id
                this.type = data.type
                this.archivedAt = data.archivedAt
                this.initial = data.initial
                this.current = data.current
                this.updates = data.updates
                this.customFields = data.customFields
                additionalProperties(data.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun type(type: Type) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

            @JsonProperty("archived_at")
            @ExcludeMissing
            fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
                this.archivedAt = archivedAt
            }

            fun initial(initial: ProductListItemState) = initial(JsonField.of(initial))

            @JsonProperty("initial")
            @ExcludeMissing
            fun initial(initial: JsonField<ProductListItemState>) = apply { this.initial = initial }

            fun current(current: ProductListItemState) = current(JsonField.of(current))

            @JsonProperty("current")
            @ExcludeMissing
            fun current(current: JsonField<ProductListItemState>) = apply { this.current = current }

            fun updates(updates: List<Update>) = updates(JsonField.of(updates))

            @JsonProperty("updates")
            @ExcludeMissing
            fun updates(updates: JsonField<List<Update>>) = apply { this.updates = updates }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            @JsonProperty("custom_fields")
            @ExcludeMissing
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
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

            fun build(): Data =
                Data(
                    id,
                    type,
                    archivedAt,
                    initial,
                    current,
                    updates.map { it.toUnmodifiable() },
                    customFields,
                    additionalProperties.toUnmodifiable(),
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

                @JvmField val USAGE = Type(JsonField.of("USAGE"))

                @JvmField val SUBSCRIPTION = Type(JsonField.of("SUBSCRIPTION"))

                @JvmField val COMPOSITE = Type(JsonField.of("COMPOSITE"))

                @JvmField val FIXED = Type(JsonField.of("FIXED"))

                @JvmField val PRO_SERVICE = Type(JsonField.of("PRO_SERVICE"))

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
        }

        @JsonDeserialize(builder = Update.Builder::class)
        @NoAutoDetect
        class Update
        private constructor(
            private val name: JsonField<String>,
            private val startingAt: JsonField<OffsetDateTime>,
            private val isRefundable: JsonField<Boolean>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val createdBy: JsonField<String>,
            private val billableMetricId: JsonField<String>,
            private val quantityConversion: JsonField<QuantityConversion>,
            private val quantityRounding: JsonField<QuantityRounding>,
            private val netsuiteInternalItemId: JsonField<String>,
            private val netsuiteOverageItemId: JsonField<String>,
            private val compositeProductIds: JsonField<List<String>>,
            private val compositeTags: JsonField<List<String>>,
            private val tags: JsonField<List<String>>,
            private val excludeFreeUsage: JsonField<Boolean>,
            private val pricingGroupKey: JsonField<List<String>>,
            private val presentationGroupKey: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

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
             * pricing_group_key value, as opposed to the product as a whole.
             */
            fun pricingGroupKey(): Optional<List<String>> =
                Optional.ofNullable(pricingGroupKey.getNullable("pricing_group_key"))

            /** For USAGE products only. Groups usage line items on invoices. */
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
             * "multiply" and the conversion factor is 100, then the quantity will be multiplied
             * by 100. This can be used in cases where data is sent in one unit and priced in
             * another. For example, data could be sent in MB and priced in GB. In this case, the
             * conversion factor would be 1024 and the operation would be "divide".
             */
            @JsonProperty("quantity_conversion")
            @ExcludeMissing
            fun _quantityConversion() = quantityConversion

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be rounded
             * using the provided rounding method and decimal places. For example, if the method is
             * "round up" and the decimal places is 0, then the quantity will be rounded up to the
             * nearest integer.
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
             * pricing_group_key value, as opposed to the product as a whole.
             */
            @JsonProperty("pricing_group_key")
            @ExcludeMissing
            fun _pricingGroupKey() = pricingGroupKey

            /** For USAGE products only. Groups usage line items on invoices. */
            @JsonProperty("presentation_group_key")
            @ExcludeMissing
            fun _presentationGroupKey() = presentationGroupKey

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                    this.name = update.name
                    this.startingAt = update.startingAt
                    this.isRefundable = update.isRefundable
                    this.createdAt = update.createdAt
                    this.createdBy = update.createdBy
                    this.billableMetricId = update.billableMetricId
                    this.quantityConversion = update.quantityConversion
                    this.quantityRounding = update.quantityRounding
                    this.netsuiteInternalItemId = update.netsuiteInternalItemId
                    this.netsuiteOverageItemId = update.netsuiteOverageItemId
                    this.compositeProductIds = update.compositeProductIds
                    this.compositeTags = update.compositeTags
                    this.tags = update.tags
                    this.excludeFreeUsage = update.excludeFreeUsage
                    this.pricingGroupKey = update.pricingGroupKey
                    this.presentationGroupKey = update.presentationGroupKey
                    additionalProperties(update.additionalProperties)
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

                fun isRefundable(isRefundable: Boolean) = isRefundable(JsonField.of(isRefundable))

                @JsonProperty("is_refundable")
                @ExcludeMissing
                fun isRefundable(isRefundable: JsonField<Boolean>) = apply {
                    this.isRefundable = isRefundable
                }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                @JsonProperty("created_at")
                @ExcludeMissing
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

                @JsonProperty("created_by")
                @ExcludeMissing
                fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

                fun billableMetricId(billableMetricId: String) =
                    billableMetricId(JsonField.of(billableMetricId))

                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                    this.billableMetricId = billableMetricId
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
                fun quantityConversion(quantityConversion: QuantityConversion) =
                    quantityConversion(JsonField.of(quantityConversion))

                /**
                 * Optional. Only valid for USAGE products. If provided, the quantity will be
                 * converted using the provided conversion factor and operation. For example, if the
                 * operation is "multiply" and the conversion factor is 100, then the quantity will
                 * be multiplied by 100. This can be used in cases where data is sent in one unit
                 * and priced in another. For example, data could be sent in MB and priced in GB. In
                 * this case, the conversion factor would be 1024 and the operation would be
                 * "divide".
                 */
                @JsonProperty("quantity_conversion")
                @ExcludeMissing
                fun quantityConversion(quantityConversion: JsonField<QuantityConversion>) = apply {
                    this.quantityConversion = quantityConversion
                }

                /**
                 * Optional. Only valid for USAGE products. If provided, the quantity will be
                 * rounded using the provided rounding method and decimal places. For example, if
                 * the method is "round up" and the decimal places is 0, then the quantity will be
                 * rounded up to the nearest integer.
                 */
                fun quantityRounding(quantityRounding: QuantityRounding) =
                    quantityRounding(JsonField.of(quantityRounding))

                /**
                 * Optional. Only valid for USAGE products. If provided, the quantity will be
                 * rounded using the provided rounding method and decimal places. For example, if
                 * the method is "round up" and the decimal places is 0, then the quantity will be
                 * rounded up to the nearest integer.
                 */
                @JsonProperty("quantity_rounding")
                @ExcludeMissing
                fun quantityRounding(quantityRounding: JsonField<QuantityRounding>) = apply {
                    this.quantityRounding = quantityRounding
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

                /** This field's availability is dependent on your client's configuration. */
                fun netsuiteOverageItemId(netsuiteOverageItemId: String) =
                    netsuiteOverageItemId(JsonField.of(netsuiteOverageItemId))

                /** This field's availability is dependent on your client's configuration. */
                @JsonProperty("netsuite_overage_item_id")
                @ExcludeMissing
                fun netsuiteOverageItemId(netsuiteOverageItemId: JsonField<String>) = apply {
                    this.netsuiteOverageItemId = netsuiteOverageItemId
                }

                fun compositeProductIds(compositeProductIds: List<String>) =
                    compositeProductIds(JsonField.of(compositeProductIds))

                @JsonProperty("composite_product_ids")
                @ExcludeMissing
                fun compositeProductIds(compositeProductIds: JsonField<List<String>>) = apply {
                    this.compositeProductIds = compositeProductIds
                }

                fun compositeTags(compositeTags: List<String>) =
                    compositeTags(JsonField.of(compositeTags))

                @JsonProperty("composite_tags")
                @ExcludeMissing
                fun compositeTags(compositeTags: JsonField<List<String>>) = apply {
                    this.compositeTags = compositeTags
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
                 * For USAGE products only. If set, pricing for this product will be determined for
                 * each pricing_group_key value, as opposed to the product as a whole.
                 */
                fun pricingGroupKey(pricingGroupKey: List<String>) =
                    pricingGroupKey(JsonField.of(pricingGroupKey))

                /**
                 * For USAGE products only. If set, pricing for this product will be determined for
                 * each pricing_group_key value, as opposed to the product as a whole.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
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
                        compositeProductIds.map { it.toUnmodifiable() },
                        compositeTags.map { it.toUnmodifiable() },
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

                return /* spotless:off */ other is Update && this.name == other.name && this.startingAt == other.startingAt && this.isRefundable == other.isRefundable && this.createdAt == other.createdAt && this.createdBy == other.createdBy && this.billableMetricId == other.billableMetricId && this.quantityConversion == other.quantityConversion && this.quantityRounding == other.quantityRounding && this.netsuiteInternalItemId == other.netsuiteInternalItemId && this.netsuiteOverageItemId == other.netsuiteOverageItemId && this.compositeProductIds == other.compositeProductIds && this.compositeTags == other.compositeTags && this.tags == other.tags && this.excludeFreeUsage == other.excludeFreeUsage && this.pricingGroupKey == other.pricingGroupKey && this.presentationGroupKey == other.presentationGroupKey && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(name, startingAt, isRefundable, createdAt, createdBy, billableMetricId, quantityConversion, quantityRounding, netsuiteInternalItemId, netsuiteOverageItemId, compositeProductIds, compositeTags, tags, excludeFreeUsage, pricingGroupKey, presentationGroupKey, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Update{name=$name, startingAt=$startingAt, isRefundable=$isRefundable, createdAt=$createdAt, createdBy=$createdBy, billableMetricId=$billableMetricId, quantityConversion=$quantityConversion, quantityRounding=$quantityRounding, netsuiteInternalItemId=$netsuiteInternalItemId, netsuiteOverageItemId=$netsuiteOverageItemId, compositeProductIds=$compositeProductIds, compositeTags=$compositeTags, tags=$tags, excludeFreeUsage=$excludeFreeUsage, pricingGroupKey=$pricingGroupKey, presentationGroupKey=$presentationGroupKey, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = CustomFields.Builder::class)
        @NoAutoDetect
        class CustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                    additionalProperties(customFields.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CustomFields = CustomFields(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && this.id == other.id && this.type == other.type && this.archivedAt == other.archivedAt && this.initial == other.initial && this.current == other.current && this.updates == other.updates && this.customFields == other.customFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(id, type, archivedAt, initial, current, updates, customFields, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Data{id=$id, type=$type, archivedAt=$archivedAt, initial=$initial, current=$current, updates=$updates, customFields=$customFields, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractProductRetrieveResponse && this.data == other.data && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(data, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ContractProductRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
