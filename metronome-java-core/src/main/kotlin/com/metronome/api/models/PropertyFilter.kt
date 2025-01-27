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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class PropertyFilter
@JsonCreator
private constructor(
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("exists")
    @ExcludeMissing
    private val exists: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("in_values")
    @ExcludeMissing
    private val inValues: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("not_in_values")
    @ExcludeMissing
    private val notInValues: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Determines whether the property must exist in the event. If true, only events with this
     * property will pass the filter. If false, only events without this property will pass the
     * filter. If null or omitted, the existence of the property is optional.
     */
    @JsonProperty("exists") @ExcludeMissing fun _exists(): JsonField<Boolean> = exists

    /**
     * Specifies the allowed values for the property to match an event. An event will pass the
     * filter only if its property value is included in this list. If undefined, all property values
     * will pass the filter. Must be non-empty if present.
     */
    @JsonProperty("in_values") @ExcludeMissing fun _inValues(): JsonField<List<String>> = inValues

    /**
     * Specifies the values that prevent an event from matching the filter. An event will not pass
     * the filter if its property value is included in this list. If null or empty, all property
     * values will pass the filter. Must be non-empty if present.
     */
    @JsonProperty("not_in_values")
    @ExcludeMissing
    fun _notInValues(): JsonField<List<String>> = notInValues

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

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

    fun toBuilder() = Builder().from(this)

    companion object {

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

        /** The name of the event property. */
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
        fun inValues(inValues: JsonField<List<String>>) = apply {
            this.inValues = inValues.map { it.toMutableList() }
        }

        /**
         * Specifies the allowed values for the property to match an event. An event will pass the
         * filter only if its property value is included in this list. If undefined, all property
         * values will pass the filter. Must be non-empty if present.
         */
        fun addInValue(inValue: String) = apply {
            inValues =
                (inValues ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(inValue)
                }
        }

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
        fun notInValues(notInValues: JsonField<List<String>>) = apply {
            this.notInValues = notInValues.map { it.toMutableList() }
        }

        /**
         * Specifies the values that prevent an event from matching the filter. An event will not
         * pass the filter if its property value is included in this list. If null or empty, all
         * property values will pass the filter. Must be non-empty if present.
         */
        fun addNotInValue(notInValue: String) = apply {
            notInValues =
                (notInValues ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(notInValue)
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

        fun build(): PropertyFilter =
            PropertyFilter(
                checkRequired("name", name),
                exists,
                (inValues ?: JsonMissing.of()).map { it.toImmutable() },
                (notInValues ?: JsonMissing.of()).map { it.toImmutable() },
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
