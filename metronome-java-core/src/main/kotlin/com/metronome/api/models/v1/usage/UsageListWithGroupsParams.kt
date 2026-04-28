// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.usage

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve granular usage data for a specific customer and billable metric, with the ability to
 * break down usage by custom grouping dimensions. This endpoint enables deep usage analytics by
 * segmenting data across attributes like region, user, model type, or any custom dimension defined
 * in your billable metrics.
 *
 * ### Use this endpoint to:
 * - Analyze usage patterns broken down by specific attributes (region, user, department, etc.)
 * - Build detailed usage dashboards with dimensional filtering
 * - Identify high-usage segments for optimization opportunities
 *
 * ### Request parameters
 * Use [`group_key`](#body-group-key) and [`group_filters`](#body-group-filters) to group by one or
 * more dimensions. This is required for compound group keys and recommended for all new
 * integrations:
 * ```json
 * {
 *   "group_key": ["region", "team"],
 *   "group_filters": {
 *     "region": ["US-East", "US-West"]
 *   }
 * }
 * ```
 *
 * Important: For compound group keys, you must pass the complete set of keys that make up the
 * compound key. Partial key combinations are not supported. For example, if your billable metric
 * has a compound group key [region, team, environment], you must pass all three keys in
 * group_key—you cannot pass just `[region]` or `[region, team]`.
 *
 * ### Key response fields:
 * An array of `PagedUsageAggregate` objects containing:
 * - `starting_on` and `ending_before`: Time window boundaries
 * - `group`: Object mapping group keys to their values
 *     - For simple groups, this will be a map with a single key-value pair (e.g., `{"region":
 *       "US-East"}`)
 *     - For compound groups, this will be a map with multiple key-value pairs (e.g., `{"region":
 *       "US-East", "team": "engineering"}`)
 * - `value`: Aggregated usage for this group and time window
 * - `next_page`: Pagination cursor for large datasets
 *
 * ### Usage guidelines:
 * - Required parameters: Must specify `customer_id`, `billable_metric_id`, and `window_size`
 * - Time windows: Set `window_size` to hour, day, or none for different granularities
 * - Group filtering: Use `group_key` and `group_filters` to specify groups and group filters
 * - Limits: When using compound group keys (2+ keys in `group_key`), the default and max limit is
 *   100
 * - Pagination: Use limit and `next_page` for large result sets
 * - Null handling: Group values may be null for events missing the group key property
 */
class UsageListWithGroupsParams
private constructor(
    private val limit: Long?,
    private val nextPage: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Max number of results that should be returned */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billableMetricId(): String = body.billableMetricId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * A window_size of "day" or "hour" will return the usage for the specified period segmented
     * into daily or hourly aggregates. A window_size of "none" will return a single usage aggregate
     * for the entirety of the specified period.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun windowSize(): WindowSize = body.windowSize()

    /**
     * If true, will return the usage for the current billing period. Will return an error if the
     * customer is currently uncontracted or starting_on and ending_before are specified when this
     * is true.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentPeriod(): Optional<Boolean> = body.currentPeriod()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endingBefore(): Optional<OffsetDateTime> = body.endingBefore()

    /**
     * Use group_key and group_filters instead. Use a single group key to group by. Compound group
     * keys are not supported.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun groupBy(): Optional<GroupBy> = body.groupBy()

    /**
     * Object mapping group keys to arrays of values to filter on. Only usage matching these filter
     * values will be returned. Keys must be present in group_key. Omit a key or use an empty array
     * to include all values for that dimension.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupFilters(): Optional<GroupFilters> = body.groupFilters()

    /**
     * Group key to group usage by. Supports both simple (single key) and compound (multiple keys)
     * group keys.
     *
     * For simple group keys, provide a single key e.g. `["region"]`. For compound group keys,
     * provide multiple keys e.g. `["region", "team"]`.
     *
     * For streaming metrics, the keys must be defined as a simple or compound group key on the
     * billable metric. For compound group keys, all keys must match an exact compound group key
     * definition — partial matches are not allowed.
     *
     * Cannot be used together with `group_by`.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupKey(): Optional<List<String>> = body.groupKey()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startingOn(): Optional<OffsetDateTime> = body.startingOn()

    /**
     * Returns the raw JSON value of [billableMetricId].
     *
     * Unlike [billableMetricId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _billableMetricId(): JsonField<String> = body._billableMetricId()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [windowSize].
     *
     * Unlike [windowSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _windowSize(): JsonField<WindowSize> = body._windowSize()

    /**
     * Returns the raw JSON value of [currentPeriod].
     *
     * Unlike [currentPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currentPeriod(): JsonField<Boolean> = body._currentPeriod()

    /**
     * Returns the raw JSON value of [endingBefore].
     *
     * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endingBefore(): JsonField<OffsetDateTime> = body._endingBefore()

    /**
     * Returns the raw JSON value of [groupBy].
     *
     * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated") fun _groupBy(): JsonField<GroupBy> = body._groupBy()

    /**
     * Returns the raw JSON value of [groupFilters].
     *
     * Unlike [groupFilters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groupFilters(): JsonField<GroupFilters> = body._groupFilters()

    /**
     * Returns the raw JSON value of [groupKey].
     *
     * Unlike [groupKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groupKey(): JsonField<List<String>> = body._groupKey()

    /**
     * Returns the raw JSON value of [startingOn].
     *
     * Unlike [startingOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startingOn(): JsonField<OffsetDateTime> = body._startingOn()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageListWithGroupsParams].
         *
         * The following fields are required:
         * ```java
         * .billableMetricId()
         * .customerId()
         * .windowSize()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageListWithGroupsParams]. */
    class Builder internal constructor() {

        private var limit: Long? = null
        private var nextPage: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(usageListWithGroupsParams: UsageListWithGroupsParams) = apply {
            limit = usageListWithGroupsParams.limit
            nextPage = usageListWithGroupsParams.nextPage
            body = usageListWithGroupsParams.body.toBuilder()
            additionalHeaders = usageListWithGroupsParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageListWithGroupsParams.additionalQueryParams.toBuilder()
        }

        /** Max number of results that should be returned */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String?) = apply { this.nextPage = nextPage }

        /** Alias for calling [Builder.nextPage] with `nextPage.orElse(null)`. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [billableMetricId]
         * - [customerId]
         * - [windowSize]
         * - [currentPeriod]
         * - [endingBefore]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun billableMetricId(billableMetricId: String) = apply {
            body.billableMetricId(billableMetricId)
        }

        /**
         * Sets [Builder.billableMetricId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billableMetricId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billableMetricId(billableMetricId: JsonField<String>) = apply {
            body.billableMetricId(billableMetricId)
        }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * A window_size of "day" or "hour" will return the usage for the specified period segmented
         * into daily or hourly aggregates. A window_size of "none" will return a single usage
         * aggregate for the entirety of the specified period.
         */
        fun windowSize(windowSize: WindowSize) = apply { body.windowSize(windowSize) }

        /**
         * Sets [Builder.windowSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.windowSize] with a well-typed [WindowSize] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun windowSize(windowSize: JsonField<WindowSize>) = apply { body.windowSize(windowSize) }

        /**
         * If true, will return the usage for the current billing period. Will return an error if
         * the customer is currently uncontracted or starting_on and ending_before are specified
         * when this is true.
         */
        fun currentPeriod(currentPeriod: Boolean) = apply { body.currentPeriod(currentPeriod) }

        /**
         * Sets [Builder.currentPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentPeriod] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currentPeriod(currentPeriod: JsonField<Boolean>) = apply {
            body.currentPeriod(currentPeriod)
        }

        fun endingBefore(endingBefore: OffsetDateTime) = apply { body.endingBefore(endingBefore) }

        /**
         * Sets [Builder.endingBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            body.endingBefore(endingBefore)
        }

        /**
         * Use group_key and group_filters instead. Use a single group key to group by. Compound
         * group keys are not supported.
         */
        @Deprecated("deprecated") fun groupBy(groupBy: GroupBy) = apply { body.groupBy(groupBy) }

        /**
         * Sets [Builder.groupBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupBy] with a well-typed [GroupBy] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun groupBy(groupBy: JsonField<GroupBy>) = apply { body.groupBy(groupBy) }

        /**
         * Object mapping group keys to arrays of values to filter on. Only usage matching these
         * filter values will be returned. Keys must be present in group_key. Omit a key or use an
         * empty array to include all values for that dimension.
         */
        fun groupFilters(groupFilters: GroupFilters) = apply { body.groupFilters(groupFilters) }

        /**
         * Sets [Builder.groupFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupFilters] with a well-typed [GroupFilters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun groupFilters(groupFilters: JsonField<GroupFilters>) = apply {
            body.groupFilters(groupFilters)
        }

        /**
         * Group key to group usage by. Supports both simple (single key) and compound (multiple
         * keys) group keys.
         *
         * For simple group keys, provide a single key e.g. `["region"]`. For compound group keys,
         * provide multiple keys e.g. `["region", "team"]`.
         *
         * For streaming metrics, the keys must be defined as a simple or compound group key on the
         * billable metric. For compound group keys, all keys must match an exact compound group key
         * definition — partial matches are not allowed.
         *
         * Cannot be used together with `group_by`.
         */
        fun groupKey(groupKey: List<String>) = apply { body.groupKey(groupKey) }

        /**
         * Sets [Builder.groupKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupKey] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun groupKey(groupKey: JsonField<List<String>>) = apply { body.groupKey(groupKey) }

        /**
         * Adds a single [String] to [Builder.groupKey].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroupKey(groupKey: String) = apply { body.addGroupKey(groupKey) }

        fun startingOn(startingOn: OffsetDateTime) = apply { body.startingOn(startingOn) }

        /**
         * Sets [Builder.startingOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingOn] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
            body.startingOn(startingOn)
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

        /**
         * Returns an immutable instance of [UsageListWithGroupsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .billableMetricId()
         * .customerId()
         * .windowSize()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageListWithGroupsParams =
            UsageListWithGroupsParams(
                limit,
                nextPage,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                limit?.let { put("limit", it.toString()) }
                nextPage?.let { put("next_page", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billableMetricId: JsonField<String>,
        private val customerId: JsonField<String>,
        private val windowSize: JsonField<WindowSize>,
        private val currentPeriod: JsonField<Boolean>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val groupBy: JsonField<GroupBy>,
        private val groupFilters: JsonField<GroupFilters>,
        private val groupKey: JsonField<List<String>>,
        private val startingOn: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billable_metric_id")
            @ExcludeMissing
            billableMetricId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("window_size")
            @ExcludeMissing
            windowSize: JsonField<WindowSize> = JsonMissing.of(),
            @JsonProperty("current_period")
            @ExcludeMissing
            currentPeriod: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("group_by")
            @ExcludeMissing
            groupBy: JsonField<GroupBy> = JsonMissing.of(),
            @JsonProperty("group_filters")
            @ExcludeMissing
            groupFilters: JsonField<GroupFilters> = JsonMissing.of(),
            @JsonProperty("group_key")
            @ExcludeMissing
            groupKey: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("starting_on")
            @ExcludeMissing
            startingOn: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            billableMetricId,
            customerId,
            windowSize,
            currentPeriod,
            endingBefore,
            groupBy,
            groupFilters,
            groupKey,
            startingOn,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billableMetricId(): String = billableMetricId.getRequired("billable_metric_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * A window_size of "day" or "hour" will return the usage for the specified period segmented
         * into daily or hourly aggregates. A window_size of "none" will return a single usage
         * aggregate for the entirety of the specified period.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun windowSize(): WindowSize = windowSize.getRequired("window_size")

        /**
         * If true, will return the usage for the current billing period. Will return an error if
         * the customer is currently uncontracted or starting_on and ending_before are specified
         * when this is true.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun currentPeriod(): Optional<Boolean> = currentPeriod.getOptional("current_period")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * Use group_key and group_filters instead. Use a single group key to group by. Compound
         * group keys are not supported.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun groupBy(): Optional<GroupBy> = groupBy.getOptional("group_by")

        /**
         * Object mapping group keys to arrays of values to filter on. Only usage matching these
         * filter values will be returned. Keys must be present in group_key. Omit a key or use an
         * empty array to include all values for that dimension.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupFilters(): Optional<GroupFilters> = groupFilters.getOptional("group_filters")

        /**
         * Group key to group usage by. Supports both simple (single key) and compound (multiple
         * keys) group keys.
         *
         * For simple group keys, provide a single key e.g. `["region"]`. For compound group keys,
         * provide multiple keys e.g. `["region", "team"]`.
         *
         * For streaming metrics, the keys must be defined as a simple or compound group key on the
         * billable metric. For compound group keys, all keys must match an exact compound group key
         * definition — partial matches are not allowed.
         *
         * Cannot be used together with `group_by`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupKey(): Optional<List<String>> = groupKey.getOptional("group_key")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startingOn(): Optional<OffsetDateTime> = startingOn.getOptional("starting_on")

        /**
         * Returns the raw JSON value of [billableMetricId].
         *
         * Unlike [billableMetricId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        fun _billableMetricId(): JsonField<String> = billableMetricId

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [windowSize].
         *
         * Unlike [windowSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("window_size")
        @ExcludeMissing
        fun _windowSize(): JsonField<WindowSize> = windowSize

        /**
         * Returns the raw JSON value of [currentPeriod].
         *
         * Unlike [currentPeriod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("current_period")
        @ExcludeMissing
        fun _currentPeriod(): JsonField<Boolean> = currentPeriod

        /**
         * Returns the raw JSON value of [endingBefore].
         *
         * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /**
         * Returns the raw JSON value of [groupBy].
         *
         * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("group_by")
        @ExcludeMissing
        fun _groupBy(): JsonField<GroupBy> = groupBy

        /**
         * Returns the raw JSON value of [groupFilters].
         *
         * Unlike [groupFilters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("group_filters")
        @ExcludeMissing
        fun _groupFilters(): JsonField<GroupFilters> = groupFilters

        /**
         * Returns the raw JSON value of [groupKey].
         *
         * Unlike [groupKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_key")
        @ExcludeMissing
        fun _groupKey(): JsonField<List<String>> = groupKey

        /**
         * Returns the raw JSON value of [startingOn].
         *
         * Unlike [startingOn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_on")
        @ExcludeMissing
        fun _startingOn(): JsonField<OffsetDateTime> = startingOn

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .billableMetricId()
             * .customerId()
             * .windowSize()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billableMetricId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var windowSize: JsonField<WindowSize>? = null
            private var currentPeriod: JsonField<Boolean> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var groupBy: JsonField<GroupBy> = JsonMissing.of()
            private var groupFilters: JsonField<GroupFilters> = JsonMissing.of()
            private var groupKey: JsonField<MutableList<String>>? = null
            private var startingOn: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                billableMetricId = body.billableMetricId
                customerId = body.customerId
                windowSize = body.windowSize
                currentPeriod = body.currentPeriod
                endingBefore = body.endingBefore
                groupBy = body.groupBy
                groupFilters = body.groupFilters
                groupKey = body.groupKey.map { it.toMutableList() }
                startingOn = body.startingOn
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun billableMetricId(billableMetricId: String) =
                billableMetricId(JsonField.of(billableMetricId))

            /**
             * Sets [Builder.billableMetricId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billableMetricId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                this.billableMetricId = billableMetricId
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * A window_size of "day" or "hour" will return the usage for the specified period
             * segmented into daily or hourly aggregates. A window_size of "none" will return a
             * single usage aggregate for the entirety of the specified period.
             */
            fun windowSize(windowSize: WindowSize) = windowSize(JsonField.of(windowSize))

            /**
             * Sets [Builder.windowSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.windowSize] with a well-typed [WindowSize] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun windowSize(windowSize: JsonField<WindowSize>) = apply {
                this.windowSize = windowSize
            }

            /**
             * If true, will return the usage for the current billing period. Will return an error
             * if the customer is currently uncontracted or starting_on and ending_before are
             * specified when this is true.
             */
            fun currentPeriod(currentPeriod: Boolean) = currentPeriod(JsonField.of(currentPeriod))

            /**
             * Sets [Builder.currentPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentPeriod] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currentPeriod(currentPeriod: JsonField<Boolean>) = apply {
                this.currentPeriod = currentPeriod
            }

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /**
             * Sets [Builder.endingBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            /**
             * Use group_key and group_filters instead. Use a single group key to group by. Compound
             * group keys are not supported.
             */
            @Deprecated("deprecated") fun groupBy(groupBy: GroupBy) = groupBy(JsonField.of(groupBy))

            /**
             * Sets [Builder.groupBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupBy] with a well-typed [GroupBy] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun groupBy(groupBy: JsonField<GroupBy>) = apply { this.groupBy = groupBy }

            /**
             * Object mapping group keys to arrays of values to filter on. Only usage matching these
             * filter values will be returned. Keys must be present in group_key. Omit a key or use
             * an empty array to include all values for that dimension.
             */
            fun groupFilters(groupFilters: GroupFilters) = groupFilters(JsonField.of(groupFilters))

            /**
             * Sets [Builder.groupFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupFilters] with a well-typed [GroupFilters] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupFilters(groupFilters: JsonField<GroupFilters>) = apply {
                this.groupFilters = groupFilters
            }

            /**
             * Group key to group usage by. Supports both simple (single key) and compound (multiple
             * keys) group keys.
             *
             * For simple group keys, provide a single key e.g. `["region"]`. For compound group
             * keys, provide multiple keys e.g. `["region", "team"]`.
             *
             * For streaming metrics, the keys must be defined as a simple or compound group key on
             * the billable metric. For compound group keys, all keys must match an exact compound
             * group key definition — partial matches are not allowed.
             *
             * Cannot be used together with `group_by`.
             */
            fun groupKey(groupKey: List<String>) = groupKey(JsonField.of(groupKey))

            /**
             * Sets [Builder.groupKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupKey] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupKey(groupKey: JsonField<List<String>>) = apply {
                this.groupKey = groupKey.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.groupKey].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGroupKey(groupKey: String) = apply {
                this.groupKey =
                    (this.groupKey ?: JsonField.of(mutableListOf())).also {
                        checkKnown("groupKey", it).add(groupKey)
                    }
            }

            fun startingOn(startingOn: OffsetDateTime) = startingOn(JsonField.of(startingOn))

            /**
             * Sets [Builder.startingOn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingOn] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
                this.startingOn = startingOn
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .billableMetricId()
             * .customerId()
             * .windowSize()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("billableMetricId", billableMetricId),
                    checkRequired("customerId", customerId),
                    checkRequired("windowSize", windowSize),
                    currentPeriod,
                    endingBefore,
                    groupBy,
                    groupFilters,
                    (groupKey ?: JsonMissing.of()).map { it.toImmutable() },
                    startingOn,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billableMetricId()
            customerId()
            windowSize().validate()
            currentPeriod()
            endingBefore()
            groupBy().ifPresent { it.validate() }
            groupFilters().ifPresent { it.validate() }
            groupKey()
            startingOn()
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
            (if (billableMetricId.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (windowSize.asKnown().getOrNull()?.validity() ?: 0) +
                (if (currentPeriod.asKnown().isPresent) 1 else 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (groupBy.asKnown().getOrNull()?.validity() ?: 0) +
                (groupFilters.asKnown().getOrNull()?.validity() ?: 0) +
                (groupKey.asKnown().getOrNull()?.size ?: 0) +
                (if (startingOn.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                billableMetricId == other.billableMetricId &&
                customerId == other.customerId &&
                windowSize == other.windowSize &&
                currentPeriod == other.currentPeriod &&
                endingBefore == other.endingBefore &&
                groupBy == other.groupBy &&
                groupFilters == other.groupFilters &&
                groupKey == other.groupKey &&
                startingOn == other.startingOn &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billableMetricId,
                customerId,
                windowSize,
                currentPeriod,
                endingBefore,
                groupBy,
                groupFilters,
                groupKey,
                startingOn,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billableMetricId=$billableMetricId, customerId=$customerId, windowSize=$windowSize, currentPeriod=$currentPeriod, endingBefore=$endingBefore, groupBy=$groupBy, groupFilters=$groupFilters, groupKey=$groupKey, startingOn=$startingOn, additionalProperties=$additionalProperties}"
    }

    /**
     * A window_size of "day" or "hour" will return the usage for the specified period segmented
     * into daily or hourly aggregates. A window_size of "none" will return a single usage aggregate
     * for the entirety of the specified period.
     */
    class WindowSize @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val HOUR = of("HOUR")

            @JvmField val DAY = of("DAY")

            @JvmField val NONE = of("NONE")

            @JvmStatic fun of(value: String) = WindowSize(JsonField.of(value))
        }

        /** An enum containing [WindowSize]'s known values. */
        enum class Known {
            HOUR,
            DAY,
            NONE,
        }

        /**
         * An enum containing [WindowSize]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [WindowSize] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HOUR,
            DAY,
            NONE,
            /**
             * An enum member indicating that [WindowSize] was instantiated with an unknown value.
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
                HOUR -> Value.HOUR
                DAY -> Value.DAY
                NONE -> Value.NONE
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
                HOUR -> Known.HOUR
                DAY -> Known.DAY
                NONE -> Known.NONE
                else -> throw MetronomeInvalidDataException("Unknown WindowSize: $value")
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

        fun validate(): WindowSize = apply {
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

            return other is WindowSize && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Use group_key and group_filters instead. Use a single group key to group by. Compound group
     * keys are not supported.
     */
    @Deprecated("deprecated")
    class GroupBy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val key: JsonField<String>,
        private val values: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("values")
            @ExcludeMissing
            values: JsonField<List<String>> = JsonMissing.of(),
        ) : this(key, values, mutableMapOf())

        /**
         * The name of the group_by key to use
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun key(): String = key.getRequired("key")

        /**
         * Values of the group_by key to return in the query. Omit this if you'd like all values for
         * the key returned.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun values(): Optional<List<String>> = values.getOptional("values")

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [values].
         *
         * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

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
             * Returns a mutable builder for constructing an instance of [GroupBy].
             *
             * The following fields are required:
             * ```java
             * .key()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GroupBy]. */
        class Builder internal constructor() {

            private var key: JsonField<String>? = null
            private var values: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(groupBy: GroupBy) = apply {
                key = groupBy.key
                values = groupBy.values.map { it.toMutableList() }
                additionalProperties = groupBy.additionalProperties.toMutableMap()
            }

            /** The name of the group_by key to use */
            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            /**
             * Values of the group_by key to return in the query. Omit this if you'd like all values
             * for the key returned.
             */
            fun values(values: List<String>) = values(JsonField.of(values))

            /**
             * Sets [Builder.values] to an arbitrary JSON value.
             *
             * You should usually call [Builder.values] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun values(values: JsonField<List<String>>) = apply {
                this.values = values.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [values].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addValue(value: String) = apply {
                values =
                    (values ?: JsonField.of(mutableListOf())).also {
                        checkKnown("values", it).add(value)
                    }
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
             * Returns an immutable instance of [GroupBy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .key()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): GroupBy =
                GroupBy(
                    checkRequired("key", key),
                    (values ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): GroupBy = apply {
            if (validated) {
                return@apply
            }

            key()
            values()
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
            (if (key.asKnown().isPresent) 1 else 0) + (values.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GroupBy &&
                key == other.key &&
                values == other.values &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(key, values, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GroupBy{key=$key, values=$values, additionalProperties=$additionalProperties}"
    }

    /**
     * Object mapping group keys to arrays of values to filter on. Only usage matching these filter
     * values will be returned. Keys must be present in group_key. Omit a key or use an empty array
     * to include all values for that dimension.
     */
    class GroupFilters
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

            /** Returns a mutable builder for constructing an instance of [GroupFilters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GroupFilters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(groupFilters: GroupFilters) = apply {
                additionalProperties = groupFilters.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [GroupFilters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): GroupFilters = GroupFilters(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): GroupFilters = apply {
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

            return other is GroupFilters && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "GroupFilters{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageListWithGroupsParams &&
            limit == other.limit &&
            nextPage == other.nextPage &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(limit, nextPage, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UsageListWithGroupsParams{limit=$limit, nextPage=$nextPage, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
