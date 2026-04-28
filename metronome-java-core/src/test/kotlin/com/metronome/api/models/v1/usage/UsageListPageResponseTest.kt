// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageListPageResponseTest {

    @Test
    fun create() {
        val usageListPageResponse =
            UsageListPageResponse.builder()
                .addData(
                    UsageListResponse.builder()
                        .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .billableMetricName("billable_metric_name")
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .endTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(0.0)
                        .groups(
                            UsageListResponse.Groups.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .nextPage("next_page")
                .build()

        assertThat(usageListPageResponse.data())
            .containsExactly(
                UsageListResponse.builder()
                    .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .billableMetricName("billable_metric_name")
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .value(0.0)
                    .groups(
                        UsageListResponse.Groups.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(usageListPageResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageListPageResponse =
            UsageListPageResponse.builder()
                .addData(
                    UsageListResponse.builder()
                        .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .billableMetricName("billable_metric_name")
                        .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .endTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(0.0)
                        .groups(
                            UsageListResponse.Groups.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .nextPage("next_page")
                .build()

        val roundtrippedUsageListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageListPageResponse),
                jacksonTypeRef<UsageListPageResponse>(),
            )

        assertThat(roundtrippedUsageListPageResponse).isEqualTo(usageListPageResponse)
    }
}
