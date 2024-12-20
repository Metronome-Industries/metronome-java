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

@JsonDeserialize(builder = UsageListResponse.Builder::class)
@NoAutoDetect
class UsageListResponse
private constructor(
    private val data: JsonField<List<Data>>,
    private val nextPage: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    fun data(): List<Data> = data.getRequired("data")

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonProperty("next_page") @ExcludeMissing fun _nextPage() = nextPage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): UsageListResponse = apply {
        if (!validated) {
            data().forEach { it.validate() }
            nextPage()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var nextPage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageListResponse: UsageListResponse) = apply {
            data = usageListResponse.data
            nextPage = usageListResponse.nextPage
            additionalProperties = usageListResponse.additionalProperties.toMutableMap()
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

        fun build(): UsageListResponse =
            UsageListResponse(
                data.map { it.toImmutable() },
                nextPage,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val customerId: JsonField<String>,
        private val billableMetricId: JsonField<String>,
        private val billableMetricName: JsonField<String>,
        private val startTimestamp: JsonField<OffsetDateTime>,
        private val endTimestamp: JsonField<OffsetDateTime>,
        private val value: JsonField<Double>,
        private val groups: JsonField<Groups>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        fun customerId(): String = customerId.getRequired("customer_id")

        fun billableMetricId(): String = billableMetricId.getRequired("billable_metric_id")

        fun billableMetricName(): String = billableMetricName.getRequired("billable_metric_name")

        fun startTimestamp(): OffsetDateTime = startTimestamp.getRequired("start_timestamp")

        fun endTimestamp(): OffsetDateTime = endTimestamp.getRequired("end_timestamp")

        fun value(): Optional<Double> = Optional.ofNullable(value.getNullable("value"))

        /**
         * Values will be either a number or null. Null indicates that there were no matches for the
         * group_by value.
         */
        fun groups(): Optional<Groups> = Optional.ofNullable(groups.getNullable("groups"))

        @JsonProperty("customer_id") @ExcludeMissing fun _customerId() = customerId

        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        fun _billableMetricId() = billableMetricId

        @JsonProperty("billable_metric_name")
        @ExcludeMissing
        fun _billableMetricName() = billableMetricName

        @JsonProperty("start_timestamp") @ExcludeMissing fun _startTimestamp() = startTimestamp

        @JsonProperty("end_timestamp") @ExcludeMissing fun _endTimestamp() = endTimestamp

        @JsonProperty("value") @ExcludeMissing fun _value() = value

        /**
         * Values will be either a number or null. Null indicates that there were no matches for the
         * group_by value.
         */
        @JsonProperty("groups") @ExcludeMissing fun _groups() = groups

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (!validated) {
                customerId()
                billableMetricId()
                billableMetricName()
                startTimestamp()
                endTimestamp()
                value()
                groups().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customerId: JsonField<String> = JsonMissing.of()
            private var billableMetricId: JsonField<String> = JsonMissing.of()
            private var billableMetricName: JsonField<String> = JsonMissing.of()
            private var startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var value: JsonField<Double> = JsonMissing.of()
            private var groups: JsonField<Groups> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                customerId = data.customerId
                billableMetricId = data.billableMetricId
                billableMetricName = data.billableMetricName
                startTimestamp = data.startTimestamp
                endTimestamp = data.endTimestamp
                value = data.value
                groups = data.groups
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            @JsonProperty("customer_id")
            @ExcludeMissing
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun billableMetricId(billableMetricId: String) =
                billableMetricId(JsonField.of(billableMetricId))

            @JsonProperty("billable_metric_id")
            @ExcludeMissing
            fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                this.billableMetricId = billableMetricId
            }

            fun billableMetricName(billableMetricName: String) =
                billableMetricName(JsonField.of(billableMetricName))

            @JsonProperty("billable_metric_name")
            @ExcludeMissing
            fun billableMetricName(billableMetricName: JsonField<String>) = apply {
                this.billableMetricName = billableMetricName
            }

            fun startTimestamp(startTimestamp: OffsetDateTime) =
                startTimestamp(JsonField.of(startTimestamp))

            @JsonProperty("start_timestamp")
            @ExcludeMissing
            fun startTimestamp(startTimestamp: JsonField<OffsetDateTime>) = apply {
                this.startTimestamp = startTimestamp
            }

            fun endTimestamp(endTimestamp: OffsetDateTime) =
                endTimestamp(JsonField.of(endTimestamp))

            @JsonProperty("end_timestamp")
            @ExcludeMissing
            fun endTimestamp(endTimestamp: JsonField<OffsetDateTime>) = apply {
                this.endTimestamp = endTimestamp
            }

            fun value(value: Double) = value(JsonField.of(value))

            @JsonProperty("value")
            @ExcludeMissing
            fun value(value: JsonField<Double>) = apply { this.value = value }

            /**
             * Values will be either a number or null. Null indicates that there were no matches for
             * the group_by value.
             */
            fun groups(groups: Groups) = groups(JsonField.of(groups))

            /**
             * Values will be either a number or null. Null indicates that there were no matches for
             * the group_by value.
             */
            @JsonProperty("groups")
            @ExcludeMissing
            fun groups(groups: JsonField<Groups>) = apply { this.groups = groups }

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

            fun build(): Data =
                Data(
                    customerId,
                    billableMetricId,
                    billableMetricName,
                    startTimestamp,
                    endTimestamp,
                    value,
                    groups,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Values will be either a number or null. Null indicates that there were no matches for the
         * group_by value.
         */
        @JsonDeserialize(builder = Groups.Builder::class)
        @NoAutoDetect
        class Groups
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Groups = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(groups: Groups) = apply {
                    additionalProperties = groups.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Groups = Groups(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Groups && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Groups{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && customerId == other.customerId && billableMetricId == other.billableMetricId && billableMetricName == other.billableMetricName && startTimestamp == other.startTimestamp && endTimestamp == other.endTimestamp && value == other.value && groups == other.groups && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, billableMetricId, billableMetricName, startTimestamp, endTimestamp, value, groups, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{customerId=$customerId, billableMetricId=$billableMetricId, billableMetricName=$billableMetricName, startTimestamp=$startTimestamp, endTimestamp=$endTimestamp, value=$value, groups=$groups, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageListResponse && data == other.data && nextPage == other.nextPage && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, nextPage, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageListResponse{data=$data, nextPage=$nextPage, additionalProperties=$additionalProperties}"
}
