// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.notifications.system

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.v2.notifications.LifecycleEventSystemNotificationConfig
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SystemListResponseTest {

    @Test
    fun create() {
        val systemListResponse =
            SystemListResponse.builder()
                .addData(
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
                .cursor("cursor")
                .build()

        assertThat(systemListResponse.data())
            .containsExactly(
                LifecycleEventSystemNotificationConfig.builder()
                    .policy(
                        LifecycleEventSystemNotificationConfig.Policy.builder().type("type").build()
                    )
                    .type("type")
                    .isEnabled(true)
                    .build()
            )
        assertThat(systemListResponse.cursor()).contains("cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val systemListResponse =
            SystemListResponse.builder()
                .addData(
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
                .cursor("cursor")
                .build()

        val roundtrippedSystemListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(systemListResponse),
                jacksonTypeRef<SystemListResponse>(),
            )

        assertThat(roundtrippedSystemListResponse).isEqualTo(systemListResponse)
    }
}
