// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.V1CustomerAlertListParams
import com.metronome.api.models.V1CustomerAlertResetParams
import com.metronome.api.models.V1CustomerAlertRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AlertServiceTest {

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val alertService = client.v1().customers().alerts()

        val alert =
            alertService.retrieve(
                V1CustomerAlertRetrieveParams.builder()
                    .alertId("8deed800-1b7a-495d-a207-6c52bac54dc9")
                    .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .addGroupValue(
                        V1CustomerAlertRetrieveParams.GroupValue.builder()
                            .key("key")
                            .value("value")
                            .build()
                    )
                    .plansOrContracts(V1CustomerAlertRetrieveParams.PlansOrContracts.PLANS)
                    .seatFilter(
                        V1CustomerAlertRetrieveParams.SeatFilter.builder()
                            .seatGroupKey("seat_group_key")
                            .seatGroupValue("seat_group_value")
                            .build()
                    )
                    .build()
            )

        alert.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val alertService = client.v1().customers().alerts()

        val page =
            alertService.list(
                V1CustomerAlertListParams.builder()
                    .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun reset() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val alertService = client.v1().customers().alerts()

        alertService.reset(
            V1CustomerAlertResetParams.builder()
                .alertId("5e8691bf-b22a-4672-922d-f80eee940f01")
                .customerId("4c83caf3-8af4-44e2-9aeb-e290531726d9")
                .build()
        )
    }
}
