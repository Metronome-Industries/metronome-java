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
 * Retrieve aggregated usage data across multiple customers and billable metrics in a single query.
 * This batch endpoint enables you to fetch usage patterns at scale, broken down by time windows,
 * making it ideal for building analytics dashboards, generating reports, and monitoring
 * platform-wide usage trends.
 *
 * ### Use this endpoint to:
 * - Generate platform-wide usage reports for internal teams
 * - Monitor aggregate usage trends across your entire customer base
 * - Create comparative usage analyses between customers or time periods
 * - Support capacity planning with historical usage patterns
 *
 * ### Key response fields:
 * An array of `UsageBatchAggregate` objects containing:
 * - `customer_id`: The customer this usage belongs to
 * - `billable_metric_id` and `billable_metric_name`: What was measured
 * - `start_timestamp` and `end_timestamp`: Time window for this data point
 * - `value`: Aggregated usage amount for the period
 * - `groups` (optional): Usage broken down by group keys with values
 * - `next_page`: Pagination cursor for large result sets
 *
 * ### Usage guidelines:
 * - Time windows: Set `window_size` to `hour`, `day`, or `none` (entire period)
 * - Required parameters: Must specify `starting_on`, `ending_before`, and `window_size`
 * - Filtering options:
 *     - `customer_ids`: Limit to specific customers (omit for all customers)
 *     - `billable_metrics`: Limit to specific metrics (omit for all metrics)
 * - Pagination: Use `next_page` cursor to retrieve large datasets
 * - Null values: Group values may be null when no usage matches that group
 */
