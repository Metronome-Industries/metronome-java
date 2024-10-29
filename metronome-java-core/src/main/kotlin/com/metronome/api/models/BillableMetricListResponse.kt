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
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = BillableMetricListResponse.Builder::class)
@NoAutoDetect
class BillableMetricListResponse
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val eventTypeFilter: JsonField<EventTypeFilter>,
    private val propertyFilters: JsonField<List<PropertyFilter>>,
    private val aggregationType: JsonField<AggregationType>,
    private val aggregationKey: JsonField<String>,
    private val groupKeys: JsonField<List<List<String>>>,
    private val customFields: JsonField<CustomFields>,
    private val sql: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** ID of the billable metric */
    fun id(): String = id.getRequired("id")

    /** The display name of the billable metric. */
    fun name(): String = name.getRequired("name")

    /** An optional filtering rule to match the 'event_type' property of an event. */
    fun eventTypeFilter(): Optional<EventTypeFilter> =
        Optional.ofNullable(eventTypeFilter.getNullable("event_type_filter"))

    /**
     * A list of filters to match events to this billable metric. Each filter defines a rule on an
     * event property. All rules must pass for the event to match the billable metric.
     */
    fun propertyFilters(): Optional<List<PropertyFilter>> =
        Optional.ofNullable(propertyFilters.getNullable("property_filters"))

    /** Specifies the type of aggregation performed on matching events. */
    fun aggregationType(): Optional<AggregationType> =
        Optional.ofNullable(aggregationType.getNullable("aggregation_type"))

    /**
     * A key that specifies which property of the event is used to aggregate data. This key must be
     * one of the property filter names and is not applicable when the aggregation type is 'count'.
     */
    fun aggregationKey(): Optional<String> =
        Optional.ofNullable(aggregationKey.getNullable("aggregation_key"))

    /**
     * Property names that are used to group usage costs on an invoice. Each entry represents a set
     * of properties used to slice events into distinct buckets.
     */
    fun groupKeys(): Optional<List<List<String>>> =
        Optional.ofNullable(groupKeys.getNullable("group_keys"))

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    /** The SQL query associated with the billable metric */
    fun sql(): Optional<String> = Optional.ofNullable(sql.getNullable("sql"))

    /** ID of the billable metric */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The display name of the billable metric. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** An optional filtering rule to match the 'event_type' property of an event. */
    @JsonProperty("event_type_filter") @ExcludeMissing fun _eventTypeFilter() = eventTypeFilter

    /**
     * A list of filters to match events to this billable metric. Each filter defines a rule on an
     * event property. All rules must pass for the event to match the billable metric.
     */
    @JsonProperty("property_filters") @ExcludeMissing fun _propertyFilters() = propertyFilters

    /** Specifies the type of aggregation performed on matching events. */
    @JsonProperty("aggregation_type") @ExcludeMissing fun _aggregationType() = aggregationType

    /**
     * A key that specifies which property of the event is used to aggregate data. This key must be
     * one of the property filter names and is not applicable when the aggregation type is 'count'.
     */
    @JsonProperty("aggregation_key") @ExcludeMissing fun _aggregationKey() = aggregationKey

    /**
     * Property names that are used to group usage costs on an invoice. Each entry represents a set
     * of properties used to slice events into distinct buckets.
     */
    @JsonProperty("group_keys") @ExcludeMissing fun _groupKeys() = groupKeys

    @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

    /** The SQL query associated with the billable metric */
    @JsonProperty("sql") @ExcludeMissing fun _sql() = sql

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): BillableMetricListResponse = apply {
        if (!validated) {
            id()
            name()
            eventTypeFilter().map { it.validate() }
            propertyFilters().map { it.forEach { it.validate() } }
            aggregationType()
            aggregationKey()
            groupKeys()
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

        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var eventTypeFilter: JsonField<EventTypeFilter> = JsonMissing.of()
        private var propertyFilters: JsonField<List<PropertyFilter>> = JsonMissing.of()
        private var aggregationType: JsonField<AggregationType> = JsonMissing.of()
        private var aggregationKey: JsonField<String> = JsonMissing.of()
        private var groupKeys: JsonField<List<List<String>>> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var sql: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(billableMetricListResponse: BillableMetricListResponse) = apply {
            this.id = billableMetricListResponse.id
            this.name = billableMetricListResponse.name
            this.eventTypeFilter = billableMetricListResponse.eventTypeFilter
            this.propertyFilters = billableMetricListResponse.propertyFilters
            this.aggregationType = billableMetricListResponse.aggregationType
            this.aggregationKey = billableMetricListResponse.aggregationKey
            this.groupKeys = billableMetricListResponse.groupKeys
            this.customFields = billableMetricListResponse.customFields
            this.sql = billableMetricListResponse.sql
            additionalProperties(billableMetricListResponse.additionalProperties)
        }

        /** ID of the billable metric */
        fun id(id: String) = id(JsonField.of(id))

        /** ID of the billable metric */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The display name of the billable metric. */
        fun name(name: String) = name(JsonField.of(name))

        /** The display name of the billable metric. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun build(): BillableMetricListResponse =
            BillableMetricListResponse(
                id,
                name,
                eventTypeFilter,
                propertyFilters.map { it.toUnmodifiable() },
                aggregationType,
                aggregationKey,
                groupKeys.map { it.toUnmodifiable() },
                customFields,
                sql,
                additionalProperties.toUnmodifiable(),
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

        return /* spotless:off */ other is BillableMetricListResponse && this.id == other.id && this.name == other.name && this.eventTypeFilter == other.eventTypeFilter && this.propertyFilters == other.propertyFilters && this.aggregationType == other.aggregationType && this.aggregationKey == other.aggregationKey && this.groupKeys == other.groupKeys && this.customFields == other.customFields && this.sql == other.sql && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, name, eventTypeFilter, propertyFilters, aggregationType, aggregationKey, groupKeys, customFields, sql, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "BillableMetricListResponse{id=$id, name=$name, eventTypeFilter=$eventTypeFilter, propertyFilters=$propertyFilters, aggregationType=$aggregationType, aggregationKey=$aggregationKey, groupKeys=$groupKeys, customFields=$customFields, sql=$sql, additionalProperties=$additionalProperties}"
}
