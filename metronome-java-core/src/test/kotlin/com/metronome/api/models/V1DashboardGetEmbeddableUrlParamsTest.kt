// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1DashboardGetEmbeddableUrlParamsTest {

    @Test
    fun create() {
        V1DashboardGetEmbeddableUrlParams.builder()
            .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
            .dashboard(V1DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
            .addBmGroupKeyOverride(
                V1DashboardGetEmbeddableUrlParams.BmGroupKeyOverride.builder()
                    .groupKeyName("tenant_id")
                    .displayName("Org ID")
                    .valueDisplayNames(
                        V1DashboardGetEmbeddableUrlParams.BmGroupKeyOverride.ValueDisplayNames
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
    }

    @Test
    fun body() {
        val params =
            V1DashboardGetEmbeddableUrlParams.builder()
                .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                .dashboard(V1DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
                .addBmGroupKeyOverride(
                    V1DashboardGetEmbeddableUrlParams.BmGroupKeyOverride.builder()
                        .groupKeyName("tenant_id")
                        .displayName("Org ID")
                        .valueDisplayNames(
                            V1DashboardGetEmbeddableUrlParams.BmGroupKeyOverride.ValueDisplayNames
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

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("4db51251-61de-4bfe-b9ce-495e244f3491")
        assertThat(body.dashboard()).isEqualTo(V1DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
        assertThat(body.bmGroupKeyOverrides())
            .contains(
                listOf(
                    V1DashboardGetEmbeddableUrlParams.BmGroupKeyOverride.builder()
                        .groupKeyName("tenant_id")
                        .displayName("Org ID")
                        .valueDisplayNames(
                            V1DashboardGetEmbeddableUrlParams.BmGroupKeyOverride.ValueDisplayNames
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
                    V1DashboardGetEmbeddableUrlParams.ColorOverride.builder()
                        .name(V1DashboardGetEmbeddableUrlParams.ColorOverride.Name.GRAY_DARK)
                        .value("#ff0000")
                        .build()
                )
            )
        assertThat(body.dashboardOptions())
            .contains(
                listOf(
                    V1DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                        .key("show_zero_usage_line_items")
                        .value("false")
                        .build(),
                    V1DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                        .key("hide_voided_invoices")
                        .value("true")
                        .build(),
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1DashboardGetEmbeddableUrlParams.builder()
                .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                .dashboard(V1DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("4db51251-61de-4bfe-b9ce-495e244f3491")
        assertThat(body.dashboard()).isEqualTo(V1DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
    }
}
