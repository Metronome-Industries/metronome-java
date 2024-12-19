// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.CustomerBillingConfigCreateParams
import com.metronome.api.models.CustomerBillingConfigDeleteParams
import com.metronome.api.models.CustomerBillingConfigRetrieveParams
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
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(
                    CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
                )
                .billingProviderCustomerId("cus_AJ6y20bjkOOayM")
                .awsProductCode("aws_product_code")
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
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
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
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(
                    CustomerBillingConfigDeleteParams.BillingProviderType.AWS_MARKETPLACE
                )
                .build()
        )
    }
}
