// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerArchiveBillingConfigurationsParamsTest {

    @Test
    fun create() {
        CustomerArchiveBillingConfigurationsParams.builder()
            .addCustomerBillingProviderConfigurationId("4db51251-61de-4bfe-b9ce-495e244f3491")
            .addCustomerBillingProviderConfigurationId("4db51251-61de-4bfe-b9ce-495e244f3491")
            .customerId("20a060d1-aa80-41d4-8bb2-4f3091b93903")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerArchiveBillingConfigurationsParams.builder()
                .addCustomerBillingProviderConfigurationId("4db51251-61de-4bfe-b9ce-495e244f3491")
                .addCustomerBillingProviderConfigurationId("4db51251-61de-4bfe-b9ce-495e244f3491")
                .customerId("20a060d1-aa80-41d4-8bb2-4f3091b93903")
                .build()

        val body = params._body()

        assertThat(body.customerBillingProviderConfigurationIds())
            .containsExactly(
                "4db51251-61de-4bfe-b9ce-495e244f3491",
                "4db51251-61de-4bfe-b9ce-495e244f3491",
            )
        assertThat(body.customerId()).isEqualTo("20a060d1-aa80-41d4-8bb2-4f3091b93903")
    }
}
