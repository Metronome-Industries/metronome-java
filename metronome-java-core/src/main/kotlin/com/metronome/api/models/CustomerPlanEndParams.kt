// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class CustomerPlanEndParams
constructor(
    private val customerId: String,
    private val customerPlanId: String,
    private val endingBefore: OffsetDateTime?,
    private val voidInvoices: Boolean?,
    private val voidStripeInvoices: Boolean?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun customerPlanId(): String = customerPlanId

    fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

    fun voidInvoices(): Optional<Boolean> = Optional.ofNullable(voidInvoices)

    fun voidStripeInvoices(): Optional<Boolean> = Optional.ofNullable(voidStripeInvoices)

    @JvmSynthetic
    internal fun getBody(): CustomerPlanEndBody {
        return CustomerPlanEndBody(
            endingBefore,
            voidInvoices,
            voidStripeInvoices,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            1 -> customerPlanId
            else -> ""
        }
    }

    @JsonDeserialize(builder = CustomerPlanEndBody.Builder::class)
    @NoAutoDetect
    class CustomerPlanEndBody
    internal constructor(
        private val endingBefore: OffsetDateTime?,
        private val voidInvoices: Boolean?,
        private val voidStripeInvoices: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00
         * UTC (midnight). If not provided, the plan end date will be cleared.
         */
        @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

        /**
         * If true, plan end date can be before the last finalized invoice date. Any invoices
         * generated after the plan end date will be voided.
         */
        @JsonProperty("void_invoices") fun voidInvoices(): Boolean? = voidInvoices

        /**
         * Only applicable when void_invoices is set to true. If true, for every invoice that is
         * voided we will also attempt to void/delete the stripe invoice (if any). Stripe invoices
         * will be voided if finalized or deleted if still in draft state.
         */
        @JsonProperty("void_stripe_invoices")
        fun voidStripeInvoices(): Boolean? = voidStripeInvoices

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var endingBefore: OffsetDateTime? = null
            private var voidInvoices: Boolean? = null
            private var voidStripeInvoices: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerPlanEndBody: CustomerPlanEndBody) = apply {
                this.endingBefore = customerPlanEndBody.endingBefore
                this.voidInvoices = customerPlanEndBody.voidInvoices
                this.voidStripeInvoices = customerPlanEndBody.voidStripeInvoices
                additionalProperties(customerPlanEndBody.additionalProperties)
            }

            /**
             * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at
             * 0:00 UTC (midnight). If not provided, the plan end date will be cleared.
             */
            @JsonProperty("ending_before")
            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
            }

            /**
             * If true, plan end date can be before the last finalized invoice date. Any invoices
             * generated after the plan end date will be voided.
             */
            @JsonProperty("void_invoices")
            fun voidInvoices(voidInvoices: Boolean) = apply { this.voidInvoices = voidInvoices }

            /**
             * Only applicable when void_invoices is set to true. If true, for every invoice that is
             * voided we will also attempt to void/delete the stripe invoice (if any). Stripe
             * invoices will be voided if finalized or deleted if still in draft state.
             */
            @JsonProperty("void_stripe_invoices")
            fun voidStripeInvoices(voidStripeInvoices: Boolean) = apply {
                this.voidStripeInvoices = voidStripeInvoices
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

            fun build(): CustomerPlanEndBody =
                CustomerPlanEndBody(
                    endingBefore,
                    voidInvoices,
                    voidStripeInvoices,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerPlanEndBody && this.endingBefore == other.endingBefore && this.voidInvoices == other.voidInvoices && this.voidStripeInvoices == other.voidStripeInvoices && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(endingBefore, voidInvoices, voidStripeInvoices, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CustomerPlanEndBody{endingBefore=$endingBefore, voidInvoices=$voidInvoices, voidStripeInvoices=$voidStripeInvoices, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerPlanEndParams && this.customerId == other.customerId && this.customerPlanId == other.customerPlanId && this.endingBefore == other.endingBefore && this.voidInvoices == other.voidInvoices && this.voidStripeInvoices == other.voidStripeInvoices && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, customerPlanId, endingBefore, voidInvoices, voidStripeInvoices, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CustomerPlanEndParams{customerId=$customerId, customerPlanId=$customerPlanId, endingBefore=$endingBefore, voidInvoices=$voidInvoices, voidStripeInvoices=$voidStripeInvoices, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var customerPlanId: String? = null
        private var endingBefore: OffsetDateTime? = null
        private var voidInvoices: Boolean? = null
        private var voidStripeInvoices: Boolean? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerPlanEndParams: CustomerPlanEndParams) = apply {
            this.customerId = customerPlanEndParams.customerId
            this.customerPlanId = customerPlanEndParams.customerPlanId
            this.endingBefore = customerPlanEndParams.endingBefore
            this.voidInvoices = customerPlanEndParams.voidInvoices
            this.voidStripeInvoices = customerPlanEndParams.voidStripeInvoices
            additionalHeaders(customerPlanEndParams.additionalHeaders)
            additionalQueryParams(customerPlanEndParams.additionalQueryParams)
            additionalBodyProperties(customerPlanEndParams.additionalBodyProperties)
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun customerPlanId(customerPlanId: String) = apply { this.customerPlanId = customerPlanId }

        /**
         * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00
         * UTC (midnight). If not provided, the plan end date will be cleared.
         */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { this.endingBefore = endingBefore }

        /**
         * If true, plan end date can be before the last finalized invoice date. Any invoices
         * generated after the plan end date will be voided.
         */
        fun voidInvoices(voidInvoices: Boolean) = apply { this.voidInvoices = voidInvoices }

        /**
         * Only applicable when void_invoices is set to true. If true, for every invoice that is
         * voided we will also attempt to void/delete the stripe invoice (if any). Stripe invoices
         * will be voided if finalized or deleted if still in draft state.
         */
        fun voidStripeInvoices(voidStripeInvoices: Boolean) = apply {
            this.voidStripeInvoices = voidStripeInvoices
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): CustomerPlanEndParams =
            CustomerPlanEndParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(customerPlanId) { "`customerPlanId` is required but was not set" },
                endingBefore,
                voidInvoices,
                voidStripeInvoices,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
