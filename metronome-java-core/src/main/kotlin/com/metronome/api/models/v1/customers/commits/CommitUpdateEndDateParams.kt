// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.commits

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
import java.util.Optional

/**
 * Shortens the end date of a prepaid commit to terminate it earlier than originally scheduled. Use
 * this endpoint when you need to cancel or reduce the duration of an existing prepaid commit. Only
 * works with prepaid commit types and can only move the end date forward (earlier), not extend it.
 *
 * ### Usage guidelines:
 * To extend commit end dates or make other comprehensive edits, use the 'edit commit' endpoint
 * instead.
 */
class CommitUpdateEndDateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * ID of the commit to update. Only supports "PREPAID" commits.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun commitId(): String = body.commitId()

    /**
     * ID of the customer whose commit is to be updated
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * RFC 3339 timestamp indicating when access to the commit will end and it will no longer be
     * possible to draw it down (exclusive). If not provided, the access will not be updated.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accessEndingBefore(): Optional<OffsetDateTime> = body.accessEndingBefore()

    /**
     * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive). If not
     * provided, the invoice schedule will not be updated.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoicesEndingBefore(): Optional<OffsetDateTime> = body.invoicesEndingBefore()

    /**
     * Returns the raw JSON value of [commitId].
     *
     * Unlike [commitId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commitId(): JsonField<String> = body._commitId()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [accessEndingBefore].
     *
     * Unlike [accessEndingBefore], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _accessEndingBefore(): JsonField<OffsetDateTime> = body._accessEndingBefore()

    /**
     * Returns the raw JSON value of [invoicesEndingBefore].
     *
     * Unlike [invoicesEndingBefore], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _invoicesEndingBefore(): JsonField<OffsetDateTime> = body._invoicesEndingBefore()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommitUpdateEndDateParams].
         *
         * The following fields are required:
         * ```java
         * .commitId()
         * .customerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitUpdateEndDateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(commitUpdateEndDateParams: CommitUpdateEndDateParams) = apply {
            body = commitUpdateEndDateParams.body.toBuilder()
            additionalHeaders = commitUpdateEndDateParams.additionalHeaders.toBuilder()
            additionalQueryParams = commitUpdateEndDateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [commitId]
         * - [customerId]
         * - [accessEndingBefore]
         * - [invoicesEndingBefore]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** ID of the commit to update. Only supports "PREPAID" commits. */
        fun commitId(commitId: String) = apply { body.commitId(commitId) }

        /**
         * Sets [Builder.commitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commitId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun commitId(commitId: JsonField<String>) = apply { body.commitId(commitId) }

        /** ID of the customer whose commit is to be updated */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * RFC 3339 timestamp indicating when access to the commit will end and it will no longer be
         * possible to draw it down (exclusive). If not provided, the access will not be updated.
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

        /**
         * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive). If
         * not provided, the invoice schedule will not be updated.
         */
        fun invoicesEndingBefore(invoicesEndingBefore: OffsetDateTime) = apply {
            body.invoicesEndingBefore(invoicesEndingBefore)
        }

        /**
         * Sets [Builder.invoicesEndingBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoicesEndingBefore] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun invoicesEndingBefore(invoicesEndingBefore: JsonField<OffsetDateTime>) = apply {
            body.invoicesEndingBefore(invoicesEndingBefore)
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

        /**
         * Returns an immutable instance of [CommitUpdateEndDateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .commitId()
         * .customerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CommitUpdateEndDateParams =
            CommitUpdateEndDateParams(
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
        private val commitId: JsonField<String>,
        private val customerId: JsonField<String>,
        private val accessEndingBefore: JsonField<OffsetDateTime>,
        private val invoicesEndingBefore: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("commit_id")
            @ExcludeMissing
            commitId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("access_ending_before")
            @ExcludeMissing
            accessEndingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("invoices_ending_before")
            @ExcludeMissing
            invoicesEndingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(commitId, customerId, accessEndingBefore, invoicesEndingBefore, mutableMapOf())

        /**
         * ID of the commit to update. Only supports "PREPAID" commits.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun commitId(): String = commitId.getRequired("commit_id")

        /**
         * ID of the customer whose commit is to be updated
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * RFC 3339 timestamp indicating when access to the commit will end and it will no longer be
         * possible to draw it down (exclusive). If not provided, the access will not be updated.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accessEndingBefore(): Optional<OffsetDateTime> =
            accessEndingBefore.getOptional("access_ending_before")

        /**
         * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive). If
         * not provided, the invoice schedule will not be updated.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoicesEndingBefore(): Optional<OffsetDateTime> =
            invoicesEndingBefore.getOptional("invoices_ending_before")

        /**
         * Returns the raw JSON value of [commitId].
         *
         * Unlike [commitId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commit_id") @ExcludeMissing fun _commitId(): JsonField<String> = commitId

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

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
         * Returns the raw JSON value of [invoicesEndingBefore].
         *
         * Unlike [invoicesEndingBefore], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("invoices_ending_before")
        @ExcludeMissing
        fun _invoicesEndingBefore(): JsonField<OffsetDateTime> = invoicesEndingBefore

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
             * .commitId()
             * .customerId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var commitId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var accessEndingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var invoicesEndingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                commitId = body.commitId
                customerId = body.customerId
                accessEndingBefore = body.accessEndingBefore
                invoicesEndingBefore = body.invoicesEndingBefore
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** ID of the commit to update. Only supports "PREPAID" commits. */
            fun commitId(commitId: String) = commitId(JsonField.of(commitId))

            /**
             * Sets [Builder.commitId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commitId(commitId: JsonField<String>) = apply { this.commitId = commitId }

            /** ID of the customer whose commit is to be updated */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * RFC 3339 timestamp indicating when access to the commit will end and it will no
             * longer be possible to draw it down (exclusive). If not provided, the access will not
             * be updated.
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

            /**
             * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive).
             * If not provided, the invoice schedule will not be updated.
             */
            fun invoicesEndingBefore(invoicesEndingBefore: OffsetDateTime) =
                invoicesEndingBefore(JsonField.of(invoicesEndingBefore))

            /**
             * Sets [Builder.invoicesEndingBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoicesEndingBefore] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun invoicesEndingBefore(invoicesEndingBefore: JsonField<OffsetDateTime>) = apply {
                this.invoicesEndingBefore = invoicesEndingBefore
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .commitId()
             * .customerId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("commitId", commitId),
                    checkRequired("customerId", customerId),
                    accessEndingBefore,
                    invoicesEndingBefore,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            commitId()
            customerId()
            accessEndingBefore()
            invoicesEndingBefore()
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
            (if (commitId.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (accessEndingBefore.asKnown().isPresent) 1 else 0) +
                (if (invoicesEndingBefore.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                commitId == other.commitId &&
                customerId == other.customerId &&
                accessEndingBefore == other.accessEndingBefore &&
                invoicesEndingBefore == other.invoicesEndingBefore &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                commitId,
                customerId,
                accessEndingBefore,
                invoicesEndingBefore,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{commitId=$commitId, customerId=$customerId, accessEndingBefore=$accessEndingBefore, invoicesEndingBefore=$invoicesEndingBefore, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitUpdateEndDateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CommitUpdateEndDateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
