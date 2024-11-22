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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class UsageListWithGroupsParams
constructor(
    private val billableMetricId: String,
    private val customerId: String,
    private val windowSize: WindowSize,
    private val limit: Long?,
    private val nextPage: String?,
    private val currentPeriod: Boolean?,
    private val endingBefore: OffsetDateTime?,
    private val groupBy: GroupBy?,
    private val startingOn: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun billableMetricId(): String = billableMetricId

    fun customerId(): String = customerId

    fun windowSize(): WindowSize = windowSize

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun currentPeriod(): Optional<Boolean> = Optional.ofNullable(currentPeriod)

    fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

    fun groupBy(): Optional<GroupBy> = Optional.ofNullable(groupBy)

    fun startingOn(): Optional<OffsetDateTime> = Optional.ofNullable(startingOn)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): UsageListWithGroupsBody {
        return UsageListWithGroupsBody(
            billableMetricId,
            customerId,
            windowSize,
            currentPeriod,
            endingBefore,
            groupBy,
            startingOn,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    @JsonDeserialize(builder = UsageListWithGroupsBody.Builder::class)
    @NoAutoDetect
    class UsageListWithGroupsBody
    internal constructor(
        private val billableMetricId: String?,
        private val customerId: String?,
        private val windowSize: WindowSize?,
        private val currentPeriod: Boolean?,
        private val endingBefore: OffsetDateTime?,
        private val groupBy: GroupBy?,
        private val startingOn: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /**
         * A window_size of "day" or "hour" will return the usage for the specified period segmented
         * into daily or hourly aggregates. A window_size of "none" will return a single usage
         * aggregate for the entirety of the specified period.
         */
        @JsonProperty("window_size") fun windowSize(): WindowSize? = windowSize

        /**
         * If true, will return the usage for the current billing period. Will return an error if
         * the customer is currently uncontracted or starting_on and ending_before are specified
         * when this is true.
         */
        @JsonProperty("current_period") fun currentPeriod(): Boolean? = currentPeriod

        @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

        @JsonProperty("group_by") fun groupBy(): GroupBy? = groupBy

        @JsonProperty("starting_on") fun startingOn(): OffsetDateTime? = startingOn

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
                this.billableMetricId = usageListWithGroupsBody.billableMetricId
                this.customerId = usageListWithGroupsBody.customerId
                this.windowSize = usageListWithGroupsBody.windowSize
                this.currentPeriod = usageListWithGroupsBody.currentPeriod
                this.endingBefore = usageListWithGroupsBody.endingBefore
                this.groupBy = usageListWithGroupsBody.groupBy
                this.startingOn = usageListWithGroupsBody.startingOn
                additionalProperties(usageListWithGroupsBody.additionalProperties)
            }

            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * A window_size of "day" or "hour" will return the usage for the specified period
             * segmented into daily or hourly aggregates. A window_size of "none" will return a
             * single usage aggregate for the entirety of the specified period.
             */
            @JsonProperty("window_size")
            fun windowSize(windowSize: WindowSize) = apply { this.windowSize = windowSize }

            /**
             * If true, will return the usage for the current billing period. Will return an error
             * if the customer is currently uncontracted or starting_on and ending_before are
             * specified when this is true.
             */
            @JsonProperty("current_period")
            fun currentPeriod(currentPeriod: Boolean) = apply { this.currentPeriod = currentPeriod }

            @JsonProperty("ending_before")
            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
            }

            @JsonProperty("group_by")
            fun groupBy(groupBy: GroupBy) = apply { this.groupBy = groupBy }

            @JsonProperty("starting_on")
            fun startingOn(startingOn: OffsetDateTime) = apply { this.startingOn = startingOn }

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

        private var billableMetricId: String? = null
        private var customerId: String? = null
        private var windowSize: WindowSize? = null
        private var limit: Long? = null
        private var nextPage: String? = null
        private var currentPeriod: Boolean? = null
        private var endingBefore: OffsetDateTime? = null
        private var groupBy: GroupBy? = null
        private var startingOn: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageListWithGroupsParams: UsageListWithGroupsParams) = apply {
            billableMetricId = usageListWithGroupsParams.billableMetricId
            customerId = usageListWithGroupsParams.customerId
            windowSize = usageListWithGroupsParams.windowSize
            limit = usageListWithGroupsParams.limit
            nextPage = usageListWithGroupsParams.nextPage
            currentPeriod = usageListWithGroupsParams.currentPeriod
            endingBefore = usageListWithGroupsParams.endingBefore
            groupBy = usageListWithGroupsParams.groupBy
            startingOn = usageListWithGroupsParams.startingOn
            additionalHeaders = usageListWithGroupsParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageListWithGroupsParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                usageListWithGroupsParams.additionalBodyProperties.toMutableMap()
        }

        fun billableMetricId(billableMetricId: String) = apply {
            this.billableMetricId = billableMetricId
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * A window_size of "day" or "hour" will return the usage for the specified period segmented
         * into daily or hourly aggregates. A window_size of "none" will return a single usage
         * aggregate for the entirety of the specified period.
         */
        fun windowSize(windowSize: WindowSize) = apply { this.windowSize = windowSize }

        /** Max number of results that should be returned */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /**
         * If true, will return the usage for the current billing period. Will return an error if
         * the customer is currently uncontracted or starting_on and ending_before are specified
         * when this is true.
         */
        fun currentPeriod(currentPeriod: Boolean) = apply { this.currentPeriod = currentPeriod }

        fun endingBefore(endingBefore: OffsetDateTime) = apply { this.endingBefore = endingBefore }

        fun groupBy(groupBy: GroupBy) = apply { this.groupBy = groupBy }

        fun startingOn(startingOn: OffsetDateTime) = apply { this.startingOn = startingOn }

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

        fun build(): UsageListWithGroupsParams =
            UsageListWithGroupsParams(
                checkNotNull(billableMetricId) { "`billableMetricId` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(windowSize) { "`windowSize` is required but was not set" },
                limit,
                nextPage,
                currentPeriod,
                endingBefore,
                groupBy,
                startingOn,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class WindowSize
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is WindowSize && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val HOUR = WindowSize(JsonField.of("HOUR"))

            @JvmField val DAY = WindowSize(JsonField.of("DAY"))

            @JvmField val NONE = WindowSize(JsonField.of("NONE"))

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
    }

    @JsonDeserialize(builder = GroupBy.Builder::class)
    @NoAutoDetect
    class GroupBy
    private constructor(
        private val key: String?,
        private val values: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The name of the group_by key to use */
        @JsonProperty("key") fun key(): String? = key

        /**
         * Values of the group_by key to return in the query. Omit this if you'd like all values for
         * the key returned.
         */
        @JsonProperty("values") fun values(): List<String>? = values

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var key: String? = null
            private var values: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(groupBy: GroupBy) = apply {
                this.key = groupBy.key
                this.values = groupBy.values
                additionalProperties(groupBy.additionalProperties)
            }

            /** The name of the group_by key to use */
            @JsonProperty("key") fun key(key: String) = apply { this.key = key }

            /**
             * Values of the group_by key to return in the query. Omit this if you'd like all values
             * for the key returned.
             */
            @JsonProperty("values")
            fun values(values: List<String>) = apply { this.values = values }

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

        return /* spotless:off */ other is UsageListWithGroupsParams && billableMetricId == other.billableMetricId && customerId == other.customerId && windowSize == other.windowSize && limit == other.limit && nextPage == other.nextPage && currentPeriod == other.currentPeriod && endingBefore == other.endingBefore && groupBy == other.groupBy && startingOn == other.startingOn && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(billableMetricId, customerId, windowSize, limit, nextPage, currentPeriod, endingBefore, groupBy, startingOn, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "UsageListWithGroupsParams{billableMetricId=$billableMetricId, customerId=$customerId, windowSize=$windowSize, limit=$limit, nextPage=$nextPage, currentPeriod=$currentPeriod, endingBefore=$endingBefore, groupBy=$groupBy, startingOn=$startingOn, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
