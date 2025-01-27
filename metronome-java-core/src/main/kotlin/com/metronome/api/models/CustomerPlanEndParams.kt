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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Change the end date of a customer's plan. */
class CustomerPlanEndParams
private constructor(
    private val customerId: String,
    private val customerPlanId: String,
    private val body: CustomerPlanEndBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = customerId

    fun customerPlanId(): String = customerPlanId

    /**
     * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00 UTC
     * (midnight). If not provided, the plan end date will be cleared.
     */
    fun endingBefore(): Optional<OffsetDateTime> = body.endingBefore()

    /**
     * If true, plan end date can be before the last finalized invoice date. Any invoices generated
     * after the plan end date will be voided.
     */
    fun voidInvoices(): Optional<Boolean> = body.voidInvoices()

    /**
     * Only applicable when void_invoices is set to true. If true, for every invoice that is voided
     * we will also attempt to void/delete the stripe invoice (if any). Stripe invoices will be
     * voided if finalized or deleted if still in draft state.
     */
    fun voidStripeInvoices(): Optional<Boolean> = body.voidStripeInvoices()

    /**
     * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00 UTC
     * (midnight). If not provided, the plan end date will be cleared.
     */
    fun _endingBefore(): JsonField<OffsetDateTime> = body._endingBefore()

    /**
     * If true, plan end date can be before the last finalized invoice date. Any invoices generated
     * after the plan end date will be voided.
     */
    fun _voidInvoices(): JsonField<Boolean> = body._voidInvoices()

    /**
     * Only applicable when void_invoices is set to true. If true, for every invoice that is voided
     * we will also attempt to void/delete the stripe invoice (if any). Stripe invoices will be
     * voided if finalized or deleted if still in draft state.
     */
    fun _voidStripeInvoices(): JsonField<Boolean> = body._voidStripeInvoices()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): CustomerPlanEndBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            1 -> customerPlanId
            else -> ""
        }
    }

    @NoAutoDetect
    class CustomerPlanEndBody
    @JsonCreator
    internal constructor(
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("void_invoices")
        @ExcludeMissing
        private val voidInvoices: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("void_stripe_invoices")
        @ExcludeMissing
        private val voidStripeInvoices: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00
         * UTC (midnight). If not provided, the plan end date will be cleared.
         */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        /**
         * If true, plan end date can be before the last finalized invoice date. Any invoices
         * generated after the plan end date will be voided.
         */
        fun voidInvoices(): Optional<Boolean> =
            Optional.ofNullable(voidInvoices.getNullable("void_invoices"))

        /**
         * Only applicable when void_invoices is set to true. If true, for every invoice that is
         * voided we will also attempt to void/delete the stripe invoice (if any). Stripe invoices
         * will be voided if finalized or deleted if still in draft state.
         */
        fun voidStripeInvoices(): Optional<Boolean> =
            Optional.ofNullable(voidStripeInvoices.getNullable("void_stripe_invoices"))

        /**
         * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00
         * UTC (midnight). If not provided, the plan end date will be cleared.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /**
         * If true, plan end date can be before the last finalized invoice date. Any invoices
         * generated after the plan end date will be voided.
         */
        @JsonProperty("void_invoices")
        @ExcludeMissing
        fun _voidInvoices(): JsonField<Boolean> = voidInvoices

        /**
         * Only applicable when void_invoices is set to true. If true, for every invoice that is
         * voided we will also attempt to void/delete the stripe invoice (if any). Stripe invoices
         * will be voided if finalized or deleted if still in draft state.
         */
        @JsonProperty("void_stripe_invoices")
        @ExcludeMissing
        fun _voidStripeInvoices(): JsonField<Boolean> = voidStripeInvoices

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomerPlanEndBody = apply {
            if (validated) {
                return@apply
            }

            endingBefore()
            voidInvoices()
            voidStripeInvoices()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomerPlanEndBody]. */
        class Builder internal constructor() {

            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var voidInvoices: JsonField<Boolean> = JsonMissing.of()
            private var voidStripeInvoices: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerPlanEndBody: CustomerPlanEndBody) = apply {
                endingBefore = customerPlanEndBody.endingBefore
                voidInvoices = customerPlanEndBody.voidInvoices
                voidStripeInvoices = customerPlanEndBody.voidStripeInvoices
                additionalProperties = customerPlanEndBody.additionalProperties.toMutableMap()
            }

            /**
             * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at
             * 0:00 UTC (midnight). If not provided, the plan end date will be cleared.
             */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /**
             * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at
             * 0:00 UTC (midnight). If not provided, the plan end date will be cleared.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            /**
             * If true, plan end date can be before the last finalized invoice date. Any invoices
             * generated after the plan end date will be voided.
             */
            fun voidInvoices(voidInvoices: Boolean) = voidInvoices(JsonField.of(voidInvoices))

            /**
             * If true, plan end date can be before the last finalized invoice date. Any invoices
             * generated after the plan end date will be voided.
             */
            fun voidInvoices(voidInvoices: JsonField<Boolean>) = apply {
                this.voidInvoices = voidInvoices
            }

            /**
             * Only applicable when void_invoices is set to true. If true, for every invoice that is
             * voided we will also attempt to void/delete the stripe invoice (if any). Stripe
             * invoices will be voided if finalized or deleted if still in draft state.
             */
            fun voidStripeInvoices(voidStripeInvoices: Boolean) =
                voidStripeInvoices(JsonField.of(voidStripeInvoices))

            /**
             * Only applicable when void_invoices is set to true. If true, for every invoice that is
             * voided we will also attempt to void/delete the stripe invoice (if any). Stripe
             * invoices will be voided if finalized or deleted if still in draft state.
             */
            fun voidStripeInvoices(voidStripeInvoices: JsonField<Boolean>) = apply {
                this.voidStripeInvoices = voidStripeInvoices
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

            return /* spotless:off */ other is CustomerPlanEndBody && endingBefore == other.endingBefore && voidInvoices == other.voidInvoices && voidStripeInvoices == other.voidStripeInvoices && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(endingBefore, voidInvoices, voidStripeInvoices, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerPlanEndBody{endingBefore=$endingBefore, voidInvoices=$voidInvoices, voidStripeInvoices=$voidStripeInvoices, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerPlanEndParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var customerId: String? = null
        private var customerPlanId: String? = null
        private var body: CustomerPlanEndBody.Builder = CustomerPlanEndBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerPlanEndParams: CustomerPlanEndParams) = apply {
            customerId = customerPlanEndParams.customerId
            customerPlanId = customerPlanEndParams.customerPlanId
            body = customerPlanEndParams.body.toBuilder()
            additionalHeaders = customerPlanEndParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerPlanEndParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun customerPlanId(customerPlanId: String) = apply { this.customerPlanId = customerPlanId }

        /**
         * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00
         * UTC (midnight). If not provided, the plan end date will be cleared.
         */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { body.endingBefore(endingBefore) }

        /**
         * RFC 3339 timestamp for when the plan ends (exclusive) for this customer. Must be at 0:00
         * UTC (midnight). If not provided, the plan end date will be cleared.
         */
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            body.endingBefore(endingBefore)
        }

        /**
         * If true, plan end date can be before the last finalized invoice date. Any invoices
         * generated after the plan end date will be voided.
         */
        fun voidInvoices(voidInvoices: Boolean) = apply { body.voidInvoices(voidInvoices) }

        /**
         * If true, plan end date can be before the last finalized invoice date. Any invoices
         * generated after the plan end date will be voided.
         */
        fun voidInvoices(voidInvoices: JsonField<Boolean>) = apply {
            body.voidInvoices(voidInvoices)
        }

        /**
         * Only applicable when void_invoices is set to true. If true, for every invoice that is
         * voided we will also attempt to void/delete the stripe invoice (if any). Stripe invoices
         * will be voided if finalized or deleted if still in draft state.
         */
        fun voidStripeInvoices(voidStripeInvoices: Boolean) = apply {
            body.voidStripeInvoices(voidStripeInvoices)
        }

        /**
         * Only applicable when void_invoices is set to true. If true, for every invoice that is
         * voided we will also attempt to void/delete the stripe invoice (if any). Stripe invoices
         * will be voided if finalized or deleted if still in draft state.
         */
        fun voidStripeInvoices(voidStripeInvoices: JsonField<Boolean>) = apply {
            body.voidStripeInvoices(voidStripeInvoices)
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

        fun build(): CustomerPlanEndParams =
            CustomerPlanEndParams(
                checkRequired("customerId", customerId),
                checkRequired("customerPlanId", customerPlanId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerPlanEndParams && customerId == other.customerId && customerPlanId == other.customerPlanId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, customerPlanId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerPlanEndParams{customerId=$customerId, customerPlanId=$customerPlanId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
