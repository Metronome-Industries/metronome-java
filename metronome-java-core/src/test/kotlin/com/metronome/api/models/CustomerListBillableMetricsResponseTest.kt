// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerListBillableMetricsResponseTest {

    @Test
    fun createCustomerListBillableMetricsResponse() {
        val customerListBillableMetricsResponse =
            CustomerListBillableMetricsResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .aggregate("aggregate")
                .aggregateKeys(listOf("string"))
                .aggregationKey("aggregation_key")
                .aggregationType(CustomerListBillableMetricsResponse.AggregationType.COUNT)
                .customFields(CustomerListBillableMetricsResponse.CustomFields.builder().build())
                .eventTypeFilter(
                    EventTypeFilter.builder()
                        .inValues(listOf("string"))
                        .notInValues(listOf("string"))
                        .build()
                )
                .filter(CustomerListBillableMetricsResponse.Filter.builder().build())
                .groupBy(listOf("string"))
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
        assertThat(customerListBillableMetricsResponse).isNotNull
        assertThat(customerListBillableMetricsResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(customerListBillableMetricsResponse.name()).isEqualTo("name")
        assertThat(customerListBillableMetricsResponse.aggregate()).contains("aggregate")
        assertThat(customerListBillableMetricsResponse.aggregateKeys().get())
            .containsExactly("string")
        assertThat(customerListBillableMetricsResponse.aggregationKey()).contains("aggregation_key")
        assertThat(customerListBillableMetricsResponse.aggregationType())
            .contains(CustomerListBillableMetricsResponse.AggregationType.COUNT)
        assertThat(customerListBillableMetricsResponse.customFields())
            .contains(CustomerListBillableMetricsResponse.CustomFields.builder().build())
        assertThat(customerListBillableMetricsResponse.eventTypeFilter())
            .contains(
                EventTypeFilter.builder()
                    .inValues(listOf("string"))
                    .notInValues(listOf("string"))
                    .build()
            )
        assertThat(customerListBillableMetricsResponse.filter())
            .contains(CustomerListBillableMetricsResponse.Filter.builder().build())
        assertThat(customerListBillableMetricsResponse.groupBy().get()).containsExactly("string")
        assertThat(customerListBillableMetricsResponse.groupKeys().get())
            .containsExactly(listOf("string"))
        assertThat(customerListBillableMetricsResponse.propertyFilters().get())
            .containsExactly(
                PropertyFilter.builder()
                    .name("name")
                    .exists(true)
                    .inValues(listOf("string"))
                    .notInValues(listOf("string"))
                    .build()
            )
        assertThat(customerListBillableMetricsResponse.sql()).contains("sql")
    }
}
