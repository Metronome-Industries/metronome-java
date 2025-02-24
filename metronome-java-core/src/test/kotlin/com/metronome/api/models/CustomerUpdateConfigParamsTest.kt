// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerUpdateConfigParamsTest {

    @Test
    fun create() {
        CustomerUpdateConfigParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .leaveStripeInvoicesInDraft(true)
            .salesforceAccountId("0015500001WO1ZiABL")
            .build()
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

        assertThat(body).isNotNull
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

        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerUpdateConfigParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
