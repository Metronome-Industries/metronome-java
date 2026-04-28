// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.models.v1.customers.alerts.AlertListParams
import com.metronome.api.models.v1.customers.alerts.AlertResetParams
import com.metronome.api.models.v1.customers.alerts.AlertRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AlertServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val alertServiceAsync = client.v1().customers().alerts()

        val alertFuture =
            alertServiceAsync.retrieve(
                AlertRetrieveParams.builder()
                    .alertId("8deed800-1b7a-495d-a207-6c52bac54dc9")
                    .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .addGroupValue(
                        AlertRetrieveParams.GroupValue.builder().key("key").value("value").build()
                    )
                    .plansOrContracts(AlertRetrieveParams.PlansOrContracts.PLANS)
                    .seatFilter(
                        AlertRetrieveParams.SeatFilter.builder()
                            .seatGroupKey("seat_group_key")
                            .seatGroupValue("seat_group_value")
                            .build()
                    )
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
        val alertServiceAsync = client.v1().customers().alerts()

        val pageFuture =
            alertServiceAsync.list(
                AlertListParams.builder().customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun reset() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val alertServiceAsync = client.v1().customers().alerts()

        val future =
            alertServiceAsync.reset(
                AlertResetParams.builder()
                    .alertId("5e8691bf-b22a-4672-922d-f80eee940f01")
                    .customerId("4c83caf3-8af4-44e2-9aeb-e290531726d9")
                    .build()
            )

        val response = future.get()
    }
}
