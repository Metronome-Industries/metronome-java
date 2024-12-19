// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerBillingConfigCreateParamsTest {

    @Test
    fun createCustomerBillingConfigCreateParams() {
        CustomerBillingConfigCreateParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .billingProviderType(
                CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
            )
            .billingProviderCustomerId("cus_AJ6y20bjkOOayM")
            .awsProductCode("aws_product_code")
            .awsRegion(CustomerBillingConfigCreateParams.AwsRegion.AF_SOUTH_1)
            .stripeCollectionMethod(
                CustomerBillingConfigCreateParams.StripeCollectionMethod.CHARGE_AUTOMATICALLY
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomerBillingConfigCreateParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(
                    CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
                )
                .billingProviderCustomerId("cus_AJ6y20bjkOOayM")
                .awsProductCode("aws_product_code")
                .awsRegion(CustomerBillingConfigCreateParams.AwsRegion.AF_SOUTH_1)
                .stripeCollectionMethod(
                    CustomerBillingConfigCreateParams.StripeCollectionMethod.CHARGE_AUTOMATICALLY
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.billingProviderCustomerId()).isEqualTo("cus_AJ6y20bjkOOayM")
        assertThat(body.awsProductCode()).isEqualTo("aws_product_code")
        assertThat(body.awsRegion())
            .isEqualTo(CustomerBillingConfigCreateParams.AwsRegion.AF_SOUTH_1)
        assertThat(body.stripeCollectionMethod())
            .isEqualTo(
                CustomerBillingConfigCreateParams.StripeCollectionMethod.CHARGE_AUTOMATICALLY
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomerBillingConfigCreateParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(
                    CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
                )
                .billingProviderCustomerId("cus_AJ6y20bjkOOayM")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.billingProviderCustomerId()).isEqualTo("cus_AJ6y20bjkOOayM")
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerBillingConfigCreateParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(
                    CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
                )
                .billingProviderCustomerId("cus_AJ6y20bjkOOayM")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // path param "billingProviderType"
        assertThat(params.getPathParam(1))
            .isEqualTo(
                CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE.toString()
            )
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
