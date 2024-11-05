// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillableMetricListResponseTest {

    @Test
    fun createBillableMetricListResponse() {
        val billableMetricListResponse =
            BillableMetricListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .aggregationKey("aggregation_key")
                .aggregationType(BillableMetricListResponse.AggregationType.COUNT)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customFields(BillableMetricListResponse.CustomFields.builder().build())
                .eventTypeFilter(
                    EventTypeFilter.builder()
                        .inValues(listOf("string"))
                        .notInValues(listOf("string"))
                        .build()
                )
                .groupKeys(listOf(listOf("string")))
                .propertyFilters(
                    listOf(
                        PropertyFilter.builder()
                            .name("name")
                            .exists(true)
                            .inValues(listOf("string"))
                            .notInValues(listOf("string"))
                            .build()
                    )
                )
                .sql("sql")
                .build()
        assertThat(billableMetricListResponse).isNotNull
        assertThat(billableMetricListResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(billableMetricListResponse.name()).isEqualTo("name")
        assertThat(billableMetricListResponse.aggregationKey()).contains("aggregation_key")
        assertThat(billableMetricListResponse.aggregationType())
            .contains(BillableMetricListResponse.AggregationType.COUNT)
        assertThat(billableMetricListResponse.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(billableMetricListResponse.customFields())
            .contains(BillableMetricListResponse.CustomFields.builder().build())
        assertThat(billableMetricListResponse.eventTypeFilter())
            .contains(
                EventTypeFilter.builder()
                    .inValues(listOf("string"))
                    .notInValues(listOf("string"))
                    .build()
            )
        assertThat(billableMetricListResponse.groupKeys().get()).containsExactly(listOf("string"))
        assertThat(billableMetricListResponse.propertyFilters().get())
            .containsExactly(
                PropertyFilter.builder()
                    .name("name")
                    .exists(true)
                    .inValues(listOf("string"))
                    .notInValues(listOf("string"))
                    .build()
            )
        assertThat(billableMetricListResponse.sql()).contains("sql")
    }
}
