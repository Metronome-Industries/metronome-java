// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DashboardGetEmbeddableUrlParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("4db51251-61de-4bfe-b9ce-495e244f3491")
        assertThat(body.dashboard()).isEqualTo(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
        assertThat(body.bmGroupKeyOverrides())
            .contains(
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
            .contains(
                listOf(
                    DashboardGetEmbeddableUrlParams.ColorOverride.builder()
                        .name(DashboardGetEmbeddableUrlParams.ColorOverride.Name.GRAY_DARK)
                        .value("#ff0000")
                        .build()
                )
            )
        assertThat(body.dashboardOptions())
            .contains(
                listOf(
                    DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                        .key("show_zero_usage_line_items")
                        .value("false")
                        .build(),
                    DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                        .key("hide_voided_invoices")
                        .value("true")
                        .build(),
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DashboardGetEmbeddableUrlParams.builder()
                .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                .dashboard(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("4db51251-61de-4bfe-b9ce-495e244f3491")
        assertThat(body.dashboard()).isEqualTo(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
    }
}
