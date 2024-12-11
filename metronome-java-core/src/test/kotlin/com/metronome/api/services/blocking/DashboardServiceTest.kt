// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
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
                    .bmGroupKeyOverrides(
                        listOf(
                            DashboardGetEmbeddableUrlParams.BmGroupKeyOverride.builder()
                                .groupKeyName("group_key_name")
                                .displayName("display_name")
                                .valueDisplayNames(
                                    DashboardGetEmbeddableUrlParams.BmGroupKeyOverride
                                        .ValueDisplayNames
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                    )
                    .colorOverrides(
                        listOf(
                            DashboardGetEmbeddableUrlParams.ColorOverride.builder()
                                .name(DashboardGetEmbeddableUrlParams.ColorOverride.Name.GRAY_DARK)
                                .value("value")
                                .build()
                        )
                    )
                    .dashboardOptions(
                        listOf(
                            DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                                .key("key")
                                .value("value")
                                .build()
                        )
                    )
                    .build()
            )
        println(dashboardGetEmbeddableUrlResponse)
        dashboardGetEmbeddableUrlResponse.validate()
    }
}
