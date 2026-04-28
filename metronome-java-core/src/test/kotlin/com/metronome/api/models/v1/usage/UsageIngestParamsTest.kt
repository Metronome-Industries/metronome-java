// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.usage

import com.metronome.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageIngestParamsTest {

    @Test
    fun create() {
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
    fun body() {
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

        val body = params._body().getOrNull()

        assertThat(body)
            .containsExactly(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UsageIngestParams.builder().build()

        val body = params._body().getOrNull()
    }
}
