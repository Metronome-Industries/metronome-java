// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.billingconfig

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingConfigRetrieveResponseTest {

    @Test
    fun create() {
        val billingConfigRetrieveResponse =
            BillingConfigRetrieveResponse.builder()
                .data(
                    BillingConfigRetrieveResponse.Data.builder()
                        .awsCustomerAccountId("aws_customer_account_id")
                        .awsCustomerId("aws_customer_id")
                        .awsExpirationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .awsIsSubscriptionProduct(true)
                        .awsProductCode("aws_product_code")
                        .awsRegion(BillingConfigRetrieveResponse.Data.AwsRegion.AF_SOUTH_1)
                        .azureExpirationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .azurePlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .azureStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .azureSubscriptionStatus(
                            BillingConfigRetrieveResponse.Data.AzureSubscriptionStatus.SUBSCRIBED
                        )
                        .billingProviderCustomerId("billing_provider_customer_id")
                        .stripeCollectionMethod(
                            BillingConfigRetrieveResponse.Data.StripeCollectionMethod
                                .CHARGE_AUTOMATICALLY
                        )
                        .build()
                )
                .build()

        assertThat(billingConfigRetrieveResponse.data())
            .isEqualTo(
                BillingConfigRetrieveResponse.Data.builder()
                    .awsCustomerAccountId("aws_customer_account_id")
                    .awsCustomerId("aws_customer_id")
                    .awsExpirationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .awsIsSubscriptionProduct(true)
                    .awsProductCode("aws_product_code")
                    .awsRegion(BillingConfigRetrieveResponse.Data.AwsRegion.AF_SOUTH_1)
                    .azureExpirationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .azurePlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .azureStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .azureSubscriptionStatus(
                        BillingConfigRetrieveResponse.Data.AzureSubscriptionStatus.SUBSCRIBED
                    )
                    .billingProviderCustomerId("billing_provider_customer_id")
                    .stripeCollectionMethod(
                        BillingConfigRetrieveResponse.Data.StripeCollectionMethod
                            .CHARGE_AUTOMATICALLY
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingConfigRetrieveResponse =
            BillingConfigRetrieveResponse.builder()
                .data(
                    BillingConfigRetrieveResponse.Data.builder()
                        .awsCustomerAccountId("aws_customer_account_id")
                        .awsCustomerId("aws_customer_id")
                        .awsExpirationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .awsIsSubscriptionProduct(true)
                        .awsProductCode("aws_product_code")
                        .awsRegion(BillingConfigRetrieveResponse.Data.AwsRegion.AF_SOUTH_1)
                        .azureExpirationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .azurePlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .azureStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .azureSubscriptionStatus(
                            BillingConfigRetrieveResponse.Data.AzureSubscriptionStatus.SUBSCRIBED
                        )
                        .billingProviderCustomerId("billing_provider_customer_id")
                        .stripeCollectionMethod(
                            BillingConfigRetrieveResponse.Data.StripeCollectionMethod
                                .CHARGE_AUTOMATICALLY
                        )
                        .build()
                )
                .build()

        val roundtrippedBillingConfigRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingConfigRetrieveResponse),
                jacksonTypeRef<BillingConfigRetrieveResponse>(),
            )

        assertThat(roundtrippedBillingConfigRetrieveResponse)
            .isEqualTo(billingConfigRetrieveResponse)
    }
}
