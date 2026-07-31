// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerPreviewEventsParamsTest {

    @Test
    fun create() {
        CustomerPreviewEventsParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .addEvent(
                CustomerPreviewEventsParams.Event.builder()
                    .eventType("heartbeat")
                    .properties(
                        CustomerPreviewEventsParams.Event.Properties.builder()
                            .putAdditionalProperty("cpu_hours", JsonValue.from("bar"))
                            .putAdditionalProperty("memory_gb_hours", JsonValue.from("bar"))
                            .build()
                    )
                    .timestamp("2021-01-01T00:00:00Z")
                    .transactionId("x")
                    .build()
            )
            .mode(CustomerPreviewEventsParams.Mode.REPLACE)
            .skipZeroQtyLineItems(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerPreviewEventsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addEvent(
                    CustomerPreviewEventsParams.Event.builder().eventType("heartbeat").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomerPreviewEventsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addEvent(
                    CustomerPreviewEventsParams.Event.builder()
                        .eventType("heartbeat")
                        .properties(
                            CustomerPreviewEventsParams.Event.Properties.builder()
                                .putAdditionalProperty("cpu_hours", JsonValue.from("bar"))
                                .putAdditionalProperty("memory_gb_hours", JsonValue.from("bar"))
                                .build()
                        )
                        .timestamp("2021-01-01T00:00:00Z")
                        .transactionId("x")
                        .build()
                )
                .mode(CustomerPreviewEventsParams.Mode.REPLACE)
                .skipZeroQtyLineItems(true)
                .build()

        val body = params._body()

        assertThat(body.events())
            .containsExactly(
                CustomerPreviewEventsParams.Event.builder()
                    .eventType("heartbeat")
                    .properties(
                        CustomerPreviewEventsParams.Event.Properties.builder()
                            .putAdditionalProperty("cpu_hours", JsonValue.from("bar"))
                            .putAdditionalProperty("memory_gb_hours", JsonValue.from("bar"))
                            .build()
                    )
                    .timestamp("2021-01-01T00:00:00Z")
                    .transactionId("x")
                    .build()
            )
        assertThat(body.mode()).contains(CustomerPreviewEventsParams.Mode.REPLACE)
        assertThat(body.skipZeroQtyLineItems()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerPreviewEventsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addEvent(
                    CustomerPreviewEventsParams.Event.builder().eventType("heartbeat").build()
                )
                .build()

        val body = params._body()

        assertThat(body.events())
            .containsExactly(
                CustomerPreviewEventsParams.Event.builder().eventType("heartbeat").build()
            )
    }
}
