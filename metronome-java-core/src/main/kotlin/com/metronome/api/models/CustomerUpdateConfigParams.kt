// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.models.*
import java.util.Objects
import java.util.Optional

class CustomerUpdateConfigParams
constructor(
    private val customerId: String,
    private val leaveStripeInvoicesInDraft: Boolean?,
    private val salesforceAccountId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun leaveStripeInvoicesInDraft(): Optional<Boolean> =
        Optional.ofNullable(leaveStripeInvoicesInDraft)

    fun salesforceAccountId(): Optional<String> = Optional.ofNullable(salesforceAccountId)

    @JvmSynthetic
    internal fun getBody(): CustomerUpdateConfigBody {
        return CustomerUpdateConfigBody(
            leaveStripeInvoicesInDraft,
            salesforceAccountId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerUpdateConfigBody && this.leaveStripeInvoicesInDraft == other.leaveStripeInvoicesInDraft && this.salesforceAccountId == other.salesforceAccountId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(leaveStripeInvoicesInDraft, salesforceAccountId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CustomerUpdateConfigBody{leaveStripeInvoicesInDraft=$leaveStripeInvoicesInDraft, salesforceAccountId=$salesforceAccountId, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerUpdateConfigParams && this.customerId == other.customerId && this.leaveStripeInvoicesInDraft == other.leaveStripeInvoicesInDraft && this.salesforceAccountId == other.salesforceAccountId && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, leaveStripeInvoicesInDraft, salesforceAccountId, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CustomerUpdateConfigParams{customerId=$customerId, leaveStripeInvoicesInDraft=$leaveStripeInvoicesInDraft, salesforceAccountId=$salesforceAccountId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var leaveStripeInvoicesInDraft: Boolean? = null
        private var salesforceAccountId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerUpdateConfigParams: CustomerUpdateConfigParams) = apply {
            this.customerId = customerUpdateConfigParams.customerId
            this.leaveStripeInvoicesInDraft = customerUpdateConfigParams.leaveStripeInvoicesInDraft
            this.salesforceAccountId = customerUpdateConfigParams.salesforceAccountId
            additionalQueryParams(customerUpdateConfigParams.additionalQueryParams)
            additionalHeaders(customerUpdateConfigParams.additionalHeaders)
            additionalBodyProperties(customerUpdateConfigParams.additionalBodyProperties)
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

        fun build(): CustomerUpdateConfigParams =
            CustomerUpdateConfigParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                leaveStripeInvoicesInDraft,
                salesforceAccountId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
