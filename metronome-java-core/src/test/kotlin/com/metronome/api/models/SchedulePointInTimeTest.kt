// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SchedulePointInTimeTest {

    @Test
    fun createSchedulePointInTime() {
        val schedulePointInTime =
            SchedulePointInTime.builder()
                .creditType(
                    CreditTypeData.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .doNotInvoice(true)
                .addScheduleItem(
                    SchedulePointInTime.ScheduleItem.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0.0)
                        .quantity(0.0)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .unitPrice(0.0)
                        .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()
        assertThat(schedulePointInTime).isNotNull
        assertThat(schedulePointInTime.creditType())
            .contains(
                CreditTypeData.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(schedulePointInTime.doNotInvoice()).contains(true)
        assertThat(schedulePointInTime.scheduleItems().get())
            .containsExactly(
                SchedulePointInTime.ScheduleItem.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0.0)
                    .quantity(0.0)
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .unitPrice(0.0)
                    .invoiceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
