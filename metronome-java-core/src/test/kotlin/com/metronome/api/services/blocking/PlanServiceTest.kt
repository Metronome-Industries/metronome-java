// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
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
        val planListResponse =
            planService.list(PlanListParams.builder().limit(100L).nextPage("string").build())
        println(planListResponse)
        planListResponse.validate()
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
                    .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
        val planListChargesResponse =
            planService.listCharges(
                PlanListChargesParams.builder()
                    .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(100L)
                    .nextPage("string")
                    .build()
            )
        println(planListChargesResponse)
        planListChargesResponse.validate()
    }

    @Test
    fun callListCustomers() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planService = client.plans()
        val planListCustomersResponse =
            planService.listCustomers(
                PlanListCustomersParams.builder()
                    .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(100L)
                    .nextPage("string")
                    .status(PlanListCustomersParams.Status.ALL)
                    .build()
            )
        println(planListCustomersResponse)
        planListCustomersResponse.validate()
    }
}
