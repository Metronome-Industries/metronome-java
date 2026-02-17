// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.services

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ServiceListResponseTest {

    @Test
    fun create() {
        val serviceListResponse =
            ServiceListResponse.builder()
                .addService(
                    ServiceListResponse.Service.builder()
                        .addIp("string")
                        .name("name")
                        .usage(ServiceListResponse.Service.Usage.MAKES_CONNECTIONS_FROM)
                        .build()
                )
                .build()

        assertThat(serviceListResponse.services())
            .containsExactly(
                ServiceListResponse.Service.builder()
                    .addIp("string")
                    .name("name")
                    .usage(ServiceListResponse.Service.Usage.MAKES_CONNECTIONS_FROM)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val serviceListResponse =
            ServiceListResponse.builder()
                .addService(
                    ServiceListResponse.Service.builder()
                        .addIp("string")
                        .name("name")
                        .usage(ServiceListResponse.Service.Usage.MAKES_CONNECTIONS_FROM)
                        .build()
                )
                .build()

        val roundtrippedServiceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(serviceListResponse),
                jacksonTypeRef<ServiceListResponse>(),
            )

        assertThat(roundtrippedServiceListResponse).isEqualTo(serviceListResponse)
    }
}
