// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v2.notifications

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.v2.notifications.offset.OffsetArchiveParams
import com.metronome.api.models.v2.notifications.offset.OffsetCreateParams
import com.metronome.api.models.v2.notifications.offset.OffsetEditParams
import com.metronome.api.models.v2.notifications.offset.OffsetListParams
import com.metronome.api.models.v2.notifications.offset.OffsetRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OffsetServiceTest {

    @Test
    fun create() {
      val client = MetronomeOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val offsetService = client.v2().notifications().offset()

      val offset = offsetService.create(OffsetCreateParams.builder()
          .name("+1 day after contract starts")
          .policy(OffsetCreateParams.Policy.builder()
              .offset("P1D")
              .type("contract.start")
              .build())
          .uniquenessKey("contract-start-notification-823j7fqzo1")
          .build())

      offset.validate()
    }

    @Test
    fun retrieve() {
      val client = MetronomeOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val offsetService = client.v2().notifications().offset()

      val offset = offsetService.retrieve(OffsetRetrieveParams.builder()
          .id("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
          .build())

      offset.validate()
    }

    @Test
    fun list() {
      val client = MetronomeOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val offsetService = client.v2().notifications().offset()

      val page = offsetService.list()

      page.response().validate()
    }

    @Test
    fun archive() {
      val client = MetronomeOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val offsetService = client.v2().notifications().offset()

      val response = offsetService.archive(OffsetArchiveParams.builder()
          .id("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
          .build())

      response.validate()
    }

    @Test
    fun edit() {
      val client = MetronomeOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val offsetService = client.v2().notifications().offset()

      val response = offsetService.edit(OffsetEditParams.builder()
          .policy(OffsetEditParams.Policy.LifecycleEventOffsetPolicy.builder()
              .offset("P2D")
              .type("contract.start")
              .build())
          .id("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
          .isEnabled(true)
          .build())

      response.validate()
    }
}
