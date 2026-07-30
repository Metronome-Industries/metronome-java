// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.notifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.v2.notifications.LifecycleEventSystemNotificationConfig
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LifecycleEventSystemNotificationConfigTest {

    @Test
    fun create() {
      val lifecycleEventSystemNotificationConfig = LifecycleEventSystemNotificationConfig.builder()
          .policy(LifecycleEventSystemNotificationConfig.Policy.builder()
              .type("type")
              .build())
          .type("type")
          .isEnabled(true)
          .build()

      assertThat(lifecycleEventSystemNotificationConfig.policy()).isEqualTo(LifecycleEventSystemNotificationConfig.Policy.builder()
          .type("type")
          .build())
      assertThat(lifecycleEventSystemNotificationConfig.type()).isEqualTo("type")
      assertThat(lifecycleEventSystemNotificationConfig.isEnabled()).contains(true)
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val lifecycleEventSystemNotificationConfig = LifecycleEventSystemNotificationConfig.builder()
          .policy(LifecycleEventSystemNotificationConfig.Policy.builder()
              .type("type")
              .build())
          .type("type")
          .isEnabled(true)
          .build()

      val roundtrippedLifecycleEventSystemNotificationConfig = jsonMapper.readValue(jsonMapper.writeValueAsString(lifecycleEventSystemNotificationConfig), jacksonTypeRef<LifecycleEventSystemNotificationConfig>())

      assertThat(roundtrippedLifecycleEventSystemNotificationConfig).isEqualTo(lifecycleEventSystemNotificationConfig)
    }
}
