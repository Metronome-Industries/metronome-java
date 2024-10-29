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
import com.metronome.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

/** An optional filtering rule to match the 'event_type' property of an event. */
@JsonDeserialize(builder = EventTypeFilter.Builder::class)
@NoAutoDetect
class EventTypeFilter
private constructor(
    private val inValues: JsonField<List<String>>,
    private val notInValues: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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
    @JsonProperty("in_values") @ExcludeMissing fun _inValues() = inValues

    /**
     * A list of event types that are explicitly excluded from the billable metric. If specified,
     * events of these types will not match the billable metric. Must be non-empty if present.
     */
    @JsonProperty("not_in_values") @ExcludeMissing fun _notInValues() = notInValues

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EventTypeFilter = apply {
        if (!validated) {
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

        private var inValues: JsonField<List<String>> = JsonMissing.of()
        private var notInValues: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventTypeFilter: EventTypeFilter) = apply {
            this.inValues = eventTypeFilter.inValues
            this.notInValues = eventTypeFilter.notInValues
            additionalProperties(eventTypeFilter.additionalProperties)
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
        @JsonProperty("in_values")
        @ExcludeMissing
        fun inValues(inValues: JsonField<List<String>>) = apply { this.inValues = inValues }

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
        @JsonProperty("not_in_values")
        @ExcludeMissing
        fun notInValues(notInValues: JsonField<List<String>>) = apply {
            this.notInValues = notInValues
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): EventTypeFilter =
            EventTypeFilter(
                inValues.map { it.toUnmodifiable() },
                notInValues.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventTypeFilter && this.inValues == other.inValues && this.notInValues == other.notInValues && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(inValues, notInValues, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "EventTypeFilter{inValues=$inValues, notInValues=$notInValues, additionalProperties=$additionalProperties}"
}
