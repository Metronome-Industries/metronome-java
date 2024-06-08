// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

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
                UsageListWithGroupsParams.GroupBy.builder()
                    .key("string")
                    .values(listOf("x"))
                    .build()
            )
            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(100L)
            .nextPage("string")
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
                        .key("string")
                        .values(listOf("x"))
                        .build()
                )
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(100L)
                .nextPage("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("limit", listOf("100"))
        expected.put("next_page", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            UsageListWithGroupsParams.builder()
                .billableMetricId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
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
                        .key("string")
                        .values(listOf("x"))
                        .build()
                )
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(100L)
                .nextPage("string")
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
                UsageListWithGroupsParams.GroupBy.builder()
                    .key("string")
                    .values(listOf("x"))
                    .build()
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
