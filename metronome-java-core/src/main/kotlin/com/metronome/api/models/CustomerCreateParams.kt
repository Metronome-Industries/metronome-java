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
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.util.Objects
import java.util.Optional

class CustomerCreateParams
constructor(
    private val name: String,
    private val billingConfig: BillingConfig?,
    private val customFields: CustomFields?,
    private val externalId: String?,
    private val ingestAliases: List<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun billingConfig(): Optional<BillingConfig> = Optional.ofNullable(billingConfig)

    fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

    fun externalId(): Optional<String> = Optional.ofNullable(externalId)

    fun ingestAliases(): Optional<List<String>> = Optional.ofNullable(ingestAliases)

    @JvmSynthetic
    internal fun getBody(): CustomerCreateBody {
        return CustomerCreateBody(
            name,
            billingConfig,
            customFields,
            externalId,
            ingestAliases,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CustomerCreateBody.Builder::class)
    @NoAutoDetect
    class CustomerCreateBody
    internal constructor(
        private val name: String?,
        private val billingConfig: BillingConfig?,
        private val customFields: CustomFields?,
        private val externalId: String?,
        private val ingestAliases: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("billing_config") fun billingConfig(): BillingConfig? = billingConfig

        @JsonProperty("custom_fields") fun customFields(): CustomFields? = customFields

        /**
         * (deprecated, use ingest_aliases instead) the first ID (Metronome ID or ingest alias) that
         * can be used in usage events
         */
        @JsonProperty("external_id") fun externalId(): String? = externalId

        /** Aliases that can be used to refer to this customer in usage events */
        @JsonProperty("ingest_aliases") fun ingestAliases(): List<String>? = ingestAliases

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomerCreateBody &&
                this.name == other.name &&
                this.billingConfig == other.billingConfig &&
                this.customFields == other.customFields &&
                this.externalId == other.externalId &&
                this.ingestAliases == other.ingestAliases &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        billingConfig,
                        customFields,
                        externalId,
                        ingestAliases,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CustomerCreateBody{name=$name, billingConfig=$billingConfig, customFields=$customFields, externalId=$externalId, ingestAliases=$ingestAliases, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var billingConfig: BillingConfig? = null
            private var customFields: CustomFields? = null
            private var externalId: String? = null
            private var ingestAliases: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerCreateBody: CustomerCreateBody) = apply {
                this.name = customerCreateBody.name
                this.billingConfig = customerCreateBody.billingConfig
                this.customFields = customerCreateBody.customFields
                this.externalId = customerCreateBody.externalId
                this.ingestAliases = customerCreateBody.ingestAliases
                additionalProperties(customerCreateBody.additionalProperties)
            }

            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("billing_config")
            fun billingConfig(billingConfig: BillingConfig) = apply {
                this.billingConfig = billingConfig
            }

            @JsonProperty("custom_fields")
            fun customFields(customFields: CustomFields) = apply {
                this.customFields = customFields
            }

            /**
             * (deprecated, use ingest_aliases instead) the first ID (Metronome ID or ingest alias)
             * that can be used in usage events
             */
            @JsonProperty("external_id")
            fun externalId(externalId: String) = apply { this.externalId = externalId }

            /** Aliases that can be used to refer to this customer in usage events */
            @JsonProperty("ingest_aliases")
            fun ingestAliases(ingestAliases: List<String>) = apply {
                this.ingestAliases = ingestAliases
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

            fun build(): CustomerCreateBody =
                CustomerCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    billingConfig,
                    customFields,
                    externalId,
                    ingestAliases?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerCreateParams &&
            this.name == other.name &&
            this.billingConfig == other.billingConfig &&
            this.customFields == other.customFields &&
            this.externalId == other.externalId &&
            this.ingestAliases == other.ingestAliases &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            name,
            billingConfig,
            customFields,
            externalId,
            ingestAliases,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CustomerCreateParams{name=$name, billingConfig=$billingConfig, customFields=$customFields, externalId=$externalId, ingestAliases=$ingestAliases, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var billingConfig: BillingConfig? = null
        private var customFields: CustomFields? = null
        private var externalId: String? = null
        private var ingestAliases: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerCreateParams: CustomerCreateParams) = apply {
            this.name = customerCreateParams.name
            this.billingConfig = customerCreateParams.billingConfig
            this.customFields = customerCreateParams.customFields
            this.externalId = customerCreateParams.externalId
            this.ingestAliases(customerCreateParams.ingestAliases ?: listOf())
            additionalQueryParams(customerCreateParams.additionalQueryParams)
            additionalHeaders(customerCreateParams.additionalHeaders)
            additionalBodyProperties(customerCreateParams.additionalBodyProperties)
        }

        fun name(name: String) = apply { this.name = name }

        fun billingConfig(billingConfig: BillingConfig) = apply {
            this.billingConfig = billingConfig
        }

        fun customFields(customFields: CustomFields) = apply { this.customFields = customFields }

        /**
         * (deprecated, use ingest_aliases instead) the first ID (Metronome ID or ingest alias) that
         * can be used in usage events
         */
        fun externalId(externalId: String) = apply { this.externalId = externalId }

        /** Aliases that can be used to refer to this customer in usage events */
        fun ingestAliases(ingestAliases: List<String>) = apply {
            this.ingestAliases.clear()
            this.ingestAliases.addAll(ingestAliases)
        }

        /** Aliases that can be used to refer to this customer in usage events */
        fun addIngestAlias(ingestAlias: String) = apply { this.ingestAliases.add(ingestAlias) }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CustomerCreateParams =
            CustomerCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                billingConfig,
                customFields,
                externalId,
                if (ingestAliases.size == 0) null else ingestAliases.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = BillingConfig.Builder::class)
    @NoAutoDetect
    class BillingConfig
    private constructor(
        private val billingProviderType: BillingProviderType?,
        private val billingProviderCustomerId: String?,
        private val stripeCollectionMethod: StripeCollectionMethod?,
        private val awsProductCode: String?,
        private val awsRegion: AwsRegion?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("billing_provider_type")
        fun billingProviderType(): BillingProviderType? = billingProviderType

        @JsonProperty("billing_provider_customer_id")
        fun billingProviderCustomerId(): String? = billingProviderCustomerId

        @JsonProperty("stripe_collection_method")
        fun stripeCollectionMethod(): StripeCollectionMethod? = stripeCollectionMethod

        @JsonProperty("aws_product_code") fun awsProductCode(): String? = awsProductCode

        @JsonProperty("aws_region") fun awsRegion(): AwsRegion? = awsRegion

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillingConfig &&
                this.billingProviderType == other.billingProviderType &&
                this.billingProviderCustomerId == other.billingProviderCustomerId &&
                this.stripeCollectionMethod == other.stripeCollectionMethod &&
                this.awsProductCode == other.awsProductCode &&
                this.awsRegion == other.awsRegion &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        billingProviderType,
                        billingProviderCustomerId,
                        stripeCollectionMethod,
                        awsProductCode,
                        awsRegion,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BillingConfig{billingProviderType=$billingProviderType, billingProviderCustomerId=$billingProviderCustomerId, stripeCollectionMethod=$stripeCollectionMethod, awsProductCode=$awsProductCode, awsRegion=$awsRegion, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var billingProviderType: BillingProviderType? = null
            private var billingProviderCustomerId: String? = null
            private var stripeCollectionMethod: StripeCollectionMethod? = null
            private var awsProductCode: String? = null
            private var awsRegion: AwsRegion? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingConfig: BillingConfig) = apply {
                this.billingProviderType = billingConfig.billingProviderType
                this.billingProviderCustomerId = billingConfig.billingProviderCustomerId
                this.stripeCollectionMethod = billingConfig.stripeCollectionMethod
                this.awsProductCode = billingConfig.awsProductCode
                this.awsRegion = billingConfig.awsRegion
                additionalProperties(billingConfig.additionalProperties)
            }

            @JsonProperty("billing_provider_type")
            fun billingProviderType(billingProviderType: BillingProviderType) = apply {
                this.billingProviderType = billingProviderType
            }

            @JsonProperty("billing_provider_customer_id")
            fun billingProviderCustomerId(billingProviderCustomerId: String) = apply {
                this.billingProviderCustomerId = billingProviderCustomerId
            }

            @JsonProperty("stripe_collection_method")
            fun stripeCollectionMethod(stripeCollectionMethod: StripeCollectionMethod) = apply {
                this.stripeCollectionMethod = stripeCollectionMethod
            }

            @JsonProperty("aws_product_code")
            fun awsProductCode(awsProductCode: String) = apply {
                this.awsProductCode = awsProductCode
            }

            @JsonProperty("aws_region")
            fun awsRegion(awsRegion: AwsRegion) = apply { this.awsRegion = awsRegion }

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

            fun build(): BillingConfig =
                BillingConfig(
                    checkNotNull(billingProviderType) {
                        "`billingProviderType` is required but was not set"
                    },
                    checkNotNull(billingProviderCustomerId) {
                        "`billingProviderCustomerId` is required but was not set"
                    },
                    stripeCollectionMethod,
                    awsProductCode,
                    awsRegion,
                    additionalProperties.toUnmodifiable(),
                )
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

                return other is BillingProviderType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val AWS_MARKETPLACE = BillingProviderType(JsonField.of("aws_marketplace"))

                @JvmField val STRIPE = BillingProviderType(JsonField.of("stripe"))

                @JvmField val NETSUITE = BillingProviderType(JsonField.of("netsuite"))

                @JvmField val CUSTOM = BillingProviderType(JsonField.of("custom"))

                @JvmField
                val AZURE_MARKETPLACE = BillingProviderType(JsonField.of("azure_marketplace"))

                @JvmField
                val QUICKBOOKS_ONLINE = BillingProviderType(JsonField.of("quickbooks_online"))

                @JvmField val WORKDAY = BillingProviderType(JsonField.of("workday"))

                @JvmField val GCP_MARKETPLACE = BillingProviderType(JsonField.of("gcp_marketplace"))

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
                    else ->
                        throw MetronomeInvalidDataException("Unknown BillingProviderType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
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

                return other is AwsRegion && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val AF_SOUTH_1 = AwsRegion(JsonField.of("af-south-1"))

                @JvmField val AP_EAST_1 = AwsRegion(JsonField.of("ap-east-1"))

                @JvmField val AP_NORTHEAST_1 = AwsRegion(JsonField.of("ap-northeast-1"))

                @JvmField val AP_NORTHEAST_2 = AwsRegion(JsonField.of("ap-northeast-2"))

                @JvmField val AP_NORTHEAST_3 = AwsRegion(JsonField.of("ap-northeast-3"))

                @JvmField val AP_SOUTH_1 = AwsRegion(JsonField.of("ap-south-1"))

                @JvmField val AP_SOUTHEAST_1 = AwsRegion(JsonField.of("ap-southeast-1"))

                @JvmField val AP_SOUTHEAST_2 = AwsRegion(JsonField.of("ap-southeast-2"))

                @JvmField val CA_CENTRAL_1 = AwsRegion(JsonField.of("ca-central-1"))

                @JvmField val CN_NORTH_1 = AwsRegion(JsonField.of("cn-north-1"))

                @JvmField val CN_NORTHWEST_1 = AwsRegion(JsonField.of("cn-northwest-1"))

                @JvmField val EU_CENTRAL_1 = AwsRegion(JsonField.of("eu-central-1"))

                @JvmField val EU_NORTH_1 = AwsRegion(JsonField.of("eu-north-1"))

                @JvmField val EU_SOUTH_1 = AwsRegion(JsonField.of("eu-south-1"))

                @JvmField val EU_WEST_1 = AwsRegion(JsonField.of("eu-west-1"))

                @JvmField val EU_WEST_2 = AwsRegion(JsonField.of("eu-west-2"))

                @JvmField val EU_WEST_3 = AwsRegion(JsonField.of("eu-west-3"))

                @JvmField val ME_SOUTH_1 = AwsRegion(JsonField.of("me-south-1"))

                @JvmField val SA_EAST_1 = AwsRegion(JsonField.of("sa-east-1"))

                @JvmField val US_EAST_1 = AwsRegion(JsonField.of("us-east-1"))

                @JvmField val US_EAST_2 = AwsRegion(JsonField.of("us-east-2"))

                @JvmField val US_GOV_EAST_1 = AwsRegion(JsonField.of("us-gov-east-1"))

                @JvmField val US_GOV_WEST_1 = AwsRegion(JsonField.of("us-gov-west-1"))

                @JvmField val US_WEST_1 = AwsRegion(JsonField.of("us-west-1"))

                @JvmField val US_WEST_2 = AwsRegion(JsonField.of("us-west-2"))

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

                return other is StripeCollectionMethod && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val CHARGE_AUTOMATICALLY =
                    StripeCollectionMethod(JsonField.of("charge_automatically"))

                @JvmField val SEND_INVOICE = StripeCollectionMethod(JsonField.of("send_invoice"))

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
        }
    }

    @JsonDeserialize(builder = CustomFields.Builder::class)
    @NoAutoDetect
    class CustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomFields && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties(customFields.additionalProperties)
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

            fun build(): CustomFields = CustomFields(additionalProperties.toUnmodifiable())
        }
    }
}
