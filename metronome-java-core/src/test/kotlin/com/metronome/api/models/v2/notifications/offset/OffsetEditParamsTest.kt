// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.notifications.offset

import com.metronome.api.models.v2.notifications.offset.OffsetEditParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OffsetEditParamsTest {

    @Test
    fun create() {
      OffsetEditParams.builder()
          .policy(OffsetEditParams.Policy.LifecycleEventOffsetPolicy.builder()
              .offset("P2D")
              .type("contract.start")
              .build())
          .id("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
          .isEnabled(true)
          .build()
    }

    @Test
    fun body() {
      val params = OffsetEditParams.builder()
          .policy(OffsetEditParams.Policy.LifecycleEventOffsetPolicy.builder()
              .offset("P2D")
              .type("contract.start")
              .build())
          .id("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
          .isEnabled(true)
          .build()

      val body = params._body()

      assertThat(body.policy()).isEqualTo(OffsetEditParams.Policy.ofLifecycleEventOffset(OffsetEditParams.Policy.LifecycleEventOffsetPolicy.builder()
          .offset("P2D")
          .type("contract.start")
          .build()))
      assertThat(body.id()).contains("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
      assertThat(body.isEnabled()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = OffsetEditParams.builder()
          .policy(OffsetEditParams.Policy.LifecycleEventOffsetPolicy.builder()
              .offset("P2D")
              .type("contract.start")
              .build())
          .build()

      val body = params._body()

      assertThat(body.policy()).isEqualTo(OffsetEditParams.Policy.ofLifecycleEventOffset(OffsetEditParams.Policy.LifecycleEventOffsetPolicy.builder()
          .offset("P2D")
          .type("contract.start")
          .build()))
    }
}
