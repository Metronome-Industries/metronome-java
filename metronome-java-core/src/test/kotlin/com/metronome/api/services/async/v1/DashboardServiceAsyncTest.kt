// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.v1.dashboards.DashboardGetEmbeddableUrlParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DashboardServiceAsyncTest {

    @Test
    fun getEmbeddableUrl() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val dashboardServiceAsync = client.v1().dashboards()

        val responseFuture =
            dashboardServiceAsync.getEmbeddableUrl(
                DashboardGetEmbeddableUrlParams.builder()
                    .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                    .dashboard(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
                    .addBmGroupKeyOverride(
                        DashboardGetEmbeddableUrlParams.BmGroupKeyOverride.builder()
                            .groupKeyName("group_key_name")
                            .displayName("display_name")
                            .valueDisplayNames(
                                DashboardGetEmbeddableUrlParams.BmGroupKeyOverride.ValueDisplayNames
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
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
                            .key(
                                DashboardGetEmbeddableUrlParams.DashboardOption.Key
                                    .SHOW_ZERO_USAGE_LINE_ITEMS
                            )
                            .value("false")
                            .build()
                    )
                    .addDashboardOption(
                        DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                            .key(
                                DashboardGetEmbeddableUrlParams.DashboardOption.Key
                                    .INVOICE_STATUS_FILTER
                            )
                            .value("FINALIZED")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
