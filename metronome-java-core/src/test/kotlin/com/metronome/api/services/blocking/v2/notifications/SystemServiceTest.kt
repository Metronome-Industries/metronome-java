// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v2.notifications

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SystemServiceTest {

    @Disabled(
        "Skipping Java generated test due to empty-body serialization/hang edge case on this endpoint."
    )
    @Test
    fun list() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val systemService = client.v2().notifications().system()

        val systems = systemService.list()

        systems.validate()
    }
}
