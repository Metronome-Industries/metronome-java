// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.CustomerAlertListParams
import com.metronome.api.models.CustomerAlertResetParams
import com.metronome.api.models.CustomerAlertRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AlertServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val alertService = client.customers().alerts()
        val customerAlertRetrieveResponse =
            alertService.retrieve(
                CustomerAlertRetrieveParams.builder()
                    .alertId("8deed800-1b7a-495d-a207-6c52bac54dc9")
                    .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .build()
            )
        println(customerAlertRetrieveResponse)
        customerAlertRetrieveResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val alertService = client.customers().alerts()
        val customerAlertListResponse =
            alertService.list(
                CustomerAlertListParams.builder()
                    .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .nextPage("next_page")
                    .alertStatuses(listOf(CustomerAlertListParams.AlertStatus.ENABLED))
                    .build()
            )
        println(customerAlertListResponse)
        customerAlertListResponse.validate()
    }

    @Test
    fun callReset() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val alertService = client.customers().alerts()
        alertService.reset(
            CustomerAlertResetParams.builder()
                .alertId("5e8691bf-b22a-4672-922d-f80eee940f01")
                .customerId("4c83caf3-8af4-44e2-9aeb-e290531726d9")
                .build()
        )
    }
}
