// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.products

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
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

class ProductListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val current: JsonField<ProductListItemState>,
    private val initial: JsonField<ProductListItemState>,
    private val type: JsonField<Type>,
    private val updates: JsonField<List<Update>>,
    private val archivedAt: JsonField<OffsetDateTime>,
    private val customFields: JsonField<CustomFields>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("current")
        @ExcludeMissing
        current: JsonField<ProductListItemState> = JsonMissing.of(),
        @JsonProperty("initial")
        @ExcludeMissing
        initial: JsonField<ProductListItemState> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updates")
        @ExcludeMissing
        updates: JsonField<List<Update>> = JsonMissing.of(),
        @JsonProperty("archived_at")
        @ExcludeMissing
        archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
    ) : this(id, current, initial, type, updates, archivedAt, customFields, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun current(): ProductListItemState = current.getRequired("current")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun initial(): ProductListItemState = initial.getRequired("initial")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updates(): List<Update> = updates.getRequired("updates")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archivedAt(): Optional<OffsetDateTime> = archivedAt.getOptional("archived_at")

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [current].
     *
     * Unlike [current], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current")
    @ExcludeMissing
    fun _current(): JsonField<ProductListItemState> = current

    /**
     * Returns the raw JSON value of [initial].
     *
     * Unlike [initial], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("initial")
    @ExcludeMissing
    fun _initial(): JsonField<ProductListItemState> = initial

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updates].
     *
     * Unlike [updates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updates") @ExcludeMissing fun _updates(): JsonField<List<Update>> = updates

    /**
     * Returns the raw JSON value of [archivedAt].
     *
     * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived_at")
    @ExcludeMissing
    fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

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
         * Returns a mutable builder for constructing an instance of [ProductListResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .current()
         * .initial()
         * .type()
         * .updates()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProductListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var current: JsonField<ProductListItemState>? = null
        private var initial: JsonField<ProductListItemState>? = null
        private var type: JsonField<Type>? = null
        private var updates: JsonField<MutableList<Update>>? = null
        private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(productListResponse: ProductListResponse) = apply {
            id = productListResponse.id
            current = productListResponse.current
            initial = productListResponse.initial
            type = productListResponse.type
            updates = productListResponse.updates.map { it.toMutableList() }
            archivedAt = productListResponse.archivedAt
            customFields = productListResponse.customFields
            additionalProperties = productListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun current(current: ProductListItemState) = current(JsonField.of(current))

        /**
         * Sets [Builder.current] to an arbitrary JSON value.
         *
         * You should usually call [Builder.current] with a well-typed [ProductListItemState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun current(current: JsonField<ProductListItemState>) = apply { this.current = current }

        fun initial(initial: ProductListItemState) = initial(JsonField.of(initial))

        /**
         * Sets [Builder.initial] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initial] with a well-typed [ProductListItemState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun initial(initial: JsonField<ProductListItemState>) = apply { this.initial = initial }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun updates(updates: List<Update>) = updates(JsonField.of(updates))

        /**
         * Sets [Builder.updates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updates] with a well-typed `List<Update>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updates(updates: JsonField<List<Update>>) = apply {
            this.updates = updates.map { it.toMutableList() }
        }

        /**
         * Adds a single [Update] to [updates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUpdate(update: Update) = apply {
            updates =
                (updates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("updates", it).add(update)
                }
        }

        fun archivedAt(archivedAt: OffsetDateTime?) = archivedAt(JsonField.ofNullable(archivedAt))

        /** Alias for calling [Builder.archivedAt] with `archivedAt.orElse(null)`. */
        fun archivedAt(archivedAt: Optional<OffsetDateTime>) = archivedAt(archivedAt.getOrNull())

        /**
         * Sets [Builder.archivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [ProductListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .current()
         * .initial()
         * .type()
         * .updates()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProductListResponse =
            ProductListResponse(
                checkRequired("id", id),
                checkRequired("current", current),
                checkRequired("initial", initial),
                checkRequired("type", type),
                checkRequired("updates", updates).map { it.toImmutable() },
                archivedAt,
                customFields,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProductListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        current().validate()
        initial().validate()
        type().validate()
        updates().forEach { it.validate() }
        archivedAt()
        customFields().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (current.asKnown().getOrNull()?.validity() ?: 0) +
            (initial.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (updates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (archivedAt.asKnown().isPresent) 1 else 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0)

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val USAGE = of("USAGE")

            @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

            @JvmField val COMPOSITE = of("COMPOSITE")

            @JvmField val FIXED = of("FIXED")

            @JvmField val PRO_SERVICE = of("PRO_SERVICE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            USAGE,
            SUBSCRIPTION,
            COMPOSITE,
            FIXED,
            PRO_SERVICE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USAGE,
            SUBSCRIPTION,
            COMPOSITE,
            FIXED,
            PRO_SERVICE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                USAGE -> Value.USAGE
                SUBSCRIPTION -> Value.SUBSCRIPTION
                COMPOSITE -> Value.COMPOSITE
                FIXED -> Value.FIXED
                PRO_SERVICE -> Value.PRO_SERVICE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                USAGE -> Known.USAGE
                SUBSCRIPTION -> Known.SUBSCRIPTION
                COMPOSITE -> Known.COMPOSITE
                FIXED -> Known.FIXED
                PRO_SERVICE -> Known.PRO_SERVICE
                else -> throw MetronomeInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                MetronomeInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Update
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val billableMetricId: JsonField<String>,
        private val compositeProductIds: JsonField<List<String>>,
        private val compositeTags: JsonField<List<String>>,
        private val excludeFreeUsage: JsonField<Boolean>,
        private val isRefundable: JsonField<Boolean>,
        private val name: JsonField<String>,
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
            @JsonProperty("created_by")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
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
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun billableMetricId(): Optional<String> =
            billableMetricId.getOptional("billable_metric_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun compositeProductIds(): Optional<List<String>> =
            compositeProductIds.getOptional("composite_product_ids")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun compositeTags(): Optional<List<String>> = compositeTags.getOptional("composite_tags")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun excludeFreeUsage(): Optional<Boolean> =
            excludeFreeUsage.getOptional("exclude_free_usage")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isRefundable(): Optional<Boolean> = isRefundable.getOptional("is_refundable")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteInternalItemId(): Optional<String> =
            netsuiteInternalItemId.getOptional("netsuite_internal_item_id")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteOverageItemId(): Optional<String> =
            netsuiteOverageItemId.getOptional("netsuite_overage_item_id")

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun presentationGroupKey(): Optional<List<String>> =
            presentationGroupKey.getOptional("presentation_group_key")

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pricingGroupKey(): Optional<List<String>> =
            pricingGroupKey.getOptional("pricing_group_key")

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be converted
         * using the provided conversion factor and operation. For example, if the operation is
         * "multiply" and the conversion factor is 100, then the quantity will be multiplied by 100.
         * This can be used in cases where data is sent in one unit and priced in another. For
         * example, data could be sent in MB and priced in GB. In this case, the conversion factor
         * would be 1024 and the operation would be "divide".
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun quantityConversion(): Optional<QuantityConversion> =
            quantityConversion.getOptional("quantity_conversion")

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using
         * the provided rounding method and decimal places. For example, if the method is "round up"
         * and the decimal places is 0, then the quantity will be rounded up to the nearest integer.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun quantityRounding(): Optional<QuantityRounding> =
            quantityRounding.getOptional("quantity_rounding")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startingAt(): Optional<OffsetDateTime> = startingAt.getOptional("starting_at")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
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
         * Unlike [compositeProductIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("composite_product_ids")
        @ExcludeMissing
        fun _compositeProductIds(): JsonField<List<String>> = compositeProductIds

        /**
         * Returns the raw JSON value of [compositeTags].
         *
         * Unlike [compositeTags], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [isRefundable], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_refundable")
        @ExcludeMissing
        fun _isRefundable(): JsonField<Boolean> = isRefundable

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Unlike [netsuiteOverageItemId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_overage_item_id")
        @ExcludeMissing
        fun _netsuiteOverageItemId(): JsonField<String> = netsuiteOverageItemId

        /**
         * Returns the raw JSON value of [presentationGroupKey].
         *
         * Unlike [presentationGroupKey], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("presentation_group_key")
        @ExcludeMissing
        fun _presentationGroupKey(): JsonField<List<String>> = presentationGroupKey

        /**
         * Returns the raw JSON value of [pricingGroupKey].
         *
         * Unlike [pricingGroupKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pricing_group_key")
        @ExcludeMissing
        fun _pricingGroupKey(): JsonField<List<String>> = pricingGroupKey

        /**
         * Returns the raw JSON value of [quantityConversion].
         *
         * Unlike [quantityConversion], this method doesn't throw if the JSON field has an
         * unexpected type.
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
             * Returns a mutable builder for constructing an instance of [Update].
             *
             * The following fields are required:
             * ```java
             * .createdAt()
             * .createdBy()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Update]. */
        class Builder internal constructor() {

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

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

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
             * You should usually call [Builder.compositeProductIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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

            fun compositeTags(compositeTags: List<String>) =
                compositeTags(JsonField.of(compositeTags))

            /**
             * Sets [Builder.compositeTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.compositeTags] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            fun isRefundable(isRefundable: Boolean) = isRefundable(JsonField.of(isRefundable))

            /**
             * Sets [Builder.isRefundable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isRefundable] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isRefundable(isRefundable: JsonField<Boolean>) = apply {
                this.isRefundable = isRefundable
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteInternalItemId(netsuiteInternalItemId: String) =
                netsuiteInternalItemId(JsonField.of(netsuiteInternalItemId))

            /**
             * Sets [Builder.netsuiteInternalItemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteInternalItemId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.netsuiteOverageItemId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Sets [Builder.presentationGroupKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.presentationGroupKey] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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
             * pricing_group_key value, as opposed to the product as a whole. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun pricingGroupKey(pricingGroupKey: List<String>) =
                pricingGroupKey(JsonField.of(pricingGroupKey))

            /**
             * Sets [Builder.pricingGroupKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricingGroupKey] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * "multiply" and the conversion factor is 100, then the quantity will be multiplied
             * by 100. This can be used in cases where data is sent in one unit and priced in
             * another. For example, data could be sent in MB and priced in GB. In this case, the
             * conversion factor would be 1024 and the operation would be "divide".
             */
            fun quantityConversion(quantityConversion: QuantityConversion?) =
                quantityConversion(JsonField.ofNullable(quantityConversion))

            /**
             * Alias for calling [Builder.quantityConversion] with
             * `quantityConversion.orElse(null)`.
             */
            fun quantityConversion(quantityConversion: Optional<QuantityConversion>) =
                quantityConversion(quantityConversion.getOrNull())

            /**
             * Sets [Builder.quantityConversion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantityConversion] with a well-typed
             * [QuantityConversion] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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
             * Alias for calling [Builder.quantityRounding] with `quantityRounding.orElse(null)`.
             */
            fun quantityRounding(quantityRounding: Optional<QuantityRounding>) =
                quantityRounding(quantityRounding.getOrNull())

            /**
             * Sets [Builder.quantityRounding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantityRounding] with a well-typed
             * [QuantityRounding] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
             * Returns an immutable instance of [Update].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .createdAt()
             * .createdBy()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Update =
                Update(
                    checkRequired("createdAt", createdAt),
                    checkRequired("createdBy", createdBy),
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
                    additionalProperties.toMutableMap(),
                )
        }

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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (billableMetricId.asKnown().isPresent) 1 else 0) +
                (compositeProductIds.asKnown().getOrNull()?.size ?: 0) +
                (compositeTags.asKnown().getOrNull()?.size ?: 0) +
                (if (excludeFreeUsage.asKnown().isPresent) 1 else 0) +
                (if (isRefundable.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
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

            return other is Update &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                billableMetricId == other.billableMetricId &&
                compositeProductIds == other.compositeProductIds &&
                compositeTags == other.compositeTags &&
                excludeFreeUsage == other.excludeFreeUsage &&
                isRefundable == other.isRefundable &&
                name == other.name &&
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
                startingAt,
                tags,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Update{createdAt=$createdAt, createdBy=$createdBy, billableMetricId=$billableMetricId, compositeProductIds=$compositeProductIds, compositeTags=$compositeTags, excludeFreeUsage=$excludeFreeUsage, isRefundable=$isRefundable, name=$name, netsuiteInternalItemId=$netsuiteInternalItemId, netsuiteOverageItemId=$netsuiteOverageItemId, presentationGroupKey=$presentationGroupKey, pricingGroupKey=$pricingGroupKey, quantityConversion=$quantityConversion, quantityRounding=$quantityRounding, startingAt=$startingAt, tags=$tags, additionalProperties=$additionalProperties}"
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    class CustomFields
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CustomFields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomFields]. */
        class Builder internal constructor() {

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

            /**
             * Returns an immutable instance of [CustomFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductListResponse &&
            id == other.id &&
            current == other.current &&
            initial == other.initial &&
            type == other.type &&
            updates == other.updates &&
            archivedAt == other.archivedAt &&
            customFields == other.customFields &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            current,
            initial,
            type,
            updates,
            archivedAt,
            customFields,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductListResponse{id=$id, current=$current, initial=$initial, type=$type, updates=$updates, archivedAt=$archivedAt, customFields=$customFields, additionalProperties=$additionalProperties}"
}
