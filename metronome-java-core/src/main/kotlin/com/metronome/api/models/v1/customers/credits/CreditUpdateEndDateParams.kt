// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.credits

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Shortens the end date of an existing customer credit to terminate it earlier than originally
 * scheduled. Only allows moving end dates forward (earlier), not extending them.
 *
 * Note: To extend credit end dates or make comprehensive edits, use the 'edit credit' endpoint
 * instead.
 */
class CreditUpdateEndDateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * RFC 3339 timestamp indicating when access to the credit will end and it will no longer be
     * possible to draw it down (exclusive).
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accessEndingBefore(): OffsetDateTime = body.accessEndingBefore()

    /**
     * ID of the commit to update
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditId(): String = body.creditId()

    /**
     * ID of the customer whose credit is to be updated
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * Returns the raw JSON value of [accessEndingBefore].
     *
     * Unlike [accessEndingBefore], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _accessEndingBefore(): JsonField<OffsetDateTime> = body._accessEndingBefore()

    /**
     * Returns the raw JSON value of [creditId].
     *
     * Unlike [creditId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditId(): JsonField<String> = body._creditId()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditUpdateEndDateParams].
         *
         * The following fields are required:
         * ```java
         * .accessEndingBefore()
         * .creditId()
         * .customerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditUpdateEndDateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(creditUpdateEndDateParams: CreditUpdateEndDateParams) = apply {
            body = creditUpdateEndDateParams.body.toBuilder()
            additionalHeaders = creditUpdateEndDateParams.additionalHeaders.toBuilder()
            additionalQueryParams = creditUpdateEndDateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accessEndingBefore]
         * - [creditId]
         * - [customerId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * RFC 3339 timestamp indicating when access to the credit will end and it will no longer be
         * possible to draw it down (exclusive).
         */
        fun accessEndingBefore(accessEndingBefore: OffsetDateTime) = apply {
            body.accessEndingBefore(accessEndingBefore)
        }

        /**
         * Sets [Builder.accessEndingBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessEndingBefore] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accessEndingBefore(accessEndingBefore: JsonField<OffsetDateTime>) = apply {
            body.accessEndingBefore(accessEndingBefore)
        }

        /** ID of the commit to update */
        fun creditId(creditId: String) = apply { body.creditId(creditId) }

        /**
         * Sets [Builder.creditId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun creditId(creditId: JsonField<String>) = apply { body.creditId(creditId) }

        /** ID of the customer whose credit is to be updated */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        /**
         * Returns an immutable instance of [CreditUpdateEndDateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accessEndingBefore()
         * .creditId()
         * .customerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditUpdateEndDateParams =
            CreditUpdateEndDateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accessEndingBefore: JsonField<OffsetDateTime>,
        private val creditId: JsonField<String>,
        private val customerId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("access_ending_before")
            @ExcludeMissing
            accessEndingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("credit_id")
            @ExcludeMissing
            creditId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
        ) : this(accessEndingBefore, creditId, customerId, mutableMapOf())

        /**
         * RFC 3339 timestamp indicating when access to the credit will end and it will no longer be
         * possible to draw it down (exclusive).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accessEndingBefore(): OffsetDateTime =
            accessEndingBefore.getRequired("access_ending_before")

        /**
         * ID of the commit to update
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditId(): String = creditId.getRequired("credit_id")

        /**
         * ID of the customer whose credit is to be updated
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * Returns the raw JSON value of [accessEndingBefore].
         *
         * Unlike [accessEndingBefore], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("access_ending_before")
        @ExcludeMissing
        fun _accessEndingBefore(): JsonField<OffsetDateTime> = accessEndingBefore

        /**
         * Returns the raw JSON value of [creditId].
         *
         * Unlike [creditId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_id") @ExcludeMissing fun _creditId(): JsonField<String> = creditId

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .accessEndingBefore()
             * .creditId()
             * .customerId()
             * ```
             */
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
             * Sets [Builder.accessEndingBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accessEndingBefore] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun accessEndingBefore(accessEndingBefore: JsonField<OffsetDateTime>) = apply {
                this.accessEndingBefore = accessEndingBefore
            }

            /** ID of the commit to update */
            fun creditId(creditId: String) = creditId(JsonField.of(creditId))

            /**
             * Sets [Builder.creditId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditId(creditId: JsonField<String>) = apply { this.creditId = creditId }

            /** ID of the customer whose credit is to be updated */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accessEndingBefore()
             * .creditId()
             * .customerId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accessEndingBefore", accessEndingBefore),
                    checkRequired("creditId", creditId),
                    checkRequired("customerId", customerId),
                    additionalProperties.toMutableMap(),
                )
        }

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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (accessEndingBefore.asKnown().isPresent) 1 else 0) +
                (if (creditId.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accessEndingBefore == other.accessEndingBefore &&
                creditId == other.creditId &&
                customerId == other.customerId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accessEndingBefore, creditId, customerId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accessEndingBefore=$accessEndingBefore, creditId=$creditId, customerId=$customerId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditUpdateEndDateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CreditUpdateEndDateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
