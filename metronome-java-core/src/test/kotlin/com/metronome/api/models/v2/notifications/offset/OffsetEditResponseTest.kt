// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.notifications.offset

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.v2.notifications.LifecycleEventSystemNotificationConfig
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OffsetEditResponseTest {

    @Test
    fun create() {
        val offsetEditResponse =
            OffsetEditResponse.builder()
                .data(
                    LifecycleEventSystemNotificationConfig.builder()
                        .policy(
                            LifecycleEventSystemNotificationConfig.Policy.builder()
                                .type("type")
                                .build()
                        )
                        .type("type")
                        .isEnabled(true)
                        .build()
                )
                .build()

        assertThat(offsetEditResponse.data())
            .isEqualTo(
                OffsetEditResponse.Data.ofLifecycleEventSystemNotificationConfig(
                    LifecycleEventSystemNotificationConfig.builder()
                        .policy(
                            LifecycleEventSystemNotificationConfig.Policy.builder()
                                .type("type")
                                .build()
                        )
                        .type("type")
                        .isEnabled(true)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val offsetEditResponse =
            OffsetEditResponse.builder()
                .data(
                    LifecycleEventSystemNotificationConfig.builder()
                        .policy(
                            LifecycleEventSystemNotificationConfig.Policy.builder()
                                .type("type")
                                .build()
                        )
                        .type("type")
                        .isEnabled(true)
                        .build()
                )
                .build()

        val roundtrippedOffsetEditResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(offsetEditResponse),
                jacksonTypeRef<OffsetEditResponse>(),
            )

        assertThat(roundtrippedOffsetEditResponse).isEqualTo(offsetEditResponse)
    }
}
