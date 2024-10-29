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
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.util.Objects
import java.util.Optional

class BillableMetricCreateParams
constructor(
    private val name: String,
    private val aggregationKey: String?,
    private val aggregationType: AggregationType?,
    private val customFields: CustomFields?,
    private val eventTypeFilter: EventTypeFilter?,
    private val groupKeys: List<List<String>>?,
    private val propertyFilters: List<PropertyFilter>?,
    private val sql: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun aggregationKey(): Optional<String> = Optional.ofNullable(aggregationKey)

    fun aggregationType(): Optional<AggregationType> = Optional.ofNullable(aggregationType)

    fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

    fun eventTypeFilter(): Optional<EventTypeFilter> = Optional.ofNullable(eventTypeFilter)

    fun groupKeys(): Optional<List<List<String>>> = Optional.ofNullable(groupKeys)

    fun propertyFilters(): Optional<List<PropertyFilter>> = Optional.ofNullable(propertyFilters)

    fun sql(): Optional<String> = Optional.ofNullable(sql)

    @JvmSynthetic
    internal fun getBody(): BillableMetricCreateBody {
        return BillableMetricCreateBody(
            name,
            aggregationKey,
            aggregationType,
            customFields,
            eventTypeFilter,
            groupKeys,
            propertyFilters,
            sql,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = BillableMetricCreateBody.Builder::class)
    @NoAutoDetect
    class BillableMetricCreateBody
    internal constructor(
        private val name: String?,
        private val aggregationKey: String?,
        private val aggregationType: AggregationType?,
        private val customFields: CustomFields?,
        private val eventTypeFilter: EventTypeFilter?,
        private val groupKeys: List<List<String>>?,
        private val propertyFilters: List<PropertyFilter>?,
        private val sql: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The display name of the billable metric. */
        @JsonProperty("name") fun name(): String? = name

        /**
         * Specifies the type of aggregation performed on matching events. Required if `sql` is not
         * provided.
         */
        @JsonProperty("aggregation_key") fun aggregationKey(): String? = aggregationKey

        /** Specifies the type of aggregation performed on matching events. */
        @JsonProperty("aggregation_type") fun aggregationType(): AggregationType? = aggregationType

        /** Custom fields to attach to the billable metric. */
        @JsonProperty("custom_fields") fun customFields(): CustomFields? = customFields

        /** An optional filtering rule to match the 'event_type' property of an event. */
        @JsonProperty("event_type_filter") fun eventTypeFilter(): EventTypeFilter? = eventTypeFilter

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        @JsonProperty("group_keys") fun groupKeys(): List<List<String>>? = groupKeys

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        @JsonProperty("property_filters")
        fun propertyFilters(): List<PropertyFilter>? = propertyFilters

        /**
         * The SQL query associated with the billable metric. This field is mutually exclusive with
         * aggregation_type, event_type_filter, property_filters, aggregation_key, and group_keys.
         * If provided, these other fields must be omitted.
         */
        @JsonProperty("sql") fun sql(): String? = sql

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var aggregationKey: String? = null
            private var aggregationType: AggregationType? = null
            private var customFields: CustomFields? = null
            private var eventTypeFilter: EventTypeFilter? = null
            private var groupKeys: List<List<String>>? = null
            private var propertyFilters: List<PropertyFilter>? = null
            private var sql: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billableMetricCreateBody: BillableMetricCreateBody) = apply {
                this.name = billableMetricCreateBody.name
                this.aggregationKey = billableMetricCreateBody.aggregationKey
                this.aggregationType = billableMetricCreateBody.aggregationType
                this.customFields = billableMetricCreateBody.customFields
                this.eventTypeFilter = billableMetricCreateBody.eventTypeFilter
                this.groupKeys = billableMetricCreateBody.groupKeys
                this.propertyFilters = billableMetricCreateBody.propertyFilters
                this.sql = billableMetricCreateBody.sql
                additionalProperties(billableMetricCreateBody.additionalProperties)
            }

            /** The display name of the billable metric. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * Specifies the type of aggregation performed on matching events. Required if `sql` is
             * not provided.
             */
            @JsonProperty("aggregation_key")
            fun aggregationKey(aggregationKey: String) = apply {
                this.aggregationKey = aggregationKey
            }

            /** Specifies the type of aggregation performed on matching events. */
            @JsonProperty("aggregation_type")
            fun aggregationType(aggregationType: AggregationType) = apply {
                this.aggregationType = aggregationType
            }

            /** Custom fields to attach to the billable metric. */
            @JsonProperty("custom_fields")
            fun customFields(customFields: CustomFields) = apply {
                this.customFields = customFields
            }

            /** An optional filtering rule to match the 'event_type' property of an event. */
            @JsonProperty("event_type_filter")
            fun eventTypeFilter(eventTypeFilter: EventTypeFilter) = apply {
                this.eventTypeFilter = eventTypeFilter
            }

            /**
             * Property names that are used to group usage costs on an invoice. Each entry
             * represents a set of properties used to slice events into distinct buckets.
             */
            @JsonProperty("group_keys")
            fun groupKeys(groupKeys: List<List<String>>) = apply { this.groupKeys = groupKeys }

            /**
             * A list of filters to match events to this billable metric. Each filter defines a rule
             * on an event property. All rules must pass for the event to match the billable metric.
             */
            @JsonProperty("property_filters")
            fun propertyFilters(propertyFilters: List<PropertyFilter>) = apply {
                this.propertyFilters = propertyFilters
            }

            /**
             * The SQL query associated with the billable metric. This field is mutually exclusive
             * with aggregation_type, event_type_filter, property_filters, aggregation_key, and
             * group_keys. If provided, these other fields must be omitted.
             */
            @JsonProperty("sql") fun sql(sql: String) = apply { this.sql = sql }

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

            fun build(): BillableMetricCreateBody =
                BillableMetricCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    aggregationKey,
                    aggregationType,
                    customFields,
                    eventTypeFilter,
                    groupKeys?.toUnmodifiable(),
                    propertyFilters?.toUnmodifiable(),
                    sql,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillableMetricCreateBody && this.name == other.name && this.aggregationKey == other.aggregationKey && this.aggregationType == other.aggregationType && this.customFields == other.customFields && this.eventTypeFilter == other.eventTypeFilter && this.groupKeys == other.groupKeys && this.propertyFilters == other.propertyFilters && this.sql == other.sql && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, aggregationKey, aggregationType, customFields, eventTypeFilter, groupKeys, propertyFilters, sql, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "BillableMetricCreateBody{name=$name, aggregationKey=$aggregationKey, aggregationType=$aggregationType, customFields=$customFields, eventTypeFilter=$eventTypeFilter, groupKeys=$groupKeys, propertyFilters=$propertyFilters, sql=$sql, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillableMetricCreateParams && this.name == other.name && this.aggregationKey == other.aggregationKey && this.aggregationType == other.aggregationType && this.customFields == other.customFields && this.eventTypeFilter == other.eventTypeFilter && this.groupKeys == other.groupKeys && this.propertyFilters == other.propertyFilters && this.sql == other.sql && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(name, aggregationKey, aggregationType, customFields, eventTypeFilter, groupKeys, propertyFilters, sql, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "BillableMetricCreateParams{name=$name, aggregationKey=$aggregationKey, aggregationType=$aggregationType, customFields=$customFields, eventTypeFilter=$eventTypeFilter, groupKeys=$groupKeys, propertyFilters=$propertyFilters, sql=$sql, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var aggregationKey: String? = null
        private var aggregationType: AggregationType? = null
        private var customFields: CustomFields? = null
        private var eventTypeFilter: EventTypeFilter? = null
        private var groupKeys: MutableList<List<String>> = mutableListOf()
        private var propertyFilters: MutableList<PropertyFilter> = mutableListOf()
        private var sql: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(billableMetricCreateParams: BillableMetricCreateParams) = apply {
            this.name = billableMetricCreateParams.name
            this.aggregationKey = billableMetricCreateParams.aggregationKey
            this.aggregationType = billableMetricCreateParams.aggregationType
            this.customFields = billableMetricCreateParams.customFields
            this.eventTypeFilter = billableMetricCreateParams.eventTypeFilter
            this.groupKeys(billableMetricCreateParams.groupKeys ?: listOf())
            this.propertyFilters(billableMetricCreateParams.propertyFilters ?: listOf())
            this.sql = billableMetricCreateParams.sql
            additionalQueryParams(billableMetricCreateParams.additionalQueryParams)
            additionalHeaders(billableMetricCreateParams.additionalHeaders)
            additionalBodyProperties(billableMetricCreateParams.additionalBodyProperties)
        }

        /** The display name of the billable metric. */
        fun name(name: String) = apply { this.name = name }

        /**
         * Specifies the type of aggregation performed on matching events. Required if `sql` is not
         * provided.
         */
        fun aggregationKey(aggregationKey: String) = apply { this.aggregationKey = aggregationKey }

        /** Specifies the type of aggregation performed on matching events. */
        fun aggregationType(aggregationType: AggregationType) = apply {
            this.aggregationType = aggregationType
        }

        /** Custom fields to attach to the billable metric. */
        fun customFields(customFields: CustomFields) = apply { this.customFields = customFields }

        /** An optional filtering rule to match the 'event_type' property of an event. */
        fun eventTypeFilter(eventTypeFilter: EventTypeFilter) = apply {
            this.eventTypeFilter = eventTypeFilter
        }

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        fun groupKeys(groupKeys: List<List<String>>) = apply {
            this.groupKeys.clear()
            this.groupKeys.addAll(groupKeys)
        }

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        fun addGroupKey(groupKey: List<String>) = apply { this.groupKeys.add(groupKey) }

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        fun propertyFilters(propertyFilters: List<PropertyFilter>) = apply {
            this.propertyFilters.clear()
            this.propertyFilters.addAll(propertyFilters)
        }

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        fun addPropertyFilter(propertyFilter: PropertyFilter) = apply {
            this.propertyFilters.add(propertyFilter)
        }

        /**
         * The SQL query associated with the billable metric. This field is mutually exclusive with
         * aggregation_type, event_type_filter, property_filters, aggregation_key, and group_keys.
         * If provided, these other fields must be omitted.
         */
        fun sql(sql: String) = apply { this.sql = sql }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): BillableMetricCreateParams =
            BillableMetricCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                aggregationKey,
                aggregationType,
                customFields,
                eventTypeFilter,
                if (groupKeys.size == 0) null else groupKeys.toUnmodifiable(),
                if (propertyFilters.size == 0) null else propertyFilters.toUnmodifiable(),
                sql,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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

    /** Custom fields to attach to the billable metric. */
    @JsonDeserialize(builder = CustomFields.Builder::class)
    @NoAutoDetect
    class CustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
}
