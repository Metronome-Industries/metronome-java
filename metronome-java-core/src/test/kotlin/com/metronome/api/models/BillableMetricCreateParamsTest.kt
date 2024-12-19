// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillableMetricCreateParamsTest {

    @Test
    fun createBillableMetricCreateParams() {
        BillableMetricCreateParams.builder()
            .name("CPU Hours")
            .aggregationKey("cpu_hours")
            .aggregationType(BillableMetricCreateParams.AggregationType.COUNT)
            .customFields(
                BillableMetricCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .eventTypeFilter(
                EventTypeFilter.builder()
                    .inValues(listOf("cpu_usage"))
                    .notInValues(listOf("string"))
                    .build()
            )
            .groupKeys(listOf(listOf("region"), listOf("machine_type")))
            .propertyFilters(
                listOf(
                    PropertyFilter.builder()
                        .name("cpu_hours")
                        .exists(true)
                        .inValues(listOf("string"))
                        .notInValues(listOf("string"))
                        .build(),
                    PropertyFilter.builder()
                        .name("region")
                        .exists(true)
                        .inValues(listOf("EU", "NA"))
                        .notInValues(listOf("string"))
                        .build(),
                    PropertyFilter.builder()
                        .name("machine_type")
                        .exists(true)
                        .inValues(listOf("slow", "fast"))
                        .notInValues(listOf("string"))
                        .build(),
                )
            )
            .sql("sql")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            BillableMetricCreateParams.builder()
                .name("CPU Hours")
                .aggregationKey("cpu_hours")
                .aggregationType(BillableMetricCreateParams.AggregationType.COUNT)
                .customFields(
                    BillableMetricCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .eventTypeFilter(
                    EventTypeFilter.builder()
                        .inValues(listOf("cpu_usage"))
                        .notInValues(listOf("string"))
                        .build()
                )
                .groupKeys(listOf(listOf("region"), listOf("machine_type")))
                .propertyFilters(
                    listOf(
                        PropertyFilter.builder()
                            .name("cpu_hours")
                            .exists(true)
                            .inValues(listOf("string"))
                            .notInValues(listOf("string"))
                            .build(),
                        PropertyFilter.builder()
                            .name("region")
                            .exists(true)
                            .inValues(listOf("EU", "NA"))
                            .notInValues(listOf("string"))
                            .build(),
                        PropertyFilter.builder()
                            .name("machine_type")
                            .exists(true)
                            .inValues(listOf("slow", "fast"))
                            .notInValues(listOf("string"))
                            .build(),
                    )
                )
                .sql("sql")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("CPU Hours")
        assertThat(body.aggregationKey()).isEqualTo("cpu_hours")
        assertThat(body.aggregationType())
            .isEqualTo(BillableMetricCreateParams.AggregationType.COUNT)
        assertThat(body.customFields())
            .isEqualTo(
                BillableMetricCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.eventTypeFilter())
            .isEqualTo(
                EventTypeFilter.builder()
                    .inValues(listOf("cpu_usage"))
                    .notInValues(listOf("string"))
                    .build()
            )
        assertThat(body.groupKeys()).isEqualTo(listOf(listOf("region"), listOf("machine_type")))
        assertThat(body.propertyFilters())
            .isEqualTo(
                listOf(
                    PropertyFilter.builder()
                        .name("cpu_hours")
                        .exists(true)
                        .inValues(listOf("string"))
                        .notInValues(listOf("string"))
                        .build(),
                    PropertyFilter.builder()
                        .name("region")
                        .exists(true)
                        .inValues(listOf("EU", "NA"))
                        .notInValues(listOf("string"))
                        .build(),
                    PropertyFilter.builder()
                        .name("machine_type")
                        .exists(true)
                        .inValues(listOf("slow", "fast"))
                        .notInValues(listOf("string"))
                        .build(),
                )
            )
        assertThat(body.sql()).isEqualTo("sql")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = BillableMetricCreateParams.builder().name("CPU Hours").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("CPU Hours")
    }
}
