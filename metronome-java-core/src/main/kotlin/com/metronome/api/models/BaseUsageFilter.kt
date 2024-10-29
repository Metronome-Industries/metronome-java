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

    private var validated: Boolean = false

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
            this.groupKey = baseUsageFilter.groupKey
            this.groupValues = baseUsageFilter.groupValues
            this.startingAt = baseUsageFilter.startingAt
            additionalProperties(baseUsageFilter.additionalProperties)
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
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): BaseUsageFilter =
            BaseUsageFilter(
                groupKey,
                groupValues.map { it.toUnmodifiable() },
                startingAt,
                additionalProperties.toUnmodifiable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BaseUsageFilter && this.groupKey == other.groupKey && this.groupValues == other.groupValues && this.startingAt == other.startingAt && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(groupKey, groupValues, startingAt, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "BaseUsageFilter{groupKey=$groupKey, groupValues=$groupValues, startingAt=$startingAt, additionalProperties=$additionalProperties}"
}
