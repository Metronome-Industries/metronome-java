// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.settings.billingproviders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingProviderCreateResponseTest {

    @Test
    fun create() {
        val billingProviderCreateResponse =
            BillingProviderCreateResponse.builder()
                .data(
                    BillingProviderCreateResponse.Data.builder()
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(billingProviderCreateResponse.data())
            .isEqualTo(
                BillingProviderCreateResponse.Data.builder()
                    .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingProviderCreateResponse =
            BillingProviderCreateResponse.builder()
                .data(
                    BillingProviderCreateResponse.Data.builder()
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedBillingProviderCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingProviderCreateResponse),
                jacksonTypeRef<BillingProviderCreateResponse>(),
            )

        assertThat(roundtrippedBillingProviderCreateResponse)
            .isEqualTo(billingProviderCreateResponse)
    }
}
