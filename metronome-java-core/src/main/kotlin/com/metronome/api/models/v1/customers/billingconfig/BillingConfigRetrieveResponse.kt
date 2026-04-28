// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.billingconfig

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
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BillingConfigRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of
         * [BillingConfigRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillingConfigRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(billingConfigRetrieveResponse: BillingConfigRetrieveResponse) = apply {
            data = billingConfigRetrieveResponse.data
            additionalProperties = billingConfigRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [BillingConfigRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BillingConfigRetrieveResponse =
            BillingConfigRetrieveResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BillingConfigRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val awsCustomerAccountId: JsonField<String>,
        private val awsCustomerId: JsonField<String>,
        private val awsExpirationDate: JsonField<OffsetDateTime>,
        private val awsIsSubscriptionProduct: JsonField<Boolean>,
        private val awsProductCode: JsonField<String>,
        private val awsRegion: JsonField<AwsRegion>,
        private val azureExpirationDate: JsonField<OffsetDateTime>,
        private val azurePlanId: JsonField<String>,
        private val azureStartDate: JsonField<OffsetDateTime>,
        private val azureSubscriptionStatus: JsonField<AzureSubscriptionStatus>,
        private val billingProviderCustomerId: JsonField<String>,
        private val stripeCollectionMethod: JsonField<StripeCollectionMethod>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("aws_customer_account_id")
            @ExcludeMissing
            awsCustomerAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_customer_id")
            @ExcludeMissing
            awsCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_expiration_date")
            @ExcludeMissing
            awsExpirationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("aws_is_subscription_product")
            @ExcludeMissing
            awsIsSubscriptionProduct: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("aws_product_code")
            @ExcludeMissing
            awsProductCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_region")
            @ExcludeMissing
            awsRegion: JsonField<AwsRegion> = JsonMissing.of(),
            @JsonProperty("azure_expiration_date")
            @ExcludeMissing
            azureExpirationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("azure_plan_id")
            @ExcludeMissing
            azurePlanId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("azure_start_date")
            @ExcludeMissing
            azureStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("azure_subscription_status")
            @ExcludeMissing
            azureSubscriptionStatus: JsonField<AzureSubscriptionStatus> = JsonMissing.of(),
            @JsonProperty("billing_provider_customer_id")
            @ExcludeMissing
            billingProviderCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stripe_collection_method")
            @ExcludeMissing
            stripeCollectionMethod: JsonField<StripeCollectionMethod> = JsonMissing.of(),
        ) : this(
            awsCustomerAccountId,
            awsCustomerId,
            awsExpirationDate,
            awsIsSubscriptionProduct,
            awsProductCode,
            awsRegion,
            azureExpirationDate,
            azurePlanId,
            azureStartDate,
            azureSubscriptionStatus,
            billingProviderCustomerId,
            stripeCollectionMethod,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsCustomerAccountId(): Optional<String> =
            awsCustomerAccountId.getOptional("aws_customer_account_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsCustomerId(): Optional<String> = awsCustomerId.getOptional("aws_customer_id")

        /**
         * Contract expiration date for the customer. The expected format is RFC 3339 and can be
         * retrieved from
         * [AWS's GetEntitlements API](https://docs.aws.amazon.com/marketplaceentitlement/latest/APIReference/API_GetEntitlements.html).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsExpirationDate(): Optional<OffsetDateTime> =
            awsExpirationDate.getOptional("aws_expiration_date")

        /**
         * True if the aws_product_code is a SAAS subscription product, false otherwise.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsIsSubscriptionProduct(): Optional<Boolean> =
            awsIsSubscriptionProduct.getOptional("aws_is_subscription_product")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsProductCode(): Optional<String> = awsProductCode.getOptional("aws_product_code")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsRegion(): Optional<AwsRegion> = awsRegion.getOptional("aws_region")

        /**
         * Subscription term start/end date for the customer. The expected format is RFC 3339 and
         * can be retrieved from
         * [Azure's Get Subscription API](https://learn.microsoft.com/en-us/partner-center/marketplace/partner-center-portal/pc-saas-fulfillment-subscription-api#get-subscription).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun azureExpirationDate(): Optional<OffsetDateTime> =
            azureExpirationDate.getOptional("azure_expiration_date")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun azurePlanId(): Optional<String> = azurePlanId.getOptional("azure_plan_id")

        /**
         * Subscription term start/end date for the customer. The expected format is RFC 3339 and
         * can be retrieved from
         * [Azure's Get Subscription API](https://learn.microsoft.com/en-us/partner-center/marketplace/partner-center-portal/pc-saas-fulfillment-subscription-api#get-subscription).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun azureStartDate(): Optional<OffsetDateTime> =
            azureStartDate.getOptional("azure_start_date")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun azureSubscriptionStatus(): Optional<AzureSubscriptionStatus> =
            azureSubscriptionStatus.getOptional("azure_subscription_status")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun billingProviderCustomerId(): Optional<String> =
            billingProviderCustomerId.getOptional("billing_provider_customer_id")

        /**
         * The collection method for the customer's invoices. NOTE: `auto_charge_payment_intent` and
         * `manually_charge_payment_intent` are in beta.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun stripeCollectionMethod(): Optional<StripeCollectionMethod> =
            stripeCollectionMethod.getOptional("stripe_collection_method")

        /**
         * Returns the raw JSON value of [awsCustomerAccountId].
         *
         * Unlike [awsCustomerAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("aws_customer_account_id")
        @ExcludeMissing
        fun _awsCustomerAccountId(): JsonField<String> = awsCustomerAccountId

        /**
         * Returns the raw JSON value of [awsCustomerId].
         *
         * Unlike [awsCustomerId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aws_customer_id")
        @ExcludeMissing
        fun _awsCustomerId(): JsonField<String> = awsCustomerId

        /**
         * Returns the raw JSON value of [awsExpirationDate].
         *
         * Unlike [awsExpirationDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aws_expiration_date")
        @ExcludeMissing
        fun _awsExpirationDate(): JsonField<OffsetDateTime> = awsExpirationDate

        /**
         * Returns the raw JSON value of [awsIsSubscriptionProduct].
         *
         * Unlike [awsIsSubscriptionProduct], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("aws_is_subscription_product")
        @ExcludeMissing
        fun _awsIsSubscriptionProduct(): JsonField<Boolean> = awsIsSubscriptionProduct

        /**
         * Returns the raw JSON value of [awsProductCode].
         *
         * Unlike [awsProductCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aws_product_code")
        @ExcludeMissing
        fun _awsProductCode(): JsonField<String> = awsProductCode

        /**
         * Returns the raw JSON value of [awsRegion].
         *
         * Unlike [awsRegion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aws_region")
        @ExcludeMissing
        fun _awsRegion(): JsonField<AwsRegion> = awsRegion

        /**
         * Returns the raw JSON value of [azureExpirationDate].
         *
         * Unlike [azureExpirationDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("azure_expiration_date")
        @ExcludeMissing
        fun _azureExpirationDate(): JsonField<OffsetDateTime> = azureExpirationDate

        /**
         * Returns the raw JSON value of [azurePlanId].
         *
         * Unlike [azurePlanId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("azure_plan_id")
        @ExcludeMissing
        fun _azurePlanId(): JsonField<String> = azurePlanId

        /**
         * Returns the raw JSON value of [azureStartDate].
         *
         * Unlike [azureStartDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("azure_start_date")
        @ExcludeMissing
        fun _azureStartDate(): JsonField<OffsetDateTime> = azureStartDate

        /**
         * Returns the raw JSON value of [azureSubscriptionStatus].
         *
         * Unlike [azureSubscriptionStatus], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("azure_subscription_status")
        @ExcludeMissing
        fun _azureSubscriptionStatus(): JsonField<AzureSubscriptionStatus> = azureSubscriptionStatus

        /**
         * Returns the raw JSON value of [billingProviderCustomerId].
         *
         * Unlike [billingProviderCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("billing_provider_customer_id")
        @ExcludeMissing
        fun _billingProviderCustomerId(): JsonField<String> = billingProviderCustomerId

        /**
         * Returns the raw JSON value of [stripeCollectionMethod].
         *
         * Unlike [stripeCollectionMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("stripe_collection_method")
        @ExcludeMissing
        fun _stripeCollectionMethod(): JsonField<StripeCollectionMethod> = stripeCollectionMethod

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var awsCustomerAccountId: JsonField<String> = JsonMissing.of()
            private var awsCustomerId: JsonField<String> = JsonMissing.of()
            private var awsExpirationDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var awsIsSubscriptionProduct: JsonField<Boolean> = JsonMissing.of()
            private var awsProductCode: JsonField<String> = JsonMissing.of()
            private var awsRegion: JsonField<AwsRegion> = JsonMissing.of()
            private var azureExpirationDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var azurePlanId: JsonField<String> = JsonMissing.of()
            private var azureStartDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var azureSubscriptionStatus: JsonField<AzureSubscriptionStatus> =
                JsonMissing.of()
            private var billingProviderCustomerId: JsonField<String> = JsonMissing.of()
            private var stripeCollectionMethod: JsonField<StripeCollectionMethod> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                awsCustomerAccountId = data.awsCustomerAccountId
                awsCustomerId = data.awsCustomerId
                awsExpirationDate = data.awsExpirationDate
                awsIsSubscriptionProduct = data.awsIsSubscriptionProduct
                awsProductCode = data.awsProductCode
                awsRegion = data.awsRegion
                azureExpirationDate = data.azureExpirationDate
                azurePlanId = data.azurePlanId
                azureStartDate = data.azureStartDate
                azureSubscriptionStatus = data.azureSubscriptionStatus
                billingProviderCustomerId = data.billingProviderCustomerId
                stripeCollectionMethod = data.stripeCollectionMethod
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun awsCustomerAccountId(awsCustomerAccountId: String) =
                awsCustomerAccountId(JsonField.of(awsCustomerAccountId))

            /**
             * Sets [Builder.awsCustomerAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsCustomerAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun awsCustomerAccountId(awsCustomerAccountId: JsonField<String>) = apply {
                this.awsCustomerAccountId = awsCustomerAccountId
            }

            fun awsCustomerId(awsCustomerId: String) = awsCustomerId(JsonField.of(awsCustomerId))

            /**
             * Sets [Builder.awsCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsCustomerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsCustomerId(awsCustomerId: JsonField<String>) = apply {
                this.awsCustomerId = awsCustomerId
            }

            /**
             * Contract expiration date for the customer. The expected format is RFC 3339 and can be
             * retrieved from
             * [AWS's GetEntitlements API](https://docs.aws.amazon.com/marketplaceentitlement/latest/APIReference/API_GetEntitlements.html).
             */
            fun awsExpirationDate(awsExpirationDate: OffsetDateTime) =
                awsExpirationDate(JsonField.of(awsExpirationDate))

            /**
             * Sets [Builder.awsExpirationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsExpirationDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun awsExpirationDate(awsExpirationDate: JsonField<OffsetDateTime>) = apply {
                this.awsExpirationDate = awsExpirationDate
            }

            /** True if the aws_product_code is a SAAS subscription product, false otherwise. */
            fun awsIsSubscriptionProduct(awsIsSubscriptionProduct: Boolean) =
                awsIsSubscriptionProduct(JsonField.of(awsIsSubscriptionProduct))

            /**
             * Sets [Builder.awsIsSubscriptionProduct] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsIsSubscriptionProduct] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun awsIsSubscriptionProduct(awsIsSubscriptionProduct: JsonField<Boolean>) = apply {
                this.awsIsSubscriptionProduct = awsIsSubscriptionProduct
            }

            fun awsProductCode(awsProductCode: String) =
                awsProductCode(JsonField.of(awsProductCode))

            /**
             * Sets [Builder.awsProductCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsProductCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsProductCode(awsProductCode: JsonField<String>) = apply {
                this.awsProductCode = awsProductCode
            }

            fun awsRegion(awsRegion: AwsRegion) = awsRegion(JsonField.of(awsRegion))

            /**
             * Sets [Builder.awsRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsRegion] with a well-typed [AwsRegion] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsRegion(awsRegion: JsonField<AwsRegion>) = apply { this.awsRegion = awsRegion }

            /**
             * Subscription term start/end date for the customer. The expected format is RFC 3339
             * and can be retrieved from
             * [Azure's Get Subscription API](https://learn.microsoft.com/en-us/partner-center/marketplace/partner-center-portal/pc-saas-fulfillment-subscription-api#get-subscription).
             */
            fun azureExpirationDate(azureExpirationDate: OffsetDateTime) =
                azureExpirationDate(JsonField.of(azureExpirationDate))

            /**
             * Sets [Builder.azureExpirationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.azureExpirationDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun azureExpirationDate(azureExpirationDate: JsonField<OffsetDateTime>) = apply {
                this.azureExpirationDate = azureExpirationDate
            }

            fun azurePlanId(azurePlanId: String) = azurePlanId(JsonField.of(azurePlanId))

            /**
             * Sets [Builder.azurePlanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.azurePlanId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun azurePlanId(azurePlanId: JsonField<String>) = apply {
                this.azurePlanId = azurePlanId
            }

            /**
             * Subscription term start/end date for the customer. The expected format is RFC 3339
             * and can be retrieved from
             * [Azure's Get Subscription API](https://learn.microsoft.com/en-us/partner-center/marketplace/partner-center-portal/pc-saas-fulfillment-subscription-api#get-subscription).
             */
            fun azureStartDate(azureStartDate: OffsetDateTime) =
                azureStartDate(JsonField.of(azureStartDate))

            /**
             * Sets [Builder.azureStartDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.azureStartDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun azureStartDate(azureStartDate: JsonField<OffsetDateTime>) = apply {
                this.azureStartDate = azureStartDate
            }

            fun azureSubscriptionStatus(azureSubscriptionStatus: AzureSubscriptionStatus) =
                azureSubscriptionStatus(JsonField.of(azureSubscriptionStatus))

            /**
             * Sets [Builder.azureSubscriptionStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.azureSubscriptionStatus] with a well-typed
             * [AzureSubscriptionStatus] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun azureSubscriptionStatus(
                azureSubscriptionStatus: JsonField<AzureSubscriptionStatus>
            ) = apply { this.azureSubscriptionStatus = azureSubscriptionStatus }

            fun billingProviderCustomerId(billingProviderCustomerId: String) =
                billingProviderCustomerId(JsonField.of(billingProviderCustomerId))

            /**
             * Sets [Builder.billingProviderCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingProviderCustomerId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun billingProviderCustomerId(billingProviderCustomerId: JsonField<String>) = apply {
                this.billingProviderCustomerId = billingProviderCustomerId
            }

            /**
             * The collection method for the customer's invoices. NOTE: `auto_charge_payment_intent`
             * and `manually_charge_payment_intent` are in beta.
             */
            fun stripeCollectionMethod(stripeCollectionMethod: StripeCollectionMethod) =
                stripeCollectionMethod(JsonField.of(stripeCollectionMethod))

            /**
             * Sets [Builder.stripeCollectionMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stripeCollectionMethod] with a well-typed
             * [StripeCollectionMethod] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
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

            /**
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    awsCustomerAccountId,
                    awsCustomerId,
                    awsExpirationDate,
                    awsIsSubscriptionProduct,
                    awsProductCode,
                    awsRegion,
                    azureExpirationDate,
                    azurePlanId,
                    azureStartDate,
                    azureSubscriptionStatus,
                    billingProviderCustomerId,
                    stripeCollectionMethod,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            awsCustomerAccountId()
            awsCustomerId()
            awsExpirationDate()
            awsIsSubscriptionProduct()
            awsProductCode()
            awsRegion().ifPresent { it.validate() }
            azureExpirationDate()
            azurePlanId()
            azureStartDate()
            azureSubscriptionStatus().ifPresent { it.validate() }
            billingProviderCustomerId()
            stripeCollectionMethod().ifPresent { it.validate() }
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
            (if (awsCustomerAccountId.asKnown().isPresent) 1 else 0) +
                (if (awsCustomerId.asKnown().isPresent) 1 else 0) +
                (if (awsExpirationDate.asKnown().isPresent) 1 else 0) +
                (if (awsIsSubscriptionProduct.asKnown().isPresent) 1 else 0) +
                (if (awsProductCode.asKnown().isPresent) 1 else 0) +
                (awsRegion.asKnown().getOrNull()?.validity() ?: 0) +
                (if (azureExpirationDate.asKnown().isPresent) 1 else 0) +
                (if (azurePlanId.asKnown().isPresent) 1 else 0) +
                (if (azureStartDate.asKnown().isPresent) 1 else 0) +
                (azureSubscriptionStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (billingProviderCustomerId.asKnown().isPresent) 1 else 0) +
                (stripeCollectionMethod.asKnown().getOrNull()?.validity() ?: 0)

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

            private var validated: Boolean = false

            fun validate(): AwsRegion = apply {
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

                return other is AwsRegion && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class AzureSubscriptionStatus
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

                @JvmField val SUBSCRIBED = of("Subscribed")

                @JvmField val UNSUBSCRIBED = of("Unsubscribed")

                @JvmField val SUSPENDED = of("Suspended")

                @JvmField val PENDING_FULFILLMENT_START = of("PendingFulfillmentStart")

                @JvmStatic fun of(value: String) = AzureSubscriptionStatus(JsonField.of(value))
            }

            /** An enum containing [AzureSubscriptionStatus]'s known values. */
            enum class Known {
                SUBSCRIBED,
                UNSUBSCRIBED,
                SUSPENDED,
                PENDING_FULFILLMENT_START,
            }

            /**
             * An enum containing [AzureSubscriptionStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AzureSubscriptionStatus] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SUBSCRIBED,
                UNSUBSCRIBED,
                SUSPENDED,
                PENDING_FULFILLMENT_START,
                /**
                 * An enum member indicating that [AzureSubscriptionStatus] was instantiated with an
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
                    SUBSCRIBED -> Value.SUBSCRIBED
                    UNSUBSCRIBED -> Value.UNSUBSCRIBED
                    SUSPENDED -> Value.SUSPENDED
                    PENDING_FULFILLMENT_START -> Value.PENDING_FULFILLMENT_START
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
                    SUBSCRIBED -> Known.SUBSCRIBED
                    UNSUBSCRIBED -> Known.UNSUBSCRIBED
                    SUSPENDED -> Known.SUSPENDED
                    PENDING_FULFILLMENT_START -> Known.PENDING_FULFILLMENT_START
                    else ->
                        throw MetronomeInvalidDataException(
                            "Unknown AzureSubscriptionStatus: $value"
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

            private var validated: Boolean = false

            fun validate(): AzureSubscriptionStatus = apply {
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

                return other is AzureSubscriptionStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The collection method for the customer's invoices. NOTE: `auto_charge_payment_intent` and
         * `manually_charge_payment_intent` are in beta.
         */
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

                @JvmField val AUTO_CHARGE_PAYMENT_INTENT = of("auto_charge_payment_intent")

                @JvmField val MANUALLY_CHARGE_PAYMENT_INTENT = of("manually_charge_payment_intent")

                @JvmStatic fun of(value: String) = StripeCollectionMethod(JsonField.of(value))
            }

            /** An enum containing [StripeCollectionMethod]'s known values. */
            enum class Known {
                CHARGE_AUTOMATICALLY,
                SEND_INVOICE,
                AUTO_CHARGE_PAYMENT_INTENT,
                MANUALLY_CHARGE_PAYMENT_INTENT,
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
                AUTO_CHARGE_PAYMENT_INTENT,
                MANUALLY_CHARGE_PAYMENT_INTENT,
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
                    AUTO_CHARGE_PAYMENT_INTENT -> Value.AUTO_CHARGE_PAYMENT_INTENT
                    MANUALLY_CHARGE_PAYMENT_INTENT -> Value.MANUALLY_CHARGE_PAYMENT_INTENT
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
                    AUTO_CHARGE_PAYMENT_INTENT -> Known.AUTO_CHARGE_PAYMENT_INTENT
                    MANUALLY_CHARGE_PAYMENT_INTENT -> Known.MANUALLY_CHARGE_PAYMENT_INTENT
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

            private var validated: Boolean = false

            fun validate(): StripeCollectionMethod = apply {
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

                return other is StripeCollectionMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                awsCustomerAccountId == other.awsCustomerAccountId &&
                awsCustomerId == other.awsCustomerId &&
                awsExpirationDate == other.awsExpirationDate &&
                awsIsSubscriptionProduct == other.awsIsSubscriptionProduct &&
                awsProductCode == other.awsProductCode &&
                awsRegion == other.awsRegion &&
                azureExpirationDate == other.azureExpirationDate &&
                azurePlanId == other.azurePlanId &&
                azureStartDate == other.azureStartDate &&
                azureSubscriptionStatus == other.azureSubscriptionStatus &&
                billingProviderCustomerId == other.billingProviderCustomerId &&
                stripeCollectionMethod == other.stripeCollectionMethod &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                awsCustomerAccountId,
                awsCustomerId,
                awsExpirationDate,
                awsIsSubscriptionProduct,
                awsProductCode,
                awsRegion,
                azureExpirationDate,
                azurePlanId,
                azureStartDate,
                azureSubscriptionStatus,
                billingProviderCustomerId,
                stripeCollectionMethod,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{awsCustomerAccountId=$awsCustomerAccountId, awsCustomerId=$awsCustomerId, awsExpirationDate=$awsExpirationDate, awsIsSubscriptionProduct=$awsIsSubscriptionProduct, awsProductCode=$awsProductCode, awsRegion=$awsRegion, azureExpirationDate=$azureExpirationDate, azurePlanId=$azurePlanId, azureStartDate=$azureStartDate, azureSubscriptionStatus=$azureSubscriptionStatus, billingProviderCustomerId=$billingProviderCustomerId, stripeCollectionMethod=$stripeCollectionMethod, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillingConfigRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillingConfigRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
