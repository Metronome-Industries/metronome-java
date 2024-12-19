// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreateParamsTest {

    @Test
    fun createCustomerCreateParams() {
        CustomerCreateParams.builder()
            .name("Example, Inc.")
            .billingConfig(
                CustomerCreateParams.BillingConfig.builder()
                    .billingProviderCustomerId("billing_provider_customer_id")
                    .billingProviderType(
                        CustomerCreateParams.BillingConfig.BillingProviderType.AWS_MARKETPLACE
                    )
                    .awsProductCode("aws_product_code")
                    .awsRegion(CustomerCreateParams.BillingConfig.AwsRegion.AF_SOUTH_1)
                    .stripeCollectionMethod(
                        CustomerCreateParams.BillingConfig.StripeCollectionMethod
                            .CHARGE_AUTOMATICALLY
                    )
                    .build()
            )
            .customFields(
                CustomerCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .externalId("x")
            .ingestAliases(listOf("team@example.com"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomerCreateParams.builder()
                .name("Example, Inc.")
                .billingConfig(
                    CustomerCreateParams.BillingConfig.builder()
                        .billingProviderCustomerId("billing_provider_customer_id")
                        .billingProviderType(
                            CustomerCreateParams.BillingConfig.BillingProviderType.AWS_MARKETPLACE
                        )
                        .awsProductCode("aws_product_code")
                        .awsRegion(CustomerCreateParams.BillingConfig.AwsRegion.AF_SOUTH_1)
                        .stripeCollectionMethod(
                            CustomerCreateParams.BillingConfig.StripeCollectionMethod
                                .CHARGE_AUTOMATICALLY
                        )
                        .build()
                )
                .customFields(
                    CustomerCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .externalId("x")
                .ingestAliases(listOf("team@example.com"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("Example, Inc.")
        assertThat(body.billingConfig())
            .isEqualTo(
                CustomerCreateParams.BillingConfig.builder()
                    .billingProviderCustomerId("billing_provider_customer_id")
                    .billingProviderType(
                        CustomerCreateParams.BillingConfig.BillingProviderType.AWS_MARKETPLACE
                    )
                    .awsProductCode("aws_product_code")
                    .awsRegion(CustomerCreateParams.BillingConfig.AwsRegion.AF_SOUTH_1)
                    .stripeCollectionMethod(
                        CustomerCreateParams.BillingConfig.StripeCollectionMethod
                            .CHARGE_AUTOMATICALLY
                    )
                    .build()
            )
        assertThat(body.customFields())
            .isEqualTo(
                CustomerCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.externalId()).isEqualTo("x")
        assertThat(body.ingestAliases()).isEqualTo(listOf("team@example.com"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CustomerCreateParams.builder().name("Example, Inc.").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("Example, Inc.")
    }
}
