// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerBillingConfigRetrieveResponseTest {

    @Test
    fun createV1CustomerBillingConfigRetrieveResponse() {
        val v1CustomerBillingConfigRetrieveResponse =
            V1CustomerBillingConfigRetrieveResponse.builder()
                .data(
                    V1CustomerBillingConfigRetrieveResponse.Data.builder()
                        .awsCustomerAccountId("aws_customer_account_id")
                        .awsCustomerId("aws_customer_id")
                        .awsExpirationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .awsIsSubscriptionProduct(true)
                        .awsProductCode("aws_product_code")
                        .awsRegion(
                            V1CustomerBillingConfigRetrieveResponse.Data.AwsRegion.AF_SOUTH_1
                        )
                        .azureExpirationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .azurePlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .azureStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .azureSubscriptionStatus(
                            V1CustomerBillingConfigRetrieveResponse.Data.AzureSubscriptionStatus
                                .SUBSCRIBED
                        )
                        .billingProviderCustomerId("billing_provider_customer_id")
                        .stripeCollectionMethod(
                            V1CustomerBillingConfigRetrieveResponse.Data.StripeCollectionMethod
                                .CHARGE_AUTOMATICALLY
                        )
                        .build()
                )
                .build()
        assertThat(v1CustomerBillingConfigRetrieveResponse).isNotNull
        assertThat(v1CustomerBillingConfigRetrieveResponse.data())
            .isEqualTo(
                V1CustomerBillingConfigRetrieveResponse.Data.builder()
                    .awsCustomerAccountId("aws_customer_account_id")
                    .awsCustomerId("aws_customer_id")
                    .awsExpirationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .awsIsSubscriptionProduct(true)
                    .awsProductCode("aws_product_code")
                    .awsRegion(V1CustomerBillingConfigRetrieveResponse.Data.AwsRegion.AF_SOUTH_1)
                    .azureExpirationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .azurePlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .azureStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .azureSubscriptionStatus(
                        V1CustomerBillingConfigRetrieveResponse.Data.AzureSubscriptionStatus
                            .SUBSCRIBED
                    )
                    .billingProviderCustomerId("billing_provider_customer_id")
                    .stripeCollectionMethod(
                        V1CustomerBillingConfigRetrieveResponse.Data.StripeCollectionMethod
                            .CHARGE_AUTOMATICALLY
                    )
                    .build()
            )
    }
}
