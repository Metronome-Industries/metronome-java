// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillableMetricCreateParamsTest {

    @Test
    fun createBillableMetricCreateParams() {
        BillableMetricCreateParams.builder()
            .name("name")
            .aggregationKey("aggregation_key")
            .aggregationType(BillableMetricCreateParams.AggregationType.COUNT)
            .customFields(BillableMetricCreateParams.CustomFields.builder().build())
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
    }

    @Test
    fun getBody() {
        val params =
            BillableMetricCreateParams.builder()
                .name("name")
                .aggregationKey("aggregation_key")
                .aggregationType(BillableMetricCreateParams.AggregationType.COUNT)
                .customFields(BillableMetricCreateParams.CustomFields.builder().build())
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.aggregationKey()).isEqualTo("aggregation_key")
        assertThat(body.aggregationType())
            .isEqualTo(BillableMetricCreateParams.AggregationType.COUNT)
        assertThat(body.customFields())
            .isEqualTo(BillableMetricCreateParams.CustomFields.builder().build())
        assertThat(body.eventTypeFilter())
            .isEqualTo(
                EventTypeFilter.builder()
                    .inValues(listOf("string"))
                    .notInValues(listOf("string"))
                    .build()
            )
        assertThat(body.groupKeys()).isEqualTo(listOf(listOf("string")))
        assertThat(body.propertyFilters())
            .isEqualTo(
                listOf(
                    PropertyFilter.builder()
                        .name("name")
                        .exists(true)
                        .inValues(listOf("string"))
                        .notInValues(listOf("string"))
                        .build()
                )
            )
        assertThat(body.sql()).isEqualTo("sql")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = BillableMetricCreateParams.builder().name("name").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
    }
}
