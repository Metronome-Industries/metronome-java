// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageListWithGroupsResponseTest {

    @Test
    fun create() {
        val usageListWithGroupsResponse =
            UsageListWithGroupsResponse.builder()
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .groupKey("group_key")
                .groupValue("group_value")
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .value(0.0)
                .build()

        assertThat(usageListWithGroupsResponse.endingBefore())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(usageListWithGroupsResponse.groupKey()).contains("group_key")
        assertThat(usageListWithGroupsResponse.groupValue()).contains("group_value")
        assertThat(usageListWithGroupsResponse.startingOn())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(usageListWithGroupsResponse.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageListWithGroupsResponse =
            UsageListWithGroupsResponse.builder()
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .groupKey("group_key")
                .groupValue("group_value")
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .value(0.0)
                .build()

        val roundtrippedUsageListWithGroupsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageListWithGroupsResponse),
                jacksonTypeRef<UsageListWithGroupsResponse>(),
            )

        assertThat(roundtrippedUsageListWithGroupsResponse).isEqualTo(usageListWithGroupsResponse)
    }
}
