// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class CustomerCommitUpdateEndDateParams
constructor(
    private val body: CustomerCommitUpdateEndDateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): CustomerCommitUpdateEndDateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CustomerCommitUpdateEndDateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("commit_id") private val commitId: String,
        @JsonProperty("customer_id") private val customerId: String,
        @JsonProperty("access_ending_before") private val accessEndingBefore: OffsetDateTime?,
        @JsonProperty("invoices_ending_before") private val invoicesEndingBefore: OffsetDateTime?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the commit to update. Only supports "PREPAID" commits. */
        @JsonProperty("commit_id") fun commitId(): String = commitId

        /** ID of the customer whose commit is to be updated */
        @JsonProperty("customer_id") fun customerId(): String = customerId

        /**
         * RFC 3339 timestamp indicating when access to the commit will end and it will no longer be
         * possible to draw it down (exclusive). If not provided, the access will not be updated.
         */
        @JsonProperty("access_ending_before")
        fun accessEndingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(accessEndingBefore)

        /**
         * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive). If
         * not provided, the invoice schedule will not be updated.
         */
        @JsonProperty("invoices_ending_before")
        fun invoicesEndingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(invoicesEndingBefore)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var commitId: String? = null
            private var customerId: String? = null
            private var accessEndingBefore: OffsetDateTime? = null
            private var invoicesEndingBefore: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerCommitUpdateEndDateBody: CustomerCommitUpdateEndDateBody) =
                apply {
                    commitId = customerCommitUpdateEndDateBody.commitId
                    customerId = customerCommitUpdateEndDateBody.customerId
                    accessEndingBefore = customerCommitUpdateEndDateBody.accessEndingBefore
                    invoicesEndingBefore = customerCommitUpdateEndDateBody.invoicesEndingBefore
                    additionalProperties =
                        customerCommitUpdateEndDateBody.additionalProperties.toMutableMap()
                }

            /** ID of the commit to update. Only supports "PREPAID" commits. */
            fun commitId(commitId: String) = apply { this.commitId = commitId }

            /** ID of the customer whose commit is to be updated */
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * RFC 3339 timestamp indicating when access to the commit will end and it will no
             * longer be possible to draw it down (exclusive). If not provided, the access will not
             * be updated.
             */
            fun accessEndingBefore(accessEndingBefore: OffsetDateTime?) = apply {
                this.accessEndingBefore = accessEndingBefore
            }

            /**
             * RFC 3339 timestamp indicating when access to the commit will end and it will no
             * longer be possible to draw it down (exclusive). If not provided, the access will not
             * be updated.
             */
            fun accessEndingBefore(accessEndingBefore: Optional<OffsetDateTime>) =
                accessEndingBefore(accessEndingBefore.orElse(null))

            /**
             * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive).
             * If not provided, the invoice schedule will not be updated.
             */
            fun invoicesEndingBefore(invoicesEndingBefore: OffsetDateTime?) = apply {
                this.invoicesEndingBefore = invoicesEndingBefore
            }

            /**
             * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive).
             * If not provided, the invoice schedule will not be updated.
             */
            fun invoicesEndingBefore(invoicesEndingBefore: Optional<OffsetDateTime>) =
                invoicesEndingBefore(invoicesEndingBefore.orElse(null))

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

            fun build(): CustomerCommitUpdateEndDateBody =
                CustomerCommitUpdateEndDateBody(
                    checkNotNull(commitId) { "`commitId` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    accessEndingBefore,
                    invoicesEndingBefore,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerCommitUpdateEndDateBody && commitId == other.commitId && customerId == other.customerId && accessEndingBefore == other.accessEndingBefore && invoicesEndingBefore == other.invoicesEndingBefore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(commitId, customerId, accessEndingBefore, invoicesEndingBefore, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerCommitUpdateEndDateBody{commitId=$commitId, customerId=$customerId, accessEndingBefore=$accessEndingBefore, invoicesEndingBefore=$invoicesEndingBefore, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: CustomerCommitUpdateEndDateBody.Builder =
            CustomerCommitUpdateEndDateBody.builder()
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

        /** ID of the customer whose commit is to be updated */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * RFC 3339 timestamp indicating when access to the commit will end and it will no longer be
         * possible to draw it down (exclusive). If not provided, the access will not be updated.
         */
        fun accessEndingBefore(accessEndingBefore: OffsetDateTime?) = apply {
            body.accessEndingBefore(accessEndingBefore)
        }

        /**
         * RFC 3339 timestamp indicating when access to the commit will end and it will no longer be
         * possible to draw it down (exclusive). If not provided, the access will not be updated.
         */
        fun accessEndingBefore(accessEndingBefore: Optional<OffsetDateTime>) =
            accessEndingBefore(accessEndingBefore.orElse(null))

        /**
         * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive). If
         * not provided, the invoice schedule will not be updated.
         */
        fun invoicesEndingBefore(invoicesEndingBefore: OffsetDateTime?) = apply {
            body.invoicesEndingBefore(invoicesEndingBefore)
        }

        /**
         * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive). If
         * not provided, the invoice schedule will not be updated.
         */
        fun invoicesEndingBefore(invoicesEndingBefore: Optional<OffsetDateTime>) =
            invoicesEndingBefore(invoicesEndingBefore.orElse(null))

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
