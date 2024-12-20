// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PropertyFilter.Builder::class)
@NoAutoDetect
class PropertyFilter
private constructor(
    private val name: JsonField<String>,
    private val exists: JsonField<Boolean>,
    private val inValues: JsonField<List<String>>,
    private val notInValues: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    /** The name of the event property. */
    fun name(): String = name.getRequired("name")

    /**
     * Determines whether the property must exist in the event. If true, only events with this
     * property will pass the filter. If false, only events without this property will pass the
     * filter. If null or omitted, the existence of the property is optional.
     */
    fun exists(): Optional<Boolean> = Optional.ofNullable(exists.getNullable("exists"))

    /**
     * Specifies the allowed values for the property to match an event. An event will pass the
     * filter only if its property value is included in this list. If undefined, all property values
     * will pass the filter. Must be non-empty if present.
     */
    fun inValues(): Optional<List<String>> = Optional.ofNullable(inValues.getNullable("in_values"))

    /**
     * Specifies the values that prevent an event from matching the filter. An event will not pass
     * the filter if its property value is included in this list. If null or empty, all property
     * values will pass the filter. Must be non-empty if present.
     */
    fun notInValues(): Optional<List<String>> =
        Optional.ofNullable(notInValues.getNullable("not_in_values"))

    /** The name of the event property. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /**
     * Determines whether the property must exist in the event. If true, only events with this
     * property will pass the filter. If false, only events without this property will pass the
     * filter. If null or omitted, the existence of the property is optional.
     */
    @JsonProperty("exists") @ExcludeMissing fun _exists() = exists

    /**
     * Specifies the allowed values for the property to match an event. An event will pass the
     * filter only if its property value is included in this list. If undefined, all property values
     * will pass the filter. Must be non-empty if present.
     */
    @JsonProperty("in_values") @ExcludeMissing fun _inValues() = inValues

    /**
     * Specifies the values that prevent an event from matching the filter. An event will not pass
     * the filter if its property value is included in this list. If null or empty, all property
     * values will pass the filter. Must be non-empty if present.
     */
    @JsonProperty("not_in_values") @ExcludeMissing fun _notInValues() = notInValues

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PropertyFilter = apply {
        if (!validated) {
            name()
            exists()
            inValues()
            notInValues()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var exists: JsonField<Boolean> = JsonMissing.of()
        private var inValues: JsonField<List<String>> = JsonMissing.of()
        private var notInValues: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(propertyFilter: PropertyFilter) = apply {
            name = propertyFilter.name
            exists = propertyFilter.exists
            inValues = propertyFilter.inValues
            notInValues = propertyFilter.notInValues
            additionalProperties = propertyFilter.additionalProperties.toMutableMap()
        }

        /** The name of the event property. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the event property. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Determines whether the property must exist in the event. If true, only events with this
         * property will pass the filter. If false, only events without this property will pass the
         * filter. If null or omitted, the existence of the property is optional.
         */
        fun exists(exists: Boolean) = exists(JsonField.of(exists))

        /**
         * Determines whether the property must exist in the event. If true, only events with this
         * property will pass the filter. If false, only events without this property will pass the
         * filter. If null or omitted, the existence of the property is optional.
         */
        @JsonProperty("exists")
        @ExcludeMissing
        fun exists(exists: JsonField<Boolean>) = apply { this.exists = exists }

        /**
         * Specifies the allowed values for the property to match an event. An event will pass the
         * filter only if its property value is included in this list. If undefined, all property
         * values will pass the filter. Must be non-empty if present.
         */
        fun inValues(inValues: List<String>) = inValues(JsonField.of(inValues))

        /**
         * Specifies the allowed values for the property to match an event. An event will pass the
         * filter only if its property value is included in this list. If undefined, all property
         * values will pass the filter. Must be non-empty if present.
         */
        @JsonProperty("in_values")
        @ExcludeMissing
        fun inValues(inValues: JsonField<List<String>>) = apply { this.inValues = inValues }

        /**
         * Specifies the values that prevent an event from matching the filter. An event will not
         * pass the filter if its property value is included in this list. If null or empty, all
         * property values will pass the filter. Must be non-empty if present.
         */
        fun notInValues(notInValues: List<String>) = notInValues(JsonField.of(notInValues))

        /**
         * Specifies the values that prevent an event from matching the filter. An event will not
         * pass the filter if its property value is included in this list. If null or empty, all
         * property values will pass the filter. Must be non-empty if present.
         */
        @JsonProperty("not_in_values")
        @ExcludeMissing
        fun notInValues(notInValues: JsonField<List<String>>) = apply {
            this.notInValues = notInValues
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): PropertyFilter =
            PropertyFilter(
                name,
                exists,
                inValues.map { it.toImmutable() },
                notInValues.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PropertyFilter && name == other.name && exists == other.exists && inValues == other.inValues && notInValues == other.notInValues && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(name, exists, inValues, notInValues, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PropertyFilter{name=$name, exists=$exists, inValues=$inValues, notInValues=$notInValues, additionalProperties=$additionalProperties}"
}
