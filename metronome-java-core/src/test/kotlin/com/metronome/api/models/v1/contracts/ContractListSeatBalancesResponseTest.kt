// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractListSeatBalancesResponseTest {

    @Test
    fun create() {
        val contractListSeatBalancesResponse =
            ContractListSeatBalancesResponse.builder()
                .addData(
                    ContractListSeatBalancesResponse.Data.builder()
                        .addBalance(
                            ContractListSeatBalancesResponse.Data.Balance.builder()
                                .balance(0.0)
                                .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .startingBalance(0.0)
                                .build()
                        )
                        .seatId("seat_id")
                        .addCommit(
                            ContractListSeatBalancesResponse.Data.Commit.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .balance(0.0)
                                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addLedgerEntry(
                                    ContractListSeatBalancesResponse.Data.Commit.LedgerEntry
                                        .builder()
                                        .amount(0.0)
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .type(
                                            ContractListSeatBalancesResponse.Data.Commit.LedgerEntry
                                                .Type
                                                .PREPAID_COMMIT_SEGMENT_START
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .addCredit(
                            ContractListSeatBalancesResponse.Data.Credit.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .balance(0.0)
                                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addLedgerEntry(
                                    ContractListSeatBalancesResponse.Data.Credit.LedgerEntry
                                        .builder()
                                        .amount(0.0)
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .type(
                                            ContractListSeatBalancesResponse.Data.Credit.LedgerEntry
                                                .Type
                                                .CREDIT_SEGMENT_START
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .pagination(
                    ContractListSeatBalancesResponse.Pagination.builder()
                        .seatsAvailableForNextPage(0.0)
                        .seatsIncluded(0.0)
                        .nextPage("next_page")
                        .build()
                )
                .build()

        assertThat(contractListSeatBalancesResponse.data())
            .containsExactly(
                ContractListSeatBalancesResponse.Data.builder()
                    .addBalance(
                        ContractListSeatBalancesResponse.Data.Balance.builder()
                            .balance(0.0)
                            .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .startingBalance(0.0)
                            .build()
                    )
                    .seatId("seat_id")
                    .addCommit(
                        ContractListSeatBalancesResponse.Data.Commit.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .balance(0.0)
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addLedgerEntry(
                                ContractListSeatBalancesResponse.Data.Commit.LedgerEntry.builder()
                                    .amount(0.0)
                                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .type(
                                        ContractListSeatBalancesResponse.Data.Commit.LedgerEntry
                                            .Type
                                            .PREPAID_COMMIT_SEGMENT_START
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .addCredit(
                        ContractListSeatBalancesResponse.Data.Credit.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .balance(0.0)
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addLedgerEntry(
                                ContractListSeatBalancesResponse.Data.Credit.LedgerEntry.builder()
                                    .amount(0.0)
                                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .type(
                                        ContractListSeatBalancesResponse.Data.Credit.LedgerEntry
                                            .Type
                                            .CREDIT_SEGMENT_START
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(contractListSeatBalancesResponse.pagination())
            .isEqualTo(
                ContractListSeatBalancesResponse.Pagination.builder()
                    .seatsAvailableForNextPage(0.0)
                    .seatsIncluded(0.0)
                    .nextPage("next_page")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contractListSeatBalancesResponse =
            ContractListSeatBalancesResponse.builder()
                .addData(
                    ContractListSeatBalancesResponse.Data.builder()
                        .addBalance(
                            ContractListSeatBalancesResponse.Data.Balance.builder()
                                .balance(0.0)
                                .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .startingBalance(0.0)
                                .build()
                        )
                        .seatId("seat_id")
                        .addCommit(
                            ContractListSeatBalancesResponse.Data.Commit.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .balance(0.0)
                                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addLedgerEntry(
                                    ContractListSeatBalancesResponse.Data.Commit.LedgerEntry
                                        .builder()
                                        .amount(0.0)
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .type(
                                            ContractListSeatBalancesResponse.Data.Commit.LedgerEntry
                                                .Type
                                                .PREPAID_COMMIT_SEGMENT_START
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .addCredit(
                            ContractListSeatBalancesResponse.Data.Credit.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .balance(0.0)
                                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addLedgerEntry(
                                    ContractListSeatBalancesResponse.Data.Credit.LedgerEntry
                                        .builder()
                                        .amount(0.0)
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .type(
                                            ContractListSeatBalancesResponse.Data.Credit.LedgerEntry
                                                .Type
                                                .CREDIT_SEGMENT_START
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .pagination(
                    ContractListSeatBalancesResponse.Pagination.builder()
                        .seatsAvailableForNextPage(0.0)
                        .seatsIncluded(0.0)
                        .nextPage("next_page")
                        .build()
                )
                .build()

        val roundtrippedContractListSeatBalancesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contractListSeatBalancesResponse),
                jacksonTypeRef<ContractListSeatBalancesResponse>(),
            )

        assertThat(roundtrippedContractListSeatBalancesResponse)
            .isEqualTo(contractListSeatBalancesResponse)
    }
}
