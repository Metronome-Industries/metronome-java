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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UsageListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val billableMetricId: JsonField<String>,
    private val billableMetricName: JsonField<String>,
    private val customerId: JsonField<String>,
    private val endTimestamp: JsonField<OffsetDateTime>,
    private val startTimestamp: JsonField<OffsetDateTime>,
    private val value: JsonField<Double>,
    private val groups: JsonField<Groups>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        billableMetricId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billable_metric_name")
        @ExcludeMissing
        billableMetricName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_timestamp")
        @ExcludeMissing
        endTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("start_timestamp")
        @ExcludeMissing
        startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("groups") @ExcludeMissing groups: JsonField<Groups> = JsonMissing.of(),
    ) : this(
        billableMetricId,
        billableMetricName,
        customerId,
        endTimestamp,
        startTimestamp,
        value,
        groups,
        mutableMapOf(),
    )

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billableMetricId(): String = billableMetricId.getRequired("billable_metric_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billableMetricName(): String = billableMetricName.getRequired("billable_metric_name")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customer_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endTimestamp(): OffsetDateTime = endTimestamp.getRequired("end_timestamp")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTimestamp(): OffsetDateTime = startTimestamp.getRequired("start_timestamp")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<Double> = value.getOptional("value")

    /**
     * Values will be either a number or null. Null indicates that there were no matches for the
     * group_by value.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groups(): Optional<Groups> = groups.getOptional("groups")

    /**
     * Returns the raw JSON value of [billableMetricId].
     *
     * Unlike [billableMetricId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("billable_metric_id")
    @ExcludeMissing
    fun _billableMetricId(): JsonField<String> = billableMetricId

    /**
     * Returns the raw JSON value of [billableMetricName].
     *
     * Unlike [billableMetricName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("billable_metric_name")
    @ExcludeMissing
    fun _billableMetricName(): JsonField<String> = billableMetricName

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [endTimestamp].
     *
     * Unlike [endTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_timestamp")
    @ExcludeMissing
    fun _endTimestamp(): JsonField<OffsetDateTime> = endTimestamp

    /**
     * Returns the raw JSON value of [startTimestamp].
     *
     * Unlike [startTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_timestamp")
    @ExcludeMissing
    fun _startTimestamp(): JsonField<OffsetDateTime> = startTimestamp

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

    /**
     * Returns the raw JSON value of [groups].
     *
     * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groups") @ExcludeMissing fun _groups(): JsonField<Groups> = groups

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
         * Returns a mutable builder for constructing an instance of [UsageListResponse].
         *
         * The following fields are required:
         * ```java
         * .billableMetricId()
         * .billableMetricName()
         * .customerId()
         * .endTimestamp()
         * .startTimestamp()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageListResponse]. */
    class Builder internal constructor() {

        private var billableMetricId: JsonField<String>? = null
        private var billableMetricName: JsonField<String>? = null
        private var customerId: JsonField<String>? = null
        private var endTimestamp: JsonField<OffsetDateTime>? = null
        private var startTimestamp: JsonField<OffsetDateTime>? = null
        private var value: JsonField<Double>? = null
        private var groups: JsonField<Groups> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageListResponse: UsageListResponse) = apply {
            billableMetricId = usageListResponse.billableMetricId
            billableMetricName = usageListResponse.billableMetricName
            customerId = usageListResponse.customerId
            endTimestamp = usageListResponse.endTimestamp
            startTimestamp = usageListResponse.startTimestamp
            value = usageListResponse.value
            groups = usageListResponse.groups
            additionalProperties = usageListResponse.additionalProperties.toMutableMap()
        }

        fun billableMetricId(billableMetricId: String) =
            billableMetricId(JsonField.of(billableMetricId))

        /**
         * Sets [Builder.billableMetricId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billableMetricId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billableMetricId(billableMetricId: JsonField<String>) = apply {
            this.billableMetricId = billableMetricId
        }

        fun billableMetricName(billableMetricName: String) =
            billableMetricName(JsonField.of(billableMetricName))

        /**
         * Sets [Builder.billableMetricName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billableMetricName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billableMetricName(billableMetricName: JsonField<String>) = apply {
            this.billableMetricName = billableMetricName
        }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun endTimestamp(endTimestamp: OffsetDateTime) = endTimestamp(JsonField.of(endTimestamp))

        /**
         * Sets [Builder.endTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTimestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTimestamp(endTimestamp: JsonField<OffsetDateTime>) = apply {
            this.endTimestamp = endTimestamp
        }

        fun startTimestamp(startTimestamp: OffsetDateTime) =
            startTimestamp(JsonField.of(startTimestamp))

        /**
         * Sets [Builder.startTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTimestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTimestamp(startTimestamp: JsonField<OffsetDateTime>) = apply {
            this.startTimestamp = startTimestamp
        }

        fun value(value: Double?) = value(JsonField.ofNullable(value))

        /**
         * Alias for [Builder.value].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun value(value: Double) = value(value as Double?)

        /** Alias for calling [Builder.value] with `value.orElse(null)`. */
        fun value(value: Optional<Double>) = value(value.getOrNull())

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Double>) = apply { this.value = value }

        /**
         * Values will be either a number or null. Null indicates that there were no matches for the
         * group_by value.
         */
        fun groups(groups: Groups) = groups(JsonField.of(groups))

        /**
         * Sets [Builder.groups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groups] with a well-typed [Groups] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groups(groups: JsonField<Groups>) = apply { this.groups = groups }

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
         * Returns an immutable instance of [UsageListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .billableMetricId()
         * .billableMetricName()
         * .customerId()
         * .endTimestamp()
         * .startTimestamp()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageListResponse =
            UsageListResponse(
                checkRequired("billableMetricId", billableMetricId),
                checkRequired("billableMetricName", billableMetricName),
                checkRequired("customerId", customerId),
                checkRequired("endTimestamp", endTimestamp),
                checkRequired("startTimestamp", startTimestamp),
                checkRequired("value", value),
                groups,
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
    fun validate(): UsageListResponse = apply {
        if (validated) {
            return@apply
        }

        billableMetricId()
        billableMetricName()
        customerId()
        endTimestamp()
        startTimestamp()
        value()
        groups().ifPresent { it.validate() }
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
        (if (billableMetricId.asKnown().isPresent) 1 else 0) +
            (if (billableMetricName.asKnown().isPresent) 1 else 0) +
            (if (customerId.asKnown().isPresent) 1 else 0) +
            (if (endTimestamp.asKnown().isPresent) 1 else 0) +
            (if (startTimestamp.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0) +
            (groups.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Values will be either a number or null. Null indicates that there were no matches for the
     * group_by value.
     */
    class Groups
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

            /** Returns a mutable builder for constructing an instance of [Groups]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Groups]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(groups: Groups) = apply {
                additionalProperties = groups.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Groups].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Groups = Groups(additionalProperties.toImmutable())
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
        fun validate(): Groups = apply {
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

            return other is Groups && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Groups{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageListResponse &&
            billableMetricId == other.billableMetricId &&
            billableMetricName == other.billableMetricName &&
            customerId == other.customerId &&
            endTimestamp == other.endTimestamp &&
            startTimestamp == other.startTimestamp &&
            value == other.value &&
            groups == other.groups &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            billableMetricId,
            billableMetricName,
            customerId,
            endTimestamp,
            startTimestamp,
            value,
            groups,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageListResponse{billableMetricId=$billableMetricId, billableMetricName=$billableMetricName, customerId=$customerId, endTimestamp=$endTimestamp, startTimestamp=$startTimestamp, value=$value, groups=$groups, additionalProperties=$additionalProperties}"
}
