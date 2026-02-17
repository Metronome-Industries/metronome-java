// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerRetrieveBillingConfigurationsResponseTest {

    @Test
    fun createV1CustomerRetrieveBillingConfigurationsResponse() {
        val v1CustomerRetrieveBillingConfigurationsResponse =
            V1CustomerRetrieveBillingConfigurationsResponse.builder()
                .addData(
                    V1CustomerRetrieveBillingConfigurationsResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingProvider(
                            V1CustomerRetrieveBillingConfigurationsResponse.Data.BillingProvider
                                .AWS_MARKETPLACE
                        )
                        .configuration(
                            V1CustomerRetrieveBillingConfigurationsResponse.Data.Configuration
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .deliveryMethod(
                            V1CustomerRetrieveBillingConfigurationsResponse.Data.DeliveryMethod
                                .DIRECT_TO_BILLING_PROVIDER
                        )
                        .deliveryMethodConfiguration(
                            V1CustomerRetrieveBillingConfigurationsResponse.Data
                                .DeliveryMethodConfiguration
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()
        assertThat(v1CustomerRetrieveBillingConfigurationsResponse).isNotNull
        assertThat(v1CustomerRetrieveBillingConfigurationsResponse.data())
            .containsExactly(
                V1CustomerRetrieveBillingConfigurationsResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .billingProvider(
                        V1CustomerRetrieveBillingConfigurationsResponse.Data.BillingProvider
                            .AWS_MARKETPLACE
                    )
                    .configuration(
                        V1CustomerRetrieveBillingConfigurationsResponse.Data.Configuration.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .deliveryMethod(
                        V1CustomerRetrieveBillingConfigurationsResponse.Data.DeliveryMethod
                            .DIRECT_TO_BILLING_PROVIDER
                    )
                    .deliveryMethodConfiguration(
                        V1CustomerRetrieveBillingConfigurationsResponse.Data
                            .DeliveryMethodConfiguration
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
