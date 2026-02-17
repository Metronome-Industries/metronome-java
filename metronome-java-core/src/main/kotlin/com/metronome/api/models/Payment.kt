// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.checkRequired
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Payment
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("amount_paid")
    @ExcludeMissing
    private val amountPaid: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("contract_id")
    @ExcludeMissing
    private val contractId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("customer_id")
    @ExcludeMissing
    private val customerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("error_message")
    @ExcludeMissing
    private val errorMessage: JsonField<String> = JsonMissing.of(),
    @JsonProperty("fiat_credit_type")
    @ExcludeMissing
    private val fiatCreditType: JsonField<CreditTypeData> = JsonMissing.of(),
    @JsonProperty("invoice_id")
    @ExcludeMissing
    private val invoiceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_gateway")
    @ExcludeMissing
    private val paymentGateway: JsonField<PaymentGateway> = JsonMissing.of(),
    @JsonProperty("revenue_system_payments")
    @ExcludeMissing
    private val revenueSystemPayments: JsonField<List<RevenueSystemPayment>> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<PaymentStatus> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

    fun amountPaid(): Optional<Double> = Optional.ofNullable(amountPaid.getNullable("amount_paid"))

    fun contractId(): Optional<String> = Optional.ofNullable(contractId.getNullable("contract_id"))

    fun createdAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(createdAt.getNullable("created_at"))

    fun customerId(): Optional<String> = Optional.ofNullable(customerId.getNullable("customer_id"))

    fun errorMessage(): Optional<String> =
        Optional.ofNullable(errorMessage.getNullable("error_message"))

    fun fiatCreditType(): Optional<CreditTypeData> =
        Optional.ofNullable(fiatCreditType.getNullable("fiat_credit_type"))

    fun invoiceId(): Optional<String> = Optional.ofNullable(invoiceId.getNullable("invoice_id"))

    fun paymentGateway(): Optional<PaymentGateway> =
        Optional.ofNullable(paymentGateway.getNullable("payment_gateway"))

    fun revenueSystemPayments(): Optional<List<RevenueSystemPayment>> =
        Optional.ofNullable(revenueSystemPayments.getNullable("revenue_system_payments"))

    fun status(): Optional<PaymentStatus> = Optional.ofNullable(status.getNullable("status"))

    fun updatedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(updatedAt.getNullable("updated_at"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    @JsonProperty("amount_paid") @ExcludeMissing fun _amountPaid(): JsonField<Double> = amountPaid

    @JsonProperty("contract_id") @ExcludeMissing fun _contractId(): JsonField<String> = contractId

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    @JsonProperty("fiat_credit_type")
    @ExcludeMissing
    fun _fiatCreditType(): JsonField<CreditTypeData> = fiatCreditType

    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

    @JsonProperty("payment_gateway")
    @ExcludeMissing
    fun _paymentGateway(): JsonField<PaymentGateway> = paymentGateway

    @JsonProperty("revenue_system_payments")
    @ExcludeMissing
    fun _revenueSystemPayments(): JsonField<List<RevenueSystemPayment>> = revenueSystemPayments

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<PaymentStatus> = status

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

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
        status()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

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

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun amount(amount: Double) = amount(JsonField.of(amount))

        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        fun amountPaid(amountPaid: Double) = amountPaid(JsonField.of(amountPaid))

        fun amountPaid(amountPaid: JsonField<Double>) = apply { this.amountPaid = amountPaid }

        fun contractId(contractId: String) = contractId(JsonField.of(contractId))

        fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        fun fiatCreditType(fiatCreditType: CreditTypeData) =
            fiatCreditType(JsonField.of(fiatCreditType))

        fun fiatCreditType(fiatCreditType: JsonField<CreditTypeData>) = apply {
            this.fiatCreditType = fiatCreditType
        }

        fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

        fun paymentGateway(paymentGateway: PaymentGateway) =
            paymentGateway(JsonField.of(paymentGateway))

        fun paymentGateway(paymentGateway: JsonField<PaymentGateway>) = apply {
            this.paymentGateway = paymentGateway
        }

        fun revenueSystemPayments(revenueSystemPayments: List<RevenueSystemPayment>) =
            revenueSystemPayments(JsonField.of(revenueSystemPayments))

        fun revenueSystemPayments(revenueSystemPayments: JsonField<List<RevenueSystemPayment>>) =
            apply {
                this.revenueSystemPayments = revenueSystemPayments.map { it.toMutableList() }
            }

        fun addRevenueSystemPayment(revenueSystemPayment: RevenueSystemPayment) = apply {
            revenueSystemPayments =
                (revenueSystemPayments ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(revenueSystemPayment)
                }
        }

        fun status(status: PaymentStatus) = status(JsonField.of(status))

        fun status(status: JsonField<PaymentStatus>) = apply { this.status = status }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

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
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class PaymentGateway
    @JsonCreator
    private constructor(
        @JsonProperty("stripe")
        @ExcludeMissing
        private val stripe: JsonField<Stripe> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun stripe(): Stripe = stripe.getRequired("stripe")

        fun type(): Type = type.getRequired("type")

        @JsonProperty("stripe") @ExcludeMissing fun _stripe(): JsonField<Stripe> = stripe

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaymentGateway = apply {
            if (validated) {
                return@apply
            }

            stripe().validate()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun stripe(stripe: JsonField<Stripe>) = apply { this.stripe = stripe }

            fun type(type: Type) = type(JsonField.of(type))

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

            fun build(): PaymentGateway =
                PaymentGateway(
                    checkRequired("stripe", stripe),
                    checkRequired("type", type),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Stripe
        @JsonCreator
        private constructor(
            @JsonProperty("payment_intent_id")
            @ExcludeMissing
            private val paymentIntentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error")
            @ExcludeMissing
            private val error: JsonField<Error> = JsonMissing.of(),
            @JsonProperty("payment_method_id")
            @ExcludeMissing
            private val paymentMethodId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun paymentIntentId(): String = paymentIntentId.getRequired("payment_intent_id")

            fun error(): Optional<Error> = Optional.ofNullable(error.getNullable("error"))

            fun paymentMethodId(): Optional<String> =
                Optional.ofNullable(paymentMethodId.getNullable("payment_method_id"))

            @JsonProperty("payment_intent_id")
            @ExcludeMissing
            fun _paymentIntentId(): JsonField<String> = paymentIntentId

            @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Error> = error

            @JsonProperty("payment_method_id")
            @ExcludeMissing
            fun _paymentMethodId(): JsonField<String> = paymentMethodId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Stripe = apply {
                if (validated) {
                    return@apply
                }

                paymentIntentId()
                error().ifPresent { it.validate() }
                paymentMethodId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun paymentIntentId(paymentIntentId: JsonField<String>) = apply {
                    this.paymentIntentId = paymentIntentId
                }

                fun error(error: Error) = error(JsonField.of(error))

                fun error(error: JsonField<Error>) = apply { this.error = error }

                fun paymentMethodId(paymentMethodId: String) =
                    paymentMethodId(JsonField.of(paymentMethodId))

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

                fun build(): Stripe =
                    Stripe(
                        checkRequired("paymentIntentId", paymentIntentId),
                        error,
                        paymentMethodId,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Error
            @JsonCreator
            private constructor(
                @JsonProperty("code")
                @ExcludeMissing
                private val code: JsonField<String> = JsonMissing.of(),
                @JsonProperty("decline_code")
                @ExcludeMissing
                private val declineCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

                fun declineCode(): Optional<String> =
                    Optional.ofNullable(declineCode.getNullable("decline_code"))

                fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

                @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

                @JsonProperty("decline_code")
                @ExcludeMissing
                fun _declineCode(): JsonField<String> = declineCode

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Error = apply {
                    if (validated) {
                        return@apply
                    }

                    code()
                    declineCode()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

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

                    fun code(code: JsonField<String>) = apply { this.code = code }

                    fun declineCode(declineCode: String) = declineCode(JsonField.of(declineCode))

                    fun declineCode(declineCode: JsonField<String>) = apply {
                        this.declineCode = declineCode
                    }

                    fun type(type: String) = type(JsonField.of(type))

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

                    fun build(): Error =
                        Error(code, declineCode, type, additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Error && code == other.code && declineCode == other.declineCode && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(code, declineCode, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Error{code=$code, declineCode=$declineCode, type=$type, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Stripe && paymentIntentId == other.paymentIntentId && error == other.error && paymentMethodId == other.paymentMethodId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(paymentIntentId, error, paymentMethodId, additionalProperties) }
            /* spotless:on */

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentGateway && stripe == other.stripe && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(stripe, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentGateway{stripe=$stripe, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class RevenueSystemPayment
    @JsonCreator
    private constructor(
        @JsonProperty("revenue_system_provider")
        @ExcludeMissing
        private val revenueSystemProvider: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sync_status")
        @ExcludeMissing
        private val syncStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        private val errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("revenue_system_external_payment_id")
        @ExcludeMissing
        private val revenueSystemExternalPaymentId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun revenueSystemProvider(): String =
            revenueSystemProvider.getRequired("revenue_system_provider")

        fun syncStatus(): String = syncStatus.getRequired("sync_status")

        /** The error message from the revenue system, if available. */
        fun errorMessage(): Optional<String> =
            Optional.ofNullable(errorMessage.getNullable("error_message"))

        fun revenueSystemExternalPaymentId(): Optional<String> =
            Optional.ofNullable(
                revenueSystemExternalPaymentId.getNullable("revenue_system_external_payment_id")
            )

        @JsonProperty("revenue_system_provider")
        @ExcludeMissing
        fun _revenueSystemProvider(): JsonField<String> = revenueSystemProvider

        @JsonProperty("sync_status")
        @ExcludeMissing
        fun _syncStatus(): JsonField<String> = syncStatus

        /** The error message from the revenue system, if available. */
        @JsonProperty("error_message")
        @ExcludeMissing
        fun _errorMessage(): JsonField<String> = errorMessage

        @JsonProperty("revenue_system_external_payment_id")
        @ExcludeMissing
        fun _revenueSystemExternalPaymentId(): JsonField<String> = revenueSystemExternalPaymentId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun revenueSystemProvider(revenueSystemProvider: JsonField<String>) = apply {
                this.revenueSystemProvider = revenueSystemProvider
            }

            fun syncStatus(syncStatus: String) = syncStatus(JsonField.of(syncStatus))

            fun syncStatus(syncStatus: JsonField<String>) = apply { this.syncStatus = syncStatus }

            /** The error message from the revenue system, if available. */
            fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

            /** The error message from the revenue system, if available. */
            fun errorMessage(errorMessage: JsonField<String>) = apply {
                this.errorMessage = errorMessage
            }

            fun revenueSystemExternalPaymentId(revenueSystemExternalPaymentId: String) =
                revenueSystemExternalPaymentId(JsonField.of(revenueSystemExternalPaymentId))

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

            fun build(): RevenueSystemPayment =
                RevenueSystemPayment(
                    checkRequired("revenueSystemProvider", revenueSystemProvider),
                    checkRequired("syncStatus", syncStatus),
                    errorMessage,
                    revenueSystemExternalPaymentId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RevenueSystemPayment && revenueSystemProvider == other.revenueSystemProvider && syncStatus == other.syncStatus && errorMessage == other.errorMessage && revenueSystemExternalPaymentId == other.revenueSystemExternalPaymentId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(revenueSystemProvider, syncStatus, errorMessage, revenueSystemExternalPaymentId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RevenueSystemPayment{revenueSystemProvider=$revenueSystemProvider, syncStatus=$syncStatus, errorMessage=$errorMessage, revenueSystemExternalPaymentId=$revenueSystemExternalPaymentId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Payment && id == other.id && amount == other.amount && amountPaid == other.amountPaid && contractId == other.contractId && createdAt == other.createdAt && customerId == other.customerId && errorMessage == other.errorMessage && fiatCreditType == other.fiatCreditType && invoiceId == other.invoiceId && paymentGateway == other.paymentGateway && revenueSystemPayments == other.revenueSystemPayments && status == other.status && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, amountPaid, contractId, createdAt, customerId, errorMessage, fiatCreditType, invoiceId, paymentGateway, revenueSystemPayments, status, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Payment{id=$id, amount=$amount, amountPaid=$amountPaid, contractId=$contractId, createdAt=$createdAt, customerId=$customerId, errorMessage=$errorMessage, fiatCreditType=$fiatCreditType, invoiceId=$invoiceId, paymentGateway=$paymentGateway, revenueSystemPayments=$revenueSystemPayments, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
