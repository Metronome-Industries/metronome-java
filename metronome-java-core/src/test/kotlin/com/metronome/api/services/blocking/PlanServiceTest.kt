// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.PlanGetDetailsParams
import com.metronome.api.models.PlanListChargesParams
import com.metronome.api.models.PlanListCustomersParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PlanServiceTest {

    @Test
    fun callList() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planService = client.plans()
        val response = planService.list()
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callGetDetails() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planService = client.plans()
        val planGetDetailsResponse =
            planService.getDetails(
                PlanGetDetailsParams.builder()
                    .planId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )
        println(planGetDetailsResponse)
        planGetDetailsResponse.validate()
    }

    @Test
    fun callListCharges() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planService = client.plans()
        val response =
            planService.listCharges(
                PlanListChargesParams.builder()
                    .planId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callListCustomers() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planService = client.plans()
        val response =
            planService.listCustomers(
                PlanListCustomersParams.builder()
                    .planId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )
        println(response)
        response.data().forEach { it.validate() }
    }
}
