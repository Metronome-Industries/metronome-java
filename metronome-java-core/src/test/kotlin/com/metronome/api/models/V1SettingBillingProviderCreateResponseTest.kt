// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1SettingBillingProviderCreateResponseTest {

    @Test
    fun createV1SettingBillingProviderCreateResponse() {
        val v1SettingBillingProviderCreateResponse =
            V1SettingBillingProviderCreateResponse.builder()
                .data(
                    V1SettingBillingProviderCreateResponse.Data.builder()
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()
        assertThat(v1SettingBillingProviderCreateResponse).isNotNull
        assertThat(v1SettingBillingProviderCreateResponse.data())
            .isEqualTo(
                V1SettingBillingProviderCreateResponse.Data.builder()
                    .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
