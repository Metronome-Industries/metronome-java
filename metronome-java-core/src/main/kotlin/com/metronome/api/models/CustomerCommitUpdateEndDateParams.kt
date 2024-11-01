// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class CustomerCommitUpdateEndDateParams
constructor(
    private val commitId: String,
    private val customerId: String,
    private val accessEndingBefore: OffsetDateTime?,
    private val invoicesEndingBefore: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun commitId(): String = commitId

    fun customerId(): String = customerId

    fun accessEndingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(accessEndingBefore)

    fun invoicesEndingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(invoicesEndingBefore)

    @JvmSynthetic
    internal fun getBody(): CustomerCommitUpdateEndDateBody {
        return CustomerCommitUpdateEndDateBody(
            commitId,
            customerId,
            accessEndingBefore,
            invoicesEndingBefore,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CustomerCommitUpdateEndDateBody.Builder::class)
    @NoAutoDetect
    class CustomerCommitUpdateEndDateBody
    internal constructor(
        private val commitId: String?,
        private val customerId: String?,
        private val accessEndingBefore: OffsetDateTime?,
        private val invoicesEndingBefore: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** ID of the commit to update. Only supports "PREPAID" commits. */
        @JsonProperty("commit_id") fun commitId(): String? = commitId

        /** ID of the customer whose commit is to be updated */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /**
         * RFC 3339 timestamp indicating when access to the commit will end and it will no longer be
         * possible to draw it down (exclusive). If not provided, the access will not be updated.
         */
        @JsonProperty("access_ending_before")
        fun accessEndingBefore(): OffsetDateTime? = accessEndingBefore

        /**
         * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive). If
         * not provided, the invoice schedule will not be updated.
         */
        @JsonProperty("invoices_ending_before")
        fun invoicesEndingBefore(): OffsetDateTime? = invoicesEndingBefore

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
                    this.commitId = customerCommitUpdateEndDateBody.commitId
                    this.customerId = customerCommitUpdateEndDateBody.customerId
                    this.accessEndingBefore = customerCommitUpdateEndDateBody.accessEndingBefore
                    this.invoicesEndingBefore = customerCommitUpdateEndDateBody.invoicesEndingBefore
                    additionalProperties(customerCommitUpdateEndDateBody.additionalProperties)
                }

            /** ID of the commit to update. Only supports "PREPAID" commits. */
            @JsonProperty("commit_id")
            fun commitId(commitId: String) = apply { this.commitId = commitId }

            /** ID of the customer whose commit is to be updated */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * RFC 3339 timestamp indicating when access to the commit will end and it will no
             * longer be possible to draw it down (exclusive). If not provided, the access will not
             * be updated.
             */
            @JsonProperty("access_ending_before")
            fun accessEndingBefore(accessEndingBefore: OffsetDateTime) = apply {
                this.accessEndingBefore = accessEndingBefore
            }

            /**
             * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive).
             * If not provided, the invoice schedule will not be updated.
             */
            @JsonProperty("invoices_ending_before")
            fun invoicesEndingBefore(invoicesEndingBefore: OffsetDateTime) = apply {
                this.invoicesEndingBefore = invoicesEndingBefore
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

            return /* spotless:off */ other is CustomerCommitUpdateEndDateBody && this.commitId == other.commitId && this.customerId == other.customerId && this.accessEndingBefore == other.accessEndingBefore && this.invoicesEndingBefore == other.invoicesEndingBefore && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(commitId, customerId, accessEndingBefore, invoicesEndingBefore, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CustomerCommitUpdateEndDateBody{commitId=$commitId, customerId=$customerId, accessEndingBefore=$accessEndingBefore, invoicesEndingBefore=$invoicesEndingBefore, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCommitUpdateEndDateParams && this.commitId == other.commitId && this.customerId == other.customerId && this.accessEndingBefore == other.accessEndingBefore && this.invoicesEndingBefore == other.invoicesEndingBefore && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(commitId, customerId, accessEndingBefore, invoicesEndingBefore, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CustomerCommitUpdateEndDateParams{commitId=$commitId, customerId=$customerId, accessEndingBefore=$accessEndingBefore, invoicesEndingBefore=$invoicesEndingBefore, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var commitId: String? = null
        private var customerId: String? = null
        private var accessEndingBefore: OffsetDateTime? = null
        private var invoicesEndingBefore: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerCommitUpdateEndDateParams: CustomerCommitUpdateEndDateParams) =
            apply {
                this.commitId = customerCommitUpdateEndDateParams.commitId
                this.customerId = customerCommitUpdateEndDateParams.customerId
                this.accessEndingBefore = customerCommitUpdateEndDateParams.accessEndingBefore
                this.invoicesEndingBefore = customerCommitUpdateEndDateParams.invoicesEndingBefore
                additionalQueryParams(customerCommitUpdateEndDateParams.additionalQueryParams)
                additionalHeaders(customerCommitUpdateEndDateParams.additionalHeaders)
                additionalBodyProperties(customerCommitUpdateEndDateParams.additionalBodyProperties)
            }

        /** ID of the commit to update. Only supports "PREPAID" commits. */
        fun commitId(commitId: String) = apply { this.commitId = commitId }

        /** ID of the customer whose commit is to be updated */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * RFC 3339 timestamp indicating when access to the commit will end and it will no longer be
         * possible to draw it down (exclusive). If not provided, the access will not be updated.
         */
        fun accessEndingBefore(accessEndingBefore: OffsetDateTime) = apply {
            this.accessEndingBefore = accessEndingBefore
        }

        /**
         * RFC 3339 timestamp indicating when the commit will stop being invoiced (exclusive). If
         * not provided, the invoice schedule will not be updated.
         */
        fun invoicesEndingBefore(invoicesEndingBefore: OffsetDateTime) = apply {
            this.invoicesEndingBefore = invoicesEndingBefore
        }

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

        fun build(): CustomerCommitUpdateEndDateParams =
            CustomerCommitUpdateEndDateParams(
                checkNotNull(commitId) { "`commitId` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                accessEndingBefore,
                invoicesEndingBefore,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
