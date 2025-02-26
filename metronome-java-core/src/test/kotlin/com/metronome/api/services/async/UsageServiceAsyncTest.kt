// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.UsageIngestParams
import com.metronome.api.models.UsageListParams
import com.metronome.api.models.UsageListWithGroupsParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class UsageServiceAsyncTest {

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageServiceAsync = client.usage()

        val usageFuture =
            usageServiceAsync.list(
                UsageListParams.builder()
                    .nextPage("next_page")
                    .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
                    .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .windowSize(UsageListParams.WindowSize.HOUR)
                    .addBillableMetric(
                        UsageListParams.BillableMetric.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .groupBy(
                                UsageListParams.BillableMetric.GroupBy.builder()
                                    .key("key")
                                    .addValue("x")
                                    .build()
                            )
                            .build()
                    )
                    .addCustomerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val usage = usageFuture.get()
        usage.validate()
    }

    @Test
    fun ingest() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageServiceAsync = client.usage()

        val future =
            usageServiceAsync.ingest(
                UsageIngestParams.builder()
                    .addUsage(
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
                    .build()
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
        val usageServiceAsync = client.usage()

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
}
