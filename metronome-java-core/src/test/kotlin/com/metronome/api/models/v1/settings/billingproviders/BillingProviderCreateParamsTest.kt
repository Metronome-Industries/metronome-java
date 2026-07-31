// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.settings.billingproviders

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingProviderCreateParamsTest {

    @Test
    fun create() {
        BillingProviderCreateParams.builder()
            .billingProvider(BillingProviderCreateParams.BillingProvider.AWS_MARKETPLACE)
            .configuration(
                BillingProviderCreateParams.Configuration.builder()
                    .putAdditionalProperty("aws_external_id", JsonValue.from("bar"))
                    .putAdditionalProperty("aws_iam_role_arn", JsonValue.from("bar"))
                    .build()
            )
            .deliveryMethod(BillingProviderCreateParams.DeliveryMethod.DIRECT_TO_BILLING_PROVIDER)
            .build()
    }

    @Test
    fun body() {
        val params =
            BillingProviderCreateParams.builder()
                .billingProvider(BillingProviderCreateParams.BillingProvider.AWS_MARKETPLACE)
                .configuration(
                    BillingProviderCreateParams.Configuration.builder()
                        .putAdditionalProperty("aws_external_id", JsonValue.from("bar"))
                        .putAdditionalProperty("aws_iam_role_arn", JsonValue.from("bar"))
                        .build()
                )
                .deliveryMethod(
                    BillingProviderCreateParams.DeliveryMethod.DIRECT_TO_BILLING_PROVIDER
                )
                .build()

        val body = params._body()

        assertThat(body.billingProvider())
            .isEqualTo(BillingProviderCreateParams.BillingProvider.AWS_MARKETPLACE)
        assertThat(body.configuration())
            .isEqualTo(
                BillingProviderCreateParams.Configuration.builder()
                    .putAdditionalProperty("aws_external_id", JsonValue.from("bar"))
                    .putAdditionalProperty("aws_iam_role_arn", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.deliveryMethod())
            .isEqualTo(BillingProviderCreateParams.DeliveryMethod.DIRECT_TO_BILLING_PROVIDER)
    }
}
