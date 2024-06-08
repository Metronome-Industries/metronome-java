// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageListWithGroupsResponseTest {

    @Test
    fun createUsageListWithGroupsResponse() {
        val usageListWithGroupsResponse =
            UsageListWithGroupsResponse.builder()
                .data(
                    listOf(
                        UsageListWithGroupsResponse.Data.builder()
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .groupKey("string")
                            .groupValue("string")
                            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .value(42.23)
                            .build()
                    )
                )
                .nextPage("string")
                .build()
        assertThat(usageListWithGroupsResponse).isNotNull
        assertThat(usageListWithGroupsResponse.data())
            .containsExactly(
                UsageListWithGroupsResponse.Data.builder()
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .groupKey("string")
                    .groupValue("string")
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .value(42.23)
                    .build()
            )
        assertThat(usageListWithGroupsResponse.nextPage()).contains("string")
    }
}
