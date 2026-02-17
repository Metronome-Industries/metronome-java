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
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Create a billing configuration for a customer. Once created, these configurations are available
 * to associate to a contract and dictates which downstream system to collect payment in or send the
 * invoice to. You can create multiple configurations per customer. The configuration formats are
 * distinct for each downstream provider.
 *
 * ### Use this endpoint to:
 * - Add the initial configuration to an existing customer. Once created, the billing configuration
 *   can then be associated to the customer's contract.
 * - Add a new configuration to an existing customer. This might be used as part of an upgrade or
 *   downgrade workflow where the customer was previously billed through system A (e.g. Stripe) but
 *   will now be billed through system B (e.g. AWS). Once created, the new configuration can then be
 *   associated to the customer's contract.
 * - Multiple configurations can be added per destination. For example, you can create two Stripe
 *   billing configurations for a Metronome customer that each have a distinct `collection_method`.
 *
 * ### Delivery method options:
 * - `direct_to_billing_provider`: Use when Metronome should send invoices directly to the billing
 *   provider's API (e.g., Stripe, NetSuite). This is the most common method for automated billing
 *   workflows.
 * - `tackle`: Use specifically for AWS Marketplace transactions that require Tackle's co-selling
 *   platform for partner attribution and commission tracking.
 * - `aws_sqs`: Use when you want invoice data delivered to an AWS SQS queue for custom processing
 *   before sending to your billing system.
 * - `aws_sns`: Use when you want invoice notifications published to an AWS SNS topic for
 *   event-driven billing workflows.
 *
 * ### Key response fields:
 *
 * The id for the customer billing configuration. This id can be used to associate the billing
 * configuration to a contract.
 *
 * ### Usage guidelines:
 *
 * Must use the `delivery_method_id` if you have multiple Stripe accounts connected to Metronome.
 */
class V1CustomerSetBillingConfigurationsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun data(): List<Data> = body.data()

    fun _data(): JsonField<List<Data>> = body._data()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        private val data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): List<Data> = data.getRequired("data")

        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            data().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<Data>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                data = body.data.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun data(data: List<Data>) = data(JsonField.of(data))

            fun data(data: JsonField<List<Data>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            fun addData(data: Data) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(data)
                    }
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

            fun build(): Body =
                Body(
                    checkRequired("data", data).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{data=$data, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1CustomerSetBillingConfigurationsParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            v1CustomerSetBillingConfigurationsParams: V1CustomerSetBillingConfigurationsParams
        ) = apply {
            body = v1CustomerSetBillingConfigurationsParams.body.toBuilder()
            additionalHeaders =
                v1CustomerSetBillingConfigurationsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                v1CustomerSetBillingConfigurationsParams.additionalQueryParams.toBuilder()
        }

        fun data(data: List<Data>) = apply { body.data(data) }

        fun data(data: JsonField<List<Data>>) = apply { body.data(data) }

        fun addData(data: Data) = apply { body.addData(data) }

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

        fun build(): V1CustomerSetBillingConfigurationsParams =
            V1CustomerSetBillingConfigurationsParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("billing_provider")
        @ExcludeMissing
        private val billingProvider: JsonField<BillingProvider> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("configuration")
        @ExcludeMissing
        private val configuration: JsonField<Configuration> = JsonMissing.of(),
        @JsonProperty("delivery_method")
        @ExcludeMissing
        private val deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of(),
        @JsonProperty("delivery_method_id")
        @ExcludeMissing
        private val deliveryMethodId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_provider")
        @ExcludeMissing
        private val taxProvider: JsonField<TaxProvider> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The billing provider set for this configuration. */
        fun billingProvider(): BillingProvider = billingProvider.getRequired("billing_provider")

        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * Configuration for the billing provider. The structure of this object is specific to the
         * billing provider and delivery method combination. Defaults to an empty object, however,
         * for most billing provider + delivery method combinations, it will not be a valid
         * configuration. For AWS marketplace configurations, the aws_is_subscription_product flag
         * can be used to indicate a product with usage-based pricing. More information can be found
         * [here](https://docs.metronome.com/invoice-customers/solutions/marketplaces/invoice-aws/#provision-aws-marketplace-customers-in-metronome).
         */
        fun configuration(): Optional<Configuration> =
            Optional.ofNullable(configuration.getNullable("configuration"))

        /**
         * The method to use for delivering invoices to this customer. If not provided, the
         * `delivery_method_id` must be provided.
         */
        fun deliveryMethod(): Optional<DeliveryMethod> =
            Optional.ofNullable(deliveryMethod.getNullable("delivery_method"))

        /**
         * ID of the delivery method to use for this customer. If not provided, the
         * `delivery_method` must be provided.
         */
        fun deliveryMethodId(): Optional<String> =
            Optional.ofNullable(deliveryMethodId.getNullable("delivery_method_id"))

        /**
         * Specifies which tax provider Metronome should use for tax calculation when billing
         * through Stripe. This is only supported for Stripe billing provider configurations with
         * auto_charge_payment_intent or manual_charge_payment_intent collection methods.
         */
        fun taxProvider(): Optional<TaxProvider> =
            Optional.ofNullable(taxProvider.getNullable("tax_provider"))

        /** The billing provider set for this configuration. */
        @JsonProperty("billing_provider")
        @ExcludeMissing
        fun _billingProvider(): JsonField<BillingProvider> = billingProvider

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Configuration for the billing provider. The structure of this object is specific to the
         * billing provider and delivery method combination. Defaults to an empty object, however,
         * for most billing provider + delivery method combinations, it will not be a valid
         * configuration. For AWS marketplace configurations, the aws_is_subscription_product flag
         * can be used to indicate a product with usage-based pricing. More information can be found
         * [here](https://docs.metronome.com/invoice-customers/solutions/marketplaces/invoice-aws/#provision-aws-marketplace-customers-in-metronome).
         */
        @JsonProperty("configuration")
        @ExcludeMissing
        fun _configuration(): JsonField<Configuration> = configuration

        /**
         * The method to use for delivering invoices to this customer. If not provided, the
         * `delivery_method_id` must be provided.
         */
        @JsonProperty("delivery_method")
        @ExcludeMissing
        fun _deliveryMethod(): JsonField<DeliveryMethod> = deliveryMethod

        /**
         * ID of the delivery method to use for this customer. If not provided, the
         * `delivery_method` must be provided.
         */
        @JsonProperty("delivery_method_id")
        @ExcludeMissing
        fun _deliveryMethodId(): JsonField<String> = deliveryMethodId

        /**
         * Specifies which tax provider Metronome should use for tax calculation when billing
         * through Stripe. This is only supported for Stripe billing provider configurations with
         * auto_charge_payment_intent or manual_charge_payment_intent collection methods.
         */
        @JsonProperty("tax_provider")
        @ExcludeMissing
        fun _taxProvider(): JsonField<TaxProvider> = taxProvider

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            billingProvider()
            customerId()
            configuration().ifPresent { it.validate() }
            deliveryMethod()
            deliveryMethodId()
            taxProvider()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var billingProvider: JsonField<BillingProvider>? = null
            private var customerId: JsonField<String>? = null
            private var configuration: JsonField<Configuration> = JsonMissing.of()
            private var deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of()
            private var deliveryMethodId: JsonField<String> = JsonMissing.of()
            private var taxProvider: JsonField<TaxProvider> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                billingProvider = data.billingProvider
                customerId = data.customerId
                configuration = data.configuration
                deliveryMethod = data.deliveryMethod
                deliveryMethodId = data.deliveryMethodId
                taxProvider = data.taxProvider
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The billing provider set for this configuration. */
            fun billingProvider(billingProvider: BillingProvider) =
                billingProvider(JsonField.of(billingProvider))

            /** The billing provider set for this configuration. */
            fun billingProvider(billingProvider: JsonField<BillingProvider>) = apply {
                this.billingProvider = billingProvider
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * Configuration for the billing provider. The structure of this object is specific to
             * the billing provider and delivery method combination. Defaults to an empty object,
             * however, for most billing provider + delivery method combinations, it will not be a
             * valid configuration. For AWS marketplace configurations, the
             * aws_is_subscription_product flag can be used to indicate a product with usage-based
             * pricing. More information can be found
             * [here](https://docs.metronome.com/invoice-customers/solutions/marketplaces/invoice-aws/#provision-aws-marketplace-customers-in-metronome).
             */
            fun configuration(configuration: Configuration) =
                configuration(JsonField.of(configuration))

            /**
             * Configuration for the billing provider. The structure of this object is specific to
             * the billing provider and delivery method combination. Defaults to an empty object,
             * however, for most billing provider + delivery method combinations, it will not be a
             * valid configuration. For AWS marketplace configurations, the
             * aws_is_subscription_product flag can be used to indicate a product with usage-based
             * pricing. More information can be found
             * [here](https://docs.metronome.com/invoice-customers/solutions/marketplaces/invoice-aws/#provision-aws-marketplace-customers-in-metronome).
             */
            fun configuration(configuration: JsonField<Configuration>) = apply {
                this.configuration = configuration
            }

            /**
             * The method to use for delivering invoices to this customer. If not provided, the
             * `delivery_method_id` must be provided.
             */
            fun deliveryMethod(deliveryMethod: DeliveryMethod) =
                deliveryMethod(JsonField.of(deliveryMethod))

            /**
             * The method to use for delivering invoices to this customer. If not provided, the
             * `delivery_method_id` must be provided.
             */
            fun deliveryMethod(deliveryMethod: JsonField<DeliveryMethod>) = apply {
                this.deliveryMethod = deliveryMethod
            }

            /**
             * ID of the delivery method to use for this customer. If not provided, the
             * `delivery_method` must be provided.
             */
            fun deliveryMethodId(deliveryMethodId: String) =
                deliveryMethodId(JsonField.of(deliveryMethodId))

            /**
             * ID of the delivery method to use for this customer. If not provided, the
             * `delivery_method` must be provided.
             */
            fun deliveryMethodId(deliveryMethodId: JsonField<String>) = apply {
                this.deliveryMethodId = deliveryMethodId
            }

            /**
             * Specifies which tax provider Metronome should use for tax calculation when billing
             * through Stripe. This is only supported for Stripe billing provider configurations
             * with auto_charge_payment_intent or manual_charge_payment_intent collection methods.
             */
            fun taxProvider(taxProvider: TaxProvider) = taxProvider(JsonField.of(taxProvider))

            /**
             * Specifies which tax provider Metronome should use for tax calculation when billing
             * through Stripe. This is only supported for Stripe billing provider configurations
             * with auto_charge_payment_intent or manual_charge_payment_intent collection methods.
             */
            fun taxProvider(taxProvider: JsonField<TaxProvider>) = apply {
                this.taxProvider = taxProvider
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

            fun build(): Data =
                Data(
                    checkRequired("billingProvider", billingProvider),
                    checkRequired("customerId", customerId),
                    configuration,
                    deliveryMethod,
                    deliveryMethodId,
                    taxProvider,
                    additionalProperties.toImmutable(),
                )
        }

        /** The billing provider set for this configuration. */
        class BillingProvider
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val AWS_MARKETPLACE = of("aws_marketplace")

                @JvmField val STRIPE = of("stripe")

                @JvmField val NETSUITE = of("netsuite")

                @JvmField val CUSTOM = of("custom")

                @JvmField val AZURE_MARKETPLACE = of("azure_marketplace")

                @JvmField val QUICKBOOKS_ONLINE = of("quickbooks_online")

                @JvmField val WORKDAY = of("workday")

                @JvmField val GCP_MARKETPLACE = of("gcp_marketplace")

                @JvmField val METRONOME = of("metronome")

                @JvmStatic fun of(value: String) = BillingProvider(JsonField.of(value))
            }

            /** An enum containing [BillingProvider]'s known values. */
            enum class Known {
                AWS_MARKETPLACE,
                STRIPE,
                NETSUITE,
                CUSTOM,
                AZURE_MARKETPLACE,
                QUICKBOOKS_ONLINE,
                WORKDAY,
                GCP_MARKETPLACE,
                METRONOME,
            }

            /**
             * An enum containing [BillingProvider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BillingProvider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AWS_MARKETPLACE,
                STRIPE,
                NETSUITE,
                CUSTOM,
                AZURE_MARKETPLACE,
                QUICKBOOKS_ONLINE,
                WORKDAY,
                GCP_MARKETPLACE,
                METRONOME,
                /**
                 * An enum member indicating that [BillingProvider] was instantiated with an unknown
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
                    AWS_MARKETPLACE -> Value.AWS_MARKETPLACE
                    STRIPE -> Value.STRIPE
                    NETSUITE -> Value.NETSUITE
                    CUSTOM -> Value.CUSTOM
                    AZURE_MARKETPLACE -> Value.AZURE_MARKETPLACE
                    QUICKBOOKS_ONLINE -> Value.QUICKBOOKS_ONLINE
                    WORKDAY -> Value.WORKDAY
                    GCP_MARKETPLACE -> Value.GCP_MARKETPLACE
                    METRONOME -> Value.METRONOME
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
                    AWS_MARKETPLACE -> Known.AWS_MARKETPLACE
                    STRIPE -> Known.STRIPE
                    NETSUITE -> Known.NETSUITE
                    CUSTOM -> Known.CUSTOM
                    AZURE_MARKETPLACE -> Known.AZURE_MARKETPLACE
                    QUICKBOOKS_ONLINE -> Known.QUICKBOOKS_ONLINE
                    WORKDAY -> Known.WORKDAY
                    GCP_MARKETPLACE -> Known.GCP_MARKETPLACE
                    METRONOME -> Known.METRONOME
                    else -> throw MetronomeInvalidDataException("Unknown BillingProvider: $value")
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

                return /* spotless:off */ other is BillingProvider && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Configuration for the billing provider. The structure of this object is specific to the
         * billing provider and delivery method combination. Defaults to an empty object, however,
         * for most billing provider + delivery method combinations, it will not be a valid
         * configuration. For AWS marketplace configurations, the aws_is_subscription_product flag
         * can be used to indicate a product with usage-based pricing. More information can be found
         * [here](https://docs.metronome.com/invoice-customers/solutions/marketplaces/invoice-aws/#provision-aws-marketplace-customers-in-metronome).
         */
        @NoAutoDetect
        class Configuration
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Configuration = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Configuration]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(configuration: Configuration) = apply {
                    additionalProperties = configuration.additionalProperties.toMutableMap()
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

                fun build(): Configuration = Configuration(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Configuration && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Configuration{additionalProperties=$additionalProperties}"
        }

        /**
         * The method to use for delivering invoices to this customer. If not provided, the
         * `delivery_method_id` must be provided.
         */
        class DeliveryMethod
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DIRECT_TO_BILLING_PROVIDER = of("direct_to_billing_provider")

                @JvmField val AWS_SQS = of("aws_sqs")

                @JvmField val TACKLE = of("tackle")

                @JvmField val AWS_SNS = of("aws_sns")

                @JvmStatic fun of(value: String) = DeliveryMethod(JsonField.of(value))
            }

            /** An enum containing [DeliveryMethod]'s known values. */
            enum class Known {
                DIRECT_TO_BILLING_PROVIDER,
                AWS_SQS,
                TACKLE,
                AWS_SNS,
            }

            /**
             * An enum containing [DeliveryMethod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DeliveryMethod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DIRECT_TO_BILLING_PROVIDER,
                AWS_SQS,
                TACKLE,
                AWS_SNS,
                /**
                 * An enum member indicating that [DeliveryMethod] was instantiated with an unknown
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
                    DIRECT_TO_BILLING_PROVIDER -> Value.DIRECT_TO_BILLING_PROVIDER
                    AWS_SQS -> Value.AWS_SQS
                    TACKLE -> Value.TACKLE
                    AWS_SNS -> Value.AWS_SNS
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
                    DIRECT_TO_BILLING_PROVIDER -> Known.DIRECT_TO_BILLING_PROVIDER
                    AWS_SQS -> Known.AWS_SQS
                    TACKLE -> Known.TACKLE
                    AWS_SNS -> Known.AWS_SNS
                    else -> throw MetronomeInvalidDataException("Unknown DeliveryMethod: $value")
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

                return /* spotless:off */ other is DeliveryMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Specifies which tax provider Metronome should use for tax calculation when billing
         * through Stripe. This is only supported for Stripe billing provider configurations with
         * auto_charge_payment_intent or manual_charge_payment_intent collection methods.
         */
        class TaxProvider @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val ANROK = of("anrok")

                @JvmField val AVALARA = of("avalara")

                @JvmField val STRIPE = of("stripe")

                @JvmStatic fun of(value: String) = TaxProvider(JsonField.of(value))
            }

            /** An enum containing [TaxProvider]'s known values. */
            enum class Known {
                ANROK,
                AVALARA,
                STRIPE,
            }

            /**
             * An enum containing [TaxProvider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [TaxProvider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ANROK,
                AVALARA,
                STRIPE,
                /**
                 * An enum member indicating that [TaxProvider] was instantiated with an unknown
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
                    ANROK -> Value.ANROK
                    AVALARA -> Value.AVALARA
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
                    ANROK -> Known.ANROK
                    AVALARA -> Known.AVALARA
                    STRIPE -> Known.STRIPE
                    else -> throw MetronomeInvalidDataException("Unknown TaxProvider: $value")
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

                return /* spotless:off */ other is TaxProvider && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && billingProvider == other.billingProvider && customerId == other.customerId && configuration == other.configuration && deliveryMethod == other.deliveryMethod && deliveryMethodId == other.deliveryMethodId && taxProvider == other.taxProvider && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billingProvider, customerId, configuration, deliveryMethod, deliveryMethodId, taxProvider, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{billingProvider=$billingProvider, customerId=$customerId, configuration=$configuration, deliveryMethod=$deliveryMethod, deliveryMethodId=$deliveryMethodId, taxProvider=$taxProvider, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1CustomerSetBillingConfigurationsParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V1CustomerSetBillingConfigurationsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
