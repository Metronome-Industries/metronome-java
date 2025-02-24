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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class BillableMetricListResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("aggregation_key")
    @ExcludeMissing
    private val aggregationKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("aggregation_type")
    @ExcludeMissing
    private val aggregationType: JsonField<AggregationType> = JsonMissing.of(),
    @JsonProperty("archived_at")
    @ExcludeMissing
    private val archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("event_type_filter")
    @ExcludeMissing
    private val eventTypeFilter: JsonField<EventTypeFilter> = JsonMissing.of(),
    @JsonProperty("group_keys")
    @ExcludeMissing
    private val groupKeys: JsonField<List<List<String>>> = JsonMissing.of(),
    @JsonProperty("property_filters")
    @ExcludeMissing
    private val propertyFilters: JsonField<List<PropertyFilter>> = JsonMissing.of(),
    @JsonProperty("sql") @ExcludeMissing private val sql: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** ID of the billable metric */
    fun id(): String = id.getRequired("id")

    /** The display name of the billable metric. */
    fun name(): String = name.getRequired("name")

    /**
     * A key that specifies which property of the event is used to aggregate data. This key must be
     * one of the property filter names and is not applicable when the aggregation type is 'count'.
     */
    fun aggregationKey(): Optional<String> =
        Optional.ofNullable(aggregationKey.getNullable("aggregation_key"))

    /** Specifies the type of aggregation performed on matching events. */
    fun aggregationType(): Optional<AggregationType> =
        Optional.ofNullable(aggregationType.getNullable("aggregation_type"))

    /**
     * RFC 3339 timestamp indicating when the billable metric was archived. If not provided, the
     * billable metric is not archived.
     */
    fun archivedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(archivedAt.getNullable("archived_at"))

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    /** An optional filtering rule to match the 'event_type' property of an event. */
    fun eventTypeFilter(): Optional<EventTypeFilter> =
        Optional.ofNullable(eventTypeFilter.getNullable("event_type_filter"))

    /**
     * Property names that are used to group usage costs on an invoice. Each entry represents a set
     * of properties used to slice events into distinct buckets.
     */
    fun groupKeys(): Optional<List<List<String>>> =
        Optional.ofNullable(groupKeys.getNullable("group_keys"))

    /**
     * A list of filters to match events to this billable metric. Each filter defines a rule on an
     * event property. All rules must pass for the event to match the billable metric.
     */
    fun propertyFilters(): Optional<List<PropertyFilter>> =
        Optional.ofNullable(propertyFilters.getNullable("property_filters"))

    /** The SQL query associated with the billable metric */
    fun sql(): Optional<String> = Optional.ofNullable(sql.getNullable("sql"))

    /** ID of the billable metric */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The display name of the billable metric. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * A key that specifies which property of the event is used to aggregate data. This key must be
     * one of the property filter names and is not applicable when the aggregation type is 'count'.
     */
    @JsonProperty("aggregation_key")
    @ExcludeMissing
    fun _aggregationKey(): JsonField<String> = aggregationKey

    /** Specifies the type of aggregation performed on matching events. */
    @JsonProperty("aggregation_type")
    @ExcludeMissing
    fun _aggregationType(): JsonField<AggregationType> = aggregationType

    /**
     * RFC 3339 timestamp indicating when the billable metric was archived. If not provided, the
     * billable metric is not archived.
     */
    @JsonProperty("archived_at")
    @ExcludeMissing
    fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /** An optional filtering rule to match the 'event_type' property of an event. */
    @JsonProperty("event_type_filter")
    @ExcludeMissing
    fun _eventTypeFilter(): JsonField<EventTypeFilter> = eventTypeFilter

    /**
     * Property names that are used to group usage costs on an invoice. Each entry represents a set
     * of properties used to slice events into distinct buckets.
     */
    @JsonProperty("group_keys")
    @ExcludeMissing
    fun _groupKeys(): JsonField<List<List<String>>> = groupKeys

    /**
     * A list of filters to match events to this billable metric. Each filter defines a rule on an
     * event property. All rules must pass for the event to match the billable metric.
     */
    @JsonProperty("property_filters")
    @ExcludeMissing
    fun _propertyFilters(): JsonField<List<PropertyFilter>> = propertyFilters

    /** The SQL query associated with the billable metric */
    @JsonProperty("sql") @ExcludeMissing fun _sql(): JsonField<String> = sql

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BillableMetricListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        aggregationKey()
        aggregationType()
        archivedAt()
        customFields().ifPresent { it.validate() }
        eventTypeFilter().ifPresent { it.validate() }
        groupKeys()
        propertyFilters().ifPresent { it.forEach { it.validate() } }
        sql()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillableMetricListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var aggregationKey: JsonField<String> = JsonMissing.of()
        private var aggregationType: JsonField<AggregationType> = JsonMissing.of()
        private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var eventTypeFilter: JsonField<EventTypeFilter> = JsonMissing.of()
        private var groupKeys: JsonField<MutableList<List<String>>>? = null
        private var propertyFilters: JsonField<MutableList<PropertyFilter>>? = null
        private var sql: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(billableMetricListResponse: BillableMetricListResponse) = apply {
            id = billableMetricListResponse.id
            name = billableMetricListResponse.name
            aggregationKey = billableMetricListResponse.aggregationKey
            aggregationType = billableMetricListResponse.aggregationType
            archivedAt = billableMetricListResponse.archivedAt
            customFields = billableMetricListResponse.customFields
            eventTypeFilter = billableMetricListResponse.eventTypeFilter
            groupKeys = billableMetricListResponse.groupKeys.map { it.toMutableList() }
            propertyFilters = billableMetricListResponse.propertyFilters.map { it.toMutableList() }
            sql = billableMetricListResponse.sql
            additionalProperties = billableMetricListResponse.additionalProperties.toMutableMap()
        }

        /** ID of the billable metric */
        fun id(id: String) = id(JsonField.of(id))

        /** ID of the billable metric */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The display name of the billable metric. */
        fun name(name: String) = name(JsonField.of(name))

        /** The display name of the billable metric. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * A key that specifies which property of the event is used to aggregate data. This key must
         * be one of the property filter names and is not applicable when the aggregation type is
         * 'count'.
         */
        fun aggregationKey(aggregationKey: String) = aggregationKey(JsonField.of(aggregationKey))

        /**
         * A key that specifies which property of the event is used to aggregate data. This key must
         * be one of the property filter names and is not applicable when the aggregation type is
         * 'count'.
         */
        fun aggregationKey(aggregationKey: JsonField<String>) = apply {
            this.aggregationKey = aggregationKey
        }

        /** Specifies the type of aggregation performed on matching events. */
        fun aggregationType(aggregationType: AggregationType) =
            aggregationType(JsonField.of(aggregationType))

        /** Specifies the type of aggregation performed on matching events. */
        fun aggregationType(aggregationType: JsonField<AggregationType>) = apply {
            this.aggregationType = aggregationType
        }

        /**
         * RFC 3339 timestamp indicating when the billable metric was archived. If not provided, the
         * billable metric is not archived.
         */
        fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

        /**
         * RFC 3339 timestamp indicating when the billable metric was archived. If not provided, the
         * billable metric is not archived.
         */
        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
        }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        /** An optional filtering rule to match the 'event_type' property of an event. */
        fun eventTypeFilter(eventTypeFilter: EventTypeFilter) =
            eventTypeFilter(JsonField.of(eventTypeFilter))

        /** An optional filtering rule to match the 'event_type' property of an event. */
        fun eventTypeFilter(eventTypeFilter: JsonField<EventTypeFilter>) = apply {
            this.eventTypeFilter = eventTypeFilter
        }

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        fun groupKeys(groupKeys: List<List<String>>) = groupKeys(JsonField.of(groupKeys))

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        fun groupKeys(groupKeys: JsonField<List<List<String>>>) = apply {
            this.groupKeys = groupKeys.map { it.toMutableList() }
        }

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        fun addGroupKey(groupKey: List<String>) = apply {
            groupKeys =
                (groupKeys ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(groupKey)
                }
        }

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        fun propertyFilters(propertyFilters: List<PropertyFilter>) =
            propertyFilters(JsonField.of(propertyFilters))

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        fun propertyFilters(propertyFilters: JsonField<List<PropertyFilter>>) = apply {
            this.propertyFilters = propertyFilters.map { it.toMutableList() }
        }

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        fun addPropertyFilter(propertyFilter: PropertyFilter) = apply {
            propertyFilters =
                (propertyFilters ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(propertyFilter)
                }
        }

        /** The SQL query associated with the billable metric */
        fun sql(sql: String) = sql(JsonField.of(sql))

        /** The SQL query associated with the billable metric */
        fun sql(sql: JsonField<String>) = apply { this.sql = sql }

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

        fun build(): BillableMetricListResponse =
            BillableMetricListResponse(
                checkRequired("id", id),
                checkRequired("name", name),
                aggregationKey,
                aggregationType,
                archivedAt,
                customFields,
                eventTypeFilter,
                (groupKeys ?: JsonMissing.of()).map { it.toImmutable() },
                (propertyFilters ?: JsonMissing.of()).map { it.toImmutable() },
                sql,
                additionalProperties.toImmutable(),
            )
    }

    /** Specifies the type of aggregation performed on matching events. */
    class AggregationType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val COUNT = of("COUNT")

            @JvmField val LATEST = of("LATEST")

            @JvmField val MAX = of("MAX")

            @JvmField val SUM = of("SUM")

            @JvmField val UNIQUE = of("UNIQUE")

            @JvmStatic fun of(value: String) = AggregationType(JsonField.of(value))
        }

        /** An enum containing [AggregationType]'s known values. */
        enum class Known {
            COUNT,
            LATEST,
            MAX,
            SUM,
            UNIQUE,
        }

        /**
         * An enum containing [AggregationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AggregationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COUNT,
            LATEST,
            MAX,
            SUM,
            UNIQUE,
            /**
             * An enum member indicating that [AggregationType] was instantiated with an unknown
             * value.
             */
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
                COUNT -> Value.COUNT
                LATEST -> Value.LATEST
                MAX -> Value.MAX
                SUM -> Value.SUM
                UNIQUE -> Value.UNIQUE
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
                COUNT -> Known.COUNT
                LATEST -> Known.LATEST
                MAX -> Known.MAX
                SUM -> Known.SUM
                UNIQUE -> Known.UNIQUE
                else -> throw MetronomeInvalidDataException("Unknown AggregationType: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AggregationType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

        return /* spotless:off */ other is BillableMetricListResponse && id == other.id && name == other.name && aggregationKey == other.aggregationKey && aggregationType == other.aggregationType && archivedAt == other.archivedAt && customFields == other.customFields && eventTypeFilter == other.eventTypeFilter && groupKeys == other.groupKeys && propertyFilters == other.propertyFilters && sql == other.sql && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, aggregationKey, aggregationType, archivedAt, customFields, eventTypeFilter, groupKeys, propertyFilters, sql, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillableMetricListResponse{id=$id, name=$name, aggregationKey=$aggregationKey, aggregationType=$aggregationType, archivedAt=$archivedAt, customFields=$customFields, eventTypeFilter=$eventTypeFilter, groupKeys=$groupKeys, propertyFilters=$propertyFilters, sql=$sql, additionalProperties=$additionalProperties}"
}
