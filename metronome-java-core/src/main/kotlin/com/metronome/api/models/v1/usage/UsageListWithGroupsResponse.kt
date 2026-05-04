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

class UsageListWithGroupsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val endingBefore: JsonField<OffsetDateTime>,
    private val groupKey: JsonField<String>,
    private val groupValue: JsonField<String>,
    private val startingOn: JsonField<OffsetDateTime>,
    private val value: JsonField<Double>,
    private val group: JsonField<Group>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ending_before")
        @ExcludeMissing
        endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("group_key") @ExcludeMissing groupKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("group_value")
        @ExcludeMissing
        groupValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_on")
        @ExcludeMissing
        startingOn: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("group") @ExcludeMissing group: JsonField<Group> = JsonMissing.of(),
    ) : this(endingBefore, groupKey, groupValue, startingOn, value, group, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

    /**
     * Use `group` instead. The group key for single-key grouping.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun groupKey(): Optional<String> = groupKey.getOptional("group_key")

    /**
     * Use `group` instead. The group value for single-key grouping.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun groupValue(): Optional<String> = groupValue.getOptional("group_value")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingOn(): OffsetDateTime = startingOn.getRequired("starting_on")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<Double> = value.getOptional("value")

    /**
     * Map of group key to their value for this usage aggregate. For simple group keys, this should
     * be a single key e.g. `{"region": "US-East"}` For compound group keys, this should contain the
     * values of each group key that forms the compound e.g. `{"region": "US-East", "team":
     * "engineering"}`
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun group(): Optional<Group> = group.getOptional("group")

    /**
     * Returns the raw JSON value of [endingBefore].
     *
     * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ending_before")
    @ExcludeMissing
    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

    /**
     * Returns the raw JSON value of [groupKey].
     *
     * Unlike [groupKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("group_key")
    @ExcludeMissing
    fun _groupKey(): JsonField<String> = groupKey

    /**
     * Returns the raw JSON value of [groupValue].
     *
     * Unlike [groupValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("group_value")
    @ExcludeMissing
    fun _groupValue(): JsonField<String> = groupValue

    /**
     * Returns the raw JSON value of [startingOn].
     *
     * Unlike [startingOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starting_on")
    @ExcludeMissing
    fun _startingOn(): JsonField<OffsetDateTime> = startingOn

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

    /**
     * Returns the raw JSON value of [group].
     *
     * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<Group> = group

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
         * Returns a mutable builder for constructing an instance of [UsageListWithGroupsResponse].
         *
         * The following fields are required:
         * ```java
         * .endingBefore()
         * .groupKey()
         * .groupValue()
         * .startingOn()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageListWithGroupsResponse]. */
    class Builder internal constructor() {

        private var endingBefore: JsonField<OffsetDateTime>? = null
        private var groupKey: JsonField<String>? = null
        private var groupValue: JsonField<String>? = null
        private var startingOn: JsonField<OffsetDateTime>? = null
        private var value: JsonField<Double>? = null
        private var group: JsonField<Group> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageListWithGroupsResponse: UsageListWithGroupsResponse) = apply {
            endingBefore = usageListWithGroupsResponse.endingBefore
            groupKey = usageListWithGroupsResponse.groupKey
            groupValue = usageListWithGroupsResponse.groupValue
            startingOn = usageListWithGroupsResponse.startingOn
            value = usageListWithGroupsResponse.value
            group = usageListWithGroupsResponse.group
            additionalProperties = usageListWithGroupsResponse.additionalProperties.toMutableMap()
        }

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        /**
         * Sets [Builder.endingBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
        }

        /** Use `group` instead. The group key for single-key grouping. */
        @Deprecated("deprecated")
        fun groupKey(groupKey: String?) = groupKey(JsonField.ofNullable(groupKey))

        /** Alias for calling [Builder.groupKey] with `groupKey.orElse(null)`. */
        @Deprecated("deprecated")
        fun groupKey(groupKey: Optional<String>) = groupKey(groupKey.getOrNull())

        /**
         * Sets [Builder.groupKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun groupKey(groupKey: JsonField<String>) = apply { this.groupKey = groupKey }

        /** Use `group` instead. The group value for single-key grouping. */
        @Deprecated("deprecated")
        fun groupValue(groupValue: String?) = groupValue(JsonField.ofNullable(groupValue))

        /** Alias for calling [Builder.groupValue] with `groupValue.orElse(null)`. */
        @Deprecated("deprecated")
        fun groupValue(groupValue: Optional<String>) = groupValue(groupValue.getOrNull())

        /**
         * Sets [Builder.groupValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun groupValue(groupValue: JsonField<String>) = apply { this.groupValue = groupValue }

        fun startingOn(startingOn: OffsetDateTime) = startingOn(JsonField.of(startingOn))

        /**
         * Sets [Builder.startingOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingOn] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
            this.startingOn = startingOn
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
         * Map of group key to their value for this usage aggregate. For simple group keys, this
         * should be a single key e.g. `{"region": "US-East"}` For compound group keys, this should
         * contain the values of each group key that forms the compound e.g. `{"region": "US-East",
         * "team": "engineering"}`
         */
        fun group(group: Group) = group(JsonField.of(group))

        /**
         * Sets [Builder.group] to an arbitrary JSON value.
         *
         * You should usually call [Builder.group] with a well-typed [Group] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun group(group: JsonField<Group>) = apply { this.group = group }

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
         * Returns an immutable instance of [UsageListWithGroupsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endingBefore()
         * .groupKey()
         * .groupValue()
         * .startingOn()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageListWithGroupsResponse =
            UsageListWithGroupsResponse(
                checkRequired("endingBefore", endingBefore),
                checkRequired("groupKey", groupKey),
                checkRequired("groupValue", groupValue),
                checkRequired("startingOn", startingOn),
                checkRequired("value", value),
                group,
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
    fun validate(): UsageListWithGroupsResponse = apply {
        if (validated) {
            return@apply
        }

        endingBefore()
        groupKey()
        groupValue()
        startingOn()
        value()
        group().ifPresent { it.validate() }
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
        (if (endingBefore.asKnown().isPresent) 1 else 0) +
            (if (groupKey.asKnown().isPresent) 1 else 0) +
            (if (groupValue.asKnown().isPresent) 1 else 0) +
            (if (startingOn.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0) +
            (group.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Map of group key to their value for this usage aggregate. For simple group keys, this should
     * be a single key e.g. `{"region": "US-East"}` For compound group keys, this should contain the
     * values of each group key that forms the compound e.g. `{"region": "US-East", "team":
     * "engineering"}`
     */
    class Group
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

            /** Returns a mutable builder for constructing an instance of [Group]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Group]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(group: Group) = apply {
                additionalProperties = group.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Group].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Group = Group(additionalProperties.toImmutable())
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
        fun validate(): Group = apply {
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

            return other is Group && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Group{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageListWithGroupsResponse &&
            endingBefore == other.endingBefore &&
            groupKey == other.groupKey &&
            groupValue == other.groupValue &&
            startingOn == other.startingOn &&
            value == other.value &&
            group == other.group &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            endingBefore,
            groupKey,
            groupValue,
            startingOn,
            value,
            group,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageListWithGroupsResponse{endingBefore=$endingBefore, groupKey=$groupKey, groupValue=$groupValue, startingOn=$startingOn, value=$value, group=$group, additionalProperties=$additionalProperties}"
}
