// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v2.notifications

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.models.v2.notifications.system.SystemListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SystemServiceAsyncTest {

    @Disabled("Skipping Java generated test due to empty-body serialization/hang edge case on this endpoint.")
    @Test
    fun list() {
      val client = MetronomeOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val systemServiceAsync = client.v2().notifications().system()

      val systemsFuture = systemServiceAsync.list()

      val systems = systemsFuture.get()
      systems.validate()
    }
}
