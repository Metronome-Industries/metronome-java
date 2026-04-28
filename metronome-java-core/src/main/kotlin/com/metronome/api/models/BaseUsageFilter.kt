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
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BaseUsageFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val groupKey: JsonField<String>,
    private val groupValues: JsonField<List<String>>,
    private val startingAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("group_key") @ExcludeMissing groupKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("group_values")
        @ExcludeMissing
        groupValues: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(groupKey, groupValues, startingAt, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun groupKey(): String = groupKey.getRequired("group_key")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun groupValues(): List<String> = groupValues.getRequired("group_values")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startingAt(): Optional<OffsetDateTime> = startingAt.getOptional("starting_at")

    /**
     * Returns the raw JSON value of [groupKey].
     *
     * Unlike [groupKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_key") @ExcludeMissing fun _groupKey(): JsonField<String> = groupKey

    /**
     * Returns the raw JSON value of [groupValues].
     *
     * Unlike [groupValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_values")
    @ExcludeMissing
    fun _groupValues(): JsonField<List<String>> = groupValues

    /**
     * Returns the raw JSON value of [startingAt].
     *
     * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starting_at")
    @ExcludeMissing
    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

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
         * Returns a mutable builder for constructing an instance of [BaseUsageFilter].
         *
         * The following fields are required:
         * ```java
         * .groupKey()
         * .groupValues()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BaseUsageFilter]. */
    class Builder internal constructor() {

        private var groupKey: JsonField<String>? = null
        private var groupValues: JsonField<MutableList<String>>? = null
        private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(baseUsageFilter: BaseUsageFilter) = apply {
            groupKey = baseUsageFilter.groupKey
            groupValues = baseUsageFilter.groupValues.map { it.toMutableList() }
            startingAt = baseUsageFilter.startingAt
            additionalProperties = baseUsageFilter.additionalProperties.toMutableMap()
        }

        fun groupKey(groupKey: String) = groupKey(JsonField.of(groupKey))

        /**
         * Sets [Builder.groupKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupKey(groupKey: JsonField<String>) = apply { this.groupKey = groupKey }

        fun groupValues(groupValues: List<String>) = groupValues(JsonField.of(groupValues))

        /**
         * Sets [Builder.groupValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupValues] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun groupValues(groupValues: JsonField<List<String>>) = apply {
            this.groupValues = groupValues.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [groupValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroupValue(groupValue: String) = apply {
            groupValues =
                (groupValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("groupValues", it).add(groupValue)
                }
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
         * Returns an immutable instance of [BaseUsageFilter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .groupKey()
         * .groupValues()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BaseUsageFilter =
            BaseUsageFilter(
                checkRequired("groupKey", groupKey),
                checkRequired("groupValues", groupValues).map { it.toImmutable() },
                startingAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BaseUsageFilter = apply {
        if (validated) {
            return@apply
        }

        groupKey()
        groupValues()
        startingAt()
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
        (if (groupKey.asKnown().isPresent) 1 else 0) +
            (groupValues.asKnown().getOrNull()?.size ?: 0) +
            (if (startingAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BaseUsageFilter &&
            groupKey == other.groupKey &&
            groupValues == other.groupValues &&
            startingAt == other.startingAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(groupKey, groupValues, startingAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BaseUsageFilter{groupKey=$groupKey, groupValues=$groupValues, startingAt=$startingAt, additionalProperties=$additionalProperties}"
}
