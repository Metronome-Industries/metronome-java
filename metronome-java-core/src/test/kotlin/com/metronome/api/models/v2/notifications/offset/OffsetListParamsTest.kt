// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.notifications.offset

import com.metronome.api.models.v2.notifications.offset.OffsetListParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OffsetListParamsTest {

    @Test
    fun create() {
      OffsetListParams.builder()
          .archiveFilter(OffsetListParams.ArchiveFilter.NOT_ARCHIVED)
          .cursor("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
          .limit(20.0)
          .build()
    }

    @Test
    fun body() {
      val params = OffsetListParams.builder()
          .archiveFilter(OffsetListParams.ArchiveFilter.NOT_ARCHIVED)
          .cursor("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
          .limit(20.0)
          .build()

      val body = params._body()

      assertThat(body.archiveFilter()).contains(OffsetListParams.ArchiveFilter.NOT_ARCHIVED)
      assertThat(body.cursor()).contains("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
      assertThat(body.limit()).contains(20.0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = OffsetListParams.builder().build()

      val body = params._body()
    }
}
