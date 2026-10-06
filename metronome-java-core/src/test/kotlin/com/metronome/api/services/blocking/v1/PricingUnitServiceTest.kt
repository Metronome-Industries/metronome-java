// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.Id
import com.metronome.api.models.v1.pricingunits.PricingUnitCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PricingUnitServiceTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val pricingUnitService = client.v1().pricingUnits()

        val pricingUnit =
            pricingUnitService.create(PricingUnitCreateParams.builder().name("AI Credits").build())

        pricingUnit.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val pricingUnitService = client.v1().pricingUnits()

        val page = pricingUnitService.list()

        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val pricingUnitService = client.v1().pricingUnits()

        val response =
            pricingUnitService.archive(
                Id.builder().id("fa2f1b3d-9d52-4951-a099-25991fd394d6").build()
            )

        response.validate()
    }
}
