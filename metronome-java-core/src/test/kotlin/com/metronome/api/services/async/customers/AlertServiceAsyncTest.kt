// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.models.CustomerAlertListParams
import com.metronome.api.models.CustomerAlertResetParams
import com.metronome.api.models.CustomerAlertRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AlertServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val alertServiceAsync = client.customers().alerts()

        val alertFuture =
            alertServiceAsync.retrieve(
                CustomerAlertRetrieveParams.builder()
                    .alertId("8deed800-1b7a-495d-a207-6c52bac54dc9")
                    .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .build()
            )

        val alert = alertFuture.get()
        alert.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val alertServiceAsync = client.customers().alerts()

        val alertFuture =
            alertServiceAsync.list(
                CustomerAlertListParams.builder()
                    .nextPage("next_page")
                    .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .addAlertStatus(CustomerAlertListParams.AlertStatus.ENABLED)
                    .build()
            )

        val alert = alertFuture.get()
        alert.validate()
    }

    @Test
    fun reset() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val alertServiceAsync = client.customers().alerts()

        val future =
            alertServiceAsync.reset(
                CustomerAlertResetParams.builder()
                    .alertId("5e8691bf-b22a-4672-922d-f80eee940f01")
                    .customerId("4c83caf3-8af4-44e2-9aeb-e290531726d9")
                    .build()
            )

        val response = future.get()
    }
}
