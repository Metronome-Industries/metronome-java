// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.dashboards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DashboardGetEmbeddableUrlResponseTest {

    @Test
    fun create() {
        val dashboardGetEmbeddableUrlResponse =
            DashboardGetEmbeddableUrlResponse.builder()
                .data(DashboardGetEmbeddableUrlResponse.Data.builder().url("url").build())
                .build()

        assertThat(dashboardGetEmbeddableUrlResponse.data())
            .isEqualTo(DashboardGetEmbeddableUrlResponse.Data.builder().url("url").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dashboardGetEmbeddableUrlResponse =
            DashboardGetEmbeddableUrlResponse.builder()
                .data(DashboardGetEmbeddableUrlResponse.Data.builder().url("url").build())
                .build()

        val roundtrippedDashboardGetEmbeddableUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dashboardGetEmbeddableUrlResponse),
                jacksonTypeRef<DashboardGetEmbeddableUrlResponse>(),
            )

        assertThat(roundtrippedDashboardGetEmbeddableUrlResponse)
            .isEqualTo(dashboardGetEmbeddableUrlResponse)
    }
}
