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
class CustomerBillingConfigRetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): Data = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomerBillingConfigRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            customerBillingConfigRetrieveResponse: CustomerBillingConfigRetrieveResponse
        ) = apply {
            data = customerBillingConfigRetrieveResponse.data
            additionalProperties =
                customerBillingConfigRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

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

        fun build(): CustomerBillingConfigRetrieveResponse =
            CustomerBillingConfigRetrieveResponse(
                checkRequired("data", data),
                additionalProperties.toImmutable()
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("aws_expiration_date")
        @ExcludeMissing
        private val awsExpirationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("aws_product_code")
        @ExcludeMissing
        private val awsProductCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aws_region")
        @ExcludeMissing
        private val awsRegion: JsonField<AwsRegion> = JsonMissing.of(),
        @JsonProperty("azure_expiration_date")
        @ExcludeMissing
        private val azureExpirationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("azure_plan_id")
        @ExcludeMissing
        private val azurePlanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("azure_start_date")
        @ExcludeMissing
        private val azureStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("azure_subscription_status")
        @ExcludeMissing
        private val azureSubscriptionStatus: JsonField<AzureSubscriptionStatus> = JsonMissing.of(),
        @JsonProperty("billing_provider_customer_id")
        @ExcludeMissing
        private val billingProviderCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stripe_collection_method")
        @ExcludeMissing
        private val stripeCollectionMethod: JsonField<StripeCollectionMethod> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Contract expiration date for the customer. The expected format is RFC 3339 and can be
         * retrieved from
         * [AWS's GetEntitlements API](https://docs.aws.amazon.com/marketplaceentitlement/latest/APIReference/API_GetEntitlements.html).
         */
        fun awsExpirationDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(awsExpirationDate.getNullable("aws_expiration_date"))

        fun awsProductCode(): Optional<String> =
            Optional.ofNullable(awsProductCode.getNullable("aws_product_code"))

        fun awsRegion(): Optional<AwsRegion> =
            Optional.ofNullable(awsRegion.getNullable("aws_region"))

        /**
         * Subscription term start/end date for the customer. The expected format is RFC 3339 and
         * can be retrieved from
         * [Azure's Get Subscription API](https://learn.microsoft.com/en-us/partner-center/marketplace/partner-center-portal/pc-saas-fulfillment-subscription-api#get-subscription).
         */
        fun azureExpirationDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(azureExpirationDate.getNullable("azure_expiration_date"))

        fun azurePlanId(): Optional<String> =
            Optional.ofNullable(azurePlanId.getNullable("azure_plan_id"))

        /**
         * Subscription term start/end date for the customer. The expected format is RFC 3339 and
         * can be retrieved from
         * [Azure's Get Subscription API](https://learn.microsoft.com/en-us/partner-center/marketplace/partner-center-portal/pc-saas-fulfillment-subscription-api#get-subscription).
         */
        fun azureStartDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(azureStartDate.getNullable("azure_start_date"))

        fun azureSubscriptionStatus(): Optional<AzureSubscriptionStatus> =
            Optional.ofNullable(azureSubscriptionStatus.getNullable("azure_subscription_status"))

        fun billingProviderCustomerId(): Optional<String> =
            Optional.ofNullable(
                billingProviderCustomerId.getNullable("billing_provider_customer_id")
            )

        fun stripeCollectionMethod(): Optional<StripeCollectionMethod> =
            Optional.ofNullable(stripeCollectionMethod.getNullable("stripe_collection_method"))

        /**
         * Contract expiration date for the customer. The expected format is RFC 3339 and can be
         * retrieved from
         * [AWS's GetEntitlements API](https://docs.aws.amazon.com/marketplaceentitlement/latest/APIReference/API_GetEntitlements.html).
         */
        @JsonProperty("aws_expiration_date")
        @ExcludeMissing
        fun _awsExpirationDate(): JsonField<OffsetDateTime> = awsExpirationDate

        @JsonProperty("aws_product_code")
        @ExcludeMissing
        fun _awsProductCode(): JsonField<String> = awsProductCode

        @JsonProperty("aws_region")
        @ExcludeMissing
        fun _awsRegion(): JsonField<AwsRegion> = awsRegion

        /**
         * Subscription term start/end date for the customer. The expected format is RFC 3339 and
         * can be retrieved from
         * [Azure's Get Subscription API](https://learn.microsoft.com/en-us/partner-center/marketplace/partner-center-portal/pc-saas-fulfillment-subscription-api#get-subscription).
         */
        @JsonProperty("azure_expiration_date")
        @ExcludeMissing
        fun _azureExpirationDate(): JsonField<OffsetDateTime> = azureExpirationDate

        @JsonProperty("azure_plan_id")
        @ExcludeMissing
        fun _azurePlanId(): JsonField<String> = azurePlanId

        /**
         * Subscription term start/end date for the customer. The expected format is RFC 3339 and
         * can be retrieved from
         * [Azure's Get Subscription API](https://learn.microsoft.com/en-us/partner-center/marketplace/partner-center-portal/pc-saas-fulfillment-subscription-api#get-subscription).
         */
        @JsonProperty("azure_start_date")
        @ExcludeMissing
        fun _azureStartDate(): JsonField<OffsetDateTime> = azureStartDate

        @JsonProperty("azure_subscription_status")
        @ExcludeMissing
        fun _azureSubscriptionStatus(): JsonField<AzureSubscriptionStatus> = azureSubscriptionStatus

        @JsonProperty("billing_provider_customer_id")
        @ExcludeMissing
        fun _billingProviderCustomerId(): JsonField<String> = billingProviderCustomerId

        @JsonProperty("stripe_collection_method")
        @ExcludeMissing
        fun _stripeCollectionMethod(): JsonField<StripeCollectionMethod> = stripeCollectionMethod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            awsExpirationDate()
            awsProductCode()
            awsRegion()
            azureExpirationDate()
            azurePlanId()
            azureStartDate()
            azureSubscriptionStatus()
            billingProviderCustomerId()
            stripeCollectionMethod()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var awsExpirationDate: JsonField<OffsetDateTime> = JsonMissing.of()
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
                awsExpirationDate = data.awsExpirationDate
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

            /**
             * Contract expiration date for the customer. The expected format is RFC 3339 and can be
             * retrieved from
             * [AWS's GetEntitlements API](https://docs.aws.amazon.com/marketplaceentitlement/latest/APIReference/API_GetEntitlements.html).
             */
            fun awsExpirationDate(awsExpirationDate: OffsetDateTime) =
                awsExpirationDate(JsonField.of(awsExpirationDate))

            /**
             * Contract expiration date for the customer. The expected format is RFC 3339 and can be
             * retrieved from
             * [AWS's GetEntitlements API](https://docs.aws.amazon.com/marketplaceentitlement/latest/APIReference/API_GetEntitlements.html).
             */
            fun awsExpirationDate(awsExpirationDate: JsonField<OffsetDateTime>) = apply {
                this.awsExpirationDate = awsExpirationDate
            }

            fun awsProductCode(awsProductCode: String) =
                awsProductCode(JsonField.of(awsProductCode))

            fun awsProductCode(awsProductCode: JsonField<String>) = apply {
                this.awsProductCode = awsProductCode
            }

            fun awsRegion(awsRegion: AwsRegion) = awsRegion(JsonField.of(awsRegion))

            fun awsRegion(awsRegion: JsonField<AwsRegion>) = apply { this.awsRegion = awsRegion }

            /**
             * Subscription term start/end date for the customer. The expected format is RFC 3339
             * and can be retrieved from
             * [Azure's Get Subscription API](https://learn.microsoft.com/en-us/partner-center/marketplace/partner-center-portal/pc-saas-fulfillment-subscription-api#get-subscription).
             */
            fun azureExpirationDate(azureExpirationDate: OffsetDateTime) =
                azureExpirationDate(JsonField.of(azureExpirationDate))

            /**
             * Subscription term start/end date for the customer. The expected format is RFC 3339
             * and can be retrieved from
             * [Azure's Get Subscription API](https://learn.microsoft.com/en-us/partner-center/marketplace/partner-center-portal/pc-saas-fulfillment-subscription-api#get-subscription).
             */
            fun azureExpirationDate(azureExpirationDate: JsonField<OffsetDateTime>) = apply {
                this.azureExpirationDate = azureExpirationDate
            }

            fun azurePlanId(azurePlanId: String) = azurePlanId(JsonField.of(azurePlanId))

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
             * Subscription term start/end date for the customer. The expected format is RFC 3339
             * and can be retrieved from
             * [Azure's Get Subscription API](https://learn.microsoft.com/en-us/partner-center/marketplace/partner-center-portal/pc-saas-fulfillment-subscription-api#get-subscription).
             */
            fun azureStartDate(azureStartDate: JsonField<OffsetDateTime>) = apply {
                this.azureStartDate = azureStartDate
            }

            fun azureSubscriptionStatus(azureSubscriptionStatus: AzureSubscriptionStatus) =
                azureSubscriptionStatus(JsonField.of(azureSubscriptionStatus))

            fun azureSubscriptionStatus(
                azureSubscriptionStatus: JsonField<AzureSubscriptionStatus>
            ) = apply { this.azureSubscriptionStatus = azureSubscriptionStatus }

            fun billingProviderCustomerId(billingProviderCustomerId: String) =
                billingProviderCustomerId(JsonField.of(billingProviderCustomerId))

            fun billingProviderCustomerId(billingProviderCustomerId: JsonField<String>) = apply {
                this.billingProviderCustomerId = billingProviderCustomerId
            }

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

            fun build(): Data =
                Data(
                    awsExpirationDate,
                    awsProductCode,
                    awsRegion,
                    azureExpirationDate,
                    azurePlanId,
                    azureStartDate,
                    azureSubscriptionStatus,
                    billingProviderCustomerId,
                    stripeCollectionMethod,
                    additionalProperties.toImmutable(),
                )
        }

        class AwsRegion
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AwsRegion && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class AzureSubscriptionStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SUBSCRIBED = of("Subscribed")

                @JvmField val UNSUBSCRIBED = of("Unsubscribed")

                @JvmField val SUSPENDED = of("Suspended")

                @JvmField val PENDING_FULFILLMENT_START = of("PendingFulfillmentStart")

                @JvmStatic fun of(value: String) = AzureSubscriptionStatus(JsonField.of(value))
            }

            enum class Known {
                SUBSCRIBED,
                UNSUBSCRIBED,
                SUSPENDED,
                PENDING_FULFILLMENT_START,
            }

            enum class Value {
                SUBSCRIBED,
                UNSUBSCRIBED,
                SUSPENDED,
                PENDING_FULFILLMENT_START,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SUBSCRIBED -> Value.SUBSCRIBED
                    UNSUBSCRIBED -> Value.UNSUBSCRIBED
                    SUSPENDED -> Value.SUSPENDED
                    PENDING_FULFILLMENT_START -> Value.PENDING_FULFILLMENT_START
                    else -> Value._UNKNOWN
                }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AzureSubscriptionStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class StripeCollectionMethod
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CHARGE_AUTOMATICALLY = of("charge_automatically")

                @JvmField val SEND_INVOICE = of("send_invoice")

                @JvmStatic fun of(value: String) = StripeCollectionMethod(JsonField.of(value))
            }

            enum class Known {
                CHARGE_AUTOMATICALLY,
                SEND_INVOICE,
            }

            enum class Value {
                CHARGE_AUTOMATICALLY,
                SEND_INVOICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CHARGE_AUTOMATICALLY -> Value.CHARGE_AUTOMATICALLY
                    SEND_INVOICE -> Value.SEND_INVOICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CHARGE_AUTOMATICALLY -> Known.CHARGE_AUTOMATICALLY
                    SEND_INVOICE -> Known.SEND_INVOICE
                    else ->
                        throw MetronomeInvalidDataException(
                            "Unknown StripeCollectionMethod: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()

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

            return /* spotless:off */ other is Data && awsExpirationDate == other.awsExpirationDate && awsProductCode == other.awsProductCode && awsRegion == other.awsRegion && azureExpirationDate == other.azureExpirationDate && azurePlanId == other.azurePlanId && azureStartDate == other.azureStartDate && azureSubscriptionStatus == other.azureSubscriptionStatus && billingProviderCustomerId == other.billingProviderCustomerId && stripeCollectionMethod == other.stripeCollectionMethod && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(awsExpirationDate, awsProductCode, awsRegion, azureExpirationDate, azurePlanId, azureStartDate, azureSubscriptionStatus, billingProviderCustomerId, stripeCollectionMethod, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{awsExpirationDate=$awsExpirationDate, awsProductCode=$awsProductCode, awsRegion=$awsRegion, azureExpirationDate=$azureExpirationDate, azurePlanId=$azurePlanId, azureStartDate=$azureStartDate, azureSubscriptionStatus=$azureSubscriptionStatus, billingProviderCustomerId=$billingProviderCustomerId, stripeCollectionMethod=$stripeCollectionMethod, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerBillingConfigRetrieveResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerBillingConfigRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
