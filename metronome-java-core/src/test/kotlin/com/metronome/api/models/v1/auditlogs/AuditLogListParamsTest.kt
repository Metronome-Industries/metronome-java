// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.auditlogs

import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditLogListParamsTest {

    @Test
    fun create() {
        AuditLogListParams.builder()
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(1L)
            .nextPage("next_page")
            .resourceId("resource_id")
            .resourceType("resource_type")
            .sort(AuditLogListParams.Sort.DATE_ASC)
            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AuditLogListParams.builder()
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(1L)
                .nextPage("next_page")
                .resourceId("resource_id")
                .resourceType("resource_type")
                .sort(AuditLogListParams.Sort.DATE_ASC)
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ending_before", "2019-12-27T18:11:19.117Z")
                    .put("limit", "1")
                    .put("next_page", "next_page")
                    .put("resource_id", "resource_id")
                    .put("resource_type", "resource_type")
                    .put("sort", "date_asc")
                    .put("starting_on", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AuditLogListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
