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
                EventTypeFilter.builder().addInValue("cpu_usage").addNotInValue("string").build()
            )
            .addGroupKey(listOf("region"))
            .addGroupKey(listOf("machine_type"))
            .propertyFilters(
                listOf(
                    PropertyFilter.builder()
                        .name("cpu_hours")
                        .exists(true)
                        .addInValue("string")
                        .addNotInValue("string")
                        .build(),
                    PropertyFilter.builder()
                        .name("region")
                        .exists(true)
                        .addInValue("EU")
                        .addInValue("NA")
                        .addNotInValue("string")
                        .build(),
                    PropertyFilter.builder()
                        .name("machine_type")
                        .exists(true)
                        .addInValue("slow")
                        .addInValue("fast")
                        .addNotInValue("string")
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
                        .addInValue("cpu_usage")
                        .addNotInValue("string")
                        .build()
                )
                .addGroupKey(listOf("region"))
                .addGroupKey(listOf("machine_type"))
                .propertyFilters(
                    listOf(
                        PropertyFilter.builder()
                            .name("cpu_hours")
                            .exists(true)
                            .addInValue("string")
                            .addNotInValue("string")
                            .build(),
                        PropertyFilter.builder()
                            .name("region")
                            .exists(true)
                            .addInValue("EU")
                            .addInValue("NA")
                            .addNotInValue("string")
                            .build(),
                        PropertyFilter.builder()
                            .name("machine_type")
                            .exists(true)
                            .addInValue("slow")
                            .addInValue("fast")
                            .addNotInValue("string")
                            .build(),
                    )
                )
                .sql("sql")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("CPU Hours")
        assertThat(body.aggregationKey()).contains("cpu_hours")
        assertThat(body.aggregationType())
            .contains(BillableMetricCreateParams.AggregationType.COUNT)
        assertThat(body.customFields())
            .contains(
                BillableMetricCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.eventTypeFilter())
            .contains(
                EventTypeFilter.builder().addInValue("cpu_usage").addNotInValue("string").build()
            )
        assertThat(body.groupKeys()).contains(listOf(listOf("region"), listOf("machine_type")))
        assertThat(body.propertyFilters())
            .contains(
                listOf(
                    PropertyFilter.builder()
                        .name("cpu_hours")
                        .exists(true)
                        .addInValue("string")
                        .addNotInValue("string")
                        .build(),
                    PropertyFilter.builder()
                        .name("region")
                        .exists(true)
                        .addInValue("EU")
                        .addInValue("NA")
                        .addNotInValue("string")
                        .build(),
                    PropertyFilter.builder()
                        .name("machine_type")
                        .exists(true)
                        .addInValue("slow")
                        .addInValue("fast")
                        .addNotInValue("string")
                        .build(),
                )
            )
        assertThat(body.sql()).contains("sql")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = BillableMetricCreateParams.builder().name("CPU Hours").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("CPU Hours")
    }
}
