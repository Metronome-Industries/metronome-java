// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

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
import com.metronome.api.models.EventTypeFilter
import com.metronome.api.models.PropertyFilter
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomerListBillableMetricsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val aggregate: JsonField<String>,
    private val aggregateKeys: JsonField<List<String>>,
    private val aggregationKey: JsonField<String>,
    private val aggregationType: JsonField<AggregationType>,
    private val archivedAt: JsonField<OffsetDateTime>,
    private val customFields: JsonField<CustomFields>,
    private val eventTypeFilter: JsonField<EventTypeFilter>,
    private val filter: JsonField<Filter>,
    private val groupBy: JsonField<List<String>>,
    private val groupKeys: JsonField<List<List<String>>>,
    private val propertyFilters: JsonField<List<PropertyFilter>>,
    private val sql: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aggregate") @ExcludeMissing aggregate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aggregate_keys")
        @ExcludeMissing
        aggregateKeys: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("aggregation_key")
        @ExcludeMissing
        aggregationKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aggregation_type")
        @ExcludeMissing
        aggregationType: JsonField<AggregationType> = JsonMissing.of(),
        @JsonProperty("archived_at")
        @ExcludeMissing
        archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("event_type_filter")
        @ExcludeMissing
        eventTypeFilter: JsonField<EventTypeFilter> = JsonMissing.of(),
        @JsonProperty("filter") @ExcludeMissing filter: JsonField<Filter> = JsonMissing.of(),
        @JsonProperty("group_by")
        @ExcludeMissing
        groupBy: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("group_keys")
        @ExcludeMissing
        groupKeys: JsonField<List<List<String>>> = JsonMissing.of(),
        @JsonProperty("property_filters")
        @ExcludeMissing
        propertyFilters: JsonField<List<PropertyFilter>> = JsonMissing.of(),
        @JsonProperty("sql") @ExcludeMissing sql: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        name,
        aggregate,
        aggregateKeys,
        aggregationKey,
        aggregationType,
        archivedAt,
        customFields,
        eventTypeFilter,
        filter,
        groupBy,
        groupKeys,
        propertyFilters,
        sql,
        mutableMapOf(),
    )

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * (DEPRECATED) use aggregation_type instead
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregate(): Optional<String> = aggregate.getOptional("aggregate")

    /**
     * (DEPRECATED) use aggregation_key instead
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregateKeys(): Optional<List<String>> = aggregateKeys.getOptional("aggregate_keys")

    /**
     * A key that specifies which property of the event is used to aggregate data. This key must be
     * one of the property filter names and is not applicable when the aggregation type is 'count'.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregationKey(): Optional<String> = aggregationKey.getOptional("aggregation_key")

    /**
     * Specifies the type of aggregation performed on matching events.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregationType(): Optional<AggregationType> =
        aggregationType.getOptional("aggregation_type")

    /**
     * RFC 3339 timestamp indicating when the billable metric was archived. If not provided, the
     * billable metric is not archived.
     *
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
     * An optional filtering rule to match the 'event_type' property of an event.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventTypeFilter(): Optional<EventTypeFilter> =
        eventTypeFilter.getOptional("event_type_filter")

    /**
     * (DEPRECATED) use property_filters & event_type_filter instead
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<Filter> = filter.getOptional("filter")

    /**
     * (DEPRECATED) use group_keys instead
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupBy(): Optional<List<String>> = groupBy.getOptional("group_by")

    /**
     * Property names that are used to group usage costs on an invoice. Each entry represents a set
     * of properties used to slice events into distinct buckets.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupKeys(): Optional<List<List<String>>> = groupKeys.getOptional("group_keys")

    /**
     * A list of filters to match events to this billable metric. Each filter defines a rule on an
     * event property. All rules must pass for the event to match the billable metric.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun propertyFilters(): Optional<List<PropertyFilter>> =
        propertyFilters.getOptional("property_filters")

    /**
     * The SQL query associated with the billable metric
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sql(): Optional<String> = sql.getOptional("sql")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [aggregate].
     *
     * Unlike [aggregate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aggregate") @ExcludeMissing fun _aggregate(): JsonField<String> = aggregate

    /**
     * Returns the raw JSON value of [aggregateKeys].
     *
     * Unlike [aggregateKeys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aggregate_keys")
    @ExcludeMissing
    fun _aggregateKeys(): JsonField<List<String>> = aggregateKeys

    /**
     * Returns the raw JSON value of [aggregationKey].
     *
     * Unlike [aggregationKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aggregation_key")
    @ExcludeMissing
    fun _aggregationKey(): JsonField<String> = aggregationKey

    /**
     * Returns the raw JSON value of [aggregationType].
     *
     * Unlike [aggregationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aggregation_type")
    @ExcludeMissing
    fun _aggregationType(): JsonField<AggregationType> = aggregationType

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

    /**
     * Returns the raw JSON value of [eventTypeFilter].
     *
     * Unlike [eventTypeFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type_filter")
    @ExcludeMissing
    fun _eventTypeFilter(): JsonField<EventTypeFilter> = eventTypeFilter

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<Filter> = filter

    /**
     * Returns the raw JSON value of [groupBy].
     *
     * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_by") @ExcludeMissing fun _groupBy(): JsonField<List<String>> = groupBy

    /**
     * Returns the raw JSON value of [groupKeys].
     *
     * Unlike [groupKeys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_keys")
    @ExcludeMissing
    fun _groupKeys(): JsonField<List<List<String>>> = groupKeys

    /**
     * Returns the raw JSON value of [propertyFilters].
     *
     * Unlike [propertyFilters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("property_filters")
    @ExcludeMissing
    fun _propertyFilters(): JsonField<List<PropertyFilter>> = propertyFilters

    /**
     * Returns the raw JSON value of [sql].
     *
     * Unlike [sql], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sql") @ExcludeMissing fun _sql(): JsonField<String> = sql

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
         * Returns a mutable builder for constructing an instance of
         * [CustomerListBillableMetricsResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerListBillableMetricsResponse]. */
    class Builder internal constructor() {

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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** (DEPRECATED) use aggregation_type instead */
        fun aggregate(aggregate: String) = aggregate(JsonField.of(aggregate))

        /**
         * Sets [Builder.aggregate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun aggregate(aggregate: JsonField<String>) = apply { this.aggregate = aggregate }

        /** (DEPRECATED) use aggregation_key instead */
        fun aggregateKeys(aggregateKeys: List<String>) = aggregateKeys(JsonField.of(aggregateKeys))

        /**
         * Sets [Builder.aggregateKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregateKeys] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun aggregateKeys(aggregateKeys: JsonField<List<String>>) = apply {
            this.aggregateKeys = aggregateKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [aggregateKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAggregateKey(aggregateKey: String) = apply {
            aggregateKeys =
                (aggregateKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("aggregateKeys", it).add(aggregateKey)
                }
        }

        /**
         * A key that specifies which property of the event is used to aggregate data. This key must
         * be one of the property filter names and is not applicable when the aggregation type is
         * 'count'.
         */
        fun aggregationKey(aggregationKey: String) = aggregationKey(JsonField.of(aggregationKey))

        /**
         * Sets [Builder.aggregationKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregationKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun aggregationKey(aggregationKey: JsonField<String>) = apply {
            this.aggregationKey = aggregationKey
        }

        /** Specifies the type of aggregation performed on matching events. */
        fun aggregationType(aggregationType: AggregationType) =
            aggregationType(JsonField.of(aggregationType))

        /**
         * Sets [Builder.aggregationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregationType] with a well-typed [AggregationType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun aggregationType(aggregationType: JsonField<AggregationType>) = apply {
            this.aggregationType = aggregationType
        }

        /**
         * RFC 3339 timestamp indicating when the billable metric was archived. If not provided, the
         * billable metric is not archived.
         */
        fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

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

        /** An optional filtering rule to match the 'event_type' property of an event. */
        fun eventTypeFilter(eventTypeFilter: EventTypeFilter) =
            eventTypeFilter(JsonField.of(eventTypeFilter))

        /**
         * Sets [Builder.eventTypeFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTypeFilter] with a well-typed [EventTypeFilter]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun eventTypeFilter(eventTypeFilter: JsonField<EventTypeFilter>) = apply {
            this.eventTypeFilter = eventTypeFilter
        }

        /** (DEPRECATED) use property_filters & event_type_filter instead */
        fun filter(filter: Filter) = filter(JsonField.of(filter))

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [Filter] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<Filter>) = apply { this.filter = filter }

        /** (DEPRECATED) use group_keys instead */
        fun groupBy(groupBy: List<String>) = groupBy(JsonField.of(groupBy))

        /**
         * Sets [Builder.groupBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupBy] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupBy(groupBy: JsonField<List<String>>) = apply {
            this.groupBy = groupBy.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.groupBy].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroupBy(groupBy: String) = apply {
            this.groupBy =
                (this.groupBy ?: JsonField.of(mutableListOf())).also {
                    checkKnown("groupBy", it).add(groupBy)
                }
        }

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         */
        fun groupKeys(groupKeys: List<List<String>>) = groupKeys(JsonField.of(groupKeys))

        /**
         * Sets [Builder.groupKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupKeys] with a well-typed `List<List<String>>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun groupKeys(groupKeys: JsonField<List<List<String>>>) = apply {
            this.groupKeys = groupKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<String>] to [groupKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroupKey(groupKey: List<String>) = apply {
            groupKeys =
                (groupKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("groupKeys", it).add(groupKey)
                }
        }

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         */
        fun propertyFilters(propertyFilters: List<PropertyFilter>) =
            propertyFilters(JsonField.of(propertyFilters))

        /**
         * Sets [Builder.propertyFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyFilters] with a well-typed
         * `List<PropertyFilter>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun propertyFilters(propertyFilters: JsonField<List<PropertyFilter>>) = apply {
            this.propertyFilters = propertyFilters.map { it.toMutableList() }
        }

        /**
         * Adds a single [PropertyFilter] to [propertyFilters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPropertyFilter(propertyFilter: PropertyFilter) = apply {
            propertyFilters =
                (propertyFilters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("propertyFilters", it).add(propertyFilter)
                }
        }

        /** The SQL query associated with the billable metric */
        fun sql(sql: String) = sql(JsonField.of(sql))

        /**
         * Sets [Builder.sql] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sql] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [CustomerListBillableMetricsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

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
        aggregationType().ifPresent { it.validate() }
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (aggregate.asKnown().isPresent) 1 else 0) +
            (aggregateKeys.asKnown().getOrNull()?.size ?: 0) +
            (if (aggregationKey.asKnown().isPresent) 1 else 0) +
            (aggregationType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (archivedAt.asKnown().isPresent) 1 else 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (eventTypeFilter.asKnown().getOrNull()?.validity() ?: 0) +
            (filter.asKnown().getOrNull()?.validity() ?: 0) +
            (groupBy.asKnown().getOrNull()?.size ?: 0) +
            (groupKeys.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
            (propertyFilters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (sql.asKnown().isPresent) 1 else 0)

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

        private var validated: Boolean = false

        fun validate(): AggregationType = apply {
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

            return other is AggregationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

    /** (DEPRECATED) use property_filters & event_type_filter instead */
    class Filter
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

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

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

            /**
             * Returns an immutable instance of [Filter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filter = Filter(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Filter = apply {
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

            return other is Filter && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Filter{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListBillableMetricsResponse &&
            id == other.id &&
            name == other.name &&
            aggregate == other.aggregate &&
            aggregateKeys == other.aggregateKeys &&
            aggregationKey == other.aggregationKey &&
            aggregationType == other.aggregationType &&
            archivedAt == other.archivedAt &&
            customFields == other.customFields &&
            eventTypeFilter == other.eventTypeFilter &&
            filter == other.filter &&
            groupBy == other.groupBy &&
            groupKeys == other.groupKeys &&
            propertyFilters == other.propertyFilters &&
            sql == other.sql &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            name,
            aggregate,
            aggregateKeys,
            aggregationKey,
            aggregationType,
            archivedAt,
            customFields,
            eventTypeFilter,
            filter,
            groupBy,
            groupKeys,
            propertyFilters,
            sql,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerListBillableMetricsResponse{id=$id, name=$name, aggregate=$aggregate, aggregateKeys=$aggregateKeys, aggregationKey=$aggregationKey, aggregationType=$aggregationType, archivedAt=$archivedAt, customFields=$customFields, eventTypeFilter=$eventTypeFilter, filter=$filter, groupBy=$groupBy, groupKeys=$groupKeys, propertyFilters=$propertyFilters, sql=$sql, additionalProperties=$additionalProperties}"
}
