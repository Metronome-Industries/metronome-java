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
import java.util.Optional

/** Update the end date of a PREPAID commit */
class CustomerCommitUpdateEndDateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** ID of the commit to update. Only supports "PREPAID" commits. */
    fun commitId(): String = body.commitId()

    /** ID of the customer whose commit is to be updated */
    fun customerId(): String = body.customerId()

    /**
     * RFC 3339 timestamp indicating when access to the commit will end and it will no longer be
     * possible to draw it down (exclusive). If not provided, the access will not be updated.
     */
    fun accessEndingBefore(): Optional<OffsetDateTime> = body.accessEndingBefore()

    /**
     * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive). If not
     * provided, the invoice schedule will not be updated.
     */
    fun invoicesEndingBefore(): Optional<OffsetDateTime> = body.invoicesEndingBefore()

    /** ID of the commit to update. Only supports "PREPAID" commits. */
    fun _commitId(): JsonField<String> = body._commitId()

    /** ID of the customer whose commit is to be updated */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * RFC 3339 timestamp indicating when access to the commit will end and it will no longer be
     * possible to draw it down (exclusive). If not provided, the access will not be updated.
     */
    fun _accessEndingBefore(): JsonField<OffsetDateTime> = body._accessEndingBefore()

    /**
     * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive). If not
     * provided, the invoice schedule will not be updated.
     */
    fun _invoicesEndingBefore(): JsonField<OffsetDateTime> = body._invoicesEndingBefore()

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
        @JsonProperty("commit_id")
        @ExcludeMissing
        private val commitId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("access_ending_before")
        @ExcludeMissing
        private val accessEndingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("invoices_ending_before")
        @ExcludeMissing
        private val invoicesEndingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the commit to update. Only supports "PREPAID" commits. */
        fun commitId(): String = commitId.getRequired("commit_id")

        /** ID of the customer whose commit is to be updated */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * RFC 3339 timestamp indicating when access to the commit will end and it will no longer be
         * possible to draw it down (exclusive). If not provided, the access will not be updated.
         */
        fun accessEndingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(accessEndingBefore.getNullable("access_ending_before"))

        /**
         * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive). If
         * not provided, the invoice schedule will not be updated.
         */
        fun invoicesEndingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(invoicesEndingBefore.getNullable("invoices_ending_before"))

        /** ID of the commit to update. Only supports "PREPAID" commits. */
        @JsonProperty("commit_id") @ExcludeMissing fun _commitId(): JsonField<String> = commitId

        /** ID of the customer whose commit is to be updated */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * RFC 3339 timestamp indicating when access to the commit will end and it will no longer be
         * possible to draw it down (exclusive). If not provided, the access will not be updated.
         */
        @JsonProperty("access_ending_before")
        @ExcludeMissing
        fun _accessEndingBefore(): JsonField<OffsetDateTime> = accessEndingBefore

        /**
         * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive). If
         * not provided, the invoice schedule will not be updated.
         */
        @JsonProperty("invoices_ending_before")
        @ExcludeMissing
        fun _invoicesEndingBefore(): JsonField<OffsetDateTime> = invoicesEndingBefore

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** ID of the commit to update. Only supports "PREPAID" commits. */
            fun commitId(commitId: JsonField<String>) = apply { this.commitId = commitId }

            /** ID of the customer whose commit is to be updated */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /** ID of the customer whose commit is to be updated */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * RFC 3339 timestamp indicating when access to the commit will end and it will no
             * longer be possible to draw it down (exclusive). If not provided, the access will not
             * be updated.
             */
            fun accessEndingBefore(accessEndingBefore: OffsetDateTime) =
                accessEndingBefore(JsonField.of(accessEndingBefore))

            /**
             * RFC 3339 timestamp indicating when access to the commit will end and it will no
             * longer be possible to draw it down (exclusive). If not provided, the access will not
             * be updated.
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
             * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive).
             * If not provided, the invoice schedule will not be updated.
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

            fun build(): Body =
                Body(
                    checkRequired("commitId", commitId),
                    checkRequired("customerId", customerId),
                    accessEndingBefore,
                    invoicesEndingBefore,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && commitId == other.commitId && customerId == other.customerId && accessEndingBefore == other.accessEndingBefore && invoicesEndingBefore == other.invoicesEndingBefore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(commitId, customerId, accessEndingBefore, invoicesEndingBefore, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{commitId=$commitId, customerId=$customerId, accessEndingBefore=$accessEndingBefore, invoicesEndingBefore=$invoicesEndingBefore, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerCommitUpdateEndDateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerCommitUpdateEndDateParams: CustomerCommitUpdateEndDateParams) =
            apply {
                body = customerCommitUpdateEndDateParams.body.toBuilder()
                additionalHeaders = customerCommitUpdateEndDateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    customerCommitUpdateEndDateParams.additionalQueryParams.toBuilder()
            }

        /** ID of the commit to update. Only supports "PREPAID" commits. */
        fun commitId(commitId: String) = apply { body.commitId(commitId) }

        /** ID of the commit to update. Only supports "PREPAID" commits. */
        fun commitId(commitId: JsonField<String>) = apply { body.commitId(commitId) }

        /** ID of the customer whose commit is to be updated */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** ID of the customer whose commit is to be updated */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * RFC 3339 timestamp indicating when access to the commit will end and it will no longer be
         * possible to draw it down (exclusive). If not provided, the access will not be updated.
         */
        fun accessEndingBefore(accessEndingBefore: OffsetDateTime) = apply {
            body.accessEndingBefore(accessEndingBefore)
        }

        /**
         * RFC 3339 timestamp indicating when access to the commit will end and it will no longer be
         * possible to draw it down (exclusive). If not provided, the access will not be updated.
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
         * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive). If
         * not provided, the invoice schedule will not be updated.
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

        fun build(): CustomerCommitUpdateEndDateParams =
            CustomerCommitUpdateEndDateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCommitUpdateEndDateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCommitUpdateEndDateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
