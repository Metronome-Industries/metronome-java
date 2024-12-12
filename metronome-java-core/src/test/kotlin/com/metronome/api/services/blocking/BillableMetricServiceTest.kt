// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.BillableMetricArchiveParams
import com.metronome.api.models.BillableMetricCreateParams
import com.metronome.api.models.BillableMetricListParams
import com.metronome.api.models.BillableMetricRetrieveParams
import com.metronome.api.models.EventTypeFilter
import com.metronome.api.models.PropertyFilter
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BillableMetricServiceTest {

    @Test
    fun callCreate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billableMetricService = client.billableMetrics()
        val billableMetricCreateResponse =
            billableMetricService.create(
                BillableMetricCreateParams.builder()
                    .name("name")
                    .aggregationKey("aggregation_key")
                    .aggregationType(BillableMetricCreateParams.AggregationType.COUNT)
                    .customFields(
                        BillableMetricCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
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
        println(billableMetricCreateResponse)
        billableMetricCreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billableMetricService = client.billableMetrics()
        val billableMetricRetrieveResponse =
            billableMetricService.retrieve(
                BillableMetricRetrieveParams.builder()
                    .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(billableMetricRetrieveResponse)
        billableMetricRetrieveResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billableMetricService = client.billableMetrics()
        val response = billableMetricService.list(BillableMetricListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callArchive() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billableMetricService = client.billableMetrics()
        val billableMetricArchiveResponse =
            billableMetricService.archive(
                BillableMetricArchiveParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(billableMetricArchiveResponse)
        billableMetricArchiveResponse.validate()
    }
}
