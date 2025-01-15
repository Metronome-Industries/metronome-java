// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditGrantListResponseTest {

    @Test
    fun createCreditGrantListResponse() {
        val creditGrantListResponse =
            CreditGrantListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .balance(
                    CreditGrantListResponse.Balance.builder()
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .excludingPending(0.0)
                        .includingPending(0.0)
                        .build()
                )
                .customFields(
                    CreditGrantListResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addDeduction(
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
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .grantAmount(
                    CreditGrantListResponse.GrantAmount.builder()
                        .amount(0.0)
                        .creditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .name("name")
                .paidAmount(
                    CreditGrantListResponse.PaidAmount.builder()
                        .amount(0.0)
                        .creditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .addPendingDeduction(
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
                .priority(0.0)
                .creditGrantType("credit_grant_type")
                .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addProduct(CreditGrantListResponse.Product.builder().id("id").name("name").build())
                .reason("reason")
                .uniquenessKey("x")
                .build()
        assertThat(creditGrantListResponse).isNotNull
        assertThat(creditGrantListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(creditGrantListResponse.balance())
            .isEqualTo(
                CreditGrantListResponse.Balance.builder()
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .excludingPending(0.0)
                    .includingPending(0.0)
                    .build()
            )
        assertThat(creditGrantListResponse.customFields())
            .isEqualTo(
                CreditGrantListResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(creditGrantListResponse.customerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(creditGrantListResponse.deductions())
            .containsExactly(
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
        assertThat(creditGrantListResponse.effectiveAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditGrantListResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditGrantListResponse.grantAmount())
            .isEqualTo(
                CreditGrantListResponse.GrantAmount.builder()
                    .amount(0.0)
                    .creditType(
                        CreditTypeData.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .build()
            )
        assertThat(creditGrantListResponse.name()).isEqualTo("name")
        assertThat(creditGrantListResponse.paidAmount())
            .isEqualTo(
                CreditGrantListResponse.PaidAmount.builder()
                    .amount(0.0)
                    .creditType(
                        CreditTypeData.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .build()
            )
        assertThat(creditGrantListResponse.pendingDeductions())
            .containsExactly(
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
        assertThat(creditGrantListResponse.priority()).isEqualTo(0.0)
        assertThat(creditGrantListResponse.creditGrantType()).contains("credit_grant_type")
        assertThat(creditGrantListResponse.invoiceId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(creditGrantListResponse.products().get())
            .containsExactly(
                CreditGrantListResponse.Product.builder().id("id").name("name").build()
            )
        assertThat(creditGrantListResponse.reason()).contains("reason")
        assertThat(creditGrantListResponse.uniquenessKey()).contains("x")
    }
}
