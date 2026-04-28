// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.CreditTypeData
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditGrantListPageResponseTest {

    @Test
    fun create() {
        val creditGrantListPageResponse =
            CreditGrantListPageResponse.builder()
                .addData(
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
                        .addProduct(
                            CreditGrantListResponse.Product.builder().id("id").name("name").build()
                        )
                        .reason("reason")
                        .uniquenessKey("x")
                        .build()
                )
                .nextPage("next_page")
                .build()

        assertThat(creditGrantListPageResponse.data())
            .containsExactly(
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
                    .addProduct(
                        CreditGrantListResponse.Product.builder().id("id").name("name").build()
                    )
                    .reason("reason")
                    .uniquenessKey("x")
                    .build()
            )
        assertThat(creditGrantListPageResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditGrantListPageResponse =
            CreditGrantListPageResponse.builder()
                .addData(
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
                        .addProduct(
                            CreditGrantListResponse.Product.builder().id("id").name("name").build()
                        )
                        .reason("reason")
                        .uniquenessKey("x")
                        .build()
                )
                .nextPage("next_page")
                .build()

        val roundtrippedCreditGrantListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditGrantListPageResponse),
                jacksonTypeRef<CreditGrantListPageResponse>(),
            )

        assertThat(roundtrippedCreditGrantListPageResponse).isEqualTo(creditGrantListPageResponse)
    }
}