class UsageListParams
private constructor(
    private val nextPage: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endingBefore(): OffsetDateTime = body.endingBefore()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingOn(): OffsetDateTime = body.startingOn()

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
     * A list of billable metrics to fetch usage for. If absent, all billable metrics will be
     * returned.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billableMetrics(): Optional<List<BillableMetric>> = body.billableMetrics()

    /**
     * A list of Metronome customer IDs to fetch usage for. If absent, usage for all customers will
     * be returned.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerIds(): Optional<List<String>> = body.customerIds()

    /**
     * Returns the raw JSON value of [endingBefore].
     *
     * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endingBefore(): JsonField<OffsetDateTime> = body._endingBefore()

    /**
     * Returns the raw JSON value of [startingOn].
     *
     * Unlike [startingOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startingOn(): JsonField<OffsetDateTime> = body._startingOn()

    /**
     * Returns the raw JSON value of [windowSize].
     *
     * Unlike [windowSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _windowSize(): JsonField<WindowSize> = body._windowSize()

    /**
     * Returns the raw JSON value of [billableMetrics].
     *
     * Unlike [billableMetrics], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billableMetrics(): JsonField<List<BillableMetric>> = body._billableMetrics()

    /**
     * Returns the raw JSON value of [customerIds].
     *
     * Unlike [customerIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerIds(): JsonField<List<String>> = body._customerIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageListParams].
         *
         * The following fields are required:
         * ```java
         * .endingBefore()
         * .startingOn()
         * .windowSize()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageListParams]. */
    class Builder internal constructor() {

        private var nextPage: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(usageListParams: UsageListParams) = apply {
            nextPage = usageListParams.nextPage
            body = usageListParams.body.toBuilder()
            additionalHeaders = usageListParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageListParams.additionalQueryParams.toBuilder()
        }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String?) = apply { this.nextPage = nextPage }

        /** Alias for calling [Builder.nextPage] with `nextPage.orElse(null)`. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [endingBefore]
         * - [startingOn]
         * - [windowSize]
         * - [billableMetrics]
         * - [customerIds]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

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
         * A list of billable metrics to fetch usage for. If absent, all billable metrics will be
         * returned.
         */
        fun billableMetrics(billableMetrics: List<BillableMetric>) = apply {
            body.billableMetrics(billableMetrics)
        }

        /**
         * Sets [Builder.billableMetrics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billableMetrics] with a well-typed
         * `List<BillableMetric>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun billableMetrics(billableMetrics: JsonField<List<BillableMetric>>) = apply {
            body.billableMetrics(billableMetrics)
        }

        /**
         * Adds a single [BillableMetric] to [billableMetrics].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBillableMetric(billableMetric: BillableMetric) = apply {
            body.addBillableMetric(billableMetric)
        }

        /**
         * A list of Metronome customer IDs to fetch usage for. If absent, usage for all customers
         * will be returned.
         */
        fun customerIds(customerIds: List<String>) = apply { body.customerIds(customerIds) }

        /**
         * Sets [Builder.customerIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerIds(customerIds: JsonField<List<String>>) = apply {
            body.customerIds(customerIds)
        }

        /**
         * Adds a single [String] to [customerIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomerId(customerId: String) = apply { body.addCustomerId(customerId) }

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
         * Returns an immutable instance of [UsageListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endingBefore()
         * .startingOn()
         * .windowSize()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageListParams =
            UsageListParams(
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
                nextPage?.let { put("next_page", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endingBefore: JsonField<OffsetDateTime>,
        private val startingOn: JsonField<OffsetDateTime>,
        private val windowSize: JsonField<WindowSize>,
        private val billableMetrics: JsonField<List<BillableMetric>>,
        private val customerIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starting_on")
            @ExcludeMissing
            startingOn: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("window_size")
            @ExcludeMissing
            windowSize: JsonField<WindowSize> = JsonMissing.of(),
            @JsonProperty("billable_metrics")
            @ExcludeMissing
            billableMetrics: JsonField<List<BillableMetric>> = JsonMissing.of(),
            @JsonProperty("customer_ids")
            @ExcludeMissing
            customerIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(endingBefore, startingOn, windowSize, billableMetrics, customerIds, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingOn(): OffsetDateTime = startingOn.getRequired("starting_on")

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
         * A list of billable metrics to fetch usage for. If absent, all billable metrics will be
         * returned.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun billableMetrics(): Optional<List<BillableMetric>> =
            billableMetrics.getOptional("billable_metrics")

        /**
         * A list of Metronome customer IDs to fetch usage for. If absent, usage for all customers
         * will be returned.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customerIds(): Optional<List<String>> = customerIds.getOptional("customer_ids")

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
         * Returns the raw JSON value of [startingOn].
         *
         * Unlike [startingOn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_on")
        @ExcludeMissing
        fun _startingOn(): JsonField<OffsetDateTime> = startingOn

        /**
         * Returns the raw JSON value of [windowSize].
         *
         * Unlike [windowSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("window_size")
        @ExcludeMissing
        fun _windowSize(): JsonField<WindowSize> = windowSize

        /**
         * Returns the raw JSON value of [billableMetrics].
         *
         * Unlike [billableMetrics], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billable_metrics")
        @ExcludeMissing
        fun _billableMetrics(): JsonField<List<BillableMetric>> = billableMetrics

        /**
         * Returns the raw JSON value of [customerIds].
         *
         * Unlike [customerIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_ids")
        @ExcludeMissing
        fun _customerIds(): JsonField<List<String>> = customerIds

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
             * .endingBefore()
             * .startingOn()
             * .windowSize()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var endingBefore: JsonField<OffsetDateTime>? = null
            private var startingOn: JsonField<OffsetDateTime>? = null
            private var windowSize: JsonField<WindowSize>? = null
            private var billableMetrics: JsonField<MutableList<BillableMetric>>? = null
            private var customerIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                endingBefore = body.endingBefore
                startingOn = body.startingOn
                windowSize = body.windowSize
                billableMetrics = body.billableMetrics.map { it.toMutableList() }
                customerIds = body.customerIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
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
             * A list of billable metrics to fetch usage for. If absent, all billable metrics will
             * be returned.
             */
            fun billableMetrics(billableMetrics: List<BillableMetric>) =
                billableMetrics(JsonField.of(billableMetrics))

            /**
             * Sets [Builder.billableMetrics] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billableMetrics] with a well-typed
             * `List<BillableMetric>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun billableMetrics(billableMetrics: JsonField<List<BillableMetric>>) = apply {
                this.billableMetrics = billableMetrics.map { it.toMutableList() }
            }

            /**
             * Adds a single [BillableMetric] to [billableMetrics].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBillableMetric(billableMetric: BillableMetric) = apply {
                billableMetrics =
                    (billableMetrics ?: JsonField.of(mutableListOf())).also {
                        checkKnown("billableMetrics", it).add(billableMetric)
                    }
            }

            /**
             * A list of Metronome customer IDs to fetch usage for. If absent, usage for all
             * customers will be returned.
             */
            fun customerIds(customerIds: List<String>) = customerIds(JsonField.of(customerIds))

            /**
             * Sets [Builder.customerIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerIds(customerIds: JsonField<List<String>>) = apply {
                this.customerIds = customerIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [customerIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCustomerId(customerId: String) = apply {
                customerIds =
                    (customerIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customerIds", it).add(customerId)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .endingBefore()
             * .startingOn()
             * .windowSize()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("endingBefore", endingBefore),
                    checkRequired("startingOn", startingOn),
                    checkRequired("windowSize", windowSize),
                    (billableMetrics ?: JsonMissing.of()).map { it.toImmutable() },
                    (customerIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            endingBefore()
            startingOn()
            windowSize().validate()
            billableMetrics().ifPresent { it.forEach { it.validate() } }
            customerIds()
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
            (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (if (startingOn.asKnown().isPresent) 1 else 0) +
                (windowSize.asKnown().getOrNull()?.validity() ?: 0) +
                (billableMetrics.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (customerIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                endingBefore == other.endingBefore &&
                startingOn == other.startingOn &&
                windowSize == other.windowSize &&
                billableMetrics == other.billableMetrics &&
                customerIds == other.customerIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                endingBefore,
                startingOn,
                windowSize,
                billableMetrics,
                customerIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{endingBefore=$endingBefore, startingOn=$startingOn, windowSize=$windowSize, billableMetrics=$billableMetrics, customerIds=$customerIds, additionalProperties=$additionalProperties}"
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

    class BillableMetric
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val groupBy: JsonField<GroupBy>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("group_by") @ExcludeMissing groupBy: JsonField<GroupBy> = JsonMissing.of(),
        ) : this(id, groupBy, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupBy(): Optional<GroupBy> = groupBy.getOptional("group_by")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [groupBy].
         *
         * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_by") @ExcludeMissing fun _groupBy(): JsonField<GroupBy> = groupBy

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
             * Returns a mutable builder for constructing an instance of [BillableMetric].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BillableMetric]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var groupBy: JsonField<GroupBy> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billableMetric: BillableMetric) = apply {
                id = billableMetric.id
                groupBy = billableMetric.groupBy
                additionalProperties = billableMetric.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun groupBy(groupBy: GroupBy) = groupBy(JsonField.of(groupBy))

            /**
             * Sets [Builder.groupBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupBy] with a well-typed [GroupBy] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupBy(groupBy: JsonField<GroupBy>) = apply { this.groupBy = groupBy }

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
             * Returns an immutable instance of [BillableMetric].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BillableMetric =
                BillableMetric(
                    checkRequired("id", id),
                    groupBy,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BillableMetric = apply {
            if (validated) {
                return@apply
            }

            id()
            groupBy().ifPresent { it.validate() }
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
                (groupBy.asKnown().getOrNull()?.validity() ?: 0)

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
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun key(): String = key.getRequired("key")

            /**
             * Values of the group_by key to return in the query. If this field is omitted, all
             * available values will be returned, up to a maximum of 200.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
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
                 * You should usually call [Builder.key] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun key(key: JsonField<String>) = apply { this.key = key }

                /**
                 * Values of the group_by key to return in the query. If this field is omitted, all
                 * available values will be returned, up to a maximum of 200.
                 */
                fun values(values: List<String>) = values(JsonField.of(values))

                /**
                 * Sets [Builder.values] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.values] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillableMetric &&
                id == other.id &&
                groupBy == other.groupBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, groupBy, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillableMetric{id=$id, groupBy=$groupBy, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageListParams &&
            nextPage == other.nextPage &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(nextPage, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UsageListParams{nextPage=$nextPage, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
