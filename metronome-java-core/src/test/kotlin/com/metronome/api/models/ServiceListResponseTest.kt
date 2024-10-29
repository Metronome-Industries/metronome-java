// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ServiceListResponseTest {

    @Test
    fun createServiceListResponse() {
        val serviceListResponse =
            ServiceListResponse.builder()
                .services(
                    listOf(
                        ServiceListResponse.Service.builder()
                            .ips(listOf("string"))
                            .name("name")
                            .usage(ServiceListResponse.Service.Usage.MAKES_CONNECTIONS_FROM)
                            .build()
                    )
                )
                .build()
        assertThat(serviceListResponse).isNotNull
        assertThat(serviceListResponse.services())
            .containsExactly(
                ServiceListResponse.Service.builder()
                    .ips(listOf("string"))
                    .name("name")
                    .usage(ServiceListResponse.Service.Usage.MAKES_CONNECTIONS_FROM)
                    .build()
            )
    }
}
