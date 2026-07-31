// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerUpdateConfigParamsTest {

    @Test
    fun create() {
        CustomerUpdateConfigParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .leaveStripeInvoicesInDraft(true)
            .salesforceAccountId("0015500001WO1ZiABL")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerUpdateConfigParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomerUpdateConfigParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .leaveStripeInvoicesInDraft(true)
                .salesforceAccountId("0015500001WO1ZiABL")
                .build()

        val body = params._body()

        assertThat(body.leaveStripeInvoicesInDraft()).contains(true)
        assertThat(body.salesforceAccountId()).contains("0015500001WO1ZiABL")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerUpdateConfigParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()

        val body = params._body()
    }
}
