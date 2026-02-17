// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CreditGrantListResponseTest {

    @Test
    fun createV1CreditGrantListResponse() {
        val v1CreditGrantListResponse =
            V1CreditGrantListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .balance(
                    V1CreditGrantListResponse.Balance.builder()
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .excludingPending(0.0)
                        .includingPending(0.0)
                        .build()
                )
                .customFields(
                    V1CreditGrantListResponse.CustomFields.builder()
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
                    V1CreditGrantListResponse.GrantAmount.builder()
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
                    V1CreditGrantListResponse.PaidAmount.builder()
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
                .addProduct(
                    V1CreditGrantListResponse.Product.builder().id("id").name("name").build()
                )
                .reason("reason")
                .uniquenessKey("x")
                .build()
        assertThat(v1CreditGrantListResponse).isNotNull
        assertThat(v1CreditGrantListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1CreditGrantListResponse.balance())
            .isEqualTo(
                V1CreditGrantListResponse.Balance.builder()
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .excludingPending(0.0)
                    .includingPending(0.0)
                    .build()
            )
        assertThat(v1CreditGrantListResponse.customFields())
            .isEqualTo(
                V1CreditGrantListResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(v1CreditGrantListResponse.customerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1CreditGrantListResponse.deductions())
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
        assertThat(v1CreditGrantListResponse.effectiveAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1CreditGrantListResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1CreditGrantListResponse.grantAmount())
            .isEqualTo(
                V1CreditGrantListResponse.GrantAmount.builder()
                    .amount(0.0)
                    .creditType(
                        CreditTypeData.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .build()
            )
        assertThat(v1CreditGrantListResponse.name()).isEqualTo("name")
        assertThat(v1CreditGrantListResponse.paidAmount())
            .isEqualTo(
                V1CreditGrantListResponse.PaidAmount.builder()
                    .amount(0.0)
                    .creditType(
                        CreditTypeData.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .build()
            )
        assertThat(v1CreditGrantListResponse.pendingDeductions())
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
        assertThat(v1CreditGrantListResponse.priority()).isEqualTo(0.0)
        assertThat(v1CreditGrantListResponse.creditGrantType()).contains("credit_grant_type")
        assertThat(v1CreditGrantListResponse.invoiceId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1CreditGrantListResponse.products().get())
            .containsExactly(
                V1CreditGrantListResponse.Product.builder().id("id").name("name").build()
            )
        assertThat(v1CreditGrantListResponse.reason()).contains("reason")
        assertThat(v1CreditGrantListResponse.uniquenessKey()).contains("x")
    }
}
