// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerBillingConfigDeleteParamsTest {

    @Test
    fun createCustomerBillingConfigDeleteParams() {
        CustomerBillingConfigDeleteParams.builder()
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .billingProviderType(
                CustomerBillingConfigDeleteParams.BillingProviderType.AWS_MARKETPLACE
            )
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerBillingConfigDeleteParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .billingProviderType(
                    CustomerBillingConfigDeleteParams.BillingProviderType.AWS_MARKETPLACE
                )
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // path param "billingProviderType"
        assertThat(params.getPathParam(1))
            .isEqualTo(
                CustomerBillingConfigDeleteParams.BillingProviderType.AWS_MARKETPLACE.toString()
            )
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
