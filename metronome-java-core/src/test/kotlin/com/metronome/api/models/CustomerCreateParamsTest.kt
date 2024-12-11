// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreateParamsTest {

    @Test
    fun createCustomerCreateParams() {
        CustomerCreateParams.builder()
            .name("name")
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
            .ingestAliases(listOf("x"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomerCreateParams.builder()
                .name("name")
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
                .ingestAliases(listOf("x"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
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
        assertThat(body.ingestAliases()).isEqualTo(listOf("x"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CustomerCreateParams.builder().name("name").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
    }
}
