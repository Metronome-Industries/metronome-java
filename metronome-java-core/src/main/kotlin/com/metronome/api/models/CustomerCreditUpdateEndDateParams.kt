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

class CustomerCreditUpdateEndDateParams
constructor(
    private val accessEndingBefore: OffsetDateTime,
    private val creditId: String,
    private val customerId: String,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accessEndingBefore(): OffsetDateTime = accessEndingBefore

    fun creditId(): String = creditId

    fun customerId(): String = customerId

    @JvmSynthetic
    internal fun getBody(): CustomerCreditUpdateEndDateBody {
        return CustomerCreditUpdateEndDateBody(
            accessEndingBefore,
            creditId,
            customerId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = CustomerCreditUpdateEndDateBody.Builder::class)
    @NoAutoDetect
    class CustomerCreditUpdateEndDateBody
    internal constructor(
        private val accessEndingBefore: OffsetDateTime?,
        private val creditId: String?,
        private val customerId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * RFC 3339 timestamp indicating when access to the credit will end and it will no longer be
         * possible to draw it down (exclusive).
         */
        @JsonProperty("access_ending_before")
        fun accessEndingBefore(): OffsetDateTime? = accessEndingBefore

        /** ID of the commit to update */
        @JsonProperty("credit_id") fun creditId(): String? = creditId

        /** ID of the customer whose credit is to be updated */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accessEndingBefore: OffsetDateTime? = null
            private var creditId: String? = null
            private var customerId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerCreditUpdateEndDateBody: CustomerCreditUpdateEndDateBody) =
                apply {
                    this.accessEndingBefore = customerCreditUpdateEndDateBody.accessEndingBefore
                    this.creditId = customerCreditUpdateEndDateBody.creditId
                    this.customerId = customerCreditUpdateEndDateBody.customerId
                    additionalProperties(customerCreditUpdateEndDateBody.additionalProperties)
                }

            /**
             * RFC 3339 timestamp indicating when access to the credit will end and it will no
             * longer be possible to draw it down (exclusive).
             */
            @JsonProperty("access_ending_before")
            fun accessEndingBefore(accessEndingBefore: OffsetDateTime) = apply {
                this.accessEndingBefore = accessEndingBefore
            }

            /** ID of the commit to update */
            @JsonProperty("credit_id")
            fun creditId(creditId: String) = apply { this.creditId = creditId }

            /** ID of the customer whose credit is to be updated */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

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

            fun build(): CustomerCreditUpdateEndDateBody =
                CustomerCreditUpdateEndDateBody(
                    checkNotNull(accessEndingBefore) {
                        "`accessEndingBefore` is required but was not set"
                    },
                    checkNotNull(creditId) { "`creditId` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerCreditUpdateEndDateBody && this.accessEndingBefore == other.accessEndingBefore && this.creditId == other.creditId && this.customerId == other.customerId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accessEndingBefore, creditId, customerId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CustomerCreditUpdateEndDateBody{accessEndingBefore=$accessEndingBefore, creditId=$creditId, customerId=$customerId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditUpdateEndDateParams && this.accessEndingBefore == other.accessEndingBefore && this.creditId == other.creditId && this.customerId == other.customerId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accessEndingBefore, creditId, customerId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CustomerCreditUpdateEndDateParams{accessEndingBefore=$accessEndingBefore, creditId=$creditId, customerId=$customerId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accessEndingBefore: OffsetDateTime? = null
        private var creditId: String? = null
        private var customerId: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerCreditUpdateEndDateParams: CustomerCreditUpdateEndDateParams) =
            apply {
                this.accessEndingBefore = customerCreditUpdateEndDateParams.accessEndingBefore
                this.creditId = customerCreditUpdateEndDateParams.creditId
                this.customerId = customerCreditUpdateEndDateParams.customerId
                additionalHeaders(customerCreditUpdateEndDateParams.additionalHeaders)
                additionalQueryParams(customerCreditUpdateEndDateParams.additionalQueryParams)
                additionalBodyProperties(customerCreditUpdateEndDateParams.additionalBodyProperties)
            }

        /**
         * RFC 3339 timestamp indicating when access to the credit will end and it will no longer be
         * possible to draw it down (exclusive).
         */
        fun accessEndingBefore(accessEndingBefore: OffsetDateTime) = apply {
            this.accessEndingBefore = accessEndingBefore
        }

        /** ID of the commit to update */
        fun creditId(creditId: String) = apply { this.creditId = creditId }

        /** ID of the customer whose credit is to be updated */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

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

        fun build(): CustomerCreditUpdateEndDateParams =
            CustomerCreditUpdateEndDateParams(
                checkNotNull(accessEndingBefore) {
                    "`accessEndingBefore` is required but was not set"
                },
                checkNotNull(creditId) { "`creditId` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
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
