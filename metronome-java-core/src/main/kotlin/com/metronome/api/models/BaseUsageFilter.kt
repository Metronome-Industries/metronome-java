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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = BaseUsageFilter.Builder::class)
@NoAutoDetect
class BaseUsageFilter
private constructor(
    private val groupKey: JsonField<String>,
    private val groupValues: JsonField<List<String>>,
    private val startingAt: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    fun groupKey(): String = groupKey.getRequired("group_key")

    fun groupValues(): List<String> = groupValues.getRequired("group_values")

    fun startingAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(startingAt.getNullable("starting_at"))

    @JsonProperty("group_key") @ExcludeMissing fun _groupKey() = groupKey

    @JsonProperty("group_values") @ExcludeMissing fun _groupValues() = groupValues

    @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BaseUsageFilter = apply {
        if (!validated) {
            groupKey()
            groupValues()
            startingAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var groupKey: JsonField<String> = JsonMissing.of()
        private var groupValues: JsonField<List<String>> = JsonMissing.of()
        private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(baseUsageFilter: BaseUsageFilter) = apply {
            groupKey = baseUsageFilter.groupKey
            groupValues = baseUsageFilter.groupValues
            startingAt = baseUsageFilter.startingAt
            additionalProperties = baseUsageFilter.additionalProperties.toMutableMap()
        }

        fun groupKey(groupKey: String) = groupKey(JsonField.of(groupKey))

        @JsonProperty("group_key")
        @ExcludeMissing
        fun groupKey(groupKey: JsonField<String>) = apply { this.groupKey = groupKey }

        fun groupValues(groupValues: List<String>) = groupValues(JsonField.of(groupValues))

        @JsonProperty("group_values")
        @ExcludeMissing
        fun groupValues(groupValues: JsonField<List<String>>) = apply {
            this.groupValues = groupValues
        }

        fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

        @JsonProperty("starting_at")
        @ExcludeMissing
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            this.startingAt = startingAt
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

        fun build(): BaseUsageFilter =
            BaseUsageFilter(
                groupKey,
                groupValues.map { it.toImmutable() },
                startingAt,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BaseUsageFilter && groupKey == other.groupKey && groupValues == other.groupValues && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(groupKey, groupValues, startingAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BaseUsageFilter{groupKey=$groupKey, groupValues=$groupValues, startingAt=$startingAt, additionalProperties=$additionalProperties}"
}
