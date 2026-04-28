// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerSetBillingConfigurationsResponseTest {

    @Test
    fun create() {
        val customerSetBillingConfigurationsResponse =
            CustomerSetBillingConfigurationsResponse.builder()
                .addData(
                    CustomerSetBillingConfigurationsResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .billingProvider(
                            CustomerSetBillingConfigurationsResponse.Data.BillingProvider
                                .AWS_MARKETPLACE
                        )
                        .configuration(
                            CustomerSetBillingConfigurationsResponse.Data.Configuration.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .taxProvider(
                            CustomerSetBillingConfigurationsResponse.Data.TaxProvider.ANROK
                        )
                        .build()
                )
                .build()

        assertThat(customerSetBillingConfigurationsResponse.data())
            .containsExactly(
                CustomerSetBillingConfigurationsResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .billingProvider(
                        CustomerSetBillingConfigurationsResponse.Data.BillingProvider
                            .AWS_MARKETPLACE
                    )
                    .configuration(
                        CustomerSetBillingConfigurationsResponse.Data.Configuration.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .taxProvider(CustomerSetBillingConfigurationsResponse.Data.TaxProvider.ANROK)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerSetBillingConfigurationsResponse =
            CustomerSetBillingConfigurationsResponse.builder()
                .addData(
                    CustomerSetBillingConfigurationsResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .billingProvider(
                            CustomerSetBillingConfigurationsResponse.Data.BillingProvider
                                .AWS_MARKETPLACE
                        )
                        .configuration(
                            CustomerSetBillingConfigurationsResponse.Data.Configuration.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .taxProvider(
                            CustomerSetBillingConfigurationsResponse.Data.TaxProvider.ANROK
                        )
                        .build()
                )
                .build()

        val roundtrippedCustomerSetBillingConfigurationsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerSetBillingConfigurationsResponse),
                jacksonTypeRef<CustomerSetBillingConfigurationsResponse>(),
            )

        assertThat(roundtrippedCustomerSetBillingConfigurationsResponse)
            .isEqualTo(customerSetBillingConfigurationsResponse)
    }
}
