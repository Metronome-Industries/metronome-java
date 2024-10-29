// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScheduledChargeTest {

    @Test
    fun createScheduledCharge() {
        val scheduledCharge =
            ScheduledCharge.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .product(
                    ScheduledCharge.Product.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .schedule(
                    SchedulePointInTime.builder()
                        .creditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .scheduleItems(
                            listOf(
                                SchedulePointInTime.ScheduleItem.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .amount(42.23)
                                    .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .quantity(42.23)
                                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .unitPrice(42.23)
                                    .build()
                            )
                        )
                        .build()
                )
                .customFields(ScheduledCharge.CustomFields.builder().build())
                .name("x")
                .netsuiteSalesOrderId("netsuite_sales_order_id")
                .build()
        assertThat(scheduledCharge).isNotNull
        assertThat(scheduledCharge.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(scheduledCharge.product())
            .isEqualTo(
                ScheduledCharge.Product.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(scheduledCharge.schedule())
            .isEqualTo(
                SchedulePointInTime.builder()
                    .creditType(
                        CreditTypeData.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .scheduleItems(
                        listOf(
                            SchedulePointInTime.ScheduleItem.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(42.23)
                                .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .quantity(42.23)
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .unitPrice(42.23)
                                .build()
                        )
                    )
                    .build()
            )
        assertThat(scheduledCharge.customFields())
            .contains(ScheduledCharge.CustomFields.builder().build())
        assertThat(scheduledCharge.name()).contains("x")
        assertThat(scheduledCharge.netsuiteSalesOrderId()).contains("netsuite_sales_order_id")
    }
}
