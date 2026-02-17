// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1SettingBillingProviderCreateParamsTest {

    @Test
    fun create() {
        V1SettingBillingProviderCreateParams.builder()
            .billingProvider(V1SettingBillingProviderCreateParams.BillingProvider.AWS_MARKETPLACE)
            .configuration(
                V1SettingBillingProviderCreateParams.Configuration.builder()
                    .putAdditionalProperty("aws_external_id", JsonValue.from("bar"))
                    .putAdditionalProperty("aws_iam_role_arn", JsonValue.from("bar"))
                    .build()
            )
            .deliveryMethod(
                V1SettingBillingProviderCreateParams.DeliveryMethod.DIRECT_TO_BILLING_PROVIDER
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            V1SettingBillingProviderCreateParams.builder()
                .billingProvider(
                    V1SettingBillingProviderCreateParams.BillingProvider.AWS_MARKETPLACE
                )
                .configuration(
                    V1SettingBillingProviderCreateParams.Configuration.builder()
                        .putAdditionalProperty("aws_external_id", JsonValue.from("bar"))
                        .putAdditionalProperty("aws_iam_role_arn", JsonValue.from("bar"))
                        .build()
                )
                .deliveryMethod(
                    V1SettingBillingProviderCreateParams.DeliveryMethod.DIRECT_TO_BILLING_PROVIDER
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.billingProvider())
            .isEqualTo(V1SettingBillingProviderCreateParams.BillingProvider.AWS_MARKETPLACE)
        assertThat(body.configuration())
            .isEqualTo(
                V1SettingBillingProviderCreateParams.Configuration.builder()
                    .putAdditionalProperty("aws_external_id", JsonValue.from("bar"))
                    .putAdditionalProperty("aws_iam_role_arn", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.deliveryMethod())
            .isEqualTo(
                V1SettingBillingProviderCreateParams.DeliveryMethod.DIRECT_TO_BILLING_PROVIDER
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1SettingBillingProviderCreateParams.builder()
                .billingProvider(
                    V1SettingBillingProviderCreateParams.BillingProvider.AWS_MARKETPLACE
                )
                .configuration(
                    V1SettingBillingProviderCreateParams.Configuration.builder()
                        .putAdditionalProperty("aws_external_id", JsonValue.from("bar"))
                        .putAdditionalProperty("aws_iam_role_arn", JsonValue.from("bar"))
                        .build()
                )
                .deliveryMethod(
                    V1SettingBillingProviderCreateParams.DeliveryMethod.DIRECT_TO_BILLING_PROVIDER
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.billingProvider())
            .isEqualTo(V1SettingBillingProviderCreateParams.BillingProvider.AWS_MARKETPLACE)
        assertThat(body.configuration())
            .isEqualTo(
                V1SettingBillingProviderCreateParams.Configuration.builder()
                    .putAdditionalProperty("aws_external_id", JsonValue.from("bar"))
                    .putAdditionalProperty("aws_iam_role_arn", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.deliveryMethod())
            .isEqualTo(
                V1SettingBillingProviderCreateParams.DeliveryMethod.DIRECT_TO_BILLING_PROVIDER
            )
    }
}
