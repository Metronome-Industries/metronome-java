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
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

/** Creates a new Billable Metric. */
class BillableMetricCreateParams
private constructor(
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

    /** The display name of the billable metric. */
    fun _name(): JsonField<String> = body._name()

    /**
     * Specifies the type of aggregation performed on matching events. Required if `sql` is not
     * provided.
     */
    fun _aggregationKey(): JsonField<String> = body._aggregationKey()

    /** Specifies the type of aggregation performed on matching events. */
    fun _aggregationType(): JsonField<AggregationType> = body._aggregationType()

    /** Custom fields to attach to the billable metric. */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /** An optional filtering rule to match the 'event_type' property of an event. */
    fun _eventTypeFilter(): JsonField<EventTypeFilter> = body._eventTypeFilter()

    /**
     * Property names that are used to group usage costs on an invoice. Each entry represents a set
     * of properties used to slice events into distinct buckets.
     */
    fun _groupKeys(): JsonField<List<List<String>>> = body._groupKeys()

    /**
     * A list of filters to match events to this billable metric. Each filter defines a rule on an
     * event property. All rules must pass for the event to match the billable metric.
     */
    fun _propertyFilters(): JsonField<List<PropertyFilter>> = body._propertyFilters()

    /**
     * The SQL query associated with the billable metric. This field is mutually exclusive with
     * aggregation_type, event_type_filter, property_filters, aggregation_key, and group_keys. If
     * provided, these other fields must be omitted.
     */
    fun _sql(): JsonField<String> = body._sql()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): BillableMetricCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class BillableMetricCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aggregation_key")
        @ExcludeMissing
        private val aggregationKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aggregation_type")
        @ExcludeMissing
        private val aggregationType: JsonField<AggregationType> = JsonMissing.of(),
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
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The display name of the billable metric. */
        fun name(): String = name.getRequired("name")

        /**
         * Specifies the type of aggregation performed on matching events. Required if `sql` is not
         * provided.
         */
        fun aggregationKey(): Optional<String> =
            Optional.ofNullable(aggregationKey.getNullable("aggregation_key"))

        /** Specifies the type of aggregation performed on matching events. */
        fun aggregationType(): Optional<AggregationType> =
            Optional.ofNullable(aggregationType.getNullable("aggregation_type"))

        /** Custom fields to attach to the billable metric. */
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** An optional filtering rule to match the 'event_type' property of an event. */
        fun eventTypeFilter(): Optional<EventTypeFilter> =
            Optional.ofNullable(eventTypeFilter.getNullable("event_type_filter"))

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        fun groupKeys(): Optional<List<List<String>>> =
            Optional.ofNullable(groupKeys.getNullable("group_keys"))

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        fun propertyFilters(): Optional<List<PropertyFilter>> =
            Optional.ofNullable(propertyFilters.getNullable("property_filters"))

        /**
         * The SQL query associated with the billable metric. This field is mutually exclusive with
         * aggregation_type, event_type_filter, property_filters, aggregation_key, and group_keys.
         * If provided, these other fields must be omitted.
         */
        fun sql(): Optional<String> = Optional.ofNullable(sql.getNullable("sql"))

        /** The display name of the billable metric. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Specifies the type of aggregation performed on matching events. Required if `sql` is not
         * provided.
         */
        @JsonProperty("aggregation_key")
        @ExcludeMissing
        fun _aggregationKey(): JsonField<String> = aggregationKey

        /** Specifies the type of aggregation performed on matching events. */
        @JsonProperty("aggregation_type")
        @ExcludeMissing
        fun _aggregationType(): JsonField<AggregationType> = aggregationType

        /** Custom fields to attach to the billable metric. */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /** An optional filtering rule to match the 'event_type' property of an event. */
        @JsonProperty("event_type_filter")
        @ExcludeMissing
        fun _eventTypeFilter(): JsonField<EventTypeFilter> = eventTypeFilter

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        @JsonProperty("group_keys")
        @ExcludeMissing
        fun _groupKeys(): JsonField<List<List<String>>> = groupKeys

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        @JsonProperty("property_filters")
        @ExcludeMissing
        fun _propertyFilters(): JsonField<List<PropertyFilter>> = propertyFilters

        /**
         * The SQL query associated with the billable metric. This field is mutually exclusive with
         * aggregation_type, event_type_filter, property_filters, aggregation_key, and group_keys.
         * If provided, these other fields must be omitted.
         */
        @JsonProperty("sql") @ExcludeMissing fun _sql(): JsonField<String> = sql

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BillableMetricCreateBody = apply {
            if (validated) {
                return@apply
            }

            name()
            aggregationKey()
            aggregationType()
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

        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var aggregationKey: JsonField<String> = JsonMissing.of()
            private var aggregationType: JsonField<AggregationType> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var eventTypeFilter: JsonField<EventTypeFilter> = JsonMissing.of()
            private var groupKeys: JsonField<MutableList<List<String>>>? = null
            private var propertyFilters: JsonField<MutableList<PropertyFilter>>? = null
            private var sql: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billableMetricCreateBody: BillableMetricCreateBody) = apply {
                name = billableMetricCreateBody.name
                aggregationKey = billableMetricCreateBody.aggregationKey
                aggregationType = billableMetricCreateBody.aggregationType
                customFields = billableMetricCreateBody.customFields
                eventTypeFilter = billableMetricCreateBody.eventTypeFilter
                groupKeys = billableMetricCreateBody.groupKeys.map { it.toMutableList() }
                propertyFilters =
                    billableMetricCreateBody.propertyFilters.map { it.toMutableList() }
                sql = billableMetricCreateBody.sql
                additionalProperties = billableMetricCreateBody.additionalProperties.toMutableMap()
            }

            /** The display name of the billable metric. */
            fun name(name: String) = name(JsonField.of(name))

            /** The display name of the billable metric. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Specifies the type of aggregation performed on matching events. Required if `sql` is
             * not provided.
             */
            fun aggregationKey(aggregationKey: String) =
                aggregationKey(JsonField.of(aggregationKey))

            /**
             * Specifies the type of aggregation performed on matching events. Required if `sql` is
             * not provided.
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

            /** Custom fields to attach to the billable metric. */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /** Custom fields to attach to the billable metric. */
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
             * Property names that are used to group usage costs on an invoice. Each entry
             * represents a set of properties used to slice events into distinct buckets.
             */
            fun groupKeys(groupKeys: List<List<String>>) = groupKeys(JsonField.of(groupKeys))

            /**
             * Property names that are used to group usage costs on an invoice. Each entry
             * represents a set of properties used to slice events into distinct buckets.
             */
            fun groupKeys(groupKeys: JsonField<List<List<String>>>) = apply {
                this.groupKeys = groupKeys.map { it.toMutableList() }
            }

            /**
             * Property names that are used to group usage costs on an invoice. Each entry
             * represents a set of properties used to slice events into distinct buckets.
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
                this.propertyFilters = propertyFilters.map { it.toMutableList() }
            }

            /**
             * A list of filters to match events to this billable metric. Each filter defines a rule
             * on an event property. All rules must pass for the event to match the billable metric.
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

            /**
             * The SQL query associated with the billable metric. This field is mutually exclusive
             * with aggregation_type, event_type_filter, property_filters, aggregation_key, and
             * group_keys. If provided, these other fields must be omitted.
             */
            fun sql(sql: String) = sql(JsonField.of(sql))

            /**
             * The SQL query associated with the billable metric. This field is mutually exclusive
             * with aggregation_type, event_type_filter, property_filters, aggregation_key, and
             * group_keys. If provided, these other fields must be omitted.
             */
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

            fun build(): BillableMetricCreateBody =
                BillableMetricCreateBody(
                    checkRequired("name", name),
                    aggregationKey,
                    aggregationType,
                    customFields,
                    eventTypeFilter,
                    (groupKeys ?: JsonMissing.of()).map { it.toImmutable() },
                    (propertyFilters ?: JsonMissing.of()).map { it.toImmutable() },
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
    class Builder internal constructor() {

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

        /** The display name of the billable metric. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Specifies the type of aggregation performed on matching events. Required if `sql` is not
         * provided.
         */
        fun aggregationKey(aggregationKey: String) = apply { body.aggregationKey(aggregationKey) }

        /**
         * Specifies the type of aggregation performed on matching events. Required if `sql` is not
         * provided.
         */
        fun aggregationKey(aggregationKey: JsonField<String>) = apply {
            body.aggregationKey(aggregationKey)
        }

        /** Specifies the type of aggregation performed on matching events. */
        fun aggregationType(aggregationType: AggregationType) = apply {
            body.aggregationType(aggregationType)
        }

        /** Specifies the type of aggregation performed on matching events. */
        fun aggregationType(aggregationType: JsonField<AggregationType>) = apply {
            body.aggregationType(aggregationType)
        }

        /** Custom fields to attach to the billable metric. */
        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        /** Custom fields to attach to the billable metric. */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        /** An optional filtering rule to match the 'event_type' property of an event. */
        fun eventTypeFilter(eventTypeFilter: EventTypeFilter) = apply {
            body.eventTypeFilter(eventTypeFilter)
        }

        /** An optional filtering rule to match the 'event_type' property of an event. */
        fun eventTypeFilter(eventTypeFilter: JsonField<EventTypeFilter>) = apply {
            body.eventTypeFilter(eventTypeFilter)
        }

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        fun groupKeys(groupKeys: List<List<String>>) = apply { body.groupKeys(groupKeys) }

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        fun groupKeys(groupKeys: JsonField<List<List<String>>>) = apply {
            body.groupKeys(groupKeys)
        }

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        fun addGroupKey(groupKey: List<String>) = apply { body.addGroupKey(groupKey) }

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        fun propertyFilters(propertyFilters: List<PropertyFilter>) = apply {
            body.propertyFilters(propertyFilters)
        }

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        fun propertyFilters(propertyFilters: JsonField<List<PropertyFilter>>) = apply {
            body.propertyFilters(propertyFilters)
        }

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
        fun sql(sql: String) = apply { body.sql(sql) }

        /**
         * The SQL query associated with the billable metric. This field is mutually exclusive with
         * aggregation_type, event_type_filter, property_filters, aggregation_key, and group_keys.
         * If provided, these other fields must be omitted.
         */
        fun sql(sql: JsonField<String>) = apply { body.sql(sql) }

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

        fun build(): BillableMetricCreateParams =
            BillableMetricCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        return /* spotless:off */ other is BillableMetricCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BillableMetricCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
