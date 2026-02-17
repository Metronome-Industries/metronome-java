// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.models.V1PlanGetDetailsParams
import com.metronome.api.models.V1PlanListChargesParams
import com.metronome.api.models.V1PlanListCustomersParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PlanServiceAsyncTest {

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planServiceAsync = client.v1().plans()

        val pageFuture = planServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun getDetails() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planServiceAsync = client.v1().plans()

        val responseFuture =
            planServiceAsync.getDetails(
                V1PlanGetDetailsParams.builder()
                    .planId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listCharges() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planServiceAsync = client.v1().plans()

        val pageFuture =
            planServiceAsync.listCharges(
                V1PlanListChargesParams.builder()
                    .planId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun listCustomers() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val planServiceAsync = client.v1().plans()

        val pageFuture =
            planServiceAsync.listCustomers(
                V1PlanListCustomersParams.builder()
                    .planId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
