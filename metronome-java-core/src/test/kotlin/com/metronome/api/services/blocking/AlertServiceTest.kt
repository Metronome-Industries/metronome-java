// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.AlertArchiveParams
import com.metronome.api.models.AlertCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AlertServiceTest {

    @Test
    fun callCreate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val alertService = client.alerts()
        val alertCreateResponse =
            alertService.create(
                AlertCreateParams.builder()
                    .alertType(AlertCreateParams.AlertType.LOW_CREDIT_BALANCE_REACHED)
                    .name("\$100 spend threshold reached")
                    .threshold(10000.0)
                    .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .creditGrantTypeFilters(listOf("enterprise"))
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .customFieldFilters(
                        listOf(
                            AlertCreateParams.CustomFieldFilter.builder()
                                .entity(AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                                .key("key")
                                .value("value")
                                .build()
                        )
                    )
                    .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                    .evaluateOnCreate(true)
                    .groupKeyFilter(
                        AlertCreateParams.GroupKeyFilter.builder().key("key").value("value").build()
                    )
                    .invoiceTypesFilter(
                        listOf(
                            "PLAN_ARREARS, SCHEDULED, USAGE, CORRECTION, CREDIT_PURCHASE, or SEAT_PURCHASE"
                        )
                    )
                    .planId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .uniquenessKey("x")
                    .build()
            )
        println(alertCreateResponse)
        alertCreateResponse.validate()
    }

    @Test
    fun callArchive() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val alertService = client.alerts()
        val alertArchiveResponse =
            alertService.archive(
                AlertArchiveParams.builder()
                    .id("8deed800-1b7a-495d-a207-6c52bac54dc9")
                    .releaseUniquenessKey(true)
                    .build()
            )
        println(alertArchiveResponse)
        alertArchiveResponse.validate()
    }
}
