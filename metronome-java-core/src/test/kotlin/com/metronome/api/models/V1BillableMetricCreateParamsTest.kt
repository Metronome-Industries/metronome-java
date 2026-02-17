// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1BillableMetricCreateParamsTest {

    @Test
    fun create() {
        V1BillableMetricCreateParams.builder()
            .name("CPU Hours")
            .aggregationKey("cpu_hours")
            .aggregationType(V1BillableMetricCreateParams.AggregationType.COUNT)
            .customFields(
                V1BillableMetricCreateParams.CustomFields.builder()
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
    fun body() {
        val params =
            V1BillableMetricCreateParams.builder()
                .name("CPU Hours")
                .aggregationKey("cpu_hours")
                .aggregationType(V1BillableMetricCreateParams.AggregationType.COUNT)
                .customFields(
                    V1BillableMetricCreateParams.CustomFields.builder()
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

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("CPU Hours")
        assertThat(body.aggregationKey()).contains("cpu_hours")
        assertThat(body.aggregationType())
            .contains(V1BillableMetricCreateParams.AggregationType.COUNT)
        assertThat(body.customFields())
            .contains(
                V1BillableMetricCreateParams.CustomFields.builder()
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
    fun bodyWithoutOptionalFields() {
        val params = V1BillableMetricCreateParams.builder().name("CPU Hours").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("CPU Hours")
    }
}
