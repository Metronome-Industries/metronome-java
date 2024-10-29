// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditTest {

    @Test
    fun createCredit() {
        val credit =
            Credit.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .product(
                    Credit.Product.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .type(Credit.Type.CREDIT)
                .accessSchedule(
                    ScheduleDuration.builder()
                        .scheduleItems(
                            listOf(
                                ScheduleDuration.ScheduleItem.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .amount(42.23)
                                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .creditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .applicableContractIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .applicableProductIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .applicableProductTags(listOf("string"))
                .contract(
                    Credit.Contract.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
                )
                .customFields(Credit.CustomFields.builder().build())
                .description("description")
                .ledger(
                    listOf(
                        Credit.Ledger.ofCreditSegmentStartLedgerEntry(
                            Credit.Ledger.CreditSegmentStartLedgerEntry.builder()
                                .amount(42.23)
                                .segmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .type(
                                    Credit.Ledger.CreditSegmentStartLedgerEntry.Type
                                        .CREDIT_SEGMENT_START
                                )
                                .build()
                        )
                    )
                )
                .name("name")
                .netsuiteSalesOrderId("netsuite_sales_order_id")
                .priority(42.23)
                .salesforceOpportunityId("salesforce_opportunity_id")
                .build()
        assertThat(credit).isNotNull
        assertThat(credit.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(credit.product())
            .isEqualTo(
                Credit.Product.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(credit.type()).isEqualTo(Credit.Type.CREDIT)
        assertThat(credit.accessSchedule())
            .contains(
                ScheduleDuration.builder()
                    .scheduleItems(
                        listOf(
                            ScheduleDuration.ScheduleItem.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(42.23)
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .creditType(
                        CreditTypeData.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .build()
            )
        assertThat(credit.applicableContractIds().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(credit.applicableProductIds().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(credit.applicableProductTags().get()).containsExactly("string")
        assertThat(credit.contract())
            .contains(Credit.Contract.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build())
        assertThat(credit.customFields()).contains(Credit.CustomFields.builder().build())
        assertThat(credit.description()).contains("description")
        assertThat(credit.ledger().get())
            .containsExactly(
                Credit.Ledger.ofCreditSegmentStartLedgerEntry(
                    Credit.Ledger.CreditSegmentStartLedgerEntry.builder()
                        .amount(42.23)
                        .segmentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(Credit.Ledger.CreditSegmentStartLedgerEntry.Type.CREDIT_SEGMENT_START)
                        .build()
                )
            )
        assertThat(credit.name()).contains("name")
        assertThat(credit.netsuiteSalesOrderId()).contains("netsuite_sales_order_id")
        assertThat(credit.priority()).contains(42.23)
        assertThat(credit.salesforceOpportunityId()).contains("salesforce_opportunity_id")
    }
}
