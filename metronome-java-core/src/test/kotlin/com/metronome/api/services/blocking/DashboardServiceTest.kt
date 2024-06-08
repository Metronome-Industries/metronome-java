// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DashboardServiceTest {

    @Test
    fun callGetEmbeddableUrl() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val dashboardService = client.dashboards()
        val dashboardGetEmbeddableUrlResponse =
            dashboardService.getEmbeddableUrl(
                DashboardGetEmbeddableUrlParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dashboard(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
                    .colorOverrides(
                        listOf(
                            DashboardGetEmbeddableUrlParams.ColorOverride.builder()
                                .name(DashboardGetEmbeddableUrlParams.ColorOverride.Name.GRAY_DARK)
                                .value("string")
                                .build()
                        )
                    )
                    .dashboardOptions(
                        listOf(
                            DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                                .key("string")
                                .value("string")
                                .build()
                        )
                    )
                    .build()
            )
        println(dashboardGetEmbeddableUrlResponse)
        dashboardGetEmbeddableUrlResponse.validate()
    }
}
