// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.EventTypeFilter
import com.metronome.api.models.Id
import com.metronome.api.models.PropertyFilter
import com.metronome.api.models.v1.billablemetrics.BillableMetricCreateParams
import com.metronome.api.models.v1.billablemetrics.BillableMetricRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BillableMetricServiceTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billableMetricService = client.v1().billableMetrics()

        val billableMetric =
            billableMetricService.create(
                BillableMetricCreateParams.builder()
                    .name("CPU Hours")
                    .aggregationKey("cpu_hours")
                    .aggregationType(BillableMetricCreateParams.AggregationType.SUM)
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
            )

        billableMetric.validate()
    }

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billableMetricService = client.v1().billableMetrics()

        val billableMetric =
            billableMetricService.retrieve(
                BillableMetricRetrieveParams.builder()
                    .billableMetricId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .build()
            )

        billableMetric.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billableMetricService = client.v1().billableMetrics()

        val page = billableMetricService.list()

        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billableMetricService = client.v1().billableMetrics()

        val response =
            billableMetricService.archive(
                Id.builder().id("8deed800-1b7a-495d-a207-6c52bac54dc9").build()
            )

        response.validate()
    }
}
