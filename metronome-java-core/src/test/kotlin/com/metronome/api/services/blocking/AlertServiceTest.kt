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
                    .name("name")
                    .threshold(0.0)
                    .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .creditGrantTypeFilters(listOf("string"))
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customFieldFilters(
                        listOf(
                            AlertCreateParams.CustomFieldFilter.builder()
                                .entity(AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                                .key("key")
                                .value("value")
                                .build()
                        )
                    )
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .releaseUniquenessKey(true)
                    .build()
            )
        println(alertArchiveResponse)
        alertArchiveResponse.validate()
    }
}
