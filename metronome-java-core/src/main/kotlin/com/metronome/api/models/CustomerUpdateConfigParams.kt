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
import java.util.Objects
import java.util.Optional

class CustomerUpdateConfigParams
constructor(
    private val customerId: String,
    private val body: CustomerUpdateConfigBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = customerId

    /**
     * Leave in draft or set to auto-advance on invoices sent to Stripe. Falls back to the
     * client-level config if unset, which defaults to true if unset.
     */
    fun leaveStripeInvoicesInDraft(): Optional<Boolean> = body.leaveStripeInvoicesInDraft()

    /** The Salesforce account ID for the customer */
    fun salesforceAccountId(): Optional<String> = body.salesforceAccountId()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): CustomerUpdateConfigBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    @NoAutoDetect
    class CustomerUpdateConfigBody
    @JsonCreator
    internal constructor(
        @JsonProperty("leave_stripe_invoices_in_draft")
        private val leaveStripeInvoicesInDraft: Boolean?,
        @JsonProperty("salesforce_account_id") private val salesforceAccountId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Leave in draft or set to auto-advance on invoices sent to Stripe. Falls back to the
         * client-level config if unset, which defaults to true if unset.
         */
        @JsonProperty("leave_stripe_invoices_in_draft")
        fun leaveStripeInvoicesInDraft(): Optional<Boolean> =
            Optional.ofNullable(leaveStripeInvoicesInDraft)

        /** The Salesforce account ID for the customer */
        @JsonProperty("salesforce_account_id")
        fun salesforceAccountId(): Optional<String> = Optional.ofNullable(salesforceAccountId)

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
                leaveStripeInvoicesInDraft = customerUpdateConfigBody.leaveStripeInvoicesInDraft
                salesforceAccountId = customerUpdateConfigBody.salesforceAccountId
                additionalProperties = customerUpdateConfigBody.additionalProperties.toMutableMap()
            }

            /**
             * Leave in draft or set to auto-advance on invoices sent to Stripe. Falls back to the
             * client-level config if unset, which defaults to true if unset.
             */
            fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: Boolean?) = apply {
                this.leaveStripeInvoicesInDraft = leaveStripeInvoicesInDraft
            }

            /**
             * Leave in draft or set to auto-advance on invoices sent to Stripe. Falls back to the
             * client-level config if unset, which defaults to true if unset.
             */
            fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: Boolean) =
                leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft as Boolean?)

            /**
             * Leave in draft or set to auto-advance on invoices sent to Stripe. Falls back to the
             * client-level config if unset, which defaults to true if unset.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: Optional<Boolean>) =
                leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft.orElse(null) as Boolean?)

            /** The Salesforce account ID for the customer */
            fun salesforceAccountId(salesforceAccountId: String?) = apply {
                this.salesforceAccountId = salesforceAccountId
            }

            /** The Salesforce account ID for the customer */
            fun salesforceAccountId(salesforceAccountId: Optional<String>) =
                salesforceAccountId(salesforceAccountId.orElse(null))

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
        private var body: CustomerUpdateConfigBody.Builder = CustomerUpdateConfigBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerUpdateConfigParams: CustomerUpdateConfigParams) = apply {
            customerId = customerUpdateConfigParams.customerId
            body = customerUpdateConfigParams.body.toBuilder()
            additionalHeaders = customerUpdateConfigParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerUpdateConfigParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * Leave in draft or set to auto-advance on invoices sent to Stripe. Falls back to the
         * client-level config if unset, which defaults to true if unset.
         */
        fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: Boolean?) = apply {
            body.leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft)
        }

        /**
         * Leave in draft or set to auto-advance on invoices sent to Stripe. Falls back to the
         * client-level config if unset, which defaults to true if unset.
         */
        fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: Boolean) =
            leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft as Boolean?)

        /**
         * Leave in draft or set to auto-advance on invoices sent to Stripe. Falls back to the
         * client-level config if unset, which defaults to true if unset.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft: Optional<Boolean>) =
            leaveStripeInvoicesInDraft(leaveStripeInvoicesInDraft.orElse(null) as Boolean?)

        /** The Salesforce account ID for the customer */
        fun salesforceAccountId(salesforceAccountId: String?) = apply {
            body.salesforceAccountId(salesforceAccountId)
        }

        /** The Salesforce account ID for the customer */
        fun salesforceAccountId(salesforceAccountId: Optional<String>) =
            salesforceAccountId(salesforceAccountId.orElse(null))

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

        fun build(): CustomerUpdateConfigParams =
            CustomerUpdateConfigParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerUpdateConfigParams && customerId == other.customerId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerUpdateConfigParams{customerId=$customerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
