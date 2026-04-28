// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.billablemetrics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.EventTypeFilter
import com.metronome.api.models.PropertyFilter
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillableMetricListResponseTest {

    @Test
    fun create() {
        val billableMetricListResponse =
            BillableMetricListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .aggregationKey("aggregation_key")
                .aggregationType(BillableMetricListResponse.AggregationType.COUNT)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customFields(
                    BillableMetricListResponse.CustomFields.builder()
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

        assertThat(billableMetricListResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(billableMetricListResponse.name()).isEqualTo("name")
        assertThat(billableMetricListResponse.aggregationKey()).contains("aggregation_key")
        assertThat(billableMetricListResponse.aggregationType())
            .contains(BillableMetricListResponse.AggregationType.COUNT)
        assertThat(billableMetricListResponse.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(billableMetricListResponse.customFields())
            .contains(
                BillableMetricListResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(billableMetricListResponse.eventTypeFilter())
            .contains(
                EventTypeFilter.builder().addInValue("string").addNotInValue("string").build()
            )
        assertThat(billableMetricListResponse.groupKeys().getOrNull())
            .containsExactly(listOf("string"))
        assertThat(billableMetricListResponse.propertyFilters().getOrNull())
            .containsExactly(
                PropertyFilter.builder()
                    .name("name")
                    .exists(true)
                    .addInValue("string")
                    .addNotInValue("string")
                    .build()
            )
        assertThat(billableMetricListResponse.sql()).contains("sql")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billableMetricListResponse =
            BillableMetricListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .aggregationKey("aggregation_key")
                .aggregationType(BillableMetricListResponse.AggregationType.COUNT)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customFields(
                    BillableMetricListResponse.CustomFields.builder()
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

        val roundtrippedBillableMetricListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billableMetricListResponse),
                jacksonTypeRef<BillableMetricListResponse>(),
            )

        assertThat(roundtrippedBillableMetricListResponse).isEqualTo(billableMetricListResponse)
    }
}
