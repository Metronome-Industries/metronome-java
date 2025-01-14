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
 * Update a named schedule for the given contract. This endpoint's availability is dependent on your
 * client's configuration.
 */
class ContractRateCardNamedScheduleUpdateParams
constructor(
    private val body: ContractRateCardNamedScheduleUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** ID of the contract whose named schedule is to be updated */
    fun contractId(): String = body.contractId()

    /** ID of the customer whose named schedule is to be updated */
    fun customerId(): String = body.customerId()

    /** The identifier for the schedule to be updated */
    fun scheduleName(): String = body.scheduleName()

    fun startingAt(): OffsetDateTime = body.startingAt()

    /**
     * The value to set for the named schedule. The structure of this object is specific to the
     * named schedule.
     */
    fun _value(): JsonValue = body._value()

    fun endingBefore(): Optional<OffsetDateTime> = body.endingBefore()

    /** ID of the contract whose named schedule is to be updated */
    fun _contractId(): JsonField<String> = body._contractId()

    /** ID of the customer whose named schedule is to be updated */
    fun _customerId(): JsonField<String> = body._customerId()

    /** The identifier for the schedule to be updated */
    fun _scheduleName(): JsonField<String> = body._scheduleName()

    fun _startingAt(): JsonField<OffsetDateTime> = body._startingAt()

    fun _endingBefore(): JsonField<OffsetDateTime> = body._endingBefore()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ContractRateCardNamedScheduleUpdateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractRateCardNamedScheduleUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("contract_id")
        @ExcludeMissing
        private val contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("schedule_name")
        @ExcludeMissing
        private val scheduleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing private val value: JsonValue = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the contract whose named schedule is to be updated */
        fun contractId(): String = contractId.getRequired("contract_id")

        /** ID of the customer whose named schedule is to be updated */
        fun customerId(): String = customerId.getRequired("customer_id")

        /** The identifier for the schedule to be updated */
        fun scheduleName(): String = scheduleName.getRequired("schedule_name")

        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /**
         * The value to set for the named schedule. The structure of this object is specific to the
         * named schedule.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        /** ID of the contract whose named schedule is to be updated */
        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /** ID of the customer whose named schedule is to be updated */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** The identifier for the schedule to be updated */
        @JsonProperty("schedule_name")
        @ExcludeMissing
        fun _scheduleName(): JsonField<String> = scheduleName

        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractRateCardNamedScheduleUpdateBody = apply {
            if (validated) {
                return@apply
            }

            contractId()
            customerId()
            scheduleName()
            startingAt()
            endingBefore()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var contractId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var scheduleName: JsonField<String>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var value: JsonValue? = null
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                contractRateCardNamedScheduleUpdateBody: ContractRateCardNamedScheduleUpdateBody
            ) = apply {
                contractId = contractRateCardNamedScheduleUpdateBody.contractId
                customerId = contractRateCardNamedScheduleUpdateBody.customerId
                scheduleName = contractRateCardNamedScheduleUpdateBody.scheduleName
                startingAt = contractRateCardNamedScheduleUpdateBody.startingAt
                value = contractRateCardNamedScheduleUpdateBody.value
                endingBefore = contractRateCardNamedScheduleUpdateBody.endingBefore
                additionalProperties =
                    contractRateCardNamedScheduleUpdateBody.additionalProperties.toMutableMap()
            }

            /** ID of the contract whose named schedule is to be updated */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /** ID of the contract whose named schedule is to be updated */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            /** ID of the customer whose named schedule is to be updated */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /** ID of the customer whose named schedule is to be updated */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** The identifier for the schedule to be updated */
            fun scheduleName(scheduleName: String) = scheduleName(JsonField.of(scheduleName))

            /** The identifier for the schedule to be updated */
            fun scheduleName(scheduleName: JsonField<String>) = apply {
                this.scheduleName = scheduleName
            }

            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            /**
             * The value to set for the named schedule. The structure of this object is specific to
             * the named schedule.
             */
            fun value(value: JsonValue) = apply { this.value = value }

            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
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

            fun build(): ContractRateCardNamedScheduleUpdateBody =
                ContractRateCardNamedScheduleUpdateBody(
                    checkRequired("contractId", contractId),
                    checkRequired("customerId", customerId),
                    checkRequired("scheduleName", scheduleName),
                    checkRequired("startingAt", startingAt),
                    checkRequired("value", value),
                    endingBefore,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractRateCardNamedScheduleUpdateBody && contractId == other.contractId && customerId == other.customerId && scheduleName == other.scheduleName && startingAt == other.startingAt && value == other.value && endingBefore == other.endingBefore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contractId, customerId, scheduleName, startingAt, value, endingBefore, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractRateCardNamedScheduleUpdateBody{contractId=$contractId, customerId=$customerId, scheduleName=$scheduleName, startingAt=$startingAt, value=$value, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ContractRateCardNamedScheduleUpdateBody.Builder =
            ContractRateCardNamedScheduleUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            contractRateCardNamedScheduleUpdateParams: ContractRateCardNamedScheduleUpdateParams
        ) = apply {
            body = contractRateCardNamedScheduleUpdateParams.body.toBuilder()
            additionalHeaders =
                contractRateCardNamedScheduleUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                contractRateCardNamedScheduleUpdateParams.additionalQueryParams.toBuilder()
        }

        /** ID of the contract whose named schedule is to be updated */
        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /** ID of the contract whose named schedule is to be updated */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        /** ID of the customer whose named schedule is to be updated */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** ID of the customer whose named schedule is to be updated */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** The identifier for the schedule to be updated */
        fun scheduleName(scheduleName: String) = apply { body.scheduleName(scheduleName) }

        /** The identifier for the schedule to be updated */
        fun scheduleName(scheduleName: JsonField<String>) = apply {
            body.scheduleName(scheduleName)
        }

        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            body.startingAt(startingAt)
        }

        /**
         * The value to set for the named schedule. The structure of this object is specific to the
         * named schedule.
         */
        fun value(value: JsonValue) = apply { body.value(value) }

        fun endingBefore(endingBefore: OffsetDateTime) = apply { body.endingBefore(endingBefore) }

        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            body.endingBefore(endingBefore)
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

        fun build(): ContractRateCardNamedScheduleUpdateParams =
            ContractRateCardNamedScheduleUpdateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardNamedScheduleUpdateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractRateCardNamedScheduleUpdateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
