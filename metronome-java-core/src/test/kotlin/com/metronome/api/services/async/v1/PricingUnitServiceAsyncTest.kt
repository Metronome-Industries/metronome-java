// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.models.Id
import com.metronome.api.models.v1.pricingunits.PricingUnitCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PricingUnitServiceAsyncTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val pricingUnitServiceAsync = client.v1().pricingUnits()

        val pricingUnitFuture =
            pricingUnitServiceAsync.create(
                PricingUnitCreateParams.builder().name("AI Credits").build()
            )

        val pricingUnit = pricingUnitFuture.get()
        pricingUnit.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val pricingUnitServiceAsync = client.v1().pricingUnits()

        val pageFuture = pricingUnitServiceAsync.list()

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
        val pricingUnitServiceAsync = client.v1().pricingUnits()

        val responseFuture =
            pricingUnitServiceAsync.archive(
                Id.builder().id("fa2f1b3d-9d52-4951-a099-25991fd394d6").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
