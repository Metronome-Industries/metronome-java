// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerCreateParamsTest {

    @Test
    fun create() {
        V1CustomerCreateParams.builder()
            .name("Example, Inc.")
            .billingConfig(
                V1CustomerCreateParams.BillingConfig.builder()
                    .billingProviderCustomerId("billing_provider_customer_id")
                    .billingProviderType(
                        V1CustomerCreateParams.BillingConfig.BillingProviderType.AWS_MARKETPLACE
                    )
                    .awsCustomerAccountId("aws_customer_account_id")
                    .awsCustomerId("aws_customer_id")
                    .awsIsSubscriptionProduct(true)
                    .awsProductCode("aws_product_code")
                    .awsRegion(V1CustomerCreateParams.BillingConfig.AwsRegion.AF_SOUTH_1)
                    .stripeCollectionMethod(
                        V1CustomerCreateParams.BillingConfig.StripeCollectionMethod
                            .CHARGE_AUTOMATICALLY
                    )
                    .build()
            )
            .customFields(
                V1CustomerCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .addCustomerBillingProviderConfiguration(
                V1CustomerCreateParams.CustomerBillingProviderConfiguration.builder()
                    .billingProvider(
                        V1CustomerCreateParams.CustomerBillingProviderConfiguration.BillingProvider
                            .AWS_MARKETPLACE
                    )
                    .configuration(
                        V1CustomerCreateParams.CustomerBillingProviderConfiguration.Configuration
                            .builder()
                            .putAdditionalProperty("stripe_customer_id", JsonValue.from("bar"))
                            .putAdditionalProperty(
                                "stripe_collection_method",
                                JsonValue.from("bar"),
                            )
                            .build()
                    )
                    .deliveryMethod(
                        V1CustomerCreateParams.CustomerBillingProviderConfiguration.DeliveryMethod
                            .DIRECT_TO_BILLING_PROVIDER
                    )
                    .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .taxProvider(
                        V1CustomerCreateParams.CustomerBillingProviderConfiguration.TaxProvider
                            .ANROK
                    )
                    .build()
            )
            .addCustomerRevenueSystemConfiguration(
                V1CustomerCreateParams.CustomerRevenueSystemConfiguration.builder()
                    .provider(
                        V1CustomerCreateParams.CustomerRevenueSystemConfiguration.Provider.NETSUITE
                    )
                    .configuration(
                        V1CustomerCreateParams.CustomerRevenueSystemConfiguration.Configuration
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .deliveryMethod(
                        V1CustomerCreateParams.CustomerRevenueSystemConfiguration.DeliveryMethod
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
            V1CustomerCreateParams.builder()
                .name("Example, Inc.")
                .billingConfig(
                    V1CustomerCreateParams.BillingConfig.builder()
                        .billingProviderCustomerId("billing_provider_customer_id")
                        .billingProviderType(
                            V1CustomerCreateParams.BillingConfig.BillingProviderType.AWS_MARKETPLACE
                        )
                        .awsCustomerAccountId("aws_customer_account_id")
                        .awsCustomerId("aws_customer_id")
                        .awsIsSubscriptionProduct(true)
                        .awsProductCode("aws_product_code")
                        .awsRegion(V1CustomerCreateParams.BillingConfig.AwsRegion.AF_SOUTH_1)
                        .stripeCollectionMethod(
                            V1CustomerCreateParams.BillingConfig.StripeCollectionMethod
                                .CHARGE_AUTOMATICALLY
                        )
                        .build()
                )
                .customFields(
                    V1CustomerCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addCustomerBillingProviderConfiguration(
                    V1CustomerCreateParams.CustomerBillingProviderConfiguration.builder()
                        .billingProvider(
                            V1CustomerCreateParams.CustomerBillingProviderConfiguration
                                .BillingProvider
                                .AWS_MARKETPLACE
                        )
                        .configuration(
                            V1CustomerCreateParams.CustomerBillingProviderConfiguration
                                .Configuration
                                .builder()
                                .putAdditionalProperty("stripe_customer_id", JsonValue.from("bar"))
                                .putAdditionalProperty(
                                    "stripe_collection_method",
                                    JsonValue.from("bar"),
                                )
                                .build()
                        )
                        .deliveryMethod(
                            V1CustomerCreateParams.CustomerBillingProviderConfiguration
                                .DeliveryMethod
                                .DIRECT_TO_BILLING_PROVIDER
                        )
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .taxProvider(
                            V1CustomerCreateParams.CustomerBillingProviderConfiguration.TaxProvider
                                .ANROK
                        )
                        .build()
                )
                .addCustomerRevenueSystemConfiguration(
                    V1CustomerCreateParams.CustomerRevenueSystemConfiguration.builder()
                        .provider(
                            V1CustomerCreateParams.CustomerRevenueSystemConfiguration.Provider
                                .NETSUITE
                        )
                        .configuration(
                            V1CustomerCreateParams.CustomerRevenueSystemConfiguration.Configuration
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .deliveryMethod(
                            V1CustomerCreateParams.CustomerRevenueSystemConfiguration.DeliveryMethod
                                .DIRECT_TO_BILLING_PROVIDER
                        )
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .externalId("x")
                .addIngestAlias("team@example.com")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("Example, Inc.")
        assertThat(body.billingConfig())
            .contains(
                V1CustomerCreateParams.BillingConfig.builder()
                    .billingProviderCustomerId("billing_provider_customer_id")
                    .billingProviderType(
                        V1CustomerCreateParams.BillingConfig.BillingProviderType.AWS_MARKETPLACE
                    )
                    .awsCustomerAccountId("aws_customer_account_id")
                    .awsCustomerId("aws_customer_id")
                    .awsIsSubscriptionProduct(true)
                    .awsProductCode("aws_product_code")
                    .awsRegion(V1CustomerCreateParams.BillingConfig.AwsRegion.AF_SOUTH_1)
                    .stripeCollectionMethod(
                        V1CustomerCreateParams.BillingConfig.StripeCollectionMethod
                            .CHARGE_AUTOMATICALLY
                    )
                    .build()
            )
        assertThat(body.customFields())
            .contains(
                V1CustomerCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.customerBillingProviderConfigurations())
            .contains(
                listOf(
                    V1CustomerCreateParams.CustomerBillingProviderConfiguration.builder()
                        .billingProvider(
                            V1CustomerCreateParams.CustomerBillingProviderConfiguration
                                .BillingProvider
                                .AWS_MARKETPLACE
                        )
                        .configuration(
                            V1CustomerCreateParams.CustomerBillingProviderConfiguration
                                .Configuration
                                .builder()
                                .putAdditionalProperty("stripe_customer_id", JsonValue.from("bar"))
                                .putAdditionalProperty(
                                    "stripe_collection_method",
                                    JsonValue.from("bar"),
                                )
                                .build()
                        )
                        .deliveryMethod(
                            V1CustomerCreateParams.CustomerBillingProviderConfiguration
                                .DeliveryMethod
                                .DIRECT_TO_BILLING_PROVIDER
                        )
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .taxProvider(
                            V1CustomerCreateParams.CustomerBillingProviderConfiguration.TaxProvider
                                .ANROK
                        )
                        .build()
                )
            )
        assertThat(body.customerRevenueSystemConfigurations())
            .contains(
                listOf(
                    V1CustomerCreateParams.CustomerRevenueSystemConfiguration.builder()
                        .provider(
                            V1CustomerCreateParams.CustomerRevenueSystemConfiguration.Provider
                                .NETSUITE
                        )
                        .configuration(
                            V1CustomerCreateParams.CustomerRevenueSystemConfiguration.Configuration
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .deliveryMethod(
                            V1CustomerCreateParams.CustomerRevenueSystemConfiguration.DeliveryMethod
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
        val params = V1CustomerCreateParams.builder().name("Example, Inc.").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("Example, Inc.")
    }
}
