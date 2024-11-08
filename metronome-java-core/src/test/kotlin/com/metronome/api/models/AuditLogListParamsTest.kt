// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuditLogListParamsTest {

    @Test
    fun createAuditLogListParams() {
        AuditLogListParams.builder()
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(100L)
            .nextPage("next_page")
            .resourceId("resource_id")
            .resourceType("resource_type")
            .sort(AuditLogListParams.Sort.DATE_ASC)
            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AuditLogListParams.builder()
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(100L)
                .nextPage("next_page")
                .resourceId("resource_id")
                .resourceType("resource_type")
                .sort(AuditLogListParams.Sort.DATE_ASC)
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = QueryParams.builder()
        expected.put("ending_before", "2019-12-27T18:11:19.117Z")
        expected.put("limit", "100")
        expected.put("next_page", "next_page")
        expected.put("resource_id", "resource_id")
        expected.put("resource_type", "resource_type")
        expected.put("sort", AuditLogListParams.Sort.DATE_ASC.toString())
        expected.put("starting_on", "2019-12-27T18:11:19.117Z")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AuditLogListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
