// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerBillingConfigCreateParamsTest {

    @Test
    fun createCustomerBillingConfigCreateParams() {
        CustomerBillingConfigCreateParams.builder()
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .billingProviderType(
                CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
            )
            .billingProviderCustomerId("billing_provider_customer_id")
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
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .billingProviderType(
                    CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
                )
                .billingProviderCustomerId("billing_provider_customer_id")
                .awsProductCode("aws_product_code")
                .awsRegion(CustomerBillingConfigCreateParams.AwsRegion.AF_SOUTH_1)
                .stripeCollectionMethod(
                    CustomerBillingConfigCreateParams.StripeCollectionMethod.CHARGE_AUTOMATICALLY
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.billingProviderCustomerId()).isEqualTo("billing_provider_customer_id")
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
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .billingProviderType(
                    CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
                )
                .billingProviderCustomerId("billing_provider_customer_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.billingProviderCustomerId()).isEqualTo("billing_provider_customer_id")
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerBillingConfigCreateParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .billingProviderType(
                    CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
                )
                .billingProviderCustomerId("billing_provider_customer_id")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // path param "billingProviderType"
        assertThat(params.getPathParam(1))
            .isEqualTo(
                CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE.toString()
            )
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
