// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ContractNamedScheduleRetrieveParams
constructor(
    private val rateCardId: String,
    private val scheduleName: String,
    private val coveringDate: OffsetDateTime?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
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

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

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
                    additionalProperties.toImmutable(),
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

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractNamedScheduleRetrieveParams && this.rateCardId == other.rateCardId && this.scheduleName == other.scheduleName && this.coveringDate == other.coveringDate && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(rateCardId, scheduleName, coveringDate, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractNamedScheduleRetrieveParams{rateCardId=$rateCardId, scheduleName=$scheduleName, coveringDate=$coveringDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var rateCardId: String? = null
        private var scheduleName: String? = null
        private var coveringDate: OffsetDateTime? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractNamedScheduleRetrieveParams: ContractNamedScheduleRetrieveParams
        ) = apply {
            this.rateCardId = contractNamedScheduleRetrieveParams.rateCardId
            this.scheduleName = contractNamedScheduleRetrieveParams.scheduleName
            this.coveringDate = contractNamedScheduleRetrieveParams.coveringDate
            additionalHeaders(contractNamedScheduleRetrieveParams.additionalHeaders)
            additionalQueryParams(contractNamedScheduleRetrieveParams.additionalQueryParams)
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

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
