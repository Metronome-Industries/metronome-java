// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractUpdateEndDateParamsTest {

    @Test
    fun create() {
        ContractUpdateEndDateParams.builder()
            .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .allowEndingBeforeFinalizedInvoice(true)
            .endingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            ContractUpdateEndDateParams.builder()
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .allowEndingBeforeFinalizedInvoice(true)
                .endingBefore(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                .build()

        val body = params._body()

        assertThat(body.contractId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.allowEndingBeforeFinalizedInvoice()).contains(true)
        assertThat(body.endingBefore()).contains(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContractUpdateEndDateParams.builder()
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .build()

        val body = params._body()

        assertThat(body.contractId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
    }
}
