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

@NoAutoDetect
class V1SettingBillingProviderListResponse
@JsonCreator
private constructor(
    @JsonProperty("billing_provider")
    @ExcludeMissing
    private val billingProvider: JsonField<BillingProvider> = JsonMissing.of(),
    @JsonProperty("delivery_method")
    @ExcludeMissing
    private val deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of(),
    @JsonProperty("delivery_method_configuration")
    @ExcludeMissing
    private val deliveryMethodConfiguration: JsonField<DeliveryMethodConfiguration> =
        JsonMissing.of(),
    @JsonProperty("delivery_method_id")
    @ExcludeMissing
    private val deliveryMethodId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The billing provider set for this configuration. */
    fun billingProvider(): BillingProvider = billingProvider.getRequired("billing_provider")

    /** The method to use for delivering invoices to this customer. */
    fun deliveryMethod(): DeliveryMethod = deliveryMethod.getRequired("delivery_method")

    /**
     * Configuration for the delivery method. The structure of this object is specific to the
     * delivery method. Some configuration may be omitted for security reasons.
     */
    fun deliveryMethodConfiguration(): DeliveryMethodConfiguration =
        deliveryMethodConfiguration.getRequired("delivery_method_configuration")

    /** ID of the delivery method to use for this customer. */
    fun deliveryMethodId(): String = deliveryMethodId.getRequired("delivery_method_id")

    /** The billing provider set for this configuration. */
    @JsonProperty("billing_provider")
    @ExcludeMissing
    fun _billingProvider(): JsonField<BillingProvider> = billingProvider

    /** The method to use for delivering invoices to this customer. */
    @JsonProperty("delivery_method")
    @ExcludeMissing
    fun _deliveryMethod(): JsonField<DeliveryMethod> = deliveryMethod

    /**
     * Configuration for the delivery method. The structure of this object is specific to the
     * delivery method. Some configuration may be omitted for security reasons.
     */
    @JsonProperty("delivery_method_configuration")
    @ExcludeMissing
    fun _deliveryMethodConfiguration(): JsonField<DeliveryMethodConfiguration> =
        deliveryMethodConfiguration

    /** ID of the delivery method to use for this customer. */
    @JsonProperty("delivery_method_id")
    @ExcludeMissing
    fun _deliveryMethodId(): JsonField<String> = deliveryMethodId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): V1SettingBillingProviderListResponse = apply {
        if (validated) {
            return@apply
        }

        billingProvider()
        deliveryMethod()
        deliveryMethodConfiguration().validate()
        deliveryMethodId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1SettingBillingProviderListResponse]. */
    class Builder internal constructor() {

        private var billingProvider: JsonField<BillingProvider>? = null
        private var deliveryMethod: JsonField<DeliveryMethod>? = null
        private var deliveryMethodConfiguration: JsonField<DeliveryMethodConfiguration>? = null
        private var deliveryMethodId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            v1SettingBillingProviderListResponse: V1SettingBillingProviderListResponse
        ) = apply {
            billingProvider = v1SettingBillingProviderListResponse.billingProvider
            deliveryMethod = v1SettingBillingProviderListResponse.deliveryMethod
            deliveryMethodConfiguration =
                v1SettingBillingProviderListResponse.deliveryMethodConfiguration
            deliveryMethodId = v1SettingBillingProviderListResponse.deliveryMethodId
            additionalProperties =
                v1SettingBillingProviderListResponse.additionalProperties.toMutableMap()
        }

        /** The billing provider set for this configuration. */
        fun billingProvider(billingProvider: BillingProvider) =
            billingProvider(JsonField.of(billingProvider))

        /** The billing provider set for this configuration. */
        fun billingProvider(billingProvider: JsonField<BillingProvider>) = apply {
            this.billingProvider = billingProvider
        }

        /** The method to use for delivering invoices to this customer. */
        fun deliveryMethod(deliveryMethod: DeliveryMethod) =
            deliveryMethod(JsonField.of(deliveryMethod))

        /** The method to use for delivering invoices to this customer. */
        fun deliveryMethod(deliveryMethod: JsonField<DeliveryMethod>) = apply {
            this.deliveryMethod = deliveryMethod
        }

        /**
         * Configuration for the delivery method. The structure of this object is specific to the
         * delivery method. Some configuration may be omitted for security reasons.
         */
        fun deliveryMethodConfiguration(deliveryMethodConfiguration: DeliveryMethodConfiguration) =
            deliveryMethodConfiguration(JsonField.of(deliveryMethodConfiguration))

        /**
         * Configuration for the delivery method. The structure of this object is specific to the
         * delivery method. Some configuration may be omitted for security reasons.
         */
        fun deliveryMethodConfiguration(
            deliveryMethodConfiguration: JsonField<DeliveryMethodConfiguration>
        ) = apply { this.deliveryMethodConfiguration = deliveryMethodConfiguration }

        /** ID of the delivery method to use for this customer. */
        fun deliveryMethodId(deliveryMethodId: String) =
            deliveryMethodId(JsonField.of(deliveryMethodId))

        /** ID of the delivery method to use for this customer. */
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

        fun build(): V1SettingBillingProviderListResponse =
            V1SettingBillingProviderListResponse(
                checkRequired("billingProvider", billingProvider),
                checkRequired("deliveryMethod", deliveryMethod),
                checkRequired("deliveryMethodConfiguration", deliveryMethodConfiguration),
                checkRequired("deliveryMethodId", deliveryMethodId),
                additionalProperties.toImmutable(),
            )
    }

    /** The billing provider set for this configuration. */
    class BillingProvider @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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

            return /* spotless:off */ other is BillingProvider && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The method to use for delivering invoices to this customer. */
    class DeliveryMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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

            return /* spotless:off */ other is DeliveryMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Configuration for the delivery method. The structure of this object is specific to the
     * delivery method. Some configuration may be omitted for security reasons.
     */
    @NoAutoDetect
    class DeliveryMethodConfiguration
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DeliveryMethodConfiguration = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DeliveryMethodConfiguration]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(deliveryMethodConfiguration: DeliveryMethodConfiguration) = apply {
                additionalProperties =
                    deliveryMethodConfiguration.additionalProperties.toMutableMap()
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

            fun build(): DeliveryMethodConfiguration =
                DeliveryMethodConfiguration(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DeliveryMethodConfiguration && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DeliveryMethodConfiguration{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1SettingBillingProviderListResponse && billingProvider == other.billingProvider && deliveryMethod == other.deliveryMethod && deliveryMethodConfiguration == other.deliveryMethodConfiguration && deliveryMethodId == other.deliveryMethodId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(billingProvider, deliveryMethod, deliveryMethodConfiguration, deliveryMethodId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1SettingBillingProviderListResponse{billingProvider=$billingProvider, deliveryMethod=$deliveryMethod, deliveryMethodConfiguration=$deliveryMethodConfiguration, deliveryMethodId=$deliveryMethodId, additionalProperties=$additionalProperties}"
}
