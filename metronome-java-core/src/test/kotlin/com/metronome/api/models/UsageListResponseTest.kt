// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageListResponseTest {

    @Test
    fun createUsageListResponse() {
        val usageListResponse =
            UsageListResponse.builder()
                .data(
                    listOf(
                        UsageListResponse.Data.builder()
                            .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .billableMetricName("billable_metric_name")
                            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .endTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .value(0.0)
                            .groups(UsageListResponse.Data.Groups.builder().build())
                            .build()
                    )
                )
                .nextPage("next_page")
                .build()
        assertThat(usageListResponse).isNotNull
        assertThat(usageListResponse.data())
            .containsExactly(
                UsageListResponse.Data.builder()
                    .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .billableMetricName("billable_metric_name")
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .value(0.0)
                    .groups(UsageListResponse.Data.Groups.builder().build())
                    .build()
            )
        assertThat(usageListResponse.nextPage()).contains("next_page")
    }
}
