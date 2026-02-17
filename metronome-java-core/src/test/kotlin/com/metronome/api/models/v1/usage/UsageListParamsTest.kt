// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.usage

import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageListParamsTest {

    @Test
    fun create() {
        UsageListParams.builder()
            .nextPage("next_page")
            .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
            .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
            .windowSize(UsageListParams.WindowSize.HOUR)
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
                .nextPage("next_page")
                .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .windowSize(UsageListParams.WindowSize.HOUR)
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("next_page", "next_page").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            UsageListParams.builder()
                .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .windowSize(UsageListParams.WindowSize.HOUR)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            UsageListParams.builder()
                .nextPage("next_page")
                .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .windowSize(UsageListParams.WindowSize.HOUR)
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

        assertThat(body.endingBefore()).isEqualTo(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
        assertThat(body.startingOn()).isEqualTo(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
        assertThat(body.windowSize()).isEqualTo(UsageListParams.WindowSize.HOUR)
        assertThat(body.billableMetrics().getOrNull())
            .containsExactly(
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
        assertThat(body.customerIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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

        assertThat(body.endingBefore()).isEqualTo(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
        assertThat(body.startingOn()).isEqualTo(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
        assertThat(body.windowSize()).isEqualTo(UsageListParams.WindowSize.HOUR)
    }
}
