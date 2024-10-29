// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
import com.metronome.api.models.UsageListWithGroupsParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class UsageServiceTest {

    @Test
    fun callList() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageService = client.usage()
        val usageListResponse =
            usageService.list(
                UsageListParams.builder()
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .windowSize(UsageListParams.WindowSize.HOUR)
                    .billableMetrics(
                        listOf(
                            UsageListParams.BillableMetric.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .groupBy(
                                    UsageListParams.BillableMetric.GroupBy.builder()
                                        .key("key")
                                        .values(listOf("x"))
                                        .build()
                                )
                                .build()
                        )
                    )
                    .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .nextPage("next_page")
                    .build()
            )
        println(usageListResponse)
        usageListResponse.validate()
    }

    @Test
    fun callIngest() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageService = client.usage()
        usageService.ingest(
            UsageIngestParams.builder()
                .usage(
                    listOf(
                        UsageIngestParams.Usage.builder()
                            .customerId("x")
                            .eventType("x")
                            .timestamp("timestamp")
                            .transactionId("x")
                            .properties(UsageIngestParams.Usage.Properties.builder().build())
                            .build()
                    )
                )
                .build()
        )
    }

    @Test
    fun callListWithGroups() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageService = client.usage()
        val response =
            usageService.listWithGroups(
                UsageListWithGroupsParams.builder()
                    .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
                    .build()
            )
        println(response)
        response.data().forEach { it.validate() }
    }
}
