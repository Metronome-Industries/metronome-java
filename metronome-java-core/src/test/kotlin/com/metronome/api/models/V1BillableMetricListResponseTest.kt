// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1BillableMetricListResponseTest {

    @Test
    fun createV1BillableMetricListResponse() {
        val v1BillableMetricListResponse =
            V1BillableMetricListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .aggregationKey("aggregation_key")
                .aggregationType(V1BillableMetricListResponse.AggregationType.COUNT)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customFields(
                    V1BillableMetricListResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .eventTypeFilter(
                    EventTypeFilter.builder().addInValue("string").addNotInValue("string").build()
                )
                .addGroupKey(listOf("string"))
                .addPropertyFilter(
                    PropertyFilter.builder()
                        .name("name")
                        .exists(true)
                        .addInValue("string")
                        .addNotInValue("string")
                        .build()
                )
                .sql("sql")
                .build()
        assertThat(v1BillableMetricListResponse).isNotNull
        assertThat(v1BillableMetricListResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1BillableMetricListResponse.name()).isEqualTo("name")
        assertThat(v1BillableMetricListResponse.aggregationKey()).contains("aggregation_key")
        assertThat(v1BillableMetricListResponse.aggregationType())
            .contains(V1BillableMetricListResponse.AggregationType.COUNT)
        assertThat(v1BillableMetricListResponse.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1BillableMetricListResponse.customFields())
            .contains(
                V1BillableMetricListResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(v1BillableMetricListResponse.eventTypeFilter())
            .contains(
                EventTypeFilter.builder().addInValue("string").addNotInValue("string").build()
            )
        assertThat(v1BillableMetricListResponse.groupKeys().get()).containsExactly(listOf("string"))
        assertThat(v1BillableMetricListResponse.propertyFilters().get())
            .containsExactly(
                PropertyFilter.builder()
                    .name("name")
                    .exists(true)
                    .addInValue("string")
                    .addNotInValue("string")
                    .build()
            )
        assertThat(v1BillableMetricListResponse.sql()).contains("sql")
    }
}
