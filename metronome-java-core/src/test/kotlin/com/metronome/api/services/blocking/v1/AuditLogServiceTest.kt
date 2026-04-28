// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuditLogServiceTest {

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val auditLogService = client.v1().auditLogs()

        val page = auditLogService.list()

        page.response().validate()
    }
}
