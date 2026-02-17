// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1AuditLogListParamsTest {

    @Test
    fun create() {
        V1AuditLogListParams.builder()
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(1L)
            .nextPage("next_page")
            .resourceId("resource_id")
            .resourceType("resource_type")
            .sort(V1AuditLogListParams.Sort.DATE_ASC)
            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V1AuditLogListParams.builder()
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(1L)
                .nextPage("next_page")
                .resourceId("resource_id")
                .resourceType("resource_type")
                .sort(V1AuditLogListParams.Sort.DATE_ASC)
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = QueryParams.builder()
        expected.put("ending_before", "2019-12-27T18:11:19.117Z")
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        expected.put("resource_id", "resource_id")
        expected.put("resource_type", "resource_type")
        expected.put("sort", V1AuditLogListParams.Sort.DATE_ASC.toString())
        expected.put("starting_on", "2019-12-27T18:11:19.117Z")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V1AuditLogListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
