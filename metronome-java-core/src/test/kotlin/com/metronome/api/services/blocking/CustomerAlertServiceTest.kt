// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CustomerAlertServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerAlertService = client.customerAlerts()
        val customerAlertRetrieveResponse =
            customerAlertService.retrieve(
                CustomerAlertRetrieveParams.builder()
                    .alertId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
        val customerAlertService = client.customerAlerts()
        val customerAlertListResponse =
            customerAlertService.list(
                CustomerAlertListParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .alertStatuses(listOf(CustomerAlertListParams.AlertStatus.ENABLED))
                    .nextPage("string")
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
        val customerAlertService = client.customerAlerts()
        customerAlertService.reset(
            CustomerAlertResetParams.builder()
                .alertId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
