// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageIngestParamsTest {

    @Test
    fun createUsageIngestParams() {
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
    }

    @Test
    fun getBody() {
        val params =
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            UsageIngestParams.builder()
                .addUsage(
                    UsageIngestParams.Usage.builder()
                        .customerId("team@example.com")
                        .eventType("heartbeat")
                        .timestamp("2021-01-01T00:00:00Z")
                        .transactionId("2021-01-01T00:00:00Z_cluster42")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
                listOf(
                    UsageIngestParams.Usage.builder()
                        .customerId("team@example.com")
                        .eventType("heartbeat")
                        .timestamp("2021-01-01T00:00:00Z")
                        .transactionId("2021-01-01T00:00:00Z_cluster42")
                        .build()
                )
            )
    }
}
