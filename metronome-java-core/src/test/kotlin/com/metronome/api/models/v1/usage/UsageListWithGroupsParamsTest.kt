// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.usage

import com.metronome.api.core.JsonValue
import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageListWithGroupsParamsTest {

    @Test
    fun create() {
        UsageListWithGroupsParams.builder()
            .limit(1L)
            .nextPage("next_page")
            .billableMetricId("222796fd-d29c-429e-89b2-549fabda4ed6")
            .customerId("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
            .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
            .currentPeriod(true)
            .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
            .groupBy(UsageListWithGroupsParams.GroupBy.builder().key("key").addValue("x").build())
            .groupFilters(
                UsageListWithGroupsParams.GroupFilters.builder()
                    .putAdditionalProperty("region", JsonValue.from(listOf("us-east1", "us-west1")))
                    .build()
            )
            .addGroupKey("region")
            .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            UsageListWithGroupsParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .billableMetricId("222796fd-d29c-429e-89b2-549fabda4ed6")
                .customerId("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
                .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
                .currentPeriod(true)
                .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
                .groupBy(
                    UsageListWithGroupsParams.GroupBy.builder().key("key").addValue("x").build()
                )
                .groupFilters(
                    UsageListWithGroupsParams.GroupFilters.builder()
                        .putAdditionalProperty(
                            "region",
                            JsonValue.from(listOf("us-east1", "us-west1")),
                        )
                        .build()
                )
                .addGroupKey("region")
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("limit", "1").put("next_page", "next_page").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            UsageListWithGroupsParams.builder()
                .billableMetricId("222796fd-d29c-429e-89b2-549fabda4ed6")
                .customerId("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
                .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            UsageListWithGroupsParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .billableMetricId("222796fd-d29c-429e-89b2-549fabda4ed6")
                .customerId("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
                .windowSize(UsageListWithGroupsParams.WindowSize.HOUR)
                .currentPeriod(true)
                .endingBefore(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
                .groupBy(
                    UsageListWithGroupsParams.GroupBy.builder().key("key").addValue("x").build()
                )
                .groupFilters(
                    UsageListWithGroupsParams.GroupFilters.builder()
                        .putAdditionalProperty(
                            "region",
                            JsonValue.from(listOf("us-east1", "us-west1")),
                        )
                        .build()
                )
                .addGroupKey("region")
                .startingOn(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                .build()

        val body = params._body()

        assertThat(body.billableMetricId()).isEqualTo("222796fd-d29c-429e-89b2-549fabda4ed6")
        assertThat(body.customerId()).isEqualTo("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
        assertThat(body.windowSize()).isEqualTo(UsageListWithGroupsParams.WindowSize.HOUR)
        assertThat(body.currentPeriod()).contains(true)
        assertThat(body.endingBefore()).contains(OffsetDateTime.parse("2021-01-03T00:00:00Z"))
        assertThat(body.groupBy())
            .contains(UsageListWithGroupsParams.GroupBy.builder().key("key").addValue("x").build())
        assertThat(body.groupFilters())
            .contains(
                UsageListWithGroupsParams.GroupFilters.builder()
                    .putAdditionalProperty("region", JsonValue.from(listOf("us-east1", "us-west1")))
                    .build()
            )
        assertThat(body.groupKey().getOrNull()).containsExactly("region")
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

        assertThat(body.billableMetricId()).isEqualTo("222796fd-d29c-429e-89b2-549fabda4ed6")
        assertThat(body.customerId()).isEqualTo("04ca7e72-4229-4a6e-ab11-9f7376fccbcb")
        assertThat(body.windowSize()).isEqualTo(UsageListWithGroupsParams.WindowSize.HOUR)
    }
}
