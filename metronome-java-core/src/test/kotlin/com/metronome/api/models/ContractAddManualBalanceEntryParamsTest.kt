// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractAddManualBalanceEntryParamsTest {

    @Test
    fun createContractAddManualBalanceEntryParams() {
        ContractAddManualBalanceEntryParams.builder()
            .id("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
            .amount(-1000.0)
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .reason("Reason for entry")
            .segmentId("66368e29-3f97-4d15-a6e9-120897f0070a")
            .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ContractAddManualBalanceEntryParams.builder()
                .id("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                .amount(-1000.0)
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .reason("Reason for entry")
                .segmentId("66368e29-3f97-4d15-a6e9-120897f0070a")
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
        assertThat(body.amount()).isEqualTo(-1000.0)
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.reason()).isEqualTo("Reason for entry")
        assertThat(body.segmentId()).isEqualTo("66368e29-3f97-4d15-a6e9-120897f0070a")
        assertThat(body.contractId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.timestamp()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractAddManualBalanceEntryParams.builder()
                .id("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                .amount(-1000.0)
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .reason("Reason for entry")
                .segmentId("66368e29-3f97-4d15-a6e9-120897f0070a")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
        assertThat(body.amount()).isEqualTo(-1000.0)
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.reason()).isEqualTo("Reason for entry")
        assertThat(body.segmentId()).isEqualTo("66368e29-3f97-4d15-a6e9-120897f0070a")
    }
}
