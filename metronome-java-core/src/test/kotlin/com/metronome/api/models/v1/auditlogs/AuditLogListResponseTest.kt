// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.auditlogs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditLogListResponseTest {

    @Test
    fun create() {
        val auditLogListResponse =
            AuditLogListResponse.builder()
                .id("id")
                .request(
                    AuditLogListResponse.Request.builder()
                        .id("id")
                        .ip("ip")
                        .userAgent("user_agent")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .action("action")
                .actor(
                    AuditLogListResponse.Actor.builder()
                        .id("id")
                        .name("name")
                        .email("email")
                        .build()
                )
                .description("description")
                .resourceId("resource_id")
                .resourceType("resource_type")
                .status(AuditLogListResponse.Status.SUCCESS)
                .build()

        assertThat(auditLogListResponse.id()).isEqualTo("id")
        assertThat(auditLogListResponse.request())
            .isEqualTo(
                AuditLogListResponse.Request.builder()
                    .id("id")
                    .ip("ip")
                    .userAgent("user_agent")
                    .build()
            )
        assertThat(auditLogListResponse.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(auditLogListResponse.action()).contains("action")
        assertThat(auditLogListResponse.actor())
            .contains(
                AuditLogListResponse.Actor.builder().id("id").name("name").email("email").build()
            )
        assertThat(auditLogListResponse.description()).contains("description")
        assertThat(auditLogListResponse.resourceId()).contains("resource_id")
        assertThat(auditLogListResponse.resourceType()).contains("resource_type")
        assertThat(auditLogListResponse.status()).contains(AuditLogListResponse.Status.SUCCESS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val auditLogListResponse =
            AuditLogListResponse.builder()
                .id("id")
                .request(
                    AuditLogListResponse.Request.builder()
                        .id("id")
                        .ip("ip")
                        .userAgent("user_agent")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .action("action")
                .actor(
                    AuditLogListResponse.Actor.builder()
                        .id("id")
                        .name("name")
                        .email("email")
                        .build()
                )
                .description("description")
                .resourceId("resource_id")
                .resourceType("resource_type")
                .status(AuditLogListResponse.Status.SUCCESS)
                .build()

        val roundtrippedAuditLogListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(auditLogListResponse),
                jacksonTypeRef<AuditLogListResponse>(),
            )

        assertThat(roundtrippedAuditLogListResponse).isEqualTo(auditLogListResponse)
    }
}
