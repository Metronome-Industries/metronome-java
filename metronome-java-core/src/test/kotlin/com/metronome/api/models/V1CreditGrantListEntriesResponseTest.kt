// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CreditGrantListEntriesResponseTest {

    @Test
    fun createV1CreditGrantListEntriesResponse() {
        val v1CreditGrantListEntriesResponse =
            V1CreditGrantListEntriesResponse.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addLedger(
                    V1CreditGrantListEntriesResponse.Ledger.builder()
                        .creditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .endingBalance(
                            V1CreditGrantListEntriesResponse.Ledger.EndingBalance.builder()
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
                            V1CreditGrantListEntriesResponse.Ledger.StartingBalance.builder()
                                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .excludingPending(0.0)
                                .includingPending(0.0)
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(v1CreditGrantListEntriesResponse).isNotNull
        assertThat(v1CreditGrantListEntriesResponse.customerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1CreditGrantListEntriesResponse.ledgers())
            .containsExactly(
                V1CreditGrantListEntriesResponse.Ledger.builder()
                    .creditType(
                        CreditTypeData.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .endingBalance(
                        V1CreditGrantListEntriesResponse.Ledger.EndingBalance.builder()
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
                        V1CreditGrantListEntriesResponse.Ledger.StartingBalance.builder()
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .excludingPending(0.0)
                            .includingPending(0.0)
                            .build()
                    )
                    .build()
            )
    }
}
