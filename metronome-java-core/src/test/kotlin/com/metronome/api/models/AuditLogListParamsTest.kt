// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

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
        val expected = mutableMapOf<String, List<String>>()
        expected.put("ending_before", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("limit", listOf("100"))
        expected.put("next_page", listOf("next_page"))
        expected.put("resource_id", listOf("resource_id"))
        expected.put("resource_type", listOf("resource_type"))
        expected.put("sort", listOf(AuditLogListParams.Sort.DATE_ASC.toString()))
        expected.put("starting_on", listOf("2019-12-27T18:11:19.117Z"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AuditLogListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
