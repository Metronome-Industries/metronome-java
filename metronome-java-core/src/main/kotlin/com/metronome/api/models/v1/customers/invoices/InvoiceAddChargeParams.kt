// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.invoices

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Add a one time charge to the specified invoice. This is a Plans (deprecated) endpoint. New
 * clients should implement using Contracts.
 */
class InvoiceAddChargeParams
private constructor(
    private val customerId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = customerId

    /**
     * The Metronome ID of the charge to add to the invoice. Note that the charge must be on a
     * product that is not on the current plan, and the product must have only fixed charges.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chargeId(): String = body.chargeId()

    /**
     * The Metronome ID of the customer plan to add the charge to.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerPlanId(): String = body.customerPlanId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = body.description()

    /**
     * The start_timestamp of the invoice to add the charge to.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoiceStartTimestamp(): OffsetDateTime = body.invoiceStartTimestamp()

    /**
     * The price of the charge. This price will match the currency on the invoice, e.g. USD cents.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun price(): Double = body.price()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Double = body.quantity()

    /**
     * Returns the raw JSON value of [chargeId].
     *
     * Unlike [chargeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _chargeId(): JsonField<String> = body._chargeId()

    /**
     * Returns the raw JSON value of [customerPlanId].
     *
     * Unlike [customerPlanId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerPlanId(): JsonField<String> = body._customerPlanId()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [invoiceStartTimestamp].
     *
     * Unlike [invoiceStartTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _invoiceStartTimestamp(): JsonField<OffsetDateTime> = body._invoiceStartTimestamp()

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _price(): JsonField<Double> = body._price()

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _quantity(): JsonField<Double> = body._quantity()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceAddChargeParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .chargeId()
         * .customerPlanId()
         * .description()
         * .invoiceStartTimestamp()
         * .price()
         * .quantity()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvoiceAddChargeParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(invoiceAddChargeParams: InvoiceAddChargeParams) = apply {
            customerId = invoiceAddChargeParams.customerId
            body = invoiceAddChargeParams.body.toBuilder()
            additionalHeaders = invoiceAddChargeParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceAddChargeParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [chargeId]
         * - [customerPlanId]
         * - [description]
         * - [invoiceStartTimestamp]
         * - [price]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The Metronome ID of the charge to add to the invoice. Note that the charge must be on a
         * product that is not on the current plan, and the product must have only fixed charges.
         */
        fun chargeId(chargeId: String) = apply { body.chargeId(chargeId) }

        /**
         * Sets [Builder.chargeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chargeId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chargeId(chargeId: JsonField<String>) = apply { body.chargeId(chargeId) }

        /** The Metronome ID of the customer plan to add the charge to. */
        fun customerPlanId(customerPlanId: String) = apply { body.customerPlanId(customerPlanId) }

        /**
         * Sets [Builder.customerPlanId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerPlanId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerPlanId(customerPlanId: JsonField<String>) = apply {
            body.customerPlanId(customerPlanId)
        }

        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The start_timestamp of the invoice to add the charge to. */
        fun invoiceStartTimestamp(invoiceStartTimestamp: OffsetDateTime) = apply {
            body.invoiceStartTimestamp(invoiceStartTimestamp)
        }

        /**
         * Sets [Builder.invoiceStartTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceStartTimestamp] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun invoiceStartTimestamp(invoiceStartTimestamp: JsonField<OffsetDateTime>) = apply {
            body.invoiceStartTimestamp(invoiceStartTimestamp)
        }

        /**
         * The price of the charge. This price will match the currency on the invoice, e.g. USD
         * cents.
         */
        fun price(price: Double) = apply { body.price(price) }

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<Double>) = apply { body.price(price) }

        fun quantity(quantity: Double) = apply { body.quantity(quantity) }

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Double>) = apply { body.quantity(quantity) }

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

        /**
         * Returns an immutable instance of [InvoiceAddChargeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .chargeId()
         * .customerPlanId()
         * .description()
         * .invoiceStartTimestamp()
         * .price()
         * .quantity()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceAddChargeParams =
            InvoiceAddChargeParams(
                checkRequired("customerId", customerId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val chargeId: JsonField<String>,
        private val customerPlanId: JsonField<String>,
        private val description: JsonField<String>,
        private val invoiceStartTimestamp: JsonField<OffsetDateTime>,
        private val price: JsonField<Double>,
        private val quantity: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("charge_id")
            @ExcludeMissing
            chargeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_plan_id")
            @ExcludeMissing
            customerPlanId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_start_timestamp")
            @ExcludeMissing
            invoiceStartTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Double> = JsonMissing.of(),
        ) : this(
            chargeId,
            customerPlanId,
            description,
            invoiceStartTimestamp,
            price,
            quantity,
            mutableMapOf(),
        )

        /**
         * The Metronome ID of the charge to add to the invoice. Note that the charge must be on a
         * product that is not on the current plan, and the product must have only fixed charges.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun chargeId(): String = chargeId.getRequired("charge_id")

        /**
         * The Metronome ID of the customer plan to add the charge to.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerPlanId(): String = customerPlanId.getRequired("customer_plan_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * The start_timestamp of the invoice to add the charge to.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun invoiceStartTimestamp(): OffsetDateTime =
            invoiceStartTimestamp.getRequired("invoice_start_timestamp")

        /**
         * The price of the charge. This price will match the currency on the invoice, e.g. USD
         * cents.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun price(): Double = price.getRequired("price")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Double = quantity.getRequired("quantity")

        /**
         * Returns the raw JSON value of [chargeId].
         *
         * Unlike [chargeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("charge_id") @ExcludeMissing fun _chargeId(): JsonField<String> = chargeId

        /**
         * Returns the raw JSON value of [customerPlanId].
         *
         * Unlike [customerPlanId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_plan_id")
        @ExcludeMissing
        fun _customerPlanId(): JsonField<String> = customerPlanId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [invoiceStartTimestamp].
         *
         * Unlike [invoiceStartTimestamp], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("invoice_start_timestamp")
        @ExcludeMissing
        fun _invoiceStartTimestamp(): JsonField<OffsetDateTime> = invoiceStartTimestamp

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .chargeId()
             * .customerPlanId()
             * .description()
             * .invoiceStartTimestamp()
             * .price()
             * .quantity()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var chargeId: JsonField<String>? = null
            private var customerPlanId: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var invoiceStartTimestamp: JsonField<OffsetDateTime>? = null
            private var price: JsonField<Double>? = null
            private var quantity: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                chargeId = body.chargeId
                customerPlanId = body.customerPlanId
                description = body.description
                invoiceStartTimestamp = body.invoiceStartTimestamp
                price = body.price
                quantity = body.quantity
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The Metronome ID of the charge to add to the invoice. Note that the charge must be on
             * a product that is not on the current plan, and the product must have only fixed
             * charges.
             */
            fun chargeId(chargeId: String) = chargeId(JsonField.of(chargeId))

            /**
             * Sets [Builder.chargeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chargeId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chargeId(chargeId: JsonField<String>) = apply { this.chargeId = chargeId }

            /** The Metronome ID of the customer plan to add the charge to. */
            fun customerPlanId(customerPlanId: String) =
                customerPlanId(JsonField.of(customerPlanId))

            /**
             * Sets [Builder.customerPlanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerPlanId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerPlanId(customerPlanId: JsonField<String>) = apply {
                this.customerPlanId = customerPlanId
            }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The start_timestamp of the invoice to add the charge to. */
            fun invoiceStartTimestamp(invoiceStartTimestamp: OffsetDateTime) =
                invoiceStartTimestamp(JsonField.of(invoiceStartTimestamp))

            /**
             * Sets [Builder.invoiceStartTimestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceStartTimestamp] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun invoiceStartTimestamp(invoiceStartTimestamp: JsonField<OffsetDateTime>) = apply {
                this.invoiceStartTimestamp = invoiceStartTimestamp
            }

            /**
             * The price of the charge. This price will match the currency on the invoice, e.g. USD
             * cents.
             */
            fun price(price: Double) = price(JsonField.of(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun price(price: JsonField<Double>) = apply { this.price = price }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .chargeId()
             * .customerPlanId()
             * .description()
             * .invoiceStartTimestamp()
             * .price()
             * .quantity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("chargeId", chargeId),
                    checkRequired("customerPlanId", customerPlanId),
                    checkRequired("description", description),
                    checkRequired("invoiceStartTimestamp", invoiceStartTimestamp),
                    checkRequired("price", price),
                    checkRequired("quantity", quantity),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            chargeId()
            customerPlanId()
            description()
            invoiceStartTimestamp()
            price()
            quantity()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (chargeId.asKnown().isPresent) 1 else 0) +
                (if (customerPlanId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (invoiceStartTimestamp.asKnown().isPresent) 1 else 0) +
                (if (price.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                chargeId == other.chargeId &&
                customerPlanId == other.customerPlanId &&
                description == other.description &&
                invoiceStartTimestamp == other.invoiceStartTimestamp &&
                price == other.price &&
                quantity == other.quantity &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                chargeId,
                customerPlanId,
                description,
                invoiceStartTimestamp,
                price,
                quantity,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{chargeId=$chargeId, customerPlanId=$customerPlanId, description=$description, invoiceStartTimestamp=$invoiceStartTimestamp, price=$price, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceAddChargeParams &&
            customerId == other.customerId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(customerId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InvoiceAddChargeParams{customerId=$customerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
