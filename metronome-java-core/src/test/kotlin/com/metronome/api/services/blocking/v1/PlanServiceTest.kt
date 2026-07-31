// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.v1.plans.PlanGetDetailsParams
import com.metronome.api.models.v1.plans.PlanListChargesParams
import com.metronome.api.models.v1.plans.PlanListCustomersParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlanServiceTest {

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planService = client.v1().plans()

        val page = planService.list()

        page.response().validate()
    }

    @Test
    fun getDetails() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planService = client.v1().plans()

        val response =
            planService.getDetails(
                PlanGetDetailsParams.builder()
                    .planId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        response.validate()
    }

    @Test
    fun listCharges() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planService = client.v1().plans()

        val page =
            planService.listCharges(
                PlanListChargesParams.builder()
                    .planId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun listCustomers() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planService = client.v1().plans()

        val page =
            planService.listCustomers(
                PlanListCustomersParams.builder()
                    .planId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        page.response().validate()
    }
}
