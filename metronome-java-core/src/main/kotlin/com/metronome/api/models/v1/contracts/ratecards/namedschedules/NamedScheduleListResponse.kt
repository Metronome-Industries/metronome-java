// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards.namedschedules

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NamedScheduleListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contractId: JsonField<String>,
    private val scheduleName: JsonField<String>,
    private val segments: JsonField<List<Segment>>,
    private val properties: JsonField<Properties>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contract_id")
        @ExcludeMissing
        contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("schedule_name")
        @ExcludeMissing
        scheduleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("segments")
        @ExcludeMissing
        segments: JsonField<List<Segment>> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<Properties> = JsonMissing.of(),
    ) : this(contractId, scheduleName, segments, properties, mutableMapOf())

    /**
     * ID of the contract this named schedule belongs to.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contractId(): String = contractId.getRequired("contract_id")

    /**
     * Name of the schedule.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scheduleName(): String = scheduleName.getRequired("schedule_name")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun segments(): List<Segment> = segments.getRequired("segments")

    /**
     * Properties on this named schedule.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun properties(): Optional<Properties> = properties.getOptional("properties")

    /**
     * Returns the raw JSON value of [contractId].
     *
     * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contract_id") @ExcludeMissing fun _contractId(): JsonField<String> = contractId

    /**
     * Returns the raw JSON value of [scheduleName].
     *
     * Unlike [scheduleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("schedule_name")
    @ExcludeMissing
    fun _scheduleName(): JsonField<String> = scheduleName

    /**
     * Returns the raw JSON value of [segments].
     *
     * Unlike [segments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segments") @ExcludeMissing fun _segments(): JsonField<List<Segment>> = segments

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
         * Returns a mutable builder for constructing an instance of [NamedScheduleListResponse].
         *
         * The following fields are required:
         * ```java
         * .contractId()
         * .scheduleName()
         * .segments()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NamedScheduleListResponse]. */
    class Builder internal constructor() {

        private var contractId: JsonField<String>? = null
        private var scheduleName: JsonField<String>? = null
        private var segments: JsonField<MutableList<Segment>>? = null
        private var properties: JsonField<Properties> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(namedScheduleListResponse: NamedScheduleListResponse) = apply {
            contractId = namedScheduleListResponse.contractId
            scheduleName = namedScheduleListResponse.scheduleName
            segments = namedScheduleListResponse.segments.map { it.toMutableList() }
            properties = namedScheduleListResponse.properties
            additionalProperties = namedScheduleListResponse.additionalProperties.toMutableMap()
        }

        /** ID of the contract this named schedule belongs to. */
        fun contractId(contractId: String) = contractId(JsonField.of(contractId))

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

        /** Name of the schedule. */
        fun scheduleName(scheduleName: String) = scheduleName(JsonField.of(scheduleName))

        /**
         * Sets [Builder.scheduleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduleName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scheduleName(scheduleName: JsonField<String>) = apply {
            this.scheduleName = scheduleName
        }

        fun segments(segments: List<Segment>) = segments(JsonField.of(segments))

        /**
         * Sets [Builder.segments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segments] with a well-typed `List<Segment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun segments(segments: JsonField<List<Segment>>) = apply {
            this.segments = segments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Segment] to [segments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSegment(segment: Segment) = apply {
            segments =
                (segments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("segments", it).add(segment)
                }
        }

        /** Properties on this named schedule. */
        fun properties(properties: Properties) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [Properties] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<Properties>) = apply { this.properties = properties }

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
         * Returns an immutable instance of [NamedScheduleListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contractId()
         * .scheduleName()
         * .segments()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NamedScheduleListResponse =
            NamedScheduleListResponse(
                checkRequired("contractId", contractId),
                checkRequired("scheduleName", scheduleName),
                checkRequired("segments", segments).map { it.toImmutable() },
                properties,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): NamedScheduleListResponse = apply {
        if (validated) {
            return@apply
        }

        contractId()
        scheduleName()
        segments().forEach { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (contractId.asKnown().isPresent) 1 else 0) +
            (if (scheduleName.asKnown().isPresent) 1 else 0) +
            (segments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0)

    class Segment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val startingAt: JsonField<OffsetDateTime>,
        private val value: JsonValue,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonValue = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(startingAt, value, endingBefore, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = segment.value().convert(MyClass.class);
         * ```
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * Returns the raw JSON value of [startingAt].
         *
         * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /**
         * Returns the raw JSON value of [endingBefore].
         *
         * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

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
             * Returns a mutable builder for constructing an instance of [Segment].
             *
             * The following fields are required:
             * ```java
             * .startingAt()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Segment]. */
        class Builder internal constructor() {

            private var startingAt: JsonField<OffsetDateTime>? = null
            private var value: JsonValue? = null
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(segment: Segment) = apply {
                startingAt = segment.startingAt
                value = segment.value
                endingBefore = segment.endingBefore
                additionalProperties = segment.additionalProperties.toMutableMap()
            }

            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /**
             * Sets [Builder.startingAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            fun value(value: JsonValue) = apply { this.value = value }

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /**
             * Sets [Builder.endingBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
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
             * Returns an immutable instance of [Segment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .startingAt()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Segment =
                Segment(
                    checkRequired("startingAt", startingAt),
                    checkRequired("value", value),
                    endingBefore,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Segment = apply {
            if (validated) {
                return@apply
            }

            startingAt()
            endingBefore()
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
            (if (startingAt.asKnown().isPresent) 1 else 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Segment &&
                startingAt == other.startingAt &&
                value == other.value &&
                endingBefore == other.endingBefore &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(startingAt, value, endingBefore, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Segment{startingAt=$startingAt, value=$value, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
    }

    /** Properties on this named schedule. */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is NamedScheduleListResponse &&
            contractId == other.contractId &&
            scheduleName == other.scheduleName &&
            segments == other.segments &&
            properties == other.properties &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(contractId, scheduleName, segments, properties, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NamedScheduleListResponse{contractId=$contractId, scheduleName=$scheduleName, segments=$segments, properties=$properties, additionalProperties=$additionalProperties}"
}
