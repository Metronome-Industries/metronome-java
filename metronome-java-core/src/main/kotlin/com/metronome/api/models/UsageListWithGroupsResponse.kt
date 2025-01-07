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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class UsageListWithGroupsResponse
@JsonCreator
private constructor(
    @JsonProperty("ending_before")
    @ExcludeMissing
    private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("group_key")
    @ExcludeMissing
    private val groupKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("group_value")
    @ExcludeMissing
    private val groupValue: JsonField<String> = JsonMissing.of(),
    @JsonProperty("starting_on")
    @ExcludeMissing
    private val startingOn: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("value") @ExcludeMissing private val value: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

    fun groupKey(): Optional<String> = Optional.ofNullable(groupKey.getNullable("group_key"))

    fun groupValue(): Optional<String> = Optional.ofNullable(groupValue.getNullable("group_value"))

    fun startingOn(): OffsetDateTime = startingOn.getRequired("starting_on")

    fun value(): Optional<Double> = Optional.ofNullable(value.getNullable("value"))

    @JsonProperty("ending_before")
    @ExcludeMissing
    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

    @JsonProperty("group_key") @ExcludeMissing fun _groupKey(): JsonField<String> = groupKey

    @JsonProperty("group_value") @ExcludeMissing fun _groupValue(): JsonField<String> = groupValue

    @JsonProperty("starting_on")
    @ExcludeMissing
    fun _startingOn(): JsonField<OffsetDateTime> = startingOn

    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): UsageListWithGroupsResponse = apply {
        if (!validated) {
            endingBefore()
            groupKey()
            groupValue()
            startingOn()
            value()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var endingBefore: JsonField<OffsetDateTime>? = null
        private var groupKey: JsonField<String>? = null
        private var groupValue: JsonField<String>? = null
        private var startingOn: JsonField<OffsetDateTime>? = null
        private var value: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageListWithGroupsResponse: UsageListWithGroupsResponse) = apply {
            endingBefore = usageListWithGroupsResponse.endingBefore
            groupKey = usageListWithGroupsResponse.groupKey
            groupValue = usageListWithGroupsResponse.groupValue
            startingOn = usageListWithGroupsResponse.startingOn
            value = usageListWithGroupsResponse.value
            additionalProperties = usageListWithGroupsResponse.additionalProperties.toMutableMap()
        }

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
        }

        fun groupKey(groupKey: String?) = groupKey(JsonField.ofNullable(groupKey))

        fun groupKey(groupKey: Optional<String>) = groupKey(groupKey.orElse(null))

        fun groupKey(groupKey: JsonField<String>) = apply { this.groupKey = groupKey }

        fun groupValue(groupValue: String?) = groupValue(JsonField.ofNullable(groupValue))

        fun groupValue(groupValue: Optional<String>) = groupValue(groupValue.orElse(null))

        fun groupValue(groupValue: JsonField<String>) = apply { this.groupValue = groupValue }

        fun startingOn(startingOn: OffsetDateTime) = startingOn(JsonField.of(startingOn))

        fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
            this.startingOn = startingOn
        }

        fun value(value: Double?) = value(JsonField.ofNullable(value))

        fun value(value: Double) = value(value as Double?)

        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun value(value: Optional<Double>) = value(value.orElse(null) as Double?)

        fun value(value: JsonField<Double>) = apply { this.value = value }

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

        fun build(): UsageListWithGroupsResponse =
            UsageListWithGroupsResponse(
                checkNotNull(endingBefore) { "`endingBefore` is required but was not set" },
                checkNotNull(groupKey) { "`groupKey` is required but was not set" },
                checkNotNull(groupValue) { "`groupValue` is required but was not set" },
                checkNotNull(startingOn) { "`startingOn` is required but was not set" },
                checkNotNull(value) { "`value` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageListWithGroupsResponse && endingBefore == other.endingBefore && groupKey == other.groupKey && groupValue == other.groupValue && startingOn == other.startingOn && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(endingBefore, groupKey, groupValue, startingOn, value, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageListWithGroupsResponse{endingBefore=$endingBefore, groupKey=$groupKey, groupValue=$groupValue, startingOn=$startingOn, value=$value, additionalProperties=$additionalProperties}"
}
