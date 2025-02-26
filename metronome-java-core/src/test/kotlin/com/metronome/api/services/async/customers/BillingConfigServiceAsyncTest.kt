// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.models.CustomerBillingConfigCreateParams
import com.metronome.api.models.CustomerBillingConfigDeleteParams
import com.metronome.api.models.CustomerBillingConfigRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BillingConfigServiceAsyncTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billingConfigServiceAsync = client.customers().billingConfig()

        val future =
            billingConfigServiceAsync.create(
                CustomerBillingConfigCreateParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .billingProviderType(
                        CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
                    )
                    .billingProviderCustomerId("cus_AJ6y20bjkOOayM")
                    .awsProductCode("aws_product_code")
                    .awsRegion(CustomerBillingConfigCreateParams.AwsRegion.AF_SOUTH_1)
                    .stripeCollectionMethod(
                        CustomerBillingConfigCreateParams.StripeCollectionMethod
                            .CHARGE_AUTOMATICALLY
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billingConfigServiceAsync = client.customers().billingConfig()

        val billingConfigFuture =
            billingConfigServiceAsync.retrieve(
                CustomerBillingConfigRetrieveParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .billingProviderType(
                        CustomerBillingConfigRetrieveParams.BillingProviderType.AWS_MARKETPLACE
                    )
                    .build()
            )

        val billingConfig = billingConfigFuture.get()
        billingConfig.validate()
    }

    @Test
    fun delete() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billingConfigServiceAsync = client.customers().billingConfig()

        val future =
            billingConfigServiceAsync.delete(
                CustomerBillingConfigDeleteParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .billingProviderType(
                        CustomerBillingConfigDeleteParams.BillingProviderType.AWS_MARKETPLACE
                    )
                    .build()
            )

        val response = future.get()
    }
}
