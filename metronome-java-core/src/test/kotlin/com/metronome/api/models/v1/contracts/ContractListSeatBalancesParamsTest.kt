// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractListSeatBalancesParamsTest {

    @Test
    fun create() {
        ContractListSeatBalancesParams.builder()
            .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .coveringDate(OffsetDateTime.parse("2024-03-01T00:00:00.000Z"))
            .cursor("cursor")
            .effectiveBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .includeCreditsAndCommits(true)
            .includeLedgers(true)
            .limit(25L)
            .addSeatId("string")
            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addSubscriptionId("8deed800-1b7a-495d-a207-6c52bac54dc9")
            .build()
    }

    @Test
    fun body() {
        val params =
            ContractListSeatBalancesParams.builder()
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .coveringDate(OffsetDateTime.parse("2024-03-01T00:00:00.000Z"))
                .cursor("cursor")
                .effectiveBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .includeCreditsAndCommits(true)
                .includeLedgers(true)
                .limit(25L)
                .addSeatId("string")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSubscriptionId("8deed800-1b7a-495d-a207-6c52bac54dc9")
                .build()

        val body = params._body()

        assertThat(body.contractId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.coveringDate()).contains(OffsetDateTime.parse("2024-03-01T00:00:00.000Z"))
        assertThat(body.cursor()).contains("cursor")
        assertThat(body.effectiveBefore())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.includeCreditsAndCommits()).contains(true)
        assertThat(body.includeLedgers()).contains(true)
        assertThat(body.limit()).contains(25L)
        assertThat(body.seatIds().getOrNull()).containsExactly("string")
        assertThat(body.startingAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.subscriptionIds().getOrNull())
            .containsExactly("8deed800-1b7a-495d-a207-6c52bac54dc9")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContractListSeatBalancesParams.builder()
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .build()

        val body = params._body()

        assertThat(body.contractId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
    }
}
