// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DashboardGetEmbeddableUrlResponseTest {

    @Test
    fun createDashboardGetEmbeddableUrlResponse() {
        val dashboardGetEmbeddableUrlResponse =
            DashboardGetEmbeddableUrlResponse.builder()
                .data(DashboardGetEmbeddableUrlResponse.Data.builder().url("string").build())
                .build()
        assertThat(dashboardGetEmbeddableUrlResponse).isNotNull
        assertThat(dashboardGetEmbeddableUrlResponse.data())
            .isEqualTo(DashboardGetEmbeddableUrlResponse.Data.builder().url("string").build())
    }
}
