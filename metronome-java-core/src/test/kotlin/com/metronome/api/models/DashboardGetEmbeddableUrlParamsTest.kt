// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DashboardGetEmbeddableUrlParamsTest {

    @Test
    fun createDashboardGetEmbeddableUrlParams() {
        DashboardGetEmbeddableUrlParams.builder()
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .dashboard(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
            .bmGroupKeyOverrides(
                listOf(
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
    }

    @Test
    fun getBody() {
        val params =
            DashboardGetEmbeddableUrlParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dashboard(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
                .bmGroupKeyOverrides(
                    listOf(
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.dashboard()).isEqualTo(DashboardGetEmbeddableUrlParams.Dashboard.INVOICES)
        assertThat(body.bmGroupKeyOverrides())
            .isEqualTo(
                listOf(
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
            )
        assertThat(body.colorOverrides())
            .isEqualTo(
                listOf(
                    DashboardGetEmbeddableUrlParams.ColorOverride.builder()
                        .name(DashboardGetEmbeddableUrlParams.ColorOverride.Name.GRAY_DARK)
                        .value("value")
                        .build()
                )
            )
        assertThat(body.dashboardOptions())
            .isEqualTo(
                listOf(
                    DashboardGetEmbeddableUrlParams.DashboardOption.builder()
                        .key("key")
                        .value("value")
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
