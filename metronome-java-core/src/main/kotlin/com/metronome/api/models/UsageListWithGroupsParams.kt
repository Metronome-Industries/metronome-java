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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Fetch aggregated usage data for the specified customer, billable-metric, and optional group,
 * broken into intervals of the specified length.
 */
class UsageListWithGroupsParams
private constructor(
    private val limit: Long?,
    private val nextPage: String?,
    private val body: UsageListWithGroupsBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Max number of results that should be returned */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun billableMetricId(): String = body.billableMetricId()

    fun customerId(): String = body.customerId()

    /**
     * A window_size of "day" or "hour" will return the usage for the specified period segmented
     * into daily or hourly aggregates. A window_size of "none" will return a single usage aggregate
     * for the entirety of the specified period.
     */
    fun windowSize(): WindowSize = body.windowSize()

    /**
     * If true, will return the usage for the current billing period. Will return an error if the
     * customer is currently uncontracted or starting_on and ending_before are specified when this
     * is true.
     */
    fun currentPeriod(): Optional<Boolean> = body.currentPeriod()

    fun endingBefore(): Optional<OffsetDateTime> = body.endingBefore()

    fun groupBy(): Optional<GroupBy> = body.groupBy()

    fun startingOn(): Optional<OffsetDateTime> = body.startingOn()

    fun _billableMetricId(): JsonField<String> = body._billableMetricId()

    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * A window_size of "day" or "hour" will return the usage for the specified period segmented
     * into daily or hourly aggregates. A window_size of "none" will return a single usage aggregate
     * for the entirety of the specified period.
     */
    fun _windowSize(): JsonField<WindowSize> = body._windowSize()

    /**
     * If true, will return the usage for the current billing period. Will return an error if the
     * customer is currently uncontracted or starting_on and ending_before are specified when this
     * is true.
     */
    fun _currentPeriod(): JsonField<Boolean> = body._currentPeriod()

    fun _endingBefore(): JsonField<OffsetDateTime> = body._endingBefore()

    fun _groupBy(): JsonField<GroupBy> = body._groupBy()

    fun _startingOn(): JsonField<OffsetDateTime> = body._startingOn()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): UsageListWithGroupsBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    @NoAutoDetect
    class UsageListWithGroupsBody
    @JsonCreator
    internal constructor(
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        private val billableMetricId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("window_size")
        @ExcludeMissing
        private val windowSize: JsonField<WindowSize> = JsonMissing.of(),
        @JsonProperty("current_period")
        @ExcludeMissing
        private val currentPeriod: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("group_by")
        @ExcludeMissing
        private val groupBy: JsonField<GroupBy> = JsonMissing.of(),
        @JsonProperty("starting_on")
        @ExcludeMissing
        private val startingOn: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun billableMetricId(): String = billableMetricId.getRequired("billable_metric_id")

        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * A window_size of "day" or "hour" will return the usage for the specified period segmented
         * into daily or hourly aggregates. A window_size of "none" will return a single usage
         * aggregate for the entirety of the specified period.
         */
        fun windowSize(): WindowSize = windowSize.getRequired("window_size")

        /**
         * If true, will return the usage for the current billing period. Will return an error if
         * the customer is currently uncontracted or starting_on and ending_before are specified
         * when this is true.
         */
        fun currentPeriod(): Optional<Boolean> =
            Optional.ofNullable(currentPeriod.getNullable("current_period"))

        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        fun groupBy(): Optional<GroupBy> = Optional.ofNullable(groupBy.getNullable("group_by"))

        fun startingOn(): Optional<OffsetDateTime> =
            Optional.ofNullable(startingOn.getNullable("starting_on"))

        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        fun _billableMetricId(): JsonField<String> = billableMetricId

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * A window_size of "day" or "hour" will return the usage for the specified period segmented
         * into daily or hourly aggregates. A window_size of "none" will return a single usage
         * aggregate for the entirety of the specified period.
         */
        @JsonProperty("window_size")
        @ExcludeMissing
        fun _windowSize(): JsonField<WindowSize> = windowSize

        /**
         * If true, will return the usage for the current billing period. Will return an error if
         * the customer is currently uncontracted or starting_on and ending_before are specified
         * when this is true.
         */
        @JsonProperty("current_period")
        @ExcludeMissing
        fun _currentPeriod(): JsonField<Boolean> = currentPeriod

        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        @JsonProperty("group_by") @ExcludeMissing fun _groupBy(): JsonField<GroupBy> = groupBy

        @JsonProperty("starting_on")
        @ExcludeMissing
        fun _startingOn(): JsonField<OffsetDateTime> = startingOn

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): UsageListWithGroupsBody = apply {
            if (validated) {
                return@apply
            }

            billableMetricId()
            customerId()
            windowSize()
            currentPeriod()
            endingBefore()
            groupBy().ifPresent { it.validate() }
            startingOn()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UsageListWithGroupsBody]. */
        class Builder internal constructor() {

            private var billableMetricId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var windowSize: JsonField<WindowSize>? = null
            private var currentPeriod: JsonField<Boolean> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var groupBy: JsonField<GroupBy> = JsonMissing.of()
            private var startingOn: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usageListWithGroupsBody: UsageListWithGroupsBody) = apply {
                billableMetricId = usageListWithGroupsBody.billableMetricId
                customerId = usageListWithGroupsBody.customerId
                windowSize = usageListWithGroupsBody.windowSize
                currentPeriod = usageListWithGroupsBody.currentPeriod
                endingBefore = usageListWithGroupsBody.endingBefore
                groupBy = usageListWithGroupsBody.groupBy
                startingOn = usageListWithGroupsBody.startingOn
                additionalProperties = usageListWithGroupsBody.additionalProperties.toMutableMap()
            }

            fun billableMetricId(billableMetricId: String) =
                billableMetricId(JsonField.of(billableMetricId))

            fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                this.billableMetricId = billableMetricId
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * A window_size of "day" or "hour" will return the usage for the specified period
             * segmented into daily or hourly aggregates. A window_size of "none" will return a
             * single usage aggregate for the entirety of the specified period.
             */
            fun windowSize(windowSize: WindowSize) = windowSize(JsonField.of(windowSize))

            /**
             * A window_size of "day" or "hour" will return the usage for the specified period
             * segmented into daily or hourly aggregates. A window_size of "none" will return a
             * single usage aggregate for the entirety of the specified period.
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
             * If true, will return the usage for the current billing period. Will return an error
             * if the customer is currently uncontracted or starting_on and ending_before are
             * specified when this is true.
             */
            fun currentPeriod(currentPeriod: JsonField<Boolean>) = apply {
                this.currentPeriod = currentPeriod
            }

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun groupBy(groupBy: GroupBy) = groupBy(JsonField.of(groupBy))

            fun groupBy(groupBy: JsonField<GroupBy>) = apply { this.groupBy = groupBy }

            fun startingOn(startingOn: OffsetDateTime) = startingOn(JsonField.of(startingOn))

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

            fun build(): UsageListWithGroupsBody =
                UsageListWithGroupsBody(
                    checkRequired("billableMetricId", billableMetricId),
                    checkRequired("customerId", customerId),
                    checkRequired("windowSize", windowSize),
                    currentPeriod,
                    endingBefore,
                    groupBy,
                    startingOn,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UsageListWithGroupsBody && billableMetricId == other.billableMetricId && customerId == other.customerId && windowSize == other.windowSize && currentPeriod == other.currentPeriod && endingBefore == other.endingBefore && groupBy == other.groupBy && startingOn == other.startingOn && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billableMetricId, customerId, windowSize, currentPeriod, endingBefore, groupBy, startingOn, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UsageListWithGroupsBody{billableMetricId=$billableMetricId, customerId=$customerId, windowSize=$windowSize, currentPeriod=$currentPeriod, endingBefore=$endingBefore, groupBy=$groupBy, startingOn=$startingOn, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageListWithGroupsParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var limit: Long? = null
        private var nextPage: String? = null
        private var body: UsageListWithGroupsBody.Builder = UsageListWithGroupsBody.builder()
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

        /** Max number of results that should be returned */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Max number of results that should be returned */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun limit(limit: Optional<Long>) = limit(limit.orElse(null) as Long?)

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String?) = apply { this.nextPage = nextPage }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.orElse(null))

        fun billableMetricId(billableMetricId: String) = apply {
            body.billableMetricId(billableMetricId)
        }

        fun billableMetricId(billableMetricId: JsonField<String>) = apply {
            body.billableMetricId(billableMetricId)
        }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * A window_size of "day" or "hour" will return the usage for the specified period segmented
         * into daily or hourly aggregates. A window_size of "none" will return a single usage
         * aggregate for the entirety of the specified period.
         */
        fun windowSize(windowSize: WindowSize) = apply { body.windowSize(windowSize) }

        /**
         * A window_size of "day" or "hour" will return the usage for the specified period segmented
         * into daily or hourly aggregates. A window_size of "none" will return a single usage
         * aggregate for the entirety of the specified period.
         */
        fun windowSize(windowSize: JsonField<WindowSize>) = apply { body.windowSize(windowSize) }

        /**
         * If true, will return the usage for the current billing period. Will return an error if
         * the customer is currently uncontracted or starting_on and ending_before are specified
         * when this is true.
         */
        fun currentPeriod(currentPeriod: Boolean) = apply { body.currentPeriod(currentPeriod) }

        /**
         * If true, will return the usage for the current billing period. Will return an error if
         * the customer is currently uncontracted or starting_on and ending_before are specified
         * when this is true.
         */
        fun currentPeriod(currentPeriod: JsonField<Boolean>) = apply {
            body.currentPeriod(currentPeriod)
        }

        fun endingBefore(endingBefore: OffsetDateTime) = apply { body.endingBefore(endingBefore) }

        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            body.endingBefore(endingBefore)
        }

        fun groupBy(groupBy: GroupBy) = apply { body.groupBy(groupBy) }

        fun groupBy(groupBy: JsonField<GroupBy>) = apply { body.groupBy(groupBy) }

        fun startingOn(startingOn: OffsetDateTime) = apply { body.startingOn(startingOn) }

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

        fun build(): UsageListWithGroupsParams =
            UsageListWithGroupsParams(
                limit,
                nextPage,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * A window_size of "day" or "hour" will return the usage for the specified period segmented
     * into daily or hourly aggregates. A window_size of "none" will return a single usage aggregate
     * for the entirety of the specified period.
     */
    class WindowSize
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is WindowSize && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class GroupBy
    @JsonCreator
    private constructor(
        @JsonProperty("key") @ExcludeMissing private val key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("values")
        @ExcludeMissing
        private val values: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name of the group_by key to use */
        fun key(): String = key.getRequired("key")

        /**
         * Values of the group_by key to return in the query. Omit this if you'd like all values for
         * the key returned.
         */
        fun values(): Optional<List<String>> = Optional.ofNullable(values.getNullable("values"))

        /** The name of the group_by key to use */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Values of the group_by key to return in the query. Omit this if you'd like all values for
         * the key returned.
         */
        @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): GroupBy = apply {
            if (validated) {
                return@apply
            }

            key()
            values()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** The name of the group_by key to use */
            fun key(key: JsonField<String>) = apply { this.key = key }

            /**
             * Values of the group_by key to return in the query. Omit this if you'd like all values
             * for the key returned.
             */
            fun values(values: List<String>) = values(JsonField.of(values))

            /**
             * Values of the group_by key to return in the query. Omit this if you'd like all values
             * for the key returned.
             */
            fun values(values: JsonField<List<String>>) = apply {
                this.values = values.map { it.toMutableList() }
            }

            /**
             * Values of the group_by key to return in the query. Omit this if you'd like all values
             * for the key returned.
             */
            fun addValue(value: String) = apply {
                values =
                    (values ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(value)
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

            fun build(): GroupBy =
                GroupBy(
                    checkRequired("key", key),
                    (values ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GroupBy && key == other.key && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(key, values, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GroupBy{key=$key, values=$values, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageListWithGroupsParams && limit == other.limit && nextPage == other.nextPage && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(limit, nextPage, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "UsageListWithGroupsParams{limit=$limit, nextPage=$nextPage, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
