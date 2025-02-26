// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PricingUnitServiceAsyncTest {

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val pricingUnitServiceAsync = client.pricingUnits()

        val pageFuture = pricingUnitServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
