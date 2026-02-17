// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1UsageListResponseTest {

    @Test
    fun createV1UsageListResponse() {
        val v1UsageListResponse =
            V1UsageListResponse.builder()
                .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .billableMetricName("billable_metric_name")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .endTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .value(0.0)
                .groups(
                    V1UsageListResponse.Groups.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()
        assertThat(v1UsageListResponse).isNotNull
        assertThat(v1UsageListResponse.billableMetricId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1UsageListResponse.billableMetricName()).isEqualTo("billable_metric_name")
        assertThat(v1UsageListResponse.customerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1UsageListResponse.endTimestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1UsageListResponse.startTimestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1UsageListResponse.value()).contains(0.0)
        assertThat(v1UsageListResponse.groups())
            .contains(
                V1UsageListResponse.Groups.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
    }
}
