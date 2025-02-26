// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.DashboardGetEmbeddableUrlParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DashboardServiceAsyncTest {

    @Test
    fun getEmbeddableUrl() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val dashboardServiceAsync = client.dashboards()

        val responseFuture =
            dashboardServiceAsync.getEmbeddableUrl(
                DashboardGetEmbeddableUrlParams.builder()
                    .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                    .dashboard(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
                    .addBmGroupKeyOverride(
                        DashboardGetEmbeddableUrlParams.BmGroupKeyOverride.builder()
                            .groupKeyName("tenant_id")
                            .displayName("Org ID")
                            .valueDisplayNames(
                                DashboardGetEmbeddableUrlParams.BmGroupKeyOverride.ValueDisplayNames
                                    .builder()
                                    .putAdditionalProperty("48ecb18f358f", JsonValue.from("bar"))
                                    .putAdditionalProperty("e358f3ce242d", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .addColorOverride(
                        DashboardGetEmbeddableUrlParams.ColorOverride.builder()
                            .name(DashboardGetEmbeddableUrlParams.ColorOverride.Name.GRAY_DARK)
                            .value("#ff0000")
                            .build()
                    )
                    .addDashboardOption(
                        DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                            .key("show_zero_usage_line_items")
                            .value("false")
                            .build()
                    )
                    .addDashboardOption(
                        DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                            .key("hide_voided_invoices")
                            .value("true")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
