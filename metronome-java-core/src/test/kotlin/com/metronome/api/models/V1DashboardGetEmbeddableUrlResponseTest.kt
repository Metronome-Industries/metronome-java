// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1DashboardGetEmbeddableUrlResponseTest {

    @Test
    fun createV1DashboardGetEmbeddableUrlResponse() {
        val v1DashboardGetEmbeddableUrlResponse =
            V1DashboardGetEmbeddableUrlResponse.builder()
                .data(V1DashboardGetEmbeddableUrlResponse.Data.builder().url("url").build())
                .build()
        assertThat(v1DashboardGetEmbeddableUrlResponse).isNotNull
        assertThat(v1DashboardGetEmbeddableUrlResponse.data())
            .isEqualTo(V1DashboardGetEmbeddableUrlResponse.Data.builder().url("url").build())
    }
}
