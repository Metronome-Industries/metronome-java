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
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Preview how a set of events will affect a customer's invoices. Generates draft invoices for a
 * customer using their current contract configuration and the provided events. This is useful for
 * testing how new events will affect the customer's invoices before they are actually processed.
 * Customers on contracts with SQL billable metrics are not supported.
 */
class V1CustomerPreviewEventsParams
private constructor(
    private val customerId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = customerId

    /**
     * Array of usage events to include in the preview calculation. Must contain at least one event
     * in `merge` mode.
     */
    fun events(): List<Event> = body.events()

    /**
     * Controls how the provided events are combined with existing usage data. Use `replace` to
     * calculate the preview as if these are the only events for the customer, ignoring all
     * historical usage. Use `merge` to combine these events with the customer's existing usage.
     * Defaults to `replace`.
     */
    fun mode(): Optional<Mode> = body.mode()

    /** When `true`, line items with zero quantity are excluded from the response. */
    fun skipZeroQtyLineItems(): Optional<Boolean> = body.skipZeroQtyLineItems()

    /**
     * Array of usage events to include in the preview calculation. Must contain at least one event
     * in `merge` mode.
     */
    fun _events(): JsonField<List<Event>> = body._events()

    /**
     * Controls how the provided events are combined with existing usage data. Use `replace` to
     * calculate the preview as if these are the only events for the customer, ignoring all
     * historical usage. Use `merge` to combine these events with the customer's existing usage.
     * Defaults to `replace`.
     */
    fun _mode(): JsonField<Mode> = body._mode()

    /** When `true`, line items with zero quantity are excluded from the response. */
    fun _skipZeroQtyLineItems(): JsonField<Boolean> = body._skipZeroQtyLineItems()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("events")
        @ExcludeMissing
        private val events: JsonField<List<Event>> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing private val mode: JsonField<Mode> = JsonMissing.of(),
        @JsonProperty("skip_zero_qty_line_items")
        @ExcludeMissing
        private val skipZeroQtyLineItems: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Array of usage events to include in the preview calculation. Must contain at least one
         * event in `merge` mode.
         */
        fun events(): List<Event> = events.getRequired("events")

        /**
         * Controls how the provided events are combined with existing usage data. Use `replace` to
         * calculate the preview as if these are the only events for the customer, ignoring all
         * historical usage. Use `merge` to combine these events with the customer's existing usage.
         * Defaults to `replace`.
         */
        fun mode(): Optional<Mode> = Optional.ofNullable(mode.getNullable("mode"))

        /** When `true`, line items with zero quantity are excluded from the response. */
        fun skipZeroQtyLineItems(): Optional<Boolean> =
            Optional.ofNullable(skipZeroQtyLineItems.getNullable("skip_zero_qty_line_items"))

        /**
         * Array of usage events to include in the preview calculation. Must contain at least one
         * event in `merge` mode.
         */
        @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<Event>> = events

        /**
         * Controls how the provided events are combined with existing usage data. Use `replace` to
         * calculate the preview as if these are the only events for the customer, ignoring all
         * historical usage. Use `merge` to combine these events with the customer's existing usage.
         * Defaults to `replace`.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

        /** When `true`, line items with zero quantity are excluded from the response. */
        @JsonProperty("skip_zero_qty_line_items")
        @ExcludeMissing
        fun _skipZeroQtyLineItems(): JsonField<Boolean> = skipZeroQtyLineItems

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            events().forEach { it.validate() }
            mode()
            skipZeroQtyLineItems()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var events: JsonField<MutableList<Event>>? = null
            private var mode: JsonField<Mode> = JsonMissing.of()
            private var skipZeroQtyLineItems: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                events = body.events.map { it.toMutableList() }
                mode = body.mode
                skipZeroQtyLineItems = body.skipZeroQtyLineItems
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Array of usage events to include in the preview calculation. Must contain at least
             * one event in `merge` mode.
             */
            fun events(events: List<Event>) = events(JsonField.of(events))

            /**
             * Array of usage events to include in the preview calculation. Must contain at least
             * one event in `merge` mode.
             */
            fun events(events: JsonField<List<Event>>) = apply {
                this.events = events.map { it.toMutableList() }
            }

            /**
             * Array of usage events to include in the preview calculation. Must contain at least
             * one event in `merge` mode.
             */
            fun addEvent(event: Event) = apply {
                events =
                    (events ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(event)
                    }
            }

            /**
             * Controls how the provided events are combined with existing usage data. Use `replace`
             * to calculate the preview as if these are the only events for the customer, ignoring
             * all historical usage. Use `merge` to combine these events with the customer's
             * existing usage. Defaults to `replace`.
             */
            fun mode(mode: Mode) = mode(JsonField.of(mode))

            /**
             * Controls how the provided events are combined with existing usage data. Use `replace`
             * to calculate the preview as if these are the only events for the customer, ignoring
             * all historical usage. Use `merge` to combine these events with the customer's
             * existing usage. Defaults to `replace`.
             */
            fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

            /** When `true`, line items with zero quantity are excluded from the response. */
            fun skipZeroQtyLineItems(skipZeroQtyLineItems: Boolean) =
                skipZeroQtyLineItems(JsonField.of(skipZeroQtyLineItems))

            /** When `true`, line items with zero quantity are excluded from the response. */
            fun skipZeroQtyLineItems(skipZeroQtyLineItems: JsonField<Boolean>) = apply {
                this.skipZeroQtyLineItems = skipZeroQtyLineItems
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

            fun build(): Body =
                Body(
                    checkRequired("events", events).map { it.toImmutable() },
                    mode,
                    skipZeroQtyLineItems,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && events == other.events && mode == other.mode && skipZeroQtyLineItems == other.skipZeroQtyLineItems && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(events, mode, skipZeroQtyLineItems, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{events=$events, mode=$mode, skipZeroQtyLineItems=$skipZeroQtyLineItems, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1CustomerPreviewEventsParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var customerId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1CustomerPreviewEventsParams: V1CustomerPreviewEventsParams) = apply {
            customerId = v1CustomerPreviewEventsParams.customerId
            body = v1CustomerPreviewEventsParams.body.toBuilder()
            additionalHeaders = v1CustomerPreviewEventsParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1CustomerPreviewEventsParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * Array of usage events to include in the preview calculation. Must contain at least one
         * event in `merge` mode.
         */
        fun events(events: List<Event>) = apply { body.events(events) }

        /**
         * Array of usage events to include in the preview calculation. Must contain at least one
         * event in `merge` mode.
         */
        fun events(events: JsonField<List<Event>>) = apply { body.events(events) }

        /**
         * Array of usage events to include in the preview calculation. Must contain at least one
         * event in `merge` mode.
         */
        fun addEvent(event: Event) = apply { body.addEvent(event) }

        /**
         * Controls how the provided events are combined with existing usage data. Use `replace` to
         * calculate the preview as if these are the only events for the customer, ignoring all
         * historical usage. Use `merge` to combine these events with the customer's existing usage.
         * Defaults to `replace`.
         */
        fun mode(mode: Mode) = apply { body.mode(mode) }

        /**
         * Controls how the provided events are combined with existing usage data. Use `replace` to
         * calculate the preview as if these are the only events for the customer, ignoring all
         * historical usage. Use `merge` to combine these events with the customer's existing usage.
         * Defaults to `replace`.
         */
        fun mode(mode: JsonField<Mode>) = apply { body.mode(mode) }

        /** When `true`, line items with zero quantity are excluded from the response. */
        fun skipZeroQtyLineItems(skipZeroQtyLineItems: Boolean) = apply {
            body.skipZeroQtyLineItems(skipZeroQtyLineItems)
        }

        /** When `true`, line items with zero quantity are excluded from the response. */
        fun skipZeroQtyLineItems(skipZeroQtyLineItems: JsonField<Boolean>) = apply {
            body.skipZeroQtyLineItems(skipZeroQtyLineItems)
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

        fun build(): V1CustomerPreviewEventsParams =
            V1CustomerPreviewEventsParams(
                checkRequired("customerId", customerId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Event
    @JsonCreator
    private constructor(
        @JsonProperty("event_type")
        @ExcludeMissing
        private val eventType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        private val properties: JsonField<Properties> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        private val timestamp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        private val transactionId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun eventType(): String = eventType.getRequired("event_type")

        fun properties(): Optional<Properties> =
            Optional.ofNullable(properties.getNullable("properties"))

        /** RFC 3339 formatted. If not provided, the current time will be used. */
        fun timestamp(): Optional<String> = Optional.ofNullable(timestamp.getNullable("timestamp"))

        /**
         * Optional unique identifier for event deduplication. When provided, preview events are
         * automatically deduplicated against historical events from the past 34 days. Duplicate
         * transaction IDs within the same request will return an error.
         */
        fun transactionId(): Optional<String> =
            Optional.ofNullable(transactionId.getNullable("transaction_id"))

        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

        @JsonProperty("properties")
        @ExcludeMissing
        fun _properties(): JsonField<Properties> = properties

        /** RFC 3339 formatted. If not provided, the current time will be used. */
        @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<String> = timestamp

        /**
         * Optional unique identifier for event deduplication. When provided, preview events are
         * automatically deduplicated against historical events from the past 34 days. Duplicate
         * transaction IDs within the same request will return an error.
         */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Event = apply {
            if (validated) {
                return@apply
            }

            eventType()
            properties().ifPresent { it.validate() }
            timestamp()
            transactionId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Event]. */
        class Builder internal constructor() {

            private var eventType: JsonField<String>? = null
            private var properties: JsonField<Properties> = JsonMissing.of()
            private var timestamp: JsonField<String> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(event: Event) = apply {
                eventType = event.eventType
                properties = event.properties
                timestamp = event.timestamp
                transactionId = event.transactionId
                additionalProperties = event.additionalProperties.toMutableMap()
            }

            fun eventType(eventType: String) = eventType(JsonField.of(eventType))

            fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

            fun properties(properties: Properties) = properties(JsonField.of(properties))

            fun properties(properties: JsonField<Properties>) = apply {
                this.properties = properties
            }

            /** RFC 3339 formatted. If not provided, the current time will be used. */
            fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

            /** RFC 3339 formatted. If not provided, the current time will be used. */
            fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

            /**
             * Optional unique identifier for event deduplication. When provided, preview events are
             * automatically deduplicated against historical events from the past 34 days. Duplicate
             * transaction IDs within the same request will return an error.
             */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /**
             * Optional unique identifier for event deduplication. When provided, preview events are
             * automatically deduplicated against historical events from the past 34 days. Duplicate
             * transaction IDs within the same request will return an error.
             */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): Event =
                Event(
                    checkRequired("eventType", eventType),
                    properties,
                    timestamp,
                    transactionId,
                    additionalProperties.toImmutable(),
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

            return /* spotless:off */ other is Event && eventType == other.eventType && properties == other.properties && timestamp == other.timestamp && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventType, properties, timestamp, transactionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Event{eventType=$eventType, properties=$properties, timestamp=$timestamp, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    /**
     * Controls how the provided events are combined with existing usage data. Use `replace` to
     * calculate the preview as if these are the only events for the customer, ignoring all
     * historical usage. Use `merge` to combine these events with the customer's existing usage.
     * Defaults to `replace`.
     */
    class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val REPLACE = of("replace")

            @JvmField val MERGE = of("merge")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            REPLACE,
            MERGE,
        }

        /**
         * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REPLACE,
            MERGE,
            /** An enum member indicating that [Mode] was instantiated with an unknown value. */
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
                REPLACE -> Value.REPLACE
                MERGE -> Value.MERGE
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
                REPLACE -> Known.REPLACE
                MERGE -> Known.MERGE
                else -> throw MetronomeInvalidDataException("Unknown Mode: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Mode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1CustomerPreviewEventsParams && customerId == other.customerId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V1CustomerPreviewEventsParams{customerId=$customerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
