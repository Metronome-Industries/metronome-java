// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BillingConfigServiceTest {

    @Test
    fun callCreate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billingConfigService = client.customers().billingConfig()
        billingConfigService.create(
            CustomerBillingConfigCreateParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .billingProviderType(
                    CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
                )
                .billingProviderCustomerId("string")
                .awsProductCode("string")
                .awsRegion(CustomerBillingConfigCreateParams.AwsRegion.AF_SOUTH_1)
                .stripeCollectionMethod(
                    CustomerBillingConfigCreateParams.StripeCollectionMethod.CHARGE_AUTOMATICALLY
                )
                .build()
        )
    }

    @Test
    fun callRetrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billingConfigService = client.customers().billingConfig()
        val customerBillingConfigRetrieveResponse =
            billingConfigService.retrieve(
                CustomerBillingConfigRetrieveParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .billingProviderType(
                        CustomerBillingConfigRetrieveParams.BillingProviderType.AWS_MARKETPLACE
                    )
                    .build()
            )
        println(customerBillingConfigRetrieveResponse)
        customerBillingConfigRetrieveResponse.validate()
    }

    @Test
    fun callDelete() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billingConfigService = client.customers().billingConfig()
        billingConfigService.delete(
            CustomerBillingConfigDeleteParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .billingProviderType(
                    CustomerBillingConfigDeleteParams.BillingProviderType.AWS_MARKETPLACE
                )
                .build()
        )
    }
}
