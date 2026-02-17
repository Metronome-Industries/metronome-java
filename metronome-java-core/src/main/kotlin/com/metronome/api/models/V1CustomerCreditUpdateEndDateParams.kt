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
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Shortens the end date of an existing customer credit to terminate it earlier than originally
 * scheduled. Only allows moving end dates forward (earlier), not extending them.
 *
 * Note: To extend credit end dates or make comprehensive edits, use the 'edit credit' endpoint
 * instead.
 */
class V1CustomerCreditUpdateEndDateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * RFC 3339 timestamp indicating when access to the credit will end and it will no longer be
     * possible to draw it down (exclusive).
     */
    fun accessEndingBefore(): OffsetDateTime = body.accessEndingBefore()

    /** ID of the commit to update */
    fun creditId(): String = body.creditId()

    /** ID of the customer whose credit is to be updated */
    fun customerId(): String = body.customerId()

    /**
     * RFC 3339 timestamp indicating when access to the credit will end and it will no longer be
     * possible to draw it down (exclusive).
     */
    fun _accessEndingBefore(): JsonField<OffsetDateTime> = body._accessEndingBefore()

    /** ID of the commit to update */
    fun _creditId(): JsonField<String> = body._creditId()

    /** ID of the customer whose credit is to be updated */
    fun _customerId(): JsonField<String> = body._customerId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("access_ending_before")
        @ExcludeMissing
        private val accessEndingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_id")
        @ExcludeMissing
        private val creditId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * RFC 3339 timestamp indicating when access to the credit will end and it will no longer be
         * possible to draw it down (exclusive).
         */
        fun accessEndingBefore(): OffsetDateTime =
            accessEndingBefore.getRequired("access_ending_before")

        /** ID of the commit to update */
        fun creditId(): String = creditId.getRequired("credit_id")

        /** ID of the customer whose credit is to be updated */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * RFC 3339 timestamp indicating when access to the credit will end and it will no longer be
         * possible to draw it down (exclusive).
         */
        @JsonProperty("access_ending_before")
        @ExcludeMissing
        fun _accessEndingBefore(): JsonField<OffsetDateTime> = accessEndingBefore

        /** ID of the commit to update */
        @JsonProperty("credit_id") @ExcludeMissing fun _creditId(): JsonField<String> = creditId

        /** ID of the customer whose credit is to be updated */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accessEndingBefore()
            creditId()
            customerId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accessEndingBefore: JsonField<OffsetDateTime>? = null
            private var creditId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accessEndingBefore = body.accessEndingBefore
                creditId = body.creditId
                customerId = body.customerId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * RFC 3339 timestamp indicating when access to the credit will end and it will no
             * longer be possible to draw it down (exclusive).
             */
            fun accessEndingBefore(accessEndingBefore: OffsetDateTime) =
                accessEndingBefore(JsonField.of(accessEndingBefore))

            /**
             * RFC 3339 timestamp indicating when access to the credit will end and it will no
             * longer be possible to draw it down (exclusive).
             */
            fun accessEndingBefore(accessEndingBefore: JsonField<OffsetDateTime>) = apply {
                this.accessEndingBefore = accessEndingBefore
            }

            /** ID of the commit to update */
            fun creditId(creditId: String) = creditId(JsonField.of(creditId))

            /** ID of the commit to update */
            fun creditId(creditId: JsonField<String>) = apply { this.creditId = creditId }

            /** ID of the customer whose credit is to be updated */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /** ID of the customer whose credit is to be updated */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

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

            fun build(): Body =
                Body(
                    checkRequired("accessEndingBefore", accessEndingBefore),
                    checkRequired("creditId", creditId),
                    checkRequired("customerId", customerId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accessEndingBefore == other.accessEndingBefore && creditId == other.creditId && customerId == other.customerId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accessEndingBefore, creditId, customerId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accessEndingBefore=$accessEndingBefore, creditId=$creditId, customerId=$customerId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1CustomerCreditUpdateEndDateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            v1CustomerCreditUpdateEndDateParams: V1CustomerCreditUpdateEndDateParams
        ) = apply {
            body = v1CustomerCreditUpdateEndDateParams.body.toBuilder()
            additionalHeaders = v1CustomerCreditUpdateEndDateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                v1CustomerCreditUpdateEndDateParams.additionalQueryParams.toBuilder()
        }

        /**
         * RFC 3339 timestamp indicating when access to the credit will end and it will no longer be
         * possible to draw it down (exclusive).
         */
        fun accessEndingBefore(accessEndingBefore: OffsetDateTime) = apply {
            body.accessEndingBefore(accessEndingBefore)
        }

        /**
         * RFC 3339 timestamp indicating when access to the credit will end and it will no longer be
         * possible to draw it down (exclusive).
         */
        fun accessEndingBefore(accessEndingBefore: JsonField<OffsetDateTime>) = apply {
            body.accessEndingBefore(accessEndingBefore)
        }

        /** ID of the commit to update */
        fun creditId(creditId: String) = apply { body.creditId(creditId) }

        /** ID of the commit to update */
        fun creditId(creditId: JsonField<String>) = apply { body.creditId(creditId) }

        /** ID of the customer whose credit is to be updated */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** ID of the customer whose credit is to be updated */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

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

        fun build(): V1CustomerCreditUpdateEndDateParams =
            V1CustomerCreditUpdateEndDateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1CustomerCreditUpdateEndDateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V1CustomerCreditUpdateEndDateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
