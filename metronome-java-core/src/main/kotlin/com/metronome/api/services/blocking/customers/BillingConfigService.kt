// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.customers

import com.fasterxml.jackson.annotation.JsonCreator
import com.metronome.api.core.Enum
import com.metronome.api.core.JsonField
import com.metronome.api.core.RequestOptions
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.CustomerBillingConfigCreateParams
import com.metronome.api.models.CustomerBillingConfigDeleteParams
import com.metronome.api.models.CustomerBillingConfigRetrieveParams
import com.metronome.api.models.CustomerBillingConfigRetrieveResponse

interface BillingConfigService {

    /** Set the billing configuration for a given customer. */
    @JvmOverloads
    fun create(
        params: CustomerBillingConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /** Fetch the billing configuration for the given customer. */
    @JvmOverloads
    fun retrieve(
        params: CustomerBillingConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CustomerBillingConfigRetrieveResponse

    /**
     * Delete the billing configuration for a given customer. Note: this is unsupported for Azure
     * and AWS Marketplace customers.
     */
    @JvmOverloads
    fun delete(
        params: CustomerBillingConfigDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

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
}
