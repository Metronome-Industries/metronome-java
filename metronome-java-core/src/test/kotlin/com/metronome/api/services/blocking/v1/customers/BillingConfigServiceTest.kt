// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.V1CustomerBillingConfigCreateParams
import com.metronome.api.models.V1CustomerBillingConfigDeleteParams
import com.metronome.api.models.V1CustomerBillingConfigRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BillingConfigServiceTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billingConfigService = client.v1().customers().billingConfig()

        billingConfigService.create(
            V1CustomerBillingConfigCreateParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(
                    V1CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
                )
                .billingProviderCustomerId("cus_AJ6y20bjkOOayM")
                .awsCustomerAccountId("aws_customer_account_id")
                .awsCustomerId("aws_customer_id")
                .awsProductCode("aws_product_code")
                .awsRegion(V1CustomerBillingConfigCreateParams.AwsRegion.AF_SOUTH_1)
                .stripeCollectionMethod(
                    V1CustomerBillingConfigCreateParams.StripeCollectionMethod.CHARGE_AUTOMATICALLY
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
                V1CustomerBillingConfigRetrieveParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .billingProviderType(
                        V1CustomerBillingConfigRetrieveParams.BillingProviderType.AWS_MARKETPLACE
                    )
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
            V1CustomerBillingConfigDeleteParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(
                    V1CustomerBillingConfigDeleteParams.BillingProviderType.AWS_MARKETPLACE
                )
                .build()
        )
    }
}
