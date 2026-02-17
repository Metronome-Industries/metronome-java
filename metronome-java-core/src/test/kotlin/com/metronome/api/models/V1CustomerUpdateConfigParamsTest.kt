// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerUpdateConfigParamsTest {

    @Test
    fun create() {
        V1CustomerUpdateConfigParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .leaveStripeInvoicesInDraft(true)
            .salesforceAccountId("0015500001WO1ZiABL")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CustomerUpdateConfigParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .leaveStripeInvoicesInDraft(true)
                .salesforceAccountId("0015500001WO1ZiABL")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.leaveStripeInvoicesInDraft()).contains(true)
        assertThat(body.salesforceAccountId()).contains("0015500001WO1ZiABL")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CustomerUpdateConfigParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params =
            V1CustomerUpdateConfigParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
