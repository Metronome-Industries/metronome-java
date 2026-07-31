// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerArchiveBillingConfigurationsResponseTest {

    @Test
    fun create() {
        val customerArchiveBillingConfigurationsResponse =
            CustomerArchiveBillingConfigurationsResponse.builder()
                .data(
                    CustomerArchiveBillingConfigurationsResponse.Data.builder()
                        .addCustomerBillingProviderConfigurationId(
                            "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                        )
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(customerArchiveBillingConfigurationsResponse.data())
            .isEqualTo(
                CustomerArchiveBillingConfigurationsResponse.Data.builder()
                    .addCustomerBillingProviderConfigurationId(
                        "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                    )
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerArchiveBillingConfigurationsResponse =
            CustomerArchiveBillingConfigurationsResponse.builder()
                .data(
                    CustomerArchiveBillingConfigurationsResponse.Data.builder()
                        .addCustomerBillingProviderConfigurationId(
                            "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                        )
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedCustomerArchiveBillingConfigurationsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerArchiveBillingConfigurationsResponse),
                jacksonTypeRef<CustomerArchiveBillingConfigurationsResponse>(),
            )

        assertThat(roundtrippedCustomerArchiveBillingConfigurationsResponse)
            .isEqualTo(customerArchiveBillingConfigurationsResponse)
    }
}
