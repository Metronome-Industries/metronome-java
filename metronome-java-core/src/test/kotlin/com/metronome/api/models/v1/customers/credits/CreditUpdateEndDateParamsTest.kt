// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.credits

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditUpdateEndDateParamsTest {

    @Test
    fun create() {
        CreditUpdateEndDateParams.builder()
            .accessEndingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
            .creditId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .build()
    }

    @Test
    fun body() {
        val params =
            CreditUpdateEndDateParams.builder()
                .accessEndingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                .creditId("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .build()

        val body = params._body()

        assertThat(body.accessEndingBefore())
            .isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
        assertThat(body.creditId()).isEqualTo("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
    }
}
