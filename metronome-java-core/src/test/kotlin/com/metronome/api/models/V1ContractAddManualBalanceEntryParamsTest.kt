// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractAddManualBalanceEntryParamsTest {

    @Test
    fun create() {
        V1ContractAddManualBalanceEntryParams.builder()
            .id("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
            .amount(-1000.0)
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .reason("Reason for entry")
            .segmentId("66368e29-3f97-4d15-a6e9-120897f0070a")
            .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .perGroupAmounts(
                V1ContractAddManualBalanceEntryParams.PerGroupAmounts.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            V1ContractAddManualBalanceEntryParams.builder()
                .id("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                .amount(-1000.0)
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .reason("Reason for entry")
                .segmentId("66368e29-3f97-4d15-a6e9-120897f0070a")
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .perGroupAmounts(
                    V1ContractAddManualBalanceEntryParams.PerGroupAmounts.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.id()).isEqualTo("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
        assertThat(body.amount()).isEqualTo(-1000.0)
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.reason()).isEqualTo("Reason for entry")
        assertThat(body.segmentId()).isEqualTo("66368e29-3f97-4d15-a6e9-120897f0070a")
        assertThat(body.contractId()).contains("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.perGroupAmounts())
            .contains(
                V1ContractAddManualBalanceEntryParams.PerGroupAmounts.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.timestamp()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1ContractAddManualBalanceEntryParams.builder()
                .id("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
                .amount(-1000.0)
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .reason("Reason for entry")
                .segmentId("66368e29-3f97-4d15-a6e9-120897f0070a")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.id()).isEqualTo("6162d87b-e5db-4a33-b7f2-76ce6ead4e85")
        assertThat(body.amount()).isEqualTo(-1000.0)
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.reason()).isEqualTo("Reason for entry")
        assertThat(body.segmentId()).isEqualTo("66368e29-3f97-4d15-a6e9-120897f0070a")
    }
}
