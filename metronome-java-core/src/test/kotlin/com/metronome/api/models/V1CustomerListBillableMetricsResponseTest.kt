// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerListBillableMetricsResponseTest {

    @Test
    fun createV1CustomerListBillableMetricsResponse() {
        val v1CustomerListBillableMetricsResponse =
            V1CustomerListBillableMetricsResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .aggregate("aggregate")
                .addAggregateKey("string")
                .aggregationKey("aggregation_key")
                .aggregationType(V1CustomerListBillableMetricsResponse.AggregationType.COUNT)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customFields(
                    V1CustomerListBillableMetricsResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .eventTypeFilter(
                    EventTypeFilter.builder().addInValue("string").addNotInValue("string").build()
                )
                .filter(
                    V1CustomerListBillableMetricsResponse.Filter.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addGroupBy("string")
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
        assertThat(v1CustomerListBillableMetricsResponse).isNotNull
        assertThat(v1CustomerListBillableMetricsResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1CustomerListBillableMetricsResponse.name()).isEqualTo("name")
        assertThat(v1CustomerListBillableMetricsResponse.aggregate()).contains("aggregate")
        assertThat(v1CustomerListBillableMetricsResponse.aggregateKeys().get())
            .containsExactly("string")
        assertThat(v1CustomerListBillableMetricsResponse.aggregationKey())
            .contains("aggregation_key")
        assertThat(v1CustomerListBillableMetricsResponse.aggregationType())
            .contains(V1CustomerListBillableMetricsResponse.AggregationType.COUNT)
        assertThat(v1CustomerListBillableMetricsResponse.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1CustomerListBillableMetricsResponse.customFields())
            .contains(
                V1CustomerListBillableMetricsResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(v1CustomerListBillableMetricsResponse.eventTypeFilter())
            .contains(
                EventTypeFilter.builder().addInValue("string").addNotInValue("string").build()
            )
        assertThat(v1CustomerListBillableMetricsResponse.filter())
            .contains(
                V1CustomerListBillableMetricsResponse.Filter.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(v1CustomerListBillableMetricsResponse.groupBy().get()).containsExactly("string")
        assertThat(v1CustomerListBillableMetricsResponse.groupKeys().get())
            .containsExactly(listOf("string"))
        assertThat(v1CustomerListBillableMetricsResponse.propertyFilters().get())
            .containsExactly(
                PropertyFilter.builder()
                    .name("name")
                    .exists(true)
                    .addInValue("string")
                    .addNotInValue("string")
                    .build()
            )
        assertThat(v1CustomerListBillableMetricsResponse.sql()).contains("sql")
    }
}
