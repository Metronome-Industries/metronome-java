// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerBillingConfigRetrieveResponseTest {

    @Test
    fun createCustomerBillingConfigRetrieveResponse() {
        val customerBillingConfigRetrieveResponse =
            CustomerBillingConfigRetrieveResponse.builder()
                .data(
                    CustomerBillingConfigRetrieveResponse.Data.builder()
                        .awsExpirationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .awsProductCode("string")
                        .awsRegion(CustomerBillingConfigRetrieveResponse.Data.AwsRegion.AF_SOUTH_1)
                        .azureExpirationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .azurePlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .azureStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .azureSubscriptionStatus(
                            CustomerBillingConfigRetrieveResponse.Data.AzureSubscriptionStatus
                                .SUBSCRIBED
                        )
                        .billingProviderCustomerId("string")
                        .stripeCollectionMethod(
                            CustomerBillingConfigRetrieveResponse.Data.StripeCollectionMethod
                                .CHARGE_AUTOMATICALLY
                        )
                        .build()
                )
                .build()
        assertThat(customerBillingConfigRetrieveResponse).isNotNull
        assertThat(customerBillingConfigRetrieveResponse.data())
            .isEqualTo(
                CustomerBillingConfigRetrieveResponse.Data.builder()
                    .awsExpirationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .awsProductCode("string")
                    .awsRegion(CustomerBillingConfigRetrieveResponse.Data.AwsRegion.AF_SOUTH_1)
                    .azureExpirationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .azurePlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .azureStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .azureSubscriptionStatus(
                        CustomerBillingConfigRetrieveResponse.Data.AzureSubscriptionStatus
                            .SUBSCRIBED
                    )
                    .billingProviderCustomerId("string")
                    .stripeCollectionMethod(
                        CustomerBillingConfigRetrieveResponse.Data.StripeCollectionMethod
                            .CHARGE_AUTOMATICALLY
                    )
                    .build()
            )
    }
}
