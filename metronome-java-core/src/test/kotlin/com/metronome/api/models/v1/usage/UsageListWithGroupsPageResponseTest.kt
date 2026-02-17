// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageListWithGroupsPageResponseTest {

    @Test
    fun create() {
        val usageListWithGroupsPageResponse =
            UsageListWithGroupsPageResponse.builder()
                .addData(
                    UsageListWithGroupsResponse.builder()
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .groupKey("group_key")
                        .groupValue("group_value")
                        .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(0.0)
                        .build()
                )
                .nextPage("next_page")
                .build()

        assertThat(usageListWithGroupsPageResponse.data())
            .containsExactly(
                UsageListWithGroupsResponse.builder()
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .groupKey("group_key")
                    .groupValue("group_value")
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .value(0.0)
                    .build()
            )
        assertThat(usageListWithGroupsPageResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageListWithGroupsPageResponse =
            UsageListWithGroupsPageResponse.builder()
                .addData(
                    UsageListWithGroupsResponse.builder()
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .groupKey("group_key")
                        .groupValue("group_value")
                        .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(0.0)
                        .build()
                )
                .nextPage("next_page")
                .build()

        val roundtrippedUsageListWithGroupsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageListWithGroupsPageResponse),
                jacksonTypeRef<UsageListWithGroupsPageResponse>(),
            )

        assertThat(roundtrippedUsageListWithGroupsPageResponse)
            .isEqualTo(usageListWithGroupsPageResponse)
    }
}
