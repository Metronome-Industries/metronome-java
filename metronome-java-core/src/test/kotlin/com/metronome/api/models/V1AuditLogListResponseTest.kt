// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1AuditLogListResponseTest {

    @Test
    fun createV1AuditLogListResponse() {
        val v1AuditLogListResponse =
            V1AuditLogListResponse.builder()
                .id("id")
                .request(
                    V1AuditLogListResponse.Request.builder()
                        .id("id")
                        .ip("ip")
                        .userAgent("user_agent")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .action("action")
                .actor(
                    V1AuditLogListResponse.Actor.builder()
                        .id("id")
                        .name("name")
                        .email("email")
                        .build()
                )
                .description("description")
                .resourceId("resource_id")
                .resourceType("resource_type")
                .status(V1AuditLogListResponse.Status.SUCCESS)
                .build()
        assertThat(v1AuditLogListResponse).isNotNull
        assertThat(v1AuditLogListResponse.id()).isEqualTo("id")
        assertThat(v1AuditLogListResponse.request())
            .isEqualTo(
                V1AuditLogListResponse.Request.builder()
                    .id("id")
                    .ip("ip")
                    .userAgent("user_agent")
                    .build()
            )
        assertThat(v1AuditLogListResponse.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1AuditLogListResponse.action()).contains("action")
        assertThat(v1AuditLogListResponse.actor())
            .contains(
                V1AuditLogListResponse.Actor.builder().id("id").name("name").email("email").build()
            )
        assertThat(v1AuditLogListResponse.description()).contains("description")
        assertThat(v1AuditLogListResponse.resourceId()).contains("resource_id")
        assertThat(v1AuditLogListResponse.resourceType()).contains("resource_type")
        assertThat(v1AuditLogListResponse.status()).contains(V1AuditLogListResponse.Status.SUCCESS)
    }
}
