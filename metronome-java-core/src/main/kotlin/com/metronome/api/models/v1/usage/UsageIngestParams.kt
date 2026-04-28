// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.usage

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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
 * The transaction_id serves as your idempotency key, ensuring events are processed exactly once.
 * Metronome maintains a 34-day deduplication window - significantly longer than typical 12-hour
 * windows - enabling robust backfill scenarios without duplicate billing.
 * - Best Practices:
 *     - Use UUIDs for one-time events: uuid4()
 *     - For heartbeat events, use deterministic IDs
 *     - Include enough context to avoid collisions across different event sources
 *
 * #### Customer ID
 * Identifies which customer should be billed for this usage. Supports two identification methods:
 * - Metronome Customer ID: The UUID returned when creating a customer
 * - Ingest Alias: Your system's identifier (email, account number, etc.)
 *
 * Ingest aliases enable seamless integration without requiring ID mapping, and customers can have
 * multiple aliases for flexibility.
 *
 * #### Event Type:
 * Categorizes the event type for billable metric matching. Choose descriptive names that aligns
 * with the product surface area.
 *
 * #### Properties:
 * Flexible metadata also used to match billable metrics or to be used to serve as group keys to
 * create multiple pricing dimensions or breakdown costs by novel properties for end customers or
 * internal finance teams measuring underlying COGs.
 */
class UsageIngestParams
private constructor(
    private val usage: List<Usage>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun usage(): Optional<List<Usage>> = Optional.ofNullable(usage)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): UsageIngestParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [UsageIngestParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageIngestParams]. */
    class Builder internal constructor() {

        private var usage: MutableList<Usage>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(usageIngestParams: UsageIngestParams) = apply {
            usage = usageIngestParams.usage?.toMutableList()
            additionalHeaders = usageIngestParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageIngestParams.additionalQueryParams.toBuilder()
        }

        fun usage(usage: List<Usage>?) = apply { this.usage = usage?.toMutableList() }

        /** Alias for calling [Builder.usage] with `usage.orElse(null)`. */
        fun usage(usage: Optional<List<Usage>>) = usage(usage.getOrNull())

        /**
         * Adds a single [Usage] to [Builder.usage].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
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

        /**
         * Returns an immutable instance of [UsageIngestParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UsageIngestParams =
            UsageIngestParams(
                usage?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Optional<List<Usage>> = Optional.ofNullable(usage)

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Usage
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customerId: JsonField<String>,
        private val eventType: JsonField<String>,
        private val timestamp: JsonField<String>,
        private val transactionId: JsonField<String>,
        private val properties: JsonField<Properties>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("event_type")
            @ExcludeMissing
            eventType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transaction_id")
            @ExcludeMissing
            transactionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("properties")
            @ExcludeMissing
            properties: JsonField<Properties> = JsonMissing.of(),
        ) : this(customerId, eventType, timestamp, transactionId, properties, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventType(): String = eventType.getRequired("event_type")

        /**
         * RFC 3339 formatted
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timestamp(): String = timestamp.getRequired("timestamp")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun properties(): Optional<Properties> = properties.getOptional("properties")

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [eventType].
         *
         * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<String> = timestamp

        /**
         * Returns the raw JSON value of [transactionId].
         *
         * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        /**
         * Returns the raw JSON value of [properties].
         *
         * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("properties")
        @ExcludeMissing
        fun _properties(): JsonField<Properties> = properties

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
             * Returns a mutable builder for constructing an instance of [Usage].
             *
             * The following fields are required:
             * ```java
             * .customerId()
             * .eventType()
             * .timestamp()
             * .transactionId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Usage]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var eventType: JsonField<String>? = null
            private var timestamp: JsonField<String>? = null
            private var transactionId: JsonField<String>? = null
            private var properties: JsonField<Properties> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usage: Usage) = apply {
                customerId = usage.customerId
                eventType = usage.eventType
                timestamp = usage.timestamp
                transactionId = usage.transactionId
                properties = usage.properties
                additionalProperties = usage.additionalProperties.toMutableMap()
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

            fun eventType(eventType: String) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

            /** RFC 3339 formatted */
            fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /**
             * Sets [Builder.transactionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
            }

            fun properties(properties: Properties) = properties(JsonField.of(properties))

            /**
             * Sets [Builder.properties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.properties] with a well-typed [Properties] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun properties(properties: JsonField<Properties>) = apply {
                this.properties = properties
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
             * Returns an immutable instance of [Usage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .customerId()
             * .eventType()
             * .timestamp()
             * .transactionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Usage =
                Usage(
                    checkRequired("customerId", customerId),
                    checkRequired("eventType", eventType),
                    checkRequired("timestamp", timestamp),
                    checkRequired("transactionId", transactionId),
                    properties,
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (eventType.asKnown().isPresent) 1 else 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0) +
                (if (transactionId.asKnown().isPresent) 1 else 0) +
                (properties.asKnown().getOrNull()?.validity() ?: 0)

        class Properties
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

                /** Returns a mutable builder for constructing an instance of [Properties]. */
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

                /**
                 * Returns an immutable instance of [Properties].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Properties = Properties(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Properties = apply {
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

                return other is Properties && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Properties{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Usage &&
                customerId == other.customerId &&
                eventType == other.eventType &&
                timestamp == other.timestamp &&
                transactionId == other.transactionId &&
                properties == other.properties &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                customerId,
                eventType,
                timestamp,
                transactionId,
                properties,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Usage{customerId=$customerId, eventType=$eventType, timestamp=$timestamp, transactionId=$transactionId, properties=$properties, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageIngestParams &&
            usage == other.usage &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(usage, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UsageIngestParams{usage=$usage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
