// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageListWithGroupsParamsTest {

    @Test
    fun createUsageListWithGroupsParams() {
        UsageListWithGroupsParams.builder()
            .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
            .currentPeriod(true)
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .groupBy(
                UsageListWithGroupsParams.GroupBy.builder().key("key").values(listOf("x")).build()
            )
            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(1L)
            .nextPage("next_page")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            UsageListWithGroupsParams.builder()
                .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
                .currentPeriod(true)
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .groupBy(
                    UsageListWithGroupsParams.GroupBy.builder()
                        .key("key")
                        .values(listOf("x"))
                        .build()
                )
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(1L)
                .nextPage("next_page")
                .build()
        val expected = QueryParams.builder()
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            UsageListWithGroupsParams.builder()
                .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
                .build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getBody() {
        val params =
            UsageListWithGroupsParams.builder()
                .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
                .currentPeriod(true)
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .groupBy(
                    UsageListWithGroupsParams.GroupBy.builder()
                        .key("key")
                        .values(listOf("x"))
                        .build()
                )
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(1L)
                .nextPage("next_page")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.billableMetricId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.windowSize()).isEqualTo(UsageListWithGroupsParams.WindowSize.HOUR)
        assertThat(body.currentPeriod()).isEqualTo(true)
        assertThat(body.endingBefore()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.groupBy())
            .isEqualTo(
                UsageListWithGroupsParams.GroupBy.builder().key("key").values(listOf("x")).build()
            )
        assertThat(body.startingOn()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            UsageListWithGroupsParams.builder()
                .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.billableMetricId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.windowSize()).isEqualTo(UsageListWithGroupsParams.WindowSize.HOUR)
    }
}
