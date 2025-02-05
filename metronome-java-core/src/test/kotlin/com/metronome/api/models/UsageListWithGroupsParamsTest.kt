// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageListWithGroupsParamsTest {

    @Test
    fun create() {
        UsageListWithGroupsParams.builder()
            .billableMetricId("222796fd-d29c-429e-89b2-549fabda4ed6")
            .customerId("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
            .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
            .limit(1L)
            .nextPage("next_page")
            .currentPeriod(true)
            .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
            .groupBy(
                UsageListWithGroupsParams.GroupBy.builder()
                    .key("region")
                    .values(
                        listOf(
                            "US-East",
                            "US-West",
                            "EU-Central",
                        )
                    )
                    .build()
            )
            .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            UsageListWithGroupsParams.builder()
                .billableMetricId("222796fd-d29c-429e-89b2-549fabda4ed6")
                .customerId("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
                .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
                .limit(1L)
                .nextPage("next_page")
                .currentPeriod(true)
                .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
                .groupBy(
                    UsageListWithGroupsParams.GroupBy.builder()
                        .key("region")
                        .values(
                            listOf(
                                "US-East",
                                "US-West",
                                "EU-Central",
                            )
                        )
                        .build()
                )
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .build()
        val expected = QueryParams.builder()
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            UsageListWithGroupsParams.builder()
                .billableMetricId("222796fd-d29c-429e-89b2-549fabda4ed6")
                .customerId("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
                .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun body() {
        val params =
            UsageListWithGroupsParams.builder()
                .billableMetricId("222796fd-d29c-429e-89b2-549fabda4ed6")
                .customerId("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
                .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
                .limit(1L)
                .nextPage("next_page")
                .currentPeriod(true)
                .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
                .groupBy(
                    UsageListWithGroupsParams.GroupBy.builder()
                        .key("region")
                        .values(
                            listOf(
                                "US-East",
                                "US-West",
                                "EU-Central",
                            )
                        )
                        .build()
                )
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.billableMetricId()).isEqualTo("222796fd-d29c-429e-89b2-549fabda4ed6")
        assertThat(body.customerId()).isEqualTo("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
        assertThat(body.windowSize()).isEqualTo(UsageListWithGroupsParams.WindowSize.HOUR)
        assertThat(body.currentPeriod()).contains(true)
        assertThat(body.endingBefore()).contains(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
        assertThat(body.groupBy())
            .contains(
                UsageListWithGroupsParams.GroupBy.builder()
                    .key("region")
                    .values(
                        listOf(
                            "US-East",
                            "US-West",
                            "EU-Central",
                        )
                    )
                    .build()
            )
        assertThat(body.startingOn()).contains(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UsageListWithGroupsParams.builder()
                .billableMetricId("222796fd-d29c-429e-89b2-549fabda4ed6")
                .customerId("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
                .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.billableMetricId()).isEqualTo("222796fd-d29c-429e-89b2-549fabda4ed6")
        assertThat(body.customerId()).isEqualTo("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
        assertThat(body.windowSize()).isEqualTo(UsageListWithGroupsParams.WindowSize.HOUR)
    }
}
