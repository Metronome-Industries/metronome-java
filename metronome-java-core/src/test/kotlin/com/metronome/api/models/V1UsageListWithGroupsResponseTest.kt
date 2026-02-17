// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1UsageListWithGroupsResponseTest {

    @Test
    fun createV1UsageListWithGroupsResponse() {
        val v1UsageListWithGroupsResponse =
            V1UsageListWithGroupsResponse.builder()
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .groupKey("group_key")
                .groupValue("group_value")
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .value(0.0)
                .build()
        assertThat(v1UsageListWithGroupsResponse).isNotNull
        assertThat(v1UsageListWithGroupsResponse.endingBefore())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1UsageListWithGroupsResponse.groupKey()).contains("group_key")
        assertThat(v1UsageListWithGroupsResponse.groupValue()).contains("group_value")
        assertThat(v1UsageListWithGroupsResponse.startingOn())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1UsageListWithGroupsResponse.value()).contains(0.0)
    }
}
