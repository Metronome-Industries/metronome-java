// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
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
                .addAggregateKey("string")
                .aggregationKey("aggregation_key")
                .aggregationType(CustomerListBillableMetricsResponse.AggregationType.COUNT)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customFields(
                    CustomerListBillableMetricsResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .eventTypeFilter(
                    EventTypeFilter.builder().addInValue("string").addNotInValue("string").build()
                )
                .filter(
                    CustomerListBillableMetricsResponse.Filter.builder()
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
        assertThat(customerListBillableMetricsResponse.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerListBillableMetricsResponse.customFields())
            .contains(
                CustomerListBillableMetricsResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(customerListBillableMetricsResponse.eventTypeFilter())
            .contains(
                EventTypeFilter.builder().addInValue("string").addNotInValue("string").build()
            )
        assertThat(customerListBillableMetricsResponse.filter())
            .contains(
                CustomerListBillableMetricsResponse.Filter.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(customerListBillableMetricsResponse.groupBy().get()).containsExactly("string")
        assertThat(customerListBillableMetricsResponse.groupKeys().get())
            .containsExactly(listOf("string"))
        assertThat(customerListBillableMetricsResponse.propertyFilters().get())
            .containsExactly(
                PropertyFilter.builder()
                    .name("name")
                    .exists(true)
                    .addInValue("string")
                    .addNotInValue("string")
                    .build()
            )
        assertThat(customerListBillableMetricsResponse.sql()).contains("sql")
    }
}
