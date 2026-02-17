// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1BillableMetricRetrieveResponseTest {

    @Test
    fun createV1BillableMetricRetrieveResponse() {
        val v1BillableMetricRetrieveResponse =
            V1BillableMetricRetrieveResponse.builder()
                .data(
                    V1BillableMetricRetrieveResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .aggregationKey("aggregation_key")
                        .aggregationType(
                            V1BillableMetricRetrieveResponse.Data.AggregationType.COUNT
                        )
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customFields(
                            V1BillableMetricRetrieveResponse.Data.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .eventTypeFilter(
                            EventTypeFilter.builder()
                                .addInValue("string")
                                .addNotInValue("string")
                                .build()
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
                )
                .build()
        assertThat(v1BillableMetricRetrieveResponse).isNotNull
        assertThat(v1BillableMetricRetrieveResponse.data())
            .isEqualTo(
                V1BillableMetricRetrieveResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .aggregationKey("aggregation_key")
                    .aggregationType(V1BillableMetricRetrieveResponse.Data.AggregationType.COUNT)
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customFields(
                        V1BillableMetricRetrieveResponse.Data.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .eventTypeFilter(
                        EventTypeFilter.builder()
                            .addInValue("string")
                            .addNotInValue("string")
                            .build()
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
            )
    }
}
