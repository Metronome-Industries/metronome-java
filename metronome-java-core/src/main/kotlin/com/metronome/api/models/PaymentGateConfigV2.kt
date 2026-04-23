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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PaymentGateConfigV2
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val paymentGateType: JsonField<PaymentGateType>,
    private val precalculatedTaxConfig: JsonField<PrecalculatedTaxConfig>,
    private val stripeConfig: JsonField<StripeConfig>,
    private val taxType: JsonField<TaxType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("payment_gate_type")
        @ExcludeMissing
        paymentGateType: JsonField<PaymentGateType> = JsonMissing.of(),
        @JsonProperty("precalculated_tax_config")
        @ExcludeMissing
        precalculatedTaxConfig: JsonField<PrecalculatedTaxConfig> = JsonMissing.of(),
        @JsonProperty("stripe_config")
        @ExcludeMissing
        stripeConfig: JsonField<StripeConfig> = JsonMissing.of(),
        @JsonProperty("tax_type") @ExcludeMissing taxType: JsonField<TaxType> = JsonMissing.of(),
    ) : this(paymentGateType, precalculatedTaxConfig, stripeConfig, taxType, mutableMapOf())

    /**
     * Gate access to the commit balance based on successful collection of payment. Select STRIPE
     * for Metronome to facilitate payment via Stripe. Select EXTERNAL to facilitate payment using
     * your own payment integration. Select NONE if you do not wish to payment gate the commit
     * balance.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentGateType(): PaymentGateType = paymentGateType.getRequired("payment_gate_type")

    /**
     * Only applicable if using PRECALCULATED as your tax type.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun precalculatedTaxConfig(): Optional<PrecalculatedTaxConfig> =
        precalculatedTaxConfig.getOptional("precalculated_tax_config")

    /**
     * Only applicable if using STRIPE as your payment gateway type.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stripeConfig(): Optional<StripeConfig> = stripeConfig.getOptional("stripe_config")

    /**
     * Stripe tax is only supported for Stripe payment gateway. Select NONE if you do not wish
     * Metronome to calculate tax on your behalf. Leaving this field blank will default to NONE.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxType(): Optional<TaxType> = taxType.getOptional("tax_type")

    /**
     * Returns the raw JSON value of [paymentGateType].
     *
     * Unlike [paymentGateType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_gate_type")
    @ExcludeMissing
    fun _paymentGateType(): JsonField<PaymentGateType> = paymentGateType

    /**
     * Returns the raw JSON value of [precalculatedTaxConfig].
     *
     * Unlike [precalculatedTaxConfig], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("precalculated_tax_config")
    @ExcludeMissing
    fun _precalculatedTaxConfig(): JsonField<PrecalculatedTaxConfig> = precalculatedTaxConfig

    /**
     * Returns the raw JSON value of [stripeConfig].
     *
     * Unlike [stripeConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stripe_config")
    @ExcludeMissing
    fun _stripeConfig(): JsonField<StripeConfig> = stripeConfig

    /**
     * Returns the raw JSON value of [taxType].
     *
     * Unlike [taxType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_type") @ExcludeMissing fun _taxType(): JsonField<TaxType> = taxType

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
         * Returns a mutable builder for constructing an instance of [PaymentGateConfigV2].
         *
         * The following fields are required:
         * ```java
         * .paymentGateType()
         * ```
         */
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
         * Sets [Builder.paymentGateType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentGateType] with a well-typed [PaymentGateType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentGateType(paymentGateType: JsonField<PaymentGateType>) = apply {
            this.paymentGateType = paymentGateType
        }

        /** Only applicable if using PRECALCULATED as your tax type. */
        fun precalculatedTaxConfig(precalculatedTaxConfig: PrecalculatedTaxConfig) =
            precalculatedTaxConfig(JsonField.of(precalculatedTaxConfig))

        /**
         * Sets [Builder.precalculatedTaxConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.precalculatedTaxConfig] with a well-typed
         * [PrecalculatedTaxConfig] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun precalculatedTaxConfig(precalculatedTaxConfig: JsonField<PrecalculatedTaxConfig>) =
            apply {
                this.precalculatedTaxConfig = precalculatedTaxConfig
            }

        /** Only applicable if using STRIPE as your payment gateway type. */
        fun stripeConfig(stripeConfig: StripeConfig) = stripeConfig(JsonField.of(stripeConfig))

        /**
         * Sets [Builder.stripeConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stripeConfig] with a well-typed [StripeConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stripeConfig(stripeConfig: JsonField<StripeConfig>) = apply {
            this.stripeConfig = stripeConfig
        }

        /**
         * Stripe tax is only supported for Stripe payment gateway. Select NONE if you do not wish
         * Metronome to calculate tax on your behalf. Leaving this field blank will default to NONE.
         */
        fun taxType(taxType: TaxType) = taxType(JsonField.of(taxType))

        /**
         * Sets [Builder.taxType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxType] with a well-typed [TaxType] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [PaymentGateConfigV2].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .paymentGateType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentGateConfigV2 =
            PaymentGateConfigV2(
                checkRequired("paymentGateType", paymentGateType),
                precalculatedTaxConfig,
                stripeConfig,
                taxType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PaymentGateConfigV2 = apply {
        if (validated) {
            return@apply
        }

        paymentGateType().validate()
        precalculatedTaxConfig().ifPresent { it.validate() }
        stripeConfig().ifPresent { it.validate() }
        taxType().ifPresent { it.validate() }
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
        (paymentGateType.asKnown().getOrNull()?.validity() ?: 0) +
            (precalculatedTaxConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (stripeConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (taxType.asKnown().getOrNull()?.validity() ?: 0)

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

        private var validated: Boolean = false

        fun validate(): PaymentGateType = apply {
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

            return other is PaymentGateType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Only applicable if using PRECALCULATED as your tax type. */
    class PrecalculatedTaxConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val taxAmount: JsonField<Double>,
        private val taxName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("tax_amount")
            @ExcludeMissing
            taxAmount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tax_name") @ExcludeMissing taxName: JsonField<String> = JsonMissing.of(),
        ) : this(taxAmount, taxName, mutableMapOf())

        /**
         * Amount of tax to be applied. This should be in the same currency and denomination as the
         * commit's invoice schedule
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taxAmount(): Double = taxAmount.getRequired("tax_amount")

        /**
         * Name of the tax to be applied. This may be used in an invoice line item description.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun taxName(): Optional<String> = taxName.getOptional("tax_name")

        /**
         * Returns the raw JSON value of [taxAmount].
         *
         * Unlike [taxAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax_amount") @ExcludeMissing fun _taxAmount(): JsonField<Double> = taxAmount

        /**
         * Returns the raw JSON value of [taxName].
         *
         * Unlike [taxName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax_name") @ExcludeMissing fun _taxName(): JsonField<String> = taxName

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
             * Returns a mutable builder for constructing an instance of [PrecalculatedTaxConfig].
             *
             * The following fields are required:
             * ```java
             * .taxAmount()
             * ```
             */
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
             * Sets [Builder.taxAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxAmount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxAmount(taxAmount: JsonField<Double>) = apply { this.taxAmount = taxAmount }

            /**
             * Name of the tax to be applied. This may be used in an invoice line item description.
             */
            fun taxName(taxName: String) = taxName(JsonField.of(taxName))

            /**
             * Sets [Builder.taxName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [PrecalculatedTaxConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .taxAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PrecalculatedTaxConfig =
                PrecalculatedTaxConfig(
                    checkRequired("taxAmount", taxAmount),
                    taxName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PrecalculatedTaxConfig = apply {
            if (validated) {
                return@apply
            }

            taxAmount()
            taxName()
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
            (if (taxAmount.asKnown().isPresent) 1 else 0) +
                (if (taxName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PrecalculatedTaxConfig &&
                taxAmount == other.taxAmount &&
                taxName == other.taxName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(taxAmount, taxName, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PrecalculatedTaxConfig{taxAmount=$taxAmount, taxName=$taxName, additionalProperties=$additionalProperties}"
    }

    /** Only applicable if using STRIPE as your payment gateway type. */
    class StripeConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val paymentType: JsonField<PaymentType>,
        private val invoiceMetadata: JsonField<InvoiceMetadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payment_type")
            @ExcludeMissing
            paymentType: JsonField<PaymentType> = JsonMissing.of(),
            @JsonProperty("invoice_metadata")
            @ExcludeMissing
            invoiceMetadata: JsonField<InvoiceMetadata> = JsonMissing.of(),
        ) : this(paymentType, invoiceMetadata, mutableMapOf())

        /**
         * If left blank, will default to INVOICE
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentType(): PaymentType = paymentType.getRequired("payment_type")

        /**
         * Metadata to be added to the Stripe invoice. Only applicable if using INVOICE as your
         * payment type.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceMetadata(): Optional<InvoiceMetadata> =
            invoiceMetadata.getOptional("invoice_metadata")

        /**
         * Returns the raw JSON value of [paymentType].
         *
         * Unlike [paymentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payment_type")
        @ExcludeMissing
        fun _paymentType(): JsonField<PaymentType> = paymentType

        /**
         * Returns the raw JSON value of [invoiceMetadata].
         *
         * Unlike [invoiceMetadata], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoice_metadata")
        @ExcludeMissing
        fun _invoiceMetadata(): JsonField<InvoiceMetadata> = invoiceMetadata

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
             * Returns a mutable builder for constructing an instance of [StripeConfig].
             *
             * The following fields are required:
             * ```java
             * .paymentType()
             * ```
             */
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

            /**
             * Sets [Builder.paymentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentType] with a well-typed [PaymentType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.invoiceMetadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceMetadata] with a well-typed [InvoiceMetadata]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /**
             * Returns an immutable instance of [StripeConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .paymentType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): StripeConfig =
                StripeConfig(
                    checkRequired("paymentType", paymentType),
                    invoiceMetadata,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): StripeConfig = apply {
            if (validated) {
                return@apply
            }

            paymentType().validate()
            invoiceMetadata().ifPresent { it.validate() }
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
            (paymentType.asKnown().getOrNull()?.validity() ?: 0) +
                (invoiceMetadata.asKnown().getOrNull()?.validity() ?: 0)

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

            private var validated: Boolean = false

            fun validate(): PaymentType = apply {
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

                return other is PaymentType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Metadata to be added to the Stripe invoice. Only applicable if using INVOICE as your
         * payment type.
         */
        class InvoiceMetadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [InvoiceMetadata]. */
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

                /**
                 * Returns an immutable instance of [InvoiceMetadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): InvoiceMetadata = InvoiceMetadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): InvoiceMetadata = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InvoiceMetadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "InvoiceMetadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StripeConfig &&
                paymentType == other.paymentType &&
                invoiceMetadata == other.invoiceMetadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(paymentType, invoiceMetadata, additionalProperties)
        }

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

            @JvmField val PRECALCULATED = of("PRECALCULATED")

            @JvmStatic fun of(value: String) = TaxType(JsonField.of(value))
        }

        /** An enum containing [TaxType]'s known values. */
        enum class Known {
            NONE,
            STRIPE,
            ANROK,
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

        private var validated: Boolean = false

        fun validate(): TaxType = apply {
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

            return other is TaxType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentGateConfigV2 &&
            paymentGateType == other.paymentGateType &&
            precalculatedTaxConfig == other.precalculatedTaxConfig &&
            stripeConfig == other.stripeConfig &&
            taxType == other.taxType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            paymentGateType,
            precalculatedTaxConfig,
            stripeConfig,
            taxType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentGateConfigV2{paymentGateType=$paymentGateType, precalculatedTaxConfig=$precalculatedTaxConfig, stripeConfig=$stripeConfig, taxType=$taxType, additionalProperties=$additionalProperties}"
}
