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

@JsonDeserialize(builder = UsageListWithGroupsResponse.Builder::class)
@NoAutoDetect
class UsageListWithGroupsResponse
private constructor(
    private val data: JsonField<List<Data>>,
    private val nextPage: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun data(): List<Data> = data.getRequired("data")

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonProperty("next_page") @ExcludeMissing fun _nextPage() = nextPage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): UsageListWithGroupsResponse = apply {
        if (!validated) {
            data().forEach { it.validate() }
            nextPage()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageListWithGroupsResponse &&
            this.data == other.data &&
            this.nextPage == other.nextPage &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    data,
                    nextPage,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "UsageListWithGroupsResponse{data=$data, nextPage=$nextPage, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var nextPage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageListWithGroupsResponse: UsageListWithGroupsResponse) = apply {
            this.data = usageListWithGroupsResponse.data
            this.nextPage = usageListWithGroupsResponse.nextPage
            additionalProperties(usageListWithGroupsResponse.additionalProperties)
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Data>>) = apply { this.data = data }

        fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

        @JsonProperty("next_page")
        @ExcludeMissing
        fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

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

        fun build(): UsageListWithGroupsResponse =
            UsageListWithGroupsResponse(
                data.map { it.toUnmodifiable() },
                nextPage,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val startingOn: JsonField<OffsetDateTime>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val groupKey: JsonField<String>,
        private val groupValue: JsonField<String>,
        private val value: JsonField<Double>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun startingOn(): OffsetDateTime = startingOn.getRequired("starting_on")

        fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

        fun groupKey(): Optional<String> = Optional.ofNullable(groupKey.getNullable("group_key"))

        fun groupValue(): Optional<String> =
            Optional.ofNullable(groupValue.getNullable("group_value"))

        fun value(): Optional<Double> = Optional.ofNullable(value.getNullable("value"))

        @JsonProperty("starting_on") @ExcludeMissing fun _startingOn() = startingOn

        @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

        @JsonProperty("group_key") @ExcludeMissing fun _groupKey() = groupKey

        @JsonProperty("group_value") @ExcludeMissing fun _groupValue() = groupValue

        @JsonProperty("value") @ExcludeMissing fun _value() = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                startingOn()
                endingBefore()
                groupKey()
                groupValue()
                value()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.startingOn == other.startingOn &&
                this.endingBefore == other.endingBefore &&
                this.groupKey == other.groupKey &&
                this.groupValue == other.groupValue &&
                this.value == other.value &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        startingOn,
                        endingBefore,
                        groupKey,
                        groupValue,
                        value,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Data{startingOn=$startingOn, endingBefore=$endingBefore, groupKey=$groupKey, groupValue=$groupValue, value=$value, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var startingOn: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var groupKey: JsonField<String> = JsonMissing.of()
            private var groupValue: JsonField<String> = JsonMissing.of()
            private var value: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.startingOn = data.startingOn
                this.endingBefore = data.endingBefore
                this.groupKey = data.groupKey
                this.groupValue = data.groupValue
                this.value = data.value
                additionalProperties(data.additionalProperties)
            }

            fun startingOn(startingOn: OffsetDateTime) = startingOn(JsonField.of(startingOn))

            @JsonProperty("starting_on")
            @ExcludeMissing
            fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
                this.startingOn = startingOn
            }

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            @JsonProperty("ending_before")
            @ExcludeMissing
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun groupKey(groupKey: String) = groupKey(JsonField.of(groupKey))

            @JsonProperty("group_key")
            @ExcludeMissing
            fun groupKey(groupKey: JsonField<String>) = apply { this.groupKey = groupKey }

            fun groupValue(groupValue: String) = groupValue(JsonField.of(groupValue))

            @JsonProperty("group_value")
            @ExcludeMissing
            fun groupValue(groupValue: JsonField<String>) = apply { this.groupValue = groupValue }

            fun value(value: Double) = value(JsonField.of(value))

            @JsonProperty("value")
            @ExcludeMissing
            fun value(value: JsonField<Double>) = apply { this.value = value }

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

            fun build(): Data =
                Data(
                    startingOn,
                    endingBefore,
                    groupKey,
                    groupValue,
                    value,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
