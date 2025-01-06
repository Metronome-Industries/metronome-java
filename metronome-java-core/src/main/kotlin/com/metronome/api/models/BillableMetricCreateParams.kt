// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

class BillableMetricCreateParams
constructor(
    private val body: BillableMetricCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The display name of the billable metric. */
    fun name(): String = body.name()

    /**
     * Specifies the type of aggregation performed on matching events. Required if `sql` is not
     * provided.
     */
    fun aggregationKey(): Optional<String> = body.aggregationKey()

    /** Specifies the type of aggregation performed on matching events. */
    fun aggregationType(): Optional<AggregationType> = body.aggregationType()

    /** Custom fields to attach to the billable metric. */
    fun customFields(): Optional<CustomFields> = body.customFields()

    /** An optional filtering rule to match the 'event_type' property of an event. */
    fun eventTypeFilter(): Optional<EventTypeFilter> = body.eventTypeFilter()

    /**
     * Property names that are used to group usage costs on an invoice. Each entry represents a set
     * of properties used to slice events into distinct buckets.
     */
    fun groupKeys(): Optional<List<List<String>>> = body.groupKeys()

    /**
     * A list of filters to match events to this billable metric. Each filter defines a rule on an
     * event property. All rules must pass for the event to match the billable metric.
     */
    fun propertyFilters(): Optional<List<PropertyFilter>> = body.propertyFilters()

    /**
     * The SQL query associated with the billable metric. This field is mutually exclusive with
     * aggregation_type, event_type_filter, property_filters, aggregation_key, and group_keys. If
     * provided, these other fields must be omitted.
     */
    fun sql(): Optional<String> = body.sql()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): BillableMetricCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class BillableMetricCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("name") private val name: String,
        @JsonProperty("aggregation_key") private val aggregationKey: String?,
        @JsonProperty("aggregation_type") private val aggregationType: AggregationType?,
        @JsonProperty("custom_fields") private val customFields: CustomFields?,
        @JsonProperty("event_type_filter") private val eventTypeFilter: EventTypeFilter?,
        @JsonProperty("group_keys") private val groupKeys: List<List<String>>?,
        @JsonProperty("property_filters") private val propertyFilters: List<PropertyFilter>?,
        @JsonProperty("sql") private val sql: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The display name of the billable metric. */
        @JsonProperty("name") fun name(): String = name

        /**
         * Specifies the type of aggregation performed on matching events. Required if `sql` is not
         * provided.
         */
        @JsonProperty("aggregation_key")
        fun aggregationKey(): Optional<String> = Optional.ofNullable(aggregationKey)

        /** Specifies the type of aggregation performed on matching events. */
        @JsonProperty("aggregation_type")
        fun aggregationType(): Optional<AggregationType> = Optional.ofNullable(aggregationType)

        /** Custom fields to attach to the billable metric. */
        @JsonProperty("custom_fields")
        fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

        /** An optional filtering rule to match the 'event_type' property of an event. */
        @JsonProperty("event_type_filter")
        fun eventTypeFilter(): Optional<EventTypeFilter> = Optional.ofNullable(eventTypeFilter)

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        @JsonProperty("group_keys")
        fun groupKeys(): Optional<List<List<String>>> = Optional.ofNullable(groupKeys)

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        @JsonProperty("property_filters")
        fun propertyFilters(): Optional<List<PropertyFilter>> = Optional.ofNullable(propertyFilters)

        /**
         * The SQL query associated with the billable metric. This field is mutually exclusive with
         * aggregation_type, event_type_filter, property_filters, aggregation_key, and group_keys.
         * If provided, these other fields must be omitted.
         */
        @JsonProperty("sql") fun sql(): Optional<String> = Optional.ofNullable(sql)

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
            private var groupKeys: MutableList<List<String>>? = null
            private var propertyFilters: MutableList<PropertyFilter>? = null
            private var sql: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billableMetricCreateBody: BillableMetricCreateBody) = apply {
                name = billableMetricCreateBody.name
                aggregationKey = billableMetricCreateBody.aggregationKey
                aggregationType = billableMetricCreateBody.aggregationType
                customFields = billableMetricCreateBody.customFields
                eventTypeFilter = billableMetricCreateBody.eventTypeFilter
                groupKeys = billableMetricCreateBody.groupKeys?.toMutableList()
                propertyFilters = billableMetricCreateBody.propertyFilters?.toMutableList()
                sql = billableMetricCreateBody.sql
                additionalProperties = billableMetricCreateBody.additionalProperties.toMutableMap()
            }

            /** The display name of the billable metric. */
            fun name(name: String) = apply { this.name = name }

            /**
             * Specifies the type of aggregation performed on matching events. Required if `sql` is
             * not provided.
             */
            fun aggregationKey(aggregationKey: String?) = apply {
                this.aggregationKey = aggregationKey
            }

            /**
             * Specifies the type of aggregation performed on matching events. Required if `sql` is
             * not provided.
             */
            fun aggregationKey(aggregationKey: Optional<String>) =
                aggregationKey(aggregationKey.orElse(null))

            /** Specifies the type of aggregation performed on matching events. */
            fun aggregationType(aggregationType: AggregationType?) = apply {
                this.aggregationType = aggregationType
            }

            /** Specifies the type of aggregation performed on matching events. */
            fun aggregationType(aggregationType: Optional<AggregationType>) =
                aggregationType(aggregationType.orElse(null))

            /** Custom fields to attach to the billable metric. */
            fun customFields(customFields: CustomFields?) = apply {
                this.customFields = customFields
            }

            /** Custom fields to attach to the billable metric. */
            fun customFields(customFields: Optional<CustomFields>) =
                customFields(customFields.orElse(null))

            /** An optional filtering rule to match the 'event_type' property of an event. */
            fun eventTypeFilter(eventTypeFilter: EventTypeFilter?) = apply {
                this.eventTypeFilter = eventTypeFilter
            }

            /** An optional filtering rule to match the 'event_type' property of an event. */
            fun eventTypeFilter(eventTypeFilter: Optional<EventTypeFilter>) =
                eventTypeFilter(eventTypeFilter.orElse(null))

            /**
             * Property names that are used to group usage costs on an invoice. Each entry
             * represents a set of properties used to slice events into distinct buckets.
             */
            fun groupKeys(groupKeys: List<List<String>>?) = apply {
                this.groupKeys = groupKeys?.toMutableList()
            }

            /**
             * Property names that are used to group usage costs on an invoice. Each entry
             * represents a set of properties used to slice events into distinct buckets.
             */
            fun groupKeys(groupKeys: Optional<List<List<String>>>) =
                groupKeys(groupKeys.orElse(null))

            /**
             * Property names that are used to group usage costs on an invoice. Each entry
             * represents a set of properties used to slice events into distinct buckets.
             */
            fun addGroupKey(groupKey: List<String>) = apply {
                groupKeys = (groupKeys ?: mutableListOf()).apply { add(groupKey) }
            }

            /**
             * A list of filters to match events to this billable metric. Each filter defines a rule
             * on an event property. All rules must pass for the event to match the billable metric.
             */
            fun propertyFilters(propertyFilters: List<PropertyFilter>?) = apply {
                this.propertyFilters = propertyFilters?.toMutableList()
            }

            /**
             * A list of filters to match events to this billable metric. Each filter defines a rule
             * on an event property. All rules must pass for the event to match the billable metric.
             */
            fun propertyFilters(propertyFilters: Optional<List<PropertyFilter>>) =
                propertyFilters(propertyFilters.orElse(null))

            /**
             * A list of filters to match events to this billable metric. Each filter defines a rule
             * on an event property. All rules must pass for the event to match the billable metric.
             */
            fun addPropertyFilter(propertyFilter: PropertyFilter) = apply {
                propertyFilters = (propertyFilters ?: mutableListOf()).apply { add(propertyFilter) }
            }

            /**
             * The SQL query associated with the billable metric. This field is mutually exclusive
             * with aggregation_type, event_type_filter, property_filters, aggregation_key, and
             * group_keys. If provided, these other fields must be omitted.
             */
            fun sql(sql: String?) = apply { this.sql = sql }

            /**
             * The SQL query associated with the billable metric. This field is mutually exclusive
             * with aggregation_type, event_type_filter, property_filters, aggregation_key, and
             * group_keys. If provided, these other fields must be omitted.
             */
            fun sql(sql: Optional<String>) = sql(sql.orElse(null))

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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: BillableMetricCreateBody.Builder = BillableMetricCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(billableMetricCreateParams: BillableMetricCreateParams) = apply {
            body = billableMetricCreateParams.body.toBuilder()
            additionalHeaders = billableMetricCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = billableMetricCreateParams.additionalQueryParams.toBuilder()
        }

        /** The display name of the billable metric. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Specifies the type of aggregation performed on matching events. Required if `sql` is not
         * provided.
         */
        fun aggregationKey(aggregationKey: String?) = apply { body.aggregationKey(aggregationKey) }

        /**
         * Specifies the type of aggregation performed on matching events. Required if `sql` is not
         * provided.
         */
        fun aggregationKey(aggregationKey: Optional<String>) =
            aggregationKey(aggregationKey.orElse(null))

        /** Specifies the type of aggregation performed on matching events. */
        fun aggregationType(aggregationType: AggregationType?) = apply {
            body.aggregationType(aggregationType)
        }

        /** Specifies the type of aggregation performed on matching events. */
        fun aggregationType(aggregationType: Optional<AggregationType>) =
            aggregationType(aggregationType.orElse(null))

        /** Custom fields to attach to the billable metric. */
        fun customFields(customFields: CustomFields?) = apply { body.customFields(customFields) }

        /** Custom fields to attach to the billable metric. */
        fun customFields(customFields: Optional<CustomFields>) =
            customFields(customFields.orElse(null))

        /** An optional filtering rule to match the 'event_type' property of an event. */
        fun eventTypeFilter(eventTypeFilter: EventTypeFilter?) = apply {
            body.eventTypeFilter(eventTypeFilter)
        }

        /** An optional filtering rule to match the 'event_type' property of an event. */
        fun eventTypeFilter(eventTypeFilter: Optional<EventTypeFilter>) =
            eventTypeFilter(eventTypeFilter.orElse(null))

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        fun groupKeys(groupKeys: List<List<String>>?) = apply { body.groupKeys(groupKeys) }

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        fun groupKeys(groupKeys: Optional<List<List<String>>>) = groupKeys(groupKeys.orElse(null))

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        fun addGroupKey(groupKey: List<String>) = apply { body.addGroupKey(groupKey) }

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        fun propertyFilters(propertyFilters: List<PropertyFilter>?) = apply {
            body.propertyFilters(propertyFilters)
        }

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        fun propertyFilters(propertyFilters: Optional<List<PropertyFilter>>) =
            propertyFilters(propertyFilters.orElse(null))

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        fun addPropertyFilter(propertyFilter: PropertyFilter) = apply {
            body.addPropertyFilter(propertyFilter)
        }

        /**
         * The SQL query associated with the billable metric. This field is mutually exclusive with
         * aggregation_type, event_type_filter, property_filters, aggregation_key, and group_keys.
         * If provided, these other fields must be omitted.
         */
        fun sql(sql: String?) = apply { body.sql(sql) }

        /**
         * The SQL query associated with the billable metric. This field is mutually exclusive with
         * aggregation_type, event_type_filter, property_filters, aggregation_key, and group_keys.
         * If provided, these other fields must be omitted.
         */
        fun sql(sql: Optional<String>) = sql(sql.orElse(null))

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
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): BillableMetricCreateParams =
            BillableMetricCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

    /** Custom fields to attach to the billable metric. */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillableMetricCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BillableMetricCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
