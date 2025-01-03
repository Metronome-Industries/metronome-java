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

class CustomerInvoiceAddChargeParams
constructor(
    private val customerId: String,
    private val body: CustomerInvoiceAddChargeBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = customerId

    /**
     * The Metronome ID of the charge to add to the invoice. Note that the charge must be on a
     * product that is not on the current plan, and the product must have only fixed charges.
     */
    fun chargeId(): String = body.chargeId()

    /** The Metronome ID of the customer plan to add the charge to. */
    fun customerPlanId(): String = body.customerPlanId()

    fun description(): String = body.description()

    /** The start_timestamp of the invoice to add the charge to. */
    fun invoiceStartTimestamp(): OffsetDateTime = body.invoiceStartTimestamp()

    /**
     * The price of the charge. This price will match the currency on the invoice, e.g. USD cents.
     */
    fun price(): Double = body.price()

    fun quantity(): Double = body.quantity()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): CustomerInvoiceAddChargeBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    @NoAutoDetect
    class CustomerInvoiceAddChargeBody
    @JsonCreator
    internal constructor(
        @JsonProperty("charge_id") private val chargeId: String,
        @JsonProperty("customer_plan_id") private val customerPlanId: String,
        @JsonProperty("description") private val description: String,
        @JsonProperty("invoice_start_timestamp") private val invoiceStartTimestamp: OffsetDateTime,
        @JsonProperty("price") private val price: Double,
        @JsonProperty("quantity") private val quantity: Double,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The Metronome ID of the charge to add to the invoice. Note that the charge must be on a
         * product that is not on the current plan, and the product must have only fixed charges.
         */
        @JsonProperty("charge_id") fun chargeId(): String = chargeId

        /** The Metronome ID of the customer plan to add the charge to. */
        @JsonProperty("customer_plan_id") fun customerPlanId(): String = customerPlanId

        @JsonProperty("description") fun description(): String = description

        /** The start_timestamp of the invoice to add the charge to. */
        @JsonProperty("invoice_start_timestamp")
        fun invoiceStartTimestamp(): OffsetDateTime = invoiceStartTimestamp

        /**
         * The price of the charge. This price will match the currency on the invoice, e.g. USD
         * cents.
         */
        @JsonProperty("price") fun price(): Double = price

        @JsonProperty("quantity") fun quantity(): Double = quantity

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var chargeId: String? = null
            private var customerPlanId: String? = null
            private var description: String? = null
            private var invoiceStartTimestamp: OffsetDateTime? = null
            private var price: Double? = null
            private var quantity: Double? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerInvoiceAddChargeBody: CustomerInvoiceAddChargeBody) = apply {
                chargeId = customerInvoiceAddChargeBody.chargeId
                customerPlanId = customerInvoiceAddChargeBody.customerPlanId
                description = customerInvoiceAddChargeBody.description
                invoiceStartTimestamp = customerInvoiceAddChargeBody.invoiceStartTimestamp
                price = customerInvoiceAddChargeBody.price
                quantity = customerInvoiceAddChargeBody.quantity
                additionalProperties =
                    customerInvoiceAddChargeBody.additionalProperties.toMutableMap()
            }

            /**
             * The Metronome ID of the charge to add to the invoice. Note that the charge must be on
             * a product that is not on the current plan, and the product must have only fixed
             * charges.
             */
            fun chargeId(chargeId: String) = apply { this.chargeId = chargeId }

            /** The Metronome ID of the customer plan to add the charge to. */
            fun customerPlanId(customerPlanId: String) = apply {
                this.customerPlanId = customerPlanId
            }

            fun description(description: String) = apply { this.description = description }

            /** The start_timestamp of the invoice to add the charge to. */
            fun invoiceStartTimestamp(invoiceStartTimestamp: OffsetDateTime) = apply {
                this.invoiceStartTimestamp = invoiceStartTimestamp
            }

            /**
             * The price of the charge. This price will match the currency on the invoice, e.g. USD
             * cents.
             */
            fun price(price: Double) = apply { this.price = price }

            fun quantity(quantity: Double) = apply { this.quantity = quantity }

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

            fun build(): CustomerInvoiceAddChargeBody =
                CustomerInvoiceAddChargeBody(
                    checkNotNull(chargeId) { "`chargeId` is required but was not set" },
                    checkNotNull(customerPlanId) { "`customerPlanId` is required but was not set" },
                    checkNotNull(description) { "`description` is required but was not set" },
                    checkNotNull(invoiceStartTimestamp) {
                        "`invoiceStartTimestamp` is required but was not set"
                    },
                    checkNotNull(price) { "`price` is required but was not set" },
                    checkNotNull(quantity) { "`quantity` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerInvoiceAddChargeBody && chargeId == other.chargeId && customerPlanId == other.customerPlanId && description == other.description && invoiceStartTimestamp == other.invoiceStartTimestamp && price == other.price && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(chargeId, customerPlanId, description, invoiceStartTimestamp, price, quantity, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerInvoiceAddChargeBody{chargeId=$chargeId, customerPlanId=$customerPlanId, description=$description, invoiceStartTimestamp=$invoiceStartTimestamp, price=$price, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var body: CustomerInvoiceAddChargeBody.Builder =
            CustomerInvoiceAddChargeBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerInvoiceAddChargeParams: CustomerInvoiceAddChargeParams) = apply {
            customerId = customerInvoiceAddChargeParams.customerId
            body = customerInvoiceAddChargeParams.body.toBuilder()
            additionalHeaders = customerInvoiceAddChargeParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerInvoiceAddChargeParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * The Metronome ID of the charge to add to the invoice. Note that the charge must be on a
         * product that is not on the current plan, and the product must have only fixed charges.
         */
        fun chargeId(chargeId: String) = apply { body.chargeId(chargeId) }

        /** The Metronome ID of the customer plan to add the charge to. */
        fun customerPlanId(customerPlanId: String) = apply { body.customerPlanId(customerPlanId) }

        fun description(description: String) = apply { body.description(description) }

        /** The start_timestamp of the invoice to add the charge to. */
        fun invoiceStartTimestamp(invoiceStartTimestamp: OffsetDateTime) = apply {
            body.invoiceStartTimestamp(invoiceStartTimestamp)
        }

        /**
         * The price of the charge. This price will match the currency on the invoice, e.g. USD
         * cents.
         */
        fun price(price: Double) = apply { body.price(price) }

        fun quantity(quantity: Double) = apply { body.quantity(quantity) }

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

        fun build(): CustomerInvoiceAddChargeParams =
            CustomerInvoiceAddChargeParams(
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

        return /* spotless:off */ other is CustomerInvoiceAddChargeParams && customerId == other.customerId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerInvoiceAddChargeParams{customerId=$customerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
