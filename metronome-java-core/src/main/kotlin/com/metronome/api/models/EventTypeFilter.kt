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
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/** An optional filtering rule to match the 'event_type' property of an event. */
@NoAutoDetect
class EventTypeFilter
@JsonCreator
private constructor(
    @JsonProperty("in_values")
    @ExcludeMissing
    private val inValues: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("not_in_values")
    @ExcludeMissing
    private val notInValues: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * A list of event types that are explicitly included in the billable metric. If specified, only
     * events of these types will match the billable metric. Must be non-empty if present.
     */
    fun inValues(): Optional<List<String>> = Optional.ofNullable(inValues.getNullable("in_values"))

    /**
     * A list of event types that are explicitly excluded from the billable metric. If specified,
     * events of these types will not match the billable metric. Must be non-empty if present.
     */
    fun notInValues(): Optional<List<String>> =
        Optional.ofNullable(notInValues.getNullable("not_in_values"))

    /**
     * A list of event types that are explicitly included in the billable metric. If specified, only
     * events of these types will match the billable metric. Must be non-empty if present.
     */
    @JsonProperty("in_values") @ExcludeMissing fun _inValues(): JsonField<List<String>> = inValues

    /**
     * A list of event types that are explicitly excluded from the billable metric. If specified,
     * events of these types will not match the billable metric. Must be non-empty if present.
     */
    @JsonProperty("not_in_values")
    @ExcludeMissing
    fun _notInValues(): JsonField<List<String>> = notInValues

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EventTypeFilter = apply {
        if (validated) {
            return@apply
        }

        inValues()
        notInValues()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventTypeFilter]. */
    class Builder internal constructor() {

        private var inValues: JsonField<MutableList<String>>? = null
        private var notInValues: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventTypeFilter: EventTypeFilter) = apply {
            inValues = eventTypeFilter.inValues.map { it.toMutableList() }
            notInValues = eventTypeFilter.notInValues.map { it.toMutableList() }
            additionalProperties = eventTypeFilter.additionalProperties.toMutableMap()
        }

        /**
         * A list of event types that are explicitly included in the billable metric. If specified,
         * only events of these types will match the billable metric. Must be non-empty if present.
         */
        fun inValues(inValues: List<String>) = inValues(JsonField.of(inValues))

        /**
         * A list of event types that are explicitly included in the billable metric. If specified,
         * only events of these types will match the billable metric. Must be non-empty if present.
         */
        fun inValues(inValues: JsonField<List<String>>) = apply {
            this.inValues = inValues.map { it.toMutableList() }
        }

        /**
         * A list of event types that are explicitly included in the billable metric. If specified,
         * only events of these types will match the billable metric. Must be non-empty if present.
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
         * A list of event types that are explicitly excluded from the billable metric. If
         * specified, events of these types will not match the billable metric. Must be non-empty if
         * present.
         */
        fun notInValues(notInValues: List<String>) = notInValues(JsonField.of(notInValues))

        /**
         * A list of event types that are explicitly excluded from the billable metric. If
         * specified, events of these types will not match the billable metric. Must be non-empty if
         * present.
         */
        fun notInValues(notInValues: JsonField<List<String>>) = apply {
            this.notInValues = notInValues.map { it.toMutableList() }
        }

        /**
         * A list of event types that are explicitly excluded from the billable metric. If
         * specified, events of these types will not match the billable metric. Must be non-empty if
         * present.
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

        fun build(): EventTypeFilter =
            EventTypeFilter(
                (inValues ?: JsonMissing.of()).map { it.toImmutable() },
                (notInValues ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventTypeFilter && inValues == other.inValues && notInValues == other.notInValues && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(inValues, notInValues, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventTypeFilter{inValues=$inValues, notInValues=$notInValues, additionalProperties=$additionalProperties}"
}
