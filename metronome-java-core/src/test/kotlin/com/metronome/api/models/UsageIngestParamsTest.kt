// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageIngestParamsTest {

    @Test
    fun createUsageIngestParams() {
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
    }

    @Test
    fun getBody() {
        val params =
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            UsageIngestParams.builder()
                .usage(
                    listOf(
                        UsageIngestParams.Usage.builder()
                            .customerId("x")
                            .eventType("x")
                            .timestamp("timestamp")
                            .transactionId("x")
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
                listOf(
                    UsageIngestParams.Usage.builder()
                        .customerId("x")
                        .eventType("x")
                        .timestamp("timestamp")
                        .transactionId("x")
                        .build()
                )
            )
    }
}
