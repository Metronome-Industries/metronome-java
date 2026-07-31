// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.v1.usage.UsageIngestParams
import com.metronome.api.models.v1.usage.UsageListParams
import com.metronome.api.models.v1.usage.UsageListWithGroupsParams
import com.metronome.api.models.v1.usage.UsageSearchParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageServiceAsyncTest {

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageServiceAsync = client.v1().usage()

        val pageFuture =
            usageServiceAsync.list(
                UsageListParams.builder()
                    .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
                    .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .windowSize(UsageListParams.WindowSize.HOUR)
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun ingest() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageServiceAsync = client.v1().usage()

        val future =
            usageServiceAsync.ingest(
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

        val response = future.get()
    }

    @Test
    fun listWithGroups() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageServiceAsync = client.v1().usage()

        val pageFuture =
            usageServiceAsync.listWithGroups(
                UsageListWithGroupsParams.builder()
                    .billableMetricId("222796fd-d29c-429e-89b2-549fabda4ed6")
                    .customerId("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
                    .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun search() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageServiceAsync = client.v1().usage()

        val responseFuture =
            usageServiceAsync.search(
                UsageSearchParams.builder()
                    .addTransactionId("2021-01-01T00:00:00Z_cluster42")
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
