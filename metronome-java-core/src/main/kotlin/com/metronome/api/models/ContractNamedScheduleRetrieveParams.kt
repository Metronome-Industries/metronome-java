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
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Get a named schedule for the given rate card. This endpoint's availability is dependent on your
 * client's configuration.
 */
class ContractNamedScheduleRetrieveParams
constructor(
    private val body: ContractNamedScheduleRetrieveBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** ID of the rate card whose named schedule is to be retrieved */
    fun rateCardId(): String = body.rateCardId()

    /** The identifier for the schedule to be retrieved */
    fun scheduleName(): String = body.scheduleName()

    /**
     * If provided, at most one schedule segment will be returned (the one that covers this date).
     * If not provided, all segments will be returned.
     */
    fun coveringDate(): Optional<OffsetDateTime> = body.coveringDate()

    /** ID of the rate card whose named schedule is to be retrieved */
    fun _rateCardId(): JsonField<String> = body._rateCardId()

    /** The identifier for the schedule to be retrieved */
    fun _scheduleName(): JsonField<String> = body._scheduleName()

    /**
     * If provided, at most one schedule segment will be returned (the one that covers this date).
     * If not provided, all segments will be returned.
     */
    fun _coveringDate(): JsonField<OffsetDateTime> = body._coveringDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ContractNamedScheduleRetrieveBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractNamedScheduleRetrieveBody
    @JsonCreator
    internal constructor(
        @JsonProperty("rate_card_id")
        @ExcludeMissing
        private val rateCardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("schedule_name")
        @ExcludeMissing
        private val scheduleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("covering_date")
        @ExcludeMissing
        private val coveringDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the rate card whose named schedule is to be retrieved */
        fun rateCardId(): String = rateCardId.getRequired("rate_card_id")

        /** The identifier for the schedule to be retrieved */
        fun scheduleName(): String = scheduleName.getRequired("schedule_name")

        /**
         * If provided, at most one schedule segment will be returned (the one that covers this
         * date). If not provided, all segments will be returned.
         */
        fun coveringDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(coveringDate.getNullable("covering_date"))

        /** ID of the rate card whose named schedule is to be retrieved */
        @JsonProperty("rate_card_id")
        @ExcludeMissing
        fun _rateCardId(): JsonField<String> = rateCardId

        /** The identifier for the schedule to be retrieved */
        @JsonProperty("schedule_name")
        @ExcludeMissing
        fun _scheduleName(): JsonField<String> = scheduleName

        /**
         * If provided, at most one schedule segment will be returned (the one that covers this
         * date). If not provided, all segments will be returned.
         */
        @JsonProperty("covering_date")
        @ExcludeMissing
        fun _coveringDate(): JsonField<OffsetDateTime> = coveringDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractNamedScheduleRetrieveBody = apply {
            if (validated) {
                return@apply
            }

            rateCardId()
            scheduleName()
            coveringDate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var rateCardId: JsonField<String>? = null
            private var scheduleName: JsonField<String>? = null
            private var coveringDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                contractNamedScheduleRetrieveBody: ContractNamedScheduleRetrieveBody
            ) = apply {
                rateCardId = contractNamedScheduleRetrieveBody.rateCardId
                scheduleName = contractNamedScheduleRetrieveBody.scheduleName
                coveringDate = contractNamedScheduleRetrieveBody.coveringDate
                additionalProperties =
                    contractNamedScheduleRetrieveBody.additionalProperties.toMutableMap()
            }

            /** ID of the rate card whose named schedule is to be retrieved */
            fun rateCardId(rateCardId: String) = rateCardId(JsonField.of(rateCardId))

            /** ID of the rate card whose named schedule is to be retrieved */
            fun rateCardId(rateCardId: JsonField<String>) = apply { this.rateCardId = rateCardId }

            /** The identifier for the schedule to be retrieved */
            fun scheduleName(scheduleName: String) = scheduleName(JsonField.of(scheduleName))

            /** The identifier for the schedule to be retrieved */
            fun scheduleName(scheduleName: JsonField<String>) = apply {
                this.scheduleName = scheduleName
            }

            /**
             * If provided, at most one schedule segment will be returned (the one that covers this
             * date). If not provided, all segments will be returned.
             */
            fun coveringDate(coveringDate: OffsetDateTime) =
                coveringDate(JsonField.of(coveringDate))

            /**
             * If provided, at most one schedule segment will be returned (the one that covers this
             * date). If not provided, all segments will be returned.
             */
            fun coveringDate(coveringDate: JsonField<OffsetDateTime>) = apply {
                this.coveringDate = coveringDate
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

            fun build(): ContractNamedScheduleRetrieveBody =
                ContractNamedScheduleRetrieveBody(
                    checkRequired("rateCardId", rateCardId),
                    checkRequired("scheduleName", scheduleName),
                    coveringDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractNamedScheduleRetrieveBody && rateCardId == other.rateCardId && scheduleName == other.scheduleName && coveringDate == other.coveringDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(rateCardId, scheduleName, coveringDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractNamedScheduleRetrieveBody{rateCardId=$rateCardId, scheduleName=$scheduleName, coveringDate=$coveringDate, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ContractNamedScheduleRetrieveBody.Builder =
            ContractNamedScheduleRetrieveBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            contractNamedScheduleRetrieveParams: ContractNamedScheduleRetrieveParams
        ) = apply {
            body = contractNamedScheduleRetrieveParams.body.toBuilder()
            additionalHeaders = contractNamedScheduleRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                contractNamedScheduleRetrieveParams.additionalQueryParams.toBuilder()
        }

        /** ID of the rate card whose named schedule is to be retrieved */
        fun rateCardId(rateCardId: String) = apply { body.rateCardId(rateCardId) }

        /** ID of the rate card whose named schedule is to be retrieved */
        fun rateCardId(rateCardId: JsonField<String>) = apply { body.rateCardId(rateCardId) }

        /** The identifier for the schedule to be retrieved */
        fun scheduleName(scheduleName: String) = apply { body.scheduleName(scheduleName) }

        /** The identifier for the schedule to be retrieved */
        fun scheduleName(scheduleName: JsonField<String>) = apply {
            body.scheduleName(scheduleName)
        }

        /**
         * If provided, at most one schedule segment will be returned (the one that covers this
         * date). If not provided, all segments will be returned.
         */
        fun coveringDate(coveringDate: OffsetDateTime) = apply { body.coveringDate(coveringDate) }

        /**
         * If provided, at most one schedule segment will be returned (the one that covers this
         * date). If not provided, all segments will be returned.
         */
        fun coveringDate(coveringDate: JsonField<OffsetDateTime>) = apply {
            body.coveringDate(coveringDate)
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

        fun build(): ContractNamedScheduleRetrieveParams =
            ContractNamedScheduleRetrieveParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractNamedScheduleRetrieveParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractNamedScheduleRetrieveParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
