// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.CreditTypeData
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditGrantListEntriesPageResponseTest {

    @Test
    fun create() {
        val creditGrantListEntriesPageResponse =
            CreditGrantListEntriesPageResponse.builder()
                .addData(
                    CreditGrantListEntriesResponse.builder()
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addLedger(
                            CreditGrantListEntriesResponse.Ledger.builder()
                                .creditType(
                                    CreditTypeData.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .build()
                                )
                                .endingBalance(
                                    CreditGrantListEntriesResponse.Ledger.EndingBalance.builder()
                                        .effectiveAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .excludingPending(0.0)
                                        .includingPending(0.0)
                                        .build()
                                )
                                .addEntry(
                                    CreditLedgerEntry.builder()
                                        .amount(0.0)
                                        .createdBy("created_by")
                                        .creditGrantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .effectiveAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .reason("Automated invoice deduction")
                                        .runningBalance(0.0)
                                        .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .addPendingEntry(
                                    CreditLedgerEntry.builder()
                                        .amount(0.0)
                                        .createdBy("created_by")
                                        .creditGrantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .effectiveAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .reason("Automated invoice deduction")
                                        .runningBalance(0.0)
                                        .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .startingBalance(
                                    CreditGrantListEntriesResponse.Ledger.StartingBalance.builder()
                                        .effectiveAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .excludingPending(0.0)
                                        .includingPending(0.0)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .nextPage("next_page")
                .build()

        assertThat(creditGrantListEntriesPageResponse.data())
            .containsExactly(
                CreditGrantListEntriesResponse.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addLedger(
                        CreditGrantListEntriesResponse.Ledger.builder()
                            .creditType(
                                CreditTypeData.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("name")
                                    .build()
                            )
                            .endingBalance(
                                CreditGrantListEntriesResponse.Ledger.EndingBalance.builder()
                                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .excludingPending(0.0)
                                    .includingPending(0.0)
                                    .build()
                            )
                            .addEntry(
                                CreditLedgerEntry.builder()
                                    .amount(0.0)
                                    .createdBy("created_by")
                                    .creditGrantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .reason("Automated invoice deduction")
                                    .runningBalance(0.0)
                                    .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .addPendingEntry(
                                CreditLedgerEntry.builder()
                                    .amount(0.0)
                                    .createdBy("created_by")
                                    .creditGrantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .reason("Automated invoice deduction")
                                    .runningBalance(0.0)
                                    .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .startingBalance(
                                CreditGrantListEntriesResponse.Ledger.StartingBalance.builder()
                                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .excludingPending(0.0)
                                    .includingPending(0.0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(creditGrantListEntriesPageResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditGrantListEntriesPageResponse =
            CreditGrantListEntriesPageResponse.builder()
                .addData(
                    CreditGrantListEntriesResponse.builder()
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addLedger(
                            CreditGrantListEntriesResponse.Ledger.builder()
                                .creditType(
                                    CreditTypeData.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .build()
                                )
                                .endingBalance(
                                    CreditGrantListEntriesResponse.Ledger.EndingBalance.builder()
                                        .effectiveAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .excludingPending(0.0)
                                        .includingPending(0.0)
                                        .build()
                                )
                                .addEntry(
                                    CreditLedgerEntry.builder()
                                        .amount(0.0)
                                        .createdBy("created_by")
                                        .creditGrantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .effectiveAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .reason("Automated invoice deduction")
                                        .runningBalance(0.0)
                                        .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .addPendingEntry(
                                    CreditLedgerEntry.builder()
                                        .amount(0.0)
                                        .createdBy("created_by")
                                        .creditGrantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .effectiveAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .reason("Automated invoice deduction")
                                        .runningBalance(0.0)
                                        .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .startingBalance(
                                    CreditGrantListEntriesResponse.Ledger.StartingBalance.builder()
                                        .effectiveAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .excludingPending(0.0)
                                        .includingPending(0.0)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .nextPage("next_page")
                .build()

        val roundtrippedCreditGrantListEntriesPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditGrantListEntriesPageResponse),
                jacksonTypeRef<CreditGrantListEntriesPageResponse>(),
            )

        assertThat(roundtrippedCreditGrantListEntriesPageResponse)
            .isEqualTo(creditGrantListEntriesPageResponse)
    }
}
