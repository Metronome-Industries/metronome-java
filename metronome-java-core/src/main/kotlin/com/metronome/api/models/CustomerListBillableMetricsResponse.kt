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
class CustomerListBillableMetricsResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("aggregate")
    @ExcludeMissing
    private val aggregate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("aggregate_keys")
    @ExcludeMissing
    private val aggregateKeys: JsonField<List<String>> = JsonMissing.of(),
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
    @JsonProperty("filter")
    @ExcludeMissing
    private val filter: JsonField<Filter> = JsonMissing.of(),
    @JsonProperty("group_by")
    @ExcludeMissing
    private val groupBy: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("group_keys")
    @ExcludeMissing
    private val groupKeys: JsonField<List<List<String>>> = JsonMissing.of(),
    @JsonProperty("property_filters")
    @ExcludeMissing
    private val propertyFilters: JsonField<List<PropertyFilter>> = JsonMissing.of(),
    @JsonProperty("sql") @ExcludeMissing private val sql: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun name(): String = name.getRequired("name")

    /** (DEPRECATED) use aggregation_type instead */
    fun aggregate(): Optional<String> = Optional.ofNullable(aggregate.getNullable("aggregate"))

    /** (DEPRECATED) use aggregation_key instead */
    fun aggregateKeys(): Optional<List<String>> =
        Optional.ofNullable(aggregateKeys.getNullable("aggregate_keys"))

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

    /** (DEPRECATED) use property_filters & event_type_filter instead */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter.getNullable("filter"))

    /** (DEPRECATED) use group_keys instead */
    fun groupBy(): Optional<List<String>> = Optional.ofNullable(groupBy.getNullable("group_by"))

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

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** (DEPRECATED) use aggregation_type instead */
    @JsonProperty("aggregate") @ExcludeMissing fun _aggregate(): JsonField<String> = aggregate

    /** (DEPRECATED) use aggregation_key instead */
    @JsonProperty("aggregate_keys")
    @ExcludeMissing
    fun _aggregateKeys(): JsonField<List<String>> = aggregateKeys

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

    /** (DEPRECATED) use property_filters & event_type_filter instead */
    @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<Filter> = filter

    /** (DEPRECATED) use group_keys instead */
    @JsonProperty("group_by") @ExcludeMissing fun _groupBy(): JsonField<List<String>> = groupBy

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

    fun validate(): CustomerListBillableMetricsResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        aggregate()
        aggregateKeys()
        aggregationKey()
        aggregationType()
        archivedAt()
        customFields().ifPresent { it.validate() }
        eventTypeFilter().ifPresent { it.validate() }
        filter().ifPresent { it.validate() }
        groupBy()
        groupKeys()
        propertyFilters().ifPresent { it.forEach { it.validate() } }
        sql()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var aggregate: JsonField<String> = JsonMissing.of()
        private var aggregateKeys: JsonField<MutableList<String>>? = null
        private var aggregationKey: JsonField<String> = JsonMissing.of()
        private var aggregationType: JsonField<AggregationType> = JsonMissing.of()
        private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var eventTypeFilter: JsonField<EventTypeFilter> = JsonMissing.of()
        private var filter: JsonField<Filter> = JsonMissing.of()
        private var groupBy: JsonField<MutableList<String>>? = null
        private var groupKeys: JsonField<MutableList<List<String>>>? = null
        private var propertyFilters: JsonField<MutableList<PropertyFilter>>? = null
        private var sql: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            customerListBillableMetricsResponse: CustomerListBillableMetricsResponse
        ) = apply {
            id = customerListBillableMetricsResponse.id
            name = customerListBillableMetricsResponse.name
            aggregate = customerListBillableMetricsResponse.aggregate
            aggregateKeys =
                customerListBillableMetricsResponse.aggregateKeys.map { it.toMutableList() }
            aggregationKey = customerListBillableMetricsResponse.aggregationKey
            aggregationType = customerListBillableMetricsResponse.aggregationType
            archivedAt = customerListBillableMetricsResponse.archivedAt
            customFields = customerListBillableMetricsResponse.customFields
            eventTypeFilter = customerListBillableMetricsResponse.eventTypeFilter
            filter = customerListBillableMetricsResponse.filter
            groupBy = customerListBillableMetricsResponse.groupBy.map { it.toMutableList() }
            groupKeys = customerListBillableMetricsResponse.groupKeys.map { it.toMutableList() }
            propertyFilters =
                customerListBillableMetricsResponse.propertyFilters.map { it.toMutableList() }
            sql = customerListBillableMetricsResponse.sql
            additionalProperties =
                customerListBillableMetricsResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        /** (DEPRECATED) use aggregation_type instead */
        fun aggregate(aggregate: String) = aggregate(JsonField.of(aggregate))

        /** (DEPRECATED) use aggregation_type instead */
        fun aggregate(aggregate: JsonField<String>) = apply { this.aggregate = aggregate }

        /** (DEPRECATED) use aggregation_key instead */
        fun aggregateKeys(aggregateKeys: List<String>) = aggregateKeys(JsonField.of(aggregateKeys))

        /** (DEPRECATED) use aggregation_key instead */
        fun aggregateKeys(aggregateKeys: JsonField<List<String>>) = apply {
            this.aggregateKeys = aggregateKeys.map { it.toMutableList() }
        }

        /** (DEPRECATED) use aggregation_key instead */
        fun addAggregateKey(aggregateKey: String) = apply {
            aggregateKeys =
                (aggregateKeys ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(aggregateKey)
                }
        }

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

        /** (DEPRECATED) use property_filters & event_type_filter instead */
        fun filter(filter: Filter) = filter(JsonField.of(filter))

        /** (DEPRECATED) use property_filters & event_type_filter instead */
        fun filter(filter: JsonField<Filter>) = apply { this.filter = filter }

        /** (DEPRECATED) use group_keys instead */
        fun groupBy(groupBy: List<String>) = groupBy(JsonField.of(groupBy))

        /** (DEPRECATED) use group_keys instead */
        fun groupBy(groupBy: JsonField<List<String>>) = apply {
            this.groupBy = groupBy.map { it.toMutableList() }
        }

        /** (DEPRECATED) use group_keys instead */
        fun addGroupBy(groupBy: String) = apply {
            this.groupBy =
                (this.groupBy ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(groupBy)
                }
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

        fun build(): CustomerListBillableMetricsResponse =
            CustomerListBillableMetricsResponse(
                checkRequired("id", id),
                checkRequired("name", name),
                aggregate,
                (aggregateKeys ?: JsonMissing.of()).map { it.toImmutable() },
                aggregationKey,
                aggregationType,
                archivedAt,
                customFields,
                eventTypeFilter,
                filter,
                (groupBy ?: JsonMissing.of()).map { it.toImmutable() },
                (groupKeys ?: JsonMissing.of()).map { it.toImmutable() },
                (propertyFilters ?: JsonMissing.of()).map { it.toImmutable() },
                sql,
                additionalProperties.toImmutable(),
            )
    }

    /** Specifies the type of aggregation performed on matching events. */
    class AggregationType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val COUNT = of("COUNT")

            @JvmField val LATEST = of("LATEST")

            @JvmField val MAX = of("MAX")

            @JvmField val SUM = of("SUM")

            @JvmField val UNIQUE = of("UNIQUE")

            @JvmStatic fun of(value: String) = AggregationType(JsonField.of(value))
        }

        enum class Known {
            COUNT,
            LATEST,
            MAX,
            SUM,
            UNIQUE,
        }

        enum class Value {
            COUNT,
            LATEST,
            MAX,
            SUM,
            UNIQUE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COUNT -> Value.COUNT
                LATEST -> Value.LATEST
                MAX -> Value.MAX
                SUM -> Value.SUM
                UNIQUE -> Value.UNIQUE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COUNT -> Known.COUNT
                LATEST -> Known.LATEST
                MAX -> Known.MAX
                SUM -> Known.SUM
                UNIQUE -> Known.UNIQUE
                else -> throw MetronomeInvalidDataException("Unknown AggregationType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

    /** (DEPRECATED) use property_filters & event_type_filter instead */
    @NoAutoDetect
    class Filter
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Filter = apply {
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
            internal fun from(filter: Filter) = apply {
                additionalProperties = filter.additionalProperties.toMutableMap()
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

            fun build(): Filter = Filter(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Filter && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Filter{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerListBillableMetricsResponse && id == other.id && name == other.name && aggregate == other.aggregate && aggregateKeys == other.aggregateKeys && aggregationKey == other.aggregationKey && aggregationType == other.aggregationType && archivedAt == other.archivedAt && customFields == other.customFields && eventTypeFilter == other.eventTypeFilter && filter == other.filter && groupBy == other.groupBy && groupKeys == other.groupKeys && propertyFilters == other.propertyFilters && sql == other.sql && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, aggregate, aggregateKeys, aggregationKey, aggregationType, archivedAt, customFields, eventTypeFilter, filter, groupBy, groupKeys, propertyFilters, sql, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerListBillableMetricsResponse{id=$id, name=$name, aggregate=$aggregate, aggregateKeys=$aggregateKeys, aggregationKey=$aggregationKey, aggregationType=$aggregationType, archivedAt=$archivedAt, customFields=$customFields, eventTypeFilter=$eventTypeFilter, filter=$filter, groupBy=$groupBy, groupKeys=$groupKeys, propertyFilters=$propertyFilters, sql=$sql, additionalProperties=$additionalProperties}"
}
