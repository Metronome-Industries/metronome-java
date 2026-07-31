// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v2.notifications

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.models.v2.notifications.offset.OffsetArchiveParams
import com.metronome.api.models.v2.notifications.offset.OffsetCreateParams
import com.metronome.api.models.v2.notifications.offset.OffsetEditParams
import com.metronome.api.models.v2.notifications.offset.OffsetRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OffsetServiceAsyncTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val offsetServiceAsync = client.v2().notifications().offset()

        val offsetFuture =
            offsetServiceAsync.create(
                OffsetCreateParams.builder()
                    .name("+1 day after contract starts")
                    .policy(
                        OffsetCreateParams.Policy.builder()
                            .offset("P1D")
                            .type("contract.start")
                            .build()
                    )
                    .uniquenessKey("contract-start-notification-823j7fqzo1")
                    .build()
            )

        val offset = offsetFuture.get()
        offset.validate()
    }

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val offsetServiceAsync = client.v2().notifications().offset()

        val offsetFuture =
            offsetServiceAsync.retrieve(
                OffsetRetrieveParams.builder().id("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc").build()
            )

        val offset = offsetFuture.get()
        offset.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val offsetServiceAsync = client.v2().notifications().offset()

        val pageFuture = offsetServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val offsetServiceAsync = client.v2().notifications().offset()

        val responseFuture =
            offsetServiceAsync.archive(
                OffsetArchiveParams.builder().id("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun edit() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val offsetServiceAsync = client.v2().notifications().offset()

        val responseFuture =
            offsetServiceAsync.edit(
                OffsetEditParams.builder()
                    .policy(
                        OffsetEditParams.Policy.LifecycleEventOffsetPolicy.builder()
                            .offset("P2D")
                            .type("contract.start")
                            .build()
                    )
                    .id("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .isEnabled(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
