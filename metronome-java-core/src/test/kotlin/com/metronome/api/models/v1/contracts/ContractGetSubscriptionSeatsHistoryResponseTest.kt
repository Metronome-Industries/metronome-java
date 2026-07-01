// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractGetSubscriptionSeatsHistoryResponseTest {

    @Test
    fun create() {
        val contractGetSubscriptionSeatsHistoryResponse =
            ContractGetSubscriptionSeatsHistoryResponse.builder()
                .addData(
                    ContractGetSubscriptionSeatsHistoryResponse.Data.builder()
                        .addAssignedSeatId("string")
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .totalQuantity(0L)
                        .build()
                )
                .nextPage("next_page")
                .build()

        assertThat(contractGetSubscriptionSeatsHistoryResponse.data())
            .containsExactly(
                ContractGetSubscriptionSeatsHistoryResponse.Data.builder()
                    .addAssignedSeatId("string")
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .totalQuantity(0L)
                    .build()
            )
        assertThat(contractGetSubscriptionSeatsHistoryResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contractGetSubscriptionSeatsHistoryResponse =
            ContractGetSubscriptionSeatsHistoryResponse.builder()
                .addData(
                    ContractGetSubscriptionSeatsHistoryResponse.Data.builder()
                        .addAssignedSeatId("string")
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .totalQuantity(0L)
                        .build()
                )
                .nextPage("next_page")
                .build()

        val roundtrippedContractGetSubscriptionSeatsHistoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contractGetSubscriptionSeatsHistoryResponse),
                jacksonTypeRef<ContractGetSubscriptionSeatsHistoryResponse>(),
            )

        assertThat(roundtrippedContractGetSubscriptionSeatsHistoryResponse)
            .isEqualTo(contractGetSubscriptionSeatsHistoryResponse)
    }
}
