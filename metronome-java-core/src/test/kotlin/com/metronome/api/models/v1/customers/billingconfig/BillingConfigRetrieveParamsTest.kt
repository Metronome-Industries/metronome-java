// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.billingconfig

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingConfigRetrieveParamsTest {

    @Test
    fun create() {
        BillingConfigRetrieveParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .billingProviderType(BillingConfigRetrieveParams.BillingProviderType.STRIPE)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BillingConfigRetrieveParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .billingProviderType(BillingConfigRetrieveParams.BillingProviderType.STRIPE)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(params._pathParam(1)).isEqualTo("stripe")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
