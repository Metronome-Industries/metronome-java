// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/**
 * The ingest endpoint is the primary method for sending usage events to Metronome, serving as the
 * foundation for all billing calculations in your usage-based pricing model. This high-throughput
 * endpoint is designed for real-time streaming ingestion, supports backdating 34 days, and is built
 * to handle mission-critical usage data with enterprise-grade reliability. Metronome supports
 * 100,000 events per second without requiring pre-aggregation or rollups and can scale up from
 * there. See the [Send usage events](/guides/events/send-usage-events) guide to learn more about
 * usage events.
 *
 * ### Use this endpoint to:
 *
 * Create a customer usage pipeline into Metronome that drives billable metrics, credit drawdown,
 * and invoicing. Track customer behavior, resource consumption, and feature usage
 *
 * ### What happens when you send events:
 * - Events are validated and processed in real-time
 * - Events are matched to customers using customer IDs or customer ingest aliases
 * - Events are matched to billable metrics and are immediately available for usage and spend
 *   calculations
 *
 * ### Usage guidelines:
 * - Historical events can be backdated up to 34 days and will immediately impact live customer
 *   spend
 * - Duplicate events are automatically detected and ignored (34-day deduplication window)
 *
 * #### Event structure:
 *
 * Usage events are simple JSON objects designed for flexibility and ease of integration:
 * ```json
 * {
 *   "transaction_id": "2021-01-01T00:00:00Z_cluster42",
 *   "customer_id": "team@example.com",
 *   "event_type": "api_request",
 *   "timestamp": "2021-01-01T00:00:00Z",
 *   "properties": {
 *     "endpoint": "/v1/users",
 *     "method": "POST",
 *     "response_time_ms": 45,
 *     "region": "us-west-2"
 *   }
 * }
 * ```
 *
 * Learn more about [usage event structure definitions](/guides/events/design-usage-events).
 *
 * #### Transaction ID
 *
 * The transaction_id serves as your idempotency key, ensuring events are processed exactly once.
 * Metronome maintains a 34-day deduplication window - significantly longer than typical 12-hour
 * windows - enabling robust backfill scenarios without duplicate billing.
 * - Best Practices:
 *     - Use UUIDs for one-time events: uuid4()
 *     - For heartbeat events, use deterministic IDs
 *     - Include enough context to avoid collisions across different event sources
 *
 * #### Customer ID
 *
 * Identifies which customer should be billed for this usage. Supports two identification methods:
 * - Metronome Customer ID: The UUID returned when creating a customer
 * - Ingest Alias: Your system's identifier (email, account number, etc.)
 *
 * Ingest aliases enable seamless integration without requiring ID mapping, and customers can have
 * multiple aliases for flexibility.
 *
 * #### Event Type:
 *
 * Categorizes the event type for billable metric matching. Choose descriptive names that aligns
 * with the product surface area.
 *
 * #### Properties:
 *
 * Flexible metadata also used to match billable metrics or to be used to serve as group keys to
 * create multiple pricing dimensions or breakdown costs by novel properties for end customers or
 * internal finance teams measuring underlying COGs.
 */
class V1UsageIngestParams
private constructor(
    private val usage: List<Usage>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun usage(): Optional<List<Usage>> = Optional.ofNullable(usage)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Optional<List<Usage>> = Optional.ofNullable(usage)

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Usage
    @JsonCreator
    private constructor(
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        private val eventType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        private val timestamp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        private val transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        private val properties: JsonField<Properties> = JsonMissing.of(),
    ) {

        fun customerId(): String = customerId.getRequired("customer_id")

        fun eventType(): String = eventType.getRequired("event_type")

        /** RFC 3339 formatted */
        fun timestamp(): String = timestamp.getRequired("timestamp")

        fun transactionId(): String = transactionId.getRequired("transaction_id")

        fun properties(): Optional<Properties> =
            Optional.ofNullable(properties.getNullable("properties"))

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

        /** RFC 3339 formatted */
        @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<String> = timestamp

        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        @JsonProperty("properties")
        @ExcludeMissing
        fun _properties(): JsonField<Properties> = properties

        private var validated: Boolean = false

        fun validate(): Usage = apply {
            if (validated) {
                return@apply
            }

            customerId()
            eventType()
            timestamp()
            transactionId()
            properties().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Usage]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var eventType: JsonField<String>? = null
            private var timestamp: JsonField<String>? = null
            private var transactionId: JsonField<String>? = null
            private var properties: JsonField<Properties> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(usage: Usage) = apply {
                customerId = usage.customerId
                eventType = usage.eventType
                timestamp = usage.timestamp
                transactionId = usage.transactionId
                properties = usage.properties
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun eventType(eventType: String) = eventType(JsonField.of(eventType))

            fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

            /** RFC 3339 formatted */
            fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

            /** RFC 3339 formatted */
            fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
            }

            fun properties(properties: Properties) = properties(JsonField.of(properties))

            fun properties(properties: JsonField<Properties>) = apply {
                this.properties = properties
            }

            fun build(): Usage =
                Usage(
                    checkRequired("customerId", customerId),
                    checkRequired("eventType", eventType),
                    checkRequired("timestamp", timestamp),
                    checkRequired("transactionId", transactionId),
                    properties,
                )
        }

        @NoAutoDetect
        class Properties
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Properties = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Properties]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(properties: Properties) = apply {
                    additionalProperties = properties.additionalProperties.toMutableMap()
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

                fun build(): Properties = Properties(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Properties && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Properties{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Usage && customerId == other.customerId && eventType == other.eventType && timestamp == other.timestamp && transactionId == other.transactionId && properties == other.properties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, eventType, timestamp, transactionId, properties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Usage{customerId=$customerId, eventType=$eventType, timestamp=$timestamp, transactionId=$transactionId, properties=$properties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): V1UsageIngestParams = builder().build()

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1UsageIngestParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var usage: MutableList<Usage>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1UsageIngestParams: V1UsageIngestParams) = apply {
            usage = v1UsageIngestParams.usage?.toMutableList()
            additionalHeaders = v1UsageIngestParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1UsageIngestParams.additionalQueryParams.toBuilder()
        }

        fun usage(usage: List<Usage>?) = apply { this.usage = usage?.toMutableList() }

        fun usage(usage: Optional<List<Usage>>) = usage(usage.orElse(null))

        fun addUsage(usage: Usage) = apply {
            this.usage = (this.usage ?: mutableListOf()).apply { add(usage) }
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

        fun build(): V1UsageIngestParams =
            V1UsageIngestParams(
                usage?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1UsageIngestParams && usage == other.usage && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(usage, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V1UsageIngestParams{usage=$usage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
