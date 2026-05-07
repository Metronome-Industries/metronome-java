// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.billablemetrics

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

class BillableMetricRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * [BillableMetricRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillableMetricRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(billableMetricRetrieveResponse: BillableMetricRetrieveResponse) = apply {
            data = billableMetricRetrieveResponse.data
            additionalProperties =
                billableMetricRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [BillableMetricRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BillableMetricRetrieveResponse =
            BillableMetricRetrieveResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): BillableMetricRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val aggregationKey: JsonField<String>,
        private val aggregationType: JsonField<AggregationType>,
        private val archivedAt: JsonField<OffsetDateTime>,
        private val customFields: JsonField<CustomFields>,
        private val eventTypeFilter: JsonField<EventTypeFilter>,
        private val groupKeys: JsonField<List<List<String>>>,
        private val propertyFilters: JsonField<List<PropertyFilter>>,
        private val sql: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
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
            aggregationKey,
            aggregationType,
            archivedAt,
            customFields,
            eventTypeFilter,
            groupKeys,
            propertyFilters,
            sql,
            mutableMapOf(),
        )

        /**
         * ID of the billable metric
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The display name of the billable metric.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * A key that specifies which property of the event is used to aggregate data. This key must
         * be one of the property filter names and is not applicable when the aggregation type is
         * 'count'.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun aggregationKey(): Optional<String> = aggregationKey.getOptional("aggregation_key")

        /**
         * Specifies the type of aggregation performed on matching events.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun aggregationType(): Optional<AggregationType> =
            aggregationType.getOptional("aggregation_type")

        /**
         * RFC 3339 timestamp indicating when the billable metric was archived. If not provided, the
         * billable metric is not archived.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun archivedAt(): Optional<OffsetDateTime> = archivedAt.getOptional("archived_at")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * An optional filtering rule to match the 'event_type' property of an event.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun eventTypeFilter(): Optional<EventTypeFilter> =
            eventTypeFilter.getOptional("event_type_filter")

        /**
         * Property names that are used to group usage costs on an invoice. Each entry represents a
         * set of properties used to slice events into distinct buckets.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupKeys(): Optional<List<List<String>>> = groupKeys.getOptional("group_keys")

        /**
         * A list of filters to match events to this billable metric. Each filter defines a rule on
         * an event property. All rules must pass for the event to match the billable metric.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun propertyFilters(): Optional<List<PropertyFilter>> =
            propertyFilters.getOptional("property_filters")

        /**
         * The SQL query associated with the billable metric
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
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
         * Returns the raw JSON value of [aggregationKey].
         *
         * Unlike [aggregationKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aggregation_key")
        @ExcludeMissing
        fun _aggregationKey(): JsonField<String> = aggregationKey

        /**
         * Returns the raw JSON value of [aggregationType].
         *
         * Unlike [aggregationType], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [eventTypeFilter].
         *
         * Unlike [eventTypeFilter], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("event_type_filter")
        @ExcludeMissing
        fun _eventTypeFilter(): JsonField<EventTypeFilter> = eventTypeFilter

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
         * Unlike [propertyFilters], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
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
            internal fun from(data: Data) = apply {
                id = data.id
                name = data.name
                aggregationKey = data.aggregationKey
                aggregationType = data.aggregationType
                archivedAt = data.archivedAt
                customFields = data.customFields
                eventTypeFilter = data.eventTypeFilter
                groupKeys = data.groupKeys.map { it.toMutableList() }
                propertyFilters = data.propertyFilters.map { it.toMutableList() }
                sql = data.sql
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** ID of the billable metric */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The display name of the billable metric. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * A key that specifies which property of the event is used to aggregate data. This key
             * must be one of the property filter names and is not applicable when the aggregation
             * type is 'count'.
             */
            fun aggregationKey(aggregationKey: String) =
                aggregationKey(JsonField.of(aggregationKey))

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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun aggregationType(aggregationType: JsonField<AggregationType>) = apply {
                this.aggregationType = aggregationType
            }

            /**
             * RFC 3339 timestamp indicating when the billable metric was archived. If not provided,
             * the billable metric is not archived.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun eventTypeFilter(eventTypeFilter: JsonField<EventTypeFilter>) = apply {
                this.eventTypeFilter = eventTypeFilter
            }

            /**
             * Property names that are used to group usage costs on an invoice. Each entry
             * represents a set of properties used to slice events into distinct buckets.
             */
            fun groupKeys(groupKeys: List<List<String>>) = groupKeys(JsonField.of(groupKeys))

            /**
             * Sets [Builder.groupKeys] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupKeys] with a well-typed `List<List<String>>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * A list of filters to match events to this billable metric. Each filter defines a rule
             * on an event property. All rules must pass for the event to match the billable metric.
             */
            fun propertyFilters(propertyFilters: List<PropertyFilter>) =
                propertyFilters(JsonField.of(propertyFilters))

            /**
             * Sets [Builder.propertyFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.propertyFilters] with a well-typed
             * `List<PropertyFilter>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Data].
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
            fun build(): Data =
                Data(
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
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
            aggregationKey()
            aggregationType().ifPresent { it.validate() }
            archivedAt()
            customFields().ifPresent { it.validate() }
            eventTypeFilter().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (aggregationKey.asKnown().isPresent) 1 else 0) +
                (aggregationType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (archivedAt.asKnown().isPresent) 1 else 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (eventTypeFilter.asKnown().getOrNull()?.validity() ?: 0) +
                (groupKeys.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                (propertyFilters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (sql.asKnown().isPresent) 1 else 0)

        /** Specifies the type of aggregation performed on matching events. */
        class AggregationType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

                /**
                 * Returns an immutable instance of [CustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                name == other.name &&
                aggregationKey == other.aggregationKey &&
                aggregationType == other.aggregationType &&
                archivedAt == other.archivedAt &&
                customFields == other.customFields &&
                eventTypeFilter == other.eventTypeFilter &&
                groupKeys == other.groupKeys &&
                propertyFilters == other.propertyFilters &&
                sql == other.sql &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                name,
                aggregationKey,
                aggregationType,
                archivedAt,
                customFields,
                eventTypeFilter,
                groupKeys,
                propertyFilters,
                sql,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, name=$name, aggregationKey=$aggregationKey, aggregationType=$aggregationType, archivedAt=$archivedAt, customFields=$customFields, eventTypeFilter=$eventTypeFilter, groupKeys=$groupKeys, propertyFilters=$propertyFilters, sql=$sql, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillableMetricRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillableMetricRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
