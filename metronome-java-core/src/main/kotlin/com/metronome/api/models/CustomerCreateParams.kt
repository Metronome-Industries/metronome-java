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

/** Create a new customer */
class CustomerCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** This will be truncated to 160 characters if the provided name is longer. */
    fun name(): String = body.name()

    fun billingConfig(): Optional<BillingConfig> = body.billingConfig()

    fun customFields(): Optional<CustomFields> = body.customFields()

    fun customerBillingProviderConfigurations():
        Optional<List<CustomerBillingProviderConfiguration>> =
        body.customerBillingProviderConfigurations()

    /**
     * (deprecated, use ingest_aliases instead) an alias that can be used to refer to this customer
     * in usage events
     */
    fun externalId(): Optional<String> = body.externalId()

    /** Aliases that can be used to refer to this customer in usage events */
    fun ingestAliases(): Optional<List<String>> = body.ingestAliases()

    /** This will be truncated to 160 characters if the provided name is longer. */
    fun _name(): JsonField<String> = body._name()

    fun _billingConfig(): JsonField<BillingConfig> = body._billingConfig()

    fun _customFields(): JsonField<CustomFields> = body._customFields()

    fun _customerBillingProviderConfigurations():
        JsonField<List<CustomerBillingProviderConfiguration>> =
        body._customerBillingProviderConfigurations()

    /**
     * (deprecated, use ingest_aliases instead) an alias that can be used to refer to this customer
     * in usage events
     */
    fun _externalId(): JsonField<String> = body._externalId()

    /** Aliases that can be used to refer to this customer in usage events */
    fun _ingestAliases(): JsonField<List<String>> = body._ingestAliases()

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
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_config")
        @ExcludeMissing
        private val billingConfig: JsonField<BillingConfig> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("customer_billing_provider_configurations")
        @ExcludeMissing
        private val customerBillingProviderConfigurations:
            JsonField<List<CustomerBillingProviderConfiguration>> =
            JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        private val externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ingest_aliases")
        @ExcludeMissing
        private val ingestAliases: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** This will be truncated to 160 characters if the provided name is longer. */
        fun name(): String = name.getRequired("name")

        fun billingConfig(): Optional<BillingConfig> =
            Optional.ofNullable(billingConfig.getNullable("billing_config"))

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        fun customerBillingProviderConfigurations():
            Optional<List<CustomerBillingProviderConfiguration>> =
            Optional.ofNullable(
                customerBillingProviderConfigurations.getNullable(
                    "customer_billing_provider_configurations"
                )
            )

        /**
         * (deprecated, use ingest_aliases instead) an alias that can be used to refer to this
         * customer in usage events
         */
        fun externalId(): Optional<String> =
            Optional.ofNullable(externalId.getNullable("external_id"))

        /** Aliases that can be used to refer to this customer in usage events */
        fun ingestAliases(): Optional<List<String>> =
            Optional.ofNullable(ingestAliases.getNullable("ingest_aliases"))

        /** This will be truncated to 160 characters if the provided name is longer. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("billing_config")
        @ExcludeMissing
        fun _billingConfig(): JsonField<BillingConfig> = billingConfig

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        @JsonProperty("customer_billing_provider_configurations")
        @ExcludeMissing
        fun _customerBillingProviderConfigurations():
            JsonField<List<CustomerBillingProviderConfiguration>> =
            customerBillingProviderConfigurations

        /**
         * (deprecated, use ingest_aliases instead) an alias that can be used to refer to this
         * customer in usage events
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /** Aliases that can be used to refer to this customer in usage events */
        @JsonProperty("ingest_aliases")
        @ExcludeMissing
        fun _ingestAliases(): JsonField<List<String>> = ingestAliases

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            billingConfig().ifPresent { it.validate() }
            customFields().ifPresent { it.validate() }
            customerBillingProviderConfigurations().ifPresent { it.forEach { it.validate() } }
            externalId()
            ingestAliases()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var billingConfig: JsonField<BillingConfig> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var customerBillingProviderConfigurations:
                JsonField<MutableList<CustomerBillingProviderConfiguration>>? =
                null
            private var externalId: JsonField<String> = JsonMissing.of()
            private var ingestAliases: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                billingConfig = body.billingConfig
                customFields = body.customFields
                customerBillingProviderConfigurations =
                    body.customerBillingProviderConfigurations.map { it.toMutableList() }
                externalId = body.externalId
                ingestAliases = body.ingestAliases.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** This will be truncated to 160 characters if the provided name is longer. */
            fun name(name: String) = name(JsonField.of(name))

            /** This will be truncated to 160 characters if the provided name is longer. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun billingConfig(billingConfig: BillingConfig) =
                billingConfig(JsonField.of(billingConfig))

            fun billingConfig(billingConfig: JsonField<BillingConfig>) = apply {
                this.billingConfig = billingConfig
            }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            fun customerBillingProviderConfigurations(
                customerBillingProviderConfigurations: List<CustomerBillingProviderConfiguration>
            ) =
                customerBillingProviderConfigurations(
                    JsonField.of(customerBillingProviderConfigurations)
                )

            fun customerBillingProviderConfigurations(
                customerBillingProviderConfigurations:
                    JsonField<List<CustomerBillingProviderConfiguration>>
            ) = apply {
                this.customerBillingProviderConfigurations =
                    customerBillingProviderConfigurations.map { it.toMutableList() }
            }

            fun addCustomerBillingProviderConfiguration(
                customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
            ) = apply {
                customerBillingProviderConfigurations =
                    (customerBillingProviderConfigurations ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(customerBillingProviderConfiguration)
                    }
            }

            /**
             * (deprecated, use ingest_aliases instead) an alias that can be used to refer to this
             * customer in usage events
             */
            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * (deprecated, use ingest_aliases instead) an alias that can be used to refer to this
             * customer in usage events
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /** Aliases that can be used to refer to this customer in usage events */
            fun ingestAliases(ingestAliases: List<String>) =
                ingestAliases(JsonField.of(ingestAliases))

            /** Aliases that can be used to refer to this customer in usage events */
            fun ingestAliases(ingestAliases: JsonField<List<String>>) = apply {
                this.ingestAliases = ingestAliases.map { it.toMutableList() }
            }

            /** Aliases that can be used to refer to this customer in usage events */
            fun addIngestAlias(ingestAlias: String) = apply {
                ingestAliases =
                    (ingestAliases ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(ingestAlias)
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
                    checkRequired("name", name),
                    billingConfig,
                    customFields,
                    (customerBillingProviderConfigurations ?: JsonMissing.of()).map {
                        it.toImmutable()
                    },
                    externalId,
                    (ingestAliases ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && name == other.name && billingConfig == other.billingConfig && customFields == other.customFields && customerBillingProviderConfigurations == other.customerBillingProviderConfigurations && externalId == other.externalId && ingestAliases == other.ingestAliases && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, billingConfig, customFields, customerBillingProviderConfigurations, externalId, ingestAliases, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, billingConfig=$billingConfig, customFields=$customFields, customerBillingProviderConfigurations=$customerBillingProviderConfigurations, externalId=$externalId, ingestAliases=$ingestAliases, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerCreateParams: CustomerCreateParams) = apply {
            body = customerCreateParams.body.toBuilder()
            additionalHeaders = customerCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCreateParams.additionalQueryParams.toBuilder()
        }

        /** This will be truncated to 160 characters if the provided name is longer. */
        fun name(name: String) = apply { body.name(name) }

        /** This will be truncated to 160 characters if the provided name is longer. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun billingConfig(billingConfig: BillingConfig) = apply {
            body.billingConfig(billingConfig)
        }

        fun billingConfig(billingConfig: JsonField<BillingConfig>) = apply {
            body.billingConfig(billingConfig)
        }

        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        fun customerBillingProviderConfigurations(
            customerBillingProviderConfigurations: List<CustomerBillingProviderConfiguration>
        ) = apply {
            body.customerBillingProviderConfigurations(customerBillingProviderConfigurations)
        }

        fun customerBillingProviderConfigurations(
            customerBillingProviderConfigurations:
                JsonField<List<CustomerBillingProviderConfiguration>>
        ) = apply {
            body.customerBillingProviderConfigurations(customerBillingProviderConfigurations)
        }

        fun addCustomerBillingProviderConfiguration(
            customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
        ) = apply {
            body.addCustomerBillingProviderConfiguration(customerBillingProviderConfiguration)
        }

        /**
         * (deprecated, use ingest_aliases instead) an alias that can be used to refer to this
         * customer in usage events
         */
        fun externalId(externalId: String) = apply { body.externalId(externalId) }

        /**
         * (deprecated, use ingest_aliases instead) an alias that can be used to refer to this
         * customer in usage events
         */
        fun externalId(externalId: JsonField<String>) = apply { body.externalId(externalId) }

        /** Aliases that can be used to refer to this customer in usage events */
        fun ingestAliases(ingestAliases: List<String>) = apply { body.ingestAliases(ingestAliases) }

        /** Aliases that can be used to refer to this customer in usage events */
        fun ingestAliases(ingestAliases: JsonField<List<String>>) = apply {
            body.ingestAliases(ingestAliases)
        }

        /** Aliases that can be used to refer to this customer in usage events */
        fun addIngestAlias(ingestAlias: String) = apply { body.addIngestAlias(ingestAlias) }

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

        fun build(): CustomerCreateParams =
            CustomerCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class BillingConfig
    @JsonCreator
    private constructor(
        @JsonProperty("billing_provider_customer_id")
        @ExcludeMissing
        private val billingProviderCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_provider_type")
        @ExcludeMissing
        private val billingProviderType: JsonField<BillingProviderType> = JsonMissing.of(),
        @JsonProperty("aws_is_subscription_product")
        @ExcludeMissing
        private val awsIsSubscriptionProduct: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("aws_product_code")
        @ExcludeMissing
        private val awsProductCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aws_region")
        @ExcludeMissing
        private val awsRegion: JsonField<AwsRegion> = JsonMissing.of(),
        @JsonProperty("stripe_collection_method")
        @ExcludeMissing
        private val stripeCollectionMethod: JsonField<StripeCollectionMethod> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun billingProviderCustomerId(): String =
            billingProviderCustomerId.getRequired("billing_provider_customer_id")

        fun billingProviderType(): BillingProviderType =
            billingProviderType.getRequired("billing_provider_type")

        /** True if the aws_product_code is a SAAS subscription product, false otherwise. */
        fun awsIsSubscriptionProduct(): Optional<Boolean> =
            Optional.ofNullable(awsIsSubscriptionProduct.getNullable("aws_is_subscription_product"))

        fun awsProductCode(): Optional<String> =
            Optional.ofNullable(awsProductCode.getNullable("aws_product_code"))

        fun awsRegion(): Optional<AwsRegion> =
            Optional.ofNullable(awsRegion.getNullable("aws_region"))

        fun stripeCollectionMethod(): Optional<StripeCollectionMethod> =
            Optional.ofNullable(stripeCollectionMethod.getNullable("stripe_collection_method"))

        @JsonProperty("billing_provider_customer_id")
        @ExcludeMissing
        fun _billingProviderCustomerId(): JsonField<String> = billingProviderCustomerId

        @JsonProperty("billing_provider_type")
        @ExcludeMissing
        fun _billingProviderType(): JsonField<BillingProviderType> = billingProviderType

        /** True if the aws_product_code is a SAAS subscription product, false otherwise. */
        @JsonProperty("aws_is_subscription_product")
        @ExcludeMissing
        fun _awsIsSubscriptionProduct(): JsonField<Boolean> = awsIsSubscriptionProduct

        @JsonProperty("aws_product_code")
        @ExcludeMissing
        fun _awsProductCode(): JsonField<String> = awsProductCode

        @JsonProperty("aws_region")
        @ExcludeMissing
        fun _awsRegion(): JsonField<AwsRegion> = awsRegion

        @JsonProperty("stripe_collection_method")
        @ExcludeMissing
        fun _stripeCollectionMethod(): JsonField<StripeCollectionMethod> = stripeCollectionMethod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BillingConfig = apply {
            if (validated) {
                return@apply
            }

            billingProviderCustomerId()
            billingProviderType()
            awsIsSubscriptionProduct()
            awsProductCode()
            awsRegion()
            stripeCollectionMethod()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BillingConfig]. */
        class Builder internal constructor() {

            private var billingProviderCustomerId: JsonField<String>? = null
            private var billingProviderType: JsonField<BillingProviderType>? = null
            private var awsIsSubscriptionProduct: JsonField<Boolean> = JsonMissing.of()
            private var awsProductCode: JsonField<String> = JsonMissing.of()
            private var awsRegion: JsonField<AwsRegion> = JsonMissing.of()
            private var stripeCollectionMethod: JsonField<StripeCollectionMethod> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingConfig: BillingConfig) = apply {
                billingProviderCustomerId = billingConfig.billingProviderCustomerId
                billingProviderType = billingConfig.billingProviderType
                awsIsSubscriptionProduct = billingConfig.awsIsSubscriptionProduct
                awsProductCode = billingConfig.awsProductCode
                awsRegion = billingConfig.awsRegion
                stripeCollectionMethod = billingConfig.stripeCollectionMethod
                additionalProperties = billingConfig.additionalProperties.toMutableMap()
            }

            fun billingProviderCustomerId(billingProviderCustomerId: String) =
                billingProviderCustomerId(JsonField.of(billingProviderCustomerId))

            fun billingProviderCustomerId(billingProviderCustomerId: JsonField<String>) = apply {
                this.billingProviderCustomerId = billingProviderCustomerId
            }

            fun billingProviderType(billingProviderType: BillingProviderType) =
                billingProviderType(JsonField.of(billingProviderType))

            fun billingProviderType(billingProviderType: JsonField<BillingProviderType>) = apply {
                this.billingProviderType = billingProviderType
            }

            /** True if the aws_product_code is a SAAS subscription product, false otherwise. */
            fun awsIsSubscriptionProduct(awsIsSubscriptionProduct: Boolean) =
                awsIsSubscriptionProduct(JsonField.of(awsIsSubscriptionProduct))

            /** True if the aws_product_code is a SAAS subscription product, false otherwise. */
            fun awsIsSubscriptionProduct(awsIsSubscriptionProduct: JsonField<Boolean>) = apply {
                this.awsIsSubscriptionProduct = awsIsSubscriptionProduct
            }

            fun awsProductCode(awsProductCode: String) =
                awsProductCode(JsonField.of(awsProductCode))

            fun awsProductCode(awsProductCode: JsonField<String>) = apply {
                this.awsProductCode = awsProductCode
            }

            fun awsRegion(awsRegion: AwsRegion) = awsRegion(JsonField.of(awsRegion))

            fun awsRegion(awsRegion: JsonField<AwsRegion>) = apply { this.awsRegion = awsRegion }

            fun stripeCollectionMethod(stripeCollectionMethod: StripeCollectionMethod) =
                stripeCollectionMethod(JsonField.of(stripeCollectionMethod))

            fun stripeCollectionMethod(stripeCollectionMethod: JsonField<StripeCollectionMethod>) =
                apply {
                    this.stripeCollectionMethod = stripeCollectionMethod
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

            fun build(): BillingConfig =
                BillingConfig(
                    checkRequired("billingProviderCustomerId", billingProviderCustomerId),
                    checkRequired("billingProviderType", billingProviderType),
                    awsIsSubscriptionProduct,
                    awsProductCode,
                    awsRegion,
                    stripeCollectionMethod,
                    additionalProperties.toImmutable(),
                )
        }

        class BillingProviderType
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

                @JvmStatic fun of(value: String) = BillingProviderType(JsonField.of(value))
            }

            /** An enum containing [BillingProviderType]'s known values. */
            enum class Known {
                AWS_MARKETPLACE,
                STRIPE,
                NETSUITE,
                CUSTOM,
                AZURE_MARKETPLACE,
                QUICKBOOKS_ONLINE,
                WORKDAY,
                GCP_MARKETPLACE,
            }

            /**
             * An enum containing [BillingProviderType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [BillingProviderType] can contain an unknown value in a couple of
             * cases:
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
                /**
                 * An enum member indicating that [BillingProviderType] was instantiated with an
                 * unknown value.
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
                    else ->
                        throw MetronomeInvalidDataException("Unknown BillingProviderType: $value")
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

                return /* spotless:off */ other is BillingProviderType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class AwsRegion @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val AF_SOUTH_1 = of("af-south-1")

                @JvmField val AP_EAST_1 = of("ap-east-1")

                @JvmField val AP_NORTHEAST_1 = of("ap-northeast-1")

                @JvmField val AP_NORTHEAST_2 = of("ap-northeast-2")

                @JvmField val AP_NORTHEAST_3 = of("ap-northeast-3")

                @JvmField val AP_SOUTH_1 = of("ap-south-1")

                @JvmField val AP_SOUTHEAST_1 = of("ap-southeast-1")

                @JvmField val AP_SOUTHEAST_2 = of("ap-southeast-2")

                @JvmField val CA_CENTRAL_1 = of("ca-central-1")

                @JvmField val CN_NORTH_1 = of("cn-north-1")

                @JvmField val CN_NORTHWEST_1 = of("cn-northwest-1")

                @JvmField val EU_CENTRAL_1 = of("eu-central-1")

                @JvmField val EU_NORTH_1 = of("eu-north-1")

                @JvmField val EU_SOUTH_1 = of("eu-south-1")

                @JvmField val EU_WEST_1 = of("eu-west-1")

                @JvmField val EU_WEST_2 = of("eu-west-2")

                @JvmField val EU_WEST_3 = of("eu-west-3")

                @JvmField val ME_SOUTH_1 = of("me-south-1")

                @JvmField val SA_EAST_1 = of("sa-east-1")

                @JvmField val US_EAST_1 = of("us-east-1")

                @JvmField val US_EAST_2 = of("us-east-2")

                @JvmField val US_GOV_EAST_1 = of("us-gov-east-1")

                @JvmField val US_GOV_WEST_1 = of("us-gov-west-1")

                @JvmField val US_WEST_1 = of("us-west-1")

                @JvmField val US_WEST_2 = of("us-west-2")

                @JvmStatic fun of(value: String) = AwsRegion(JsonField.of(value))
            }

            /** An enum containing [AwsRegion]'s known values. */
            enum class Known {
                AF_SOUTH_1,
                AP_EAST_1,
                AP_NORTHEAST_1,
                AP_NORTHEAST_2,
                AP_NORTHEAST_3,
                AP_SOUTH_1,
                AP_SOUTHEAST_1,
                AP_SOUTHEAST_2,
                CA_CENTRAL_1,
                CN_NORTH_1,
                CN_NORTHWEST_1,
                EU_CENTRAL_1,
                EU_NORTH_1,
                EU_SOUTH_1,
                EU_WEST_1,
                EU_WEST_2,
                EU_WEST_3,
                ME_SOUTH_1,
                SA_EAST_1,
                US_EAST_1,
                US_EAST_2,
                US_GOV_EAST_1,
                US_GOV_WEST_1,
                US_WEST_1,
                US_WEST_2,
            }

            /**
             * An enum containing [AwsRegion]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AwsRegion] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AF_SOUTH_1,
                AP_EAST_1,
                AP_NORTHEAST_1,
                AP_NORTHEAST_2,
                AP_NORTHEAST_3,
                AP_SOUTH_1,
                AP_SOUTHEAST_1,
                AP_SOUTHEAST_2,
                CA_CENTRAL_1,
                CN_NORTH_1,
                CN_NORTHWEST_1,
                EU_CENTRAL_1,
                EU_NORTH_1,
                EU_SOUTH_1,
                EU_WEST_1,
                EU_WEST_2,
                EU_WEST_3,
                ME_SOUTH_1,
                SA_EAST_1,
                US_EAST_1,
                US_EAST_2,
                US_GOV_EAST_1,
                US_GOV_WEST_1,
                US_WEST_1,
                US_WEST_2,
                /**
                 * An enum member indicating that [AwsRegion] was instantiated with an unknown
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
                    AF_SOUTH_1 -> Value.AF_SOUTH_1
                    AP_EAST_1 -> Value.AP_EAST_1
                    AP_NORTHEAST_1 -> Value.AP_NORTHEAST_1
                    AP_NORTHEAST_2 -> Value.AP_NORTHEAST_2
                    AP_NORTHEAST_3 -> Value.AP_NORTHEAST_3
                    AP_SOUTH_1 -> Value.AP_SOUTH_1
                    AP_SOUTHEAST_1 -> Value.AP_SOUTHEAST_1
                    AP_SOUTHEAST_2 -> Value.AP_SOUTHEAST_2
                    CA_CENTRAL_1 -> Value.CA_CENTRAL_1
                    CN_NORTH_1 -> Value.CN_NORTH_1
                    CN_NORTHWEST_1 -> Value.CN_NORTHWEST_1
                    EU_CENTRAL_1 -> Value.EU_CENTRAL_1
                    EU_NORTH_1 -> Value.EU_NORTH_1
                    EU_SOUTH_1 -> Value.EU_SOUTH_1
                    EU_WEST_1 -> Value.EU_WEST_1
                    EU_WEST_2 -> Value.EU_WEST_2
                    EU_WEST_3 -> Value.EU_WEST_3
                    ME_SOUTH_1 -> Value.ME_SOUTH_1
                    SA_EAST_1 -> Value.SA_EAST_1
                    US_EAST_1 -> Value.US_EAST_1
                    US_EAST_2 -> Value.US_EAST_2
                    US_GOV_EAST_1 -> Value.US_GOV_EAST_1
                    US_GOV_WEST_1 -> Value.US_GOV_WEST_1
                    US_WEST_1 -> Value.US_WEST_1
                    US_WEST_2 -> Value.US_WEST_2
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
                    AF_SOUTH_1 -> Known.AF_SOUTH_1
                    AP_EAST_1 -> Known.AP_EAST_1
                    AP_NORTHEAST_1 -> Known.AP_NORTHEAST_1
                    AP_NORTHEAST_2 -> Known.AP_NORTHEAST_2
                    AP_NORTHEAST_3 -> Known.AP_NORTHEAST_3
                    AP_SOUTH_1 -> Known.AP_SOUTH_1
                    AP_SOUTHEAST_1 -> Known.AP_SOUTHEAST_1
                    AP_SOUTHEAST_2 -> Known.AP_SOUTHEAST_2
                    CA_CENTRAL_1 -> Known.CA_CENTRAL_1
                    CN_NORTH_1 -> Known.CN_NORTH_1
                    CN_NORTHWEST_1 -> Known.CN_NORTHWEST_1
                    EU_CENTRAL_1 -> Known.EU_CENTRAL_1
                    EU_NORTH_1 -> Known.EU_NORTH_1
                    EU_SOUTH_1 -> Known.EU_SOUTH_1
                    EU_WEST_1 -> Known.EU_WEST_1
                    EU_WEST_2 -> Known.EU_WEST_2
                    EU_WEST_3 -> Known.EU_WEST_3
                    ME_SOUTH_1 -> Known.ME_SOUTH_1
                    SA_EAST_1 -> Known.SA_EAST_1
                    US_EAST_1 -> Known.US_EAST_1
                    US_EAST_2 -> Known.US_EAST_2
                    US_GOV_EAST_1 -> Known.US_GOV_EAST_1
                    US_GOV_WEST_1 -> Known.US_GOV_WEST_1
                    US_WEST_1 -> Known.US_WEST_1
                    US_WEST_2 -> Known.US_WEST_2
                    else -> throw MetronomeInvalidDataException("Unknown AwsRegion: $value")
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

                return /* spotless:off */ other is AwsRegion && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class StripeCollectionMethod
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

                @JvmField val CHARGE_AUTOMATICALLY = of("charge_automatically")

                @JvmField val SEND_INVOICE = of("send_invoice")

                @JvmStatic fun of(value: String) = StripeCollectionMethod(JsonField.of(value))
            }

            /** An enum containing [StripeCollectionMethod]'s known values. */
            enum class Known {
                CHARGE_AUTOMATICALLY,
                SEND_INVOICE,
            }

            /**
             * An enum containing [StripeCollectionMethod]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [StripeCollectionMethod] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHARGE_AUTOMATICALLY,
                SEND_INVOICE,
                /**
                 * An enum member indicating that [StripeCollectionMethod] was instantiated with an
                 * unknown value.
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
                    CHARGE_AUTOMATICALLY -> Value.CHARGE_AUTOMATICALLY
                    SEND_INVOICE -> Value.SEND_INVOICE
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
                    CHARGE_AUTOMATICALLY -> Known.CHARGE_AUTOMATICALLY
                    SEND_INVOICE -> Known.SEND_INVOICE
                    else ->
                        throw MetronomeInvalidDataException(
                            "Unknown StripeCollectionMethod: $value"
                        )
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

                return /* spotless:off */ other is StripeCollectionMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingConfig && billingProviderCustomerId == other.billingProviderCustomerId && billingProviderType == other.billingProviderType && awsIsSubscriptionProduct == other.awsIsSubscriptionProduct && awsProductCode == other.awsProductCode && awsRegion == other.awsRegion && stripeCollectionMethod == other.stripeCollectionMethod && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billingProviderCustomerId, billingProviderType, awsIsSubscriptionProduct, awsProductCode, awsRegion, stripeCollectionMethod, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingConfig{billingProviderCustomerId=$billingProviderCustomerId, billingProviderType=$billingProviderType, awsIsSubscriptionProduct=$awsIsSubscriptionProduct, awsProductCode=$awsProductCode, awsRegion=$awsRegion, stripeCollectionMethod=$stripeCollectionMethod, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties = customFields.additionalProperties.toMutableMap()
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

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class CustomerBillingProviderConfiguration
    @JsonCreator
    private constructor(
        @JsonProperty("billing_provider")
        @ExcludeMissing
        private val billingProvider: JsonField<BillingProvider> = JsonMissing.of(),
        @JsonProperty("configuration")
        @ExcludeMissing
        private val configuration: JsonField<Configuration> = JsonMissing.of(),
        @JsonProperty("delivery_method")
        @ExcludeMissing
        private val deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of(),
        @JsonProperty("delivery_method_id")
        @ExcludeMissing
        private val deliveryMethodId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The billing provider set for this configuration. */
        fun billingProvider(): BillingProvider = billingProvider.getRequired("billing_provider")

        /**
         * Configuration for the billing provider. The structure of this object is specific to the
         * billing provider and delivery provider combination. Defaults to an empty object, however,
         * for most billing provider + delivery method combinations, it will not be a valid
         * configuration.
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

        /** The billing provider set for this configuration. */
        @JsonProperty("billing_provider")
        @ExcludeMissing
        fun _billingProvider(): JsonField<BillingProvider> = billingProvider

        /**
         * Configuration for the billing provider. The structure of this object is specific to the
         * billing provider and delivery provider combination. Defaults to an empty object, however,
         * for most billing provider + delivery method combinations, it will not be a valid
         * configuration.
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

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomerBillingProviderConfiguration = apply {
            if (validated) {
                return@apply
            }

            billingProvider()
            configuration().ifPresent { it.validate() }
            deliveryMethod()
            deliveryMethodId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomerBillingProviderConfiguration]. */
        class Builder internal constructor() {

            private var billingProvider: JsonField<BillingProvider>? = null
            private var configuration: JsonField<Configuration> = JsonMissing.of()
            private var deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of()
            private var deliveryMethodId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
            ) = apply {
                billingProvider = customerBillingProviderConfiguration.billingProvider
                configuration = customerBillingProviderConfiguration.configuration
                deliveryMethod = customerBillingProviderConfiguration.deliveryMethod
                deliveryMethodId = customerBillingProviderConfiguration.deliveryMethodId
                additionalProperties =
                    customerBillingProviderConfiguration.additionalProperties.toMutableMap()
            }

            /** The billing provider set for this configuration. */
            fun billingProvider(billingProvider: BillingProvider) =
                billingProvider(JsonField.of(billingProvider))

            /** The billing provider set for this configuration. */
            fun billingProvider(billingProvider: JsonField<BillingProvider>) = apply {
                this.billingProvider = billingProvider
            }

            /**
             * Configuration for the billing provider. The structure of this object is specific to
             * the billing provider and delivery provider combination. Defaults to an empty object,
             * however, for most billing provider + delivery method combinations, it will not be a
             * valid configuration.
             */
            fun configuration(configuration: Configuration) =
                configuration(JsonField.of(configuration))

            /**
             * Configuration for the billing provider. The structure of this object is specific to
             * the billing provider and delivery provider combination. Defaults to an empty object,
             * however, for most billing provider + delivery method combinations, it will not be a
             * valid configuration.
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

            fun build(): CustomerBillingProviderConfiguration =
                CustomerBillingProviderConfiguration(
                    checkRequired("billingProvider", billingProvider),
                    configuration,
                    deliveryMethod,
                    deliveryMethodId,
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

                @JvmField val AZURE_MARKETPLACE = of("azure_marketplace")

                @JvmField val GCP_MARKETPLACE = of("gcp_marketplace")

                @JvmField val STRIPE = of("stripe")

                @JvmField val NETSUITE = of("netsuite")

                @JvmStatic fun of(value: String) = BillingProvider(JsonField.of(value))
            }

            /** An enum containing [BillingProvider]'s known values. */
            enum class Known {
                AWS_MARKETPLACE,
                AZURE_MARKETPLACE,
                GCP_MARKETPLACE,
                STRIPE,
                NETSUITE,
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
                AZURE_MARKETPLACE,
                GCP_MARKETPLACE,
                STRIPE,
                NETSUITE,
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
                    AZURE_MARKETPLACE -> Value.AZURE_MARKETPLACE
                    GCP_MARKETPLACE -> Value.GCP_MARKETPLACE
                    STRIPE -> Value.STRIPE
                    NETSUITE -> Value.NETSUITE
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
                    AZURE_MARKETPLACE -> Known.AZURE_MARKETPLACE
                    GCP_MARKETPLACE -> Known.GCP_MARKETPLACE
                    STRIPE -> Known.STRIPE
                    NETSUITE -> Known.NETSUITE
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
         * billing provider and delivery provider combination. Defaults to an empty object, however,
         * for most billing provider + delivery method combinations, it will not be a valid
         * configuration.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerBillingProviderConfiguration && billingProvider == other.billingProvider && configuration == other.configuration && deliveryMethod == other.deliveryMethod && deliveryMethodId == other.deliveryMethodId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billingProvider, configuration, deliveryMethod, deliveryMethodId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerBillingProviderConfiguration{billingProvider=$billingProvider, configuration=$configuration, deliveryMethod=$deliveryMethod, deliveryMethodId=$deliveryMethodId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
