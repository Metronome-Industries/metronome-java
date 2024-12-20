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
class BillableMetricRetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): Data = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BillableMetricRetrieveResponse = apply {
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
        internal fun from(billableMetricRetrieveResponse: BillableMetricRetrieveResponse) = apply {
            data = billableMetricRetrieveResponse.data
            additionalProperties =
                billableMetricRetrieveResponse.additionalProperties.toMutableMap()
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

        fun build(): BillableMetricRetrieveResponse =
            BillableMetricRetrieveResponse(data, additionalProperties.toImmutable())
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_type_filter")
        @ExcludeMissing
        private val eventTypeFilter: JsonField<EventTypeFilter> = JsonMissing.of(),
        @JsonProperty("property_filters")
        @ExcludeMissing
        private val propertyFilters: JsonField<List<PropertyFilter>> = JsonMissing.of(),
        @JsonProperty("aggregation_type")
        @ExcludeMissing
        private val aggregationType: JsonField<AggregationType> = JsonMissing.of(),
        @JsonProperty("aggregation_key")
        @ExcludeMissing
        private val aggregationKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("group_keys")
        @ExcludeMissing
        private val groupKeys: JsonField<List<List<String>>> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("sql") @ExcludeMissing private val sql: JsonField<String> = JsonMissing.of(),
        @JsonProperty("archived_at")
        @ExcludeMissing
        private val archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the billable metric */
        fun id(): String = id.getRequired("id")

        /** The display name of the billable metric. */
        fun name(): String = name.getRequired("name")

        /** An optional filtering rule to match the 'event_type' property of an event. */
        fun eventTypeFilter(): Optional<EventTypeFilter> =
            Optional.ofNullable(eventTypeFilter.getNullable("event_type_filter"))

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        fun propertyFilters(): Optional<List<PropertyFilter>> =
            Optional.ofNullable(propertyFilters.getNullable("property_filters"))

        /** Specifies the type of aggregation performed on matching events. */
        fun aggregationType(): Optional<AggregationType> =
            Optional.ofNullable(aggregationType.getNullable("aggregation_type"))

        /**
         * A key that specifies which property of the event is used to aggregate data. This key must
         * be one of the property filter names and is not applicable when the aggregation type is
         * 'count'.
         */
        fun aggregationKey(): Optional<String> =
            Optional.ofNullable(aggregationKey.getNullable("aggregation_key"))

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        fun groupKeys(): Optional<List<List<String>>> =
            Optional.ofNullable(groupKeys.getNullable("group_keys"))

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** The SQL query associated with the billable metric */
        fun sql(): Optional<String> = Optional.ofNullable(sql.getNullable("sql"))

        /**
         * RFC 3339 timestamp indicating when the billable metric was archived. If not provided, the
         * billable metric is not archived.
         */
        fun archivedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(archivedAt.getNullable("archived_at"))

        /** ID of the billable metric */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** The display name of the billable metric. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** An optional filtering rule to match the 'event_type' property of an event. */
        @JsonProperty("event_type_filter") @ExcludeMissing fun _eventTypeFilter() = eventTypeFilter

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        @JsonProperty("property_filters") @ExcludeMissing fun _propertyFilters() = propertyFilters

        /** Specifies the type of aggregation performed on matching events. */
        @JsonProperty("aggregation_type") @ExcludeMissing fun _aggregationType() = aggregationType

        /**
         * A key that specifies which property of the event is used to aggregate data. This key must
         * be one of the property filter names and is not applicable when the aggregation type is
         * 'count'.
         */
        @JsonProperty("aggregation_key") @ExcludeMissing fun _aggregationKey() = aggregationKey

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        @JsonProperty("group_keys") @ExcludeMissing fun _groupKeys() = groupKeys

        @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

        /** The SQL query associated with the billable metric */
        @JsonProperty("sql") @ExcludeMissing fun _sql() = sql

        /**
         * RFC 3339 timestamp indicating when the billable metric was archived. If not provided, the
         * billable metric is not archived.
         */
        @JsonProperty("archived_at") @ExcludeMissing fun _archivedAt() = archivedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
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
                archivedAt()
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
            private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                name = data.name
                eventTypeFilter = data.eventTypeFilter
                propertyFilters = data.propertyFilters
                aggregationType = data.aggregationType
                aggregationKey = data.aggregationKey
                groupKeys = data.groupKeys
                customFields = data.customFields
                sql = data.sql
                archivedAt = data.archivedAt
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** ID of the billable metric */
            fun id(id: String) = id(JsonField.of(id))

            /** ID of the billable metric */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The display name of the billable metric. */
            fun name(name: String) = name(JsonField.of(name))

            /** The display name of the billable metric. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** An optional filtering rule to match the 'event_type' property of an event. */
            fun eventTypeFilter(eventTypeFilter: EventTypeFilter) =
                eventTypeFilter(JsonField.of(eventTypeFilter))

            /** An optional filtering rule to match the 'event_type' property of an event. */
            fun eventTypeFilter(eventTypeFilter: JsonField<EventTypeFilter>) = apply {
                this.eventTypeFilter = eventTypeFilter
            }

            /**
             * A list of filters to match events to this billable metric. Each filter defines a rule
             * on an event property. All rules must pass for the event to match the billable metric.
             */
            fun propertyFilters(propertyFilters: List<PropertyFilter>) =
                propertyFilters(JsonField.of(propertyFilters))

            /**
             * A list of filters to match events to this billable metric. Each filter defines a rule
             * on an event property. All rules must pass for the event to match the billable metric.
             */
            fun propertyFilters(propertyFilters: JsonField<List<PropertyFilter>>) = apply {
                this.propertyFilters = propertyFilters
            }

            /** Specifies the type of aggregation performed on matching events. */
            fun aggregationType(aggregationType: AggregationType) =
                aggregationType(JsonField.of(aggregationType))

            /** Specifies the type of aggregation performed on matching events. */
            fun aggregationType(aggregationType: JsonField<AggregationType>) = apply {
                this.aggregationType = aggregationType
            }

            /**
             * A key that specifies which property of the event is used to aggregate data. This key
             * must be one of the property filter names and is not applicable when the aggregation
             * type is 'count'.
             */
            fun aggregationKey(aggregationKey: String) =
                aggregationKey(JsonField.of(aggregationKey))

            /**
             * A key that specifies which property of the event is used to aggregate data. This key
             * must be one of the property filter names and is not applicable when the aggregation
             * type is 'count'.
             */
            fun aggregationKey(aggregationKey: JsonField<String>) = apply {
                this.aggregationKey = aggregationKey
            }

            /**
             * Property names that are used to group usage costs on an invoice. Each entry
             * represents a set of properties used to slice events into distinct buckets.
             */
            fun groupKeys(groupKeys: List<List<String>>) = groupKeys(JsonField.of(groupKeys))

            /**
             * Property names that are used to group usage costs on an invoice. Each entry
             * represents a set of properties used to slice events into distinct buckets.
             */
            fun groupKeys(groupKeys: JsonField<List<List<String>>>) = apply {
                this.groupKeys = groupKeys
            }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** The SQL query associated with the billable metric */
            fun sql(sql: String) = sql(JsonField.of(sql))

            /** The SQL query associated with the billable metric */
            fun sql(sql: JsonField<String>) = apply { this.sql = sql }

            /**
             * RFC 3339 timestamp indicating when the billable metric was archived. If not provided,
             * the billable metric is not archived.
             */
            fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

            /**
             * RFC 3339 timestamp indicating when the billable metric was archived. If not provided,
             * the billable metric is not archived.
             */
            fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
                this.archivedAt = archivedAt
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
                    id,
                    name,
                    eventTypeFilter,
                    propertyFilters.map { it.toImmutable() },
                    aggregationType,
                    aggregationKey,
                    groupKeys.map { it.toImmutable() },
                    customFields,
                    sql,
                    archivedAt,
                    additionalProperties.toImmutable(),
                )
        }

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

            return /* spotless:off */ other is Data && id == other.id && name == other.name && eventTypeFilter == other.eventTypeFilter && propertyFilters == other.propertyFilters && aggregationType == other.aggregationType && aggregationKey == other.aggregationKey && groupKeys == other.groupKeys && customFields == other.customFields && sql == other.sql && archivedAt == other.archivedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, name, eventTypeFilter, propertyFilters, aggregationType, aggregationKey, groupKeys, customFields, sql, archivedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, name=$name, eventTypeFilter=$eventTypeFilter, propertyFilters=$propertyFilters, aggregationType=$aggregationType, aggregationKey=$aggregationKey, groupKeys=$groupKeys, customFields=$customFields, sql=$sql, archivedAt=$archivedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillableMetricRetrieveResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillableMetricRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
