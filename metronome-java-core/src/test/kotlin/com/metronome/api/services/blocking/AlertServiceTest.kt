// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
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
                    .name("string")
                    .threshold(42.23)
                    .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .creditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customFieldFilters(
                        listOf(
                            AlertCreateParams.CustomFieldFilter.builder()
                                .entity(AlertCreateParams.CustomFieldFilter.Entity.CONTRACT)
                                .key("string")
                                .value("string")
                                .build()
                        )
                    )
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .evaluateOnCreate(true)
                    .groupKeyFilter(
                        AlertCreateParams.GroupKeyFilter.builder()
                            .key("string")
                            .value("string")
                            .build()
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
                AlertArchiveParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        println(alertArchiveResponse)
        alertArchiveResponse.validate()
    }
}
