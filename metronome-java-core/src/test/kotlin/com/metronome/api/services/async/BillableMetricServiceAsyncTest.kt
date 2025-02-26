// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.BillableMetricArchiveParams
import com.metronome.api.models.BillableMetricCreateParams
import com.metronome.api.models.BillableMetricRetrieveParams
import com.metronome.api.models.EventTypeFilter
import com.metronome.api.models.Id
import com.metronome.api.models.PropertyFilter
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BillableMetricServiceAsyncTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billableMetricServiceAsync = client.billableMetrics()

        val billableMetricFuture =
            billableMetricServiceAsync.create(
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
            )

        val billableMetric = billableMetricFuture.get()
        billableMetric.validate()
    }

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billableMetricServiceAsync = client.billableMetrics()

        val billableMetricFuture =
            billableMetricServiceAsync.retrieve(
                BillableMetricRetrieveParams.builder()
                    .billableMetricId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .build()
            )

        val billableMetric = billableMetricFuture.get()
        billableMetric.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billableMetricServiceAsync = client.billableMetrics()

        val pageFuture = billableMetricServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billableMetricServiceAsync = client.billableMetrics()

        val responseFuture =
            billableMetricServiceAsync.archive(
                BillableMetricArchiveParams.builder()
                    .id(Id.builder().id("8deed800-1b7a-495d-a207-6c52bac54dc9").build())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
