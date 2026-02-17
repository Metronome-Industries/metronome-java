// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.EventTypeFilter
import com.metronome.api.models.PropertyFilter
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListBillableMetricsPageResponseTest {

    @Test
    fun create() {
        val customerListBillableMetricsPageResponse =
            CustomerListBillableMetricsPageResponse.builder()
                .addData(
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
                            EventTypeFilter.builder()
                                .addInValue("string")
                                .addNotInValue("string")
                                .build()
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
                )
                .nextPage("next_page")
                .build()

        assertThat(customerListBillableMetricsPageResponse.data())
            .containsExactly(
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
                        EventTypeFilter.builder()
                            .addInValue("string")
                            .addNotInValue("string")
                            .build()
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
            )
        assertThat(customerListBillableMetricsPageResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListBillableMetricsPageResponse =
            CustomerListBillableMetricsPageResponse.builder()
                .addData(
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
                            EventTypeFilter.builder()
                                .addInValue("string")
                                .addNotInValue("string")
                                .build()
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
                )
                .nextPage("next_page")
                .build()

        val roundtrippedCustomerListBillableMetricsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListBillableMetricsPageResponse),
                jacksonTypeRef<CustomerListBillableMetricsPageResponse>(),
            )

        assertThat(roundtrippedCustomerListBillableMetricsPageResponse)
            .isEqualTo(customerListBillableMetricsPageResponse)
    }
}
