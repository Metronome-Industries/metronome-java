// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.V1DashboardGetEmbeddableUrlParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DashboardServiceTest {

    @Test
    fun getEmbeddableUrl() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val dashboardService = client.v1().dashboards()

        val response =
            dashboardService.getEmbeddableUrl(
                V1DashboardGetEmbeddableUrlParams.builder()
                    .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                    .dashboard(V1DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
                    .addBmGroupKeyOverride(
                        V1DashboardGetEmbeddableUrlParams.BmGroupKeyOverride.builder()
                            .groupKeyName("tenant_id")
                            .displayName("Org ID")
                            .valueDisplayNames(
                                V1DashboardGetEmbeddableUrlParams.BmGroupKeyOverride
                                    .ValueDisplayNames
                                    .builder()
                                    .putAdditionalProperty("48ecb18f358f", JsonValue.from("bar"))
                                    .putAdditionalProperty("e358f3ce242d", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .addColorOverride(
                        V1DashboardGetEmbeddableUrlParams.ColorOverride.builder()
                            .name(V1DashboardGetEmbeddableUrlParams.ColorOverride.Name.GRAY_DARK)
                            .value("#ff0000")
                            .build()
                    )
                    .addDashboardOption(
                        V1DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                            .key("show_zero_usage_line_items")
                            .value("false")
                            .build()
                    )
                    .addDashboardOption(
                        V1DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                            .key("hide_voided_invoices")
                            .value("true")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
