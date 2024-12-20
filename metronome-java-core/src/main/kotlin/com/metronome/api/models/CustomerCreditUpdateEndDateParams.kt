// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

class CustomerCreditUpdateEndDateParams
constructor(
    private val accessEndingBefore: OffsetDateTime,
    private val creditId: String,
    private val customerId: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accessEndingBefore(): OffsetDateTime = accessEndingBefore

    fun creditId(): String = creditId

    fun customerId(): String = customerId

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): CustomerCreditUpdateEndDateBody {
        return CustomerCreditUpdateEndDateBody(
            accessEndingBefore,
            creditId,
            customerId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = CustomerCreditUpdateEndDateBody.Builder::class)
    @NoAutoDetect
    class CustomerCreditUpdateEndDateBody
    internal constructor(
        private val accessEndingBefore: OffsetDateTime,
        private val creditId: String,
        private val customerId: String,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * RFC 3339 timestamp indicating when access to the credit will end and it will no longer be
         * possible to draw it down (exclusive).
         */
        @JsonProperty("access_ending_before")
        fun accessEndingBefore(): OffsetDateTime = accessEndingBefore

        /** ID of the commit to update */
        @JsonProperty("credit_id") fun creditId(): String = creditId

        /** ID of the customer whose credit is to be updated */
        @JsonProperty("customer_id") fun customerId(): String = customerId

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
                    accessEndingBefore = customerCreditUpdateEndDateBody.accessEndingBefore
                    creditId = customerCreditUpdateEndDateBody.creditId
                    customerId = customerCreditUpdateEndDateBody.customerId
                    additionalProperties =
                        customerCreditUpdateEndDateBody.additionalProperties.toMutableMap()
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

            return /* spotless:off */ other is CustomerCreditUpdateEndDateBody && accessEndingBefore == other.accessEndingBefore && creditId == other.creditId && customerId == other.customerId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accessEndingBefore, creditId, customerId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerCreditUpdateEndDateBody{accessEndingBefore=$accessEndingBefore, creditId=$creditId, customerId=$customerId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accessEndingBefore: OffsetDateTime? = null
        private var creditId: String? = null
        private var customerId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerCreditUpdateEndDateParams: CustomerCreditUpdateEndDateParams) =
            apply {
                accessEndingBefore = customerCreditUpdateEndDateParams.accessEndingBefore
                creditId = customerCreditUpdateEndDateParams.creditId
                customerId = customerCreditUpdateEndDateParams.customerId
                additionalHeaders = customerCreditUpdateEndDateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    customerCreditUpdateEndDateParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    customerCreditUpdateEndDateParams.additionalBodyProperties.toMutableMap()
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
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): CustomerCreditUpdateEndDateParams =
            CustomerCreditUpdateEndDateParams(
                checkNotNull(accessEndingBefore) {
                    "`accessEndingBefore` is required but was not set"
                },
                checkNotNull(creditId) { "`creditId` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditUpdateEndDateParams && accessEndingBefore == other.accessEndingBefore && creditId == other.creditId && customerId == other.customerId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accessEndingBefore, creditId, customerId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CustomerCreditUpdateEndDateParams{accessEndingBefore=$accessEndingBefore, creditId=$creditId, customerId=$customerId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
