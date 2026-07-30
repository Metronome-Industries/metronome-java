// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.notifications.offset

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.v2.notifications.LifecycleEventOffsetNotificationConfig
import com.metronome.api.models.v2.notifications.offset.OffsetListPageResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OffsetListPageResponseTest {

    @Test
    fun create() {
      val offsetListPageResponse = OffsetListPageResponse.builder()
          .addData(LifecycleEventOffsetNotificationConfig.builder()
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
              .build())
          .cursor("cursor")
          .build()

      assertThat(offsetListPageResponse.data()).containsExactly(LifecycleEventOffsetNotificationConfig.builder()
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
          .build())
      assertThat(offsetListPageResponse.cursor()).contains("cursor")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val offsetListPageResponse = OffsetListPageResponse.builder()
          .addData(LifecycleEventOffsetNotificationConfig.builder()
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
              .build())
          .cursor("cursor")
          .build()

      val roundtrippedOffsetListPageResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(offsetListPageResponse), jacksonTypeRef<OffsetListPageResponse>())

      assertThat(roundtrippedOffsetListPageResponse).isEqualTo(offsetListPageResponse)
    }
}
