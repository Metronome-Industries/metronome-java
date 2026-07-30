// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.notifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.v2.notifications.LifecycleEventOffsetNotificationConfig
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LifecycleEventOffsetNotificationConfigTest {

    @Test
    fun create() {
      val lifecycleEventOffsetNotificationConfig = LifecycleEventOffsetNotificationConfig.builder()
          .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdBy("created_by")
          .environmentType("environment_type")
          .name("name")
          .policy(LifecycleEventOffsetNotificationConfig.Policy.builder()
              .offset("P1D")
              .type("type")
              .build())
          .type("type")
          .build()

      assertThat(lifecycleEventOffsetNotificationConfig.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(lifecycleEventOffsetNotificationConfig.archivedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(lifecycleEventOffsetNotificationConfig.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(lifecycleEventOffsetNotificationConfig.createdBy()).isEqualTo("created_by")
      assertThat(lifecycleEventOffsetNotificationConfig.environmentType()).isEqualTo("environment_type")
      assertThat(lifecycleEventOffsetNotificationConfig.name()).isEqualTo("name")
      assertThat(lifecycleEventOffsetNotificationConfig.policy()).isEqualTo(LifecycleEventOffsetNotificationConfig.Policy.builder()
          .offset("P1D")
          .type("type")
          .build())
      assertThat(lifecycleEventOffsetNotificationConfig.type()).isEqualTo("type")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val lifecycleEventOffsetNotificationConfig = LifecycleEventOffsetNotificationConfig.builder()
          .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdBy("created_by")
          .environmentType("environment_type")
          .name("name")
          .policy(LifecycleEventOffsetNotificationConfig.Policy.builder()
              .offset("P1D")
              .type("type")
              .build())
          .type("type")
          .build()

      val roundtrippedLifecycleEventOffsetNotificationConfig = jsonMapper.readValue(jsonMapper.writeValueAsString(lifecycleEventOffsetNotificationConfig), jacksonTypeRef<LifecycleEventOffsetNotificationConfig>())

      assertThat(roundtrippedLifecycleEventOffsetNotificationConfig).isEqualTo(lifecycleEventOffsetNotificationConfig)
    }
}
