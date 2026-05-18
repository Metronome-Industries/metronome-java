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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PropertyFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val exists: JsonField<Boolean>,
    private val inValues: JsonField<List<String>>,
    private val notInValues: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exists") @ExcludeMissing exists: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("in_values")
        @ExcludeMissing
        inValues: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("not_in_values")
        @ExcludeMissing
        notInValues: JsonField<List<String>> = JsonMissing.of(),
    ) : this(name, exists, inValues, notInValues, mutableMapOf())

    /**
     * The name of the event property.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Determines whether the property must exist in the event. If true, only events with this
     * property will pass the filter. If false, only events without this property will pass the
     * filter. If null or omitted, the existence of the property is optional.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exists(): Optional<Boolean> = exists.getOptional("exists")

    /**
     * Specifies the allowed values for the property to match an event. An event will pass the
     * filter only if its property value is included in this list. If undefined, all property values
     * will pass the filter. Must be non-empty if present.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inValues(): Optional<List<String>> = inValues.getOptional("in_values")

    /**
     * Specifies the values that prevent an event from matching the filter. An event will not pass
     * the filter if its property value is included in this list. If null or empty, all property
     * values will pass the filter. Must be non-empty if present.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notInValues(): Optional<List<String>> = notInValues.getOptional("not_in_values")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [exists].
     *
     * Unlike [exists], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exists") @ExcludeMissing fun _exists(): JsonField<Boolean> = exists

    /**
     * Returns the raw JSON value of [inValues].
     *
     * Unlike [inValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("in_values") @ExcludeMissing fun _inValues(): JsonField<List<String>> = inValues

    /**
     * Returns the raw JSON value of [notInValues].
     *
     * Unlike [notInValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("not_in_values")
    @ExcludeMissing
    fun _notInValues(): JsonField<List<String>> = notInValues

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
         * Returns a mutable builder for constructing an instance of [PropertyFilter].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PropertyFilter]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var exists: JsonField<Boolean> = JsonMissing.of()
        private var inValues: JsonField<MutableList<String>>? = null
        private var notInValues: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(propertyFilter: PropertyFilter) = apply {
            name = propertyFilter.name
            exists = propertyFilter.exists
            inValues = propertyFilter.inValues.map { it.toMutableList() }
            notInValues = propertyFilter.notInValues.map { it.toMutableList() }
            additionalProperties = propertyFilter.additionalProperties.toMutableMap()
        }

        /** The name of the event property. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Determines whether the property must exist in the event. If true, only events with this
         * property will pass the filter. If false, only events without this property will pass the
         * filter. If null or omitted, the existence of the property is optional.
         */
        fun exists(exists: Boolean) = exists(JsonField.of(exists))

        /**
         * Sets [Builder.exists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exists] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun exists(exists: JsonField<Boolean>) = apply { this.exists = exists }

        /**
         * Specifies the allowed values for the property to match an event. An event will pass the
         * filter only if its property value is included in this list. If undefined, all property
         * values will pass the filter. Must be non-empty if present.
         */
        fun inValues(inValues: List<String>) = inValues(JsonField.of(inValues))

        /**
         * Sets [Builder.inValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inValues] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inValues(inValues: JsonField<List<String>>) = apply {
            this.inValues = inValues.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [inValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInValue(inValue: String) = apply {
            inValues =
                (inValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inValues", it).add(inValue)
                }
        }

        /**
         * Specifies the values that prevent an event from matching the filter. An event will not
         * pass the filter if its property value is included in this list. If null or empty, all
         * property values will pass the filter. Must be non-empty if present.
         */
        fun notInValues(notInValues: List<String>) = notInValues(JsonField.of(notInValues))

        /**
         * Sets [Builder.notInValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notInValues] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notInValues(notInValues: JsonField<List<String>>) = apply {
            this.notInValues = notInValues.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [notInValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNotInValue(notInValue: String) = apply {
            notInValues =
                (notInValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("notInValues", it).add(notInValue)
                }
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
         * Returns an immutable instance of [PropertyFilter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PropertyFilter =
            PropertyFilter(
                checkRequired("name", name),
                exists,
                (inValues ?: JsonMissing.of()).map { it.toImmutable() },
                (notInValues ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): PropertyFilter = apply {
        if (validated) {
            return@apply
        }

        name()
        exists()
        inValues()
        notInValues()
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (exists.asKnown().isPresent) 1 else 0) +
            (inValues.asKnown().getOrNull()?.size ?: 0) +
            (notInValues.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PropertyFilter &&
            name == other.name &&
            exists == other.exists &&
            inValues == other.inValues &&
            notInValues == other.notInValues &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(name, exists, inValues, notInValues, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PropertyFilter{name=$name, exists=$exists, inValues=$inValues, notInValues=$notInValues, additionalProperties=$additionalProperties}"
}
