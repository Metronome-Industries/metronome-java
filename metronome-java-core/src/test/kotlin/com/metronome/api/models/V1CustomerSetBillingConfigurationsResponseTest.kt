// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerSetBillingConfigurationsResponseTest {

    @Test
    fun createV1CustomerSetBillingConfigurationsResponse() {
        val v1CustomerSetBillingConfigurationsResponse =
            V1CustomerSetBillingConfigurationsResponse.builder()
                .addData(
                    V1CustomerSetBillingConfigurationsResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .billingProvider(
                            V1CustomerSetBillingConfigurationsResponse.Data.BillingProvider
                                .AWS_MARKETPLACE
                        )
                        .configuration(
                            V1CustomerSetBillingConfigurationsResponse.Data.Configuration.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .taxProvider(
                            V1CustomerSetBillingConfigurationsResponse.Data.TaxProvider.ANROK
                        )
                        .build()
                )
                .build()
        assertThat(v1CustomerSetBillingConfigurationsResponse).isNotNull
        assertThat(v1CustomerSetBillingConfigurationsResponse.data())
            .containsExactly(
                V1CustomerSetBillingConfigurationsResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .billingProvider(
                        V1CustomerSetBillingConfigurationsResponse.Data.BillingProvider
                            .AWS_MARKETPLACE
                    )
                    .configuration(
                        V1CustomerSetBillingConfigurationsResponse.Data.Configuration.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .taxProvider(V1CustomerSetBillingConfigurationsResponse.Data.TaxProvider.ANROK)
                    .build()
            )
    }
}
