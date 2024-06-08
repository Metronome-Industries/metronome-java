// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuditLogListResponseTest {

    @Test
    fun createAuditLogListResponse() {
        val auditLogListResponse =
            AuditLogListResponse.builder()
                .data(
                    listOf(
                        AuditLogListResponse.Data.builder()
                            .id("string")
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .action("string")
                            .actor(
                                AuditLogListResponse.Data.Actor.builder()
                                    .id("string")
                                    .name("string")
                                    .email("string")
                                    .build()
                            )
                            .description("string")
                            .resourceId("string")
                            .resourceType("string")
                            .status(AuditLogListResponse.Data.Status.SUCCESS)
                            .build()
                    )
                )
                .nextPage("string")
                .build()
        assertThat(auditLogListResponse).isNotNull
        assertThat(auditLogListResponse.data())
            .containsExactly(
                AuditLogListResponse.Data.builder()
                    .id("string")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .action("string")
                    .actor(
                        AuditLogListResponse.Data.Actor.builder()
                            .id("string")
                            .name("string")
                            .email("string")
                            .build()
                    )
                    .description("string")
                    .resourceId("string")
                    .resourceType("string")
                    .status(AuditLogListResponse.Data.Status.SUCCESS)
                    .build()
            )
        assertThat(auditLogListResponse.nextPage()).contains("string")
    }
}
