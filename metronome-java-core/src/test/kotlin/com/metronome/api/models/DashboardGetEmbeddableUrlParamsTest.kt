// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DashboardGetEmbeddableUrlParamsTest {

    @Test
    fun createDashboardGetEmbeddableUrlParams() {
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
    }

    @Test
    fun getBody() {
        val params =
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.dashboard()).isEqualTo(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
        assertThat(body.colorOverrides())
            .isEqualTo(
                listOf(
                    DashboardGetEmbeddableUrlParams.ColorOverride.builder()
                        .name(DashboardGetEmbeddableUrlParams.ColorOverride.Name.GRAY_DARK)
                        .value("string")
                        .build()
                )
            )
        assertThat(body.dashboardOptions())
            .isEqualTo(
                listOf(
                    DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                        .key("string")
                        .value("string")
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DashboardGetEmbeddableUrlParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dashboard(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.dashboard()).isEqualTo(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
    }
}
