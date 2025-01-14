// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.metronome.api.core.Enum
import com.metronome.api.core.JsonField
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects

/** Fetch the billing configuration for the given customer. */
class CustomerBillingConfigRetrieveParams
constructor(
    private val customerId: String,
    private val billingProviderType: BillingProviderType,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = customerId

    fun billingProviderType(): BillingProviderType = billingProviderType

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            1 -> billingProviderType.toString()
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var billingProviderType: BillingProviderType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            customerBillingConfigRetrieveParams: CustomerBillingConfigRetrieveParams
        ) = apply {
            customerId = customerBillingConfigRetrieveParams.customerId
            billingProviderType = customerBillingConfigRetrieveParams.billingProviderType
            additionalHeaders = customerBillingConfigRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                customerBillingConfigRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun billingProviderType(billingProviderType: BillingProviderType) = apply {
            this.billingProviderType = billingProviderType
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

        fun build(): CustomerBillingConfigRetrieveParams =
            CustomerBillingConfigRetrieveParams(
                checkRequired("customerId", customerId),
                checkRequired("billingProviderType", billingProviderType),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class BillingProviderType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingProviderType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerBillingConfigRetrieveParams && customerId == other.customerId && billingProviderType == other.billingProviderType && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, billingProviderType, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerBillingConfigRetrieveParams{customerId=$customerId, billingProviderType=$billingProviderType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
