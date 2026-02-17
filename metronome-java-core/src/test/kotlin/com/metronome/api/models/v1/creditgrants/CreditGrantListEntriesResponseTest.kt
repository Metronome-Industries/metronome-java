// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.CreditTypeData
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditGrantListEntriesResponseTest {

    @Test
    fun create() {
        val creditGrantListEntriesResponse =
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

        assertThat(creditGrantListEntriesResponse.customerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(creditGrantListEntriesResponse.ledgers())
            .containsExactly(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditGrantListEntriesResponse =
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

        val roundtrippedCreditGrantListEntriesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditGrantListEntriesResponse),
                jacksonTypeRef<CreditGrantListEntriesResponse>(),
            )

        assertThat(roundtrippedCreditGrantListEntriesResponse)
            .isEqualTo(creditGrantListEntriesResponse)
    }
}
