// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.payments

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.CreditTypeData
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Payment
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Double>,
    private val amountPaid: JsonField<Double>,
    private val contractId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerId: JsonField<String>,
    private val errorMessage: JsonField<String>,
    private val fiatCreditType: JsonField<CreditTypeData>,
    private val invoiceId: JsonField<String>,
    private val paymentGateway: JsonField<PaymentGateway>,
    private val revenueSystemPayments: JsonField<List<RevenueSystemPayment>>,
    private val status: JsonField<PaymentStatus>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amount_paid")
        @ExcludeMissing
        amountPaid: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("contract_id")
        @ExcludeMissing
        contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fiat_credit_type")
        @ExcludeMissing
        fiatCreditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("invoice_id") @ExcludeMissing invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_gateway")
        @ExcludeMissing
        paymentGateway: JsonField<PaymentGateway> = JsonMissing.of(),
        @JsonProperty("revenue_system_payments")
        @ExcludeMissing
        revenueSystemPayments: JsonField<List<RevenueSystemPayment>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<PaymentStatus> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        amountPaid,
        contractId,
        createdAt,
        customerId,
        errorMessage,
        fiatCreditType,
        invoiceId,
        paymentGateway,
        revenueSystemPayments,
        status,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Double> = amount.getOptional("amount")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amountPaid(): Optional<Double> = amountPaid.getOptional("amount_paid")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contractId(): Optional<String> = contractId.getOptional("contract_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerId(): Optional<String> = customerId.getOptional("customer_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fiatCreditType(): Optional<CreditTypeData> = fiatCreditType.getOptional("fiat_credit_type")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceId(): Optional<String> = invoiceId.getOptional("invoice_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentGateway(): Optional<PaymentGateway> = paymentGateway.getOptional("payment_gateway")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun revenueSystemPayments(): Optional<List<RevenueSystemPayment>> =
        revenueSystemPayments.getOptional("revenue_system_payments")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<PaymentStatus> = status.getOptional("status")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    /**
     * Returns the raw JSON value of [amountPaid].
     *
     * Unlike [amountPaid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount_paid") @ExcludeMissing fun _amountPaid(): JsonField<Double> = amountPaid

    /**
     * Returns the raw JSON value of [contractId].
     *
     * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contract_id") @ExcludeMissing fun _contractId(): JsonField<String> = contractId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [fiatCreditType].
     *
     * Unlike [fiatCreditType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fiat_credit_type")
    @ExcludeMissing
    fun _fiatCreditType(): JsonField<CreditTypeData> = fiatCreditType

    /**
     * Returns the raw JSON value of [invoiceId].
     *
     * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

    /**
     * Returns the raw JSON value of [paymentGateway].
     *
     * Unlike [paymentGateway], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_gateway")
    @ExcludeMissing
    fun _paymentGateway(): JsonField<PaymentGateway> = paymentGateway

    /**
     * Returns the raw JSON value of [revenueSystemPayments].
     *
     * Unlike [revenueSystemPayments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("revenue_system_payments")
    @ExcludeMissing
    fun _revenueSystemPayments(): JsonField<List<RevenueSystemPayment>> = revenueSystemPayments

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<PaymentStatus> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [Payment].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Payment]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Double> = JsonMissing.of()
        private var amountPaid: JsonField<Double> = JsonMissing.of()
        private var contractId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customerId: JsonField<String> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var fiatCreditType: JsonField<CreditTypeData> = JsonMissing.of()
        private var invoiceId: JsonField<String> = JsonMissing.of()
        private var paymentGateway: JsonField<PaymentGateway> = JsonMissing.of()
        private var revenueSystemPayments: JsonField<MutableList<RevenueSystemPayment>>? = null
        private var status: JsonField<PaymentStatus> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payment: Payment) = apply {
            id = payment.id
            amount = payment.amount
            amountPaid = payment.amountPaid
            contractId = payment.contractId
            createdAt = payment.createdAt
            customerId = payment.customerId
            errorMessage = payment.errorMessage
            fiatCreditType = payment.fiatCreditType
            invoiceId = payment.invoiceId
            paymentGateway = payment.paymentGateway
            revenueSystemPayments = payment.revenueSystemPayments.map { it.toMutableList() }
            status = payment.status
            updatedAt = payment.updatedAt
            additionalProperties = payment.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun amount(amount: Double) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        fun amountPaid(amountPaid: Double) = amountPaid(JsonField.of(amountPaid))

        /**
         * Sets [Builder.amountPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountPaid] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountPaid(amountPaid: JsonField<Double>) = apply { this.amountPaid = amountPaid }

        fun contractId(contractId: String) = contractId(JsonField.of(contractId))

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        fun fiatCreditType(fiatCreditType: CreditTypeData) =
            fiatCreditType(JsonField.of(fiatCreditType))

        /**
         * Sets [Builder.fiatCreditType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fiatCreditType] with a well-typed [CreditTypeData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fiatCreditType(fiatCreditType: JsonField<CreditTypeData>) = apply {
            this.fiatCreditType = fiatCreditType
        }

        fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

        /**
         * Sets [Builder.invoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

        fun paymentGateway(paymentGateway: PaymentGateway) =
            paymentGateway(JsonField.of(paymentGateway))

        /**
         * Sets [Builder.paymentGateway] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentGateway] with a well-typed [PaymentGateway] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentGateway(paymentGateway: JsonField<PaymentGateway>) = apply {
            this.paymentGateway = paymentGateway
        }

        fun revenueSystemPayments(revenueSystemPayments: List<RevenueSystemPayment>) =
            revenueSystemPayments(JsonField.of(revenueSystemPayments))

        /**
         * Sets [Builder.revenueSystemPayments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revenueSystemPayments] with a well-typed
         * `List<RevenueSystemPayment>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun revenueSystemPayments(revenueSystemPayments: JsonField<List<RevenueSystemPayment>>) =
            apply {
                this.revenueSystemPayments = revenueSystemPayments.map { it.toMutableList() }
            }

        /**
         * Adds a single [RevenueSystemPayment] to [revenueSystemPayments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRevenueSystemPayment(revenueSystemPayment: RevenueSystemPayment) = apply {
            revenueSystemPayments =
                (revenueSystemPayments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("revenueSystemPayments", it).add(revenueSystemPayment)
                }
        }

        fun status(status: PaymentStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [PaymentStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<PaymentStatus>) = apply { this.status = status }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [Payment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Payment =
            Payment(
                checkRequired("id", id),
                amount,
                amountPaid,
                contractId,
                createdAt,
                customerId,
                errorMessage,
                fiatCreditType,
                invoiceId,
                paymentGateway,
                (revenueSystemPayments ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Payment = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        amountPaid()
        contractId()
        createdAt()
        customerId()
        errorMessage()
        fiatCreditType().ifPresent { it.validate() }
        invoiceId()
        paymentGateway().ifPresent { it.validate() }
        revenueSystemPayments().ifPresent { it.forEach { it.validate() } }
        status().ifPresent { it.validate() }
        updatedAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (amountPaid.asKnown().isPresent) 1 else 0) +
            (if (contractId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (customerId.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (fiatCreditType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (invoiceId.asKnown().isPresent) 1 else 0) +
            (paymentGateway.asKnown().getOrNull()?.validity() ?: 0) +
            (revenueSystemPayments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class PaymentGateway
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val stripe: JsonField<Stripe>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("stripe") @ExcludeMissing stripe: JsonField<Stripe> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(stripe, type, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun stripe(): Stripe = stripe.getRequired("stripe")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [stripe].
         *
         * Unlike [stripe], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stripe") @ExcludeMissing fun _stripe(): JsonField<Stripe> = stripe

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [PaymentGateway].
             *
             * The following fields are required:
             * ```java
             * .stripe()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentGateway]. */
        class Builder internal constructor() {

            private var stripe: JsonField<Stripe>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentGateway: PaymentGateway) = apply {
                stripe = paymentGateway.stripe
                type = paymentGateway.type
                additionalProperties = paymentGateway.additionalProperties.toMutableMap()
            }

            fun stripe(stripe: Stripe) = stripe(JsonField.of(stripe))

            /**
             * Sets [Builder.stripe] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stripe] with a well-typed [Stripe] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stripe(stripe: JsonField<Stripe>) = apply { this.stripe = stripe }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [PaymentGateway].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .stripe()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentGateway =
                PaymentGateway(
                    checkRequired("stripe", stripe),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PaymentGateway = apply {
            if (validated) {
                return@apply
            }

            stripe().validate()
            type().validate()
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
            (stripe.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Stripe
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val paymentIntentId: JsonField<String>,
            private val error: JsonField<Error>,
            private val paymentMethodId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("payment_intent_id")
                @ExcludeMissing
                paymentIntentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("error") @ExcludeMissing error: JsonField<Error> = JsonMissing.of(),
                @JsonProperty("payment_method_id")
                @ExcludeMissing
                paymentMethodId: JsonField<String> = JsonMissing.of(),
            ) : this(paymentIntentId, error, paymentMethodId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentIntentId(): String = paymentIntentId.getRequired("payment_intent_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun error(): Optional<Error> = error.getOptional("error")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun paymentMethodId(): Optional<String> =
                paymentMethodId.getOptional("payment_method_id")

            /**
             * Returns the raw JSON value of [paymentIntentId].
             *
             * Unlike [paymentIntentId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_intent_id")
            @ExcludeMissing
            fun _paymentIntentId(): JsonField<String> = paymentIntentId

            /**
             * Returns the raw JSON value of [error].
             *
             * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Error> = error

            /**
             * Returns the raw JSON value of [paymentMethodId].
             *
             * Unlike [paymentMethodId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_method_id")
            @ExcludeMissing
            fun _paymentMethodId(): JsonField<String> = paymentMethodId

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
                 * Returns a mutable builder for constructing an instance of [Stripe].
                 *
                 * The following fields are required:
                 * ```java
                 * .paymentIntentId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Stripe]. */
            class Builder internal constructor() {

                private var paymentIntentId: JsonField<String>? = null
                private var error: JsonField<Error> = JsonMissing.of()
                private var paymentMethodId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(stripe: Stripe) = apply {
                    paymentIntentId = stripe.paymentIntentId
                    error = stripe.error
                    paymentMethodId = stripe.paymentMethodId
                    additionalProperties = stripe.additionalProperties.toMutableMap()
                }

                fun paymentIntentId(paymentIntentId: String) =
                    paymentIntentId(JsonField.of(paymentIntentId))

                /**
                 * Sets [Builder.paymentIntentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentIntentId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentIntentId(paymentIntentId: JsonField<String>) = apply {
                    this.paymentIntentId = paymentIntentId
                }

                fun error(error: Error) = error(JsonField.of(error))

                /**
                 * Sets [Builder.error] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.error] with a well-typed [Error] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun error(error: JsonField<Error>) = apply { this.error = error }

                fun paymentMethodId(paymentMethodId: String) =
                    paymentMethodId(JsonField.of(paymentMethodId))

                /**
                 * Sets [Builder.paymentMethodId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentMethodId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentMethodId(paymentMethodId: JsonField<String>) = apply {
                    this.paymentMethodId = paymentMethodId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Stripe].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .paymentIntentId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Stripe =
                    Stripe(
                        checkRequired("paymentIntentId", paymentIntentId),
                        error,
                        paymentMethodId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Stripe = apply {
                if (validated) {
                    return@apply
                }

                paymentIntentId()
                error().ifPresent { it.validate() }
                paymentMethodId()
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
                (if (paymentIntentId.asKnown().isPresent) 1 else 0) +
                    (error.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (paymentMethodId.asKnown().isPresent) 1 else 0)

            class Error
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val code: JsonField<String>,
                private val declineCode: JsonField<String>,
                private val type: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("code")
                    @ExcludeMissing
                    code: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("decline_code")
                    @ExcludeMissing
                    declineCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                ) : this(code, declineCode, type, mutableMapOf())

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun code(): Optional<String> = code.getOptional("code")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun declineCode(): Optional<String> = declineCode.getOptional("decline_code")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun type(): Optional<String> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [code].
                 *
                 * Unlike [code], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

                /**
                 * Returns the raw JSON value of [declineCode].
                 *
                 * Unlike [declineCode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("decline_code")
                @ExcludeMissing
                fun _declineCode(): JsonField<String> = declineCode

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                    /** Returns a mutable builder for constructing an instance of [Error]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Error]. */
                class Builder internal constructor() {

                    private var code: JsonField<String> = JsonMissing.of()
                    private var declineCode: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(error: Error) = apply {
                        code = error.code
                        declineCode = error.declineCode
                        type = error.type
                        additionalProperties = error.additionalProperties.toMutableMap()
                    }

                    fun code(code: String) = code(JsonField.of(code))

                    /**
                     * Sets [Builder.code] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.code] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun code(code: JsonField<String>) = apply { this.code = code }

                    fun declineCode(declineCode: String) = declineCode(JsonField.of(declineCode))

                    /**
                     * Sets [Builder.declineCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.declineCode] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun declineCode(declineCode: JsonField<String>) = apply {
                        this.declineCode = declineCode
                    }

                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Error].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Error =
                        Error(code, declineCode, type, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Error = apply {
                    if (validated) {
                        return@apply
                    }

                    code()
                    declineCode()
                    type()
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
                    (if (code.asKnown().isPresent) 1 else 0) +
                        (if (declineCode.asKnown().isPresent) 1 else 0) +
                        (if (type.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Error &&
                        code == other.code &&
                        declineCode == other.declineCode &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(code, declineCode, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Error{code=$code, declineCode=$declineCode, type=$type, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Stripe &&
                    paymentIntentId == other.paymentIntentId &&
                    error == other.error &&
                    paymentMethodId == other.paymentMethodId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(paymentIntentId, error, paymentMethodId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Stripe{paymentIntentId=$paymentIntentId, error=$error, paymentMethodId=$paymentMethodId, additionalProperties=$additionalProperties}"
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val STRIPE = of("stripe")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                STRIPE
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STRIPE,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    STRIPE -> Value.STRIPE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    STRIPE -> Known.STRIPE
                    else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentGateway &&
                stripe == other.stripe &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(stripe, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentGateway{stripe=$stripe, type=$type, additionalProperties=$additionalProperties}"
    }

    class RevenueSystemPayment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val revenueSystemProvider: JsonField<String>,
        private val syncStatus: JsonField<String>,
        private val errorMessage: JsonField<String>,
        private val revenueSystemExternalPaymentId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("revenue_system_provider")
            @ExcludeMissing
            revenueSystemProvider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sync_status")
            @ExcludeMissing
            syncStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error_message")
            @ExcludeMissing
            errorMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("revenue_system_external_payment_id")
            @ExcludeMissing
            revenueSystemExternalPaymentId: JsonField<String> = JsonMissing.of(),
        ) : this(
            revenueSystemProvider,
            syncStatus,
            errorMessage,
            revenueSystemExternalPaymentId,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun revenueSystemProvider(): String =
            revenueSystemProvider.getRequired("revenue_system_provider")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun syncStatus(): String = syncStatus.getRequired("sync_status")

        /**
         * The error message from the revenue system, if available.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun revenueSystemExternalPaymentId(): Optional<String> =
            revenueSystemExternalPaymentId.getOptional("revenue_system_external_payment_id")

        /**
         * Returns the raw JSON value of [revenueSystemProvider].
         *
         * Unlike [revenueSystemProvider], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("revenue_system_provider")
        @ExcludeMissing
        fun _revenueSystemProvider(): JsonField<String> = revenueSystemProvider

        /**
         * Returns the raw JSON value of [syncStatus].
         *
         * Unlike [syncStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sync_status")
        @ExcludeMissing
        fun _syncStatus(): JsonField<String> = syncStatus

        /**
         * Returns the raw JSON value of [errorMessage].
         *
         * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("error_message")
        @ExcludeMissing
        fun _errorMessage(): JsonField<String> = errorMessage

        /**
         * Returns the raw JSON value of [revenueSystemExternalPaymentId].
         *
         * Unlike [revenueSystemExternalPaymentId], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("revenue_system_external_payment_id")
        @ExcludeMissing
        fun _revenueSystemExternalPaymentId(): JsonField<String> = revenueSystemExternalPaymentId

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
             * Returns a mutable builder for constructing an instance of [RevenueSystemPayment].
             *
             * The following fields are required:
             * ```java
             * .revenueSystemProvider()
             * .syncStatus()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RevenueSystemPayment]. */
        class Builder internal constructor() {

            private var revenueSystemProvider: JsonField<String>? = null
            private var syncStatus: JsonField<String>? = null
            private var errorMessage: JsonField<String> = JsonMissing.of()
            private var revenueSystemExternalPaymentId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(revenueSystemPayment: RevenueSystemPayment) = apply {
                revenueSystemProvider = revenueSystemPayment.revenueSystemProvider
                syncStatus = revenueSystemPayment.syncStatus
                errorMessage = revenueSystemPayment.errorMessage
                revenueSystemExternalPaymentId = revenueSystemPayment.revenueSystemExternalPaymentId
                additionalProperties = revenueSystemPayment.additionalProperties.toMutableMap()
            }

            fun revenueSystemProvider(revenueSystemProvider: String) =
                revenueSystemProvider(JsonField.of(revenueSystemProvider))

            /**
             * Sets [Builder.revenueSystemProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.revenueSystemProvider] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun revenueSystemProvider(revenueSystemProvider: JsonField<String>) = apply {
                this.revenueSystemProvider = revenueSystemProvider
            }

            fun syncStatus(syncStatus: String) = syncStatus(JsonField.of(syncStatus))

            /**
             * Sets [Builder.syncStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.syncStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun syncStatus(syncStatus: JsonField<String>) = apply { this.syncStatus = syncStatus }

            /** The error message from the revenue system, if available. */
            fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

            /**
             * Sets [Builder.errorMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorMessage(errorMessage: JsonField<String>) = apply {
                this.errorMessage = errorMessage
            }

            fun revenueSystemExternalPaymentId(revenueSystemExternalPaymentId: String) =
                revenueSystemExternalPaymentId(JsonField.of(revenueSystemExternalPaymentId))

            /**
             * Sets [Builder.revenueSystemExternalPaymentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.revenueSystemExternalPaymentId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun revenueSystemExternalPaymentId(revenueSystemExternalPaymentId: JsonField<String>) =
                apply {
                    this.revenueSystemExternalPaymentId = revenueSystemExternalPaymentId
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

            /**
             * Returns an immutable instance of [RevenueSystemPayment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .revenueSystemProvider()
             * .syncStatus()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RevenueSystemPayment =
                RevenueSystemPayment(
                    checkRequired("revenueSystemProvider", revenueSystemProvider),
                    checkRequired("syncStatus", syncStatus),
                    errorMessage,
                    revenueSystemExternalPaymentId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): RevenueSystemPayment = apply {
            if (validated) {
                return@apply
            }

            revenueSystemProvider()
            syncStatus()
            errorMessage()
            revenueSystemExternalPaymentId()
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
            (if (revenueSystemProvider.asKnown().isPresent) 1 else 0) +
                (if (syncStatus.asKnown().isPresent) 1 else 0) +
                (if (errorMessage.asKnown().isPresent) 1 else 0) +
                (if (revenueSystemExternalPaymentId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RevenueSystemPayment &&
                revenueSystemProvider == other.revenueSystemProvider &&
                syncStatus == other.syncStatus &&
                errorMessage == other.errorMessage &&
                revenueSystemExternalPaymentId == other.revenueSystemExternalPaymentId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                revenueSystemProvider,
                syncStatus,
                errorMessage,
                revenueSystemExternalPaymentId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RevenueSystemPayment{revenueSystemProvider=$revenueSystemProvider, syncStatus=$syncStatus, errorMessage=$errorMessage, revenueSystemExternalPaymentId=$revenueSystemExternalPaymentId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Payment &&
            id == other.id &&
            amount == other.amount &&
            amountPaid == other.amountPaid &&
            contractId == other.contractId &&
            createdAt == other.createdAt &&
            customerId == other.customerId &&
            errorMessage == other.errorMessage &&
            fiatCreditType == other.fiatCreditType &&
            invoiceId == other.invoiceId &&
            paymentGateway == other.paymentGateway &&
            revenueSystemPayments == other.revenueSystemPayments &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amount,
            amountPaid,
            contractId,
            createdAt,
            customerId,
            errorMessage,
            fiatCreditType,
            invoiceId,
            paymentGateway,
            revenueSystemPayments,
            status,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Payment{id=$id, amount=$amount, amountPaid=$amountPaid, contractId=$contractId, createdAt=$createdAt, customerId=$customerId, errorMessage=$errorMessage, fiatCreditType=$fiatCreditType, invoiceId=$invoiceId, paymentGateway=$paymentGateway, revenueSystemPayments=$revenueSystemPayments, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
