// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerBillingConfigCreateParamsTest {

    @Test
    fun create() {
        V1CustomerBillingConfigCreateParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .billingProviderType(
                V1CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
            )
            .billingProviderCustomerId("cus_AJ6y20bjkOOayM")
            .awsCustomerAccountId("aws_customer_account_id")
            .awsCustomerId("aws_customer_id")
            .awsProductCode("aws_product_code")
            .awsRegion(V1CustomerBillingConfigCreateParams.AwsRegion.AF_SOUTH_1)
            .stripeCollectionMethod(
                V1CustomerBillingConfigCreateParams.StripeCollectionMethod.CHARGE_AUTOMATICALLY
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CustomerBillingConfigCreateParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(
                    V1CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
                )
                .billingProviderCustomerId("cus_AJ6y20bjkOOayM")
                .awsCustomerAccountId("aws_customer_account_id")
                .awsCustomerId("aws_customer_id")
                .awsProductCode("aws_product_code")
                .awsRegion(V1CustomerBillingConfigCreateParams.AwsRegion.AF_SOUTH_1)
                .stripeCollectionMethod(
                    V1CustomerBillingConfigCreateParams.StripeCollectionMethod.CHARGE_AUTOMATICALLY
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.billingProviderCustomerId()).isEqualTo("cus_AJ6y20bjkOOayM")
        assertThat(body.awsCustomerAccountId()).contains("aws_customer_account_id")
        assertThat(body.awsCustomerId()).contains("aws_customer_id")
        assertThat(body.awsProductCode()).contains("aws_product_code")
        assertThat(body.awsRegion())
            .contains(V1CustomerBillingConfigCreateParams.AwsRegion.AF_SOUTH_1)
        assertThat(body.stripeCollectionMethod())
            .contains(
                V1CustomerBillingConfigCreateParams.StripeCollectionMethod.CHARGE_AUTOMATICALLY
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CustomerBillingConfigCreateParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(
                    V1CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
                )
                .billingProviderCustomerId("cus_AJ6y20bjkOOayM")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.billingProviderCustomerId()).isEqualTo("cus_AJ6y20bjkOOayM")
    }

    @Test
    fun getPathParam() {
        val params =
            V1CustomerBillingConfigCreateParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(
                    V1CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE
                )
                .billingProviderCustomerId("cus_AJ6y20bjkOOayM")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // path param "billingProviderType"
        assertThat(params.getPathParam(1))
            .isEqualTo(
                V1CustomerBillingConfigCreateParams.BillingProviderType.AWS_MARKETPLACE.toString()
            )
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
