// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.payments

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentListParamsTest {

    @Test
    fun create() {
        PaymentListParams.builder()
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .invoiceId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
            .limit(1L)
            .nextPage("next_page")
            .addStatus(PaymentStatus.PENDING)
            .addStatus(PaymentStatus.REQUIRES_INTERVENTION)
            .build()
    }

    @Test
    fun body() {
        val params =
            PaymentListParams.builder()
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .invoiceId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                .limit(1L)
                .nextPage("next_page")
                .addStatus(PaymentStatus.PENDING)
                .addStatus(PaymentStatus.REQUIRES_INTERVENTION)
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.invoiceId()).isEqualTo("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
        assertThat(body.limit()).contains(1L)
        assertThat(body.nextPage()).contains("next_page")
        assertThat(body.statuses().getOrNull())
            .containsExactly(PaymentStatus.PENDING, PaymentStatus.REQUIRES_INTERVENTION)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentListParams.builder()
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .invoiceId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.invoiceId()).isEqualTo("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
    }
}
