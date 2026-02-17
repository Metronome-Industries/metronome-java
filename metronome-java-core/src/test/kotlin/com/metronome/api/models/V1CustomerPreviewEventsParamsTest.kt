// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerPreviewEventsParamsTest {

    @Test
    fun create() {
        V1CustomerPreviewEventsParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .addEvent(
                V1CustomerPreviewEventsParams.Event.builder()
                    .eventType("heartbeat")
                    .properties(
                        V1CustomerPreviewEventsParams.Event.Properties.builder()
                            .putAdditionalProperty("cpu_hours", JsonValue.from("bar"))
                            .putAdditionalProperty("memory_gb_hours", JsonValue.from("bar"))
                            .build()
                    )
                    .timestamp("2021-01-01T00:00:00Z")
                    .transactionId("x")
                    .build()
            )
            .mode(V1CustomerPreviewEventsParams.Mode.REPLACE)
            .skipZeroQtyLineItems(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CustomerPreviewEventsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addEvent(
                    V1CustomerPreviewEventsParams.Event.builder()
                        .eventType("heartbeat")
                        .properties(
                            V1CustomerPreviewEventsParams.Event.Properties.builder()
                                .putAdditionalProperty("cpu_hours", JsonValue.from("bar"))
                                .putAdditionalProperty("memory_gb_hours", JsonValue.from("bar"))
                                .build()
                        )
                        .timestamp("2021-01-01T00:00:00Z")
                        .transactionId("x")
                        .build()
                )
                .mode(V1CustomerPreviewEventsParams.Mode.REPLACE)
                .skipZeroQtyLineItems(true)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.events())
            .isEqualTo(
                listOf(
                    V1CustomerPreviewEventsParams.Event.builder()
                        .eventType("heartbeat")
                        .properties(
                            V1CustomerPreviewEventsParams.Event.Properties.builder()
                                .putAdditionalProperty("cpu_hours", JsonValue.from("bar"))
                                .putAdditionalProperty("memory_gb_hours", JsonValue.from("bar"))
                                .build()
                        )
                        .timestamp("2021-01-01T00:00:00Z")
                        .transactionId("x")
                        .build()
                )
            )
        assertThat(body.mode()).contains(V1CustomerPreviewEventsParams.Mode.REPLACE)
        assertThat(body.skipZeroQtyLineItems()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CustomerPreviewEventsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addEvent(
                    V1CustomerPreviewEventsParams.Event.builder().eventType("heartbeat").build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.events())
            .isEqualTo(
                listOf(V1CustomerPreviewEventsParams.Event.builder().eventType("heartbeat").build())
            )
    }

    @Test
    fun getPathParam() {
        val params =
            V1CustomerPreviewEventsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addEvent(
                    V1CustomerPreviewEventsParams.Event.builder().eventType("heartbeat").build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
