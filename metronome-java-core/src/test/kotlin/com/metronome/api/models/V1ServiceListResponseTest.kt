// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ServiceListResponseTest {

    @Test
    fun createV1ServiceListResponse() {
        val v1ServiceListResponse =
            V1ServiceListResponse.builder()
                .addService(
                    V1ServiceListResponse.Service.builder()
                        .addIp("string")
                        .name("name")
                        .usage(V1ServiceListResponse.Service.Usage.MAKES_CONNECTIONS_FROM)
                        .build()
                )
                .build()
        assertThat(v1ServiceListResponse).isNotNull
        assertThat(v1ServiceListResponse.services())
            .containsExactly(
                V1ServiceListResponse.Service.builder()
                    .addIp("string")
                    .name("name")
                    .usage(V1ServiceListResponse.Service.Usage.MAKES_CONNECTIONS_FROM)
                    .build()
            )
    }
}
