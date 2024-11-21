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

    @JsonDeserialize(builder = UsageListBody.Builder::class)
    @NoAutoDetect
    class UsageListBody
    internal constructor(
        private val endingBefore: OffsetDateTime?,
        private val startingOn: OffsetDateTime?,
        private val windowSize: WindowSize?,
        private val billableMetrics: List<BillableMetric>?,
        private val customerIds: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

        @JsonProperty("starting_on") fun startingOn(): OffsetDateTime? = startingOn

        /**
         * A window_size of "day" or "hour" will return the usage for the specified period segmented
         * into daily or hourly aggregates. A window_size of "none" will return a single usage
         * aggregate for the entirety of the specified period.
         */
        @JsonProperty("window_size") fun windowSize(): WindowSize? = windowSize

        /**
         * A list of billable metrics to fetch usage for. If absent, all billable metrics will be
         * returned.
         */
        @JsonProperty("billable_metrics")
        fun billableMetrics(): List<BillableMetric>? = billableMetrics

        /**
         * A list of Metronome customer IDs to fetch usage for. If absent, usage for all customers
         * will be returned.
         */
        @JsonProperty("customer_ids") fun customerIds(): List<String>? = customerIds

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
                this.endingBefore = usageListBody.endingBefore
                this.startingOn = usageListBody.startingOn
                this.windowSize = usageListBody.windowSize
                this.billableMetrics = usageListBody.billableMetrics
                this.customerIds = usageListBody.customerIds
                additionalProperties(usageListBody.additionalProperties)
            }

            @JsonProperty("ending_before")
            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
            }

            @JsonProperty("starting_on")
            fun startingOn(startingOn: OffsetDateTime) = apply { this.startingOn = startingOn }

            /**
             * A window_size of "day" or "hour" will return the usage for the specified period
             * segmented into daily or hourly aggregates. A window_size of "none" will return a
             * single usage aggregate for the entirety of the specified period.
             */
            @JsonProperty("window_size")
            fun windowSize(windowSize: WindowSize) = apply { this.windowSize = windowSize }

            /**
             * A list of billable metrics to fetch usage for. If absent, all billable metrics will
             * be returned.
             */
            @JsonProperty("billable_metrics")
            fun billableMetrics(billableMetrics: List<BillableMetric>) = apply {
                this.billableMetrics = billableMetrics
            }

            /**
             * A list of Metronome customer IDs to fetch usage for. If absent, usage for all
             * customers will be returned.
             */
            @JsonProperty("customer_ids")
            fun customerIds(customerIds: List<String>) = apply { this.customerIds = customerIds }

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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageListParams && endingBefore == other.endingBefore && startingOn == other.startingOn && windowSize == other.windowSize && billableMetrics == other.billableMetrics && customerIds == other.customerIds && nextPage == other.nextPage && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(endingBefore, startingOn, windowSize, billableMetrics, customerIds, nextPage, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "UsageListParams{endingBefore=$endingBefore, startingOn=$startingOn, windowSize=$windowSize, billableMetrics=$billableMetrics, customerIds=$customerIds, nextPage=$nextPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

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
            this.endingBefore = usageListParams.endingBefore
            this.startingOn = usageListParams.startingOn
            this.windowSize = usageListParams.windowSize
            this.nextPage = usageListParams.nextPage
            this.billableMetrics(usageListParams.billableMetrics ?: listOf())
            this.customerIds(usageListParams.customerIds ?: listOf())
            additionalHeaders(usageListParams.additionalHeaders)
            additionalQueryParams(usageListParams.additionalQueryParams)
            additionalBodyProperties(usageListParams.additionalBodyProperties)
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
                if (billableMetrics.size == 0) null else billableMetrics.toImmutable(),
                if (customerIds.size == 0) null else customerIds.toImmutable(),
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

    @JsonDeserialize(builder = BillableMetric.Builder::class)
    @NoAutoDetect
    class BillableMetric
    private constructor(
        private val id: String?,
        private val groupBy: GroupBy?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("id") fun id(): String? = id

        @JsonProperty("group_by") fun groupBy(): GroupBy? = groupBy

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
                this.id = billableMetric.id
                this.groupBy = billableMetric.groupBy
                additionalProperties(billableMetric.additionalProperties)
            }

            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            @JsonProperty("group_by")
            fun groupBy(groupBy: GroupBy) = apply { this.groupBy = groupBy }

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

            fun build(): BillableMetric =
                BillableMetric(
                    checkNotNull(id) { "`id` is required but was not set" },
                    groupBy,
                    additionalProperties.toImmutable(),
                )
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
             * Values of the group_by key to return in the query. If this field is omitted, all
             * available values will be returned, up to a maximum of 200.
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
                 * Values of the group_by key to return in the query. If this field is omitted, all
                 * available values will be returned, up to a maximum of 200.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

            return /* spotless:off */ other is BillableMetric && id == other.id && groupBy == other.groupBy && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, groupBy, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillableMetric{id=$id, groupBy=$groupBy, additionalProperties=$additionalProperties}"
    }
}
