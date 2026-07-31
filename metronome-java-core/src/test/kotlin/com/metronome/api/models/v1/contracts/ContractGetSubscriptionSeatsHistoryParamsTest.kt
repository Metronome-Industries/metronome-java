// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractGetSubscriptionSeatsHistoryParamsTest {

    @Test
    fun create() {
        ContractGetSubscriptionSeatsHistoryParams.builder()
            .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .subscriptionId("1a824d53-bde6-4d82-96d7-6347ff227d5c")
            .coveringDate(OffsetDateTime.parse("2024-01-15T00:00:00.000Z"))
            .cursor("cursor")
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(10L)
            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            ContractGetSubscriptionSeatsHistoryParams.builder()
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .subscriptionId("1a824d53-bde6-4d82-96d7-6347ff227d5c")
                .coveringDate(OffsetDateTime.parse("2024-01-15T00:00:00.000Z"))
                .cursor("cursor")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(10L)
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.contractId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.subscriptionId()).isEqualTo("1a824d53-bde6-4d82-96d7-6347ff227d5c")
        assertThat(body.coveringDate()).contains(OffsetDateTime.parse("2024-01-15T00:00:00.000Z"))
        assertThat(body.cursor()).contains("cursor")
        assertThat(body.endingBefore()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.limit()).contains(10L)
        assertThat(body.startingAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContractGetSubscriptionSeatsHistoryParams.builder()
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .subscriptionId("1a824d53-bde6-4d82-96d7-6347ff227d5c")
                .build()

        val body = params._body()

        assertThat(body.contractId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.subscriptionId()).isEqualTo("1a824d53-bde6-4d82-96d7-6347ff227d5c")
    }
}
