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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Fetch aggregated usage data for the specified customer, billable-metric, and optional group,
 * broken into intervals of the specified length.
 */
class UsageListWithGroupsParams
constructor(
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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

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
        @JsonProperty("billable_metric_id") private val billableMetricId: String,
        @JsonProperty("customer_id") private val customerId: String,
        @JsonProperty("window_size") private val windowSize: WindowSize,
        @JsonProperty("current_period") private val currentPeriod: Boolean?,
        @JsonProperty("ending_before") private val endingBefore: OffsetDateTime?,
        @JsonProperty("group_by") private val groupBy: GroupBy?,
        @JsonProperty("starting_on") private val startingOn: OffsetDateTime?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("billable_metric_id") fun billableMetricId(): String = billableMetricId

        @JsonProperty("customer_id") fun customerId(): String = customerId

        /**
         * A window_size of "day" or "hour" will return the usage for the specified period segmented
         * into daily or hourly aggregates. A window_size of "none" will return a single usage
         * aggregate for the entirety of the specified period.
         */
        @JsonProperty("window_size") fun windowSize(): WindowSize = windowSize

        /**
         * If true, will return the usage for the current billing period. Will return an error if
         * the customer is currently uncontracted or starting_on and ending_before are specified
         * when this is true.
         */
        @JsonProperty("current_period")
        fun currentPeriod(): Optional<Boolean> = Optional.ofNullable(currentPeriod)

        @JsonProperty("ending_before")
        fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

        @JsonProperty("group_by") fun groupBy(): Optional<GroupBy> = Optional.ofNullable(groupBy)

        @JsonProperty("starting_on")
        fun startingOn(): Optional<OffsetDateTime> = Optional.ofNullable(startingOn)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var billableMetricId: String? = null
            private var customerId: String? = null
            private var windowSize: WindowSize? = null
            private var currentPeriod: Boolean? = null
            private var endingBefore: OffsetDateTime? = null
            private var groupBy: GroupBy? = null
            private var startingOn: OffsetDateTime? = null
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

            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * A window_size of "day" or "hour" will return the usage for the specified period
             * segmented into daily or hourly aggregates. A window_size of "none" will return a
             * single usage aggregate for the entirety of the specified period.
             */
            fun windowSize(windowSize: WindowSize) = apply { this.windowSize = windowSize }

            /**
             * If true, will return the usage for the current billing period. Will return an error
             * if the customer is currently uncontracted or starting_on and ending_before are
             * specified when this is true.
             */
            fun currentPeriod(currentPeriod: Boolean?) = apply {
                this.currentPeriod = currentPeriod
            }

            /**
             * If true, will return the usage for the current billing period. Will return an error
             * if the customer is currently uncontracted or starting_on and ending_before are
             * specified when this is true.
             */
            fun currentPeriod(currentPeriod: Boolean) = currentPeriod(currentPeriod as Boolean?)

            /**
             * If true, will return the usage for the current billing period. Will return an error
             * if the customer is currently uncontracted or starting_on and ending_before are
             * specified when this is true.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun currentPeriod(currentPeriod: Optional<Boolean>) =
                currentPeriod(currentPeriod.orElse(null) as Boolean?)

            fun endingBefore(endingBefore: OffsetDateTime?) = apply {
                this.endingBefore = endingBefore
            }

            fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
                endingBefore(endingBefore.orElse(null))

            fun groupBy(groupBy: GroupBy?) = apply { this.groupBy = groupBy }

            fun groupBy(groupBy: Optional<GroupBy>) = groupBy(groupBy.orElse(null))

            fun startingOn(startingOn: OffsetDateTime?) = apply { this.startingOn = startingOn }

            fun startingOn(startingOn: Optional<OffsetDateTime>) =
                startingOn(startingOn.orElse(null))

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
                    checkNotNull(billableMetricId) {
                        "`billableMetricId` is required but was not set"
                    },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(windowSize) { "`windowSize` is required but was not set" },
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

    @NoAutoDetect
    class Builder {

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

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * A window_size of "day" or "hour" will return the usage for the specified period segmented
         * into daily or hourly aggregates. A window_size of "none" will return a single usage
         * aggregate for the entirety of the specified period.
         */
        fun windowSize(windowSize: WindowSize) = apply { body.windowSize(windowSize) }

        /**
         * If true, will return the usage for the current billing period. Will return an error if
         * the customer is currently uncontracted or starting_on and ending_before are specified
         * when this is true.
         */
        fun currentPeriod(currentPeriod: Boolean?) = apply { body.currentPeriod(currentPeriod) }

        /**
         * If true, will return the usage for the current billing period. Will return an error if
         * the customer is currently uncontracted or starting_on and ending_before are specified
         * when this is true.
         */
        fun currentPeriod(currentPeriod: Boolean) = currentPeriod(currentPeriod as Boolean?)

        /**
         * If true, will return the usage for the current billing period. Will return an error if
         * the customer is currently uncontracted or starting_on and ending_before are specified
         * when this is true.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun currentPeriod(currentPeriod: Optional<Boolean>) =
            currentPeriod(currentPeriod.orElse(null) as Boolean?)

        fun endingBefore(endingBefore: OffsetDateTime?) = apply { body.endingBefore(endingBefore) }

        fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
            endingBefore(endingBefore.orElse(null))

        fun groupBy(groupBy: GroupBy?) = apply { body.groupBy(groupBy) }

        fun groupBy(groupBy: Optional<GroupBy>) = groupBy(groupBy.orElse(null))

        fun startingOn(startingOn: OffsetDateTime?) = apply { body.startingOn(startingOn) }

        fun startingOn(startingOn: Optional<OffsetDateTime>) = startingOn(startingOn.orElse(null))

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

        fun build(): UsageListWithGroupsParams =
            UsageListWithGroupsParams(
                limit,
                nextPage,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class WindowSize
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val HOUR = of("HOUR")

            @JvmField val DAY = of("DAY")

            @JvmField val NONE = of("NONE")

            @JvmStatic fun of(value: String) = WindowSize(JsonField.of(value))
        }

        enum class Known {
            HOUR,
            DAY,
            NONE,
        }

        enum class Value {
            HOUR,
            DAY,
            NONE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                HOUR -> Value.HOUR
                DAY -> Value.DAY
                NONE -> Value.NONE
                else -> Value._UNKNOWN
            }

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
        @JsonProperty("key") private val key: String,
        @JsonProperty("values") private val values: List<String>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name of the group_by key to use */
        @JsonProperty("key") fun key(): String = key

        /**
         * Values of the group_by key to return in the query. Omit this if you'd like all values for
         * the key returned.
         */
        @JsonProperty("values") fun values(): Optional<List<String>> = Optional.ofNullable(values)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var key: String? = null
            private var values: MutableList<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(groupBy: GroupBy) = apply {
                key = groupBy.key
                values = groupBy.values?.toMutableList()
                additionalProperties = groupBy.additionalProperties.toMutableMap()
            }

            /** The name of the group_by key to use */
            fun key(key: String) = apply { this.key = key }

            /**
             * Values of the group_by key to return in the query. Omit this if you'd like all values
             * for the key returned.
             */
            fun values(values: List<String>?) = apply { this.values = values?.toMutableList() }

            /**
             * Values of the group_by key to return in the query. Omit this if you'd like all values
             * for the key returned.
             */
            fun values(values: Optional<List<String>>) = values(values.orElse(null))

            /**
             * Values of the group_by key to return in the query. Omit this if you'd like all values
             * for the key returned.
             */
            fun addValue(value: String) = apply {
                values = (values ?: mutableListOf()).apply { add(value) }
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
                    checkNotNull(key) { "`key` is required but was not set" },
                    values?.toImmutable(),
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
