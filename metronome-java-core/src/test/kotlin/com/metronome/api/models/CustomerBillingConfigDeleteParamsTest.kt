// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerBillingConfigDeleteParamsTest {

    @Test
    fun create() {
        CustomerBillingConfigDeleteParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .billingProviderType(
                CustomerBillingConfigDeleteParams.BillingProviderType.AWS_MARKETPLACE
            )
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerBillingConfigDeleteParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(
                    CustomerBillingConfigDeleteParams.BillingProviderType.AWS_MARKETPLACE
                )
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // path param "billingProviderType"
        assertThat(params.getPathParam(1))
            .isEqualTo(
                CustomerBillingConfigDeleteParams.BillingProviderType.AWS_MARKETPLACE.toString()
            )
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
