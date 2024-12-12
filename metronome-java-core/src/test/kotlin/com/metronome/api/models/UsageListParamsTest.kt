// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageListParamsTest {

    @Test
    fun createUsageListParams() {
        UsageListParams.builder()
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .windowSize(UsageListParams.WindowSize.HOUR)
            .billableMetrics(
                listOf(
                    UsageListParams.BillableMetric.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .groupBy(
                            UsageListParams.BillableMetric.GroupBy.builder()
                                .key("key")
                                .values(listOf("x"))
                                .build()
                        )
                        .build()
                )
            )
            .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .nextPage("next_page")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            UsageListParams.builder()
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .windowSize(UsageListParams.WindowSize.HOUR)
                .billableMetrics(
                    listOf(
                        UsageListParams.BillableMetric.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .groupBy(
                                UsageListParams.BillableMetric.GroupBy.builder()
                                    .key("key")
                                    .values(listOf("x"))
                                    .build()
                            )
                            .build()
                    )
                )
                .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .nextPage("next_page")
                .build()
        val expected = QueryParams.builder()
        expected.put("next_page", "next_page")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            UsageListParams.builder()
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .windowSize(UsageListParams.WindowSize.HOUR)
                .build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getBody() {
        val params =
            UsageListParams.builder()
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .windowSize(UsageListParams.WindowSize.HOUR)
                .billableMetrics(
                    listOf(
                        UsageListParams.BillableMetric.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .groupBy(
                                UsageListParams.BillableMetric.GroupBy.builder()
                                    .key("key")
                                    .values(listOf("x"))
                                    .build()
                            )
                            .build()
                    )
                )
                .customerIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .nextPage("next_page")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.endingBefore()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.startingOn()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.windowSize()).isEqualTo(UsageListParams.WindowSize.HOUR)
        assertThat(body.billableMetrics())
            .isEqualTo(
                listOf(
                    UsageListParams.BillableMetric.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .groupBy(
                            UsageListParams.BillableMetric.GroupBy.builder()
                                .key("key")
                                .values(listOf("x"))
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.customerIds()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            UsageListParams.builder()
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .windowSize(UsageListParams.WindowSize.HOUR)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.endingBefore()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.startingOn()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.windowSize()).isEqualTo(UsageListParams.WindowSize.HOUR)
    }
}
