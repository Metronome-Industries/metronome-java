// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillableMetricRetrieveResponseTest {

    @Test
    fun createBillableMetricRetrieveResponse() {
        val billableMetricRetrieveResponse =
            BillableMetricRetrieveResponse.builder()
                .data(
                    BillableMetricRetrieveResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .aggregationKey("aggregation_key")
                        .aggregationType(BillableMetricRetrieveResponse.Data.AggregationType.COUNT)
                        .customFields(
                            BillableMetricRetrieveResponse.Data.CustomFields.builder().build()
                        )
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
                )
                .build()
        assertThat(billableMetricRetrieveResponse).isNotNull
        assertThat(billableMetricRetrieveResponse.data())
            .isEqualTo(
                BillableMetricRetrieveResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .aggregationKey("aggregation_key")
                    .aggregationType(BillableMetricRetrieveResponse.Data.AggregationType.COUNT)
                    .customFields(
                        BillableMetricRetrieveResponse.Data.CustomFields.builder().build()
                    )
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
            )
    }
}
