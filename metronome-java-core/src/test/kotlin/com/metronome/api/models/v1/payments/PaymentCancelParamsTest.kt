// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.payments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentCancelParamsTest {

    @Test
    fun create() {
        PaymentCancelParams.builder()
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .invoiceId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
            .build()
    }

    @Test
    fun body() {
        val params =
            PaymentCancelParams.builder()
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .invoiceId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.invoiceId()).isEqualTo("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
    }
}
