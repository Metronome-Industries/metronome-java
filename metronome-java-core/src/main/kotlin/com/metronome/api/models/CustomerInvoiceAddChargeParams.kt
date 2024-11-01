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

class CustomerInvoiceAddChargeParams
constructor(
    private val customerId: String,
    private val chargeId: String,
    private val customerPlanId: String,
    private val description: String,
    private val invoiceStartTimestamp: OffsetDateTime,
    private val price: Double,
    private val quantity: Double,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun chargeId(): String = chargeId

    fun customerPlanId(): String = customerPlanId

    fun description(): String = description

    fun invoiceStartTimestamp(): OffsetDateTime = invoiceStartTimestamp

    fun price(): Double = price

    fun quantity(): Double = quantity

    @JvmSynthetic
    internal fun getBody(): CustomerInvoiceAddChargeBody {
        return CustomerInvoiceAddChargeBody(
            chargeId,
            customerPlanId,
            description,
            invoiceStartTimestamp,
            price,
            quantity,
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

    @JsonDeserialize(builder = CustomerInvoiceAddChargeBody.Builder::class)
    @NoAutoDetect
    class CustomerInvoiceAddChargeBody
    internal constructor(
        private val chargeId: String?,
        private val customerPlanId: String?,
        private val description: String?,
        private val invoiceStartTimestamp: OffsetDateTime?,
        private val price: Double?,
        private val quantity: Double?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The Metronome ID of the charge to add to the invoice. Note that the charge must be on a
         * product that is not on the current plan, and the product must have only fixed charges.
         */
        @JsonProperty("charge_id") fun chargeId(): String? = chargeId

        /** The Metronome ID of the customer plan to add the charge to. */
        @JsonProperty("customer_plan_id") fun customerPlanId(): String? = customerPlanId

        @JsonProperty("description") fun description(): String? = description

        /** The start_timestamp of the invoice to add the charge to. */
        @JsonProperty("invoice_start_timestamp")
        fun invoiceStartTimestamp(): OffsetDateTime? = invoiceStartTimestamp

        /**
         * The price of the charge. This price will match the currency on the invoice, e.g. USD
         * cents.
         */
        @JsonProperty("price") fun price(): Double? = price

        @JsonProperty("quantity") fun quantity(): Double? = quantity

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
                this.chargeId = customerInvoiceAddChargeBody.chargeId
                this.customerPlanId = customerInvoiceAddChargeBody.customerPlanId
                this.description = customerInvoiceAddChargeBody.description
                this.invoiceStartTimestamp = customerInvoiceAddChargeBody.invoiceStartTimestamp
                this.price = customerInvoiceAddChargeBody.price
                this.quantity = customerInvoiceAddChargeBody.quantity
                additionalProperties(customerInvoiceAddChargeBody.additionalProperties)
            }

            /**
             * The Metronome ID of the charge to add to the invoice. Note that the charge must be on
             * a product that is not on the current plan, and the product must have only fixed
             * charges.
             */
            @JsonProperty("charge_id")
            fun chargeId(chargeId: String) = apply { this.chargeId = chargeId }

            /** The Metronome ID of the customer plan to add the charge to. */
            @JsonProperty("customer_plan_id")
            fun customerPlanId(customerPlanId: String) = apply {
                this.customerPlanId = customerPlanId
            }

            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** The start_timestamp of the invoice to add the charge to. */
            @JsonProperty("invoice_start_timestamp")
            fun invoiceStartTimestamp(invoiceStartTimestamp: OffsetDateTime) = apply {
                this.invoiceStartTimestamp = invoiceStartTimestamp
            }

            /**
             * The price of the charge. This price will match the currency on the invoice, e.g. USD
             * cents.
             */
            @JsonProperty("price") fun price(price: Double) = apply { this.price = price }

            @JsonProperty("quantity")
            fun quantity(quantity: Double) = apply { this.quantity = quantity }

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

            return /* spotless:off */ other is CustomerInvoiceAddChargeBody && this.chargeId == other.chargeId && this.customerPlanId == other.customerPlanId && this.description == other.description && this.invoiceStartTimestamp == other.invoiceStartTimestamp && this.price == other.price && this.quantity == other.quantity && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(chargeId, customerPlanId, description, invoiceStartTimestamp, price, quantity, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CustomerInvoiceAddChargeBody{chargeId=$chargeId, customerPlanId=$customerPlanId, description=$description, invoiceStartTimestamp=$invoiceStartTimestamp, price=$price, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerInvoiceAddChargeParams && this.customerId == other.customerId && this.chargeId == other.chargeId && this.customerPlanId == other.customerPlanId && this.description == other.description && this.invoiceStartTimestamp == other.invoiceStartTimestamp && this.price == other.price && this.quantity == other.quantity && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, chargeId, customerPlanId, description, invoiceStartTimestamp, price, quantity, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CustomerInvoiceAddChargeParams{customerId=$customerId, chargeId=$chargeId, customerPlanId=$customerPlanId, description=$description, invoiceStartTimestamp=$invoiceStartTimestamp, price=$price, quantity=$quantity, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var chargeId: String? = null
        private var customerPlanId: String? = null
        private var description: String? = null
        private var invoiceStartTimestamp: OffsetDateTime? = null
        private var price: Double? = null
        private var quantity: Double? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerInvoiceAddChargeParams: CustomerInvoiceAddChargeParams) = apply {
            this.customerId = customerInvoiceAddChargeParams.customerId
            this.chargeId = customerInvoiceAddChargeParams.chargeId
            this.customerPlanId = customerInvoiceAddChargeParams.customerPlanId
            this.description = customerInvoiceAddChargeParams.description
            this.invoiceStartTimestamp = customerInvoiceAddChargeParams.invoiceStartTimestamp
            this.price = customerInvoiceAddChargeParams.price
            this.quantity = customerInvoiceAddChargeParams.quantity
            additionalQueryParams(customerInvoiceAddChargeParams.additionalQueryParams)
            additionalHeaders(customerInvoiceAddChargeParams.additionalHeaders)
            additionalBodyProperties(customerInvoiceAddChargeParams.additionalBodyProperties)
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * The Metronome ID of the charge to add to the invoice. Note that the charge must be on a
         * product that is not on the current plan, and the product must have only fixed charges.
         */
        fun chargeId(chargeId: String) = apply { this.chargeId = chargeId }

        /** The Metronome ID of the customer plan to add the charge to. */
        fun customerPlanId(customerPlanId: String) = apply { this.customerPlanId = customerPlanId }

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

        fun build(): CustomerInvoiceAddChargeParams =
            CustomerInvoiceAddChargeParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(chargeId) { "`chargeId` is required but was not set" },
                checkNotNull(customerPlanId) { "`customerPlanId` is required but was not set" },
                checkNotNull(description) { "`description` is required but was not set" },
                checkNotNull(invoiceStartTimestamp) {
                    "`invoiceStartTimestamp` is required but was not set"
                },
                checkNotNull(price) { "`price` is required but was not set" },
                checkNotNull(quantity) { "`quantity` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
