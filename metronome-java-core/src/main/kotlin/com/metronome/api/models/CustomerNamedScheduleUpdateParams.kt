// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class CustomerNamedScheduleUpdateParams
constructor(
    private val customerId: String,
    private val scheduleName: String,
    private val startingAt: OffsetDateTime,
    private val value: JsonValue,
    private val endingBefore: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun scheduleName(): String = scheduleName

    fun startingAt(): OffsetDateTime = startingAt

    fun value(): JsonValue = value

    fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

    @JvmSynthetic
    internal fun getBody(): CustomerNamedScheduleUpdateBody {
        return CustomerNamedScheduleUpdateBody(
            customerId,
            scheduleName,
            startingAt,
            value,
            endingBefore,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CustomerNamedScheduleUpdateBody.Builder::class)
    @NoAutoDetect
    class CustomerNamedScheduleUpdateBody
    internal constructor(
        private val customerId: String?,
        private val scheduleName: String?,
        private val startingAt: OffsetDateTime?,
        private val value: JsonValue?,
        private val endingBefore: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** ID of the customer whose named schedule is to be updated */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** The identifier for the schedule to be updated */
        @JsonProperty("schedule_name") fun scheduleName(): String? = scheduleName

        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

        /**
         * The value to set for the named schedule. The structure of this object is specific to the
         * named schedule.
         */
        @JsonProperty("value") fun value(): JsonValue? = value

        @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customerId: String? = null
            private var scheduleName: String? = null
            private var startingAt: OffsetDateTime? = null
            private var value: JsonValue? = null
            private var endingBefore: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerNamedScheduleUpdateBody: CustomerNamedScheduleUpdateBody) =
                apply {
                    this.customerId = customerNamedScheduleUpdateBody.customerId
                    this.scheduleName = customerNamedScheduleUpdateBody.scheduleName
                    this.startingAt = customerNamedScheduleUpdateBody.startingAt
                    this.value = customerNamedScheduleUpdateBody.value
                    this.endingBefore = customerNamedScheduleUpdateBody.endingBefore
                    additionalProperties(customerNamedScheduleUpdateBody.additionalProperties)
                }

            /** ID of the customer whose named schedule is to be updated */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** The identifier for the schedule to be updated */
            @JsonProperty("schedule_name")
            fun scheduleName(scheduleName: String) = apply { this.scheduleName = scheduleName }

            @JsonProperty("starting_at")
            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

            /**
             * The value to set for the named schedule. The structure of this object is specific to
             * the named schedule.
             */
            @JsonProperty("value") fun value(value: JsonValue) = apply { this.value = value }

            @JsonProperty("ending_before")
            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
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

            fun build(): CustomerNamedScheduleUpdateBody =
                CustomerNamedScheduleUpdateBody(
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(scheduleName) { "`scheduleName` is required but was not set" },
                    checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                    checkNotNull(value) { "`value` is required but was not set" },
                    endingBefore,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerNamedScheduleUpdateBody && this.customerId == other.customerId && this.scheduleName == other.scheduleName && this.startingAt == other.startingAt && this.value == other.value && this.endingBefore == other.endingBefore && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(customerId, scheduleName, startingAt, value, endingBefore, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CustomerNamedScheduleUpdateBody{customerId=$customerId, scheduleName=$scheduleName, startingAt=$startingAt, value=$value, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerNamedScheduleUpdateParams && this.customerId == other.customerId && this.scheduleName == other.scheduleName && this.startingAt == other.startingAt && this.value == other.value && this.endingBefore == other.endingBefore && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, scheduleName, startingAt, value, endingBefore, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CustomerNamedScheduleUpdateParams{customerId=$customerId, scheduleName=$scheduleName, startingAt=$startingAt, value=$value, endingBefore=$endingBefore, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var scheduleName: String? = null
        private var startingAt: OffsetDateTime? = null
        private var value: JsonValue? = null
        private var endingBefore: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerNamedScheduleUpdateParams: CustomerNamedScheduleUpdateParams) =
            apply {
                this.customerId = customerNamedScheduleUpdateParams.customerId
                this.scheduleName = customerNamedScheduleUpdateParams.scheduleName
                this.startingAt = customerNamedScheduleUpdateParams.startingAt
                this.value = customerNamedScheduleUpdateParams.value
                this.endingBefore = customerNamedScheduleUpdateParams.endingBefore
                additionalQueryParams(customerNamedScheduleUpdateParams.additionalQueryParams)
                additionalHeaders(customerNamedScheduleUpdateParams.additionalHeaders)
                additionalBodyProperties(customerNamedScheduleUpdateParams.additionalBodyProperties)
            }

        /** ID of the customer whose named schedule is to be updated */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** The identifier for the schedule to be updated */
        fun scheduleName(scheduleName: String) = apply { this.scheduleName = scheduleName }

        fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

        /**
         * The value to set for the named schedule. The structure of this object is specific to the
         * named schedule.
         */
        fun value(value: JsonValue) = apply { this.value = value }

        fun endingBefore(endingBefore: OffsetDateTime) = apply { this.endingBefore = endingBefore }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CustomerNamedScheduleUpdateParams =
            CustomerNamedScheduleUpdateParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(scheduleName) { "`scheduleName` is required but was not set" },
                checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                checkNotNull(value) { "`value` is required but was not set" },
                endingBefore,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
