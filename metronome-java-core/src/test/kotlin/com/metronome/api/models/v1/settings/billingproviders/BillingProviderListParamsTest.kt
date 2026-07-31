// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.settings.billingproviders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingProviderListParamsTest {

    @Test
    fun create() {
        BillingProviderListParams.builder().nextPage("af26878a-de62-4a0d-9b77-3936f7c2b6d6").build()
    }

    @Test
    fun body() {
        val params =
            BillingProviderListParams.builder()
                .nextPage("af26878a-de62-4a0d-9b77-3936f7c2b6d6")
                .build()

        val body = params._body()

        assertThat(body.nextPage()).contains("af26878a-de62-4a0d-9b77-3936f7c2b6d6")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BillingProviderListParams.builder().build()

        val body = params._body()
    }
}
