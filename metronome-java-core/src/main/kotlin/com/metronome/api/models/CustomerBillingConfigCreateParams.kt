// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.util.Objects
import java.util.Optional

class CustomerBillingConfigCreateParams
constructor(
    private val customerId: String,
    private val billingProviderType: BillingProviderType,
    private val billingProviderCustomerId: String,
    private val awsProductCode: String?,
    private val awsRegion: AwsRegion?,
    private val stripeCollectionMethod: StripeCollectionMethod?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun billingProviderType(): BillingProviderType = billingProviderType

    fun billingProviderCustomerId(): String = billingProviderCustomerId

    fun awsProductCode(): Optional<String> = Optional.ofNullable(awsProductCode)

    fun awsRegion(): Optional<AwsRegion> = Optional.ofNullable(awsRegion)

    fun stripeCollectionMethod(): Optional<StripeCollectionMethod> =
        Optional.ofNullable(stripeCollectionMethod)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): CustomerBillingConfigCreateBody {
        return CustomerBillingConfigCreateBody(
            billingProviderCustomerId,
            awsProductCode,
            awsRegion,
            stripeCollectionMethod,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            1 -> billingProviderType.toString()
            else -> ""
        }
    }

    @JsonDeserialize(builder = CustomerBillingConfigCreateBody.Builder::class)
    @NoAutoDetect
    class CustomerBillingConfigCreateBody
    internal constructor(
        private val billingProviderCustomerId: String?,
        private val awsProductCode: String?,
        private val awsRegion: AwsRegion?,
        private val stripeCollectionMethod: StripeCollectionMethod?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The customer ID in the billing provider's system. For Azure, this is the subscription ID.
         */
        @JsonProperty("billing_provider_customer_id")
        fun billingProviderCustomerId(): String? = billingProviderCustomerId

        @JsonProperty("aws_product_code") fun awsProductCode(): String? = awsProductCode

        @JsonProperty("aws_region") fun awsRegion(): AwsRegion? = awsRegion

        @JsonProperty("stripe_collection_method")
        fun stripeCollectionMethod(): StripeCollectionMethod? = stripeCollectionMethod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var billingProviderCustomerId: String? = null
            private var awsProductCode: String? = null
            private var awsRegion: AwsRegion? = null
            private var stripeCollectionMethod: StripeCollectionMethod? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerBillingConfigCreateBody: CustomerBillingConfigCreateBody) =
                apply {
                    this.billingProviderCustomerId =
                        customerBillingConfigCreateBody.billingProviderCustomerId
                    this.awsProductCode = customerBillingConfigCreateBody.awsProductCode
                    this.awsRegion = customerBillingConfigCreateBody.awsRegion
                    this.stripeCollectionMethod =
                        customerBillingConfigCreateBody.stripeCollectionMethod
                    additionalProperties(customerBillingConfigCreateBody.additionalProperties)
                }

            /**
             * The customer ID in the billing provider's system. For Azure, this is the subscription
             * ID.
             */
            @JsonProperty("billing_provider_customer_id")
            fun billingProviderCustomerId(billingProviderCustomerId: String) = apply {
                this.billingProviderCustomerId = billingProviderCustomerId
            }

            @JsonProperty("aws_product_code")
            fun awsProductCode(awsProductCode: String) = apply {
                this.awsProductCode = awsProductCode
            }

            @JsonProperty("aws_region")
            fun awsRegion(awsRegion: AwsRegion) = apply { this.awsRegion = awsRegion }

            @JsonProperty("stripe_collection_method")
            fun stripeCollectionMethod(stripeCollectionMethod: StripeCollectionMethod) = apply {
                this.stripeCollectionMethod = stripeCollectionMethod
            }

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

            fun build(): CustomerBillingConfigCreateBody =
                CustomerBillingConfigCreateBody(
                    checkNotNull(billingProviderCustomerId) {
                        "`billingProviderCustomerId` is required but was not set"
                    },
                    awsProductCode,
                    awsRegion,
                    stripeCollectionMethod,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerBillingConfigCreateBody && billingProviderCustomerId == other.billingProviderCustomerId && awsProductCode == other.awsProductCode && awsRegion == other.awsRegion && stripeCollectionMethod == other.stripeCollectionMethod && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billingProviderCustomerId, awsProductCode, awsRegion, stripeCollectionMethod, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerBillingConfigCreateBody{billingProviderCustomerId=$billingProviderCustomerId, awsProductCode=$awsProductCode, awsRegion=$awsRegion, stripeCollectionMethod=$stripeCollectionMethod, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var billingProviderType: BillingProviderType? = null
        private var billingProviderCustomerId: String? = null
        private var awsProductCode: String? = null
        private var awsRegion: AwsRegion? = null
        private var stripeCollectionMethod: StripeCollectionMethod? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerBillingConfigCreateParams: CustomerBillingConfigCreateParams) =
            apply {
                customerId = customerBillingConfigCreateParams.customerId
                billingProviderType = customerBillingConfigCreateParams.billingProviderType
                billingProviderCustomerId =
                    customerBillingConfigCreateParams.billingProviderCustomerId
                awsProductCode = customerBillingConfigCreateParams.awsProductCode
                awsRegion = customerBillingConfigCreateParams.awsRegion
                stripeCollectionMethod = customerBillingConfigCreateParams.stripeCollectionMethod
                additionalHeaders = customerBillingConfigCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    customerBillingConfigCreateParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    customerBillingConfigCreateParams.additionalBodyProperties.toMutableMap()
            }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun billingProviderType(billingProviderType: BillingProviderType) = apply {
            this.billingProviderType = billingProviderType
        }

        /**
         * The customer ID in the billing provider's system. For Azure, this is the subscription ID.
         */
        fun billingProviderCustomerId(billingProviderCustomerId: String) = apply {
            this.billingProviderCustomerId = billingProviderCustomerId
        }

        fun awsProductCode(awsProductCode: String) = apply { this.awsProductCode = awsProductCode }

        fun awsRegion(awsRegion: AwsRegion) = apply { this.awsRegion = awsRegion }

        fun stripeCollectionMethod(stripeCollectionMethod: StripeCollectionMethod) = apply {
            this.stripeCollectionMethod = stripeCollectionMethod
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): CustomerBillingConfigCreateParams =
            CustomerBillingConfigCreateParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(billingProviderType) {
                    "`billingProviderType` is required but was not set"
                },
                checkNotNull(billingProviderCustomerId) {
                    "`billingProviderCustomerId` is required but was not set"
                },
                awsProductCode,
                awsRegion,
                stripeCollectionMethod,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class AwsRegion
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AwsRegion && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

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
    }

    class StripeCollectionMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StripeCollectionMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

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
                    throw MetronomeInvalidDataException("Unknown StripeCollectionMethod: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class BillingProviderType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingProviderType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

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

        enum class Value {
            AWS_MARKETPLACE,
            STRIPE,
            NETSUITE,
            CUSTOM,
            AZURE_MARKETPLACE,
            QUICKBOOKS_ONLINE,
            WORKDAY,
            GCP_MARKETPLACE,
            _UNKNOWN,
        }

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
                else -> throw MetronomeInvalidDataException("Unknown BillingProviderType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerBillingConfigCreateParams && customerId == other.customerId && billingProviderType == other.billingProviderType && billingProviderCustomerId == other.billingProviderCustomerId && awsProductCode == other.awsProductCode && awsRegion == other.awsRegion && stripeCollectionMethod == other.stripeCollectionMethod && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, billingProviderType, billingProviderCustomerId, awsProductCode, awsRegion, stripeCollectionMethod, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CustomerBillingConfigCreateParams{customerId=$customerId, billingProviderType=$billingProviderType, billingProviderCustomerId=$billingProviderCustomerId, awsProductCode=$awsProductCode, awsRegion=$awsRegion, stripeCollectionMethod=$stripeCollectionMethod, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
