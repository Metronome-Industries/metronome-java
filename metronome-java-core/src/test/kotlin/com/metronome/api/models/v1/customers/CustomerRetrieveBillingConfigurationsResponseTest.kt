// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerRetrieveBillingConfigurationsResponseTest {

    @Test
    fun create() {
        val customerRetrieveBillingConfigurationsResponse =
            CustomerRetrieveBillingConfigurationsResponse.builder()
                .addData(
                    CustomerRetrieveBillingConfigurationsResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingProvider(
                            CustomerRetrieveBillingConfigurationsResponse.Data.BillingProvider
                                .AWS_MARKETPLACE
                        )
                        .configuration(
                            CustomerRetrieveBillingConfigurationsResponse.Data.Configuration
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .deliveryMethod(
                            CustomerRetrieveBillingConfigurationsResponse.Data.DeliveryMethod
                                .DIRECT_TO_BILLING_PROVIDER
                        )
                        .deliveryMethodConfiguration(
                            CustomerRetrieveBillingConfigurationsResponse.Data
                                .DeliveryMethodConfiguration
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(customerRetrieveBillingConfigurationsResponse.data())
            .containsExactly(
                CustomerRetrieveBillingConfigurationsResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .billingProvider(
                        CustomerRetrieveBillingConfigurationsResponse.Data.BillingProvider
                            .AWS_MARKETPLACE
                    )
                    .configuration(
                        CustomerRetrieveBillingConfigurationsResponse.Data.Configuration.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .deliveryMethod(
                        CustomerRetrieveBillingConfigurationsResponse.Data.DeliveryMethod
                            .DIRECT_TO_BILLING_PROVIDER
                    )
                    .deliveryMethodConfiguration(
                        CustomerRetrieveBillingConfigurationsResponse.Data
                            .DeliveryMethodConfiguration
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerRetrieveBillingConfigurationsResponse =
            CustomerRetrieveBillingConfigurationsResponse.builder()
                .addData(
                    CustomerRetrieveBillingConfigurationsResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingProvider(
                            CustomerRetrieveBillingConfigurationsResponse.Data.BillingProvider
                                .AWS_MARKETPLACE
                        )
                        .configuration(
                            CustomerRetrieveBillingConfigurationsResponse.Data.Configuration
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .deliveryMethod(
                            CustomerRetrieveBillingConfigurationsResponse.Data.DeliveryMethod
                                .DIRECT_TO_BILLING_PROVIDER
                        )
                        .deliveryMethodConfiguration(
                            CustomerRetrieveBillingConfigurationsResponse.Data
                                .DeliveryMethodConfiguration
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedCustomerRetrieveBillingConfigurationsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerRetrieveBillingConfigurationsResponse),
                jacksonTypeRef<CustomerRetrieveBillingConfigurationsResponse>(),
            )

        assertThat(roundtrippedCustomerRetrieveBillingConfigurationsResponse)
            .isEqualTo(customerRetrieveBillingConfigurationsResponse)
    }
}
