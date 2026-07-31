// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.billingconfig

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingConfigCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            BillingConfigCreateParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(BillingConfigCreateParams.BillingProviderType.STRIPE)
                .billingProviderCustomerId("cus_AJ6y20bjkOOayM")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(params._pathParam(1)).isEqualTo("stripe")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.billingProviderCustomerId()).isEqualTo("cus_AJ6y20bjkOOayM")
        assertThat(body.awsCustomerAccountId()).contains("aws_customer_account_id")
        assertThat(body.awsCustomerId()).contains("aws_customer_id")
        assertThat(body.awsProductCode()).contains("aws_product_code")
        assertThat(body.awsRegion()).contains(BillingConfigCreateParams.AwsRegion.AF_SOUTH_1)
        assertThat(body.stripeCollectionMethod())
            .contains(BillingConfigCreateParams.StripeCollectionMethod.CHARGE_AUTOMATICALLY)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BillingConfigCreateParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(BillingConfigCreateParams.BillingProviderType.STRIPE)
                .billingProviderCustomerId("cus_AJ6y20bjkOOayM")
                .build()

        val body = params._body()

        assertThat(body.billingProviderCustomerId()).isEqualTo("cus_AJ6y20bjkOOayM")
    }
}
