// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreateParamsTest {

    @Test
    fun create() {
        CustomerCreateParams.builder()
            .name("Example, Inc.")
            .billingConfig(
                CustomerCreateParams.BillingConfig.builder()
                    .billingProviderCustomerId("billing_provider_customer_id")
                    .billingProviderType(
                        CustomerCreateParams.BillingConfig.BillingProviderType.AWS_MARKETPLACE
                    )
                    .awsIsSubscriptionProduct(true)
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
            .addCustomerBillingProviderConfiguration(
                CustomerCreateParams.CustomerBillingProviderConfiguration.builder()
                    .billingProvider(
                        CustomerCreateParams.CustomerBillingProviderConfiguration.BillingProvider
                            .AWS_MARKETPLACE
                    )
                    .configuration(
                        CustomerCreateParams.CustomerBillingProviderConfiguration.Configuration
                            .builder()
                            .putAdditionalProperty("stripe_customer_id", JsonValue.from("bar"))
                            .putAdditionalProperty(
                                "stripe_collection_method",
                                JsonValue.from("bar"),
                            )
                            .build()
                    )
                    .deliveryMethod(
                        CustomerCreateParams.CustomerBillingProviderConfiguration.DeliveryMethod
                            .DIRECT_TO_BILLING_PROVIDER
                    )
                    .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .externalId("x")
            .addIngestAlias("team@example.com")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreateParams.builder()
                .name("Example, Inc.")
                .billingConfig(
                    CustomerCreateParams.BillingConfig.builder()
                        .billingProviderCustomerId("billing_provider_customer_id")
                        .billingProviderType(
                            CustomerCreateParams.BillingConfig.BillingProviderType.AWS_MARKETPLACE
                        )
                        .awsIsSubscriptionProduct(true)
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
                .addCustomerBillingProviderConfiguration(
                    CustomerCreateParams.CustomerBillingProviderConfiguration.builder()
                        .billingProvider(
                            CustomerCreateParams.CustomerBillingProviderConfiguration
                                .BillingProvider
                                .AWS_MARKETPLACE
                        )
                        .configuration(
                            CustomerCreateParams.CustomerBillingProviderConfiguration.Configuration
                                .builder()
                                .putAdditionalProperty("stripe_customer_id", JsonValue.from("bar"))
                                .putAdditionalProperty(
                                    "stripe_collection_method",
                                    JsonValue.from("bar"),
                                )
                                .build()
                        )
                        .deliveryMethod(
                            CustomerCreateParams.CustomerBillingProviderConfiguration.DeliveryMethod
                                .DIRECT_TO_BILLING_PROVIDER
                        )
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .externalId("x")
                .addIngestAlias("team@example.com")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("Example, Inc.")
        assertThat(body.billingConfig())
            .contains(
                CustomerCreateParams.BillingConfig.builder()
                    .billingProviderCustomerId("billing_provider_customer_id")
                    .billingProviderType(
                        CustomerCreateParams.BillingConfig.BillingProviderType.AWS_MARKETPLACE
                    )
                    .awsIsSubscriptionProduct(true)
                    .awsProductCode("aws_product_code")
                    .awsRegion(CustomerCreateParams.BillingConfig.AwsRegion.AF_SOUTH_1)
                    .stripeCollectionMethod(
                        CustomerCreateParams.BillingConfig.StripeCollectionMethod
                            .CHARGE_AUTOMATICALLY
                    )
                    .build()
            )
        assertThat(body.customFields())
            .contains(
                CustomerCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.customerBillingProviderConfigurations())
            .contains(
                listOf(
                    CustomerCreateParams.CustomerBillingProviderConfiguration.builder()
                        .billingProvider(
                            CustomerCreateParams.CustomerBillingProviderConfiguration
                                .BillingProvider
                                .AWS_MARKETPLACE
                        )
                        .configuration(
                            CustomerCreateParams.CustomerBillingProviderConfiguration.Configuration
                                .builder()
                                .putAdditionalProperty("stripe_customer_id", JsonValue.from("bar"))
                                .putAdditionalProperty(
                                    "stripe_collection_method",
                                    JsonValue.from("bar"),
                                )
                                .build()
                        )
                        .deliveryMethod(
                            CustomerCreateParams.CustomerBillingProviderConfiguration.DeliveryMethod
                                .DIRECT_TO_BILLING_PROVIDER
                        )
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
        assertThat(body.externalId()).contains("x")
        assertThat(body.ingestAliases()).contains(listOf("team@example.com"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerCreateParams.builder().name("Example, Inc.").build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("Example, Inc.")
    }
}
