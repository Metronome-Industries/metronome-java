// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.V1UsageIngestParams
import com.metronome.api.models.V1UsageListParams
import com.metronome.api.models.V1UsageListWithGroupsParams
import com.metronome.api.models.V1UsageSearchParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class UsageServiceTest {

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageService = client.v1().usage()

        val page =
            usageService.list(
                V1UsageListParams.builder()
                    .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
                    .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .windowSize(V1UsageListParams.WindowSize.HOUR)
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun ingest() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageService = client.v1().usage()

        usageService.ingest(
            V1UsageIngestParams.builder()
                .addUsage(
                    V1UsageIngestParams.Usage.builder()
                        .customerId("team@example.com")
                        .eventType("heartbeat")
                        .timestamp("2021-01-01T00:00:00Z")
                        .transactionId("2021-01-01T00:00:00Z_cluster42")
                        .properties(
                            V1UsageIngestParams.Usage.Properties.builder()
                                .putAdditionalProperty("cluster_id", JsonValue.from("bar"))
                                .putAdditionalProperty("cpu_seconds", JsonValue.from("bar"))
                                .putAdditionalProperty("region", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()
        )
    }

    @Test
    fun listWithGroups() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageService = client.v1().usage()

        val page =
            usageService.listWithGroups(
                V1UsageListWithGroupsParams.builder()
                    .billableMetricId("222796fd-d29c-429e-89b2-549fabda4ed6")
                    .customerId("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
                    .windowSize(V1UsageListWithGroupsParams.WindowSize.HOUR)
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun search() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageService = client.v1().usage()

        val response =
            usageService.search(
                V1UsageSearchParams.builder()
                    .addTransactionId("2021-01-01T00:00:00Z_cluster42")
                    .build()
            )

        response.forEach { it.validate() }
    }
}
