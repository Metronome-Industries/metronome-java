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
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

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
                    groupKeys?.toImmutable(),
                    propertyFilters?.toImmutable(),
                    sql,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillableMetricCreateBody && name == other.name && aggregationKey == other.aggregationKey && aggregationType == other.aggregationType && customFields == other.customFields && eventTypeFilter == other.eventTypeFilter && groupKeys == other.groupKeys && propertyFilters == other.propertyFilters && sql == other.sql && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, aggregationKey, aggregationType, customFields, eventTypeFilter, groupKeys, propertyFilters, sql, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillableMetricCreateBody{name=$name, aggregationKey=$aggregationKey, aggregationType=$aggregationType, customFields=$customFields, eventTypeFilter=$eventTypeFilter, groupKeys=$groupKeys, propertyFilters=$propertyFilters, sql=$sql, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillableMetricCreateParams && name == other.name && aggregationKey == other.aggregationKey && aggregationType == other.aggregationType && customFields == other.customFields && eventTypeFilter == other.eventTypeFilter && groupKeys == other.groupKeys && propertyFilters == other.propertyFilters && sql == other.sql && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(name, aggregationKey, aggregationType, customFields, eventTypeFilter, groupKeys, propertyFilters, sql, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "BillableMetricCreateParams{name=$name, aggregationKey=$aggregationKey, aggregationType=$aggregationType, customFields=$customFields, eventTypeFilter=$eventTypeFilter, groupKeys=$groupKeys, propertyFilters=$propertyFilters, sql=$sql, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
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
            additionalHeaders(billableMetricCreateParams.additionalHeaders)
            additionalQueryParams(billableMetricCreateParams.additionalQueryParams)
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

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): BillableMetricCreateParams =
            BillableMetricCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                aggregationKey,
                aggregationType,
                customFields,
                eventTypeFilter,
                if (groupKeys.size == 0) null else groupKeys.toImmutable(),
                if (propertyFilters.size == 0) null else propertyFilters.toImmutable(),
                sql,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is AggregationType && value == other.value /* spotless:on */
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
}
