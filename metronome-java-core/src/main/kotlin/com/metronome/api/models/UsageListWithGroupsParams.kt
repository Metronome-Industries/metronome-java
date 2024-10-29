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
import com.metronome.api.core.toUnmodifiable
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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
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

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.nextPage?.let { params.put("next_page", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UsageListWithGroupsBody && this.billableMetricId == other.billableMetricId && this.customerId == other.customerId && this.windowSize == other.windowSize && this.currentPeriod == other.currentPeriod && this.endingBefore == other.endingBefore && this.groupBy == other.groupBy && this.startingOn == other.startingOn && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(billableMetricId, customerId, windowSize, currentPeriod, endingBefore, groupBy, startingOn, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "UsageListWithGroupsBody{billableMetricId=$billableMetricId, customerId=$customerId, windowSize=$windowSize, currentPeriod=$currentPeriod, endingBefore=$endingBefore, groupBy=$groupBy, startingOn=$startingOn, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageListWithGroupsParams && this.billableMetricId == other.billableMetricId && this.customerId == other.customerId && this.windowSize == other.windowSize && this.currentPeriod == other.currentPeriod && this.endingBefore == other.endingBefore && this.groupBy == other.groupBy && this.startingOn == other.startingOn && this.limit == other.limit && this.nextPage == other.nextPage && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(billableMetricId, customerId, windowSize, currentPeriod, endingBefore, groupBy, startingOn, limit, nextPage, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "UsageListWithGroupsParams{billableMetricId=$billableMetricId, customerId=$customerId, windowSize=$windowSize, currentPeriod=$currentPeriod, endingBefore=$endingBefore, groupBy=$groupBy, startingOn=$startingOn, limit=$limit, nextPage=$nextPage, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageListWithGroupsParams: UsageListWithGroupsParams) = apply {
            this.billableMetricId = usageListWithGroupsParams.billableMetricId
            this.customerId = usageListWithGroupsParams.customerId
            this.windowSize = usageListWithGroupsParams.windowSize
            this.limit = usageListWithGroupsParams.limit
            this.nextPage = usageListWithGroupsParams.nextPage
            this.currentPeriod = usageListWithGroupsParams.currentPeriod
            this.endingBefore = usageListWithGroupsParams.endingBefore
            this.groupBy = usageListWithGroupsParams.groupBy
            this.startingOn = usageListWithGroupsParams.startingOn
            additionalQueryParams(usageListWithGroupsParams.additionalQueryParams)
            additionalHeaders(usageListWithGroupsParams.additionalHeaders)
            additionalBodyProperties(usageListWithGroupsParams.additionalBodyProperties)
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

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
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
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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

            return /* spotless:off */ other is WindowSize && this.value == other.value /* spotless:on */
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
                    values?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GroupBy && this.key == other.key && this.values == other.values && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(key, values, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "GroupBy{key=$key, values=$values, additionalProperties=$additionalProperties}"
    }
}
