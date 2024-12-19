// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DashboardGetEmbeddableUrlParamsTest {

    @Test
    fun createDashboardGetEmbeddableUrlParams() {
        DashboardGetEmbeddableUrlParams.builder()
            .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
            .dashboard(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
            .bmGroupKeyOverrides(
                listOf(
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
            )
            .colorOverrides(
                listOf(
                    DashboardGetEmbeddableUrlParams.ColorOverride.builder()
                        .name(DashboardGetEmbeddableUrlParams.ColorOverride.Name.GRAY_DARK)
                        .value("#ff0000")
                        .build()
                )
            )
            .dashboardOptions(
                listOf(
                    DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                        .key("show_zero_usage_line_items")
                        .value("false")
                        .build(),
                    DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                        .key("hide_voided_invoices")
                        .value("true")
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DashboardGetEmbeddableUrlParams.builder()
                .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                .dashboard(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
                .bmGroupKeyOverrides(
                    listOf(
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
                )
                .colorOverrides(
                    listOf(
                        DashboardGetEmbeddableUrlParams.ColorOverride.builder()
                            .name(DashboardGetEmbeddableUrlParams.ColorOverride.Name.GRAY_DARK)
                            .value("#ff0000")
                            .build()
                    )
                )
                .dashboardOptions(
                    listOf(
                        DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                            .key("show_zero_usage_line_items")
                            .value("false")
                            .build(),
                        DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                            .key("hide_voided_invoices")
                            .value("true")
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("4db51251-61de-4bfe-b9ce-495e244f3491")
        assertThat(body.dashboard()).isEqualTo(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
        assertThat(body.bmGroupKeyOverrides())
            .isEqualTo(
                listOf(
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
            )
        assertThat(body.colorOverrides())
            .isEqualTo(
                listOf(
                    DashboardGetEmbeddableUrlParams.ColorOverride.builder()
                        .name(DashboardGetEmbeddableUrlParams.ColorOverride.Name.GRAY_DARK)
                        .value("#ff0000")
                        .build()
                )
            )
        assertThat(body.dashboardOptions())
            .isEqualTo(
                listOf(
                    DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                        .key("show_zero_usage_line_items")
                        .value("false")
                        .build(),
                    DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                        .key("hide_voided_invoices")
                        .value("true")
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DashboardGetEmbeddableUrlParams.builder()
                .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                .dashboard(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("4db51251-61de-4bfe-b9ce-495e244f3491")
        assertThat(body.dashboard()).isEqualTo(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
    }
}
