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
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = CustomerListBillableMetricsResponse.Builder::class)
@NoAutoDetect
class CustomerListBillableMetricsResponse
private constructor(
    private val groupBy: JsonField<List<String>>,
    private val groupKeys: JsonField<List<List<String>>>,
    private val name: JsonField<String>,
    private val id: JsonField<String>,
    private val aggregate: JsonField<String>,
    private val aggregateKeys: JsonField<List<String>>,
    private val filter: JsonField<Filter>,
    private val aggregationType: JsonField<AggregationType>,
    private val aggregationKey: JsonField<String>,
    private val eventTypeFilter: JsonField<EventTypeFilter>,
    private val propertyFilters: JsonField<List<PropertyFilter>>,
    private val customFields: JsonField<CustomFields>,
    private val sql: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** (DEPRECATED) use group_keys instead */
    fun groupBy(): Optional<List<String>> = Optional.ofNullable(groupBy.getNullable("group_by"))

    /**
     * Property names that are used to group usage costs on an invoice. Each entry represents a set
     * of properties used to slice events into distinct buckets.
     */
    fun groupKeys(): Optional<List<List<String>>> =
        Optional.ofNullable(groupKeys.getNullable("group_keys"))

    fun name(): String = name.getRequired("name")

    fun id(): String = id.getRequired("id")

    /** (DEPRECATED) use aggregation_type instead */
    fun aggregate(): Optional<String> = Optional.ofNullable(aggregate.getNullable("aggregate"))

    /** (DEPRECATED) use aggregation_key instead */
    fun aggregateKeys(): Optional<List<String>> =
        Optional.ofNullable(aggregateKeys.getNullable("aggregate_keys"))

    /** (DEPRECATED) use property_filters & event_type_filter instead */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter.getNullable("filter"))

    /** Specifies the type of aggregation performed on matching events. */
    fun aggregationType(): Optional<AggregationType> =
        Optional.ofNullable(aggregationType.getNullable("aggregation_type"))

    /**
     * A key that specifies which property of the event is used to aggregate data. This key must be
     * one of the property filter names and is not applicable when the aggregation type is 'count'.
     */
    fun aggregationKey(): Optional<String> =
        Optional.ofNullable(aggregationKey.getNullable("aggregation_key"))

    /** An optional filtering rule to match the 'event_type' property of an event. */
    fun eventTypeFilter(): Optional<EventTypeFilter> =
        Optional.ofNullable(eventTypeFilter.getNullable("event_type_filter"))

    /**
     * A list of filters to match events to this billable metric. Each filter defines a rule on an
     * event property. All rules must pass for the event to match the billable metric.
     */
    fun propertyFilters(): Optional<List<PropertyFilter>> =
        Optional.ofNullable(propertyFilters.getNullable("property_filters"))

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    /** The SQL query associated with the billable metric */
    fun sql(): Optional<String> = Optional.ofNullable(sql.getNullable("sql"))

    /** (DEPRECATED) use group_keys instead */
    @JsonProperty("group_by") @ExcludeMissing fun _groupBy() = groupBy

    /**
     * Property names that are used to group usage costs on an invoice. Each entry represents a set
     * of properties used to slice events into distinct buckets.
     */
    @JsonProperty("group_keys") @ExcludeMissing fun _groupKeys() = groupKeys

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** (DEPRECATED) use aggregation_type instead */
    @JsonProperty("aggregate") @ExcludeMissing fun _aggregate() = aggregate

    /** (DEPRECATED) use aggregation_key instead */
    @JsonProperty("aggregate_keys") @ExcludeMissing fun _aggregateKeys() = aggregateKeys

    /** (DEPRECATED) use property_filters & event_type_filter instead */
    @JsonProperty("filter") @ExcludeMissing fun _filter() = filter

    /** Specifies the type of aggregation performed on matching events. */
    @JsonProperty("aggregation_type") @ExcludeMissing fun _aggregationType() = aggregationType

    /**
     * A key that specifies which property of the event is used to aggregate data. This key must be
     * one of the property filter names and is not applicable when the aggregation type is 'count'.
     */
    @JsonProperty("aggregation_key") @ExcludeMissing fun _aggregationKey() = aggregationKey

    /** An optional filtering rule to match the 'event_type' property of an event. */
    @JsonProperty("event_type_filter") @ExcludeMissing fun _eventTypeFilter() = eventTypeFilter

    /**
     * A list of filters to match events to this billable metric. Each filter defines a rule on an
     * event property. All rules must pass for the event to match the billable metric.
     */
    @JsonProperty("property_filters") @ExcludeMissing fun _propertyFilters() = propertyFilters

    @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

    /** The SQL query associated with the billable metric */
    @JsonProperty("sql") @ExcludeMissing fun _sql() = sql

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CustomerListBillableMetricsResponse = apply {
        if (!validated) {
            groupBy()
            groupKeys()
            name()
            id()
            aggregate()
            aggregateKeys()
            filter().map { it.validate() }
            aggregationType()
            aggregationKey()
            eventTypeFilter().map { it.validate() }
            propertyFilters().map { it.forEach { it.validate() } }
            customFields().map { it.validate() }
            sql()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var groupBy: JsonField<List<String>> = JsonMissing.of()
        private var groupKeys: JsonField<List<List<String>>> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var aggregate: JsonField<String> = JsonMissing.of()
        private var aggregateKeys: JsonField<List<String>> = JsonMissing.of()
        private var filter: JsonField<Filter> = JsonMissing.of()
        private var aggregationType: JsonField<AggregationType> = JsonMissing.of()
        private var aggregationKey: JsonField<String> = JsonMissing.of()
        private var eventTypeFilter: JsonField<EventTypeFilter> = JsonMissing.of()
        private var propertyFilters: JsonField<List<PropertyFilter>> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var sql: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            customerListBillableMetricsResponse: CustomerListBillableMetricsResponse
        ) = apply {
            this.groupBy = customerListBillableMetricsResponse.groupBy
            this.groupKeys = customerListBillableMetricsResponse.groupKeys
            this.name = customerListBillableMetricsResponse.name
            this.id = customerListBillableMetricsResponse.id
            this.aggregate = customerListBillableMetricsResponse.aggregate
            this.aggregateKeys = customerListBillableMetricsResponse.aggregateKeys
            this.filter = customerListBillableMetricsResponse.filter
            this.aggregationType = customerListBillableMetricsResponse.aggregationType
            this.aggregationKey = customerListBillableMetricsResponse.aggregationKey
            this.eventTypeFilter = customerListBillableMetricsResponse.eventTypeFilter
            this.propertyFilters = customerListBillableMetricsResponse.propertyFilters
            this.customFields = customerListBillableMetricsResponse.customFields
            this.sql = customerListBillableMetricsResponse.sql
            additionalProperties(customerListBillableMetricsResponse.additionalProperties)
        }

        /** (DEPRECATED) use group_keys instead */
        fun groupBy(groupBy: List<String>) = groupBy(JsonField.of(groupBy))

        /** (DEPRECATED) use group_keys instead */
        @JsonProperty("group_by")
        @ExcludeMissing
        fun groupBy(groupBy: JsonField<List<String>>) = apply { this.groupBy = groupBy }

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        fun groupKeys(groupKeys: List<List<String>>) = groupKeys(JsonField.of(groupKeys))

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        @JsonProperty("group_keys")
        @ExcludeMissing
        fun groupKeys(groupKeys: JsonField<List<List<String>>>) = apply {
            this.groupKeys = groupKeys
        }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** (DEPRECATED) use aggregation_type instead */
        fun aggregate(aggregate: String) = aggregate(JsonField.of(aggregate))

        /** (DEPRECATED) use aggregation_type instead */
        @JsonProperty("aggregate")
        @ExcludeMissing
        fun aggregate(aggregate: JsonField<String>) = apply { this.aggregate = aggregate }

        /** (DEPRECATED) use aggregation_key instead */
        fun aggregateKeys(aggregateKeys: List<String>) = aggregateKeys(JsonField.of(aggregateKeys))

        /** (DEPRECATED) use aggregation_key instead */
        @JsonProperty("aggregate_keys")
        @ExcludeMissing
        fun aggregateKeys(aggregateKeys: JsonField<List<String>>) = apply {
            this.aggregateKeys = aggregateKeys
        }

        /** (DEPRECATED) use property_filters & event_type_filter instead */
        fun filter(filter: Filter) = filter(JsonField.of(filter))

        /** (DEPRECATED) use property_filters & event_type_filter instead */
        @JsonProperty("filter")
        @ExcludeMissing
        fun filter(filter: JsonField<Filter>) = apply { this.filter = filter }

        /** Specifies the type of aggregation performed on matching events. */
        fun aggregationType(aggregationType: AggregationType) =
            aggregationType(JsonField.of(aggregationType))

        /** Specifies the type of aggregation performed on matching events. */
        @JsonProperty("aggregation_type")
        @ExcludeMissing
        fun aggregationType(aggregationType: JsonField<AggregationType>) = apply {
            this.aggregationType = aggregationType
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
        @JsonProperty("aggregation_key")
        @ExcludeMissing
        fun aggregationKey(aggregationKey: JsonField<String>) = apply {
            this.aggregationKey = aggregationKey
        }

        /** An optional filtering rule to match the 'event_type' property of an event. */
        fun eventTypeFilter(eventTypeFilter: EventTypeFilter) =
            eventTypeFilter(JsonField.of(eventTypeFilter))

        /** An optional filtering rule to match the 'event_type' property of an event. */
        @JsonProperty("event_type_filter")
        @ExcludeMissing
        fun eventTypeFilter(eventTypeFilter: JsonField<EventTypeFilter>) = apply {
            this.eventTypeFilter = eventTypeFilter
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
        @JsonProperty("property_filters")
        @ExcludeMissing
        fun propertyFilters(propertyFilters: JsonField<List<PropertyFilter>>) = apply {
            this.propertyFilters = propertyFilters
        }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        /** The SQL query associated with the billable metric */
        fun sql(sql: String) = sql(JsonField.of(sql))

        /** The SQL query associated with the billable metric */
        @JsonProperty("sql")
        @ExcludeMissing
        fun sql(sql: JsonField<String>) = apply { this.sql = sql }

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

        fun build(): CustomerListBillableMetricsResponse =
            CustomerListBillableMetricsResponse(
                groupBy.map { it.toImmutable() },
                groupKeys.map { it.toImmutable() },
                name,
                id,
                aggregate,
                aggregateKeys.map { it.toImmutable() },
                filter,
                aggregationType,
                aggregationKey,
                eventTypeFilter,
                propertyFilters.map { it.toImmutable() },
                customFields,
                sql,
                additionalProperties.toImmutable(),
            )
    }

    class AggregationType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AggregationType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val COUNT = AggregationType(JsonField.of("COUNT"))

            @JvmField val LATEST = AggregationType(JsonField.of("LATEST"))

            @JvmField val MAX = AggregationType(JsonField.of("MAX"))

            @JvmField val SUM = AggregationType(JsonField.of("SUM"))

            @JvmField val UNIQUE = AggregationType(JsonField.of("UNIQUE"))

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
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

    /** (DEPRECATED) use property_filters & event_type_filter instead */
    @JsonDeserialize(builder = Filter.Builder::class)
    @NoAutoDetect
    class Filter
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Filter = apply {
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
            internal fun from(filter: Filter) = apply {
                additionalProperties(filter.additionalProperties)
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

            fun build(): Filter = Filter(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Filter && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Filter{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerListBillableMetricsResponse && this.groupBy == other.groupBy && this.groupKeys == other.groupKeys && this.name == other.name && this.id == other.id && this.aggregate == other.aggregate && this.aggregateKeys == other.aggregateKeys && this.filter == other.filter && this.aggregationType == other.aggregationType && this.aggregationKey == other.aggregationKey && this.eventTypeFilter == other.eventTypeFilter && this.propertyFilters == other.propertyFilters && this.customFields == other.customFields && this.sql == other.sql && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(groupBy, groupKeys, name, id, aggregate, aggregateKeys, filter, aggregationType, aggregationKey, eventTypeFilter, propertyFilters, customFields, sql, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "CustomerListBillableMetricsResponse{groupBy=$groupBy, groupKeys=$groupKeys, name=$name, id=$id, aggregate=$aggregate, aggregateKeys=$aggregateKeys, filter=$filter, aggregationType=$aggregationType, aggregationKey=$aggregationKey, eventTypeFilter=$eventTypeFilter, propertyFilters=$propertyFilters, customFields=$customFields, sql=$sql, additionalProperties=$additionalProperties}"
}
