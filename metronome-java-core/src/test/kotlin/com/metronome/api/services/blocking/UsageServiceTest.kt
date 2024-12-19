// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.UsageIngestParams
import com.metronome.api.models.UsageListParams
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
                    .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
                    .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .windowSize(UsageListParams.WindowSize.HOUR)
                    .nextPage("next_page")
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
                            .customerId("team@example.com")
                            .eventType("heartbeat")
                            .timestamp("2021-01-01T00:00:00Z")
                            .transactionId("2021-01-01T00:00:00Z_cluster42")
                            .properties(
                                UsageIngestParams.Usage.Properties.builder()
                                    .putAdditionalProperty("cluster_id", JsonValue.from("bar"))
                                    .putAdditionalProperty("cpu_seconds", JsonValue.from("bar"))
                                    .putAdditionalProperty("region", JsonValue.from("bar"))
                                    .build()
                            )
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
                    .billableMetricId("222796fd-d29c-429e-89b2-549fabda4ed6")
                    .customerId("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
                    .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
                    .build()
            )
        println(response)
        response.data().forEach { it.validate() }
    }
}
