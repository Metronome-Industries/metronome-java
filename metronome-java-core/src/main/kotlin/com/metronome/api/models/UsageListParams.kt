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

class UsageListParams
constructor(
    private val endingBefore: OffsetDateTime,
    private val startingOn: OffsetDateTime,
    private val windowSize: WindowSize,
    private val nextPage: String?,
    private val billableMetrics: List<BillableMetric>?,
    private val customerIds: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun endingBefore(): OffsetDateTime = endingBefore

    fun startingOn(): OffsetDateTime = startingOn

    fun windowSize(): WindowSize = windowSize

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun billableMetrics(): Optional<List<BillableMetric>> = Optional.ofNullable(billableMetrics)

    fun customerIds(): Optional<List<String>> = Optional.ofNullable(customerIds)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): UsageListBody {
        return UsageListBody(
            endingBefore,
            startingOn,
            windowSize,
            billableMetrics,
            customerIds,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    @NoAutoDetect
    class UsageListBody
    @JsonCreator
    internal constructor(
        @JsonProperty("ending_before") private val endingBefore: OffsetDateTime,
        @JsonProperty("starting_on") private val startingOn: OffsetDateTime,
        @JsonProperty("window_size") private val windowSize: WindowSize,
        @JsonProperty("billable_metrics") private val billableMetrics: List<BillableMetric>?,
        @JsonProperty("customer_ids") private val customerIds: List<String>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime = endingBefore

        @JsonProperty("starting_on") fun startingOn(): OffsetDateTime = startingOn

        /**
         * A window_size of "day" or "hour" will return the usage for the specified period segmented
         * into daily or hourly aggregates. A window_size of "none" will return a single usage
         * aggregate for the entirety of the specified period.
         */
        @JsonProperty("window_size") fun windowSize(): WindowSize = windowSize

        /**
         * A list of billable metrics to fetch usage for. If absent, all billable metrics will be
         * returned.
         */
        @JsonProperty("billable_metrics")
        fun billableMetrics(): Optional<List<BillableMetric>> = Optional.ofNullable(billableMetrics)

        /**
         * A list of Metronome customer IDs to fetch usage for. If absent, usage for all customers
         * will be returned.
         */
        @JsonProperty("customer_ids")
        fun customerIds(): Optional<List<String>> = Optional.ofNullable(customerIds)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var endingBefore: OffsetDateTime? = null
            private var startingOn: OffsetDateTime? = null
            private var windowSize: WindowSize? = null
            private var billableMetrics: List<BillableMetric>? = null
            private var customerIds: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usageListBody: UsageListBody) = apply {
                endingBefore = usageListBody.endingBefore
                startingOn = usageListBody.startingOn
                windowSize = usageListBody.windowSize
                billableMetrics = usageListBody.billableMetrics?.toMutableList()
                customerIds = usageListBody.customerIds?.toMutableList()
                additionalProperties = usageListBody.additionalProperties.toMutableMap()
            }

            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
            }

            fun startingOn(startingOn: OffsetDateTime) = apply { this.startingOn = startingOn }

            /**
             * A window_size of "day" or "hour" will return the usage for the specified period
             * segmented into daily or hourly aggregates. A window_size of "none" will return a
             * single usage aggregate for the entirety of the specified period.
             */
            fun windowSize(windowSize: WindowSize) = apply { this.windowSize = windowSize }

            /**
             * A list of billable metrics to fetch usage for. If absent, all billable metrics will
             * be returned.
             */
            fun billableMetrics(billableMetrics: List<BillableMetric>) = apply {
                this.billableMetrics = billableMetrics
            }

            /**
             * A list of Metronome customer IDs to fetch usage for. If absent, usage for all
             * customers will be returned.
             */
            fun customerIds(customerIds: List<String>) = apply { this.customerIds = customerIds }

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

            fun build(): UsageListBody =
                UsageListBody(
                    checkNotNull(endingBefore) { "`endingBefore` is required but was not set" },
                    checkNotNull(startingOn) { "`startingOn` is required but was not set" },
                    checkNotNull(windowSize) { "`windowSize` is required but was not set" },
                    billableMetrics?.toImmutable(),
                    customerIds?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UsageListBody && endingBefore == other.endingBefore && startingOn == other.startingOn && windowSize == other.windowSize && billableMetrics == other.billableMetrics && customerIds == other.customerIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(endingBefore, startingOn, windowSize, billableMetrics, customerIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UsageListBody{endingBefore=$endingBefore, startingOn=$startingOn, windowSize=$windowSize, billableMetrics=$billableMetrics, customerIds=$customerIds, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var endingBefore: OffsetDateTime? = null
        private var startingOn: OffsetDateTime? = null
        private var windowSize: WindowSize? = null
        private var nextPage: String? = null
        private var billableMetrics: MutableList<BillableMetric> = mutableListOf()
        private var customerIds: MutableList<String> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageListParams: UsageListParams) = apply {
            endingBefore = usageListParams.endingBefore
            startingOn = usageListParams.startingOn
            windowSize = usageListParams.windowSize
            nextPage = usageListParams.nextPage
            billableMetrics = usageListParams.billableMetrics?.toMutableList() ?: mutableListOf()
            customerIds = usageListParams.customerIds?.toMutableList() ?: mutableListOf()
            additionalHeaders = usageListParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageListParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = usageListParams.additionalBodyProperties.toMutableMap()
        }

        fun endingBefore(endingBefore: OffsetDateTime) = apply { this.endingBefore = endingBefore }

        fun startingOn(startingOn: OffsetDateTime) = apply { this.startingOn = startingOn }

        /**
         * A window_size of "day" or "hour" will return the usage for the specified period segmented
         * into daily or hourly aggregates. A window_size of "none" will return a single usage
         * aggregate for the entirety of the specified period.
         */
        fun windowSize(windowSize: WindowSize) = apply { this.windowSize = windowSize }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /**
         * A list of billable metrics to fetch usage for. If absent, all billable metrics will be
         * returned.
         */
        fun billableMetrics(billableMetrics: List<BillableMetric>) = apply {
            this.billableMetrics.clear()
            this.billableMetrics.addAll(billableMetrics)
        }

        /**
         * A list of billable metrics to fetch usage for. If absent, all billable metrics will be
         * returned.
         */
        fun addBillableMetric(billableMetric: BillableMetric) = apply {
            this.billableMetrics.add(billableMetric)
        }

        /**
         * A list of Metronome customer IDs to fetch usage for. If absent, usage for all customers
         * will be returned.
         */
        fun customerIds(customerIds: List<String>) = apply {
            this.customerIds.clear()
            this.customerIds.addAll(customerIds)
        }

        /**
         * A list of Metronome customer IDs to fetch usage for. If absent, usage for all customers
         * will be returned.
         */
        fun addCustomerId(customerId: String) = apply { this.customerIds.add(customerId) }

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

        fun build(): UsageListParams =
            UsageListParams(
                checkNotNull(endingBefore) { "`endingBefore` is required but was not set" },
                checkNotNull(startingOn) { "`startingOn` is required but was not set" },
                checkNotNull(windowSize) { "`windowSize` is required but was not set" },
                nextPage,
                billableMetrics.toImmutable().ifEmpty { null },
                customerIds.toImmutable().ifEmpty { null },
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
    class BillableMetric
    @JsonCreator
    private constructor(
        @JsonProperty("id") private val id: String,
        @JsonProperty("group_by") private val groupBy: GroupBy?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("id") fun id(): String = id

        @JsonProperty("group_by") fun groupBy(): Optional<GroupBy> = Optional.ofNullable(groupBy)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var groupBy: GroupBy? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billableMetric: BillableMetric) = apply {
                id = billableMetric.id
                groupBy = billableMetric.groupBy
                additionalProperties = billableMetric.additionalProperties.toMutableMap()
            }

            fun id(id: String) = apply { this.id = id }

            fun groupBy(groupBy: GroupBy) = apply { this.groupBy = groupBy }

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

            fun build(): BillableMetric =
                BillableMetric(
                    checkNotNull(id) { "`id` is required but was not set" },
                    groupBy,
                    additionalProperties.toImmutable(),
                )
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
             * Values of the group_by key to return in the query. If this field is omitted, all
             * available values will be returned, up to a maximum of 200.
             */
            @JsonProperty("values")
            fun values(): Optional<List<String>> = Optional.ofNullable(values)

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
                    key = groupBy.key
                    values = groupBy.values?.toMutableList()
                    additionalProperties = groupBy.additionalProperties.toMutableMap()
                }

                /** The name of the group_by key to use */
                fun key(key: String) = apply { this.key = key }

                /**
                 * Values of the group_by key to return in the query. If this field is omitted, all
                 * available values will be returned, up to a maximum of 200.
                 */
                fun values(values: List<String>) = apply { this.values = values }

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

            return /* spotless:off */ other is BillableMetric && id == other.id && groupBy == other.groupBy && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, groupBy, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillableMetric{id=$id, groupBy=$groupBy, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageListParams && endingBefore == other.endingBefore && startingOn == other.startingOn && windowSize == other.windowSize && nextPage == other.nextPage && billableMetrics == other.billableMetrics && customerIds == other.customerIds && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(endingBefore, startingOn, windowSize, nextPage, billableMetrics, customerIds, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "UsageListParams{endingBefore=$endingBefore, startingOn=$startingOn, windowSize=$windowSize, nextPage=$nextPage, billableMetrics=$billableMetrics, customerIds=$customerIds, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
