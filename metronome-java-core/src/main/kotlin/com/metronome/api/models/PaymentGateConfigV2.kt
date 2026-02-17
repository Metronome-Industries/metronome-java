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
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class PaymentGateConfigV2
@JsonCreator
private constructor(
    @JsonProperty("payment_gate_type")
    @ExcludeMissing
    private val paymentGateType: JsonField<PaymentGateType> = JsonMissing.of(),
    @JsonProperty("precalculated_tax_config")
    @ExcludeMissing
    private val precalculatedTaxConfig: JsonField<PrecalculatedTaxConfig> = JsonMissing.of(),
    @JsonProperty("stripe_config")
    @ExcludeMissing
    private val stripeConfig: JsonField<StripeConfig> = JsonMissing.of(),
    @JsonProperty("tax_type")
    @ExcludeMissing
    private val taxType: JsonField<TaxType> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * Gate access to the commit balance based on successful collection of payment. Select STRIPE
     * for Metronome to facilitate payment via Stripe. Select EXTERNAL to facilitate payment using
     * your own payment integration. Select NONE if you do not wish to payment gate the commit
     * balance.
     */
    fun paymentGateType(): PaymentGateType = paymentGateType.getRequired("payment_gate_type")

    /** Only applicable if using PRECALCULATED as your tax type. */
    fun precalculatedTaxConfig(): Optional<PrecalculatedTaxConfig> =
        Optional.ofNullable(precalculatedTaxConfig.getNullable("precalculated_tax_config"))

    /** Only applicable if using STRIPE as your payment gateway type. */
    fun stripeConfig(): Optional<StripeConfig> =
        Optional.ofNullable(stripeConfig.getNullable("stripe_config"))

    /**
     * Stripe tax is only supported for Stripe payment gateway. Select NONE if you do not wish
     * Metronome to calculate tax on your behalf. Leaving this field blank will default to NONE.
     */
    fun taxType(): Optional<TaxType> = Optional.ofNullable(taxType.getNullable("tax_type"))

    /**
     * Gate access to the commit balance based on successful collection of payment. Select STRIPE
     * for Metronome to facilitate payment via Stripe. Select EXTERNAL to facilitate payment using
     * your own payment integration. Select NONE if you do not wish to payment gate the commit
     * balance.
     */
    @JsonProperty("payment_gate_type")
    @ExcludeMissing
    fun _paymentGateType(): JsonField<PaymentGateType> = paymentGateType

    /** Only applicable if using PRECALCULATED as your tax type. */
    @JsonProperty("precalculated_tax_config")
    @ExcludeMissing
    fun _precalculatedTaxConfig(): JsonField<PrecalculatedTaxConfig> = precalculatedTaxConfig

    /** Only applicable if using STRIPE as your payment gateway type. */
    @JsonProperty("stripe_config")
    @ExcludeMissing
    fun _stripeConfig(): JsonField<StripeConfig> = stripeConfig

    /**
     * Stripe tax is only supported for Stripe payment gateway. Select NONE if you do not wish
     * Metronome to calculate tax on your behalf. Leaving this field blank will default to NONE.
     */
    @JsonProperty("tax_type") @ExcludeMissing fun _taxType(): JsonField<TaxType> = taxType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PaymentGateConfigV2 = apply {
        if (validated) {
            return@apply
        }

        paymentGateType()
        precalculatedTaxConfig().ifPresent { it.validate() }
        stripeConfig().ifPresent { it.validate() }
        taxType()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentGateConfigV2]. */
    class Builder internal constructor() {

        private var paymentGateType: JsonField<PaymentGateType>? = null
        private var precalculatedTaxConfig: JsonField<PrecalculatedTaxConfig> = JsonMissing.of()
        private var stripeConfig: JsonField<StripeConfig> = JsonMissing.of()
        private var taxType: JsonField<TaxType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentGateConfigV2: PaymentGateConfigV2) = apply {
            paymentGateType = paymentGateConfigV2.paymentGateType
            precalculatedTaxConfig = paymentGateConfigV2.precalculatedTaxConfig
            stripeConfig = paymentGateConfigV2.stripeConfig
            taxType = paymentGateConfigV2.taxType
            additionalProperties = paymentGateConfigV2.additionalProperties.toMutableMap()
        }

        /**
         * Gate access to the commit balance based on successful collection of payment. Select
         * STRIPE for Metronome to facilitate payment via Stripe. Select EXTERNAL to facilitate
         * payment using your own payment integration. Select NONE if you do not wish to payment
         * gate the commit balance.
         */
        fun paymentGateType(paymentGateType: PaymentGateType) =
            paymentGateType(JsonField.of(paymentGateType))

        /**
         * Gate access to the commit balance based on successful collection of payment. Select
         * STRIPE for Metronome to facilitate payment via Stripe. Select EXTERNAL to facilitate
         * payment using your own payment integration. Select NONE if you do not wish to payment
         * gate the commit balance.
         */
        fun paymentGateType(paymentGateType: JsonField<PaymentGateType>) = apply {
            this.paymentGateType = paymentGateType
        }

        /** Only applicable if using PRECALCULATED as your tax type. */
        fun precalculatedTaxConfig(precalculatedTaxConfig: PrecalculatedTaxConfig) =
            precalculatedTaxConfig(JsonField.of(precalculatedTaxConfig))

        /** Only applicable if using PRECALCULATED as your tax type. */
        fun precalculatedTaxConfig(precalculatedTaxConfig: JsonField<PrecalculatedTaxConfig>) =
            apply {
                this.precalculatedTaxConfig = precalculatedTaxConfig
            }

        /** Only applicable if using STRIPE as your payment gateway type. */
        fun stripeConfig(stripeConfig: StripeConfig) = stripeConfig(JsonField.of(stripeConfig))

        /** Only applicable if using STRIPE as your payment gateway type. */
        fun stripeConfig(stripeConfig: JsonField<StripeConfig>) = apply {
            this.stripeConfig = stripeConfig
        }

        /**
         * Stripe tax is only supported for Stripe payment gateway. Select NONE if you do not wish
         * Metronome to calculate tax on your behalf. Leaving this field blank will default to NONE.
         */
        fun taxType(taxType: TaxType) = taxType(JsonField.of(taxType))

        /**
         * Stripe tax is only supported for Stripe payment gateway. Select NONE if you do not wish
         * Metronome to calculate tax on your behalf. Leaving this field blank will default to NONE.
         */
        fun taxType(taxType: JsonField<TaxType>) = apply { this.taxType = taxType }

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

        fun build(): PaymentGateConfigV2 =
            PaymentGateConfigV2(
                checkRequired("paymentGateType", paymentGateType),
                precalculatedTaxConfig,
                stripeConfig,
                taxType,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Gate access to the commit balance based on successful collection of payment. Select STRIPE
     * for Metronome to facilitate payment via Stripe. Select EXTERNAL to facilitate payment using
     * your own payment integration. Select NONE if you do not wish to payment gate the commit
     * balance.
     */
    class PaymentGateType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val NONE = of("NONE")

            @JvmField val STRIPE = of("STRIPE")

            @JvmField val EXTERNAL = of("EXTERNAL")

            @JvmStatic fun of(value: String) = PaymentGateType(JsonField.of(value))
        }

        /** An enum containing [PaymentGateType]'s known values. */
        enum class Known {
            NONE,
            STRIPE,
            EXTERNAL,
        }

        /**
         * An enum containing [PaymentGateType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PaymentGateType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            STRIPE,
            EXTERNAL,
            /**
             * An enum member indicating that [PaymentGateType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                NONE -> Value.NONE
                STRIPE -> Value.STRIPE
                EXTERNAL -> Value.EXTERNAL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                NONE -> Known.NONE
                STRIPE -> Known.STRIPE
                EXTERNAL -> Known.EXTERNAL
                else -> throw MetronomeInvalidDataException("Unknown PaymentGateType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                MetronomeInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentGateType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Only applicable if using PRECALCULATED as your tax type. */
    @NoAutoDetect
    class PrecalculatedTaxConfig
    @JsonCreator
    private constructor(
        @JsonProperty("tax_amount")
        @ExcludeMissing
        private val taxAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tax_name")
        @ExcludeMissing
        private val taxName: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Amount of tax to be applied. This should be in the same currency and denomination as the
         * commit's invoice schedule
         */
        fun taxAmount(): Double = taxAmount.getRequired("tax_amount")

        /** Name of the tax to be applied. This may be used in an invoice line item description. */
        fun taxName(): Optional<String> = Optional.ofNullable(taxName.getNullable("tax_name"))

        /**
         * Amount of tax to be applied. This should be in the same currency and denomination as the
         * commit's invoice schedule
         */
        @JsonProperty("tax_amount") @ExcludeMissing fun _taxAmount(): JsonField<Double> = taxAmount

        /** Name of the tax to be applied. This may be used in an invoice line item description. */
        @JsonProperty("tax_name") @ExcludeMissing fun _taxName(): JsonField<String> = taxName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PrecalculatedTaxConfig = apply {
            if (validated) {
                return@apply
            }

            taxAmount()
            taxName()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PrecalculatedTaxConfig]. */
        class Builder internal constructor() {

            private var taxAmount: JsonField<Double>? = null
            private var taxName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(precalculatedTaxConfig: PrecalculatedTaxConfig) = apply {
                taxAmount = precalculatedTaxConfig.taxAmount
                taxName = precalculatedTaxConfig.taxName
                additionalProperties = precalculatedTaxConfig.additionalProperties.toMutableMap()
            }

            /**
             * Amount of tax to be applied. This should be in the same currency and denomination as
             * the commit's invoice schedule
             */
            fun taxAmount(taxAmount: Double) = taxAmount(JsonField.of(taxAmount))

            /**
             * Amount of tax to be applied. This should be in the same currency and denomination as
             * the commit's invoice schedule
             */
            fun taxAmount(taxAmount: JsonField<Double>) = apply { this.taxAmount = taxAmount }

            /**
             * Name of the tax to be applied. This may be used in an invoice line item description.
             */
            fun taxName(taxName: String) = taxName(JsonField.of(taxName))

            /**
             * Name of the tax to be applied. This may be used in an invoice line item description.
             */
            fun taxName(taxName: JsonField<String>) = apply { this.taxName = taxName }

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

            fun build(): PrecalculatedTaxConfig =
                PrecalculatedTaxConfig(
                    checkRequired("taxAmount", taxAmount),
                    taxName,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PrecalculatedTaxConfig && taxAmount == other.taxAmount && taxName == other.taxName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(taxAmount, taxName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PrecalculatedTaxConfig{taxAmount=$taxAmount, taxName=$taxName, additionalProperties=$additionalProperties}"
    }

    /** Only applicable if using STRIPE as your payment gateway type. */
    @NoAutoDetect
    class StripeConfig
    @JsonCreator
    private constructor(
        @JsonProperty("payment_type")
        @ExcludeMissing
        private val paymentType: JsonField<PaymentType> = JsonMissing.of(),
        @JsonProperty("invoice_metadata")
        @ExcludeMissing
        private val invoiceMetadata: JsonField<InvoiceMetadata> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** If left blank, will default to INVOICE */
        fun paymentType(): PaymentType = paymentType.getRequired("payment_type")

        /**
         * Metadata to be added to the Stripe invoice. Only applicable if using INVOICE as your
         * payment type.
         */
        fun invoiceMetadata(): Optional<InvoiceMetadata> =
            Optional.ofNullable(invoiceMetadata.getNullable("invoice_metadata"))

        /** If left blank, will default to INVOICE */
        @JsonProperty("payment_type")
        @ExcludeMissing
        fun _paymentType(): JsonField<PaymentType> = paymentType

        /**
         * Metadata to be added to the Stripe invoice. Only applicable if using INVOICE as your
         * payment type.
         */
        @JsonProperty("invoice_metadata")
        @ExcludeMissing
        fun _invoiceMetadata(): JsonField<InvoiceMetadata> = invoiceMetadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): StripeConfig = apply {
            if (validated) {
                return@apply
            }

            paymentType()
            invoiceMetadata().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [StripeConfig]. */
        class Builder internal constructor() {

            private var paymentType: JsonField<PaymentType>? = null
            private var invoiceMetadata: JsonField<InvoiceMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stripeConfig: StripeConfig) = apply {
                paymentType = stripeConfig.paymentType
                invoiceMetadata = stripeConfig.invoiceMetadata
                additionalProperties = stripeConfig.additionalProperties.toMutableMap()
            }

            /** If left blank, will default to INVOICE */
            fun paymentType(paymentType: PaymentType) = paymentType(JsonField.of(paymentType))

            /** If left blank, will default to INVOICE */
            fun paymentType(paymentType: JsonField<PaymentType>) = apply {
                this.paymentType = paymentType
            }

            /**
             * Metadata to be added to the Stripe invoice. Only applicable if using INVOICE as your
             * payment type.
             */
            fun invoiceMetadata(invoiceMetadata: InvoiceMetadata) =
                invoiceMetadata(JsonField.of(invoiceMetadata))

            /**
             * Metadata to be added to the Stripe invoice. Only applicable if using INVOICE as your
             * payment type.
             */
            fun invoiceMetadata(invoiceMetadata: JsonField<InvoiceMetadata>) = apply {
                this.invoiceMetadata = invoiceMetadata
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

            fun build(): StripeConfig =
                StripeConfig(
                    checkRequired("paymentType", paymentType),
                    invoiceMetadata,
                    additionalProperties.toImmutable(),
                )
        }

        /** If left blank, will default to INVOICE */
        class PaymentType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val INVOICE = of("INVOICE")

                @JvmField val PAYMENT_INTENT = of("PAYMENT_INTENT")

                @JvmStatic fun of(value: String) = PaymentType(JsonField.of(value))
            }

            /** An enum containing [PaymentType]'s known values. */
            enum class Known {
                INVOICE,
                PAYMENT_INTENT,
            }

            /**
             * An enum containing [PaymentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INVOICE,
                PAYMENT_INTENT,
                /**
                 * An enum member indicating that [PaymentType] was instantiated with an unknown
                 * value.
                 */
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
                    INVOICE -> Value.INVOICE
                    PAYMENT_INTENT -> Value.PAYMENT_INTENT
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
                    INVOICE -> Known.INVOICE
                    PAYMENT_INTENT -> Known.PAYMENT_INTENT
                    else -> throw MetronomeInvalidDataException("Unknown PaymentType: $value")
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

                return /* spotless:off */ other is PaymentType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Metadata to be added to the Stripe invoice. Only applicable if using INVOICE as your
         * payment type.
         */
        @NoAutoDetect
        class InvoiceMetadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): InvoiceMetadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InvoiceMetadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(invoiceMetadata: InvoiceMetadata) = apply {
                    additionalProperties = invoiceMetadata.additionalProperties.toMutableMap()
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

                fun build(): InvoiceMetadata = InvoiceMetadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoiceMetadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "InvoiceMetadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StripeConfig && paymentType == other.paymentType && invoiceMetadata == other.invoiceMetadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(paymentType, invoiceMetadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StripeConfig{paymentType=$paymentType, invoiceMetadata=$invoiceMetadata, additionalProperties=$additionalProperties}"
    }

    /**
     * Stripe tax is only supported for Stripe payment gateway. Select NONE if you do not wish
     * Metronome to calculate tax on your behalf. Leaving this field blank will default to NONE.
     */
    class TaxType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val NONE = of("NONE")

            @JvmField val STRIPE = of("STRIPE")

            @JvmField val ANROK = of("ANROK")

            @JvmField val AVALARA = of("AVALARA")

            @JvmField val PRECALCULATED = of("PRECALCULATED")

            @JvmStatic fun of(value: String) = TaxType(JsonField.of(value))
        }

        /** An enum containing [TaxType]'s known values. */
        enum class Known {
            NONE,
            STRIPE,
            ANROK,
            AVALARA,
            PRECALCULATED,
        }

        /**
         * An enum containing [TaxType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TaxType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            STRIPE,
            ANROK,
            AVALARA,
            PRECALCULATED,
            /** An enum member indicating that [TaxType] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                NONE -> Value.NONE
                STRIPE -> Value.STRIPE
                ANROK -> Value.ANROK
                AVALARA -> Value.AVALARA
                PRECALCULATED -> Value.PRECALCULATED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                NONE -> Known.NONE
                STRIPE -> Known.STRIPE
                ANROK -> Known.ANROK
                AVALARA -> Known.AVALARA
                PRECALCULATED -> Known.PRECALCULATED
                else -> throw MetronomeInvalidDataException("Unknown TaxType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                MetronomeInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaxType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentGateConfigV2 && paymentGateType == other.paymentGateType && precalculatedTaxConfig == other.precalculatedTaxConfig && stripeConfig == other.stripeConfig && taxType == other.taxType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(paymentGateType, precalculatedTaxConfig, stripeConfig, taxType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentGateConfigV2{paymentGateType=$paymentGateType, precalculatedTaxConfig=$precalculatedTaxConfig, stripeConfig=$stripeConfig, taxType=$taxType, additionalProperties=$additionalProperties}"
}
