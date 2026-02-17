// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.v1.customers.billingconfig.BillingConfigCreateParams
import com.metronome.api.models.v1.customers.billingconfig.BillingConfigDeleteParams
import com.metronome.api.models.v1.customers.billingconfig.BillingConfigRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BillingConfigServiceTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billingConfigService = client.v1().customers().billingConfig()

        billingConfigService.create(
            BillingConfigCreateParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(BillingConfigCreateParams.BillingProviderType.STRIPE)
                .billingProviderCustomerId("cus_AJ6y20bjkOOayM")
                .awsCustomerAccountId("aws_customer_account_id")
                .awsCustomerId("aws_customer_id")
                .awsProductCode("aws_product_code")
                .awsRegion(BillingConfigCreateParams.AwsRegion.AF_SOUTH_1)
                .stripeCollectionMethod(
                    BillingConfigCreateParams.StripeCollectionMethod.CHARGE_AUTOMATICALLY
                )
                .build()
        )
    }

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billingConfigService = client.v1().customers().billingConfig()

        val billingConfig =
            billingConfigService.retrieve(
                BillingConfigRetrieveParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .billingProviderType(BillingConfigRetrieveParams.BillingProviderType.STRIPE)
                    .build()
            )

        billingConfig.validate()
    }

    @Test
    fun delete() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billingConfigService = client.v1().customers().billingConfig()

        billingConfigService.delete(
            BillingConfigDeleteParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(BillingConfigDeleteParams.BillingProviderType.STRIPE)
                .build()
        )
    }
}
