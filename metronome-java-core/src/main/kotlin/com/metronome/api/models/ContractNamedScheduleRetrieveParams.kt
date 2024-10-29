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

class ContractNamedScheduleRetrieveParams
constructor(
    private val rateCardId: String,
    private val scheduleName: String,
    private val coveringDate: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun rateCardId(): String = rateCardId

    fun scheduleName(): String = scheduleName

    fun coveringDate(): Optional<OffsetDateTime> = Optional.ofNullable(coveringDate)

    @JvmSynthetic
    internal fun getBody(): ContractNamedScheduleRetrieveBody {
        return ContractNamedScheduleRetrieveBody(
            rateCardId,
            scheduleName,
            coveringDate,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ContractNamedScheduleRetrieveBody.Builder::class)
    @NoAutoDetect
    class ContractNamedScheduleRetrieveBody
    internal constructor(
        private val rateCardId: String?,
        private val scheduleName: String?,
        private val coveringDate: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** ID of the rate card whose named schedule is to be retrieved */
        @JsonProperty("rate_card_id") fun rateCardId(): String? = rateCardId

        /** The identifier for the schedule to be retrieved */
        @JsonProperty("schedule_name") fun scheduleName(): String? = scheduleName

        /**
         * If provided, at most one schedule segment will be returned (the one that covers this
         * date). If not provided, all segments will be returned.
         */
        @JsonProperty("covering_date") fun coveringDate(): OffsetDateTime? = coveringDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var rateCardId: String? = null
            private var scheduleName: String? = null
            private var coveringDate: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                contractNamedScheduleRetrieveBody: ContractNamedScheduleRetrieveBody
            ) = apply {
                this.rateCardId = contractNamedScheduleRetrieveBody.rateCardId
                this.scheduleName = contractNamedScheduleRetrieveBody.scheduleName
                this.coveringDate = contractNamedScheduleRetrieveBody.coveringDate
                additionalProperties(contractNamedScheduleRetrieveBody.additionalProperties)
            }

            /** ID of the rate card whose named schedule is to be retrieved */
            @JsonProperty("rate_card_id")
            fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

            /** The identifier for the schedule to be retrieved */
            @JsonProperty("schedule_name")
            fun scheduleName(scheduleName: String) = apply { this.scheduleName = scheduleName }

            /**
             * If provided, at most one schedule segment will be returned (the one that covers this
             * date). If not provided, all segments will be returned.
             */
            @JsonProperty("covering_date")
            fun coveringDate(coveringDate: OffsetDateTime) = apply {
                this.coveringDate = coveringDate
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

            fun build(): ContractNamedScheduleRetrieveBody =
                ContractNamedScheduleRetrieveBody(
                    checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                    checkNotNull(scheduleName) { "`scheduleName` is required but was not set" },
                    coveringDate,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractNamedScheduleRetrieveBody && this.rateCardId == other.rateCardId && this.scheduleName == other.scheduleName && this.coveringDate == other.coveringDate && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(rateCardId, scheduleName, coveringDate, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractNamedScheduleRetrieveBody{rateCardId=$rateCardId, scheduleName=$scheduleName, coveringDate=$coveringDate, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractNamedScheduleRetrieveParams && this.rateCardId == other.rateCardId && this.scheduleName == other.scheduleName && this.coveringDate == other.coveringDate && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(rateCardId, scheduleName, coveringDate, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractNamedScheduleRetrieveParams{rateCardId=$rateCardId, scheduleName=$scheduleName, coveringDate=$coveringDate, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var rateCardId: String? = null
        private var scheduleName: String? = null
        private var coveringDate: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractNamedScheduleRetrieveParams: ContractNamedScheduleRetrieveParams
        ) = apply {
            this.rateCardId = contractNamedScheduleRetrieveParams.rateCardId
            this.scheduleName = contractNamedScheduleRetrieveParams.scheduleName
            this.coveringDate = contractNamedScheduleRetrieveParams.coveringDate
            additionalQueryParams(contractNamedScheduleRetrieveParams.additionalQueryParams)
            additionalHeaders(contractNamedScheduleRetrieveParams.additionalHeaders)
            additionalBodyProperties(contractNamedScheduleRetrieveParams.additionalBodyProperties)
        }

        /** ID of the rate card whose named schedule is to be retrieved */
        fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

        /** The identifier for the schedule to be retrieved */
        fun scheduleName(scheduleName: String) = apply { this.scheduleName = scheduleName }

        /**
         * If provided, at most one schedule segment will be returned (the one that covers this
         * date). If not provided, all segments will be returned.
         */
        fun coveringDate(coveringDate: OffsetDateTime) = apply { this.coveringDate = coveringDate }

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

        fun build(): ContractNamedScheduleRetrieveParams =
            ContractNamedScheduleRetrieveParams(
                checkNotNull(rateCardId) { "`rateCardId` is required but was not set" },
                checkNotNull(scheduleName) { "`scheduleName` is required but was not set" },
                coveringDate,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
