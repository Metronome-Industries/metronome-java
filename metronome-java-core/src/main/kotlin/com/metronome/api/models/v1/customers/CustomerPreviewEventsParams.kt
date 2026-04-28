// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Preview how a set of events will affect a customer's invoices. Generates draft invoices for a
 * customer using their current contract configuration and the provided events. This is useful for
 * testing how new events will affect the customer's invoices before they are actually processed.
 * Customers on contracts with SQL billable metrics are not supported.
 */
class CustomerPreviewEventsParams
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
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<Event> = body.events()

    /**
     * Controls how the provided events are combined with existing usage data. Use `replace` to
     * calculate the preview as if these are the only events for the customer, ignoring all
     * historical usage. Use `merge` to combine these events with the customer's existing usage.
     * Defaults to `replace`.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mode(): Optional<Mode> = body.mode()

    /**
     * When `true`, line items with zero quantity are excluded from the response.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun skipZeroQtyLineItems(): Optional<Boolean> = body.skipZeroQtyLineItems()

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _events(): JsonField<List<Event>> = body._events()

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mode(): JsonField<Mode> = body._mode()

    /**
     * Returns the raw JSON value of [skipZeroQtyLineItems].
     *
     * Unlike [skipZeroQtyLineItems], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _skipZeroQtyLineItems(): JsonField<Boolean> = body._skipZeroQtyLineItems()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerPreviewEventsParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .events()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerPreviewEventsParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerPreviewEventsParams: CustomerPreviewEventsParams) = apply {
            customerId = customerPreviewEventsParams.customerId
            body = customerPreviewEventsParams.body.toBuilder()
            additionalHeaders = customerPreviewEventsParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerPreviewEventsParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [events]
         * - [mode]
         * - [skipZeroQtyLineItems]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Array of usage events to include in the preview calculation. Must contain at least one
         * event in `merge` mode.
         */
        fun events(events: List<Event>) = apply { body.events(events) }

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<Event>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun events(events: JsonField<List<Event>>) = apply { body.events(events) }

        /**
         * Adds a single [Event] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<Mode>) = apply { body.mode(mode) }

        /** When `true`, line items with zero quantity are excluded from the response. */
        fun skipZeroQtyLineItems(skipZeroQtyLineItems: Boolean) = apply {
            body.skipZeroQtyLineItems(skipZeroQtyLineItems)
        }

        /**
         * Sets [Builder.skipZeroQtyLineItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skipZeroQtyLineItems] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [CustomerPreviewEventsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .events()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerPreviewEventsParams =
            CustomerPreviewEventsParams(
                checkRequired("customerId", customerId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val events: JsonField<List<Event>>,
        private val mode: JsonField<Mode>,
        private val skipZeroQtyLineItems: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("events")
            @ExcludeMissing
            events: JsonField<List<Event>> = JsonMissing.of(),
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
            @JsonProperty("skip_zero_qty_line_items")
            @ExcludeMissing
            skipZeroQtyLineItems: JsonField<Boolean> = JsonMissing.of(),
        ) : this(events, mode, skipZeroQtyLineItems, mutableMapOf())

        /**
         * Array of usage events to include in the preview calculation. Must contain at least one
         * event in `merge` mode.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun events(): List<Event> = events.getRequired("events")

        /**
         * Controls how the provided events are combined with existing usage data. Use `replace` to
         * calculate the preview as if these are the only events for the customer, ignoring all
         * historical usage. Use `merge` to combine these events with the customer's existing usage.
         * Defaults to `replace`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mode(): Optional<Mode> = mode.getOptional("mode")

        /**
         * When `true`, line items with zero quantity are excluded from the response.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun skipZeroQtyLineItems(): Optional<Boolean> =
            skipZeroQtyLineItems.getOptional("skip_zero_qty_line_items")

        /**
         * Returns the raw JSON value of [events].
         *
         * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<Event>> = events

        /**
         * Returns the raw JSON value of [mode].
         *
         * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

        /**
         * Returns the raw JSON value of [skipZeroQtyLineItems].
         *
         * Unlike [skipZeroQtyLineItems], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("skip_zero_qty_line_items")
        @ExcludeMissing
        fun _skipZeroQtyLineItems(): JsonField<Boolean> = skipZeroQtyLineItems

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
             * .events()
             * ```
             */
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
             * Sets [Builder.events] to an arbitrary JSON value.
             *
             * You should usually call [Builder.events] with a well-typed `List<Event>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun events(events: JsonField<List<Event>>) = apply {
                this.events = events.map { it.toMutableList() }
            }

            /**
             * Adds a single [Event] to [events].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEvent(event: Event) = apply {
                events =
                    (events ?: JsonField.of(mutableListOf())).also {
                        checkKnown("events", it).add(event)
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
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

            /** When `true`, line items with zero quantity are excluded from the response. */
            fun skipZeroQtyLineItems(skipZeroQtyLineItems: Boolean) =
                skipZeroQtyLineItems(JsonField.of(skipZeroQtyLineItems))

            /**
             * Sets [Builder.skipZeroQtyLineItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipZeroQtyLineItems] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .events()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("events", events).map { it.toImmutable() },
                    mode,
                    skipZeroQtyLineItems,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            events().forEach { it.validate() }
            mode().ifPresent { it.validate() }
            skipZeroQtyLineItems()
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
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (mode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (skipZeroQtyLineItems.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                events == other.events &&
                mode == other.mode &&
                skipZeroQtyLineItems == other.skipZeroQtyLineItems &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(events, mode, skipZeroQtyLineItems, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{events=$events, mode=$mode, skipZeroQtyLineItems=$skipZeroQtyLineItems, additionalProperties=$additionalProperties}"
    }

    class Event
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val eventType: JsonField<String>,
        private val properties: JsonField<Properties>,
        private val timestamp: JsonField<String>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("event_type")
            @ExcludeMissing
            eventType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("properties")
            @ExcludeMissing
            properties: JsonField<Properties> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transaction_id")
            @ExcludeMissing
            transactionId: JsonField<String> = JsonMissing.of(),
        ) : this(eventType, properties, timestamp, transactionId, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventType(): String = eventType.getRequired("event_type")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun properties(): Optional<Properties> = properties.getOptional("properties")

        /**
         * RFC 3339 formatted. If not provided, the current time will be used.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun timestamp(): Optional<String> = timestamp.getOptional("timestamp")

        /**
         * Optional unique identifier for event deduplication. When provided, preview events are
         * automatically deduplicated against historical events from the past 34 days. Duplicate
         * transaction IDs within the same request will return an error.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transactionId(): Optional<String> = transactionId.getOptional("transaction_id")

        /**
         * Returns the raw JSON value of [eventType].
         *
         * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

        /**
         * Returns the raw JSON value of [properties].
         *
         * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("properties")
        @ExcludeMissing
        fun _properties(): JsonField<Properties> = properties

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
             * Returns a mutable builder for constructing an instance of [Event].
             *
             * The following fields are required:
             * ```java
             * .eventType()
             * ```
             */
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

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

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

            /** RFC 3339 formatted. If not provided, the current time will be used. */
            fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

            /**
             * Optional unique identifier for event deduplication. When provided, preview events are
             * automatically deduplicated against historical events from the past 34 days. Duplicate
             * transaction IDs within the same request will return an error.
             */
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
             * Returns an immutable instance of [Event].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .eventType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Event =
                Event(
                    checkRequired("eventType", eventType),
                    properties,
                    timestamp,
                    transactionId,
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (eventType.asKnown().isPresent) 1 else 0) +
                (properties.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0) +
                (if (transactionId.asKnown().isPresent) 1 else 0)

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

            return other is Event &&
                eventType == other.eventType &&
                properties == other.properties &&
                timestamp == other.timestamp &&
                transactionId == other.transactionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(eventType, properties, timestamp, transactionId, additionalProperties)
        }

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

        private var validated: Boolean = false

        fun validate(): Mode = apply {
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

            return other is Mode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerPreviewEventsParams &&
            customerId == other.customerId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(customerId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomerPreviewEventsParams{customerId=$customerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
