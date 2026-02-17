// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1SettingBillingProviderListResponseTest {

    @Test
    fun createV1SettingBillingProviderListResponse() {
        val v1SettingBillingProviderListResponse =
            V1SettingBillingProviderListResponse.builder()
                .billingProvider(
                    V1SettingBillingProviderListResponse.BillingProvider.AWS_MARKETPLACE
                )
                .deliveryMethod(
                    V1SettingBillingProviderListResponse.DeliveryMethod.DIRECT_TO_BILLING_PROVIDER
                )
                .deliveryMethodConfiguration(
                    V1SettingBillingProviderListResponse.DeliveryMethodConfiguration.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(v1SettingBillingProviderListResponse).isNotNull
        assertThat(v1SettingBillingProviderListResponse.billingProvider())
            .isEqualTo(V1SettingBillingProviderListResponse.BillingProvider.AWS_MARKETPLACE)
        assertThat(v1SettingBillingProviderListResponse.deliveryMethod())
            .isEqualTo(
                V1SettingBillingProviderListResponse.DeliveryMethod.DIRECT_TO_BILLING_PROVIDER
            )
        assertThat(v1SettingBillingProviderListResponse.deliveryMethodConfiguration())
            .isEqualTo(
                V1SettingBillingProviderListResponse.DeliveryMethodConfiguration.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(v1SettingBillingProviderListResponse.deliveryMethodId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
