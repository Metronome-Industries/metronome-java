// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.notifications.offset

import com.metronome.api.models.v2.notifications.offset.OffsetArchiveParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OffsetArchiveParamsTest {

    @Test
    fun create() {
      OffsetArchiveParams.builder()
          .id("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
          .build()
    }

    @Test
    fun body() {
      val params = OffsetArchiveParams.builder()
          .id("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
          .build()

      val body = params._body()

      assertThat(body.id()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
    }
}
