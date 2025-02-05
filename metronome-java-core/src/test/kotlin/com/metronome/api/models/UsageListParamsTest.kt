// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageListParamsTest {

    @Test
    fun create() {
        UsageListParams.builder()
            .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
            .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
            .windowSize(UsageListParams.WindowSize.HOUR)
            .nextPage("next_page")
            .addBillableMetric(
                UsageListParams.BillableMetric.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .groupBy(
                        UsageListParams.BillableMetric.GroupBy.builder()
                            .key("key")
                            .addValue("x")
                            .build()
                    )
                    .build()
            )
            .addCustomerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            UsageListParams.builder()
                .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .windowSize(UsageListParams.WindowSize.HOUR)
                .nextPage("next_page")
                .addBillableMetric(
                    UsageListParams.BillableMetric.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .groupBy(
                            UsageListParams.BillableMetric.GroupBy.builder()
                                .key("key")
                                .addValue("x")
                                .build()
                        )
                        .build()
                )
                .addCustomerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = QueryParams.builder()
        expected.put("next_page", "next_page")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            UsageListParams.builder()
                .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .windowSize(UsageListParams.WindowSize.HOUR)
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun body() {
        val params =
            UsageListParams.builder()
                .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .windowSize(UsageListParams.WindowSize.HOUR)
                .nextPage("next_page")
                .addBillableMetric(
                    UsageListParams.BillableMetric.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .groupBy(
                            UsageListParams.BillableMetric.GroupBy.builder()
                                .key("key")
                                .addValue("x")
                                .build()
                        )
                        .build()
                )
                .addCustomerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.endingBefore()).isEqualTo(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
        assertThat(body.startingOn()).isEqualTo(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
        assertThat(body.windowSize()).isEqualTo(UsageListParams.WindowSize.HOUR)
        assertThat(body.billableMetrics())
            .contains(
                listOf(
                    UsageListParams.BillableMetric.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .groupBy(
                            UsageListParams.BillableMetric.GroupBy.builder()
                                .key("key")
                                .addValue("x")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.customerIds()).contains(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UsageListParams.builder()
                .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .windowSize(UsageListParams.WindowSize.HOUR)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.endingBefore()).isEqualTo(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
        assertThat(body.startingOn()).isEqualTo(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
        assertThat(body.windowSize()).isEqualTo(UsageListParams.WindowSize.HOUR)
    }
}
