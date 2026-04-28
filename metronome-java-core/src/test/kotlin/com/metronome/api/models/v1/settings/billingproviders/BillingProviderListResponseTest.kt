// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.settings.billingproviders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingProviderListResponseTest {

    @Test
    fun create() {
        val billingProviderListResponse =
            BillingProviderListResponse.builder()
                .addData(
                    BillingProviderListResponse.Data.builder()
                        .billingProvider(
                            BillingProviderListResponse.Data.BillingProvider.AWS_MARKETPLACE
                        )
                        .deliveryMethod(
                            BillingProviderListResponse.Data.DeliveryMethod
                                .DIRECT_TO_BILLING_PROVIDER
                        )
                        .deliveryMethodConfiguration(
                            BillingProviderListResponse.Data.DeliveryMethodConfiguration.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .nextPage("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(billingProviderListResponse.data())
            .containsExactly(
                BillingProviderListResponse.Data.builder()
                    .billingProvider(
                        BillingProviderListResponse.Data.BillingProvider.AWS_MARKETPLACE
                    )
                    .deliveryMethod(
                        BillingProviderListResponse.Data.DeliveryMethod.DIRECT_TO_BILLING_PROVIDER
                    )
                    .deliveryMethodConfiguration(
                        BillingProviderListResponse.Data.DeliveryMethodConfiguration.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(billingProviderListResponse.nextPage())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingProviderListResponse =
            BillingProviderListResponse.builder()
                .addData(
                    BillingProviderListResponse.Data.builder()
                        .billingProvider(
                            BillingProviderListResponse.Data.BillingProvider.AWS_MARKETPLACE
                        )
                        .deliveryMethod(
                            BillingProviderListResponse.Data.DeliveryMethod
                                .DIRECT_TO_BILLING_PROVIDER
                        )
                        .deliveryMethodConfiguration(
                            BillingProviderListResponse.Data.DeliveryMethodConfiguration.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .nextPage("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedBillingProviderListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingProviderListResponse),
                jacksonTypeRef<BillingProviderListResponse>(),
            )

        assertThat(roundtrippedBillingProviderListResponse).isEqualTo(billingProviderListResponse)
    }
}
