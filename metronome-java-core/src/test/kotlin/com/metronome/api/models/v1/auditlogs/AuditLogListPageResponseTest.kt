// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.auditlogs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditLogListPageResponseTest {

    @Test
    fun create() {
        val auditLogListPageResponse =
            AuditLogListPageResponse.builder()
                .addData(
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
                )
                .nextPage("next_page")
                .build()

        assertThat(auditLogListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(auditLogListPageResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val auditLogListPageResponse =
            AuditLogListPageResponse.builder()
                .addData(
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
                )
                .nextPage("next_page")
                .build()

        val roundtrippedAuditLogListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(auditLogListPageResponse),
                jacksonTypeRef<AuditLogListPageResponse>(),
            )

        assertThat(roundtrippedAuditLogListPageResponse).isEqualTo(auditLogListPageResponse)
    }
}
