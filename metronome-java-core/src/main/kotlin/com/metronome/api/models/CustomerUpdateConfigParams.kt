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
import com.metronome.api.models.*
import java.util.Objects
import java.util.Optional

class CustomerUpdateConfigParams
constructor(
    private val customerId: String,
    private val leaveStripeInvoicesInDraft: Boolean?,
    private val salesforceAccountId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun leaveStripeInvoicesInDraft(): Optional<Boolean> =
        Optional.ofNullable(leaveStripeInvoicesInDraft)

    fun salesforceAccountId(): Optional<String> = Optional.ofNullable(salesforceAccountId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): CustomerUpdateConfigBody {
        return CustomerUpdateConfigBody(
            leaveStripeInvoicesInDraft,
            salesforceAccountId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    @JsonDeserialize(builder = CustomerUpdateConfigBody.Builder::class)
    @NoAutoDetect
    class CustomerUpdateConfigBody
    internal constructor(
        private val leaveStripeInvoicesInDraft: Boolean?,
        private val salesforceAccountId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Leave in draft or set to auto-advance on invoices sent to Stripe. Falls back to the
         * client-level config if unset, which defaults to true if unset.
         */
        @JsonProperty("leave_stripe_invoices_in_draft")
        fun leaveStripeInvoicesInDraft(): Boolean? = leaveStripeInvoicesInDraft

        /** The Salesforce account ID for the customer */
        @JsonProperty("salesforce_account_id")
        fun salesforceAccountId(): String? = salesforceAccountId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var leaveStripeInvoicesInDraft: Boolean? = null
            private var salesforceAccountId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerUpdateConfigBody: CustomerUpdateConfigBody) = apply {
                this.leaveStripeInvoicesInDraft =
                    customerUpdateConfigBody.leaveStripeInvoicesInDraft
                this.salesforceAccountId = customerUpdateConfigBody.salesforceAccountId
                additionalProperties(customerUpdateConfigBody.additionalProperties)
            }

            /**
             * Leave in draft or set to auto-advance on invoices sent to Stripe. Falls back to the
             * client-level config if unset, which defaults to true if unset.
             */
            @JsonProperty("leave_stripe_invoices_in_draft")
            fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: Boolean) = apply {
                this.leaveStripeInvoicesInDraft = leaveStripeInvoicesInDraft
            }

            /** The Salesforce account ID for the customer */
            @JsonProperty("salesforce_account_id")
            fun salesforceAccountId(salesforceAccountId: String) = apply {
                this.salesforceAccountId = salesforceAccountId
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

            fun build(): CustomerUpdateConfigBody =
                CustomerUpdateConfigBody(
                    leaveStripeInvoicesInDraft,
                    salesforceAccountId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerUpdateConfigBody && leaveStripeInvoicesInDraft == other.leaveStripeInvoicesInDraft && salesforceAccountId == other.salesforceAccountId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(leaveStripeInvoicesInDraft, salesforceAccountId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerUpdateConfigBody{leaveStripeInvoicesInDraft=$leaveStripeInvoicesInDraft, salesforceAccountId=$salesforceAccountId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var leaveStripeInvoicesInDraft: Boolean? = null
        private var salesforceAccountId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerUpdateConfigParams: CustomerUpdateConfigParams) = apply {
            customerId = customerUpdateConfigParams.customerId
            leaveStripeInvoicesInDraft = customerUpdateConfigParams.leaveStripeInvoicesInDraft
            salesforceAccountId = customerUpdateConfigParams.salesforceAccountId
            additionalHeaders = customerUpdateConfigParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerUpdateConfigParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                customerUpdateConfigParams.additionalBodyProperties.toMutableMap()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * Leave in draft or set to auto-advance on invoices sent to Stripe. Falls back to the
         * client-level config if unset, which defaults to true if unset.
         */
        fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: Boolean) = apply {
            this.leaveStripeInvoicesInDraft = leaveStripeInvoicesInDraft
        }

        /** The Salesforce account ID for the customer */
        fun salesforceAccountId(salesforceAccountId: String) = apply {
            this.salesforceAccountId = salesforceAccountId
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

        fun build(): CustomerUpdateConfigParams =
            CustomerUpdateConfigParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                leaveStripeInvoicesInDraft,
                salesforceAccountId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerUpdateConfigParams && customerId == other.customerId && leaveStripeInvoicesInDraft == other.leaveStripeInvoicesInDraft && salesforceAccountId == other.salesforceAccountId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, leaveStripeInvoicesInDraft, salesforceAccountId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CustomerUpdateConfigParams{customerId=$customerId, leaveStripeInvoicesInDraft=$leaveStripeInvoicesInDraft, salesforceAccountId=$salesforceAccountId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
