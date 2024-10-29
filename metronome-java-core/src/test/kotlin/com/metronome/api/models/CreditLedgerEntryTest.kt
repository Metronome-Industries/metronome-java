// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditLedgerEntryTest {

    @Test
    fun createCreditLedgerEntry() {
        val creditLedgerEntry =
            CreditLedgerEntry.builder()
                .amount(42.23)
                .createdBy("created_by")
                .creditGrantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .reason("Automated invoice deduction")
                .runningBalance(42.23)
                .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(creditLedgerEntry).isNotNull
        assertThat(creditLedgerEntry.amount()).isEqualTo(42.23)
        assertThat(creditLedgerEntry.createdBy()).isEqualTo("created_by")
        assertThat(creditLedgerEntry.creditGrantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(creditLedgerEntry.effectiveAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditLedgerEntry.reason()).isEqualTo("Automated invoice deduction")
        assertThat(creditLedgerEntry.runningBalance()).isEqualTo(42.23)
        assertThat(creditLedgerEntry.invoiceId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
