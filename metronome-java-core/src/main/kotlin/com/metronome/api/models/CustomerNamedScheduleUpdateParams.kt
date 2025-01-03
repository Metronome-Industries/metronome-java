// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class CustomerNamedScheduleUpdateParams
constructor(
    private val body: CustomerNamedScheduleUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** ID of the customer whose named schedule is to be updated */
    fun customerId(): String = body.customerId()

    /** The identifier for the schedule to be updated */
    fun scheduleName(): String = body.scheduleName()

    fun startingAt(): OffsetDateTime = body.startingAt()

    /**
     * The value to set for the named schedule. The structure of this object is specific to the
     * named schedule.
     */
    fun value(): JsonValue = body.value()

    fun endingBefore(): Optional<OffsetDateTime> = body.endingBefore()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): CustomerNamedScheduleUpdateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CustomerNamedScheduleUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("customer_id") private val customerId: String,
        @JsonProperty("schedule_name") private val scheduleName: String,
        @JsonProperty("starting_at") private val startingAt: OffsetDateTime,
        @JsonProperty("value") private val value: JsonValue,
        @JsonProperty("ending_before") private val endingBefore: OffsetDateTime?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the customer whose named schedule is to be updated */
        @JsonProperty("customer_id") fun customerId(): String = customerId

        /** The identifier for the schedule to be updated */
        @JsonProperty("schedule_name") fun scheduleName(): String = scheduleName

        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime = startingAt

        /**
         * The value to set for the named schedule. The structure of this object is specific to the
         * named schedule.
         */
        @JsonProperty("value") fun value(): JsonValue = value

        @JsonProperty("ending_before")
        fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

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
                    customerId = customerNamedScheduleUpdateBody.customerId
                    scheduleName = customerNamedScheduleUpdateBody.scheduleName
                    startingAt = customerNamedScheduleUpdateBody.startingAt
                    value = customerNamedScheduleUpdateBody.value
                    endingBefore = customerNamedScheduleUpdateBody.endingBefore
                    additionalProperties =
                        customerNamedScheduleUpdateBody.additionalProperties.toMutableMap()
                }

            /** ID of the customer whose named schedule is to be updated */
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** The identifier for the schedule to be updated */
            fun scheduleName(scheduleName: String) = apply { this.scheduleName = scheduleName }

            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

            /**
             * The value to set for the named schedule. The structure of this object is specific to
             * the named schedule.
             */
            fun value(value: JsonValue) = apply { this.value = value }

            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
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

            fun build(): CustomerNamedScheduleUpdateBody =
                CustomerNamedScheduleUpdateBody(
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(scheduleName) { "`scheduleName` is required but was not set" },
                    checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                    checkNotNull(value) { "`value` is required but was not set" },
                    endingBefore,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerNamedScheduleUpdateBody && customerId == other.customerId && scheduleName == other.scheduleName && startingAt == other.startingAt && value == other.value && endingBefore == other.endingBefore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, scheduleName, startingAt, value, endingBefore, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerNamedScheduleUpdateBody{customerId=$customerId, scheduleName=$scheduleName, startingAt=$startingAt, value=$value, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: CustomerNamedScheduleUpdateBody.Builder =
            CustomerNamedScheduleUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerNamedScheduleUpdateParams: CustomerNamedScheduleUpdateParams) =
            apply {
                body = customerNamedScheduleUpdateParams.body.toBuilder()
                additionalHeaders = customerNamedScheduleUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    customerNamedScheduleUpdateParams.additionalQueryParams.toBuilder()
            }

        /** ID of the customer whose named schedule is to be updated */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** The identifier for the schedule to be updated */
        fun scheduleName(scheduleName: String) = apply { body.scheduleName(scheduleName) }

        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

        /**
         * The value to set for the named schedule. The structure of this object is specific to the
         * named schedule.
         */
        fun value(value: JsonValue) = apply { body.value(value) }

        fun endingBefore(endingBefore: OffsetDateTime) = apply { body.endingBefore(endingBefore) }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): CustomerNamedScheduleUpdateParams =
            CustomerNamedScheduleUpdateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerNamedScheduleUpdateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerNamedScheduleUpdateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
